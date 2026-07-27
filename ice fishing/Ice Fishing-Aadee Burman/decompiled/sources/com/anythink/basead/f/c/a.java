package com.anythink.basead.f.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f8909a;

    public static boolean a() {
        try {
            return f8909a != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static b b() {
        return f8909a;
    }

    public static void a(b bVar) {
        f8909a = bVar;
    }
}
