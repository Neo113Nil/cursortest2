package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.android.gms.internal.ads.CL;

/* renamed from: l.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC4672D extends l implements SubMenu {

    /* renamed from: S, reason: collision with root package name */
    public final l f38882S;

    /* renamed from: T, reason: collision with root package name */
    public final n f38883T;

    public SubMenuC4672D(Context context, l lVar, n nVar) {
        super(context);
        this.f38882S = lVar;
        this.f38883T = nVar;
    }

    @Override // l.l
    public final boolean d(n nVar) {
        return this.f38882S.d(nVar);
    }

    @Override // l.l
    public final boolean e(l lVar, MenuItem menuItem) {
        return super.e(lVar, menuItem) || this.f38882S.e(lVar, menuItem);
    }

    @Override // l.l
    public final boolean f(n nVar) {
        return this.f38882S.f(nVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f38883T;
    }

    @Override // l.l
    public final String j() {
        n nVar = this.f38883T;
        int i = nVar != null ? nVar.f38993n : 0;
        if (i == 0) {
            return null;
        }
        return CL.i(i, "android:menu:actionviewstates:");
    }

    @Override // l.l
    public final l k() {
        return this.f38882S.k();
    }

    @Override // l.l
    public final boolean m() {
        return this.f38882S.m();
    }

    @Override // l.l
    public final boolean n() {
        return this.f38882S.n();
    }

    @Override // l.l
    public final boolean o() {
        return this.f38882S.o();
    }

    @Override // l.l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z8) {
        this.f38882S.setGroupDividerEnabled(z8);
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
        this.f38883T.setIcon(drawable);
        return this;
    }

    @Override // l.l, android.view.Menu
    public final void setQwertyMode(boolean z8) {
        this.f38882S.setQwertyMode(z8);
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
        this.f38883T.setIcon(i);
        return this;
    }
}
