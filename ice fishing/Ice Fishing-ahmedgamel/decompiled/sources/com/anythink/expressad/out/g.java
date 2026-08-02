package com.anythink.expressad.out;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static com.anythink.expressad.g.a f20814a;

    private g() {
    }

    public static com.anythink.expressad.g.a a() {
        if (f20814a == null) {
            synchronized (g.class) {
                try {
                    if (f20814a == null) {
                        f20814a = new com.anythink.expressad.g.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20814a;
    }
}
