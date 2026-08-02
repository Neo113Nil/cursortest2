package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.inapp_calls.experiment.q;
import com.yandex.go.loyalty.impl.common.domain.h;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.overdraft.domain.i;
import com.yandex.go.payments.domain.y;
import com.yandex.go.payments.paymentlist.domain.j;
import com.yandex.go.pickup_from_photo.experiment.p;
import com.yandex.go.repositories.e;
import com.yandex.go.route.interactor.b;
import com.yandex.go.user_profile.fullscreen.models.l;
import com.yandex.go.user_profile.main_menu.profile.repository.d;
import com.yandex.go.yb.data.u;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.m0;
import ru.yandex.taxi.logistics.sdk.k;
import ru.yandex.taxi.provider.a;

/* loaded from: classes9.dex */
public final class yly implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;

    public /* synthetic */ yly(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.g;
        xvf0 xvf0Var2 = this.f;
        xvf0 xvf0Var3 = this.e;
        xvf0 xvf0Var4 = this.d;
        xvf0 xvf0Var5 = this.c;
        xvf0 xvf0Var6 = this.b;
        switch (i) {
            case 0:
                return new xly(i5m.a(xvf0Var6), i5m.a(xvf0Var5), i5m.a(xvf0Var4), i5m.a(xvf0Var3), i5m.a(xvf0Var2), (wnt) xvf0Var.get());
            case 1:
                return new a((on2) xvf0Var6.get(), (zal0) xvf0Var5.get(), (qbl0) xvf0Var4.get(), (c) xvf0Var3.get(), (rbl0) xvf0Var2.get(), (ru.yandex.taxi.perf.screen.c) xvf0Var.get());
            case 2:
                return new k((tse) xvf0Var6.get(), (Context) xvf0Var5.get(), (uq1) xvf0Var4.get(), (k7x0) xvf0Var3.get(), (pav) xvf0Var2.get(), (w030) xvf0Var.get());
            case 3:
                return new h((acz) xvf0Var6.get(), (tse) xvf0Var5.get(), (o) xvf0Var4.get(), (n20) xvf0Var3.get(), (b) xvf0Var2.get(), (c) xvf0Var.get());
            case 4:
                return new m600((wq21) xvf0Var6.get(), (e) xvf0Var5.get(), (pwy0) xvf0Var4.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (g) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 5:
                return new com.yandex.go.user_profile.main_menu.profile.repository.a((ru.yandex.taxi.startup.launch.response.e) xvf0Var6.get(), (ru.yandex.taxi.profile.a) xvf0Var5.get(), (hm) xvf0Var4.get(), (pwy0) xvf0Var3.get(), (g) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 6:
                return new d((l) xvf0Var6.get(), (ru.yandex.taxi.startup.launch.response.e) xvf0Var5.get(), (ru.yandex.taxi.widget.c) xvf0Var4.get(), (ru.yandex.taxi.startup.launch.h) xvf0Var3.get(), (pdc) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 7:
                return new m110((c) xvf0Var6.get(), (ml00) xvf0Var5.get(), (ah00) xvf0Var4.get(), (kf00) xvf0Var3.get(), (n110) xvf0Var2.get(), (yit) xvf0Var.get());
            case 8:
                return new ru.yandex.taxi.messenger.notification.a(i5m.a(xvf0Var6), (x020) xvf0Var5.get(), (rs2) xvf0Var4.get(), (i120) xvf0Var3.get(), (s350) xvf0Var2.get(), (com.yandex.go.messenger_native.d) xvf0Var.get());
            case 9:
                return new o150((wff0) xvf0Var6.get(), (vse) xvf0Var5.get(), (lqo) xvf0Var4.get(), (SharedPreferences) xvf0Var3.get(), (Looper) xvf0Var2.get(), (com.yandex.messaging.data.e) xvf0Var.get());
            case 10:
                return new com.yandex.go.inapp_calls.interactor.b((Context) xvf0Var6.get(), (y72) xvf0Var5.get(), (q) xvf0Var4.get(), (xk60) xvf0Var3.get(), (o3h) xvf0Var2.get(), (njv) xvf0Var.get());
            case 11:
                return new ch60((Context) xvf0Var6.get(), (x22) xvf0Var5.get(), (dh60) xvf0Var4.get(), (Looper) xvf0Var3.get(), (SharedPreferences) xvf0Var2.get(), (SharedPreferences) xvf0Var.get());
            case 12:
                return new com.yandex.go.lifecycle.processor.e(i5m.a(xvf0Var6), (tt2) xvf0Var5.get(), (tse) xvf0Var4.get(), i5m.a(xvf0Var3), (com.yandex.go.lifecycle.a) xvf0Var2.get(), i5m.a(xvf0Var));
            case 13:
                tt2 tt2Var = (tt2) xvf0Var6.get();
                hit hitVar = (hit) xvf0Var5.get();
                return new i(tt2Var, hitVar, (aug) xvf0Var3.get(), (sz80) xvf0Var2.get(), (ql21) xvf0Var.get());
            case 14:
                return new m0((lx4) xvf0Var6.get(), (tt2) xvf0Var5.get(), (tse) xvf0Var4.get(), (acz) xvf0Var3.get(), (ep90) xvf0Var2.get(), (com.yandex.go.zone.repository.d) xvf0Var.get());
            case 15:
                return new no90((Application) xvf0Var6.get(), (u02) xvf0Var5.get(), (vo90) xvf0Var4.get(), (hqe) xvf0Var3.get(), (go90) xvf0Var2.get(), (ep90) xvf0Var.get());
            case 16:
                return new ru.yandex.taxi.order.view.b((fga0) xvf0Var6.get(), (xku0) xvf0Var5.get(), (zuj0) xvf0Var4.get(), (tma0) xvf0Var3.get(), (eq51) xvf0Var2.get(), (com.yandex.go.payments.common.a) xvf0Var.get());
            case 17:
                return new j((u) xvf0Var6.get(), (zuj0) xvf0Var5.get(), (eq51) xvf0Var4.get(), (znj) xvf0Var3.get(), (tma0) xvf0Var2.get(), (y) xvf0Var.get());
            case 18:
                return new jna0((wqd0) xvf0Var6.get(), (cu51) xvf0Var5.get(), (ey51) xvf0Var4.get(), (zw51) xvf0Var3.get(), (fx51) xvf0Var2.get(), (su51) xvf0Var.get());
            case 19:
                return new mob0((p) xvf0Var6.get(), (wiq0) xvf0Var5.get(), (g) xvf0Var4.get(), (c) xvf0Var3.get(), (qnb0) xvf0Var2.get(), (bob0) xvf0Var.get());
            case 20:
                ru.yandex.taxi.plus.sdk.badge.widget.a aVar = (ru.yandex.taxi.plus.sdk.badge.widget.a) xvf0Var6.get();
                c2d0 c2d0Var = (c2d0) xvf0Var5.get();
                n5c n5cVar = (n5c) xvf0Var4.get();
                gk4 gk4Var = (gk4) xvf0Var3.get();
                x2d0 x2d0Var = (x2d0) xvf0Var2.get();
                return new ijc0(aVar, c2d0Var.u, n5cVar, gk4Var, x2d0Var.e, (ljz0) xvf0Var.get());
            case 21:
                return new ru.yandex.taxi.logistics.postcard.presentation.c((ru.yandex.taxi.logistics.postcard.presentation.g) xvf0Var6.get(), i5m.a(xvf0Var5), (ru.yandex.taxi.logistics.sdk.postcard.presentation.b) xvf0Var4.get(), (c) xvf0Var3.get(), (tse) xvf0Var2.get(), (Lifecycle) xvf0Var.get());
            case 22:
                return new com.yandex.go.preload.e((kih) xvf0Var6.get(), (ru.yandex.taxi.startup.launch.h) xvf0Var5.get(), (bpe0) xvf0Var4.get(), (hdr) xvf0Var3.get(), (com.yandex.go.preload.a) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 23:
                return new v920((rqo) xvf0Var6.get(), (ycq0) xvf0Var5.get(), (g8a0) xvf0Var4.get(), (lw90) xvf0Var3.get(), (dqe0) xvf0Var2.get(), (chh) xvf0Var.get());
            case 24:
                return new ru.yandex.taxi.communications.activity.a((ru.yandex.taxi.launch.c) xvf0Var6.get(), (ru.yandex.taxi.jobs.b) xvf0Var5.get(), (tse) xvf0Var4.get(), (tt2) xvf0Var3.get(), (osf0) xvf0Var2.get(), i5m.a(xvf0Var));
            case 25:
                Context context = (Context) xvf0Var6.get();
                dne0 dne0Var = (dne0) xvf0Var5.get();
                rs2 rs2Var = (rs2) xvf0Var4.get();
                return new ofa0(context, dne0Var, rs2Var, (tst) xvf0Var.get());
            case 26:
                return new vzi0((com.yandex.messaging.domain.actions.a) xvf0Var6.get(), (com.yandex.messaging.internal.storage.folders.d) xvf0Var5.get(), (el21) xvf0Var4.get(), (xw50) xvf0Var3.get(), (zwr) xvf0Var2.get(), (kse) xvf0Var.get());
            case 27:
                return new c0j0((com.yandex.messaging.domain.actions.a) xvf0Var6.get(), (k020) xvf0Var5.get(), (mxb0) xvf0Var4.get(), (el21) xvf0Var3.get(), (xw50) xvf0Var2.get(), (kse) xvf0Var.get());
            case 28:
                return new r5k0((Lifecycle) xvf0Var6.get(), (tse) xvf0Var5.get(), (vpr0) xvf0Var4.get(), (q5k0) xvf0Var3.get(), (y4k0) xvf0Var2.get(), (a3v) xvf0Var.get());
            default:
                return new arn0((tt2) xvf0Var6.get(), (tse) xvf0Var5.get(), i5m.a(xvf0Var4), i5m.a(xvf0Var3), (brn0) xvf0Var2.get(), i5m.a(xvf0Var));
        }
    }
}
