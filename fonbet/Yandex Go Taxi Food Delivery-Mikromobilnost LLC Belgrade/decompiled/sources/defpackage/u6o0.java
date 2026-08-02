package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.go.information.data.InformationApi;
import com.yandex.go.information.domain.j;
import com.yandex.go.scooters.parking.b;
import com.yandex.go.scooters.passes.purchase.packages.i;
import com.yandex.go.scooters.payments.domain.a;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.sync.f;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import java.util.Map;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.hints.interactors.c;
import ru.yandex.taxi.net.taxi.TaxiApi;
import ru.yandex.taxi.scooters.domain.n;
import ru.yandex.taxi.summary.requirements.list.interactors.l0;
import ru.yandex.taxi.summary.solid.preview_card.interactor.d;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class u6o0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;

    public u6o0(rwh rwhVar, xvf0 xvf0Var, xvf0 xvf0Var2, bpf bpfVar, fy30 fy30Var, epf epfVar) {
        this.a = 11;
        this.d = rwhVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = bpfVar;
        this.f = fy30Var;
        this.g = epfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.g;
        xvf0 xvf0Var2 = this.f;
        xvf0 xvf0Var3 = this.e;
        xvf0 xvf0Var4 = this.d;
        xvf0 xvf0Var5 = this.c;
        xvf0 xvf0Var6 = this.b;
        switch (i) {
            case 0:
                return new n((y50) xvf0Var6.get(), (f1n0) xvf0Var5.get(), (oep0) xvf0Var4.get(), (g) xvf0Var3.get(), (c1n0) xvf0Var2.get(), (vu) xvf0Var);
            case 1:
                return new q8o0((tt2) ((e7g) xvf0Var3).get(), (pwy0) xvf0Var6.get(), (i) ((pmn0) xvf0Var2).get(), (a) xvf0Var5.get(), (ufo0) xvf0Var4.get(), (d3a) ((bwn0) xvf0Var).get());
            case 2:
                return new b((Context) xvf0Var6.get(), (w030) xvf0Var5.get(), (dqt) ((j7g) xvf0Var4).get(), (fco0) ((gzn0) xvf0Var3).get(), (pgk0) ((z1n0) xvf0Var2).get(), (nbo0) ((mbo0) xvf0Var).get());
            case 3:
                return new vmn0((Context) xvf0Var6.get(), (fva0) xvf0Var5.get(), (n5o0) xvf0Var4.get(), (vr) ((mbo0) xvf0Var3).get(), (hjo0) ((n3w) xvf0Var2).a, (s6k0) ((k9c) xvf0Var).get());
            case 4:
                return new ihp0((zuj0) xvf0Var6.get(), (ypj0) xvf0Var5.get(), (wpj0) xvf0Var4.get(), (cux) xvf0Var3.get(), (ldv0) xvf0Var2.get(), (com.yandex.go.tariffcard.experiment.n) ((q02) xvf0Var).get());
            case 5:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.segment.b((u3s) ((n3w) xvf0Var6).a, (p6s) ((p1g) xvf0Var5).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.segment.a) ((kze) xvf0Var4).get(), (hwy0) ((gxf) xvf0Var3).get(), (fhu) ((gxf) xvf0Var2).get(), (sae) ((srb) xvf0Var).get());
            case 6:
                return new f((com.yandex.messaging.internal.authorized.sync.g) xvf0Var6.get(), (qtq0) ((zs0) xvf0Var).get(), (k020) xvf0Var5.get(), (jse) xvf0Var4.get(), (h9b) xvf0Var3.get(), (ks10) xvf0Var2.get());
            case 7:
                return new j((InformationApi) ((h1t) xvf0Var6).get(), (tt2) ((q1g) xvf0Var5).get(), i5m.a((d2g) xvf0Var4), (ru.yandex.taxi.deeplinks.f) ((q1g) xvf0Var3).get(), (o3h) ((q1g) xvf0Var2).get(), (xl51) ((d2g) xvf0Var).get());
            case 8:
                return new com.ybsdk.feature.settings.internal.screens.settings.domain.a((x7r0) ((o9g) xvf0Var6).get(), (com.ybsdk.feature.settings.internal.data.b) ((m7q0) xvf0Var5).get(), (l04) ((elo0) xvf0Var4).get(), (pgk0) ((o9g) xvf0Var3).get(), (krl0) ((g7g) xvf0Var2).get(), (d7g0) ((o9g) xvf0Var).get());
            case 9:
                return new ru.yandex.taxi.favorites.rides.settings_modal.domain.b((Context) ((p9g) xvf0Var5).get(), (irs0) ((p9g) xvf0Var4).get(), (t9r0) xvf0Var6.get(), (jgv) ((p9g) xvf0Var3).get(), (e) ((p9g) xvf0Var2).get(), (tt2) ((p9g) xvf0Var).get());
            case 10:
                return new uio0(((w2g) xvf0Var5).b.S(), ((x2g) xvf0Var4).b.i(), ((w2g) xvf0Var3).b.e0(), ((w2g) xvf0Var2).b.W(), ((x2g) xvf0Var).b.s0(), (z2s0) xvf0Var6.get());
            case 11:
                return new vmn0((ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.a) ((rwh) xvf0Var4).get(), (wiq0) xvf0Var6.get(), (v7r) xvf0Var5.get(), (apf) ((bpf) xvf0Var3).get(), (w040) ((fy30) xvf0Var2).get(), (j4n) ((epf) xvf0Var).get());
            case 12:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slider_button.b((u3s) ((n3w) xvf0Var6).a, (hwy0) ((gxf) xvf0Var5).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slider_button.a) ((qy8) xvf0Var4).get(), (sae) ((srb) xvf0Var3).get(), (z4s) ((p1g) xvf0Var2).get(), (s5s) ((p1g) xvf0Var).get());
            case 13:
                return new vgt0((Context) xvf0Var6.get(), (xm00) xvf0Var5.get(), (vgf) xvf0Var4.get(), (ygt0) ((m580) xvf0Var).get(), (ah00) xvf0Var3.get(), (no21) xvf0Var2.get());
            case 14:
                return new kpw0((w030) xvf0Var6.get(), (Context) xvf0Var5.get(), (wot0) ((n3w) xvf0Var3).a, (f580) xvf0Var4.get(), (xg) ((p6g) xvf0Var2).get(), (fva0) ((p6g) xvf0Var).get(), 1);
            case 15:
                return new com.yandex.messaging.internal.view.stickers.panel.a((Activity) xvf0Var6.get(), i5m.a(xvf0Var5), (SharedPreferences) xvf0Var4.get(), (com.yandex.messaging.internal.storage.stickers.b) ((f9t) xvf0Var2).get(), (mae0) xvf0Var3.get(), (r4z) ((ret) xvf0Var).get());
            case 16:
                return new ru.yandex.taxi.summary.solid.preview_card.interactor.a((i130) xvf0Var6.get(), (gev0) xvf0Var5.get(), (d) xvf0Var4.get(), (ru.yandex.taxi.summary.solid.preview_card.di.a) ((rx4) xvf0Var).get(), (tt2) xvf0Var3.get(), (tse) xvf0Var2.get());
            case 17:
                return new tov0((c) ((iv0) xvf0Var4).get(), (wae0) ((g680) xvf0Var3).get(), (com.yandex.go.route.interactor.c) xvf0Var6.get(), (yjt0) ((l9t0) xvf0Var2).get(), (p0j) ((oti) xvf0Var).get(), (pdc) xvf0Var5.get());
            case 18:
                return new com.yandex.go.taxi.order.support.data.repositories.a((o2y0) ((n3w) xvf0Var5).a, (tt2) ((qag) xvf0Var4).get(), (com.yandex.go.taxi.order.support.data.mappers.b) ((uzu0) xvf0Var3).get(), (pav) xvf0Var6.get(), (pwy0) ((qag) xvf0Var2).get(), (k7x0) ((qag) xvf0Var).get());
            case 19:
                return new dkx0((fva0) xvf0Var6.get(), (arv0) xvf0Var5.get(), (xcv0) xvf0Var4.get(), (wiq0) ((w0g) xvf0Var2).get(), (ubx0) xvf0Var3.get(), (x770) ((rbx0) xvf0Var).get());
            case 20:
                return new l0((roj0) xvf0Var6.get(), (tt2) xvf0Var5.get(), (ru.yandex.taxi.summary.requirements.list.mapper.b) ((fat0) xvf0Var).get(), (ru.yandex.taxi.summary.requirements.list.recycler.i) xvf0Var4.get(), (pwy0) xvf0Var3.get(), (vfx0) xvf0Var2.get());
            case 21:
                return new com.yandex.go.taxi.order.chat.navigation.a((qg60) xvf0Var2, (oep0) xvf0Var6.get(), (s350) xvf0Var5.get(), (com.yandex.go.taxi.order.chat.experiments.b) xvf0Var4.get(), (com.yandex.go.taxi.order.chat.web_preloading.b) ((z7y0) xvf0Var).get(), (tt2) xvf0Var3.get());
            case 22:
                return new com.yandex.go.taxi.order.net.tracker.e((tt2) ((f4g) xvf0Var3).get(), (String) xvf0Var6.get(), (TaxiApi) ((dag) xvf0Var2).get(), (ru.yandex.taxi.launch.c) xvf0Var5.get(), (ru.yandex.taxi.net.tracker.analytics.a) xvf0Var4.get(), (bay0) ((n2y0) xvf0Var).get());
            case 23:
                return new com.yandex.messaging.internal.view.chat.input.textsuggest.a((Activity) xvf0Var6.get(), (qet) xvf0Var5.get(), (com.yandex.messaging.internal.view.chat.input.textsuggest.b) xvf0Var4.get(), (kty0) ((sit0) xvf0Var).get(), (ChatInputHeightState) xvf0Var3.get(), (com.yandex.messaging.internal.view.chat.input.textsuggest.d) xvf0Var2.get());
            case 24:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.timeline.b((ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((mzf) xvf0Var6).get(), (hwy0) ((ibg) xvf0Var5).get(), (cjw0) ((gpx0) xvf0Var4).get(), (mj31) ((sk21) xvf0Var3).get(), (kcz0) ((flx0) xvf0Var2).get(), (j00) ((nb11) xvf0Var).get());
            case 25:
                return new ykz0((c4r0) xvf0Var6.get(), (wiq0) ((w0g) xvf0Var2).get(), (b8r) xvf0Var5.get(), (y1s) xvf0Var4.get(), (com.yandex.go.taxi.tariffs.interactor.a) xvf0Var3.get(), (axm) ((u0g) xvf0Var).get());
            case 26:
                wiq0 wiq0Var = (wiq0) ((w0g) xvf0Var2).get();
                h3y a = i5m.a(xvf0Var6);
                opz0 opz0Var = (opz0) xvf0Var5.get();
                irz0 irz0Var = (irz0) xvf0Var4.get();
                arz0 arz0Var = (arz0) xvf0Var3.get();
                ((w0g) xvf0Var).get();
                return new ppz0(wiq0Var, a, opz0Var, irz0Var, arz0Var);
            case 27:
                return new com.yandex.messaging.ui.toolbar.a((Activity) xvf0Var6.get(), (sfl0) xvf0Var5.get(), (v5t) ((c0j) xvf0Var).get(), (ChatRequest) xvf0Var4.get(), (com.yandex.messaging.ui.timeline.b) xvf0Var3.get(), (lqo) xvf0Var2.get());
            case 28:
                return new com.yandex.go.transfer_requirement.state.a((com.yandex.go.transfer_requirement.state.done_button.a) ((oti) xvf0Var6).get(), (com.yandex.go.transfer_requirement.state.rules.a) ((gh10) xvf0Var5).get(), (com.yandex.go.transfer_requirement.state.service_section.a) ((gh10) xvf0Var4).get(), (com.yandex.go.transfer_requirement.state.meeting.a) ((gh10) xvf0Var3).get(), (zh01) ((flx0) xvf0Var2).get(), (ulx0) ((qcz0) xvf0Var).get());
            default:
                return new u111((ahr) xvf0Var6.get(), (Map) xvf0Var5.get(), (rwo) xvf0Var4.get(), (yb8) xvf0Var3.get(), (OkHttpClient) xvf0Var2.get(), (String) ((njp) xvf0Var).get());
        }
    }

    public /* synthetic */ u6o0(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.g = v7pVar;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public /* synthetic */ u6o0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.g = v7pVar;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public /* synthetic */ u6o0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, v7p v7pVar, int i) {
        this.a = i;
        this.e = xvf0Var;
        this.b = xvf0Var2;
        this.f = xvf0Var3;
        this.c = xvf0Var4;
        this.d = xvf0Var5;
        this.g = v7pVar;
    }

    public /* synthetic */ u6o0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    public /* synthetic */ u6o0(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.f = xvf0Var4;
        this.e = xvf0Var5;
        this.g = v7pVar;
    }

    public u6o0(iv0 iv0Var, g680 g680Var, b1g b1gVar, l9t0 l9t0Var, oti otiVar, a1g a1gVar) {
        this.a = 17;
        this.d = iv0Var;
        this.e = g680Var;
        this.b = b1gVar;
        this.f = l9t0Var;
        this.g = otiVar;
        this.c = a1gVar;
    }

    public u6o0(p9g p9gVar, p9g p9gVar2, xvf0 xvf0Var, p9g p9gVar3, p9g p9gVar4, p9g p9gVar5) {
        this.a = 9;
        this.c = p9gVar;
        this.d = p9gVar2;
        this.b = xvf0Var;
        this.e = p9gVar3;
        this.f = p9gVar4;
        this.g = p9gVar5;
    }

    public u6o0(eqh eqhVar, zs0 zs0Var, eqh eqhVar2, w7y0 w7y0Var, eqh eqhVar3, xvf0 xvf0Var) {
        this.a = 6;
        this.b = eqhVar;
        this.g = zs0Var;
        this.c = eqhVar2;
        this.d = w7y0Var;
        this.e = eqhVar3;
        this.f = xvf0Var;
    }

    public u6o0(n3w n3wVar, qag qagVar, uzu0 uzu0Var, xvf0 xvf0Var, qag qagVar2, qag qagVar3) {
        this.a = 18;
        this.c = n3wVar;
        this.d = qagVar;
        this.e = uzu0Var;
        this.b = xvf0Var;
        this.f = qagVar2;
        this.g = qagVar3;
    }

    public u6o0(qg60 qg60Var, eqh eqhVar, dt00 dt00Var, x7y0 x7y0Var, z7y0 z7y0Var, xvf0 xvf0Var) {
        this.a = 21;
        this.f = qg60Var;
        this.b = eqhVar;
        this.c = dt00Var;
        this.d = x7y0Var;
        this.g = z7y0Var;
        this.e = xvf0Var;
    }

    public u6o0(w0g w0gVar, x0g x0gVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, w0g w0gVar2) {
        this.a = 26;
        this.f = w0gVar;
        this.b = x0gVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.g = w0gVar2;
    }

    public u6o0(a1g a1gVar, w0g w0gVar, u0g u0gVar, u0g u0gVar2, g0g g0gVar, u0g u0gVar3) {
        this.a = 25;
        this.b = a1gVar;
        this.f = w0gVar;
        this.c = u0gVar;
        this.d = u0gVar2;
        this.e = g0gVar;
        this.g = u0gVar3;
    }

    public u6o0(w2g w2gVar, x2g x2gVar, w2g w2gVar2, w2g w2gVar3, x2g x2gVar2, xvf0 xvf0Var) {
        this.a = 10;
        this.c = w2gVar;
        this.d = x2gVar;
        this.e = w2gVar2;
        this.f = w2gVar3;
        this.g = x2gVar2;
        this.b = xvf0Var;
    }

    public u6o0(p6g p6gVar, p6g p6gVar2, n3w n3wVar, p6g p6gVar3, p6g p6gVar4, p6g p6gVar5) {
        this.a = 14;
        this.b = p6gVar;
        this.c = p6gVar2;
        this.e = n3wVar;
        this.d = p6gVar3;
        this.f = p6gVar4;
        this.g = p6gVar5;
    }
}
