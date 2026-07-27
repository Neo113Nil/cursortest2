package kotlin.text;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* loaded from: classes.dex */
public final class CatchingFishIntentToolbar extends Drawable.ConstantState {
    public final Drawable.ConstantState CatchingFishParcelableFAB;

    public CatchingFishIntentToolbar(Drawable.ConstantState constantState) {
        this.CatchingFishParcelableFAB = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.CatchingFishParcelableFAB.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.CatchingFishParcelableFAB.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        CatchingFishPayPalRoomFlux catchingFishPayPalRoomFlux = new CatchingFishPayPalRoomFlux();
        catchingFishPayPalRoomFlux.CatchingFishReduxKtor = (VectorDrawable) this.CatchingFishParcelableFAB.newDrawable();
        return catchingFishPayPalRoomFlux;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        CatchingFishPayPalRoomFlux catchingFishPayPalRoomFlux = new CatchingFishPayPalRoomFlux();
        catchingFishPayPalRoomFlux.CatchingFishReduxKtor = (VectorDrawable) this.CatchingFishParcelableFAB.newDrawable(resources);
        return catchingFishPayPalRoomFlux;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        CatchingFishPayPalRoomFlux catchingFishPayPalRoomFlux = new CatchingFishPayPalRoomFlux();
        catchingFishPayPalRoomFlux.CatchingFishReduxKtor = (VectorDrawable) this.CatchingFishParcelableFAB.newDrawable(resources, theme);
        return catchingFishPayPalRoomFlux;
    }
}
