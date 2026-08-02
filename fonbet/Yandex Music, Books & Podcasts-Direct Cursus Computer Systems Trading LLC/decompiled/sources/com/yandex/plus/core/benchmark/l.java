package com.yandex.plus.core.benchmark;

import defpackage.b6e;
import defpackage.pyc;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class l {
    public final String a;
    public final List b;
    public final androidx.core.app.q c;
    public final k d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(List list, androidx.core.app.q qVar, i iVar) {
        this(r0, list, qVar, r2);
        k kVar;
        list.getClass();
        String name = iVar.getName();
        if (iVar instanceof e) {
            kVar = new k(d.a, 0L, 0L);
        } else if (iVar instanceof f) {
            kVar = new k(d.b, ((f) iVar).b, 0L);
        } else {
            if (!(iVar instanceof h)) {
                b6e.s();
                throw null;
            }
            h hVar = (h) iVar;
            kVar = new k(d.c, hVar.b, hVar.c);
        }
    }

    public final Object a(pyc pycVar) {
        d dVar;
        long j;
        long j2;
        do {
            Object obj = this.d.a.get();
            obj.getClass();
            dVar = (d) obj;
            j = this.d.b;
            j2 = this.d.c;
        } while (dVar != this.d.a.get());
        return pycVar.invoke(dVar, Long.valueOf(j), Long.valueOf(j2));
    }

    public final long b() {
        return ((Number) a(new j(this, 0))).longValue();
    }

    public final boolean c() {
        AtomicReference atomicReference = this.d.a;
        d dVar = d.a;
        d dVar2 = d.b;
        while (!atomicReference.compareAndSet(dVar, dVar2)) {
            if (atomicReference.get() != dVar) {
                return false;
            }
        }
        k kVar = this.d;
        this.c.getClass();
        kVar.b = System.nanoTime();
        return true;
    }

    public final boolean d() {
        AtomicReference atomicReference = this.d.a;
        d dVar = d.b;
        d dVar2 = d.c;
        while (!atomicReference.compareAndSet(dVar, dVar2)) {
            if (atomicReference.get() != dVar) {
                return false;
            }
        }
        k kVar = this.d;
        this.c.getClass();
        kVar.c = System.nanoTime();
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(String str, List list, androidx.core.app.q qVar) {
        this(str, list, qVar, new k(d.a, 0L, 0L));
        str.getClass();
        list.getClass();
    }

    public l(String str, List list, androidx.core.app.q qVar, k kVar) {
        this.a = str;
        this.b = list;
        this.c = qVar;
        this.d = kVar;
    }
}
