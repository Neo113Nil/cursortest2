package androidx.appcompat.widget;

import Z0.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import c.AbstractC0131a;
import com.watchfacestudio.spraktum.R;
import d.AbstractC0142a;
import f.C0149d;
import g.j;
import g.k;
import h.C0210f;
import h.C0213i;
import h.C0220p;
import h.C0221q;
import h.C0223t;
import h.InterfaceC0226w;
import h.O;
import h.i0;
import h.j0;
import h.k0;
import h.l0;
import h.m0;
import h.n0;
import h.t0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import y.x;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f2209A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2210B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2211C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f2212D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f2213E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f2214F;
    public final i G;

    /* renamed from: H, reason: collision with root package name */
    public n0 f2215H;

    /* renamed from: I, reason: collision with root package name */
    public j0 f2216I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2217J;

    /* renamed from: K, reason: collision with root package name */
    public final C.b f2218K;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f2219a;

    /* renamed from: b, reason: collision with root package name */
    public C0223t f2220b;

    /* renamed from: c, reason: collision with root package name */
    public C0223t f2221c;

    /* renamed from: d, reason: collision with root package name */
    public C0220p f2222d;

    /* renamed from: e, reason: collision with root package name */
    public C0221q f2223e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f2224f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f2225g;

    /* renamed from: h, reason: collision with root package name */
    public C0220p f2226h;

    /* renamed from: i, reason: collision with root package name */
    public View f2227i;

    /* renamed from: j, reason: collision with root package name */
    public Context f2228j;

    /* renamed from: k, reason: collision with root package name */
    public int f2229k;

    /* renamed from: l, reason: collision with root package name */
    public int f2230l;

    /* renamed from: m, reason: collision with root package name */
    public int f2231m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2232n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2233o;

    /* renamed from: p, reason: collision with root package name */
    public int f2234p;

    /* renamed from: q, reason: collision with root package name */
    public int f2235q;

    /* renamed from: r, reason: collision with root package name */
    public int f2236r;

    /* renamed from: s, reason: collision with root package name */
    public int f2237s;
    public O t;

    /* renamed from: u, reason: collision with root package name */
    public int f2238u;

    /* renamed from: v, reason: collision with root package name */
    public int f2239v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2240w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f2241x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f2242y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f2243z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f2240w = 8388627;
        this.f2212D = new ArrayList();
        this.f2213E = new ArrayList();
        this.f2214F = new int[2];
        this.G = new i(20, this);
        this.f2218K = new C.b(8, this);
        I0.b H2 = I0.b.H(getContext(), attributeSet, AbstractC0131a.t, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) H2.f722c;
        this.f2230l = typedArray.getResourceId(28, 0);
        this.f2231m = typedArray.getResourceId(19, 0);
        this.f2240w = typedArray.getInteger(0, 8388627);
        this.f2232n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f2237s = dimensionPixelOffset;
        this.f2236r = dimensionPixelOffset;
        this.f2235q = dimensionPixelOffset;
        this.f2234p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f2234p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f2235q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f2236r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f2237s = dimensionPixelOffset5;
        }
        this.f2233o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        O o2 = this.t;
        o2.f3200h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            o2.f3197e = dimensionPixelSize;
            o2.f3193a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            o2.f3198f = dimensionPixelSize2;
            o2.f3194b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            o2.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f2238u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f2239v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f2224f = H2.A(4);
        this.f2225g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f2228j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable A2 = H2.A(16);
        if (A2 != null) {
            setNavigationIcon(A2);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable A3 = H2.A(11);
        if (A3 != null) {
            setLogo(A3);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(H2.z(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(H2.z(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        H2.K();
    }

    public static k0 g() {
        k0 k0Var = new k0(-2, -2);
        k0Var.f3285b = 0;
        k0Var.f3284a = 8388627;
        return k0Var;
    }

    private MenuInflater getMenuInflater() {
        return new C0149d(getContext());
    }

    public static k0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof k0;
        if (z2) {
            k0 k0Var = (k0) layoutParams;
            k0 k0Var2 = new k0(k0Var);
            k0Var2.f3285b = 0;
            k0Var2.f3285b = k0Var.f3285b;
            return k0Var2;
        }
        if (z2) {
            k0 k0Var3 = new k0((k0) layoutParams);
            k0Var3.f3285b = 0;
            return k0Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            k0 k0Var4 = new k0(layoutParams);
            k0Var4.f3285b = 0;
            return k0Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        k0 k0Var5 = new k0(marginLayoutParams);
        k0Var5.f3285b = 0;
        ((ViewGroup.MarginLayoutParams) k0Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) k0Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) k0Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) k0Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return k0Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i2) {
        Field field = x.f8596a;
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                k0 k0Var = (k0) childAt.getLayoutParams();
                if (k0Var.f3285b == 0 && r(childAt) && i(k0Var.f3284a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            k0 k0Var2 = (k0) childAt2.getLayoutParams();
            if (k0Var2.f3285b == 0 && r(childAt2) && i(k0Var2.f3284a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        k0 g2 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (k0) layoutParams;
        g2.f3285b = 1;
        if (!z2 || this.f2227i == null) {
            addView(view, g2);
        } else {
            view.setLayoutParams(g2);
            this.f2213E.add(view);
        }
    }

    public final void c() {
        if (this.f2226h == null) {
            C0220p c0220p = new C0220p(getContext());
            this.f2226h = c0220p;
            c0220p.setImageDrawable(this.f2224f);
            this.f2226h.setContentDescription(this.f2225g);
            k0 g2 = g();
            g2.f3284a = (this.f2232n & 112) | 8388611;
            g2.f3285b = 2;
            this.f2226h.setLayoutParams(g2);
            this.f2226h.setOnClickListener(new i0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof k0);
    }

    public final void d() {
        if (this.t == null) {
            O o2 = new O();
            o2.f3193a = 0;
            o2.f3194b = 0;
            o2.f3195c = Integer.MIN_VALUE;
            o2.f3196d = Integer.MIN_VALUE;
            o2.f3197e = 0;
            o2.f3198f = 0;
            o2.f3199g = false;
            o2.f3200h = false;
            this.t = o2;
        }
    }

    public final void e() {
        if (this.f2219a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f2219a = actionMenuView;
            actionMenuView.setPopupTheme(this.f2229k);
            this.f2219a.setOnMenuItemClickListener(this.G);
            this.f2219a.getClass();
            k0 g2 = g();
            g2.f3284a = (this.f2232n & 112) | 8388613;
            this.f2219a.setLayoutParams(g2);
            b(this.f2219a, false);
        }
        ActionMenuView actionMenuView2 = this.f2219a;
        if (actionMenuView2.f2113p == null) {
            j jVar = (j) actionMenuView2.getMenu();
            if (this.f2216I == null) {
                this.f2216I = new j0(this);
            }
            this.f2219a.setExpandedActionViewsExclusive(true);
            jVar.b(this.f2216I, this.f2228j);
        }
    }

    public final void f() {
        if (this.f2222d == null) {
            this.f2222d = new C0220p(getContext());
            k0 g2 = g();
            g2.f3284a = (this.f2232n & 112) | 8388611;
            this.f2222d.setLayoutParams(g2);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0220p c0220p = this.f2226h;
        if (c0220p != null) {
            return c0220p.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0220p c0220p = this.f2226h;
        if (c0220p != null) {
            return c0220p.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        O o2 = this.t;
        if (o2 != null) {
            return o2.f3199g ? o2.f3193a : o2.f3194b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f2239v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        O o2 = this.t;
        if (o2 != null) {
            return o2.f3193a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        O o2 = this.t;
        if (o2 != null) {
            return o2.f3194b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        O o2 = this.t;
        if (o2 != null) {
            return o2.f3199g ? o2.f3194b : o2.f3193a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f2238u;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        j jVar;
        ActionMenuView actionMenuView = this.f2219a;
        return (actionMenuView == null || (jVar = actionMenuView.f2113p) == null || !jVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f2239v, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = x.f8596a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = x.f8596a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f2238u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0221q c0221q = this.f2223e;
        if (c0221q != null) {
            return c0221q.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0221q c0221q = this.f2223e;
        if (c0221q != null) {
            return c0221q.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f2219a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        C0220p c0220p = this.f2222d;
        if (c0220p != null) {
            return c0220p.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0220p c0220p = this.f2222d;
        if (c0220p != null) {
            return c0220p.getDrawable();
        }
        return null;
    }

    public C0213i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f2219a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f2228j;
    }

    public int getPopupTheme() {
        return this.f2229k;
    }

    public CharSequence getSubtitle() {
        return this.f2242y;
    }

    public final TextView getSubtitleTextView() {
        return this.f2221c;
    }

    public CharSequence getTitle() {
        return this.f2241x;
    }

    public int getTitleMarginBottom() {
        return this.f2237s;
    }

    public int getTitleMarginEnd() {
        return this.f2235q;
    }

    public int getTitleMarginStart() {
        return this.f2234p;
    }

    public int getTitleMarginTop() {
        return this.f2236r;
    }

    public final TextView getTitleTextView() {
        return this.f2220b;
    }

    public InterfaceC0226w getWrapper() {
        Drawable drawable;
        if (this.f2215H == null) {
            n0 n0Var = new n0();
            n0Var.f3308l = 0;
            n0Var.f3297a = this;
            n0Var.f3304h = getTitle();
            n0Var.f3305i = getSubtitle();
            n0Var.f3303g = n0Var.f3304h != null;
            n0Var.f3302f = getNavigationIcon();
            I0.b H2 = I0.b.H(getContext(), null, AbstractC0131a.f2618a, R.attr.actionBarStyle);
            n0Var.f3309m = H2.A(15);
            TypedArray typedArray = (TypedArray) H2.f722c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                n0Var.f3303g = true;
                n0Var.f3304h = text;
                if ((n0Var.f3298b & 8) != 0) {
                    n0Var.f3297a.setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                n0Var.f3305i = text2;
                if ((n0Var.f3298b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable A2 = H2.A(20);
            if (A2 != null) {
                n0Var.f3301e = A2;
                n0Var.c();
            }
            Drawable A3 = H2.A(17);
            if (A3 != null) {
                n0Var.f3300d = A3;
                n0Var.c();
            }
            if (n0Var.f3302f == null && (drawable = n0Var.f3309m) != null) {
                n0Var.f3302f = drawable;
                int i2 = n0Var.f3298b & 4;
                Toolbar toolbar = n0Var.f3297a;
                if (i2 != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            n0Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = n0Var.f3299c;
                if (view != null && (n0Var.f3298b & 16) != 0) {
                    removeView(view);
                }
                n0Var.f3299c = inflate;
                if (inflate != null && (n0Var.f3298b & 16) != 0) {
                    addView(inflate);
                }
                n0Var.a(n0Var.f3298b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.t.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f2230l = resourceId2;
                C0223t c0223t = this.f2220b;
                if (c0223t != null) {
                    c0223t.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f2231m = resourceId3;
                C0223t c0223t2 = this.f2221c;
                if (c0223t2 != null) {
                    c0223t2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            H2.K();
            if (R.string.abc_action_bar_up_description != n0Var.f3308l) {
                n0Var.f3308l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = n0Var.f3308l;
                    n0Var.f3306j = i3 != 0 ? getContext().getString(i3) : null;
                    n0Var.b();
                }
            }
            n0Var.f3306j = getNavigationContentDescription();
            setNavigationOnClickListener(new i0(n0Var));
            this.f2215H = n0Var;
        }
        return this.f2215H;
    }

    public final int i(int i2) {
        Field field = x.f8596a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    public final int j(View view, int i2) {
        k0 k0Var = (k0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = k0Var.f3284a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.f2240w & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) k0Var).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = ((ViewGroup.MarginLayoutParams) k0Var).topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = ((ViewGroup.MarginLayoutParams) k0Var).bottomMargin;
            if (i7 < i8) {
                i5 = Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.f2213E.contains(view);
    }

    public final int n(View view, int i2, int i3, int[] iArr) {
        k0 k0Var = (k0) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) k0Var).leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int j2 = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j2, max + measuredWidth, view.getMeasuredHeight() + j2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) k0Var).rightMargin + max;
    }

    public final int o(View view, int i2, int i3, int[] iArr) {
        k0 k0Var = (k0) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) k0Var).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int j2 = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j2, max, view.getMeasuredHeight() + j2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) k0Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2218K);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2211C = false;
        }
        if (!this.f2211C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2211C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2211C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029b A[LOOP:0: B:40:0x0299->B:41:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b8 A[LOOP:1: B:44:0x02b6->B:45:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d6 A[LOOP:2: B:48:0x02d4->B:49:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0325 A[LOOP:3: B:57:0x0323->B:58:0x0325, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        boolean r2;
        boolean r3;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        int i14;
        int paddingTop;
        int i15;
        int i16;
        int i17;
        int i18;
        int size;
        int i19;
        int i20;
        int size2;
        int i21;
        int size3;
        int i22;
        int i23;
        int size4;
        int i24;
        Field field = x.f8596a;
        boolean z4 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i25 = width - paddingRight;
        int[] iArr = this.f2214F;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i5 - i3) : 0;
        if (!r(this.f2222d)) {
            i6 = paddingLeft;
        } else {
            if (z4) {
                i7 = o(this.f2222d, i25, min, iArr);
                i6 = paddingLeft;
                if (r(this.f2226h)) {
                    if (z4) {
                        i7 = o(this.f2226h, i7, min, iArr);
                    } else {
                        i6 = n(this.f2226h, i6, min, iArr);
                    }
                }
                if (r(this.f2219a)) {
                    if (z4) {
                        i6 = n(this.f2219a, i6, min, iArr);
                    } else {
                        i7 = o(this.f2219a, i7, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i6);
                iArr[1] = Math.max(0, currentContentInsetRight - (i25 - i7));
                int max = Math.max(i6, currentContentInsetLeft);
                int min2 = Math.min(i7, i25 - currentContentInsetRight);
                if (r(this.f2227i)) {
                    if (z4) {
                        min2 = o(this.f2227i, min2, min, iArr);
                    } else {
                        max = n(this.f2227i, max, min, iArr);
                    }
                }
                if (r(this.f2223e)) {
                    if (z4) {
                        min2 = o(this.f2223e, min2, min, iArr);
                    } else {
                        max = n(this.f2223e, max, min, iArr);
                    }
                }
                r2 = r(this.f2220b);
                r3 = r(this.f2221c);
                if (r2) {
                    i8 = paddingRight;
                    i9 = 0;
                } else {
                    k0 k0Var = (k0) this.f2220b.getLayoutParams();
                    i8 = paddingRight;
                    i9 = ((ViewGroup.MarginLayoutParams) k0Var).bottomMargin + this.f2220b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) k0Var).topMargin;
                }
                if (r3) {
                    i10 = width;
                } else {
                    k0 k0Var2 = (k0) this.f2221c.getLayoutParams();
                    i10 = width;
                    i9 += this.f2221c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) k0Var2).topMargin + ((ViewGroup.MarginLayoutParams) k0Var2).bottomMargin;
                }
                if (!r2 || r3) {
                    C0223t c0223t = !r2 ? this.f2220b : this.f2221c;
                    C0223t c0223t2 = !r3 ? this.f2221c : this.f2220b;
                    k0 k0Var3 = (k0) c0223t.getLayoutParams();
                    k0 k0Var4 = (k0) c0223t2.getLayoutParams();
                    if ((r2 || this.f2220b.getMeasuredWidth() <= 0) && (!r3 || this.f2221c.getMeasuredWidth() <= 0)) {
                        i11 = paddingLeft;
                        z3 = false;
                    } else {
                        i11 = paddingLeft;
                        z3 = true;
                    }
                    i12 = this.f2240w & 112;
                    i13 = min;
                    if (i12 != 48) {
                        i14 = max;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) k0Var3).topMargin + this.f2236r;
                    } else if (i12 != 80) {
                        int i26 = (((height - paddingTop2) - paddingBottom) - i9) / 2;
                        i14 = max;
                        int i27 = ((ViewGroup.MarginLayoutParams) k0Var3).topMargin + this.f2236r;
                        if (i26 < i27) {
                            i26 = i27;
                        } else {
                            int i28 = (((height - paddingBottom) - i9) - i26) - paddingTop2;
                            int i29 = ((ViewGroup.MarginLayoutParams) k0Var3).bottomMargin;
                            int i30 = this.f2237s;
                            if (i28 < i29 + i30) {
                                i26 = Math.max(0, i26 - ((((ViewGroup.MarginLayoutParams) k0Var4).bottomMargin + i30) - i28));
                            }
                        }
                        paddingTop = paddingTop2 + i26;
                    } else {
                        i14 = max;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) k0Var4).bottomMargin) - this.f2237s) - i9;
                    }
                    if (z4) {
                        int i31 = (z3 ? this.f2234p : 0) - iArr[0];
                        int max2 = Math.max(0, i31) + i14;
                        iArr[0] = Math.max(0, -i31);
                        if (r2) {
                            k0 k0Var5 = (k0) this.f2220b.getLayoutParams();
                            int measuredWidth = this.f2220b.getMeasuredWidth() + max2;
                            int measuredHeight = this.f2220b.getMeasuredHeight() + paddingTop;
                            this.f2220b.layout(max2, paddingTop, measuredWidth, measuredHeight);
                            i15 = measuredWidth + this.f2235q;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) k0Var5).bottomMargin;
                        } else {
                            i15 = max2;
                        }
                        if (r3) {
                            int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((k0) this.f2221c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f2221c.getMeasuredWidth() + max2;
                            this.f2221c.layout(max2, i32, measuredWidth2, this.f2221c.getMeasuredHeight() + i32);
                            i16 = measuredWidth2 + this.f2235q;
                        } else {
                            i16 = max2;
                        }
                        max = z3 ? Math.max(i15, i16) : max2;
                    } else {
                        int i33 = (z3 ? this.f2234p : 0) - iArr[1];
                        min2 -= Math.max(0, i33);
                        iArr[1] = Math.max(0, -i33);
                        if (r2) {
                            k0 k0Var6 = (k0) this.f2220b.getLayoutParams();
                            int measuredWidth3 = min2 - this.f2220b.getMeasuredWidth();
                            int measuredHeight2 = this.f2220b.getMeasuredHeight() + paddingTop;
                            this.f2220b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i17 = measuredWidth3 - this.f2235q;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) k0Var6).bottomMargin;
                        } else {
                            i17 = min2;
                        }
                        if (r3) {
                            int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((k0) this.f2221c.getLayoutParams())).topMargin;
                            this.f2221c.layout(min2 - this.f2221c.getMeasuredWidth(), i34, min2, this.f2221c.getMeasuredHeight() + i34);
                            i18 = min2 - this.f2235q;
                        } else {
                            i18 = min2;
                        }
                        if (z3) {
                            min2 = Math.min(i17, i18);
                        }
                        max = i14;
                    }
                } else {
                    i11 = paddingLeft;
                    i13 = min;
                }
                ArrayList arrayList = this.f2212D;
                a(arrayList, 3);
                size = arrayList.size();
                i19 = max;
                for (i20 = 0; i20 < size; i20++) {
                    i19 = n((View) arrayList.get(i20), i19, i13, iArr);
                }
                int i35 = i13;
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i21 = 0; i21 < size2; i21++) {
                    min2 = o((View) arrayList.get(i21), min2, i35, iArr);
                }
                a(arrayList, 1);
                int i36 = iArr[0];
                int i37 = iArr[1];
                size3 = arrayList.size();
                int i38 = i37;
                int i39 = i36;
                i22 = 0;
                int i40 = 0;
                while (i22 < size3) {
                    View view = (View) arrayList.get(i22);
                    k0 k0Var7 = (k0) view.getLayoutParams();
                    int i41 = ((ViewGroup.MarginLayoutParams) k0Var7).leftMargin - i39;
                    int i42 = ((ViewGroup.MarginLayoutParams) k0Var7).rightMargin - i38;
                    int max3 = Math.max(0, i41);
                    int max4 = Math.max(0, i42);
                    int max5 = Math.max(0, -i41);
                    int max6 = Math.max(0, -i42);
                    i40 += view.getMeasuredWidth() + max3 + max4;
                    i22++;
                    i38 = max6;
                    i39 = max5;
                }
                i23 = ((((i10 - i11) - i8) / 2) + i11) - (i40 / 2);
                int i43 = i40 + i23;
                if (i23 >= i19) {
                    i19 = i43 > min2 ? i23 - (i43 - min2) : i23;
                }
                size4 = arrayList.size();
                for (i24 = 0; i24 < size4; i24++) {
                    i19 = n((View) arrayList.get(i24), i19, i35, iArr);
                }
                arrayList.clear();
            }
            i6 = n(this.f2222d, paddingLeft, min, iArr);
        }
        i7 = i25;
        if (r(this.f2226h)) {
        }
        if (r(this.f2219a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i6);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i25 - i7));
        int max7 = Math.max(i6, currentContentInsetLeft2);
        int min22 = Math.min(i7, i25 - currentContentInsetRight2);
        if (r(this.f2227i)) {
        }
        if (r(this.f2223e)) {
        }
        r2 = r(this.f2220b);
        r3 = r(this.f2221c);
        if (r2) {
        }
        if (r3) {
        }
        if (r2) {
        }
        if (!r2) {
        }
        if (!r3) {
        }
        k0 k0Var32 = (k0) c0223t.getLayoutParams();
        k0 k0Var42 = (k0) c0223t2.getLayoutParams();
        if (r2) {
        }
        i11 = paddingLeft;
        z3 = false;
        i12 = this.f2240w & 112;
        i13 = min;
        if (i12 != 48) {
        }
        if (z4) {
        }
        ArrayList arrayList2 = this.f2212D;
        a(arrayList2, 3);
        size = arrayList2.size();
        i19 = max7;
        while (i20 < size) {
        }
        int i352 = i13;
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i21 < size2) {
        }
        a(arrayList2, 1);
        int i362 = iArr[0];
        int i372 = iArr[1];
        size3 = arrayList2.size();
        int i382 = i372;
        int i392 = i362;
        i22 = 0;
        int i402 = 0;
        while (i22 < size3) {
        }
        i23 = ((((i10 - i11) - i8) / 2) + i11) - (i402 / 2);
        int i432 = i402 + i23;
        if (i23 >= i19) {
        }
        size4 = arrayList2.size();
        while (i24 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean a2 = t0.a(this);
        int i11 = !a2 ? 1 : 0;
        int i12 = 0;
        if (r(this.f2222d)) {
            q(this.f2222d, i2, 0, i3, this.f2233o);
            i4 = k(this.f2222d) + this.f2222d.getMeasuredWidth();
            i5 = Math.max(0, l(this.f2222d) + this.f2222d.getMeasuredHeight());
            i6 = View.combineMeasuredStates(0, this.f2222d.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (r(this.f2226h)) {
            q(this.f2226h, i2, 0, i3, this.f2233o);
            i4 = k(this.f2226h) + this.f2226h.getMeasuredWidth();
            i5 = Math.max(i5, l(this.f2226h) + this.f2226h.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f2226h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i4);
        int max2 = Math.max(0, currentContentInsetStart - i4);
        int[] iArr = this.f2214F;
        iArr[a2 ? 1 : 0] = max2;
        if (r(this.f2219a)) {
            q(this.f2219a, i2, max, i3, this.f2233o);
            i7 = k(this.f2219a) + this.f2219a.getMeasuredWidth();
            i5 = Math.max(i5, l(this.f2219a) + this.f2219a.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f2219a.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i7);
        iArr[i11] = Math.max(0, currentContentInsetEnd - i7);
        if (r(this.f2227i)) {
            max3 += p(this.f2227i, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, l(this.f2227i) + this.f2227i.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f2227i.getMeasuredState());
        }
        if (r(this.f2223e)) {
            max3 += p(this.f2223e, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, l(this.f2223e) + this.f2223e.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f2223e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((k0) childAt.getLayoutParams()).f3285b == 0 && r(childAt)) {
                max3 += p(childAt, i2, max3, i3, 0, iArr);
                i5 = Math.max(i5, l(childAt) + childAt.getMeasuredHeight());
                i6 = View.combineMeasuredStates(i6, childAt.getMeasuredState());
            }
        }
        int i14 = this.f2236r + this.f2237s;
        int i15 = this.f2234p + this.f2235q;
        if (r(this.f2220b)) {
            p(this.f2220b, i2, max3 + i15, i3, i14, iArr);
            int k2 = k(this.f2220b) + this.f2220b.getMeasuredWidth();
            i8 = l(this.f2220b) + this.f2220b.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i6, this.f2220b.getMeasuredState());
            i10 = k2;
        } else {
            i8 = 0;
            i9 = i6;
            i10 = 0;
        }
        if (r(this.f2221c)) {
            i10 = Math.max(i10, p(this.f2221c, i2, max3 + i15, i3, i8 + i14, iArr));
            i8 += l(this.f2221c) + this.f2221c.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i9, this.f2221c.getMeasuredState());
        }
        int max4 = Math.max(i5, i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i10, getSuggestedMinimumWidth()), i2, (-16777216) & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i9 << 16);
        if (this.f2217J) {
            int childCount2 = getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt2 = getChildAt(i16);
                if (!r(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i12);
        }
        i12 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i12);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof m0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m0 m0Var = (m0) parcelable;
        super.onRestoreInstanceState(m0Var.f307a);
        ActionMenuView actionMenuView = this.f2219a;
        j jVar = actionMenuView != null ? actionMenuView.f2113p : null;
        int i2 = m0Var.f3289c;
        if (i2 != 0 && this.f2216I != null && jVar != null && (findItem = jVar.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (m0Var.f3290d) {
            C.b bVar = this.f2218K;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        d();
        O o2 = this.t;
        boolean z2 = i2 == 1;
        if (z2 == o2.f3199g) {
            return;
        }
        o2.f3199g = z2;
        if (!o2.f3200h) {
            o2.f3193a = o2.f3197e;
            o2.f3194b = o2.f3198f;
            return;
        }
        if (z2) {
            int i3 = o2.f3196d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = o2.f3197e;
            }
            o2.f3193a = i3;
            int i4 = o2.f3195c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = o2.f3198f;
            }
            o2.f3194b = i4;
            return;
        }
        int i5 = o2.f3195c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = o2.f3197e;
        }
        o2.f3193a = i5;
        int i6 = o2.f3196d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = o2.f3198f;
        }
        o2.f3194b = i6;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0213i c0213i;
        C0210f c0210f;
        k kVar;
        m0 m0Var = new m0(super.onSaveInstanceState());
        j0 j0Var = this.f2216I;
        if (j0Var != null && (kVar = j0Var.f3276b) != null) {
            m0Var.f3289c = kVar.f3072a;
        }
        ActionMenuView actionMenuView = this.f2219a;
        m0Var.f3290d = (actionMenuView == null || (c0213i = actionMenuView.f2116s) == null || (c0210f = c0213i.f3269r) == null || !c0210f.b()) ? false : true;
        return m0Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2210B = false;
        }
        if (!this.f2210B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2210B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2210B = false;
        }
        return true;
    }

    public final int p(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(AbstractC0142a.a(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.f2217J = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f2239v) {
            this.f2239v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f2238u) {
            this.f2238u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(AbstractC0142a.a(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(AbstractC0142a.a(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f2222d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f2219a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f2229k != i2) {
            this.f2229k = i2;
            if (i2 == 0) {
                this.f2228j = getContext();
            } else {
                this.f2228j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.f2237s = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f2235q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f2234p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f2236r = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        k0 k0Var = new k0(context, attributeSet);
        k0Var.f3284a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0131a.f2619b);
        k0Var.f3284a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        k0Var.f3285b = 0;
        return k0Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0220p c0220p = this.f2226h;
        if (c0220p != null) {
            c0220p.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f2226h.setImageDrawable(drawable);
        } else {
            C0220p c0220p = this.f2226h;
            if (c0220p != null) {
                c0220p.setImageDrawable(this.f2224f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f2223e == null) {
                this.f2223e = new C0221q(getContext(), 0);
            }
            if (!m(this.f2223e)) {
                b(this.f2223e, true);
            }
        } else {
            C0221q c0221q = this.f2223e;
            if (c0221q != null && m(c0221q)) {
                removeView(this.f2223e);
                this.f2213E.remove(this.f2223e);
            }
        }
        C0221q c0221q2 = this.f2223e;
        if (c0221q2 != null) {
            c0221q2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f2223e == null) {
            this.f2223e = new C0221q(getContext(), 0);
        }
        C0221q c0221q = this.f2223e;
        if (c0221q != null) {
            c0221q.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C0220p c0220p = this.f2222d;
        if (c0220p != null) {
            c0220p.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f2222d)) {
                b(this.f2222d, true);
            }
        } else {
            C0220p c0220p = this.f2222d;
            if (c0220p != null && m(c0220p)) {
                removeView(this.f2222d);
                this.f2213E.remove(this.f2222d);
            }
        }
        C0220p c0220p2 = this.f2222d;
        if (c0220p2 != null) {
            c0220p2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0223t c0223t = this.f2221c;
            if (c0223t != null && m(c0223t)) {
                removeView(this.f2221c);
                this.f2213E.remove(this.f2221c);
            }
        } else {
            if (this.f2221c == null) {
                Context context = getContext();
                C0223t c0223t2 = new C0223t(context, null);
                this.f2221c = c0223t2;
                c0223t2.setSingleLine();
                this.f2221c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f2231m;
                if (i2 != 0) {
                    this.f2221c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f2209A;
                if (colorStateList != null) {
                    this.f2221c.setTextColor(colorStateList);
                }
            }
            if (!m(this.f2221c)) {
                b(this.f2221c, true);
            }
        }
        C0223t c0223t3 = this.f2221c;
        if (c0223t3 != null) {
            c0223t3.setText(charSequence);
        }
        this.f2242y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f2209A = colorStateList;
        C0223t c0223t = this.f2221c;
        if (c0223t != null) {
            c0223t.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0223t c0223t = this.f2220b;
            if (c0223t != null && m(c0223t)) {
                removeView(this.f2220b);
                this.f2213E.remove(this.f2220b);
            }
        } else {
            if (this.f2220b == null) {
                Context context = getContext();
                C0223t c0223t2 = new C0223t(context, null);
                this.f2220b = c0223t2;
                c0223t2.setSingleLine();
                this.f2220b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f2230l;
                if (i2 != 0) {
                    this.f2220b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f2243z;
                if (colorStateList != null) {
                    this.f2220b.setTextColor(colorStateList);
                }
            }
            if (!m(this.f2220b)) {
                b(this.f2220b, true);
            }
        }
        C0223t c0223t3 = this.f2220b;
        if (c0223t3 != null) {
            c0223t3.setText(charSequence);
        }
        this.f2241x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f2243z = colorStateList;
        C0223t c0223t = this.f2220b;
        if (c0223t != null) {
            c0223t.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(l0 l0Var) {
    }
}
