package com.yandex.plus.home.benchmark;

import com.yandex.plus.core.benchmark.l;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class b {
    public final l a;
    public final l b;
    public final com.yandex.plus.core.activity.result.internal.a c;
    public final AtomicReference d;
    public final AtomicReference e;

    public b(l lVar, l lVar2, com.yandex.plus.core.activity.result.internal.a aVar) {
        this.a = lVar;
        this.b = lVar2;
        this.c = aVar;
        a aVar2 = a.a;
        this.d = new AtomicReference(aVar2);
        this.e = new AtomicReference(aVar2);
    }

    public final void a() {
        AtomicReference atomicReference;
        a aVar = a.b;
        a aVar2 = a.c;
        do {
            atomicReference = this.d;
            if (atomicReference.compareAndSet(aVar, aVar2)) {
                l lVar = this.a;
                lVar.d();
                this.c.invoke(lVar);
                return;
            }
        } while (atomicReference.get() == aVar);
    }

    public final void b() {
        AtomicReference atomicReference;
        a aVar = a.b;
        a aVar2 = a.d;
        do {
            atomicReference = this.d;
            if (atomicReference.compareAndSet(aVar, aVar2)) {
                this.a.d();
                return;
            }
        } while (atomicReference.get() == aVar);
    }

    public final void c() {
        AtomicReference atomicReference;
        a aVar = a.a;
        a aVar2 = a.b;
        do {
            atomicReference = this.d;
            if (atomicReference.compareAndSet(aVar, aVar2)) {
                this.a.c();
                return;
            }
        } while (atomicReference.get() == aVar);
    }

    public final void d() {
        AtomicReference atomicReference;
        a aVar = a.b;
        a aVar2 = a.c;
        do {
            atomicReference = this.e;
            if (atomicReference.compareAndSet(aVar, aVar2)) {
                l lVar = this.b;
                lVar.d();
                this.c.invoke(lVar);
                return;
            }
        } while (atomicReference.get() == aVar);
    }

    public final void e() {
        AtomicReference atomicReference;
        if (this.d.get() == a.c) {
            a aVar = a.a;
            a aVar2 = a.b;
            do {
                atomicReference = this.e;
                if (atomicReference.compareAndSet(aVar, aVar2)) {
                    this.b.c();
                    return;
                }
            } while (atomicReference.get() == aVar);
        }
    }
}
