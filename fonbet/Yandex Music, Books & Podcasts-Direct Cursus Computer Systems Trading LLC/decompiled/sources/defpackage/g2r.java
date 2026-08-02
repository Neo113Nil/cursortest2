package defpackage;

import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class g2r {
    public static final sfm a = new sfm();
    public static final Object b = new Object();
    public static f2r c;
    public static long d;
    public static final ma e;
    public static final w2r f;
    public static Object g;
    public static Object h;
    public static final emd i;
    public static final du1 j;

    static {
        f2r f2rVar = f2r.e;
        c = f2rVar;
        d = 1 + 1;
        ma maVar = new ma();
        maVar.c = new long[16];
        maVar.d = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        maVar.e = iArr;
        e = maVar;
        w2r w2rVar = new w2r(0, (byte) 0);
        w2rVar.c = new int[16];
        w2rVar.d = new dbv[16];
        f = w2rVar;
        c5b c5bVar = c5b.a;
        g = c5bVar;
        h = c5bVar;
        long j2 = d;
        d = 1 + j2;
        emd emdVar = new emd(j2, f2rVar, null, lhb.H);
        c = c.q(emdVar.b);
        i = emdVar;
        j = new du1(0);
    }

    public static final void a() {
        f(dpo.X);
    }

    public static final Function1 b(Function1 function1, Function1 function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new dmd(function1, function12, 2);
    }

    public static final HashMap c(long j2, ypi ypiVar, f2r f2rVar) {
        long[] jArr;
        f2r f2rVar2;
        long[] jArr2;
        f2r f2rVar3;
        int i2;
        per s;
        long j3 = j2;
        upi x = ypiVar.x();
        if (x != null) {
            f2r o = ypiVar.d().q(ypiVar.g()).o(ypiVar.j);
            Object[] objArr = x.b;
            long[] jArr3 = x.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j4 = jArr3[i3];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j4 & 255) < 128) {
                                mer merVar = (mer) objArr[(i3 << 3) + i6];
                                per g2 = merVar.g();
                                jArr2 = jArr3;
                                i2 = i4;
                                per s2 = s(g2, j3, f2rVar);
                                if (s2 == null || (s = s(g2, j3, o)) == null || s2.equals(s)) {
                                    f2rVar3 = o;
                                } else {
                                    f2rVar3 = o;
                                    per s3 = s(g2, ypiVar.g(), ypiVar.d());
                                    if (s3 == null) {
                                        r();
                                        throw null;
                                    }
                                    per m = merVar.m(s, s2, s3);
                                    if (m == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(s2, m);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                f2rVar3 = o;
                                i2 = i4;
                            }
                            j4 >>= i2;
                            i6++;
                            j3 = j2;
                            i4 = i2;
                            jArr3 = jArr2;
                            o = f2rVar3;
                        }
                        jArr = jArr3;
                        f2rVar2 = o;
                        if (i5 != i4) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        f2rVar2 = o;
                    }
                    if (i3 == length) {
                        return hashMap;
                    }
                    i3++;
                    j3 = j2;
                    jArr3 = jArr;
                    o = f2rVar2;
                }
            }
        }
        return null;
    }

    public static final void d(b2r b2rVar) {
        long j2;
        if (c.m(b2rVar.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(b2rVar.g());
        sb.append(", disposed=");
        sb.append(b2rVar.c);
        sb.append(", applied=");
        ypi ypiVar = b2rVar instanceof ypi ? (ypi) b2rVar : null;
        sb.append(ypiVar != null ? Boolean.valueOf(ypiVar.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (b) {
            ma maVar = e;
            j2 = maVar.a > 0 ? ((long[]) maVar.c)[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final f2r e(f2r f2rVar, long j2, long j3) {
        while (j2 < j3) {
            f2rVar = f2rVar.q(j2);
            j2++;
        }
        return f2rVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    public static final Object f(Function1 function1) {
        upi upiVar;
        Object v;
        emd emdVar = i;
        synchronized (b) {
            try {
                upiVar = emdVar.h;
                if (upiVar != null) {
                    j.addAndGet(1);
                }
                v = v(emdVar, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (upiVar != null) {
            try {
                ?? r4 = g;
                int size = ((Collection) r4).size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((Function2) r4.get(i2)).invoke(new yso(upiVar), emdVar);
                }
            } finally {
                j.addAndGet(-1);
            }
        }
        synchronized (b) {
            g();
            if (upiVar != null) {
                Object[] objArr = upiVar.b;
                long[] jArr = upiVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    q((mer) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return v;
    }

    public static final void g() {
        w2r w2rVar = f;
        int i2 = w2rVar.b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            dbv dbvVar = ((dbv[]) w2rVar.d)[i3];
            Object obj = dbvVar != null ? dbvVar.get() : null;
            if (obj != null && p((mer) obj)) {
                if (i4 != i3) {
                    ((dbv[]) w2rVar.d)[i4] = dbvVar;
                    int[] iArr = (int[]) w2rVar.c;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((dbv[]) w2rVar.d)[i5] = null;
            ((int[]) w2rVar.c)[i5] = 0;
        }
        if (i4 != i2) {
            w2rVar.b = i4;
        }
    }

    public static final b2r h(b2r b2rVar, Function1 function1, boolean z) {
        boolean z2 = b2rVar instanceof ypi;
        if (z2 || b2rVar == null) {
            return new f9t(z2 ? (ypi) b2rVar : null, function1, null, false, z);
        }
        return new g9t(b2rVar, function1, z);
    }

    public static final per i(per perVar) {
        per s;
        b2r k = k();
        per s2 = s(perVar, k.g(), k.d());
        if (s2 != null) {
            return s2;
        }
        synchronized (b) {
            b2r k2 = k();
            s = s(perVar, k2.g(), k2.d());
        }
        if (s != null) {
            return s;
        }
        r();
        throw null;
    }

    public static final per j(per perVar, b2r b2rVar) {
        per s;
        per s2 = s(perVar, b2rVar.g(), b2rVar.d());
        if (s2 != null) {
            return s2;
        }
        synchronized (b) {
            s = s(perVar, b2rVar.g(), b2rVar.d());
        }
        if (s != null) {
            return s;
        }
        r();
        throw null;
    }

    public static final b2r k() {
        b2r b2rVar = (b2r) a.s();
        return b2rVar == null ? i : b2rVar;
    }

    public static final Function1 l(Function1 function1, Function1 function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new dmd(function1, function12, 1);
    }

    public static final per m(per perVar, mer merVar) {
        per g2 = merVar.g();
        long j2 = d;
        ma maVar = e;
        if (maVar.a > 0) {
            j2 = ((long[]) maVar.c)[0];
        }
        long j3 = j2 - 1;
        per perVar2 = null;
        per perVar3 = null;
        while (true) {
            if (g2 == null) {
                break;
            }
            long j4 = g2.a;
            if (j4 == 0) {
                break;
            }
            if (j4 != 0 && j4 <= j3) {
                long j5 = j4 - 0;
                boolean z = true;
                if (j5 < 0 || j5 >= 64 ? j5 < 64 || j5 >= 128 || ((1 << (((int) j5) - 64)) & 0) == 0 : ((1 << ((int) j5)) & 0) == 0) {
                    z = false;
                }
                if (z) {
                    continue;
                } else if (perVar3 == null) {
                    perVar3 = g2;
                } else if (g2.a >= perVar3.a) {
                    perVar2 = perVar3;
                }
            }
            g2 = g2.b;
        }
        perVar2 = g2;
        if (perVar2 != null) {
            perVar2.a = Long.MAX_VALUE;
            return perVar2;
        }
        per b2 = perVar.b(Long.MAX_VALUE);
        b2.b = merVar.g();
        merVar.a(b2);
        return b2;
    }

    public static final void n(b2r b2rVar, mer merVar) {
        b2rVar.t(b2rVar.h() + 1);
        Function1 i2 = b2rVar.i();
        if (i2 != null) {
            i2.invoke(merVar);
        }
    }

    public static final per o(per perVar, ner nerVar, b2r b2rVar, per perVar2) {
        per m;
        if (b2rVar.f()) {
            b2rVar.n(nerVar);
        }
        long g2 = b2rVar.g();
        if (perVar2.a == g2) {
            return perVar2;
        }
        synchronized (b) {
            m = m(perVar, nerVar);
        }
        m.a = g2;
        if (perVar2.a != 1) {
            b2rVar.n(nerVar);
        }
        return m;
    }

    public static final boolean p(mer merVar) {
        per perVar;
        long j2 = d;
        ma maVar = e;
        if (maVar.a > 0) {
            j2 = ((long[]) maVar.c)[0];
        }
        per perVar2 = null;
        per perVar3 = null;
        int i2 = 0;
        for (per g2 = merVar.g(); g2 != null; g2 = g2.b) {
            long j3 = g2.a;
            if (j3 != 0) {
                if (j3 >= j2) {
                    i2++;
                } else if (perVar2 == null) {
                    i2++;
                    perVar2 = g2;
                } else {
                    if (j3 < perVar2.a) {
                        perVar = perVar2;
                        perVar2 = g2;
                    } else {
                        perVar = g2;
                    }
                    if (perVar3 == null) {
                        perVar3 = merVar.g();
                        per perVar4 = perVar3;
                        while (true) {
                            if (perVar3 == null) {
                                perVar3 = perVar4;
                                break;
                            }
                            long j4 = perVar3.a;
                            if (j4 >= j2) {
                                break;
                            }
                            if (perVar4.a < j4) {
                                perVar4 = perVar3;
                            }
                            perVar3 = perVar3.b;
                        }
                    }
                    perVar2.a = 0L;
                    perVar2.a(perVar3);
                    perVar2 = perVar;
                }
            }
        }
        return i2 > 1;
    }

    public static final void q(mer merVar) {
        if (p(merVar)) {
            w2r w2rVar = f;
            int i2 = w2rVar.b;
            int identityHashCode = System.identityHashCode(merVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = w2rVar.b - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) w2rVar.c)[i6];
                    if (i7 < identityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > identityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        dbv dbvVar = ((dbv[]) w2rVar.d)[i6];
                        if (merVar != (dbvVar != null ? dbvVar.get() : null)) {
                            for (int i8 = i6 - 1; -1 < i8 && ((int[]) w2rVar.c)[i8] == identityHashCode; i8--) {
                                dbv dbvVar2 = ((dbv[]) w2rVar.d)[i8];
                                if ((dbvVar2 != null ? dbvVar2.get() : null) == merVar) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = w2rVar.b;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(w2rVar.b + 1);
                                    break;
                                } else {
                                    if (((int[]) w2rVar.c)[i6] != identityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    dbv dbvVar3 = ((dbv[]) w2rVar.d)[i6];
                                    if ((dbvVar3 != null ? dbvVar3.get() : null) == merVar) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                        }
                        i3 = i6;
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            dbv[] dbvVarArr = (dbv[]) w2rVar.d;
            int length = dbvVarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                dbv[] dbvVarArr2 = new dbv[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(dbvVarArr, i10, dbvVarArr2, i12, i2 - i10);
                System.arraycopy((dbv[]) w2rVar.d, 0, dbvVarArr2, 0, i10);
                uz0.e(i12, i10, i2, (int[]) w2rVar.c, iArr);
                uz0.h(0, i10, 6, (int[]) w2rVar.c, iArr);
                w2rVar.d = dbvVarArr2;
                w2rVar.c = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(dbvVarArr, i10, dbvVarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) w2rVar.c;
                uz0.e(i13, i10, i2, iArr2, iArr2);
            }
            ((dbv[]) w2rVar.d)[i10] = new dbv(merVar);
            ((int[]) w2rVar.c)[i10] = identityHashCode;
            w2rVar.b++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final per s(per perVar, long j2, f2r f2rVar) {
        per perVar2 = null;
        while (perVar != null) {
            long j3 = perVar.a;
            if (j3 != 0 && j3 <= j2 && !f2rVar.m(j3) && (perVar2 == null || perVar2.a < perVar.a)) {
                perVar2 = perVar;
            }
            perVar = perVar.b;
        }
        if (perVar2 != null) {
            return perVar2;
        }
        return null;
    }

    public static final per t(per perVar, mer merVar) {
        per s;
        b2r k = k();
        Function1 e2 = k.e();
        if (e2 != null) {
            e2.invoke(merVar);
        }
        per s2 = s(perVar, k.g(), k.d());
        if (s2 != null) {
            return s2;
        }
        synchronized (b) {
            b2r k2 = k();
            per g2 = merVar.g();
            g2.getClass();
            s = s(g2, k2.g(), k2.d());
            if (s == null) {
                r();
                throw null;
            }
        }
        return s;
    }

    public static final void u(int i2) {
        ma maVar = e;
        int i3 = ((int[]) maVar.e)[i2];
        maVar.j(i3, maVar.a - 1);
        maVar.a--;
        long[] jArr = (long[]) maVar.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (jArr[i5] <= j2) {
                break;
            }
            maVar.j(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) maVar.c;
        int i6 = maVar.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < maVar.a) {
                long j3 = jArr2[i7];
                if (j3 < jArr2[i8]) {
                    if (j3 >= jArr2[i3]) {
                        break;
                    }
                    maVar.j(i7, i3);
                    i3 = i7;
                }
            }
            if (jArr2[i8] >= jArr2[i3]) {
                break;
            }
            maVar.j(i8, i3);
            i3 = i8;
        }
        ((int[]) maVar.e)[i2] = maVar.b;
        maVar.b = i2;
    }

    public static final Object v(emd emdVar, Function1 function1) {
        long j2 = emdVar.b;
        Object invoke = function1.invoke(c.g(j2));
        long j3 = d;
        d = 1 + j3;
        f2r g2 = c.g(j2);
        c = g2;
        emdVar.b = j3;
        emdVar.a = g2;
        emdVar.g = 0;
        emdVar.h = null;
        emdVar.o();
        c = c.q(j3);
        return invoke;
    }

    public static final per w(per perVar, mer merVar, b2r b2rVar) {
        per s;
        if (b2rVar.f()) {
            b2rVar.n(merVar);
        }
        long g2 = b2rVar.g();
        per s2 = s(perVar, g2, b2rVar.d());
        if (s2 == null) {
            r();
            throw null;
        }
        if (s2.a == b2rVar.g()) {
            return s2;
        }
        synchronized (b) {
            s = s(merVar.g(), g2, b2rVar.d());
            if (s == null) {
                r();
                throw null;
            }
            if (s.a != g2) {
                per m = m(s, merVar);
                m.a(s);
                m.a = b2rVar.g();
                s = m;
            }
        }
        if (s2.a != 1) {
            b2rVar.n(merVar);
        }
        return s;
    }
}
