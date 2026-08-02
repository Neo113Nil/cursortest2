package defpackage;

import com.yandex.go.address.search.perf.b;
import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.perf.api.screen.SourceScreen;
import com.yandex.go.search.model.DecideLaterConfig;
import com.yandex.go.suggest.DestinationSuggest;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.perf.screen.PerformanceScreenName;
import ru.yandex.taxi.perf.screen.c;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchModalView;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class zid extends a implements ksd {
    public final sid F;
    public final w4l0 G;
    public final w030 H;
    public final c I;
    public final c8v0 J;
    public final u91 K;
    public CompositeAddressSearchModalView L;

    public zid(sid sidVar, w4l0 w4l0Var, w030 w030Var, c cVar, c8v0 c8v0Var, u91 u91Var) {
        super("CompositeAddressSearchModalViewRouter.scope");
        this.F = sidVar;
        this.G = w4l0Var;
        this.H = w030Var;
        this.I = cVar;
        this.J = c8v0Var;
        this.K = u91Var;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void G(Object obj) {
        this.I.g(PerformanceScreenName.Suggest);
        super.G((jsd) obj);
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void H(Object obj) {
        super.H((jsd) obj);
        this.I.h(PerformanceScreenName.Suggest);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.L = null;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.H;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        b bVar;
        jsd jsdVar = (jsd) obj;
        PointType pointType = jsdVar.a;
        SourcePicker sourcePicker = jsdVar.b;
        boolean z = jsdVar.c;
        DestinationSuggest destinationSuggest = jsdVar.d;
        String str = jsdVar.e;
        u0j u0jVar = jsdVar.f;
        sid sidVar = this.F;
        dsd dsdVar = sidVar.a;
        tjt0 tjt0Var = sidVar.b;
        ujt0 ujt0Var = new ujt0(z);
        SourcePicker sourcePicker2 = SourcePicker.FROM_TRANSPORT_SUMMARY;
        ddf ddfVar = new ddf((sourcePicker == sourcePicker2 || sourcePicker == SourcePicker.FROM_TRANSPORT_DISCOVERY) ? RoutePointType.TRANSPORT_A : RoutePointType.POINT_A);
        SourcePicker b = sourcePicker.b(true);
        DecideLaterConfig decideLaterConfig = DecideLaterConfig.a;
        r51 r51Var = new r51(b, decideLaterConfig, null);
        l3o l3oVar = sidVar.d;
        m3o m3oVar = new m3o(l3oVar.a(false));
        w4l0 w4l0Var = this.G;
        int i = 1;
        apf a = uub1.a(new p1b(fh4.c(r51Var, ddfVar, m3oVar, tjt0Var.a, new aye0(20, w4l0Var), ujt0Var), sidVar.c.a(new h0j(u0jVar, destinationSuggest, str, true, z), new ddf((sourcePicker == sourcePicker2 || sourcePicker == SourcePicker.FROM_TRANSPORT_DISCOVERY) ? RoutePointType.TRANSPORT_B : RoutePointType.POINT_B), new r51(sourcePicker.b(false), decideLaterConfig, null), new m3o(l3oVar.a(false)), w4l0Var)), dsdVar.a, w4l0Var);
        CompositeAddressSearchView.Companion.getClass();
        fjd fjdVar = new fjd(a);
        fjdVar.j = wch0.addresses_picker;
        fjdVar.k = false;
        fjdVar.p = jsdVar.a;
        if (str.equals("superapp_main")) {
            String analyticsName = SourceScreen.SUPERAPP_MAIN.getAnalyticsName();
            t91 t91Var = this.K.a;
            bVar = new b(analyticsName, (r91) t91Var.a.get(), (ru.yandex.taxi.perf.b) t91Var.b.get(), (tt2) t91Var.c.get(), (mua0) t91Var.d.get(), (bva0) t91Var.e.get());
        } else {
            bVar = null;
        }
        if (bVar != null) {
            fjdVar.t = bVar;
        }
        fjdVar.n = new m61(i, this);
        fjdVar.r = true;
        fjdVar.o = new yfa(this);
        fjdVar.q = jsdVar.g;
        fjdVar.s = jsdVar.h;
        CompositeAddressSearchModalView.Companion.getClass();
        CompositeAddressSearchModalView.a aVar = new CompositeAddressSearchModalView.a();
        ModalViewOrigin modalViewOrigin = ModalViewOrigin.HOME;
        CompositeAddressSearchModalView compositeAddressSearchModalView = new CompositeAddressSearchModalView(fjdVar, aVar, this.J, null);
        this.L = compositeAddressSearchModalView;
        return compositeAddressSearchModalView;
    }
}
