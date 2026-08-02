package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class StreamAssetPathFetcher extends LocalUriFetcher {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StreamAssetPathFetcher(AssetManager assetManager, String str, int i) {
        super(1, str, assetManager);
        this.$r8$classId = i;
    }

    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    public final void close(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((InputStream) obj).close();
                break;
            default:
                ((AssetFileDescriptor) obj).close();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        switch (this.$r8$classId) {
            case 0:
                return InputStream.class;
            default:
                return AssetFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    public final Object loadResource(AssetManager assetManager, String str) {
        switch (this.$r8$classId) {
            case 0:
                return assetManager.open(str);
            default:
                return assetManager.openFd(str);
        }
    }
}
