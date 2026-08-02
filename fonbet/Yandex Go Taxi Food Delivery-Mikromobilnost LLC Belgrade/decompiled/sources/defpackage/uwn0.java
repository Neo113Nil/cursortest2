package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.mainscreen.superapp.popup.data.c;
import com.yandex.go.mainscreen.superapp.popup.data.experiments.d;
import com.yandex.go.scooters.live.a;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.i;
import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.go.user_profile.fullscreen.models.l;
import com.yandex.messenger.websdk.api.MessengerAnalyticsFactory;
import com.yandex.messenger.websdk.api.NotificationDecorator;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.deeplinks.b;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;

/* loaded from: classes8.dex */
public final class uwn0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;

    public uwn0(y0y0 y0y0Var, s730 s730Var, im21 im21Var, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, jv21 jv21Var) {
        this.a = 11;
        this.e = y0y0Var;
        this.f = s730Var;
        this.g = im21Var;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.h = jv21Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.f;
        xvf0 xvf0Var3 = this.e;
        xvf0 xvf0Var4 = this.b;
        xvf0 xvf0Var5 = this.h;
        xvf0 xvf0Var6 = this.g;
        xvf0 xvf0Var7 = this.c;
        switch (i) {
            case 0:
                return new a((oep0) xvf0Var4.get(), i5m.a(xvf0Var7), this.d, i5m.a(xvf0Var3), i5m.a(xvf0Var2), i5m.a(xvf0Var6), i5m.a((yxm0) xvf0Var5));
            case 1:
                return new w3r0((wiq0) xvf0Var4.get(), (RequirementsChangedNotifier) xvf0Var7.get(), (dqe0) xvf0Var.get(), (e6z) ((bwy) xvf0Var5).get(), (eoj0) xvf0Var3.get(), (jti0) xvf0Var2.get(), (r8h) xvf0Var6.get());
            case 2:
                return new fcr0((j20) xvf0Var4.get(), (l) xvf0Var7.get(), (m) xvf0Var.get(), (tcr0) ((swo0) xvf0Var5).get(), (vp21) xvf0Var3.get(), (ru.yandex.taxi.settings.email.a) xvf0Var2.get(), (tt2) xvf0Var6.get());
            case 3:
                ssv0 ssv0Var = (ssv0) ((alv0) xvf0Var5).get();
                return new gdr0(this.b, (hs50) xvf0Var7.get(), this.d, (vw2) xvf0Var3, (ji3) xvf0Var2, (b8w) xvf0Var6, ssv0Var);
            case 4:
                return new h0w0((f600) xvf0Var4.get(), (g2w0) xvf0Var7.get(), (e0w0) xvf0Var.get(), (d0w0) xvf0Var3.get(), (tt2) xvf0Var2.get(), (oep0) xvf0Var6.get(), (umt0) xvf0Var5);
            case 5:
                qcw0 qcw0Var = (qcw0) ((lag) xvf0Var4).get();
                return new c((com.yandex.go.mainscreen.superapp.popup.data.state.scenario.c) ((xsi) xvf0Var7).get(), (zzv0) ((lag) xvf0Var).get(), qcw0Var, (hay0) ((lag) xvf0Var3).get(), (ucw0) ((lag) xvf0Var6).get(), (d) ((lag) xvf0Var2).get(), (tt2) ((u5g) xvf0Var5).get());
            case 6:
                return new o5w0((Context) xvf0Var4.get(), (c151) xvf0Var7.get(), (jsv0) xvf0Var.get(), (q5w0) ((n3w) xvf0Var6).a, (w030) xvf0Var3.get(), (b) xvf0Var2.get(), (jyw0) ((rmv0) xvf0Var5).get());
            case 7:
                return new com.yandex.go.support.domain.a((Activity) xvf0Var4.get(), (h15) xvf0Var7.get(), (com.yandex.go.lifecycle.a) xvf0Var.get(), this.e, this.f, (tiw0) ((rmv0) xvf0Var5).get(), i5m.a(xvf0Var6));
            case 8:
                return new nex0((wiq0) xvf0Var4.get(), (dqe0) xvf0Var7.get(), (arv0) xvf0Var.get(), (ck31) xvf0Var3.get(), (nnx0) ((abx0) xvf0Var6).get(), (zax0) xvf0Var2.get(), (pj) ((qy0) xvf0Var5).get());
            case 9:
                return new com.yandex.go.taxi.order.infosharing.domain.b((tse) xvf0Var4.get(), (n20) xvf0Var7.get(), (com.yandex.go.navigation.screen.c) xvf0Var.get(), (t2y0) ((abx0) xvf0Var2).get(), (umt0) xvf0Var6, (com.yandex.go.taxi.order.infosharing.data.a) ((umt0) xvf0Var5).get(), (oep0) xvf0Var3.get());
            case 10:
                return new com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.m((qkw) xvf0Var4.get(), (zhw) xvf0Var7.get(), (i) xvf0Var.get(), (jhw) xvf0Var3.get(), (com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a) xvf0Var2.get(), (ybw) ((zth) xvf0Var5).get(), (klw) xvf0Var6.get());
            case 11:
                return new gk31((cf11) ((y0y0) xvf0Var3).get(), (yo40) ((s730) xvf0Var2).get(), (yo40) ((im21) xvf0Var6).get(), (qbl0) xvf0Var4.get(), (xdf) xvf0Var7.get(), (g) xvf0Var.get(), (rfw0) ((jv21) xvf0Var5).get());
            case 12:
                return new v341((tse) xvf0Var4.get(), (a341) xvf0Var7.get(), (n241) xvf0Var.get(), (j241) xvf0Var3.get(), (r341) ((d6g) xvf0Var6).get(), (a640) ((jv21) xvf0Var5).get(), (q541) xvf0Var2.get());
            case 13:
                return new rh41((Context) xvf0Var4.get(), (MessengerAnalyticsFactory) xvf0Var7.get(), (n220) xvf0Var.get(), (NotificationDecorator) xvf0Var3.get(), (b03) xvf0Var2.get(), (kb20) xvf0Var6.get(), (am2) ((o241) xvf0Var5).get());
            case 14:
                return new com.yandex.go.business.impl.router.b((gf41) xvf0Var4.get(), (un51) ((n3w) xvf0Var2).a, (ru.yandex.taxi.am.token.a) xvf0Var7.get(), (xn51) ((yn51) xvf0Var6).get(), (xes0) ((i5s0) xvf0Var5).get(), (o) xvf0Var.get(), (po21) xvf0Var3.get());
            case 15:
                return new com.yandex.go.yb.data.i((dne0) xvf0Var4.get(), (cda0) xvf0Var7.get(), (rqo) xvf0Var.get(), (gv51) xvf0Var3.get(), (py51) ((yn51) xvf0Var5).get(), (rgf) xvf0Var2.get(), (gay0) xvf0Var6.get());
            default:
                ((e8b0) xvf0Var6).get();
                ((pqd0) xvf0Var5).get();
                return new rv51();
        }
    }

    public /* synthetic */ uwn0(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar2, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.g = v7pVar;
        this.f = xvf0Var5;
        this.h = v7pVar2;
    }

    public /* synthetic */ uwn0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.h = v7pVar;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    public /* synthetic */ uwn0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
    }

    public /* synthetic */ uwn0(int i, v7p v7pVar, v7p v7pVar2, v7p v7pVar3, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = i;
        this.b = xvf0Var;
        this.c = v7pVar;
        this.d = xvf0Var2;
        this.e = v7pVar2;
        this.f = xvf0Var3;
        this.h = v7pVar3;
        this.g = xvf0Var4;
    }

    public uwn0(xvf0 xvf0Var, eqh eqhVar, xvf0 xvf0Var2, abx0 abx0Var, umt0 umt0Var, umt0 umt0Var2, eqh eqhVar2) {
        this.a = 9;
        this.b = xvf0Var;
        this.c = eqhVar;
        this.d = xvf0Var2;
        this.f = abx0Var;
        this.g = umt0Var;
        this.h = umt0Var2;
        this.e = eqhVar2;
    }

    public uwn0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, d6g d6gVar, jv21 jv21Var, xvf0 xvf0Var5) {
        this.a = 12;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.g = d6gVar;
        this.h = jv21Var;
        this.f = xvf0Var5;
    }

    public uwn0(xvf0 xvf0Var, eqh eqhVar, xvf0 xvf0Var2, xvf0 xvf0Var3, yn51 yn51Var, xvf0 xvf0Var4, dqx0 dqx0Var) {
        this.a = 15;
        this.b = xvf0Var;
        this.c = eqhVar;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.h = yn51Var;
        this.f = xvf0Var4;
        this.g = dqx0Var;
    }

    public uwn0(d441 d441Var, n3w n3wVar, eqh eqhVar, yn51 yn51Var, i5s0 i5s0Var, nf nfVar, eqh eqhVar2) {
        this.a = 14;
        this.b = d441Var;
        this.f = n3wVar;
        this.c = eqhVar;
        this.g = yn51Var;
        this.h = i5s0Var;
        this.d = nfVar;
        this.e = eqhVar2;
    }

    public uwn0(xvf0 xvf0Var, xvf0 xvf0Var2, e6v0 e6v0Var, n3w n3wVar, eqh eqhVar, xvf0 xvf0Var3, rmv0 rmv0Var) {
        this.a = 6;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = e6v0Var;
        this.g = n3wVar;
        this.e = eqhVar;
        this.f = xvf0Var3;
        this.h = rmv0Var;
    }
}
