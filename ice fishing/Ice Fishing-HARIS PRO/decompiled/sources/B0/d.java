package B0;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import k0.C0200n;

/* loaded from: classes.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41b;

    public /* synthetic */ d(int i, Object obj) {
        this.f40a = i;
        this.f41b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                S0.g gVar = ((BottomSheetBehavior) this.f41b).i;
                if (gVar != null) {
                    gVar.n(floatValue);
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) this.f41b;
                textView.setScaleX(floatValue2);
                textView.setScaleY(floatValue2);
                break;
            case 2:
                ((TextInputLayout) this.f41b).f2654v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int floatValue3 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0200n c0200n = (C0200n) this.f41b;
                c0200n.f3552c.setAlpha(floatValue3);
                c0200n.f3553d.setAlpha(floatValue3);
                c0200n.f3565s.invalidate();
                break;
        }
    }
}
