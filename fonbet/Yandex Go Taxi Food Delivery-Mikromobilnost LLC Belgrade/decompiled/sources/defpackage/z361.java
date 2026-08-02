package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.feature.qr.payments.internal.screens.subscription.view.QrPaymentsWithoutExtraActionsView;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodView;

/* loaded from: classes3.dex */
public final class z361 implements zo31 {
    public final QrPaymentsWithoutExtraActionsView a;
    public final SelectPaymentMethodView b;
    public final TextView c;
    public final TextView d;
    public final AppCompatImageView e;
    public final TextView f;

    public z361(QrPaymentsWithoutExtraActionsView qrPaymentsWithoutExtraActionsView, SelectPaymentMethodView selectPaymentMethodView, TextView textView, TextView textView2, AppCompatImageView appCompatImageView, TextView textView3) {
        this.a = qrPaymentsWithoutExtraActionsView;
        this.b = selectPaymentMethodView;
        this.c = textView;
        this.d = textView2;
        this.e = appCompatImageView;
        this.f = textView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
