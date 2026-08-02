package com.yandex.plus.home.api;

import defpackage.dkn;
import defpackage.x0q;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class b {
    public final x0q a;
    public final dkn b;
    public volatile int c;
    public volatile int d;
    public final ReentrantLock e;

    public b() {
        x0q a = com.yandex.plus.bdui.flex.ui.a.a();
        this.a = a;
        this.b = new dkn(a);
        this.e = new ReentrantLock();
    }

    public final void a() {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (this.c == 0) {
                this.a.a(a.a);
            }
            this.c++;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (this.c > 0) {
                this.c--;
                if (this.c == 0) {
                    this.a.a(a.d);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
