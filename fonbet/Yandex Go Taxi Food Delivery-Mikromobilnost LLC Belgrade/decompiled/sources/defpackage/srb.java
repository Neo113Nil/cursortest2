package defpackage;

import android.app.Activity;
import com.yandex.go.places.models.data.mappers.d;
import com.yandex.go.places.models.data.mappers.e;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.credit.deposit.internal.domain.entities.b;
import com.ybsdk.feature.dashboard.internal.data.DashboardApi;
import java.util.Map;
import ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.data.ChooseProfileApi;
import ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.interactors.a;
import ru.yandex.taxi.logistics.sdk.dashboard.storage.c;

/* loaded from: classes5.dex */
public final class srb implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ srb(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new a((com.yandex.delivery.utils.dialogmanager.a) ((can) xvf0Var).get());
            case 1:
                return (ChooseProfileApi) ((t0k0) ((wxf) xvf0Var).get()).b(ChooseProfileApi.class);
            case 2:
                return new bsb((m4v) ((xat) xvf0Var).get());
            case 3:
                return new hyb((b1) ((peb) xvf0Var).get());
            case 4:
                return new ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.dependencies.a((c) ((wxf) xvf0Var).get());
            case 5:
                return new jg9(i5m.a((dx9) xvf0Var), 1);
            case 6:
                return new yn3((on2) ((yxf) xvf0Var).get());
            case 7:
                return new yfa((com.yandex.go.places.complaint.impl.data.repositories.a) ((srb) xvf0Var).get());
            case 8:
                return new com.yandex.go.places.complaint.impl.data.repositories.a((yn3) ((srb) xvf0Var).get());
            case 9:
                return new io9((ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a) ((gpx0) xvf0Var).get());
            case 10:
                return new io9((gvd) ((peb) xvf0Var).get());
            case 11:
                return new d((e) ((peb) xvf0Var).get());
            case 12:
                return new yfa((v920) ((ncb) xvf0Var).get());
            case 13:
                return new yfa((j4n) ((ht0) xvf0Var).get());
            case 14:
                return new com.ybsdk.feature.transfer.version2.internal.screens.common.a((ho01) ((y501) xvf0Var).get());
            case 15:
                return new pj((pho) ((dyf) xvf0Var).get());
            case 16:
                return new sae(5, (bq1) ((js0) xvf0Var).get());
            case 17:
                return new gyc((zwe) ((g0g) xvf0Var).get());
            case 18:
                return new dxe((b1) ((peb) xvf0Var).get());
            case 19:
                return new sae(8, (bc) ((qrb) xvf0Var).get());
            case 20:
                return new ru.yandex.taxi.masstransit.geopayment.checkout.e((ru.yandex.taxi.masstransit.geopayment.checkout.network.a) ((p6f) xvf0Var).get());
            case 21:
                return new m7f((Activity) ((kk) xvf0Var).get());
            case 22:
                return new b((w530) ((oxf) xvf0Var).get());
            case 23:
                return new wff((o61) ((p6f) xvf0Var).get());
            case 24:
                return new txe((wiq0) ((gyf) xvf0Var).get());
            case 25:
                final wig wigVar = (wig) ((wif) xvf0Var).get();
                return new zvj0() { // from class: xig
                    @Override // defpackage.zvj0
                    public final Map provide() {
                        return (Map) wig.this.d;
                    }
                };
            case 26:
                return (DashboardApi) ((t0k0) ((ayf) xvf0Var).get()).b(DashboardApi.class);
            case 27:
                return (com.ybsdk.feature.banners.impl.domain.interactors.a) ((tu4) ((oxf) xvf0Var).get()).b.get();
            case 28:
                return new ru.yandex.logistics.sdk.cargo_form.impl.domain.a((p6s) ((dxf) xvf0Var).get());
            default:
                cyf cyfVar = (cyf) ((p6f) xvf0Var).get();
                tw51 tw51Var = cyfVar.a;
                h9g h9gVar = (h9g) tw51Var;
                tfl0 t = h9gVar.t();
                q5z.h(t);
                x8g x8gVar = h9gVar.v;
                zgf zgfVar = new zgf(16, new u470((com.ybsdk.rconfig.b) x8gVar.A.get()));
                h3y a = i5m.a(cyfVar.b);
                a3h a3hVar = (a3h) x8gVar.T0.get();
                q5z.h(a3hVar);
                AppAnalyticsReporter d = ((h9g) tw51Var).d();
                q5z.h(d);
                xjg xjgVar = new xjg(d, new m501(18), false, 2);
                tv3 tv3Var = new tv3((com.ybsdk.rconfig.b) x8gVar.A.get());
                a3h a3hVar2 = (a3h) x8gVar.T0.get();
                q5z.h(a3hVar2);
                AppAnalyticsReporter d2 = h9gVar.d();
                q5z.h(d2);
                wwf wwfVar = new wwf(tv3Var, a3hVar2, d2);
                r0h r0hVar = (r0h) h9gVar.D1.get();
                q5z.h(r0hVar);
                return new l3h(t, zgfVar, a, a3hVar, xjgVar, wwfVar, r0hVar);
        }
    }

    public /* synthetic */ srb(Object obj, v7p v7pVar, int i) {
        this.a = i;
        this.b = v7pVar;
    }
}
