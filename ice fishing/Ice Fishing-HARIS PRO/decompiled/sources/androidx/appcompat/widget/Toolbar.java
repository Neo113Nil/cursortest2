package androidx.appcompat.widget;

import B0.j;
import B0.l;
import M0.h;
import O.K;
import Z.E;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.lumenpath.harispro.hrnavigator.R;
import g.AbstractC0155a;
import h0.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C0184h;
import l.MenuC0229m;
import l.o;
import m.C0245b0;
import m.C0264l;
import m.C0289y;
import m.C0291z;
import m.InterfaceC0263k0;
import m.N0;
import m.U0;
import m.V0;
import m.W0;
import m.X0;
import m.Y0;
import m.Z0;
import m.a1;
import m.b1;
import m.c1;
import m.d1;
import m.h1;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1846A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1847B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1848C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f1849D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f1850E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f1851F;

    /* renamed from: G, reason: collision with root package name */
    public final h f1852G;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList f1853H;

    /* renamed from: I, reason: collision with root package name */
    public final V0 f1854I;
    public c1 J;

    /* renamed from: K, reason: collision with root package name */
    public C0264l f1855K;

    /* renamed from: L, reason: collision with root package name */
    public X0 f1856L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1857M;

    /* renamed from: N, reason: collision with root package name */
    public OnBackInvokedCallback f1858N;

    /* renamed from: O, reason: collision with root package name */
    public OnBackInvokedDispatcher f1859O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1860P;

    /* renamed from: Q, reason: collision with root package name */
    public final j f1861Q;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f1862a;

    /* renamed from: b, reason: collision with root package name */
    public C0245b0 f1863b;

    /* renamed from: c, reason: collision with root package name */
    public C0245b0 f1864c;

    /* renamed from: d, reason: collision with root package name */
    public C0289y f1865d;
    public C0291z e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f1866f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f1867g;

    /* renamed from: h, reason: collision with root package name */
    public C0289y f1868h;
    public View i;
    public Context j;

    /* renamed from: k, reason: collision with root package name */
    public int f1869k;

    /* renamed from: l, reason: collision with root package name */
    public int f1870l;

    /* renamed from: m, reason: collision with root package name */
    public int f1871m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1872n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1873o;

    /* renamed from: p, reason: collision with root package name */
    public int f1874p;

    /* renamed from: q, reason: collision with root package name */
    public int f1875q;

    /* renamed from: r, reason: collision with root package name */
    public int f1876r;

    /* renamed from: s, reason: collision with root package name */
    public int f1877s;

    /* renamed from: t, reason: collision with root package name */
    public N0 f1878t;

    /* renamed from: u, reason: collision with root package name */
    public int f1879u;

    /* renamed from: v, reason: collision with root package name */
    public int f1880v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1881w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1882x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f1883y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1884z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0184h(getContext());
    }

    public static Y0 h() {
        Y0 y02 = new Y0(-2, -2);
        y02.f3905b = 0;
        y02.f3904a = 8388627;
        return y02;
    }

    public static Y0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof Y0;
        if (z2) {
            Y0 y02 = (Y0) layoutParams;
            Y0 y03 = new Y0(y02);
            y03.f3905b = 0;
            y03.f3905b = y02.f3905b;
            return y03;
        }
        if (z2) {
            Y0 y04 = new Y0((Y0) layoutParams);
            y04.f3905b = 0;
            return y04;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Y0 y05 = new Y0(layoutParams);
            y05.f3905b = 0;
            return y05;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Y0 y06 = new Y0(marginLayoutParams);
        y06.f3905b = 0;
        ((ViewGroup.MarginLayoutParams) y06).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) y06).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) y06).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) y06).bottomMargin = marginLayoutParams.bottomMargin;
        return y06;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i) {
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                Y0 y02 = (Y0) childAt.getLayoutParams();
                if (y02.f3905b == 0 && t(childAt)) {
                    int i3 = y02.f3904a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            Y0 y03 = (Y0) childAt2.getLayoutParams();
            if (y03.f3905b == 0 && t(childAt2)) {
                int i5 = y03.f3904a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Y0 h2 = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (Y0) layoutParams;
        h2.f3905b = 1;
        if (!z2 || this.i == null) {
            addView(view, h2);
        } else {
            view.setLayoutParams(h2);
            this.f1850E.add(view);
        }
    }

    public final void c() {
        if (this.f1868h == null) {
            C0289y c0289y = new C0289y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1868h = c0289y;
            c0289y.setImageDrawable(this.f1866f);
            this.f1868h.setContentDescription(this.f1867g);
            Y0 h2 = h();
            h2.f3904a = (this.f1872n & 112) | 8388611;
            h2.f3905b = 2;
            this.f1868h.setLayoutParams(h2);
            this.f1868h.setOnClickListener(new l(5, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof Y0);
    }

    public final void d() {
        if (this.f1878t == null) {
            N0 n02 = new N0();
            n02.f3860a = 0;
            n02.f3861b = 0;
            n02.f3862c = Integer.MIN_VALUE;
            n02.f3863d = Integer.MIN_VALUE;
            n02.e = 0;
            n02.f3864f = 0;
            n02.f3865g = false;
            n02.f3866h = false;
            this.f1878t = n02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f1862a;
        if (actionMenuView.f1822p == null) {
            MenuC0229m menuC0229m = (MenuC0229m) actionMenuView.getMenu();
            if (this.f1856L == null) {
                this.f1856L = new X0(this);
            }
            this.f1862a.setExpandedActionViewsExclusive(true);
            menuC0229m.b(this.f1856L, this.j);
            u();
        }
    }

    public final void f() {
        if (this.f1862a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1862a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1869k);
            this.f1862a.setOnMenuItemClickListener(this.f1854I);
            ActionMenuView actionMenuView2 = this.f1862a;
            V0 v02 = new V0(this);
            actionMenuView2.getClass();
            actionMenuView2.f1827u = v02;
            Y0 h2 = h();
            h2.f3904a = (this.f1872n & 112) | 8388613;
            this.f1862a.setLayoutParams(h2);
            b(this.f1862a, false);
        }
    }

    public final void g() {
        if (this.f1865d == null) {
            this.f1865d = new C0289y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            Y0 h2 = h();
            h2.f3904a = (this.f1872n & 112) | 8388611;
            this.f1865d.setLayoutParams(h2);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0289y c0289y = this.f1868h;
        if (c0289y != null) {
            return c0289y.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0289y c0289y = this.f1868h;
        if (c0289y != null) {
            return c0289y.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        N0 n02 = this.f1878t;
        if (n02 != null) {
            return n02.f3865g ? n02.f3860a : n02.f3861b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1880v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        N0 n02 = this.f1878t;
        if (n02 != null) {
            return n02.f3860a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        N0 n02 = this.f1878t;
        if (n02 != null) {
            return n02.f3861b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        N0 n02 = this.f1878t;
        if (n02 != null) {
            return n02.f3865g ? n02.f3861b : n02.f3860a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1879u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0229m menuC0229m;
        ActionMenuView actionMenuView = this.f1862a;
        return (actionMenuView == null || (menuC0229m = actionMenuView.f1822p) == null || !menuC0229m.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1880v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1879u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0291z c0291z = this.e;
        if (c0291z != null) {
            return c0291z.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0291z c0291z = this.e;
        if (c0291z != null) {
            return c0291z.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1862a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1865d;
    }

    public CharSequence getNavigationContentDescription() {
        C0289y c0289y = this.f1865d;
        if (c0289y != null) {
            return c0289y.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0289y c0289y = this.f1865d;
        if (c0289y != null) {
            return c0289y.getDrawable();
        }
        return null;
    }

    public C0264l getOuterActionMenuPresenter() {
        return this.f1855K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1862a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.f1869k;
    }

    public CharSequence getSubtitle() {
        return this.f1883y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1864c;
    }

    public CharSequence getTitle() {
        return this.f1882x;
    }

    public int getTitleMarginBottom() {
        return this.f1877s;
    }

    public int getTitleMarginEnd() {
        return this.f1875q;
    }

    public int getTitleMarginStart() {
        return this.f1874p;
    }

    public int getTitleMarginTop() {
        return this.f1876r;
    }

    public final TextView getTitleTextView() {
        return this.f1863b;
    }

    public InterfaceC0263k0 getWrapper() {
        Drawable drawable;
        if (this.J == null) {
            c1 c1Var = new c1();
            c1Var.f3933n = 0;
            c1Var.f3923a = this;
            c1Var.f3929h = getTitle();
            c1Var.i = getSubtitle();
            c1Var.f3928g = c1Var.f3929h != null;
            c1Var.f3927f = getNavigationIcon();
            h i = h.i(getContext(), null, AbstractC0155a.f3034a, R.attr.actionBarStyle);
            c1Var.f3934o = i.c(15);
            TypedArray typedArray = (TypedArray) i.f617c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c1Var.f3928g = true;
                c1Var.f3929h = text;
                if ((c1Var.f3924b & 8) != 0) {
                    Toolbar toolbar = c1Var.f3923a;
                    toolbar.setTitle(text);
                    if (c1Var.f3928g) {
                        K.m(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c1Var.i = text2;
                if ((c1Var.f3924b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable c2 = i.c(20);
            if (c2 != null) {
                c1Var.e = c2;
                c1Var.c();
            }
            Drawable c3 = i.c(17);
            if (c3 != null) {
                c1Var.f3926d = c3;
                c1Var.c();
            }
            if (c1Var.f3927f == null && (drawable = c1Var.f3934o) != null) {
                c1Var.f3927f = drawable;
                int i2 = c1Var.f3924b & 4;
                Toolbar toolbar2 = c1Var.f3923a;
                if (i2 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            c1Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c1Var.f3925c;
                if (view != null && (c1Var.f3924b & 16) != 0) {
                    removeView(view);
                }
                c1Var.f3925c = inflate;
                if (inflate != null && (c1Var.f3924b & 16) != 0) {
                    addView(inflate);
                }
                c1Var.a(c1Var.f3924b | 16);
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
                this.f1878t.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1870l = resourceId2;
                C0245b0 c0245b0 = this.f1863b;
                if (c0245b0 != null) {
                    c0245b0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1871m = resourceId3;
                C0245b0 c0245b02 = this.f1864c;
                if (c0245b02 != null) {
                    c0245b02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            i.l();
            if (R.string.abc_action_bar_up_description != c1Var.f3933n) {
                c1Var.f3933n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = c1Var.f3933n;
                    c1Var.j = i3 != 0 ? getContext().getString(i3) : null;
                    c1Var.b();
                }
            }
            c1Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new b1(c1Var));
            this.J = c1Var;
        }
        return this.J;
    }

    public final int j(View view, int i) {
        Y0 y02 = (Y0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = y02.f3904a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f1881w & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) y02).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) y02).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) y02).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public void m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void n() {
        Iterator it = this.f1853H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f1852G.f617c).iterator();
        while (it2.hasNext()) {
            ((E) it2.next()).f1409a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1853H = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f1850E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1861Q);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1848C = false;
        }
        if (!this.f1848C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1848C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1848C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0298 A[LOOP:0: B:40:0x0296->B:41:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b5 A[LOOP:1: B:44:0x02b3->B:45:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d3 A[LOOP:2: B:48:0x02d1->B:49:0x02d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0321 A[LOOP:3: B:57:0x031f->B:58:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0221  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean t2;
        boolean t3;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        int paddingTop;
        int i14;
        int i15;
        int i16;
        int i17;
        int size;
        int i18;
        int i19;
        int size2;
        int i20;
        int size3;
        int i21;
        int i22;
        int i23;
        int size4;
        boolean z4 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i24 = width - paddingRight;
        int[] iArr = this.f1851F;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = K.f747a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (!t(this.f1865d)) {
            i5 = paddingLeft;
        } else {
            if (z4) {
                i6 = q(this.f1865d, i24, min, iArr);
                i5 = paddingLeft;
                if (t(this.f1868h)) {
                    if (z4) {
                        i6 = q(this.f1868h, i6, min, iArr);
                    } else {
                        i5 = p(this.f1868h, i5, min, iArr);
                    }
                }
                if (t(this.f1862a)) {
                    if (z4) {
                        i5 = p(this.f1862a, i5, min, iArr);
                    } else {
                        i6 = q(this.f1862a, i6, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i5);
                iArr[1] = Math.max(0, currentContentInsetRight - (i24 - i6));
                int max = Math.max(i5, currentContentInsetLeft);
                int min2 = Math.min(i6, i24 - currentContentInsetRight);
                if (t(this.i)) {
                    if (z4) {
                        min2 = q(this.i, min2, min, iArr);
                    } else {
                        max = p(this.i, max, min, iArr);
                    }
                }
                if (t(this.e)) {
                    if (z4) {
                        min2 = q(this.e, min2, min, iArr);
                    } else {
                        max = p(this.e, max, min, iArr);
                    }
                }
                t2 = t(this.f1863b);
                t3 = t(this.f1864c);
                if (t2) {
                    i7 = paddingRight;
                    i8 = 0;
                } else {
                    Y0 y02 = (Y0) this.f1863b.getLayoutParams();
                    i7 = paddingRight;
                    i8 = ((ViewGroup.MarginLayoutParams) y02).bottomMargin + this.f1863b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) y02).topMargin;
                }
                if (t3) {
                    i9 = width;
                } else {
                    Y0 y03 = (Y0) this.f1864c.getLayoutParams();
                    i9 = width;
                    i8 += this.f1864c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) y03).topMargin + ((ViewGroup.MarginLayoutParams) y03).bottomMargin;
                }
                if (!t2 || t3) {
                    C0245b0 c0245b0 = !t2 ? this.f1863b : this.f1864c;
                    C0245b0 c0245b02 = !t3 ? this.f1864c : this.f1863b;
                    Y0 y04 = (Y0) c0245b0.getLayoutParams();
                    Y0 y05 = (Y0) c0245b02.getLayoutParams();
                    if ((t2 || this.f1863b.getMeasuredWidth() <= 0) && (!t3 || this.f1864c.getMeasuredWidth() <= 0)) {
                        i10 = paddingLeft;
                        z3 = false;
                    } else {
                        i10 = paddingLeft;
                        z3 = true;
                    }
                    i11 = this.f1881w & 112;
                    i12 = min;
                    if (i11 != 48) {
                        i13 = max;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) y04).topMargin + this.f1876r;
                    } else if (i11 != 80) {
                        int i25 = (((height - paddingTop2) - paddingBottom) - i8) / 2;
                        i13 = max;
                        int i26 = ((ViewGroup.MarginLayoutParams) y04).topMargin + this.f1876r;
                        if (i25 < i26) {
                            i25 = i26;
                        } else {
                            int i27 = (((height - paddingBottom) - i8) - i25) - paddingTop2;
                            int i28 = ((ViewGroup.MarginLayoutParams) y04).bottomMargin;
                            int i29 = this.f1877s;
                            if (i27 < i28 + i29) {
                                i25 = Math.max(0, i25 - ((((ViewGroup.MarginLayoutParams) y05).bottomMargin + i29) - i27));
                            }
                        }
                        paddingTop = paddingTop2 + i25;
                    } else {
                        i13 = max;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) y05).bottomMargin) - this.f1877s) - i8;
                    }
                    if (z4) {
                        int i30 = (z3 ? this.f1874p : 0) - iArr[0];
                        max = Math.max(0, i30) + i13;
                        iArr[0] = Math.max(0, -i30);
                        if (t2) {
                            Y0 y06 = (Y0) this.f1863b.getLayoutParams();
                            int measuredWidth = this.f1863b.getMeasuredWidth() + max;
                            int measuredHeight = this.f1863b.getMeasuredHeight() + paddingTop;
                            this.f1863b.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i14 = measuredWidth + this.f1875q;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) y06).bottomMargin;
                        } else {
                            i14 = max;
                        }
                        if (t3) {
                            int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Y0) this.f1864c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f1864c.getMeasuredWidth() + max;
                            this.f1864c.layout(max, i31, measuredWidth2, this.f1864c.getMeasuredHeight() + i31);
                            i15 = measuredWidth2 + this.f1875q;
                        } else {
                            i15 = max;
                        }
                        if (z3) {
                            max = Math.max(i14, i15);
                        }
                    } else {
                        int i32 = (z3 ? this.f1874p : 0) - iArr[1];
                        min2 -= Math.max(0, i32);
                        iArr[1] = Math.max(0, -i32);
                        if (t2) {
                            Y0 y07 = (Y0) this.f1863b.getLayoutParams();
                            int measuredWidth3 = min2 - this.f1863b.getMeasuredWidth();
                            int measuredHeight2 = this.f1863b.getMeasuredHeight() + paddingTop;
                            this.f1863b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i16 = measuredWidth3 - this.f1875q;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) y07).bottomMargin;
                        } else {
                            i16 = min2;
                        }
                        if (t3) {
                            int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Y0) this.f1864c.getLayoutParams())).topMargin;
                            this.f1864c.layout(min2 - this.f1864c.getMeasuredWidth(), i33, min2, this.f1864c.getMeasuredHeight() + i33);
                            i17 = min2 - this.f1875q;
                        } else {
                            i17 = min2;
                        }
                        if (z3) {
                            min2 = Math.min(i16, i17);
                        }
                        max = i13;
                    }
                } else {
                    i10 = paddingLeft;
                    i12 = min;
                }
                ArrayList arrayList = this.f1849D;
                a(arrayList, 3);
                size = arrayList.size();
                i18 = max;
                for (i19 = 0; i19 < size; i19++) {
                    i18 = p((View) arrayList.get(i19), i18, i12, iArr);
                }
                int i34 = i12;
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i20 = 0; i20 < size2; i20++) {
                    min2 = q((View) arrayList.get(i20), min2, i34, iArr);
                }
                a(arrayList, 1);
                int i35 = iArr[0];
                int i36 = iArr[1];
                size3 = arrayList.size();
                int i37 = i36;
                int i38 = i35;
                i21 = 0;
                int i39 = 0;
                while (i21 < size3) {
                    View view = (View) arrayList.get(i21);
                    Y0 y08 = (Y0) view.getLayoutParams();
                    int i40 = ((ViewGroup.MarginLayoutParams) y08).leftMargin - i38;
                    int i41 = ((ViewGroup.MarginLayoutParams) y08).rightMargin - i37;
                    int max2 = Math.max(0, i40);
                    int max3 = Math.max(0, i41);
                    int max4 = Math.max(0, -i40);
                    int max5 = Math.max(0, -i41);
                    i39 += view.getMeasuredWidth() + max2 + max3;
                    i21++;
                    i37 = max5;
                    i38 = max4;
                }
                i23 = ((((i9 - i10) - i7) / 2) + i10) - (i39 / 2);
                int i42 = i39 + i23;
                if (i23 >= i18) {
                    i18 = i42 > min2 ? i23 - (i42 - min2) : i23;
                }
                size4 = arrayList.size();
                for (i22 = 0; i22 < size4; i22++) {
                    i18 = p((View) arrayList.get(i22), i18, i34, iArr);
                }
                arrayList.clear();
            }
            i5 = p(this.f1865d, paddingLeft, min, iArr);
        }
        i6 = i24;
        if (t(this.f1868h)) {
        }
        if (t(this.f1862a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i24 - i6));
        int max6 = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i24 - currentContentInsetRight2);
        if (t(this.i)) {
        }
        if (t(this.e)) {
        }
        t2 = t(this.f1863b);
        t3 = t(this.f1864c);
        if (t2) {
        }
        if (t3) {
        }
        if (t2) {
        }
        if (!t2) {
        }
        if (!t3) {
        }
        Y0 y042 = (Y0) c0245b0.getLayoutParams();
        Y0 y052 = (Y0) c0245b02.getLayoutParams();
        if (t2) {
        }
        i10 = paddingLeft;
        z3 = false;
        i11 = this.f1881w & 112;
        i12 = min;
        if (i11 != 48) {
        }
        if (z4) {
        }
        ArrayList arrayList2 = this.f1849D;
        a(arrayList2, 3);
        size = arrayList2.size();
        i18 = max6;
        while (i19 < size) {
        }
        int i342 = i12;
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i20 < size2) {
        }
        a(arrayList2, 1);
        int i352 = iArr[0];
        int i362 = iArr[1];
        size3 = arrayList2.size();
        int i372 = i362;
        int i382 = i352;
        i21 = 0;
        int i392 = 0;
        while (i21 < size3) {
        }
        i23 = ((((i9 - i10) - i7) / 2) + i10) - (i392 / 2);
        int i422 = i392 + i23;
        if (i23 >= i18) {
        }
        size4 = arrayList2.size();
        while (i22 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c2;
        char c3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2 = h1.f3952a;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (t(this.f1865d)) {
            s(this.f1865d, i, 0, i2, this.f1873o);
            i3 = k(this.f1865d) + this.f1865d.getMeasuredWidth();
            i4 = Math.max(0, l(this.f1865d) + this.f1865d.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.f1865d.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (t(this.f1868h)) {
            s(this.f1868h, i, 0, i2, this.f1873o);
            i3 = k(this.f1868h) + this.f1868h.getMeasuredWidth();
            i4 = Math.max(i4, l(this.f1868h) + this.f1868h.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1868h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        int[] iArr = this.f1851F;
        iArr[c3] = max2;
        if (t(this.f1862a)) {
            s(this.f1862a, i, max, i2, this.f1873o);
            i6 = k(this.f1862a) + this.f1862a.getMeasuredWidth();
            i4 = Math.max(i4, l(this.f1862a) + this.f1862a.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1862a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (t(this.i)) {
            max3 += r(this.i, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.i) + this.i.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.i.getMeasuredState());
        }
        if (t(this.e)) {
            max3 += r(this.e, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.e) + this.e.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((Y0) childAt.getLayoutParams()).f3905b == 0 && t(childAt)) {
                max3 += r(childAt, i, max3, i2, 0, iArr);
                i4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1876r + this.f1877s;
        int i13 = this.f1874p + this.f1875q;
        if (t(this.f1863b)) {
            r(this.f1863b, i, max3 + i13, i2, i12, iArr);
            int k2 = k(this.f1863b) + this.f1863b.getMeasuredWidth();
            i7 = l(this.f1863b) + this.f1863b.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.f1863b.getMeasuredState());
            i9 = k2;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (t(this.f1864c)) {
            i9 = Math.max(i9, r(this.f1864c, i, max3 + i13, i2, i7 + i12, iArr));
            i7 = l(this.f1864c) + this.f1864c.getMeasuredHeight() + i7;
            i8 = View.combineMeasuredStates(i8, this.f1864c.getMeasuredState());
        }
        int max4 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i9, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.f1857M) {
            int childCount2 = getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = getChildAt(i14);
                if (!t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i10);
        }
        i10 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof a1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a1 a1Var = (a1) parcelable;
        super.onRestoreInstanceState(a1Var.f1147a);
        ActionMenuView actionMenuView = this.f1862a;
        MenuC0229m menuC0229m = actionMenuView != null ? actionMenuView.f1822p : null;
        int i = a1Var.f3910c;
        if (i != 0 && this.f1856L != null && menuC0229m != null && (findItem = menuC0229m.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (a1Var.f3911d) {
            j jVar = this.f1861Q;
            removeCallbacks(jVar);
            post(jVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        N0 n02 = this.f1878t;
        boolean z2 = i == 1;
        if (z2 == n02.f3865g) {
            return;
        }
        n02.f3865g = z2;
        if (!n02.f3866h) {
            n02.f3860a = n02.e;
            n02.f3861b = n02.f3864f;
            return;
        }
        if (z2) {
            int i2 = n02.f3863d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = n02.e;
            }
            n02.f3860a = i2;
            int i3 = n02.f3862c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = n02.f3864f;
            }
            n02.f3861b = i3;
            return;
        }
        int i4 = n02.f3862c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = n02.e;
        }
        n02.f3860a = i4;
        int i5 = n02.f3863d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = n02.f3864f;
        }
        n02.f3861b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0264l c0264l;
        o oVar;
        a1 a1Var = new a1(super.onSaveInstanceState());
        X0 x02 = this.f1856L;
        if (x02 != null && (oVar = x02.f3902b) != null) {
            a1Var.f3910c = oVar.f3736a;
        }
        ActionMenuView actionMenuView = this.f1862a;
        a1Var.f3911d = (actionMenuView == null || (c0264l = actionMenuView.f1826t) == null || !c0264l.g()) ? false : true;
        return a1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1847B = false;
        }
        if (!this.f1847B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1847B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1847B = false;
        }
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        Y0 y02 = (Y0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) y02).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) y02).rightMargin + max;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        Y0 y02 = (Y0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) y02).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) y02).leftMargin);
    }

    public final int r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f1860P != z2) {
            this.f1860P = z2;
            u();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(f.n(getContext(), i));
    }

    public void setCollapsible(boolean z2) {
        this.f1857M = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1880v) {
            this.f1880v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1879u) {
            this.f1879u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(f.n(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(f.n(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f1865d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(Z0 z0) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1862a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1869k != i) {
            this.f1869k = i;
            if (i == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f1877s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1875q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1874p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1876r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void u() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a2 = W0.a(this);
            X0 x02 = this.f1856L;
            boolean z2 = (x02 == null || x02.f3902b == null || a2 == null || !isAttachedToWindow() || !this.f1860P) ? false : true;
            if (z2 && this.f1859O == null) {
                if (this.f1858N == null) {
                    this.f1858N = W0.b(new U0(this, 0));
                }
                W0.c(a2, this.f1858N);
                this.f1859O = a2;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f1859O) == null) {
                return;
            }
            W0.d(onBackInvokedDispatcher, this.f1858N);
            this.f1859O = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1881w = 8388627;
        this.f1849D = new ArrayList();
        this.f1850E = new ArrayList();
        this.f1851F = new int[2];
        this.f1852G = new h(new U0(this, 1));
        this.f1853H = new ArrayList();
        this.f1854I = new V0(this);
        this.f1861Q = new j(14, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0155a.f3053w;
        h i2 = h.i(context2, attributeSet, iArr, R.attr.toolbarStyle);
        K.k(this, context, iArr, attributeSet, (TypedArray) i2.f617c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) i2.f617c;
        this.f1870l = typedArray.getResourceId(28, 0);
        this.f1871m = typedArray.getResourceId(19, 0);
        this.f1881w = typedArray.getInteger(0, 8388627);
        this.f1872n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1877s = dimensionPixelOffset;
        this.f1876r = dimensionPixelOffset;
        this.f1875q = dimensionPixelOffset;
        this.f1874p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1874p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1875q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1876r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1877s = dimensionPixelOffset5;
        }
        this.f1873o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        N0 n02 = this.f1878t;
        n02.f3866h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            n02.e = dimensionPixelSize;
            n02.f3860a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            n02.f3864f = dimensionPixelSize2;
            n02.f3861b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            n02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1879u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1880v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1866f = i2.c(4);
        this.f1867g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable c2 = i2.c(16);
        if (c2 != null) {
            setNavigationIcon(c2);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable c3 = i2.c(11);
        if (c3 != null) {
            setLogo(c3);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(i2.b(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(i2.b(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        i2.l();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        Y0 y02 = new Y0(context, attributeSet);
        y02.f3904a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0155a.f3035b);
        y02.f3904a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        y02.f3905b = 0;
        return y02;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0289y c0289y = this.f1868h;
        if (c0289y != null) {
            c0289y.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1868h.setImageDrawable(drawable);
        } else {
            C0289y c0289y = this.f1868h;
            if (c0289y != null) {
                c0289y.setImageDrawable(this.f1866f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.e == null) {
                this.e = new C0291z(getContext(), null, 0);
            }
            if (!o(this.e)) {
                b(this.e, true);
            }
        } else {
            C0291z c0291z = this.e;
            if (c0291z != null && o(c0291z)) {
                removeView(this.e);
                this.f1850E.remove(this.e);
            }
        }
        C0291z c0291z2 = this.e;
        if (c0291z2 != null) {
            c0291z2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new C0291z(getContext(), null, 0);
        }
        C0291z c0291z = this.e;
        if (c0291z != null) {
            c0291z.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0289y c0289y = this.f1865d;
        if (c0289y != null) {
            c0289y.setContentDescription(charSequence);
            d1.a(this.f1865d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f1865d)) {
                b(this.f1865d, true);
            }
        } else {
            C0289y c0289y = this.f1865d;
            if (c0289y != null && o(c0289y)) {
                removeView(this.f1865d);
                this.f1850E.remove(this.f1865d);
            }
        }
        C0289y c0289y2 = this.f1865d;
        if (c0289y2 != null) {
            c0289y2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0245b0 c0245b0 = this.f1864c;
            if (c0245b0 != null && o(c0245b0)) {
                removeView(this.f1864c);
                this.f1850E.remove(this.f1864c);
            }
        } else {
            if (this.f1864c == null) {
                Context context = getContext();
                C0245b0 c0245b02 = new C0245b0(context, null);
                this.f1864c = c0245b02;
                c0245b02.setSingleLine();
                this.f1864c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1871m;
                if (i != 0) {
                    this.f1864c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1846A;
                if (colorStateList != null) {
                    this.f1864c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1864c)) {
                b(this.f1864c, true);
            }
        }
        C0245b0 c0245b03 = this.f1864c;
        if (c0245b03 != null) {
            c0245b03.setText(charSequence);
        }
        this.f1883y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1846A = colorStateList;
        C0245b0 c0245b0 = this.f1864c;
        if (c0245b0 != null) {
            c0245b0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0245b0 c0245b0 = this.f1863b;
            if (c0245b0 != null && o(c0245b0)) {
                removeView(this.f1863b);
                this.f1850E.remove(this.f1863b);
            }
        } else {
            if (this.f1863b == null) {
                Context context = getContext();
                C0245b0 c0245b02 = new C0245b0(context, null);
                this.f1863b = c0245b02;
                c0245b02.setSingleLine();
                this.f1863b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1870l;
                if (i != 0) {
                    this.f1863b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1884z;
                if (colorStateList != null) {
                    this.f1863b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1863b)) {
                b(this.f1863b, true);
            }
        }
        C0245b0 c0245b03 = this.f1863b;
        if (c0245b03 != null) {
            c0245b03.setText(charSequence);
        }
        this.f1882x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1884z = colorStateList;
        C0245b0 c0245b0 = this.f1863b;
        if (c0245b0 != null) {
            c0245b0.setTextColor(colorStateList);
        }
    }
}
