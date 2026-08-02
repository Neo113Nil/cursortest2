package com.yandex.plus.home;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class i implements com.yandex.plus.home.api.lifecycle.b {
    public final /* synthetic */ j a;

    public i(j jVar) {
        this.a = jVar;
    }

    @Override // com.yandex.plus.home.api.lifecycle.b
    public final void c() {
        com.yandex.plus.home.api.b bVar = this.a.h;
        ReentrantLock reentrantLock = bVar.e;
        reentrantLock.lock();
        try {
            if (bVar.d == 0) {
                bVar.a.a(com.yandex.plus.home.api.a.b);
            }
            bVar.d++;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.yandex.plus.home.api.lifecycle.b
    public final void d() {
        this.a.h.a();
    }

    @Override // com.yandex.plus.home.api.lifecycle.b
    public final void onDestroy() {
        this.a.h.b();
    }

    @Override // com.yandex.plus.home.api.lifecycle.b
    public final void onStop() {
        com.yandex.plus.home.api.b bVar = this.a.h;
        ReentrantLock reentrantLock = bVar.e;
        reentrantLock.lock();
        try {
            if (bVar.d > 0) {
                bVar.d--;
                if (bVar.d == 0) {
                    bVar.a.a(com.yandex.plus.home.api.a.c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
