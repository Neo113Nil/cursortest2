package defpackage;

import android.content.Context;
import android.location.LocationManager;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.payments.delivery.domain.d;
import com.yandex.go.payments.domain.i0;
import com.yandex.go.payments.domain.k0;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.f;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.internal.i;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.am.token.a;
import ru.yandex.taxi.logistics.deliveries.map.data.b;
import ru.yandex.taxi.logistics.ndd_map.domain.c;
import ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.e;
import ru.yandex.taxi.logistics.sdk.management.k;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes.dex */
public final class zth implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public zth(gtc gtcVar, xvf0 xvf0Var, xvf0 xvf0Var2, rqt rqtVar) {
        this.a = 13;
        this.d = gtcVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = rqtVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new yth((n6w0) xvf0Var4.get(), (dvi) xvf0Var3.get(), (dr00) ((sp00) xvf0Var).get(), (ah00) xvf0Var2.get());
            case 1:
                return new nwh((a) xvf0Var4.get(), (bux0) ((m5v0) xvf0Var).get(), (o) xvf0Var3.get(), (fn21) xvf0Var2.get());
            case 2:
                return new b3i((FragmentActivity) xvf0Var4.get(), i5m.a(xvf0Var3), (w030) xvf0Var2.get(), (apf) ((r2i) xvf0Var).get());
            case 3:
                return new a5i((ycq0) xvf0Var4.get(), (cda0) xvf0Var3.get(), (zgf) ((e4f) xvf0Var).get(), (uq1) xvf0Var2.get());
            case 4:
                Context context = (Context) xvf0Var4.get();
                b bVar = (b) ((z5i) xvf0Var).get();
                ru.yandex.taxi.design.utils.a aVar = (ru.yandex.taxi.design.utils.a) xvf0Var3.get();
                ((jt2) xvf0Var2.get()).getClass();
                return jt2.a(context, bVar, aVar);
            case 5:
                return new m640(xvf0Var4, (n3h) xvf0Var3.get(), (zch) ((qii) xvf0Var).get(), (Context) xvf0Var2.get());
            case 6:
                return new com.yandex.go.delivery.deeplink.a((cxq0) ((z5i) xvf0Var3).get(), i5m.a((xh) xvf0Var2), (fx60) xvf0Var4.get(), (c) ((tm40) xvf0Var).get());
            case 7:
                return new d((i0) xvf0Var4.get(), (lw90) xvf0Var3.get(), (k0) xvf0Var2.get(), (bo5) ((g970) xvf0Var).get());
            case 8:
                return new apf((wiq0) xvf0Var4.get(), (lx4) xvf0Var3.get(), (b1) ((z5i) xvf0Var2).get(), (o61) ((z5i) xvf0Var).get(), 13);
            case 9:
                return new e((lb7) ((nma) xvf0Var).get(), (k) xvf0Var4.get(), (ru.yandex.taxi.logistics.sdk.management.storage.e) xvf0Var3.get(), (qu70) xvf0Var2.get());
            case 10:
                i5m.a(xvf0Var4);
                return new qem((pw) xvf0Var, (oep0) xvf0Var2.get());
            case 11:
                return new tfm((eex) xvf0Var4.get(), (jtq0) xvf0Var3.get(), (fn21) xvf0Var2.get(), (kfm) ((upj) xvf0Var).get());
            case 12:
                return new com.yandex.go.superapp.order_tracking.eats.domain.c((com.yandex.go.superapp.tracking.data.e) xvf0Var4.get(), (u501) ((hro) xvf0Var).get(), (ru.yandex.taxi.multiorder.e) xvf0Var3.get(), (zuj0) xvf0Var2.get());
            case 13:
                return new com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.a((gtc) xvf0Var2, (ftx) xvf0Var4.get(), (com.yandex.go.route.interactor.b) xvf0Var3.get(), (rqt) xvf0Var);
            case 14:
                Context context2 = (Context) xvf0Var4.get();
                cu1 cu1Var = (cu1) ((qy0) xvf0Var).get();
                return new zrm(9, context2, cu1Var);
            case 15:
                return new com.yandex.go.flex.main_screen.presentation.a((c900) ((z2g) xvf0Var3).get(), (tse) ((n2g) xvf0Var2).get(), (tt2) xvf0Var4.get(), (nbl0) ((a3g) xvf0Var).get());
            case 16:
                return new ru.yandex.taxi.favorites.address.impl.domain.b((ru.yandex.taxi.favorites.address.impl.data.b) ((gga0) xvf0Var3).get(), (t17) ((fn5) xvf0Var2).get(), (ru.yandex.taxi.favorites.address.impl.factory.a) ((tm40) xvf0Var).get(), (ru.yandex.taxi.favorites.address.api.experiment.a) xvf0Var4.get());
            case 17:
                return new com.yandex.go.flex.main_screen.presentation.feed.b((goq) ((y2g) xvf0Var).get(), (com.yandex.go.flex.main_screen.presentation.feed.e) xvf0Var4.get(), (t2m) xvf0Var3.get(), (wgr) xvf0Var2.get());
            case 18:
                return new hjs((y9y0) xvf0Var4.get(), (com.yandex.go.navigation.screen.c) xvf0Var3.get(), (aw8) ((n4g0) xvf0Var2).get(), (ev8) ((cer) xvf0Var).get());
            case 19:
                return new ru.yandex.taxi.contacts.a((jde) xvf0Var4.get(), (p1b) ((x2b) xvf0Var).get(), (g) xvf0Var3.get(), (v7j0) xvf0Var2.get());
            case 20:
                return new com.yandex.messaging.domain.statuses.c((kse) xvf0Var4.get(), (com.yandex.messaging.domain.personal.a) xvf0Var3.get(), (i) xvf0Var2.get(), (pdt) ((a4t) xvf0Var).get());
            case 21:
                return new com.yandex.go.payments.shared.b((ru.yandex.taxi.am.g) xvf0Var4.get(), (wnr0) ((kpp0) xvf0Var).get(), (com.yandex.go.payments.shared.business.c) xvf0Var3.get(), (cpr0) xvf0Var2.get());
            case 22:
                return new wjm((Looper) xvf0Var4.get(), (k020) xvf0Var3.get(), (at2) xvf0Var2.get(), (ogu) ((mwq) xvf0Var).get());
            case 23:
                return tuu.a((MessengerEnvironment) xvf0Var4.get(), (rz10) xvf0Var3.get(), (gsu) ((pw) xvf0Var).get(), (Context) xvf0Var2.get());
            case 24:
                return new ybw((acw) xvf0Var4.get(), (reu) ((ziv) xvf0Var).get(), (j) xvf0Var3.get(), (com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a) xvf0Var2.get());
            case 25:
                return new f((lcw) xvf0Var, (ru.yandex.taxi.deeplinks.b) xvf0Var4.get(), (dcw) xvf0Var3.get(), (ifw) xvf0Var2.get());
            case 26:
                return new lmw((dy6) ((c660) xvf0Var).get(), (com.yandex.go.navigation.screen.c) xvf0Var4.get(), (y9y0) xvf0Var3.get(), (i6r) xvf0Var2.get());
            case 27:
                return new ru.yandex.taxi.jobs.b(i5m.a(xvf0Var4), (hzk) ((b8w) xvf0Var).get(), (Context) xvf0Var3.get(), (tt2) xvf0Var2.get());
            case 28:
                return new com.yandex.go.permission.location_with_agreement.interactor.e((rqo) xvf0Var4.get(), (ru.yandex.taxi.systemrequeirements.location.c) ((bwy) xvf0Var).get(), (j7j0) xvf0Var3.get(), (h) xvf0Var2.get());
            default:
                return new n((LocationManager) xvf0Var4.get(), (tst) xvf0Var3.get(), (k0b0) xvf0Var2.get(), (z9z) ((cnt) xvf0Var).get());
        }
    }

    public /* synthetic */ zth(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = v7pVar;
        this.d = xvf0Var3;
    }

    public /* synthetic */ zth(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = v7pVar;
    }

    public /* synthetic */ zth(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.b = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ zth(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, boolean z) {
        this.a = i;
        this.e = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
    }

    public /* synthetic */ zth(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.e = v7pVar;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public zth(gga0 gga0Var, fn5 fn5Var, tm40 tm40Var, p9p p9pVar) {
        this.a = 16;
        this.c = gga0Var;
        this.d = fn5Var;
        this.e = tm40Var;
        this.b = p9pVar;
    }
}
