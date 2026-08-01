package com.anythink.basead.f.d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8942a = "262";

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f8943b;

    public static void a(a aVar) {
        f8943b = aVar;
    }

    private static boolean b() {
        try {
            return f8943b != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static a a() {
        return f8943b;
    }
}
