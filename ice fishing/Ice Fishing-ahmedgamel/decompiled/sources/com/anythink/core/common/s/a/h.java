package com.anythink.core.common.s.a;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    static volatile Executor f17138b;

    /* renamed from: a, reason: collision with root package name */
    static com.anythink.core.common.s.a.a.c f17137a = new d();

    /* renamed from: c, reason: collision with root package name */
    static int f17139c = 4096;

    private h() {
    }

    private static void a(int i) {
        if (i < 2048 || i > 65535) {
            return;
        }
        f17139c = i;
    }

    public static void a(com.anythink.core.common.s.a.a.c cVar) {
        f17137a = cVar;
    }

    public static void a(Executor executor) {
        if (executor != null) {
            f17138b = executor;
        }
    }

    public static Executor a() {
        if (f17138b == null) {
            synchronized (h.class) {
                try {
                    if (f17138b == null) {
                        f17138b = Executors.newCachedThreadPool();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17138b;
    }
}
