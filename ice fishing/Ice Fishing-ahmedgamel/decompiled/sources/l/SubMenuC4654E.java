package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.android.gms.internal.ads.Wv;

/* renamed from: l.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC4654E extends m implements SubMenu {

    /* renamed from: S, reason: collision with root package name */
    public final m f38665S;

    /* renamed from: T, reason: collision with root package name */
    public final o f38666T;

    public SubMenuC4654E(Context context, m mVar, o oVar) {
        super(context);
        this.f38665S = mVar;
        this.f38666T = oVar;
    }

    @Override // l.m
    public final boolean d(o oVar) {
        return this.f38665S.d(oVar);
    }

    @Override // l.m
    public final boolean e(m mVar, MenuItem menuItem) {
        return super.e(mVar, menuItem) || this.f38665S.e(mVar, menuItem);
    }

    @Override // l.m
    public final boolean f(o oVar) {
        return this.f38665S.f(oVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f38666T;
    }

    @Override // l.m
    public final String j() {
        o oVar = this.f38666T;
        int i = oVar != null ? oVar.f38778n : 0;
        if (i == 0) {
            return null;
        }
        return Wv.f(i, "android:menu:actionviewstates:");
    }

    @Override // l.m
    public final m k() {
        return this.f38665S.k();
    }

    @Override // l.m
    public final boolean m() {
        return this.f38665S.m();
    }

    @Override // l.m
    public final boolean n() {
        return this.f38665S.n();
    }

    @Override // l.m
    public final boolean o() {
        return this.f38665S.o();
    }

    @Override // l.m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z6) {
        this.f38665S.setGroupDividerEnabled(z6);
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
        this.f38666T.setIcon(drawable);
        return this;
    }

    @Override // l.m, android.view.Menu
    public final void setQwertyMode(boolean z6) {
        this.f38665S.setQwertyMode(z6);
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
        this.f38666T.setIcon(i);
        return this;
    }
}
