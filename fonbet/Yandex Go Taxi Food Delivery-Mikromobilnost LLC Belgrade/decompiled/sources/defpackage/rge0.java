package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final /* synthetic */ class rge0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RobotoTextView b;

    public /* synthetic */ rge0(int i, RobotoTextView robotoTextView) {
        this.a = i;
        this.b = robotoTextView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        RobotoTextView robotoTextView = this.b;
        switch (i) {
            case 0:
                robotoTextView.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                robotoTextView.setBackgroundTintList(ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
                break;
        }
    }
}
