package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r extends h implements SubMenu {

    /* renamed from: v, reason: collision with root package name */
    public final h f3768v;

    /* renamed from: w, reason: collision with root package name */
    public final i f3769w;

    public r(Context context, h hVar, i iVar) {
        super(context);
        this.f3768v = hVar;
        this.f3769w = iVar;
    }

    @Override // l.h
    public final boolean d(i iVar) {
        return this.f3768v.d(iVar);
    }

    @Override // l.h
    public final boolean e(h hVar, MenuItem menuItem) {
        super.e(hVar, menuItem);
        return this.f3768v.e(hVar, menuItem);
    }

    @Override // l.h
    public final boolean f(i iVar) {
        return this.f3768v.f(iVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f3769w;
    }

    @Override // l.h
    public final h j() {
        return this.f3768v.j();
    }

    @Override // l.h
    public final boolean l() {
        return this.f3768v.l();
    }

    @Override // l.h
    public final boolean m() {
        return this.f3768v.m();
    }

    @Override // l.h
    public final boolean n() {
        return this.f3768v.n();
    }

    @Override // l.h, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f3768v.setGroupDividerEnabled(z10);
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
        this.f3769w.setIcon(drawable);
        return this;
    }

    @Override // l.h, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f3768v.setQwertyMode(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        q(0, null, i10, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        q(i10, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.f3769w.setIcon(i10);
        return this;
    }
}
