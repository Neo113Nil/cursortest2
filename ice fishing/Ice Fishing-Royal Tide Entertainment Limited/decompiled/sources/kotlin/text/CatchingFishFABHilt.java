package kotlin.text;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class CatchingFishFABHilt extends CatchingFishAccessibility implements MenuItem {
    public final CatchingFishGlideSpannable CatchingFishCoroutine;
    public Method CatchingFishReduxKtor;

    public CatchingFishFABHilt(Context context, CatchingFishGlideSpannable catchingFishGlideSpannable) {
        super(context);
        if (catchingFishGlideSpannable == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.CatchingFishCoroutine = catchingFishGlideSpannable;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.CatchingFishCoroutine.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.CatchingFishCoroutine.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        CatchingFishJUnitAdMobKtor CatchingFishParcelableFAB = this.CatchingFishCoroutine.CatchingFishParcelableFAB();
        if (CatchingFishParcelableFAB != null) {
            return CatchingFishParcelableFAB.CatchingFishSnackbar;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.CatchingFishCoroutine.getActionView();
        return actionView instanceof CatchingFishGoogleMapsMockk ? (View) ((CatchingFishGoogleMapsMockk) actionView).CatchingFishReduxKtor : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.CatchingFishCoroutine.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.CatchingFishCoroutine.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.CatchingFishCoroutine.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.CatchingFishCoroutine.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.CatchingFishCoroutine.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.CatchingFishCoroutine.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.CatchingFishCoroutine.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.CatchingFishCoroutine.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.CatchingFishCoroutine.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.CatchingFishCoroutine.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.CatchingFishCoroutine.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.CatchingFishCoroutine.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.CatchingFishCoroutine.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.CatchingFishCoroutine.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.CatchingFishCoroutine.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.CatchingFishCoroutine.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.CatchingFishCoroutine.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.CatchingFishCoroutine.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.CatchingFishCoroutine.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.CatchingFishCoroutine.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.CatchingFishCoroutine.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.CatchingFishCoroutine.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.CatchingFishCoroutine.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        CatchingFishJUnitAdMobKtor catchingFishJUnitAdMobKtor = new CatchingFishJUnitAdMobKtor(this, actionProvider);
        if (actionProvider == null) {
            catchingFishJUnitAdMobKtor = null;
        }
        this.CatchingFishCoroutine.CatchingFishSnackbar(catchingFishJUnitAdMobKtor);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new CatchingFishGoogleMapsMockk(view);
        }
        this.CatchingFishCoroutine.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.CatchingFishCoroutine.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.CatchingFishCoroutine.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.CatchingFishCoroutine.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.CatchingFishCoroutine.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.CatchingFishCoroutine.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.CatchingFishCoroutine.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.CatchingFishCoroutine.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.CatchingFishCoroutine.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.CatchingFishCoroutine.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.CatchingFishCoroutine.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.CatchingFishCoroutine.setOnActionExpandListener(onActionExpandListener != null ? new CatchingFishRealmToast(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.CatchingFishCoroutine.setOnMenuItemClickListener(onMenuItemClickListener != null ? new CatchingFishGlideLifecycle(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.CatchingFishCoroutine.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.CatchingFishCoroutine.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.CatchingFishCoroutine.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.CatchingFishCoroutine.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.CatchingFishCoroutine.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.CatchingFishCoroutine.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.CatchingFishCoroutine.setVisible(z);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.CatchingFishCoroutine.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.CatchingFishCoroutine.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.CatchingFishCoroutine.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.CatchingFishCoroutine.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.CatchingFishCoroutine.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        CatchingFishGlideSpannable catchingFishGlideSpannable = this.CatchingFishCoroutine;
        catchingFishGlideSpannable.setActionView(i);
        View actionView = catchingFishGlideSpannable.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            catchingFishGlideSpannable.setActionView(new CatchingFishGoogleMapsMockk(actionView));
        }
        return this;
    }
}
