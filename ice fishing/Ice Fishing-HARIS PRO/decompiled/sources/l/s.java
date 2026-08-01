package l;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f3765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f3766b;

    public s(t tVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3766b = tVar;
        this.f3765a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f3765a.onMenuItemClick(this.f3766b.g(menuItem));
    }
}
