package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.chargers.offer.data.mappers.b;
import com.yandex.go.chargers.surge.domain.a;
import com.yandex.go.navigator.repository.f;
import com.yandex.go.payments.data.p;
import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.h;
import com.yandex.go.yb.domain.n;
import com.yandex.go.yb.domain.o;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.v;
import com.yandex.messaging.ui.calllist.d;
import com.yandex.passport.internal.ui.bouncer.model.middleware.a0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.e1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.f0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.g1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.k0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.m0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.r;
import com.yandex.passport.internal.ui.bouncer.model.middleware.r0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.r1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.t;
import com.yandex.passport.internal.ui.bouncer.model.middleware.t0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.y;
import com.yandex.passport.sloth.ui.dependencies.m;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.LocalFeedbackRepository;
import ru.yandex.taxi.masstransit.geopayment.checkout.k;
import ru.yandex.taxi.routeselector.presentation.l;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.view.WebViewContainerImpl;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes5.dex */
public final class wi7 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;
    public final yvf0 h;
    public final yvf0 i;
    public final yvf0 j;
    public final yvf0 k;
    public final yvf0 l;
    public final yvf0 m;

    public wi7(xvf0 xvf0Var, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, yvf0 yvf0Var9, yvf0 yvf0Var10, yvf0 yvf0Var11) {
        this.a = 26;
        this.c = yvf0Var;
        this.d = yvf0Var2;
        this.e = yvf0Var3;
        this.f = yvf0Var4;
        this.g = yvf0Var5;
        this.h = yvf0Var6;
        this.i = yvf0Var7;
        this.j = yvf0Var8;
        this.k = yvf0Var9;
        this.l = yvf0Var10;
        this.m = yvf0Var11;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        yvf0 yvf0Var = this.m;
        yvf0 yvf0Var2 = this.l;
        yvf0 yvf0Var3 = this.k;
        yvf0 yvf0Var4 = this.j;
        yvf0 yvf0Var5 = this.i;
        yvf0 yvf0Var6 = this.h;
        yvf0 yvf0Var7 = this.g;
        yvf0 yvf0Var8 = this.f;
        yvf0 yvf0Var9 = this.e;
        yvf0 yvf0Var10 = this.d;
        yvf0 yvf0Var11 = this.c;
        switch (i) {
            case 0:
                return new d((qj80) xvf0Var.get(), (a8u) ((xvf0) yvf0Var11).get(), (j4t) ((xvf0) yvf0Var10).get(), (tft) ((z9n) yvf0Var).get(), (f4t) ((xvf0) yvf0Var9).get(), (v) ((xvf0) yvf0Var8).get(), (x22) ((xvf0) yvf0Var7).get(), (lqo) ((xvf0) yvf0Var6).get(), i5m.a((xvf0) yvf0Var5), (tf7) ((xvf0) yvf0Var4).get(), (pm50) ((xvf0) yvf0Var3).get(), (key0) ((xvf0) yvf0Var2).get());
            case 1:
                return new b((Context) ((uxf) yvf0Var9).get(), (pdc) xvf0Var.get(), (tt2) ((xvf0) yvf0Var11).get(), (k7x0) ((vxf) yvf0Var8).get(), (xdf) ((uxf) yvf0Var7).get(), (e) ((xvf0) yvf0Var10).get(), (com.yandex.go.chargers.domain.mapper.b) ((mu7) yvf0Var6).get(), (a) ((mu7) yvf0Var5).get(), (iya) ((uxf) yvf0Var4).get(), (c) ((uxf) yvf0Var3).get(), (com.yandex.go.chargers.domain.mapper.a) ((mu7) yvf0Var2).get(), (com.yandex.go.chargers.error.data.a) ((uxf) yvf0Var).get());
            case 2:
                return new yga((Context) xvf0Var.get(), (w030) ((xvf0) yvf0Var11).get(), (xvf0) yvf0Var10, (xvf0) yvf0Var9, (rea0) ((xvf0) yvf0Var8).get(), (xvf0) yvf0Var7, (eha) ((ht0) yvf0Var3).get(), (c29) ((lu9) yvf0Var2).get(), (g6) yvf0Var, (xvf0) yvf0Var6, (kka) ((xvf0) yvf0Var5).get(), (tla) ((xvf0) yvf0Var4).get());
            case 3:
                b00 b00Var = (b00) xvf0Var.get();
                Activity activity = (Activity) ((xvf0) yvf0Var11).get();
                ChatRequest chatRequest = (ChatRequest) ((xvf0) yvf0Var10).get();
                h3y a = i5m.a((xvf0) yvf0Var9);
                com.yandex.messaging.internal.e eVar = (com.yandex.messaging.internal.e) ((xvf0) yvf0Var8).get();
                tmt0 tmt0Var = (tmt0) ((xvf0) yvf0Var7).get();
                z7b z7bVar = (z7b) ((lu9) yvf0Var).get();
                noy0 noy0Var = (noy0) ((xvf0) yvf0Var6).get();
                dbb dbbVar = (dbb) ((xvf0) yvf0Var5).get();
                xzq xzqVar = (xzq) ((xvf0) yvf0Var4).get();
                return new com.yandex.messaging.internal.view.chat.c(b00Var, activity, chatRequest, a, eVar, tmt0Var, z7bVar, noy0Var, dbbVar, xzqVar, (zg10) ((xvf0) yvf0Var2).get());
            case 4:
                Context context = (Context) ((n3w) xvf0Var).a;
                qcp0 qcp0Var = (qcp0) ((ibg) yvf0Var11).get();
                hwy0 hwy0Var = (hwy0) ((ibg) yvf0Var10).get();
                ((gbg) yvf0Var9).get();
                com.yandex.delivery.utils.dialogmanager.impl.b bVar = (com.yandex.delivery.utils.dialogmanager.impl.b) ((gbg) yvf0Var8).get();
                dci dciVar = (dci) ((gbg) yvf0Var7).get();
                yuj0 yuj0Var = (yuj0) ((gbg) yvf0Var6).get();
                t0k0 t0k0Var = (t0k0) ((gbg) yvf0Var5).get();
                ((gbg) yvf0Var4).get();
                return new m(context, qcp0Var, hwy0Var, bVar, dciVar, yuj0Var, t0k0Var, (l7x0) ((ibg) yvf0Var3).get(), (q8s) ((gbg) yvf0Var2).get(), (htg) ((gbg) yvf0Var).get());
            case 5:
                return new ru.yandex.taxi.logistics.photocomment.b((Context) xvf0Var.get(), (zii) ((xvf0) yvf0Var11).get(), (xvf0) yvf0Var10, (vu) yvf0Var7, (v7j0) ((gyf) yvf0Var6).get(), (g) ((fyf) yvf0Var5).get(), (ru.yandex.taxi.logistics.photocomment.a) ((ncb) yvf0Var4).get(), (y50) ((fyf) yvf0Var3).get(), (vr) ((rwh) yvf0Var2).get(), (com.yandex.delivery.utils.dialogmanager.impl.b) ((xvf0) yvf0Var9).get(), (elb0) ((gyf) yvf0Var).get(), (oep0) ((xvf0) yvf0Var8).get());
            case 6:
                return new zri((ow) xvf0Var.get(), (xwa0) ((xvf0) yvf0Var11).get(), (j5v) ((xvf0) yvf0Var10).get(), (s701) ((xvf0) yvf0Var9).get(), (hxb0) ((xvf0) yvf0Var8).get(), (pki) ((xvf0) yvf0Var7).get(), (ga90) ((xvf0) yvf0Var6).get(), (r6i) ((xvf0) yvf0Var5).get(), (vzc) ((xvf0) yvf0Var4).get(), (ac80) ((xvf0) yvf0Var3).get(), (r360) ((t160) yvf0Var2).get(), (c1x0) ((qcz0) yvf0Var).get());
            case 7:
                return new atj((w030) ((x4g) yvf0Var4).get(), (Context) ((x4g) yvf0Var3).get(), (psj) xvf0Var.get(), (ysj) ((xvf0) yvf0Var11).get(), (com.yandex.go.places.impl.ui.main.map.overlay.c) ((xvf0) yvf0Var10).get(), (com.yandex.go.places.impl.ui.main.map.my_places.b) ((xvf0) yvf0Var9).get(), (yac0) ((xvf0) yvf0Var8).get(), (xvf0) yvf0Var7, (ge50) yvf0Var2, (cyx) ((x4g) yvf0Var).get(), (mg80) ((xvf0) yvf0Var6).get(), (wbc0) ((xvf0) yvf0Var5).get());
            case 8:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback.e((ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((mzf) yvf0Var8).get(), (itq) ((t9n) yvf0Var7).get(), (imc) xvf0Var.get(), (j00) ((c1) yvf0Var6).get(), (osq) ((xvf0) yvf0Var11).get(), (LocalFeedbackRepository) ((mzf) yvf0Var5).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.data.c) ((xvf0) yvf0Var10).get(), (kcz0) ((flx0) yvf0Var4).get(), (e100) ((e3u) yvf0Var3).get(), (ru.yandex.taxi.logistics.payment.a) ((hbg) yvf0Var2).get(), (st2) ((gbg) yvf0Var).get(), (j770) ((xvf0) yvf0Var9).get());
            case 9:
                return new ru.yandex.logistics.sdk.cargo_form.core.impl.repository.c((b6s) xvf0Var.get(), (ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.c) ((cuo) yvf0Var11).get(), (j0g) ((wif) yvf0Var10).get(), (r6s) ((c4p) yvf0Var9).get(), (String) ((n1g) yvf0Var8).get(), (f4l0) ((n1g) yvf0Var7).get(), (com.yandex.go.logistics.cargo_flow.form.cost_centers.a) ((n1g) yvf0Var6).get(), (p1f) ((n1g) yvf0Var5).b.h, (zqb0) ((m1g) yvf0Var4).get(), (v6s) ((m1g) yvf0Var3).get(), (ru.yandex.taxi.logistics.payment.a) ((n1g) yvf0Var2).get(), (c7s) ((m1g) yvf0Var).get());
            case 10:
                return new com.yandex.go.navigator.gas_stations.b((ah00) ((v1g) yvf0Var7).get(), (com.yandex.go.navigator.search.a) ((w1g) yvf0Var6).get(), (tt2) ((v1g) yvf0Var5).get(), (com.yandex.go.navigator.gas_stations.experiment.c) ((v1g) yvf0Var4).get(), (com.yandex.go.navigator.gas_stations.repositories.c) xvf0Var.get(), (vff) ((xvf0) yvf0Var11).get(), (tus) ((xvf0) yvf0Var10).get(), (sws) ((xvf0) yvf0Var9).get(), (qb60) ((xvf0) yvf0Var8).get(), (f) ((w1g) yvf0Var3).get(), (tyw) ((rut) yvf0Var2).get(), (el00) ((v1g) yvf0Var).get());
            case 11:
                return new k((wu30) xvf0Var.get(), (ge30) ((f3g) yvf0Var9).get(), (ru.yandex.taxi.masstransit.geopayment.checkout.b) ((xea) yvf0Var8).get(), (p) ((g3g) yvf0Var7).get(), (a2a0) ((f3g) yvf0Var6).get(), (ru.yandex.taxi.masstransit.geopayment.checkout.e) ((srb) yvf0Var5).get(), (s311) ((qcz0) yvf0Var4).get(), (cu1) ((nb11) yvf0Var3).get(), (d411) ((xvf0) yvf0Var11).get(), (sy00) ((xvf0) yvf0Var10).get(), (qd30) ((f3g) yvf0Var2).get(), (ke30) ((ret) yvf0Var).get());
            case 12:
                return new rj50((Context) ((x4g) yvf0Var2).get(), (oj50) xvf0Var.get(), (uj50) ((xvf0) yvf0Var11).get(), (a3c0) ((xvf0) yvf0Var10).get(), (w030) ((x4g) yvf0Var).get(), (mg80) ((xvf0) yvf0Var9).get(), (wbc0) ((xvf0) yvf0Var8).get(), (n3h) ((xvf0) yvf0Var7).get(), (tse) ((xvf0) yvf0Var6).get(), (PlacesNavigationMode) ((xvf0) yvf0Var5).get(), (com.yandex.go.places.impl.navigation.common.navigator.internal.b) ((xvf0) yvf0Var4).get(), (g3h) ((xvf0) yvf0Var3).get());
            case 13:
                return new com.yandex.go.taxi.order.map.overlay.recenter.a((tse) xvf0Var.get(), (o2y0) ((xvf0) yvf0Var11).get(), (igi0) ((xvf0) yvf0Var10).get(), (wt1) ((xvf0) yvf0Var9).get(), (mvd0) ((xvf0) yvf0Var8).get(), (nz2) ((xvf0) yvf0Var7).get(), (agi0) ((n3w) yvf0Var4).a, (ry70) ((u4g) yvf0Var3).get(), (l1t) ((u4g) yvf0Var2).get(), (n6w0) ((v4g) yvf0Var).get(), (y980) ((xvf0) yvf0Var6).get(), (el00) ((xvf0) yvf0Var5).get());
            case 14:
                return new po80((mo80) xvf0Var.get(), (yo80) ((xvf0) yvf0Var11).get(), (xvf0) yvf0Var10, (xvf0) yvf0Var9, (cn80) ((xvf0) yvf0Var8).get(), (eo80) ((xvf0) yvf0Var7).get(), (go80) ((xvf0) yvf0Var6).get(), (yac0) ((xvf0) yvf0Var5).get(), (tt2) ((xvf0) yvf0Var4).get(), (w030) ((x4g) yvf0Var).get(), (mg80) ((xvf0) yvf0Var3).get(), (wbc0) ((xvf0) yvf0Var2).get());
            case 15:
                return new b9c0((kfc0) xvf0Var.get(), (flex.engine.a) ((xvf0) yvf0Var11).get(), (com.yandex.go.places.flex.container.domain.interactors.a) ((ge50) yvf0Var8).get(), (g8c0) ((n3w) yvf0Var7).a, (f8c0) ((n3w) yvf0Var6).a, (wgr) ((xvf0) yvf0Var10).get(), (r7c0) ((n3w) yvf0Var5).a, (y7c0) ((n3w) yvf0Var4).a, (i9c0) ((n3w) yvf0Var3).a, (k6x) ((xvf0) yvf0Var9).get(), (String) ((n3w) yvf0Var2).a, (q6c0) ((kxb0) yvf0Var).get());
            case 16:
                return new l((x9l0) xvf0Var.get(), (AddressResolveRepository) ((xvf0) yvf0Var11).get(), (f1c0) ((a7g) yvf0Var10).get(), (uze0) ((a7g) yvf0Var9).get(), (wiq0) ((a7g) yvf0Var8).get(), (e800) ((a7g) yvf0Var7).get(), (ru.yandex.taxi.delivery.pin.k) ((g6g) yvf0Var6).get(), (vtb0) ((a7g) yvf0Var5).get(), (rwt) ((g6g) yvf0Var4).get(), (nj6) ((g6g) yvf0Var3).get(), (e) ((a7g) yvf0Var2).get(), (r0c0) ((a7g) yvf0Var).get());
            case 17:
                return new h((e2e0) xvf0Var.get(), (n6n0) ((xvf0) yvf0Var11).get(), (y5p0) ((xvf0) yvf0Var10).get(), (b3n0) ((xvf0) yvf0Var9).get(), (znn0) ((xvf0) yvf0Var8).get(), (com.yandex.go.scooters.domain.d) ((xvf0) yvf0Var7).get(), (s6n0) ((xvf0) yvf0Var6).get(), (bvn0) ((xvf0) yvf0Var5).get(), (z2o0) ((xvf0) yvf0Var4).get(), (com.yandex.go.scooters.offers.v2.components.bottom.data.a) ((bwn0) yvf0Var).get(), (com.yandex.go.scooters.passes.domain.g) ((xvf0) yvf0Var3).get(), (q4o0) ((xvf0) yvf0Var2).get());
            case 18:
                return new com.yandex.go.taxi.order.state.search.ui.e((fxx0) ((n3w) yvf0Var3).a, (ney) xvf0Var.get(), (bu1) ((upk0) yvf0Var2).get(), i5m.a((o4f) yvf0Var), (t580) ((xvf0) yvf0Var11).get(), (com.yandex.go.taxi.order.repositories.c) ((xvf0) yvf0Var10).get(), (com.yandex.go.taxi.order.experiments.h) ((xvf0) yvf0Var9).get(), i5m.a((xvf0) yvf0Var8), (tt2) ((xvf0) yvf0Var7).get(), i5m.a((xvf0) yvf0Var6), (bup0) ((xvf0) yvf0Var5).get(), (zfm) ((xvf0) yvf0Var4).get());
            case 19:
                rqo rqoVar = (rqo) xvf0Var.get();
                tse tseVar = (tse) ((xvf0) yvf0Var11).get();
                tt2 tt2Var = (tt2) ((xvf0) yvf0Var10).get();
                return new n(rqoVar, tseVar, tt2Var, (o) ((xvf0) yvf0Var8).get(), (hr51) ((xvf0) yvf0Var7).get(), (n20) ((xvf0) yvf0Var6).get(), (ycq0) ((xvf0) yvf0Var5).get(), (cda0) ((xvf0) yvf0Var4).get(), (hh9) ((xvf0) yvf0Var3).get(), (com.yandex.go.yb.data.h) ((xvf0) yvf0Var2).get(), (rgf) ((pcg) yvf0Var).get());
            case 20:
                return new jet0((uli0) ((hs30) yvf0Var3).get(), (y8s0) xvf0Var.get(), (com.yandex.go.communications.actionrouter.a) ((xvf0) yvf0Var11).get(), (p9s0) ((xvf0) yvf0Var10).get(), (ru.yandex.taxi.layers.actionrouter.b) ((xvf0) yvf0Var9).get(), (nh9) ((xvf0) yvf0Var8).get(), (qy41) ((xvf0) yvf0Var7).get(), (ru.yandex.taxi.address.base.a) ((njp) yvf0Var2).get(), (AddressResolveRepository) ((xvf0) yvf0Var6).get(), (ysd0) ((xvf0) yvf0Var5).get(), (sn0) ((s90) yvf0Var).get(), (f7r) ((xvf0) yvf0Var4).get());
            case 21:
                return new ru.yandex.taxi.preorder.source.mode.interactor.e((jgt0) xvf0Var.get(), (com.yandex.go.route.interactor.b) ((xvf0) yvf0Var11).get(), (ru.yandex.taxi.address.clarification.impl.repo.a) ((xvf0) yvf0Var10).get(), (ze61) ((xvf0) yvf0Var9).get(), (lgv0) ((xvf0) yvf0Var8).get(), (hp0) ((xvf0) yvf0Var7).get(), (fgv0) ((xvf0) yvf0Var6).get(), (mzb) ((xvf0) yvf0Var5).get(), (vfv0) ((xvf0) yvf0Var4).get(), (ru.yandex.taxi.address.clarification.impl.repo.a) ((xvf0) yvf0Var3).get(), (cvr) ((xvf0) yvf0Var2).get(), i5m.a((slg0) yvf0Var));
            case 22:
                return new com.yandex.go.summary.interactor.core.v((pev0) xvf0Var.get(), (tt2) ((xvf0) yvf0Var11).get(), (vqv0) ((xvf0) yvf0Var10).get(), (wiq0) ((w0g) yvf0Var2).get(), (f580) ((xvf0) yvf0Var9).get(), (c4r0) ((xvf0) yvf0Var8).get(), (vwm) ((miv0) yvf0Var).get(), (iwe0) ((xvf0) yvf0Var7).get(), (g580) ((xvf0) yvf0Var6).get(), (ogj0) ((xvf0) yvf0Var5).get(), (lot0) ((xvf0) yvf0Var4).get(), (yfx0) ((xvf0) yvf0Var3).get());
            case 23:
                return new ru.yandex.taxi.summary.deeplink.b((c4r0) ((a1g) yvf0Var10).get(), (wiq0) ((w0g) yvf0Var9).get(), (ck31) xvf0Var.get(), (arv0) ((x0g) yvf0Var8).get(), (com.yandex.go.taxi.tariffs.interactor.h) ((s0g) yvf0Var7).get(), (y50) ((t0g) yvf0Var6).get(), (krq0) ((a1g) yvf0Var5).get(), (rft0) ((a1g) yvf0Var4).get(), (tse) ((y0g) yvf0Var3).get(), (vqv0) ((xvf0) yvf0Var11).get(), (biv0) ((b1g) yvf0Var2).get(), (com.yandex.go.taxi.tariffs.repository.g) ((w0g) yvf0Var).get());
            case 24:
                return new WebViewContainerImpl((UiWebViewConfig) ((n3w) yvf0Var4).a, (hn41) xvf0Var.get(), (Activity) ((xvf0) yvf0Var11).get(), (tse) ((xvf0) yvf0Var10).get(), i5m.a((xvf0) yvf0Var9), i5m.a((xvf0) yvf0Var8), (bv41) ((xvf0) yvf0Var7).get(), (ru.yandex.taxi.deeplinks.f) ((xvf0) yvf0Var6).get(), (to41) ((xvf0) yvf0Var5).get(), (ms41) ((n3w) yvf0Var3).a, (c2x0) ((tcg) yvf0Var2).get(), (exu0) ((tcg) yvf0Var).get());
            case 25:
                return new com.yandex.messaging.chat.attachments.c((o1b0) xvf0Var.get(), (a1r) ((xvf0) yvf0Var11).get(), (to3) ((xvf0) yvf0Var10).get(), (kzq) ((xvf0) yvf0Var9).get(), (com.yandex.messaging.chat.attachments.a) ((xvf0) yvf0Var8).get(), (t2r) ((xvf0) yvf0Var7).get(), (ic3) ((xvf0) yvf0Var6).get(), (rr41) ((up41) yvf0Var).get(), (lqo) ((xvf0) yvf0Var5).get(), (doc) ((xvf0) yvf0Var4).get(), (kse) ((xvf0) yvf0Var3).get(), (pm50) ((xvf0) yvf0Var2).get());
            default:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.a((t) yvf0Var11.get(), (a0) yvf0Var10.get(), (r1) yvf0Var9.get(), (y) yvf0Var8.get(), (f0) yvf0Var7.get(), (r0) yvf0Var6.get(), (m0) yvf0Var5.get(), (k0) yvf0Var4.get(), (t0) yvf0Var3.get(), (r) yvf0Var2.get(), (g1) yvf0Var.get(), (e1) xvf0Var.get());
        }
    }

    public /* synthetic */ wi7(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.k = xvf0Var10;
        this.l = xvf0Var11;
        this.m = xvf0Var12;
    }

    public /* synthetic */ wi7(v7p v7pVar, n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar2, xvf0 xvf0Var4, v7p v7pVar3, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, int i) {
        this.a = i;
        this.b = v7pVar;
        this.c = n3wVar;
        this.d = xvf0Var;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
        this.g = v7pVar2;
        this.h = xvf0Var4;
        this.i = v7pVar3;
        this.j = xvf0Var5;
        this.m = xvf0Var6;
        this.k = xvf0Var7;
        this.l = xvf0Var8;
    }

    public wi7(n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, k0n k0nVar, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, up41 up41Var, h420 h420Var, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8) {
        this.a = 25;
        this.b = n3wVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = k0nVar;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
        this.h = xvf0Var5;
        this.m = up41Var;
        this.i = h420Var;
        this.j = xvf0Var6;
        this.k = xvf0Var7;
        this.l = xvf0Var8;
    }

    public wi7(n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, n3w n3wVar2, tcg tcgVar, tcg tcgVar2) {
        this.a = 24;
        this.j = n3wVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.k = n3wVar2;
        this.l = tcgVar;
        this.m = tcgVar2;
    }

    public wi7(f3g f3gVar, f3g f3gVar2, xea xeaVar, g3g g3gVar, f3g f3gVar3, srb srbVar, qcz0 qcz0Var, nb11 nb11Var, y501 y501Var, g3g g3gVar2, f3g f3gVar4, ret retVar) {
        this.a = 11;
        this.b = f3gVar;
        this.e = f3gVar2;
        this.f = xeaVar;
        this.g = g3gVar;
        this.h = f3gVar3;
        this.i = srbVar;
        this.j = qcz0Var;
        this.k = nb11Var;
        this.c = y501Var;
        this.d = g3gVar2;
        this.l = f3gVar4;
        this.m = retVar;
    }

    public wi7(xvf0 xvf0Var, xvf0 xvf0Var2, ge50 ge50Var, n3w n3wVar, n3w n3wVar2, xvf0 xvf0Var3, n3w n3wVar3, n3w n3wVar4, n3w n3wVar5, xvf0 xvf0Var4, n3w n3wVar6, kxb0 kxb0Var) {
        this.a = 15;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.f = ge50Var;
        this.g = n3wVar;
        this.h = n3wVar2;
        this.d = xvf0Var3;
        this.i = n3wVar3;
        this.j = n3wVar4;
        this.k = n3wVar5;
        this.e = xvf0Var4;
        this.l = n3wVar6;
        this.m = kxb0Var;
    }

    public wi7(fyf fyfVar, xvf0 xvf0Var, fwc fwcVar, vu vuVar, gyf gyfVar, fyf fyfVar2, ncb ncbVar, fyf fyfVar3, rwh rwhVar, xvf0 xvf0Var2, gyf gyfVar2, gyf gyfVar3) {
        this.a = 5;
        this.b = fyfVar;
        this.c = xvf0Var;
        this.d = fwcVar;
        this.g = vuVar;
        this.h = gyfVar;
        this.i = fyfVar2;
        this.j = ncbVar;
        this.k = fyfVar3;
        this.l = rwhVar;
        this.e = xvf0Var2;
        this.m = gyfVar2;
        this.f = gyfVar3;
    }

    public wi7(mzf mzfVar, t9n t9nVar, xvf0 xvf0Var, c1 c1Var, xvf0 xvf0Var2, mzf mzfVar2, xvf0 xvf0Var3, flx0 flx0Var, e3u e3uVar, hbg hbgVar, gbg gbgVar, xvf0 xvf0Var4) {
        this.a = 8;
        this.f = mzfVar;
        this.g = t9nVar;
        this.b = xvf0Var;
        this.h = c1Var;
        this.c = xvf0Var2;
        this.i = mzfVar2;
        this.d = xvf0Var3;
        this.j = flx0Var;
        this.k = e3uVar;
        this.l = hbgVar;
        this.m = gbgVar;
        this.e = xvf0Var4;
    }

    public wi7(xvf0 xvf0Var, n3w n3wVar, v8c0 v8c0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, umt0 umt0Var, lu9 lu9Var, njp njpVar, mu7 mu7Var, xvf0 xvf0Var4, h420 h420Var, h0z h0zVar) {
        this.a = 3;
        this.b = xvf0Var;
        this.c = n3wVar;
        this.d = v8c0Var;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
        this.g = umt0Var;
        this.m = lu9Var;
        this.h = njpVar;
        this.i = mu7Var;
        this.j = xvf0Var4;
        this.k = h420Var;
        this.l = h0zVar;
    }

    public wi7(uxf uxfVar, uxf uxfVar2, uxf uxfVar3, vxf vxfVar, uxf uxfVar4, xvf0 xvf0Var, mu7 mu7Var, mu7 mu7Var2, uxf uxfVar5, uxf uxfVar6, mu7 mu7Var3, uxf uxfVar7) {
        this.a = 1;
        this.e = uxfVar;
        this.b = uxfVar2;
        this.c = uxfVar3;
        this.f = vxfVar;
        this.g = uxfVar4;
        this.d = xvf0Var;
        this.h = mu7Var;
        this.i = mu7Var2;
        this.j = uxfVar5;
        this.k = uxfVar6;
        this.l = mu7Var3;
        this.m = uxfVar7;
    }

    public wi7(v1g v1gVar, w1g w1gVar, v1g v1gVar2, v1g v1gVar3, xvf0 xvf0Var, v1g v1gVar4, n3w n3wVar, xvf0 xvf0Var2, xvf0 xvf0Var3, w1g w1gVar2, rut rutVar, v1g v1gVar5) {
        this.a = 10;
        this.g = v1gVar;
        this.h = w1gVar;
        this.i = v1gVar2;
        this.j = v1gVar3;
        this.b = xvf0Var;
        this.c = v1gVar4;
        this.d = n3wVar;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
        this.k = w1gVar2;
        this.l = rutVar;
        this.m = v1gVar5;
    }

    public wi7(pxf pxfVar, qxf qxfVar, vu vuVar, rx4 rx4Var, qxf qxfVar2, kj7 kj7Var, ht0 ht0Var, lu9 lu9Var, g6 g6Var, kj7 kj7Var2, xvf0 xvf0Var, pxf pxfVar2) {
        this.a = 2;
        this.b = pxfVar;
        this.c = qxfVar;
        this.d = vuVar;
        this.e = rx4Var;
        this.f = qxfVar2;
        this.g = kj7Var;
        this.k = ht0Var;
        this.l = lu9Var;
        this.m = g6Var;
        this.h = kj7Var2;
        this.i = xvf0Var;
        this.j = pxfVar2;
    }

    public wi7(a1g a1gVar, w0g w0gVar, y0g y0gVar, x0g x0gVar, s0g s0gVar, t0g t0gVar, a1g a1gVar2, a1g a1gVar3, y0g y0gVar2, xvf0 xvf0Var, b1g b1gVar, w0g w0gVar2) {
        this.a = 23;
        this.d = a1gVar;
        this.e = w0gVar;
        this.b = y0gVar;
        this.f = x0gVar;
        this.g = s0gVar;
        this.h = t0gVar;
        this.i = a1gVar2;
        this.j = a1gVar3;
        this.k = y0gVar2;
        this.c = xvf0Var;
        this.l = b1gVar;
        this.m = w0gVar2;
    }

    public wi7(n3w n3wVar, xvf0 xvf0Var, upk0 upk0Var, o4f o4fVar, f870 f870Var, xvf0 xvf0Var2, swo0 swo0Var, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7) {
        this.a = 18;
        this.k = n3wVar;
        this.b = xvf0Var;
        this.l = upk0Var;
        this.m = o4fVar;
        this.c = f870Var;
        this.d = xvf0Var2;
        this.e = swo0Var;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
        this.h = xvf0Var5;
        this.i = xvf0Var6;
        this.j = xvf0Var7;
    }

    public wi7(hs30 hs30Var, p8k0 p8k0Var, gwb0 gwb0Var, z0s0 z0s0Var, gwb0 gwb0Var2, dx7 dx7Var, xvf0 xvf0Var, njp njpVar, n3w n3wVar, xvf0 xvf0Var2, s90 s90Var, n3w n3wVar2) {
        this.a = 20;
        this.k = hs30Var;
        this.b = p8k0Var;
        this.c = gwb0Var;
        this.d = z0s0Var;
        this.e = gwb0Var2;
        this.f = dx7Var;
        this.g = xvf0Var;
        this.l = njpVar;
        this.h = n3wVar;
        this.i = xvf0Var2;
        this.m = s90Var;
        this.j = n3wVar2;
    }

    public wi7(xvf0 xvf0Var, t0g t0gVar, xvf0 xvf0Var2, w0g w0gVar, axy axyVar, a1g a1gVar, miv0 miv0Var, z0g z0gVar, xvf0 xvf0Var3, z0g z0gVar2, z0s0 z0s0Var, uzu0 uzu0Var) {
        this.a = 22;
        this.b = xvf0Var;
        this.c = t0gVar;
        this.d = xvf0Var2;
        this.l = w0gVar;
        this.e = axyVar;
        this.f = a1gVar;
        this.m = miv0Var;
        this.g = z0gVar;
        this.h = xvf0Var3;
        this.i = z0gVar2;
        this.j = z0s0Var;
        this.k = uzu0Var;
    }

    public wi7(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, n3w n3wVar, u4g u4gVar, u4g u4gVar2, v4g v4gVar, xvf0 xvf0Var7, xvf0 xvf0Var8) {
        this.a = 13;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.j = n3wVar;
        this.k = u4gVar;
        this.l = u4gVar2;
        this.m = v4gVar;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
    }

    public wi7(x4g x4gVar, n3w n3wVar, n3w n3wVar2, xvf0 xvf0Var, x4g x4gVar2, xvf0 xvf0Var2, xvf0 xvf0Var3, x4g x4gVar3, n3w n3wVar3, n3w n3wVar4, n3w n3wVar5, n3w n3wVar6) {
        this.a = 12;
        this.l = x4gVar;
        this.b = n3wVar;
        this.c = n3wVar2;
        this.d = xvf0Var;
        this.m = x4gVar2;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
        this.g = x4gVar3;
        this.h = n3wVar3;
        this.i = n3wVar4;
        this.j = n3wVar5;
        this.k = n3wVar6;
    }

    public wi7(acg acgVar, zbg zbgVar, ybg ybgVar, z9n z9nVar, ybg ybgVar2, zbg zbgVar2, ybg ybgVar3, ybg ybgVar4, ybg ybgVar5, xvf0 xvf0Var, acg acgVar2, acg acgVar3) {
        this.a = 0;
        this.b = acgVar;
        this.c = zbgVar;
        this.d = ybgVar;
        this.m = z9nVar;
        this.e = ybgVar2;
        this.f = zbgVar2;
        this.g = ybgVar3;
        this.h = ybgVar4;
        this.i = ybgVar5;
        this.j = xvf0Var;
        this.k = acgVar2;
        this.l = acgVar3;
    }

    public wi7(x4g x4gVar, x4g x4gVar2, n3w n3wVar, n3w n3wVar2, xvf0 xvf0Var, xvf0 xvf0Var2, n3w n3wVar3, y4g y4gVar, ge50 ge50Var, x4g x4gVar3, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = 7;
        this.j = x4gVar;
        this.k = x4gVar2;
        this.b = n3wVar;
        this.c = n3wVar2;
        this.d = xvf0Var;
        this.e = xvf0Var2;
        this.f = n3wVar3;
        this.g = y4gVar;
        this.l = ge50Var;
        this.m = x4gVar3;
        this.h = xvf0Var3;
        this.i = xvf0Var4;
    }
}
