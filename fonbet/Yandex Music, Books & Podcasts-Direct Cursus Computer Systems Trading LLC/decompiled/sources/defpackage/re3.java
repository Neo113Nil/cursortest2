package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.a;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public final class re3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ re3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a aVar;
        a aVar2;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                aVar = bottomSheetBehavior.materialShapeDrawable;
                if (aVar != null) {
                    aVar2 = bottomSheetBehavior.materialShapeDrawable;
                    aVar2.s(floatValue);
                    break;
                }
                break;
            case 1:
                ((CollapsingToolbarLayout) this.b).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 2:
                ((View) this.b).invalidate();
                break;
            case 3:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                m5c m5cVar = (m5c) this.b;
                m5cVar.c.setAlpha(floatValue2);
                m5cVar.d.setAlpha(floatValue2);
                m5cVar.s.invalidate();
                break;
            case 4:
                ((p0f) this.b).m = valueAnimator.getAnimatedFraction();
                break;
            case 5:
                ((TabLayout) this.b).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            default:
                ((TextInputLayout) this.b).c1.A(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
