package defpackage;

import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.snapshots.a;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes.dex */
public abstract class q2t0 {
    public static final q2m0 a;
    public static final p3t0 b = new p3t0();
    public static final Object c = new Object();
    public static a d;
    public static long e;
    public static final m2t0 f;
    public static final q3t0 g;
    public static List h;
    public static List i;
    public static final akt j;
    public static final AtomicInt k;

    static {
        int i2 = 27;
        a = new q2m0(i2);
        a aVar = a.x;
        d = aVar;
        e = 2L;
        f = new m2t0();
        g = new q3t0();
        EmptyList emptyList = EmptyList.a;
        h = emptyList;
        i = emptyList;
        long j2 = e;
        e = 1 + j2;
        akt aktVar = new akt(j2, aVar, null, new dsg(i2));
        d = d.f(aktVar.b);
        j = aktVar;
        k = new AtomicInt(0);
    }

    public static final void a() {
        e(a);
    }

    public static final HashMap b(long j2, mz40 mz40Var, a aVar) {
        long[] jArr;
        a aVar2;
        long[] jArr2;
        a aVar3;
        int i2;
        int i3;
        j5u0 s;
        iz40 x = mz40Var.x();
        if (x != null) {
            long g2 = mz40Var.g();
            a e2 = mz40Var.d().f(g2).e(mz40Var.j);
            Object[] objArr = x.b;
            long[] jArr3 = x.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                g5u0 g5u0Var = (g5u0) objArr[(i4 << 3) + i7];
                                j5u0 firstStateRecord = g5u0Var.getFirstStateRecord();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                j5u0 s2 = s(firstStateRecord, j2, aVar);
                                if (s2 == null || (s = s(firstStateRecord, g2, e2)) == null || s2.equals(s)) {
                                    aVar3 = e2;
                                } else {
                                    aVar3 = e2;
                                    j5u0 s3 = s(firstStateRecord, g2, mz40Var.d());
                                    if (s3 == null) {
                                        r();
                                        throw null;
                                    }
                                    j5u0 mergeRecords = g5u0Var.mergeRecords(s, s2, s3);
                                    if (mergeRecords == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(s2, mergeRecords);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                aVar3 = e2;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            e2 = aVar3;
                        }
                        jArr = jArr3;
                        aVar2 = e2;
                        if (i6 != i5) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        aVar2 = e2;
                    }
                    if (i4 == length) {
                        return hashMap;
                    }
                    i4++;
                    jArr3 = jArr;
                    e2 = aVar2;
                }
            }
        }
        return null;
    }

    public static final void c(i2t0 i2t0Var) {
        long j2;
        if (d.d(i2t0Var.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(i2t0Var.g());
        sb.append(", disposed=");
        sb.append(i2t0Var.c);
        sb.append(", applied=");
        mz40 mz40Var = i2t0Var instanceof mz40 ? (mz40) i2t0Var : null;
        sb.append(mz40Var != null ? Boolean.valueOf(mz40Var.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            m2t0 m2t0Var = f;
            j2 = m2t0Var.a > 0 ? m2t0Var.b[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final a d(a aVar, long j2, long j3) {
        while (jl40.r(j2, j3) < 0) {
            aVar = aVar.f(j2);
            j2++;
        }
        return aVar;
    }

    public static final Object e(tls tlsVar) {
        iz40 iz40Var;
        Object v;
        akt aktVar = j;
        synchronized (c) {
            try {
                iz40Var = aktVar.h;
                if (iz40Var != null) {
                    k.addAndGet(1);
                }
                v = v(aktVar, tlsVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iz40Var != null) {
            try {
                List list = h;
                androidx.compose.runtime.collection.a aVar = new androidx.compose.runtime.collection.a(iz40Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((wls) list.get(i2)).invoke(aVar, aktVar);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            f();
            if (iz40Var != null) {
                Object[] objArr = iz40Var.b;
                long[] jArr = iz40Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    q((g5u0) objArr[(i3 << 3) + i5]);
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

    public static final void f() {
        q3t0 q3t0Var = g;
        int i2 = q3t0Var.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            ba41 ba41Var = q3t0Var.c[i3];
            Object obj = ba41Var != null ? ba41Var.get() : null;
            if (obj != null && p((g5u0) obj)) {
                if (i4 != i3) {
                    q3t0Var.c[i4] = ba41Var;
                    int[] iArr = q3t0Var.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            q3t0Var.c[i5] = null;
            q3t0Var.b[i5] = 0;
        }
        if (i4 != i2) {
            q3t0Var.a = i4;
        }
    }

    public static final i2t0 g(i2t0 i2t0Var, tls tlsVar, boolean z) {
        boolean z2 = i2t0Var instanceof mz40;
        if (z2 || i2t0Var == null) {
            return new tz01(z2 ? (mz40) i2t0Var : null, tlsVar, null, false, z);
        }
        return new uz01(i2t0Var, tlsVar, false, z);
    }

    public static final j5u0 h(j5u0 j5u0Var) {
        j5u0 s;
        i2t0 j2 = j();
        j5u0 s2 = s(j5u0Var, j2.g(), j2.d());
        if (s2 != null) {
            return s2;
        }
        synchronized (c) {
            i2t0 j3 = j();
            s = s(j5u0Var, j3.g(), j3.d());
        }
        if (s != null) {
            return s;
        }
        r();
        throw null;
    }

    public static final j5u0 i(j5u0 j5u0Var, i2t0 i2t0Var) {
        j5u0 s;
        j5u0 s2 = s(j5u0Var, i2t0Var.g(), i2t0Var.d());
        if (s2 != null) {
            return s2;
        }
        synchronized (c) {
            s = s(j5u0Var, i2t0Var.g(), i2t0Var.d());
        }
        if (s != null) {
            return s;
        }
        r();
        throw null;
    }

    public static final i2t0 j() {
        i2t0 i2t0Var = (i2t0) b.a();
        return i2t0Var == null ? j : i2t0Var;
    }

    public static final tls k(tls tlsVar, tls tlsVar2, boolean z) {
        if (!z) {
            tlsVar2 = null;
        }
        return (tlsVar == null || tlsVar2 == null || tlsVar == tlsVar2) ? tlsVar == null ? tlsVar2 : tlsVar : new p2t0(tlsVar, tlsVar2, 0);
    }

    public static final tls l(tls tlsVar, tls tlsVar2) {
        return (tlsVar == null || tlsVar2 == null || tlsVar == tlsVar2) ? tlsVar == null ? tlsVar2 : tlsVar : new p2t0(tlsVar, tlsVar2, 1);
    }

    public static final j5u0 m(j5u0 j5u0Var, g5u0 g5u0Var) {
        j5u0 firstStateRecord = g5u0Var.getFirstStateRecord();
        long j2 = e;
        m2t0 m2t0Var = f;
        if (m2t0Var.a > 0) {
            j2 = m2t0Var.b[0];
        }
        long j3 = j2 - 1;
        j5u0 j5u0Var2 = null;
        j5u0 j5u0Var3 = null;
        while (true) {
            if (firstStateRecord == null) {
                break;
            }
            long j4 = firstStateRecord.a;
            if (j4 == 0) {
                break;
            }
            if (j4 != 0 && jl40.r(j4, j3) <= 0 && !a.x.d(j4)) {
                if (j5u0Var3 == null) {
                    j5u0Var3 = firstStateRecord;
                } else if (jl40.r(firstStateRecord.a, j5u0Var3.a) >= 0) {
                    j5u0Var2 = j5u0Var3;
                }
            }
            firstStateRecord = firstStateRecord.b;
        }
        j5u0Var2 = firstStateRecord;
        if (j5u0Var2 != null) {
            j5u0Var2.a = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            return j5u0Var2;
        }
        j5u0 c2 = j5u0Var.c(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
        c2.b = g5u0Var.getFirstStateRecord();
        g5u0Var.prependStateRecord(c2);
        return c2;
    }

    public static final void n(i2t0 i2t0Var, g5u0 g5u0Var) {
        i2t0Var.t(i2t0Var.h() + 1);
        tls i2 = i2t0Var.i();
        if (i2 != null) {
            i2.invoke(g5u0Var);
        }
    }

    public static final j5u0 o(j5u0 j5u0Var, h5u0 h5u0Var, i2t0 i2t0Var, j5u0 j5u0Var2) {
        j5u0 m;
        if (i2t0Var.f()) {
            i2t0Var.n(h5u0Var);
        }
        long g2 = i2t0Var.g();
        if (j5u0Var2.a == g2) {
            return j5u0Var2;
        }
        synchronized (c) {
            m = m(j5u0Var, h5u0Var);
        }
        m.a = g2;
        if (j5u0Var2.a != 1) {
            i2t0Var.n(h5u0Var);
        }
        return m;
    }

    public static final boolean p(g5u0 g5u0Var) {
        j5u0 j5u0Var;
        long j2 = e;
        m2t0 m2t0Var = f;
        if (m2t0Var.a > 0) {
            j2 = m2t0Var.b[0];
        }
        j5u0 j5u0Var2 = null;
        j5u0 j5u0Var3 = null;
        int i2 = 0;
        for (j5u0 firstStateRecord = g5u0Var.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.b) {
            long j3 = firstStateRecord.a;
            if (j3 != 0) {
                if (jl40.r(j3, j2) >= 0) {
                    i2++;
                } else if (j5u0Var2 == null) {
                    i2++;
                    j5u0Var2 = firstStateRecord;
                } else {
                    if (jl40.r(firstStateRecord.a, j5u0Var2.a) < 0) {
                        j5u0Var = j5u0Var2;
                        j5u0Var2 = firstStateRecord;
                    } else {
                        j5u0Var = firstStateRecord;
                    }
                    if (j5u0Var3 == null) {
                        j5u0Var3 = g5u0Var.getFirstStateRecord();
                        j5u0 j5u0Var4 = j5u0Var3;
                        while (true) {
                            if (j5u0Var3 == null) {
                                j5u0Var3 = j5u0Var4;
                                break;
                            }
                            if (jl40.r(j5u0Var3.a, j2) >= 0) {
                                break;
                            }
                            if (jl40.r(j5u0Var4.a, j5u0Var3.a) < 0) {
                                j5u0Var4 = j5u0Var3;
                            }
                            j5u0Var3 = j5u0Var3.b;
                        }
                    }
                    j5u0Var2.a = 0L;
                    j5u0Var2.a(j5u0Var3);
                    j5u0Var2 = j5u0Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void q(g5u0 g5u0Var) {
        if (p(g5u0Var)) {
            q3t0 q3t0Var = g;
            int i2 = q3t0Var.a;
            int identityHashCode = System.identityHashCode(g5u0Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = q3t0Var.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = q3t0Var.b[i6];
                    if (i7 < identityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > identityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        ba41 ba41Var = q3t0Var.c[i6];
                        if (g5u0Var != (ba41Var != null ? ba41Var.get() : null)) {
                            for (int i8 = i6 - 1; -1 < i8 && q3t0Var.b[i8] == identityHashCode; i8--) {
                                ba41 ba41Var2 = q3t0Var.c[i8];
                                if ((ba41Var2 != null ? ba41Var2.get() : null) == g5u0Var) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = q3t0Var.a;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(q3t0Var.a + 1);
                                    break;
                                } else {
                                    if (q3t0Var.b[i6] != identityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    ba41 ba41Var3 = q3t0Var.c[i6];
                                    if ((ba41Var3 != null ? ba41Var3.get() : null) == g5u0Var) {
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
            ba41[] ba41VarArr = q3t0Var.c;
            int length = ba41VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                ba41[] ba41VarArr2 = new ba41[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(ba41VarArr, i10, ba41VarArr2, i12, i2 - i10);
                System.arraycopy(q3t0Var.c, 0, ba41VarArr2, 0, i10);
                f73.d(i12, i10, i2, q3t0Var.b, iArr);
                f73.h(0, i10, 6, q3t0Var.b, iArr);
                q3t0Var.c = ba41VarArr2;
                q3t0Var.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(ba41VarArr, i10, ba41VarArr, i13, i2 - i10);
                int[] iArr2 = q3t0Var.b;
                f73.d(i13, i10, i2, iArr2, iArr2);
            }
            q3t0Var.c[i10] = new ba41(g5u0Var);
            q3t0Var.b[i10] = identityHashCode;
            q3t0Var.a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final j5u0 s(j5u0 j5u0Var, long j2, a aVar) {
        j5u0 j5u0Var2 = null;
        while (j5u0Var != null) {
            long j3 = j5u0Var.a;
            if (j3 != 0 && jl40.r(j3, j2) <= 0 && !aVar.d(j3) && (j5u0Var2 == null || jl40.r(j5u0Var2.a, j5u0Var.a) < 0)) {
                j5u0Var2 = j5u0Var;
            }
            j5u0Var = j5u0Var.b;
        }
        if (j5u0Var2 != null) {
            return j5u0Var2;
        }
        return null;
    }

    public static final j5u0 t(j5u0 j5u0Var, g5u0 g5u0Var) {
        j5u0 s;
        i2t0 j2 = j();
        tls e2 = j2.e();
        if (e2 != null) {
            e2.invoke(g5u0Var);
        }
        j5u0 s2 = s(j5u0Var, j2.g(), j2.d());
        if (s2 != null) {
            return s2;
        }
        synchronized (c) {
            i2t0 j3 = j();
            s = s(g5u0Var.getFirstStateRecord(), j3.g(), j3.d());
            if (s == null) {
                r();
                throw null;
            }
        }
        return s;
    }

    public static final void u(int i2) {
        m2t0 m2t0Var = f;
        int i3 = m2t0Var.d[i2];
        m2t0Var.b(i3, m2t0Var.a - 1);
        m2t0Var.a--;
        long[] jArr = m2t0Var.b;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (jl40.r(jArr[i5], j2) <= 0) {
                break;
            }
            m2t0Var.b(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = m2t0Var.b;
        int i6 = m2t0Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < m2t0Var.a && jl40.r(jArr2[i7], jArr2[i8]) < 0) {
                if (jl40.r(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                m2t0Var.b(i7, i3);
                i3 = i7;
            } else {
                if (jl40.r(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                m2t0Var.b(i8, i3);
                i3 = i8;
            }
        }
        m2t0Var.d[i2] = m2t0Var.e;
        m2t0Var.e = i2;
    }

    public static final Object v(akt aktVar, tls tlsVar) {
        long j2 = aktVar.b;
        Object invoke = tlsVar.invoke(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        a b2 = d.b(j2);
        d = b2;
        aktVar.b = j3;
        aktVar.a = b2;
        aktVar.g = 0;
        aktVar.h = null;
        aktVar.o();
        d = d.f(j3);
        return invoke;
    }

    public static final j5u0 w(j5u0 j5u0Var, g5u0 g5u0Var, i2t0 i2t0Var) {
        j5u0 s;
        if (i2t0Var.f()) {
            i2t0Var.n(g5u0Var);
        }
        long g2 = i2t0Var.g();
        j5u0 s2 = s(j5u0Var, g2, i2t0Var.d());
        if (s2 == null) {
            r();
            throw null;
        }
        if (s2.a == i2t0Var.g()) {
            return s2;
        }
        synchronized (c) {
            s = s(g5u0Var.getFirstStateRecord(), g2, i2t0Var.d());
            if (s == null) {
                r();
                throw null;
            }
            if (s.a != g2) {
                j5u0 m = m(s, g5u0Var);
                m.a(s);
                m.a = i2t0Var.g();
                s = m;
            }
        }
        if (s2.a != 1) {
            i2t0Var.n(g5u0Var);
        }
        return s;
    }
}
