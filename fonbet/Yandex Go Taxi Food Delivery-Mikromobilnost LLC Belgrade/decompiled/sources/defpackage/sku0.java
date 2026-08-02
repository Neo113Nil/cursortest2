package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.v;
import com.yandex.go.mainscreen.superapp.impl.foundation.data.factory.q;
import com.yandex.go.mainscreen.superapp.impl.foundation.domain.j;
import com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.domain.e;
import com.yandex.go.payments.domain.k0;
import com.yandex.go.shortcuts.impl.experiments.f;
import com.yandex.go.taxi.tariffs.interactor.r;
import com.yandex.go.walking.navigation.impl.navigation_core.g;
import com.yandex.go.yb.data.u;
import com.yandex.go.zone.repository.o;
import com.yandex.messaging.internal.authorized.sync.i;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.experiments.storage.a;
import ru.yandex.taxi.h;
import ru.yandex.taxi.layers.domain.z;
import ru.yandex.taxi.perf.b;
import ru.yandex.taxi.perf.screen.c;
import ru.yandex.taxi.settings.main.k;
import ru.yandex.taxi.superapp.p;

/* loaded from: classes9.dex */
public final class sku0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public /* synthetic */ sku0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.c;
        xvf0 xvf0Var5 = this.b;
        switch (i) {
            case 0:
                return new rku0((dne0) xvf0Var5.get(), (wku0) xvf0Var4.get(), (dlw0) xvf0Var3.get(), (r8h) xvf0Var2.get(), (wnt) xvf0Var.get());
            case 1:
                return new wku0((gku0) xvf0Var5.get(), (r8h) xvf0Var4.get(), i5m.a(xvf0Var3), (wnt) xvf0Var2.get(), (a) xvf0Var.get());
            case 2:
                return new icv0((dqe0) xvf0Var5.get(), (g8a0) xvf0Var4.get(), (wiq0) xvf0Var3.get(), (drd) xvf0Var2.get(), (k0) xvf0Var.get());
            case 3:
                return new dkv0((c) xvf0Var5.get(), (zjv0) xvf0Var4.get(), (b) xvf0Var3.get(), (com.yandex.go.navigation.screen.c) xvf0Var2.get(), (w030) xvf0Var.get());
            case 4:
                return new e((ru.yandex.taxi.widget.c) xvf0Var5.get(), (z0w0) xvf0Var4.get(), (k) xvf0Var3.get(), (bae0) xvf0Var2.get(), (u2w0) xvf0Var.get());
            case 5:
                return new ru.yandex.taxi.superapp.payment.a((tse) xvf0Var5.get(), (tt2) xvf0Var4.get(), (cda0) xvf0Var3.get(), (com.yandex.go.payments.superapp.payment.b) xvf0Var2.get(), (yrv0) xvf0Var.get());
            case 6:
                return new w6w0((gu11) xvf0Var5.get(), (k7x0) xvf0Var4.get(), (wwq0) xvf0Var3.get(), (z1p) xvf0Var2.get(), (com.yandex.go.route.interactor.b) xvf0Var.get());
            case 7:
                return new p((tse) xvf0Var5.get(), (tt2) xvf0Var4.get(), (h) xvf0Var3.get(), (m) xvf0Var2.get(), (fw4) xvf0Var.get());
            case 8:
                return new j((ajr) xvf0Var5.get(), (com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.b) xvf0Var4.get(), (zzv0) xvf0Var3.get(), (v) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 9:
                return new q((com.yandex.go.route.interactor.b) xvf0Var5.get(), (q9j0) xvf0Var4.get(), (xaw0) xvf0Var3.get(), (f) xvf0Var2.get(), (c0z0) xvf0Var.get());
            case 10:
                return new com.yandex.go.taxi.order.details.v1.elements.support.a((w030) xvf0Var5.get(), (vf41) xvf0Var4.get(), (ru.yandex.taxi.am.token.a) xvf0Var3.get(), (tse) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 11:
                return new i(i5m.a(xvf0Var4), (xdf0) xvf0Var3.get(), (kse) xvf0Var2.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var.get());
            case 12:
                return new rvx0((ru.yandex.taxi.experiments.history.a) xvf0Var5.get(), i5m.a(xvf0Var4), (rs2) xvf0Var3.get(), (ru.yandex.taxi.settings.email.a) xvf0Var2.get(), i5m.a(xvf0Var));
            case 13:
                return new com.yandex.go.superapp.tracking.data.a((Context) xvf0Var5.get(), (tt2) xvf0Var4.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (y48) xvf0Var2.get(), (gic) xvf0Var.get());
            case 14:
                return new ity((kse) xvf0Var4.get(), (el21) xvf0Var3.get(), (lqo) xvf0Var2.get(), i5m.a(xvf0Var));
            case 15:
                return new com.yandex.go.taxi.tariffs.internal.interactor.a((ck31) xvf0Var5.get(), (com.yandex.go.route.interactor.b) xvf0Var4.get(), (ru.yandex.taxi.shortcuts.interactors.a) xvf0Var3.get(), (qrw) xvf0Var2.get(), (r) xvf0Var.get());
            case 16:
                return new ru.yandex.taxi.cashback.interactors.m((ru.yandex.taxi.plus.sdk.prefetch.a) xvf0Var5.get(), (tse) xvf0Var4.get(), (tt2) xvf0Var3.get(), i5m.a(xvf0Var2), (wk21) xvf0Var.get());
            case 17:
                return new ru.yandex.taxi.masstransit.userlocation.a((v7j0) xvf0Var5.get(), (ah00) xvf0Var4.get(), (oc60) xvf0Var3.get(), (po21) xvf0Var2.get(), (oep0) xvf0Var.get());
            case 18:
                return new h731((xf7) xvf0Var5.get(), (umx) xvf0Var4.get(), (tt2) xvf0Var3.get(), i5m.a(xvf0Var2), (sx90) xvf0Var.get());
            case 19:
                return new k931((xf7) xvf0Var5.get(), (umx) xvf0Var4.get(), (tt2) xvf0Var3.get(), i5m.a(xvf0Var2), (sx90) xvf0Var.get());
            case 20:
                return new com.yandex.messaging.internal.net.c((Context) xvf0Var5.get(), (Handler) xvf0Var4.get(), (xdf0) xvf0Var3.get(), (com.yandex.messaging.auth.passport.b) xvf0Var2.get(), (x22) xvf0Var.get());
            case 21:
                return new com.yandex.go.walking.navigation.impl.navigation_core.a((el00) xvf0Var5.get(), (g311) xvf0Var4.get(), (com.yandex.go.walking.navigation.impl.navigation_core.guidance.c) xvf0Var3.get(), (s541) xvf0Var2.get(), (y141) xvf0Var.get());
            case 22:
                com.yandex.go.walking.navigation.impl.navigation_core.b bVar = (com.yandex.go.walking.navigation.impl.navigation_core.b) xvf0Var5.get();
                s541 s541Var = (s541) xvf0Var4.get();
                ngl0 ngl0Var = (ngl0) xvf0Var3.get();
                tt2 tt2Var = (tt2) xvf0Var2.get();
                return new g(bVar, s541Var, ngl0Var, tt2Var);
            case 23:
                return new am41((hit) xvf0Var5.get(), (tt2) xvf0Var4.get(), i5m.a(xvf0Var3), i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 24:
                return new ru.yandex.taxi.location.lbs.wifi.a((v551) xvf0Var5.get(), (WifiManager) xvf0Var4.get(), (tt2) xvf0Var3.get(), (q7y) xvf0Var2.get(), (rk0) xvf0Var.get());
            case 25:
                return new com.yandex.go.ypay.impl.b((tse) xvf0Var5.get(), (Lifecycle) xvf0Var4.get(), (tt2) xvf0Var3.get(), (ij51) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 26:
                return new com.yandex.go.yb.main_menu.data.i((rqo) xvf0Var5.get(), (u) xvf0Var4.get(), (ru.yandex.taxi.am.g) xvf0Var3.get(), (m) xvf0Var2.get(), (k) xvf0Var.get());
            case 27:
                return new ru.yandex.taxi.search.address.model.a((tt2) xvf0Var5.get(), (ru.yandex.taxi.persuggest.source.m) xvf0Var4.get(), (eqe) xvf0Var3.get(), (ru.yandex.taxi.persuggest.repository.e) xvf0Var2.get(), (com.yandex.go.address.search.perf.c) xvf0Var.get());
            case 28:
                return new z((ru.yandex.taxi.zonemodes.j) xvf0Var5.get(), (com.yandex.go.navigation.screen.c) xvf0Var4.get(), (cyx) xvf0Var3.get(), (tt2) xvf0Var2.get(), (wiq0) xvf0Var.get());
            default:
                return new ru.yandex.taxi.zonemodes.j((sd61) xvf0Var5.get(), (o) xvf0Var4.get(), (ck31) xvf0Var3.get(), (wiq0) xvf0Var2.get(), (n20) xvf0Var.get());
        }
    }
}
