package l;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f38791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f38792b;

    public s(t tVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f38792b = tVar;
        this.f38791a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f38791a.onMenuItemClick(this.f38792b.g(menuItem));
    }
}
