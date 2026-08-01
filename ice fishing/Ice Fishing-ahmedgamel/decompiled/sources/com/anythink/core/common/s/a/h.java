package com.anythink.core.common.s.a;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    static volatile Executor f16351b;

    /* renamed from: a, reason: collision with root package name */
    static com.anythink.core.common.s.a.a.c f16350a = new d();

    /* renamed from: c, reason: collision with root package name */
    static int f16352c = 4096;

    private h() {
    }

    private static void a(int i) {
        if (i < 2048 || i > 65535) {
            return;
        }
        f16352c = i;
    }

    public static void a(com.anythink.core.common.s.a.a.c cVar) {
        f16350a = cVar;
    }

    public static void a(Executor executor) {
        if (executor != null) {
            f16351b = executor;
        }
    }

    public static Executor a() {
        if (f16351b == null) {
            synchronized (h.class) {
                try {
                    if (f16351b == null) {
                        f16351b = Executors.newCachedThreadPool();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16351b;
    }
}
