package defpackage;

import android.view.MenuItem;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class fs implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ gs NCTxEWno;
    public final MenuItem.OnActionExpandListener qoPGr6Ce;

    public fs(gs gsVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.NCTxEWno = gsVar;
        this.qoPGr6Ce = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.qoPGr6Ce.onMenuItemActionCollapse(this.NCTxEWno.jb9XjC4I(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.qoPGr6Ce.onMenuItemActionExpand(this.NCTxEWno.jb9XjC4I(menuItem));
    }
}
