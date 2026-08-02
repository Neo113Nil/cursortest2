package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.loadingindicator.a;
import com.google.android.material.progressindicator.DeterminateDrawable;

/* loaded from: classes11.dex */
public final class v9j extends mor {
    public final /* synthetic */ int a;

    public v9j(qgn0 qgn0Var) {
        this.a = 3;
    }

    @Override // defpackage.mor
    public final float a(Object obj) {
        float indicatorFraction;
        float displayedWidthIncrease;
        switch (this.a) {
            case 0:
                indicatorFraction = ((DeterminateDrawable) obj).getIndicatorFraction();
                return indicatorFraction * 10000.0f;
            case 1:
                return ((a) obj).c;
            case 2:
                displayedWidthIncrease = ((MaterialButton) obj).getDisplayedWidthIncrease();
                return displayedWidthIncrease;
            default:
                return ((View) obj).getWidth();
        }
    }

    @Override // defpackage.mor
    public final void b(Object obj, float f) {
        switch (this.a) {
            case 0:
                DeterminateDrawable determinateDrawable = (DeterminateDrawable) obj;
                determinateDrawable.setIndicatorFraction(f / 10000.0f);
                determinateDrawable.maybeStartAmplitudeAnimator((int) f);
                break;
            case 1:
                ((a) obj).a(f);
                break;
            case 2:
                ((MaterialButton) obj).setDisplayedWidthIncrease(f);
                break;
            default:
                View view = (View) obj;
                int i = (int) f;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = i;
                view.setLayoutParams(layoutParams);
                break;
        }
    }

    public /* synthetic */ v9j(int i) {
        this.a = i;
    }
}
