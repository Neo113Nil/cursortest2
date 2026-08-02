package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class ByteArrayLoader$Fetcher implements DataFetcher {
    public static final String[] PROJECTION = {"_data"};
    public final /* synthetic */ int $r8$classId;
    public Object converter;
    public final Object model;

    public /* synthetic */ ByteArrayLoader$Fetcher(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.model = obj;
        this.converter = obj2;
    }

    private final void cancel$com$bumptech$glide$load$model$ByteArrayLoader$Fetcher() {
    }

    private final void cancel$com$bumptech$glide$load$model$DataUrlLoader$DataUriFetcher() {
    }

    private final void cancel$com$bumptech$glide$load$model$MediaStoreFileLoader$FilePathFetcher() {
    }

    private final void cleanup$com$bumptech$glide$load$model$ByteArrayLoader$Fetcher() {
    }

    private final void cleanup$com$bumptech$glide$load$model$MediaStoreFileLoader$FilePathFetcher() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
        int i = this.$r8$classId;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        switch (this.$r8$classId) {
            case 0:
            case 1:
                break;
            default:
                try {
                    ((ByteArrayInputStream) this.converter).close();
                    break;
                } catch (IOException unused) {
                    return;
                }
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        switch (this.$r8$classId) {
            case 0:
                return ((ByteBufferEncoder) this.converter).getDataClass();
            case 1:
                return File.class;
            default:
                return InputStream.class;
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
        Object wrap;
        int i = this.$r8$classId;
        Object obj = this.model;
        switch (i) {
            case 0:
                byte[] bArr = (byte[]) obj;
                switch (((ByteBufferEncoder) this.converter).$r8$classId) {
                    case 2:
                        wrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        wrap = new ByteArrayInputStream(bArr);
                        break;
                }
                dataCallback.onDataReady(wrap);
                return;
            case 1:
                Cursor query = ((Context) obj).getContentResolver().query((Uri) this.converter, PROJECTION, null, null, null);
                if (query != null) {
                    try {
                        r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                        query.close();
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                if (!TextUtils.isEmpty(r0)) {
                    dataCallback.onDataReady(new File(r0));
                    return;
                }
                dataCallback.onLoadFailed(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.converter)));
                return;
            default:
                try {
                    ByteArrayInputStream decode = ByteBufferEncoder.decode((String) obj);
                    this.converter = decode;
                    dataCallback.onDataReady(decode);
                    return;
                } catch (IllegalArgumentException e) {
                    dataCallback.onLoadFailed(e);
                    return;
                }
        }
    }

    public ByteArrayLoader$Fetcher(String str, ByteBufferEncoder byteBufferEncoder) {
        this.$r8$classId = 2;
        this.model = str;
    }
}
