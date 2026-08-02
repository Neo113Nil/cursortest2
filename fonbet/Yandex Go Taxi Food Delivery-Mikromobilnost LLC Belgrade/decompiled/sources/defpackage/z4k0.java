package defpackage;

import com.yandex.go.beginners.safety.photo.domain.b;
import com.yandex.go.payments.data.k;
import com.yandex.go.payments.shared.v;
import com.yandex.go.scooters.domain.h0;
import com.yandex.go.scooters.promocodes.data.ScootersPromocodesApi;
import com.yandex.go.scooters.promocodes.data.g;
import com.yandex.go.scooters.zones.data.ScootersPolygonInfoApi;
import com.yandex.go.taxi.order.queue.interactor.d;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;
import ru.yandex.taxi.logistics.sdk.tracking.impl.rover.a;
import ru.yandex.taxi.scooters.data.data_source.c;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.scooters.domain.q;
import ru.yandex.taxi.scooters.domain.r;

/* loaded from: classes8.dex */
public final class z4k0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ z4k0(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new k630((pep0) xvf0Var2.get(), (vw2) xvf0Var, 1);
            case 1:
                return new a((bhl0) ((gwb0) xvf0Var).get(), (ugl0) xvf0Var2.get());
            case 2:
                return new com.yandex.go.beginners.safety.name.ui.a((com.yandex.go.beginners.safety.name.domain.a) ((ggl0) xvf0Var2).get(), (epl0) ((ggl0) xvf0Var).get());
            case 3:
                return new com.yandex.go.beginners.safety.photo.upload.ui.a((b) ((kxl0) xvf0Var).get(), (rq21) xvf0Var2.get());
            case 4:
                return new szl0((b900) xvf0Var);
            case 5:
                return new k630((pep0) xvf0Var2.get(), (ggl0) xvf0Var, 2);
            case 6:
                return new com.yandex.go.scooters.deposit.notification.ui.a((cno0) xvf0Var2.get(), (tdn0) ((yxm0) xvf0Var).get());
            case 7:
                return new cin0((com.yandex.go.eboks.objects.a) ((gw7) xvf0Var).get(), (rxn0) xvf0Var2.get());
            case 8:
                return new rjn0((co40) ((ggl0) xvf0Var2).get(), (u8w) ((yxm0) xvf0Var).get());
            case 9:
                return new tig0((fga0) xvf0Var2.get(), (qc20) ((ggl0) xvf0Var).get());
            case 10:
                return new com.yandex.go.scooters.zones.data.a((ScootersPolygonInfoApi) ((yxm0) xvf0Var).get(), (ru.yandex.taxi.scooters.data.a) xvf0Var2.get());
            case 11:
                return new g((ScootersPromocodesApi) ((n6o0) xvf0Var).get(), (ru.yandex.taxi.scooters.data.a) xvf0Var2.get());
            case 12:
                return new h0((dvn0) xvf0Var2.get(), (com.yandex.go.scooters.live.domain.b) ((e8b0) xvf0Var).get());
            case 13:
                return new ru.yandex.taxi.scooters.presentation.analytics.a((x770) ((n6o0) xvf0Var).get(), (q) xvf0Var2.get());
            case 14:
                return new r((c) ((rxm0) xvf0Var).get(), (h) xvf0Var2.get());
            case 15:
                return new h9p0(0, i5m.a((if9) xvf0Var2), i5m.a((npe0) xvf0Var));
            case 16:
                return new com.yandex.go.scooters.zones.info.domain.c((y9p0) xvf0Var2.get(), (com.yandex.go.scooters.zones.data.a) ((z4k0) xvf0Var).get());
            case 17:
                return new xx70(9, (ysd0) xvf0Var2.get(), (sxn0) xvf0Var);
            case 18:
                return new qvp0((hnz) xvf0Var2.get(), (d) ((n4g0) xvf0Var).get());
            case 19:
                return new aiq0((String) xvf0Var2.get(), (k) ((c3g) xvf0Var).get());
            case 20:
                return new umx(new l2z(27, (nd90) ((ec80) xvf0Var2).get(), (nn11) ((on11) xvf0Var).get()));
            case 21:
                return new kwq0((zrm) ((cuo) xvf0Var).get(), (gen) xvf0Var2.get());
            case 22:
                return new hor0((v) ((mz0) xvf0Var).get(), (com.yandex.go.payments.shared.b) xvf0Var2.get());
            case 23:
                return new dpr0((ffe) xvf0Var2.get(), i5m.a((w500) xvf0Var));
            case 24:
                return new vpr0((com.yandex.go.rida.header.data.c) ((vve) xvf0Var).get(), (tt2) xvf0Var2.get());
            case 25:
                return new rsr0((com.yandex.go.sharing_personal_goals.data.a) ((wjr0) xvf0Var).get(), (dsr0) xvf0Var2.get());
            case 26:
                return new qtr0((qcw0) ((a3g) xvf0Var).get(), (tt2) xvf0Var2.get());
            case 27:
                qtr0 qtr0Var = (qtr0) ((z4k0) xvf0Var).get();
                rqo rqoVar = (rqo) xvf0Var2.get();
                eid eidVar = new eid();
                eidVar.b = qtr0Var;
                eidVar.a = ((Boolean) ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.OPTIMIZED_SHIMMERING).c()).booleanValue();
                return eidVar;
            case 28:
                return new pd80((uur0) xvf0Var2.get(), (o370) ((sxn0) xvf0Var).get());
            default:
                return new com.yandex.go.flex.main_screen.a((com.yandex.go.flex.main_screen.domain.h) ((p7w0) xvf0Var2).get(), (n9p) ((qsn) xvf0Var).get());
        }
    }

    public /* synthetic */ z4k0(xvf0 xvf0Var, xvf0 xvf0Var2, int i, boolean z) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
    }
}
