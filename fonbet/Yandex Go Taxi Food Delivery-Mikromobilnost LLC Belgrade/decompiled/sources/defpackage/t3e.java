package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.yandex.go.payments.cards.domain.exception.OnCardAddingErrorException;
import com.yandex.go.payments.cards.ui.AddCardStatus;
import com.yandex.go.payments.cards.ui.ConfirmPaymentMethodViewImpl;
import com.yandex.go.payments.domain.exception.CardExpiredException;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.payment_options.model.PaymentIconType;
import ru.yandex.taxi.payment_options.model.pci_dss.CardType;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes13.dex */
public final class t3e implements f3e {
    public final /* synthetic */ ConfirmPaymentMethodViewImpl a;

    public t3e(ConfirmPaymentMethodViewImpl confirmPaymentMethodViewImpl) {
        this.a = confirmPaymentMethodViewImpl;
    }

    @Override // defpackage.f3e
    public final void Ke(int i) {
        Activity activity;
        ConfirmPaymentMethodViewImpl confirmPaymentMethodViewImpl = this.a;
        activity = confirmPaymentMethodViewImpl.getActivity();
        if (activity == null) {
            return;
        }
        new AlertDialog(activity).setMessage(c.v(confirmPaymentMethodViewImpl, dwh0.add_credit_card_incorrect_amt, kyh0.add_credit_card_incorrect_amt_fallback, i, Integer.valueOf(i))).setDismissListener(new v4a(20, this)).setPositiveButton(kyh0.add_credit_card_random_amt_retry).show();
    }

    @Override // defpackage.f3e
    public final void V9() {
        ConfirmPaymentMethodViewImpl confirmPaymentMethodViewImpl = this.a;
        confirmPaymentMethodViewImpl.inProgress = false;
        h(confirmPaymentMethodViewImpl.getContext().getString(kyh0.change_payment_error));
    }

    @Override // defpackage.f3e
    public final void W6() {
        this.a.inProgress = false;
    }

    public final void h(String str) {
        View view;
        a350 a350Var;
        View view2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        ConfirmPaymentMethodViewImpl confirmPaymentMethodViewImpl = this.a;
        confirmPaymentMethodViewImpl.inProgress = false;
        view = confirmPaymentMethodViewImpl.spinnerLayout;
        cma1.M(view);
        a350Var = confirmPaymentMethodViewImpl.confirmPaymentViewHolder;
        if (a350Var != null) {
            cma1.M(a350Var.a);
        }
        view2 = confirmPaymentMethodViewImpl.statusLayout;
        cma1.J(view2);
        textView = confirmPaymentMethodViewImpl.confirmButton;
        cma1.J(textView);
        textView2 = confirmPaymentMethodViewImpl.confirmButton;
        textView2.setText(mzh0.common_got_it);
        textView3 = confirmPaymentMethodViewImpl.statusTitleView;
        textView3.setText(str);
        textView4 = confirmPaymentMethodViewImpl.statusTitleView;
        textView4.post(new ce0(textView4, 6));
        textView5 = confirmPaymentMethodViewImpl.statusTextView;
        textView5.setText((CharSequence) null);
    }

    @Override // defpackage.f3e
    public final void i3(Throwable th) {
        ConfirmPaymentMethodViewImpl confirmPaymentMethodViewImpl = this.a;
        confirmPaymentMethodViewImpl.inProgress = false;
        if (th instanceof OnCardAddingErrorException) {
            String message = ((OnCardAddingErrorException) th).getMessage();
            if (message == null) {
                message = "";
            }
            h(message);
        } else if (th instanceof CardExpiredException) {
            h(confirmPaymentMethodViewImpl.getContext().getString(kyh0.add_credit_card_is_expired_error));
        } else {
            h(confirmPaymentMethodViewImpl.getContext().getString(kyh0.verify_payment_fail));
        }
        jst.e.k(th, "boundCard");
        confirmPaymentMethodViewImpl.addCardStatus = AddCardStatus.FAILED;
    }

