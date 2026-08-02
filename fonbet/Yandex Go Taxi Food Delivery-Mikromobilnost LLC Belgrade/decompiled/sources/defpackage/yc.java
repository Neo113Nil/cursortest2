package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.chargers.passes.data.r0;
import com.yandex.go.order.bundle.map.impl.data.repository.g;
import com.yandex.go.taxi.order.cancel.similar.interactor.i;
import com.yandex.messaging.input.bricks.ChatInputAuthorizeBrick;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.internal.view.input.selection.SelectedMessagesPanel;
import com.yandex.passport.sloth.ui.dependencies.m;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.action_button.a;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.action_button.b;
import ru.yandex.taxi.deeplinks.e;
import ru.yandex.taxi.preorder.source.domain.d;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.styling.c;

/* loaded from: classes5.dex */
public final class yc implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;

    public yc(eqh eqhVar, exf exfVar, exf exfVar2, dx7 dx7Var, exf exfVar3, xvf0 xvf0Var) {
        this.a = 18;
        this.e = eqhVar;
        this.c = exfVar;
        this.d = exfVar2;
        this.f = dx7Var;
        this.g = exfVar3;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.g;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.f;
        xvf0 xvf0Var5 = this.b;
        xvf0 xvf0Var6 = this.e;
        switch (i) {
            case 0:
                return new v920((wiq0) ((w0g) xvf0Var6).get(), (xdf) xvf0Var5.get(), (yow0) xvf0Var3.get(), (c) xvf0Var2.get(), (dqe0) ((w0g) xvf0Var4).get(), (ppw0) ((b1g) xvf0Var).get());
            case 1:
                return new pr((u2y0) xvf0Var5.get(), (yfj0) ((av4) xvf0Var6).get(), this.c, i5m.a(xvf0Var2), (u8w) ((jde0) xvf0Var4).get(), (oep0) xvf0Var.get());
            case 2:
                return new a((yfa) ((peb) xvf0Var6).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a) ((v7p) xvf0Var4).get(), (p6s) xvf0Var5.get(), (l6s) ((cuo) xvf0Var).get(), (o5s) xvf0Var3.get(), (cv8) xvf0Var2.get());
            case 3:
                return new b((u3s) ((n3w) xvf0Var6).a, (z4s) ((p1g) xvf0Var5).get(), (a) ((yc) xvf0Var3).get(), (s5s) ((p1g) xvf0Var2).get(), (hwy0) ((gxf) xvf0Var4).get(), (sae) ((srb) xvf0Var).get());
            case 4:
                return new com.yandex.go.places.models.data.mappers.a((dbv) ((y1u) xvf0Var6).get(), (m870) xvf0Var5.get(), (j670) xvf0Var3.get(), (x470) xvf0Var2.get(), (r670) xvf0Var4.get(), (mg41) xvf0Var.get());
            case 5:
                return new ru.yandex.taxi.address.clarification.impl.interactor.a((ah00) xvf0Var5.get(), (l56) xvf0Var3.get(), (ru.yandex.taxi.address.clarification.impl.repo.a) xvf0Var2.get(), (j4n) ((sb1) xvf0Var6).get(), (xvw) xvf0Var4.get(), (m) ((px4) xvf0Var).get());
            case 6:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_input_field.b((u3s) ((n3w) xvf0Var6).a, (p6s) ((p1g) xvf0Var5).get(), (hwy0) ((gxf) xvf0Var3).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_input_field.a) ((p4) xvf0Var2).get(), (sae) ((srb) xvf0Var4).get(), (vv0) ((p1g) xvf0Var).get());
            case 7:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_selector.c((u3s) ((n3w) xvf0Var6).a, (p6s) ((p1g) xvf0Var5).get(), (hwy0) ((gxf) xvf0Var3).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_selector.b) ((c4) xvf0Var2).get(), (z4s) ((p1g) xvf0Var4).get(), (sae) ((srb) xvf0Var).get());
            case 8:
                return new hf2((ah00) xvf0Var5.get(), (y3u0) xvf0Var3.get(), (h080) ((t160) xvf0Var6).get(), (ow70) ((n3w) xvf0Var4).a, (et00) xvf0Var2.get(), (amp0) ((wun0) xvf0Var).get());
            case 9:
                return new nz2((dgi0) xvf0Var5.get(), (h) ((u4g) xvf0Var6).get(), (com.yandex.go.taxi.order.map.route.a) xvf0Var3.get(), (mvd0) ((cta0) xvf0Var4).get(), (c641) xvf0Var2.get(), (jdj) ((wrh) xvf0Var).get());
            case 10:
                return new d((ik6) xvf0Var5.get(), (peb) xvf0Var6, (com.yandex.go.navigation.screen.c) xvf0Var3.get(), (qbl0) xvf0Var2.get(), (pj) ((tl3) xvf0Var4).get(), (oep0) xvf0Var.get());
            case 11:
                return new en6((s0g) xvf0Var4, this.b, (z880) xvf0Var3.get(), (wiq0) ((w0g) xvf0Var6).get(), (kdr) xvf0Var2.get(), (oep0) xvf0Var.get());
            case 12:
                return new qs6((bt6) ((yc) xvf0Var6).get(), (zs6) ((ze) xvf0Var4).get(), (Context) xvf0Var5.get(), (w030) xvf0Var3.get(), (ah00) xvf0Var2.get(), (eb50) xvf0Var.get());
            case 13:
                return new bt6((com.yandex.go.navigator.utils.d) ((bpf) xvf0Var6).get(), (j0g) ((fwc) xvf0Var4).get(), (m901) xvf0Var5.get(), (com.yandex.go.navigator.map_interactions.parkings.c) xvf0Var3.get(), (tt2) xvf0Var2.get(), (e) xvf0Var.get());
            case 14:
                return new boj0((sr4) ((kk) xvf0Var6).get(), (yu6) xvf0Var5.get(), (g) xvf0Var3.get(), (m180) xvf0Var2.get(), (fv6) xvf0Var4.get(), this.g);
            case 15:
                return new yx7((dy7) xvf0Var5.get(), (hx7) xvf0Var3.get(), (cy7) ((pg5) xvf0Var6).get(), (tt2) ((xwf) xvf0Var2).get(), (o2y0) ((n3w) xvf0Var4).a, (pwy0) ((xwf) xvf0Var).get());
            case 16:
                return new i((o08) xvf0Var6, (n20) xvf0Var5.get(), (ru.yandex.taxi.communications.data.a) xvf0Var3.get(), (tt2) xvf0Var2.get(), (oep0) xvf0Var4.get(), (g08) xvf0Var.get());
            case 17:
                return new p58((tse) ((jxf) xvf0Var6).get(), (sz8) ((jxf) xvf0Var5).get(), (ru.yandex.taxi.preorder.source.cars.a) ((lxf) xvf0Var3).get(), (uz8) ((jxf) xvf0Var2).get(), (wz8) ((jxf) xvf0Var4).get(), (rxy) ((lxf) xvf0Var).get());
            case 18:
                ((exf) xvf0Var3).get();
                ((exf) xvf0Var2).get();
                ((dx7) xvf0Var4).get();
                ((exf) xvf0Var).get();
                return new omy0();
            case 19:
                return new h29((Context) ((t0g) xvf0Var6).get(), (md6) ((mu7) xvf0Var4).get(), (ubx0) xvf0Var5.get(), (k7x0) xvf0Var3.get(), (pdc) xvf0Var2.get(), (ru.yandex.taxi.summary.deeplink.a) xvf0Var.get());
            case 20:
                return new com.yandex.go.taxi.order.change.source.pin.b((tt2) xvf0Var5.get(), (com.yandex.go.navigation.screen.c) xvf0Var3.get(), (n20) xvf0Var2.get(), (an8) ((ba9) xvf0Var6).get(), (com.yandex.go.taxi.order.change.source.data.e) xvf0Var4.get(), (gcc0) xvf0Var.get());
            case 21:
                return new com.yandex.go.chargers.debt.screen.domain.b((tt2) ((lxf) xvf0Var6).get(), (pwy0) xvf0Var5.get(), (bq9) xvf0Var3.get(), (vp9) xvf0Var2.get(), (com.yandex.go.chargers.payments.data.a) xvf0Var4.get(), (com.yandex.go.chargers.debt.screen.data.a) ((g6) xvf0Var).get());
            case 22:
                return new ss9((Context) xvf0Var5.get(), (w030) xvf0Var3.get(), (txf) xvf0Var6, (com.yandex.go.chargers.discounts.discount_stations.data.a) xvf0Var2.get(), (jt9) xvf0Var4.get(), (ct9) ((n3w) xvf0Var).a);
            case 23:
                return new com.yandex.go.chargers.qr.domain.a((com.yandex.go.chargers.error.a) xvf0Var5.get(), (qsa) xvf0Var3.get(), (com.yandex.go.chargers.error.data.a) xvf0Var2.get(), (po21) xvf0Var6.get(), i5m.a(xvf0Var4), (wd7) ((lxf) xvf0Var).get());
            case 24:
                return new n12((com.yandex.go.chargers.partner_subscription.ui.a) ((xea) xvf0Var6).get(), (nea) xvf0Var5.get(), (Context) xvf0Var3.get(), this.d, (w030) xvf0Var4.get(), this.g);
            case 25:
                return new zha((tt2) ((lxf) xvf0Var6).get(), (pwy0) xvf0Var5.get(), (r0) xvf0Var3.get(), (com.yandex.go.chargers.passes.payment_settings.e) xvf0Var2.get(), (fha) xvf0Var4.get(), (kha) xvf0Var.get());
            case 26:
                return new com.yandex.go.chargers.plus.a((em9) xvf0Var5.get(), (e5d0) ((qxf) xvf0Var6).get(), (j6a) xvf0Var3.get(), (ima) ((lu9) xvf0Var2).get(), (com.yandex.go.chargers.payments.domain.c) ((lxf) xvf0Var4).get(), (jma) ((nl9) xvf0Var).get());
            case 27:
                return new n12((zta) ((mu7) xvf0Var6).get(), (com.yandex.go.chargers.subscription.presentation.landing.d) ((xea) xvf0Var4).get(), (Context) xvf0Var5.get(), (em9) xvf0Var3.get(), (w030) xvf0Var2.get(), this.g);
            case 28:
                return new com.yandex.go.chargers.subscription.a((com.yandex.go.chargers.subscription.domain.b) xvf0Var5.get(), this.c, this.d, (com.yandex.go.chargers.subscription.domain.c) xvf0Var6.get(), this.f, (g6) xvf0Var);
            default:
                return new ChatInputAuthorizeBrick((Activity) xvf0Var5.get(), (pu31) xvf0Var3.get(), (yh3) xvf0Var2.get(), (SelectedMessagesPanel) ((jpn0) xvf0Var6).get(), (ChatInputHeightState) xvf0Var4.get(), (ymp) xvf0Var.get());
        }
    }

    public /* synthetic */ yc(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.e = xvf0Var;
        this.f = v7pVar;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
        this.g = xvf0Var5;
    }

    public /* synthetic */ yc(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, v7p v7pVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.e = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
        this.f = xvf0Var5;
        this.g = v7pVar;
    }

    public /* synthetic */ yc(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.e = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    public /* synthetic */ yc(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    public /* synthetic */ yc(int i, n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = xvf0Var3;
        this.d = xvf0Var4;
        this.f = n3wVar;
        this.g = xvf0Var5;
    }

    public yc(peb pebVar, v7p v7pVar, xvf0 xvf0Var, cuo cuoVar, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = 2;
        this.e = pebVar;
        this.f = v7pVar;
        this.b = xvf0Var;
        this.g = cuoVar;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public yc(s0g s0gVar, y0g y0gVar, eqh eqhVar, w0g w0gVar, prq prqVar, a1g a1gVar) {
        this.a = 11;
        this.f = s0gVar;
        this.b = y0gVar;
        this.c = eqhVar;
        this.e = w0gVar;
        this.d = prqVar;
        this.g = a1gVar;
    }

    public yc(xvf0 xvf0Var, xvf0 xvf0Var2, t160 t160Var, n3w n3wVar, sp00 sp00Var, wun0 wun0Var) {
        this.a = 8;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = t160Var;
        this.f = n3wVar;
        this.d = sp00Var;
        this.g = wun0Var;
    }

    public yc(xvf0 xvf0Var, u4g u4gVar, xvf0 xvf0Var2, cta0 cta0Var, xvf0 xvf0Var3, wrh wrhVar) {
        this.a = 9;
        this.b = xvf0Var;
        this.e = u4gVar;
        this.c = xvf0Var2;
        this.f = cta0Var;
        this.d = xvf0Var3;
        this.g = wrhVar;
    }

    public yc(mu7 mu7Var, rx4 rx4Var, lxf lxfVar, ba9 ba9Var, s90 s90Var, yc ycVar, g6 g6Var) {
        this.a = 28;
        this.b = mu7Var;
        this.c = lxfVar;
        this.d = ba9Var;
        this.e = s90Var;
        this.f = ycVar;
        this.g = g6Var;
    }
}
