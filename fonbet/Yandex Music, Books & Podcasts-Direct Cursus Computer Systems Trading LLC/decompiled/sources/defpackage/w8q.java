package defpackage;

import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class w8q implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ d85 e;

    public /* synthetic */ w8q(float f, String str, boolean z, d85 d85Var) {
        this.d = f;
        this.b = str;
        this.c = z;
        this.e = d85Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        long j;
        yci u;
        oq5 oq5Var;
        boolean z2;
        long j2;
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                hz2 hz2Var = b2c.l;
                lx0 lx0Var = qx0.e;
                oq5 oq5Var3 = (oq5) hq5Var;
                float f = this.d;
                boolean c = oq5Var3.c(f);
                Object K = oq5Var3.K();
                kjn kjnVar = gq5.a;
                if (c || K == kjnVar) {
                    K = new y8q(f);
                    oq5Var3.k0(K);
                }
                vci vciVar = vci.a;
                yci s = wyf.s(vciVar, (Function0) K);
                nho a = lho.a(lx0Var, hz2Var, oq5Var3, 54);
                int i = oq5Var3.P;
                a l = oq5Var3.l();
                yci H = vnj.H(oq5Var3, s);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(oq5Var3, a, wp5.f);
                g0g.U(oq5Var3, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var3, i, kb5Var);
                }
                g0g.U(oq5Var3, H, wp5.d);
                Object K2 = oq5Var3.K();
                if (K2 == kjnVar) {
                    K2 = tlm.h(0.0f, oq5Var3);
                }
                poi poiVar = (poi) K2;
                String str = this.b;
                int length = str.length();
                boolean z3 = this.c;
                d85 d85Var = this.e;
                d51 d51Var = hd6.a;
                qho qhoVar = qho.a;
                if (length <= 26) {
                    oq5Var3.Z(-1557144899);
                    int N = (int) ((jx7) oq5Var3.j(es5.h)).N(v7g.z(16));
                    w4k E = a0g.E(z3 ? R.drawable.ic_pause_small_24 : R.drawable.ic_play_small_24, 0, oq5Var3);
                    agr agrVar = eq0.a;
                    d43 d43Var = new d43(((dq0) oq5Var3.j(agrVar)).a.a, 5);
                    yci e = d.e(d.r(vciVar, ff7.P(v7g.z(24), oq5Var3)), ff7.P(v7g.z(18), oq5Var3));
                    boolean d = oq5Var3.d(N);
                    Object K3 = oq5Var3.K();
                    if (d || K3 == kjnVar) {
                        K3 = new cv0(N, 7);
                        oq5Var3.k0(K3);
                    }
                    yci c2 = qhoVar.c(e, (Function1) K3);
                    Object K4 = oq5Var3.K();
                    if (K4 == kjnVar) {
                        K4 = new rp(poiVar, 2);
                        oq5Var3.k0(K4);
                    }
                    irf.r(E, null, androidx.compose.foundation.layout.a.i(c2, (Function1) K4), null, d51Var, 0.0f, d43Var, oq5Var3, 24624, 40);
                    h6g h6gVar = nu0.a;
                    h6g h6gVar2 = h6g.c;
                    ges b = nu0.b();
                    if (d85Var == null) {
                        oq5Var3.Z(1750913336);
                        j2 = ((dq0) oq5Var3.j(agrVar)).b.a;
                        z2 = false;
                        oq5Var3.p(false);
                    } else {
                        z2 = false;
                        oq5Var3.Z(1750912282);
                        oq5Var3.p(false);
                        j2 = d85Var.a;
                    }
                    long j3 = j2;
                    yci f2 = androidx.compose.ui.platform.a.a(qhoVar.a(1.0f, vciVar, z2), "wave_button_title").f(new WithAlignmentLineElement(j40.a));
                    o9s o9sVar = new o9s(3);
                    Object K5 = oq5Var3.K();
                    if (K5 == kjnVar) {
                        K5 = new rp(poiVar, 3);
                        oq5Var3.k0(K5);
                    }
                    xcs.b(str, f2, j3, 0L, null, 0L, null, o9sVar, 0L, 2, false, 1, 0, (Function1) K5, b, oq5Var3, 0, 199728, 22008);
                    oq5Var = oq5Var3;
                    u1g.l(oq5Var, d.r(vciVar, ff7.P(v7g.z(24), oq5Var)));
                    oq5Var.p(false);
                } else {
                    oq5Var3.Z(-1555656682);
                    int N2 = (int) ((jx7) oq5Var3.j(es5.h)).N(v7g.z(12));
                    w4k E2 = a0g.E(z3 ? R.drawable.ic_pause_small_24 : R.drawable.ic_play_small_24, 0, oq5Var3);
                    agr agrVar2 = eq0.a;
                    d43 d43Var2 = new d43(((dq0) oq5Var3.j(agrVar2)).a.a, 5);
                    yci e2 = d.e(d.r(vciVar, ff7.P(v7g.z(20), oq5Var3)), ff7.P(v7g.z(14), oq5Var3));
                    boolean d2 = oq5Var3.d(N2);
                    Object K6 = oq5Var3.K();
                    if (d2 || K6 == kjnVar) {
                        K6 = new cv0(N2, 7);
                        oq5Var3.k0(K6);
                    }
                    yci c3 = qhoVar.c(e2, (Function1) K6);
                    Object K7 = oq5Var3.K();
                    if (K7 == kjnVar) {
                        K7 = new rp(poiVar, 4);
                        oq5Var3.k0(K7);
                    }
                    irf.r(E2, null, androidx.compose.foundation.layout.a.i(c3, (Function1) K7), null, d51Var, 0.0f, d43Var2, oq5Var3, 24624, 40);
                    h6g h6gVar3 = nu0.a;
                    h6g h6gVar4 = h6g.c;
                    ges a2 = nu0.a();
                    if (d85Var == null) {
                        oq5Var3.Z(1750961592);
                        j = ((dq0) oq5Var3.j(agrVar2)).b.a;
                        z = false;
                        oq5Var3.p(false);
                    } else {
                        z = false;
                        oq5Var3.Z(1750960538);
                        oq5Var3.p(false);
                        j = d85Var.a;
                    }
                    u = d.u(androidx.compose.ui.platform.a.a(qhoVar.a(1.0f, vciVar, z), "wave_button_title").f(new WithAlignmentLineElement(j40.a)), b2c.l, (r2 & 2) == 0);
                    Object K8 = oq5Var3.K();
                    if (K8 == kjnVar) {
                        K8 = new rp(poiVar, 5);
                        oq5Var3.k0(K8);
                    }
                    q5g.n(str, u, a2, (Function1) K8, 2, j, 3, 2, oq5Var3, 12610560);
                    oq5Var = oq5Var3;
                    u1g.l(oq5Var, d.r(vciVar, ff7.P(v7g.z(20), oq5Var)));
                    oq5Var.p(false);
                }
                oq5Var.p(true);
                break;
            default:
                ((Integer) obj2).getClass();
                e9q.j(this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(24577));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ w8q(String str, boolean z, float f, d85 d85Var, int i) {
        this.b = str;
        this.c = z;
        this.d = f;
        this.e = d85Var;
    }
}
