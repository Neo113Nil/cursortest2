package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: l.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0216E extends MenuC0229m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final o f3649A;

    /* renamed from: z, reason: collision with root package name */
    public final MenuC0229m f3650z;

    public SubMenuC0216E(Context context, MenuC0229m menuC0229m, o oVar) {
        super(context);
        this.f3650z = menuC0229m;
        this.f3649A = oVar;
    }

    @Override // l.MenuC0229m
    public final boolean d(o oVar) {
        return this.f3650z.d(oVar);
    }

    @Override // l.MenuC0229m
    public final boolean e(MenuC0229m menuC0229m, MenuItem menuItem) {
        return super.e(menuC0229m, menuItem) || this.f3650z.e(menuC0229m, menuItem);
    }

    @Override // l.MenuC0229m
    public final boolean f(o oVar) {
        return this.f3650z.f(oVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f3649A;
    }

    @Override // l.MenuC0229m
    public final String j() {
        o oVar = this.f3649A;
        int i = oVar != null ? oVar.f3736a : 0;
        if (i == 0) {
            return null;
        }
        return D1.h.e("android:menu:actionviewstates:", i);
    }

    @Override // l.MenuC0229m
    public final MenuC0229m k() {
        return this.f3650z.k();
    }

    @Override // l.MenuC0229m
    public final boolean m() {
        return this.f3650z.m();
    }

    @Override // l.MenuC0229m
    public final boolean n() {
        return this.f3650z.n();
    }

    @Override // l.MenuC0229m
    public final boolean o() {
        return this.f3650z.o();
    }

    @Override // l.MenuC0229m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f3650z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f3649A.setIcon(drawable);
        return this;
    }

    @Override // l.MenuC0229m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f3650z.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f3649A.setIcon(i);
        return this;
    }
}
