package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.yandex.go.inapp_calls.experiment.q;
import com.yandex.go.inapp_calls.navigation.d;
import com.yandex.go.payments.domain.l;
import com.yandex.go.payments.googlepay.domain.e;
import com.yandex.go.preorder.address.b;
import com.yandex.go.proxyprovision.j;
import com.yandex.go.settings.lang.LanguageModalView;
import com.yandex.messaging.domain.chat.g;
import com.yandex.taxi.go_platform.switcher.a;
import ru.yandex.taxi.order.services.c;
import ru.yandex.taxi.preorder.source.domain.h;

/* loaded from: classes8.dex */
public final class rqt implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ rqt(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
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
                return new a((tse) xvf0Var2.get(), (tqt) xvf0Var.get());
            case 1:
                return new ru.yandex.taxi.locationsdk.locationprovider.android.gms.a((Context) xvf0Var2.get(), (igz) xvf0Var.get());
            case 2:
                return new evt((Activity) xvf0Var2.get(), (e) xvf0Var.get());
            case 3:
                return new axt((er3) xvf0Var2.get(), (xwt) xvf0Var.get());
            case 4:
                return new aku(xvf0Var2, (ast0) xvf0Var.get());
            case 5:
                return new ru.yandex.taxi.history.a(xvf0Var2, (com.yandex.go.lifecycle.a) xvf0Var.get());
            case 6:
                return new l((Context) xvf0Var2.get(), (xdf) xvf0Var.get());
            case 7:
                return null;
            case 8:
                return new hdu((k7x0) xvf0Var2.get(), (pav) xvf0Var.get());
            case 9:
                return new com.yandex.go.shortcuts.impl.ui.shortcutview.a((Context) xvf0Var2.get(), (pav) xvf0Var.get());
            case 10:
                return new jgv((mxf0) xvf0Var2.get(), (k7x0) xvf0Var.get());
            case 11:
                return new d((q) xvf0Var2.get(), (j) xvf0Var.get());
            case 12:
                return new h((po21) xvf0Var2.get(), i5m.a(xvf0Var));
            case 13:
                return new b((tse) xvf0Var2.get(), (h) xvf0Var.get());
            case 14:
                return new z8w((com.yandex.go.route.interactor.b) xvf0Var2.get(), (com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a) xvf0Var.get());
            case 15:
                return new e9w((rqo) xvf0Var2.get(), (dqe0) xvf0Var.get());
            case 16:
                return new yn5(3, (cyx) xvf0Var2.get(), xvf0Var);
            case 17:
                dne0 dne0Var = (dne0) xvf0Var2.get();
                return new vgw(dne0Var);
            case 18:
                return new yjw((com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a) xvf0Var2.get(), (klw) xvf0Var.get());
            case 19:
                return new cow((lx4) xvf0Var2.get(), (dyx) xvf0Var.get());
            case 20:
                return new apw((dqe0) xvf0Var2.get(), (viw) xvf0Var.get());
            case 21:
                return new urw((qrw) xvf0Var2.get(), (slh) xvf0Var.get());
            case 22:
                return new kn1((ah00) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 23:
                return new syw((crg) xvf0Var2.get(), (jtq0) xvf0Var.get());
            case 24:
                return new hzk((q1q0) xvf0Var2.get(), (mb7) xvf0Var.get());
            case 25:
                return new g((kse) xvf0Var2.get(), (com.yandex.messaging.domain.personal.a) xvf0Var.get());
            case 26:
                return new c((Application) xvf0Var2.get(), (t041) xvf0Var.get());
            case 27:
                return new lqx((rjt0) xvf0Var2.get(), (ah00) xvf0Var.get());
            case 28:
                return new com.yandex.go.yb.lack_of_order.domain.a((wnt) xvf0Var2.get(), (com.yandex.go.yb.lack_of_order.domain.b) xvf0Var.get());
            default:
                return new LanguageModalView((Context) xvf0Var2.get(), (j5z) xvf0Var.get());
        }
    }
}
