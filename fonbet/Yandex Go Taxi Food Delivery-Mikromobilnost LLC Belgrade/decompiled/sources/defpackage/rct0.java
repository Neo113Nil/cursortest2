package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.route.interactor.b;
import com.yandex.go.route.interactor.c;
import com.yandex.go.superapp_carts.ui.preview.PreviewBackwardAction;
import com.yandex.go.zone.repository.o;
import com.yandex.messaging.internal.v;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.transactions.impl.data.network.TransactionsApi;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.m;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.combo.ui.TravelCompanionStatusView;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.d;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.f;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.h;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;
import ru.yandex.taxi.orderforanother.repository.a;
import ru.yandex.taxi.preorder.source.mode.interactor.e;
import ru.yandex.taxi.preorder.summary.solid.interactors.c0;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes14.dex */
public final class rct0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public rct0(w0g w0gVar, uc50 uc50Var, c1g c1gVar, y0g y0gVar, p6f p6fVar) {
        this.a = 25;
        this.b = w0gVar;
        this.d = uc50Var;
        this.e = c1gVar;
        this.c = y0gVar;
        this.f = p6fVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 3;
        int i3 = 4;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.c;
        xvf0 xvf0Var5 = this.b;
        switch (i) {
            case 0:
                return new fcj0((tt2) xvf0Var5.get(), (zuj0) xvf0Var4.get(), (vwm) ((z0s0) xvf0Var2).get(), (b) ((l3g) xvf0Var).get(), (c) xvf0Var3.get());
            case 1:
                return new tft0((nzb0) xvf0Var5.get(), (e) xvf0Var4.get(), (AddressResolveRepository) xvf0Var3.get(), i5m.a((mz70) xvf0Var2), (fy01) xvf0Var.get());
            case 2:
                return new sgt0((qv70) xvf0Var5.get(), (w4p) xvf0Var4.get(), (aw70) xvf0Var3.get(), (a) xvf0Var2.get(), (zo0) xvf0Var);
            case 3:
                return new vnt0((Context) xvf0Var5.get(), (bf50) xvf0Var4.get(), (dt20) ((hs30) xvf0Var2).get(), (rj11) xvf0Var3.get(), (rk2) ((ze) xvf0Var).get());
            case 4:
                return scc.g((yx90) ((dag) xvf0Var5).get(), (u8u0) ((y2s0) xvf0Var).get(), (e0j0) ((dag) xvf0Var4).get(), (g1t) ((lq40) xvf0Var3).get(), (g1t) ((h1t) xvf0Var2).get());
            case 5:
                return new cwt0((AppAnalyticsReporter) xvf0Var5.get(), (tfl0) xvf0Var4.get(), (zvt0) xvf0Var3.get(), (j3h) xvf0Var2.get(), (ewt0) ((fat0) xvf0Var).get());
            case 6:
                return new com.yandex.go.taxi.order.search.overlay.mvp.b((l390) xvf0Var5.get(), (ah00) ((i9g) xvf0Var3).get(), (tt2) ((i9g) xvf0Var2).get(), (ga30) ((j9g) xvf0Var).get(), (jzf0) xvf0Var4.get());
            case 7:
                return new c0((tse) ((y0g) xvf0Var2).get(), (pg9) xvf0Var5.get(), (b) xvf0Var4.get(), (atd0) xvf0Var3.get(), (tt2) xvf0Var.get());
            case 8:
                return new jqv0((z62) xvf0Var5.get(), (fpo) xvf0Var4.get(), (v0s) xvf0Var3.get(), (vdv0) xvf0Var2.get(), (wjm) ((c0j) xvf0Var).get());
            case 9:
                return new com.yandex.go.superapp_carts.domain.loading.a((p9w0) ((n3w) xvf0Var3).a, (com.yandex.go.superapp_carts.domain.loading.b) xvf0Var5.get(), i5m.a((nag) xvf0Var2), i5m.a((y2s0) xvf0Var), (com.yandex.div.core.expression.variables.a) xvf0Var4.get());
            case 10:
                jff jffVar = (jff) ((nag) xvf0Var2).get();
                o3l0 o3l0Var = (o3l0) xvf0Var5.get();
                mao maoVar = (mao) xvf0Var4.get();
                i9w0 i9w0Var = (i9w0) xvf0Var3.get();
                zm5 zm5Var = new zm5((com.yandex.div.core.expression.variables.a) xvf0Var.get(), 6);
                n2v0 n2v0Var = new n2v0(i3, o3l0Var);
                i9w0Var.getClass();
                List list = null;
                k6x k6xVar = null;
                fxl fxlVar = null;
                p0m p0mVar = null;
                List list2 = null;
                xei0 xei0Var = null;
                return new vlr("SuperappCart", zm5Var, new ghr(i2, maoVar), new g0p(null, null, Collections.singletonList(new mu("PreviewBackwardAction", qoi0.a(PreviewBackwardAction.class), new cyv0(7), kotlin.a.b(LazyThreadSafetyMode.NONE, new ogu0(29, i9w0Var)), EmptyList.a, false)), null, null, null, null, null, 1015), n2v0Var, null, null, jffVar, null, list, k6xVar, null, fxlVar, p0mVar, list2, xei0Var, null, null, null, 1048258);
            case 11:
                return new com.yandex.go.superapp_favorites.flex.a((maw0) xvf0Var5.get(), (ajr) ((nag) xvf0Var2).get(), (wnt) ((nag) xvf0Var).get(), (com.yandex.div.core.expression.variables.a) xvf0Var4.get(), (aaw0) xvf0Var3.get());
            case 12:
                vlr vlrVar = (vlr) ((eqh) xvf0Var2).get();
                wgr wgrVar = (wgr) xvf0Var5.get();
                com.yandex.go.superapp_favorites.flex.a aVar = (com.yandex.go.superapp_favorites.flex.a) xvf0Var4.get();
                rmr rmrVar = (rmr) xvf0Var3.get();
                return new nhr(vlrVar, null, kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{wgrVar.b(), aVar.a()}, 2)), null, null, Integer.valueOf(mqg0.transparent), null, (ljr) xvf0Var.get(), null, rmrVar, 5850);
            case 13:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.tabs.b((u3s) ((n3w) xvf0Var5).a, (p6s) ((p1g) xvf0Var4).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.tabs.a) ((uzu0) xvf0Var3).get(), (hwy0) ((gxf) xvf0Var2).get(), (sae) ((srb) xvf0Var).get());
            case 14:
                return new ru.yandex.taxi.preorder.summary.selector.appearance.a((Context) xvf0Var5.get(), (mqv0) xvf0Var4.get(), (rqo) xvf0Var3.get(), (jv21) xvf0Var2, (i5s0) xvf0Var);
            case 15:
                return new com.yandex.messaging.ui.main.telemessenger.c((u5t) ((z9n) xvf0Var2).get(), (scy0) ((n3w) xvf0Var).a, (v) xvf0Var5.get(), (com.yandex.messaging.domain.statuses.c) xvf0Var4.get(), (xcy0) xvf0Var3.get());
            case 16:
                return new upy0((rpy0) ((cbg) xvf0Var4).b.a, (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.a) ((cbg) xvf0Var3).b.b, (npy0) ((bbg) xvf0Var2).get(), (aqy0) xvf0Var5.get(), (kcz0) ((flx0) xvf0Var).get());
            case 17:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text.c((u3s) ((n3w) xvf0Var5).a, (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text.b) ((a9i) xvf0Var4).get(), (hwy0) ((gxf) xvf0Var3).get(), (p6s) ((p1g) xvf0Var2).get(), (sae) ((srb) xvf0Var).get());
            case 18:
                return new k1a((i130) xvf0Var5.get(), (Context) ((t0g) xvf0Var2).get(), (exu0) xvf0Var4.get(), (pwy0) xvf0Var3.get(), (ru.yandex.taxi.styling.c) ((v0g) xvf0Var).get(), 7);
            case 19:
                return new h9z0((Activity) xvf0Var5.get(), (mp11) xvf0Var4.get(), i5m.a(xvf0Var3), (qbz0) xvf0Var2.get(), (kb) ((n2y0) xvf0Var).get());
            case 20:
                return new com.yandex.go.agreement.trackable.mapper.a((tt2) ((fbg) xvf0Var5).get(), (ru.yandex.taxi.widget.utils.e) ((fbg) xvf0Var4).get(), (ru.yandex.taxi.widget.c) ((fbg) xvf0Var3).get(), (irs0) ((fbg) xvf0Var2).get(), (j101) ((fbg) xvf0Var).get());
            case 21:
                return new f((f801) xvf0Var5.get(), (d) xvf0Var4.get(), (c801) xvf0Var3.get(), (h) xvf0Var2.get(), (aci) ((jbg) xvf0Var).get());
            case 22:
                ((nbg) xvf0Var4).get();
                TransactionsApi transactionsApi = (TransactionsApi) xvf0Var5.get();
                ((nbg) xvf0Var3).get();
                ((nbg) xvf0Var2).get();
                ((y501) xvf0Var).get();
                return new com.ybsdk.feature.transactions.impl.data.c(transactionsApi);
            case 23:
                return new TravelCompanionStatusView((Context) xvf0Var5.get(), (pav) xvf0Var4.get(), (ru.yandex.taxi.combo.domain.a) xvf0Var3.get(), (ru.yandex.taxi.combo.interactor.a) ((ibz0) xvf0Var2).get(), (pwy0) xvf0Var.get());
            case 24:
                return new ue11((o5s) ((dxf) xvf0Var5).get(), (boj0) ((wvq) xvf0Var4).get(), (ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain.a) ((k4) xvf0Var3).get(), (AppVisibilitySubscriptionImpl) ((exf) xvf0Var2).get(), (a201) ((flx0) xvf0Var).get());
            case 25:
                return new ow11((zuj0) xvf0Var5.get(), (cj70) ((uc50) xvf0Var3).get(), (bpx0) ((c1g) xvf0Var2).get(), (ore) xvf0Var4.get(), (j7h) ((p6f) xvf0Var).get());
            case 26:
                return new com.yandex.go.universal_qr_scanner.domain.b((tt2) ((sag) xvf0Var4).get(), (f121) xvf0Var5.get(), (a201) ((mg11) xvf0Var3).get(), (com.yandex.go.universal_qr_scanner.domain.screen.title.a) ((tw11) xvf0Var2).get(), (com.yandex.go.universal_qr_scanner.domain.camera.permission.d) ((mg11) xvf0Var).get());
            case 27:
                return new z421((tse) ((y0g) xvf0Var3).get(), (w3r0) xvf0Var5.get(), (ol3) ((nb11) xvf0Var2).get(), (vqv0) xvf0Var4.get(), (ore) ((y0g) xvf0Var).get());
            case 28:
                return new ru.yandex.taxi.masstransit.sourceaddress.c((i) ((u3g) xvf0Var4).get(), (o) ((w3g) xvf0Var3).get(), (com.yandex.go.zone.interactors.b) ((u3g) xvf0Var2).get(), (tt2) ((u3g) xvf0Var).get(), (tu30) xvf0Var5.get());
            default:
                return new m((com.yandex.delivery.libs.imageupload.impl.domain.b) xvf0Var5.get(), (st2) xvf0Var4.get(), (r3s) xvf0Var3.get(), (p6s) xvf0Var2.get(), (com.yandex.delivery.utils.dialogmanager.a) ((can) xvf0Var).get());
        }
    }

    public /* synthetic */ rct0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public /* synthetic */ rct0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i, boolean z) {
        this.a = i;
        this.e = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
        this.f = xvf0Var5;
    }

    public rct0(f4g f4gVar, xvf0 xvf0Var, hs30 hs30Var, xvf0 xvf0Var2, ze zeVar) {
        this.a = 3;
        this.b = f4gVar;
        this.c = xvf0Var;
        this.e = hs30Var;
        this.d = xvf0Var2;
        this.f = zeVar;
    }

    public /* synthetic */ rct0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = v7pVar;
    }

    public rct0(y0g y0gVar, w0g w0gVar, nb11 nb11Var, xvf0 xvf0Var, y0g y0gVar2) {
        this.a = 27;
        this.d = y0gVar;
        this.b = w0gVar;
        this.e = nb11Var;
        this.c = xvf0Var;
        this.f = y0gVar2;
    }

    public rct0(cbg cbgVar, cbg cbgVar2, bbg bbgVar, xvf0 xvf0Var, flx0 flx0Var) {
        this.a = 16;
        this.c = cbgVar;
        this.d = cbgVar2;
        this.e = bbgVar;
        this.b = xvf0Var;
        this.f = flx0Var;
    }

    public rct0(v0g v0gVar, t0g t0gVar, b1g b1gVar, x0g x0gVar, v0g v0gVar2) {
        this.a = 18;
        this.b = v0gVar;
        this.e = t0gVar;
        this.c = b1gVar;
        this.d = x0gVar;
        this.f = v0gVar2;
    }

    public rct0(h3g h3gVar, l3g l3gVar, z0s0 z0s0Var, l3g l3gVar2, l3g l3gVar3) {
        this.a = 0;
        this.b = h3gVar;
        this.c = l3gVar;
        this.e = z0s0Var;
        this.f = l3gVar2;
        this.d = l3gVar3;
    }

    public rct0(z9n z9nVar, n3w n3wVar, zbg zbgVar, zbg zbgVar2, acg acgVar) {
        this.a = 15;
        this.e = z9nVar;
        this.f = n3wVar;
        this.b = zbgVar;
        this.c = zbgVar2;
        this.d = acgVar;
    }

    public rct0(xvf0 xvf0Var, i9g i9gVar, i9g i9gVar2, j9g j9gVar, xvf0 xvf0Var2) {
        this.a = 6;
        this.b = xvf0Var;
        this.d = i9gVar;
        this.e = i9gVar2;
        this.f = j9gVar;
        this.c = xvf0Var2;
    }

    public rct0(u3g u3gVar, w3g w3gVar, u3g u3gVar2, u3g u3gVar3, v3g v3gVar) {
        this.a = 28;
        this.c = u3gVar;
        this.d = w3gVar;
        this.e = u3gVar2;
        this.f = u3gVar3;
        this.b = v3gVar;
    }

    public rct0(n3w n3wVar, xvf0 xvf0Var, nag nagVar, y2s0 y2s0Var, xvf0 xvf0Var2) {
        this.a = 9;
        this.d = n3wVar;
        this.b = xvf0Var;
        this.e = nagVar;
        this.f = y2s0Var;
        this.c = xvf0Var2;
    }

    public rct0(xvf0 xvf0Var, nag nagVar, nag nagVar2, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = 11;
        this.b = xvf0Var;
        this.e = nagVar;
        this.f = nagVar2;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }
}
