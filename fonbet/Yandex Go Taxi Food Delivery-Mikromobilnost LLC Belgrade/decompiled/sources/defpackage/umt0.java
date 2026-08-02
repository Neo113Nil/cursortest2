package defpackage;

import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.chargers.payments.domain.c;
import com.yandex.go.feedback_common.data.FeedbackApi;
import com.yandex.go.payments.domain.i0;
import com.yandex.go.payments.domain.k0;
import com.yandex.go.payments.summary.domain.d;
import com.yandex.go.scooters.domain.i;
import com.yandex.go.splash.data.a;
import com.yandex.go.taxi.order.infosharing.data.TaxiOrderSharingApi;
import com.yandex.messaging.domain.user.b;
import com.yandex.messenger.websdk.api.WebChromeClientConfig;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.cashback.router.f;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.yaplus.e;

/* loaded from: classes8.dex */
public final class umt0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public umt0(kpp0 kpp0Var, xvf0 xvf0Var, qii qiiVar, xvf0 xvf0Var2) {
        this.a = 3;
        this.d = kpp0Var;
        this.b = xvf0Var;
        this.e = qiiVar;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        xvf0 xvf0Var4 = this.e;
        switch (i) {
            case 0:
                return new tmt0((Context) xvf0Var3.get(), (yef0) xvf0Var2.get(), (ya6) xvf0Var.get(), (b) ((alm) xvf0Var4).get());
            case 1:
                return new a((tse) xvf0Var3.get(), i5m.a(xvf0Var2), i5m.a((kxl0) xvf0Var), i5m.a((w10) xvf0Var4));
            case 2:
                return new ru.yandex.taxi.perf.analytics.storage.b((tse) xvf0Var3.get(), (tt2) xvf0Var2.get(), (ru.yandex.taxi.perf.analytics.storage.a) ((w10) xvf0Var).get(), (zbj) ((t6i) xvf0Var4).get());
            case 3:
                return new viv0((dmq0) ((kpp0) xvf0Var).get(), (arv0) xvf0Var3.get(), (dy6) ((qii) xvf0Var4).get(), (rqo) xvf0Var2.get());
            case 4:
                return new d((k0) xvf0Var3.get(), (com.yandex.go.payments.summary.domain.a) ((m5v0) xvf0Var4).get(), (i0) xvf0Var2.get(), (lw90) xvf0Var.get());
            case 5:
                return new com.yandex.go.mainscreen.superapp.impl.header.presentation.header.routing.a((gv0) xvf0Var3.get(), (n4j0) xvf0Var, (rqo) xvf0Var2.get(), (w6v0) ((yvr0) xvf0Var4).get());
            case 6:
                return new com.yandex.go.suggest.impl.data.flex.document.d((com.yandex.go.flex.main_screen.api.query.a) ((lag) xvf0Var2).get(), (swp0) xvf0Var3.get(), (zvv) ((n3w) xvf0Var).a, (f8v0) ((n3w) xvf0Var4).a);
            case 7:
                return new com.yandex.go.suggest.impl.data.flex.variables.b((com.yandex.div.core.expression.variables.a) xvf0Var3.get(), (dfw0) xvf0Var2.get(), (tse) ((n3w) xvf0Var).a, (tt2) ((lag) xvf0Var4).get());
            case 8:
                return new yax0((eqe) xvf0Var3.get(), (qex0) ((umt0) xvf0Var).get(), (jgv) xvf0Var2.get(), (sze0) ((xyd0) xvf0Var4).get());
            case 9:
                return new qex0((jgv) xvf0Var3.get(), (fwq0) ((n4j0) xvf0Var4).get(), (cti) xvf0Var2.get(), (pmw0) xvf0Var.get());
            case 10:
                return new xjx0((jgv) xvf0Var3.get(), (cti) xvf0Var2.get(), (sze0) ((xyd0) xvf0Var4).get(), (bco) xvf0Var.get());
            case 11:
                return new unx0((yyq0) xvf0Var3.get(), (xcv0) xvf0Var2.get(), (o7r0) ((abx0) xvf0Var).get(), (spb0) ((i0b0) xvf0Var4).get());
            case 12:
                return new oux0((cba0) xvf0Var3.get(), (alc0) xvf0Var2.get(), (c) xvf0Var.get(), (i) ((kxa0) xvf0Var4).get());
            case 13:
                return new com.yandex.go.taxi.order.infosharing.data.a((tse) xvf0Var3.get(), (Context) xvf0Var2.get(), (xdf) xvf0Var.get(), (TaxiOrderSharingApi) ((abx0) xvf0Var4).get());
            case 14:
                return new t5y0((yvr0) xvf0Var4, (v7j0) xvf0Var3.get(), (com.yandex.go.navigation.activity.b) xvf0Var2.get(), (g) xvf0Var.get());
            case 15:
                lx4 lx4Var = (lx4) xvf0Var3.get();
                ((of7) xvf0Var2).get();
                return new k9y0(lx4Var, (jc4) ((of7) xvf0Var).get(), (jc4) ((egc0) xvf0Var4).get());
            case 16:
                return new ofa0((ru.yandex.taxi.startup.launch.c) xvf0Var3.get(), (e) xvf0Var2.get(), (cda0) xvf0Var.get(), (qyz) ((kqz) xvf0Var4).get());
            case 17:
                y0g0 y0g0Var = (y0g0) ((gwb0) xvf0Var4).get();
                p1g0 p1g0Var = (p1g0) xvf0Var2.get();
                b64.D(xvf0Var.get());
                return new com.yandex.go.notifications.domain.a(xvf0Var3, y0g0Var, p1g0Var);
            case 18:
                return new bcy0((rh41) ((uwn0) xvf0Var2).get(), (rs2) xvf0Var3.get(), (f420) ((i020) xvf0Var).get(), (WebChromeClientConfig) ((dt00) xvf0Var4).get());
            case 19:
                return new fvy0((zz2) xvf0Var3.get(), (m3x0) xvf0Var2.get(), (pay0) xvf0Var.get(), (jc4) ((e4f) xvf0Var4).get());
            case 20:
                x22 x22Var = (x22) xvf0Var3.get();
                o5e o5eVar = (o5e) xvf0Var2.get();
                w3c w3cVar = (w3c) xvf0Var.get();
                ((bsz) xvf0Var4).get();
                return new com.yandex.messaging.analytics.b(x22Var, o5eVar, w3cVar);
            case 21:
                return new com.yandex.go.taxi.order.tipssuggest.domain.a((FeedbackApi) xvf0Var3.get(), (fn21) xvf0Var2.get(), (b20) ((x) xvf0Var4).get(), (n20) xvf0Var.get());
            case 22:
                return new ru.yandex.taxi.preorder.tollroad.data.e((wiq0) xvf0Var3.get(), (prz0) xvf0Var2.get(), (hit) xvf0Var.get(), (moz0) ((w7y0) xvf0Var4).get());
            case 23:
                return new oo11((f) xvf0Var3.get(), xvf0Var2, xvf0Var, (gqc) xvf0Var4);
            case 24:
                return new hlx0((Context) xvf0Var3.get(), (lx4) xvf0Var2.get(), (sh41) xvf0Var.get(), (ih01) ((on11) xvf0Var4).get());
            case 25:
                return new z221(i5m.a(xvf0Var3), (ru.yandex.taxi.messenger.domain.a) ((o241) xvf0Var4).get(), (hit) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 26:
                return new ru.yandex.taxi.provider.b(i5m.a(xvf0Var3), (rfw0) ((yvr0) xvf0Var4).get(), (tse) xvf0Var2.get(), (Lifecycle) xvf0Var.get());
            case 27:
                return new com.yandex.go.account.activity.b(xvf0Var3, i5m.a((d701) xvf0Var4), (tse) xvf0Var2.get(), (oep0) xvf0Var.get());
            case 28:
                return new yj21((wq21) ((im21) xvf0Var4).get(), (ru.yandex.taxi.profile.a) xvf0Var3.get(), (h) xvf0Var2.get(), (ru.yandex.taxi.am.g) xvf0Var.get());
            default:
                return new el21((j0g) ((o8g) xvf0Var4).get(), (Handler) xvf0Var3.get(), (wff0) xvf0Var2.get(), (xqi0) xvf0Var.get());
        }
    }

    public /* synthetic */ umt0(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.e = v7pVar;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ umt0(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, v7p v7pVar2, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
        this.d = v7pVar;
        this.e = v7pVar2;
    }

    public /* synthetic */ umt0(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = v7pVar;
        this.d = xvf0Var3;
    }

    public /* synthetic */ umt0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ umt0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, boolean z) {
        this.a = i;
        this.e = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
    }

    public /* synthetic */ umt0(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, v7p v7pVar2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.d = v7pVar;
        this.c = xvf0Var2;
        this.e = v7pVar2;
    }
}
