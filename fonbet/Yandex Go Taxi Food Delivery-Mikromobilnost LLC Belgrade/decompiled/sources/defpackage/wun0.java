package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.scooters.insurance.data.b;
import com.yandex.go.scooters.insurance.suggest.v2.g;
import com.yandex.go.scooters.mosru.data.ScootersMosRuApi;
import com.yandex.go.scooters.mosru.data.a;
import com.yandex.go.scooters.passes.domain.i;
import com.yandex.go.scooters.qr.unavailable_scooter.ui.d;
import com.yandex.go.taxi.order.view.l;
import com.yandex.messaging.ChatRequest;
import ru.yandex.taxi.scooters.data.q;
import ru.yandex.taxi.scooters.domain.s;
import ru.yandex.taxi.scooters.presentation.common.ui.preview.ScootersVehiclePreviewView;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class wun0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ wun0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public static wun0 a(xvf0 xvf0Var, c660 c660Var, xvf0 xvf0Var2) {
        return new wun0(xvf0Var, c660Var, xvf0Var2, 18);
    }

    public static wun0 b(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        return new wun0(xvf0Var, xvf0Var2, xvf0Var3, 17);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new g((xdf) xvf0Var3.get(), (c) xvf0Var2.get(), (b) xvf0Var.get());
            case 1:
                return new a((com.yandex.go.scooters.mosru.mapper.a) xvf0Var3.get(), (ScootersMosRuApi) xvf0Var2.get(), (ru.yandex.taxi.scooters.data.a) xvf0Var.get());
            case 2:
                return new com.yandex.go.scooters.offers.v2.domain.mapper.b((k7x0) xvf0Var3.get(), (e) xvf0Var2.get(), (q4o0) xvf0Var.get());
            case 3:
                return new ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.a((rqo) xvf0Var3.get(), (q) xvf0Var2.get(), (nyn0) xvf0Var.get());
            case 4:
                return new xeo0((Context) xvf0Var3.get(), (tt2) xvf0Var2.get(), (bia0) xvf0Var.get());
            case 5:
                return new i((e2e0) xvf0Var3.get(), (com.yandex.go.scooters.passes.data.a) xvf0Var2.get(), (com.yandex.go.scooters.payments.domain.a) xvf0Var.get());
            case 6:
                return new com.yandex.go.scooters.passes.active.domain.e((com.yandex.go.scooters.data.g) xvf0Var3.get(), (nro0) xvf0Var2.get(), (lbn0) xvf0Var.get());
            case 7:
                return new com.yandex.go.scooters.photocontrol.data.a((rqo) xvf0Var3.get(), (tst) xvf0Var2.get(), (k421) xvf0Var.get());
            case 8:
                return new d((k7x0) xvf0Var2.get(), (e) xvf0Var.get());
            case 9:
                e2e0 e2e0Var = (e2e0) xvf0Var3.get();
                return new com.yandex.go.scooters.subscription.domain.d(e2e0Var, (vyo0) xvf0Var.get());
            case 10:
                return new com.yandex.go.scooters.passes.super_pass.grace.state_bar.a(xvf0Var3, (h0p0) xvf0Var2.get(), (k0p0) xvf0Var.get());
            case 11:
                return new t((h7p0) xvf0Var3.get(), (Context) xvf0Var2.get(), (w030) xvf0Var.get());
            case 12:
                return new ScootersVehiclePreviewView((Context) xvf0Var3.get(), (c0n0) xvf0Var2.get(), (wro0) xvf0Var.get());
            case 13:
                return new s((ru.yandex.taxi.walkroute.a) xvf0Var3.get(), (ru.yandex.taxi.scooters.data.g) xvf0Var2.get(), (pwy0) xvf0Var.get());
            case 14:
                return new xhp0((goe) xvf0Var3.get(), (a2y) xvf0Var2.get(), (uip0) xvf0Var.get());
            case 15:
                return new s6k0((cwx0) xvf0Var3.get(), (pd61) xvf0Var2.get(), (tmp0) xvf0Var.get());
            case 16:
                return new bmp0((xm00) xvf0Var3.get(), (cv00) xvf0Var2.get(), (b2l0) xvf0Var.get());
            case 17:
                return new com.yandex.go.sdk_registry.b((com.yandex.go.sdk_registry.runtime.b) xvf0Var3.get(), (Lifecycle) xvf0Var2.get(), (tse) xvf0Var.get());
            case 18:
                return new com.yandex.go.sdk_registry.c((com.yandex.go.sdk_registry.runtime.b) xvf0Var3.get(), (Lifecycle) xvf0Var2.get(), (tse) xvf0Var.get());
            case 19:
                return new amp0((iup0) xvf0Var3.get(), (n20) xvf0Var2.get(), (l) xvf0Var.get());
            case 20:
                return new qdq0((d770) xvf0Var3.get(), (g8a0) xvf0Var2.get(), (ycq0) xvf0Var.get());
            case 21:
                return new com.yandex.payment.sdk.flex.actions.a((lz40) xvf0Var3.get(), (lz40) xvf0Var2.get(), (tse) xvf0Var.get());
            case 22:
                return new com.yandex.messaging.internal.textsuggest.d((ChatRequest) xvf0Var3.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var2.get(), (xdf0) xvf0Var.get());
            case 23:
                return new amp0((tt2) xvf0Var3.get(), (df50) xvf0Var2.get(), (com.yandex.go.navigator.settings.debug_panel.domain.b) xvf0Var.get());
            case 24:
                return new pjs0((x22) xvf0Var3.get(), (mqg) xvf0Var2.get(), (at2) xvf0Var.get());
            case 25:
                return new e6t0((arv0) xvf0Var3.get(), (xcv0) xvf0Var2.get(), (wiq0) xvf0Var.get());
            case 26:
                return new com.yandex.go.navigator.address.e((pyv) xvf0Var3.get(), (re50) xvf0Var2.get(), (pwy0) xvf0Var.get());
            case 27:
                return new ru.yandex.taxi.preorder.source.domain.q((git0) xvf0Var3.get(), (com.yandex.go.route.interactor.c) xvf0Var2.get(), (po21) xvf0Var.get());
            case 28:
                return new ru.yandex.taxi.preorder.source.mode.interactor.d((tt2) xvf0Var3.get(), (jgt0) xvf0Var2.get(), (fy01) xvf0Var.get());
            default:
                return new otg((xi00) xvf0Var3.get(), (ah00) xvf0Var2.get(), (sit) xvf0Var.get());
        }
    }
}
