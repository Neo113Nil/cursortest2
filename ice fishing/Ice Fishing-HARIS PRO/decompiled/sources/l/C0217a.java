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
public final class C0217a implements I.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f3651a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f3652b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f3653c;

    /* renamed from: d, reason: collision with root package name */
    public char f3654d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public char f3655f;

    /* renamed from: g, reason: collision with root package name */
    public int f3656g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f3657h;
    public Context i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f3658k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f3659l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f3660m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3661n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3662o;

    /* renamed from: p, reason: collision with root package name */
    public int f3663p;

    @Override // I.a
    public final p a() {
        return null;
    }

    @Override // I.a
    public final I.a b(p pVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f3657h;
        if (drawable != null) {
            if (this.f3661n || this.f3662o) {
                this.f3657h = drawable;
                Drawable mutate = drawable.mutate();
                this.f3657h = mutate;
                if (this.f3661n) {
                    mutate.setTintList(this.f3659l);
                }
                if (this.f3662o) {
                    this.f3657h.setTintMode(this.f3660m);
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
        return this.f3656g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3655f;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f3657h;
    }

    @Override // I.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3659l;
    }

    @Override // I.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3660m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3653c;
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
        return this.e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3654d;
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
        return this.f3651a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3652b;
        return charSequence != null ? charSequence : this.f3651a;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3658k;
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
        return (this.f3663p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3663p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3663p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f3663p & 8) == 0;
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
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f3655f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f3663p = (z2 ? 1 : 0) | (this.f3663p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f3663p = (z2 ? 2 : 0) | (this.f3663p & (-3));
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f3663p = (z2 ? 16 : 0) | (this.f3663p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3657h = drawable;
        c();
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3659l = colorStateList;
        this.f3661n = true;
        c();
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3660m = mode;
        this.f3662o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3653c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.f3654d = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f3654d = c2;
        this.f3655f = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3651a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3652b = charSequence;
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setTooltipText(CharSequence charSequence) {
        this.f3658k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        this.f3663p = (this.f3663p & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f3655f = Character.toLowerCase(c2);
        this.f3656g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        this.f3654d = c2;
        this.e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f3651a = this.i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f3658k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f3657h = this.i.getDrawable(i);
        c();
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f3654d = c2;
        this.e = KeyEvent.normalizeMetaState(i);
        this.f3655f = Character.toLowerCase(c3);
        this.f3656g = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
