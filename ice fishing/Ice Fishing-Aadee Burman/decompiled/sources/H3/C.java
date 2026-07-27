package H3;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import t0.C5016k;

/* loaded from: classes2.dex */
public final class C implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1098n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1099u;

    public /* synthetic */ C(int i, Object obj) {
        this.f1098n = i;
        this.f1099u = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1098n) {
            case 0:
                ((TextInputLayout) this.f1099u).f36114b1.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                E3.g gVar = ((BottomSheetBehavior) this.f1099u).i;
                if (gVar != null) {
                    E3.f fVar = gVar.f766n;
                    if (fVar.i != floatValue) {
                        fVar.i = floatValue;
                        gVar.f770x = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C5016k c5016k = (C5016k) this.f1099u;
                c5016k.f40696c.setAlpha(floatValue2);
                c5016k.f40697d.setAlpha(floatValue2);
                c5016k.f40711s.invalidate();
                break;
        }
    }
}
