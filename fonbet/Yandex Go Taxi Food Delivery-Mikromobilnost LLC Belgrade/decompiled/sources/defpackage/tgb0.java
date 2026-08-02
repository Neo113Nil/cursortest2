package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.feedsdk.di.FeedSdkComponent;
import com.yandex.go.multimodal_route.interactors.i;
import com.yandex.go.pickup_from_photo.experiment.p;
import com.yandex.go.places.flex.container.ui.PlacesFlexContainerScreenView;
import com.yandex.go.plus.pay.presentation.b;
import com.yandex.go.taxi.order.queue.interactor.d;
import com.yandex.go.taxi.order.queue.interactor.l;
import com.yandex.go.taxi.order.search.ui.overlay.proxy.c;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.pin.internal.domain.biometric.a;
import com.ybsdk.feature.qr.payments.internal.screens.subscription.presentation.QrPaymentsSubscriptionFragment;
import com.ybsdk.network.PciDssApi;
import java.util.Set;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceOptionSelectorView;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceSelectorWithHeaderView;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.e;
import ru.yandex.taxi.requirements.ui.selector.RequirementOptionsSelectView;
import ru.yandex.taxi.summary.requirements.list.interactors.v;

/* loaded from: classes14.dex */
public final class tgb0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public tgb0(y2r0 y2r0Var, n3w n3wVar, n3w n3wVar2, nwf nwfVar) {
        this.a = 3;
        this.c = y2r0Var;
        this.b = n3wVar;
        this.d = n3wVar2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new sgb0((Context) ((z4g) xvf0Var2).get(), (tt2) xvf0Var3.get(), (p) xvf0Var.get());
            case 1:
                return new p370(29, (mum) ((hbn) xvf0Var2).get(), (l6s) ((cuo) xvf0Var).get(), (p6s) xvf0Var3.get());
            case 2:
                Context context = (Context) ((l5g) xvf0Var2).get();
                lz70 lz70Var = (lz70) ((l5g) xvf0Var3).get();
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) ((l5g) xvf0Var).get();
                ux5 ux5Var = (ux5) ((kg51) lz70Var.b).o.invoke();
                return ux5Var == null ? new a(context, appAnalyticsReporter) : ux5Var;
            case 3:
                return new n8c0((Set) ((y2r0) xvf0Var2).get(), (Set) ((n3w) xvf0Var3).a, (Set) ((n3w) xvf0Var).a, new kwl());
            case 4:
                return new d9c0((ffe) ((n3w) xvf0Var2).a, (PlacesFlexContainerScreenView) ((tgb0) xvf0Var3).get(), ((Boolean) ((n3w) xvf0Var).a).booleanValue());
            case 5:
                return new PlacesFlexContainerScreenView((Context) ((n5g) xvf0Var2).get(), (FeedSdkComponent) xvf0Var3.get(), (b9c0) ((wi7) xvf0Var).get());
            case 6:
                return new w040((Context) ((x4g) xvf0Var2).get(), (ofc0) xvf0Var3.get(), (tcc0) ((g680) xvf0Var).get());
            case 7:
                return new b((ep90) ((r5g) xvf0Var2).get(), (m) ((r5g) xvf0Var).get(), (tse) xvf0Var3.get());
            case 8:
                return new gpc((crg) xvf0Var3.get(), (p78) ((i9g) xvf0Var2).get(), (jtq0) ((j9g) xvf0Var).get());
            case 9:
                return new mae0((Activity) xvf0Var3.get(), (xav) xvf0Var.get(), (com.yandex.messaging.internal.view.input.emojipanel.a) ((c7n) xvf0Var2).get());
            case 10:
                return new mcf0((AppAnalyticsReporter) ((u2g) xvf0Var2).get(), (rb00) ((u2g) xvf0Var3).get(), (Context) ((u1g) xvf0Var).get());
            case 11:
                return new q6c0(14, (f17) xvf0Var3.get(), (oh4) ((qh4) xvf0Var2).get(), (yfa) ((peb) xvf0Var).get());
            case 12:
                return new btf0((bh4) ((tl3) xvf0Var2).get(), (vdc) xvf0Var3.get(), (la01) ((y501) xvf0Var).get());
            case 13:
                return new c((iup0) ((j9g) xvf0Var2).get(), (ga30) ((j9g) xvf0Var3).get(), (d) ((j9g) xvf0Var).get());
            case 14:
                return new a8g0((mag0) xvf0Var3.get(), (m7g0) ((n3w) xvf0Var2).a, ((br00) xvf0Var).a);
            case 15:
                return new QrPaymentsSubscriptionFragment((wag0) ((n3w) xvf0Var2).a, (qag0) ((c6g) xvf0Var3).get(), (j3h) ((c6g) xvf0Var).get());
            case 16:
                return new com.yandex.go.taxi.order.queue.mapper.a((pdc) ((i9g) xvf0Var).get(), (k7x0) ((j9g) xvf0Var3).get(), (ru.yandex.taxi.widget.c) ((i9g) xvf0Var2).get());
            case 17:
                return new com.yandex.go.taxi.order.search.overlay.mvp.a((o2y0) ((n3w) xvf0Var2).a, (wz8) ((i9g) xvf0Var3).get(), (ru.yandex.taxi.single.a) ((j9g) xvf0Var).get());
            case 18:
                return new alg0((o2y0) ((n3w) xvf0Var2).a, (ljg0) ((kxb0) xvf0Var3).get(), (l) ((q150) xvf0Var).get());
            case 19:
                return new ahi0((epb0) xvf0Var3.get(), (p) xvf0Var.get(), (zuj0) ((n5g) xvf0Var2).get());
            case 20:
                return new ari0((PciDssApi) ((k6g) xvf0Var2).get(), xvf0Var3, xvf0Var);
            case 21:
                return new i((p2y0) ((b4g) xvf0Var2).get(), (ysg) ((b4g) xvf0Var).get(), (yu40) xvf0Var3.get());
            case 22:
                return new q6c0(24, (a2j0) xvf0Var3.get(), (aye0) ((zni0) xvf0Var2).get(), (x1j0) ((v4g) xvf0Var).get());
            case 23:
                return new RequiredAltChoiceOptionSelectorView((Context) xvf0Var3.get(), (e) ((i1w) xvf0Var2).get(), (pav) xvf0Var.get());
            case 24:
                return new RequiredAltChoiceSelectorWithHeaderView((Context) xvf0Var3.get(), (tgb0) xvf0Var2, (haj0) ((n7i0) xvf0Var).get());
            case 25:
                return new gcj0((d800) xvf0Var3.get(), (lcj0) xvf0Var.get(), (yfj0) ((av4) xvf0Var2).get());
            case 26:
                return new ru.yandex.taxi.interactor.a((ru.yandex.taxi.ui.form.constructor.a) ((jpf0) xvf0Var2).get(), (ck31) xvf0Var3.get(), (lcj0) xvf0Var.get());
            case 27:
                return new ru.yandex.taxi.summary.requirements.list.router.a((ru.yandex.taxi.banners.c) ((p6g) xvf0Var2).get(), (q6c0) ((s3f0) xvf0Var3).get(), (v) ((vfg0) xvf0Var).get());
            case 28:
                return new t((Context) xvf0Var3.get(), (w030) xvf0Var.get(), (o8g0) ((n7i0) xvf0Var2).get());
            default:
                return new RequirementOptionsSelectView((Context) xvf0Var3.get(), (bf70) ((ys10) xvf0Var2).get(), (qjj0) ((n7i0) xvf0Var).get());
        }
    }

    public /* synthetic */ tgb0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, byte b) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ tgb0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, char c) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.c = xvf0Var3;
    }

    public /* synthetic */ tgb0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, boolean z) {
        this.a = i;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.b = xvf0Var3;
    }

    public /* synthetic */ tgb0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
        this.d = xvf0Var3;
    }
}
