package defpackage;

import com.yandex.go.chargers.discovery.ui.ChargersDiscoveryModalView;
import com.yandex.go.logistics.cargo_flow.form.DeliveryCargoFormModalView;
import com.yandex.go.payments.shared.details.f;
import com.yandex.go.scooters.discovery.ScootersDiscoveryModalView;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.discovery.a;
import ru.yandex.taxi.gopayments.family.repository.FamilyUiStateRepository$Screen;
import ru.yandex.taxi.sdc.router.b;
import ru.yandex.taxi.sharedpayments.c;
import ru.yandex.taxi.tollroad.alert.card.TollRoadInfoModalView;
import ru.yandex.taxi.zalogin.k;

/* loaded from: classes13.dex */
public final class sc extends s45 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void e(int i) {
    }

    private final void f(int i) {
    }

    private final void g(int i) {
    }

    private final void h(int i) {
    }

    private final void i(int i) {
    }

    private final void j(int i) {
    }

    private final void k(int i) {
    }

    private final void l(int i) {
    }

    private final void m(int i) {
    }

    private final void n(int i) {
    }

    private final void o(int i) {
    }

    private final void p() {
    }

    private final void q() {
    }

    private final void r() {
    }

    private final void s() {
    }

    private final void t() {
    }

    @Override // defpackage.s45
    public final void a(int i) {
        koz0 koz0Var;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 7:
                r0 r0Var = ((k) obj).j;
                Boolean bool = Boolean.TRUE;
                r0Var.getClass();
                r0Var.m(null, bool);
                break;
            case 8:
                ((el90) obj).f = true;
                break;
            case 12:
                koz0Var = ((TollRoadInfoModalView) obj).tollRoadAlertAnalytics;
                koz0Var.getClass();
                koz0Var.a.a("TollRoadAlert.Shown", new HashMap(), 1, new HashMap());
                break;
        }
    }

    @Override // defpackage.s45
    public final void b() {
        int i = this.a;
        int i2 = 9;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((b) obj).F.a.a().h();
                break;
            case 1:
                ((f) obj).S = false;
                break;
            case 2:
                k83 k83Var = (k83) obj;
                if (k83Var.u()) {
                    k83Var.r(new qu(i2));
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                ((c) obj).C.a(FamilyUiStateRepository$Screen.ZALOGIN_FULLSCREEN);
                break;
            case 5:
            case 6:
                break;
            case 7:
                r0 r0Var = ((k) obj).j;
                Boolean bool = Boolean.FALSE;
                r0Var.getClass();
                r0Var.m(null, bool);
                break;
            case 8:
                ((el90) obj).f = false;
                break;
            case 9:
                ((Runnable) obj).run();
                break;
            case 10:
                break;
            case 11:
                ((b850) ((f28) obj).G).a.a().h();
                break;
            case 12:
                break;
            default:
                ft41 ft41Var = (ft41) obj;
                if (ft41Var.u()) {
                    ft41Var.r(new qu(i2));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.s45
    public void c() {
        a aVar;
        wwj wwjVar;
        a850 a850Var;
        jw8 jw8Var;
        a aVar2;
        wwj wwjVar2;
        a850 a850Var2;
        koz0 koz0Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 3:
                ChargersDiscoveryModalView chargersDiscoveryModalView = (ChargersDiscoveryModalView) obj;
                aVar = chargersDiscoveryModalView.discoveryPresenter;
                aVar.Cg();
                wwjVar = chargersDiscoveryModalView.discoveryUserLocationOverlay;
                if (wwjVar != null) {
                    ((xwj) wwjVar).a.detach();
                    break;
                }
                break;
            case 5:
                DeliveryCargoFormModalView deliveryCargoFormModalView = (DeliveryCargoFormModalView) obj;
                a850Var = deliveryCargoFormModalView.navigationListener;
                jw8Var = deliveryCargoFormModalView.cargoFormViewWrapper;
                a850Var.k((List) ((md6) jw8Var).b);
                break;
            case 6:
                ((com.yandex.go.payments.shared.family.web.c) obj).K.a(FamilyUiStateRepository$Screen.FAMILY_WEB_VIEW);
                break;
            case 10:
                ScootersDiscoveryModalView scootersDiscoveryModalView = (ScootersDiscoveryModalView) obj;
                aVar2 = scootersDiscoveryModalView.discoveryPresenter;
                aVar2.Cg();
                wwjVar2 = scootersDiscoveryModalView.discoveryUserLocationOverlay;
                if (wwjVar2 != null) {
                    ((xwj) wwjVar2).a.detach();
                }
                a850Var2 = scootersDiscoveryModalView.navigationListener;
                a850Var2.d(scootersDiscoveryModalView.getModalScreenName());
                break;
            case 12:
                koz0Var = ((TollRoadInfoModalView) obj).tollRoadAlertAnalytics;
                koz0Var.getClass();
                koz0Var.a.a("TollRoadAlert.Closed", new HashMap(), 1, new HashMap());
                break;
        }
    }

    @Override // defpackage.s45
    public void d() {
        wwj wwjVar;
        a aVar;
        a850 a850Var;
        jw8 jw8Var;
        wwj wwjVar2;
        a aVar2;
        a850 a850Var2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 3:
                ChargersDiscoveryModalView chargersDiscoveryModalView = (ChargersDiscoveryModalView) obj;
                wwjVar = chargersDiscoveryModalView.discoveryUserLocationOverlay;
                if (wwjVar != null) {
                    ((xwj) wwjVar).a.attach();
                }
                aVar = chargersDiscoveryModalView.discoveryPresenter;
                aVar.Mg(chargersDiscoveryModalView);
                break;
            case 4:
                ((c) obj).C.b(FamilyUiStateRepository$Screen.ZALOGIN_FULLSCREEN);
                break;
            case 5:
                DeliveryCargoFormModalView deliveryCargoFormModalView = (DeliveryCargoFormModalView) obj;
                a850Var = deliveryCargoFormModalView.navigationListener;
                jw8Var = deliveryCargoFormModalView.cargoFormViewWrapper;
                a850Var.j(0, (List) ((md6) jw8Var).b);
                break;
            case 6:
                y9p y9pVar = ((com.yandex.go.payments.shared.family.web.c) obj).O.c;
                y9pVar.a.a("FamilyAccount.WebView.DidPresent", tse0.n(y9pVar), 1, new HashMap());
                break;
            case 10:
                ScootersDiscoveryModalView scootersDiscoveryModalView = (ScootersDiscoveryModalView) obj;
                wwjVar2 = scootersDiscoveryModalView.discoveryUserLocationOverlay;
                if (wwjVar2 != null) {
                    ((xwj) wwjVar2).a.attach();
                }
                aVar2 = scootersDiscoveryModalView.discoveryPresenter;
                aVar2.Mg(scootersDiscoveryModalView);
                a850Var2 = scootersDiscoveryModalView.navigationListener;
                a850Var2.i(scootersDiscoveryModalView.getModalScreenName(), false);
                break;
        }
    }
}
