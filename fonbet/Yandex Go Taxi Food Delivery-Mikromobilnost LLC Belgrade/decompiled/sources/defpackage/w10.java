package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.squareup.moshi.Moshi;
import com.yandex.go.app.icon.c;
import com.yandex.go.intentprocessor.k;
import com.yandex.go.overdraft.domain.f;
import com.yandex.go.payments.data.p;
import com.yandex.go.payments.domain.q0;
import com.yandex.go.taxi.order.y;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.address.clarification.impl.repo.a;
import ru.yandex.taxi.am.r;
import ru.yandex.taxi.am.t;
import ru.yandex.taxi.am.v;
import ru.yandex.taxi.analytics.referrer.b;
import ru.yandex.taxi.linked_order.provider.d;
import ru.yandex.taxi.linked_order.provider.e;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.settings.support.g;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes9.dex */
public final class w10 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public /* synthetic */ w10(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
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
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.f;
        xvf0 xvf0Var3 = this.e;
        xvf0 xvf0Var4 = this.c;
        xvf0 xvf0Var5 = this.b;
        switch (i) {
            case 0:
                return new d((s10) xvf0Var5.get(), (qoy) xvf0Var4.get(), (y7u) xvf0Var.get(), (jc00) xvf0Var3.get(), (e) xvf0Var2.get());
            case 1:
                return new a((tse) xvf0Var5.get(), (e2t) xvf0Var4.get(), (i) xvf0Var.get(), (hq0) xvf0Var3.get(), (tb1) xvf0Var2.get());
            case 2:
                return new ru.yandex.taxi.analytics.referrer.a((tse) xvf0Var5.get(), (b) xvf0Var4.get(), (com.yandex.go.preload.e) xvf0Var.get(), (k) xvf0Var3.get(), (t) xvf0Var2.get());
            case 3:
                return new com.yandex.go.splash.animated.a((rqo) xvf0Var5.get(), (Context) xvf0Var4.get(), (aqt0) xvf0Var.get(), (jtq0) xvf0Var3.get(), (zuj0) xvf0Var2.get());
            case 4:
                return new c((Lifecycle) xvf0Var5.get(), (tse) xvf0Var4.get(), (q5h) xvf0Var.get(), (eu2) xvf0Var3.get(), (rqo) xvf0Var2.get());
            case 5:
                return new px2((ox2) xvf0Var5.get(), (oep0) xvf0Var4.get(), this.d, (fx60) xvf0Var3.get(), (com.yandex.go.intentprocessor.i) xvf0Var2.get());
            case 6:
                return new qx2((Context) xvf0Var5.get(), i5m.a(xvf0Var4), i5m.a(xvf0Var), i5m.a(xvf0Var3), (tt2) xvf0Var2.get());
            case 7:
                return new ru.yandex.taxi.perf.analytics.storage.a((rqo) xvf0Var5.get(), (Context) xvf0Var4.get(), (jtq0) xvf0Var.get(), (ac20) xvf0Var3.get(), (dne0) xvf0Var2.get());
            case 8:
                return new v((r) xvf0Var5.get(), (com.yandex.go.preload.e) xvf0Var4.get(), (Lifecycle) xvf0Var.get(), (tse) xvf0Var3.get(), (t9f0) xvf0Var2.get());
            case 9:
                return new g((zjw0) xvf0Var5.get(), (cda0) xvf0Var4.get(), (hor0) xvf0Var.get(), (ru.yandex.taxi.launch.c) xvf0Var3.get(), (o) xvf0Var2.get());
            case 10:
                return new com.yandex.go.payments.cards.pci_dss.data.a((tt2) xvf0Var5.get(), (zrt) xvf0Var4.get(), (wnt) xvf0Var.get(), (l9z) xvf0Var3.get(), (q0) xvf0Var2.get());
            case 11:
                return new ru.yandex.taxi.preorder.source.cars.a((Context) xvf0Var5.get(), (zuj0) xvf0Var4.get(), (k7x0) xvf0Var.get(), (rqo) xvf0Var3.get(), (com.yandex.go.navigation.screen.c) xvf0Var2.get());
            case 12:
                return new g09((f09) xvf0Var5.get(), (ah00) xvf0Var4.get(), (qp00) xvf0Var.get(), (i6r) xvf0Var3.get(), (tse) xvf0Var2.get());
            case 13:
                return new s49((rqo) xvf0Var5.get(), (fkd) xvf0Var4.get(), (xrd0) xvf0Var.get(), (k49) xvf0Var3.get(), (Context) xvf0Var2.get());
            case 14:
                return new com.yandex.go.taxi.order.change.tariff.a((Context) xvf0Var5.get(), (tj60) xvf0Var4.get(), (tt2) xvf0Var.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (yxx0) xvf0Var2.get());
            case 15:
                return new com.yandex.go.chargers.map.combined.a((yz4) xvf0Var5.get(), (oj9) xvf0Var4.get(), (avv0) xvf0Var.get(), (cyx) xvf0Var3.get(), (com.yandex.go.chargers.e) xvf0Var2.get());
            case 16:
                return new com.yandex.go.chargers.payments.data.a((jtq0) xvf0Var5.get(), (crg) xvf0Var4.get(), (dne0) xvf0Var.get(), (po21) xvf0Var3.get(), (tla) xvf0Var2.get());
            case 17:
                return new com.yandex.go.chargers.dvizh_subscription.web.a((j5z) xvf0Var5.get(), (fn21) xvf0Var4.get(), (ru.yandex.taxi.am.token.a) xvf0Var.get(), (po21) xvf0Var3.get(), (ru.yandex.taxi.am.o) xvf0Var2.get());
            case 18:
                return new com.yandex.go.chargers.misc.support.c((ah00) xvf0Var5.get(), (fn21) xvf0Var4.get(), (vp21) xvf0Var.get(), (atd0) xvf0Var3.get(), (ru.yandex.taxi.am.token.a) xvf0Var2.get());
            case 19:
                return new ofb((ru.yandex.taxi.am.g) xvf0Var5.get(), (h) xvf0Var4.get(), (com.yandex.go.superapp.order.multi.old.provider.g) xvf0Var.get(), (kf4) xvf0Var3.get(), (l3w0) xvf0Var2.get());
            case 20:
                return new ru.yandex.taxi.checkin.d((y) xvf0Var4.get(), (com.yandex.go.taxi.order.repositories.c) xvf0Var.get(), (tt2) xvf0Var3.get(), (on2) xvf0Var2.get());
            case 21:
                return new com.yandex.go.shortcuts.impl.interactors.a((com.yandex.go.shortcuts.impl.interactors.e) xvf0Var5.get(), (com.yandex.go.shortcuts.impl.preferences.a) xvf0Var4.get(), (ru.yandex.taxi.jobs.b) xvf0Var.get(), (m6i0) xvf0Var3.get(), (tt2) xvf0Var2.get());
            case 22:
                return new com.yandex.messaging.push.b((m7c) xvf0Var5.get(), (b1g0) xvf0Var4.get(), (vse) xvf0Var.get(), (com.yandex.messaging.profile.d) xvf0Var3.get(), (Moshi) xvf0Var2.get());
            case 23:
                return new ajd((sid) xvf0Var5.get(), (w030) xvf0Var4.get(), (ru.yandex.taxi.perf.screen.c) xvf0Var.get(), (c8v0) xvf0Var3.get(), (u91) xvf0Var2.get());
            case 24:
                return new kqe(i5m.a(xvf0Var5), (i0s0) xvf0Var4.get(), (za90) xvf0Var.get(), (jep0) xvf0Var3.get(), i5m.a(xvf0Var2));
            case 25:
                return new zbf((Context) xvf0Var5.get(), (wff0) xvf0Var4.get(), (k020) xvf0Var.get(), (x22) xvf0Var3.get(), (com.yandex.messaging.utils.b) xvf0Var2.get());
            case 26:
                return new f((com.yandex.go.overdraft.domain.i) xvf0Var5.get(), (fug) xvf0Var4.get(), (hd) xvf0Var.get(), (yvq) xvf0Var3.get(), (tt2) xvf0Var2.get());
            case 27:
                return new gkh((o8h) xvf0Var5.get(), (qmp) xvf0Var4.get(), (p) xvf0Var.get(), (com.yandex.go.payments.data.k) xvf0Var3.get(), (a30) xvf0Var2.get());
            case 28:
                return new krh((com.yandex.messaging.domain.actions.a) xvf0Var5.get(), (com.yandex.messaging.internal.storage.folders.d) xvf0Var4.get(), (el21) xvf0Var.get(), (zwr) xvf0Var3.get(), (kse) xvf0Var2.get());
            default:
                return new ru.yandex.taxi.logistics.sdk.management.deliveries.d((st2) xvf0Var5.get(), (lsi) xvf0Var4.get(), (tdi) xvf0Var.get(), (ru.yandex.taxi.logistics.sdk.management.storage.e) xvf0Var3.get(), (ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d) xvf0Var2.get());
        }
    }
}
