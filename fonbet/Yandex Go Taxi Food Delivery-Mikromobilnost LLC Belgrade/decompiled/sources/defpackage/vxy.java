package defpackage;

import android.animation.ValueAnimator;
import com.ybsdk.widgets.common.LoadableInput;

/* loaded from: classes4.dex */
public final /* synthetic */ class vxy implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i361 b;

    public /* synthetic */ vxy(i361 i361Var, int i) {
        this.a = i;
        this.b = i361Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        i361 i361Var = this.b;
        switch (i) {
            case 0:
                LoadableInput.setupDivider$lambda$50$lambda$49$lambda$47(i361Var, valueAnimator);
                break;
            case 1:
                LoadableInput.animateLabelExpansion$lambda$81$lambda$72$lambda$71(i361Var, valueAnimator);
                break;
            case 2:
                LoadableInput.animateLabelExpansion$lambda$81$lambda$74$lambda$73(i361Var, valueAnimator);
                break;
            case 3:
                LoadableInput.animateLabelExpansion$lambda$81$lambda$76$lambda$75(i361Var, valueAnimator);
                break;
            case 4:
                LoadableInput.animateLabelExpansion$lambda$81$lambda$78$lambda$77(i361Var, valueAnimator);
                break;
            case 5:
                LoadableInput.animateLabelCollapse$lambda$70$lambda$61$lambda$60(i361Var, valueAnimator);
                break;
            case 6:
                LoadableInput.animateLabelCollapse$lambda$70$lambda$63$lambda$62(i361Var, valueAnimator);
                break;
            case 7:
                LoadableInput.animateLabelCollapse$lambda$70$lambda$65$lambda$64(i361Var, valueAnimator);
                break;
            default:
                LoadableInput.animateLabelCollapse$lambda$70$lambda$67$lambda$66(i361Var, valueAnimator);
                break;
        }
    }
}
