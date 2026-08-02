package defpackage;

import android.net.Uri;

/* loaded from: classes5.dex */
public final class t4l0 {
    public static boolean a(Uri uri) {
        return "route".equalsIgnoreCase(uri.getAuthority()) && uri.getQueryParameterNames().size() == 1 && uri.getQueryParameter("level") != null;
    }
}
