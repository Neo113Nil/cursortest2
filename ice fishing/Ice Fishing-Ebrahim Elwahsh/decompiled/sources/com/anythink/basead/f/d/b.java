package com.anythink.basead.f.d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9099a = "262";

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f9100b;

    public static void a(a aVar) {
        f9100b = aVar;
    }

    private static boolean b() {
        try {
            return f9100b != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static a a() {
        return f9100b;
    }
}
