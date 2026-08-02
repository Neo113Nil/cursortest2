package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import com.yandex.fintechsdk.flows.payment.kit.api.model.AdditionalSettings;
import com.yandex.go.chargers.offer.passes.data.api.ChargersPassesApi;
import com.yandex.go.chargers.offer.passes.data.f;
import com.yandex.go.chargers.partner_subscription.ui.a;
import com.yandex.go.chargers.partner_subscription.ui.b;
import com.yandex.go.chargers.passes.data.k;
import com.yandex.go.chargers.passes.data.m0;
import com.yandex.go.chargers.passes.data.r0;
import com.yandex.go.chargers.passes.ui.e;
import com.yandex.go.chargers.passes.ui.purchase.d;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinFragment;
import com.ybsdk.feature.pin.internal.screens.createpin.CreatePinFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.random.Random;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.requirements.ui.selector.compound.CompoundOptionSelectorView;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class xea implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public /* synthetic */ xea(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.b;
        xvf0 xvf0Var4 = this.c;
        switch (i) {
            case 0:
                return new a((tt2) ((lxf) xvf0Var4).get(), (com.yandex.go.chargers.error.data.a) xvf0Var3.get(), (com.yandex.go.chargers.partner_subscription.data.a) ((mu7) xvf0Var2).get(), (b) ((lu9) xvf0Var).get());
            case 1:
                return new f((wnt) xvf0Var3.get(), (ChargersPassesApi) xvf0Var4.get(), (c) ((pxf) xvf0Var2).get(), (com.yandex.go.chargers.data.f) xvf0Var.get());
            case 2:
                return new com.yandex.go.chargers.passes.ui.purchase.c((c) xvf0Var3.get(), (r0) xvf0Var4.get(), (com.yandex.go.chargers.payments.data.a) xvf0Var2.get(), (d) ((lu9) xvf0Var).get());
            case 3:
                return new com.yandex.go.chargers.offer.passes.ui.a((zuj0) xvf0Var3.get(), (e2e0) xvf0Var4.get(), (com.yandex.go.chargers.offer.passes.domain.a) ((zfa) xvf0Var2).get(), (com.yandex.go.chargers.offer.domain.c) ((kj7) xvf0Var).get());
            case 4:
                return new r0(i5m.a(xvf0Var3), (com.yandex.go.chargers.error.data.a) xvf0Var4.get(), (m0) ((mu7) xvf0Var2).get(), (com.yandex.go.chargers.payments.data.a) xvf0Var.get());
            case 5:
                return new e((yp2) ((lxf) xvf0Var4).get(), (ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (c) xvf0Var2.get(), (k) ((dx9) xvf0Var).get());
            case 6:
                return new com.yandex.go.chargers.offer.plus_dvizh.ui.a((zuj0) xvf0Var3.get(), (com.yandex.go.chargers.offer.plus_dvizh.domain.a) ((zfa) xvf0Var4).get(), (e2e0) xvf0Var2.get(), (com.yandex.go.chargers.offer.domain.c) ((kj7) xvf0Var).get());
            case 7:
                return new com.yandex.go.chargers.polling.k((ysa) xvf0Var2.get(), (Lifecycle) xvf0Var3.get(), (tt2) ((lxf) xvf0Var4).get(), (Set) ((y2r0) xvf0Var).get());
            case 8:
                return new rpa((dne0) xvf0Var3.get(), (wnt) xvf0Var4.get(), (jtq0) ((qxf) xvf0Var2).get(), (g) xvf0Var.get());
            case 9:
                return new com.yandex.go.chargers.station.domain.c((com.yandex.go.chargers.station.data.c) ((zs0) xvf0Var4).get(), (ura) xvf0Var3.get(), (com.yandex.go.chargers.error.data.a) xvf0Var2.get(), (yfa) ((ba9) xvf0Var).get());
            case 10:
                return new com.yandex.go.chargers.subscription.presentation.landing.d((em9) xvf0Var3.get(), i5m.a((qxf) xvf0Var4), (com.yandex.go.chargers.error.data.a) xvf0Var2.get(), (zta) ((mu7) xvf0Var).get());
            case 11:
                return new xua((pwy0) xvf0Var3.get(), (c) xvf0Var4.get(), (com.yandex.go.chargers.error.data.a) xvf0Var2.get(), (com.yandex.go.chargers.subscription.domain.a) ((s90) xvf0Var).get());
            case 12:
                return new com.yandex.go.chargers.subscription.data.a((tt2) ((lxf) xvf0Var4).get(), (pwy0) xvf0Var3.get(), (com.yandex.go.chargers.subscription.data.mapper.a) ((lu9) xvf0Var2).get(), i5m.a(xvf0Var));
            case 13:
                return new m0b((Looper) xvf0Var3.get(), (sb7) xvf0Var4.get(), (ymu) ((ze) xvf0Var2).get(), (c8b) xvf0Var.get());
            case 14:
                return new lbb((cbb) xvf0Var3.get(), (vcz0) xvf0Var4.get(), (exy) xvf0Var2.get(), (ebb) ((rs0) xvf0Var).get());
            case 15:
                return new CheckPinFragment((com.ybsdk.feature.pin.internal.screens.checkpin.a) ((n3w) xvf0Var4).a, (eyp0) ((nwf) xvf0Var2).get(), (ux5) xvf0Var3.get(), (fj3) ((l5g) xvf0Var).get());
            case 16:
                return new ru.yandex.taxi.masstransit.geopayment.checkout.b((c) xvf0Var3.get(), (pav) ((b3g) xvf0Var4).get(), (zuj0) xvf0Var2.get(), (wnt) ((b3g) xvf0Var).get());
            case 17:
                return new com.yandex.messaging.ui.settings.a((Activity) xvf0Var3.get(), (zrm) ((f9t) xvf0Var4).get(), (com.yandex.messaging.ui.settings.c) ((f380) xvf0Var2).get(), (ab4) xvf0Var.get());
            case 18:
                return new ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.e((csb) ((xxf) xvf0Var4).b.a, (lw) xvf0Var3.get(), (ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.interactors.b) xvf0Var2.get(), (ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.d) xvf0Var.get());
            case 19:
                return new azb((z880) xvf0Var3.get(), (ru.yandex.taxi.clarifypoint.b) xvf0Var4.get(), (gqz0) xvf0Var2.get(), (ro0) ((c4) xvf0Var).get());
            case 20:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.complete_buttons.b((ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((mzf) xvf0Var4).get(), (y47) xvf0Var3.get(), (hwy0) ((ibg) xvf0Var2).get(), (io9) ((srb) xvf0Var).get());
            case 21:
                return new CompoundOptionSelectorView((Context) xvf0Var3.get(), (pav) xvf0Var4.get(), (pdc) xvf0Var2.get(), (ivd) ((px4) xvf0Var).get());
            case 22:
                return new com.yandex.messaging.phonecontacts.a((rbt) ((c0j) xvf0Var4).get(), (kse) xvf0Var3.get(), (fft) xvf0Var2.get(), (x22) xvf0Var.get());
            case 23:
                return new dbe((tae) ((n3w) xvf0Var4).a, (gzh) ((fxf) xvf0Var3).get(), (vbb) ((dx9) xvf0Var2).get(), (yfa) ((srb) xvf0Var).get());
            case 24:
                AdditionalSettings additionalSettings = (AdditionalSettings) ((n3w) xvf0Var4).a;
                Context context = (Context) xvf0Var3.get();
                tse tseVar = (tse) xvf0Var2.get();
                try {
                    String concat = ((rgs) ((k0n) xvf0Var).get()).a().concat("/tracing/v1/traces");
                    Map i2 = kotlin.collections.b.i(new Pair("service.name", "fintech-sdk"), new Pair("host.name", concat), new Pair("payment_src", context.getApplicationInfo().packageName), new Pair("sdk_version", "1.16.9"));
                    sjh sjhVar = uyj.a;
                    bvf0.a(mdh.b);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Random.Default r1 = Random.a;
                    String e = bgu.e(r1.j(16));
                    String e2 = bgu.e(r1.j(8));
                    linkedHashMap.putAll(i2);
                    String traceId = additionalSettings.getTraceId();
                    String str = traceId != null ? traceId : e;
                    String spanId = additionalSettings.getSpanId();
                    return new com.yandex.fintechsdk.core.telemetry.impl.b(context, linkedHashMap, concat, tseVar, str, spanId != null ? spanId : e2);
                } catch (Throwable unused) {
                    return new iwu0();
                }
            case 25:
                return new kn3((dqe0) ((w0g) xvf0Var4).get(), (w3i) ((bo2) xvf0Var2).get(), (cda0) xvf0Var3.get(), (sk7) ((f2b) xvf0Var).get(), 1);
            case 26:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.cost_detail.a((u3s) ((n3w) xvf0Var4).a, (hwy0) ((gxf) xvf0Var3).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.cost_detail.b) ((qy8) xvf0Var2).get(), (sae) ((srb) xvf0Var).get());
            case 27:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.counter.a((u3s) ((n3w) xvf0Var4).a, (p6s) ((p1g) xvf0Var3).get(), (do6) ((kze) xvf0Var2).get(), (sae) ((srb) xvf0Var).get());
            case 28:
                return new CreatePinFragment((d7f) ((n3w) xvf0Var4).a, (anp0) ((p5g) xvf0Var3).get(), (dwb0) ((l5g) xvf0Var2).get(), (fj3) ((l5g) xvf0Var).get());
            default:
                return new an8((eaf) ((n3w) xvf0Var4).a, (baf) xvf0Var3, (baf) xvf0Var2, (baf) xvf0Var, 27);
        }
    }

    public /* synthetic */ xea(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, byte b) {
        this.a = i;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.b = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ xea(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }
}
