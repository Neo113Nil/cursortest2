package defpackage;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.drive.delegates.b;
import com.yandex.go.feedback_common.services.d;
import com.yandex.go.flex.main_screen.interactors.a;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.h;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.m;
import com.yandex.go.taxi.order.y;
import com.yandex.messaging.internal.a0;
import com.yandex.messaging.internal.authorized.j;
import com.yandex.mob.api.model.MobEnvironment;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.am.x;
import ru.yandex.taxi.analytics.n;
import ru.yandex.taxi.favorites.address.impl.domain.e;
import ru.yandex.taxi.logistics.sdk.g;
import ru.yandex.taxi.preorder.suggested.destinations.c;
import ru.yandex.taxi.superapp.knownOrder.u;

/* loaded from: classes.dex */
public final class r2i implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public /* synthetic */ r2i(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
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
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.f;
        xvf0 xvf0Var4 = this.c;
        xvf0 xvf0Var5 = this.b;
        switch (i) {
            case 0:
                FragmentActivity fragmentActivity = (FragmentActivity) xvf0Var5.get();
                i5m.a(xvf0Var4);
                return new apf(fragmentActivity, (pho) xvf0Var2.get(), (pav) xvf0Var.get(), (k7x0) xvf0Var3.get(), 12);
            case 1:
                return new oo2(i5m.a(xvf0Var5), i5m.a(xvf0Var4), this.d, this.e, (oep0) xvf0Var3.get());
            case 2:
                return new w7i((aji) xvf0Var5.get(), (vwh) xvf0Var4.get(), (wiq0) xvf0Var2.get(), (xai) xvf0Var.get(), (bai) xvf0Var3.get());
            case 3:
                return new g((Lifecycle) xvf0Var5.get(), (tse) xvf0Var4.get(), (sfi) xvf0Var2.get(), (ky11) xvf0Var.get(), (iy11) xvf0Var3.get());
            case 4:
                return new gsi((rqo) xvf0Var5.get(), (w7i) xvf0Var4.get(), (net) xvf0Var2.get(), (cii) xvf0Var.get(), (dqe0) xvf0Var3.get());
            case 5:
                return new a((Context) xvf0Var5.get(), (ybt) xvf0Var4.get(), (sat) xvf0Var2.get(), (bg5) xvf0Var.get(), (u) xvf0Var3.get());
            case 6:
                return new yem((wnt) xvf0Var5.get(), i5m.a(xvf0Var4), i5m.a(xvf0Var2), i5m.a(xvf0Var), i5m.a(xvf0Var3));
            case 7:
                return new b((u02) xvf0Var5.get(), (ru.yandex.taxi.am.g) xvf0Var4.get(), (ru.yandex.taxi.am.token.a) xvf0Var2.get(), (fn21) xvf0Var.get(), (o) xvf0Var3.get());
            case 8:
                return new c((on2) xvf0Var5.get(), (tt2) xvf0Var4.get(), (ru.yandex.taxi.am.g) xvf0Var2.get(), (ru.yandex.taxi.launch.c) xvf0Var.get(), (eqe) xvf0Var3.get());
            case 9:
                return new com.yandex.go.explorer.impl.data.repositories.a((kto) xvf0Var5.get(), (ato) xvf0Var4.get(), (xuo) xvf0Var2.get(), (lto) xvf0Var.get(), (tt2) xvf0Var3.get());
            case 10:
                return new com.yandex.go.explorer.impl.navigation.c((i6r) xvf0Var5.get(), (wuo) xvf0Var4.get(), (com.yandex.go.explorer.impl.experiments.g) xvf0Var2.get(), (k0b0) xvf0Var.get(), (com.yandex.go.explorer.impl.data.repositories.c) xvf0Var3.get());
            case 11:
                return new com.yandex.go.payments.shared.family.viewmodels.c((kap) xvf0Var5.get(), (ru.yandex.taxi.widget.c) xvf0Var4.get(), (uap) xvf0Var2.get(), (pdc) xvf0Var.get(), (pwy0) xvf0Var3.get());
            case 12:
                return new e((ru.yandex.taxi.favorites.data.repo.a) xvf0Var5.get(), (wip) xvf0Var4.get(), (zuj0) xvf0Var2.get(), (u500) xvf0Var.get(), (ru.yandex.taxi.favorites.address.api.experiment.a) xvf0Var3.get());
            case 13:
                return new crq((mir) xvf0Var5.get(), (i6r) xvf0Var4.get(), (f0g) xvf0Var2.get(), (i6r) xvf0Var.get(), (xu70) xvf0Var3.get());
            case 14:
                return new rsq((dm21) xvf0Var5.get(), (d) xvf0Var4.get(), (y180) xvf0Var2.get(), (com.yandex.go.taxi.order.details.v2.domain.feedback.sending.a) xvf0Var.get(), (y) xvf0Var3.get());
            case 15:
                return new ibr((Context) xvf0Var5.get(), (u02) xvf0Var4.get(), (vp21) xvf0Var2.get(), (cda0) xvf0Var.get(), (pwy0) xvf0Var3.get());
            case 16:
                return new x((rqo) xvf0Var5.get(), (Application) xvf0Var4.get(), (tt2) xvf0Var2.get(), (ru.yandex.taxi.am.token.a) xvf0Var.get(), (k) xvf0Var3.get());
            case 17:
                return new ru.yandex.taxi.perf.screen.a((mua0) xvf0Var5.get(), (tse) xvf0Var4.get(), (Lifecycle) xvf0Var2.get(), (ru.yandex.taxi.perf.screen.c) xvf0Var.get(), (rua0) xvf0Var3.get());
            case 18:
                return new ru.yandex.taxi.preorder.source.userposition.b((acz) xvf0Var5.get(), i5m.a(xvf0Var4), i5m.a(xvf0Var2), (dqe0) xvf0Var.get(), (tt2) xvf0Var3.get());
            case 19:
                return new n((tse) xvf0Var5.get(), (k0b0) xvf0Var4.get(), (h941) xvf0Var2.get(), (adz) xvf0Var.get(), (rqo) xvf0Var3.get());
            case 20:
                return new ru.yandex.taxi.utils.b((dne0) xvf0Var5.get(), (wnt) xvf0Var4.get(), (tt2) xvf0Var2.get(), (qmp) xvf0Var.get(), (b03) xvf0Var3.get());
            case 21:
                return new com.yandex.messaging.domain.contacts.c((w5t) xvf0Var5.get(), (k020) xvf0Var4.get(), (sb7) xvf0Var2.get(), (kse) xvf0Var.get(), (lqo) xvf0Var3.get());
            case 22:
                return new a0((j) xvf0Var5.get(), (at2) xvf0Var4.get(), (sb7) xvf0Var2.get(), (kse) xvf0Var.get(), (jft) xvf0Var3.get());
            case 23:
                return new not((MobEnvironment) xvf0Var5.get(), i5m.a(xvf0Var4), (qsu) xvf0Var2.get(), (v0p) xvf0Var.get(), (hs50) xvf0Var3.get());
            case 24:
                return new com.yandex.messaging.domain.chatlist.c((w5t) xvf0Var5.get(), (kse) xvf0Var4.get(), (at2) xvf0Var2.get(), (sb7) xvf0Var.get(), (lqo) xvf0Var3.get());
            case 25:
                return new com.yandex.messaging.domain.threads.c((w5t) xvf0Var5.get(), (kse) xvf0Var4.get(), (at2) xvf0Var2.get(), (sb7) xvf0Var.get(), (lqo) xvf0Var3.get());
            case 26:
                return new bwu((xf7) xvf0Var5.get(), (com.yandex.messaging.internal.net.a) xvf0Var4.get(), (c370) xvf0Var2.get(), (x22) xvf0Var.get(), (rz10) xvf0Var3.get());
            case 27:
                return new t8w((dsd) xvf0Var5.get(), (tjt0) xvf0Var4.get(), (lmw) xvf0Var2.get(), (zuj0) xvf0Var.get(), (y9y0) xvf0Var3.get());
            case 28:
                return new h((tt2) xvf0Var5.get(), (com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a) xvf0Var4.get(), (com.yandex.go.route.interactor.b) xvf0Var2.get(), (atd0) xvf0Var.get(), (hit) xvf0Var3.get());
            default:
                return new com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.j((tt2) xvf0Var5.get(), (com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a) xvf0Var4.get(), (klw) xvf0Var2.get(), (zhw) xvf0Var.get(), (m) xvf0Var3.get());
        }
    }
}
