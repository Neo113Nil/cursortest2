package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.payment.sdk.ui.view.ProgressResultView;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;

/* loaded from: classes2.dex */
public final class spa0 implements zo31 {
    public final LinearLayout a;
    public final PaymentButtonView b;
    public final TextView c;
    public final ProgressResultView d;

    public spa0(LinearLayout linearLayout, PaymentButtonView paymentButtonView, TextView textView, ProgressResultView progressResultView) {
        this.a = linearLayout;
        this.b = paymentButtonView;
        this.c = textView;
        this.d = progressResultView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
