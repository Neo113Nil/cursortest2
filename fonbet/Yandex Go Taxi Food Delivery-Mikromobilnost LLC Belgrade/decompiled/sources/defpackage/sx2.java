package defpackage;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.appshortcuts.b;
import com.yandex.go.superapp.orders.card.experiments.y;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.internal.backendconfig.a;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.l;
import ru.yandex.taxi.lifecycle.ApplicationLifecycleTracker;
import ru.yandex.taxi.main.map.autoupdatelocationthrottle.e;
import ru.yandex.taxi.perf.c;
import ru.yandex.taxi.personalstate.domain.interactor.f;
import ru.yandex.taxi.personalstate.domain.o;

/* loaded from: classes.dex */
public final class sx2 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ sx2(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
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
                return new b((g) xvf0Var2.get(), (qx2) xvf0Var.get());
            case 1:
                return new c((ComponentActivity) xvf0Var2.get(), (ru.yandex.taxi.perf.b) xvf0Var.get());
            case 2:
                return new ApplicationLifecycleTracker(i5m.a(xvf0Var2), (hit) xvf0Var.get());
            case 3:
                return new xh3((MessengerEnvironment) xvf0Var2.get(), (rz10) xvf0Var.get());
            case 4:
                return new jj3((g) xvf0Var2.get(), (l) xvf0Var.get());
            case 5:
                return new dr3((e) xvf0Var2.get(), (tse) xvf0Var.get());
            case 6:
                return new er3((cr3) xvf0Var2.get(), (com.yandex.go.navigation.screen.c) xvf0Var.get());
            case 7:
                return new e((b34) xvf0Var2.get(), i5m.a(xvf0Var));
            case 8:
                return new ymu(17, (za4) xvf0Var2.get(), (mp11) xvf0Var.get());
            case 9:
                return new ru.yandex.taxi.personalstate.domain.interactor.e((o) xvf0Var2.get(), (f) xvf0Var.get());
            case 10:
                return new lf4((sm40) xvf0Var2.get(), i5m.a(xvf0Var));
            case 11:
                return new mf4((lf4) xvf0Var2.get(), xvf0Var);
            case 12:
                return new a(i5m.a(xvf0Var2), (xdf0) xvf0Var.get());
            case 13:
                return new com.yandex.go.payments.badges.a((rqo) xvf0Var2.get(), (ol40) xvf0Var.get());
            case 14:
                return new zq4((zuj0) xvf0Var2.get(), (ru.yandex.taxi.communications.benefitscenter.b) xvf0Var.get());
            case 15:
                return new ru.yandex.taxi.communications.banners.a((com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) xvf0Var2.get(), (hit) xvf0Var.get());
            case 16:
                return new com.yandex.go.communications.banners.a((tse) xvf0Var2.get(), (ru.yandex.taxi.banners.c) xvf0Var.get());
            case 17:
                return new com.yandex.go.beginners.domain.interactor.a(xvf0Var2, (rqo) xvf0Var.get());
            case 18:
                return new com.yandex.go.benefits_center.benefits.sdk.actions.b((tse) xvf0Var2.get(), (wgr) xvf0Var.get());
            case 19:
                return new h0w(26, (ru.yandex.taxi.perf.screen.c) xvf0Var2.get(), (com.yandex.go.navigation.screen.c) xvf0Var.get());
            case 20:
                return new ymu(23, (oep0) xvf0Var2.get(), xvf0Var);
            case 21:
                return new com.yandex.go.superapp.biometrics.data.a((tt2) xvf0Var2.get(), (Lifecycle) xvf0Var.get());
            case 22:
                return new t36((wnt) xvf0Var2.get(), (com.yandex.go.blockeduser.data.c) xvf0Var.get());
            case 23:
                return new com.yandex.go.blockeduser.data.c((hit) xvf0Var2.get(), (com.yandex.go.blockeduser.data.e) xvf0Var.get());
            case 24:
                return new k66((Context) xvf0Var2.get(), 0, (yaj) xvf0Var.get());
            case 25:
                return new ru.yandex.taxi.widgets.presentation.a((ru.yandex.taxi.widget.c) xvf0Var2.get(), (y) xvf0Var.get());
            case 26:
                return new bw6((Lifecycle) xvf0Var2.get(), (com.yandex.go.payments.shared.business.onboarding.a) xvf0Var.get());
            case 27:
                return new qw6((znr0) xvf0Var.get());
            case 28:
                return new ex6((zuj0) xvf0Var2.get(), (mx6) xvf0Var.get());
            default:
                return new com.yandex.go.taxi.order.cache.data.a((com.yandex.go.taxi.order.cache.data.b) xvf0Var2.get(), (tse) xvf0Var.get());
        }
    }
}
