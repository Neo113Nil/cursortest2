package defpackage;

import android.content.Context;
import com.yandex.go.preorder.address.f;
import com.yandex.go.route.interactor.b;
import com.yandex.go.route.interactor.c;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.yb.data.u;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.telemost.a;
import ru.yandex.taxi.deeplinks.e;
import ru.yandex.taxi.logistics.sdk.management.k;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;
import ru.yandex.taxi.settings.profile.UserInfoProfileView;
import ru.yandex.taxi.shadow.ShadowWrapperImpl;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkJsNativeApi;

/* loaded from: classes8.dex */
public final class y0y0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ y0y0(int i, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var) {
        this.a = i;
        this.c = v7pVar;
        this.d = v7pVar2;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new x0y0((y5w0) xvf0Var3.get(), (xu70) ((f870) xvf0Var2).get(), (g) xvf0Var.get());
            case 1:
                return new lay0((rx2) ((eqf0) xvf0Var3).get(), (jc4) ((eqf0) xvf0Var).get(), (t61) ((eqf0) xvf0Var2).get());
            case 2:
                s320 s320Var = (s320) xvf0Var3.get();
                r501 r501Var = (r501) ((o8g) xvf0Var2).get();
                return new s400(s320Var, r501Var);
            case 3:
                return a.a((lqo) xvf0Var3.get(), (a9g) ((o8g) xvf0Var2).get(), (MessengerEnvironment) xvf0Var.get());
            case 4:
                return new dzy0((Context) xvf0Var3.get(), (zuj0) xvf0Var.get(), (cjw0) ((dby0) xvf0Var2).get());
            case 5:
                return new ufz0((vfz0) ((w7y0) xvf0Var2).get(), (ohz0) xvf0Var3.get(), (rgz0) xvf0Var.get());
            case 6:
                return new c2n0(6, (i130) xvf0Var3.get(), (ohz0) xvf0Var.get(), (sii) xvf0Var2);
            case 7:
                return new da0(22, (w030) xvf0Var3.get(), (tt) ((o01) xvf0Var2).get(), (gf41) xvf0Var.get());
            case 8:
                return new d811((xcz) xvf0Var, (s730) xvf0Var2, xvf0Var3);
            case 9:
                return new ru.yandex.taxi.masstransit.deeplink.g((e) ((if9) xvf0Var2).get(), (po21) xvf0Var3.get(), (b) xvf0Var.get());
            case 10:
                return new cf11((gye0) xvf0Var3.get(), (q1q0) xvf0Var.get(), (hzk) ((rqt) xvf0Var2).get());
            case 11:
                return new tv11((tt2) xvf0Var3.get(), (uv11) xvf0Var.get(), (com.yandex.go.ultima_mode.preferences.a) ((dby0) xvf0Var2).get());
            case 12:
                return new com.yandex.go.order.external.unifiedpolling.a((wnt) xvf0Var3.get(), i5m.a((upj) xvf0Var2), i5m.a(xvf0Var));
            case 13:
                return new com.yandex.go.universal_qr_scanner.domain.a((com.yandex.go.lifecycle.a) xvf0Var3.get(), (d701) xvf0Var, (com.yandex.go.universal_qr_scanner.experiments.config.e) ((on11) xvf0Var2).get());
            case 14:
                return new UserInfoProfileView((Context) xvf0Var3.get(), (qn21) ((rsn0) xvf0Var2).get(), (pav) xvf0Var.get());
            case 15:
                return new k((com.yandex.delivery.utils.dialogmanager.impl.b) xvf0Var3.get(), (yuj0) xvf0Var.get(), (com.yandex.delivery.utils.dialogmanager.b) ((wjr0) xvf0Var2).get());
            case 16:
                return new rp21((at2) xvf0Var3.get(), (com.yandex.messaging.data.e) xvf0Var.get(), (np21) ((dby0) xvf0Var2).get());
            case 17:
                return new com.yandex.go.navigation.b((e5g) ((w500) xvf0Var2).get(), (wq21) xvf0Var3.get(), (fr21) xvf0Var.get());
            case 18:
                return new com.yandex.go.user_profile.fullscreen.router.a(i5m.a((gb0) xvf0Var), (bs21) ((d701) xvf0Var2).get(), xvf0Var3);
            case 19:
                return new f((c) xvf0Var3.get(), (b) xvf0Var.get(), (com.yandex.go.address.search.common.domain.interactor.a) ((im21) xvf0Var2).get());
            case 20:
                return new ru.yandex.logistics.sdk.order_validation.impl.data.a(i5m.a((wnw) xvf0Var2), (yz21) xvf0Var3.get(), (rz21) xvf0Var.get());
            case 21:
                return new cf11((yo40) ((s730) xvf0Var3).get(), (yo40) ((im21) xvf0Var).get(), (rfw0) ((jv21) xvf0Var2).get());
            case 22:
                return new ru.yandex.taxi.logistics.sdk.voiceforwarding.impl.c(i5m.a((wnw) xvf0Var2), (st2) xvf0Var3.get(), (AppVisibilitySubscriptionImpl) xvf0Var.get());
            case 23:
                return new ru.yandex.taxi.map.c((Context) xvf0Var3.get(), (ah00) xvf0Var.get(), (ShadowWrapperImpl) ((p7r0) xvf0Var2).get());
            case 24:
                return new ru.yandex.taxi.web.deeplink.b((tt2) xvf0Var3.get(), (ru.yandex.taxi.web.deeplink.a) xvf0Var.get(), (WebViewFromDeeplinkJsNativeApi) ((jv21) xvf0Var2).get());
            default:
                return new com.yandex.go.yb.qr.domain.c((u) xvf0Var3.get(), (hu51) ((yn51) xvf0Var2).get(), (com.yandex.go.navigation.screen.c) xvf0Var.get());
        }
    }

    public /* synthetic */ y0y0(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.d = v7pVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    public /* synthetic */ y0y0(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = v7pVar;
    }

    public /* synthetic */ y0y0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.c = xvf0Var3;
    }
}
