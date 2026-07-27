package kotlin.text;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class CatchingFishMoshiViewPager extends Animatable2.AnimationCallback {
    public final /* synthetic */ CatchingFishMockkAdMob CatchingFishParcelableFAB;

    public CatchingFishMoshiViewPager(CatchingFishMockkAdMob catchingFishMockkAdMob) {
        this.CatchingFishParcelableFAB = catchingFishMockkAdMob;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.CatchingFishParcelableFAB.CatchingFishSnackbar.CatchingFishNavigation;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        CatchingFishStateFlowRedux catchingFishStateFlowRedux = this.CatchingFishParcelableFAB.CatchingFishSnackbar;
        ColorStateList colorStateList = catchingFishStateFlowRedux.CatchingFishNavigation;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(catchingFishStateFlowRedux.CatchingFishDaggerHiltFAB, colorStateList.getDefaultColor()));
        }
    }
}
