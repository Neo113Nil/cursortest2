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
import d.AbstractC0142a;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.util.ArrayList;
import s.AbstractC1044a;

/* loaded from: classes.dex */
public final class k implements MenuItem {

    /* renamed from: A, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f3070A;

    /* renamed from: a, reason: collision with root package name */
    public final int f3072a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3073b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3074c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3075d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f3076e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f3077f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f3078g;

    /* renamed from: h, reason: collision with root package name */
    public char f3079h;

    /* renamed from: j, reason: collision with root package name */
    public char f3081j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f3083l;

    /* renamed from: n, reason: collision with root package name */
    public final j f3085n;

    /* renamed from: o, reason: collision with root package name */
    public t f3086o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f3087p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f3088q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f3089r;

    /* renamed from: z, reason: collision with root package name */
    public View f3096z;

    /* renamed from: i, reason: collision with root package name */
    public int f3080i = Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: k, reason: collision with root package name */
    public int f3082k = Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: m, reason: collision with root package name */
    public int f3084m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f3090s = null;
    public PorterDuff.Mode t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3091u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3092v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3093w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f3094x = 16;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3071B = false;

    /* renamed from: y, reason: collision with root package name */
    public int f3095y = 0;

    public k(j jVar, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f3085n = jVar;
        this.f3072a = i3;
        this.f3073b = i2;
        this.f3074c = i4;
        this.f3075d = i5;
        this.f3076e = charSequence;
    }

    public static void a(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f3093w && (this.f3091u || this.f3092v)) {
            drawable = drawable.mutate();
            if (this.f3091u) {
                AbstractC1044a.h(drawable, this.f3090s);
            }
            if (this.f3092v) {
                AbstractC1044a.i(drawable, this.t);
            }
            this.f3093w = false;
        }
        return drawable;
    }

    public final boolean c() {
        return ((this.f3095y & 8) == 0 || this.f3096z == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f3095y & 8) == 0) {
            return false;
        }
        if (this.f3096z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3070A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3085n.d(this);
        }
        return false;
    }

    public final boolean d() {
        return (this.f3094x & 32) == 32;
    }

    public final k e(CharSequence charSequence) {
        this.f3088q = charSequence;
        this.f3085n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3070A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3085n.f(this);
        }
        return false;
    }

    public final void f(boolean z2) {
        if (z2) {
            this.f3094x |= 32;
        } else {
            this.f3094x &= -33;
        }
    }

    public final k g(CharSequence charSequence) {
        this.f3089r = charSequence;
        this.f3085n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3096z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3082k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3081j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3088q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3073b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f3083l;
        if (drawable != null) {
            return b(drawable);
        }
        int i2 = this.f3084m;
        if (i2 == 0) {
            return null;
        }
        Drawable a2 = AbstractC0142a.a(this.f3085n.f3051a, i2);
        this.f3084m = 0;
        this.f3083l = a2;
        return b(a2);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3090s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3078g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f3072a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3080i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3079h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f3074c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3086o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3076e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3077f;
        return charSequence != null ? charSequence : this.f3076e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3089r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f3086o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f3071B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3094x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3094x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3094x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f3094x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.f3096z = view;
        if (view != null && view.getId() == -1 && (i2 = this.f3072a) > 0) {
            view.setId(i2);
        }
        j jVar = this.f3085n;
        jVar.f3061k = true;
        jVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f3081j == c2) {
            return this;
        }
        this.f3081j = Character.toLowerCase(c2);
        this.f3085n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.f3094x;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f3094x = i3;
        if (i2 != i3) {
            this.f3085n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i2 = this.f3094x;
        if ((i2 & 4) != 0) {
            j jVar = this.f3085n;
            jVar.getClass();
            ArrayList arrayList = jVar.f3056f;
            int size = arrayList.size();
            jVar.s();
            for (int i3 = 0; i3 < size; i3++) {
                k kVar = (k) arrayList.get(i3);
                if (kVar.f3073b == this.f3073b && (kVar.f3094x & 4) != 0 && kVar.isCheckable()) {
                    boolean z3 = kVar == this;
                    int i4 = kVar.f3094x;
                    int i5 = (z3 ? 2 : 0) | (i4 & (-3));
                    kVar.f3094x = i5;
                    if (i4 != i5) {
                        kVar.f3085n.o(false);
                    }
                }
            }
            jVar.r();
        } else {
            int i6 = (i2 & (-3)) | (z2 ? 2 : 0);
            this.f3094x = i6;
            if (i2 != i6) {
                this.f3085n.o(false);
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
            this.f3094x |= 16;
        } else {
            this.f3094x &= -17;
        }
        this.f3085n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3084m = 0;
        this.f3083l = drawable;
        this.f3093w = true;
        this.f3085n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3090s = colorStateList;
        this.f3091u = true;
        this.f3093w = true;
        this.f3085n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.f3092v = true;
        this.f3093w = true;
        this.f3085n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3078g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f3079h == c2) {
            return this;
        }
        this.f3079h = c2;
        this.f3085n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3070A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3087p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f3079h = c2;
        this.f3081j = Character.toLowerCase(c3);
        this.f3085n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f3095y = i2;
        j jVar = this.f3085n;
        jVar.f3061k = true;
        jVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3076e = charSequence;
        this.f3085n.o(false);
        t tVar = this.f3086o;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3077f = charSequence;
        this.f3085n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        g(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i2 = this.f3094x;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f3094x = i3;
        if (i2 != i3) {
            j jVar = this.f3085n;
            jVar.f3058h = true;
            jVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3076e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f3081j == c2 && this.f3082k == i2) {
            return this;
        }
        this.f3081j = Character.toLowerCase(c2);
        this.f3082k = KeyEvent.normalizeMetaState(i2);
        this.f3085n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f3079h == c2 && this.f3080i == i2) {
            return this;
        }
        this.f3079h = c2;
        this.f3080i = KeyEvent.normalizeMetaState(i2);
        this.f3085n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f3079h = c2;
        this.f3080i = KeyEvent.normalizeMetaState(i2);
        this.f3081j = Character.toLowerCase(c3);
        this.f3082k = KeyEvent.normalizeMetaState(i3);
        this.f3085n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f3083l = null;
        this.f3084m = i2;
        this.f3093w = true;
        this.f3085n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f3085n.f3051a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i3;
        Context context = this.f3085n.f3051a;
        View inflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.f3096z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i3 = this.f3072a) > 0) {
            inflate.setId(i3);
        }
        j jVar = this.f3085n;
        jVar.f3061k = true;
        jVar.o(true);
        return this;
    }
}
