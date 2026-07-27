package kotlin.text;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class CatchingFishServiceMVP extends Drawable.ConstantState {
    public final Drawable.ConstantState CatchingFishParcelableFAB;

    public CatchingFishServiceMVP(Drawable.ConstantState constantState) {
        this.CatchingFishParcelableFAB = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.CatchingFishParcelableFAB.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.CatchingFishParcelableFAB.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        CatchingFishAdMobSharedFlow catchingFishAdMobSharedFlow = new CatchingFishAdMobSharedFlow(null, 0);
        Drawable newDrawable = this.CatchingFishParcelableFAB.newDrawable();
        catchingFishAdMobSharedFlow.CatchingFishReduxKtor = newDrawable;
        newDrawable.setCallback(catchingFishAdMobSharedFlow.CatchingFishLayout);
        return catchingFishAdMobSharedFlow;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        CatchingFishAdMobSharedFlow catchingFishAdMobSharedFlow = new CatchingFishAdMobSharedFlow(null, 0);
        Drawable newDrawable = this.CatchingFishParcelableFAB.newDrawable(resources);
        catchingFishAdMobSharedFlow.CatchingFishReduxKtor = newDrawable;
        newDrawable.setCallback(catchingFishAdMobSharedFlow.CatchingFishLayout);
        return catchingFishAdMobSharedFlow;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        CatchingFishAdMobSharedFlow catchingFishAdMobSharedFlow = new CatchingFishAdMobSharedFlow(null, 0);
        Drawable newDrawable = this.CatchingFishParcelableFAB.newDrawable(resources, theme);
        catchingFishAdMobSharedFlow.CatchingFishReduxKtor = newDrawable;
        newDrawable.setCallback(catchingFishAdMobSharedFlow.CatchingFishLayout);
        return catchingFishAdMobSharedFlow;
    }
}
