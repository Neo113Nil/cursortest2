package kotlin.text;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class CatchingFishRealmToast implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishFABHilt CatchingFishSnackbar;

    public CatchingFishRealmToast(CatchingFishFABHilt catchingFishFABHilt, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.CatchingFishSnackbar = catchingFishFABHilt;
        this.CatchingFishParcelableFAB = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.CatchingFishParcelableFAB.onMenuItemActionCollapse(this.CatchingFishSnackbar.CatchingFishDaggerWebsocket(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.CatchingFishParcelableFAB.onMenuItemActionExpand(this.CatchingFishSnackbar.CatchingFishDaggerWebsocket(menuItem));
    }
}
