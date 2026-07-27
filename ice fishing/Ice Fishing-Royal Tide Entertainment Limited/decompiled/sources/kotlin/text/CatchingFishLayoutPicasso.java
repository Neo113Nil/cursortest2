package kotlin.text;

import android.R;
import android.content.res.ColorStateList;

/* loaded from: classes.dex */
public final class CatchingFishLayoutPicasso extends CatchingFishGlideView {
    public static final int[][] CatchingFishFragmentHandler = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public boolean CatchingFishLayout;
    public ColorStateList CatchingFishViewModelFAB;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.CatchingFishViewModelFAB == null) {
            int CatchingFishViewModelFAB = CatchingFishViewMVIMVVM.CatchingFishViewModelFAB(this, com.catchingfish.fishcatcherpro.R.attr.colorControlActivated);
            int CatchingFishViewModelFAB2 = CatchingFishViewMVIMVVM.CatchingFishViewModelFAB(this, com.catchingfish.fishcatcherpro.R.attr.colorOnSurface);
            int CatchingFishViewModelFAB3 = CatchingFishViewMVIMVVM.CatchingFishViewModelFAB(this, com.catchingfish.fishcatcherpro.R.attr.colorSurface);
            this.CatchingFishViewModelFAB = new ColorStateList(CatchingFishFragmentHandler, new int[]{CatchingFishViewMVIMVVM.CatchingFishRoomDatabase(1.0f, CatchingFishViewModelFAB3, CatchingFishViewModelFAB), CatchingFishViewMVIMVVM.CatchingFishRoomDatabase(0.54f, CatchingFishViewModelFAB3, CatchingFishViewModelFAB2), CatchingFishViewMVIMVVM.CatchingFishRoomDatabase(0.38f, CatchingFishViewModelFAB3, CatchingFishViewModelFAB2), CatchingFishViewMVIMVVM.CatchingFishRoomDatabase(0.38f, CatchingFishViewModelFAB3, CatchingFishViewModelFAB2)});
        }
        return this.CatchingFishViewModelFAB;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.CatchingFishLayout && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.CatchingFishLayout = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
