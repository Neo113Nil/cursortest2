package androidx.appcompat.widget;

import B0.c;
import O.AbstractC0049z;
import O.B;
import O.C0038n;
import O.InterfaceC0036l;
import O.InterfaceC0037m;
import O.K;
import O.Y;
import O.Z;
import O.a0;
import O.b0;
import O.h0;
import O.j0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.lumenpath.harispro.hrnavigator.R;
import h.M;
import h0.f;
import java.util.WeakHashMap;
import k.j;
import l.MenuC0229m;
import l.x;
import m.C0250e;
import m.C0252f;
import m.C0264l;
import m.InterfaceC0248d;
import m.InterfaceC0261j0;
import m.InterfaceC0263k0;
import m.RunnableC0246c;
import m.X0;
import m.c1;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0261j0, InterfaceC0036l, InterfaceC0037m {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1794C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final j0 f1795D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1796E;

    /* renamed from: A, reason: collision with root package name */
    public final C0038n f1797A;

    /* renamed from: B, reason: collision with root package name */
    public final C0252f f1798B;

    /* renamed from: a, reason: collision with root package name */
    public int f1799a;

    /* renamed from: b, reason: collision with root package name */
    public int f1800b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1801c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f1802d;
    public InterfaceC0263k0 e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1803f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1804g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1805h;
    public boolean i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f1806k;

    /* renamed from: l, reason: collision with root package name */
    public int f1807l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1808m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1809n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1810o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1811p;

    /* renamed from: q, reason: collision with root package name */
    public j0 f1812q;

    /* renamed from: r, reason: collision with root package name */
    public j0 f1813r;

    /* renamed from: s, reason: collision with root package name */
    public j0 f1814s;

    /* renamed from: t, reason: collision with root package name */
    public j0 f1815t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0248d f1816u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1817v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1818w;

    /* renamed from: x, reason: collision with root package name */
    public final c f1819x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0246c f1820y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0246c f1821z;

    static {
        int i = Build.VERSION.SDK_INT;
        b0 a0Var = i >= 30 ? new a0() : i >= 29 ? new Z() : new Y();
        a0Var.g(G.c.b(0, 1, 0, 1));
        f1795D = a0Var.b();
        f1796E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1800b = 0;
        this.f1808m = new Rect();
        this.f1809n = new Rect();
        this.f1810o = new Rect();
        this.f1811p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        j0 j0Var = j0.f818b;
        this.f1812q = j0Var;
        this.f1813r = j0Var;
        this.f1814s = j0Var;
        this.f1815t = j0Var;
        this.f1819x = new c(5, this);
        this.f1820y = new RunnableC0246c(this, 0);
        this.f1821z = new RunnableC0246c(this, 1);
        i(context);
        this.f1797A = new C0038n();
        C0252f c0252f = new C0252f(context);
        c0252f.setWillNotDraw(true);
        this.f1798B = c0252f;
        addView(c0252f);
    }

    public static boolean d(View view, Rect rect, boolean z2) {
        boolean z3;
        C0250e c0250e = (C0250e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0250e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0250e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0250e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0250e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0250e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0250e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0250e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0250e).bottomMargin = i8;
                return true;
            }
        }
        return z3;
    }

    @Override // O.InterfaceC0036l
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // O.InterfaceC0037m
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(view, i, i2, i3, i4, i5);
    }

    @Override // O.InterfaceC0036l
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0250e;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1803f != null) {
            if (this.f1802d.getVisibility() == 0) {
                i = (int) (this.f1802d.getTranslationY() + this.f1802d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1803f.setBounds(0, i, getWidth(), this.f1803f.getIntrinsicHeight() + i);
            this.f1803f.draw(canvas);
        }
    }

    @Override // O.InterfaceC0036l
    public final void e(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // O.InterfaceC0036l
    public final void f(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // O.InterfaceC0036l
    public final boolean g(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0250e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0250e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1802d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0038n c0038n = this.f1797A;
        return c0038n.f826b | c0038n.f825a;
    }

    public CharSequence getTitle() {
        k();
        return ((c1) this.e).f3923a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1820y);
        removeCallbacks(this.f1821z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1818w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1794C);
        this.f1799a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1803f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1817v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((c1) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((c1) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0263k0 wrapper;
        if (this.f1801c == null) {
            this.f1801c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1802d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0263k0) {
                wrapper = (InterfaceC0263k0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    public final void l(MenuC0229m menuC0229m, x xVar) {
        k();
        c1 c1Var = (c1) this.e;
        C0264l c0264l = c1Var.f3932m;
        Toolbar toolbar = c1Var.f3923a;
        if (c0264l == null) {
            C0264l c0264l2 = new C0264l(toolbar.getContext());
            c1Var.f3932m = c0264l2;
            c0264l2.i = R.id.action_menu_presenter;
        }
        C0264l c0264l3 = c1Var.f3932m;
        c0264l3.e = xVar;
        if (menuC0229m == null && toolbar.f1862a == null) {
            return;
        }
        toolbar.f();
        MenuC0229m menuC0229m2 = toolbar.f1862a.f1822p;
        if (menuC0229m2 == menuC0229m) {
            return;
        }
        if (menuC0229m2 != null) {
            menuC0229m2.r(toolbar.f1855K);
            menuC0229m2.r(toolbar.f1856L);
        }
        if (toolbar.f1856L == null) {
            toolbar.f1856L = new X0(toolbar);
        }
        c0264l3.f3973r = true;
        if (menuC0229m != null) {
            menuC0229m.b(c0264l3, toolbar.j);
            menuC0229m.b(toolbar.f1856L, toolbar.j);
        } else {
            c0264l3.d(toolbar.j, null);
            toolbar.f1856L.d(toolbar.j, null);
            c0264l3.m(true);
            toolbar.f1856L.m(true);
        }
        toolbar.f1862a.setPopupTheme(toolbar.f1869k);
        toolbar.f1862a.setPresenter(c0264l3);
        toolbar.f1855K = c0264l3;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        j0 g2 = j0.g(this, windowInsets);
        boolean d2 = d(this.f1802d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = K.f747a;
        Rect rect = this.f1808m;
        B.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        h0 h0Var = g2.f819a;
        j0 l2 = h0Var.l(i, i2, i3, i4);
        this.f1812q = l2;
        boolean z2 = true;
        if (!this.f1813r.equals(l2)) {
            this.f1813r = this.f1812q;
            d2 = true;
        }
        Rect rect2 = this.f1809n;
        if (rect2.equals(rect)) {
            z2 = d2;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return h0Var.a().f819a.c().f819a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = K.f747a;
        AbstractC0049z.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0250e c0250e = (C0250e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0250e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0250e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.f1802d, i, 0, i2, 0);
        C0250e c0250e = (C0250e) this.f1802d.getLayoutParams();
        int max = Math.max(0, this.f1802d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0250e).leftMargin + ((ViewGroup.MarginLayoutParams) c0250e).rightMargin);
        int max2 = Math.max(0, this.f1802d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0250e).topMargin + ((ViewGroup.MarginLayoutParams) c0250e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1802d.getMeasuredState());
        WeakHashMap weakHashMap = K.f747a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1799a;
            if (this.f1805h && this.f1802d.getTabContainer() != null) {
                measuredHeight += this.f1799a;
            }
        } else {
            measuredHeight = this.f1802d.getVisibility() != 8 ? this.f1802d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1808m;
        Rect rect2 = this.f1810o;
        rect2.set(rect);
        this.f1814s = this.f1812q;
        if (!this.f1804g && !z2) {
            C0252f c0252f = this.f1798B;
            j0 j0Var = f1795D;
            Rect rect3 = this.f1811p;
            B.b(c0252f, j0Var, rect3);
            if (!rect3.equals(f1796E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1814s = this.f1814s.f819a.l(0, measuredHeight, 0, 0);
                d(this.f1801c, rect2, true);
                if (!this.f1815t.equals(this.f1814s)) {
                    j0 j0Var2 = this.f1814s;
                    this.f1815t = j0Var2;
                    ContentFrameLayout contentFrameLayout = this.f1801c;
                    WindowInsets f2 = j0Var2.f();
                    if (f2 != null) {
                        WindowInsets a2 = AbstractC0049z.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            j0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1801c, i, 0, i2, 0);
                C0250e c0250e2 = (C0250e) this.f1801c.getLayoutParams();
                int max3 = Math.max(max, this.f1801c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0250e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0250e2).rightMargin);
                int max4 = Math.max(max2, this.f1801c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0250e2).topMargin + ((ViewGroup.MarginLayoutParams) c0250e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1801c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        G.c b2 = G.c.b(this.f1814s.b(), this.f1814s.d() + measuredHeight, this.f1814s.c(), this.f1814s.a());
        j0 j0Var3 = this.f1814s;
        int i3 = Build.VERSION.SDK_INT;
        b0 a0Var = i3 >= 30 ? new a0(j0Var3) : i3 >= 29 ? new Z(j0Var3) : new Y(j0Var3);
        a0Var.g(b2);
        this.f1814s = a0Var.b();
        d(this.f1801c, rect2, true);
        if (!this.f1815t.equals(this.f1814s)) {
        }
        measureChildWithMargins(this.f1801c, i, 0, i2, 0);
        C0250e c0250e22 = (C0250e) this.f1801c.getLayoutParams();
        int max32 = Math.max(max, this.f1801c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0250e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0250e22).rightMargin);
        int max42 = Math.max(max2, this.f1801c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0250e22).topMargin + ((ViewGroup.MarginLayoutParams) c0250e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1801c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1817v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1817v.getFinalY() > this.f1802d.getHeight()) {
            h();
            this.f1821z.run();
        } else {
            h();
            this.f1820y.run();
        }
        this.j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1806k + i2;
        this.f1806k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        M m2;
        j jVar;
        this.f1797A.f825a = i;
        this.f1806k = getActionBarHideOffset();
        h();
        InterfaceC0248d interfaceC0248d = this.f1816u;
        if (interfaceC0248d == null || (jVar = (m2 = (M) interfaceC0248d).f3171s) == null) {
            return;
        }
        jVar.a();
        m2.f3171s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1802d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.i || this.j) {
            return;
        }
        if (this.f1806k <= this.f1802d.getHeight()) {
            h();
            postDelayed(this.f1820y, 600L);
        } else {
            h();
            postDelayed(this.f1821z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1807l ^ i;
        this.f1807l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0248d interfaceC0248d = this.f1816u;
        if (interfaceC0248d != null) {
            M m2 = (M) interfaceC0248d;
            m2.f3167o = !z3;
            if (z2 || !z3) {
                if (m2.f3168p) {
                    m2.f3168p = false;
                    m2.A0(true);
                }
            } else if (!m2.f3168p) {
                m2.f3168p = true;
                m2.A0(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1816u == null) {
            return;
        }
        WeakHashMap weakHashMap = K.f747a;
        AbstractC0049z.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1800b = i;
        InterfaceC0248d interfaceC0248d = this.f1816u;
        if (interfaceC0248d != null) {
            ((M) interfaceC0248d).f3166n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f1802d.setTranslationY(-Math.max(0, Math.min(i, this.f1802d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0248d interfaceC0248d) {
        this.f1816u = interfaceC0248d;
        if (getWindowToken() != null) {
            ((M) this.f1816u).f3166n = this.f1800b;
            int i = this.f1807l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = K.f747a;
                AbstractC0049z.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f1805h = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.i) {
            this.i = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        c1 c1Var = (c1) this.e;
        c1Var.f3926d = i != 0 ? f.n(c1Var.f3923a.getContext(), i) : null;
        c1Var.c();
    }

    public void setLogo(int i) {
        k();
        c1 c1Var = (c1) this.e;
        c1Var.e = i != 0 ? f.n(c1Var.f3923a.getContext(), i) : null;
        c1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1804g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // m.InterfaceC0261j0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((c1) this.e).f3930k = callback;
    }

    @Override // m.InterfaceC0261j0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        c1 c1Var = (c1) this.e;
        if (c1Var.f3928g) {
            return;
        }
        c1Var.f3929h = charSequence;
        if ((c1Var.f3924b & 8) != 0) {
            Toolbar toolbar = c1Var.f3923a;
            toolbar.setTitle(charSequence);
            if (c1Var.f3928g) {
                K.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0250e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        c1 c1Var = (c1) this.e;
        c1Var.f3926d = drawable;
        c1Var.c();
    }
}
