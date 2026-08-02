package defpackage;

import android.content.Context;
import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.navigator.analitycs.NavigationAnalytics$SettingsSource;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersListModalView;
import com.yandex.go.navigator.settings.SettingsModalView;
import com.yandex.go.taxi.order.robotaxi.domain.c;
import com.yandex.go.taxi.order.robotaxi.ui.RobotaxiModalView;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.surge.interactor.s;
import ru.yandex.taxi.surge.modal.SurgeShortcutModalView;

/* loaded from: classes12.dex */
public final class sts extends a {
    public final /* synthetic */ int F;
    public final Object G;
    public final boolean H;
    public final Object I;
    public final Object J;
    public final Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sts(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(null);
        this.F = i;
        this.G = obj;
        this.I = obj2;
        this.J = obj3;
        this.K = obj4;
        this.H = true;
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        switch (this.F) {
            case 2:
                i650 i650Var = ((r6r0) this.K).a;
                i650Var.a.a("navigation.settings.close", n.u(i650Var), 1, new HashMap());
                break;
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        switch (this.F) {
            case 2:
                r6r0 r6r0Var = (r6r0) this.K;
                NavigationAnalytics$SettingsSource navigationAnalytics$SettingsSource = ((ndr0) obj).a;
                i650 i650Var = r6r0Var.a;
                HashMap u = n.u(i650Var);
                u.put("source", navigationAnalytics$SettingsSource.getEventValue());
                i650Var.a.a("navigation.settings.click", u, 2, new HashMap());
                break;
        }
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        switch (this.F) {
            case 0:
                return (w030) this.G;
            case 1:
                return (w030) this.G;
            case 2:
                return (w030) this.G;
            default:
                return ((i130) this.G).a();
        }
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        switch (this.F) {
        }
        return this.H;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        int i = this.F;
        Object obj2 = this.J;
        Object obj3 = this.I;
        switch (i) {
            case 0:
                ius iusVar = (ius) obj;
                String str = iusVar.a;
                List list = iusVar.b;
                gym gymVar = new gym(this);
                tus tusVar = (tus) this.K;
                r1s r1sVar = ((kus) obj2).a;
                jus jusVar = new jus(str, list, gymVar, (pwy0) ((xvf0) r1sVar.b).get(), (b) ((xvf0) r1sVar.c).get(), tusVar, (com.yandex.go.navigator.gas_stations.analytics.a) ((w1g) r1sVar.w).get());
                gus gusVar = ((fus) obj3).a;
                return new GasStationsFiltersListModalView((Context) gusVar.a.get(), jusVar, (ip11) gusVar.b.get());
            case 1:
                gvk0 gvk0Var = (gvk0) obj;
                qvk0 qvk0Var = gvk0Var.a;
                o2y0 o2y0Var = gvk0Var.b;
                sue0 sue0Var = new sue0(28, this);
                usc uscVar = gvk0Var.c;
                s6k0 s6k0Var = ((nvk0) obj2).a;
                mvk0 mvk0Var = new mvk0(qvk0Var, sue0Var, o2y0Var, uscVar, (wsc) ((xvf0) s6k0Var.a).get(), (c) ((mz70) s6k0Var.b).get(), (pwy0) ((xvf0) s6k0Var.c).get());
                zz7 zz7Var = ((lvk0) obj3).a;
                return new RobotaxiModalView((Context) zz7Var.a.get(), mvk0Var, (bts0) zz7Var.b.get());
            case 2:
                hdr0 hdr0Var = new hdr0(this);
                sbm0 sbm0Var = ((xbr0) obj2).a;
                com.yandex.go.navigator.settings.c cVar = new com.yandex.go.navigator.settings.c((bf50) ((xvf0) sbm0Var.a).get(), (t) ((xvf0) sbm0Var.b).get(), hdr0Var, (zuj0) ((xvf0) sbm0Var.c).get(), (qc50) ((xvf0) sbm0Var.d).get(), (bsx) ((xvf0) sbm0Var.e).get(), (com.yandex.go.navigator.user_placemark.c) ((xvf0) sbm0Var.f).get(), (hb50) ((wz30) sbm0Var.g).get(), (pwy0) ((xvf0) sbm0Var.h).get(), (b) ((xvf0) sbm0Var.i).get());
                gus gusVar2 = ((abr0) obj3).a;
                return new SettingsModalView((Context) gusVar2.a.get(), cVar, (ip11) gusVar2.b.get());
            default:
                abe abeVar = (abe) obj3;
                zxs0 zxs0Var = (zxs0) obj2;
                wvw0 wvw0Var = new wvw0((uvw0) obj, new wor0(this), (s) zxs0Var.a, (vpw0) zxs0Var.b);
                abeVar.getClass();
                return new SurgeShortcutModalView(abeVar.a, wvw0Var);
        }
    }
}
