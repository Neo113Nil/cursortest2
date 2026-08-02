package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes3.dex */
public final class eu2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ju2 b;

    public /* synthetic */ eu2(ju2 ju2Var, int i) {
        this.a = i;
        this.b = ju2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect;
        int i = this.a;
        ju2 ju2Var = this.b;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                iu2 iu2Var = ju2Var.i;
                if (iu2Var != null) {
                    WindowManager windowManager = (WindowManager) ju2Var.h.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = qdq.k(windowManager);
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int height = rect.height();
                    int[] iArr = new int[2];
                    iu2Var.getLocationInWindow(iArr);
                    int height2 = (height - (iu2Var.getHeight() + iArr[1])) + ((int) iu2Var.getTranslationY());
                    int i4 = ju2Var.p;
                    if (height2 < i4) {
                        ViewGroup.LayoutParams layoutParams = iu2Var.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Log.w(ju2.z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                            break;
                        } else {
                            int i5 = ju2Var.p;
                            ju2Var.q = i5;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i5 - height2) + marginLayoutParams.bottomMargin;
                            iu2Var.requestLayout();
                            break;
                        }
                    } else {
                        ju2Var.q = i4;
                        break;
                    }
                }
                break;
            case 1:
                ju2Var.c();
                break;
            default:
                iu2 iu2Var2 = ju2Var.i;
                if (iu2Var2 != null) {
                    int i6 = 0;
                    if (iu2Var2.getParent() != null) {
                        iu2Var2.setVisibility(0);
                    }
                    if (iu2Var2.getAnimationMode() != 1) {
                        int height3 = iu2Var2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = iu2Var2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        iu2Var2.setTranslationY(height3);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height3, 0);
                        valueAnimator.setInterpolator(ju2Var.e);
                        valueAnimator.setDuration(ju2Var.c);
                        valueAnimator.addListener(new bu2(ju2Var, i3));
                        valueAnimator.addUpdateListener(new cu2(ju2Var, i2));
                        valueAnimator.start();
                        break;
                    } else {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setInterpolator(ju2Var.d);
                        ofFloat.addUpdateListener(new cu2(ju2Var, i6));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        ofFloat2.setInterpolator(ju2Var.f);
                        ofFloat2.addUpdateListener(new cu2(ju2Var, i3));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat, ofFloat2);
                        animatorSet.setDuration(ju2Var.a);
                        animatorSet.addListener(new bu2(ju2Var, 3));
                        animatorSet.start();
                        break;
                    }
                }
                break;
        }
    }
}
