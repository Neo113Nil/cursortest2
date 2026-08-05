package defpackage;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ u2(int i, Object obj) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.qoPGr6Ce;
        Object obj = this.NCTxEWno;
        switch (i) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tr trVar = ((BottomSheetBehavior) obj).OxcuoDLp;
                if (trVar != null) {
                    trVar.amk52bBQ(floatValue);
                    break;
                }
                break;
            case 1:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                ug ugVar = (ug) obj;
                ugVar.MdtA4re8.setAlpha(floatValue2);
                ugVar.wxUZMvaN.setAlpha(floatValue2);
                ugVar.KlHjfFWx.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) obj;
                textView.setScaleX(floatValue3);
                textView.setScaleY(floatValue3);
                break;
        }
    }
}
