package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.payments.domain.j;
import com.yandex.go.payments.paymentlist.experiments.change_payment_modal.f;
import com.yandex.go.payments.shared.business.accountcreation.corp.CitySuggestApi;
import com.yandex.go.payments.shared.z;
import com.yandex.go.preload.e;
import com.yandex.go.route.interactor.b;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.analytics.n;
import ru.yandex.taxi.cashback.l;
import ru.yandex.taxi.linked_order.a;
import ru.yandex.taxi.linked_order.interactor.i0;
import ru.yandex.taxi.settings.main.k;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.startup.launch.i;

/* loaded from: classes9.dex */
public final class r10 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final v7p f;

    public r10(rsn0 rsn0Var, xvf0 xvf0Var, eqh eqhVar, t6i t6iVar, rxm0 rxm0Var) {
        this.a = 28;
        this.f = rsn0Var;
        this.b = xvf0Var;
        this.c = eqhVar;
        this.e = t6iVar;
        this.d = rxm0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        xvf0 xvf0Var4 = this.e;
        v7p v7pVar = this.f;
        switch (i) {
            case 0:
                return new a((i0) ((c660) v7pVar).get(), (mhf) xvf0Var3.get(), (c) xvf0Var2.get(), (y3u0) xvf0Var.get(), (v3u0) xvf0Var4.get());
            case 1:
                return new jy0((o) xvf0Var3.get(), (b) xvf0Var2.get(), (n11) xvf0Var.get(), (e2t) xvf0Var4.get(), (h2t) ((o0t) v7pVar).get());
            case 2:
                return new n31((zuj0) xvf0Var3.get(), (jl50) ((n3w) v7pVar).a, (zwx0) ((abx0) xvf0Var4).get(), (com.yandex.go.address.address_map_picker.domain.c) xvf0Var2.get(), this.d);
            case 3:
                return new wb1((ru.yandex.taxi.address.clarification.impl.repo.a) xvf0Var3.get(), i5m.a((nzb) v7pVar), (tb1) xvf0Var2.get(), (byb) xvf0Var.get(), (rv0) xvf0Var4.get());
            case 4:
                return new com.yandex.go.ads.prefetch.impl.c((Context) xvf0Var3.get(), (j5z) xvf0Var2.get(), (po21) xvf0Var.get(), (cp60) ((eqh) v7pVar).get(), (tt2) xvf0Var4.get());
            case 5:
                Context context = (Context) xvf0Var3.get();
                kl40 kl40Var = (kl40) ((gd) v7pVar).get();
                return ((lt2) xvf0Var4.get()).c(context, kl40Var);
            case 6:
                return new ot3((wnt) xvf0Var3.get(), i5m.a(xvf0Var2), i5m.a(xvf0Var), i5m.a(xvf0Var4), (c1g0) ((nzb) v7pVar).get());
            case 7:
                return new zf4(i5m.a(xvf0Var3), (wjm) ((zth) v7pVar).get(), (wff0) xvf0Var2.get(), (e100) ((jc60) xvf0Var).get(), (jdj) ((mwq) xvf0Var4).get());
            case 8:
                return new qn4((s3d0) xvf0Var3.get(), i5m.a(xvf0Var2), i5m.a(xvf0Var), (umt0) v7pVar, (oep0) xvf0Var4.get());
            case 9:
                return new com.yandex.go.beginners.flow.a((com.yandex.go.beginners.analytics.a) ((nf) v7pVar).get(), (t9f0) xvf0Var3.get(), (c) xvf0Var2.get(), (maf0) xvf0Var.get(), (i) xvf0Var4.get());
            case 10:
                com.yandex.go.beginners.domain.interactor.a aVar = (com.yandex.go.beginners.domain.interactor.a) ((sx2) xvf0Var4).get();
                t9f0 t9f0Var = (t9f0) xvf0Var.get();
                return new com.yandex.go.beginners.flow.c((e) xvf0Var3.get(), this.c, (lf0) v7pVar, aVar, t9f0Var);
            case 11:
                return new j((h) xvf0Var3.get(), (jtq0) xvf0Var2.get(), (fga0) xvf0Var.get(), i5m.a((xh) v7pVar), (cda0) xvf0Var4.get());
            case 12:
                return new com.yandex.go.blockeduser.c((Lifecycle) xvf0Var3.get(), (tse) xvf0Var2.get(), (oep0) xvf0Var.get(), (com.yandex.go.blockeduser.data.c) xvf0Var4.get(), (aj0) v7pVar);
            case 13:
                return new yuf0((Context) xvf0Var3.get(), (pdc) xvf0Var2.get(), (zuj0) xvf0Var.get(), (ru.yandex.taxi.design.utils.a) xvf0Var4.get(), (kjz) ((c660) v7pVar).get());
            case 14:
                return new xus((i130) xvf0Var3.get(), (oj) v7pVar, (hx7) xvf0Var2.get(), (oxu0) xvf0Var.get(), (Context) xvf0Var4.get(), 1);
            case 15:
                return new vu8((com.yandex.go.logistics.cargo_flow.route_selector.a) ((nf) v7pVar).get(), this.b, (f4l0) xvf0Var2.get(), this.d, (com.yandex.go.logistics.cargo_flow.form.address.c) xvf0Var4.get());
            case 16:
                return new x39((tj60) xvf0Var3.get(), (Activity) xvf0Var2.get(), (a29) ((nf) v7pVar).get(), (l) xvf0Var.get(), (a49) ((cg7) xvf0Var4).get());
            case 17:
                return new sb9((com.yandex.go.taxi.order.change.source.interactor.e) ((r10) v7pVar).get(), (com.yandex.go.taxi.order.change.destination.a) ((o10) xvf0Var3).get(), (com.yandex.go.taxi.order.change.driver.c) ((o10) xvf0Var2).get(), (sg9) ((w10) xvf0Var).get(), (com.yandex.go.taxi.order.change.requirements.interactor.b) ((if9) xvf0Var4).get());
            case 18:
                return new com.yandex.go.payments.paymentlist.experiments.change_payment_modal.a((tse) xvf0Var3.get(), (tt2) xvf0Var2.get(), (f) ((bt2) v7pVar).get(), (fr3) xvf0Var4, (oep0) xvf0Var.get());
            case 19:
                return new com.yandex.go.taxi.order.change.source.interactor.e((Context) xvf0Var3.get(), (tj60) xvf0Var2.get(), (pm5) ((of7) v7pVar).get(), (ru.yandex.taxi.widget.utils.e) xvf0Var.get(), (tt2) xvf0Var4.get());
            case 20:
                return new com.yandex.go.chargers.order.data.e((tt2) xvf0Var3.get(), (tse) xvf0Var2.get(), (ru.yandex.taxi.launch.c) xvf0Var.get(), i5m.a((nl9) v7pVar), (com.yandex.go.chargers.data.f) xvf0Var4.get());
            case 21:
                ((gw7) v7pVar).get();
                return new o501(12);
            case 22:
                return new iwb((st0) ((my0) v7pVar).get(), (CitySuggestApi) xvf0Var3.get(), (ej6) xvf0Var2.get(), (j5z) xvf0Var.get(), (tt2) xvf0Var4.get());
            case 23:
                return new com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.f((com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.i) ((if9) v7pVar).get(), (mr0) xvf0Var3.get(), (hay0) xvf0Var2.get(), (g) xvf0Var.get(), (ajr) xvf0Var4.get());
            case 24:
                return new com.yandex.messaging.internal.authorized.b((Handler) xvf0Var3.get(), i5m.a(xvf0Var2), (com.yandex.messaging.domain.j) ((dld0) v7pVar).get(), (xdf0) xvf0Var.get(), (wi60) xvf0Var4.get());
            case 25:
                return new ru.yandex.taxi.polling.a((ru.yandex.taxi.polling.c) ((etx) v7pVar).get(), (ru.yandex.taxi.polling.e) xvf0Var3.get(), (po21) xvf0Var2.get(), (g9z) xvf0Var.get(), (n) xvf0Var4.get());
            case 26:
                return new sid((dsd) xvf0Var3.get(), (tjt0) xvf0Var2.get(), (g0j) ((qii) v7pVar).get(), (zuj0) xvf0Var.get(), (l3o) ((qsn) xvf0Var4).get());
            case 27:
                return new com.yandex.go.connection_prewarm.a(i5m.a(xvf0Var3), i5m.a(xvf0Var2), (tt2) xvf0Var.get(), (t61) ((kyd) v7pVar).get(), (tse) xvf0Var4.get());
            case 28:
                return new une((z) ((rsn0) v7pVar).get(), (k) xvf0Var3.get(), (u500) xvf0Var2.get(), (z9p) ((t6i) xvf0Var4).get(), (ast0) xvf0Var.get());
            default:
                return new com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.employee_access_info.a((Context) xvf0Var3.get(), (w030) xvf0Var2.get(), (tt2) xvf0Var.get(), (o61) ((xv2) v7pVar).get(), (com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.employee_access_info.domain.a) ((kyd) xvf0Var4).get());
        }
    }

    public /* synthetic */ r10(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.f = v7pVar;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ r10(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.f = v7pVar;
        this.e = v7pVar2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ r10(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.f = v7pVar;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ r10(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.f = v7pVar;
        this.e = xvf0Var4;
    }

    public /* synthetic */ r10(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = v7pVar;
    }

    public r10(xvf0 xvf0Var, n3w n3wVar, abx0 abx0Var, mz0 mz0Var, oe oeVar) {
        this.a = 2;
        this.b = xvf0Var;
        this.f = n3wVar;
        this.e = abx0Var;
        this.c = mz0Var;
        this.d = oeVar;
    }

    public /* synthetic */ r10(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.f = v7pVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }
}
