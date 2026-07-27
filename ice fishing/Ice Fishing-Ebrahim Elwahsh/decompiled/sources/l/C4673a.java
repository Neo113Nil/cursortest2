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
public final class C4673a implements I.a {

    /* renamed from: A, reason: collision with root package name */
    public Drawable f38884A;

    /* renamed from: B, reason: collision with root package name */
    public Context f38885B;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f38886C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f38887D;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f38888E;

    /* renamed from: F, reason: collision with root package name */
    public PorterDuff.Mode f38889F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f38890G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f38891H;

    /* renamed from: I, reason: collision with root package name */
    public int f38892I;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f38893n;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f38894u;

    /* renamed from: v, reason: collision with root package name */
    public Intent f38895v;

    /* renamed from: w, reason: collision with root package name */
    public char f38896w;

    /* renamed from: x, reason: collision with root package name */
    public int f38897x;

    /* renamed from: y, reason: collision with root package name */
    public char f38898y;

    /* renamed from: z, reason: collision with root package name */
    public int f38899z;

    @Override // I.a
    public final o a() {
        return null;
    }

    @Override // I.a
    public final I.a b(o oVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f38884A;
        if (drawable != null) {
            if (this.f38890G || this.f38891H) {
                this.f38884A = drawable;
                Drawable mutate = drawable.mutate();
                this.f38884A = mutate;
                if (this.f38890G) {
                    H.a.h(mutate, this.f38888E);
                }
                if (this.f38891H) {
                    H.a.i(this.f38884A, this.f38889F);
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
        return this.f38899z;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f38898y;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f38886C;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f38884A;
    }

    @Override // I.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f38888E;
    }

    @Override // I.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f38889F;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f38895v;
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
        return this.f38897x;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f38896w;
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
        return this.f38893n;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f38894u;
        return charSequence != null ? charSequence : this.f38893n;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f38887D;
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
        return (this.f38892I & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f38892I & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f38892I & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f38892I & 8) == 0;
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
    public final MenuItem setAlphabeticShortcut(char c4) {
        this.f38898y = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z8) {
        this.f38892I = (z8 ? 1 : 0) | (this.f38892I & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z8) {
        this.f38892I = (z8 ? 2 : 0) | (this.f38892I & (-3));
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setContentDescription(CharSequence charSequence) {
        this.f38886C = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z8) {
        this.f38892I = (z8 ? 16 : 0) | (this.f38892I & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f38884A = drawable;
        c();
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f38888E = colorStateList;
        this.f38890G = true;
        c();
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f38889F = mode;
        this.f38891H = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f38895v = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4) {
        this.f38896w = c4;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c9) {
        this.f38896w = c4;
        this.f38898y = Character.toLowerCase(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f38893n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f38894u = charSequence;
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setTooltipText(CharSequence charSequence) {
        this.f38887D = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z8) {
        this.f38892I = (this.f38892I & 8) | (z8 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4, int i) {
        this.f38898y = Character.toLowerCase(c4);
        this.f38899z = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f38886C = charSequence;
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4, int i) {
        this.f38896w = c4;
        this.f38897x = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f38893n = this.f38885B.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f38887D = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f38884A = E.a.b(this.f38885B, i);
        c();
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c9, int i, int i4) {
        this.f38896w = c4;
        this.f38897x = KeyEvent.normalizeMetaState(i);
        this.f38898y = Character.toLowerCase(c9);
        this.f38899z = KeyEvent.normalizeMetaState(i4);
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
