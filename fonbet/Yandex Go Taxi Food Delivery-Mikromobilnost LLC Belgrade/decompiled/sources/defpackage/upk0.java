package defpackage;

import android.content.Context;
import com.yandex.go.route.interactor.b;
import com.yandex.go.scooters.passes.active.v3.freeze.d;
import com.yandex.go.taxi.order.map.g;
import com.yandex.go.taxi.order.recenter.n;
import com.yandex.go.taxi.order.repositories.c;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.ybsdk.feature.savings.internal.screens.account.SavingsAccountFragment;
import com.ybsdk.feature.savings.internal.screens.close.SavingsAccountCloseFragment;
import com.ybsdk.feature.savings.internal.screens.close.deposit.SavingsAccountCloseDepositFragment;
import com.ybsdk.feature.savings.internal.screens.create.SavingsAccountCreationFragment;
import com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardFragmentV2;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsDashboardFragmentV4;
import com.ybsdk.feature.savings.internal.screens.diffrate.DiffRateCalendarFragment;
import com.ybsdk.feature.savings.internal.screens.fund.creation.FundCreationFragment;
import com.ybsdk.feature.savings.internal.screens.fund.operation.FundOperationFragment;
import com.ybsdk.feature.savings.internal.screens.goal.SavingsAccountGoalFragment;
import com.ybsdk.feature.savings.internal.screens.lock.SavingsAccountLockFragment;
import com.ybsdk.feature.savings.internal.screens.name.SavingsAccountNameFragment;
import ru.yandex.taxi.analytics.r;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes3.dex */
public final class upk0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ upk0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static upk0 a(eqh eqhVar) {
        return new upk0(eqhVar, 11);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 5;
        int i3 = 27;
        int i4 = 0;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new u8w((pho) xvf0Var.get());
            case 1:
                return new sue0(27, (pdc) xvf0Var.get());
            case 2:
                return new g((e) xvf0Var.get());
            case 3:
                return new p0l0((fgv0) xvf0Var.get());
            case 4:
                return new r1l0((ah00) xvf0Var.get());
            case 5:
                return new aye0(19, (f4l0) xvf0Var.get());
            case 6:
                return new c6l0((b) xvf0Var.get());
            case 7:
                return new ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point.b((ru.yandex.taxi.logistics.sdk.address_details.impl.ui.e) xvf0Var.get());
            case 8:
                re50 re50Var = (re50) xvf0Var.get();
                yxf0 yxf0Var = new yxf0();
                yxf0Var.a = re50Var;
                return yxf0Var;
            case 9:
                return new r((com.yandex.go.analytics.b) xvf0Var.get());
            case 10:
                return new pfl0((tzw0) xvf0Var.get());
            case 11:
                return new x770((pho) xvf0Var.get());
            case 12:
                xf41 a = ((scg) ((ff41) xvf0Var.get())).a();
                q5z.i(a);
                return a;
            case 13:
                return new o8g0((n) xvf0Var.get());
            case 14:
                return new b1m0(0, (v351) xvf0Var.get());
            case 15:
                return new ndm0((com.ybsdk.rconfig.b) xvf0Var.get());
            case 16:
                return new ucm0((ppc) xvf0Var.get());
            case 17:
                tw51 tw51Var = (tw51) xvf0Var.get();
                g7g g7gVar = new g7g(tw51Var, 13);
                int i5 = 2;
                g4m0 g4m0Var = new g4m0(g7gVar, i5);
                k6g k6gVar = new k6g(tw51Var, i3);
                int i6 = 1;
                x3m0 x3m0Var = new x3m0(k6gVar, g7gVar, i6);
                g7g g7gVar2 = new g7g(tw51Var, 7);
                eqh eqhVar = new eqh();
                g7g g7gVar3 = new g7g(tw51Var, i2);
                xvf0 b = i5m.b(new jzi0(18, new g7g(tw51Var, 6)));
                g7g g7gVar4 = new g7g(tw51Var, 9);
                g7g g7gVar5 = new g7g(tw51Var, i4);
                h69 h69Var = new h69(g7gVar5, 3);
                h69 h69Var2 = new h69(g7gVar5, i4);
                int i7 = 16;
                q150 q150Var = new q150(b, (xvf0) g7gVar4, (xvf0) g7gVar, (xvf0) new jpj0(g7gVar5, h69Var, h69Var2, i7), (xvf0) new mam0(h69Var2, g7gVar5, i4), (xvf0) new h69(g7gVar5, i5), (xvf0) new h69(g7gVar5, i6), 18);
                g7g g7gVar6 = new g7g(tw51Var, 3);
                xos xosVar = new xos(q150Var, g7gVar6, i6);
                g7g g7gVar7 = new g7g(tw51Var, i6);
                int i8 = 10;
                g7g g7gVar8 = new g7g(tw51Var, i8);
                v8c0 v8c0Var = new v8c0(n3w.a(new a5m0(new z4m0(x3m0Var, g7gVar2, eqhVar, g7gVar3, xosVar, g7gVar7, g7gVar8, 0))), i8);
                g7g g7gVar9 = new g7g(tw51Var, 11);
                g7g g7gVar10 = new g7g(tw51Var, 14);
                jpf0 jpf0Var = new jpf0((xvf0) g7gVar3, (xvf0) q150Var, 27);
                g7g g7gVar11 = new g7g(tw51Var, i7);
                n3w a2 = n3w.a(new zam0(new fcj0(g7gVar11, g7gVar6, g7gVar3, new jzi0(17, new g7g(tw51Var, 12)), q150Var)));
                g7g g7gVar12 = new g7g(tw51Var, 4);
                mam0 mam0Var = new mam0(n3w.a(new tbm0(new sbm0((Object) g7gVar, (Object) g7gVar2, (Object) g7gVar9, (Object) g7gVar7, (Object) g7gVar10, (Object) jpf0Var, (Object) dcm0.a, (Object) a2, (Object) g7gVar12))), new k6g(tw51Var, 28), 2);
                g7g g7gVar13 = new g7g(tw51Var, 18);
                mam0 mam0Var2 = new mam0(n3w.a(new ubm0(new m(g7gVar, g7gVar9, g7gVar7, g7gVar2, g7gVar13, g7gVar10, jpf0Var, new p8m0(k6gVar, g7gVar, g7gVar5), n3w.a(new abm0(new kdd0(q150Var, new g7g(tw51Var, 19), g7gVar3, g7gVar6))), g7gVar12))), g7gVar, 1);
                xvf0 b2 = i5m.b(new jzi0(16, q150Var));
                xvf0 b3 = i5m.b(new cta0(g7gVar11, q150Var, b2, g7gVar10, g7gVar3));
                vfg0 vfg0Var = new vfg0(n3w.a(new i8m0(new tt(g7gVar2, k6gVar, eqhVar, g7gVar3, b2, g7gVar, b3, g7gVar7, g7gVar8, g7gVar10, g7gVar9, g7gVar13, new p8m0(g7gVar, k6gVar, g7gVar5), g7gVar12))), g7gVar, new g7g(tw51Var, 17), g7gVar3, 22);
                z9n z9nVar = new z9n((xvf0) q150Var, (xvf0) g7gVar6, (xvf0) new k6g(tw51Var, 29), (xvf0) new g7g(tw51Var, 8), 14);
                g7g g7gVar14 = new g7g(tw51Var, 15);
                int i9 = 0;
                ens ensVar = new ens(n3w.a(new ons(new m(g7gVar3, g7gVar8, g7gVar7, g7gVar2, g7gVar10, k6gVar, g7gVar5, z9nVar, g7gVar14, new wns(k6gVar, 0)))), g7gVar14, i9);
                ens ensVar2 = new ens(n3w.a(new kps(new bu0(g7gVar3, g7gVar8, g7gVar7, g7gVar2, g7gVar10, new xos(q150Var, g7gVar6, i9), g7gVar14, g7gVar9, sps.a))), g7gVar14, 1);
                v8c0 v8c0Var2 = new v8c0(n3w.a(new c4m0(new fcj0(g7gVar2, g7gVar3, b3, g7gVar7, new g4m0(g7gVar, i9)))), 9);
                jpf0 jpf0Var2 = new jpf0((xvf0) n3w.a(new r3m0(new wrr(g7gVar2, k6gVar, g7gVar3, b3, g7gVar7, new x3m0(k6gVar, g7gVar, i9), g7gVar, 29))), (xvf0) g7gVar5, 28);
                v8c0 v8c0Var3 = new v8c0(n3w.a(new l7m0(new fcj0(g7gVar2, g7gVar3, g7gVar, b3, new wns(k6gVar, 1)))), 13);
                v8c0 v8c0Var4 = new v8c0(n3w.a(new q6m0(new v920(g7gVar2, g7gVar, b3, g7gVar3, g7gVar5, new jpf0((xvf0) k6gVar, (xvf0) g7gVar5, 29)))), 11);
                v8c0 v8c0Var5 = new v8c0(n3w.a(new d7m0(new kdd0(g7gVar2, g7gVar3, b3, new g4m0(g7gVar, 1)))), 12);
                kk kkVar = new kk(n3w.a(new nij(new j4n(g7gVar2, new faj(b, 3), g7gVar7, g7gVar8, g7gVar3, new g7g(tw51Var, 2), tij.a))), 23);
                ar00 ar00Var = new ar00(12);
                ar00Var.Eg(SavingsAccountCreationFragment.class, v8c0Var);
                ar00Var.Eg(SavingsDashboardFragmentV4.class, mam0Var);
                ar00Var.Eg(SavingsDashboardFragmentV2.class, mam0Var2);
                ar00Var.Eg(SavingsAccountFragment.class, vfg0Var);
                ar00Var.Eg(FundCreationFragment.class, ensVar);
                ar00Var.Eg(FundOperationFragment.class, ensVar2);
                ar00Var.Eg(SavingsAccountCloseFragment.class, v8c0Var2);
                ar00Var.Eg(SavingsAccountCloseDepositFragment.class, jpf0Var2);
                ar00Var.Eg(SavingsAccountNameFragment.class, v8c0Var3);
                ar00Var.Eg(SavingsAccountGoalFragment.class, v8c0Var4);
                ar00Var.Eg(SavingsAccountLockFragment.class, v8c0Var5);
                ar00Var.Eg(DiffRateCalendarFragment.class, kkVar);
                eqh.a(eqhVar, i5m.b(new mam0(g4m0Var, ar00Var.Hg(), 3)));
                tcm0 tcm0Var = (tcm0) eqhVar.get();
                q5z.i(tcm0Var);
                return tcm0Var;
            case 18:
                return (bw) xvf0Var.get();
            case 19:
                return (bw) xvf0Var.get();
            case 20:
                return (iu31) xvf0Var.get();
            case 21:
                return (iu31) xvf0Var.get();
            case 22:
                return new bu1((c) xvf0Var.get());
            case 23:
                return new snm0((g2n) xvf0Var.get());
            case 24:
                return new xnm0((dqe0) xvf0Var.get());
            case 25:
                return new d((ru.yandex.taxi.widget.c) xvf0Var.get());
            case 26:
                return new com.yandex.go.scooters.passes.active.v3.renew.disabling.d((ru.yandex.taxi.widget.c) xvf0Var.get());
            case 27:
                return new rum0((ru.yandex.taxi.widget.c) xvf0Var.get());
            case 28:
                return new ru.yandex.taxi.scooters.data.mapper.b((Context) xvf0Var.get());
            default:
                return new d3a((rqo) xvf0Var.get(), 5);
        }
    }

    public /* synthetic */ upk0(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
