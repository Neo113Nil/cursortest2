package defpackage;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.payments.acceptance.data.a;
import com.yandex.go.payments.acceptance.domain.c;
import com.yandex.go.payments.acceptance.domain.d;
import com.yandex.go.payments.shared.z;
import com.yandex.go.superapp.orders.card.experiments.y;
import ru.yandex.taxi.am.r;
import ru.yandex.taxi.analytics.o;
import ru.yandex.taxi.h;
import ru.yandex.taxi.jobs.b;
import ru.yandex.taxi.multiorder.f;
import ru.yandex.taxi.persuggest.source.m;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.settings.main.k;
import ru.yandex.taxi.themes.experiments.e;
import ru.yandex.taxi.themes.g;
import ru.yandex.taxi.zalogin.j;
import ru.yandex.taxi.zalogin.l;

/* loaded from: classes8.dex */
public final class vd implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;

    public /* synthetic */ vd(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.g;
        xvf0 xvf0Var2 = this.i;
        xvf0 xvf0Var3 = this.h;
        xvf0 xvf0Var4 = this.f;
        xvf0 xvf0Var5 = this.e;
        xvf0 xvf0Var6 = this.c;
        xvf0 xvf0Var7 = this.d;
        xvf0 xvf0Var8 = this.b;
        switch (i) {
            case 0:
                return new c((Lifecycle) xvf0Var8.get(), (tse) xvf0Var6.get(), (tt2) xvf0Var7.get(), (a) xvf0Var5.get(), (ff) xvf0Var4.get(), (p2y0) xvf0Var.get(), (y50) xvf0Var3.get(), (d) xvf0Var2.get());
            case 1:
                return new com.yandex.messaging.domain.folders.a((com.yandex.messaging.domain.actions.a) xvf0Var8.get(), (com.yandex.messaging.internal.storage.folders.d) xvf0Var6.get(), (k020) xvf0Var7.get(), (el21) xvf0Var5.get(), (xw50) xvf0Var4.get(), (com.yandex.messaging.internal.backendconfig.a) xvf0Var.get(), (zwr) xvf0Var3.get(), (kse) xvf0Var2.get());
            case 2:
                return new ru.yandex.taxi.router.c((ra00) xvf0Var8.get(), (n20) xvf0Var6.get(), (com.yandex.go.navigation.screen.c) xvf0Var7.get(), i5m.a(xvf0Var5), this.f, this.g, this.h, this.i);
            case 3:
                return new com.yandex.go.address.address_map_picker.ui.actions.a((p01) xvf0Var8.get(), (com.yandex.go.address.address_map_picker.domain.c) xvf0Var6.get(), (com.yandex.go.address.address_map_picker.panorama.d) xvf0Var7.get(), (hnb0) xvf0Var5.get(), (ayb) xvf0Var4.get(), (bp0) xvf0Var.get(), (ru.yandex.taxi.address.clarification.impl.repo.a) xvf0Var3.get(), (j11) xvf0Var2.get());
            case 4:
                return new ru.yandex.taxi.promotions.factory.a((po21) xvf0Var8.get(), (dqe0) xvf0Var6.get(), i5m.a(xvf0Var7), i5m.a(xvf0Var5), (nmx) xvf0Var4.get(), (h) xvf0Var.get(), (tt2) xvf0Var3.get(), (qea0) xvf0Var2.get());
            case 5:
                return new ru.yandex.taxi.badge.a((tt2) xvf0Var8.get(), (jm4) xvf0Var6.get(), (com.yandex.go.yb.qr.domain.c) xvf0Var7.get(), (f1d0) xvf0Var5.get(), (ynj) xvf0Var4.get(), (hay0) xvf0Var.get(), (com.yandex.go.payments_widgets.mini.widgets.data.a) xvf0Var3.get(), (yc00) xvf0Var2.get());
            case 6:
                return new zw6((com.yandex.go.payments.shared.business.onboarding.a) xvf0Var8.get(), (mx6) xvf0Var6.get(), (fx60) xvf0Var7.get(), (z) xvf0Var5.get(), (k) xvf0Var4.get(), (u500) xvf0Var.get(), (z9p) xvf0Var3.get(), (ast0) xvf0Var2.get());
            case 7:
                return new wv8((yv8) xvf0Var8.get(), (s3s) xvf0Var6.get(), (pv8) xvf0Var7.get(), (qdc) xvf0Var5.get(), (q8s) xvf0Var4.get(), i5m.a(xvf0Var), (st2) xvf0Var3.get(), (c6s) xvf0Var2.get());
            case 8:
                return new a46((w030) xvf0Var8.get(), (ComponentActivity) xvf0Var6.get(), (cnp0) xvf0Var7.get(), (pwy0) xvf0Var5.get(), (oqd0) xvf0Var4.get(), (s3d0) xvf0Var.get(), this.h, (ney) xvf0Var2.get());
            case 9:
                return new com.yandex.go.styling.router.a((Activity) xvf0Var8.get(), (lg21) xvf0Var6.get(), (fvy0) xvf0Var7.get(), (w030) xvf0Var5.get(), (pay0) xvf0Var4.get(), (g) xvf0Var.get(), (e) xvf0Var3.get(), (qfg) xvf0Var2.get());
            case 10:
                return new com.yandex.go.chargers.push.a((Lifecycle) xvf0Var8.get(), (tse) xvf0Var6.get(), (b) xvf0Var7.get(), (em9) xvf0Var5.get(), (com.yandex.go.chargers.data.g) xvf0Var4.get(), (a3a) xvf0Var.get(), (com.yandex.go.chargers.push.domain.c) xvf0Var3.get(), (z2a) xvf0Var2.get());
            case 11:
                return new com.yandex.go.charity.repository.a((xdf) xvf0Var8.get(), (tse) xvf0Var6.get(), (tt2) xvf0Var7.get(), (com.yandex.go.route.interactor.b) xvf0Var5.get(), (po21) xvf0Var4.get(), (ru.yandex.taxi.am.g) xvf0Var.get(), (on2) xvf0Var3.get(), (dne0) xvf0Var2.get());
            case 12:
                return new com.yandex.go.payments.sbp.navigation.a((zuj0) xvf0Var8.get(), this.c, (wi0) xvf0Var7.get(), (com.yandex.go.payments.superapp.payment.b) xvf0Var5.get(), i5m.a(xvf0Var4), i5m.a(xvf0Var), (ajm0) xvf0Var3.get(), (w030) xvf0Var2.get());
            case 13:
                return new com.yandex.go.preorder.tariffs.a((dqe0) xvf0Var8.get(), i5m.a(xvf0Var6), (c4r0) xvf0Var7.get(), (com.yandex.go.taxi.tariffs.interactor.b) xvf0Var5.get(), (ck31) xvf0Var4.get(), (ru.yandex.taxi.am.g) xvf0Var.get(), (com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) xvf0Var3.get(), (tt2) xvf0Var2.get());
            case 14:
                return new ru.yandex.taxi.preorder.source.userposition.a((LocationManager) xvf0Var8.get(), (ru.yandex.taxi.location.g) xvf0Var6.get(), (k0b0) xvf0Var7.get(), (ru.yandex.taxi.preorder.source.userposition.repository.b) xvf0Var5.get(), (adz) xvf0Var4.get(), (oiy0) xvf0Var.get(), (h941) xvf0Var3.get(), (o) xvf0Var2.get());
            case 15:
                tt2 tt2Var = (tt2) xvf0Var8.get();
                lx4 lx4Var = (lx4) xvf0Var6.get();
                pho phoVar = (pho) xvf0Var7.get();
                j5z j5zVar = (j5z) xvf0Var.get();
                zuj0 zuj0Var = (zuj0) xvf0Var3.get();
                return new gwe(tt2Var, lx4Var, phoVar, j5zVar, zuj0Var);
            case 16:
                return new k5f((com.yandex.messaging.domain.actions.a) xvf0Var8.get(), (com.yandex.messaging.internal.storage.folders.d) xvf0Var6.get(), (k020) xvf0Var7.get(), (el21) xvf0Var5.get(), (xw50) xvf0Var4.get(), (w5t) xvf0Var.get(), (zwr) xvf0Var3.get(), (kse) xvf0Var2.get());
            case 17:
                return new com.yandex.go.flex.common.facade.a((Context) xvf0Var8.get(), (rs2) xvf0Var6.get(), (vaj) xvf0Var7.get(), (e2t) xvf0Var5.get(), (po21) xvf0Var4.get(), (kb20) xvf0Var.get(), (j5z) xvf0Var3.get(), (ru.yandex.taxi.am.token.a) xvf0Var2.get());
            case 18:
                return new ru.yandex.taxi.am.early_authorization.g((rqo) xvf0Var8.get(), (ru.yandex.taxi.am.g) xvf0Var6.get(), (of) xvf0Var7.get(), (hdr) xvf0Var5.get(), (com.yandex.go.permission.location_with_agreement.interactor.e) xvf0Var4.get(), (lbz) xvf0Var.get(), (dbn) xvf0Var3.get(), (r) xvf0Var2.get());
            case 19:
                return new com.yandex.go.superapp.unified_polling.a(i5m.a(xvf0Var8), i5m.a(xvf0Var6), i5m.a(xvf0Var7), i5m.a(xvf0Var5), i5m.a(xvf0Var4), (wnt) xvf0Var.get(), i5m.a(xvf0Var3), (y) xvf0Var2.get());
            case 20:
                return new l9w((jj3) xvf0Var8.get(), (ra00) xvf0Var6.get(), this.d, this.e, (dqe0) xvf0Var4.get(), (icv0) xvf0Var.get(), (kpi0) xvf0Var3.get(), (oep0) xvf0Var2.get());
            case 21:
                return new ru.yandex.taxi.statebar.controller.a((com.yandex.go.navigation.screen.c) xvf0Var8.get(), (y3u0) xvf0Var6.get(), (v3u0) xvf0Var7.get(), (zuj0) xvf0Var5.get(), (al60) xvf0Var4.get(), (uc60) xvf0Var.get(), (ru.yandex.taxi.failure_notificator.b) xvf0Var3.get(), (c9p) xvf0Var2.get());
            case 22:
                return new avx((ru.yandex.taxi.launch.c) xvf0Var8.get(), (ru.yandex.taxi.startup.launch.h) xvf0Var6.get(), (f0t0) xvf0Var7.get(), (ru.yandex.taxi.am.g) xvf0Var5.get(), i5m.a(xvf0Var4), (ss00) xvf0Var.get(), (b6z0) xvf0Var3.get(), (lx4) xvf0Var2.get());
            case 23:
                return new l((tse) xvf0Var8.get(), (eky) xvf0Var6.get(), (j) xvf0Var7.get(), (dc61) xvf0Var5.get(), (fhz) xvf0Var4.get(), (Activity) xvf0Var.get(), (tt2) xvf0Var3.get(), this.i);
            case 24:
                return new com.yandex.go.morphlex.router.a((rqo) xvf0Var8.get(), this.c, i5m.a(xvf0Var7), (com.yandex.go.route.interactor.b) xvf0Var5.get(), (Context) xvf0Var4.get(), (po21) xvf0Var.get(), (z0j) xvf0Var3.get(), (xes0) xvf0Var2.get());
            case 25:
                return new com.yandex.go.flex.common.router.payment.method.morphlex.a((f33) xvf0Var8.get(), (ffa0) xvf0Var6.get(), (com.yandex.go.payments.delayed.a) xvf0Var7.get(), (kpi0) xvf0Var5.get(), (wiq0) xvf0Var4.get(), this.g, (vj4) xvf0Var3.get(), (f9y0) xvf0Var2.get());
            case 26:
                return new f((tse) xvf0Var8.get(), (tt2) xvf0Var6.get(), (ra00) xvf0Var7.get(), this.e, this.f, this.g, i5m.a(xvf0Var3), i5m.a(xvf0Var2));
            case 27:
                return new ru.yandex.taxi.logistics.payment_method_selector.c((ru.yandex.taxi.preorder.repositories.g) xvf0Var8.get(), (wiq0) xvf0Var6.get(), (wt90) xvf0Var7.get(), (uq1) xvf0Var5.get(), (ut90) xvf0Var4.get(), (ru.yandex.taxi.delivery.experiments.e) xvf0Var.get(), (cda0) xvf0Var3.get(), (maj0) xvf0Var2.get());
            case 28:
                return new m((ru.yandex.taxi.persuggest.api.a) xvf0Var8.get(), (ru.yandex.taxi.preorder.source.userposition.b) xvf0Var6.get(), (sta0) xvf0Var7.get(), (ru.yandex.taxi.persuggest.source.a) xvf0Var5.get(), (ru.yandex.taxi.favorites.suggest.b) xvf0Var4.get(), (o2s) xvf0Var.get(), (com.yandex.go.address.search.perf.c) xvf0Var3.get(), (w7v0) xvf0Var2.get());
            default:
                return new jgc0((Context) xvf0Var8.get(), (lgc0) xvf0Var6.get(), (com.yandex.go.places.impl.ui.common.map.location.a) xvf0Var7.get(), (tt2) xvf0Var5.get(), (pwy0) xvf0Var4.get(), (i) xvf0Var.get(), (ah00) xvf0Var3.get(), (no21) xvf0Var2.get());
        }
    }
}
