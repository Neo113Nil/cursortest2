package com.anythink.basead.exoplayer.j.a;

import android.net.Uri;

/* loaded from: classes.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8088a = "exo_";

    /* renamed from: b, reason: collision with root package name */
    private static final String f8089b = "exo_redir";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8090c = "exo_len";

    private j() {
    }

    public static long a(i iVar) {
        return iVar.a(f8090c);
    }

    private static Uri b(i iVar) {
        String a9 = iVar.a(f8089b, (String) null);
        if (a9 == null) {
            return null;
        }
        return Uri.parse(a9);
    }

    public static void a(k kVar, long j6) {
        kVar.a(f8090c, j6);
    }

    private static void a(k kVar) {
        kVar.a(f8090c);
    }

    private static void b(k kVar) {
        kVar.a(f8089b);
    }

    public static void a(k kVar, Uri uri) {
        kVar.a(f8089b, uri.toString());
    }
}
