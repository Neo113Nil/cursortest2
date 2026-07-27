package F3;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import t0.C5048k;

/* loaded from: classes2.dex */
public final class D implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1011n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1012u;

    public /* synthetic */ D(int i, Object obj) {
        this.f1011n = i;
        this.f1012u = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1011n) {
            case 0:
                ((TextInputLayout) this.f1012u).f36279b1.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C3.g gVar = ((BottomSheetBehavior) this.f1012u).i;
                if (gVar != null) {
                    C3.f fVar = gVar.f413n;
                    if (fVar.i != floatValue) {
                        fVar.i = floatValue;
                        gVar.f417x = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C5048k c5048k = (C5048k) this.f1012u;
                c5048k.f40721c.setAlpha(floatValue2);
                c5048k.f40722d.setAlpha(floatValue2);
                c5048k.f40736s.invalidate();
                break;
        }
    }
}
