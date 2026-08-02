package defpackage;

import android.os.Handler;
import com.yandex.payment.sdk.core.data.CardPaymentSystem;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.model.data.PreselectButtonState;
import com.yandex.payment.sdk.model.data.ResultScreenClosing;
import com.yandex.payment.sdk.ui.CardInput$State;

/* loaded from: classes2.dex */
public final class wve0 extends yr31 {
    public final ResultScreenClosing A;
    public PaymentMethod.Card E;
    public String F;
    public PreselectButtonState I;
    public final vv90 b;
    public final px90 c;
    public final gve0 w;
    public final boolean x;
    public final Handler y;
    public final tls z;
    public final dy40 B = new dy40();
    public final dy40 C = new dy40();
    public final dy40 D = new dy40();
    public CardPaymentSystem G = CardPaymentSystem.Unknown;
    public CardInput$State H = CardInput$State.CARD_NUMBER;

    public wve0(vv90 vv90Var, px90 px90Var, gve0 gve0Var, boolean z, Handler handler, tls tlsVar, ResultScreenClosing resultScreenClosing) {
        this.b = vv90Var;
        this.c = px90Var;
        this.w = gve0Var;
        this.x = z;
        this.y = handler;
        this.z = tlsVar;
        this.A = resultScreenClosing;
    }

    public final void W() {
        hve0 hve0Var;
        int i = uve0.a[this.H.ordinal()];
        dy40 dy40Var = this.C;
        if (i == 1) {
            dy40Var.l(new hve0(ryh0.paymentsdk_bind_card_next_button, null, null));
            return;
        }
        if (i == 2) {
            dy40Var.l(new ive0(ryh0.paymentsdk_bind_card_next_button, null, null));
            return;
        }
        boolean z = this.x;
        if (i == 3) {
            if (z) {
                int i2 = ryh0.paymentsdk_pay_title;
                PreselectButtonState preselectButtonState = this.I;
                Double valueOf = preselectButtonState != null ? Double.valueOf(preselectButtonState.getTotal()) : null;
                PreselectButtonState preselectButtonState2 = this.I;
                hve0Var = new hve0(i2, valueOf, preselectButtonState2 != null ? preselectButtonState2.getSubTotal() : null);
            } else {
                hve0Var = new hve0(ryh0.paymentsdk_bind_card_button, null, null);
            }
            dy40Var.l(hve0Var);
            return;
        }
        if (i != 4) {
            w511.b();
            return;
        }
        if (!z) {
            dy40Var.l(new ive0(ryh0.paymentsdk_bind_card_button, null, null));
            return;
        }
        PreselectButtonState preselectButtonState3 = this.I;
        if (preselectButtonState3 != null) {
            dy40Var.l(preselectButtonState3.getActive() ? new ive0(ryh0.paymentsdk_pay_title, Double.valueOf(preselectButtonState3.getTotal()), preselectButtonState3.getSubTotal()) : new hve0(ryh0.paymentsdk_pay_title, Double.valueOf(preselectButtonState3.getTotal()), preselectButtonState3.getSubTotal()));
        } else {
            dy40Var.l(new ive0(ryh0.paymentsdk_pay_title, null, null));
        }
    }
}
