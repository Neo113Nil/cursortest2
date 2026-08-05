package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class ka0 extends yr implements SubMenu {
    public final yr DK9slbsy;
    public final cs lwWCatUu;

    public ka0(Context context, yr yrVar, cs csVar) {
        super(context);
        this.DK9slbsy = yrVar;
        this.lwWCatUu = csVar;
    }

    @Override // defpackage.yr
    public final boolean OnDfzHZD() {
        return this.DK9slbsy.OnDfzHZD();
    }

    @Override // defpackage.yr
    public final boolean P7K7Inc8(cs csVar) {
        return this.DK9slbsy.P7K7Inc8(csVar);
    }

    @Override // defpackage.yr
    public final boolean VgvYg0wo(yr yrVar, MenuItem menuItem) {
        return super.VgvYg0wo(yrVar, menuItem) || this.DK9slbsy.VgvYg0wo(yrVar, menuItem);
    }

    @Override // defpackage.yr
    public final String eVhOlqcC() {
        cs csVar = this.lwWCatUu;
        int i = csVar != null ? csVar.qoPGr6Ce : 0;
        if (i == 0) {
            return null;
        }
        return q70.VgvYg0wo("android:menu:actionviewstates:", i);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.lwWCatUu;
    }

    @Override // defpackage.yr
    public final yr k3x7lurq() {
        return this.DK9slbsy.k3x7lurq();
    }

    @Override // defpackage.yr
    public final boolean lDXGDhIF() {
        return this.DK9slbsy.lDXGDhIF();
    }

    @Override // defpackage.yr, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.DK9slbsy.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        I5GHvsYW(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        I5GHvsYW(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        I5GHvsYW(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.lwWCatUu.setIcon(drawable);
        return this;
    }

    @Override // defpackage.yr, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.DK9slbsy.setQwertyMode(z);
    }

    @Override // defpackage.yr
    public final boolean wxUZMvaN(cs csVar) {
        return this.DK9slbsy.wxUZMvaN(csVar);
    }

    @Override // defpackage.yr
    public final boolean ygLcUYwZ() {
        return this.DK9slbsy.ygLcUYwZ();
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.lwWCatUu.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        I5GHvsYW(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        I5GHvsYW(i, null, 0, null, null);
        return this;
    }
}
