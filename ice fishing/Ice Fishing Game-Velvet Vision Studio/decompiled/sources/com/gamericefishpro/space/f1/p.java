package com.gamericefishpro.space.f1;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final com.gamericefishpro.space.d0.p a = new com.gamericefishpro.space.d0.p(25);
    public static final com.gamericefishpro.space.a8.c b = new com.gamericefishpro.space.a8.c(1);
    public static final Object c = new Object();
    public static m d;
    public static long e;
    public static final k f;
    public static final z g;
    public static Object h;
    public static Object i;
    public static final b j;
    public static final com.gamericefishpro.space.b1.a k;

    /* JADX WARN: Type inference failed for: r5v1, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[], java.io.Serializable] */
    static {
        m mVar = m.w;
        d = mVar;
        long j2 = 1;
        e = j2 + j2;
        k kVar = new k();
        kVar.c = new long[16];
        kVar.d = new int[16];
        ?? r5 = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            r5[i2] = i3;
            i2 = i3;
        }
        kVar.e = r5;
        f = kVar;
        z zVar = new z();
        zVar.b = new int[16];
        zVar.c = new com.gamericefishpro.space.b1.q[16];
        g = zVar;
        com.gamericefishpro.space.ph.g0 g0Var = com.gamericefishpro.space.ph.g0.d;
        h = g0Var;
        i = g0Var;
        long j3 = e;
        e = j2 + j3;
        b bVar = new b(j3, mVar, null, new com.gamericefishpro.space.d0.p(24));
        d = d.h(bVar.b);
        j = bVar;
        k = new com.gamericefishpro.space.b1.a(0);
    }

    public static final void a() {
        e(a);
    }

    public static final HashMap b(long j2, c cVar, m mVar) {
        long[] jArr;
        m mVar2;
        long[] jArr2;
        int i2;
        int i3;
        e0 e0VarS;
        com.gamericefishpro.space.t.i0 i0VarX = cVar.x();
        if (i0VarX != null) {
            long jG = cVar.g();
            m mVarF = cVar.d().h(jG).f(cVar.j);
            Object[] objArr = i0VarX.b;
            long[] jArr3 = i0VarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                c0 c0Var = (c0) objArr[(i4 << 3) + i7];
                                e0 e0VarC = c0Var.c();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                e0 e0VarS2 = s(e0VarC, j2, mVar);
                                if (e0VarS2 != null && (e0VarS = s(e0VarC, jG, mVarF)) != null && !e0VarS2.equals(e0VarS)) {
                                    e0 e0VarS3 = s(e0VarC, jG, cVar.d());
                                    if (e0VarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    e0 e0VarB = c0Var.b(e0VarS, e0VarS2, e0VarS3);
                                    if (e0VarB == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(e0VarS2, e0VarB);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            mVarF = mVarF;
                        }
                        jArr = jArr3;
                        mVar2 = mVarF;
                        if (i6 != i5) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        mVar2 = mVarF;
                    }
                    if (i4 == length) {
                        return map;
                    }
                    i4++;
                    jArr3 = jArr;
                    mVarF = mVar2;
                }
            }
        }
        return null;
    }

    public static final void c(g gVar) {
        long j2;
        if (d.d(gVar.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(gVar.g());
        sb.append(", disposed=");
        sb.append(gVar.c);
        sb.append(", applied=");
        c cVar = gVar instanceof c ? (c) gVar : null;
        sb.append(cVar != null ? Boolean.valueOf(cVar.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            k kVar = f;
            j2 = kVar.a > 0 ? ((long[]) kVar.c)[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final m d(m mVar, long j2, long j3) {
        while (Intrinsics.e(j2, j3) < 0) {
            mVar = mVar.h(j2);
            j2 += (long) 1;
        }
        return mVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0090 A[Catch: all -> 0x0086, LOOP:1: B:30:0x0056->B:42:0x0090, LOOP_END, TryCatch #1 {all -> 0x0086, blocks: (B:25:0x0047, B:27:0x004c, B:30:0x0056, B:32:0x0066, B:34:0x0072, B:36:0x007b, B:39:0x0088, B:42:0x0090, B:43:0x0093), top: B:52:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[EDGE_INSN: B:58:0x0093->B:43:0x0093 BREAK  A[LOOP:1: B:30:0x0056->B:42:0x0090], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final Object e(Function1 function1) {
        com.gamericefishpro.space.t.i0 i0Var;
        Object objV;
        b bVar = j;
        synchronized (c) {
            try {
                i0Var = bVar.h;
                if (i0Var != null) {
                    k.addAndGet(1);
                }
                objV = v(bVar, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i0Var != null) {
            try {
                ?? r4 = h;
                int size = r4.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((Function2) r4.get(i2)).invoke(new com.gamericefishpro.space.v0.g(i0Var), bVar);
                }
                k.addAndGet(-1);
            } catch (Throwable th2) {
                k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (c) {
            try {
                f();
                if (i0Var != null) {
                    Object[] objArr = i0Var.b;
                    long[] jArr = i0Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j2 = jArr[i3];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i3 != length) {
                                    break;
                                    break;
                                }
                                i3++;
                            } else {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((255 & j2) < 128) {
                                        q((c0) objArr[(i3 << 3) + i5]);
                                    }
                                    j2 >>= 8;
                                }
                                if (i4 != 8) {
                                    break;
                                }
                                if (i3 != length) {
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                    Unit unit = Unit.a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return objV;
    }

    public static final void f() {
        z zVar = g;
        int i2 = zVar.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            com.gamericefishpro.space.b1.q qVar = ((com.gamericefishpro.space.b1.q[]) zVar.c)[i3];
            Object obj = qVar != null ? qVar.get() : null;
            if (obj != null && p((c0) obj)) {
                if (i4 != i3) {
                    ((com.gamericefishpro.space.b1.q[]) zVar.c)[i4] = qVar;
                    int[] iArr = (int[]) zVar.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((com.gamericefishpro.space.b1.q[]) zVar.c)[i5] = null;
            ((int[]) zVar.b)[i5] = 0;
        }
        if (i4 != i2) {
            zVar.a = i4;
        }
    }

    public static final g g(g gVar, Function1 function1, boolean z) {
        boolean z2 = gVar instanceof c;
        if (z2 || gVar == null) {
            return new h0(z2 ? (c) gVar : null, function1, null, false, z);
        }
        return new i0(gVar, function1, false, z);
    }

    public static final e0 h(e0 e0Var) {
        e0 e0VarS;
        g gVarJ = j();
        e0 e0VarS2 = s(e0Var, gVarJ.g(), gVarJ.d());
        if (e0VarS2 != null) {
            return e0VarS2;
        }
        synchronized (c) {
            g gVarJ2 = j();
            e0VarS = s(e0Var, gVarJ2.g(), gVarJ2.d());
        }
        if (e0VarS != null) {
            return e0VarS;
        }
        r();
        throw null;
    }

    public static final e0 i(e0 e0Var, g gVar) {
        e0 e0VarS;
        e0 e0VarS2 = s(e0Var, gVar.g(), gVar.d());
        if (e0VarS2 != null) {
            return e0VarS2;
        }
        synchronized (c) {
            e0VarS = s(e0Var, gVar.g(), gVar.d());
        }
        if (e0VarS != null) {
            return e0VarS;
        }
        r();
        throw null;
    }

    public static final g j() {
        g gVar = (g) b.get();
        return gVar == null ? j : gVar;
    }

    public static final Function1 k(Function1 function1, Function1 function2, boolean z) {
        if (!z) {
            function2 = null;
        }
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new n(function1, function2, 0);
    }

    public static final Function1 l(Function1 function1, Function1 function2) {
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new n(function1, function2, 1);
    }

    public static final e0 m(e0 e0Var, c0 c0Var) {
        long j2 = e;
        k kVar = f;
        if (kVar.a > 0) {
            j2 = ((long[]) kVar.c)[0];
        }
        long j3 = j2 - ((long) 1);
        e0 e0Var2 = null;
        e0 e0Var3 = null;
        for (e0 e0VarC = c0Var.c(); e0VarC != null; e0VarC = e0VarC.b) {
            long j4 = e0VarC.a;
            if (j4 != 0) {
                if (j4 != 0 && Intrinsics.e(j4, j3) <= 0 && !m.w.d(j4)) {
                    if (e0Var3 != null) {
                        if (Intrinsics.e(e0VarC.a, e0Var3.a) >= 0) {
                            e0Var2 = e0Var3;
                            break;
                        }
                        break;
                    }
                    e0Var3 = e0VarC;
                }
            }
            e0Var2 = e0VarC;
            break;
        }
        if (e0Var2 != null) {
            e0Var2.a = Long.MAX_VALUE;
            return e0Var2;
        }
        e0 e0VarB = e0Var.b(Long.MAX_VALUE);
        e0VarB.b = c0Var.c();
        c0Var.d(e0VarB);
        return e0VarB;
    }

    public static final void n(g gVar, c0 c0Var) {
        gVar.t(gVar.h() + 1);
        Function1 function1I = gVar.i();
        if (function1I != null) {
            function1I.invoke(c0Var);
        }
    }

    public static final e0 o(e0 e0Var, d0 d0Var, g gVar, e0 e0Var2) {
        e0 e0VarM;
        if (gVar.f()) {
            gVar.n(d0Var);
        }
        long jG = gVar.g();
        if (e0Var2.a == jG) {
            return e0Var2;
        }
        synchronized (c) {
            e0VarM = m(e0Var, d0Var);
        }
        e0VarM.a = jG;
        if (e0Var2.a != 1) {
            gVar.n(d0Var);
        }
        return e0VarM;
    }

    public static final boolean p(c0 c0Var) {
        e0 e0Var;
        long j2 = e;
        k kVar = f;
        if (kVar.a > 0) {
            j2 = ((long[]) kVar.c)[0];
        }
        e0 e0Var2 = null;
        e0 e0VarC = null;
        int i2 = 0;
        for (e0 e0VarC2 = c0Var.c(); e0VarC2 != null; e0VarC2 = e0VarC2.b) {
            long j3 = e0VarC2.a;
            if (j3 != 0) {
                if (Intrinsics.e(j3, j2) >= 0) {
                    i2++;
                } else if (e0Var2 == null) {
                    i2++;
                    e0Var2 = e0VarC2;
                } else {
                    if (Intrinsics.e(e0VarC2.a, e0Var2.a) < 0) {
                        e0Var = e0Var2;
                        e0Var2 = e0VarC2;
                    } else {
                        e0Var = e0VarC2;
                    }
                    if (e0VarC == null) {
                        e0VarC = c0Var.c();
                        e0 e0Var3 = e0VarC;
                        while (true) {
                            if (e0VarC == null) {
                                e0VarC = e0Var3;
                                break;
                            }
                            if (Intrinsics.e(e0VarC.a, j2) >= 0) {
                                break;
                            }
                            if (Intrinsics.e(e0Var3.a, e0VarC.a) < 0) {
                                e0Var3 = e0VarC;
                            }
                            e0VarC = e0VarC.b;
                        }
                    }
                    e0Var2.a = 0L;
                    e0Var2.a(e0VarC);
                    e0Var2 = e0Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void q(c0 c0Var) {
        if (p(c0Var)) {
            z zVar = g;
            int i2 = zVar.a;
            int iIdentityHashCode = System.identityHashCode(c0Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = zVar.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) zVar.b)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        com.gamericefishpro.space.b1.q qVar = ((com.gamericefishpro.space.b1.q[]) zVar.c)[i6];
                        if (c0Var == (qVar != null ? qVar.get() : null)) {
                            i3 = i6;
                            break;
                        }
                        int i8 = i6 - 1;
                        while (true) {
                            if (-1 >= i8 || ((int[]) zVar.b)[i8] != iIdentityHashCode) {
                                i6++;
                                int i9 = zVar.a;
                                while (true) {
                                    if (i6 >= i9) {
                                        i3 = -(zVar.a + 1);
                                        break;
                                    }
                                    if (((int[]) zVar.b)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    com.gamericefishpro.space.b1.q qVar2 = ((com.gamericefishpro.space.b1.q[]) zVar.c)[i6];
                                    if ((qVar2 != null ? qVar2.get() : null) == c0Var) {
                                        i3 = i6;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                com.gamericefishpro.space.b1.q qVar3 = ((com.gamericefishpro.space.b1.q[]) zVar.c)[i8];
                                if ((qVar3 != null ? qVar3.get() : null) == c0Var) {
                                    i3 = i8;
                                    break;
                                }
                                i8--;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            com.gamericefishpro.space.b1.q[] qVarArr = (com.gamericefishpro.space.b1.q[]) zVar.c;
            int length = qVarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                com.gamericefishpro.space.b1.q[] qVarArr2 = new com.gamericefishpro.space.b1.q[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(qVarArr, i10, qVarArr2, i12, i2 - i10);
                System.arraycopy((com.gamericefishpro.space.b1.q[]) zVar.c, 0, qVarArr2, 0, i10);
                com.gamericefishpro.space.ph.u.c(i12, i10, i2, (int[]) zVar.b, iArr);
                com.gamericefishpro.space.ph.u.f(0, i10, 6, (int[]) zVar.b, iArr);
                zVar.c = qVarArr2;
                zVar.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(qVarArr, i10, qVarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) zVar.b;
                com.gamericefishpro.space.ph.u.c(i13, i10, i2, iArr2, iArr2);
            }
            ((com.gamericefishpro.space.b1.q[]) zVar.c)[i10] = new com.gamericefishpro.space.b1.q(c0Var);
            ((int[]) zVar.b)[i10] = iIdentityHashCode;
            zVar.a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final e0 s(e0 e0Var, long j2, m mVar) {
        e0 e0Var2 = null;
        while (e0Var != null) {
            long j3 = e0Var.a;
            if (j3 != 0 && Intrinsics.e(j3, j2) <= 0 && !mVar.d(j3) && (e0Var2 == null || Intrinsics.e(e0Var2.a, e0Var.a) < 0)) {
                e0Var2 = e0Var;
            }
            e0Var = e0Var.b;
        }
        if (e0Var2 != null) {
            return e0Var2;
        }
        return null;
    }

    public static final e0 t(e0 e0Var, c0 c0Var) {
        e0 e0VarS;
        g gVarJ = j();
        Function1 function1E = gVarJ.e();
        if (function1E != null) {
            function1E.invoke(c0Var);
        }
        e0 e0VarS2 = s(e0Var, gVarJ.g(), gVarJ.d());
        if (e0VarS2 != null) {
            return e0VarS2;
        }
        synchronized (c) {
            g gVarJ2 = j();
            e0 e0VarC = c0Var.c();
            Intrinsics.c(e0VarC, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            e0VarS = s(e0VarC, gVarJ2.g(), gVarJ2.d());
            if (e0VarS == null) {
                r();
                throw null;
            }
        }
        return e0VarS;
    }

    public static final void u(int i2) {
        k kVar = f;
        int i3 = ((int[]) kVar.e)[i2];
        kVar.h(i3, kVar.a - 1);
        kVar.a--;
        long[] jArr = (long[]) kVar.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (Intrinsics.e(jArr[i5], j2) <= 0) {
                break;
            }
            kVar.h(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) kVar.c;
        int i6 = kVar.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < kVar.a && Intrinsics.e(jArr2[i7], jArr2[i8]) < 0) {
                if (Intrinsics.e(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                kVar.h(i7, i3);
                i3 = i7;
            } else {
                if (Intrinsics.e(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                kVar.h(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) kVar.e)[i2] = kVar.b;
        kVar.b = i2;
    }

    public static final Object v(b bVar, Function1 function1) {
        long j2 = bVar.b;
        Object objInvoke = function1.invoke(d.c(j2));
        long j3 = e;
        e = ((long) 1) + j3;
        m mVarC = d.c(j2);
        d = mVarC;
        bVar.b = j3;
        bVar.a = mVarC;
        bVar.g = 0;
        bVar.h = null;
        bVar.o();
        d = d.h(j3);
        return objInvoke;
    }

    public static final e0 w(e0 e0Var, c0 c0Var, g gVar) {
        e0 e0VarS;
        if (gVar.f()) {
            gVar.n(c0Var);
        }
        long jG = gVar.g();
        e0 e0VarS2 = s(e0Var, jG, gVar.d());
        if (e0VarS2 == null) {
            r();
            throw null;
        }
        if (e0VarS2.a == gVar.g()) {
            return e0VarS2;
        }
        synchronized (c) {
            e0VarS = s(c0Var.c(), jG, gVar.d());
            if (e0VarS == null) {
                r();
                throw null;
            }
            if (e0VarS.a != jG) {
                e0 e0VarM = m(e0VarS, c0Var);
                e0VarM.a(e0VarS);
                e0VarM.a = gVar.g();
                e0VarS = e0VarM;
            }
        }
        if (e0VarS2.a != 1) {
            gVar.n(c0Var);
        }
        return e0VarS;
    }
}
