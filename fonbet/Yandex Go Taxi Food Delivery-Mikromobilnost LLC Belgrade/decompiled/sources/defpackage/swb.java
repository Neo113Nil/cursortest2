package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.go.copter.city_tour.c;
import com.yandex.go.image.loader.domain.b;
import com.yandex.go.support.web.CommonSupportJsNativeApi;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.persuggest.clarifypoints.a;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.superapp.f;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes.dex */
public final class swb implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ swb(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new c((dqe0) xvf0Var3.get(), i5m.a(xvf0Var2), (wiq0) xvf0Var.get());
            case 1:
                return new a((ru.yandex.taxi.persuggest.api.a) xvf0Var3.get(), (sta0) xvf0Var2.get(), (ru.yandex.taxi.persuggest.source.a) xvf0Var.get());
            case 2:
                return new b(xvf0Var3, (tse) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 3:
                return new ru.yandex.taxi.combo.factory.a((Context) xvf0Var3.get(), (ru.yandex.taxi.design.utils.b) xvf0Var2.get(), (e) xvf0Var.get());
            case 4:
                return new CommonSupportJsNativeApi((fxf0) xvf0Var3.get(), (Context) xvf0Var2.get(), (wnt) xvf0Var.get());
            case 5:
                return new com.yandex.go.support.analytics.a((sh41) xvf0Var3.get(), (wnt) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 6:
                return new erc((Context) xvf0Var3.get(), (rqo) xvf0Var2.get(), (x8h) xvf0Var.get());
            case 7:
                return new ru.yandex.taxi.communications.data.a((dne0) xvf0Var3.get(), (jtq0) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 8:
                return new ru.yandex.taxi.persuggest.source.b((ru.yandex.taxi.persuggest.api.a) xvf0Var3.get(), (sta0) xvf0Var2.get(), (ru.yandex.taxi.persuggest.source.a) xvf0Var.get());
            case 9:
                return new pae((b03) xvf0Var2.get(), (wnt) xvf0Var.get(), (dne0) xvf0Var3.get());
            case 10:
                return new f((u02) xvf0Var3.get(), (ep90) xvf0Var.get(), (k) xvf0Var2.get());
            case 11:
                return new uoe((roe) xvf0Var3.get(), (wiq0) xvf0Var2.get(), (noe) xvf0Var.get());
            case 12:
                return new zte((uq1) xvf0Var3.get(), (ej6) xvf0Var2.get(), (tue) xvf0Var.get());
            case 13:
                return new com.yandex.go.payments.shared.business.accountcreation.brached.a((cve) xvf0Var3.get(), (bue) xvf0Var2.get(), (due) xvf0Var.get());
            case 14:
                return new whf(i5m.a(xvf0Var3), i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 15:
                Context context = (Context) xvf0Var3.get();
                qie qieVar = (qie) xvf0Var2.get();
                tsg tsgVar = new tsg();
                context.getApplicationContext();
                ((rie) qieVar).a("excluded_parks");
                return tsgVar;
            case 16:
                return new com.yandex.go.taxi.order.chat.data.db.a((Context) xvf0Var3.get(), (qie) xvf0Var2.get(), (dxt0) xvf0Var.get());
            case 17:
                return new com.yandex.go.taxi.order.chat.data.db.b((Context) xvf0Var3.get(), (qie) xvf0Var2.get(), (dxt0) xvf0Var.get());
            case 18:
                SharedPreferences sharedPreferences = (SharedPreferences) xvf0Var3.get();
                return new cvg(sharedPreferences, (vse) xvf0Var.get());
            case 19:
                return new ru.yandex.taxi.shortcuts.interactors.a((i) xvf0Var3.get(), (y46) xvf0Var2.get(), (po21) xvf0Var.get());
            case 20:
                return new h1h((o3h) xvf0Var3.get(), (zh11) xvf0Var2.get(), (q0h) xvf0Var.get());
            case 21:
                return new i4h((ru.yandex.taxi.deeplinks.f) xvf0Var3.get(), (n3h) xvf0Var2.get(), (q0h) xvf0Var.get());
            case 22:
                return new vjh((oep0) xvf0Var3.get(), xvf0Var2, (dyx) xvf0Var.get());
            case 23:
                wku0 wku0Var = (wku0) xvf0Var3.get();
                i5m.a(xvf0Var2);
                return new blh(wku0Var);
            case 24:
                return new nth((ru.yandex.taxi.logistics.sdk.management.localstate.e) xvf0Var3.get(), (osh) xvf0Var2.get(), (qr50) xvf0Var.get());
            case 25:
                return new jyh(xvf0Var3, (oep0) xvf0Var2.get(), (zxh) xvf0Var.get());
            case 26:
                Context context2 = (Context) xvf0Var3.get();
                i5m.a(xvf0Var2);
                return new xjg(context2, (a850) xvf0Var.get(), false, 10);
            case 27:
                return new ru.yandex.taxi.logistics.dashboard.address.a(xvf0Var3, (com.yandex.go.route.interactor.c) xvf0Var2.get(), (ljz) xvf0Var.get());
            case 28:
                return new com.yandex.go.logistics.cargo_flow.form.cost_centers.a((zwe) xvf0Var3.get(), (dqe0) xvf0Var2.get(), (cda0) xvf0Var.get());
            default:
                return new com.yandex.go.delivery.tracking.courier_chat.intent.a((com.yandex.go.lifecycle.a) xvf0Var3.get(), xvf0Var2, (ru.yandex.taxi.messenger.a) xvf0Var.get());
        }
    }
}
