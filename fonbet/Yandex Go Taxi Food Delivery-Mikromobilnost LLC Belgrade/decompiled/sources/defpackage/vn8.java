package defpackage;

import android.view.ViewGroup;
import com.yandex.go.payments.paymentlist.ui.PaymentMethodChooserView;
import com.yandex.go.payments.shared.members.cardselector.CardSelectorView;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes13.dex */
public final class vn8 implements rn8 {
    public final /* synthetic */ CardSelectorView a;

    public vn8(CardSelectorView cardSelectorView) {
        this.a = cardSelectorView;
    }

    @Override // defpackage.rn8
    public final void E() {
        yes0 yes0Var = SimpleSpinnerModalView.Companion;
        CardSelectorView cardSelectorView = this.a;
        ViewGroup viewGroup = (ViewGroup) cardSelectorView.getRootView();
        yes0Var.getClass();
        yes0.b(viewGroup);
        cardSelectorView.requestFocus();
    }

    @Override // defpackage.rn8
    public final void l0() {
        yes0 yes0Var = SimpleSpinnerModalView.Companion;
        ViewGroup viewGroup = (ViewGroup) this.a.getRootView();
        yes0Var.getClass();
        yes0.d(viewGroup, null);
    }

    @Override // defpackage.rn8
    public final void x(gca0 gca0Var) {
        PaymentMethodChooserView paymentMethodChooserView;
        paymentMethodChooserView = this.a.paymentChooser;
        paymentMethodChooserView.setUIState(gca0Var.a);
    }
}
