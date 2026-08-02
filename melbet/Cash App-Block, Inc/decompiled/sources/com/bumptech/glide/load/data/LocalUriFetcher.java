package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class LocalUriFetcher implements DataFetcher {
    public final /* synthetic */ int $r8$classId;
    public final Object contentResolver;
    public Object data;
    public final Comparable uri;

    public /* synthetic */ LocalUriFetcher(int i, Comparable comparable, Object obj) {
        this.$r8$classId = i;
        this.contentResolver = obj;
        this.uri = comparable;
    }

    private final void cancel$com$bumptech$glide$load$data$AssetPathFetcher() {
    }

    private final void cancel$com$bumptech$glide$load$data$LocalUriFetcher() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
        int i = this.$r8$classId;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        switch (this.$r8$classId) {
            case 0:
                Object obj = this.data;
                if (obj != null) {
                    try {
                        close(obj);
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                Object obj2 = this.data;
                if (obj2 != null) {
                    try {
                        close(obj2);
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    public abstract void close(Object obj);

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final int getDataSource() {
        switch (this.$r8$classId) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(Priority priority, DataFetcher.DataCallback dataCallback) {
        int i = this.$r8$classId;
        Comparable comparable = this.uri;
        Object obj = this.contentResolver;
        switch (i) {
            case 0:
                try {
                    Object loadResource = loadResource((ContentResolver) obj, (Uri) comparable);
                    this.data = loadResource;
                    dataCallback.onDataReady(loadResource);
                    break;
                } catch (FileNotFoundException e) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e);
                    }
                    dataCallback.onLoadFailed(e);
                    return;
                }
            default:
                try {
                    Object loadResource2 = loadResource((AssetManager) obj, (String) comparable);
                    this.data = loadResource2;
                    dataCallback.onDataReady(loadResource2);
                    break;
                } catch (IOException e2) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
                    }
                    dataCallback.onLoadFailed(e2);
                }
        }
    }

    public abstract Object loadResource(ContentResolver contentResolver, Uri uri);

    public abstract Object loadResource(AssetManager assetManager, String str);
}
