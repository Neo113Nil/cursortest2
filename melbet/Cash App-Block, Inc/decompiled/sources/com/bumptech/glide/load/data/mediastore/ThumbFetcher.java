package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.ExifOrientationStream;
import com.bumptech.glide.load.model.ByteBufferEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class ThumbFetcher implements DataFetcher {
    public final /* synthetic */ int $r8$classId;
    public Object inputStream;
    public final Comparable mediaStoreImageUri;
    public final Object opener;

    public final class ImageThumbnailQuery {
        public static final String[] PATH_PROJECTION = {"_data"};
        public static final String[] PATH_PROJECTION$1 = {"_data"};
        public final /* synthetic */ int $r8$classId;
        public final ContentResolver contentResolver;

        public /* synthetic */ ImageThumbnailQuery(ContentResolver contentResolver, int i) {
            this.$r8$classId = i;
            this.contentResolver = contentResolver;
        }

        public final Cursor query(Uri uri) {
            switch (this.$r8$classId) {
                case 0:
                    String lastPathSegment = uri.getLastPathSegment();
                    return this.contentResolver.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, PATH_PROJECTION, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
                default:
                    String lastPathSegment2 = uri.getLastPathSegment();
                    return this.contentResolver.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, PATH_PROJECTION$1, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
            }
        }
    }

    public /* synthetic */ ThumbFetcher(int i, Comparable comparable, Object obj) {
        this.$r8$classId = i;
        this.mediaStoreImageUri = comparable;
        this.opener = obj;
    }

    public static ThumbFetcher build(Context context, Uri uri, ImageThumbnailQuery imageThumbnailQuery) {
        return new ThumbFetcher(0, uri, new ThumbnailStreamOpener(Glide.get(context).glideContext.getRegistry().getImageHeaderParsers(), imageThumbnailQuery, Glide.get(context).arrayPool, context.getContentResolver()));
    }

    private final void cancel$com$bumptech$glide$load$data$mediastore$ThumbFetcher() {
    }

    private final void cancel$com$bumptech$glide$load$model$FileLoader$FileFetcher() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
        int i = this.$r8$classId;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        switch (this.$r8$classId) {
            case 0:
                InputStream inputStream = (InputStream) this.inputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                Object obj = this.inputStream;
                if (obj != null) {
                    try {
                        switch (((ByteBufferEncoder) this.opener).$r8$classId) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        switch (this.$r8$classId) {
            case 0:
                return InputStream.class;
            default:
                return ((ByteBufferEncoder) this.opener).getDataClass();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final int getDataSource() {
        switch (this.$r8$classId) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(Priority priority, DataFetcher.DataCallback dataCallback) {
        Object open;
        switch (this.$r8$classId) {
            case 0:
                try {
                    InputStream openThumbInputStream = openThumbInputStream();
                    this.inputStream = openThumbInputStream;
                    dataCallback.onDataReady(openThumbInputStream);
                    break;
                } catch (FileNotFoundException e) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
                    }
                    dataCallback.onLoadFailed(e);
                }
            default:
                try {
                    ByteBufferEncoder byteBufferEncoder = (ByteBufferEncoder) this.opener;
                    File file = (File) this.mediaStoreImageUri;
                    switch (byteBufferEncoder.$r8$classId) {
                        case 8:
                            open = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            open = new FileInputStream(file);
                            break;
                    }
                    this.inputStream = open;
                    dataCallback.onDataReady(open);
                    break;
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e2);
                    }
                    dataCallback.onLoadFailed(e2);
                    return;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004e, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0028: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:68:0x0028 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputStream openThumbInputStream() {
        Cursor cursor;
        Cursor cursor2;
        InputStream openInputStream;
        int i;
        ThumbnailStreamOpener thumbnailStreamOpener = (ThumbnailStreamOpener) this.opener;
        ContentResolver contentResolver = thumbnailStreamOpener.contentResolver;
        Uri uri = (Uri) this.mediaStoreImageUri;
        Cursor cursor3 = null;
        r5 = null;
        InputStream inputStream = null;
        try {
            try {
                cursor = thumbnailStreamOpener.query.query(uri);
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SecurityException e) {
            e = e;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (cursor != null) {
            try {
            } catch (SecurityException e2) {
                e = e2;
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                }
            }
            if (cursor.moveToFirst()) {
                String str = cursor.getString(0);
                cursor.close();
                if (!TextUtils.isEmpty(str)) {
                    File file = new File(str);
                    if (file.exists() && 0 < file.length()) {
                        Uri fromFile = Uri.fromFile(file);
                        try {
                            openInputStream = contentResolver.openInputStream(fromFile);
                            if (openInputStream != null) {
                                try {
                                    try {
                                        inputStream = contentResolver.openInputStream(uri);
                                        i = ImageHeaderParserUtils.getOrientation(thumbnailStreamOpener.parsers, inputStream, thumbnailStreamOpener.byteArrayPool);
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused) {
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        throw th3;
                                    }
                                } catch (IOException | NullPointerException e3) {
                                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                        Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e3);
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused3) {
                                        }
                                    }
                                }
                                return i != -1 ? new ExifOrientationStream(openInputStream, i) : openInputStream;
                            }
                            i = -1;
                            if (i != -1) {
                            }
                        } catch (NullPointerException e4) {
                            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e4));
                        }
                    }
                }
                openInputStream = null;
                if (openInputStream != null) {
                }
                i = -1;
                if (i != -1) {
                }
            }
        }
    }
}
