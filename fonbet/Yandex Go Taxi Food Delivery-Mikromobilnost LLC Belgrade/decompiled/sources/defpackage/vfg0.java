package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.go.delivery.rental_duration_selector.e;
import com.yandex.go.due_timetable.data.api.ScheduledOrderSeatsAvailableApi;
import com.yandex.go.taxi.order.details.v2.state.elements.promoblock.b;
import com.yandex.go.taxi.order.queue.presentation.QueueView;
import com.yandex.go.taxi.order.recenter.n;
import com.yandex.go.taxi.order.repositories.c;
import com.yandex.go.timer.k;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.qr.payments.internal.screens.list.presentation.a;
import com.ybsdk.feature.savings.internal.screens.account.SavingsAccountFragment;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui.d;
import ru.yandex.taxi.preorder.source.domain.o;
import ru.yandex.taxi.scooters.domain.r;
import ru.yandex.taxi.summary.requirements.list.interactors.v;

/* loaded from: classes13.dex */
public final class vfg0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public vfg0(lwl0 lwl0Var, u0g u0gVar, a1g a1gVar, eqh eqhVar) {
        this.a = 24;
        this.c = lwl0Var;
        this.d = u0gVar;
        this.e = a1gVar;
        this.b = eqhVar;
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
                return new a((yfg0) xvf0Var4.get(), (tfl0) ((c6g) xvf0Var3).get(), (com.ybsdk.feature.qr.payments.internal.screens.list.data.a) ((kxb0) xvf0Var2).get(), (m04) ((kxb0) xvf0Var).get());
            case 1:
                return new QueueView((Context) ((n3w) xvf0Var4).a, (ip11) ((j9g) xvf0Var3).get(), (alg0) ((tgb0) xvf0Var2).get(), (pav) ((i9g) xvf0Var).get());
            case 2:
                return new fbi0((mp11) xvf0Var4.get(), (jai0) xvf0Var3.get(), (oy80) ((vm80) xvf0Var2).get(), (com.yandex.messaging.internal.backendconfig.a) xvf0Var.get());
            case 3:
                return new hgi0((o2y0) xvf0Var4.get(), (c) xvf0Var3.get(), (h760) ((u4g) xvf0Var2).get(), (n) ((t4g) xvf0Var).get());
            case 4:
                return new azi0((qcp0) ((l6g) xvf0Var3).get(), (hzi0) xvf0Var4.get(), (gzi0) ((m6g) xvf0Var2).get(), (e) ((m6g) xvf0Var).get());
            case 5:
                return new hzi0((Context) ((l6g) xvf0Var3).get(), (d) xvf0Var4.get(), (hwy0) ((l6g) xvf0Var2).get(), (dci) ((l6g) xvf0Var).get());
            case 6:
                return new h6j0((sl3) xvf0Var4.get(), (f25) xvf0Var3.get(), (OkHttpClient) ((ix50) xvf0Var2).get(), (abe) ((nb11) xvf0Var).get());
            case 7:
                return new ru.yandex.taxi.preorder.summary.altchoice.ui.c((ViewGroup) ((n3w) xvf0Var4).a, (rqc) ((n3w) xvf0Var3).a, (caj0) ((n7i0) xvf0Var2).get(), (taj0) xvf0Var);
            case 8:
                return new kdd0((dqe0) ((w0g) xvf0Var3).get(), (wiq0) ((w0g) xvf0Var2).get(), (ck31) xvf0Var4.get(), (ynj0) ((w0g) xvf0Var).get());
            case 9:
                return new v((ru.yandex.taxi.banners.c) ((p6g) xvf0Var3).get(), (lot0) xvf0Var4.get(), (roj0) xvf0Var2.get(), (tt2) ((p6g) xvf0Var).get());
            case 10:
                return new kdd0((Context) ((t0g) xvf0Var3).get(), (pdc) xvf0Var4.get(), (zuj0) xvf0Var2.get(), (zkz0) xvf0Var.get());
            case 11:
                return new kdd0((dqe0) ((w0g) xvf0Var3).get(), (cjj0) xvf0Var4.get(), (hqj0) xvf0Var2.get(), (ewi0) xvf0Var.get());
            case 12:
                return new com.yandex.go.navigator.driving.analytics.a((me50) xvf0Var4.get(), (eb50) xvf0Var3.get(), (com.yandex.go.navigator.main_screen.experiement.e) ((uc50) xvf0Var2).get(), (hbp0) ((j4g) xvf0Var).get());
            case 13:
                ((w0g) xvf0Var4).get();
                ((a1g) xvf0Var3).get();
                ((a1g) xvf0Var2).get();
                ((a1g) xvf0Var).get();
                return new r100();
            case 14:
                return new com.yandex.go.taxi.order.details.v2.state.elements.container.collapsing.c((cgk0) xvf0Var4.get(), (jkk0) xvf0Var3.get(), (b) ((jpj0) xvf0Var2).get(), (com.yandex.go.taxi.order.details.v2.state.elements.promoblock.a) xvf0Var.get());
            case 15:
                return new com.yandex.go.taxi.order.details.v2.state.elements.companion_buffer_search.a((irs0) xvf0Var4.get(), (crg) xvf0Var3.get(), (k) xvf0Var2.get(), (com.yandex.go.taxi.order.details.v2.state.elements.companion_buffer_search.animation.a) ((nck0) xvf0Var).get());
            case 16:
                return new com.yandex.go.taxi.order.details.v2.state.elements.promoblock.c((com.yandex.go.taxi.order.details.v2.state.elements.promoblock.a) xvf0Var4.get(), (ru.yandex.taxi.communications.data.a) xvf0Var3.get(), (z4r) ((s6g) xvf0Var2).get(), (qpf0) xvf0Var.get());
            case 17:
                return new com.yandex.go.taxi.order.details.v2.state.elements.share_location.a((irs0) xvf0Var4.get(), (sqs0) xvf0Var3.get(), (ru.yandex.taxi.order.d) ((s6g) xvf0Var2).get(), (zuj0) xvf0Var.get());
            case 18:
                return new com.yandex.go.taxi.order.details.v2.state.elements.timeline.a((irs0) xvf0Var4.get(), (lbk0) xvf0Var3.get(), (k7x0) xvf0Var2.get(), (com.yandex.go.taxi.order.details.v2.state.elements.timeline.options.a) ((lok0) xvf0Var).get());
            case 19:
                return new y5l0((qcp0) ((y6g) xvf0Var4).get(), (x5l0) ((jpj0) xvf0Var3).get(), (w5l0) ((z6g) xvf0Var2).get(), (u5l0) ((z6g) xvf0Var).get());
            case 20:
                return new ru.yandex.taxi.preorder.map.c((Context) xvf0Var4.get(), (com.yandex.go.pin.api.widget.b) xvf0Var3.get(), (ru.yandex.taxi.preorder.map.interactor.b) ((rwh) xvf0Var2).get(), (boj0) ((ncb) xvf0Var).get());
            case 21:
                return new com.ybsdk.feature.card.internal.samsungpay.d((wm8) ((owf) xvf0Var4).get(), (Context) ((owf) xvf0Var3).get(), (jd8) ((kd8) xvf0Var2).get(), (ov3) ((owf) xvf0Var).get());
            case 22:
                return new SavingsAccountFragment((x7m0) ((n3w) xvf0Var4).a, (mdm0) ((g7g) xvf0Var3).get(), (anp0) ((g7g) xvf0Var2).get(), (AppAnalyticsReporter) ((g7g) xvf0Var).get());
            case 23:
                return new kk5(((e7g) xvf0Var4).get(), ((e7g) xvf0Var3).get(), ((e7g) xvf0Var2).get(), (w030) ((n3w) xvf0Var).a, 8);
            case 24:
                return new ru.yandex.taxi.scheduleride.deeplink.b((lnm0) ((lwl0) xvf0Var3).get(), (hit) ((u0g) xvf0Var2).get(), (o) ((a1g) xvf0Var).get(), (z880) xvf0Var4.get());
            case 25:
                return new tnm0((zuj0) xvf0Var4.get(), (ynm0) ((a1g) xvf0Var3).get(), (poe) xvf0Var2.get(), (j290) xvf0Var.get());
            case 26:
                return new com.yandex.go.due_timetable.data.repository.impl.a((tt2) xvf0Var4.get(), (ScheduledOrderSeatsAvailableApi) ((faj) xvf0Var3).get(), (wiq0) ((jzf) xvf0Var2).get(), (wwm) xvf0Var.get());
            case 27:
                return new f28(xvf0Var3.get(), xvf0Var2.get(), (w030) xvf0Var4.get(), ((n7i0) xvf0Var).get(), 9);
            case 28:
                return new com.yandex.go.scooters.passes.active.v3.d((qxm0) xvf0Var4.get(), i5m.a(xvf0Var3), (r) xvf0Var2.get(), (com.yandex.go.scooters.passes.active.domain.d) ((zxm0) xvf0Var).get());
            default:
                return new com.yandex.go.scooters.offers.v2.domain.b((Context) xvf0Var4.get(), (tt2) ((e7g) xvf0Var3).get(), (d0p0) ((oto0) xvf0Var2).get(), (d3a) ((bwn0) xvf0Var).get());
        }
    }

    public /* synthetic */ vfg0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, boolean z) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ vfg0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public vfg0(w0g w0gVar, w0g w0gVar2, y0g y0gVar, w0g w0gVar3) {
        this.a = 8;
        this.c = w0gVar;
        this.d = w0gVar2;
        this.b = y0gVar;
        this.e = w0gVar3;
    }
}
