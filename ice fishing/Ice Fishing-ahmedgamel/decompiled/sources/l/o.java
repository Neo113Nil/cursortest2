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
import i1.C4586c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o implements I.a {

    /* renamed from: A, reason: collision with root package name */
    public char f38757A;

    /* renamed from: C, reason: collision with root package name */
    public char f38759C;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f38761E;

    /* renamed from: G, reason: collision with root package name */
    public final m f38763G;

    /* renamed from: H, reason: collision with root package name */
    public SubMenuC4654E f38764H;

    /* renamed from: I, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f38765I;
    public CharSequence J;

    /* renamed from: K, reason: collision with root package name */
    public CharSequence f38766K;

    /* renamed from: R, reason: collision with root package name */
    public int f38773R;

    /* renamed from: S, reason: collision with root package name */
    public View f38774S;

    /* renamed from: T, reason: collision with root package name */
    public p f38775T;

    /* renamed from: U, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f38776U;

    /* renamed from: n, reason: collision with root package name */
    public final int f38778n;

    /* renamed from: u, reason: collision with root package name */
    public final int f38779u;

    /* renamed from: v, reason: collision with root package name */
    public final int f38780v;

    /* renamed from: w, reason: collision with root package name */
    public final int f38781w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f38782x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f38783y;

    /* renamed from: z, reason: collision with root package name */
    public Intent f38784z;

    /* renamed from: B, reason: collision with root package name */
    public int f38758B = 4096;

    /* renamed from: D, reason: collision with root package name */
    public int f38760D = 4096;

    /* renamed from: F, reason: collision with root package name */
    public int f38762F = 0;

    /* renamed from: L, reason: collision with root package name */
    public ColorStateList f38767L = null;

    /* renamed from: M, reason: collision with root package name */
    public PorterDuff.Mode f38768M = null;

    /* renamed from: N, reason: collision with root package name */
    public boolean f38769N = false;

    /* renamed from: O, reason: collision with root package name */
    public boolean f38770O = false;

    /* renamed from: P, reason: collision with root package name */
    public boolean f38771P = false;

    /* renamed from: Q, reason: collision with root package name */
    public int f38772Q = 16;

    /* renamed from: V, reason: collision with root package name */
    public boolean f38777V = false;

    public o(m mVar, int i, int i4, int i6, int i9, CharSequence charSequence, int i10) {
        this.f38763G = mVar;
        this.f38778n = i4;
        this.f38779u = i;
        this.f38780v = i6;
        this.f38781w = i9;
        this.f38782x = charSequence;
        this.f38773R = i10;
    }

    public static void c(int i, int i4, String str, StringBuilder sb) {
        if ((i & i4) == i4) {
            sb.append(str);
        }
    }

    @Override // I.a
    public final p a() {
        return this.f38775T;
    }

    @Override // I.a
    public final I.a b(p pVar) {
        this.f38774S = null;
        this.f38775T = pVar;
        this.f38763G.p(true);
        p pVar2 = this.f38775T;
        if (pVar2 != null) {
            pVar2.f38785a = new C4586c(25, this);
            pVar2.f38786b.setVisibilityListener(pVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f38773R & 8) == 0) {
            return false;
        }
        if (this.f38774S == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f38776U;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f38763G.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f38771P && (this.f38769N || this.f38770O)) {
            drawable = drawable.mutate();
            if (this.f38769N) {
                H.a.h(drawable, this.f38767L);
            }
            if (this.f38770O) {
                H.a.i(drawable, this.f38768M);
            }
            this.f38771P = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f38773R & 8) != 0) {
            if (this.f38774S == null && (pVar = this.f38775T) != null) {
                this.f38774S = pVar.f38786b.onCreateActionView(this);
            }
            if (this.f38774S != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f38776U;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f38763G.f(this);
        }
        return false;
    }

    public final void f(boolean z6) {
        if (z6) {
            this.f38772Q |= 32;
        } else {
            this.f38772Q &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f38774S;
        if (view != null) {
            return view;
        }
        p pVar = this.f38775T;
        if (pVar == null) {
            return null;
        }
        View onCreateActionView = pVar.f38786b.onCreateActionView(this);
        this.f38774S = onCreateActionView;
        return onCreateActionView;
    }

    @Override // I.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f38760D;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f38759C;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.J;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f38779u;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f38761E;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f38762F;
        if (i == 0) {
            return null;
        }
        Drawable h3 = com.bumptech.glide.g.h(this.f38763G.f38747n, i);
        this.f38762F = 0;
        this.f38761E = h3;
        return d(h3);
    }

    @Override // I.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f38767L;
    }

    @Override // I.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f38768M;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f38784z;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f38778n;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // I.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f38758B;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f38757A;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f38780v;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f38764H;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f38782x;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f38783y;
        return charSequence != null ? charSequence : this.f38782x;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f38766K;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f38764H != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f38777V;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f38772Q & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f38772Q & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f38772Q & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p pVar = this.f38775T;
        return (pVar == null || !pVar.f38786b.overridesItemVisibility()) ? (this.f38772Q & 8) == 0 : (this.f38772Q & 8) == 0 && this.f38775T.f38786b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f38774S = view;
        this.f38775T = null;
        if (view != null && view.getId() == -1 && (i = this.f38778n) > 0) {
            view.setId(i);
        }
        m mVar = this.f38763G;
        mVar.f38734D = true;
        mVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9) {
        if (this.f38759C == c9) {
            return this;
        }
        this.f38759C = Character.toLowerCase(c9);
        this.f38763G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z6) {
        int i = this.f38772Q;
        int i4 = (z6 ? 1 : 0) | (i & (-2));
        this.f38772Q = i4;
        if (i != i4) {
            this.f38763G.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z6) {
        int i = this.f38772Q;
        if ((i & 4) == 0) {
            int i4 = (i & (-3)) | (z6 ? 2 : 0);
            this.f38772Q = i4;
            if (i != i4) {
                this.f38763G.p(false);
            }
            return this;
        }
        m mVar = this.f38763G;
        mVar.getClass();
        ArrayList arrayList = mVar.f38752y;
        int size = arrayList.size();
        mVar.w();
        for (int i6 = 0; i6 < size; i6++) {
            o oVar = (o) arrayList.get(i6);
            if (oVar.f38779u == this.f38779u && (oVar.f38772Q & 4) != 0 && oVar.isCheckable()) {
                boolean z9 = oVar == this;
                int i9 = oVar.f38772Q;
                int i10 = (z9 ? 2 : 0) | (i9 & (-3));
                oVar.f38772Q = i10;
                if (i9 != i10) {
                    oVar.f38763G.p(false);
                }
            }
        }
        mVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z6) {
        if (z6) {
            this.f38772Q |= 16;
        } else {
            this.f38772Q &= -17;
        }
        this.f38763G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f38762F = 0;
        this.f38761E = drawable;
        this.f38771P = true;
        this.f38763G.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f38767L = colorStateList;
        this.f38769N = true;
        this.f38771P = true;
        this.f38763G.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f38768M = mode;
        this.f38770O = true;
        this.f38771P = true;
        this.f38763G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f38784z = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9) {
        if (this.f38757A == c9) {
            return this;
        }
        this.f38757A = c9;
        this.f38763G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f38776U = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f38765I = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10) {
        this.f38757A = c9;
        this.f38759C = Character.toLowerCase(c10);
        this.f38763G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i4 = i & 3;
        if (i4 != 0 && i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f38773R = i;
        m mVar = this.f38763G;
        mVar.f38734D = true;
        mVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f38782x = charSequence;
        this.f38763G.p(false);
        SubMenuC4654E subMenuC4654E = this.f38764H;
        if (subMenuC4654E != null) {
            subMenuC4654E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f38783y = charSequence;
        this.f38763G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z6) {
        int i = this.f38772Q;
        int i4 = (z6 ? 0 : 8) | (i & (-9));
        this.f38772Q = i4;
        if (i != i4) {
            m mVar = this.f38763G;
            mVar.f38731A = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f38782x;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setContentDescription(CharSequence charSequence) {
        this.J = charSequence;
        this.f38763G.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setTooltipText(CharSequence charSequence) {
        this.f38766K = charSequence;
        this.f38763G.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9, int i) {
        if (this.f38759C == c9 && this.f38760D == i) {
            return this;
        }
        this.f38759C = Character.toLowerCase(c9);
        this.f38760D = KeyEvent.normalizeMetaState(i);
        this.f38763G.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9, int i) {
        if (this.f38757A == c9 && this.f38758B == i) {
            return this;
        }
        this.f38757A = c9;
        this.f38758B = KeyEvent.normalizeMetaState(i);
        this.f38763G.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10, int i, int i4) {
        this.f38757A = c9;
        this.f38758B = KeyEvent.normalizeMetaState(i);
        this.f38759C = Character.toLowerCase(c10);
        this.f38760D = KeyEvent.normalizeMetaState(i4);
        this.f38763G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f38761E = null;
        this.f38762F = i;
        this.f38771P = true;
        this.f38763G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f38763G.f38747n.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i4;
        Context context = this.f38763G.f38747n;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f38774S = inflate;
        this.f38775T = null;
        if (inflate != null && inflate.getId() == -1 && (i4 = this.f38778n) > 0) {
            inflate.setId(i4);
        }
        m mVar = this.f38763G;
        mVar.f38734D = true;
        mVar.p(true);
        return this;
    }
}
