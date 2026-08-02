package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class tmr extends hxh implements SubMenu {
    public final rxh A;
    public final hxh z;

    public tmr(Context context, hxh hxhVar, rxh rxhVar) {
        super(context);
        this.z = hxhVar;
        this.A = rxhVar;
    }

    @Override // defpackage.hxh
    public final boolean d(rxh rxhVar) {
        return this.z.d(rxhVar);
    }

    @Override // defpackage.hxh
    public final boolean e(hxh hxhVar, MenuItem menuItem) {
        return super.e(hxhVar, menuItem) || this.z.e(hxhVar, menuItem);
    }

    @Override // defpackage.hxh
    public final boolean f(rxh rxhVar) {
        return this.z.f(rxhVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.hxh
    public final String j() {
        rxh rxhVar = this.A;
        int i = rxhVar != null ? rxhVar.a : 0;
        if (i == 0) {
            return null;
        }
        return k5r.i(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.hxh
    public final hxh k() {
        return this.z.k();
    }

    @Override // defpackage.hxh
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.hxh
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.hxh
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.hxh, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
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
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.hxh, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
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
}
