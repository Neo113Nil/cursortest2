package defpackage;

import android.content.Context;
import com.yandex.go.feedback_common.data.FeedbackApi;
import com.yandex.go.feedback_common.services.d;
import com.yandex.go.payments.cards.data.i;
import com.yandex.go.payments.cards.data.l;
import com.yandex.go.route.interactor.b;
import com.yandex.go.safety.center.n;
import com.yandex.go.xiva.domain.f;
import com.yandex.go.yb.data.u;
import com.yandex.go.yb.domain.o;
import com.yandex.passport.common.network.l0;
import com.yandex.passport.data.network.d0;
import com.yandex.passport.data.network.h0;
import com.yandex.passport.data.network.i0;
import com.yandex.passport.data.network.i1;
import com.yandex.passport.data.network.k;
import com.yandex.passport.data.network.m;
import com.yandex.passport.data.network.m1;
import com.yandex.passport.data.network.o1;
import com.yandex.passport.data.network.s;
import com.yandex.passport.data.network.s1;
import com.yandex.passport.data.network.y;
import com.yandex.passport.data.network.z;
import ru.yandex.taxi.experiments.superapp.j;
import ru.yandex.taxi.styling.c;
import ru.yandex.taxi.styling.g;
import ru.yandex.taxi.superapp.chat.a;
import ru.yandex.taxi.superapp.chat.view.e;

