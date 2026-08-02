package com.plaid.internal;

import android.net.Uri;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.lifecycle.ViewModel;
import com.plaid.internal.D6;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class K2 extends ViewModel {
    public static D6 a(Uri uri) {
        if (uri == null) {
            return new D6.d(new IllegalStateException("Redirect with no oauth state provided"));
        }
        if (Intrinsics.areEqual(uri.getHost(), "complete")) {
            String uri2 = uri.toString();
            uri2.getClass();
            return new D6.b(uri2);
        }
        if (!Intrinsics.areEqual(uri.getHost(), "redirect")) {
            return Intrinsics.areEqual(uri.getHost(), "resume") ? new D6.e() : new D6.d(new IllegalStateException(CameraState$Type$EnumUnboxingLocalUtility.m(uri, "Invalid redirect uri: ")));
        }
        String uri3 = uri.toString();
        uri3.getClass();
        return new D6.a(uri3);
    }
}
