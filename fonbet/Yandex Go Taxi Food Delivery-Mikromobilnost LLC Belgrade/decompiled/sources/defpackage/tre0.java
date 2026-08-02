package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.payments.api.preorder.SuitabilityCheckType;
import com.yandex.go.preorder.navigation.h;
import com.yandex.go.route.interactor.b;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.preorder.ScheduledOrder;
import com.yandex.go.taxi.order.models.api.preorder.SelectedTariffInfo;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public final class tre0 extends BaseRootNavigationRouter implements fre0 {
    public final dqe0 D;
    public final jjv0 E;
    public final g F;
    public final q4l0 G;
    public final b H;
    public final h3y I;
    public final h3y J;
    public final icv0 K;
    public final BaseRootNavigationRouter.a L = new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.MAP, BaseRootNavigationRouter.AnimationType.STAR_WARS, 9);

    public tre0(dqe0 dqe0Var, jjv0 jjv0Var, g gVar, q4l0 q4l0Var, b bVar, h3y h3yVar, h3y h3yVar2, icv0 icv0Var) {
        this.D = dqe0Var;
        this.E = jjv0Var;
        this.F = gVar;
        this.G = q4l0Var;
        this.H = bVar;
        this.I = h3yVar;
        this.J = h3yVar2;
        this.K = icv0Var;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        if (t()) {
            return;
        }
        r(new qu(9));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        hre0 hre0Var;
        hre0 hre0Var2;
        hre0 hre0Var3;
        boolean z;
        qse0 qse0Var;
        rre0 rre0Var = (rre0) obj;
        ynv0 ynv0Var = rnv0.a;
        xpb1 xpb1Var = xpb1.c;
        dab1 dab1Var = dab1.b;
        if (rre0Var instanceof hre0) {
            hre0Var3 = (hre0) rre0Var;
        } else if (jl40.l(rre0Var, jre0.a)) {
            hre0Var3 = new hre0(new vpe0(new Preorder(0)), gse0.a, "show progress", true, new im0(false));
        } else {
            if (rre0Var instanceof mre0) {
                mre0 mre0Var = (mre0) rre0Var;
                dre0 dre0Var = mre0Var.a;
                Preorder preorder = new Preorder(0);
                preorder.o(dre0Var.b);
                Address address = dre0Var.c;
                if (address != null) {
                    preorder.a(preorder.G.i(address));
                } else {
                    preorder.p(this.D.b());
                }
                String str = dre0Var.a;
                if (str != null && str.length() != 0) {
                    SelectedTariffInfo.Companion.getClass();
                    preorder.m(new SelectedTariffInfo(str, Collections.singleton(str), false));
                }
                Calendar calendar = dre0Var.d;
                String str2 = dre0Var.f;
                if (calendar != null && str2 != null) {
                    Integer num = dre0Var.e;
                    ScheduledOrder scheduledOrder = preorder.S;
                    scheduledOrder.getClass();
                    Calendar calendar2 = (Calendar) calendar.clone();
                    scheduledOrder.a = calendar2;
                    scheduledOrder.b = calendar2;
                    scheduledOrder.c = str2;
                    scheduledOrder.d = 0;
                    scheduledOrder.e = num;
                }
                String str3 = dre0Var.g;
                if (str3 != null) {
                    preorder.R = str3;
                }
                List list = dre0Var.j;
                if (list != null) {
                    preorder.x = list;
                }
                String str4 = dre0Var.k;
                if (str4 != null) {
                    preorder.z = str4;
                    preorder.A = null;
                }
                vpe0 vpe0Var = new vpe0(preorder);
                dre0 dre0Var2 = mre0Var.a;
                boolean z2 = dre0Var2.h;
                k9s0 k9s0Var = mre0Var.b;
                hre0Var2 = new hre0(vpe0Var, z2 ? new fse0(k9s0Var) : new lse0(k9s0Var), dre0Var2.i, true, xpb1Var);
            } else {
                if (rre0Var instanceof lre0) {
                    lre0 lre0Var = (lre0) rre0Var;
                    Preorder preorder2 = lre0Var.a;
                    vpe0 vpe0Var2 = new vpe0(preorder2);
                    Iterator it = preorder2.G.b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else if (((Address) it.next()).getFinalSuggestAction() == null) {
                            z = true;
                            break;
                        }
                    }
                    k9s0 k9s0Var2 = k9s0.f;
                    khv0 khv0Var = lre0Var.d;
                    jjv0 jjv0Var = this.E;
                    if (!this.F.d()) {
                        ynv0Var = lre0Var.c;
                    }
                    jjv0Var.getClass();
                    k9s0 G = egz.G(true, khv0Var, jjv0.a(ynv0Var));
                    hre0Var = new hre0(vpe0Var2, !this.K.a(new SuitabilityCheckType[0]) ? new fse0(G) : (!z || lre0Var.a.G.b.isEmpty()) ? new lse0(G) : new pse0(G), lre0Var.b, true, dab1Var);
                } else if (rre0Var instanceof ore0) {
                    ore0 ore0Var = (ore0) rre0Var;
                    vpe0 vpe0Var3 = new vpe0(ore0Var.a);
                    k9s0 k9s0Var3 = k9s0.f;
                    bhv0 bhv0Var = new bhv0(0);
                    jjv0 jjv0Var2 = this.E;
                    if (!this.F.d()) {
                        ynv0Var = ore0Var.c;
                    }
                    jjv0Var2.getClass();
                    hre0Var = new hre0(vpe0Var3, new lse0(egz.G(true, bhv0Var, jjv0.a(ynv0Var))), ore0Var.b, true, dab1Var);
                } else if (rre0Var instanceof qre0) {
                    hre0Var2 = new hre0(((qre0) rre0Var).a, new kse0(), "show main screen with source suggest", true, xpb1Var);
                } else if (rre0Var instanceof pre0) {
                    hre0Var = new hre0(new vpe0(((rrj0) ((qrj0) this.I.get())).a()), new jse0(), ((pre0) rre0Var).a, true, dab1Var);
                } else if (rre0Var instanceof nre0) {
                    k9s0 k9s0Var4 = k9s0.f;
                    fhv0 fhv0Var = new fhv0(0);
                    jjv0 jjv0Var3 = this.E;
                    vnv0 vnv0Var = ((nre0) rre0Var).a;
                    jjv0Var3.getClass();
                    k9s0 G2 = egz.G(false, fhv0Var, jjv0.b(vnv0Var));
                    Preorder preorder3 = new Preorder(0);
                    preorder3.l(this.H.c());
                    hre0Var2 = new hre0(new vpe0(preorder3), new mse0(G2), "show summary with suggest", true, xpb1Var);
                } else if (jl40.l(rre0Var, ire0.a)) {
                    hre0Var = new hre0(new vpe0(((rrj0) ((qrj0) this.I.get())).a()), new jse0(), "handle route intent", true, dab1Var);
                } else {
                    if (!(rre0Var instanceof kre0)) {
                        w511.b();
                        return;
                    }
                    hre0Var = new hre0(new vpe0(((rrj0) ((qrj0) this.I.get())).a()), new ise0(((kre0) rre0Var).a), "open sdc route selection", true, dab1Var);
                }
                hre0Var3 = hre0Var;
            }
            hre0Var3 = hre0Var2;
        }
        q4l0 q4l0Var = this.G;
        t7z t7zVar = q4l0Var.a;
        if (t7zVar != null) {
            q4l0Var.a = null;
            qse0Var = new hse0(t7zVar);
        } else {
            qse0Var = hre0Var3.b;
        }
        qse0 qse0Var2 = qse0Var;
        h hVar = (h) this.J.get();
        if (gtq0.u(hVar)) {
            hVar.i();
        }
        A(hVar, new hre0(hre0Var3.a, qse0Var2, hre0Var3.c, hre0Var3.d, hre0Var3.e), new dl1(29, this));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.L;
    }
}