    @Override // defpackage.f3e
    public final void rf(boolean z) {
        TextView textView;
        View view;
        a350 a350Var;
        View view2;
        TextView textView2;
        TextView textView3;
        View view3;
        ConfirmPaymentMethodViewImpl confirmPaymentMethodViewImpl = this.a;
        confirmPaymentMethodViewImpl.inProgress = true;
        textView = confirmPaymentMethodViewImpl.confirmButton;
        textView.setVisibility(8);
        view = confirmPaymentMethodViewImpl.statusLayout;
        view.setVisibility(8);
        a350Var = confirmPaymentMethodViewImpl.confirmPaymentViewHolder;
        if (a350Var != null && (view3 = a350Var.a) != null) {
            view3.setVisibility(8);
        }
        view2 = confirmPaymentMethodViewImpl.spinnerLayout;
        cma1.J(view2);
        textView2 = confirmPaymentMethodViewImpl.progressText;
        textView2.setText(z ? kyh0.verify_payment_progress_verify : kyh0.verify_payment_progress_start);
        textView3 = confirmPaymentMethodViewImpl.progressText;
        textView3.post(new ce0(textView3, 6));
    }

    @Override // defpackage.f3e
    public final void y6(qf8 qf8Var) {
        n3e orCreateConfirmCvnViewHolder;
        TextView textView;
        View view;
        ConfirmPaymentMethodViewImpl confirmPaymentMethodViewImpl = this.a;
        confirmPaymentMethodViewImpl.inProgress = false;
        orCreateConfirmCvnViewHolder = confirmPaymentMethodViewImpl.getOrCreateConfirmCvnViewHolder();
        ListItemComponent listItemComponent = orCreateConfirmCvnViewHolder.i;
        View view2 = orCreateConfirmCvnViewHolder.a;
        String str = qf8Var.b;
        if (str == null) {
            str = "";
        }
        se8 se8Var = orCreateConfirmCvnViewHolder.f;
        String str2 = qf8Var.a;
        listItemComponent.setTitle(se8Var.c(str) + " " + se8.a(str2));
        listItemComponent.setSubtitle(qf8Var.c);
        PaymentIconType paymentIconType = qf8Var.d;
        bia0 bia0Var = orCreateConfirmCvnViewHolder.e;
        Context context = view2.getContext();
        ((qy90) bia0Var).getClass();
        listItemComponent.setLeadImage(tje.y(qy90.b(paymentIconType), context));
        CardType.Companion.getClass();
        int b = mp8.b(str).b();
        orCreateConfirmCvnViewHolder.k.e = b;
        orCreateConfirmCvnViewHolder.h.setText(b == 3 ? kyh0.confirm_card_cvn_description : kyh0.confirm_card_4dbc_description);
        textView = confirmPaymentMethodViewImpl.confirmButton;
        textView.setVisibility(8);
        view = confirmPaymentMethodViewImpl.spinnerLayout;
        cma1.M(view);
        cma1.J(view2).setListener(new AnimUtils$AnimationEndListener(new v4a(21, orCreateConfirmCvnViewHolder)));
        confirmPaymentMethodViewImpl.showToolbar(confirmPaymentMethodViewImpl.getContext().getString(kyh0.confirm_card_toolbar_title));
    }

    @Override // defpackage.f3e
    public final void z2(int i) {
        ConfirmPaymentMethodViewImpl confirmPaymentMethodViewImpl = this.a;
        confirmPaymentMethodViewImpl.inProgress = false;
        h(confirmPaymentMethodViewImpl.getContext().getString(i == 4 ? kyh0.confirm_card_4dbc_description : kyh0.confirm_card_cvn_description));
        confirmPaymentMethodViewImpl.addCardStatus = AddCardStatus.FAILED_CVV_MISSING;
    }

    @Override // defpackage.f3e
    public final void z6() {
        a350 orCreateRandomAmountViewHolder;
        TextView textView;
        View view;
        ConfirmPaymentMethodViewImpl confirmPaymentMethodViewImpl = this.a;
        confirmPaymentMethodViewImpl.inProgress = false;
        orCreateRandomAmountViewHolder = confirmPaymentMethodViewImpl.getOrCreateRandomAmountViewHolder();
        orCreateRandomAmountViewHolder.g();
        textView = confirmPaymentMethodViewImpl.confirmButton;
        textView.setVisibility(8);
        view = confirmPaymentMethodViewImpl.spinnerLayout;
        cma1.M(view);
        cma1.J(orCreateRandomAmountViewHolder.a).setListener(new AnimUtils$AnimationEndListener(new v4a(19, orCreateRandomAmountViewHolder)));
        confirmPaymentMethodViewImpl.showToolbar(confirmPaymentMethodViewImpl.getContext().getString(kyh0.verify_payment_random_amt_title));
    }
}
