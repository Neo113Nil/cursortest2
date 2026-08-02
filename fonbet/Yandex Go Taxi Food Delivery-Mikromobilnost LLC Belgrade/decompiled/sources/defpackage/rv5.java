package defpackage;

import android.widget.TextView;
import com.yandex.payment.sdk.ui.payment.sbp.BindSbpActivity;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;

/* loaded from: classes2.dex */
public final /* synthetic */ class rv5 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ BindSbpActivity b;

    public /* synthetic */ rv5(BindSbpActivity bindSbpActivity, int i) {
        this.a = i;
        this.b = bindSbpActivity;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        bqr0 activityViewModel_delegate$lambda$0;
        ay90 paymentComponent_delegate$lambda$0;
        TextView onAttachFragment$lambda$0;
        PaymentButtonView onAttachFragment$lambda$1;
        int i = this.a;
        BindSbpActivity bindSbpActivity = this.b;
        switch (i) {
            case 0:
                activityViewModel_delegate$lambda$0 = BindSbpActivity.activityViewModel_delegate$lambda$0(bindSbpActivity);
                return activityViewModel_delegate$lambda$0;
            case 1:
                paymentComponent_delegate$lambda$0 = BindSbpActivity.paymentComponent_delegate$lambda$0(bindSbpActivity);
                return paymentComponent_delegate$lambda$0;
            case 2:
                onAttachFragment$lambda$0 = BindSbpActivity.onAttachFragment$lambda$0(bindSbpActivity);
                return onAttachFragment$lambda$0;
            default:
                onAttachFragment$lambda$1 = BindSbpActivity.onAttachFragment$lambda$1(bindSbpActivity);
                return onAttachFragment$lambda$1;
        }
    }
}
