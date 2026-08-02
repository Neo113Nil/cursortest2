package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.views.CardNumberInputView;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.views.CvvInputView;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.views.ExpirationDateInputView;

/* loaded from: classes2.dex */
public final class xar implements zo31 {
    public final ConstraintLayout a;
    public final ConstraintLayout b;

    public xar(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, CvvInputView cvvInputView, ExpirationDateInputView expirationDateInputView, CardNumberInputView cardNumberInputView) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
