package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline;

import androidx.compose.animation.g;
import androidx.compose.animation.k;
import defpackage.a6n;
import defpackage.a7u0;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bb1;
import defpackage.bdz0;
import defpackage.bts;
import defpackage.c530;
import defpackage.c9n;
import defpackage.cjf0;
import defpackage.cma1;
import defpackage.cvd0;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dvd0;
import defpackage.el51;
import defpackage.evd0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.gl51;
import defpackage.gxv;
import defpackage.id00;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m4m0;
import defpackage.o430;
import defpackage.o9n;
import defpackage.ohd;
import defpackage.osv;
import defpackage.ot6;
import defpackage.oz40;
import defpackage.p9n;
import defpackage.pi6;
import defpackage.q07;
import defpackage.q9n;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sb2;
import defpackage.sbn;
import defpackage.scc;
import defpackage.sic;
import defpackage.sls;
import defpackage.t1a1;
import defpackage.teb;
import defpackage.tls;
import defpackage.tra1;
import defpackage.u3b1;
import defpackage.ubn;
import defpackage.unr0;
import defpackage.urm;
import defpackage.v4v;
import defpackage.w9n;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.z5b1;
import defpackage.z910;
import defpackage.zpn;
import java.util.List;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline.a;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(f530 f530Var, bdz0 bdz0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(837620728);
        int i2 = (btsVar.k(bdz0Var) ? 32 : 16) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            btsVar.e0(-2093717849);
            int i3 = 0;
            for (Object obj : bdz0Var.b) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw null;
                }
                evd0 evd0Var = (evd0) obj;
                if (i3 != scc.f(bdz0Var.b)) {
                    btsVar.e0(1878142135);
                    if (evd0Var instanceof dvd0) {
                        btsVar.e0(1878194587);
                        if (1.0f <= 0.0d) {
                            gxv.a("invalid weight; must be greater than zero");
                        }
                        i(ljs0.e(new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 6.0f), 0L, 0L, btsVar, 0);
                        btsVar.t(false);
                    } else {
                        if (!(evd0Var instanceof cvd0)) {
                            throw unr0.y(1030416555, btsVar, false);
                        }
                        btsVar.e0(1878552885);
                        if (1.0f <= 0.0d) {
                            gxv.a("invalid weight; must be greater than zero");
                        }
                        cvd0 cvd0Var = (cvd0) evd0Var;
                        h(ljs0.e(new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 6.0f), cvd0Var.b, cvd0Var.c, i3 <= bdz0Var.a, 0L, 0L, btsVar, 0);
                        btsVar.t(false);
                    }
                    btsVar.t(false);
                } else {
                    btsVar.e0(1879029572);
                    btsVar.t(false);
                }
                i3 = i4;
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new o9n(f530Var, bdz0Var, i, 1);
        }
    }

    public static final void b(f530 f530Var, w9n w9nVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1083970726);
        int i2 = (btsVar.k(w9nVar) ? 32 : 16) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            sic a = qic.a(lr20.e, x4c.G, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            c9n c9nVar = new c9n(0);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new DynamicSearchTimelineKt$DynamicSearchTimeline$1$state$2$1(w9nVar, null);
                btsVar.o0(Q);
            }
            oz40 l = androidx.compose.runtime.f.l(c9nVar, w9nVar, (wls) Q, btsVar, i3);
            c(an91.m(c530.a, 32.0f, 0.0f, 2), ((c9n) l.getValue()).a, btsVar, 6);
            t1a1.c(((c9n) l.getValue()).b, 0L, btsVar, 54);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a6n(f530Var, w9nVar, i, 2);
        }
    }

    public static final void c(f530 f530Var, bdz0 bdz0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1248963869);
        int i2 = (btsVar.k(bdz0Var) ? 32 : 16) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new teb(20);
                btsVar.o0(Q);
            }
            f530 a = fnq0.a(f530Var, (tls) Q);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, a);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            c530 c530Var = c530.a;
            int i3 = (i2 & 112) | 6;
            a(an91.m(c530Var, 24.0f, 0.0f, 2), bdz0Var, btsVar, i3);
            f(ljs0.c(c530Var, 1.0f), bdz0Var, btsVar, i3);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new o9n(f530Var, bdz0Var, i, 0);
        }
    }

    public static final void d(long j, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1189846467);
        int i2 = (btsVar.d(j) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            pi6.a(m4m0.b(ljs0.m(c530.a, 8.0f), j, cyk0.a), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ot6(i, 2, j);
        }
    }

    public static final void e(int i, long j, fid fidVar, v4v v4vVar, boolean z) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1385254353);
        int i2 = 2;
        int i3 = i | (btsVar.d(j) ? 4 : 2) | (btsVar.k(v4vVar) ? 32 : 16) | (btsVar.a(z) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            f530 m = ljs0.m(c530.a, 48.0f);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, m);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            int i4 = i3 & 14;
            d(j, btsVar, i4);
            boolean z2 = v4vVar != null && z;
            if (z2) {
                btsVar.e0(-131520605);
                g(j, btsVar, i4);
                btsVar.t(false);
            } else {
                btsVar.e0(-131480243);
                btsVar.t(false);
            }
            g.e(z2, null, k.g(null, 0.0f, 7).a(k.e(null, 3)), k.h(null, 0.0f, 7).a(k.f(null, 3)), null, wwg.S(1629150733, true, new q07(j, v4vVar, i2), btsVar), btsVar, 200064, 18);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new p9n(j, v4vVar, z, i);
        }
    }

    public static final void f(f530 f530Var, bdz0 bdz0Var, fid fidVar, int i) {
        long g;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1995275157);
        int i2 = (btsVar.k(bdz0Var) ? 32 : 16) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            lhl0 a = khl0.a(lr20.g, x4c.D, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            btsVar.e0(1622296211);
            List list = bdz0Var.b;
            int i3 = bdz0Var.a;
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    scc.m();
                    throw null;
                }
                evd0 evd0Var = (evd0) obj;
                if (i4 <= i3) {
                    btsVar.e0(1028458377);
                    g = ((el51) btsVar.m(gl51.a)).f();
                    btsVar.t(false);
                } else {
                    btsVar.e0(1028525864);
                    g = ((el51) btsVar.m(gl51.a)).g();
                    btsVar.t(false);
                }
                e(0, g, btsVar, evd0Var.a(), i4 == i3);
                i4 = i5;
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new o9n(f530Var, bdz0Var, i, 2);
        }
    }

    public static final void g(long j, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1011306126);
        int i3 = (btsVar.d(j) ? 4 : 2) | i;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            androidx.compose.animation.core.c g = z5b1.g(null, btsVar, 1);
            osv d = z5b1.d(g, 8.0f, 48.0f, sb2.w(sb2.K(2000, 0, sbn.b, 2), null, 0L, 6), null, btsVar, 4104, 8);
            float floatValue = ((Number) z5b1.d(g, 1.0f, 0.0f, sb2.w(sb2.K(2000, 0, ubn.d, 2), null, 0L, 6), null, btsVar, 4536, 8).w.getValue()).floatValue();
            i2 = 1;
            u3b1.g(tra1.b(c530.a, floatValue), ((Number) d.w.getValue()).floatValue(), j, 0.0f, null, btsVar, (i3 << 6) & 896, 24);
        } else {
            i2 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ot6(i, i2, j);
        }
    }

    public static final void h(final f530 f530Var, final long j, final float f, final boolean z, long j2, long j3, fid fidVar, final int i) {
        final long j4;
        bts btsVar;
        final long j5;
        int i2;
        long g;
        long j6;
        androidx.compose.animation.core.a aVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1008584434);
        int i3 = i | (btsVar2.k(f530Var) ? 4 : 2) | (btsVar2.d(j) ? 32 : 16) | (btsVar2.b(f) ? 256 : 128) | (btsVar2.a(z) ? 2048 : 1024) | 73728;
        if (btsVar2.V(i3 & 1, (74899 & i3) != 74898)) {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                a7u0 a7u0Var = gl51.a;
                long f2 = ((el51) btsVar2.m(a7u0Var)).f();
                i2 = i3 & (-516097);
                g = ((el51) btsVar2.m(a7u0Var)).g();
                j6 = f2;
            } else {
                btsVar2.Y();
                i2 = i3 & (-516097);
                j6 = j2;
                g = j3;
            }
            btsVar2.u();
            int i4 = i2 & 7168;
            int i5 = i2 & 896;
            boolean z2 = (i4 == 2048) | (i5 == 256);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = id00.a(f);
                btsVar2.o0(Q);
            }
            androidx.compose.animation.core.a aVar2 = (androidx.compose.animation.core.a) Q;
            Boolean valueOf = Boolean.valueOf(z);
            Float valueOf2 = Float.valueOf(f);
            boolean e = (i4 == 2048) | btsVar2.e(aVar2) | (i5 == 256) | ((i2 & 112) == 32);
            Object Q2 = btsVar2.Q();
            if (e || Q2 == o430Var) {
                aVar = aVar2;
                DynamicTimelineKt$TimelineDynamicConnector$1$1 dynamicTimelineKt$TimelineDynamicConnector$1$1 = new DynamicTimelineKt$TimelineDynamicConnector$1$1(z, aVar, f, j, null);
                btsVar2.o0(dynamicTimelineKt$TimelineDynamicConnector$1$1);
                Q2 = dynamicTimelineKt$TimelineDynamicConnector$1$1;
            } else {
                aVar = aVar2;
            }
            zpn.f(valueOf, valueOf2, (wls) Q2, btsVar2);
            long j7 = j6;
            long j8 = g;
            cjf0.c(((Number) aVar.e()).floatValue(), 0, j7, j8, btsVar2, bb1.i(f530Var, new urm(22)));
            btsVar = btsVar2;
            j5 = j8;
            j4 = j7;
        } else {
            btsVar2.Y();
            j4 = j2;
            btsVar = btsVar2;
            j5 = j3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(j, f, z, j4, j5, i) { // from class: r9n
                public final /* synthetic */ long b;
                public final /* synthetic */ float c;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ long x;
                public final /* synthetic */ long y;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(1);
                    a.h(f530.this, this.b, this.c, this.w, this.x, this.y, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void i(f530 f530Var, long j, long j2, fid fidVar, int i) {
        long j3;
        long j4;
        long f;
        long g;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-53949749);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.a(false) ? 32 : 16) | 1152;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                a7u0 a7u0Var = gl51.a;
                f = ((el51) btsVar.m(a7u0Var)).f();
                g = ((el51) btsVar.m(a7u0Var)).g();
            } else {
                btsVar.Y();
                f = j;
                g = j2;
            }
            btsVar.u();
            cjf0.c(0.0f, 0, f, g, btsVar, bb1.i(f530Var, new urm(22)));
            j3 = f;
            j4 = g;
        } else {
            btsVar.Y();
            j3 = j;
            j4 = j2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q9n(i, 0, j3, j4, f530Var);
        }
    }
}
