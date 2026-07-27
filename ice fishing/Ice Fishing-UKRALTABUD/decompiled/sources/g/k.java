package g;

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
import d.AbstractC0110a;
import java.util.ArrayList;
import q.AbstractC0226a;

/* loaded from: classes.dex */
public final class k implements MenuItem {

    /* renamed from: A, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f1983A;

    /* renamed from: a, reason: collision with root package name */
    public final int f1985a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1986b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1987c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1988d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1989e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f1990f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f1991g;

    /* renamed from: h, reason: collision with root package name */
    public char f1992h;

    /* renamed from: j, reason: collision with root package name */
    public char f1994j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f1996l;

    /* renamed from: n, reason: collision with root package name */
    public final j f1998n;

    /* renamed from: o, reason: collision with root package name */
    public t f1999o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2000p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2001q;
    public CharSequence r;

    /* renamed from: z, reason: collision with root package name */
    public View f2009z;

    /* renamed from: i, reason: collision with root package name */
    public int f1993i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f1995k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f1997m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2002s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2003t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2004u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2005v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2006w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2007x = 16;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1984B = false;

    /* renamed from: y, reason: collision with root package name */
    public int f2008y = 0;

    public k(j jVar, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f1998n = jVar;
        this.f1985a = i3;
        this.f1986b = i2;
        this.f1987c = i4;
        this.f1988d = i5;
        this.f1989e = charSequence;
    }

    public static void a(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f2006w && (this.f2004u || this.f2005v)) {
            drawable = drawable.mutate();
            if (this.f2004u) {
                AbstractC0226a.h(drawable, this.f2002s);
            }
            if (this.f2005v) {
                AbstractC0226a.i(drawable, this.f2003t);
            }
            this.f2006w = false;
        }
        return drawable;
    }

    public final boolean c() {
        return ((this.f2008y & 8) == 0 || this.f2009z == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2008y & 8) == 0) {
            return false;
        }
        if (this.f2009z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1983A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1998n.d(this);
        }
        return false;
    }

    public final boolean d() {
        return (this.f2007x & 32) == 32;
    }

    public final k e(CharSequence charSequence) {
        this.f2001q = charSequence;
        this.f1998n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1983A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1998n.f(this);
        }
        return false;
    }

    public final void f(boolean z2) {
        if (z2) {
            this.f2007x |= 32;
        } else {
            this.f2007x &= -33;
        }
    }

    public final k g(CharSequence charSequence) {
        this.r = charSequence;
        this.f1998n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2009z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f1995k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f1994j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2001q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f1986b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f1996l;
        if (drawable != null) {
            return b(drawable);
        }
        int i2 = this.f1997m;
        if (i2 == 0) {
            return null;
        }
        Drawable a2 = AbstractC0110a.a(this.f1998n.f1964a, i2);
        this.f1997m = 0;
        this.f1996l = a2;
        return b(a2);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2002s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2003t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f1991g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f1985a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f1993i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f1992h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f1987c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f1999o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f1989e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1990f;
        return charSequence != null ? charSequence : this.f1989e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f1999o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f1984B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2007x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2007x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2007x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f2007x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.f2009z = view;
        if (view != null && view.getId() == -1 && (i2 = this.f1985a) > 0) {
            view.setId(i2);
        }
        j jVar = this.f1998n;
        jVar.f1974k = true;
        jVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f1994j == c2) {
            return this;
        }
        this.f1994j = Character.toLowerCase(c2);
        this.f1998n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.f2007x;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f2007x = i3;
        if (i2 != i3) {
            this.f1998n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i2 = this.f2007x;
        if ((i2 & 4) != 0) {
            j jVar = this.f1998n;
            jVar.getClass();
            ArrayList arrayList = jVar.f1969f;
            int size = arrayList.size();
            jVar.s();
            for (int i3 = 0; i3 < size; i3++) {
                k kVar = (k) arrayList.get(i3);
                if (kVar.f1986b == this.f1986b && (kVar.f2007x & 4) != 0 && kVar.isCheckable()) {
                    boolean z3 = kVar == this;
                    int i4 = kVar.f2007x;
                    int i5 = (z3 ? 2 : 0) | (i4 & (-3));
                    kVar.f2007x = i5;
                    if (i4 != i5) {
                        kVar.f1998n.o(false);
                    }
                }
            }
            jVar.r();
        } else {
            int i6 = (i2 & (-3)) | (z2 ? 2 : 0);
            this.f2007x = i6;
            if (i2 != i6) {
                this.f1998n.o(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f2007x |= 16;
        } else {
            this.f2007x &= -17;
        }
        this.f1998n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f1997m = 0;
        this.f1996l = drawable;
        this.f2006w = true;
        this.f1998n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2002s = colorStateList;
        this.f2004u = true;
        this.f2006w = true;
        this.f1998n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2003t = mode;
        this.f2005v = true;
        this.f2006w = true;
        this.f1998n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f1991g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f1992h == c2) {
            return this;
        }
        this.f1992h = c2;
        this.f1998n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1983A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2000p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f1992h = c2;
        this.f1994j = Character.toLowerCase(c3);
        this.f1998n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2008y = i2;
        j jVar = this.f1998n;
        jVar.f1974k = true;
        jVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f1989e = charSequence;
        this.f1998n.o(false);
        t tVar = this.f1999o;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1990f = charSequence;
        this.f1998n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        g(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i2 = this.f2007x;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f2007x = i3;
        if (i2 != i3) {
            j jVar = this.f1998n;
            jVar.f1971h = true;
            jVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f1989e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f1994j == c2 && this.f1995k == i2) {
            return this;
        }
        this.f1994j = Character.toLowerCase(c2);
        this.f1995k = KeyEvent.normalizeMetaState(i2);
        this.f1998n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f1992h == c2 && this.f1993i == i2) {
            return this;
        }
        this.f1992h = c2;
        this.f1993i = KeyEvent.normalizeMetaState(i2);
        this.f1998n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f1992h = c2;
        this.f1993i = KeyEvent.normalizeMetaState(i2);
        this.f1994j = Character.toLowerCase(c3);
        this.f1995k = KeyEvent.normalizeMetaState(i3);
        this.f1998n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f1996l = null;
        this.f1997m = i2;
        this.f2006w = true;
        this.f1998n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f1998n.f1964a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i3;
        Context context = this.f1998n.f1964a;
        View inflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.f2009z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i3 = this.f1985a) > 0) {
            inflate.setId(i3);
        }
        j jVar = this.f1998n;
        jVar.f1974k = true;
        jVar.o(true);
        return this;
    }
}
