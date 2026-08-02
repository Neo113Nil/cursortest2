package com.google.common.cache;

import defpackage.ap3;
import defpackage.crn;
import defpackage.d51;
import defpackage.e8;
import defpackage.err;
import defpackage.ewn;
import defpackage.ezf;
import defpackage.fig;
import defpackage.iig;
import defpackage.ngs;
import defpackage.nig;
import defpackage.qeb;
import defpackage.qhg;
import defpackage.qzc;
import defpackage.rhg;
import defpackage.xhg;
import defpackage.yo3;
import defpackage.zc4;
import defpackage.zo3;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class b extends AbstractMap implements ConcurrentMap {
    public static final Logger v = Logger.getLogger(b.class.getName());
    public static final qhg w = new qhg();
    public static final rhg x = new rhg();
    public final int a;
    public final int b;
    public final a[] c;
    public final int d;
    public final qeb e;
    public final qeb f;
    public final iig g;
    public final iig h;
    public final long i;
    public final zo3 j;
    public final long k;
    public final long l;
    public final AbstractQueue m;
    public final ewn n;
    public final ngs o;
    public final LocalCache$EntryFactory p;
    public final d51 q;
    public final qzc r;
    public xhg s;
    public e8 t;
    public xhg u;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.cache.b, java.util.AbstractMap] */
    public b(ap3 ap3Var, qzc qzcVar) {
        ?? abstractMap = new AbstractMap();
        int i = ap3Var.c;
        abstractMap.d = Math.min(i == -1 ? 4 : i, SQLiteDatabase.OPEN_FULLMUTEX);
        iig iigVar = ap3Var.g;
        fig figVar = iig.a;
        iig iigVar2 = (iig) ezf.A(iigVar, figVar);
        abstractMap.g = iigVar2;
        abstractMap.h = (iig) ezf.A(ap3Var.h, figVar);
        abstractMap.e = (qeb) ezf.A(ap3Var.k, ((iig) ezf.A(ap3Var.g, figVar)).a());
        abstractMap.f = (qeb) ezf.A(ap3Var.l, ((iig) ezf.A(ap3Var.h, figVar)).a());
        long j = (ap3Var.i == 0 || ap3Var.j == 0) ? 0L : ap3Var.f == null ? ap3Var.d : ap3Var.e;
        abstractMap.i = j;
        zo3 zo3Var = ap3Var.f;
        zo3 zo3Var2 = zo3.a;
        zo3 zo3Var3 = (zo3) ezf.A(zo3Var, zo3Var2);
        abstractMap.j = zo3Var3;
        long j2 = ap3Var.j;
        abstractMap.k = j2 == -1 ? 0L : j2;
        long j3 = ap3Var.i;
        abstractMap.l = j3 != -1 ? j3 : 0L;
        ewn ewnVar = ap3Var.m;
        yo3 yo3Var = yo3.a;
        ewn ewnVar2 = (ewn) ezf.A(ewnVar, yo3Var);
        abstractMap.n = ewnVar2;
        abstractMap.m = ewnVar2 == yo3Var ? x : new ConcurrentLinkedQueue();
        int i2 = 0;
        int i3 = 1;
        boolean z = abstractMap.c() || abstractMap.b();
        ngs ngsVar = ap3Var.n;
        abstractMap.o = ngsVar == null ? z ? ngs.a : ap3.p : ngsVar;
        abstractMap.p = LocalCache$EntryFactory.getFactory(iigVar2, abstractMap.b() || abstractMap.a() || abstractMap.b(), abstractMap.c() || abstractMap.c());
        err errVar = ap3.o;
        abstractMap.q = errVar.a;
        abstractMap.r = qzcVar;
        int i4 = ap3Var.b;
        int min = Math.min(i4 == -1 ? 16 : i4, 1073741824);
        if (abstractMap.a() && zo3Var3 == zo3Var2) {
            min = (int) Math.min(min, j);
        }
        int i5 = 0;
        int i6 = 1;
        while (i6 < abstractMap.d && (!abstractMap.a() || i6 * 20 <= abstractMap.i)) {
            i5++;
            i6 <<= 1;
        }
        abstractMap.b = 32 - i5;
        abstractMap.a = i6 - 1;
        abstractMap.c = new a[i6];
        int i7 = min / i6;
        while (i3 < (i7 * i6 < min ? i7 + 1 : i7)) {
            i3 <<= 1;
        }
        if (abstractMap.a()) {
            long j4 = abstractMap.i;
            long j5 = i6;
            long j6 = (j4 / j5) + 1;
            long j7 = j4 % j5;
            while (true) {
                a[] aVarArr = abstractMap.c;
                if (i2 >= aVarArr.length) {
                    return;
                }
                if (i2 == j7) {
                    j6--;
                }
                long j8 = j6;
                aVarArr[i2] = new a(abstractMap, i3, j8, errVar.a);
                i2++;
                j6 = j8;
            }
        } else {
            int i8 = i3;
            b bVar = abstractMap;
            while (true) {
                a[] aVarArr2 = bVar.c;
                if (i2 >= aVarArr2.length) {
                    return;
                }
                aVarArr2[i2] = new a(bVar, i8, -1L, errVar.a);
                i2++;
                bVar = this;
            }
        }
    }

    public final boolean a() {
        return this.i >= 0;
    }

    public final boolean b() {
        return this.k > 0;
    }

    public final boolean c() {
        return this.l > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        int i;
        fig figVar = iig.a;
        for (a aVar : this.c) {
            if (aVar.b != 0) {
                aVar.lock();
                try {
                    aVar.v(aVar.a.o.a());
                    AtomicReferenceArray atomicReferenceArray = aVar.f;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (crn crnVar = (crn) atomicReferenceArray.get(i2); crnVar != null; crnVar = crnVar.getNext()) {
                            if (crnVar.g().b()) {
                                Object key = crnVar.getKey();
                                Object obj = crnVar.g().get();
                                if (key != null && obj != null) {
                                    i = 1;
                                    crnVar.l();
                                    aVar.d(crnVar.g().h(), key, obj, i);
                                }
                                i = 3;
                                crnVar.l();
                                aVar.d(crnVar.g().h(), key, obj, i);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    b bVar = aVar.a;
                    if (bVar.g != figVar) {
                        while (aVar.h.poll() != null) {
                        }
                    }
                    if (bVar.h != figVar) {
                        while (aVar.i.poll() != null) {
                        }
                    }
                    aVar.l.clear();
                    aVar.m.clear();
                    aVar.k.set(0);
                    aVar.d++;
                    aVar.b = 0;
                    aVar.unlock();
                    aVar.w();
                } catch (Throwable th) {
                    aVar.unlock();
                    aVar.w();
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:7:0x000f, B:9:0x0013, B:16:0x0044, B:21:0x0023, B:23:0x002b, B:27:0x0034, B:30:0x003a, B:31:0x003d, B:26:0x0031), top: B:6:0x000f, inners: #1 }] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int d = d(obj);
        a f = f(d);
        f.getClass();
        try {
            if (f.b == 0) {
                return false;
            }
            long a = f.a.o.a();
            crn j = f.j(d, obj);
            if (j != null) {
                if (f.a.e(j, a)) {
                    if (f.tryLock()) {
                        try {
                            f.g(a);
                        } finally {
                            f.unlock();
                        }
                    }
                }
                if (j != null) {
                    return false;
                }
                return j.g().get() != null;
            }
            j = null;
            if (j != null) {
            }
        } finally {
            f.n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        long a = this.o.a();
        a[] aVarArr = this.c;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = aVarArr.length;
            long j2 = 0;
            for (?? r12 = z; r12 < length; r12++) {
                a aVar = aVarArr[r12];
                int i2 = aVar.b;
                ?? r14 = aVar.f;
                boolean z2 = z;
                for (?? r15 = z2; r15 < r14.length(); r15++) {
                    crn crnVar = (crn) r14.get(r15);
                    while (crnVar != null) {
                        a[] aVarArr2 = aVarArr;
                        Object k = aVar.k(crnVar, a);
                        crn crnVar2 = crnVar;
                        if (k != null && this.f.c(obj, k)) {
                            return true;
                        }
                        crnVar = crnVar2.getNext();
                        aVarArr = aVarArr2;
                    }
                }
                j2 += aVar.d;
                z = z2;
            }
            boolean z3 = z;
            a[] aVarArr3 = aVarArr;
            if (j2 == j) {
                return z3;
            }
            i++;
            j = j2;
            z = z3;
            aVarArr = aVarArr3;
        }
        return z;
    }

    public final int d(Object obj) {
        int b;
        qeb qebVar = this.e;
        if (obj == null) {
            qebVar.getClass();
            b = 0;
        } else {
            b = qebVar.b(obj);
        }
        int i = b + ((b << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = (i4 << 2) + (i4 << 14) + i4;
        return (i5 >>> 16) ^ i5;
    }

    public final boolean e(crn crnVar, long j) {
        crnVar.getClass();
        if (!b() || j - crnVar.p() < this.k) {
            return c() && j - crnVar.n() >= this.l;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        xhg xhgVar = this.u;
        if (xhgVar != null) {
            return xhgVar;
        }
        xhg xhgVar2 = new xhg(this, 0);
        this.u = xhgVar2;
        return xhgVar2;
    }

    public final a f(int i) {
        return this.c[(i >>> this.b) & this.a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int d = d(obj);
        return f(d).h(d, obj);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        a[] aVarArr = this.c;
        long j = 0;
        for (a aVar : aVarArr) {
            if (aVar.b != 0) {
                return false;
            }
            j += r8.d;
        }
        if (j == 0) {
            return true;
        }
        for (a aVar2 : aVarArr) {
            if (aVar2.b != 0) {
                return false;
            }
            j -= r9.d;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        xhg xhgVar = this.s;
        if (xhgVar != null) {
            return xhgVar;
        }
        xhg xhgVar2 = new xhg(this, 1);
        this.s = xhgVar2;
        return xhgVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int d = d(obj);
        return f(d).o(obj, obj2, false, d);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int d = d(obj);
        return f(d).o(obj, obj2, true, d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        r7 = r4.g();
        r6 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r2.a.f.c(r14, r6) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        r2.d++;
        r13 = r2.u(r3, r4, r5, r6, r7, r8);
        r14 = r2.b - 1;
        r9.set(r11, r13);
        r2.b = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if (r8 != 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r6 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r7.b() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r8 = 3;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj, Object obj2) {
        boolean z = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int d = d(obj);
        a f = f(d);
        f.lock();
        try {
            f.v(f.a.o.a());
            AtomicReferenceArray atomicReferenceArray = f.f;
            int length = d & (atomicReferenceArray.length() - 1);
            crn crnVar = (crn) atomicReferenceArray.get(length);
            crn crnVar2 = crnVar;
            while (true) {
                if (crnVar2 == null) {
                    break;
                }
                Object key = crnVar2.getKey();
                if (crnVar2.l() == d && key != null && f.a.e.c(obj, key)) {
                    break;
                }
                crnVar2 = crnVar2.getNext();
            }
            return z;
        } finally {
            f.unlock();
            f.w();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean z;
        obj.getClass();
        obj3.getClass();
        boolean z2 = false;
        if (obj2 == null) {
            return false;
        }
        int d = d(obj);
        a f = f(d);
        f.lock();
        try {
            long a = f.a.o.a();
            f.v(a);
            AtomicReferenceArray atomicReferenceArray = f.f;
            int length = d & (atomicReferenceArray.length() - 1);
            crn crnVar = (crn) atomicReferenceArray.get(length);
            long j = a;
            crn crnVar2 = crnVar;
            while (true) {
                if (crnVar2 == null) {
                    z = z2;
                    break;
                }
                crn crnVar3 = crnVar;
                Object key = crnVar2.getKey();
                if (crnVar2.l() == d && key != null && f.a.e.c(obj, key)) {
                    z = z2;
                    long j2 = j;
                    nig g = crnVar2.g();
                    Object obj4 = g.get();
                    if (obj4 == null) {
                        if (g.b()) {
                            f.d++;
                            crn u = f.u(crnVar3, crnVar2, key, obj4, g, 3);
                            int i = f.b - 1;
                            atomicReferenceArray.set(length, u);
                            f.b = i;
                        }
                    } else {
                        if (f.a.f.c(obj2, obj4)) {
                            f.d++;
                            f.d(g.h(), obj, obj4, 2);
                            f.x(crnVar2, obj3, j2);
                            f.e(crnVar2);
                            return true;
                        }
                        f.p(crnVar2, j2);
                    }
                } else {
                    boolean z3 = z2;
                    crnVar = crnVar3;
                    long j3 = j;
                    int i2 = d;
                    crnVar2 = crnVar2.getNext();
                    d = i2;
                    j = j3;
                    z2 = z3;
                }
            }
            return z;
        } finally {
            f.unlock();
            f.w();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (int i = 0; i < this.c.length; i++) {
            j += Math.max(0, r0[i].b);
        }
        return zc4.W(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        e8 e8Var = this.t;
        if (e8Var != null) {
            return e8Var;
        }
        e8 e8Var2 = new e8(2, this);
        this.t = e8Var2;
        return e8Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        r7 = r4.g();
        r6 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r6 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r2.d++;
        r13 = r2.u(r3, r4, r5, r6, r7, r8);
        r0 = r2.b - 1;
        r9.set(r11, r13);
        r2.b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        r2.unlock();
        r2.w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r7.b() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        r8 = 3;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int d = d(obj);
        a f = f(d);
        f.lock();
        try {
            f.v(f.a.o.a());
            AtomicReferenceArray atomicReferenceArray = f.f;
            int length = d & (atomicReferenceArray.length() - 1);
            crn crnVar = (crn) atomicReferenceArray.get(length);
            crn crnVar2 = crnVar;
            while (true) {
                if (crnVar2 == null) {
                    break;
                }
                Object key = crnVar2.getKey();
                if (crnVar2.l() == d && key != null && f.a.e.c(obj, key)) {
                    break;
                }
                crnVar2 = crnVar2.getNext();
            }
            return null;
        } finally {
            f.unlock();
            f.w();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int d = d(obj);
        a f = f(d);
        f.lock();
        try {
            long a = f.a.o.a();
            f.v(a);
            AtomicReferenceArray atomicReferenceArray = f.f;
            int length = d & (atomicReferenceArray.length() - 1);
            crn crnVar = (crn) atomicReferenceArray.get(length);
            long j = a;
            crn crnVar2 = crnVar;
            while (true) {
                if (crnVar2 == null) {
                    break;
                }
                crn crnVar3 = crnVar;
                Object key = crnVar2.getKey();
                if (crnVar2.l() == d && key != null && f.a.e.c(obj, key)) {
                    long j2 = j;
                    nig g = crnVar2.g();
                    Object obj3 = g.get();
                    if (obj3 == null) {
                        if (g.b()) {
                            f.d++;
                            crn u = f.u(crnVar3, crnVar2, key, obj3, g, 3);
                            int i = f.b - 1;
                            atomicReferenceArray.set(length, u);
                            f.b = i;
                        }
                    } else {
                        f.d++;
                        f.d(g.h(), obj, obj3, 2);
                        f.x(crnVar2, obj2, j2);
                        f.e(crnVar2);
                        f.unlock();
                        f.w();
                        return obj3;
                    }
                } else {
                    long j3 = j;
                    crnVar2 = crnVar2.getNext();
                    crnVar = crnVar3;
                    j = j3;
                }
            }
            return null;
        } finally {
            f.unlock();
            f.w();
        }
    }
}
