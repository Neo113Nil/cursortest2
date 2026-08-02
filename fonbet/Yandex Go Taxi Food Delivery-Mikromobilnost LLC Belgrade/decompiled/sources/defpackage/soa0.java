package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;

/* loaded from: classes2.dex */
public final class soa0 implements zo31 {
    public final ConstraintLayout a;
    public final View b;
    public final View c;
    public final ConstraintLayout d;
    public final TextView e;
    public final PaymentButtonView f;
    public final ConstraintLayout g;
    public final ImageView h;
    public final TextView i;

    public soa0(ConstraintLayout constraintLayout, View view, View view2, ConstraintLayout constraintLayout2, TextView textView, PaymentButtonView paymentButtonView, ConstraintLayout constraintLayout3, ImageView imageView, TextView textView2) {
        this.a = constraintLayout;
        this.b = view;
        this.c = view2;
        this.d = constraintLayout2;
        this.e = textView;
        this.f = paymentButtonView;
        this.g = constraintLayout3;
        this.h = imageView;
        this.i = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
