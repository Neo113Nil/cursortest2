package defpackage;

import com.yandex.go.navigator.main_screen.o;
import com.yandex.go.payments.paymentlist.data.c;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.preorder.navigation.a;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.e;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.f;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.delivery.web.b;
import ru.yandex.taxi.hiredriver.d;

/* loaded from: classes12.dex */
public final /* synthetic */ class wui implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ wui(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        int i2 = 9;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((xui) h55Var).r(new qu(i2));
                break;
            case 1:
                ((b) h55Var).r(new nni(4));
                break;
            case 2:
                ((afm) h55Var).r(new qu(i2));
                break;
            case 3:
                ((mlm) h55Var).R(new fkm(false));
                break;
            case 4:
                ((pvm) h55Var).r(new qu(i2));
                break;
            case 5:
                ((uxm) h55Var).r(new qu(i2));
                break;
            case 6:
                ((com.yandex.go.external_service.router.b) h55Var).r(new qu(9));
                break;
            case 7:
                ((com.yandex.go.flex.common.router.web_view.b) h55Var).r(new qu(9));
                break;
            case 8:
                xx70 xx70Var = (xx70) h55Var;
                xx70Var.r(new qu(i2));
                ((tzt) xx70Var.E).invoke();
                break;
            case 9:
                ((d) h55Var).r(new qu(i2));
                break;
            case 10:
                ((e) h55Var).f0 = null;
                break;
            case 11:
                ((f) h55Var).r(new qu(i2));
                break;
            case 12:
                iiw iiwVar = (iiw) h55Var;
                iiwVar.Q();
                iiwVar.R(bgw.a);
                r0 r0Var = iiwVar.J.b;
                r0Var.getClass();
                r0Var.m(null, xnw.a);
                break;
            case 13:
                ((pmw) h55Var).r(new qu(i2));
                break;
            case 14:
                uva uvaVar = (uva) h55Var;
                uvaVar.r(new qu(i2));
                ((sls) uvaVar.F).invoke();
                break;
            case 15:
                ((gpw) h55Var).r(new qu(i2));
                break;
            case 16:
                ((a) h55Var).Q(new xpy(23));
                break;
            case 17:
                ((zsa) h55Var).r(new qu(i2));
                break;
            case 18:
                ((zsa) h55Var).r(new qu(i2));
                break;
            case 19:
                ((ru.yandex.taxi.maas.impl.account.a) h55Var).r(new qu(9));
                break;
            case 20:
                ((t000) h55Var).r(new qu(i2));
                break;
            case 21:
                ((y4c0) h55Var).r(new qu(i2));
                break;
            case 22:
                ((o) h55Var).R(false);
                break;
            case 23:
                ((oj00) ((uj00) h55Var).n()).b.invoke();
                break;
            case 24:
                ((c) ((i) ((com.yandex.go.payments.menu.navigation.b) h55Var).L.get()).j).e();
                break;
            case 25:
                ((zsa) h55Var).r(new qu(i2));
                break;
            case 26:
                com.yandex.go.taxi.main.f fVar = (com.yandex.go.taxi.main.f) h55Var;
                if (fVar.u()) {
                    fVar.r(new qu(i2));
                    break;
                }
                break;
            case 27:
                ((com.yandex.go.morphlex.router.b) h55Var).r(new qu(i2));
                break;
            case 28:
                si30 si30Var = (si30) h55Var;
                si30Var.H = null;
                si30Var.r(new qu(i2));
                break;
            default:
                ((ru.yandex.taxi.masstransit.geopayment.linkcard.b) h55Var).r(new qu(9));
                break;
        }
    }
}
