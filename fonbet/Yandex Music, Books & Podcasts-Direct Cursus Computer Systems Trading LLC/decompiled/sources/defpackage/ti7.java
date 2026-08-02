package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class ti7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ti7(qw qwVar, bc5 bc5Var, float f, iwm iwmVar) {
        this.a = 1;
        this.b = qwVar;
        this.e = bc5Var;
        this.c = f;
        this.d = iwmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        bc5 bc5Var;
        iwm iwmVar;
        oq5 oq5Var;
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                etn.o((iwm) this.d, (qw) this.b, this.c, (yci) this.e, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 1:
                qw qwVar = (qw) this.b;
                bc5 bc5Var2 = (bc5) this.e;
                float f = this.c;
                b bVar = b.a;
                iwm iwmVar2 = (iwm) this.d;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                hz2 hz2Var = b2c.k;
                kjn kjnVar = gq5.a;
                iz2 iz2Var = b2c.j;
                if ((intValue & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                vci vciVar = vci.a;
                oq5 oq5Var3 = (oq5) hq5Var;
                boolean f2 = oq5Var3.f(bc5Var2);
                Object K = oq5Var3.K();
                if (f2 || K == kjnVar) {
                    bc5Var = bc5Var2;
                    iwmVar = iwmVar2;
                    oq5Var = oq5Var3;
                    ej6 ej6Var = new ej6(0, bc5Var, bc5.class, "onClick", "onClick()V", 0, 20);
                    oq5Var.k0(ej6Var);
                    K = ej6Var;
                } else {
                    bc5Var = bc5Var2;
                    oq5Var = oq5Var3;
                    iwmVar = iwmVar2;
                }
                etn.n(qwVar, a.d(d.r(androidx.compose.foundation.a.e(vciVar, false, null, null, (Function0) ((h9f) K), 7), f), 1.66f), oq5Var, 0);
                yci u = xp3.u(a.d(d.r(vciVar, f), 1.66f), o5g.G(oq5Var));
                Object K2 = oq5Var.K();
                if (K2 == kjnVar) {
                    K2 = new wh7(3);
                    oq5Var.k0(K2);
                }
                ug3.a(androidx.compose.ui.draw.a.b(u, (Function1) K2), oq5Var, 0);
                float f3 = 12;
                etn.q(qwVar, c3x.y(1, ((dq0) oq5Var.j(eq0.a)).c.c, xp3.u(d.m(bVar.a(a.m(vciVar, f3), b2c.h), 80), o5g.E(oq5Var)), o5g.E(oq5Var)), oq5Var, 0);
                Object K3 = oq5Var.K();
                if (K3 == kjnVar) {
                    lee.e.getClass();
                    K3 = lee.f;
                    oq5Var.k0(K3);
                }
                int ordinal = ((kee) K3).ordinal();
                if (ordinal == 0) {
                    iwm iwmVar3 = iwmVar;
                    oq5Var.Z(-297951366);
                    boolean h = oq5Var.h(iwmVar3) | oq5Var.h(qwVar);
                    Object K4 = oq5Var.K();
                    if (h || K4 == kjnVar) {
                        K4 = new vi7(iwmVar3, qwVar, 0);
                        oq5Var.k0(K4);
                    }
                    fgq.b(bc5Var, (Function0) K4, a.m(bVar.a(androidx.compose.ui.platform.a.a(vciVar, "promo_play_button"), iz2Var), f3), oq5Var, 0, 0);
                    oq5Var.p(false);
                } else if (ordinal == 1) {
                    iwm iwmVar4 = iwmVar;
                    oq5Var.Z(-1672161080);
                    yci g = a.g(a.m(bVar.a(vciVar, iz2Var), f3), hxe.a);
                    nho a = lho.a(qx0.a, hz2Var, oq5Var, 0);
                    int i = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, g);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                        ouj.x(i, oq5Var, i, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    boolean h2 = oq5Var.h(iwmVar4) | oq5Var.h(qwVar);
                    Object K5 = oq5Var.K();
                    if (h2 || K5 == kjnVar) {
                        K5 = new vi7(iwmVar4, qwVar, 1);
                        oq5Var.k0(K5);
                    }
                    fgq.e((Function0) K5, d.b(androidx.compose.ui.platform.a.a(vciVar, "promo_trailer_button"), 1.0f), oq5Var, 48);
                    u1g.l(oq5Var, d.r(vciVar, 8));
                    boolean h3 = oq5Var.h(iwmVar4) | oq5Var.h(qwVar);
                    Object K6 = oq5Var.K();
                    if (h3 || K6 == kjnVar) {
                        K6 = new vi7(iwmVar4, qwVar, 2);
                        oq5Var.k0(K6);
                    }
                    fgq.a(bc5Var, (Function0) K6, androidx.compose.ui.platform.a.a(vciVar, "promo_play_button"), oq5Var, 384);
                    oq5Var.p(true);
                    oq5Var.p(false);
                } else {
                    if (ordinal != 2) {
                        throw vz1.i(oq5Var, -1672180204, false);
                    }
                    oq5Var.Z(-1672127956);
                    yci g2 = a.g(a.m(bVar.a(vciVar, iz2Var), f3), hxe.a);
                    nho a2 = lho.a(qx0.a, hz2Var, oq5Var, 0);
                    int i2 = oq5Var.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, g2);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar2);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a2, wp5.f);
                    g0g.U(oq5Var, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var, i2, kb5Var2);
                    }
                    g0g.U(oq5Var, H2, wp5.d);
                    iwm iwmVar5 = iwmVar;
                    boolean h4 = oq5Var.h(iwmVar5) | oq5Var.h(qwVar);
                    Object K7 = oq5Var.K();
                    if (h4 || K7 == kjnVar) {
                        K7 = new vi7(iwmVar5, qwVar, 3);
                        oq5Var.k0(K7);
                    }
                    fgq.c(bc5Var, (Function0) K7, d.b(androidx.compose.ui.platform.a.a(vciVar, "promo_play_button"), 1.0f), oq5Var, 384);
                    u1g.l(oq5Var, d.r(vciVar, 8));
                    boolean h5 = oq5Var.h(iwmVar5) | oq5Var.h(qwVar);
                    Object K8 = oq5Var.K();
                    if (h5 || K8 == kjnVar) {
                        K8 = new vi7(iwmVar5, qwVar, 4);
                        oq5Var.k0(K8);
                    }
                    fgq.d((Function0) K8, androidx.compose.ui.platform.a.a(vciVar, "promo_trailer_button"), oq5Var, 48);
                    oq5Var.p(true);
                    oq5Var.p(false);
                }
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                fxf.l((iwm) this.d, (qw) this.b, (pu0) this.e, this.c, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 3:
                lnu lnuVar = (lnu) this.d;
                owu owuVar = (owu) this.b;
                yci yciVar = (yci) this.e;
                float f4 = this.c;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var2;
                if (oq5Var4.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    l18 l18Var = l18.b;
                    bdt I = hag.I(qy7.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    e9q.b(lnuVar, owuVar, (qy7) qdcVar.C(I), yciVar, f4, oq5Var4, 0, 0);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                szf.y((flv) this.d, (ukd) this.b, (plv) this.e, this.c, (hq5) obj, rvf.R(1));
                return Unit.a;
        }
    }

    public /* synthetic */ ti7(float f, int i, int i2, Object obj, Object obj2, Object obj3) {
        this.a = i2;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = f;
    }

    public /* synthetic */ ti7(iwm iwmVar, qw qwVar, float f, yci yciVar, int i) {
        this.a = 0;
        this.d = iwmVar;
        this.b = qwVar;
        this.c = f;
        this.e = yciVar;
    }

    public /* synthetic */ ti7(lnu lnuVar, owu owuVar, yci yciVar, float f) {
        this.a = 3;
        this.d = lnuVar;
        this.b = owuVar;
        this.e = yciVar;
        this.c = f;
    }
}
