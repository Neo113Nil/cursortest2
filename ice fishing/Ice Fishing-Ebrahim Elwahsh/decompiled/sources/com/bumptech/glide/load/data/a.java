package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.ext.SdkExtensions;
import java.io.FileNotFoundException;
import t1.AbstractC5064a;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f23573x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ContentResolver contentResolver, Uri uri, boolean z8, int i) {
        super(contentResolver, uri, z8);
        this.f23573x = i;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f23573x) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.l
    public final void d(Object obj) {
        switch (this.f23573x) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    @Override // com.bumptech.glide.load.data.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContentResolver contentResolver, Uri uri) {
        AssetFileDescriptor openAssetFileDescriptor;
        int extensionVersion;
        AssetFileDescriptor openAssetFileDescriptor2;
        int extensionVersion2;
        switch (this.f23573x) {
            case 0:
                boolean z8 = this.f23595n;
                ContentResolver contentResolver2 = this.f23597v;
                if (z8 && AbstractC5064a.a(uri) && Build.VERSION.SDK_INT >= 30) {
                    extensionVersion = SdkExtensions.getExtensionVersion(30);
                    if (extensionVersion >= 17) {
                        openAssetFileDescriptor = AbstractC5064a.b(contentResolver2, uri);
                        if (openAssetFileDescriptor == null) {
                            return openAssetFileDescriptor;
                        }
                        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
                    }
                }
                openAssetFileDescriptor = contentResolver2.openAssetFileDescriptor(uri, com.anythink.expressad.foundation.d.d.bv);
                if (openAssetFileDescriptor == null) {
                }
                break;
            default:
                boolean z9 = this.f23595n;
                ContentResolver contentResolver3 = this.f23597v;
                if (z9 && AbstractC5064a.a(uri) && Build.VERSION.SDK_INT >= 30) {
                    extensionVersion2 = SdkExtensions.getExtensionVersion(30);
                    if (extensionVersion2 >= 17) {
                        openAssetFileDescriptor2 = AbstractC5064a.b(contentResolver3, uri);
                        if (openAssetFileDescriptor2 == null) {
                            return openAssetFileDescriptor2.getParcelFileDescriptor();
                        }
                        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
                    }
                }
                openAssetFileDescriptor2 = contentResolver3.openAssetFileDescriptor(uri, com.anythink.expressad.foundation.d.d.bv);
                if (openAssetFileDescriptor2 == null) {
                }
                break;
        }
    }
}
