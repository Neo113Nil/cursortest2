package kotlin.text;

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

/* loaded from: classes.dex */
public final class CatchingFishWidgetAnimation implements CatchingFishGlideSpannable {
    public boolean CatchingFishAnimationMockk;
    public CharSequence CatchingFishCloudMessaging;
    public Intent CatchingFishCoroutine;
    public int CatchingFishDaggerWebsocket;
    public ColorStateList CatchingFishEspressoTesting;
    public CharSequence CatchingFishFragmentHandler;
    public Context CatchingFishLayout;
    public PorterDuff.Mode CatchingFishOkHttp;
    public CharSequence CatchingFishParcelableFAB;
    public char CatchingFishReduxKtor;
    public CharSequence CatchingFishSnackbar;
    public int CatchingFishStateLiveData;
    public boolean CatchingFishUnitTesting;
    public Drawable CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public char CatchingFishWorkManager;

    public final void CatchingFishCoroutine() {
        Drawable drawable = this.CatchingFishViewModelFAB;
        if (drawable != null) {
            if (this.CatchingFishUnitTesting || this.CatchingFishAnimationMockk) {
                this.CatchingFishViewModelFAB = drawable;
                Drawable mutate = drawable.mutate();
                this.CatchingFishViewModelFAB = mutate;
                if (this.CatchingFishUnitTesting) {
                    mutate.setTintList(this.CatchingFishEspressoTesting);
                }
                if (this.CatchingFishAnimationMockk) {
                    this.CatchingFishViewModelFAB.setTintMode(this.CatchingFishOkHttp);
                }
            }
        }
    }

    @Override // kotlin.text.CatchingFishGlideSpannable
    public final CatchingFishJUnitAdMobKtor CatchingFishParcelableFAB() {
        return null;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable
    public final CatchingFishGlideSpannable CatchingFishSnackbar(CatchingFishJUnitAdMobKtor catchingFishJUnitAdMobKtor) {
        throw new UnsupportedOperationException();
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

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.CatchingFishViewModelScope;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.CatchingFishFragmentHandler;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.CatchingFishViewModelFAB;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.CatchingFishEspressoTesting;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.CatchingFishOkHttp;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.CatchingFishCoroutine;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.CatchingFishReduxKtor;
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
        return this.CatchingFishParcelableFAB;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.CatchingFishSnackbar;
        return charSequence != null ? charSequence : this.CatchingFishParcelableFAB;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.CatchingFishCloudMessaging;
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
        return (this.CatchingFishStateLiveData & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.CatchingFishStateLiveData & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.CatchingFishStateLiveData & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.CatchingFishStateLiveData & 8) == 0;
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
    public final MenuItem setAlphabeticShortcut(char c) {
        this.CatchingFishWorkManager = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.CatchingFishStateLiveData = (z ? 1 : 0) | (this.CatchingFishStateLiveData & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.CatchingFishStateLiveData = (z ? 2 : 0) | (this.CatchingFishStateLiveData & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.CatchingFishFragmentHandler = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.CatchingFishStateLiveData = (z ? 16 : 0) | (this.CatchingFishStateLiveData & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.CatchingFishViewModelFAB = drawable;
        CatchingFishCoroutine();
        return this;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.CatchingFishEspressoTesting = colorStateList;
        this.CatchingFishUnitTesting = true;
        CatchingFishCoroutine();
        return this;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.CatchingFishOkHttp = mode;
        this.CatchingFishAnimationMockk = true;
        CatchingFishCoroutine();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.CatchingFishCoroutine = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.CatchingFishReduxKtor = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.CatchingFishReduxKtor = c;
        this.CatchingFishWorkManager = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.CatchingFishParcelableFAB = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.CatchingFishSnackbar = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.CatchingFishCloudMessaging = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.CatchingFishStateLiveData = (this.CatchingFishStateLiveData & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.CatchingFishWorkManager = Character.toLowerCase(c);
        this.CatchingFishViewModelScope = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final CatchingFishGlideSpannable setContentDescription(CharSequence charSequence) {
        this.CatchingFishFragmentHandler = charSequence;
        return this;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.CatchingFishReduxKtor = c;
        this.CatchingFishDaggerWebsocket = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.CatchingFishParcelableFAB = this.CatchingFishLayout.getResources().getString(i);
        return this;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final CatchingFishGlideSpannable setTooltipText(CharSequence charSequence) {
        this.CatchingFishCloudMessaging = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.CatchingFishViewModelFAB = this.CatchingFishLayout.getDrawable(i);
        CatchingFishCoroutine();
        return this;
    }

    @Override // kotlin.text.CatchingFishGlideSpannable, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.CatchingFishReduxKtor = c;
        this.CatchingFishDaggerWebsocket = KeyEvent.normalizeMetaState(i);
        this.CatchingFishWorkManager = Character.toLowerCase(c2);
        this.CatchingFishViewModelScope = KeyEvent.normalizeMetaState(i2);
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
