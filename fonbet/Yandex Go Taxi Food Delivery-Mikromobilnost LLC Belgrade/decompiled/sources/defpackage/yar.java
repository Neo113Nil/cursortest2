package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.views.CardPanInputView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.views.DateExpiredInputView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.views.SecretCodeInputView;

/* loaded from: classes12.dex */
public final class yar implements zo31 {
    public final ConstraintLayout a;
    public final ConstraintLayout b;

    public yar(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, SecretCodeInputView secretCodeInputView, DateExpiredInputView dateExpiredInputView, CardPanInputView cardPanInputView) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
