package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.yandex.go.chargers.passes.data.r0;
import com.yandex.go.chargers.passes.payment_settings.d;
import com.yandex.go.navigator.domain.o;
import com.yandex.go.navigator.main_screen.f;
import com.yandex.go.route.interactor.b;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import com.yandex.messaging.internal.view.input.selection.SelectedMessagesPanel;
import com.ybsdk.common.e;
import com.ybsdk.di.modules.features.CardFeatureModule;
import com.ybsdk.network.Api;
import ru.yandex.taxi.preorder.source.domain.a;
import ru.yandex.taxi.preorder.suggested.i;
import ru.yandex.taxi.preorder.summary.solid.interactors.g;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;
import ru.yandex.taxi.widget.c;

/* loaded from: classes15.dex */
public final class zo0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;

    public zo0(CardFeatureModule cardFeatureModule, xvf0 xvf0Var, xvf0 xvf0Var2, eqh eqhVar, xvf0 xvf0Var3, xvf0 xvf0Var4, u800 u800Var) {
        this.a = 2;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = eqhVar;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = u800Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.g;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.c;
        xvf0 xvf0Var5 = this.f;
        xvf0 xvf0Var6 = this.b;
        switch (i) {
            case 0:
                return new g((wiq0) xvf0Var6.get(), (b) xvf0Var4.get(), (a) xvf0Var3.get(), (tt2) xvf0Var2.get(), (RequirementsChangedNotifier) xvf0Var5.get(), (yiq0) xvf0Var.get());
            case 1:
                return new yi3((Looper) xvf0Var6.get(), (SharedPreferences) xvf0Var4.get(), i5m.a(xvf0Var3), (qti0) xvf0Var2.get(), (x22) xvf0Var5.get(), (SharedPreferences) xvf0Var.get());
            case 2:
                return new com.ybsdk.common.repositiories.card.b((Api) xvf0Var6.get(), (nbp0) xvf0Var4.get(), (e) xvf0Var3.get(), (gff) xvf0Var5.get(), (k03) xvf0Var2.get(), (com.ybsdk.utils.poller.b) xvf0Var.get());
            case 3:
                return new lj9((w030) xvf0Var6.get(), this.c, this.d, (mp9) xvf0Var2.get(), (aq9) xvf0Var5.get(), this.g);
            case 4:
                return new com.yandex.go.chargers.debt.notification.domain.a((em9) xvf0Var6.get(), (xdf) xvf0Var4.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (bq9) xvf0Var2.get(), (dq9) xvf0Var5.get(), (vp9) xvf0Var.get());
            case 5:
                return new d((r0) xvf0Var6.get(), (qka) xvf0Var4.get(), (rja) xvf0Var3.get(), this.e, (fha) xvf0Var5.get(), (kha) xvf0Var.get());
            case 6:
                return new k1b((pk3) xvf0Var6.get(), (jn3) xvf0Var4.get(), (oo90) xvf0Var3.get(), (zm90) xvf0Var2.get(), (gcf) xvf0Var5.get(), (sfl0) xvf0Var.get());
            case 7:
                return new s3b((Activity) xvf0Var6.get(), (pu31) xvf0Var4.get(), (SelectedMessagesPanel) xvf0Var3.get(), (h9x) xvf0Var2.get(), (ChatInputHeightState) xvf0Var5.get(), (rj21) xvf0Var.get());
            case 8:
                j1w j1wVar = (j1w) xvf0Var6.get();
                return new InputTextController(j1wVar.x, (tmt0) xvf0Var4.get(), (q0w) xvf0Var3.get(), (x4k0) xvf0Var2.get(), (noy0) xvf0Var5.get(), (lqo) xvf0Var.get());
            case 9:
                return new c8b((kse) xvf0Var6.get(), (k020) xvf0Var4.get(), (to3) xvf0Var3.get(), (o1b0) xvf0Var2.get(), (eil0) xvf0Var5.get(), (at2) xvf0Var.get());
            case 10:
                return new hdb((Looper) xvf0Var6.get(), (o1b0) xvf0Var4.get(), (n5t0) xvf0Var3.get(), (y221) xvf0Var2.get(), (xw50) xvf0Var5.get(), (at2) xvf0Var.get());
            case 11:
                return new com.yandex.messaging.miniapps.js.listeners.a((ChatRequest) xvf0Var6.get(), (com.yandex.messaging.domain.botrequest.e) xvf0Var4.get(), (oh20) xvf0Var3.get(), (th20) xvf0Var2.get(), (sh20) xvf0Var5.get(), (x22) xvf0Var.get());
            case 12:
                return new qzc((ysg) xvf0Var6.get(), (y180) xvf0Var4.get(), (g2y0) xvf0Var3.get(), (ufz0) xvf0Var2.get(), (ci70) xvf0Var5.get(), (d2y0) xvf0Var.get());
            case 13:
                return new n5e((a5e) xvf0Var6.get(), (Looper) xvf0Var4.get(), (xw50) xvf0Var3.get(), (wff0) xvf0Var2.get(), (o5e) xvf0Var5.get(), (doc) xvf0Var.get());
            case 14:
                return new iif((ocz0) xvf0Var6.get(), (uu10) xvf0Var4.get(), (ui20) xvf0Var3.get(), (s320) xvf0Var2.get(), (lqo) xvf0Var5.get(), (wk31) xvf0Var.get());
            case 15:
                return new ru.yandex.taxi.preorder.map.interactor.a((Context) xvf0Var6.get(), (tt2) xvf0Var4.get(), (wiq0) xvf0Var3.get(), (uze0) xvf0Var2.get(), (bzi) xvf0Var5.get(), (wyi) xvf0Var.get());
            case 16:
                return new com.yandex.go.taxi.order.details.v1.elements.driver.b((gs70) xvf0Var6.get(), (gic) xvf0Var4.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (zuj0) xvf0Var2.get(), (tt2) xvf0Var5.get(), (Context) xvf0Var.get());
            case 17:
                return new z4j((x980) xvf0Var6.get(), (pdc) xvf0Var4.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (c) xvf0Var2.get(), (p4j) xvf0Var5.get(), (xdf) xvf0Var.get());
            case 18:
                return new ru.yandex.taxi.share_favorites.experiments.c((rqo) xvf0Var6.get(), (oep0) xvf0Var4.get(), (com.yandex.go.navigation.screen.c) xvf0Var3.get(), (s0t) xvf0Var2.get(), (ru.yandex.taxi.e) xvf0Var5.get(), this.g);
            case 19:
                return new w4t((com.yandex.messaging.internal.authorized.chat.b) xvf0Var6.get(), (k020) xvf0Var4.get(), (kse) xvf0Var3.get(), (sb7) xvf0Var2.get(), i5m.a(xvf0Var5), (p4t) xvf0Var.get());
            case 20:
                return new com.yandex.messaging.domain.statuses.e((pdt) xvf0Var6.get(), (com.yandex.messaging.domain.statuses.c) xvf0Var4.get(), (com.yandex.messaging.domain.personal.a) xvf0Var3.get(), (rft) xvf0Var2.get(), (kse) xvf0Var5.get(), (w3c) xvf0Var.get());
            case 21:
                return new vgu((Looper) xvf0Var6.get(), (to3) xvf0Var4.get(), (k020) xvf0Var3.get(), (at2) xvf0Var2.get(), (ouf0) xvf0Var5.get(), (wff0) xvf0Var.get());
            case 22:
                return new com.ybsdk.screens.initial.e((wdp0) xvf0Var6.get(), (j3h) xvf0Var4.get(), (u470) xvf0Var3.get(), (xra0) xvf0Var2.get(), (tfl0) xvf0Var5.get(), (com.ybsdk.common.repositiories.user.a) xvf0Var.get());
            case 23:
                return new xmw((w030) xvf0Var6.get(), (ufb0) xvf0Var4.get(), (b9w) xvf0Var3.get(), (uow) xvf0Var2.get(), (d9w) xvf0Var5.get(), (oep0) xvf0Var.get());
            case 24:
                return new boj0((k3c) xvf0Var6.get(), (tj60) xvf0Var4.get(), (fjz) xvf0Var3.get(), (jj10) xvf0Var2.get(), (Context) xvf0Var5.get(), (ru.yandex.taxi.design.utils.a) xvf0Var.get());
            case 25:
                return new f((com.yandex.go.navigator.utils.d) xvf0Var6.get(), (mg50) xvf0Var4.get(), (re50) xvf0Var3.get(), (tt2) xvf0Var2.get(), (i) xvf0Var5.get(), (com.yandex.go.navigator.main_screen.experiement.e) xvf0Var.get());
            case 26:
                return new zb00((com.yandex.go.navigator.a) xvf0Var6.get(), (ah00) xvf0Var4.get(), (o) xvf0Var3.get(), (com.yandex.go.navigator.domain.e) xvf0Var2.get(), (com.yandex.go.navigator.repository.o) xvf0Var5.get(), (com.yandex.go.navigator.analitycs.a) xvf0Var.get());
            case 27:
                return new ru.yandex.taxi.masstransit.main.ui.header.a((dz00) xvf0Var6.get(), (tt2) xvf0Var4.get(), (zuj0) xvf0Var3.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var2.get(), (tu30) xvf0Var5.get(), (pwy0) xvf0Var.get());
            case 28:
                return new yq40((ah00) xvf0Var6.get(), i5m.a(xvf0Var4), (tit0) xvf0Var3.get(), (net0) xvf0Var2.get(), (xvw) xvf0Var5.get(), (ber) xvf0Var.get());
            default:
                return new com.yandex.messaging.miniapps.js.listeners.c((ChatRequest) xvf0Var6.get(), (com.yandex.messaging.domain.botrequest.e) xvf0Var4.get(), (oh20) xvf0Var3.get(), (th20) xvf0Var2.get(), (sh20) xvf0Var5.get(), (x22) xvf0Var.get());
        }
    }

    public /* synthetic */ zo0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }
}
