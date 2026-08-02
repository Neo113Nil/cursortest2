package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.entities.environment.PayEnvironment;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.go.intercity.flex.dashboard.presentation.h;
import com.yandex.go.intercity.flex.dashboard.view.IntercityDashboardFlexSdkView;
import com.yandex.go.navigator.domain.o;
import com.yandex.go.payments.domain.m0;
import com.yandex.messaging.domain.chat.c;
import com.yandex.messaging.domain.g;
import com.yandex.messaging.domain.statuses.f;
import com.yandex.messaging.internal.authorized.chat.notifications.d;
import com.yandex.messaging.internal.authorized.j;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.ybsdk.feature.merchant.offers.internal.data.network.MerchantOffersApi;
import java.util.concurrent.Executor;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.checkin.i;
import ru.yandex.taxi.layers.experiments.p;
import ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.interactors.b;
import ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.dependencies.a;
import ru.yandex.taxi.main.map.e;
import ru.yandex.taxi.masstransit.domain.g0;
import ru.yandex.taxi.masstransit.trains.checkout.s;

/* loaded from: classes5.dex */
public final class wvq implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;

    public wvq(f2g f2gVar, f2g f2gVar2, xvf0 xvf0Var, d2g d2gVar, xvf0 xvf0Var2, f2g f2gVar3) {
        this.a = 11;
        this.e = f2gVar;
        this.f = f2gVar2;
        this.b = xvf0Var;
        this.c = d2gVar;
        this.d = xvf0Var2;
        this.g = f2gVar3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.f;
        xvf0 xvf0Var4 = this.g;
        xvf0 xvf0Var5 = this.e;
        xvf0 xvf0Var6 = this.d;
        switch (i) {
            case 0:
                return new b((a) xvf0Var.get(), (yrb) xvf0Var2.get(), (st2) ((wxf) xvf0Var4).get(), (ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.data.a) xvf0Var6.get(), (trb) xvf0Var5.get(), (flg) xvf0Var3.get());
            case 1:
                return new t2r((to3) xvf0Var.get(), (Executor) xvf0Var2.get(), (Looper) xvf0Var6.get(), (kzq) ((k0n) xvf0Var3).get(), (a1r) xvf0Var5.get(), (wwf) ((c9g) xvf0Var4).get());
            case 2:
                return new boj0((String) ((fxf) xvf0Var).get(), (cv8) ((fxf) xvf0Var2).get(), (tci) ((exf) xvf0Var6).get(), (l6s) ((cuo) xvf0Var5).get(), (p6s) ((dxf) xvf0Var3).get(), (f6s) ((exf) xvf0Var4).get(), 19);
            case 3:
                return new jgs((rgs) xvf0Var.get(), (h6j0) ((vfg0) xvf0Var4).get(), (z22) xvf0Var2.get(), (PayEnvironment) xvf0Var6.get(), (kgs) xvf0Var5.get(), (vif) xvf0Var3.get());
            case 4:
                return new f((Activity) xvf0Var.get(), (pdt) xvf0Var2.get(), (fft) xvf0Var6.get(), i5m.a(xvf0Var5), (c) ((njp) xvf0Var4).get(), (com.yandex.messaging.domain.personal.a) xvf0Var3.get());
            case 5:
                return new g((com.yandex.messaging.domain.personal.a) xvf0Var.get(), (kse) xvf0Var2.get(), (b7t) ((k0n) xvf0Var4).get(), (lqo) xvf0Var6.get(), (j) xvf0Var5.get(), (p4t) xvf0Var3.get());
            case 6:
                return new com.yandex.go.navigator.repository.c((mg50) ((tm40) xvf0Var2).get(), (zuj0) xvf0Var.get(), (o) ((j4g) xvf0Var6).get(), (uyd) ((j4g) xvf0Var5).get(), (com.yandex.go.navigator.domain.traffic_line.a) ((gpx0) xvf0Var3).get(), (vff) ((j4g) xvf0Var4).get());
            case 7:
                return new gdu((com.yandex.go.route.interactor.c) xvf0Var.get(), (hh4) xvf0Var2.get(), (jcx0) xvf0Var6.get(), (biv0) ((b1g) xvf0Var4).get(), (bdv0) xvf0Var5.get(), (xcv0) xvf0Var3.get());
            case 8:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.horizontal_stack.a((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text.b) ((a9i) xvf0Var).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.action_button.a) ((yc) xvf0Var2).get(), (ru.yandex.logistics.sdk.cargo_form.impl.pci_dss.payment_button.b) ((a9i) xvf0Var6).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a) ((v7p) xvf0Var5).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_input_field.a) ((p4) xvf0Var3).get(), (do6) ((kze) xvf0Var4).get());
            case 9:
                h3y a = i5m.a(xvf0Var5);
                uew uewVar = (uew) xvf0Var3.get();
                return new kew(this.b, (ViewGroup) xvf0Var2.get(), (flex.engine.a) xvf0Var6.get(), (vu) xvf0Var4, a, uewVar);
            case 10:
                return new IntercityDashboardFlexSdkView((Context) ((d2g) xvf0Var3).get(), (flex.engine.a) xvf0Var.get(), (h) xvf0Var2.get(), (oow) xvf0Var6.get(), (mdw) ((k1w) xvf0Var4).get(), (xdw) xvf0Var5.get());
            case 11:
                return new boj0((m0) ((f2g) xvf0Var5).get(), (z0a0) ((f2g) xvf0Var3).get(), this.b, (pdc) xvf0Var2.get(), (com.yandex.div.core.expression.variables.a) xvf0Var6.get(), (oep0) ((f2g) xvf0Var4).get());
            case 12:
                return new pmw(i5m.a(xvf0Var), this.c, (qmw) ((vu) xvf0Var6).get(), (wd7) ((e2g) xvf0Var5).get(), (p) ((n6o0) xvf0Var3).get(), (ah00) ((e2g) xvf0Var4).get());
            case 13:
                return new mly((tse) xvf0Var.get(), (com.yandex.go.superapp.order.multi.old.provider.g) ((zyf) xvf0Var2).get(), (n6w0) ((t4g) xvf0Var6).get(), (wjm) ((zyf) xvf0Var5).get(), (ru.yandex.taxi.linked_order.map.utils.a) ((k1w) xvf0Var3).get(), (ru.yandex.taxi.linked_order.focus.a) ((rut) xvf0Var4).get());
            case 14:
                return new cpy((tse) ((o2g) xvf0Var).get(), (tt2) ((o2g) xvf0Var2).get(), (olm) ((o2g) xvf0Var6).get(), (cv00) ((o2g) xvf0Var5).get(), (x4s0) ((o2g) xvf0Var3).get(), (t1s) ((hbn) xvf0Var4).get());
            case 15:
                return new xa00((e) ((e3u) xvf0Var4).get(), (AddressResolveRepository) xvf0Var.get(), (com.yandex.go.pin.repository.o) xvf0Var2.get(), (uze0) xvf0Var6.get(), (eco) xvf0Var5.get(), (p2c0) xvf0Var3.get());
            case 16:
                return new boj0((h410) xvf0Var6.get(), (Context) xvf0Var.get(), (w030) xvf0Var2.get(), (x830) ((ibz0) xvf0Var5).get(), (ru.yandex.taxi.masstransit.domain.h) ((f3g) xvf0Var3).get(), (b7z0) ((g3g) xvf0Var4).get(), 22);
            case 17:
                return new h610((tj60) xvf0Var.get(), (ru.yandex.taxi.banners.c) xvf0Var2.get(), (Context) ((t0g) xvf0Var4).get(), (pav) xvf0Var6.get(), (i610) xvf0Var5.get(), (s0r0) xvf0Var3.get());
            case 18:
                return new com.ybsdk.feature.merchant.offers.internal.data.a((MerchantOffersApi) ((jl00) xvf0Var2).get(), (com.ybsdk.common.b) ((u2g) xvf0Var6).get(), (com.ybsdk.feature.merchant.offers.internal.data.network.a) xvf0Var.get(), (tvv) ((u2g) xvf0Var5).get(), (com.ybsdk.common.a) ((u2g) xvf0Var3).get(), (y1r0) ((j3g) xvf0Var4).get());
            case 19:
                return new qh20((hbz0) xvf0Var.get(), (r8g) ((f8g) xvf0Var4).get(), (kse) xvf0Var2.get(), (x22) xvf0Var6.get(), (ChatInputHeightState) xvf0Var5.get(), (com.yandex.messaging.input.util.c) xvf0Var3.get());
            case 20:
                return new xh20((dv8) ((fxf) xvf0Var).get(), (ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.c) ((f2b) xvf0Var2).get(), (u1n) ((k0n) xvf0Var6).get(), (b6s) ((n3w) xvf0Var5).a, (st2) ((exf) xvf0Var3).get(), (m2v) ((js0) xvf0Var4).get());
            case 21:
                return new ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.c((xl10) ((jl00) xvf0Var3).get(), (gzh) xvf0Var.get(), (w3i) ((bo2) xvf0Var4).get(), (x230) xvf0Var2.get(), (com.yandex.delivery.utils.storage.impl.c) xvf0Var6.get(), (st2) xvf0Var5.get());
            case 22:
                return new g0((g211) ((gpx0) xvf0Var2).get(), (bt00) ((u3g) xvf0Var6).get(), (ru.yandex.taxi.masstransit.datasource.routing.f) xvf0Var.get(), (ru.yandex.taxi.masstransit.sourceaddress.c) ((rct0) xvf0Var5).get(), (cyx) ((u3g) xvf0Var3).get(), (fif) ((u3g) xvf0Var4).get());
            case 23:
                return new ru.yandex.taxi.masstransit.overlay.routes.a((ay30) ((nt0) xvf0Var2).get(), (ah00) xvf0Var.get(), (b2l0) ((v3g) xvf0Var6).get(), (gw30) ((i020) xvf0Var5).get(), (uo21) ((w3g) xvf0Var3).get(), (y9x0) ((w3g) xvf0Var4).get());
            case 24:
                return new k540((h540) xvf0Var.get(), (wiq0) ((v3g) xvf0Var6).get(), i5m.a((mvy) xvf0Var5), i5m.a((w3g) xvf0Var3), i5m.a((u3g) xvf0Var4), (b040) xvf0Var2.get());
            case 25:
                return new s((Context) xvf0Var.get(), (k7x0) ((y3g) xvf0Var6).get(), (ru.yandex.taxi.widget.c) xvf0Var2.get(), i5m.a((r3g) xvf0Var5), i5m.a((r3g) xvf0Var3), (ea40) ((x0z) xvf0Var4).get());
            case 26:
                return new com.yandex.go.tariffcard.ui.b(i5m.a((w0g) xvf0Var3), (mqv0) xvf0Var.get(), i5m.a(xvf0Var2), i5m.a(xvf0Var6), (com.yandex.go.tariffcard.interactor.f) xvf0Var5.get(), (Context) ((t0g) xvf0Var4).get());
            case 27:
                return new d((Context) xvf0Var.get(), (p150) xvf0Var2.get(), (o1b0) xvf0Var6.get(), (uz10) xvf0Var5.get(), (f6b) xvf0Var3.get(), (y4t) ((k0n) xvf0Var4).get());
            case 28:
                return new z370((hk3) xvf0Var.get(), (hsb) xvf0Var2.get(), (fke) xvf0Var6.get(), (DefaultEnvironment) ((twf) xvf0Var5).get(), ((twf) xvf0Var3).b.b(), (Region) ((twf) xvf0Var4).get());
            default:
                return new i((p2y0) xvf0Var.get(), (com.yandex.go.taxi.order.repositories.c) xvf0Var2.get(), (ysg) xvf0Var6.get(), (tt2) xvf0Var5.get(), (ufb) ((dx9) xvf0Var4).get(), (ru.yandex.taxi.styling.c) xvf0Var3.get());
        }
    }

    public /* synthetic */ wvq(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i, byte b) {
        this.a = i;
        this.c = v7pVar;
        this.d = xvf0Var;
        this.b = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
    }

    public /* synthetic */ wvq(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i, boolean z) {
        this.a = i;
        this.c = v7pVar;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
    }

    public /* synthetic */ wvq(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.g = v7pVar;
        this.f = xvf0Var5;
    }

    public /* synthetic */ wvq(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, xvf0 xvf0Var5, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.g = xvf0Var4;
        this.e = v7pVar;
        this.f = xvf0Var5;
    }

    public /* synthetic */ wvq(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.g = xvf0Var3;
        this.d = xvf0Var4;
        this.e = xvf0Var5;
        this.f = xvf0Var6;
    }

    public /* synthetic */ wvq(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    public wvq(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, k0n k0nVar, xvf0 xvf0Var4, c9g c9gVar) {
        this.a = 1;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.f = k0nVar;
        this.e = xvf0Var4;
        this.g = c9gVar;
    }

    public /* synthetic */ wvq(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = v7pVar;
        this.g = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public wvq(e3u e3uVar, n3w n3wVar, gb0 gb0Var, xvf0 xvf0Var, kgn kgnVar, xvf0 xvf0Var2) {
        this.a = 15;
        this.g = e3uVar;
        this.b = n3wVar;
        this.c = gb0Var;
        this.d = xvf0Var;
        this.e = kgnVar;
        this.f = xvf0Var2;
    }

    public wvq(jl00 jl00Var, xvf0 xvf0Var, bo2 bo2Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = 21;
        this.f = jl00Var;
        this.b = xvf0Var;
        this.g = bo2Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public wvq(xvf0 xvf0Var, y3g y3gVar, xvf0 xvf0Var2, r3g r3gVar, r3g r3gVar2, x0z x0zVar) {
        this.a = 25;
        this.b = xvf0Var;
        this.d = y3gVar;
        this.c = xvf0Var2;
        this.e = r3gVar;
        this.f = r3gVar2;
        this.g = x0zVar;
    }

    public wvq(xvf0 xvf0Var, v3g v3gVar, mvy mvyVar, w3g w3gVar, u3g u3gVar, xvf0 xvf0Var2) {
        this.a = 24;
        this.b = xvf0Var;
        this.d = v3gVar;
        this.e = mvyVar;
        this.f = w3gVar;
        this.g = u3gVar;
        this.c = xvf0Var2;
    }

    public wvq(w0g w0gVar, b1g b1gVar, epf epfVar, lq40 lq40Var, ys10 ys10Var, t0g t0gVar) {
        this.a = 26;
        this.f = w0gVar;
        this.b = b1gVar;
        this.c = epfVar;
        this.d = lq40Var;
        this.e = ys10Var;
        this.g = t0gVar;
    }

    public wvq(d2g d2gVar, xvf0 xvf0Var, k4a k4aVar, f2g f2gVar, k1w k1wVar, n3w n3wVar) {
        this.a = 10;
        this.f = d2gVar;
        this.b = xvf0Var;
        this.c = k4aVar;
        this.d = f2gVar;
        this.g = k1wVar;
        this.e = n3wVar;
    }

    public wvq(b3g b3gVar, f3g f3gVar, ibz0 ibz0Var, f3g f3gVar2, g3g g3gVar, f3g f3gVar3) {
        this.a = 16;
        this.b = b3gVar;
        this.c = f3gVar;
        this.e = ibz0Var;
        this.f = f3gVar2;
        this.g = g3gVar;
        this.d = f3gVar3;
    }
}
