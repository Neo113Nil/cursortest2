package m0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f4838a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f4839b = new l0();

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(v1 v1Var, u0.d dVar, r rVar, int i10) {
        z2 z2Var;
        boolean z10;
        x1 s10;
        rVar.Z(-149765515);
        r0 r0Var = rVar.f4744x;
        r1 l10 = rVar.l();
        rVar.V(201, t.f4758b);
        Object M = rVar.M();
        if (pc.j.a(M, l.f4646a)) {
            z2Var = null;
        } else {
            pc.j.c(M, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            z2Var = (z2) M;
        }
        u1 u1Var = v1Var.f4784a;
        z2 c3 = u1Var.c(v1Var, z2Var);
        boolean equals = c3.equals(z2Var);
        if (!equals) {
            rVar.i0(c3);
        }
        if (rVar.S) {
            if (v1Var.f4789f || !((u0.i) l10).containsKey(u1Var)) {
                l10 = ((u0.i) l10).b(u1Var, c3);
            }
            rVar.J = true;
        } else {
            i2 i2Var = rVar.G;
            Object b2 = i2Var.b(i2Var.f4615b, i2Var.f4620g);
            pc.j.c(b2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            r1 r1Var = (r1) b2;
            if (!(rVar.B() && equals) && (v1Var.f4789f || !((u0.i) l10).containsKey(u1Var))) {
                l10 = ((u0.i) l10).b(u1Var, c3);
            } else if ((equals && !rVar.f4743w) || !rVar.f4743w) {
                l10 = r1Var;
            }
            if (rVar.f4745y || r1Var != l10) {
                z10 = true;
                if (z10 && !rVar.S) {
                    rVar.K(l10);
                }
                r0Var.c(rVar.f4743w ? 1 : 0);
                rVar.f4743w = z10;
                rVar.K = l10;
                rVar.T(202, 0, t.f4759c, l10);
                dVar.invoke(rVar, Integer.valueOf((i10 >> 3) & 14));
                rVar.q(false);
                rVar.q(false);
                rVar.f4743w = r0Var.b() != 0;
                rVar.K = null;
                s10 = rVar.s();
                if (s10 == null) {
                    s10.f4809d = new a0(v1Var, dVar, i10, 0);
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (z10) {
            rVar.K(l10);
        }
        r0Var.c(rVar.f4743w ? 1 : 0);
        rVar.f4743w = z10;
        rVar.K = l10;
        rVar.T(202, 0, t.f4759c, l10);
        dVar.invoke(rVar, Integer.valueOf((i10 >> 3) & 14));
        rVar.q(false);
        rVar.q(false);
        rVar.f4743w = r0Var.b() != 0;
        rVar.K = null;
        s10 = rVar.s();
        if (s10 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, m0.r1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(v1[] v1VarArr, oc.e eVar, r rVar, int i10) {
        u0.i h0;
        boolean z10;
        x1 s10;
        rVar.Z(415205898);
        r0 r0Var = rVar.f4744x;
        r1 l10 = rVar.l();
        rVar.V(201, t.f4758b);
        if (rVar.S) {
            h0 = rVar.h0(l10, z(v1VarArr, l10, u0.i.f6678j));
            rVar.J = true;
        } else {
            i2 i2Var = rVar.G;
            Object h10 = i2Var.h(i2Var.f4620g, 0);
            pc.j.c(h10, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            ?? r22 = (r1) h10;
            i2 i2Var2 = rVar.G;
            Object h11 = i2Var2.h(i2Var2.f4620g, 1);
            pc.j.c(h11, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            r1 r1Var = (r1) h11;
            u0.i z11 = z(v1VarArr, l10, r1Var);
            if (rVar.B() && !rVar.f4745y && r1Var.equals(z11)) {
                rVar.f4732l = rVar.G.s() + rVar.f4732l;
                h0 = r22;
            } else {
                h0 = rVar.h0(l10, z11);
                if (rVar.f4745y || !pc.j.a(h0, r22)) {
                    z10 = true;
                    if (z10 && !rVar.S) {
                        rVar.K(h0);
                    }
                    r0Var.c(rVar.f4743w ? 1 : 0);
                    rVar.f4743w = z10;
                    rVar.K = h0;
                    rVar.T(202, 0, t.f4759c, h0);
                    eVar.invoke(rVar, Integer.valueOf((i10 >> 3) & 14));
                    rVar.q(false);
                    rVar.q(false);
                    rVar.f4743w = r0Var.b() != 0;
                    rVar.K = null;
                    s10 = rVar.s();
                    if (s10 == null) {
                        s10.f4809d = new a0(v1VarArr, eVar, i10, 1);
                        return;
                    }
                    return;
                }
            }
        }
        z10 = false;
        if (z10) {
            rVar.K(h0);
        }
        r0Var.c(rVar.f4743w ? 1 : 0);
        rVar.f4743w = z10;
        rVar.K = h0;
        rVar.T(202, 0, t.f4759c, h0);
        eVar.invoke(rVar, Integer.valueOf((i10 >> 3) & 14));
        rVar.q(false);
        rVar.q(false);
        rVar.f4743w = r0Var.b() != 0;
        rVar.K = null;
        s10 = rVar.s();
        if (s10 == null) {
        }
    }

    public static final void c(Object obj, Object obj2, oc.c cVar, r rVar) {
        boolean f10 = rVar.f(obj) | rVar.f(obj2);
        Object M = rVar.M();
        if (f10 || M == l.f4646a) {
            M = new j0(cVar);
            rVar.i0(M);
        }
    }

    public static final void d(Object obj, oc.c cVar, r rVar) {
        boolean f10 = rVar.f(obj);
        Object M = rVar.M();
        if (f10 || M == l.f4646a) {
            M = new j0(cVar);
            rVar.i0(M);
        }
    }

    public static final void e(Object obj, Object obj2, oc.e eVar, r rVar) {
        fc.i iVar = rVar.R;
        boolean f10 = rVar.f(obj) | rVar.f(obj2);
        Object M = rVar.M();
        if (f10 || M == l.f4646a) {
            M = new x0(iVar, eVar);
            rVar.i0(M);
        }
    }

    public static final void f(Object obj, r rVar, oc.e eVar) {
        fc.i iVar = rVar.R;
        boolean f10 = rVar.f(obj);
        Object M = rVar.M();
        if (f10 || M == l.f4646a) {
            M = new x0(iVar, eVar);
            rVar.i0(M);
        }
    }

    public static final void g(oc.a aVar, r rVar) {
        n0.l0 l0Var = rVar.M.f4981b.f4978d;
        l0Var.N(n0.a0.f4979c);
        a.a.J(l0Var, 0, aVar);
    }

    public static final void h(s.t tVar, int i10) {
        if (tVar.f6342b == 0 || !(tVar.c(0) == i10 || tVar.c(tVar.f6342b - 1) == i10)) {
            int i11 = tVar.f6342b;
            tVar.a(i10);
            while (i11 > 0) {
                int i12 = ((i11 + 1) >>> 1) - 1;
                int c3 = tVar.c(i12);
                if (i10 <= c3) {
                    break;
                }
                tVar.e(i11, c3);
                i11 = i12;
            }
            tVar.e(i11, i10);
        }
    }

    public static void i(m2 m2Var, List list, y yVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int c3 = m2Var.c((a) list.get(i10));
            int M = m2Var.M(m2Var.f4659b, m2Var.r(c3));
            Object obj = M < m2Var.g(m2Var.f4659b, m2Var.r(c3 + 1)) ? m2Var.f4660c[m2Var.h(M)] : l.f4646a;
            x1 x1Var = obj instanceof x1 ? (x1) obj : null;
            if (x1Var != null) {
                x1Var.f4806a = yVar;
            }
        }
    }

    public static final d1 k(bd.c0 c0Var, r rVar) {
        Object value = c0Var.getValue();
        Object obj = fc.j.f2348g;
        boolean h10 = rVar.h(obj) | rVar.h(c0Var);
        Object M = rVar.M();
        fc.d dVar = null;
        Object obj2 = l.f4646a;
        if (h10 || M == obj2) {
            M = new c0.c(obj, c0Var, dVar, 5);
            rVar.i0(M);
        }
        oc.e eVar = (oc.e) M;
        Object M2 = rVar.M();
        if (M2 == obj2) {
            M2 = s(value);
            rVar.i0(M2);
        }
        d1 d1Var = (d1) M2;
        boolean h11 = rVar.h(eVar);
        Object M3 = rVar.M();
        if (h11 || M3 == obj2) {
            M3 = new t2(eVar, d1Var, dVar, 1);
            rVar.i0(M3);
        }
        e(c0Var, obj, (oc.e) M3, rVar);
        return d1Var;
    }

    public static final yc.y l(r rVar) {
        return new h2(rVar.R);
    }

    public static final o0.e m() {
        a5.c cVar = s2.f4756b;
        o0.e eVar = (o0.e) cVar.s();
        if (eVar != null) {
            return eVar;
        }
        o0.e eVar2 = new o0.e(new q[0]);
        cVar.K(eVar2);
        return eVar2;
    }

    public static final i0 n(oc.a aVar) {
        a5.c cVar = s2.f4755a;
        return new i0(aVar, null);
    }

    public static final int o(r rVar) {
        rVar.getClass();
        return Long.hashCode(rVar.T);
    }

    public static final a1 p(fc.i iVar) {
        a1 a1Var = (a1) iVar.v(z0.f4840h);
        if (a1Var != null) {
            return a1Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List r(m2 m2Var, int i10, m2 m2Var2, boolean z10, boolean z11, boolean z12) {
        bc.v vVar;
        boolean z13;
        int i11;
        int i12;
        int t3 = m2Var.t(i10);
        int i13 = i10 + t3;
        int f10 = m2Var.f(i10);
        int f11 = m2Var.f(i13);
        int i14 = f11 - f10;
        boolean z14 = i10 >= 0 && (m2Var.f4659b[(m2Var.r(i10) * 5) + 1] & 201326592) != 0;
        m2Var2.v(t3);
        m2Var2.w(i14, m2Var2.f4677t);
        if (m2Var.f4664g < i13) {
            m2Var.A(i13);
        }
        if (m2Var.f4668k < f11) {
            m2Var.B(f11, i13);
        }
        int[] iArr = m2Var2.f4659b;
        int i15 = m2Var2.f4677t;
        int i16 = i15 * 5;
        bc.l.P(i16, i10 * 5, i13 * 5, m2Var.f4659b, iArr);
        Object[] objArr = m2Var2.f4660c;
        int i17 = m2Var2.f4666i;
        System.arraycopy(m2Var.f4660c, f10, objArr, i17, i14);
        int i18 = m2Var2.f4679v;
        iArr[i16 + 2] = i18;
        int i19 = i15 - i10;
        int i20 = i15 + t3;
        int g8 = i17 - m2Var2.g(iArr, i15);
        int i21 = m2Var2.f4670m;
        int i22 = m2Var2.f4669l;
        int length = objArr.length;
        boolean z15 = z14;
        int i23 = i21;
        int i24 = i15;
        while (i24 < i20) {
            if (i24 != i15) {
                int i25 = (i24 * 5) + 2;
                iArr[i25] = iArr[i25] + i19;
            }
            int[] iArr2 = iArr;
            int g10 = m2Var2.g(iArr, i24) + g8;
            if (i23 < i24) {
                i11 = i15;
                i12 = 0;
            } else {
                i11 = i15;
                i12 = m2Var2.f4668k;
            }
            iArr2[(i24 * 5) + 4] = m2.i(g10, i12, i22, length);
            if (i24 == i23) {
                i23++;
            }
            i24++;
            i15 = i11;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        m2Var2.f4670m = i23;
        int b2 = l2.b(m2Var.f4661d, i10, m2Var.p());
        int b10 = l2.b(m2Var.f4661d, i13, m2Var.p());
        if (b2 < b10) {
            ArrayList arrayList = m2Var.f4661d;
            ArrayList arrayList2 = new ArrayList(b10 - b2);
            for (int i26 = b2; i26 < b10; i26++) {
                a aVar = (a) arrayList.get(i26);
                aVar.f4509a += i19;
                arrayList2.add(aVar);
            }
            m2Var2.f4661d.addAll(l2.b(m2Var2.f4661d, m2Var2.f4677t, m2Var2.p()), arrayList2);
            arrayList.subList(b2, b10).clear();
            vVar = arrayList2;
        } else {
            vVar = bc.v.f1067g;
        }
        if (!vVar.isEmpty()) {
            HashMap hashMap = m2Var.f4662e;
            HashMap hashMap2 = m2Var2.f4662e;
            if (hashMap != null && hashMap2 != null) {
                int size = vVar.size();
                for (int i27 = 0; i27 < size; i27++) {
                }
            }
        }
        int i28 = m2Var2.f4679v;
        m2Var2.N(i18);
        int D = m2Var.D(m2Var.f4659b, i10);
        if (!z12) {
            z13 = false;
        } else if (z10) {
            boolean z16 = D >= 0;
            if (z16) {
                m2Var.O();
                m2Var.a(D - m2Var.f4677t);
                m2Var.O();
            }
            m2Var.a(i10 - m2Var.f4677t);
            boolean G = m2Var.G();
            if (z16) {
                m2Var.L();
                m2Var.j();
                m2Var.L();
                m2Var.j();
            }
            z13 = G;
        } else {
            boolean H = m2Var.H(i10, t3);
            m2Var.I(f10, i14, i10 - 1);
            z13 = H;
        }
        if (z13) {
            t.c("Unexpectedly removed anchors");
        }
        int i29 = m2Var2.f4672o;
        int i30 = iArr3[i16 + 1];
        m2Var2.f4672o = i29 + ((1073741824 & i30) != 0 ? 1 : i30 & 67108863);
        if (z11) {
            m2Var2.f4677t = i20;
            m2Var2.f4666i = i17 + i14;
        }
        if (z15) {
            m2Var2.S(i18);
        }
        return vVar;
    }

    public static l1 s(Object obj) {
        return new l1(obj, z0.f4844l);
    }

    public static final Object t(r1 r1Var, u1 u1Var) {
        pc.j.c(u1Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        u0.i iVar = (u0.i) r1Var;
        Object obj = iVar.get(u1Var);
        if (obj == null) {
            obj = u1Var.b();
        }
        return ((z2) obj).a(iVar);
    }

    public static final d1 u(Object obj, r rVar) {
        Object M = rVar.M();
        if (M == l.f4646a) {
            M = s(obj);
            rVar.i0(M);
        }
        d1 d1Var = (d1) M;
        d1Var.setValue(obj);
        return d1Var;
    }

    public static final void w(Object obj, r rVar, oc.e eVar) {
        if (rVar.S || !pc.j.a(rVar.M(), obj)) {
            rVar.i0(obj);
            rVar.b(obj, eVar);
        }
    }

    public static final int x(s.t tVar) {
        int c3;
        int i10 = tVar.f6342b;
        int c7 = tVar.c(0);
        while (tVar.f6342b != 0 && tVar.c(0) == c7) {
            int i11 = tVar.f6342b;
            if (i11 == 0) {
                t.a.e("IntList is empty.");
                throw null;
            }
            tVar.e(0, tVar.f6341a[i11 - 1]);
            tVar.d(tVar.f6342b - 1);
            int i12 = tVar.f6342b;
            int i13 = i12 >>> 1;
            int i14 = 0;
            while (i14 < i13) {
                int c10 = tVar.c(i14);
                int i15 = (i14 + 1) * 2;
                int i16 = i15 - 1;
                int c11 = tVar.c(i16);
                if (i15 >= i12 || (c3 = tVar.c(i15)) <= c11) {
                    if (c11 > c10) {
                        tVar.e(i14, c11);
                        tVar.e(i16, c10);
                        i14 = i16;
                    }
                } else if (c3 > c10) {
                    tVar.e(i14, c3);
                    tVar.e(i15, c10);
                    i14 = i15;
                }
            }
        }
        return c7;
    }

    public static final int y(int i10) {
        int i11 = 306783378 & i10;
        int i12 = 613566756 & i10;
        return (i10 & (-920350135)) | (i12 >> 1) | i11 | ((i11 << 1) & i12);
    }

    public static final u0.i z(v1[] v1VarArr, r1 r1Var, r1 r1Var2) {
        u0.h hVar = new u0.h(u0.i.f6678j);
        for (v1 v1Var : v1VarArr) {
            u1 u1Var = v1Var.f4784a;
            if (v1Var.f4789f || !((u0.i) r1Var).containsKey(u1Var)) {
                hVar.put(u1Var, u1Var.c(v1Var, (z2) ((u0.i) r1Var2).get(u1Var)));
            }
        }
        return hVar.a();
    }

    public abstract void j();

    public abstract void q();

    public abstract boolean v(d6.f fVar);
}
