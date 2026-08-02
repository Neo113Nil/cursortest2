package defpackage;

import android.content.Context;
import android.os.Looper;
import com.yandex.go.places.impl.domain.interactors.map.f;
import com.yandex.go.places.map.data.repositories.i;
import com.yandex.go.safety.center.SafetyCenterApi;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;
import com.yandex.go.scooters.domain.r;
import com.yandex.go.scooters.domain.x;
import com.yandex.go.scooters.passes.h;
import com.yandex.go.summary.mapper.a;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingView;
import com.yandex.go.taxi.order.ui.recenter.TaxiOrderTrackingRecenterButton;
import com.yandex.go.taxi.summary.interactor.p;
import com.yandex.go.walking.navigation.impl.guidance.interactor.n;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.v;
import com.yandex.passport.sloth.y0;
import com.yandex.passport.sloth.z0;
import ru.yandex.logistics.sdk.cargo_form.impl.popup.b;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.c;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.e;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.g;
import ru.yandex.taxi.delivery.impl.paid_insurance.d;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.summary.requirements.list.interactors.y;

/* loaded from: classes14.dex */
public final class xv8 implements v7p {
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
    public final xvf0 k;
    public final yvf0 l;
    public final yvf0 m;
    public final yvf0 n;

    public xv8(n3w n3wVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, yvf0 yvf0Var9, yvf0 yvf0Var10, xvf0 xvf0Var, yvf0 yvf0Var11) {
        this.a = 23;
        this.k = n3wVar;
        this.c = yvf0Var;
        this.d = yvf0Var2;
        this.e = yvf0Var3;
        this.f = yvf0Var4;
        this.g = yvf0Var5;
        this.h = yvf0Var6;
        this.i = yvf0Var7;
        this.j = yvf0Var8;
        this.l = yvf0Var9;
        this.m = yvf0Var10;
        this.b = xvf0Var;
        this.n = yvf0Var11;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.k;
        yvf0 yvf0Var = this.n;
        xvf0 xvf0Var2 = this.b;
        yvf0 yvf0Var2 = this.m;
        yvf0 yvf0Var3 = this.l;
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
                return new c((e) xvf0Var2.get(), (y30) ((exf) yvf0Var6).get(), (hwy0) ((exf) yvf0Var5).get(), (tgg) ((eqh) yvf0Var4).get(), (hw8) ((n3w) xvf0Var).a, (dci) ((exf) yvf0Var3).get(), (t6s) ((dxf) yvf0Var2).get(), (a2y) ((xvf0) yvf0Var11).get(), (uip0) ((xvf0) yvf0Var10).get(), (rza0) ((exf) yvf0Var).get(), (oy60) ((xvf0) yvf0Var9).get(), (g) ((xvf0) yvf0Var8).get(), (b) ((xvf0) yvf0Var7).get());
            case 1:
                return new s9b((Looper) xvf0Var2.get(), (o1b0) ((xvf0) yvf0Var11).get(), (at2) ((xvf0) yvf0Var10).get(), (k020) ((xvf0) yvf0Var9).get(), (nta0) ((xvf0) yvf0Var8).get(), (wff0) ((xvf0) yvf0Var7).get(), (sb7) ((xvf0) yvf0Var6).get(), (w3c) ((xvf0) yvf0Var5).get(), (m5b0) ((xvf0) yvf0Var4).get(), (x22) xvf0Var.get(), (vcz0) ((xvf0) yvf0Var3).get(), (l7q0) ((xvf0) yvf0Var2).get(), (y221) ((nb11) yvf0Var).get());
            case 2:
                return new owh((wiq0) ((w0g) yvf0Var6).get(), (vfx0) xvf0Var2.get(), (viv0) ((xvf0) yvf0Var11).get(), (a) ((xvf0) yvf0Var10).get(), (wti) ((xvf0) yvf0Var9).get(), (wt90) ((xvf0) yvf0Var8).get(), (iei) ((xvf0) yvf0Var7).get(), (ru.yandex.taxi.delivery.experiments.e) ((xvf0) yvf0Var5).get(), (ru.yandex.taxi.logistics.payment_method_selector.c) ((xvf0) yvf0Var4).get(), (rgi) xvf0Var.get(), (d) ((xvf0) yvf0Var3).get(), (ygi) ((xvf0) yvf0Var2).get(), (pwy0) ((xvf0) yvf0Var).get());
            case 3:
                return new pzf((Context) ((n3w) xvf0Var).a, (qcp0) ((ibg) yvf0Var11).get(), (hwy0) ((ibg) yvf0Var10).get(), (com.yandex.delivery.utils.dialogmanager.impl.b) ((gbg) yvf0Var9).get(), (oa9) ((kj7) yvf0Var8).get(), (jwh) ((gbg) yvf0Var7).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.a) ((oti) yvf0Var6).get(), (bi60) ((gbg) yvf0Var5).get(), (yuj0) ((gbg) yvf0Var4).get(), (gzh) xvf0Var2.get(), (t0k0) ((gbg) yvf0Var3).get(), (st2) ((gbg) yvf0Var2).get(), (q8s) ((gbg) yvf0Var).get());
            case 4:
                return new hx9((biv0) xvf0Var2.get(), (c9l0) ((xvf0) yvf0Var11).get(), (zqz0) ((xvf0) yvf0Var10).get(), (ru.yandex.taxi.preorder.source.mode.interactor.e) ((xvf0) yvf0Var9).get(), (rut) yvf0Var6, (ru.yandex.taxi.linked_order.a) ((xvf0) yvf0Var8).get(), (a3v) ((xvf0) yvf0Var7).get(), (xvw) ((xvf0) yvf0Var5).get(), (kjt0) ((xvf0) yvf0Var4).get(), (ah00) xvf0Var.get(), (tft0) ((xvf0) yvf0Var3).get(), (uq40) ((xvf0) yvf0Var2).get(), (sni0) ((xvf0) yvf0Var).get());
            case 5:
                return new com.yandex.go.places.impl.ui.main.map.filters.overlay.a((Context) ((x4g) yvf0Var6).get(), (odc0) xvf0Var2.get(), (i) ((xvf0) yvf0Var11).get(), (f) ((xvf0) yvf0Var10).get(), (com.yandex.go.places.map.ui.pinwar.a) ((xvf0) yvf0Var9).get(), (gdc0) ((xvf0) yvf0Var8).get(), (ah00) ((xvf0) yvf0Var7).get(), (pwy0) ((xvf0) yvf0Var5).get(), (u050) ((xvf0) yvf0Var4).get(), (ohh) xvf0Var.get(), (d30) ((xvf0) yvf0Var3).get(), (qdc0) ((xvf0) yvf0Var2).get(), (go10) ((xvf0) yvf0Var).get());
            case 6:
                return new y((roj0) xvf0Var2.get(), (dqe0) ((w0g) yvf0Var6).get(), (mvm) ((xvf0) yvf0Var11).get(), (axm) ((u0g) yvf0Var5).get(), (ynm0) ((a1g) yvf0Var4).get(), (dvm) ((xvf0) yvf0Var10).get(), (iom0) ((xvf0) yvf0Var9).get(), (orx0) ((xvf0) yvf0Var8).get(), (zuj0) ((xvf0) yvf0Var7).get(), (tt2) xvf0Var.get(), (ru.yandex.taxi.requirements.experiments.f) ((xvf0) yvf0Var3).get(), (ibn) ((xvf0) yvf0Var2).get(), (vfx0) ((xvf0) yvf0Var).get());
            case 7:
                return new eek0((gu11) xvf0Var2.get(), (OrderScreen) ((n3w) xvf0Var).a, (f0) ((xvf0) yvf0Var11).get(), (com.yandex.go.taxi.order.details.v2.state.d) ((xvf0) yvf0Var10).get(), (jbk0) ((xvf0) yvf0Var9).get(), (com.yandex.go.taxi.order.details.v2.domain.a11y.b) ((xvf0) yvf0Var8).get(), i5m.a((xvf0) yvf0Var7), (com.yandex.go.superapp.tracking.data.e) ((xvf0) yvf0Var6).get(), (hc80) ((xvf0) yvf0Var5).get(), (com.yandex.go.taxi.order.details.v2.state.elements.decorations.a) ((xvf0) yvf0Var4).get(), (com.yandex.go.taxi.order.details.v2.analytics.g) ((xvf0) yvf0Var3).get(), (tt2) ((xvf0) yvf0Var2).get(), (OrderScreen) ((n3w) yvf0Var).a);
            case 8:
                return new j((SafetyCenterApi) xvf0Var2.get(), (cog) ((xvf0) yvf0Var11).get(), (n20) ((xvf0) yvf0Var10).get(), (itl0) ((n3w) xvf0Var).a, (ru.yandex.taxi.launch.c) ((b7g) yvf0Var8).get(), (SafetyCenterExperiment) ((xvf0) yvf0Var9).get(), (y50) ((b7g) yvf0Var7).get(), (vjr0) ((c7g) yvf0Var6).get(), (ow7) ((b7g) yvf0Var5).get(), (tt2) ((b7g) yvf0Var4).get(), (com.yandex.go.taxi.order.provider.a) ((b7g) yvf0Var3).get(), (wnt) ((b7g) yvf0Var2).get(), (dne0) ((c7g) yvf0Var).get());
            case 9:
                return new com.yandex.go.scooters.offers.v2.domain.e((tt2) ((e7g) yvf0Var6).get(), (e2e0) xvf0Var2.get(), (com.yandex.go.scooters.offers.v2.domain.g) ((xvf0) yvf0Var11).get(), (y5p0) ((xvf0) yvf0Var10).get(), (com.yandex.go.scooters.offers.v2.domain.mapper.a) ((z8n0) yvf0Var5).get(), (b3n0) ((xvf0) yvf0Var9).get(), (dzm0) ((xvf0) yvf0Var8).get(), (z2o0) ((xvf0) yvf0Var7).get(), (a4o0) ((xvf0) yvf0Var4).get(), (com.yandex.go.scooters.passes.domain.g) xvf0Var.get(), (vyo0) ((xvf0) yvf0Var3).get(), (hxo0) ((xvf0) yvf0Var2).get(), (yun0) ((xvf0) yvf0Var).get());
            case 10:
                return new com.yandex.go.scooters.offers.v2.domain.f((ru.yandex.taxi.scooters.data.mapper.c) xvf0Var2.get(), (com.yandex.go.scooters.data.a) ((xvf0) yvf0Var11).get(), (r) ((xvf0) yvf0Var10).get(), (bvn0) ((xvf0) yvf0Var9).get(), (com.yandex.go.scooters.offers.v2.data.a) ((xvf0) yvf0Var8).get(), (x) ((xvf0) yvf0Var7).get(), (krl0) ((g1n0) yvf0Var6).get(), (com.yandex.go.scooters.payments.data.c) ((xvf0) yvf0Var5).get(), (i5n0) ((xvf0) yvf0Var4).get(), (com.yandex.go.scooters.offers.v2.data.b) xvf0Var.get(), (com.yandex.go.scooters.offers.v2.analytics.c) ((xvf0) yvf0Var3).get(), (q4o0) ((xvf0) yvf0Var2).get(), (mxm0) ((xvf0) yvf0Var).get());
            case 11:
                return new h((beo0) xvf0Var2.get(), (MapNotificationsMuteRepository) ((xvf0) yvf0Var11).get(), (xvf0) yvf0Var10, (xvf0) yvf0Var9, (xvf0) yvf0Var8, (xvf0) yvf0Var7, (xvf0) yvf0Var6, (xvf0) yvf0Var5, (xvf0) yvf0Var4, this.k, (xvf0) yvf0Var3, (qx5) yvf0Var2, (xvf0) yvf0Var);
            case 12:
                return new com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.j((Context) xvf0Var2.get(), (ru.yandex.taxi.widget.c) ((xvf0) yvf0Var11).get(), (n6n0) ((xvf0) yvf0Var10).get(), (tj60) ((xvf0) yvf0Var9).get(), (y5p0) ((xvf0) yvf0Var8).get(), (znn0) ((xvf0) yvf0Var7).get(), (b3n0) ((xvf0) yvf0Var6).get(), (z2o0) ((xvf0) yvf0Var5).get(), (com.yandex.go.scooters.passes.domain.i) ((xvf0) yvf0Var4).get(), (com.yandex.go.scooters.offers.v2.components.bottom.data.a) ((bwn0) xvf0Var).get(), (com.yandex.go.scooters.passes.domain.g) ((xvf0) yvf0Var3).get(), (com.yandex.go.scooters.super_passes.upsale_on_book.data.a) ((xvf0) yvf0Var2).get(), (k6p0) ((xvf0) yvf0Var).get());
            case 13:
                return new com.yandex.go.taxi.main.shortcuts.ui.modalview.b((ney) xvf0Var2.get(), (sxr0) ((xvf0) yvf0Var11).get(), (hzr0) ((xvf0) yvf0Var10).get(), (tlw0) ((xvf0) yvf0Var9).get(), (com.yandex.go.taxi.main.shortcuts.ui.modalview.a) ((xvf0) yvf0Var8).get(), (ru.yandex.taxi.multiorder.e) ((xvf0) yvf0Var7).get(), (jc00) ((xvf0) yvf0Var6).get(), (com.yandex.go.taxi.main.shortcuts.ui.modalview.d) ((xvf0) yvf0Var5).get(), (ru.yandex.taxi.perf.screen.c) ((xvf0) yvf0Var4).get(), (n050) ((n3w) xvf0Var).a, (ljg0) ((uzu0) yvf0Var3).get(), (r9g) yvf0Var2, (oep0) ((xvf0) yvf0Var).get());
            case 14:
                return new yet0((qy41) xvf0Var2.get(), (yq40) ((xvf0) yvf0Var11).get(), (ru.yandex.taxi.preorder.source.mode.interactor.e) ((xvf0) yvf0Var10).get(), (tit0) ((xvf0) yvf0Var9).get(), (c9l0) ((xvf0) yvf0Var8).get(), (ya20) ((ret) yvf0Var6).get(), (ab20) ((xvf0) yvf0Var7).get(), (ru.yandex.taxi.preorder.source.domain.r) ((xvf0) yvf0Var5).get(), (xfv0) ((xvf0) yvf0Var4).get(), (zit0) xvf0Var.get(), (tft0) ((xvf0) yvf0Var3).get(), (mrj) ((s90) yvf0Var2).get(), (ru.yandex.taxi.address.clarification.impl.repo.a) ((xvf0) yvf0Var).get());
            case 15:
                return new dgt0((fy01) xvf0Var2.get(), (rgt0) ((xvf0) yvf0Var11).get(), (oft0) ((xvf0) yvf0Var10).get(), (git0) ((xvf0) yvf0Var9).get(), (svw) ((xvf0) yvf0Var8).get(), (kpi0) ((xvf0) yvf0Var7).get(), (mxg) ((xvf0) yvf0Var6).get(), (kqv0) ((xvf0) yvf0Var5).get(), (bwx0) ((xvf0) yvf0Var4).get(), (uq40) xvf0Var.get(), (yit0) ((xvf0) yvf0Var3).get(), (vvx0) ((xvf0) yvf0Var2).get(), (wjt0) ((syv) yvf0Var).get());
            case 16:
                return new p((ck31) xvf0Var2.get(), (ru.yandex.taxi.hints.interactors.c) ((xvf0) yvf0Var11).get(), (w810) ((xpj0) yvf0Var6).get(), (wiq0) ((w0g) yvf0Var5).get(), (ekz) ((mvy) yvf0Var4).get(), (wae0) ((xvf0) yvf0Var10).get(), (dqe0) ((w0g) xvf0Var).get(), (com.yandex.go.route.interactor.c) ((xvf0) yvf0Var9).get(), (yjt0) ((xvf0) yvf0Var8).get(), (p0j) ((xvf0) yvf0Var7).get(), (ixb) ((xvf0) yvf0Var3).get(), (ru.yandex.taxi.widget.utils.e) ((xvf0) yvf0Var2).get(), (sue0) ((upk0) yvf0Var).get());
            case 17:
                return new com.yandex.go.superapp.discovery.map.impl.domain.interactors.c((ktv0) xvf0Var2.get(), (ah00) ((xvf0) yvf0Var11).get(), (po21) ((xvf0) yvf0Var10).get(), (k0b0) ((xvf0) yvf0Var9).get(), (xvf0) yvf0Var8, (izv0) ((xvf0) yvf0Var7).get(), (oep0) ((jag) yvf0Var6).get(), (com.yandex.go.superapp.discovery.map.impl.domain.interactors.settlement.d) ((rxm0) yvf0Var5).get(), (ru.yandex.taxi.search.suggest.i) ((jag) yvf0Var4).get(), (qvv) ((iag) xvf0Var).get(), (atd0) ((jag) yvf0Var3).get(), (r3v) ((xvf0) yvf0Var2).get(), (hfc0) ((jag) yvf0Var).get());
            case 18:
                return new ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.b((tt2) xvf0Var2.get(), (wiq0) ((xvf0) yvf0Var11).get(), (orx0) ((xvf0) yvf0Var10).get(), (ru.yandex.taxi.preorder.summary.selector.analytics.b) ((xvf0) yvf0Var9).get(), (unx0) ((xvf0) yvf0Var8).get(), (i2s) ((xvf0) yvf0Var7).get(), (c4r0) ((xvf0) yvf0Var6).get(), (t49) ((xvf0) yvf0Var5).get(), (fk31) ((xvf0) yvf0Var4).get(), (hnx0) ((xvf0) yvf0Var3).get(), (pe31) ((n3w) xvf0Var).a, (b8r) ((xag) yvf0Var2).get(), (y5s0) ((xag) yvf0Var).get());
            case 19:
                return new TaxiOrderTrackingView((Context) xvf0Var2.get(), (v6y0) ((xvf0) yvf0Var11).get(), (c2x0) ((xvf0) yvf0Var10).get(), (TaxiOrderTrackingRecenterButton) ((gpx0) yvf0Var6).get(), (com.yandex.go.taxi.order.multi.tracking.i) ((ii9) yvf0Var5).get(), (tsx0) ((xvf0) yvf0Var9).get(), (g1y0) ((n3w) xvf0Var).a, (g6y0) ((xvf0) yvf0Var8).get(), (gok0) ((xvf0) yvf0Var7).get(), (pwy0) ((xvf0) yvf0Var4).get(), (ru.yandex.taxi.design.utils.b) ((xvf0) yvf0Var3).get(), (s3y0) ((n3w) yvf0Var2).a, (y4k0) ((xvf0) yvf0Var).get());
            case 20:
                return new com.yandex.go.vault.router.c((w030) ((jcg) yvf0Var6).get(), (jcg) yvf0Var5, (wgr) xvf0Var2.get(), (ph70) xvf0Var, (a850) ((jcg) yvf0Var3).get(), (z231) ((xvf0) yvf0Var11).get(), (i331) ((xvf0) yvf0Var10).get(), (com.yandex.go.vault.data.b) ((eqh) yvf0Var4).get(), (xvf0) yvf0Var9, (ru.yandex.taxi.deeplinks.b) ((sag) yvf0Var2).get(), (ljr) ((xvf0) yvf0Var8).get(), (com.yandex.go.vault.domain.a) ((nqq) yvf0Var).get(), (vlr) ((xvf0) yvf0Var7).get());
            case 21:
                return new sf31(i5m.a((rct0) yvf0Var6), (ru.yandex.taxi.preorder.summary.selector.model.vertical.a) xvf0Var2.get(), (nex0) ((xvf0) yvf0Var11).get(), (fva0) ((xvf0) yvf0Var10).get(), (k051) ((xvf0) yvf0Var9).get(), (unx0) ((xvf0) yvf0Var8).get(), (bbx0) ((xvf0) yvf0Var7).get(), (bmq0) ((xvf0) yvf0Var5).get(), (f1f0) ((xvf0) yvf0Var4).get(), (tt2) xvf0Var.get(), (ru.yandex.taxi.perf.screen.c) ((xvf0) yvf0Var3).get(), (com.yandex.go.taxi.summary.shared.lifecycle.a) ((xvf0) yvf0Var2).get(), (pav) ((xvf0) yvf0Var).get());
            case 22:
                return new com.yandex.go.walking.navigation.impl.guidance.e((Context) ((jcg) yvf0Var9).get(), (w030) ((pcg) yvf0Var8).get(), (n341) ((f241) yvf0Var7).get(), (com.yandex.go.walking.navigation.impl.guidance.interactor.x) ((h0l0) yvf0Var6).get(), (f241) yvf0Var5, (qd21) yvf0Var4, (f241) xvf0Var, (x241) ((ocg) yvf0Var3).get(), (com.yandex.go.walking.navigation.impl.navigation_core.guidance.a) ((ocg) yvf0Var2).get(), (a3v) xvf0Var2.get(), (b741) ((xvf0) yvf0Var11).get(), (w041) ((xvf0) yvf0Var10).get(), (n) ((ocg) yvf0Var).get());
            default:
                return new com.yandex.passport.sloth.url.c((SlothParams) ((n3w) xvf0Var).a, (com.yandex.passport.sloth.dependencies.h) yvf0Var11.get(), (com.yandex.passport.common.ui.lang.b) yvf0Var10.get(), (com.yandex.passport.internal.sloth.p) yvf0Var9.get(), (com.yandex.passport.internal.sloth.f) yvf0Var8.get(), (v) yvf0Var7.get(), (y0) yvf0Var6.get(), (com.yandex.passport.internal.sloth.d) yvf0Var5.get(), (com.yandex.passport.internal.sloth.c) yvf0Var4.get(), (com.yandex.passport.sloth.e) yvf0Var3.get(), (com.yandex.passport.sloth.dependencies.d) yvf0Var2.get(), (com.yandex.passport.sloth.url.d) xvf0Var2.get(), (z0) yvf0Var.get());
        }
    }

    public /* synthetic */ xv8(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, int i, boolean z) {
        this.a = i;
        this.h = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
        this.e = xvf0Var5;
        this.f = xvf0Var6;
        this.g = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.k = xvf0Var10;
        this.l = xvf0Var11;
        this.m = xvf0Var12;
        this.n = xvf0Var13;
    }

    public /* synthetic */ xv8(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, int i) {
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
        this.n = xvf0Var13;
    }

    public xv8(c7g c7gVar, b7g b7gVar, b7g b7gVar2, n3w n3wVar, b7g b7gVar3, xvf0 xvf0Var, b7g b7gVar4, c7g c7gVar2, b7g b7gVar5, b7g b7gVar6, b7g b7gVar7, b7g b7gVar8, c7g c7gVar3) {
        this.a = 8;
        this.b = c7gVar;
        this.c = b7gVar;
        this.d = b7gVar2;
        this.k = n3wVar;
        this.f = b7gVar3;
        this.e = xvf0Var;
        this.g = b7gVar4;
        this.h = c7gVar2;
        this.i = b7gVar5;
        this.j = b7gVar6;
        this.l = b7gVar7;
        this.m = b7gVar8;
        this.n = c7gVar3;
    }

    public xv8(jcg jcgVar, jcg jcgVar2, xvf0 xvf0Var, ph70 ph70Var, jcg jcgVar3, xvf0 xvf0Var2, xvf0 xvf0Var3, eqh eqhVar, xvf0 xvf0Var4, sag sagVar, xvf0 xvf0Var5, nqq nqqVar, xvf0 xvf0Var6) {
        this.a = 20;
        this.h = jcgVar;
        this.i = jcgVar2;
        this.b = xvf0Var;
        this.k = ph70Var;
        this.l = jcgVar3;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.j = eqhVar;
        this.e = xvf0Var4;
        this.m = sagVar;
        this.f = xvf0Var5;
        this.n = nqqVar;
        this.g = xvf0Var6;
    }

    public xv8(n3w n3wVar, ibg ibgVar, ibg ibgVar2, gbg gbgVar, kj7 kj7Var, gbg gbgVar2, oti otiVar, gbg gbgVar3, gbg gbgVar4, xvf0 xvf0Var, gbg gbgVar5, gbg gbgVar6, gbg gbgVar7) {
        this.a = 3;
        this.k = n3wVar;
        this.c = ibgVar;
        this.d = ibgVar2;
        this.e = gbgVar;
        this.f = kj7Var;
        this.g = gbgVar2;
        this.h = otiVar;
        this.i = gbgVar3;
        this.j = gbgVar4;
        this.b = xvf0Var;
        this.l = gbgVar5;
        this.m = gbgVar6;
        this.n = gbgVar7;
    }

    public xv8(xvf0 xvf0Var, exf exfVar, exf exfVar2, eqh eqhVar, n3w n3wVar, exf exfVar3, dxf dxfVar, xvf0 xvf0Var2, xvf0 xvf0Var3, exf exfVar4, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6) {
        this.a = 0;
        this.b = xvf0Var;
        this.h = exfVar;
        this.i = exfVar2;
        this.j = eqhVar;
        this.k = n3wVar;
        this.l = exfVar3;
        this.m = dxfVar;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.n = exfVar4;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    public xv8(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, gpx0 gpx0Var, ii9 ii9Var, f380 f380Var, n3w n3wVar, xvf0 xvf0Var4, zlf0 zlf0Var, xvf0 xvf0Var5, kpp0 kpp0Var, n3w n3wVar2, mt2 mt2Var) {
        this.a = 19;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.h = gpx0Var;
        this.i = ii9Var;
        this.e = f380Var;
        this.k = n3wVar;
        this.f = xvf0Var4;
        this.g = zlf0Var;
        this.j = xvf0Var5;
        this.l = kpp0Var;
        this.m = n3wVar2;
        this.n = mt2Var;
    }

    public xv8(u6g u6gVar, n3w n3wVar, u6g u6gVar2, xvf0 xvf0Var, kbk0 kbk0Var, cta0 cta0Var, t6g t6gVar, t6g t6gVar2, t6g t6gVar3, jpf0 jpf0Var, wj0 wj0Var, r6g r6gVar, n3w n3wVar2) {
        this.a = 7;
        this.b = u6gVar;
        this.k = n3wVar;
        this.c = u6gVar2;
        this.d = xvf0Var;
        this.e = kbk0Var;
        this.f = cta0Var;
        this.g = t6gVar;
        this.h = t6gVar2;
        this.i = t6gVar3;
        this.j = jpf0Var;
        this.l = wj0Var;
        this.m = r6gVar;
        this.n = n3wVar2;
    }

    public xv8(e7g e7gVar, mbo0 mbo0Var, xvf0 xvf0Var, xvf0 xvf0Var2, z8n0 z8n0Var, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, mbo0 mbo0Var2, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9) {
        this.a = 9;
        this.h = e7gVar;
        this.b = mbo0Var;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.i = z8n0Var;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.j = xvf0Var6;
        this.k = mbo0Var2;
        this.l = xvf0Var7;
        this.m = xvf0Var8;
        this.n = xvf0Var9;
    }

    public xv8(xvf0 xvf0Var, w0g w0gVar, s0g s0gVar, u0g u0gVar, a1g a1gVar, s0g s0gVar2, n0k0 n0k0Var, c1g c1gVar, w0g w0gVar2, t0g t0gVar, q02 q02Var, s0g s0gVar3, xvf0 xvf0Var2) {
        this.a = 6;
        this.b = xvf0Var;
        this.h = w0gVar;
        this.c = s0gVar;
        this.i = u0gVar;
        this.j = a1gVar;
        this.d = s0gVar2;
        this.e = n0k0Var;
        this.f = c1gVar;
        this.g = w0gVar2;
        this.k = t0gVar;
        this.l = q02Var;
        this.m = s0gVar3;
        this.n = xvf0Var2;
    }

    public xv8(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, n3w n3wVar, xag xagVar, xag xagVar2) {
        this.a = 18;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.l = xvf0Var10;
        this.k = n3wVar;
        this.m = xagVar;
        this.n = xagVar2;
    }

    public xv8(y0g y0gVar, iv0 iv0Var, xpj0 xpj0Var, w0g w0gVar, mvy mvyVar, g680 g680Var, w0g w0gVar2, b1g b1gVar, l9t0 l9t0Var, oti otiVar, g0g g0gVar, xvf0 xvf0Var, upk0 upk0Var) {
        this.a = 16;
        this.b = y0gVar;
        this.c = iv0Var;
        this.h = xpj0Var;
        this.i = w0gVar;
        this.j = mvyVar;
        this.d = g680Var;
        this.k = w0gVar2;
        this.e = b1gVar;
        this.f = l9t0Var;
        this.g = otiVar;
        this.l = g0gVar;
        this.m = xvf0Var;
        this.n = upk0Var;
    }

    public xv8(xvf0 xvf0Var, zo0 zo0Var, eqh eqhVar, xvf0 xvf0Var2, eqh eqhVar2, ret retVar, xvf0 xvf0Var3, eqh eqhVar3, mz70 mz70Var, xvf0 xvf0Var4, rct0 rct0Var, s90 s90Var, xvf0 xvf0Var5) {
        this.a = 14;
        this.b = xvf0Var;
        this.c = zo0Var;
        this.d = eqhVar;
        this.e = xvf0Var2;
        this.f = eqhVar2;
        this.h = retVar;
        this.g = xvf0Var3;
        this.i = eqhVar3;
        this.j = mz70Var;
        this.k = xvf0Var4;
        this.l = rct0Var;
        this.m = s90Var;
        this.n = xvf0Var5;
    }

    public xv8(xvf0 xvf0Var, eqh eqhVar, ibz0 ibz0Var, eqh eqhVar2, rut rutVar, xvf0 xvf0Var2, xvf0 xvf0Var3, eqh eqhVar3, lok0 lok0Var, xvf0 xvf0Var4, rct0 rct0Var, xvf0 xvf0Var5, xvf0 xvf0Var6) {
        this.a = 4;
        this.b = xvf0Var;
        this.c = eqhVar;
        this.d = ibz0Var;
        this.e = eqhVar2;
        this.h = rutVar;
        this.f = xvf0Var2;
        this.g = xvf0Var3;
        this.i = eqhVar3;
        this.j = lok0Var;
        this.k = xvf0Var4;
        this.l = rct0Var;
        this.m = xvf0Var5;
        this.n = xvf0Var6;
    }

    public xv8(jcg jcgVar, pcg pcgVar, f241 f241Var, h0l0 h0l0Var, f241 f241Var2, qd21 qd21Var, f241 f241Var3, ocg ocgVar, ocg ocgVar2, pcg pcgVar2, d441 d441Var, xvf0 xvf0Var, ocg ocgVar3) {
        this.a = 22;
        this.e = jcgVar;
        this.f = pcgVar;
        this.g = f241Var;
        this.h = h0l0Var;
        this.i = f241Var2;
        this.j = qd21Var;
        this.k = f241Var3;
        this.l = ocgVar;
        this.m = ocgVar2;
        this.b = pcgVar2;
        this.c = d441Var;
        this.d = xvf0Var;
        this.n = ocgVar3;
    }
}
