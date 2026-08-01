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

/* loaded from: classes.dex */
public final class o implements I.a {

    /* renamed from: A, reason: collision with root package name */
    public p f3733A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f3734B;

    /* renamed from: a, reason: collision with root package name */
    public final int f3736a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3737b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3738c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3739d;
    public CharSequence e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f3740f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f3741g;

    /* renamed from: h, reason: collision with root package name */
    public char f3742h;
    public char j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f3744l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC0229m f3746n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC0216E f3747o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f3748p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f3749q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f3750r;

    /* renamed from: y, reason: collision with root package name */
    public int f3757y;

    /* renamed from: z, reason: collision with root package name */
    public View f3758z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f3743k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f3745m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f3751s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f3752t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3753u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3754v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3755w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f3756x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f3735C = false;

    public o(MenuC0229m menuC0229m, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f3746n = menuC0229m;
        this.f3736a = i2;
        this.f3737b = i;
        this.f3738c = i3;
        this.f3739d = i4;
        this.e = charSequence;
        this.f3757y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // I.a
    public final p a() {
        return this.f3733A;
    }

    @Override // I.a
    public final I.a b(p pVar) {
        this.f3758z = null;
        this.f3733A = pVar;
        this.f3746n.p(true);
        p pVar2 = this.f3733A;
        if (pVar2 != null) {
            pVar2.f3759a = new B.b(26, this);
            pVar2.f3760b.setVisibilityListener(pVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f3757y & 8) == 0) {
            return false;
        }
        if (this.f3758z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3734B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3746n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f3755w && (this.f3753u || this.f3754v)) {
            drawable = drawable.mutate();
            if (this.f3753u) {
                drawable.setTintList(this.f3751s);
            }
            if (this.f3754v) {
                drawable.setTintMode(this.f3752t);
            }
            this.f3755w = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f3757y & 8) == 0) {
            return false;
        }
        if (this.f3758z == null && (pVar = this.f3733A) != null) {
            this.f3758z = pVar.f3760b.onCreateActionView(this);
        }
        return this.f3758z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3734B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3746n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f3756x & 32) == 32;
    }

    public final void g(boolean z2) {
        this.f3756x = (z2 ? 4 : 0) | (this.f3756x & (-5));
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3758z;
        if (view != null) {
            return view;
        }
        p pVar = this.f3733A;
        if (pVar == null) {
            return null;
        }
        View onCreateActionView = pVar.f3760b.onCreateActionView(this);
        this.f3758z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // I.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3743k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3749q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3737b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f3744l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f3745m;
        if (i == 0) {
            return null;
        }
        Drawable n2 = h0.f.n(this.f3746n.f3709a, i);
        this.f3745m = 0;
        this.f3744l = n2;
        return d(n2);
    }

    @Override // I.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3751s;
    }

    @Override // I.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3752t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3741g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f3736a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // I.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3742h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f3738c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3747o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3740f;
        return charSequence != null ? charSequence : this.e;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3750r;
    }

    public final void h(boolean z2) {
        if (z2) {
            this.f3756x |= 32;
        } else {
            this.f3756x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f3747o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f3735C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3756x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3756x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3756x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p pVar = this.f3733A;
        return (pVar == null || !pVar.f3760b.overridesItemVisibility()) ? (this.f3756x & 8) == 0 : (this.f3756x & 8) == 0 && this.f3733A.f3760b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f3758z = view;
        this.f3733A = null;
        if (view != null && view.getId() == -1 && (i = this.f3736a) > 0) {
            view.setId(i);
        }
        MenuC0229m menuC0229m = this.f3746n;
        menuC0229m.f3716k = true;
        menuC0229m.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.j == c2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.f3746n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f3756x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f3756x = i2;
        if (i != i2) {
            this.f3746n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f3756x;
        if ((i & 4) != 0) {
            MenuC0229m menuC0229m = this.f3746n;
            menuC0229m.getClass();
            ArrayList arrayList = menuC0229m.f3713f;
            int size = arrayList.size();
            menuC0229m.w();
            for (int i2 = 0; i2 < size; i2++) {
                o oVar = (o) arrayList.get(i2);
                if (oVar.f3737b == this.f3737b && (oVar.f3756x & 4) != 0 && oVar.isCheckable()) {
                    boolean z3 = oVar == this;
                    int i3 = oVar.f3756x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    oVar.f3756x = i4;
                    if (i3 != i4) {
                        oVar.f3746n.p(false);
                    }
                }
            }
            menuC0229m.v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f3756x = i5;
            if (i != i5) {
                this.f3746n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f3756x |= 16;
        } else {
            this.f3756x &= -17;
        }
        this.f3746n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3745m = 0;
        this.f3744l = drawable;
        this.f3755w = true;
        this.f3746n.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3751s = colorStateList;
        this.f3753u = true;
        this.f3755w = true;
        this.f3746n.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3752t = mode;
        this.f3754v = true;
        this.f3755w = true;
        this.f3746n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3741g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f3742h == c2) {
            return this;
        }
        this.f3742h = c2;
        this.f3746n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3734B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3748p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f3742h = c2;
        this.j = Character.toLowerCase(c3);
        this.f3746n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f3757y = i;
        MenuC0229m menuC0229m = this.f3746n;
        menuC0229m.f3716k = true;
        menuC0229m.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.f3746n.p(false);
        SubMenuC0216E subMenuC0216E = this.f3747o;
        if (subMenuC0216E != null) {
            subMenuC0216E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3740f = charSequence;
        this.f3746n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f3756x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f3756x = i2;
        if (i != i2) {
            MenuC0229m menuC0229m = this.f3746n;
            menuC0229m.f3715h = true;
            menuC0229m.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setContentDescription(CharSequence charSequence) {
        this.f3749q = charSequence;
        this.f3746n.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setTooltipText(CharSequence charSequence) {
        this.f3750r = charSequence;
        this.f3746n.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.j == c2 && this.f3743k == i) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.f3743k = KeyEvent.normalizeMetaState(i);
        this.f3746n.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.f3742h == c2 && this.i == i) {
            return this;
        }
        this.f3742h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f3746n.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f3742h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.j = Character.toLowerCase(c3);
        this.f3743k = KeyEvent.normalizeMetaState(i2);
        this.f3746n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f3744l = null;
        this.f3745m = i;
        this.f3755w = true;
        this.f3746n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f3746n.f3709a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f3746n.f3709a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f3758z = inflate;
        this.f3733A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f3736a) > 0) {
            inflate.setId(i2);
        }
        MenuC0229m menuC0229m = this.f3746n;
        menuC0229m.f3716k = true;
        menuC0229m.p(true);
        return this;
    }
}
