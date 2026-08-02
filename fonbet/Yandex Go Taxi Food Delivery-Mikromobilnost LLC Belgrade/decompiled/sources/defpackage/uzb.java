package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.view.AddressSearchModalView;
import ru.yandex.taxi.search.view.AddressSearchView;

/* loaded from: classes6.dex */
public final class uzb implements RouteSelectorModalView.a {
    public final /* synthetic */ wzb a;
    public final /* synthetic */ SourcePicker b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Screen w;

    public uzb(wzb wzbVar, SourcePicker sourcePicker, Runnable runnable, Screen screen) {
        this.a = wzbVar;
        this.b = sourcePicker;
        this.c = runnable;
        this.w = screen;
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void K() {
        wzb wzbVar = this.a;
        rzb rzbVar = wzbVar.r;
        if (rzbVar != null) {
            rzbVar.f();
        }
        wzbVar.b.a().c(RouteSelectorModalView.class, true, null);
        Screen screen = Screen.SUMMARY;
        Screen screen2 = this.w;
        if (screen2 == screen || screen2 == Screen.TAXI_MAIN) {
            this.c.run();
        }
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void dismiss() {
        wzb wzbVar = this.a;
        rzb rzbVar = wzbVar.r;
        if (rzbVar != null) {
            rzbVar.onCancel();
        }
        wzbVar.r = null;
        wzbVar.b.a().c(RouteSelectorModalView.class, true, null);
        this.c.run();
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void o3(PointType pointType, qa0 qa0Var) {
        wzb wzbVar = this.a;
        i130 i130Var = wzbVar.b;
        i130Var.a().c(RouteSelectorModalView.class, true, null);
        tb tbVar = new tb(3, qa0Var, this.c);
        wzbVar.q.getClass();
        c61 c61Var = AddressSearchView.Companion;
        ujt0 ujt0Var = new ujt0(false);
        ddf ddfVar = new ddf(RoutePointType.POINT_A, true);
        cag c = fh4.c(new r51(this.b), ddfVar, m3o.b, wzbVar.m.a, new aye0(20, wzbVar.f), ujt0Var);
        c61Var.getClass();
        b61 b61Var = new b61(c);
        b61Var.p = pointType == PointType.SOURCE;
        AddressSearchModalView.Companion.getClass();
        AddressSearchModalView a = p51.a(b61Var);
        a.setOnAddressPickedListener(new x71(2, tbVar));
        i130Var.a().s(a, true);
        wzbVar.c.c();
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void showAddressAdjustment() {
    }
}
