package defpackage;

import com.yandex.go.payments.paymentlist.ui.PaymentMethodChooserUIState$ShowAddCardAtBottomConfig;
import com.yandex.go.payments.summary.ui.PaymentMethodsListModalView;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes8.dex */
public final class sba0 implements jca0 {
    public final /* synthetic */ PaymentMethodsListModalView a;

    public sba0(PaymentMethodsListModalView paymentMethodsListModalView) {
        this.a = paymentMethodsListModalView;
    }

    @Override // defpackage.r65
    public final void c7(String str) {
        this.a.announceForAccessibility(str);
    }

    @Override // defpackage.hz20
    public final void dismiss() {
        this.a.dismiss();
    }

    @Override // defpackage.r65
    public final void scrollToTop() {
        PaymentMethodsListModalView paymentMethodsListModalView = this.a;
        paymentMethodsListModalView.post(new op70(21, paymentMethodsListModalView));
    }

    @Override // defpackage.gkf0
    public final void setProgressing(boolean z) {
        PaymentMethodsListModalView paymentMethodsListModalView = this.a;
        if (z) {
            SimpleSpinnerModalView.Companion.getClass();
            yes0.d(paymentMethodsListModalView, null);
        } else {
            SimpleSpinnerModalView.Companion.getClass();
            yes0.b(paymentMethodsListModalView);
            paymentMethodsListModalView.requestFocus();
        }
    }

    @Override // defpackage.r65
    public final void x(gca0 gca0Var) {
        m4a0 m4a0Var = gca0Var.a;
        PaymentMethodsListModalView paymentMethodsListModalView = this.a;
        paymentMethodsListModalView.getPaymentMethodChooserView().setUIState(m4a0Var);
        boolean z = false;
        boolean z2 = m4a0Var.c == PaymentMethodChooserUIState$ShowAddCardAtBottomConfig.VISIBLE;
        if (m4a0Var != m4a0.h && !(gca0Var.a.g instanceof l4m)) {
            z = true;
        }
        paymentMethodsListModalView.configureButtonDone(z, m4a0Var.g);
        paymentMethodsListModalView.configureChooserView(z2, z);
        paymentMethodsListModalView.configureToolbar(gca0Var);
    }
}
