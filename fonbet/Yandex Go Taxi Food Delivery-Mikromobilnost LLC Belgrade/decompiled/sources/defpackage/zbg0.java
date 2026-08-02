package defpackage;

import android.animation.ValueAnimator;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class zbg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r461 b;

    public /* synthetic */ zbg0(r461 r461Var, int i) {
        this.a = i;
        this.b = r461Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        r461 r461Var = this.b;
        switch (i) {
            case 0:
                QrReaderFragment.hideLoadingState$lambda$47$lambda$46$lambda$44(r461Var, valueAnimator);
                break;
            default:
                QrReaderFragment.showLoadingState$lambda$43$lambda$42$lambda$40(r461Var, valueAnimator);
                break;
        }
    }
}
