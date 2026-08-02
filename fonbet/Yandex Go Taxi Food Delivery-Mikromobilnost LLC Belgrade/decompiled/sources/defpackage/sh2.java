package defpackage;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* loaded from: classes11.dex */
public final /* synthetic */ class sh2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;

    public /* synthetic */ sh2(TextView textView, int i) {
        this.a = i;
        this.b = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        TextView textView = this.b;
        switch (i) {
            case 0:
                textView.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 1:
                textView.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                int i2 = uty0.h0;
                textView.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
