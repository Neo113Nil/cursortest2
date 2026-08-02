package com.plaid.internal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

/* renamed from: com.plaid.internal.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0179h<T> {
    public volatile T a;
    public volatile Exception b;
    public final CountDownLatch c = new CountDownLatch(1);

    public static <T> C0179h<T> a(T t) {
        C0179h<T> c0179h = new C0179h<>();
        synchronized (c0179h.c) {
            try {
                if (c0179h.c.getCount() > 0) {
                    c0179h.a = t;
                    c0179h.c.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0179h;
    }

    public static <T> C0179h<T> a(Exception exc) {
        C0179h<T> c0179h = new C0179h<>();
        synchronized (c0179h.c) {
            try {
                if (c0179h.c.getCount() > 0) {
                    c0179h.b = exc;
                    c0179h.c.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0179h;
    }

    public final T a() {
        this.c.await();
        if (this.b == null) {
            return this.a;
        }
        throw new ExecutionException(this.b);
    }
}
