package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.squareup.moshi.Moshi;
import com.yandex.go.navigator.domain.o;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.navigator.notifications.cartech.b;
import com.yandex.go.taxi.order.change.common.domain.c;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.input.bricks.AuthorizationWithoutPhone;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.internal.view.chat.ChatSearchToolbarBrick;
import com.yandex.messaging.internal.view.input.selection.SelectedMessagesPanel;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.model.data.AdditionalSettings;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.fragment.preorder.f;
import ru.yandex.taxi.location.autolocation.a;
import ru.yandex.taxi.preorder.source.domain.g;
import ru.yandex.taxi.preorder.summary.solid.interactors.s;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes15.dex */
public final class rs0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public /* synthetic */ rs0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
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
        xvf0 xvf0Var2 = this.f;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.c;
        xvf0 xvf0Var5 = this.b;
        switch (i) {
            case 0:
                return new qs0((pt0) xvf0Var5.get(), (f4l0) xvf0Var4.get(), (cu0) xvf0Var3.get(), (wt0) xvf0Var.get(), (oy60) xvf0Var2.get());
            case 1:
                return new f((dy0) xvf0Var5.get(), (a) xvf0Var4.get(), (ru.yandex.taxi.statebar.controller.a) xvf0Var3.get(), (x8z) xvf0Var.get(), (zuj0) xvf0Var2.get());
            case 2:
                return new com.yandex.go.navigator.alt_select.a((t) xvf0Var5.get(), (par) xvf0Var4.get(), (hbp0) xvf0Var3.get(), (b) xvf0Var.get(), (re50) xvf0Var2.get());
            case 3:
                return new com.yandex.go.navigator.a((ah00) xvf0Var5.get(), (po21) xvf0Var4.get(), (lc50) xvf0Var3.get(), (o) xvf0Var.get(), (uyw) xvf0Var2.get());
            case 4:
                return new AuthorizationWithoutPhone((Activity) xvf0Var5.get(), (pu31) xvf0Var4.get(), (an90) xvf0Var3.get(), (SelectedMessagesPanel) xvf0Var.get(), (ChatInputHeightState) xvf0Var2.get());
            case 5:
                return new yo3((Looper) xvf0Var5.get(), (kdf0) xvf0Var4.get(), (yi3) xvf0Var3.get(), (xqi0) xvf0Var.get(), (rj21) xvf0Var2.get());
            case 6:
                return new up4((Context) xvf0Var5.get(), (kl60) xvf0Var4.get(), (pcy) xvf0Var3.get(), (ConsoleLoggingMode) xvf0Var.get(), (rwo) xvf0Var2.get());
            case 7:
                return new cb6((o1b0) xvf0Var5.get(), (n5t0) xvf0Var4.get(), (Moshi) xvf0Var3.get(), (x22) xvf0Var.get(), (at2) xvf0Var2.get());
            case 8:
                return new c((tt2) xvf0Var5.get(), (n20) xvf0Var4.get(), (com.yandex.go.taxi.order.popup.b) xvf0Var3.get(), this.e, (oep0) xvf0Var2.get());
            case 9:
                return new ng9((wiq0) xvf0Var5.get(), (dqe0) xvf0Var4.get(), (tq1) xvf0Var3.get(), (c4r0) xvf0Var.get(), (c8r) xvf0Var2.get());
            case 10:
                return new com.yandex.go.chargers.order.active.f((Context) xvf0Var5.get(), (pav) xvf0Var4.get(), (k7x0) xvf0Var3.get(), (e) xvf0Var.get(), (ru.yandex.taxi.widget.c) xvf0Var2.get());
            case 11:
                return new i4b((naz0) xvf0Var5.get(), (fxj0) xvf0Var4.get(), (k020) xvf0Var3.get(), (wff0) xvf0Var.get(), (x22) xvf0Var2.get());
            case 12:
                return new s4b((pk3) xvf0Var5.get(), (jn3) xvf0Var4.get(), (oo90) xvf0Var3.get(), (zm90) xvf0Var.get(), (rz10) xvf0Var2.get());
            case 13:
                return new com.yandex.messaging.domain.botrequest.a((kse) xvf0Var5.get(), (q6b) xvf0Var4.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var3.get(), (i720) xvf0Var.get(), (Moshi) xvf0Var2.get());
            case 14:
                return new s7b();
            case 15:
                return new u7b((naz0) xvf0Var5.get(), (k020) xvf0Var4.get(), (n5t0) xvf0Var3.get(), (lqo) xvf0Var.get(), (wff0) xvf0Var2.get());
            case 16:
                return new ChatSearchToolbarBrick((Activity) xvf0Var5.get(), (cwp0) xvf0Var4.get(), (pu31) xvf0Var3.get(), (p4t) xvf0Var.get(), (ChatRequest) xvf0Var2.get());
            case 17:
                return new ebb((k020) xvf0Var5.get(), (at2) xvf0Var4.get(), (o1b0) xvf0Var3.get(), (ui20) xvf0Var.get(), (fbb) xvf0Var2.get());
            case 18:
                return new g((yit0) xvf0Var5.get(), (srj0) xvf0Var4.get(), (AddressResolveRepository) xvf0Var3.get(), (ket0) xvf0Var.get(), (pfb) xvf0Var2.get());
            case 19:
                return new s((tt2) xvf0Var5.get(), (noe) xvf0Var4.get(), (wiq0) xvf0Var3.get(), (com.yandex.go.route.interactor.c) xvf0Var.get(), (com.yandex.go.route.interactor.b) xvf0Var2.get());
            case 20:
                return new gif((com.yandex.go.navigation.screen.c) xvf0Var5.get(), (c9l0) xvf0Var4.get(), (fif) xvf0Var3.get(), (zqz0) xvf0Var.get(), (biv0) xvf0Var2.get());
            case 21:
                return new tuh((wiq0) xvf0Var5.get(), (wt90) xvf0Var4.get(), (uq1) xvf0Var3.get(), (ut90) xvf0Var.get(), (ru.yandex.taxi.delivery.experiments.e) xvf0Var2.get());
            case 22:
                return new com.yandex.go.places.analytics.organization.card.a((lx4) xvf0Var5.get(), (wbc0) xvf0Var4.get(), (hit) xvf0Var3.get(), (tt2) xvf0Var.get(), (oy) xvf0Var2.get());
            case 23:
                return new ru.yandex.taxi.discovery.a((ney) xvf0Var5.get(), (ah00) xvf0Var4.get(), (jyx) xvf0Var3.get(), (ru.yandex.taxi.multiorder.e) xvf0Var.get(), (ywj) xvf0Var2.get());
            case 24:
                return new com.yandex.messaging.domain.poll.a((Context) xvf0Var5.get(), (kse) xvf0Var4.get(), (el21) xvf0Var3.get(), (w3c) xvf0Var.get(), (arg) xvf0Var2.get());
            case 25:
                return new com.yandex.go.drive.vertical.interactor.e((zuj0) xvf0Var5.get(), (ru.yandex.taxi.am.g) xvf0Var4.get(), (tt2) xvf0Var3.get(), (wiq0) xvf0Var.get(), (pwy0) xvf0Var2.get());
            case 26:
                pcy pcyVar = (pcy) xvf0Var5.get();
                return new nf4((Context) xvf0Var3.get(), (Payer) xvf0Var.get(), ((AdditionalSettings) xvf0Var2.get()).getExchangeOauthToken(), pcyVar.a.getIsDebug(), (rwo) xvf0Var4.get());
            case 27:
                return new igs((rgs) xvf0Var5.get(), (z22) xvf0Var4.get(), (hk3) xvf0Var3.get(), (com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.core.network.auth.a) xvf0Var.get(), (wo90) xvf0Var2.get());
            case 28:
                return new com.yandex.messaging.domain.b((w5t) xvf0Var5.get(), (p4t) xvf0Var4.get(), (com.yandex.messaging.domain.personal.a) xvf0Var3.get(), (lqo) xvf0Var.get(), (MessengerEnvironment) xvf0Var2.get());
            default:
                Payer payer = (Payer) xvf0Var5.get();
                Merchant merchant = (Merchant) xvf0Var4.get();
                return new ps90(znb1.h(payer), new ag1(merchant.getServiceToken(), 6), (nhj) xvf0Var3.get(), ((Integer) xvf0Var.get()).intValue(), (rwo) xvf0Var2.get());
        }
    }

    public /* synthetic */ rs0(Object obj, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }
}
