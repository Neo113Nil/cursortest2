package com.google.common.cache;

import defpackage.crn;
import defpackage.d51;
import defpackage.fig;
import defpackage.fwn;
import defpackage.iig;
import defpackage.lcg;
import defpackage.nig;
import defpackage.o2g;
import defpackage.qzc;
import defpackage.uwf;
import defpackage.vhg;
import defpackage.wp3;
import defpackage.wvs;
import defpackage.zhg;
import defpackage.zo3;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public final class a extends ReentrantLock {
    public final b a;
    public volatile int b;
    public long c;
    public int d;
    public int e;
    public volatile AtomicReferenceArray f;
    public final long g;
    public final ReferenceQueue h;
    public final ReferenceQueue i;
    public final AbstractQueue j;
    public final AtomicInteger k = new AtomicInteger();
    public final AbstractQueue l;
    public final AbstractQueue m;
    public final d51 n;

    public a(b bVar, int i, long j, d51 d51Var) {
        this.a = bVar;
        this.g = j;
        this.n = d51Var;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.e = length;
        if (bVar.j == zo3.a && length == j) {
            this.e = length + 1;
        }
        this.f = atomicReferenceArray;
        iig iigVar = bVar.g;
        fig figVar = iig.a;
        this.h = iigVar != figVar ? new ReferenceQueue() : null;
        this.i = bVar.h != figVar ? new ReferenceQueue() : null;
        this.j = (bVar.b() || bVar.a()) ? new ConcurrentLinkedQueue() : b.x;
        this.l = bVar.c() ? new vhg(1) : b.x;
        this.m = (bVar.b() || bVar.a()) ? new vhg(0) : b.x;
    }

    public final Object A(crn crnVar, Object obj, nig nigVar) {
        d51 d51Var = this.n;
        if (!nigVar.f()) {
            wvs.b();
            return null;
        }
        o2g.S(obj, "Recursive load of: %s", !Thread.holdsLock(crnVar));
        try {
            Object j = nigVar.j();
            if (j != null) {
                q(crnVar, this.a.o.a());
                return j;
            }
            throw new wp3("CacheLoader returned null for key " + obj + ".");
        } finally {
            d51Var.getClass();
        }
    }

    public final crn a(crn crnVar, crn crnVar2) {
        Object key = crnVar.getKey();
        if (key == null) {
            return null;
        }
        nig g = crnVar.g();
        Object obj = g.get();
        if (obj == null && g.b()) {
            return null;
        }
        crn copyEntry = this.a.p.copyEntry(this, crnVar, crnVar2, key);
        copyEntry.b(g.k(this.i, obj, copyEntry));
        return copyEntry;
    }

    public final void b() {
        while (true) {
            crn crnVar = (crn) this.j.poll();
            if (crnVar == null) {
                return;
            }
            AbstractQueue abstractQueue = this.m;
            if (abstractQueue.contains(crnVar)) {
                abstractQueue.add(crnVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        r3.d++;
        r4 = r3.u(r5, r5, r5.getKey(), r5.g().get(), r5.g(), 3);
        r5 = r3.b - 1;
        r11.set(r12, r4);
        r3.b = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
    
        if (r3.isHeldByCurrentThread() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f8, code lost:
    
        r3.w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0118, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0105, code lost:
    
        if (r3.isHeldByCurrentThread() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0115, code lost:
    
        if (r3.isHeldByCurrentThread() == false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        a aVar;
        a aVar2;
        iig iigVar = this.a.g;
        fig figVar = iig.a;
        int i = 0;
        if (iigVar != figVar) {
            int i2 = 0;
            do {
                Object poll = this.h.poll();
                if (poll == null) {
                    break;
                }
                crn crnVar = (crn) poll;
                b bVar = this.a;
                bVar.getClass();
                int l = crnVar.l();
                a f = bVar.f(l);
                f.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = f.f;
                    int length = l & (atomicReferenceArray.length() - 1);
                    crn crnVar2 = (crn) atomicReferenceArray.get(length);
                    aVar2 = f;
                    while (true) {
                        if (crnVar2 == null) {
                            break;
                        }
                        if (crnVar2 == crnVar) {
                            try {
                                break;
                            } catch (Throwable th) {
                                th = th;
                                aVar2.unlock();
                                aVar2.w();
                                throw th;
                            }
                        }
                        crnVar2 = crnVar2.getNext();
                    }
                    aVar2.unlock();
                    aVar2.w();
                    i2++;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = f;
                }
            } while (i2 != 16);
        }
        if (this.a.h != figVar) {
            do {
                Object poll2 = this.i.poll();
                if (poll2 == null) {
                    return;
                }
                nig nigVar = (nig) poll2;
                b bVar2 = this.a;
                bVar2.getClass();
                crn i3 = nigVar.i();
                int l2 = i3.l();
                a f2 = bVar2.f(l2);
                Object key = i3.getKey();
                f2.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray2 = f2.f;
                    int length2 = l2 & (atomicReferenceArray2.length() - 1);
                    crn crnVar3 = (crn) atomicReferenceArray2.get(length2);
                    int i4 = l2;
                    aVar = f2;
                    while (crnVar3 != null) {
                        int i5 = i4;
                        try {
                            Object key2 = crnVar3.getKey();
                            if (crnVar3.l() != i5 || key2 == null || !aVar.a.e.c(key, key2)) {
                                crnVar3 = crnVar3.getNext();
                                i4 = i5;
                            } else if (crnVar3.g() == nigVar) {
                                aVar.d++;
                                crn u = aVar.u(crnVar3, crnVar3, key2, nigVar.get(), nigVar, 3);
                                int i6 = aVar.b - 1;
                                atomicReferenceArray2.set(length2, u);
                                aVar.b = i6;
                                aVar.unlock();
                            } else {
                                aVar.unlock();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            aVar.unlock();
                            if (!aVar.isHeldByCurrentThread()) {
                                aVar.w();
                            }
                            throw th;
                        }
                    }
                    aVar.unlock();
                } catch (Throwable th4) {
                    th = th4;
                    aVar = f2;
                }
            } while (i != 16);
        }
    }

    public final void d(int i, Object obj, Object obj2, int i2) {
        this.c -= i;
        boolean z = false;
        if (i2 != 1 && i2 != 2) {
            z = true;
        }
        if (z) {
            this.n.getClass();
        }
        b bVar = this.a;
        if (bVar.m != b.x) {
            bVar.m.offer(new fwn(obj, obj2));
        }
    }

    public final void e(crn crnVar) {
        if (this.a.a()) {
            b();
            long h = crnVar.g().h();
            long j = this.g;
            if (h > j && !s(crnVar, crnVar.l(), 5)) {
                wvs.b();
                return;
            }
            while (this.c > j) {
                for (crn crnVar2 : this.m) {
                    if (crnVar2.g().h() > 0) {
                        if (!s(crnVar2, crnVar2.l(), 5)) {
                            wvs.b();
                            return;
                        }
                    }
                }
                wvs.b();
                return;
            }
        }
    }

    public final void f() {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.b;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
        this.e = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            crn crnVar = (crn) atomicReferenceArray.get(i2);
            if (crnVar != null) {
                crn next = crnVar.getNext();
                int l = crnVar.l() & length2;
                if (next == null) {
                    atomicReferenceArray2.set(l, crnVar);
                } else {
                    crn crnVar2 = crnVar;
                    while (next != null) {
                        int l2 = next.l() & length2;
                        if (l2 != l) {
                            crnVar2 = next;
                            l = l2;
                        }
                        next = next.getNext();
                    }
                    atomicReferenceArray2.set(l, crnVar2);
                    while (crnVar != crnVar2) {
                        int l3 = crnVar.l() & length2;
                        crn a = a(crnVar, (crn) atomicReferenceArray2.get(l3));
                        if (a != null) {
                            atomicReferenceArray2.set(l3, a);
                        } else {
                            r(crnVar);
                            i--;
                        }
                        crnVar = crnVar.getNext();
                    }
                }
            }
        }
        this.f = atomicReferenceArray2;
        this.b = i;
    }

    public final void g(long j) {
        crn crnVar;
        crn crnVar2;
        b();
        do {
            crnVar = (crn) this.l.peek();
            b bVar = this.a;
            if (crnVar == null || !bVar.e(crnVar, j)) {
                do {
                    crnVar2 = (crn) this.m.peek();
                    if (crnVar2 == null || !bVar.e(crnVar2, j)) {
                        return;
                    }
                } while (s(crnVar2, crnVar2.l(), 4));
                wvs.b();
                return;
            }
        } while (s(crnVar, crnVar.l(), 4));
        wvs.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {all -> 0x0050, blocks: (B:2:0x0000, B:4:0x0005, B:12:0x0035, B:14:0x003f, B:17:0x0052, B:18:0x0014, B:20:0x001c, B:24:0x0025, B:27:0x002b, B:28:0x002e, B:23:0x0022), top: B:1:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(int i, Object obj) {
        try {
            if (this.b != 0) {
                long a = this.a.o.a();
                crn j = j(i, obj);
                if (j != null) {
                    if (this.a.e(j, a)) {
                        if (tryLock()) {
                            try {
                                g(a);
                            } finally {
                                unlock();
                            }
                        }
                    }
                    if (j != null) {
                        return null;
                    }
                    Object obj2 = j.g().get();
                    if (obj2 != null) {
                        q(j, a);
                        j.getKey();
                        b bVar = this.a;
                        qzc qzcVar = bVar.r;
                        bVar.getClass();
                        return obj2;
                    }
                    z();
                }
                j = null;
                if (j != null) {
                }
            }
            return null;
        } finally {
            n();
        }
    }

    public final Object i(Object obj, int i, zhg zhgVar, lcg lcgVar) {
        Object obj2;
        d51 d51Var = this.n;
        try {
            obj2 = uwf.t(lcgVar);
            try {
                if (obj2 != null) {
                    zhgVar.c.a();
                    d51Var.getClass();
                    y(obj, i, zhgVar, obj2);
                    return obj2;
                }
                throw new wp3("CacheLoader returned null for key " + obj + ".");
            } catch (Throwable th) {
                th = th;
                if (obj2 == null) {
                    zhgVar.c.a();
                    d51Var.getClass();
                    lock();
                    try {
                        AtomicReferenceArray atomicReferenceArray = this.f;
                        int length = (atomicReferenceArray.length() - 1) & i;
                        crn crnVar = (crn) atomicReferenceArray.get(length);
                        crn crnVar2 = crnVar;
                        while (true) {
                            if (crnVar2 == null) {
                                break;
                            }
                            Object key = crnVar2.getKey();
                            if (crnVar2.l() != i || key == null || !this.a.e.c(obj, key)) {
                                crnVar2 = crnVar2.getNext();
                            } else if (crnVar2.g() == zhgVar) {
                                if (zhgVar.a.b()) {
                                    crnVar2.b(zhgVar.a);
                                } else {
                                    atomicReferenceArray.set(length, t(crnVar, crnVar2));
                                }
                            }
                        }
                        unlock();
                        w();
                    } catch (Throwable th2) {
                        unlock();
                        w();
                        throw th2;
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            obj2 = null;
        }
    }

    public final crn j(int i, Object obj) {
        for (crn crnVar = (crn) this.f.get((r0.length() - 1) & i); crnVar != null; crnVar = crnVar.getNext()) {
            if (crnVar.l() == i) {
                Object key = crnVar.getKey();
                if (key == null) {
                    z();
                } else if (this.a.e.c(obj, key)) {
                    return crnVar;
                }
            }
        }
        return null;
    }

    public final Object k(crn crnVar, long j) {
        if (crnVar.getKey() == null) {
            z();
            return null;
        }
        Object obj = crnVar.g().get();
        if (obj == null) {
            z();
            return null;
        }
        if (!this.a.e(crnVar, j)) {
            return obj;
        }
        if (!tryLock()) {
            return null;
        }
        try {
            g(j);
            return null;
        } finally {
            unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0090, code lost:
    
        if (r6 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0092, code lost:
    
        r11 = new defpackage.zhg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0097, code lost:
    
        if (r10 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        r3 = r16.a.p;
        r17.getClass();
        r10 = r3.newEntry(r16, r17, r18, r9);
        r10.b(r11);
        r7.set(r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ab, code lost:
    
        r10.b(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
    
        unlock();
        w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b4, code lost:
    
        if (r6 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d6, code lost:
    
        return A(r10, r17, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b6, code lost:
    
        monitor-enter(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
    
        r0 = i(r17, r18, r11, r11.a(r17, r19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        monitor-exit(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        r16.n.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj, int i, qzc qzcVar) {
        nig nigVar;
        lock();
        try {
            long a = this.a.o.a();
            v(a);
            boolean z = true;
            int i2 = this.b - 1;
            AtomicReferenceArray atomicReferenceArray = this.f;
            int length = (atomicReferenceArray.length() - 1) & i;
            crn crnVar = (crn) atomicReferenceArray.get(length);
            crn crnVar2 = crnVar;
            while (true) {
                zhg zhgVar = null;
                if (crnVar2 == null) {
                    nigVar = null;
                    break;
                }
                Object key = crnVar2.getKey();
                if (crnVar2.l() == i && key != null && this.a.e.c(obj, key)) {
                    nigVar = crnVar2.g();
                    if (nigVar.f()) {
                        z = false;
                    } else {
                        Object obj2 = nigVar.get();
                        if (obj2 == null) {
                            d(nigVar.h(), key, obj2, 3);
                        } else {
                            if (!this.a.e(crnVar2, a)) {
                                p(crnVar2, a);
                                unlock();
                                w();
                                return obj2;
                            }
                            d(nigVar.h(), key, obj2, 4);
                        }
                        this.l.remove(crnVar2);
                        this.m.remove(crnVar2);
                        this.b = i2;
                    }
                } else {
                    crnVar2 = crnVar2.getNext();
                }
            }
        } catch (Throwable th) {
            unlock();
            w();
            throw th;
        }
    }

    public final void n() {
        if ((this.k.incrementAndGet() & 63) == 0) {
            v(this.a.o.a());
            w();
        }
    }

    public final Object o(Object obj, Object obj2, boolean z, int i) {
        int i2;
        lock();
        try {
            long a = this.a.o.a();
            v(a);
            if (this.b + 1 > this.e) {
                f();
            }
            AtomicReferenceArray atomicReferenceArray = this.f;
            int length = (atomicReferenceArray.length() - 1) & i;
            crn crnVar = (crn) atomicReferenceArray.get(length);
            crn crnVar2 = crnVar;
            while (true) {
                if (crnVar2 == null) {
                    this.d++;
                    crn newEntry = this.a.p.newEntry(this, obj, i, crnVar);
                    x(newEntry, obj2, a);
                    atomicReferenceArray.set(length, newEntry);
                    this.b++;
                    e(newEntry);
                    break;
                }
                Object key = crnVar2.getKey();
                if (crnVar2.l() == i && key != null && this.a.e.c(obj, key)) {
                    nig g = crnVar2.g();
                    Object obj3 = g.get();
                    if (obj3 != null) {
                        if (z) {
                            p(crnVar2, a);
                        } else {
                            this.d++;
                            d(g.h(), obj, obj3, 2);
                            x(crnVar2, obj2, a);
                            e(crnVar2);
                        }
                        unlock();
                        w();
                        return obj3;
                    }
                    this.d++;
                    if (g.b()) {
                        d(g.h(), obj, obj3, 3);
                        x(crnVar2, obj2, a);
                        i2 = this.b;
                    } else {
                        x(crnVar2, obj2, a);
                        i2 = this.b + 1;
                    }
                    this.b = i2;
                    e(crnVar2);
                } else {
                    crnVar2 = crnVar2.getNext();
                }
            }
            unlock();
            w();
            return null;
        } catch (Throwable th) {
            unlock();
            w();
            throw th;
        }
    }

    public final void p(crn crnVar, long j) {
        if (this.a.b()) {
            crnVar.o(j);
        }
        this.m.add(crnVar);
    }

    public final void q(crn crnVar, long j) {
        if (this.a.b()) {
            crnVar.o(j);
        }
        this.j.add(crnVar);
    }

    public final void r(crn crnVar) {
        Object key = crnVar.getKey();
        crnVar.l();
        d(crnVar.g().h(), key, crnVar.g().get(), 3);
        this.l.remove(crnVar);
        this.m.remove(crnVar);
    }

    public final boolean s(crn crnVar, int i, int i2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = i & (atomicReferenceArray.length() - 1);
        crn crnVar2 = (crn) atomicReferenceArray.get(length);
        for (crn crnVar3 = crnVar2; crnVar3 != null; crnVar3 = crnVar3.getNext()) {
            if (crnVar3 == crnVar) {
                this.d++;
                crn u = u(crnVar2, crnVar3, crnVar3.getKey(), crnVar3.g().get(), crnVar3.g(), i2);
                int i3 = this.b - 1;
                atomicReferenceArray.set(length, u);
                this.b = i3;
                return true;
            }
        }
        return false;
    }

    public final crn t(crn crnVar, crn crnVar2) {
        int i = this.b;
        crn next = crnVar2.getNext();
        while (crnVar != crnVar2) {
            crn a = a(crnVar, next);
            if (a != null) {
                next = a;
            } else {
                r(crnVar);
                i--;
            }
            crnVar = crnVar.getNext();
        }
        this.b = i;
        return next;
    }

    public final crn u(crn crnVar, crn crnVar2, Object obj, Object obj2, nig nigVar, int i) {
        d(nigVar.h(), obj, obj2, i);
        this.l.remove(crnVar2);
        this.m.remove(crnVar2);
        if (!nigVar.f()) {
            return t(crnVar, crnVar2);
        }
        nigVar.g(null);
        return crnVar;
    }

    public final void v(long j) {
        if (tryLock()) {
            try {
                c();
                g(j);
                this.k.set(0);
            } finally {
                unlock();
            }
        }
    }

    public final void w() {
        if (isHeldByCurrentThread()) {
            return;
        }
        while (true) {
            b bVar = this.a;
            fwn fwnVar = (fwn) bVar.m.poll();
            if (fwnVar == null) {
                return;
            }
            try {
                bVar.n.a(fwnVar);
            } catch (Throwable th) {
                b.v.log(Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }

    public final void x(crn crnVar, Object obj, long j) {
        nig g = crnVar.g();
        b bVar = this.a;
        bVar.j.getClass();
        crnVar.b(bVar.h.b(this, crnVar, obj));
        b();
        this.c++;
        if (bVar.b()) {
            crnVar.o(j);
        }
        if (bVar.c()) {
            crnVar.q(j);
        }
        this.m.add(crnVar);
        this.l.add(crnVar);
        g.g(obj);
    }

    public final void y(Object obj, int i, zhg zhgVar, Object obj2) {
        lock();
        try {
            long a = this.a.o.a();
            v(a);
            int i2 = this.b + 1;
            if (i2 > this.e) {
                f();
                i2 = this.b + 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f;
            int length = (atomicReferenceArray.length() - 1) & i;
            crn crnVar = (crn) atomicReferenceArray.get(length);
            crn crnVar2 = crnVar;
            while (true) {
                if (crnVar2 == null) {
                    this.d++;
                    LocalCache$EntryFactory localCache$EntryFactory = this.a.p;
                    obj.getClass();
                    crn newEntry = localCache$EntryFactory.newEntry(this, obj, i, crnVar);
                    x(newEntry, obj2, a);
                    atomicReferenceArray.set(length, newEntry);
                    this.b = i2;
                    e(newEntry);
                    break;
                }
                Object key = crnVar2.getKey();
                if (crnVar2.l() == i && key != null && this.a.e.c(obj, key)) {
                    nig g = crnVar2.g();
                    Object obj3 = g.get();
                    if (zhgVar != g && (obj3 != null || g == b.w)) {
                        d(0, obj, obj2, 2);
                    }
                    this.d++;
                    if (zhgVar.a.b()) {
                        d(zhgVar.a.h(), obj, obj3, obj3 == null ? 3 : 2);
                        i2--;
                    }
                    x(crnVar2, obj2, a);
                    this.b = i2;
                    e(crnVar2);
                } else {
                    crnVar2 = crnVar2.getNext();
                }
            }
            unlock();
            w();
        } catch (Throwable th) {
            unlock();
            w();
            throw th;
        }
    }

    public final void z() {
        if (tryLock()) {
            try {
                c();
            } finally {
                unlock();
            }
        }
    }
}
