package yads;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* loaded from: classes7.dex */
public final class w33 implements ValueAnimator.AnimatorUpdateListener {
    public final TextView a;

    public w33(TextView textView) {
        this.a = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            this.a.setTextColor(((Number) animatedValue).intValue());
        }
    }
}
