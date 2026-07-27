package l;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4644a implements I.a {

    /* renamed from: A, reason: collision with root package name */
    public Drawable f38740A;

    /* renamed from: B, reason: collision with root package name */
    public Context f38741B;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f38742C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f38743D;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f38744E;

    /* renamed from: F, reason: collision with root package name */
    public PorterDuff.Mode f38745F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f38746G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f38747H;

    /* renamed from: I, reason: collision with root package name */
    public int f38748I;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f38749n;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f38750u;

    /* renamed from: v, reason: collision with root package name */
    public Intent f38751v;

    /* renamed from: w, reason: collision with root package name */
    public char f38752w;

    /* renamed from: x, reason: collision with root package name */
    public int f38753x;

    /* renamed from: y, reason: collision with root package name */
    public char f38754y;

    /* renamed from: z, reason: collision with root package name */
    public int f38755z;

    @Override // I.a
    public final p a() {
        return null;
    }

    @Override // I.a
    public final I.a b(p pVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f38740A;
        if (drawable != null) {
            if (this.f38746G || this.f38747H) {
                this.f38740A = drawable;
                Drawable mutate = drawable.mutate();
                this.f38740A = mutate;
                if (this.f38746G) {
                    H.a.h(mutate, this.f38744E);
                }
                if (this.f38747H) {
                    H.a.i(this.f38740A, this.f38745F);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // I.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f38755z;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f38754y;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f38742C;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f38740A;
    }

    @Override // I.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f38744E;
    }

    @Override // I.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f38745F;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f38751v;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // I.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f38753x;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f38752w;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f38749n;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f38750u;
        return charSequence != null ? charSequence : this.f38749n;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f38743D;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f38748I & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f38748I & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f38748I & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f38748I & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9) {
        this.f38754y = Character.toLowerCase(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        this.f38748I = (z3 ? 1 : 0) | (this.f38748I & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        this.f38748I = (z3 ? 2 : 0) | (this.f38748I & (-3));
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setContentDescription(CharSequence charSequence) {
        this.f38742C = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        this.f38748I = (z3 ? 16 : 0) | (this.f38748I & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f38740A = drawable;
        c();
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f38744E = colorStateList;
        this.f38746G = true;
        c();
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f38745F = mode;
        this.f38747H = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f38751v = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9) {
        this.f38752w = c9;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10) {
        this.f38752w = c9;
        this.f38754y = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f38749n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f38750u = charSequence;
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setTooltipText(CharSequence charSequence) {
        this.f38743D = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        this.f38748I = (this.f38748I & 8) | (z3 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9, int i) {
        this.f38754y = Character.toLowerCase(c9);
        this.f38755z = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f38742C = charSequence;
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9, int i) {
        this.f38752w = c9;
        this.f38753x = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f38749n = this.f38741B.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f38743D = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f38740A = E.a.b(this.f38741B, i);
        c();
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10, int i, int i6) {
        this.f38752w = c9;
        this.f38753x = KeyEvent.normalizeMetaState(i);
        this.f38754y = Character.toLowerCase(c10);
        this.f38755z = KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
