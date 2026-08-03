package l;

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

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i implements MenuItem {
    public MenuItem.OnActionExpandListener A;

    /* renamed from: a, reason: collision with root package name */
    public final int f3710a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3711b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3712c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3713d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f3714e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f3715f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f3716g;

    /* renamed from: h, reason: collision with root package name */
    public char f3717h;

    /* renamed from: j, reason: collision with root package name */
    public char f3719j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f3721l;

    /* renamed from: n, reason: collision with root package name */
    public final h f3723n;

    /* renamed from: o, reason: collision with root package name */
    public r f3724o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f3725p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f3726q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f3727r;

    /* renamed from: z, reason: collision with root package name */
    public View f3735z;

    /* renamed from: i, reason: collision with root package name */
    public int f3718i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f3720k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f3722m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f3728s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f3729t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3730u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3731v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3732w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f3733x = 16;
    public boolean B = false;

    /* renamed from: y, reason: collision with root package name */
    public int f3734y = 0;

    public i(h hVar, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f3723n = hVar;
        this.f3710a = i11;
        this.f3711b = i10;
        this.f3712c = i12;
        this.f3713d = i13;
        this.f3714e = charSequence;
    }

    public static void a(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f3732w && (this.f3730u || this.f3731v)) {
            drawable = drawable.mutate();
            if (this.f3730u) {
                drawable.setTintList(this.f3728s);
            }
            if (this.f3731v) {
                drawable.setTintMode(this.f3729t);
            }
            this.f3732w = false;
        }
        return drawable;
    }

    public final i c(CharSequence charSequence) {
        this.f3726q = charSequence;
        this.f3723n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f3734y & 8) == 0) {
            return false;
        }
        if (this.f3735z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3723n.d(this);
        }
        return false;
    }

    public final void d(boolean z10) {
        if (z10) {
            this.f3733x |= 32;
        } else {
            this.f3733x &= -33;
        }
    }

    public final i e(CharSequence charSequence) {
        this.f3727r = charSequence;
        this.f3723n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if ((this.f3734y & 8) == 0 || this.f3735z == null) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3723n.f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3735z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3720k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3719j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3726q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3711b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f3721l;
        if (drawable != null) {
            return b(drawable);
        }
        int i10 = this.f3722m;
        if (i10 == 0) {
            return null;
        }
        Drawable a6 = j.a.a(this.f3723n.f3690a, i10);
        this.f3722m = 0;
        this.f3721l = a6;
        return b(a6);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3728s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3729t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3716g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f3710a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3718i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3717h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f3712c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3724o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3714e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3715f;
        return charSequence != null ? charSequence : this.f3714e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3727r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f3724o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3733x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3733x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3733x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f3733x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f3735z = view;
        if (view != null && view.getId() == -1 && (i10 = this.f3710a) > 0) {
            view.setId(i10);
        }
        h hVar = this.f3723n;
        hVar.f3700k = true;
        hVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f3719j == c3) {
            return this;
        }
        this.f3719j = Character.toLowerCase(c3);
        this.f3723n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f3733x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f3733x = i11;
        if (i10 != i11) {
            this.f3723n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i10 = this.f3733x;
        int i11 = i10 & 4;
        h hVar = this.f3723n;
        if (i11 == 0) {
            int i12 = (i10 & (-3)) | (z10 ? 2 : 0);
            this.f3733x = i12;
            if (i10 != i12) {
                hVar.o(false);
            }
            return this;
        }
        ArrayList arrayList = hVar.f3695f;
        int size = arrayList.size();
        hVar.s();
        for (int i13 = 0; i13 < size; i13++) {
            i iVar = (i) arrayList.get(i13);
            if (iVar.f3711b == this.f3711b && (iVar.f3733x & 4) != 0 && iVar.isCheckable()) {
                boolean z11 = iVar == this;
                int i14 = iVar.f3733x;
                int i15 = (z11 ? 2 : 0) | (i14 & (-3));
                iVar.f3733x = i15;
                if (i14 != i15) {
                    iVar.f3723n.o(false);
                }
            }
        }
        hVar.r();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        c(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f3733x |= 16;
        } else {
            this.f3733x &= -17;
        }
        this.f3723n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3722m = 0;
        this.f3721l = drawable;
        this.f3732w = true;
        this.f3723n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3728s = colorStateList;
        this.f3730u = true;
        this.f3732w = true;
        this.f3723n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3729t = mode;
        this.f3731v = true;
        this.f3732w = true;
        this.f3723n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3716g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        if (this.f3717h == c3) {
            return this;
        }
        this.f3717h = c3;
        this.f3723n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3725p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c7) {
        this.f3717h = c3;
        this.f3719j = Character.toLowerCase(c7);
        this.f3723n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f3734y = i10;
        h hVar = this.f3723n;
        hVar.f3700k = true;
        hVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3714e = charSequence;
        this.f3723n.o(false);
        r rVar = this.f3724o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3715f = charSequence;
        this.f3723n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10 = this.f3733x;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f3733x = i11;
        if (i10 != i11) {
            h hVar = this.f3723n;
            hVar.f3697h = true;
            hVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3714e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i10) {
        if (this.f3719j == c3 && this.f3720k == i10) {
            return this;
        }
        this.f3719j = Character.toLowerCase(c3);
        this.f3720k = KeyEvent.normalizeMetaState(i10);
        this.f3723n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i10) {
        if (this.f3717h == c3 && this.f3718i == i10) {
            return this;
        }
        this.f3717h = c3;
        this.f3718i = KeyEvent.normalizeMetaState(i10);
        this.f3723n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c7, int i10, int i11) {
        this.f3717h = c3;
        this.f3718i = KeyEvent.normalizeMetaState(i10);
        this.f3719j = Character.toLowerCase(c7);
        this.f3720k = KeyEvent.normalizeMetaState(i11);
        this.f3723n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f3721l = null;
        this.f3722m = i10;
        this.f3732w = true;
        this.f3723n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f3723n.f3690a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        h hVar = this.f3723n;
        Context context = hVar.f3690a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f3735z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f3710a) > 0) {
            inflate.setId(i11);
        }
        hVar.f3700k = true;
        hVar.o(true);
        return this;
    }
}
