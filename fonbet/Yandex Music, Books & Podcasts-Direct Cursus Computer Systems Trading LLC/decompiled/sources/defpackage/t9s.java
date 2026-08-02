package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t9s extends xci implements epf, ipa, ofp {
    public Function1 A;
    public Map B;
    public qgi C;
    public s9s D;
    public r9s E;
    public mn0 o;
    public ges p;
    public ppc q;
    public Function1 r;
    public int s;
    public boolean t;
    public int u;
    public int v;
    public List w;
    public Function1 x;
    public iep y;
    public a95 z;

    public t9s(mn0 mn0Var, ges gesVar, ppc ppcVar, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, iep iepVar, a95 a95Var, Function1 function13) {
        this.o = mn0Var;
        this.p = gesVar;
        this.q = ppcVar;
        this.r = function1;
        this.s = i;
        this.t = z;
        this.u = i2;
        this.v = i3;
        this.w = list;
        this.x = function12;
        this.y = iepVar;
        this.z = a95Var;
        this.A = function13;
    }

    @Override // defpackage.epf
    public final int E(twg twgVar, ffh ffhVar, int i) {
        return U0(twgVar).a(i, twgVar.getLayoutDirection());
    }

    @Override // defpackage.xci
    public final boolean H0() {
        return false;
    }

    @Override // defpackage.epf
    public final int M(twg twgVar, ffh ffhVar, int i) {
        return wxf.n(U0(twgVar).d(twgVar.getLayoutDirection()).c());
    }

    public final void S0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            T0().f(this.o, this.p, this.q, this.s, this.t, this.u, this.v, this.w);
        }
        if (this.n) {
            if (z2 || (z && this.D != null)) {
                neg.w(this);
            }
            if (z2 || z3 || z4) {
                h4a.z(this);
                vq1.Z(this);
            }
            if (z) {
                vq1.Z(this);
            }
        }
    }

    public final qgi T0() {
        if (this.C == null) {
            this.C = new qgi(this.o, this.p, this.q, this.s, this.t, this.u, this.v, this.w);
        }
        qgi qgiVar = this.C;
        qgiVar.getClass();
        return qgiVar;
    }

    public final qgi U0(jx7 jx7Var) {
        qgi qgiVar;
        r9s r9sVar = this.E;
        if (r9sVar != null && r9sVar.c && (qgiVar = r9sVar.d) != null) {
            qgiVar.c(jx7Var);
            return qgiVar;
        }
        qgi T0 = T0();
        T0.c(jx7Var);
        return T0;
    }

    public final boolean V0(Function1 function1, Function1 function12, iep iepVar, Function1 function13) {
        boolean z;
        if (this.r != function1) {
            this.r = function1;
            z = true;
        } else {
            z = false;
        }
        if (this.x != function12) {
            this.x = function12;
            z = true;
        }
        if (!Intrinsics.d(this.y, iepVar)) {
            this.y = iepVar;
            z = true;
        }
        if (this.A == function13) {
            return z;
        }
        this.A = function13;
        return true;
    }

    public final boolean W0(ges gesVar, List list, int i, int i2, boolean z, ppc ppcVar, int i3) {
        boolean z2 = !this.p.d(gesVar);
        this.p = gesVar;
        if (!Intrinsics.d(this.w, list)) {
            this.w = list;
            z2 = true;
        }
        if (this.v != i) {
            this.v = i;
            z2 = true;
        }
        if (this.u != i2) {
            this.u = i2;
            z2 = true;
        }
        if (this.t != z) {
            this.t = z;
            z2 = true;
        }
        if (!Intrinsics.d(this.q, ppcVar)) {
            this.q = ppcVar;
            z2 = true;
        }
        if (this.s == i3) {
            return z2;
        }
        this.s = i3;
        return true;
    }

    @Override // defpackage.ofp
    public final void X(jfp jfpVar) {
        s9s s9sVar = this.D;
        if (s9sVar == null) {
            s9sVar = new s9s(this, 0);
            this.D = s9sVar;
        }
        wfp.u(jfpVar, this.o);
        r9s r9sVar = this.E;
        if (r9sVar != null) {
            mn0 mn0Var = r9sVar.b;
            xfp xfpVar = ufp.A;
            s9f[] s9fVarArr = wfp.a;
            s9f s9fVar = s9fVarArr[14];
            xfpVar.getClass();
            jfpVar.o(xfpVar, mn0Var);
            boolean z = r9sVar.c;
            xfp xfpVar2 = ufp.B;
            s9f s9fVar2 = s9fVarArr[15];
            Boolean valueOf = Boolean.valueOf(z);
            xfpVar2.getClass();
            jfpVar.o(xfpVar2, valueOf);
        }
        jfpVar.o(hfp.k, new sa(null, new s9s(this, 1)));
        jfpVar.o(hfp.l, new sa(null, new s9s(this, 2)));
        jfpVar.o(hfp.m, new sa(null, new kgk(29, this)));
        wfp.d(jfpVar, s9sVar);
    }

    public final boolean X0(mn0 mn0Var) {
        boolean d = Intrinsics.d(this.o.b, mn0Var.b);
        boolean z = (d && Intrinsics.d(this.o.a, mn0Var.a)) ? false : true;
        if (z) {
            this.o = mn0Var;
        }
        if (!d) {
            this.E = null;
        }
        return z;
    }

    @Override // defpackage.epf
    public final int b(twg twgVar, ffh ffhVar, int i) {
        return wxf.n(U0(twgVar).d(twgVar.getLayoutDirection()).b());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    @Override // defpackage.epf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        boolean z;
        cds cdsVar;
        qgi U0 = U0(mfhVar);
        xof layoutDirection = mfhVar.getLayoutDirection();
        if (U0.f > 1) {
            m5i m5iVar = U0.h;
            ges gesVar = U0.k;
            jx7 jx7Var = U0.j;
            jx7Var.getClass();
            m5i w = dag.w(m5iVar, layoutDirection, gesVar, jx7Var, U0.b);
            U0.h = w;
            j = w.a(U0.f, j);
        }
        cds cdsVar2 = U0.n;
        if (cdsVar2 != null) {
            ogi ogiVar = cdsVar2.b;
            bds bdsVar = cdsVar2.a;
            if (!ogiVar.a.a()) {
                xof xofVar = bdsVar.h;
                long j2 = bdsVar.j;
                if (layoutDirection == xofVar && (ga6.c(j, j2) || (ga6.i(j) == ga6.i(j2) && ga6.k(j) == ga6.k(j2) && ga6.h(j) >= ogiVar.e && !ogiVar.c))) {
                    cds cdsVar3 = U0.n;
                    cdsVar3.getClass();
                    if (ga6.c(j, cdsVar3.a.j)) {
                        z = false;
                        cdsVar = U0.n;
                        if (cdsVar == null) {
                            xq0.q("You must call layoutWithConstraints first");
                            return null;
                        }
                        long j3 = cdsVar.c;
                        cdsVar.b.a.a();
                        if (z) {
                            bcx.D(this, 2).i1();
                            Function1 function1 = this.r;
                            if (function1 != null) {
                                function1.invoke(cdsVar);
                            }
                            iep iepVar = this.y;
                            if (iepVar != null) {
                                cds cdsVar4 = (cds) iepVar.d.b;
                                if (cdsVar4 != null && !Intrinsics.d(cdsVar4.a.a, cdsVar.a.a)) {
                                    bfp bfpVar = iepVar.b;
                                    long j4 = iepVar.a;
                                    fep fepVar = bfpVar.i;
                                    if (fepVar != null) {
                                        fepVar.invoke(Long.valueOf(j4));
                                    }
                                }
                                iepVar.d = pt0.p(iepVar.d, null, cdsVar, 1);
                            }
                            Map map = this.B;
                            if (map == null) {
                                map = new LinkedHashMap(2);
                            }
                            map.put(j40.a, Integer.valueOf(Math.round(cdsVar.d)));
                            map.put(j40.b, Integer.valueOf(Math.round(cdsVar.e)));
                            this.B = map;
                        }
                        Function1 function12 = this.x;
                        if (function12 != null) {
                            function12.invoke(cdsVar.f);
                        }
                        int i = (int) (j3 >> 32);
                        int i2 = (int) (j3 & 4294967295L);
                        ksk M = ffhVar.M(qld.A(i, i, i2, i2));
                        Map map2 = this.B;
                        map2.getClass();
                        return mfhVar.w0(i, i2, map2, new ai0(M, 16));
                    }
                    cds cdsVar5 = U0.n;
                    cdsVar5.getClass();
                    U0.n = U0.e(layoutDirection, j, cdsVar5.b);
                    z = true;
                    cdsVar = U0.n;
                    if (cdsVar == null) {
                    }
                }
            }
        }
        U0.n = U0.e(layoutDirection, j, U0.b(j, layoutDirection));
        z = true;
        cdsVar = U0.n;
        if (cdsVar == null) {
        }
    }

    @Override // defpackage.epf
    public final int p0(twg twgVar, ffh ffhVar, int i) {
        return U0(twgVar).a(i, twgVar.getLayoutDirection());
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    @Override // defpackage.ipa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0(opf opfVar) {
        long j;
        cds cdsVar;
        mu3 mu3Var;
        ydp ydpVar;
        nsh nshVar;
        long j2;
        cds cdsVar2;
        ou3 ou3Var = opfVar.a;
        if (!this.n) {
            return;
        }
        iep iepVar = this.y;
        if (iepVar != null && (ydpVar = (ydp) iepVar.b.a().e(iepVar.a)) != null) {
            xdp xdpVar = ydpVar.b;
            xdp xdpVar2 = ydpVar.a;
            boolean z = ydpVar.c;
            int i = !z ? xdpVar2.b : xdpVar.b;
            int i2 = !z ? xdpVar.b : xdpVar2.b;
            if (i != i2) {
                ugi ugiVar = iepVar.e;
                int b = (ugiVar == null || (cdsVar2 = (cds) ugiVar.c.invoke()) == null) ? 0 : ugiVar.b(cdsVar2);
                if (i > b) {
                    i = b;
                }
                if (i2 > b) {
                    i2 = b;
                }
                cds cdsVar3 = (cds) iepVar.d.b;
                nh0 g = cdsVar3 != null ? cdsVar3.g(i, i2) : null;
                if (g != null) {
                    cds cdsVar4 = (cds) iepVar.d.b;
                    if (cdsVar4 == null || cdsVar4.a.f == 3 || !cdsVar4.c()) {
                        j = 4294967295L;
                        jpa.x0(opfVar, g, iepVar.c, 0.0f, null, 60);
                    } else {
                        float intBitsToFloat = Float.intBitsToFloat((int) (ou3Var.e() >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (ou3Var.e() & 4294967295L));
                        nsh nshVar2 = ou3Var.b;
                        long B = nshVar2.B();
                        nshVar2.s().r();
                        try {
                            ((xzi) nshVar2.b).W(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, 1);
                            nshVar = nshVar2;
                            try {
                                j = 4294967295L;
                                j2 = B;
                                try {
                                    jpa.x0(opfVar, g, iepVar.c, 0.0f, null, 60);
                                    vz1.A(nshVar, j2);
                                } catch (Throwable th) {
                                    th = th;
                                    vz1.A(nshVar, j2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                j2 = B;
                                vz1.A(nshVar, j2);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            nshVar = nshVar2;
                        }
                    }
                    mu3 s = ou3Var.b.s();
                    cdsVar = U0(opfVar).n;
                    if (cdsVar != null) {
                        xq0.q("You must call layoutWithConstraints first");
                        return;
                    }
                    ogi ogiVar = cdsVar.b;
                    boolean z2 = cdsVar.c() && this.s != 3;
                    if (z2) {
                        long j3 = cdsVar.c;
                        ynn d = ywf.d(0L, (Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j3 & j)) & j));
                        s.r();
                        mu3.v(s, d);
                    }
                    try {
                        c4r c4rVar = this.p.a;
                        aas aasVar = c4rVar.m;
                        if (aasVar == null) {
                            aasVar = aas.b;
                        }
                        aas aasVar2 = aasVar;
                        otp otpVar = c4rVar.n;
                        if (otpVar == null) {
                            otpVar = otp.d;
                        }
                        otp otpVar2 = otpVar;
                        kpa kpaVar = c4rVar.p;
                        if (kpaVar == null) {
                            kpaVar = dbc.a;
                        }
                        kpa kpaVar2 = kpaVar;
                        ai3 c = c4rVar.a.c();
                        if (c != null) {
                            ogiVar.m(s, c, this.p.a.a.b(), otpVar2, aasVar2, kpaVar2);
                            mu3Var = s;
                        } else {
                            mu3Var = s;
                            try {
                                a95 a95Var = this.z;
                                long a = a95Var != null ? a95Var.a() : d85.n;
                                if (a == 16) {
                                    a = this.p.c() != 16 ? this.p.c() : d85.b;
                                }
                                ogi.l(ogiVar, mu3Var, a, otpVar2, aasVar2, kpaVar2, 32);
                            } catch (Throwable th4) {
                                th = th4;
                                if (z2) {
                                    mu3Var.k();
                                }
                                throw th;
                            }
                        }
                        if (z2) {
                            mu3Var.k();
                        }
                        r9s r9sVar = this.E;
                        if (!((r9sVar == null || !r9sVar.c) ? fxf.C(this.o) : false)) {
                            List list = this.w;
                            if (list == null || list.isEmpty()) {
                                return;
                            }
                        }
                        opfVar.a();
                        return;
                    } catch (Throwable th5) {
                        th = th5;
                        mu3Var = s;
                    }
                }
            }
        }
        j = 4294967295L;
        mu3 s2 = ou3Var.b.s();
        cdsVar = U0(opfVar).n;
        if (cdsVar != null) {
        }
    }
}
