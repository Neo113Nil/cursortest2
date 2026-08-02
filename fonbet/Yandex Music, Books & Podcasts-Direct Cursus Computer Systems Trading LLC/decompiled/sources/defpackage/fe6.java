package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import java.io.InputStream;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fe6 implements s8c {
    public final Uri a;
    public final rwj b;

    public fe6(Uri uri, rwj rwjVar) {
        this.a = uri;
        this.b = rwjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    @Override // defpackage.s8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        InputStream openInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        rwj rwjVar = this.b;
        ContentResolver contentResolver = rwjVar.a.getContentResolver();
        Uri uri = this.a;
        if (Intrinsics.d(uri.getAuthority(), "com.android.contacts") && Intrinsics.d(uri.getLastPathSegment(), "display_photo")) {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            openInputStream = openAssetFileDescriptor != null ? openAssetFileDescriptor.createInputStream() : null;
            if (openInputStream == null) {
                jj4.h(uri, "'.", "Unable to find a contact photo associated with '");
                return null;
            }
        } else if (Build.VERSION.SDK_INT >= 29 && Intrinsics.d(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && Intrinsics.d(pathSegments.get(size - 3), CameraProperty.AUDIO) && Intrinsics.d(pathSegments.get(size - 2), "albums")) {
            lmq lmqVar = rwjVar.d;
            x97 x97Var = lmqVar.a;
            q38 q38Var = x97Var instanceof q38 ? (q38) x97Var : null;
            if (q38Var != null) {
                int i = q38Var.n;
                x97 x97Var2 = lmqVar.b;
                q38 q38Var2 = x97Var2 instanceof q38 ? (q38) x97Var2 : null;
                if (q38Var2 != null) {
                    int i2 = q38Var2.n;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                    AssetFileDescriptor openTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                    openInputStream = openTypedAssetFile != null ? openTypedAssetFile.createInputStream() : null;
                    if (openInputStream == null) {
                        jj4.h(uri, "'.", "Unable to find a music thumbnail associated with '");
                        return null;
                    }
                }
            }
            bundle = null;
            AssetFileDescriptor openTypedAssetFile2 = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
            if (openTypedAssetFile2 != null) {
            }
            if (openInputStream == null) {
            }
        } else {
            openInputStream = contentResolver.openInputStream(uri);
            if (openInputStream == null) {
                jj4.h(uri, "'.", "Unable to open '");
                return null;
            }
        }
        return new r3r(new p3r(new ikn(fxf.T(openInputStream)), new ji7(rwjVar.a, 4), new pc6(uri)), contentResolver.getType(uri), bb7.c);
    }
}
