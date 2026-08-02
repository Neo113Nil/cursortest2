package defpackage;

import android.content.Context;
import com.yandex.go.logistics.cargo_flow.form.DeliveryCargoFormModalView;
import com.yandex.go.search.model.DecideLaterConfig;
import com.yandex.go.settings.push_settings.PushSettingsModalView;
import com.yandex.go.taxi.order.bottom_modal.domain.a;
import com.yandex.go.taxi.order.bottom_modal.ui.mvp.BottomModalView;
import com.yandex.go.taxi.order.cancel.v2.mvp.OrderCancelModalView;
import com.yandex.go.taxi.order.detailed_price.domain.c;
import com.yandex.go.taxi.order.detailed_price.ui.DetailedPriceModalView;
import com.yandex.go.taxi.order.infosharing.domain.e;
import com.yandex.go.taxi.order.infosharing.ui.TaxiOrderScreenshotSharingModalView;
import com.yandex.go.telemetry.ui.TelemetryReportModalView;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.delivery.addresscorrection.DeliveryAddressCorrectionView;
import ru.yandex.taxi.delivery.cost_details.DeliveryCostDetailsModalView;
import ru.yandex.taxi.delivery.ui.form.DeliveryFormModalView;
import ru.yandex.taxi.logistics.ndd_route_selector.view.filters.DeliveryFilterModalView;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.scooters.presentation.ontheway.lock.ScootersLockInstructionModalView;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchModalView;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.address.view.b;
import ru.yandex.taxi.search.view.AddressSearchModalView;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.settings.model.PushSettingsOpenReason;
import ru.yandex.taxi.surge.dialog.accept_paid.AcceptPaidOptionDialog;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class zc extends m230 {
    public final /* synthetic */ int E;
    public final Object F;
    public boolean G;
    public final Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc(int i, Object obj, Object obj2) {
        super(null);
        this.E = i;
        this.H = obj;
        this.F = obj2;
        this.G = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        switch (this.E) {
        }
        return (w030) this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        switch (this.E) {
        }
        return this.G;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        h0j h0jVar;
        h0j h0jVar2;
        AddressSearchModalView a;
        int i;
        int i2 = this.E;
        kzi kziVar = kzi.a;
        int i3 = 7;
        Object obj2 = this.F;
        int i4 = 6;
        int i5 = 4;
        int i6 = 5;
        int i7 = 3;
        int i8 = 2;
        int i9 = 1;
        int i10 = 0;
        Object obj3 = this.H;
        switch (i2) {
            case 0:
                return new AcceptPaidOptionDialog((Context) obj3, (xc) obj).withCallback(new ryh(i4, this));
            case 1:
                yc6 yc6Var = new yc6(this);
                j4n j4nVar = (j4n) obj3;
                j4nVar.getClass();
                vwf vwfVar = new vwf(j4nVar, 1);
                vwf vwfVar2 = new vwf(j4nVar, i6);
                int i11 = 0;
                n3w a2 = n3w.a(new ld6(new md6(i11, vwfVar, vwfVar2)));
                vwf vwfVar3 = new vwf(j4nVar, i11);
                wc6 wc6Var = (wc6) n3w.a(new wc6(new c06(new c4(vwfVar3, new vwf(j4nVar, i4), new g6((xvf0) new vwf(j4nVar, i5), (xvf0) mbk0.a, (xvf0) new vwf(j4nVar, i8), (xvf0) new vwf(j4nVar, i7), (xvf0) vwfVar3, 11, (byte) 0), 26), n3w.a(yc6Var)))).a;
                xc6 xc6Var = (xc6) ((i3y) obj).getValue();
                c06 c06Var = wc6Var.a;
                vc6 vc6Var = new vc6((a) ((c4) c06Var.a).get(), (yc6) ((n3w) c06Var.b).a, xc6Var);
                md6 md6Var = ((ld6) a2.a).a;
                return new BottomModalView((Context) ((vwf) md6Var.b).get(), (bts0) ((vwf) md6Var.c).get(), vc6Var);
            case 2:
                zch zchVar = new zch(this);
                xjg xjgVar = ((pvh) obj2).a;
                return new DeliveryAddressCorrectionView((Context) ((dyf) xjgVar.b).get(), (fvh) ((ncb) xjgVar.c).get(), zchVar);
            case 3:
                ewh ewhVar = (ewh) obj;
                q4g q4gVar = (q4g) obj3;
                ewhVar.getClass();
                tls tlsVar = ewhVar.b;
                hki hkiVar = ewhVar.a;
                if (jl40.l(hkiVar, gki.a)) {
                    q4gVar.getClass();
                    p51 p51Var = AddressSearchModalView.Companion;
                    c61 c61Var = AddressSearchView.Companion;
                    cag j = ((apf) q4gVar.b).j();
                    c61Var.getClass();
                    b61 b61Var = new b61(j);
                    b61Var.p = true;
                    b61Var.n = ((avj0) ((zuj0) q4gVar.c)).h(kyh0.summary_source_address_delivery_hint);
                    b61Var.x = false;
                    p51Var.getClass();
                    a = p51.a(b61Var);
                    a.setOnAppearingListener(new ou4(1, q4gVar));
                    a.setOnKeyboardListener(new o51(a, 2));
                    i = 1;
                } else {
                    if (!(hkiVar instanceof fki)) {
                        w511.b();
                        return null;
                    }
                    Integer valueOf = Integer.valueOf(((fki) hkiVar).a);
                    String h = ((avj0) ((zuj0) q4gVar.c)).h(kyh0.summary_destination_address_delivery_hint);
                    p51 p51Var2 = AddressSearchModalView.Companion;
                    c61 c61Var2 = AddressSearchView.Companion;
                    apf apfVar = (apf) q4gVar.b;
                    dqe0 dqe0Var = (dqe0) apfVar.c;
                    if (valueOf.intValue() >= dqe0Var.b().size()) {
                        h0jVar = new h0j(tyi.a, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, true);
                    } else if (dqe0Var.b().size() > 0) {
                        h0jVar2 = new h0j(new dzi(valueOf.intValue()), valueOf.intValue(), TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, true);
                        wyf a3 = ((g0j) apfVar.x).a(h0jVar2, new ddf(RoutePointType.POINT_B), new r51(SourcePicker.DEST_FROM_DELIVERY), m3o.b, (y9y0) apfVar.w);
                        c61Var2.getClass();
                        b61 b61Var2 = new b61(a3);
                        b61Var2.p = false;
                        b61Var2.n = h;
                        b61Var2.t = false;
                        b61Var2.x = false;
                        p51Var2.getClass();
                        a = p51.a(b61Var2);
                        i = 1;
                        a.setOnAppearingListener(new ou4(i, q4gVar));
                        a.setOnKeyboardListener(new o51(a, 3));
                    } else {
                        h0jVar = new h0j(kziVar, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, true);
                    }
                    h0jVar2 = h0jVar;
                    wyf a32 = ((g0j) apfVar.x).a(h0jVar2, new ddf(RoutePointType.POINT_B), new r51(SourcePicker.DEST_FROM_DELIVERY), m3o.b, (y9y0) apfVar.w);
                    c61Var2.getClass();
                    b61 b61Var22 = new b61(a32);
                    b61Var22.p = false;
                    b61Var22.n = h;
                    b61Var22.t = false;
                    b61Var22.x = false;
                    p51Var2.getClass();
                    a = p51.a(b61Var22);
                    i = 1;
                    a.setOnAppearingListener(new ou4(i, q4gVar));
                    a.setOnKeyboardListener(new o51(a, 3));
                }
                a.setOnAddressPickedListener(new hwb(i, tlsVar, this));
                return a;
            case 4:
                bzh bzhVar = (bzh) obj;
                jw8 jw8Var = bzhVar.a;
                zi8 zi8Var = bzhVar.b;
                boolean z = this.G;
                xjg xjgVar2 = (xjg) ((qnh) obj3).a;
                jw8Var.getClass();
                xjgVar2.getClass();
                Context context = (Context) xjgVar2.b;
                q5z.h(context);
                a850 a850Var = (a850) xjgVar2.c;
                q5z.h(a850Var);
                DeliveryCargoFormModalView deliveryCargoFormModalView = new DeliveryCargoFormModalView(context, z, zi8Var, jw8Var, a850Var);
                this.G = false;
                return deliveryCargoFormModalView;
            case 5:
                l2i l2iVar = (l2i) obj;
                abe abeVar = (abe) obj2;
                i2i i2iVar = new i2i(this);
                abeVar.getClass();
                l2iVar.getClass();
                return (DeliveryCostDetailsModalView) i5m.b(new f2b(new ywf(1, abeVar), i5m.b(new f2i(n3w.a(l2iVar), n3w.a(i2iVar), 0)), b2i.a, 29)).get();
            case 6:
                return (DeliveryFilterModalView) obj3;
            case 7:
                return (DeliveryFormModalView) obj2;
            case 8:
                h3j h3jVar = new h3j(this);
                f0g f0gVar = (f0g) obj3;
                f0gVar.getClass();
                n3w a4 = n3w.a(new r3j(new wwf(new zyf(f0gVar, i7), new zyf(f0gVar, i6), c3j.a)));
                zyf zyfVar = new zyf(f0gVar, 1);
                zyf zyfVar2 = new zyf(f0gVar, 0);
                wwf wwfVar = ((t3j) n3w.a(new t3j(new wwf(new bpf((xvf0) new pgi(zyfVar, zyfVar2, new zyf(f0gVar, 8), i5), (xvf0) new bpf(new zyf(f0gVar, i8), new zyf(f0gVar, i5), new zyf(f0gVar, i3), new zyf(f0gVar, 9), 20), (xvf0) new zyf(f0gVar, 10), (xvf0) zyfVar2, 21), n3w.a(h3jVar), new gmh(new zyf(f0gVar, i4), 14)))).a).a;
                g3j g3jVar = new g3j((i3j) obj, (c) ((bpf) wwfVar.a).get(), (h3j) ((n3w) wwfVar.b).a, (pj) ((gmh) wwfVar.c).get());
                wwf wwfVar2 = ((r3j) a4.a).a;
                return new DetailedPriceModalView((Context) ((zyf) wwfVar2.a).get(), g3jVar, (d4j) ((zyf) wwfVar2.b).get(), (gvz0) ((xvf0) wwfVar2.c).get());
            case 9:
                String str = (String) obj;
                ipw ipwVar = new ipw(this);
                ipw ipwVar2 = new ipw(this);
                t8w t8wVar = (t8w) ((r8w) obj3);
                dsd dsdVar = t8wVar.a;
                tjt0 tjt0Var = t8wVar.b;
                ujt0 ujt0Var = new ujt0(false);
                ddf ddfVar = new ddf(RoutePointType.POINT_A);
                SourcePicker sourcePicker = SourcePicker.NONE;
                DecideLaterConfig decideLaterConfig = DecideLaterConfig.a;
                r51 r51Var = new r51(sourcePicker, decideLaterConfig, null);
                m3o m3oVar = m3o.b;
                y9y0 y9y0Var = t8wVar.d;
                cag c = fh4.c(r51Var, ddfVar, m3oVar, tjt0Var.a, new aye0(20, y9y0Var), ujt0Var);
                lmw lmwVar = t8wVar.c;
                lmwVar.getClass();
                h0j h0jVar3 = new h0j(kziVar, "pickup_location", true);
                boolean z2 = !lmwVar.a.d(str);
                lvq0 lvq0Var = new lvq0(str, z2, z2);
                apf a5 = uub1.a(new p1b(c, wub1.e(new r51(sourcePicker, decideLaterConfig, null), new ddf(RoutePointType.POINT_B), h0jVar3, m3oVar, lmwVar.d, lmwVar.c, lvq0Var)), dsdVar.a, y9y0Var);
                CompositeAddressSearchView.Companion.getClass();
                fjd fjdVar = new fjd(a5);
                fjdVar.j = wch0.addresses_picker;
                fjdVar.k = true;
                fjdVar.p = PointType.DESTINATION;
                fjdVar.n = new s8w(ipwVar2, ipwVar);
                fjdVar.r = false;
                CompositeAddressSearchModalView.Companion.getClass();
                CompositeAddressSearchModalView.a aVar = new CompositeAddressSearchModalView.a();
                ModalViewOrigin modalViewOrigin = ModalViewOrigin.HOME;
                return b.b(fjdVar, aVar);
            case 10:
                return (OrderCancelModalView) ((zi60) obj3).get();
            case 11:
                mc mcVar = ((t3g0) obj3).a;
                return new PushSettingsModalView((Context) mcVar.a.get(), (g3g0) mcVar.b.get(), (PushSettingsOpenReason) obj);
            case 12:
                return new ScootersLockInstructionModalView((Context) ((hxn0) obj3).a.a.get(), (pdz) obj);
            case 13:
                l5y0 l5y0Var = (l5y0) obj;
                hlx0 hlx0Var = (hlx0) obj3;
                hlx0Var.getClass();
                p5y0 p5y0Var = (p5y0) n3w.a(new p5y0(new zxs0(new abg(hlx0Var, i10), new flx0(new flx0(new abg(hlx0Var, i8), new abg(hlx0Var, i9), i6), new abg(hlx0Var, i7), i3)))).a;
                s2y0 s2y0Var = l5y0Var.a;
                usc uscVar = l5y0Var.b;
                jhu0 jhu0Var = new jhu0(this);
                zxs0 zxs0Var = p5y0Var.a;
                return new TaxiOrderScreenshotSharingModalView((Context) hlx0Var.b, new o5y0(s2y0Var, uscVar, jhu0Var, (wsc) ((abg) zxs0Var.a).get(), (e) ((flx0) zxs0Var.b).get()));
            default:
                return (TelemetryReportModalView) obj3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc(w030 w030Var, Object obj, int i) {
        super(null);
        this.E = i;
        this.F = w030Var;
        this.H = obj;
        this.G = true;
    }
}
