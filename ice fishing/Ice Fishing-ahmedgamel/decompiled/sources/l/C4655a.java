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
public final class C4655a implements I.a {

    /* renamed from: A, reason: collision with root package name */
    public Drawable f38667A;

    /* renamed from: B, reason: collision with root package name */
    public Context f38668B;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f38669C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f38670D;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f38671E;

    /* renamed from: F, reason: collision with root package name */
    public PorterDuff.Mode f38672F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f38673G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f38674H;

    /* renamed from: I, reason: collision with root package name */
    public int f38675I;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f38676n;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f38677u;

    /* renamed from: v, reason: collision with root package name */
    public Intent f38678v;

    /* renamed from: w, reason: collision with root package name */
    public char f38679w;

    /* renamed from: x, reason: collision with root package name */
    public int f38680x;

    /* renamed from: y, reason: collision with root package name */
    public char f38681y;

    /* renamed from: z, reason: collision with root package name */
    public int f38682z;

    @Override // I.a
    public final p a() {
        return null;
    }

    @Override // I.a
    public final I.a b(p pVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f38667A;
        if (drawable != null) {
            if (this.f38673G || this.f38674H) {
                this.f38667A = drawable;
                Drawable mutate = drawable.mutate();
                this.f38667A = mutate;
                if (this.f38673G) {
                    H.a.h(mutate, this.f38671E);
                }
                if (this.f38674H) {
                    H.a.i(this.f38667A, this.f38672F);
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
        return this.f38682z;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f38681y;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f38669C;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f38667A;
    }

    @Override // I.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f38671E;
    }

    @Override // I.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f38672F;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f38678v;
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
        return this.f38680x;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f38679w;
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
        return this.f38676n;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f38677u;
        return charSequence != null ? charSequence : this.f38676n;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f38670D;
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
        return (this.f38675I & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f38675I & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f38675I & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f38675I & 8) == 0;
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
        this.f38681y = Character.toLowerCase(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z6) {
        this.f38675I = (z6 ? 1 : 0) | (this.f38675I & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z6) {
        this.f38675I = (z6 ? 2 : 0) | (this.f38675I & (-3));
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setContentDescription(CharSequence charSequence) {
        this.f38669C = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z6) {
        this.f38675I = (z6 ? 16 : 0) | (this.f38675I & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f38667A = drawable;
        c();
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f38671E = colorStateList;
        this.f38673G = true;
        c();
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f38672F = mode;
        this.f38674H = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f38678v = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9) {
        this.f38679w = c9;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10) {
        this.f38679w = c9;
        this.f38681y = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f38676n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f38677u = charSequence;
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setTooltipText(CharSequence charSequence) {
        this.f38670D = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z6) {
        this.f38675I = (this.f38675I & 8) | (z6 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9, int i) {
        this.f38681y = Character.toLowerCase(c9);
        this.f38682z = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f38669C = charSequence;
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9, int i) {
        this.f38679w = c9;
        this.f38680x = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f38676n = this.f38668B.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f38670D = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f38667A = E.a.b(this.f38668B, i);
        c();
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10, int i, int i4) {
        this.f38679w = c9;
        this.f38680x = KeyEvent.normalizeMetaState(i);
        this.f38681y = Character.toLowerCase(c10);
        this.f38682z = KeyEvent.normalizeMetaState(i4);
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
