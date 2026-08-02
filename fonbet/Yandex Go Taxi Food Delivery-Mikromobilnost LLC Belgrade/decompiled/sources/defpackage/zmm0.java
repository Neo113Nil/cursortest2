package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.due_timetable.data.api.ScheduledOrderCalculationsApi;
import com.yandex.go.due_timetable.data.repository.a;
import com.yandex.go.scooters.domain.polling.j;
import com.yandex.go.scooters.passes.active.v3.g;
import com.yandex.go.scooters.passes.active.v3.renew.menu.e;
import com.yandex.go.scooters.qr.domain.d;
import com.yandex.go.something_wrong_screen.ui.SomethingWrongOnboardingScreenModalView;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardFragment;
import java.util.Set;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scenario_selector.b;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scenario_selector.c;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.scooters.data.ScootersPhotoApi;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.scooters.data.v;
import ru.yandex.taxi.scooters.domain.r;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.ScootersCompletionPhotoVehicleDetectionModelDownloadApi;

/* loaded from: classes13.dex */
public final class zmm0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public zmm0(n3w n3wVar, p1g p1gVar, gxf gxfVar, elo0 elo0Var, srb srbVar) {
        this.a = 22;
        this.b = n3wVar;
        this.e = p1gVar;
        this.d = gxfVar;
        this.c = elo0Var;
        this.f = srbVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.e;
        xvf0 xvf0Var4 = this.b;
        xvf0 xvf0Var5 = this.c;
        switch (i) {
            case 0:
                return new c((u3s) ((n3w) xvf0Var4).a, (b) ((qy8) xvf0Var5).get(), (hwy0) ((gxf) xvf0Var2).get(), (p6s) ((p1g) xvf0Var3).get(), (sae) ((srb) xvf0Var).get());
            case 1:
                return new a((wiq0) ((jzf) xvf0Var4).get(), (qbl0) ((jzf) xvf0Var5).get(), (ScheduledOrderCalculationsApi) ((gmh) xvf0Var2).get(), (xnm0) ((upk0) xvf0Var3).get(), (wwm) ((fzf) xvf0Var).get());
            case 2:
                return new lrm0((vrm0) ((jpj0) xvf0Var4).get(), (com.yandex.go.scooters.passes.active.v3.freeze.c) ((mam0) xvf0Var5).get(), (Context) xvf0Var2.get(), (w030) xvf0Var3.get(), this.f);
            case 3:
                return new lrm0((ism0) ((jpj0) xvf0Var4).get(), (com.yandex.go.scooters.passes.active.v3.renew.disabling.c) ((mam0) xvf0Var5).get(), (Context) xvf0Var2.get(), (w030) xvf0Var3.get(), this.f);
            case 4:
                return new dtm0((tt2) ((e7g) xvf0Var4).get(), (pwy0) xvf0Var5.get(), (com.yandex.go.scooters.payments.domain.a) xvf0Var2.get(), (ufo0) xvf0Var3.get(), (e) ((p8k0) xvf0Var).get());
            case 5:
                return new gum0((tt2) ((e7g) xvf0Var4).get(), (pwy0) xvf0Var5.get(), (lbn0) xvf0Var2.get(), (g) ((mam0) xvf0Var3).get(), (l0p0) ((ivo0) xvf0Var).get());
            case 6:
                return new lrm0((qum0) ((jpj0) xvf0Var4).get(), (com.yandex.go.scooters.passes.active.v3.winback.c) ((mam0) xvf0Var5).get(), (Context) xvf0Var2.get(), (w030) xvf0Var3.get(), this.f);
            case 7:
                return new ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.a((tt2) ((e7g) xvf0Var4).get(), (ScootersCompletionPhotoVehicleDetectionModelDownloadApi) xvf0Var5.get(), (ywm0) xvf0Var2.get(), (aan0) ((qzm0) xvf0Var3).get(), (r9n0) xvf0Var.get());
            case 8:
                return new tun0((tt2) ((e7g) xvf0Var4).get(), (pwy0) xvf0Var5.get(), (h) xvf0Var2.get(), (com.yandex.go.scooters.insurance.suggest.v2.g) ((wun0) xvf0Var3).get(), (m7n0) xvf0Var.get());
            case 9:
                return new com.yandex.go.scooters.mosru.c(this.b, (com.yandex.go.scooters.mosru.domain.a) xvf0Var5.get(), this.d, (czn0) xvf0Var3.get(), (qx5) xvf0Var);
            case 10:
                return new com.yandex.go.scooters.passes.data.jason.a((deo0) xvf0Var4.get(), (r) xvf0Var5.get(), (com.yandex.go.scooters.payments.domain.a) xvf0Var2.get(), (xeo0) ((wun0) xvf0Var3).get(), (com.yandex.go.scooters.passes.domain.g) xvf0Var.get());
            case 11:
                return new v((Context) xvf0Var4.get(), (tt2) ((e7g) xvf0Var5).get(), (ScootersPhotoApi) xvf0Var2.get(), (ru.yandex.taxi.scooters.data.mapper.b) ((upk0) xvf0Var3).get(), (ru.yandex.taxi.scooters.data.a) xvf0Var.get());
            case 12:
                return new xho0((Context) xvf0Var4.get(), (edh) ((bpf) xvf0Var5).get(), (f2b) xvf0Var2, (vmn0) ((u6o0) xvf0Var3).get(), (kdd0) ((z8n0) xvf0Var).get());
            case 13:
                return new j((qwo0) xvf0Var2.get(), (Lifecycle) ((k7g) xvf0Var4).get(), (tt2) ((e7g) xvf0Var5).get(), (Set) ((y2r0) xvf0Var3).get(), (d3a) ((z1n0) xvf0Var).get());
            case 14:
                return new bno0((Context) xvf0Var4.get(), (com.yandex.go.scooters.qr.preview.domain.a) xvf0Var5.get(), (lmo0) xvf0Var2.get(), (com.yandex.go.scooters.qr.preview.domain.b) ((r5n0) xvf0Var3).get(), (ru.yandex.taxi.scooters.presentation.common.ui.alt_offer.a) ((fzm0) xvf0Var).get());
            case 15:
                return new com.yandex.go.scooters.promotions.domain.a((pwy0) xvf0Var4.get(), (bg5) xvf0Var5.get(), (com.yandex.go.scooters.promotions.data.mapper.a) ((g1n0) xvf0Var2).get(), (zno0) ((z1n0) xvf0Var3).get(), (com.yandex.go.scooters.promotions.data.a) ((elo0) xvf0Var).get());
            case 16:
                return new d((tt2) ((e7g) xvf0Var4).get(), (com.yandex.go.scooters.qr.domain.e) ((g1n0) xvf0Var5).get(), (jpo0) xvf0Var2.get(), (lqo0) xvf0Var3.get(), (com.yandex.go.scooters.qr.domain.result.a) ((p8k0) xvf0Var).get());
            case 17:
                return new lrm0((yp1) ((ivo0) xvf0Var4).get(), (pzo0) xvf0Var5.get(), (Context) xvf0Var2.get(), (w030) xvf0Var3.get(), this.f);
            case 18:
                return new com.yandex.go.scooters.subscription.pci_dss.web.a((j5z) ((k7g) xvf0Var4).get(), (fn21) xvf0Var5.get(), (ru.yandex.taxi.am.token.a) xvf0Var2.get(), (po21) xvf0Var3.get(), (o) xvf0Var.get());
            case 19:
                return new i4p0((ah00) ((u7g) xvf0Var4).get(), (Context) ((u7g) xvf0Var5).get(), (zuj0) ((u7g) xvf0Var2).get(), (eon0) xvf0Var3.get(), (u7g) xvf0Var);
            case 20:
                return new m4p0((zuj0) xvf0Var4.get(), (a3v) xvf0Var5.get(), this.d, this.e, (qg60) xvf0Var);
            case 21:
                return new com.yandex.go.taxi.order.search.domain.entity.mapper.a((Context) ((n3w) xvf0Var4).a, (n20) ((i9g) xvf0Var5).get(), (ru.yandex.taxi.zonemodes.j) ((k9g) xvf0Var2).get(), (com.yandex.go.taxi.order.search.factory.a) ((z8n0) xvf0Var3).get(), (s0c0) ((j9g) xvf0Var).get());
            case 22:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.selector.c((u3s) ((n3w) xvf0Var4).a, (p6s) ((p1g) xvf0Var3).get(), (hwy0) ((gxf) xvf0Var2).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.selector.b) ((elo0) xvf0Var5).get(), (sae) ((srb) xvf0Var).get());
            case 23:
                return new poe0((axm) ((m3g) xvf0Var4).get(), (c4r0) ((r3g) xvf0Var5).get(), (b8r) ((m3g) xvf0Var2).get(), (y1s) ((m3g) xvf0Var3).get(), (dqe0) ((m3g) xvf0Var).get(), 1);
            case 24:
                n7r0 n7r0Var = (n7r0) ((o9g) xvf0Var4).get();
                tfl0 tfl0Var = (tfl0) ((g7g) xvf0Var5).get();
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) ((o9g) xvf0Var2).get();
                pgk0 pgk0Var = (pgk0) ((o9g) xvf0Var3).get();
                ((g7g) xvf0Var).get();
                return new com.ybsdk.feature.settings.internal.view.b(n7r0Var, tfl0Var, appAnalyticsReporter, pgk0Var);
            case 25:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.shortcut_widget.b((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.shortcut_widget.a) ((z8n0) xvf0Var5).get(), (hwy0) ((gxf) xvf0Var2).get(), (p6s) ((p1g) xvf0Var3).get(), (sae) ((srb) xvf0Var).get(), (u3s) ((n3w) xvf0Var4).a);
            case 26:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.show_content.ui.a((b6s0) ((wor0) ((ywf) xvf0Var4).b).a, (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.d) ((oti) xvf0Var5).get(), (d2q0) xvf0Var2.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.domain.j) ((k4) xvf0Var3).get(), (kcz0) ((flx0) xvf0Var).get());
            case 27:
                return new SingleCardFragment((tgs0) ((n3w) xvf0Var4).a, (qn8) ((owf) xvf0Var5).get(), (wm8) ((owf) xvf0Var2).get(), (te8) ((owf) xvf0Var3).get(), (n6r0) ((owf) xvf0Var).get());
            case 28:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slot.c((u3s) ((n3w) xvf0Var4).a, (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slot.b) ((kze) xvf0Var5).get(), (p6s) ((p1g) xvf0Var3).get(), (hwy0) ((gxf) xvf0Var2).get(), (sae) ((srb) xvf0Var).get());
            default:
                return new SomethingWrongOnboardingScreenModalView((Context) ((z9g) xvf0Var4).get(), (c8t0) ((gaq0) xvf0Var5).get(), (pav) ((z9g) xvf0Var2).get(), (k7x0) ((z9g) xvf0Var3).get(), (g8t0) ((i5s0) xvf0Var).get());
        }
    }

    public /* synthetic */ zmm0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public zmm0(n3w n3wVar, kze kzeVar, p1g p1gVar, gxf gxfVar, srb srbVar) {
        this.a = 28;
        this.b = n3wVar;
        this.c = kzeVar;
        this.e = p1gVar;
        this.d = gxfVar;
        this.f = srbVar;
    }

    public zmm0(z8n0 z8n0Var, gxf gxfVar, p1g p1gVar, srb srbVar, n3w n3wVar) {
        this.a = 25;
        this.c = z8n0Var;
        this.d = gxfVar;
        this.e = p1gVar;
        this.f = srbVar;
        this.b = n3wVar;
    }

    public zmm0(jko0 jko0Var, k7g k7gVar, e7g e7gVar, xvf0 xvf0Var, y2r0 y2r0Var, z1n0 z1n0Var) {
        this.a = 13;
        this.b = k7gVar;
        this.c = e7gVar;
        this.d = xvf0Var;
        this.e = y2r0Var;
        this.f = z1n0Var;
    }
}
