package androidx.appcompat.widget;

import D0.k;
import G.e;
import O.A0;
import O.C0344t;
import O.InterfaceC0343s;
import O.J;
import O.L;
import O.X;
import O.p0;
import O.q0;
import O.r;
import O.r0;
import O.s0;
import O.y0;
import android.R;
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
import com.bumptech.glide.g;
import com.icefishing.icefishinglive2.C5275R;
import java.util.WeakHashMap;
import k.C4624k;
import l.m;
import l.x;
import m.C4683e;
import m.C4685f;
import m.C4695k;
import m.InterfaceC4681d;
import m.InterfaceC4690h0;
import m.InterfaceC4692i0;
import m.RunnableC4679c;
import m.S0;
import m.X0;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC4690h0, r, InterfaceC0343s {

    /* renamed from: V, reason: collision with root package name */
    public static final int[] f4529V = {C5275R.attr.actionBarSize, R.attr.windowContentOverlay};

    /* renamed from: W, reason: collision with root package name */
    public static final A0 f4530W;

    /* renamed from: n0, reason: collision with root package name */
    public static final Rect f4531n0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f4532A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4533B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f4534C;

    /* renamed from: D, reason: collision with root package name */
    public int f4535D;

    /* renamed from: E, reason: collision with root package name */
    public int f4536E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f4537F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f4538G;

    /* renamed from: H, reason: collision with root package name */
    public final Rect f4539H;

    /* renamed from: I, reason: collision with root package name */
    public final Rect f4540I;
    public A0 J;

    /* renamed from: K, reason: collision with root package name */
    public A0 f4541K;

    /* renamed from: L, reason: collision with root package name */
    public A0 f4542L;

    /* renamed from: M, reason: collision with root package name */
    public A0 f4543M;

    /* renamed from: N, reason: collision with root package name */
    public InterfaceC4681d f4544N;

    /* renamed from: O, reason: collision with root package name */
    public OverScroller f4545O;

    /* renamed from: P, reason: collision with root package name */
    public ViewPropertyAnimator f4546P;

    /* renamed from: Q, reason: collision with root package name */
    public final k f4547Q;

    /* renamed from: R, reason: collision with root package name */
    public final RunnableC4679c f4548R;

    /* renamed from: S, reason: collision with root package name */
    public final RunnableC4679c f4549S;

    /* renamed from: T, reason: collision with root package name */
    public final C0344t f4550T;

    /* renamed from: U, reason: collision with root package name */
    public final C4685f f4551U;

    /* renamed from: n, reason: collision with root package name */
    public int f4552n;

    /* renamed from: u, reason: collision with root package name */
    public int f4553u;

    /* renamed from: v, reason: collision with root package name */
    public ContentFrameLayout f4554v;

    /* renamed from: w, reason: collision with root package name */
    public ActionBarContainer f4555w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC4692i0 f4556x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f4557y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4558z;

    static {
        int i = Build.VERSION.SDK_INT;
        s0 r0Var = i >= 30 ? new r0() : i >= 29 ? new q0() : new p0();
        r0Var.g(e.b(0, 1, 0, 1));
        f4530W = r0Var.b();
        f4531n0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4553u = 0;
        this.f4537F = new Rect();
        this.f4538G = new Rect();
        this.f4539H = new Rect();
        this.f4540I = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        A0 a02 = A0.f2026b;
        this.J = a02;
        this.f4541K = a02;
        this.f4542L = a02;
        this.f4543M = a02;
        this.f4547Q = new k(3, this);
        this.f4548R = new RunnableC4679c(this, 0);
        this.f4549S = new RunnableC4679c(this, 1);
        i(context);
        this.f4550T = new C0344t();
        C4685f c4685f = new C4685f(context);
        c4685f.setWillNotDraw(true);
        this.f4551U = c4685f;
        addView(c4685f);
    }

    public static boolean g(View view, Rect rect, boolean z3) {
        boolean z6;
        C4683e c4683e = (C4683e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c4683e).leftMargin;
        int i6 = rect.left;
        if (i != i6) {
            ((ViewGroup.MarginLayoutParams) c4683e).leftMargin = i6;
            z6 = true;
        } else {
            z6 = false;
        }
        int i9 = ((ViewGroup.MarginLayoutParams) c4683e).topMargin;
        int i10 = rect.top;
        if (i9 != i10) {
            ((ViewGroup.MarginLayoutParams) c4683e).topMargin = i10;
            z6 = true;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) c4683e).rightMargin;
        int i12 = rect.right;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) c4683e).rightMargin = i12;
            z6 = true;
        }
        if (z3) {
            int i13 = ((ViewGroup.MarginLayoutParams) c4683e).bottomMargin;
            int i14 = rect.bottom;
            if (i13 != i14) {
                ((ViewGroup.MarginLayoutParams) c4683e).bottomMargin = i14;
                return true;
            }
        }
        return z6;
    }

    @Override // O.r
    public final void a(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // O.InterfaceC0343s
    public final void b(View view, int i, int i6, int i9, int i10, int i11, int[] iArr) {
        c(view, i, i6, i9, i10, i11);
    }

    @Override // O.r
    public final void c(View view, int i, int i6, int i9, int i10, int i11) {
        if (i11 == 0) {
            onNestedScroll(view, i, i6, i9, i10);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4683e;
    }

    @Override // O.r
    public final boolean d(View view, View view2, int i, int i6) {
        return i6 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f4557y != null) {
            if (this.f4555w.getVisibility() == 0) {
                i = (int) (this.f4555w.getTranslationY() + this.f4555w.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f4557y.setBounds(0, i, getWidth(), this.f4557y.getIntrinsicHeight() + i);
            this.f4557y.draw(canvas);
        }
    }

    @Override // O.r
    public final void e(View view, View view2, int i, int i6) {
        if (i6 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // O.r
    public final void f(View view, int i, int i6, int[] iArr, int i9) {
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C4683e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4683e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f4555w;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0344t c0344t = this.f4550T;
        return c0344t.f2134b | c0344t.f2133a;
    }

    public CharSequence getTitle() {
        k();
        return ((X0) this.f4556x).f39081a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f4548R);
        removeCallbacks(this.f4549S);
        ViewPropertyAnimator viewPropertyAnimator = this.f4546P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f4529V);
        this.f4552n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f4557y = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f4545O = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((X0) this.f4556x).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((X0) this.f4556x).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC4692i0 wrapper;
        if (this.f4554v == null) {
            this.f4554v = (ContentFrameLayout) findViewById(C5275R.id.action_bar_activity_content);
            this.f4555w = (ActionBarContainer) findViewById(C5275R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(C5275R.id.action_bar);
            if (findViewById instanceof InterfaceC4692i0) {
                wrapper = (InterfaceC4692i0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f4556x = wrapper;
        }
    }

    public final void l(m mVar, x xVar) {
        k();
        X0 x02 = (X0) this.f4556x;
        C4695k c4695k = x02.f39092m;
        Toolbar toolbar = x02.f39081a;
        if (c4695k == null) {
            x02.f39092m = new C4695k(toolbar.getContext());
        }
        C4695k c4695k2 = x02.f39092m;
        c4695k2.f39176x = xVar;
        if (mVar == null && toolbar.f4609n == null) {
            return;
        }
        toolbar.f();
        m mVar2 = toolbar.f4609n.f4559I;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            mVar2.r(toolbar.f4618u0);
            mVar2.r(toolbar.f4620v0);
        }
        if (toolbar.f4620v0 == null) {
            toolbar.f4620v0 = new S0(toolbar);
        }
        c4695k2.J = true;
        if (mVar != null) {
            mVar.b(c4695k2, toolbar.f4589C);
            mVar.b(toolbar.f4620v0, toolbar.f4589C);
        } else {
            c4695k2.h(toolbar.f4589C, null);
            toolbar.f4620v0.h(toolbar.f4589C, null);
            c4695k2.e();
            toolbar.f4620v0.e();
        }
        toolbar.f4609n.setPopupTheme(toolbar.f4590D);
        toolbar.f4609n.setPresenter(c4695k2);
        toolbar.f4618u0 = c4695k2;
        toolbar.w();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        A0 h9 = A0.h(this, windowInsets);
        boolean g4 = g(this.f4555w, new Rect(h9.b(), h9.d(), h9.c(), h9.a()), false);
        WeakHashMap weakHashMap = X.f2054a;
        Rect rect = this.f4537F;
        L.b(this, h9, rect);
        int i = rect.left;
        int i6 = rect.top;
        int i9 = rect.right;
        int i10 = rect.bottom;
        y0 y0Var = h9.f2027a;
        A0 l9 = y0Var.l(i, i6, i9, i10);
        this.J = l9;
        boolean z3 = true;
        if (!this.f4541K.equals(l9)) {
            this.f4541K = this.J;
            g4 = true;
        }
        Rect rect2 = this.f4538G;
        if (rect2.equals(rect)) {
            z3 = g4;
        } else {
            rect2.set(rect);
        }
        if (z3) {
            requestLayout();
        }
        return y0Var.a().f2027a.c().f2027a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = X.f2054a;
        J.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C4683e c4683e = (C4683e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = ((ViewGroup.MarginLayoutParams) c4683e).leftMargin + paddingLeft;
                int i13 = ((ViewGroup.MarginLayoutParams) c4683e).topMargin + paddingTop;
                childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i6) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.f4555w, i, 0, i6, 0);
        C4683e c4683e = (C4683e) this.f4555w.getLayoutParams();
        int max = Math.max(0, this.f4555w.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c4683e).leftMargin + ((ViewGroup.MarginLayoutParams) c4683e).rightMargin);
        int max2 = Math.max(0, this.f4555w.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c4683e).topMargin + ((ViewGroup.MarginLayoutParams) c4683e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f4555w.getMeasuredState());
        WeakHashMap weakHashMap = X.f2054a;
        boolean z3 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z3) {
            measuredHeight = this.f4552n;
            if (this.f4532A && this.f4555w.getTabContainer() != null) {
                measuredHeight += this.f4552n;
            }
        } else {
            measuredHeight = this.f4555w.getVisibility() != 8 ? this.f4555w.getMeasuredHeight() : 0;
        }
        Rect rect = this.f4537F;
        Rect rect2 = this.f4539H;
        rect2.set(rect);
        this.f4542L = this.J;
        if (!this.f4558z && !z3) {
            C4685f c4685f = this.f4551U;
            A0 a02 = f4530W;
            Rect rect3 = this.f4540I;
            L.b(c4685f, a02, rect3);
            if (!rect3.equals(f4531n0)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f4542L = this.f4542L.f2027a.l(0, measuredHeight, 0, 0);
                g(this.f4554v, rect2, true);
                if (!this.f4543M.equals(this.f4542L)) {
                    A0 a03 = this.f4542L;
                    this.f4543M = a03;
                    X.b(this.f4554v, a03);
                }
                measureChildWithMargins(this.f4554v, i, 0, i6, 0);
                C4683e c4683e2 = (C4683e) this.f4554v.getLayoutParams();
                int max3 = Math.max(max, this.f4554v.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c4683e2).leftMargin + ((ViewGroup.MarginLayoutParams) c4683e2).rightMargin);
                int max4 = Math.max(max2, this.f4554v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c4683e2).topMargin + ((ViewGroup.MarginLayoutParams) c4683e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f4554v.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i6, combineMeasuredStates2 << 16));
            }
        }
        e b9 = e.b(this.f4542L.b(), this.f4542L.d() + measuredHeight, this.f4542L.c(), this.f4542L.a());
        A0 a04 = this.f4542L;
        int i9 = Build.VERSION.SDK_INT;
        s0 r0Var = i9 >= 30 ? new r0(a04) : i9 >= 29 ? new q0(a04) : new p0(a04);
        r0Var.g(b9);
        this.f4542L = r0Var.b();
        g(this.f4554v, rect2, true);
        if (!this.f4543M.equals(this.f4542L)) {
        }
        measureChildWithMargins(this.f4554v, i, 0, i6, 0);
        C4683e c4683e22 = (C4683e) this.f4554v.getLayoutParams();
        int max32 = Math.max(max, this.f4554v.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c4683e22).leftMargin + ((ViewGroup.MarginLayoutParams) c4683e22).rightMargin);
        int max42 = Math.max(max2, this.f4554v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c4683e22).topMargin + ((ViewGroup.MarginLayoutParams) c4683e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f4554v.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i6, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f9, boolean z3) {
        if (!this.f4533B || !z3) {
            return false;
        }
        this.f4545O.fling(0, 0, 0, (int) f9, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f4545O.getFinalY() > this.f4555w.getHeight()) {
            h();
            this.f4549S.run();
        } else {
            h();
            this.f4548R.run();
        }
        this.f4534C = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f9) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i6, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i6, int i9, int i10) {
        int i11 = this.f4535D + i6;
        this.f4535D = i11;
        setActionBarHideOffset(i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        h.L l9;
        C4624k c4624k;
        this.f4550T.f2133a = i;
        this.f4535D = getActionBarHideOffset();
        h();
        InterfaceC4681d interfaceC4681d = this.f4544N;
        if (interfaceC4681d == null || (c4624k = (l9 = (h.L) interfaceC4681d).f37859s) == null) {
            return;
        }
        c4624k.a();
        l9.f37859s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f4555w.getVisibility() != 0) {
            return false;
        }
        return this.f4533B;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f4533B || this.f4534C) {
            return;
        }
        if (this.f4535D <= this.f4555w.getHeight()) {
            h();
            postDelayed(this.f4548R, 600L);
        } else {
            h();
            postDelayed(this.f4549S, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i6 = this.f4536E ^ i;
        this.f4536E = i;
        boolean z3 = (i & 4) == 0;
        boolean z6 = (i & 256) != 0;
        InterfaceC4681d interfaceC4681d = this.f4544N;
        if (interfaceC4681d != null) {
            h.L l9 = (h.L) interfaceC4681d;
            l9.f37855o = !z6;
            if (z3 || !z6) {
                if (l9.f37856p) {
                    l9.f37856p = false;
                    l9.w(true);
                }
            } else if (!l9.f37856p) {
                l9.f37856p = true;
                l9.w(true);
            }
        }
        if ((i6 & 256) == 0 || this.f4544N == null) {
            return;
        }
        WeakHashMap weakHashMap = X.f2054a;
        J.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f4553u = i;
        InterfaceC4681d interfaceC4681d = this.f4544N;
        if (interfaceC4681d != null) {
            ((h.L) interfaceC4681d).f37854n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f4555w.setTranslationY(-Math.max(0, Math.min(i, this.f4555w.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC4681d interfaceC4681d) {
        this.f4544N = interfaceC4681d;
        if (getWindowToken() != null) {
            ((h.L) this.f4544N).f37854n = this.f4553u;
            int i = this.f4536E;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = X.f2054a;
                J.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f4532A = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f4533B) {
            this.f4533B = z3;
            if (z3) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        X0 x02 = (X0) this.f4556x;
        x02.f39084d = i != 0 ? g.e(x02.f39081a.getContext(), i) : null;
        x02.d();
    }

    public void setLogo(int i) {
        k();
        X0 x02 = (X0) this.f4556x;
        x02.f39085e = i != 0 ? g.e(x02.f39081a.getContext(), i) : null;
        x02.d();
    }

    public void setOverlayMode(boolean z3) {
        this.f4558z = z3;
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i) {
    }

    @Override // m.InterfaceC4690h0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((X0) this.f4556x).f39090k = callback;
    }

    @Override // m.InterfaceC4690h0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        X0 x02 = (X0) this.f4556x;
        if (x02.f39087g) {
            return;
        }
        x02.f39088h = charSequence;
        if ((x02.f39082b & 8) != 0) {
            Toolbar toolbar = x02.f39081a;
            toolbar.setTitle(charSequence);
            if (x02.f39087g) {
                X.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C4683e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        X0 x02 = (X0) this.f4556x;
        x02.f39084d = drawable;
        x02.d();
    }
}
