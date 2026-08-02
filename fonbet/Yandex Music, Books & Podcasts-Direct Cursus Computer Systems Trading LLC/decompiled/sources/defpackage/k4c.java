package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;

/* loaded from: classes3.dex */
public final class k4c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final View b;
    public final View c;
    public final Object d;

    public k4c(ActionMenuView actionMenuView, ActionMenuView actionMenuView2) {
        this.a = 0;
        this.b = actionMenuView;
        this.c = actionMenuView2;
        this.d = new float[2];
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr = (float[]) this.d;
                xv7.t(floatValue, fArr);
                View view = this.b;
                if (view != null) {
                    view.setAlpha(fArr[0]);
                }
                View view2 = this.c;
                if (view2 != null) {
                    view2.setAlpha(fArr[1]);
                    break;
                }
                break;
            default:
                ((j1s) this.d).c(this.b, this.c, valueAnimator.getAnimatedFraction());
                break;
        }
    }

    public k4c(j1s j1sVar, View view, View view2) {
        this.a = 1;
        this.d = j1sVar;
        this.b = view;
        this.c = view2;
    }
}
