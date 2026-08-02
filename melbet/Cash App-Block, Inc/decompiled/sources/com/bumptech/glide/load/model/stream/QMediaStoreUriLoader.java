package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import com.google.mlkit.vision.text.Text;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes4.dex */
public final class QMediaStoreUriLoader implements ModelLoader {
    public final Context context;
    public final Class dataClass;
    public final ModelLoader fileDelegate;
    public final ModelLoader uriDelegate;

    public final class InputStreamFactory extends Text.TextBase {
    }

    public final class QMediaStoreUriFetcher implements DataFetcher {
        public static final String[] PROJECTION = {"_data"};
        public final Context context;
        public final Class dataClass;
        public volatile DataFetcher delegate;
        public final ModelLoader fileDelegate;
        public final int height;
        public volatile boolean isCancelled;
        public final Options options;
        public final Uri uri;
        public final ModelLoader uriDelegate;
        public final int width;

        public QMediaStoreUriFetcher(Context context, ModelLoader modelLoader, ModelLoader modelLoader2, Uri uri, int i, int i2, Options options, Class cls) {
            this.context = context.getApplicationContext();
            this.fileDelegate = modelLoader;
            this.uriDelegate = modelLoader2;
            this.uri = uri;
            this.width = i;
            this.height = i2;
            this.options = options;
            this.dataClass = cls;
        }

        public final DataFetcher buildDelegateFetcher() {
            ModelLoader.LoadData buildLoadData;
            Throwable th;
            boolean isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            Context context = this.context;
            Options options = this.options;
            int i = this.height;
            int i2 = this.width;
            if (isExternalStorageLegacy) {
                Uri uri = this.uri;
                try {
                    Cursor query = context.getContentResolver().query(uri, PROJECTION, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string2 = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string2)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string2);
                                query.close();
                                buildLoadData = this.fileDelegate.buildLoadData(file, i2, i, options);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                            if (cursor == null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                Uri uri2 = this.uri;
                boolean isMediaStoreUri = MediaStoreUtil.isMediaStoreUri(uri2);
                ModelLoader modelLoader = this.uriDelegate;
                if (isMediaStoreUri && uri2.getPathSegments().contains("picker")) {
                    buildLoadData = modelLoader.buildLoadData(uri2, i2, i, options);
                } else {
                    if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        uri2 = MediaStore.setRequireOriginal(uri2);
                    }
                    buildLoadData = modelLoader.buildLoadData(uri2, i2, i, options);
                }
            }
            if (buildLoadData != null) {
                return buildLoadData.fetcher;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
            this.isCancelled = true;
            DataFetcher dataFetcher = this.delegate;
            if (dataFetcher != null) {
                dataFetcher.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cleanup() {
            DataFetcher dataFetcher = this.delegate;
            if (dataFetcher != null) {
                dataFetcher.cleanup();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final Class getDataClass() {
            return this.dataClass;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final int getDataSource() {
            return 1;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void loadData(Priority priority, DataFetcher.DataCallback dataCallback) {
            try {
                DataFetcher buildDelegateFetcher = buildDelegateFetcher();
                if (buildDelegateFetcher == null) {
                    dataCallback.onLoadFailed(new IllegalArgumentException("Failed to build fetcher for: " + this.uri));
                } else {
                    this.delegate = buildDelegateFetcher;
                    if (this.isCancelled) {
                        cancel();
                    } else {
                        buildDelegateFetcher.loadData(priority, dataCallback);
                    }
                }
            } catch (FileNotFoundException e) {
                dataCallback.onLoadFailed(e);
            }
        }
    }

    public QMediaStoreUriLoader(Context context, ModelLoader modelLoader, ModelLoader modelLoader2, Class cls) {
        this.context = context.getApplicationContext();
        this.fileDelegate = modelLoader;
        this.uriDelegate = modelLoader2;
        this.dataClass = cls;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData buildLoadData(Object obj, int i, int i2, Options options) {
        Uri uri = (Uri) obj;
        return new ModelLoader.LoadData(new ObjectKey(uri), new QMediaStoreUriFetcher(this.context, this.fileDelegate, this.uriDelegate, uri, i, i2, options, this.dataClass));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean handles(Object obj) {
        return MediaStoreUtil.isMediaStoreUri((Uri) obj);
    }
}
