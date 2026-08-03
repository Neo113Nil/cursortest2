package x1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class f1 extends o0 implements v1.d0, v1.p, n1 {
    public static final f1.e0 P;
    public static final u Q;
    public static final d R;
    public static final d S;
    public s2.c A;
    public s2.l B;
    public v1.f0 D;
    public s.z E;
    public float G;
    public e1.a H;
    public u I;
    public i1.b J;
    public f1.o K;
    public a1.f L;
    public boolean N;
    public l1 O;

    /* renamed from: u, reason: collision with root package name */
    public final g0 f8033u;

    /* renamed from: v, reason: collision with root package name */
    public f1 f8034v;

    /* renamed from: w, reason: collision with root package name */
    public f1 f8035w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8036x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8037y;

    /* renamed from: z, reason: collision with root package name */
    public oc.c f8038z;
    public float C = 0.8f;
    public long F = 0;
    public final c0.h M = new c0.h(this, 2);

    static {
        f1.e0 e0Var = new f1.e0();
        e0Var.f2226h = 1.0f;
        e0Var.f2227i = 1.0f;
        e0Var.f2228j = 1.0f;
        long j3 = f1.v.f2289a;
        e0Var.f2230l = j3;
        e0Var.f2231m = j3;
        e0Var.f2233o = 8.0f;
        e0Var.f2234p = f1.j0.f2266b;
        e0Var.f2235q = f1.d0.f2219a;
        e0Var.f2237s = 9205357640488583168L;
        e0Var.f2238t = v6.a.c();
        e0Var.f2239u = s2.l.f6396g;
        e0Var.f2240v = 3;
        P = e0Var;
        Q = new u();
        R = new d(1);
        S = new d(2);
    }

    public f1(g0 g0Var) {
        this.f8033u = g0Var;
        this.A = g0Var.B;
        this.B = g0Var.C;
    }

    public final long A0() {
        return this.A.L(this.f8033u.D.c());
    }

    public abstract y0.m B0();

    @Override // v1.p
    public final e1.c C(v1.p pVar, boolean z10) {
        f1 f1Var;
        if (!B0().f8456t) {
            u1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!pVar.z()) {
            u1.a.b("LayoutCoordinates " + pVar + " is not attached!");
        }
        v1.c0 c0Var = pVar instanceof v1.c0 ? (v1.c0) pVar : null;
        if (c0Var == null || (f1Var = c0Var.f7072g.f8141u) == null) {
            f1Var = (f1) pVar;
        }
        f1Var.M0();
        f1 x02 = x0(f1Var);
        e1.a aVar = this.H;
        if (aVar == null) {
            aVar = new e1.a();
            this.H = aVar;
        }
        aVar.f1925a = 0.0f;
        aVar.f1926b = 0.0f;
        aVar.f1927c = (int) (pVar.E() >> 32);
        aVar.f1928d = (int) (pVar.E() & 4294967295L);
        while (f1Var != x02) {
            f1Var.S0(aVar, z10, false);
            if (aVar.b()) {
                return e1.c.f1930e;
            }
            f1Var = f1Var.f8035w;
            pc.j.b(f1Var);
        }
        q0(x02, aVar, z10);
        return new e1.c(aVar.f1925a, aVar.f1926b, aVar.f1927c, aVar.f1928d);
    }

    public final y0.m C0(int i10) {
        boolean g8 = g1.g(i10);
        y0.m B0 = B0();
        if (!g8 && (B0 = B0.f8447k) == null) {
            return null;
        }
        for (y0.m D0 = D0(g8); D0 != null && (D0.f8446j & i10) != 0; D0 = D0.f8448l) {
            if ((D0.f8445i & i10) != 0) {
                return D0;
            }
            if (D0 == B0) {
                return null;
            }
        }
        return null;
    }

    public final y0.m D0(boolean z10) {
        y0.m B0;
        c1 c1Var = this.f8033u.I;
        if (c1Var.f7989d == this) {
            return c1Var.f7991f;
        }
        if (!z10) {
            f1 f1Var = this.f8035w;
            if (f1Var != null) {
                return f1Var.B0();
            }
            return null;
        }
        f1 f1Var2 = this.f8035w;
        if (f1Var2 == null || (B0 = f1Var2.B0()) == null) {
            return null;
        }
        return B0.f8448l;
    }

    @Override // v1.p
    public final long E() {
        return this.f7087i;
    }

    public final void E0(y0.m mVar, d dVar, long j3, q qVar, int i10, boolean z10) {
        if (mVar == null) {
            H0(dVar, j3, qVar, i10, z10);
            return;
        }
        int i11 = qVar.f8149i;
        s.a0 a0Var = qVar.f8147g;
        qVar.b(i11 + 1, a0Var.f6220b);
        qVar.f8149i++;
        a0Var.a(mVar);
        qVar.f8148h.a(f.a(-1.0f, z10, false));
        E0(f.e(mVar, dVar.b()), dVar, j3, qVar, i10, z10);
        qVar.f8149i = i11;
    }

    public final void F0(y0.m mVar, d dVar, long j3, q qVar, int i10, boolean z10, float f10) {
        if (mVar == null) {
            H0(dVar, j3, qVar, i10, z10);
            return;
        }
        int i11 = qVar.f8149i;
        s.a0 a0Var = qVar.f8147g;
        qVar.b(i11 + 1, a0Var.f6220b);
        qVar.f8149i++;
        a0Var.a(mVar);
        qVar.f8148h.a(f.a(f10, z10, false));
        P0(f.e(mVar, dVar.b()), dVar, j3, qVar, i10, z10, f10, true);
        qVar.f8149i = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        if (x1.f.h(r18.a(), x1.f.a(r2, r7, false)) > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G0(d dVar, long j3, q qVar, int i10, boolean z10) {
        boolean z11;
        boolean z12;
        y0.m C0 = C0(dVar.b());
        if (!Y0(j3)) {
            if (i10 == 1) {
                float t02 = t0(j3, A0());
                if ((Float.floatToRawIntBits(t02) & Integer.MAX_VALUE) < 2139095040) {
                    if (qVar.f8149i != bc.n.K(qVar)) {
                        if (f.h(qVar.a(), f.a(t02, false, false)) <= 0) {
                            return;
                        }
                    }
                    F0(C0, dVar, j3, qVar, i10, false, t02);
                    return;
                }
                return;
            }
            return;
        }
        if (C0 == null) {
            H0(dVar, j3, qVar, i10, z10);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        if (intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < K() && intBitsToFloat2 < I()) {
            E0(C0, dVar, j3, qVar, i10, z10);
            return;
        }
        float t03 = i10 == 1 ? t0(j3, A0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(t03) & Integer.MAX_VALUE) < 2139095040) {
            if (qVar.f8149i == bc.n.K(qVar)) {
                z11 = z10;
            } else {
                z11 = z10;
            }
            z12 = true;
            P0(C0, dVar, j3, qVar, i10, z11, t03, z12);
        }
        z11 = z10;
        z12 = false;
        P0(C0, dVar, j3, qVar, i10, z11, t03, z12);
    }

    public void H0(d dVar, long j3, q qVar, int i10, boolean z10) {
        f1 f1Var = this.f8034v;
        if (f1Var != null) {
            f1Var.G0(dVar, f1Var.y0(j3), qVar, i10, z10);
        }
    }

    public final void I0() {
        l1 l1Var = this.O;
        if (l1Var != null) {
            l1Var.invalidate();
            return;
        }
        f1 f1Var = this.f8035w;
        if (f1Var != null) {
            f1Var.I0();
        }
    }

    public final boolean J0() {
        if (this.O != null && this.C <= 0.0f) {
            return true;
        }
        f1 f1Var = this.f8035w;
        if (f1Var != null) {
            return f1Var.J0();
        }
        return false;
    }

    public final long K0(v1.p pVar, long j3) {
        f1 f1Var;
        boolean z10 = pVar instanceof v1.c0;
        if (z10) {
            v1.c0 c0Var = (v1.c0) pVar;
            c0Var.f7072g.f8141u.M0();
            return c0Var.c(this, j3 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        v1.c0 c0Var2 = z10 ? (v1.c0) pVar : null;
        if (c0Var2 == null || (f1Var = c0Var2.f7072g.f8141u) == null) {
            pc.j.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            f1Var = (f1) pVar;
        }
        f1Var.M0();
        f1 x02 = x0(f1Var);
        while (f1Var != x02) {
            l1 l1Var = f1Var.O;
            if (l1Var != null) {
                j3 = ((y1.f1) l1Var).c(false, j3);
            }
            j3 = x4.f.Q(j3, f1Var.F);
            f1Var = f1Var.f8035w;
            pc.j.b(f1Var);
        }
        return r0(x02, j3);
    }

    public final long L0(long j3) {
        if (!B0().f8456t) {
            u1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        M0();
        for (f1 f1Var = this; f1Var != null; f1Var = f1Var.f8035w) {
            l1 l1Var = f1Var.O;
            if (l1Var != null) {
                j3 = ((y1.f1) l1Var).c(false, j3);
            }
            j3 = x4.f.Q(j3, f1Var.F);
        }
        return j3;
    }

    public final void M0() {
        this.f8033u.J.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r7v7, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void N0() {
        y0.m mVar;
        boolean g8 = g1.g(128);
        y0.m D0 = D0(g8);
        if (D0 == null || (D0.f8443g.f8446j & 128) == 0) {
            return;
        }
        w0.g d10 = w0.r.d();
        oc.c e10 = d10 != null ? d10.e() : null;
        w0.g g10 = w0.r.g(d10);
        try {
            if (g8) {
                mVar = B0();
            } else {
                mVar = B0().f8447k;
                if (mVar == null) {
                }
            }
            for (y0.m D02 = D0(g8); D02 != null; D02 = D02.f8448l) {
                if ((D02.f8446j & 128) == 0) {
                    break;
                }
                if ((D02.f8445i & 128) != 0) {
                    m mVar2 = D02;
                    ?? r82 = 0;
                    while (mVar2 != 0) {
                        if (mVar2 instanceof v) {
                            ((v) mVar2).s(this.f7087i);
                        } else if ((mVar2.f8445i & 128) != 0 && (mVar2 instanceof m)) {
                            y0.m mVar3 = mVar2.f8110v;
                            int i10 = 0;
                            mVar2 = mVar2;
                            r82 = r82;
                            while (mVar3 != null) {
                                if ((mVar3.f8445i & 128) != 0) {
                                    i10++;
                                    r82 = r82;
                                    if (i10 == 1) {
                                        mVar2 = mVar3;
                                    } else {
                                        if (r82 == 0) {
                                            r82 = new o0.e(new y0.m[16]);
                                        }
                                        if (mVar2 != 0) {
                                            r82.b(mVar2);
                                            mVar2 = 0;
                                        }
                                        r82.b(mVar3);
                                    }
                                }
                                mVar3 = mVar3.f8448l;
                                mVar2 = mVar2;
                                r82 = r82;
                            }
                            if (i10 == 1) {
                            }
                        }
                        mVar2 = f.f(r82);
                    }
                }
                if (D02 == mVar) {
                    break;
                }
            }
        } finally {
            w0.r.j(d10, g10, e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void O0() {
        boolean g8 = g1.g(128);
        y0.m B0 = B0();
        if (!g8 && (B0 = B0.f8447k) == null) {
            return;
        }
        for (y0.m D0 = D0(g8); D0 != null && (D0.f8446j & 128) != 0; D0 = D0.f8448l) {
            if ((D0.f8445i & 128) != 0) {
                m mVar = D0;
                ?? r5 = 0;
                while (mVar != 0) {
                    if (mVar instanceof v) {
                        ((v) mVar).j(this);
                    } else if ((mVar.f8445i & 128) != 0 && (mVar instanceof m)) {
                        y0.m mVar2 = mVar.f8110v;
                        int i10 = 0;
                        mVar = mVar;
                        r5 = r5;
                        while (mVar2 != null) {
                            if ((mVar2.f8445i & 128) != 0) {
                                i10++;
                                r5 = r5;
                                if (i10 == 1) {
                                    mVar = mVar2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new o0.e(new y0.m[16]);
                                    }
                                    if (mVar != 0) {
                                        r5.b(mVar);
                                        mVar = 0;
                                    }
                                    r5.b(mVar2);
                                }
                            }
                            mVar2 = mVar2.f8448l;
                            mVar = mVar;
                            r5 = r5;
                        }
                        if (i10 == 1) {
                        }
                    }
                    mVar = f.f(r5);
                }
            }
            if (D0 == B0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    public final void P0(y0.m mVar, d dVar, long j3, q qVar, int i10, boolean z10, float f10, boolean z11) {
        y0.m f11;
        boolean z12;
        int i11;
        if (mVar == null) {
            H0(dVar, j3, qVar, i10, z10);
            return;
        }
        int i12 = i10;
        if (i12 == 3 || i12 == 4) {
            m mVar2 = mVar;
            o0.e eVar = null;
            while (true) {
                if (mVar2 == 0) {
                    break;
                }
                if (mVar2 instanceof r1) {
                    ((r1) mVar2).getClass();
                    int i13 = x1.f8217b;
                    long j6 = x1.f8216a;
                    int i14 = (int) (j3 >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i14);
                    g0 g0Var = this.f8033u;
                    s2.l lVar = g0Var.C;
                    int i15 = x1.f8217b;
                    long j10 = Long.MIN_VALUE & j6;
                    s2.l lVar2 = s2.l.f6396g;
                    if (intBitsToFloat >= (-((j10 == 0 || lVar == lVar2) ? d.a(0, j6) : d.a(2, j6)))) {
                        if (Float.intBitsToFloat(i14) < K() + ((j10 == 0 || g0Var.C == lVar2) ? d.a(2, j6) : d.a(0, j6))) {
                            int i16 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i16) >= (-d.a(1, j6))) {
                                if (Float.intBitsToFloat(i16) < d.a(3, j6) + I()) {
                                    d1 d1Var = new d1(this, mVar, dVar, j3, qVar, i12, z10, f10, z11);
                                    s.w wVar = qVar.f8148h;
                                    s.a0 a0Var = qVar.f8147g;
                                    if (qVar.f8149i == bc.n.K(qVar)) {
                                        int i17 = qVar.f8149i;
                                        qVar.b(i17 + 1, a0Var.f6220b);
                                        qVar.f8149i++;
                                        a0Var.a(mVar);
                                        wVar.a(f.a(0.0f, z10, true));
                                        d1Var.invoke();
                                        qVar.f8149i = i17;
                                        return;
                                    }
                                    long a6 = qVar.a();
                                    int i18 = qVar.f8149i;
                                    if (!f.p(a6)) {
                                        if (f.l(a6) > 0.0f) {
                                            int i19 = qVar.f8149i;
                                            qVar.b(i19 + 1, a0Var.f6220b);
                                            qVar.f8149i++;
                                            a0Var.a(mVar);
                                            wVar.a(f.a(0.0f, z10, true));
                                            d1Var.invoke();
                                            qVar.f8149i = i19;
                                            return;
                                        }
                                        return;
                                    }
                                    int K = bc.n.K(qVar);
                                    qVar.f8149i = K;
                                    qVar.b(K + 1, a0Var.f6220b);
                                    qVar.f8149i++;
                                    a0Var.a(mVar);
                                    wVar.a(f.a(0.0f, z10, true));
                                    d1Var.invoke();
                                    qVar.f8149i = K;
                                    if (f.l(qVar.a()) < 0.0f) {
                                        qVar.b(i18 + 1, qVar.f8149i + 1);
                                    }
                                    qVar.f8149i = i18;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((mVar2.f8445i & 16) != 0 && (mVar2 instanceof m)) {
                        y0.m mVar3 = mVar2.f8110v;
                        int i20 = 0;
                        f11 = mVar2;
                        eVar = eVar;
                        while (mVar3 != null) {
                            if ((mVar3.f8445i & 16) != 0) {
                                i20++;
                                eVar = eVar;
                                if (i20 == 1) {
                                    f11 = mVar3;
                                } else {
                                    if (eVar == null) {
                                        eVar = new o0.e(new y0.m[16]);
                                    }
                                    if (f11 != null) {
                                        eVar.b(f11);
                                        f11 = null;
                                    }
                                    eVar.b(mVar3);
                                }
                            }
                            mVar3 = mVar3.f8448l;
                            f11 = f11;
                            eVar = eVar;
                        }
                        if (i20 == 1) {
                            i12 = i10;
                            mVar2 = f11;
                            eVar = eVar;
                        }
                    }
                    f11 = f.f(eVar);
                    i12 = i10;
                    mVar2 = f11;
                    eVar = eVar;
                }
            }
        }
        if (z11) {
            F0(mVar, dVar, j3, qVar, i10, z10, f10);
            return;
        }
        switch (dVar.f7996g) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                m mVar4 = mVar;
                ?? r22 = 0;
                while (mVar4 != 0) {
                    if (mVar4 instanceof r1) {
                        if (((r1) mVar4).a0()) {
                            z12 = true;
                            break;
                        }
                    } else if ((mVar4.f8445i & 16) != 0 && (mVar4 instanceof m)) {
                        y0.m mVar5 = mVar4.f8110v;
                        int i21 = 0;
                        mVar4 = mVar4;
                        r22 = r22;
                        while (mVar5 != null) {
                            if ((mVar5.f8445i & 16) != 0) {
                                i21++;
                                r22 = r22;
                                if (i21 == 1) {
                                    mVar4 = mVar5;
                                } else {
                                    if (r22 == 0) {
                                        r22 = new o0.e(new y0.m[16]);
                                    }
                                    if (mVar4 != 0) {
                                        r22.b(mVar4);
                                        mVar4 = 0;
                                    }
                                    r22.b(mVar5);
                                }
                            }
                            mVar5 = mVar5.f8448l;
                            mVar4 = mVar4;
                            r22 = r22;
                        }
                        if (i21 == 1) {
                        }
                    }
                    mVar4 = f.f(r22);
                }
                break;
            default:
                z12 = false;
                break;
        }
        if (!z12) {
            P0(f.e(mVar, dVar.b()), dVar, j3, qVar, i10, z10, f10, false);
            return;
        }
        e1 e1Var = new e1(this, mVar, dVar, j3, qVar, i10, z10, f10);
        s.w wVar2 = qVar.f8148h;
        s.a0 a0Var2 = qVar.f8147g;
        if (qVar.f8149i != bc.n.K(qVar)) {
            long a8 = qVar.a();
            int i22 = qVar.f8149i;
            int K2 = bc.n.K(qVar);
            qVar.f8149i = K2;
            qVar.b(K2 + 1, a0Var2.f6220b);
            qVar.f8149i++;
            a0Var2.a(mVar);
            wVar2.a(f.a(f10, z10, false));
            e1Var.invoke();
            qVar.f8149i = K2;
            long a10 = qVar.a();
            if (qVar.f8149i + 1 >= bc.n.K(qVar) || f.h(a8, a10) <= 0) {
                qVar.b(qVar.f8149i + 1, a0Var2.f6220b);
            } else {
                qVar.b(i22 + 1, f.p(a10) ? qVar.f8149i + 2 : qVar.f8149i + 1);
            }
            qVar.f8149i = i22;
            return;
        }
        int i23 = qVar.f8149i;
        int i24 = i23 + 1;
        qVar.b(i24, a0Var2.f6220b);
        qVar.f8149i++;
        a0Var2.a(mVar);
        wVar2.a(f.a(f10, z10, false));
        e1Var.invoke();
        qVar.f8149i = i23;
        if (i24 == bc.n.K(qVar) || f.p(qVar.a())) {
            int i25 = qVar.f8149i;
            int i26 = i25 + 1;
            a0Var2.j(i26);
            if (i26 < 0 || i26 >= (i11 = wVar2.f6350b)) {
                t.a.d("Index must be between 0 and size");
                throw null;
            }
            long[] jArr = wVar2.f6349a;
            long j11 = jArr[i26];
            if (i26 != i11 - 1) {
                bc.l.Q(jArr, jArr, i26, i25 + 2, i11);
            }
            wVar2.f6350b--;
        }
    }

    public abstract void Q0(f1.o oVar, i1.b bVar);

    public final void R0(long j3, float f10, oc.c cVar) {
        W0(cVar, false);
        boolean a6 = s2.i.a(this.F, j3);
        g0 g0Var = this.f8033u;
        if (!a6) {
            ((y1.r) j0.a(g0Var)).J(-4.0f);
            this.F = j3;
            g0Var.J.f8103p.a0();
            l1 l1Var = this.O;
            if (l1Var != null) {
                ((y1.f1) l1Var).d(j3);
            } else {
                f1 f1Var = this.f8035w;
                if (f1Var != null) {
                    f1Var.I0();
                }
            }
            o0.e w3 = g0Var.w();
            Object[] objArr = w3.f5134g;
            int i10 = w3.f5136i;
            for (int i11 = 0; i11 < i10; i11++) {
                ((g0) objArr[i11]).D();
            }
            o0.n0(this);
            m1 m1Var = g0Var.f8053s;
            if (m1Var != null) {
                ((y1.r) m1Var).x(g0Var);
            }
        }
        this.G = f10;
        if (!this.f8126q) {
            a0(j0());
        }
        if (this == g0Var.I.f7989d) {
            ((y1.r) j0.a(g0Var)).getRectManager().f(g0Var, !g0Var.J.f8103p.f8206q);
        }
    }

    public final void S0(e1.a aVar, boolean z10, boolean z11) {
        l1 l1Var = this.O;
        if (l1Var != null) {
            if (this.f8037y) {
                if (z11) {
                    long A0 = A0();
                    float intBitsToFloat = Float.intBitsToFloat((int) (A0 >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (A0 & 4294967295L)) / 2.0f;
                    long j3 = this.f7087i;
                    aVar.a(-intBitsToFloat, -intBitsToFloat2, ((int) (j3 >> 32)) + intBitsToFloat, ((int) (j3 & 4294967295L)) + intBitsToFloat2);
                } else if (z10) {
                    long j6 = this.f7087i;
                    aVar.a(0.0f, 0.0f, (int) (j6 >> 32), (int) (j6 & 4294967295L));
                }
                if (aVar.b()) {
                    return;
                }
            }
            y1.f1 f1Var = (y1.f1) l1Var;
            float[] b2 = f1Var.b();
            if (!f1Var.f8546y) {
                if (b2 == null) {
                    aVar.f1925a = 0.0f;
                    aVar.f1926b = 0.0f;
                    aVar.f1927c = 0.0f;
                    aVar.f1928d = 0.0f;
                } else {
                    f1.d0.n(b2, aVar);
                }
            }
        }
        long j10 = this.F;
        float f10 = (int) (j10 >> 32);
        aVar.f1925a += f10;
        aVar.f1927c += f10;
        float f11 = (int) (j10 & 4294967295L);
        aVar.f1926b += f11;
        aVar.f1928d += f11;
    }

    public final void T0() {
        if (this.O != null) {
            W0(null, false);
            this.f8033u.S(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [o0.e] */
    public final void U0(v1.f0 f0Var) {
        f1 f1Var;
        v1.f0 f0Var2 = this.D;
        if (f0Var != f0Var2) {
            this.D = f0Var;
            g0 g0Var = this.f8033u;
            int i10 = 0;
            if (f0Var2 == null || f0Var.e() != f0Var2.e() || f0Var.c() != f0Var2.c()) {
                int e10 = f0Var.e();
                int c3 = f0Var.c();
                l1 l1Var = this.O;
                if (l1Var != null) {
                    ((y1.f1) l1Var).e((e10 << 32) | (c3 & 4294967295L));
                } else if (g0Var.H() && (f1Var = this.f8035w) != null) {
                    f1Var.I0();
                }
                Q((c3 & 4294967295L) | (e10 << 32));
                if (this.f8038z != null) {
                    X0(false);
                }
                boolean g8 = g1.g(4);
                y0.m B0 = B0();
                if (g8 || (B0 = B0.f8447k) != null) {
                    for (y0.m D0 = D0(g8); D0 != null && (D0.f8446j & 4) != 0; D0 = D0.f8448l) {
                        if ((D0.f8445i & 4) != 0) {
                            m mVar = D0;
                            ?? r92 = 0;
                            while (mVar != 0) {
                                if (mVar instanceof n) {
                                    ((n) mVar).X();
                                } else if ((mVar.f8445i & 4) != 0 && (mVar instanceof m)) {
                                    y0.m mVar2 = mVar.f8110v;
                                    int i11 = 0;
                                    mVar = mVar;
                                    r92 = r92;
                                    while (mVar2 != null) {
                                        if ((mVar2.f8445i & 4) != 0) {
                                            i11++;
                                            r92 = r92;
                                            if (i11 == 1) {
                                                mVar = mVar2;
                                            } else {
                                                if (r92 == 0) {
                                                    r92 = new o0.e(new y0.m[16]);
                                                }
                                                if (mVar != 0) {
                                                    r92.b(mVar);
                                                    mVar = 0;
                                                }
                                                r92.b(mVar2);
                                            }
                                        }
                                        mVar2 = mVar2.f8448l;
                                        mVar = mVar;
                                        r92 = r92;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                mVar = f.f(r92);
                            }
                        }
                        if (D0 == B0) {
                            break;
                        }
                    }
                }
                m1 m1Var = g0Var.f8053s;
                if (m1Var != null) {
                    ((y1.r) m1Var).x(g0Var);
                }
            }
            s.z zVar = this.E;
            if ((zVar == null || zVar.f6366e == 0) && f0Var.a().isEmpty()) {
                return;
            }
            s.z zVar2 = this.E;
            Map a6 = f0Var.a();
            if (zVar2 != null && zVar2.f6366e == a6.size()) {
                Object[] objArr = zVar2.f6363b;
                int[] iArr = zVar2.f6364c;
                long[] jArr = zVar2.f6362a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i12 = 0;
                loop0: while (true) {
                    long j3 = jArr[i12];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = i10; i14 < i13; i14++) {
                            if ((255 & j3) < 128) {
                                int i15 = (i12 << 3) + i14;
                                Object obj = objArr[i15];
                                int i16 = iArr[i15];
                                Integer num = (Integer) a6.get((v1.k) obj);
                                if (num == null || num.intValue() != i16) {
                                    break loop0;
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i13 != 8) {
                            return;
                        }
                    }
                    if (i12 == length) {
                        return;
                    }
                    i12++;
                    i10 = 0;
                }
            }
            g0Var.J.f8103p.C.f();
            s.z zVar3 = this.E;
            if (zVar3 == null) {
                s.z zVar4 = s.k0.f6300a;
                zVar3 = new s.z();
                this.E = zVar3;
            }
            zVar3.a();
            for (Map.Entry entry : f0Var.a().entrySet()) {
                zVar3.h(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final e1.c V0() {
        if (B0().f8456t) {
            v1.p g8 = v1.p0.g(this);
            e1.a aVar = this.H;
            if (aVar == null) {
                aVar = new e1.a();
                this.H = aVar;
            }
            long s02 = s0(A0());
            int i10 = (int) (s02 >> 32);
            aVar.f1925a = -Float.intBitsToFloat(i10);
            int i11 = (int) (s02 & 4294967295L);
            aVar.f1926b = -Float.intBitsToFloat(i11);
            aVar.f1927c = Float.intBitsToFloat(i10) + K();
            aVar.f1928d = Float.intBitsToFloat(i11) + I();
            f1 f1Var = this;
            while (f1Var != g8) {
                f1Var.S0(aVar, false, true);
                if (!aVar.b()) {
                    f1Var = f1Var.f8035w;
                    pc.j.b(f1Var);
                }
            }
            return new e1.c(aVar.f1925a, aVar.f1926b, aVar.f1927c, aVar.f1928d);
        }
        return e1.c.f1930e;
    }

    public final void W0(oc.c cVar, boolean z10) {
        m1 m1Var;
        o0.e eVar;
        Reference poll;
        a1.f fVar;
        o0.e eVar2;
        Reference poll2;
        Object obj;
        g0 g0Var = this.f8033u;
        boolean z11 = (!z10 && this.f8038z == cVar && pc.j.a(this.A, g0Var.B) && this.B == g0Var.C) ? false : true;
        this.A = g0Var.B;
        this.B = g0Var.C;
        boolean G = g0Var.G();
        c0.h hVar = this.M;
        if (!G || cVar == null) {
            this.f8038z = null;
            l1 l1Var = this.O;
            if (l1Var != null) {
                y1.f1 f1Var = (y1.f1) l1Var;
                y1.r rVar = f1Var.f8530i;
                f1Var.f8531j = null;
                f1Var.f8532k = null;
                f1Var.f8534m = true;
                if (f1Var.f8537p) {
                    f1Var.f8537p = false;
                    rVar.v(f1Var, false);
                }
                f1.u uVar = f1Var.f8529h;
                if (uVar != null) {
                    uVar.a(f1Var.f8528g);
                    x4.e eVar3 = rVar.f8643y0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) eVar3.f8295h;
                        eVar = (o0.e) eVar3.f8294g;
                        poll = referenceQueue.poll();
                        if (poll != null) {
                            eVar.j(poll);
                        }
                    } while (poll != null);
                    eVar.b(new WeakReference(f1Var, (ReferenceQueue) eVar3.f8295h));
                    rVar.D.remove(f1Var);
                }
                g0Var.M = true;
                hVar.invoke();
                if (B0().f8456t && g0Var.H() && (m1Var = g0Var.f8053s) != null) {
                    ((y1.r) m1Var).x(g0Var);
                }
            }
            this.O = null;
            this.N = false;
            return;
        }
        this.f8038z = cVar;
        if (this.O != null) {
            if (z11 && X0(true)) {
                ((y1.r) j0.a(g0Var)).getRectManager().e(g0Var);
                return;
            }
            return;
        }
        m1 a6 = j0.a(g0Var);
        a1.f fVar2 = this.L;
        if (fVar2 == null) {
            a1.f fVar3 = new a1.f(11, this, new c0.h(this, 1));
            this.L = fVar3;
            fVar = fVar3;
        } else {
            fVar = fVar2;
        }
        y1.r rVar2 = (y1.r) a6;
        x4.e eVar4 = rVar2.f8643y0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) eVar4.f8295h;
            eVar2 = (o0.e) eVar4.f8294g;
            poll2 = referenceQueue2.poll();
            if (poll2 != null) {
                eVar2.j(poll2);
            }
        } while (poll2 != null);
        while (true) {
            int i10 = eVar2.f5136i;
            if (i10 == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) eVar2.k(i10 - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        l1 l1Var2 = (l1) obj;
        if (l1Var2 != null) {
            y1.f1 f1Var2 = (y1.f1) l1Var2;
            f1.u uVar2 = f1Var2.f8529h;
            if (uVar2 == null) {
                throw a4.d.e("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!f1Var2.f8528g.f3029s) {
                u1.a.a("layer should have been released before reuse");
            }
            f1Var2.f8528g = uVar2.b();
            f1Var2.f8534m = false;
            f1Var2.f8531j = fVar;
            f1Var2.f8532k = hVar;
            f1Var2.f8544w = false;
            f1Var2.f8545x = false;
            f1Var2.f8546y = true;
            f1.d0.o(f1Var2.f8535n);
            float[] fArr = f1Var2.f8536o;
            if (fArr != null) {
                f1.d0.o(fArr);
            }
            f1Var2.f8542u = f1.j0.f2266b;
            f1Var2.f8547z = false;
            long j3 = Integer.MAX_VALUE;
            f1Var2.f8533l = (j3 & 4294967295L) | (j3 << 32);
            f1Var2.f8543v = null;
            f1Var2.f8541t = 0;
        } else {
            l1Var2 = new y1.f1(rVar2.getGraphicsContext().b(), rVar2.getGraphicsContext(), rVar2, fVar, hVar);
        }
        y1.f1 f1Var3 = (y1.f1) l1Var2;
        f1Var3.e(this.f7087i);
        f1Var3.d(this.F);
        this.O = l1Var2;
        X0(true);
        g0Var.M = true;
        hVar.invoke();
    }

    public final boolean X0(boolean z10) {
        g0 g0Var;
        boolean z11;
        m1 m1Var;
        oc.a aVar;
        oc.a aVar2;
        l1 l1Var = this.O;
        if (l1Var == null) {
            if (this.f8038z == null) {
                return false;
            }
            u1.a.b("null layer with a non-null layerBlock");
            return false;
        }
        oc.c cVar = this.f8038z;
        if (cVar == null) {
            throw a4.d.e("updateLayerParameters requires a non-null layerBlock");
        }
        f1.e0 e0Var = P;
        e0Var.g(1.0f);
        e0Var.h(1.0f);
        e0Var.a(1.0f);
        e0Var.i(0.0f);
        long j3 = f1.v.f2289a;
        e0Var.b(j3);
        e0Var.k(j3);
        e0Var.f(0.0f);
        if (e0Var.f2233o != 8.0f) {
            e0Var.f2225g |= 2048;
            e0Var.f2233o = 8.0f;
        }
        long j6 = f1.j0.f2266b;
        e0Var.n(j6);
        e0Var.j(f1.d0.f2219a);
        e0Var.e(false);
        if (e0Var.f2240v != 3) {
            e0Var.f2225g |= 524288;
            e0Var.f2240v = 3;
        }
        e0Var.f2237s = 9205357640488583168L;
        e0Var.f2241w = null;
        e0Var.f2225g = 0;
        g0 g0Var2 = this.f8033u;
        e0Var.f2238t = g0Var2.B;
        e0Var.f2239u = g0Var2.C;
        e0Var.f2237s = i7.b.F(this.f7087i);
        ((y1.r) j0.a(g0Var2)).getSnapshotObserver().a(this, e.f8009k, new b0.p0(22, cVar));
        u uVar = this.I;
        if (uVar == null) {
            uVar = new u();
            this.I = uVar;
        }
        u uVar2 = Q;
        uVar2.getClass();
        uVar2.f8181a = uVar.f8181a;
        uVar2.f8182b = uVar.f8182b;
        uVar2.f8183c = uVar.f8183c;
        uVar2.f8184d = uVar.f8184d;
        uVar2.f8185e = uVar.f8185e;
        float f10 = e0Var.f2226h;
        uVar.f8181a = f10;
        uVar.f8182b = e0Var.f2227i;
        uVar.f8183c = e0Var.f2232n;
        uVar.f8184d = e0Var.f2233o;
        long j10 = e0Var.f2234p;
        uVar.f8185e = j10;
        y1.f1 f1Var = (y1.f1) l1Var;
        y1.r rVar = f1Var.f8530i;
        int i10 = e0Var.f2225g | f1Var.f8541t;
        f1Var.f8539r = e0Var.f2239u;
        f1Var.f8538q = e0Var.f2238t;
        int i11 = i10 & 4096;
        if (i11 != 0) {
            f1Var.f8542u = j10;
        }
        if ((i10 & 1) != 0) {
            i1.d dVar = f1Var.f8528g.f3011a;
            if (dVar.d() != f10) {
                dVar.n(f10);
            }
        }
        if ((i10 & 2) != 0) {
            i1.b bVar = f1Var.f8528g;
            float f11 = e0Var.f2227i;
            i1.d dVar2 = bVar.f3011a;
            if (dVar2.H() != f11) {
                dVar2.z(f11);
            }
        }
        if ((i10 & 4) != 0) {
            i1.b bVar2 = f1Var.f8528g;
            float f12 = e0Var.f2228j;
            i1.d dVar3 = bVar2.f3011a;
            if (dVar3.a() != f12) {
                dVar3.c(f12);
            }
        }
        if ((i10 & 8) != 0) {
            i1.d dVar4 = f1Var.f8528g.f3011a;
            if (dVar4.r() != 0.0f) {
                dVar4.s();
            }
        }
        if ((i10 & 16) != 0) {
            i1.d dVar5 = f1Var.f8528g.f3011a;
            if (dVar5.f() != 0.0f) {
                dVar5.g();
            }
        }
        if ((i10 & 32) != 0) {
            i1.b bVar3 = f1Var.f8528g;
            float f13 = e0Var.f2229k;
            i1.d dVar6 = bVar3.f3011a;
            if (dVar6.E() != f13) {
                dVar6.e(f13);
                bVar3.f3017g = true;
                bVar3.a();
            }
            if (e0Var.f2229k > 0.0f && !f1Var.f8547z && (aVar2 = f1Var.f8532k) != null) {
                aVar2.invoke();
            }
        }
        if ((i10 & 64) != 0) {
            i1.b bVar4 = f1Var.f8528g;
            long j11 = e0Var.f2230l;
            i1.d dVar7 = bVar4.f3011a;
            g0Var = g0Var2;
            if (!f1.q.c(j11, dVar7.M())) {
                dVar7.k(j11);
            }
        } else {
            g0Var = g0Var2;
        }
        if ((i10 & 128) != 0) {
            i1.b bVar5 = f1Var.f8528g;
            long j12 = e0Var.f2231m;
            i1.d dVar8 = bVar5.f3011a;
            if (!f1.q.c(j12, dVar8.j())) {
                dVar8.y(j12);
            }
        }
        if ((i10 & 1024) != 0) {
            i1.b bVar6 = f1Var.f8528g;
            float f14 = e0Var.f2232n;
            i1.d dVar9 = bVar6.f3011a;
            if (dVar9.I() != f14) {
                dVar9.h(f14);
            }
        }
        if ((i10 & 256) != 0) {
            i1.d dVar10 = f1Var.f8528g.f3011a;
            if (dVar10.v() != 0.0f) {
                dVar10.b();
            }
        }
        if ((i10 & 512) != 0) {
            i1.d dVar11 = f1Var.f8528g.f3011a;
            if (dVar11.C() != 0.0f) {
                dVar11.i();
            }
        }
        if ((i10 & 2048) != 0) {
            i1.b bVar7 = f1Var.f8528g;
            float f15 = e0Var.f2233o;
            i1.d dVar12 = bVar7.f3011a;
            if (dVar12.p() != f15) {
                dVar12.D(f15);
            }
        }
        if (i11 != 0) {
            if (f1.j0.a(f1Var.f8542u, j6)) {
                i1.b bVar8 = f1Var.f8528g;
                if (!e1.b.b(bVar8.f3032v, 9205357640488583168L)) {
                    bVar8.f3032v = 9205357640488583168L;
                    bVar8.f3011a.L(9205357640488583168L);
                }
            } else {
                i1.b bVar9 = f1Var.f8528g;
                long floatToRawIntBits = (Float.floatToRawIntBits(f1.j0.c(f1Var.f8542u) * ((int) (f1Var.f8533l & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(f1.j0.b(f1Var.f8542u) * ((int) (f1Var.f8533l >> 32))) << 32);
                if (!e1.b.b(bVar9.f3032v, floatToRawIntBits)) {
                    bVar9.f3032v = floatToRawIntBits;
                    bVar9.f3011a.L(floatToRawIntBits);
                }
            }
        }
        if ((i10 & 16384) != 0) {
            i1.b bVar10 = f1Var.f8528g;
            boolean z12 = e0Var.f2236r;
            if (bVar10.f3033w != z12) {
                bVar10.f3033w = z12;
                bVar10.f3017g = true;
                bVar10.a();
            }
        }
        if ((131072 & i10) != 0) {
            i1.d dVar13 = f1Var.f8528g.f3011a;
        }
        if ((262144 & i10) != 0) {
            i1.d dVar14 = f1Var.f8528g.f3011a;
            if (!pc.j.a(dVar14.w(), null)) {
                dVar14.m();
            }
        }
        if ((i10 & 524288) != 0) {
            i1.b bVar11 = f1Var.f8528g;
            int i12 = e0Var.f2240v;
            i1.d dVar15 = bVar11.f3011a;
            if (dVar15.K() != i12) {
                dVar15.o(i12);
            }
        }
        if ((32768 & i10) != 0) {
            i1.d dVar16 = f1Var.f8528g.f3011a;
            if (dVar16.u() != 0) {
                dVar16.x(0);
            }
        }
        if ((i10 & 7963) != 0) {
            f1Var.f8544w = true;
            f1Var.f8545x = true;
        }
        if (pc.j.a(f1Var.f8543v, e0Var.f2241w)) {
            z11 = false;
        } else {
            f1.b0 b0Var = e0Var.f2241w;
            f1Var.f8543v = b0Var;
            if (b0Var != null) {
                i1.b bVar12 = f1Var.f8528g;
                if (b0Var instanceof f1.z) {
                    e1.c cVar2 = ((f1.z) b0Var).f2292a;
                    float f16 = cVar2.f1931a;
                    float f17 = cVar2.f1932b;
                    bVar12.f((Float.floatToRawIntBits(f17) & 4294967295L) | (Float.floatToRawIntBits(f16) << 32), (Float.floatToRawIntBits(cVar2.f1933c - f16) << 32) | (Float.floatToRawIntBits(cVar2.f1934d - f17) & 4294967295L), 0.0f);
                } else if (b0Var instanceof f1.y) {
                    f1.i iVar = ((f1.y) b0Var).f2291a;
                    bVar12.f3021k = null;
                    bVar12.f3019i = 9205357640488583168L;
                    bVar12.f3018h = 0L;
                    bVar12.f3020j = 0.0f;
                    bVar12.f3017g = true;
                    bVar12.f3024n = false;
                    bVar12.f3022l = iVar;
                    bVar12.a();
                } else {
                    if (!(b0Var instanceof f1.a0)) {
                        throw new ac.d();
                    }
                    f1.a0 a0Var = (f1.a0) b0Var;
                    f1.i iVar2 = a0Var.f2213b;
                    if (iVar2 != null) {
                        bVar12.f3021k = null;
                        bVar12.f3019i = 9205357640488583168L;
                        bVar12.f3018h = 0L;
                        bVar12.f3020j = 0.0f;
                        bVar12.f3017g = true;
                        bVar12.f3024n = false;
                        bVar12.f3022l = iVar2;
                        bVar12.a();
                    } else {
                        bVar12.f((Float.floatToRawIntBits(r7.f1936b) & 4294967295L) | (Float.floatToRawIntBits(r7.f1935a) << 32), (Float.floatToRawIntBits(r7.b()) << 32) | (Float.floatToRawIntBits(r7.a()) & 4294967295L), Float.intBitsToFloat((int) (a0Var.f2212a.f1942h >> 32)));
                    }
                }
                if ((b0Var instanceof f1.y) && Build.VERSION.SDK_INT < 33 && (aVar = f1Var.f8532k) != null) {
                    aVar.invoke();
                }
            }
            z11 = true;
        }
        f1Var.f8541t = e0Var.f2225g;
        if (i10 != 0 || z11) {
            ViewParent parent = rVar.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(rVar, rVar);
            }
            if (rVar.f8616l) {
                rVar.J(0.0f);
            }
        }
        boolean z13 = this.f8037y;
        this.f8037y = e0Var.f2236r;
        this.C = e0Var.f2228j;
        boolean z14 = uVar2.f8181a == uVar.f8181a && uVar2.f8182b == uVar.f8182b && uVar2.f8183c == uVar.f8183c && uVar2.f8184d == uVar.f8184d && f1.j0.a(uVar2.f8185e, uVar.f8185e);
        boolean z15 = !z14;
        if (z10 && ((!z14 || z13 != this.f8037y) && (m1Var = g0Var.f8053s) != null)) {
            ((y1.r) m1Var).x(g0Var);
        }
        return z15;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y0(long j3) {
        boolean z10;
        boolean z11;
        boolean z12;
        if ((((9187343241974906880L ^ (j3 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        l1 l1Var = this.O;
        if (l1Var == null || !this.f8037y) {
            return true;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        i1.b bVar = ((y1.f1) l1Var).f8528g;
        if (bVar.f3033w) {
            f1.b0 d10 = bVar.d();
            if (!(d10 instanceof f1.z)) {
                if (d10 instanceof f1.a0) {
                    e1.d dVar = ((f1.a0) d10).f2212a;
                    float f10 = dVar.f1935a;
                    long j6 = dVar.f1940f;
                    long j10 = dVar.f1942h;
                    long j11 = dVar.f1941g;
                    z10 = false;
                    float f11 = dVar.f1938d;
                    z11 = true;
                    float f12 = dVar.f1936b;
                    float f13 = dVar.f1937c;
                    long j12 = dVar.f1939e;
                    if (intBitsToFloat >= f10 && intBitsToFloat < f13 && intBitsToFloat2 >= f12 && intBitsToFloat2 < f11) {
                        int i10 = (int) (j12 >> 32);
                        float intBitsToFloat3 = Float.intBitsToFloat(i10);
                        int i11 = (int) (j6 >> 32);
                        if (Float.intBitsToFloat(i11) + intBitsToFloat3 <= dVar.b()) {
                            int i12 = (int) (j10 >> 32);
                            float intBitsToFloat4 = Float.intBitsToFloat(i12);
                            int i13 = (int) (j11 >> 32);
                            if (Float.intBitsToFloat(i13) + intBitsToFloat4 <= dVar.b()) {
                                int i14 = (int) (j12 & 4294967295L);
                                int i15 = (int) (j10 & 4294967295L);
                                if (Float.intBitsToFloat(i15) + Float.intBitsToFloat(i14) <= dVar.a()) {
                                    int i16 = (int) (j6 & 4294967295L);
                                    int i17 = (int) (j11 & 4294967295L);
                                    if (Float.intBitsToFloat(i17) + Float.intBitsToFloat(i16) <= dVar.a()) {
                                        float intBitsToFloat5 = Float.intBitsToFloat(i10) + f10;
                                        float intBitsToFloat6 = Float.intBitsToFloat(i14) + f12;
                                        float intBitsToFloat7 = f13 - Float.intBitsToFloat(i11);
                                        float intBitsToFloat8 = Float.intBitsToFloat(i16) + f12;
                                        float intBitsToFloat9 = f13 - Float.intBitsToFloat(i13);
                                        float intBitsToFloat10 = f11 - Float.intBitsToFloat(i17);
                                        float intBitsToFloat11 = f11 - Float.intBitsToFloat(i15);
                                        float intBitsToFloat12 = Float.intBitsToFloat(i12) + f10;
                                        if (intBitsToFloat < intBitsToFloat5 && intBitsToFloat2 < intBitsToFloat6) {
                                            z12 = y1.e0.t(intBitsToFloat, intBitsToFloat2, intBitsToFloat5, intBitsToFloat6, dVar.f1939e);
                                        } else if (intBitsToFloat < intBitsToFloat12 && intBitsToFloat2 > intBitsToFloat11) {
                                            z12 = y1.e0.t(intBitsToFloat, intBitsToFloat2, intBitsToFloat12, intBitsToFloat11, dVar.f1942h);
                                        } else if (intBitsToFloat <= intBitsToFloat7 || intBitsToFloat2 >= intBitsToFloat8) {
                                            if (intBitsToFloat > intBitsToFloat9 && intBitsToFloat2 > intBitsToFloat10) {
                                                z12 = y1.e0.t(intBitsToFloat, intBitsToFloat2, intBitsToFloat9, intBitsToFloat10, dVar.f1941g);
                                            }
                                            z12 = z11;
                                        } else {
                                            z12 = y1.e0.t(intBitsToFloat, intBitsToFloat2, intBitsToFloat7, intBitsToFloat8, dVar.f1940f);
                                        }
                                    }
                                }
                            }
                        }
                        f1.i a6 = f1.k.a();
                        f1.i.a(a6, dVar);
                        z12 = y1.e0.s(intBitsToFloat, intBitsToFloat2, a6);
                    }
                } else {
                    z10 = false;
                    z11 = true;
                    if (!(d10 instanceof f1.y)) {
                        throw new ac.d();
                    }
                    z12 = y1.e0.s(intBitsToFloat, intBitsToFloat2, ((f1.y) d10).f2291a);
                }
                return z12 ? z11 : z10;
            }
            e1.c cVar = ((f1.z) d10).f2292a;
            if (cVar.f1931a > intBitsToFloat || intBitsToFloat >= cVar.f1933c || cVar.f1932b > intBitsToFloat2 || intBitsToFloat2 >= cVar.f1934d) {
                z10 = false;
                z11 = true;
            }
            z12 = z10;
            if (z12) {
            }
        }
        z10 = false;
        z11 = true;
        z12 = z11;
        if (z12) {
        }
    }

    @Override // v1.p
    public final long b(long j3) {
        if (!B0().f8456t) {
            u1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((y1.r) j0.a(this.f8033u)).s(L0(j3));
    }

    @Override // s2.c
    public final float c() {
        return this.f8033u.B.c();
    }

    @Override // v1.p
    public final long f(long j3) {
        long L0 = L0(j3);
        y1.r rVar = (y1.r) j0.a(this.f8033u);
        rVar.B();
        return f1.d0.m(rVar.W, L0);
    }

    @Override // x1.o0
    public final o0 f0() {
        return this.f8034v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // v1.j0, v1.d0
    public final Object g() {
        g0 g0Var = this.f8033u;
        if (!g0Var.I.d(64)) {
            return null;
        }
        B0();
        Object obj = null;
        for (y0.m mVar = g0Var.I.f7990e; mVar != null; mVar = mVar.f8447k) {
            if ((mVar.f8445i & 64) != 0) {
                m mVar2 = mVar;
                ?? r5 = 0;
                while (mVar2 != 0) {
                    if (mVar2 instanceof p1) {
                        obj = ((p1) mVar2).W(obj);
                    } else if ((mVar2.f8445i & 64) != 0 && (mVar2 instanceof m)) {
                        y0.m mVar3 = mVar2.f8110v;
                        int i10 = 0;
                        mVar2 = mVar2;
                        r5 = r5;
                        while (mVar3 != null) {
                            if ((mVar3.f8445i & 64) != 0) {
                                i10++;
                                r5 = r5;
                                if (i10 == 1) {
                                    mVar2 = mVar3;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new o0.e(new y0.m[16]);
                                    }
                                    if (mVar2 != 0) {
                                        r5.b(mVar2);
                                        mVar2 = 0;
                                    }
                                    r5.b(mVar3);
                                }
                            }
                            mVar3 = mVar3.f8448l;
                            mVar2 = mVar2;
                            r5 = r5;
                        }
                        if (i10 == 1) {
                        }
                    }
                    mVar2 = f.f(r5);
                }
            }
        }
        return obj;
    }

    @Override // v1.g0
    public final s2.l getLayoutDirection() {
        return this.f8033u.C;
    }

    @Override // v1.p
    public final long h(v1.p pVar, long j3) {
        return K0(pVar, j3);
    }

    @Override // x1.o0
    public final boolean h0() {
        return this.D != null;
    }

    @Override // v1.p
    public final v1.p i() {
        if (!B0().f8456t) {
            u1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        M0();
        return this.f8033u.I.f7989d.f8035w;
    }

    @Override // x1.o0
    public final g0 i0() {
        return this.f8033u;
    }

    @Override // x1.o0
    public final v1.f0 j0() {
        v1.f0 f0Var = this.D;
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // x1.o0
    public final o0 k0() {
        return this.f8035w;
    }

    @Override // x1.o0
    public final long l0() {
        return this.F;
    }

    @Override // s2.c
    public final float m() {
        return this.f8033u.B.m();
    }

    @Override // x1.o0
    public final void p0() {
        P(this.F, this.G, this.f8038z);
    }

    public final void q0(f1 f1Var, e1.a aVar, boolean z10) {
        if (f1Var == this) {
            return;
        }
        f1 f1Var2 = this.f8035w;
        if (f1Var2 != null) {
            f1Var2.q0(f1Var, aVar, z10);
        }
        long j3 = this.F;
        float f10 = (int) (j3 >> 32);
        aVar.f1925a -= f10;
        aVar.f1927c -= f10;
        float f11 = (int) (j3 & 4294967295L);
        aVar.f1926b -= f11;
        aVar.f1928d -= f11;
        l1 l1Var = this.O;
        if (l1Var != null) {
            y1.f1 f1Var3 = (y1.f1) l1Var;
            float[] a6 = f1Var3.a();
            if (!f1Var3.f8546y) {
                if (a6 == null) {
                    aVar.f1925a = 0.0f;
                    aVar.f1926b = 0.0f;
                    aVar.f1927c = 0.0f;
                    aVar.f1928d = 0.0f;
                } else {
                    f1.d0.n(a6, aVar);
                }
            }
            if (this.f8037y && z10) {
                long j6 = this.f7087i;
                aVar.a(0.0f, 0.0f, (int) (j6 >> 32), (int) (j6 & 4294967295L));
            }
        }
    }

    public final long r0(f1 f1Var, long j3) {
        if (f1Var == this) {
            return j3;
        }
        f1 f1Var2 = this.f8035w;
        return (f1Var2 == null || pc.j.a(f1Var, f1Var2)) ? y0(j3) : y0(f1Var2.r0(f1Var, j3));
    }

    public final long s0(long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - K();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - I();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    public final float t0(long j3, long j6) {
        if (K() >= Float.intBitsToFloat((int) (j6 >> 32)) && I() >= Float.intBitsToFloat((int) (j6 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long s02 = s0(j6);
        float intBitsToFloat = Float.intBitsToFloat((int) (s02 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (s02 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32));
        float max = Math.max(0.0f, intBitsToFloat3 < 0.0f ? -intBitsToFloat3 : intBitsToFloat3 - K());
        long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j3 & 4294967295L)) < 0.0f ? -r9 : r9 - I())) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i10 = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i10) <= intBitsToFloat) {
                int i11 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i11) <= intBitsToFloat2) {
                    float intBitsToFloat4 = Float.intBitsToFloat(i10);
                    float intBitsToFloat5 = Float.intBitsToFloat(i11);
                    return (intBitsToFloat5 * intBitsToFloat5) + (intBitsToFloat4 * intBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void u0(f1.o oVar, i1.b bVar) {
        i1.d dVar;
        Canvas canvas;
        Canvas canvas2;
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        l1 l1Var = this.O;
        if (l1Var == null) {
            long j3 = this.F;
            float f11 = (int) (j3 >> 32);
            float f12 = (int) (j3 & 4294967295L);
            oVar.e(f11, f12);
            v0(oVar, bVar);
            oVar.e(-f11, -f12);
            return;
        }
        y1.f1 f1Var = (y1.f1) l1Var;
        h1.b bVar2 = f1Var.f8540s;
        f1Var.f();
        f1Var.f8547z = f1Var.f8528g.f3011a.E() > 0.0f;
        a5.c cVar = bVar2.f2596h;
        cVar.M(oVar);
        cVar.f261g = bVar;
        i1.b bVar3 = f1Var.f8528g;
        f1.o t3 = bVar2.A().t();
        i1.b bVar4 = (i1.b) bVar2.A().f261g;
        i1.d dVar2 = bVar3.f3011a;
        if (bVar3.f3029s) {
            return;
        }
        bVar3.a();
        if (!dVar2.F()) {
            try {
                bVar3.f3011a.J(bVar3.f3012b, bVar3.f3013c, bVar3, bVar3.f3015e);
            } catch (Throwable unused) {
            }
        }
        boolean z13 = dVar2.E() > 0.0f;
        if (z13) {
            t3.p();
        }
        Canvas a6 = f1.c.a(t3);
        boolean isHardwareAccelerated = a6.isHardwareAccelerated();
        if (isHardwareAccelerated) {
            dVar = dVar2;
            canvas = a6;
        } else {
            long j6 = bVar3.f3030t;
            float f13 = (int) (j6 >> 32);
            float f14 = (int) (j6 & 4294967295L);
            dVar = dVar2;
            long j10 = bVar3.f3031u;
            float f15 = ((int) (j10 >> 32)) + f13;
            float f16 = f14 + ((int) (j10 & 4294967295L));
            float a8 = dVar.a();
            f1.l w3 = dVar.w();
            int K = dVar.K();
            if (a8 < 1.0f || K != 3 || w3 != null || dVar.u() == 1) {
                l6.l lVar = bVar3.f3026p;
                if (lVar == null) {
                    lVar = f1.d0.f();
                    bVar3.f3026p = lVar;
                }
                lVar.d(a8);
                lVar.e(K);
                lVar.g(w3);
                f10 = f13;
                a6.saveLayer(f10, f14, f15, f16, (Paint) lVar.f4199b);
            } else {
                a6.save();
                f10 = f13;
            }
            canvas = a6;
            canvas.translate(f10, f14);
            canvas.concat(dVar.A());
        }
        boolean z14 = !isHardwareAccelerated && bVar3.f3033w;
        if (z14) {
            t3.k();
            f1.b0 d10 = bVar3.d();
            if (d10 instanceof f1.z) {
                e1.c cVar2 = ((f1.z) d10).f2292a;
                t3.d(cVar2.f1931a, cVar2.f1932b, cVar2.f1933c, cVar2.f1934d, 1);
            } else if (d10 instanceof f1.a0) {
                f1.i iVar = bVar3.f3023m;
                if (iVar != null) {
                    iVar.f2261a.rewind();
                } else {
                    iVar = f1.k.a();
                    bVar3.f3023m = iVar;
                }
                f1.i.a(iVar, ((f1.a0) d10).f2212a);
                t3.i(iVar);
            } else {
                if (!(d10 instanceof f1.y)) {
                    throw new ac.d();
                }
                t3.i(((f1.y) d10).f2291a);
            }
        }
        if (bVar4 != null) {
            a0.u uVar = bVar4.f3028r;
            if (!uVar.f135a) {
                f1.x.a("Only add dependencies during a tracking");
            }
            s.h0 h0Var = (s.h0) uVar.f138d;
            if (h0Var != null) {
                h0Var.a(bVar3);
            } else if (((i1.b) uVar.f136b) != null) {
                int i10 = s.p0.f6316a;
                s.h0 h0Var2 = new s.h0();
                i1.b bVar5 = (i1.b) uVar.f136b;
                pc.j.b(bVar5);
                h0Var2.a(bVar5);
                h0Var2.a(bVar3);
                uVar.f138d = h0Var2;
                uVar.f136b = null;
            } else {
                uVar.f136b = bVar3;
            }
            s.h0 h0Var3 = (s.h0) uVar.f139e;
            if (h0Var3 != null) {
                z12 = !h0Var3.k(bVar3);
            } else if (((i1.b) uVar.f137c) != bVar3) {
                z12 = true;
            } else {
                uVar.f137c = null;
                z12 = false;
            }
            if (z12) {
                bVar3.f3027q++;
            }
        }
        if (f1.c.a(t3).isHardwareAccelerated()) {
            i1.d dVar3 = dVar;
            canvas2 = canvas;
            z10 = z14;
            z11 = z13;
            dVar3.G(t3);
        } else {
            h1.b bVar6 = bVar3.f3025o;
            if (bVar6 == null) {
                bVar6 = new h1.b();
                bVar3.f3025o = bVar6;
            }
            a5.c cVar3 = bVar6.f2596h;
            s2.c cVar4 = bVar3.f3012b;
            s2.l lVar2 = bVar3.f3013c;
            long F = i7.b.F(bVar3.f3031u);
            h1.a aVar = ((h1.b) cVar3.f263i).f2595g;
            s2.c cVar5 = aVar.f2591a;
            s2.l lVar3 = aVar.f2592b;
            f1.o t10 = cVar3.t();
            canvas2 = canvas;
            z10 = z14;
            long x10 = cVar3.x();
            z11 = z13;
            i1.b bVar7 = (i1.b) cVar3.f261g;
            cVar3.N(cVar4);
            cVar3.P(lVar2);
            cVar3.M(t3);
            cVar3.Q(F);
            cVar3.f261g = bVar3;
            t3.k();
            try {
                bVar3.c(bVar6);
            } finally {
                t3.g();
                cVar3.N(cVar5);
                cVar3.P(lVar3);
                cVar3.M(t10);
                cVar3.Q(x10);
                cVar3.f261g = bVar7;
            }
        }
        if (z10) {
            t3.g();
        }
        if (z11) {
            t3.m();
        }
        if (isHardwareAccelerated) {
            return;
        }
        canvas2.restore();
    }

    public final void v0(f1.o oVar, i1.b bVar) {
        f1.o oVar2;
        i1.b bVar2;
        y0.m C0 = C0(4);
        if (C0 == null) {
            Q0(oVar, bVar);
            return;
        }
        g0 g0Var = this.f8033u;
        g0Var.getClass();
        i0 sharedDrawScope = ((y1.r) j0.a(g0Var)).getSharedDrawScope();
        long F = i7.b.F(this.f7087i);
        sharedDrawScope.getClass();
        o0.e eVar = null;
        while (C0 != null) {
            if (C0 instanceof n) {
                oVar2 = oVar;
                bVar2 = bVar;
                sharedDrawScope.b(oVar2, F, this, (n) C0, bVar2);
            } else {
                oVar2 = oVar;
                bVar2 = bVar;
                if ((C0.f8445i & 4) != 0 && (C0 instanceof m)) {
                    int i10 = 0;
                    for (y0.m mVar = ((m) C0).f8110v; mVar != null; mVar = mVar.f8448l) {
                        if ((mVar.f8445i & 4) != 0) {
                            i10++;
                            if (i10 == 1) {
                                C0 = mVar;
                            } else {
                                if (eVar == null) {
                                    eVar = new o0.e(new y0.m[16]);
                                }
                                if (C0 != null) {
                                    eVar.b(C0);
                                    C0 = null;
                                }
                                eVar.b(mVar);
                            }
                        }
                    }
                    if (i10 == 1) {
                        oVar = oVar2;
                        bVar = bVar2;
                    }
                }
            }
            C0 = f.f(eVar);
            oVar = oVar2;
            bVar = bVar2;
        }
    }

    public abstract void w0();

    public final f1 x0(f1 f1Var) {
        g0 g0Var = f1Var.f8033u;
        g0 g0Var2 = this.f8033u;
        if (g0Var == g0Var2) {
            y0.m B0 = f1Var.B0();
            y0.m B02 = B0();
            if (!B02.f8443g.f8456t) {
                u1.a.b("visitLocalAncestors called on an unattached node");
            }
            for (y0.m mVar = B02.f8443g.f8447k; mVar != null; mVar = mVar.f8447k) {
                if ((mVar.f8445i & 2) != 0 && mVar == B0) {
                    return f1Var;
                }
            }
            return this;
        }
        while (g0Var.f8054t > g0Var2.f8054t) {
            g0Var = g0Var.s();
            pc.j.b(g0Var);
        }
        g0 g0Var3 = g0Var2;
        while (g0Var3.f8054t > g0Var.f8054t) {
            g0Var3 = g0Var3.s();
            pc.j.b(g0Var3);
        }
        while (g0Var != g0Var3) {
            g0Var = g0Var.s();
            g0Var3 = g0Var3.s();
            if (g0Var == null || g0Var3 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (g0Var3 != g0Var2) {
            if (g0Var != f1Var.f8033u) {
                return g0Var.I.f7988c;
            }
            return f1Var;
        }
        return this;
    }

    @Override // x1.n1
    public final boolean y() {
        return (this.O == null || this.f8036x || !this.f8033u.G()) ? false : true;
    }

    public final long y0(long j3) {
        long j6 = this.F;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - ((int) (j6 >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) - ((int) (j6 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        l1 l1Var = this.O;
        return l1Var != null ? ((y1.f1) l1Var).c(true, floatToRawIntBits) : floatToRawIntBits;
    }

    @Override // v1.p
    public final boolean z() {
        return B0().f8456t;
    }

    public abstract p0 z0();

    @Override // x1.o0
    public final v1.p g0() {
        return this;
    }
}
