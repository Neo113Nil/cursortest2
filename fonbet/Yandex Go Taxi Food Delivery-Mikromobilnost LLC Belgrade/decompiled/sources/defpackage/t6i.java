package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.google.firebase.messaging.FirebaseMessaging;
import com.squareup.moshi.Moshi;
import com.yandex.go.delivery.tracking.objects_over_map.e;
import com.yandex.go.delivery.tracking.shortcuts.a;
import com.yandex.go.shortcuts.impl.interactors.m;
import com.yandex.go.superapp.orders.card.experiments.y;
import com.yandex.messenger.websdk.api.WebMessenger;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.delivery.pin.k;
import ru.yandex.taxi.logistics.ndd_map.domain.c;
import ru.yandex.taxi.logistics.sdk.delivery.edit.b;

/* loaded from: classes9.dex */
public final class t6i implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ t6i(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new b((st2) xvf0Var3.get(), (b7i) xvf0Var2.get(), (c7i) xvf0Var.get());
            case 1:
                return new e((ah00) xvf0Var3.get(), (xei) xvf0Var2.get(), (a) xvf0Var.get());
            case 2:
                return new k((wiq0) xvf0Var3.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var2.get(), (jgv) xvf0Var.get());
            case 3:
                return new apf((lp00) xvf0Var3.get(), (ru.yandex.taxi.map_common.map.utils.a) xvf0Var2.get(), (ah00) xvf0Var.get());
            case 4:
                return new com.yandex.go.delivery.deeplink.b((fx60) xvf0Var3.get(), i5m.a(xvf0Var2), (c) xvf0Var.get());
            case 5:
                return new jb7(10, (rh41) xvf0Var3.get(), (rs2) xvf0Var2.get(), (f420) xvf0Var.get());
            case 6:
                return new ru.yandex.taxi.delivery.web.b((nwh) xvf0Var3.get(), (pwy0) xvf0Var2.get(), (gf41) xvf0Var.get());
            case 7:
                return new zbj((Context) xvf0Var3.get(), (tt2) xvf0Var2.get(), (ac20) xvf0Var.get());
            case 8:
                return new jcj((wnt) xvf0Var3.get(), i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 9:
                return new mrj(0, (zuj0) xvf0Var3.get(), (k7x0) xvf0Var2.get(), (cda0) xvf0Var.get());
            case 10:
                return new com.yandex.go.promocodes.base.impl.discounts.domain.interactors.b((zuj0) xvf0Var3.get(), (nni0) xvf0Var2.get(), (lni0) xvf0Var.get());
            case 11:
                return new com.yandex.go.flex.main_screen.interactors.b((tt2) xvf0Var3.get(), (ajr) xvf0Var2.get(), (com.yandex.go.flex.main_screen.interactors.a) xvf0Var.get());
            case 12:
                return new com.yandex.go.mainscreen.superapp.impl.header.presentation.drawer.a((rqo) xvf0Var3.get(), (com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.a) xvf0Var2.get(), (Context) xvf0Var.get());
            case 13:
                return new com.yandex.go.drive.vertical.router.a(xvf0Var3, (i6r) xvf0Var2.get(), (com.yandex.go.route.interactor.b) xvf0Var.get());
            case 14:
                return new com.yandex.go.dynamic.impl.domain.interactror.a((tse) xvf0Var3.get(), (g7n) xvf0Var2.get(), (g) xvf0Var.get());
            case 15:
                return new com.yandex.go.dynamic.impl.b((Context) xvf0Var3.get(), (tt2) xvf0Var2.get(), (g7n) xvf0Var.get());
            case 16:
                return new nfh((Context) xvf0Var3.get(), (com.yandex.go.splash.dynamic.a) xvf0Var2.get(), (h9n) xvf0Var.get());
            case 17:
                return new ru.yandex.taxi.experiments.superapp.a((po21) xvf0Var3.get(), (m) xvf0Var2.get(), (abf0) xvf0Var.get());
            case 18:
                return new com.yandex.go.order.ui.presentation.item_type.eats_order.mappers.timeline.a((k7x0) xvf0Var3.get(), (y) xvf0Var2.get(), (d501) xvf0Var.get());
            case 19:
                return new ru.yandex.taxi.settings.main.b((ru.yandex.taxi.settings.email.a) xvf0Var3.get(), (com.yandex.go.lifecycle.a) xvf0Var2.get(), xvf0Var);
            case 20:
                return new com.yandex.go.mainscreen.superapp.impl.foundation.domain.e((com.yandex.go.route.interactor.b) xvf0Var3.get(), (com.yandex.go.zone.interactors.b) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 21:
                return new m5o((at2) xvf0Var3.get(), (Moshi) xvf0Var2.get(), (x22) xvf0Var.get());
            case 22:
                return new ru.yandex.taxi.adjust.a((ru.yandex.taxi.credentials.e) xvf0Var3.get(), (tse) xvf0Var2.get(), (Lifecycle) xvf0Var.get());
            case 23:
                return new zsa(15, (kdn) xvf0Var3.get(), i5m.a(xvf0Var2), (xku0) xvf0Var.get());
            case 24:
                return new b4p((wnt) xvf0Var3.get(), (f) xvf0Var2.get(), (o3h) xvf0Var.get());
            case 25:
                return new m9p((WebMessenger) xvf0Var3.get(), (FragmentActivity) xvf0Var2.get(), (w030) xvf0Var.get());
            case 26:
                return new com.yandex.go.fallback_experiment.a((com.yandex.go.route.interactor.b) xvf0Var3.get(), (po21) xvf0Var2.get(), i5m.a(xvf0Var));
            case 27:
                return new z9p((lx4) xvf0Var3.get(), (sh41) xvf0Var2.get(), (y9p) xvf0Var.get());
            case 28:
                return new ru.yandex.taxi.vendor_api.google.push.a((wjp) xvf0Var3.get(), (FirebaseMessaging) xvf0Var2.get(), (ujp) xvf0Var.get());
            default:
                return new com.yandex.go.feedback_common.services.b((Context) xvf0Var3.get(), (wnt) xvf0Var2.get(), (tt2) xvf0Var.get());
        }
    }
}
