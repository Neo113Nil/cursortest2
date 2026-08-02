package defpackage;

import android.content.Context;
import com.yandex.go.navigator.domain.a0;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.p0;
import com.yandex.go.taxi.order.details.v2.navigation.d;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.multi.feed.experiments.e;
import com.yandex.messaging.internal.v;
import com.yandex.messaging.ui.settings.inviteLinkInfo.c;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.testpayment.internal.domain.b;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.tag_line.a;
import ru.yandex.taxi.layers.api.TrackerApi;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.summary.requirements.list.interactors.l0;

/* loaded from: classes14.dex */
public final class z6x0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public z6x0(flx0 flx0Var, y501 y501Var, xvf0 xvf0Var, n3w n3wVar) {
        this.a = 14;
        this.c = flx0Var;
        this.d = y501Var;
        this.e = xvf0Var;
        this.b = n3wVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new a((u3s) ((n3w) xvf0Var4).a, (u0z) ((kze) xvf0Var3).get(), (hwy0) ((gxf) xvf0Var2).get(), (sae) ((srb) xvf0Var).get());
            case 1:
                return new u61(i5m.a((eqh) xvf0Var4), (htg) ((exf) xvf0Var3).get(), (u1n) ((k0n) xvf0Var2).get(), i5m.a((p4) xvf0Var));
            case 2:
                return new p0((l0) ((u6o0) xvf0Var4).get(), (kdd0) ((vfg0) xvf0Var3).get(), (com.yandex.go.summary.mapper.a) ((s3f0) xvf0Var2).get(), (viv0) xvf0Var.get());
            case 3:
                return new epx0((tj60) xvf0Var4.get(), (dpx0) ((fat0) xvf0Var3).get(), (ru.yandex.taxi.summary.topnotification.tariff_unavailable.presentation.a) xvf0Var2.get(), (co40) ((rbx0) xvf0Var).get());
            case 4:
                return new a1y0((f0) xvf0Var4.get(), (e) ((rbx0) xvf0Var3).get(), (gpq) xvf0Var2.get(), (ev70) xvf0Var.get());
            case 5:
                return new d((tse) xvf0Var4.get(), (f0g) xvf0Var3.get(), (q2p) xvf0Var2, (oep0) xvf0Var.get());
            case 6:
                return new c((v) xvf0Var4.get(), (com.yandex.messaging.domain.inviteLink.a) xvf0Var3.get(), (reu) ((k1w) xvf0Var2).get(), (r1s) ((ret) xvf0Var).get());
            case 7:
                return new b((com.ybsdk.feature.testpayment.internal.data.b) ((lk) xvf0Var4).get(), (com.ybsdk.feature.testpayment.internal.data.a) ((lk) xvf0Var3).get(), (com.ybsdk.utils.poller.b) ((hag) xvf0Var2).get(), (AppAnalyticsReporter) ((hag) xvf0Var).get());
            case 8:
                return new hwo0((p6s) ((dxf) xvf0Var4).get(), (ru.yandex.logistics.sdk.cargo_form.impl.domain.a) xvf0Var3.get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text_input.d) xvf0Var2.get(), (u1n) ((k0n) xvf0Var).get(), 22);
            case 9:
                return new lpy0((qcp0) ((bbg) xvf0Var4).get(), (spy0) xvf0Var3.get(), (rpy0) ((cbg) xvf0Var2).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.a) ((cbg) xvf0Var).get());
            case 10:
                return new spy0((Context) ((bbg) xvf0Var4).get(), (upy0) xvf0Var3.get(), (hwy0) ((bbg) xvf0Var2).get(), (dci) ((bbg) xvf0Var).get());
            case 11:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text_input.c((u3s) ((n3w) xvf0Var4).a, (p6s) ((p1g) xvf0Var3).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text_input.b) ((qy8) xvf0Var2).get(), (sae) ((srb) xvf0Var).get());
            case 12:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.top_accent_bar.e((ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((mzf) xvf0Var4).get(), (hwy0) ((ibg) xvf0Var3).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.top_accent_bar.b) ((gpx0) xvf0Var2).get(), (ru.yandex.taxi.logistics.sdk.tracking.domain.impl.c) ((mzf) xvf0Var).get());
            case 13:
                return new com.yandex.go.places.impl.domain.interactors.b((TrackerApi) ((z4g) xvf0Var4).get(), (kb20) ((x4g) xvf0Var3).get(), (rs2) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 14:
                return new ru.yandex.taxi.masstransit.trains.search.a((lc01) ((flx0) xvf0Var3).get(), (ru.yandex.taxi.masstransit.trains.search.d) ((y501) xvf0Var2).get(), (b611) xvf0Var.get(), (TransportRouteAnalytics$FlowOrigin) ((n3w) xvf0Var4).a);
            case 15:
                return new kc01((Context) xvf0Var4.get(), (w030) xvf0Var3.get(), (pc01) ((gpx0) xvf0Var2).get(), (ru.yandex.taxi.masstransit.trains.search.a) ((z6x0) xvf0Var).get());
            case 16:
                return new cv01((AppAnalyticsReporter) ((hag) xvf0Var4).get(), (sb6) ((vs3) xvf0Var3).get(), (ro01) ((qbg) xvf0Var2).get(), (Context) ((qbg) xvf0Var).get());
            case 17:
                return new x811((biv0) ((b1g) xvf0Var4).get(), (jzz) ((nwf) xvf0Var3).get(), (rft0) ((a1g) xvf0Var2).get(), (ck31) xvf0Var.get());
            case 18:
                return new zp11((z7b) ((nb11) xvf0Var4).get(), (nft) xvf0Var3.get(), (rp21) xvf0Var2.get(), (Context) xvf0Var.get());
            case 19:
                return new pw11((Context) ((t0g) xvf0Var4).get(), (i130) xvf0Var3.get(), (uq1) xvf0Var2.get(), (ajj0) ((cta0) xvf0Var).get());
            case 20:
                return new com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.d((tt2) ((sag) xvf0Var4).get(), (com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.qr.b) ((uw11) xvf0Var3).get(), (c021) xvf0Var2.get(), (wz11) xvf0Var.get());
            case 21:
                return new com.yandex.go.universal_qr_scanner.domain.torch.b((tt2) ((sag) xvf0Var4).get(), (f121) xvf0Var3.get(), (com.yandex.go.universal_qr_scanner.domain.camera.a) xvf0Var2.get(), (pz11) xvf0Var.get());
            case 22:
                return new a0((l4u) ((b2g) xvf0Var4).get(), (tt2) xvf0Var3.get(), (vff) ((b2g) xvf0Var2).get(), (e621) ((b2g) xvf0Var).get());
            case 23:
                return new com.yandex.fintechsdk.features.bdui.internal.presentation.action.yb.split.upgrade.a((iee) xvf0Var4.get(), (rbs) xvf0Var3.get(), (com.yandex.fintechsdk.logic.yb.impl.upgrade.internal.a) ((p6f) xvf0Var2).get(), (ns31) xvf0Var.get());
            case 24:
                return new cz21((Context) ((t0g) xvf0Var4).get(), (oep0) xvf0Var3.get(), (cp01) xvf0Var2.get(), (y501) xvf0Var);
            case 25:
                return new s421((w030) ((jcg) xvf0Var4).get(), (Context) ((sag) xvf0Var3).get(), (i331) xvf0Var2.get(), (i3m) ((jcg) xvf0Var).get(), 3);
            case 26:
                return new ru.yandex.taxi.preorder.summary.selector.model.vertical.a((ti31) ((y101) xvf0Var4).get(), (zxs0) ((flx0) xvf0Var3).get(), (mrx0) xvf0Var2.get(), (xc11) xvf0Var.get());
            case 27:
                return new fj31((qcp0) ((lcg) xvf0Var4).get(), (kj31) xvf0Var3.get(), (jj31) ((mcg) xvf0Var2).get(), (lj31) ((mcg) xvf0Var).get());
            case 28:
                return new kj31((Context) ((lcg) xvf0Var4).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.d) xvf0Var3.get(), (hwy0) ((lcg) xvf0Var2).get(), (dci) ((lcg) xvf0Var).get());
            default:
                return new n12((Context) ((jcg) xvf0Var4).get(), (w030) ((pcg) xvf0Var3).get(), (com.yandex.go.walking.navigation.impl.error.interactor.a) xvf0Var2.get(), (e141) xvf0Var.get());
        }
    }

    public /* synthetic */ z6x0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }
}
