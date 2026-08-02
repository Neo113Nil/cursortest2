package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import yads.oy;
import yads.pf1;
import yads.yo;

/* loaded from: classes7.dex */
public final class y381 {
    public static final Object b = new Object();
    public final pf1 a;

    public y381(Context context) {
        this.a = s881.a(context, "YadPreferenceFile");
    }

    public void a(gg81 gg81Var) {
        String str;
        String str2;
        synchronized (b) {
            try {
                this.a.a(oy.i.a(), gg81Var.F());
                this.a.a(oy.S.a(), gg81Var.j0());
                this.a.b(oy.k.a(), gg81Var.r());
                this.a.b(oy.T.a(), gg81Var.u0());
                this.a.a(oy.c.a(), gg81Var.H0());
                this.a.a(oy.d.a(), gg81Var.q());
                this.a.a(oy.e.a(), gg81Var.w());
                this.a.a(oy.y.a(), gg81Var.g());
                this.a.b(oy.f.a(), gg81Var.r0());
                this.a.b(oy.w.a(), gg81Var.J());
                this.a.b(oy.x.a(), gg81Var.I());
                this.a.b(gg81Var.P(), oy.g.a());
                this.a.b(oy.u.a(), gg81Var.y0());
                this.a.b(oy.v.a(), gg81Var.C0());
                this.a.b(oy.G.a(), gg81Var.m0());
                this.a.b(oy.I.a(), gg81Var.k0());
                pf1 pf1Var = this.a;
                oy oyVar = oy.H;
                pf1Var.b(oyVar.a(), gg81Var.t);
                this.a.b(oy.J.a(), gg81Var.K0());
                this.a.b(oy.M.a(), gg81Var.I0());
                this.a.a(oy.N.a(), gg81Var.k());
                this.a.b(oy.O.a(), gg81Var.M());
                this.a.b(oy.P.a(), gg81Var.K());
                this.a.b(oy.Q.a(), gg81Var.o0());
                pf1 pf1Var2 = this.a;
                oy oyVar2 = oy.R;
                pf1Var2.b(oyVar2.a(), gg81Var.C);
                this.a.b(gg81Var.s(), oy.B.a());
                this.a.a(oy.C.a(), gg81Var.o());
                this.a.a(oy.D.a(), gg81Var.m());
                this.a.a(oy.V.a(), gg81Var.N());
                this.a.a(oy.W.a(), gg81Var.t0());
                this.a.a(oy.a0.a(), gg81Var.f0());
                Boolean z = gg81Var.z();
                Boolean b2 = gg81Var.b();
                boolean s0 = gg81Var.s0();
                boolean M0 = gg81Var.M0();
                Boolean v = gg81Var.v();
                boolean E0 = gg81Var.E0();
                boolean G0 = gg81Var.G0();
                boolean j = gg81Var.j();
                boolean l = gg81Var.l();
                boolean q0 = gg81Var.q0();
                boolean h = gg81Var.h();
                boolean i0 = gg81Var.i0();
                boolean w0 = gg81Var.w0();
                Integer T = gg81Var.T();
                Integer B = gg81Var.B();
                yo h0 = gg81Var.h0();
                boolean z2 = gg81Var.t;
                boolean z3 = gg81Var.C;
                Boolean c0 = gg81Var.c0();
                boolean g0 = gg81Var.g0();
                boolean d = gg81Var.d();
                boolean t = gg81Var.t();
                lx71.b(this.a, oy.h.a(), z);
                lx71.b(this.a, oy.j.a(), b2);
                lx71.b(this.a, oy.l.a(), Boolean.valueOf(s0));
                lx71.b(this.a, oy.m.a(), Boolean.valueOf(M0));
                lx71.b(this.a, oy.n.a(), v);
                lx71.b(this.a, oy.p.a(), Boolean.valueOf(E0));
                lx71.b(this.a, oy.o.a(), Boolean.valueOf(G0));
                lx71.b(this.a, oy.q.a(), Boolean.valueOf(j));
                lx71.b(this.a, oy.r.a(), Boolean.valueOf(l));
                lx71.b(this.a, oyVar.a(), Boolean.valueOf(z2));
                lx71.b(this.a, oy.z.a(), Boolean.valueOf(q0));
                lx71.b(this.a, oy.A.a(), Boolean.valueOf(h));
                lx71.b(this.a, oy.U.a(), c0);
                lx71.b(this.a, oy.X.a(), Boolean.valueOf(g0));
                lx71.b(this.a, oy.K.a(), Boolean.valueOf(i0));
                lx71.b(this.a, oy.L.a(), Boolean.valueOf(w0));
                lx71.c(this.a, oy.s.a(), T);
                lx71.c(this.a, oy.t.a(), B);
                if (h0 != null) {
                    zcx zcxVar = ej61.a;
                    ej61.c(this.a, h0);
                } else {
                    zcx zcxVar2 = ej61.a;
                    ej61.e(this.a);
                }
                qi61 v0 = gg81Var.v0();
                if (v0 != null) {
                    this.a.a(oy.E.a(), v0.a());
                    this.a.b(v0.b(), oy.F.a());
                }
                lx71.b(this.a, oyVar2.a(), Boolean.valueOf(z3));
                this.a.b(oy.Y.a(), d);
                this.a.b(oy.Z.a(), t);
                this.a.a(oy.b0.a(), gg81Var.Q());
                pf1 pf1Var3 = this.a;
                String a = oy.c0.a();
                Map O = gg81Var.O();
                String str3 = null;
                pf1Var3.a(a, O != null ? ra81.a(O) : null);
                this.a.b(oy.d0.a(), gg81Var.e0());
                this.a.b(oy.e0.a(), gg81Var.A0());
                this.a.b(oy.f0.a(), gg81Var.n());
                this.a.b(oy.g0.a(), gg81Var.f());
                this.a.b(oy.h0.a(), gg81Var.x());
                this.a.b(oy.i0.a(), gg81Var.p0());
                this.a.b(oy.j0.a(), gg81Var.x0());
                this.a.b(oy.k0.a(), gg81Var.V());
                pf1 pf1Var4 = this.a;
                String a2 = oy.l0.a();
                Long X = gg81Var.X();
                if (X != null) {
                    pf1Var4.a(a2, X.longValue());
                } else {
                    pf1Var4.d(a2);
                }
                pf1 pf1Var5 = this.a;
                String a3 = oy.m0.a();
                Long Z = gg81Var.Z();
                if (Z != null) {
                    pf1Var5.a(a3, Z.longValue());
                } else {
                    pf1Var5.d(a3);
                }
                this.a.b(oy.n0.a(), gg81Var.z0());
                lx71.c(this.a, oy.o0.a(), gg81Var.F0());
                lx71.c(this.a, oy.p0.a(), gg81Var.D0());
                lx71.b(this.a, oy.q0.a(), gg81Var.B0());
                this.a.b(oy.r0.a(), gg81Var.l0());
                this.a.a(oy.s0.a(), zi81.a(gg81Var.n0()));
                this.a.b(oy.t0.a(), gg81Var.U());
                this.a.b(oy.u0.a(), gg81Var.b0());
                this.a.b(oy.v0.a(), gg81Var.d0());
                lx71.c(this.a, oy.w0.a(), gg81Var.u());
                lx71.c(this.a, oy.x0.a(), gg81Var.e());
                lx71.c(this.a, oy.y0.a(), gg81Var.Y());
                lx71.c(this.a, oy.z0.a(), gg81Var.W());
                this.a.a(oy.A0.a(), t481.b(gg81Var.R()));
                pf1 pf1Var6 = this.a;
                String a4 = oy.L0.a();
                ty61 L0 = gg81Var.L0();
                if (L0 != null) {
                    rbx rbxVar = sbx.d;
                    rbxVar.getClass();
                    ty61.Companion.getClass();
                    str = rbxVar.c(L0, rj61.a);
                } else {
                    str = null;
                }
                pf1Var6.a(a4, str);
                this.a.b(oy.B0.a(), gg81Var.E());
                zia1.a(this.a, oy.C0.a(), gg81Var.J0());
                this.a.b(oy.D0.a(), gg81Var.H());
                this.a.b(oy.E0.a(), gg81Var.L());
                this.a.b(oy.F0.a(), gg81Var.y());
                this.a.b(oy.G0.a(), gg81Var.a0());
                this.a.b(oy.H0.a(), gg81Var.A());
                lx71.c(this.a, oy.I0.a(), gg81Var.i());
                this.a.b(oy.J0.a(), gg81Var.c());
                this.a.b(oy.K0.a(), gg81Var.D());
                this.a.b(oy.M0.a(), gg81Var.a());
                this.a.b(oy.O0.a(), gg81Var.S());
                this.a.b(oy.P0.a(), gg81Var.p());
                bo71 G = gg81Var.G();
                if (G != null) {
                    this.a.a(oy.N0.a(), G.a());
                }
                pf1 pf1Var7 = this.a;
                String a5 = oy.Q0.a();
                ai81 C = gg81Var.C();
                if (C != null) {
                    rbx rbxVar2 = sbx.d;
                    rbxVar2.getClass();
                    ai81.Companion.getClass();
                    str2 = rbxVar2.c(C, sb81.a);
                } else {
                    str2 = null;
                }
                pf1Var7.a(a5, str2);
                List list = gg81Var.P0;
                pf1 pf1Var8 = this.a;
                if (list != null) {
                    String a6 = oy.R0.a();
                    List list2 = gg81Var.P0;
                    if (list2 != null) {
                        rbx rbxVar3 = sbx.d;
                        rbxVar3.getClass();
                        u671.Companion.getClass();
                        str3 = rbxVar3.c(list2, new p53(qp61.a, 0));
                    }
                    pf1Var8.a(a6, str3);
                } else {
                    pf1Var8.d(oy.R0.a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0607, code lost:
    
        if ((r0 instanceof kotlin.Result.Failure) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x05c5, code lost:
    
        if ((r0 instanceof kotlin.Result.Failure) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x04c9, code lost:
    
        if ((r0 instanceof kotlin.Result.Failure) != false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gg81 b() {
        gg81 gg81Var;
        Object failure;
        Map map;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Long l;
        Integer num;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        String str;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        Long l2;
        Object failure2;
        boolean z24;
        Boolean bool;
        Set set;
        Object failure3;
        Integer num2;
        Integer num3;
        boolean z25;
        Integer num4;
        Integer num5;
        jl61 jl61Var;
        boolean z26;
        Object failure4;
        boolean z27;
        List list;
        int i2;
        Object a;
        ai81 ai81Var;
        long j;
        Object a2;
        synchronized (b) {
            try {
                long b2 = this.a.b(oy.c.b);
                Boolean a3 = lx71.a(this.a, oy.h.b);
                if (b2 != 0) {
                    Integer d = lx71.d(this.a, oy.s.b);
                    Integer d2 = lx71.d(this.a, oy.t.b);
                    int a4 = this.a.a(0, oy.g.b);
                    int a5 = this.a.a(0, oy.B.b);
                    long b3 = this.a.b(oy.C.b);
                    long b4 = this.a.b(oy.D.b);
                    Boolean a6 = lx71.a(this.a, oy.j.b);
                    boolean a7 = this.a.a(oy.l.b, false);
                    boolean a8 = this.a.a(oy.m.b, false);
                    Boolean a9 = lx71.a(this.a, oy.n.b);
                    String c = this.a.c(oy.i.b);
                    String c2 = this.a.c(oy.V.b);
                    String c3 = this.a.c(oy.W.b);
                    String c4 = this.a.c(oy.S.b);
                    String c5 = this.a.c(oy.d.b);
                    String c6 = this.a.c(oy.e.b);
                    boolean a10 = this.a.a(oy.f.b, false);
                    boolean a11 = this.a.a(oy.k.b, false);
                    boolean a12 = this.a.a(oy.T.b, false);
                    boolean a13 = this.a.a(oy.p.b, false);
                    boolean a14 = this.a.a(oy.o.b, false);
                    boolean a15 = this.a.a(oy.q.b, false);
                    boolean a16 = this.a.a(oy.r.b, false);
                    boolean a17 = this.a.a(oy.w.b, false);
                    boolean a18 = this.a.a(oy.x.b, false);
                    boolean a19 = this.a.a(oy.u.b, false);
                    boolean a20 = this.a.a(oy.v.b, false);
                    boolean a21 = this.a.a(oy.z.b, false);
                    boolean a22 = this.a.a(oy.A.b, false);
                    boolean a23 = this.a.a(oy.J.b, false);
                    boolean a24 = this.a.a(oy.K.b, false);
                    boolean a25 = this.a.a(oy.L.b, false);
                    zcx zcxVar = ej61.a;
                    yo b5 = ej61.b(this.a);
                    String c7 = this.a.c(oy.E.b);
                    String c8 = this.a.c(oy.y.b);
                    Integer d3 = lx71.d(this.a, oy.F.b);
                    boolean a26 = this.a.a(oy.G.b, false);
                    boolean a27 = this.a.a(oy.I.b, false);
                    boolean a28 = this.a.a(oy.M.b, false);
                    String c9 = this.a.c(oy.N.b);
                    boolean a29 = this.a.a(oy.O.b, false);
                    boolean a30 = this.a.a(oy.P.b, false);
                    boolean a31 = this.a.a(oy.H.b, false);
                    boolean a32 = this.a.a(oy.Q.b, false);
                    boolean a33 = this.a.a(oy.R.b, false);
                    boolean a34 = this.a.a(oy.X.b, false);
                    Boolean a35 = lx71.a(this.a, oy.U.b);
                    boolean a36 = this.a.a(oy.Y.b, false);
                    boolean a37 = this.a.a(oy.Z.b, false);
                    String c10 = this.a.c(oy.a0.b);
                    String c11 = this.a.c(oy.b0.b);
                    String c12 = this.a.c(oy.c0.b);
                    if (c12 != null) {
                        try {
                            failure = ra81.b(new JSONObject(c12));
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        if (failure instanceof Result.Failure) {
                            failure = null;
                        }
                        map = (Map) failure;
                    } else {
                        map = null;
                    }
                    boolean a38 = this.a.a(oy.d0.b, false);
                    boolean a39 = this.a.a(oy.e0.b, false);
                    boolean a40 = this.a.a(oy.f0.b, false);
                    boolean a41 = this.a.a(oy.g0.b, false);
                    boolean a42 = this.a.a(oy.h0.b, false);
                    boolean a43 = this.a.a(oy.i0.b, false);
                    boolean a44 = this.a.a(oy.j0.b, false);
                    boolean a45 = this.a.a(oy.k0.b, false);
                    pf1 pf1Var = this.a;
                    String str2 = oy.l0.b;
                    if (!pf1Var.a(str2)) {
                        pf1Var = null;
                    }
                    if (pf1Var != null) {
                        z = a11;
                        z2 = a14;
                        z3 = a16;
                        z4 = a20;
                        z5 = a31;
                        z6 = a36;
                        z7 = a40;
                        z8 = a43;
                        l = Long.valueOf(pf1Var.b(str2));
                    } else {
                        z = a11;
                        z2 = a14;
                        z3 = a16;
                        z4 = a20;
                        z5 = a31;
                        z6 = a36;
                        z7 = a40;
                        z8 = a43;
                        l = null;
                    }
                    pf1 pf1Var2 = this.a;
                    String str3 = oy.m0.b;
                    if (!pf1Var2.a(str3)) {
                        pf1Var2 = null;
                    }
                    if (pf1Var2 != null) {
                        Long valueOf = Long.valueOf(pf1Var2.b(str3));
                        num = d3;
                        z9 = a27;
                        z10 = a29;
                        z11 = a33;
                        z12 = a38;
                        z13 = a42;
                        z14 = a45;
                        i = a4;
                        z15 = a13;
                        z16 = a15;
                        z17 = a19;
                        z18 = a21;
                        z19 = a26;
                        str = c9;
                        z20 = a32;
                        z21 = a37;
                        z22 = a41;
                        z23 = a44;
                        l2 = valueOf;
                    } else {
                        num = d3;
                        z9 = a27;
                        z10 = a29;
                        z11 = a33;
                        z12 = a38;
                        z13 = a42;
                        z14 = a45;
                        i = a4;
                        z15 = a13;
                        z16 = a15;
                        z17 = a19;
                        z18 = a21;
                        z19 = a26;
                        str = c9;
                        z20 = a32;
                        z21 = a37;
                        z22 = a41;
                        z23 = a44;
                        l2 = null;
                    }
                    Integer num6 = num;
                    int i3 = i;
                    boolean a46 = this.a.a(oy.n0.b, false);
                    Integer d4 = lx71.d(this.a, oy.o0.b);
                    Integer d5 = lx71.d(this.a, oy.p0.b);
                    Boolean a47 = lx71.a(this.a, oy.q0.b);
                    boolean a48 = this.a.a(oy.r0.b, false);
                    String c13 = this.a.c(oy.s0.b);
                    if (c13 != null) {
                        try {
                            failure2 = zi81.b(new JSONArray(c13));
                        } catch (Throwable th2) {
                            failure2 = new Result.Failure(th2);
                        }
                        if (failure2 instanceof Result.Failure) {
                            failure2 = null;
                        }
                        z24 = a46;
                        bool = a47;
                        set = (Set) failure2;
                    } else {
                        z24 = a46;
                        bool = a47;
                        set = null;
                    }
                    boolean a49 = this.a.a(oy.t0.b, false);
                    boolean a50 = this.a.a(oy.u0.b, true);
                    boolean a51 = this.a.a(oy.v0.b, false);
                    Integer d6 = lx71.d(this.a, oy.w0.b);
                    Integer d7 = lx71.d(this.a, oy.x0.b);
                    Integer d8 = lx71.d(this.a, oy.y0.b);
                    Integer d9 = lx71.d(this.a, oy.z0.b);
                    String c14 = this.a.c(oy.A0.b);
                    if (c14 != null) {
                        try {
                            failure3 = t481.a(new JSONObject(c14));
                        } catch (Throwable th3) {
                            failure3 = new Result.Failure(th3);
                        }
                        if (failure3 instanceof Result.Failure) {
                            failure3 = null;
                        }
                        num2 = num6;
                        num3 = d4;
                        z25 = a49;
                        num4 = d6;
                        num5 = d8;
                        jl61Var = (jl61) failure3;
                    } else {
                        num2 = num6;
                        num3 = d4;
                        z25 = a49;
                        num4 = d6;
                        num5 = d8;
                        jl61Var = null;
                    }
                    Integer num7 = num2;
                    String c15 = this.a.c(oy.L0.b);
                    if (c15 != null) {
                        try {
                            zcx zcxVar2 = u181.a;
                            zcxVar2.getClass();
                            ty61.Companion.getClass();
                            z26 = a51;
                            try {
                                failure4 = zcxVar2.b(rj61.a, c15);
                            } catch (Throwable th4) {
                                th = th4;
                                failure4 = new Result.Failure(th);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            z26 = a51;
                        }
                    } else {
                        z26 = a51;
                    }
                    failure4 = null;
                    ty61 ty61Var = (ty61) failure4;
                    boolean a52 = this.a.a(oy.B0.b, false);
                    String c16 = this.a.c(oy.C0.b);
                    if (c16 != null) {
                        z27 = a52;
                        list = evu0.W(c16, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
                    } else {
                        z27 = a52;
                        list = null;
                    }
                    if (list == null) {
                        list = EmptyList.a;
                    }
                    List list2 = list;
                    boolean a53 = this.a.a(oy.D0.b, false);
                    boolean a54 = this.a.a(oy.E0.b, false);
                    boolean a55 = this.a.a(oy.F0.b, false);
                    boolean a56 = this.a.a(oy.G0.b, false);
                    boolean a57 = this.a.a(oy.H0.b, false);
                    Integer d10 = lx71.d(this.a, oy.I0.b);
                    boolean a58 = this.a.a(oy.J0.b, false);
                    boolean a59 = this.a.a(oy.K0.b, false);
                    boolean a60 = this.a.a(oy.M0.b, false);
                    boolean a61 = this.a.a(oy.O0.b, false);
                    boolean a62 = this.a.a(oy.P0.b, false);
                    String c17 = this.a.c(oy.N0.b);
                    String c18 = this.a.c(oy.Q0.b);
                    if (c18 != null) {
                        try {
                            zcx zcxVar3 = u181.a;
                            zcxVar3.getClass();
                            ai81.Companion.getClass();
                            i2 = a5;
                            try {
                                a = zcxVar3.b(sb81.a, c18);
                            } catch (Throwable th6) {
                                th = th6;
                                a = b.a(th);
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            i2 = a5;
                        }
                    } else {
                        i2 = a5;
                    }
                    a = null;
                    ai81 ai81Var2 = (ai81) a;
                    String c19 = this.a.c(oy.R0.a());
                    if (c19 != null) {
                        try {
                            zcx zcxVar4 = u181.a;
                            zcxVar4.getClass();
                            u671.Companion.getClass();
                            ai81Var = ai81Var2;
                            try {
                                j = b3;
                                try {
                                    a2 = zcxVar4.b(new p53(qp61.a, 0), c19);
                                } catch (Throwable th8) {
                                    th = th8;
                                    a2 = b.a(th);
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                j = b3;
                                a2 = b.a(th);
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            ai81Var = ai81Var2;
                        }
                    } else {
                        ai81Var = ai81Var2;
                        j = b3;
                    }
                    a2 = null;
                    List list3 = (List) a2;
                    gg81Var = new gg81(i3, i2, j, b4, b2, a10, a7, a8, z, a12, z2, z15, z16, z3, z17, z4, a18, a17, z18, z5, z19, z9, a22, a28, str, z10, a30, z20, z11, a34, z6, z21, z12, a39, z7, z22, z13, d, d2, a9, a35, a23, a3, c10, c5, c6, c, c4, c8, c2, c3, a6, (c7 == null || num7 == null) ? null : new qi61(c7, num7.intValue()), a24, a25, b5, c11, map, z8, z23, z14, l, l2, z24, num3, d5, bool, a48, set, z25, a50, z26, num4, d7, num5, d9, jl61Var, z27, list2, a53, a54, a55, a56, a57, d10, a58, a59, ty61Var, a60, a61, c17 != null ? new bo71(c17) : null, ai81Var, a62, list3);
                } else {
                    gg81Var = null;
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
        return gg81Var;
    }

    public /* synthetic */ y381(pf1 pf1Var) {
        this.a = pf1Var;
    }
}
