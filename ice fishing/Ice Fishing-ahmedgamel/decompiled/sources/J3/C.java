package J3;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import t0.C5015k;

/* loaded from: classes2.dex */
public final class C implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1454n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1455u;

    public /* synthetic */ C(int i, Object obj) {
        this.f1454n = i;
        this.f1455u = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1454n) {
            case 0:
                ((TextInputLayout) this.f1455u).f36877W0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                G3.g gVar = ((BottomSheetBehavior) this.f1455u).i;
                if (gVar != null) {
                    G3.f fVar = gVar.f1108n;
                    if (fVar.i != floatValue) {
                        fVar.i = floatValue;
                        gVar.f1112x = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C5015k c5015k = (C5015k) this.f1455u;
                c5015k.f40749c.setAlpha(floatValue2);
                c5015k.f40750d.setAlpha(floatValue2);
                c5015k.f40764s.invalidate();
                break;
        }
    }
}
