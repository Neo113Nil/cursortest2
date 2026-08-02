package com.yandex.plus.home.internal.di;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public abstract class s {
    public static volatile com.yandex.plus.bdui.templating.render.a d;
    public static volatile boolean e;
    public static volatile int f;
    public static final ReentrantLock a = new ReentrantLock();
    public static final ReentrantLock b = new ReentrantLock();
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final q g = new q();

    public static void a(boolean z) {
        int i;
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            if (z) {
                i = f + 1;
            } else {
                i = f - 1;
                if (i < 0) {
                    i = 0;
                }
            }
            b(i, e);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static void b(int i, boolean z) {
        if (e == z && f == i) {
            return;
        }
        com.yandex.plus.bdui.templating.render.a aVar = d;
        if (aVar != null) {
            Boolean bool = (!e || f <= 0) ? (!z || i <= 0) ? null : Boolean.TRUE : Boolean.FALSE;
            if (bool != null) {
                aVar.invoke(bool);
            }
        }
        e = z;
        f = i;
    }
}
