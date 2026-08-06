package g;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class t extends j implements SubMenu {

    /* renamed from: v, reason: collision with root package name */
    public final j f3128v;

    /* renamed from: w, reason: collision with root package name */
    public final k f3129w;

    public t(Context context, j jVar, k kVar) {
        super(context);
        this.f3128v = jVar;
        this.f3129w = kVar;
    }

    @Override // g.j
    public final boolean d(k kVar) {
        return this.f3128v.d(kVar);
    }

    @Override // g.j
    public final boolean e(j jVar, MenuItem menuItem) {
        super.e(jVar, menuItem);
        return this.f3128v.e(jVar, menuItem);
    }

    @Override // g.j
    public final boolean f(k kVar) {
        return this.f3128v.f(kVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f3129w;
    }

    @Override // g.j
    public final j j() {
        return this.f3128v.j();
    }

    @Override // g.j
    public final boolean l() {
        return this.f3128v.l();
    }

    @Override // g.j
    public final boolean m() {
        return this.f3128v.m();
    }

    @Override // g.j
    public final boolean n() {
        return this.f3128v.n();
    }

    @Override // g.j, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f3128v.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f3129w.setIcon(drawable);
        return this;
    }

    @Override // g.j, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f3128v.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        q(0, null, i2, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        q(i2, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.f3129w.setIcon(i2);
        return this;
    }
}
