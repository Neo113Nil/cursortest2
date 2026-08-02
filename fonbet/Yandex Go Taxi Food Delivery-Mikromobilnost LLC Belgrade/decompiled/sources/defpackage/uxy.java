package defpackage;

import android.animation.ValueAnimator;
import com.ybsdk.widgets.common.LoadableInput;

/* loaded from: classes4.dex */
public final /* synthetic */ class uxy implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoadableInput b;

    public /* synthetic */ uxy(LoadableInput loadableInput, int i) {
        this.a = i;
        this.b = loadableInput;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        LoadableInput loadableInput = this.b;
        switch (i) {
            case 0:
                LoadableInput.animateHintHide$lambda$27$lambda$25(loadableInput, valueAnimator);
                break;
            case 1:
                LoadableInput.animateErrorTextShow$lambda$33$lambda$30(loadableInput, valueAnimator);
                break;
            case 2:
                LoadableInput.animateErrorTextHide$lambda$36$lambda$34(loadableInput, valueAnimator);
                break;
            case 3:
                LoadableInput.animateDividerColor$lambda$54$lambda$51(loadableInput, valueAnimator);
                break;
            case 4:
                LoadableInput.animateLabelError$lambda$42$lambda$41(loadableInput, valueAnimator);
                break;
            default:
                LoadableInput.animateHintShow$lambda$24$lambda$21(loadableInput, valueAnimator);
                break;
        }
    }
}
