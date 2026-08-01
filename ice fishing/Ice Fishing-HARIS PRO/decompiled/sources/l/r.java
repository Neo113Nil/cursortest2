package l;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class r implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f3763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f3764b;

    public r(t tVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3764b = tVar;
        this.f3763a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f3763a.onMenuItemActionCollapse(this.f3764b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f3763a.onMenuItemActionExpand(this.f3764b.g(menuItem));
    }
}
