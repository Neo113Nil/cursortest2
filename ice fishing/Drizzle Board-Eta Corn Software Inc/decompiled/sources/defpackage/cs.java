package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class cs implements sa0 {
    public View DK9slbsy;
    public final int MdtA4re8;
    public final int NCTxEWno;
    public CharSequence OxcuoDLp;
    public CharSequence P7K7Inc8;
    public char Qr9iLBAD;
    public MenuItem.OnActionExpandListener U0LaHZX7;
    public CharSequence VgvYg0wo;
    public int WYNAV5pd;
    public CharSequence amk52bBQ;
    public Intent b2ZJblxo;
    public char eVhOlqcC;
    public ka0 lDXGDhIF;
    public ds lwWCatUu;
    public Drawable ow5vqvCr;
    public final int qoPGr6Ce;
    public MenuItem.OnMenuItemClickListener sjUBp5pO;
    public final int wxUZMvaN;
    public final yr ygLcUYwZ;
    public int jb9XjC4I = 4096;
    public int k3x7lurq = 4096;
    public int OnDfzHZD = 0;
    public ColorStateList KlHjfFWx = null;
    public PorterDuff.Mode Ey6iv0m0 = null;
    public boolean I5GHvsYW = false;
    public boolean RXQxj5Oe = false;
    public boolean FySoLYna = false;
    public int gjV1z5T1 = 16;
    public boolean i7xS8jrb = false;

    public cs(yr yrVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.ygLcUYwZ = yrVar;
        this.qoPGr6Ce = i2;
        this.NCTxEWno = i;
        this.MdtA4re8 = i3;
        this.wxUZMvaN = i4;
        this.VgvYg0wo = charSequence;
        this.WYNAV5pd = i5;
    }

    public static void MdtA4re8(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // defpackage.sa0
    public final ds NCTxEWno() {
        return this.lwWCatUu;
    }

    public final void P7K7Inc8(boolean z) {
        int i = this.gjV1z5T1;
        if (z) {
            this.gjV1z5T1 = i | 32;
        } else {
            this.gjV1z5T1 = i & (-33);
        }
    }

    public final boolean VgvYg0wo() {
        ds dsVar;
        if ((this.WYNAV5pd & 8) != 0) {
            View view = this.DK9slbsy;
            if (view == null && (dsVar = this.lwWCatUu) != null) {
                view = dsVar.NCTxEWno.onCreateActionView(this);
                this.DK9slbsy = view;
            }
            if (view != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.WYNAV5pd & 8) == 0) {
            return false;
        }
        if (this.DK9slbsy == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.U0LaHZX7;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.ygLcUYwZ.wxUZMvaN(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!VgvYg0wo()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.U0LaHZX7;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.ygLcUYwZ.P7K7Inc8(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.DK9slbsy;
        if (view != null) {
            return view;
        }
        ds dsVar = this.lwWCatUu;
        if (dsVar == null) {
            return null;
        }
        View onCreateActionView = dsVar.NCTxEWno.onCreateActionView(this);
        this.DK9slbsy = onCreateActionView;
        return onCreateActionView;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.k3x7lurq;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.eVhOlqcC;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.OxcuoDLp;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.NCTxEWno;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.ow5vqvCr;
        if (drawable != null) {
            return wxUZMvaN(drawable);
        }
        int i = this.OnDfzHZD;
        if (i == 0) {
            return null;
        }
        Drawable Ey6iv0m0 = ra.Ey6iv0m0(this.ygLcUYwZ.qoPGr6Ce, i);
        this.OnDfzHZD = 0;
        this.ow5vqvCr = Ey6iv0m0;
        return wxUZMvaN(Ey6iv0m0);
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.KlHjfFWx;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.Ey6iv0m0;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.b2ZJblxo;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.qoPGr6Ce;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.jb9XjC4I;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.Qr9iLBAD;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.MdtA4re8;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.lDXGDhIF;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.VgvYg0wo;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.P7K7Inc8;
        return charSequence != null ? charSequence : this.VgvYg0wo;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.amk52bBQ;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.lDXGDhIF != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.i7xS8jrb;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.gjV1z5T1 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.gjV1z5T1 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.gjV1z5T1 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ds dsVar = this.lwWCatUu;
        return (dsVar == null || !dsVar.NCTxEWno.overridesItemVisibility()) ? (this.gjV1z5T1 & 8) == 0 : (this.gjV1z5T1 & 8) == 0 && this.lwWCatUu.NCTxEWno.isVisible();
    }

    @Override // defpackage.sa0
    public final sa0 qoPGr6Ce(ds dsVar) {
        this.DK9slbsy = null;
        this.lwWCatUu = dsVar;
        this.ygLcUYwZ.sjUBp5pO(true);
        ds dsVar2 = this.lwWCatUu;
        if (dsVar2 != null) {
            dsVar2.qoPGr6Ce = new tg0(19, this);
            dsVar2.NCTxEWno.setVisibilityListener(dsVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        yr yrVar = this.ygLcUYwZ;
        Context context = yrVar.qoPGr6Ce;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.DK9slbsy = inflate;
        this.lwWCatUu = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.qoPGr6Ce) > 0) {
            inflate.setId(i2);
        }
        yrVar.k3x7lurq = true;
        yrVar.sjUBp5pO(true);
        return this;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.eVhOlqcC == c && this.k3x7lurq == i) {
            return this;
        }
        this.eVhOlqcC = Character.toLowerCase(c);
        this.k3x7lurq = KeyEvent.normalizeMetaState(i);
        this.ygLcUYwZ.sjUBp5pO(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.gjV1z5T1;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.gjV1z5T1 = i2;
        if (i != i2) {
            this.ygLcUYwZ.sjUBp5pO(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.gjV1z5T1;
        int i2 = i & 4;
        yr yrVar = this.ygLcUYwZ;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.gjV1z5T1 = i3;
            if (i != i3) {
                yrVar.sjUBp5pO(false);
            }
            return this;
        }
        ArrayList arrayList = yrVar.P7K7Inc8;
        int size = arrayList.size();
        yrVar.FySoLYna();
        for (int i4 = 0; i4 < size; i4++) {
            cs csVar = (cs) arrayList.get(i4);
            if (csVar.NCTxEWno == this.NCTxEWno && (csVar.gjV1z5T1 & 4) != 0 && csVar.isCheckable()) {
                boolean z2 = csVar == this;
                int i5 = csVar.gjV1z5T1;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                csVar.gjV1z5T1 = i6;
                if (i5 != i6) {
                    csVar.ygLcUYwZ.sjUBp5pO(false);
                }
            }
        }
        yrVar.RXQxj5Oe();
        return this;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final sa0 setContentDescription(CharSequence charSequence) {
        this.OxcuoDLp = charSequence;
        this.ygLcUYwZ.sjUBp5pO(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i = this.gjV1z5T1;
        if (z) {
            this.gjV1z5T1 = i | 16;
        } else {
            this.gjV1z5T1 = i & (-17);
        }
        this.ygLcUYwZ.sjUBp5pO(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.ow5vqvCr = null;
        this.OnDfzHZD = i;
        this.FySoLYna = true;
        this.ygLcUYwZ.sjUBp5pO(false);
        return this;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.KlHjfFWx = colorStateList;
        this.I5GHvsYW = true;
        this.FySoLYna = true;
        this.ygLcUYwZ.sjUBp5pO(false);
        return this;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.Ey6iv0m0 = mode;
        this.RXQxj5Oe = true;
        this.FySoLYna = true;
        this.ygLcUYwZ.sjUBp5pO(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.b2ZJblxo = intent;
        return this;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.Qr9iLBAD == c && this.jb9XjC4I == i) {
            return this;
        }
        this.Qr9iLBAD = c;
        this.jb9XjC4I = KeyEvent.normalizeMetaState(i);
        this.ygLcUYwZ.sjUBp5pO(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.U0LaHZX7 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.sjUBp5pO = onMenuItemClickListener;
        return this;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.Qr9iLBAD = c;
        this.jb9XjC4I = KeyEvent.normalizeMetaState(i);
        this.eVhOlqcC = Character.toLowerCase(c2);
        this.k3x7lurq = KeyEvent.normalizeMetaState(i2);
        this.ygLcUYwZ.sjUBp5pO(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            m1.sjUBp5pO("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.WYNAV5pd = i;
        yr yrVar = this.ygLcUYwZ;
        yrVar.k3x7lurq = true;
        yrVar.sjUBp5pO(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.VgvYg0wo = charSequence;
        this.ygLcUYwZ.sjUBp5pO(false);
        ka0 ka0Var = this.lDXGDhIF;
        if (ka0Var != null) {
            ka0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.P7K7Inc8 = charSequence;
        this.ygLcUYwZ.sjUBp5pO(false);
        return this;
    }

    @Override // defpackage.sa0, android.view.MenuItem
    public final sa0 setTooltipText(CharSequence charSequence) {
        this.amk52bBQ = charSequence;
        this.ygLcUYwZ.sjUBp5pO(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.gjV1z5T1;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.gjV1z5T1 = i2;
        if (i != i2) {
            yr yrVar = this.ygLcUYwZ;
            yrVar.Qr9iLBAD = true;
            yrVar.sjUBp5pO(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.VgvYg0wo;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final Drawable wxUZMvaN(Drawable drawable) {
        if (drawable != null && this.FySoLYna && (this.I5GHvsYW || this.RXQxj5Oe)) {
            drawable = drawable.mutate();
            if (this.I5GHvsYW) {
                drawable.setTintList(this.KlHjfFWx);
            }
            if (this.RXQxj5Oe) {
                drawable.setTintMode(this.Ey6iv0m0);
            }
            this.FySoLYna = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.OnDfzHZD = 0;
        this.ow5vqvCr = drawable;
        this.FySoLYna = true;
        this.ygLcUYwZ.sjUBp5pO(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.ygLcUYwZ.qoPGr6Ce.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.Qr9iLBAD == c) {
            return this;
        }
        this.Qr9iLBAD = c;
        this.ygLcUYwZ.sjUBp5pO(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.Qr9iLBAD = c;
        this.eVhOlqcC = Character.toLowerCase(c2);
        this.ygLcUYwZ.sjUBp5pO(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.eVhOlqcC == c) {
            return this;
        }
        this.eVhOlqcC = Character.toLowerCase(c);
        this.ygLcUYwZ.sjUBp5pO(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.DK9slbsy = view;
        this.lwWCatUu = null;
        if (view != null && view.getId() == -1 && (i = this.qoPGr6Ce) > 0) {
            view.setId(i);
        }
        yr yrVar = this.ygLcUYwZ;
        yrVar.k3x7lurq = true;
        yrVar.sjUBp5pO(true);
        return this;
    }
}
