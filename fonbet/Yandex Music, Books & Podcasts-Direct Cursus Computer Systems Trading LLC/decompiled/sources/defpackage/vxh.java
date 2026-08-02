package defpackage;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class vxh implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ wxh b;

    public vxh(wxh wxhVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = wxhVar;
        this.a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.r(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.r(menuItem));
    }
}
