package kotlin.text;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class CatchingFishJUnitAndroidX extends CatchingFishMVPEspressoRoom {
    public final RectF CatchingFishNavigation;

    public CatchingFishJUnitAndroidX(CatchingFishFragmentMVVM catchingFishFragmentMVVM, RectF rectF) {
        super(catchingFishFragmentMVVM);
        this.CatchingFishNavigation = rectF;
    }

    @Override // kotlin.text.CatchingFishMVPEspressoRoom, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        CatchingFishMVVMService catchingFishMVVMService = new CatchingFishMVVMService(this);
        catchingFishMVVMService.CatchingFishEspressoMockk = this;
        catchingFishMVVMService.invalidateSelf();
        return catchingFishMVVMService;
    }

    public CatchingFishJUnitAndroidX(CatchingFishJUnitAndroidX catchingFishJUnitAndroidX) {
        super(catchingFishJUnitAndroidX);
        this.CatchingFishNavigation = catchingFishJUnitAndroidX.CatchingFishNavigation;
    }
}