/* loaded from: classes10.dex */
public final class qxu0 implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final xvf0 d;
    public final yvf0 e;
    public final yvf0 f;

    public qxu0(on11 on11Var, on11 on11Var2, eqh eqhVar, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = 13;
        this.e = on11Var;
        this.f = on11Var2;
        this.b = eqhVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.f;
        xvf0 xvf0Var = this.d;
        yvf0 yvf0Var2 = this.c;
        yvf0 yvf0Var3 = this.b;
        yvf0 yvf0Var4 = this.e;
        switch (i) {
            case 0:
                return new g((c) ((k220) yvf0Var4).get(), (tt2) ((xvf0) yvf0Var3).get(), (pwy0) ((xvf0) yvf0Var2).get(), (exu0) xvf0Var.get(), (com.yandex.go.navigation.screen.c) ((xvf0) yvf0Var).get());
            case 1:
                return new a((ffe) ((xvf0) yvf0Var3).get(), (rsv0) ((alv0) yvf0Var4).get(), (e) ((if9) yvf0Var).get(), (c2x0) ((xvf0) yvf0Var2).get(), (zm41) xvf0Var.get());
            case 2:
                return new com.yandex.go.flex.main_screen.init.a((s66) ((alv0) yvf0Var4).get(), i5m.a((xvf0) yvf0Var3), i5m.a((xvf0) yvf0Var2), (tse) xvf0Var.get(), (tt2) ((xvf0) yvf0Var).get());
            case 3:
                return new ru.yandex.taxi.service.a((w6w0) ((sku0) yvf0Var4).get(), (j) ((xvf0) yvf0Var3).get(), (u1p) ((xvf0) yvf0Var2).get(), (gof0) xvf0Var.get(), (tdn) ((xvf0) yvf0Var).get());
            case 4:
                return new com.yandex.go.route.interactor.c((wiq0) ((xvf0) yvf0Var3).get(), (b) ((xvf0) yvf0Var2).get(), (del0) xvf0Var.get(), (fw40) ((xcz) yvf0Var4).get(), (tt2) ((xvf0) yvf0Var).get());
            case 5:
                return new com.yandex.go.taxi.order.details.v2.domain.feedback.sending.a((FeedbackApi) ((xvf0) yvf0Var3).get(), (d) ((xvf0) yvf0Var2).get(), (tt2) xvf0Var.get(), (k1y0) ((jwx0) yvf0Var4).get(), (dne0) ((xvf0) yvf0Var).get());
            case 6:
                return new com.yandex.go.taxi.order.deeplink.c((ru.yandex.taxi.deeplinks.b) ((xvf0) yvf0Var3).get(), (com.yandex.go.taxi.order.deeplink.b) ((m5v0) yvf0Var4).get(), (mw40) ((xvf0) yvf0Var2).get(), i5m.a((jwx0) xvf0Var), (c1x0) ((e6v0) yvf0Var).get());
            case 7:
                return new hlx0((Context) ((xvf0) yvf0Var3).get(), (wsc) ((x2b) yvf0Var4).get(), (ru.yandex.taxi.widget.utils.e) ((xvf0) yvf0Var2).get(), (zuj0) xvf0Var.get(), (pwy0) ((xvf0) yvf0Var).get(), 1);
            case 8:
                return new f((tse) ((xvf0) yvf0Var3).get(), (com.yandex.go.xiva.domain.g) ((xvf0) yvf0Var2).get(), (yd51) xvf0Var.get(), (p2y0) ((xvf0) yvf0Var).get(), i5m.a((t0g0) yvf0Var4));
            case 9:
                return new com.yandex.go.tips.navigation.b((w030) ((xvf0) yvf0Var3).get(), (hhz0) ((xvf0) yvf0Var2).get(), (jhz0) ((n3w) yvf0Var4).a, (yvr0) xvf0Var, (ehu) ((w7y0) yvf0Var).get());
            case 10:
                return new f811((ru.yandex.taxi.masstransit.detailedroute.ui.f) ((gwb0) yvf0Var4).get(), (z711) ((xvf0) yvf0Var3).get(), (fs40) ((xvf0) yvf0Var2).get(), (v311) xvf0Var.get(), (es40) ((xvf0) yvf0Var).get());
            case 11:
                return new n((com.yandex.go.lifecycle.a) ((xvf0) yvf0Var3).get(), (jqz0) yvf0Var4, i5m.a((x7y0) yvf0Var), (xvf0) yvf0Var2, (p2y0) xvf0Var.get());
            case 12:
                return new sq11((rqo) ((xvf0) yvf0Var3).get(), i5m.a((xvf0) yvf0Var2), (jj10) xvf0Var.get(), (oep0) ((xvf0) yvf0Var).get(), (ci3) yvf0Var4);
            case 13:
                return new b921((cc20) ((on11) yvf0Var4).get(), (yo40) ((on11) yvf0Var).get(), (o) ((xvf0) yvf0Var3).get(), (tt2) ((xvf0) yvf0Var2).get(), (u) xvf0Var.get());
            case 14:
                return new o((u) ((xvf0) yvf0Var3).get(), (tt2) ((xvf0) yvf0Var2).get(), (com.yandex.go.taxi.tariffs.interactor.g) ((o10) yvf0Var4).get(), (hit) xvf0Var.get(), i5m.a((xvf0) yvf0Var));
            case 15:
                return new i921((w030) ((xvf0) yvf0Var3).get(), (n921) ((n3w) yvf0Var4).a, (co40) ((on11) yvf0Var).get(), (ru.yandex.taxi.am.j) ((xvf0) yvf0Var2).get(), (j921) xvf0Var.get());
            case 16:
                return new ru.yandex.taxi.persuggest.fingerprint.c((ru.yandex.taxi.experiments.u) ((im21) yvf0Var4).get(), (olt) ((xvf0) yvf0Var3).get(), (zm21) ((xvf0) yvf0Var2).get(), (tm21) xvf0Var.get(), (tt2) ((xvf0) yvf0Var).get());
            case 17:
                return new vo21((Context) ((xvf0) yvf0Var3).get(), (vgf) ((xvf0) yvf0Var2).get(), (xo21) ((dby0) yvf0Var4).get(), (ah00) xvf0Var.get(), (no21) ((xvf0) yvf0Var).get());
            case 18:
                return new ss21((ga9) ((xvf0) yvf0Var3).get(), i5m.a((xvf0) yvf0Var2), (ysg) xvf0Var.get(), (b20) ((x) yvf0Var4).get(), (com.yandex.go.taxi.order.provider.a) ((xvf0) yvf0Var).get());
            case 19:
                return new l((h731) ((sku0) yvf0Var4).get(), (com.yandex.go.payments.di.a) ((xvf0) yvf0Var3).get(), (l9z) ((xvf0) yvf0Var2).get(), (u32) xvf0Var.get(), (com.yandex.go.payments.cards.experiments.a) ((xvf0) yvf0Var).get());
            case 20:
                return new com.yandex.go.payments.cards.data.n((i) ((xvf0) yvf0Var3).get(), (l) ((qxu0) yvf0Var4).get(), (ql3) ((xvf0) yvf0Var2).get(), (sue0) ((zof0) yvf0Var).get(), (com.yandex.go.payments.di.a) xvf0Var.get());
            case 21:
                return new com.yandex.go.payments.cards.data.o((l9z) ((xvf0) yvf0Var3).get(), (k931) ((sku0) yvf0Var4).get(), (com.yandex.go.payments.di.a) ((xvf0) yvf0Var2).get(), (u32) xvf0Var.get(), (com.yandex.go.payments.cards.experiments.a) ((e4f) yvf0Var).get());
            case 22:
                return new com.yandex.go.walking.navigation.impl.navigation_core.guidance.a((dne0) ((xvf0) yvf0Var3).get(), (im21) yvf0Var4, (tse) ((xvf0) yvf0Var2).get(), (com.yandex.go.walking.navigation.impl.navigation_core.guidance.b) ((d6g) yvf0Var).get(), (y141) xvf0Var.get());
            case 23:
                return new ru.yandex.taxi.yaplus.b((n20) ((xvf0) yvf0Var3).get(), (ru.yandex.taxi.yaplus.e) ((xvf0) yvf0Var2).get(), (iid0) ((qta0) yvf0Var4).get(), (ru.yandex.taxi.am.g) xvf0Var.get(), (qmp) ((xvf0) yvf0Var).get());
            case 24:
                return new com.yandex.passport.data.network.l((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (k) ((com.yandex.passport.common.coroutine.g) xvf0Var).get(), (com.yandex.passport.data.network.f) ((m) yvf0Var).get());
            case 25:
                return new s((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (com.yandex.passport.data.network.o) ((m) xvf0Var).get(), (com.yandex.passport.data.network.core.o) yvf0Var.get());
            case 26:
                return new z((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (com.yandex.passport.data.network.u) ((m) xvf0Var).get(), (y) yvf0Var.get());
            case 27:
                return new i0((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (d0) ((m) xvf0Var).get(), (h0) yvf0Var.get());
            case 28:
                return new m1((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (i1) ((m) xvf0Var).get(), (com.yandex.passport.data.network.core.o) yvf0Var.get());
            default:
                return new s1((com.yandex.passport.common.coroutine.a) yvf0Var4.get(), (l0) yvf0Var3.get(), (com.yandex.passport.internal.network.c) yvf0Var2.get(), (o1) ((m) xvf0Var).get(), (com.yandex.passport.data.network.core.o) yvf0Var.get());
        }
    }

    public /* synthetic */ qxu0(v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.e = v7pVar;
        this.f = v7pVar2;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ qxu0(xvf0 xvf0Var, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var2, v7p v7pVar3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = v7pVar;
        this.d = v7pVar2;
        this.f = xvf0Var2;
        this.e = v7pVar3;
    }

    public /* synthetic */ qxu0(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.e = v7pVar;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.f = xvf0Var4;
    }

    public /* synthetic */ qxu0(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = v7pVar;
        this.d = xvf0Var3;
        this.f = xvf0Var4;
    }

    public /* synthetic */ qxu0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = v7pVar;
        this.f = xvf0Var4;
    }

    public /* synthetic */ qxu0(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, xvf0 xvf0Var, yvf0 yvf0Var4, int i) {
        this.a = i;
        this.e = yvf0Var;
        this.b = yvf0Var2;
        this.c = yvf0Var3;
        this.d = xvf0Var;
        this.f = yvf0Var4;
    }

    public /* synthetic */ qxu0(int i, v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.e = v7pVar;
        this.c = xvf0Var2;
        this.f = xvf0Var3;
        this.d = xvf0Var4;
    }
}
