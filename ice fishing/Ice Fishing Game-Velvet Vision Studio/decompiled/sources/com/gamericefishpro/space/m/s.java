package com.gamericefishpro.space.m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends i implements SubMenu {
    public final i v;
    public final j w;

    public s(Context context, i iVar, j jVar) {
        super(context);
        this.v = iVar;
        this.w = jVar;
    }

    @Override // com.gamericefishpro.space.m.i
    public final boolean d(j jVar) {
        return this.v.d(jVar);
    }

    @Override // com.gamericefishpro.space.m.i
    public final boolean e(i iVar, MenuItem menuItem) {
        return super.e(iVar, menuItem) || this.v.e(iVar, menuItem);
    }

    @Override // com.gamericefishpro.space.m.i
    public final boolean f(j jVar) {
        return this.v.f(jVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.w;
    }

    @Override // com.gamericefishpro.space.m.i
    public final i j() {
        return this.v.j();
    }

    @Override // com.gamericefishpro.space.m.i
    public final boolean l() {
        return this.v.l();
    }

    @Override // com.gamericefishpro.space.m.i
    public final boolean m() {
        return this.v.m();
    }

    @Override // com.gamericefishpro.space.m.i
    public final boolean n() {
        return this.v.n();
    }

    @Override // com.gamericefishpro.space.m.i, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.v.setGroupDividerEnabled(z);
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
        this.w.setIcon(drawable);
        return this;
    }

    @Override // com.gamericefishpro.space.m.i, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.v.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        q(0, null, i, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        q(i, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.w.setIcon(i);
        return this;
    }
}
