package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.io.FileNotFoundException;

/* loaded from: classes4.dex */
public final class FileDescriptorLocalUriFetcher extends LocalUriFetcher {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileDescriptorLocalUriFetcher(ContentResolver contentResolver, Uri uri, int i) {
        super(0, uri, contentResolver);
        this.$r8$classId = i;
    }

    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    public final void close(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((ParcelFileDescriptor) obj).close();
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
                return ParcelFileDescriptor.class;
            default:
                return AssetFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    public final Object loadResource(ContentResolver contentResolver, Uri uri) {
        switch (this.$r8$classId) {
            case 0:
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor != null) {
                    return openAssetFileDescriptor.getParcelFileDescriptor();
                }
                throw new FileNotFoundException(CameraState$Type$EnumUnboxingLocalUtility.m(uri, "FileDescriptor is null for: "));
            default:
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor2 != null) {
                    return openAssetFileDescriptor2;
                }
                throw new FileNotFoundException(CameraState$Type$EnumUnboxingLocalUtility.m(uri, "FileDescriptor is null for: "));
        }
    }
}
