package androidx.appcompat.widget;

import A.j;
import L.C0026b;
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
import c.AbstractC0097a;
import com.icecatchbiger.hookfrostmaster.R;
import d.AbstractC0110a;
import f.C0139d;
import g.k;
import h.C0162f;
import h.C0165i;
import h.C0172p;
import h.C0173q;
import h.C0176u;
import h.InterfaceC0179x;
import h.P;
import h.l0;
import h.m0;
import h.n0;
import h.o0;
import h.p0;
import h.q0;
import h.w0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import w.x;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public final int f1258A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f1259B;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f1260C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f1261D;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f1262E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1263F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1264G;

    /* renamed from: H, reason: collision with root package name */
    public final ArrayList f1265H;

    /* renamed from: I, reason: collision with root package name */
    public final ArrayList f1266I;

    /* renamed from: J, reason: collision with root package name */
    public final int[] f1267J;

    /* renamed from: K, reason: collision with root package name */
    public final j f1268K;

    /* renamed from: L, reason: collision with root package name */
    public q0 f1269L;

    /* renamed from: M, reason: collision with root package name */
    public m0 f1270M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f1271N;

    /* renamed from: O, reason: collision with root package name */
    public final A.b f1272O;

    /* renamed from: e, reason: collision with root package name */
    public ActionMenuView f1273e;

    /* renamed from: f, reason: collision with root package name */
    public C0176u f1274f;

    /* renamed from: g, reason: collision with root package name */
    public C0176u f1275g;

    /* renamed from: h, reason: collision with root package name */
    public C0172p f1276h;

    /* renamed from: i, reason: collision with root package name */
    public C0173q f1277i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f1278j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1279k;

    /* renamed from: l, reason: collision with root package name */
    public C0172p f1280l;

    /* renamed from: m, reason: collision with root package name */
    public View f1281m;

    /* renamed from: n, reason: collision with root package name */
    public Context f1282n;

    /* renamed from: o, reason: collision with root package name */
    public int f1283o;

    /* renamed from: p, reason: collision with root package name */
    public int f1284p;

    /* renamed from: q, reason: collision with root package name */
    public int f1285q;
    public final int r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1286s;

    /* renamed from: t, reason: collision with root package name */
    public int f1287t;

    /* renamed from: u, reason: collision with root package name */
    public int f1288u;

    /* renamed from: v, reason: collision with root package name */
    public int f1289v;

    /* renamed from: w, reason: collision with root package name */
    public int f1290w;

    /* renamed from: x, reason: collision with root package name */
    public P f1291x;

    /* renamed from: y, reason: collision with root package name */
    public int f1292y;

    /* renamed from: z, reason: collision with root package name */
    public int f1293z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1258A = 8388627;
        this.f1265H = new ArrayList();
        this.f1266I = new ArrayList();
        this.f1267J = new int[2];
        this.f1268K = new j(23, this);
        this.f1272O = new A.b(5, this);
        C0026b E2 = C0026b.E(getContext(), attributeSet, AbstractC0097a.f1655t, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) E2.f524f;
        this.f1284p = typedArray.getResourceId(28, 0);
        this.f1285q = typedArray.getResourceId(19, 0);
        this.f1258A = typedArray.getInteger(0, 8388627);
        this.r = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1290w = dimensionPixelOffset;
        this.f1289v = dimensionPixelOffset;
        this.f1288u = dimensionPixelOffset;
        this.f1287t = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1287t = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1288u = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1289v = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1290w = dimensionPixelOffset5;
        }
        this.f1286s = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        P p2 = this.f1291x;
        p2.f2141h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            p2.f2138e = dimensionPixelSize;
            p2.f2134a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            p2.f2139f = dimensionPixelSize2;
            p2.f2135b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            p2.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1292y = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1293z = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1278j = E2.x(4);
        this.f1279k = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1282n = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable x2 = E2.x(16);
        if (x2 != null) {
            setNavigationIcon(x2);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable x3 = E2.x(11);
        if (x3 != null) {
            setLogo(x3);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(E2.w(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(E2.w(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        E2.H();
    }

    public static n0 g() {
        n0 n0Var = new n0(-2, -2);
        n0Var.f2242b = 0;
        n0Var.f2241a = 8388627;
        return n0Var;
    }

    private MenuInflater getMenuInflater() {
        return new C0139d(getContext());
    }

    public static n0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof n0;
        if (z2) {
            n0 n0Var = (n0) layoutParams;
            n0 n0Var2 = new n0(n0Var);
            n0Var2.f2242b = 0;
            n0Var2.f2242b = n0Var.f2242b;
            return n0Var2;
        }
        if (z2) {
            n0 n0Var3 = new n0((n0) layoutParams);
            n0Var3.f2242b = 0;
            return n0Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            n0 n0Var4 = new n0(layoutParams);
            n0Var4.f2242b = 0;
            return n0Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        n0 n0Var5 = new n0(marginLayoutParams);
        n0Var5.f2242b = 0;
        ((ViewGroup.MarginLayoutParams) n0Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) n0Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) n0Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) n0Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return n0Var5;
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
        Field field = x.f3074a;
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                n0 n0Var = (n0) childAt.getLayoutParams();
                if (n0Var.f2242b == 0 && r(childAt) && i(n0Var.f2241a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            n0 n0Var2 = (n0) childAt2.getLayoutParams();
            if (n0Var2.f2242b == 0 && r(childAt2) && i(n0Var2.f2241a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        n0 g2 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (n0) layoutParams;
        g2.f2242b = 1;
        if (!z2 || this.f1281m == null) {
            addView(view, g2);
        } else {
            view.setLayoutParams(g2);
            this.f1266I.add(view);
        }
    }

    public final void c() {
        if (this.f1280l == null) {
            C0172p c0172p = new C0172p(getContext());
            this.f1280l = c0172p;
            c0172p.setImageDrawable(this.f1278j);
            this.f1280l.setContentDescription(this.f1279k);
            n0 g2 = g();
            g2.f2241a = (this.r & 112) | 8388611;
            g2.f2242b = 2;
            this.f1280l.setLayoutParams(g2);
            this.f1280l.setOnClickListener(new l0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof n0);
    }

    public final void d() {
        if (this.f1291x == null) {
            P p2 = new P();
            p2.f2134a = 0;
            p2.f2135b = 0;
            p2.f2136c = Integer.MIN_VALUE;
            p2.f2137d = Integer.MIN_VALUE;
            p2.f2138e = 0;
            p2.f2139f = 0;
            p2.f2140g = false;
            p2.f2141h = false;
            this.f1291x = p2;
        }
    }

    public final void e() {
        if (this.f1273e == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1273e = actionMenuView;
            actionMenuView.setPopupTheme(this.f1283o);
            this.f1273e.setOnMenuItemClickListener(this.f1268K);
            this.f1273e.getClass();
            n0 g2 = g();
            g2.f2241a = (this.r & 112) | 8388613;
            this.f1273e.setLayoutParams(g2);
            b(this.f1273e, false);
        }
        ActionMenuView actionMenuView2 = this.f1273e;
        if (actionMenuView2.f1160t == null) {
            g.j jVar = (g.j) actionMenuView2.getMenu();
            if (this.f1270M == null) {
                this.f1270M = new m0(this);
            }
            this.f1273e.setExpandedActionViewsExclusive(true);
            jVar.b(this.f1270M, this.f1282n);
        }
    }

    public final void f() {
        if (this.f1276h == null) {
            this.f1276h = new C0172p(getContext());
            n0 g2 = g();
            g2.f2241a = (this.r & 112) | 8388611;
            this.f1276h.setLayoutParams(g2);
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
        C0172p c0172p = this.f1280l;
        if (c0172p != null) {
            return c0172p.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0172p c0172p = this.f1280l;
        if (c0172p != null) {
            return c0172p.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        P p2 = this.f1291x;
        if (p2 != null) {
            return p2.f2140g ? p2.f2134a : p2.f2135b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f1293z;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        P p2 = this.f1291x;
        if (p2 != null) {
            return p2.f2134a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        P p2 = this.f1291x;
        if (p2 != null) {
            return p2.f2135b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        P p2 = this.f1291x;
        if (p2 != null) {
            return p2.f2140g ? p2.f2135b : p2.f2134a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f1292y;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        g.j jVar;
        ActionMenuView actionMenuView = this.f1273e;
        return (actionMenuView == null || (jVar = actionMenuView.f1160t) == null || !jVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1293z, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = x.f3074a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = x.f3074a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1292y, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0173q c0173q = this.f1277i;
        if (c0173q != null) {
            return c0173q.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0173q c0173q = this.f1277i;
        if (c0173q != null) {
            return c0173q.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1273e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        C0172p c0172p = this.f1276h;
        if (c0172p != null) {
            return c0172p.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0172p c0172p = this.f1276h;
        if (c0172p != null) {
            return c0172p.getDrawable();
        }
        return null;
    }

    public C0165i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1273e.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1282n;
    }

    public int getPopupTheme() {
        return this.f1283o;
    }

    public CharSequence getSubtitle() {
        return this.f1260C;
    }

    public final TextView getSubtitleTextView() {
        return this.f1275g;
    }

    public CharSequence getTitle() {
        return this.f1259B;
    }

    public int getTitleMarginBottom() {
        return this.f1290w;
    }

    public int getTitleMarginEnd() {
        return this.f1288u;
    }

    public int getTitleMarginStart() {
        return this.f1287t;
    }

    public int getTitleMarginTop() {
        return this.f1289v;
    }

    public final TextView getTitleTextView() {
        return this.f1274f;
    }

    public InterfaceC0179x getWrapper() {
        Drawable drawable;
        if (this.f1269L == null) {
            q0 q0Var = new q0();
            q0Var.f2263l = 0;
            q0Var.f2252a = this;
            q0Var.f2259h = getTitle();
            q0Var.f2260i = getSubtitle();
            q0Var.f2258g = q0Var.f2259h != null;
            q0Var.f2257f = getNavigationIcon();
            C0026b E2 = C0026b.E(getContext(), null, AbstractC0097a.f1637a, R.attr.actionBarStyle);
            q0Var.f2264m = E2.x(15);
            TypedArray typedArray = (TypedArray) E2.f524f;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                q0Var.f2258g = true;
                q0Var.f2259h = text;
                if ((q0Var.f2253b & 8) != 0) {
                    q0Var.f2252a.setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                q0Var.f2260i = text2;
                if ((q0Var.f2253b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable x2 = E2.x(20);
            if (x2 != null) {
                q0Var.f2256e = x2;
                q0Var.c();
            }
            Drawable x3 = E2.x(17);
            if (x3 != null) {
                q0Var.f2255d = x3;
                q0Var.c();
            }
            if (q0Var.f2257f == null && (drawable = q0Var.f2264m) != null) {
                q0Var.f2257f = drawable;
                int i2 = q0Var.f2253b & 4;
                Toolbar toolbar = q0Var.f2252a;
                if (i2 != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            q0Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = q0Var.f2254c;
                if (view != null && (q0Var.f2253b & 16) != 0) {
                    removeView(view);
                }
                q0Var.f2254c = inflate;
                if (inflate != null && (q0Var.f2253b & 16) != 0) {
                    addView(inflate);
                }
                q0Var.a(q0Var.f2253b | 16);
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
                this.f1291x.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1284p = resourceId2;
                C0176u c0176u = this.f1274f;
                if (c0176u != null) {
                    c0176u.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1285q = resourceId3;
                C0176u c0176u2 = this.f1275g;
                if (c0176u2 != null) {
                    c0176u2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            E2.H();
            if (R.string.abc_action_bar_up_description != q0Var.f2263l) {
                q0Var.f2263l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = q0Var.f2263l;
                    q0Var.f2261j = i3 != 0 ? getContext().getString(i3) : null;
                    q0Var.b();
                }
            }
            q0Var.f2261j = getNavigationContentDescription();
            setNavigationOnClickListener(new l0(q0Var));
            this.f1269L = q0Var;
        }
        return this.f1269L;
    }

    public final int i(int i2) {
        Field field = x.f3074a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    public final int j(View view, int i2) {
        n0 n0Var = (n0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = n0Var.f2241a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.f1258A & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = ((ViewGroup.MarginLayoutParams) n0Var).topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin;
            if (i7 < i8) {
                i5 = Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.f1266I.contains(view);
    }

    public final int n(View view, int i2, int i3, int[] iArr) {
        n0 n0Var = (n0) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) n0Var).leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int j2 = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j2, max + measuredWidth, view.getMeasuredHeight() + j2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) n0Var).rightMargin + max;
    }

    public final int o(View view, int i2, int i3, int[] iArr) {
        n0 n0Var = (n0) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) n0Var).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int j2 = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j2, max, view.getMeasuredHeight() + j2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) n0Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1272O);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1264G = false;
        }
        if (!this.f1264G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1264G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1264G = false;
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
        boolean r;
        boolean r2;
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
        Field field = x.f3074a;
        boolean z4 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i25 = width - paddingRight;
        int[] iArr = this.f1267J;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i5 - i3) : 0;
        if (!r(this.f1276h)) {
            i6 = paddingLeft;
        } else {
            if (z4) {
                i7 = o(this.f1276h, i25, min, iArr);
                i6 = paddingLeft;
                if (r(this.f1280l)) {
                    if (z4) {
                        i7 = o(this.f1280l, i7, min, iArr);
                    } else {
                        i6 = n(this.f1280l, i6, min, iArr);
                    }
                }
                if (r(this.f1273e)) {
                    if (z4) {
                        i6 = n(this.f1273e, i6, min, iArr);
                    } else {
                        i7 = o(this.f1273e, i7, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i6);
                iArr[1] = Math.max(0, currentContentInsetRight - (i25 - i7));
                int max = Math.max(i6, currentContentInsetLeft);
                int min2 = Math.min(i7, i25 - currentContentInsetRight);
                if (r(this.f1281m)) {
                    if (z4) {
                        min2 = o(this.f1281m, min2, min, iArr);
                    } else {
                        max = n(this.f1281m, max, min, iArr);
                    }
                }
                if (r(this.f1277i)) {
                    if (z4) {
                        min2 = o(this.f1277i, min2, min, iArr);
                    } else {
                        max = n(this.f1277i, max, min, iArr);
                    }
                }
                r = r(this.f1274f);
                r2 = r(this.f1275g);
                if (r) {
                    i8 = paddingRight;
                    i9 = 0;
                } else {
                    n0 n0Var = (n0) this.f1274f.getLayoutParams();
                    i8 = paddingRight;
                    i9 = ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin + this.f1274f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) n0Var).topMargin;
                }
                if (r2) {
                    i10 = width;
                } else {
                    n0 n0Var2 = (n0) this.f1275g.getLayoutParams();
                    i10 = width;
                    i9 += this.f1275g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) n0Var2).topMargin + ((ViewGroup.MarginLayoutParams) n0Var2).bottomMargin;
                }
                if (!r || r2) {
                    C0176u c0176u = !r ? this.f1274f : this.f1275g;
                    C0176u c0176u2 = !r2 ? this.f1275g : this.f1274f;
                    n0 n0Var3 = (n0) c0176u.getLayoutParams();
                    n0 n0Var4 = (n0) c0176u2.getLayoutParams();
                    if ((r || this.f1274f.getMeasuredWidth() <= 0) && (!r2 || this.f1275g.getMeasuredWidth() <= 0)) {
                        i11 = paddingLeft;
                        z3 = false;
                    } else {
                        i11 = paddingLeft;
                        z3 = true;
                    }
                    i12 = this.f1258A & 112;
                    i13 = min;
                    if (i12 != 48) {
                        i14 = max;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) n0Var3).topMargin + this.f1289v;
                    } else if (i12 != 80) {
                        int i26 = (((height - paddingTop2) - paddingBottom) - i9) / 2;
                        i14 = max;
                        int i27 = ((ViewGroup.MarginLayoutParams) n0Var3).topMargin + this.f1289v;
                        if (i26 < i27) {
                            i26 = i27;
                        } else {
                            int i28 = (((height - paddingBottom) - i9) - i26) - paddingTop2;
                            int i29 = ((ViewGroup.MarginLayoutParams) n0Var3).bottomMargin;
                            int i30 = this.f1290w;
                            if (i28 < i29 + i30) {
                                i26 = Math.max(0, i26 - ((((ViewGroup.MarginLayoutParams) n0Var4).bottomMargin + i30) - i28));
                            }
                        }
                        paddingTop = paddingTop2 + i26;
                    } else {
                        i14 = max;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) n0Var4).bottomMargin) - this.f1290w) - i9;
                    }
                    if (z4) {
                        int i31 = (z3 ? this.f1287t : 0) - iArr[0];
                        int max2 = Math.max(0, i31) + i14;
                        iArr[0] = Math.max(0, -i31);
                        if (r) {
                            n0 n0Var5 = (n0) this.f1274f.getLayoutParams();
                            int measuredWidth = this.f1274f.getMeasuredWidth() + max2;
                            int measuredHeight = this.f1274f.getMeasuredHeight() + paddingTop;
                            this.f1274f.layout(max2, paddingTop, measuredWidth, measuredHeight);
                            i15 = measuredWidth + this.f1288u;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) n0Var5).bottomMargin;
                        } else {
                            i15 = max2;
                        }
                        if (r2) {
                            int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((n0) this.f1275g.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f1275g.getMeasuredWidth() + max2;
                            this.f1275g.layout(max2, i32, measuredWidth2, this.f1275g.getMeasuredHeight() + i32);
                            i16 = measuredWidth2 + this.f1288u;
                        } else {
                            i16 = max2;
                        }
                        max = z3 ? Math.max(i15, i16) : max2;
                    } else {
                        int i33 = (z3 ? this.f1287t : 0) - iArr[1];
                        min2 -= Math.max(0, i33);
                        iArr[1] = Math.max(0, -i33);
                        if (r) {
                            n0 n0Var6 = (n0) this.f1274f.getLayoutParams();
                            int measuredWidth3 = min2 - this.f1274f.getMeasuredWidth();
                            int measuredHeight2 = this.f1274f.getMeasuredHeight() + paddingTop;
                            this.f1274f.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i17 = measuredWidth3 - this.f1288u;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) n0Var6).bottomMargin;
                        } else {
                            i17 = min2;
                        }
                        if (r2) {
                            int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((n0) this.f1275g.getLayoutParams())).topMargin;
                            this.f1275g.layout(min2 - this.f1275g.getMeasuredWidth(), i34, min2, this.f1275g.getMeasuredHeight() + i34);
                            i18 = min2 - this.f1288u;
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
                ArrayList arrayList = this.f1265H;
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
                    n0 n0Var7 = (n0) view.getLayoutParams();
                    int i41 = ((ViewGroup.MarginLayoutParams) n0Var7).leftMargin - i39;
                    int i42 = ((ViewGroup.MarginLayoutParams) n0Var7).rightMargin - i38;
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
            i6 = n(this.f1276h, paddingLeft, min, iArr);
        }
        i7 = i25;
        if (r(this.f1280l)) {
        }
        if (r(this.f1273e)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i6);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i25 - i7));
        int max7 = Math.max(i6, currentContentInsetLeft2);
        int min22 = Math.min(i7, i25 - currentContentInsetRight2);
        if (r(this.f1281m)) {
        }
        if (r(this.f1277i)) {
        }
        r = r(this.f1274f);
        r2 = r(this.f1275g);
        if (r) {
        }
        if (r2) {
        }
        if (r) {
        }
        if (!r) {
        }
        if (!r2) {
        }
        n0 n0Var32 = (n0) c0176u.getLayoutParams();
        n0 n0Var42 = (n0) c0176u2.getLayoutParams();
        if (r) {
        }
        i11 = paddingLeft;
        z3 = false;
        i12 = this.f1258A & 112;
        i13 = min;
        if (i12 != 48) {
        }
        if (z4) {
        }
        ArrayList arrayList2 = this.f1265H;
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
        boolean a2 = w0.a(this);
        int i11 = !a2 ? 1 : 0;
        int i12 = 0;
        if (r(this.f1276h)) {
            q(this.f1276h, i2, 0, i3, this.f1286s);
            i4 = k(this.f1276h) + this.f1276h.getMeasuredWidth();
            i5 = Math.max(0, l(this.f1276h) + this.f1276h.getMeasuredHeight());
            i6 = View.combineMeasuredStates(0, this.f1276h.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (r(this.f1280l)) {
            q(this.f1280l, i2, 0, i3, this.f1286s);
            i4 = k(this.f1280l) + this.f1280l.getMeasuredWidth();
            i5 = Math.max(i5, l(this.f1280l) + this.f1280l.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f1280l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i4);
        int max2 = Math.max(0, currentContentInsetStart - i4);
        int[] iArr = this.f1267J;
        iArr[a2 ? 1 : 0] = max2;
        if (r(this.f1273e)) {
            q(this.f1273e, i2, max, i3, this.f1286s);
            i7 = k(this.f1273e) + this.f1273e.getMeasuredWidth();
            i5 = Math.max(i5, l(this.f1273e) + this.f1273e.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f1273e.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i7);
        iArr[i11] = Math.max(0, currentContentInsetEnd - i7);
        if (r(this.f1281m)) {
            max3 += p(this.f1281m, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, l(this.f1281m) + this.f1281m.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f1281m.getMeasuredState());
        }
        if (r(this.f1277i)) {
            max3 += p(this.f1277i, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, l(this.f1277i) + this.f1277i.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f1277i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((n0) childAt.getLayoutParams()).f2242b == 0 && r(childAt)) {
                max3 += p(childAt, i2, max3, i3, 0, iArr);
                i5 = Math.max(i5, l(childAt) + childAt.getMeasuredHeight());
                i6 = View.combineMeasuredStates(i6, childAt.getMeasuredState());
            }
        }
        int i14 = this.f1289v + this.f1290w;
        int i15 = this.f1287t + this.f1288u;
        if (r(this.f1274f)) {
            p(this.f1274f, i2, max3 + i15, i3, i14, iArr);
            int k2 = k(this.f1274f) + this.f1274f.getMeasuredWidth();
            i8 = l(this.f1274f) + this.f1274f.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i6, this.f1274f.getMeasuredState());
            i10 = k2;
        } else {
            i8 = 0;
            i9 = i6;
            i10 = 0;
        }
        if (r(this.f1275g)) {
            i10 = Math.max(i10, p(this.f1275g, i2, max3 + i15, i3, i8 + i14, iArr));
            i8 += l(this.f1275g) + this.f1275g.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i9, this.f1275g.getMeasuredState());
        }
        int max4 = Math.max(i5, i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i10, getSuggestedMinimumWidth()), i2, (-16777216) & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i9 << 16);
        if (this.f1271N) {
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
        if (!(parcelable instanceof p0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p0 p0Var = (p0) parcelable;
        super.onRestoreInstanceState(p0Var.f55a);
        ActionMenuView actionMenuView = this.f1273e;
        g.j jVar = actionMenuView != null ? actionMenuView.f1160t : null;
        int i2 = p0Var.f2248c;
        if (i2 != 0 && this.f1270M != null && jVar != null && (findItem = jVar.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (p0Var.f2249d) {
            A.b bVar = this.f1272O;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        d();
        P p2 = this.f1291x;
        boolean z2 = i2 == 1;
        if (z2 == p2.f2140g) {
            return;
        }
        p2.f2140g = z2;
        if (!p2.f2141h) {
            p2.f2134a = p2.f2138e;
            p2.f2135b = p2.f2139f;
            return;
        }
        if (z2) {
            int i3 = p2.f2137d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = p2.f2138e;
            }
            p2.f2134a = i3;
            int i4 = p2.f2136c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = p2.f2139f;
            }
            p2.f2135b = i4;
            return;
        }
        int i5 = p2.f2136c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = p2.f2138e;
        }
        p2.f2134a = i5;
        int i6 = p2.f2137d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = p2.f2139f;
        }
        p2.f2135b = i6;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0165i c0165i;
        C0162f c0162f;
        k kVar;
        p0 p0Var = new p0(super.onSaveInstanceState());
        m0 m0Var = this.f1270M;
        if (m0Var != null && (kVar = m0Var.f2233f) != null) {
            p0Var.f2248c = kVar.f1993a;
        }
        ActionMenuView actionMenuView = this.f1273e;
        p0Var.f2249d = (actionMenuView == null || (c0165i = actionMenuView.f1163w) == null || (c0162f = c0165i.f2211v) == null || !c0162f.b()) ? false : true;
        return p0Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1263F = false;
        }
        if (!this.f1263F) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1263F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1263F = false;
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
        setCollapseIcon(AbstractC0110a.a(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.f1271N = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1293z) {
            this.f1293z = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1292y) {
            this.f1292y = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(AbstractC0110a.a(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(AbstractC0110a.a(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f1276h.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1273e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f1283o != i2) {
            this.f1283o = i2;
            if (i2 == 0) {
                this.f1282n = getContext();
            } else {
                this.f1282n = new ContextThemeWrapper(getContext(), i2);
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
        this.f1290w = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f1288u = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f1287t = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f1289v = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        n0 n0Var = new n0(context, attributeSet);
        n0Var.f2241a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0097a.f1638b);
        n0Var.f2241a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        n0Var.f2242b = 0;
        return n0Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0172p c0172p = this.f1280l;
        if (c0172p != null) {
            c0172p.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1280l.setImageDrawable(drawable);
        } else {
            C0172p c0172p = this.f1280l;
            if (c0172p != null) {
                c0172p.setImageDrawable(this.f1278j);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1277i == null) {
                this.f1277i = new C0173q(getContext(), 0);
            }
            if (!m(this.f1277i)) {
                b(this.f1277i, true);
            }
        } else {
            C0173q c0173q = this.f1277i;
            if (c0173q != null && m(c0173q)) {
                removeView(this.f1277i);
                this.f1266I.remove(this.f1277i);
            }
        }
        C0173q c0173q2 = this.f1277i;
        if (c0173q2 != null) {
            c0173q2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1277i == null) {
            this.f1277i = new C0173q(getContext(), 0);
        }
        C0173q c0173q = this.f1277i;
        if (c0173q != null) {
            c0173q.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C0172p c0172p = this.f1276h;
        if (c0172p != null) {
            c0172p.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f1276h)) {
                b(this.f1276h, true);
            }
        } else {
            C0172p c0172p = this.f1276h;
            if (c0172p != null && m(c0172p)) {
                removeView(this.f1276h);
                this.f1266I.remove(this.f1276h);
            }
        }
        C0172p c0172p2 = this.f1276h;
        if (c0172p2 != null) {
            c0172p2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0176u c0176u = this.f1275g;
            if (c0176u != null && m(c0176u)) {
                removeView(this.f1275g);
                this.f1266I.remove(this.f1275g);
            }
        } else {
            if (this.f1275g == null) {
                Context context = getContext();
                C0176u c0176u2 = new C0176u(context, null);
                this.f1275g = c0176u2;
                c0176u2.setSingleLine();
                this.f1275g.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1285q;
                if (i2 != 0) {
                    this.f1275g.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1262E;
                if (colorStateList != null) {
                    this.f1275g.setTextColor(colorStateList);
                }
            }
            if (!m(this.f1275g)) {
                b(this.f1275g, true);
            }
        }
        C0176u c0176u3 = this.f1275g;
        if (c0176u3 != null) {
            c0176u3.setText(charSequence);
        }
        this.f1260C = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1262E = colorStateList;
        C0176u c0176u = this.f1275g;
        if (c0176u != null) {
            c0176u.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0176u c0176u = this.f1274f;
            if (c0176u != null && m(c0176u)) {
                removeView(this.f1274f);
                this.f1266I.remove(this.f1274f);
            }
        } else {
            if (this.f1274f == null) {
                Context context = getContext();
                C0176u c0176u2 = new C0176u(context, null);
                this.f1274f = c0176u2;
                c0176u2.setSingleLine();
                this.f1274f.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1284p;
                if (i2 != 0) {
                    this.f1274f.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1261D;
                if (colorStateList != null) {
                    this.f1274f.setTextColor(colorStateList);
                }
            }
            if (!m(this.f1274f)) {
                b(this.f1274f, true);
            }
        }
        C0176u c0176u3 = this.f1274f;
        if (c0176u3 != null) {
            c0176u3.setText(charSequence);
        }
        this.f1259B = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1261D = colorStateList;
        C0176u c0176u = this.f1274f;
        if (c0176u != null) {
            c0176u.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(o0 o0Var) {
    }
}
