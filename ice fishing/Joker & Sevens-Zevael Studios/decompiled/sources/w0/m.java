package w0;

import b0.q0;
import b0.s0;
import java.util.HashMap;
import s.h0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final nd.d f7578a = new nd.d(13);

    /* renamed from: b, reason: collision with root package name */
    public static final a5.c f7579b = new a5.c(19);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f7580c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static k f7581d;

    /* renamed from: e, reason: collision with root package name */
    public static long f7582e;

    /* renamed from: f, reason: collision with root package name */
    public static final s0 f7583f;

    /* renamed from: g, reason: collision with root package name */
    public static final q0 f7584g;

    /* renamed from: h, reason: collision with root package name */
    public static Object f7585h;

    /* renamed from: i, reason: collision with root package name */
    public static Object f7586i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f7587j;

    /* renamed from: k, reason: collision with root package name */
    public static final u0.a f7588k;

    /* JADX WARN: Type inference failed for: r5v1, types: [int[], java.io.Serializable] */
    static {
        k kVar = k.f7570k;
        f7581d = kVar;
        long j3 = 1;
        f7582e = j3 + j3;
        s0 s0Var = new s0();
        s0Var.f890c = new long[16];
        s0Var.f891d = new int[16];
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        s0Var.f892e = iArr;
        f7583f = s0Var;
        q0 q0Var = new q0();
        q0Var.f874b = new int[16];
        q0Var.f875c = new u0.m[16];
        f7584g = q0Var;
        bc.v vVar = bc.v.f1067g;
        f7585h = vVar;
        f7586i = vVar;
        long j6 = f7582e;
        f7582e = j3 + j6;
        b bVar = new b(j6, kVar, null, new nd.d(12));
        f7581d = f7581d.e(bVar.f7560b);
        f7587j = bVar;
        f7588k = new u0.a(0);
    }

    public static final void a() {
        f(f7578a);
    }

    public static final oc.c b(oc.c cVar, oc.c cVar2) {
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new l(cVar, cVar2, 1);
    }

    public static final HashMap c(long j3, c cVar, k kVar) {
        long[] jArr;
        k kVar2;
        long[] jArr2;
        k kVar3;
        int i10;
        x s10;
        long j6 = j3;
        h0 x10 = cVar.x();
        if (x10 != null) {
            k d10 = cVar.d().e(cVar.g()).d(cVar.f7549j);
            Object[] objArr = x10.f6275b;
            long[] jArr3 = x10.f6274a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j10 = jArr3[i11];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j10 & 255) < 128) {
                                v vVar = (v) objArr[(i11 << 3) + i14];
                                x a6 = vVar.a();
                                jArr2 = jArr3;
                                i10 = i12;
                                x s11 = s(a6, j6, kVar);
                                if (s11 == null || (s10 = s(a6, j6, d10)) == null || s11.equals(s10)) {
                                    kVar3 = d10;
                                } else {
                                    kVar3 = d10;
                                    x s12 = s(a6, cVar.g(), cVar.d());
                                    if (s12 == null) {
                                        r();
                                        throw null;
                                    }
                                    x b2 = vVar.b(s10, s11, s12);
                                    if (b2 == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(s11, b2);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                kVar3 = d10;
                                i10 = i12;
                            }
                            j10 >>= i10;
                            i14++;
                            j6 = j3;
                            i12 = i10;
                            jArr3 = jArr2;
                            d10 = kVar3;
                        }
                        jArr = jArr3;
                        kVar2 = d10;
                        if (i13 != i12) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        kVar2 = d10;
                    }
                    if (i11 == length) {
                        return hashMap;
                    }
                    i11++;
                    j6 = j3;
                    jArr3 = jArr;
                    d10 = kVar2;
                }
            }
        }
        return null;
    }

    public static final void d(g gVar) {
        long j3;
        if (f7581d.c(gVar.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(gVar.g());
        sb.append(", disposed=");
        sb.append(gVar.f7561c);
        sb.append(", applied=");
        c cVar = gVar instanceof c ? (c) gVar : null;
        sb.append(cVar != null ? Boolean.valueOf(cVar.f7552m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f7580c) {
            s0 s0Var = f7583f;
            j3 = s0Var.f888a > 0 ? ((long[]) s0Var.f890c)[0] : -1L;
        }
        sb.append(j3);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final k e(k kVar, long j3, long j6) {
        while (pc.j.g(j3, j6) < 0) {
            kVar = kVar.e(j3);
            j3++;
        }
        return kVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final Object f(oc.c cVar) {
        h0 h0Var;
        Object v10;
        b bVar = f7587j;
        synchronized (f7580c) {
            try {
                h0Var = bVar.f7547h;
                if (h0Var != null) {
                    f7588k.addAndGet(1);
                }
                v10 = v(bVar, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (h0Var != null) {
            try {
                ?? r42 = f7585h;
                int size = r42.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((oc.e) r42.get(i10)).invoke(new o0.h(h0Var), bVar);
                }
            } finally {
                f7588k.addAndGet(-1);
            }
        }
        synchronized (f7580c) {
            g();
            if (h0Var != null) {
                Object[] objArr = h0Var.f6275b;
                long[] jArr = h0Var.f6274a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j3 = jArr[i11];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j3) < 128) {
                                    q((v) objArr[(i11 << 3) + i13]);
                                }
                                j3 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        return v10;
    }

    public static final void g() {
        q0 q0Var = f7584g;
        int i10 = q0Var.f873a;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            u0.m mVar = ((u0.m[]) q0Var.f875c)[i11];
            Object obj = mVar != null ? mVar.get() : null;
            if (obj != null && p((v) obj)) {
                if (i12 != i11) {
                    ((u0.m[]) q0Var.f875c)[i12] = mVar;
                    int[] iArr = (int[]) q0Var.f874b;
                    iArr[i12] = iArr[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < i10; i13++) {
            ((u0.m[]) q0Var.f875c)[i13] = null;
            ((int[]) q0Var.f874b)[i13] = 0;
        }
        if (i12 != i10) {
            q0Var.f873a = i12;
        }
    }

    public static final g h(g gVar, oc.c cVar, boolean z10) {
        boolean z11 = gVar instanceof c;
        if (z11 || gVar == null) {
            return new z(z11 ? (c) gVar : null, cVar, null, false, z10);
        }
        return new a0(gVar, cVar, false, z10);
    }

    public static final x i(x xVar) {
        x s10;
        g k3 = k();
        x s11 = s(xVar, k3.g(), k3.d());
        if (s11 != null) {
            return s11;
        }
        synchronized (f7580c) {
            g k10 = k();
            s10 = s(xVar, k10.g(), k10.d());
        }
        if (s10 != null) {
            return s10;
        }
        r();
        throw null;
    }

    public static final x j(x xVar, g gVar) {
        x s10;
        x s11 = s(xVar, gVar.g(), gVar.d());
        if (s11 != null) {
            return s11;
        }
        synchronized (f7580c) {
            s10 = s(xVar, gVar.g(), gVar.d());
        }
        if (s10 != null) {
            return s10;
        }
        r();
        throw null;
    }

    public static final g k() {
        g gVar = (g) f7579b.s();
        return gVar == null ? f7587j : gVar;
    }

    public static final oc.c l(oc.c cVar, oc.c cVar2, boolean z10) {
        if (!z10) {
            cVar2 = null;
        }
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new l(cVar, cVar2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final x m(x xVar, v vVar) {
        x a6 = vVar.a();
        long j3 = f7582e;
        s0 s0Var = f7583f;
        if (s0Var.f888a > 0) {
            j3 = ((long[]) s0Var.f890c)[0];
        }
        long j6 = j3 - 1;
        x xVar2 = null;
        x xVar3 = null;
        while (true) {
            if (a6 == null) {
                break;
            }
            long j10 = a6.f7620a;
            if (j10 == 0) {
                break;
            }
            if (j10 != 0 && pc.j.g(j10, j6) <= 0 && !k.f7570k.c(j10)) {
                if (xVar3 == null) {
                    xVar3 = a6;
                } else if (pc.j.g(a6.f7620a, xVar3.f7620a) >= 0) {
                    xVar2 = xVar3;
                }
            }
            a6 = a6.f7621b;
        }
        if (xVar2 != null) {
            xVar2.f7620a = Long.MAX_VALUE;
            return xVar2;
        }
        x b2 = xVar.b(Long.MAX_VALUE);
        b2.f7621b = vVar.a();
        vVar.c(b2);
        return b2;
    }

    public static final void n(g gVar, v vVar) {
        gVar.t(gVar.h() + 1);
        oc.c i10 = gVar.i();
        if (i10 != null) {
            i10.invoke(vVar);
        }
    }

    public static final x o(x xVar, w wVar, g gVar, x xVar2) {
        x m10;
        if (gVar.f()) {
            gVar.n(wVar);
        }
        long g8 = gVar.g();
        if (xVar2.f7620a == g8) {
            return xVar2;
        }
        synchronized (f7580c) {
            m10 = m(xVar, wVar);
        }
        m10.f7620a = g8;
        if (xVar2.f7620a != 1) {
            gVar.n(wVar);
        }
        return m10;
    }

    public static final boolean p(v vVar) {
        x xVar;
        long j3 = f7582e;
        s0 s0Var = f7583f;
        if (s0Var.f888a > 0) {
            j3 = ((long[]) s0Var.f890c)[0];
        }
        x xVar2 = null;
        x xVar3 = null;
        int i10 = 0;
        for (x a6 = vVar.a(); a6 != null; a6 = a6.f7621b) {
            long j6 = a6.f7620a;
            if (j6 != 0) {
                if (pc.j.g(j6, j3) >= 0) {
                    i10++;
                } else if (xVar2 == null) {
                    i10++;
                    xVar2 = a6;
                } else {
                    if (pc.j.g(a6.f7620a, xVar2.f7620a) < 0) {
                        xVar = xVar2;
                        xVar2 = a6;
                    } else {
                        xVar = a6;
                    }
                    if (xVar3 == null) {
                        xVar3 = vVar.a();
                        x xVar4 = xVar3;
                        while (true) {
                            if (xVar3 == null) {
                                xVar3 = xVar4;
                                break;
                            }
                            if (pc.j.g(xVar3.f7620a, j3) >= 0) {
                                break;
                            }
                            if (pc.j.g(xVar4.f7620a, xVar3.f7620a) < 0) {
                                xVar4 = xVar3;
                            }
                            xVar3 = xVar3.f7621b;
                        }
                    }
                    xVar2.f7620a = 0L;
                    xVar2.a(xVar3);
                    xVar2 = xVar;
                }
            }
        }
        return i10 > 1;
    }

    public static final void q(v vVar) {
        if (p(vVar)) {
            q0 q0Var = f7584g;
            int i10 = q0Var.f873a;
            int identityHashCode = System.identityHashCode(vVar);
            int i11 = -1;
            if (i10 > 0) {
                int i12 = q0Var.f873a - 1;
                int i13 = 0;
                while (true) {
                    if (i13 > i12) {
                        i11 = -(i13 + 1);
                        break;
                    }
                    int i14 = (i13 + i12) >>> 1;
                    int i15 = ((int[]) q0Var.f874b)[i14];
                    if (i15 < identityHashCode) {
                        i13 = i14 + 1;
                    } else if (i15 > identityHashCode) {
                        i12 = i14 - 1;
                    } else {
                        u0.m mVar = ((u0.m[]) q0Var.f875c)[i14];
                        if (vVar != (mVar != null ? mVar.get() : null)) {
                            for (int i16 = i14 - 1; -1 < i16 && ((int[]) q0Var.f874b)[i16] == identityHashCode; i16--) {
                                u0.m mVar2 = ((u0.m[]) q0Var.f875c)[i16];
                                if ((mVar2 != null ? mVar2.get() : null) == vVar) {
                                    i11 = i16;
                                    break;
                                }
                            }
                            i14++;
                            int i17 = q0Var.f873a;
                            while (true) {
                                if (i14 >= i17) {
                                    i11 = -(q0Var.f873a + 1);
                                    break;
                                } else {
                                    if (((int[]) q0Var.f874b)[i14] != identityHashCode) {
                                        i11 = -(i14 + 1);
                                        break;
                                    }
                                    u0.m mVar3 = ((u0.m[]) q0Var.f875c)[i14];
                                    if ((mVar3 != null ? mVar3.get() : null) == vVar) {
                                        break;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                        i11 = i14;
                    }
                }
                if (i11 >= 0) {
                    return;
                }
            }
            int i18 = -(i11 + 1);
            u0.m[] mVarArr = (u0.m[]) q0Var.f875c;
            int length = mVarArr.length;
            if (i10 == length) {
                int i19 = length * 2;
                u0.m[] mVarArr2 = new u0.m[i19];
                int[] iArr = new int[i19];
                int i20 = i18 + 1;
                System.arraycopy(mVarArr, i18, mVarArr2, i20, i10 - i18);
                System.arraycopy((u0.m[]) q0Var.f875c, 0, mVarArr2, 0, i18);
                bc.l.P(i20, i18, i10, (int[]) q0Var.f874b, iArr);
                bc.l.S(0, i18, 6, (int[]) q0Var.f874b, iArr);
                q0Var.f875c = mVarArr2;
                q0Var.f874b = iArr;
            } else {
                int i21 = i18 + 1;
                System.arraycopy(mVarArr, i18, mVarArr, i21, i10 - i18);
                int[] iArr2 = (int[]) q0Var.f874b;
                bc.l.P(i21, i18, i10, iArr2, iArr2);
            }
            ((u0.m[]) q0Var.f875c)[i18] = new u0.m(vVar);
            ((int[]) q0Var.f874b)[i18] = identityHashCode;
            q0Var.f873a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final x s(x xVar, long j3, k kVar) {
        x xVar2 = null;
        while (xVar != null) {
            long j6 = xVar.f7620a;
            if (j6 != 0 && pc.j.g(j6, j3) <= 0 && !kVar.c(j6) && (xVar2 == null || pc.j.g(xVar2.f7620a, xVar.f7620a) < 0)) {
                xVar2 = xVar;
            }
            xVar = xVar.f7621b;
        }
        if (xVar2 != null) {
            return xVar2;
        }
        return null;
    }

    public static final x t(x xVar, v vVar) {
        x s10;
        g k3 = k();
        oc.c e10 = k3.e();
        if (e10 != null) {
            e10.invoke(vVar);
        }
        x s11 = s(xVar, k3.g(), k3.d());
        if (s11 != null) {
            return s11;
        }
        synchronized (f7580c) {
            g k10 = k();
            x a6 = vVar.a();
            pc.j.c(a6, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            s10 = s(a6, k10.g(), k10.d());
            if (s10 == null) {
                r();
                throw null;
            }
        }
        return s10;
    }

    public static final void u(int i10) {
        s0 s0Var = f7583f;
        int i11 = ((int[]) s0Var.f892e)[i10];
        s0Var.h(i11, s0Var.f888a - 1);
        s0Var.f888a--;
        long[] jArr = (long[]) s0Var.f890c;
        long j3 = jArr[i11];
        int i12 = i11;
        while (i12 > 0) {
            int i13 = ((i12 + 1) >> 1) - 1;
            if (pc.j.g(jArr[i13], j3) <= 0) {
                break;
            }
            s0Var.h(i13, i12);
            i12 = i13;
        }
        long[] jArr2 = (long[]) s0Var.f890c;
        int i14 = s0Var.f888a >> 1;
        while (i11 < i14) {
            int i15 = (i11 + 1) << 1;
            int i16 = i15 - 1;
            if (i15 < s0Var.f888a && pc.j.g(jArr2[i15], jArr2[i16]) < 0) {
                if (pc.j.g(jArr2[i15], jArr2[i11]) >= 0) {
                    break;
                }
                s0Var.h(i15, i11);
                i11 = i15;
            } else {
                if (pc.j.g(jArr2[i16], jArr2[i11]) >= 0) {
                    break;
                }
                s0Var.h(i16, i11);
                i11 = i16;
            }
        }
        ((int[]) s0Var.f892e)[i10] = s0Var.f889b;
        s0Var.f889b = i10;
    }

    public static final Object v(b bVar, oc.c cVar) {
        long j3 = bVar.f7560b;
        Object invoke = cVar.invoke(f7581d.b(j3));
        long j6 = f7582e;
        f7582e = 1 + j6;
        k b2 = f7581d.b(j3);
        f7581d = b2;
        bVar.f7560b = j6;
        bVar.f7559a = b2;
        bVar.f7546g = 0;
        bVar.f7547h = null;
        bVar.o();
        f7581d = f7581d.e(j6);
        return invoke;
    }

    public static final x w(x xVar, v vVar, g gVar) {
        x s10;
        if (gVar.f()) {
            gVar.n(vVar);
        }
        long g8 = gVar.g();
        x s11 = s(xVar, g8, gVar.d());
        if (s11 == null) {
            r();
            throw null;
        }
        if (s11.f7620a == gVar.g()) {
            return s11;
        }
        synchronized (f7580c) {
            s10 = s(vVar.a(), g8, gVar.d());
            if (s10 == null) {
                r();
                throw null;
            }
            if (s10.f7620a != g8) {
                x m10 = m(s10, vVar);
                m10.a(s10);
                m10.f7620a = gVar.g();
                s10 = m10;
            }
        }
        if (s11.f7620a != 1) {
            gVar.n(vVar);
        }
        return s10;
    }
}
