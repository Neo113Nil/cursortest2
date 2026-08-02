package com.anythink.basead.f.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f9695a;

    public static boolean a() {
        try {
            return f9695a != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static b b() {
        return f9695a;
    }

    public static void a(b bVar) {
        f9695a = bVar;
    }
}
