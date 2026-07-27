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
import g1.C4522b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o implements I.a {

    /* renamed from: A, reason: collision with root package name */
    public char f38830A;

    /* renamed from: C, reason: collision with root package name */
    public char f38832C;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f38834E;

    /* renamed from: G, reason: collision with root package name */
    public final m f38836G;

    /* renamed from: H, reason: collision with root package name */
    public SubMenuC4643E f38837H;

    /* renamed from: I, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f38838I;
    public CharSequence J;

    /* renamed from: K, reason: collision with root package name */
    public CharSequence f38839K;

    /* renamed from: R, reason: collision with root package name */
    public int f38846R;

    /* renamed from: S, reason: collision with root package name */
    public View f38847S;

    /* renamed from: T, reason: collision with root package name */
    public p f38848T;

    /* renamed from: U, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f38849U;

    /* renamed from: n, reason: collision with root package name */
    public final int f38851n;

    /* renamed from: u, reason: collision with root package name */
    public final int f38852u;

    /* renamed from: v, reason: collision with root package name */
    public final int f38853v;

    /* renamed from: w, reason: collision with root package name */
    public final int f38854w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f38855x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f38856y;

    /* renamed from: z, reason: collision with root package name */
    public Intent f38857z;

    /* renamed from: B, reason: collision with root package name */
    public int f38831B = 4096;

    /* renamed from: D, reason: collision with root package name */
    public int f38833D = 4096;

    /* renamed from: F, reason: collision with root package name */
    public int f38835F = 0;

    /* renamed from: L, reason: collision with root package name */
    public ColorStateList f38840L = null;

    /* renamed from: M, reason: collision with root package name */
    public PorterDuff.Mode f38841M = null;

    /* renamed from: N, reason: collision with root package name */
    public boolean f38842N = false;

    /* renamed from: O, reason: collision with root package name */
    public boolean f38843O = false;

    /* renamed from: P, reason: collision with root package name */
    public boolean f38844P = false;

    /* renamed from: Q, reason: collision with root package name */
    public int f38845Q = 16;

    /* renamed from: V, reason: collision with root package name */
    public boolean f38850V = false;

    public o(m mVar, int i, int i6, int i9, int i10, CharSequence charSequence, int i11) {
        this.f38836G = mVar;
        this.f38851n = i6;
        this.f38852u = i;
        this.f38853v = i9;
        this.f38854w = i10;
        this.f38855x = charSequence;
        this.f38846R = i11;
    }

    public static void c(int i, int i6, String str, StringBuilder sb) {
        if ((i & i6) == i6) {
            sb.append(str);
        }
    }

    @Override // I.a
    public final p a() {
        return this.f38848T;
    }

    @Override // I.a
    public final I.a b(p pVar) {
        this.f38847S = null;
        this.f38848T = pVar;
        this.f38836G.p(true);
        p pVar2 = this.f38848T;
        if (pVar2 != null) {
            pVar2.f38858a = new C4522b(23, this);
            pVar2.f38859b.setVisibilityListener(pVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f38846R & 8) == 0) {
            return false;
        }
        if (this.f38847S == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f38849U;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f38836G.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f38844P && (this.f38842N || this.f38843O)) {
            drawable = drawable.mutate();
            if (this.f38842N) {
                H.a.h(drawable, this.f38840L);
            }
            if (this.f38843O) {
                H.a.i(drawable, this.f38841M);
            }
            this.f38844P = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f38846R & 8) != 0) {
            if (this.f38847S == null && (pVar = this.f38848T) != null) {
                this.f38847S = pVar.f38859b.onCreateActionView(this);
            }
            if (this.f38847S != null) {
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
        MenuItem.OnActionExpandListener onActionExpandListener = this.f38849U;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f38836G.f(this);
        }
        return false;
    }

    public final void f(boolean z3) {
        if (z3) {
            this.f38845Q |= 32;
        } else {
            this.f38845Q &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f38847S;
        if (view != null) {
            return view;
        }
        p pVar = this.f38848T;
        if (pVar == null) {
            return null;
        }
        View onCreateActionView = pVar.f38859b.onCreateActionView(this);
        this.f38847S = onCreateActionView;
        return onCreateActionView;
    }

    @Override // I.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f38833D;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f38832C;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.J;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f38852u;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f38834E;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f38835F;
        if (i == 0) {
            return null;
        }
        Drawable e9 = com.bumptech.glide.g.e(this.f38836G.f38820n, i);
        this.f38835F = 0;
        this.f38834E = e9;
        return d(e9);
    }

    @Override // I.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f38840L;
    }

    @Override // I.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f38841M;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f38857z;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f38851n;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // I.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f38831B;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f38830A;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f38853v;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f38837H;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f38855x;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f38856y;
        return charSequence != null ? charSequence : this.f38855x;
    }

    @Override // I.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f38839K;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f38837H != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f38850V;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f38845Q & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f38845Q & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f38845Q & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p pVar = this.f38848T;
        return (pVar == null || !pVar.f38859b.overridesItemVisibility()) ? (this.f38845Q & 8) == 0 : (this.f38845Q & 8) == 0 && this.f38848T.f38859b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f38847S = view;
        this.f38848T = null;
        if (view != null && view.getId() == -1 && (i = this.f38851n) > 0) {
            view.setId(i);
        }
        m mVar = this.f38836G;
        mVar.f38807D = true;
        mVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9) {
        if (this.f38832C == c9) {
            return this;
        }
        this.f38832C = Character.toLowerCase(c9);
        this.f38836G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        int i = this.f38845Q;
        int i6 = (z3 ? 1 : 0) | (i & (-2));
        this.f38845Q = i6;
        if (i != i6) {
            this.f38836G.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        int i = this.f38845Q;
        if ((i & 4) == 0) {
            int i6 = (i & (-3)) | (z3 ? 2 : 0);
            this.f38845Q = i6;
            if (i != i6) {
                this.f38836G.p(false);
            }
            return this;
        }
        m mVar = this.f38836G;
        mVar.getClass();
        ArrayList arrayList = mVar.f38825y;
        int size = arrayList.size();
        mVar.w();
        for (int i9 = 0; i9 < size; i9++) {
            o oVar = (o) arrayList.get(i9);
            if (oVar.f38852u == this.f38852u && (oVar.f38845Q & 4) != 0 && oVar.isCheckable()) {
                boolean z6 = oVar == this;
                int i10 = oVar.f38845Q;
                int i11 = (z6 ? 2 : 0) | (i10 & (-3));
                oVar.f38845Q = i11;
                if (i10 != i11) {
                    oVar.f38836G.p(false);
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
    public final MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f38845Q |= 16;
        } else {
            this.f38845Q &= -17;
        }
        this.f38836G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f38835F = 0;
        this.f38834E = drawable;
        this.f38844P = true;
        this.f38836G.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f38840L = colorStateList;
        this.f38842N = true;
        this.f38844P = true;
        this.f38836G.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f38841M = mode;
        this.f38843O = true;
        this.f38844P = true;
        this.f38836G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f38857z = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9) {
        if (this.f38830A == c9) {
            return this;
        }
        this.f38830A = c9;
        this.f38836G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f38849U = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f38838I = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10) {
        this.f38830A = c9;
        this.f38832C = Character.toLowerCase(c10);
        this.f38836G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i6 = i & 3;
        if (i6 != 0 && i6 != 1 && i6 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f38846R = i;
        m mVar = this.f38836G;
        mVar.f38807D = true;
        mVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f38855x = charSequence;
        this.f38836G.p(false);
        SubMenuC4643E subMenuC4643E = this.f38837H;
        if (subMenuC4643E != null) {
            subMenuC4643E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f38856y = charSequence;
        this.f38836G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        int i = this.f38845Q;
        int i6 = (z3 ? 0 : 8) | (i & (-9));
        this.f38845Q = i6;
        if (i != i6) {
            m mVar = this.f38836G;
            mVar.f38804A = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f38855x;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setContentDescription(CharSequence charSequence) {
        this.J = charSequence;
        this.f38836G.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final I.a setTooltipText(CharSequence charSequence) {
        this.f38839K = charSequence;
        this.f38836G.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9, int i) {
        if (this.f38832C == c9 && this.f38833D == i) {
            return this;
        }
        this.f38832C = Character.toLowerCase(c9);
        this.f38833D = KeyEvent.normalizeMetaState(i);
        this.f38836G.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9, int i) {
        if (this.f38830A == c9 && this.f38831B == i) {
            return this;
        }
        this.f38830A = c9;
        this.f38831B = KeyEvent.normalizeMetaState(i);
        this.f38836G.p(false);
        return this;
    }

    @Override // I.a, android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10, int i, int i6) {
        this.f38830A = c9;
        this.f38831B = KeyEvent.normalizeMetaState(i);
        this.f38832C = Character.toLowerCase(c10);
        this.f38833D = KeyEvent.normalizeMetaState(i6);
        this.f38836G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f38834E = null;
        this.f38835F = i;
        this.f38844P = true;
        this.f38836G.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f38836G.f38820n.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i6;
        Context context = this.f38836G.f38820n;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f38847S = inflate;
        this.f38848T = null;
        if (inflate != null && inflate.getId() == -1 && (i6 = this.f38851n) > 0) {
            inflate.setId(i6);
        }
        m mVar = this.f38836G;
        mVar.f38807D = true;
        mVar.p(true);
        return this;
    }
}
