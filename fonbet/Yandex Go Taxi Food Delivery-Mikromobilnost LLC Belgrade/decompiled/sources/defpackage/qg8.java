package defpackage;

import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.datasource.bind.interfaces.CardButtonTitle;
import com.yandex.payment.sdk.ui.CardInput$State;

/* loaded from: classes2.dex */
public abstract class qg8 {
    public final rwo a;
    public bg8 c;
    public g98 d;
    public ol41 e;
    public on8 f;
    public final pg8 b = new pg8(0, this);
    public CardInput$State g = CardInput$State.CARD_NUMBER;

    public qg8(rwo rwoVar) {
        this.a = rwoVar;
    }

    public final void a(bg8 bg8Var, g98 g98Var, ol41 ol41Var, on8 on8Var) {
        this.c = bg8Var;
        bg8Var.setOnStateChangeListener(new cx7(10, this));
        g98Var.e(new c98(CardButtonTitle.ShowNext));
        g98Var.g(new rk6(22, this));
        this.d = g98Var;
        this.e = ol41Var;
        on8Var.b(jn8.a);
        this.f = on8Var;
    }

    public abstract void b();

    public final void c(PaymentKitError paymentKitError) {
        ol41 ol41Var = this.e;
        if (ol41Var != null) {
            ol41Var.c(kl41.a);
        }
        on8 on8Var = this.f;
        if (on8Var != null) {
            on8Var.b(new in8(paymentKitError));
        }
    }

    public f98 d(CardInput$State cardInput$State) {
        int i = og8.a[cardInput$State.ordinal()];
        if (i == 1) {
            return new d98(CardButtonTitle.ShowNext);
        }
        if (i == 2) {
            return new d98(CardButtonTitle.ShowProcess);
        }
        if (i == 3) {
            return new c98(CardButtonTitle.ShowNext);
        }
        if (i == 4) {
            return new c98(CardButtonTitle.ShowProcess);
        }
        w511.b();
        return null;
    }
}
