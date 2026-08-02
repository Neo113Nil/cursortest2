package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.payment.sdk.ui.view.HeaderView;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;

/* loaded from: classes2.dex */
public final class qpa0 implements zo31 {
    public final LinearLayout a;
    public final HeaderView b;
    public final PaymentButtonView c;
    public final TextView d;
    public final TextView e;

    public qpa0(LinearLayout linearLayout, HeaderView headerView, PaymentButtonView paymentButtonView, TextView textView, TextView textView2) {
        this.a = linearLayout;
        this.b = headerView;
        this.c = paymentButtonView;
        this.d = textView;
        this.e = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
