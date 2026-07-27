package l;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f38862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f38863b;

    public r(t tVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f38863b = tVar;
        this.f38862a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f38862a.onMenuItemActionCollapse(this.f38863b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f38862a.onMenuItemActionExpand(this.f38863b.g(menuItem));
    }
}
