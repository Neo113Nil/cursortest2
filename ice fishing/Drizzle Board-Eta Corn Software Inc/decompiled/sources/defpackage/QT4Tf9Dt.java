package defpackage;

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

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class QT4Tf9Dt implements sa0 {
    public Intent MdtA4re8;
    public CharSequence NCTxEWno;
    public PorterDuff.Mode OnDfzHZD;
    public char P7K7Inc8;
    public Drawable Qr9iLBAD;
    public int VgvYg0wo;
    public int b2ZJblxo;
    public CharSequence eVhOlqcC;
    public Context jb9XjC4I;
    public CharSequence k3x7lurq;
    public boolean lDXGDhIF;
    public ColorStateList ow5vqvCr;
    public CharSequence qoPGr6Ce;
    public int sjUBp5pO;
    public char wxUZMvaN;
    public boolean ygLcUYwZ;

    public final void MdtA4re8() {
        Drawable drawable = this.Qr9iLBAD;
        if (drawable != null) {
            if (this.ygLcUYwZ || this.lDXGDhIF) {
                this.Qr9iLBAD = drawable;
                Drawable mutate = drawable.mutate();
                this.Qr9iLBAD = mutate;
                if (this.ygLcUYwZ) {
                    mutate.setTintList(this.ow5vqvCr);
                }
                if (this.lDXGDhIF) {
                    this.Qr9iLBAD.setTintMode(this.OnDfzHZD);
                }
            }
        }
    }

    @Override // defpackage.sa0
    public final ds NCTxEWno() {
        return null;
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

    @Override // defpackage.sa0, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.b2ZJblxo;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.P7K7Inc8;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.eVhOlqcC;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.Qr9iLBAD;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.ow5vqvCr;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.OnDfzHZD;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.MdtA4re8;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.VgvYg0wo;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.wxUZMvaN;
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
        return this.qoPGr6Ce;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.NCTxEWno;
        return charSequence != null ? charSequence : this.qoPGr6Ce;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.k3x7lurq;
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
        return (this.sjUBp5pO & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.sjUBp5pO & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.sjUBp5pO & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.sjUBp5pO & 8) == 0;
    }

    @Override // defpackage.sa0
    public final sa0 qoPGr6Ce(ds dsVar) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.P7K7Inc8 = Character.toLowerCase(c);
        this.b2ZJblxo = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.sjUBp5pO = (z ? 1 : 0) | (this.sjUBp5pO & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.sjUBp5pO = (z ? 2 : 0) | (this.sjUBp5pO & (-3));
        return this;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final sa0 setContentDescription(CharSequence charSequence) {
        this.eVhOlqcC = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.sjUBp5pO = (z ? 16 : 0) | (this.sjUBp5pO & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.Qr9iLBAD = this.jb9XjC4I.getDrawable(i);
        MdtA4re8();
        return this;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.ow5vqvCr = colorStateList;
        this.ygLcUYwZ = true;
        MdtA4re8();
        return this;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.OnDfzHZD = mode;
        this.lDXGDhIF = true;
        MdtA4re8();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.MdtA4re8 = intent;
        return this;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.wxUZMvaN = c;
        this.VgvYg0wo = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.wxUZMvaN = c;
        this.VgvYg0wo = KeyEvent.normalizeMetaState(i);
        this.P7K7Inc8 = Character.toLowerCase(c2);
        this.b2ZJblxo = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.qoPGr6Ce = this.jb9XjC4I.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.NCTxEWno = charSequence;
        return this;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final sa0 setTooltipText(CharSequence charSequence) {
        this.k3x7lurq = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.sjUBp5pO = (this.sjUBp5pO & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.eVhOlqcC = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.k3x7lurq = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.wxUZMvaN = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.Qr9iLBAD = drawable;
        MdtA4re8();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.P7K7Inc8 = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.qoPGr6Ce = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.wxUZMvaN = c;
        this.P7K7Inc8 = Character.toLowerCase(c2);
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
