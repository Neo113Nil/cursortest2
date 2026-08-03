package x1;

import android.graphics.Paint;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s extends f1 {
    public static final l6.l V;
    public final w1 T;
    public r U;

    static {
        l6.l f10 = f1.d0.f();
        f10.f(f1.q.f2280e);
        ((Paint) f10.f4199b).setStrokeWidth(1.0f);
        f10.k(1);
        V = f10;
    }

    public s(g0 g0Var) {
        super(g0Var);
        w1 w1Var = new w1();
        w1Var.f8446j = 0;
        this.T = w1Var;
        w1Var.f8450n = this;
        this.U = g0Var.f8047m != null ? new r(this) : null;
    }

    @Override // x1.f1
    public final y0.m B0() {
        return this.T;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // x1.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H0(d dVar, long j3, q qVar, int i10, boolean z10) {
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        g0 g0Var;
        long j6 = j3;
        q qVar2 = qVar;
        int i12 = dVar.f7996g;
        g0 g0Var2 = this.f8033u;
        switch (i12) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                z11 = true;
                break;
            default:
                e2.j u10 = g0Var2.u();
                z11 = !(u10 != null && u10.f1988j);
                break;
        }
        if (z11) {
            if (Y0(j6)) {
                i11 = i10;
                z12 = z10;
                z13 = true;
            } else {
                i11 = i10;
                if (i11 == 1 && (Float.floatToRawIntBits(t0(j6, A0())) & Integer.MAX_VALUE) < 2139095040) {
                    z13 = true;
                    z12 = false;
                }
            }
            if (z13) {
                return;
            }
            int i13 = qVar2.f8149i;
            o0.e v10 = g0Var2.v();
            Object[] objArr = v10.f5134g;
            int i14 = v10.f5136i - 1;
            while (i14 >= 0) {
                g0 g0Var3 = (g0) objArr[i14];
                if (g0Var3.H()) {
                    switch (dVar.f7996g) {
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            g0Var3.x(j6, qVar2, i11, z12);
                            g0Var = g0Var3;
                            break;
                        default:
                            c1 c1Var = g0Var3.I;
                            c1Var.f7989d.G0(f1.S, c1Var.f7989d.y0(j6), qVar2, 1, z12);
                            qVar2 = qVar;
                            g0Var = g0Var3;
                            break;
                    }
                    long a6 = qVar2.a();
                    if (f.l(a6) < 0.0f && f.q(a6) && !f.p(a6)) {
                        f1 f1Var = g0Var.I.f7989d;
                        f1Var.getClass();
                        y0.m D0 = f1Var.D0(g1.g(16));
                        if (D0 != null && D0.f8456t) {
                            if (!D0.f8443g.f8456t) {
                                u1.a.b("visitLocalDescendants called on an unattached node");
                            }
                            y0.m mVar = D0.f8443g;
                            if ((mVar.f8446j & 16) != 0) {
                                while (mVar != null) {
                                    if ((mVar.f8445i & 16) != 0) {
                                        m mVar2 = mVar;
                                        ?? r62 = 0;
                                        while (mVar2 != 0) {
                                            if (mVar2 instanceof r1) {
                                                if (((r1) mVar2).K()) {
                                                    qVar2.f8149i = qVar2.f8147g.f6220b - 1;
                                                }
                                            } else if ((mVar2.f8445i & 16) != 0 && (mVar2 instanceof m)) {
                                                y0.m mVar3 = mVar2.f8110v;
                                                int i15 = 0;
                                                mVar2 = mVar2;
                                                r62 = r62;
                                                while (mVar3 != null) {
                                                    if ((mVar3.f8445i & 16) != 0) {
                                                        i15++;
                                                        r62 = r62;
                                                        if (i15 == 1) {
                                                            mVar2 = mVar3;
                                                        } else {
                                                            if (r62 == 0) {
                                                                r62 = new o0.e(new y0.m[16]);
                                                            }
                                                            if (mVar2 != 0) {
                                                                r62.b(mVar2);
                                                                mVar2 = 0;
                                                            }
                                                            r62.b(mVar3);
                                                        }
                                                    }
                                                    mVar3 = mVar3.f8448l;
                                                    mVar2 = mVar2;
                                                    r62 = r62;
                                                }
                                                if (i15 == 1) {
                                                }
                                            }
                                            mVar2 = f.f(r62);
                                        }
                                    }
                                    mVar = mVar.f8448l;
                                }
                            }
                        }
                        qVar2.f8149i = i13;
                        return;
                    }
                }
                i14--;
                j6 = j3;
                i11 = i10;
            }
            qVar2.f8149i = i13;
            return;
        }
        i11 = i10;
        z12 = z10;
        z13 = false;
        if (z13) {
        }
    }

    @Override // v1.j0
    public final void P(long j3, float f10, oc.c cVar) {
        R0(j3, f10, cVar);
        if (this.f8125p) {
            return;
        }
        this.f8033u.J.f8103p.b0();
    }

    @Override // x1.f1
    public final void Q0(f1.o oVar, i1.b bVar) {
        g0 g0Var = this.f8033u;
        m1 a6 = j0.a(g0Var);
        o0.e v10 = g0Var.v();
        Object[] objArr = v10.f5134g;
        int i10 = v10.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            if (g0Var2.H()) {
                g0Var2.i(oVar, bVar);
            }
        }
        if (((y1.r) a6).getShowLayoutBounds()) {
            long j3 = this.f7087i;
            oVar.c(0.5f, 0.5f, ((int) (j3 >> 32)) - 0.5f, ((int) (j3 & 4294967295L)) - 0.5f, V);
        }
    }

    @Override // x1.o0
    public final int W(v1.k kVar) {
        r rVar = this.U;
        if (rVar != null) {
            return rVar.W(kVar);
        }
        x0 x0Var = this.f8033u.J.f8103p;
        h0 h0Var = x0Var.C;
        if (x0Var.f8201l.f8091d == c0.f7980g) {
            h0Var.f8070d = true;
            if (h0Var.f8068b) {
                x0Var.A = true;
                x0Var.B = true;
            }
        } else {
            h0Var.f8071e = true;
        }
        x0Var.k().f8126q = true;
        x0Var.r();
        x0Var.k().f8126q = false;
        Integer num = (Integer) h0Var.f8073g.get(kVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // v1.d0
    public final v1.j0 e(long j3) {
        S(j3);
        g0 g0Var = this.f8033u;
        o0.e w3 = g0Var.w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            ((g0) objArr[i11]).J.f8103p.f8207r = e0.f8021i;
        }
        U0(g0Var.A.a(this, g0Var.J.f8103p.T(), j3));
        N0();
        return this;
    }

    @Override // x1.f1
    public final void w0() {
        if (this.U == null) {
            this.U = new r(this);
        }
    }

    @Override // x1.f1
    public final p0 z0() {
        return this.U;
    }
}
