package androidx.appcompat.widget;

import D0.k;
import G.e;
import O.A0;
import O.C0349t;
import O.InterfaceC0348s;
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
import com.IceFishing.LiveIceFishing.C5248R;
import com.bumptech.glide.g;
import h.M;
import java.util.WeakHashMap;
import k.C4634k;
import l.m;
import l.x;
import m.C4696e;
import m.C4698f;
import m.C4708k;
import m.InterfaceC4694d;
import m.InterfaceC4703h0;
import m.InterfaceC4705i0;
import m.RunnableC4692c;
import m.T0;
import m.Y0;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC4703h0, r, InterfaceC0348s {

    /* renamed from: V, reason: collision with root package name */
    public static final int[] f4497V = {C5248R.attr.actionBarSize, R.attr.windowContentOverlay};

    /* renamed from: W, reason: collision with root package name */
    public static final A0 f4498W;

    /* renamed from: i0, reason: collision with root package name */
    public static final Rect f4499i0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f4500A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4501B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f4502C;

    /* renamed from: D, reason: collision with root package name */
    public int f4503D;

    /* renamed from: E, reason: collision with root package name */
    public int f4504E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f4505F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f4506G;

    /* renamed from: H, reason: collision with root package name */
    public final Rect f4507H;

    /* renamed from: I, reason: collision with root package name */
    public final Rect f4508I;
    public A0 J;

    /* renamed from: K, reason: collision with root package name */
    public A0 f4509K;

    /* renamed from: L, reason: collision with root package name */
    public A0 f4510L;

    /* renamed from: M, reason: collision with root package name */
    public A0 f4511M;

    /* renamed from: N, reason: collision with root package name */
    public InterfaceC4694d f4512N;

    /* renamed from: O, reason: collision with root package name */
    public OverScroller f4513O;

    /* renamed from: P, reason: collision with root package name */
    public ViewPropertyAnimator f4514P;

    /* renamed from: Q, reason: collision with root package name */
    public final k f4515Q;

    /* renamed from: R, reason: collision with root package name */
    public final RunnableC4692c f4516R;

    /* renamed from: S, reason: collision with root package name */
    public final RunnableC4692c f4517S;

    /* renamed from: T, reason: collision with root package name */
    public final C0349t f4518T;

    /* renamed from: U, reason: collision with root package name */
    public final C4698f f4519U;

    /* renamed from: n, reason: collision with root package name */
    public int f4520n;

    /* renamed from: u, reason: collision with root package name */
    public int f4521u;

    /* renamed from: v, reason: collision with root package name */
    public ContentFrameLayout f4522v;

    /* renamed from: w, reason: collision with root package name */
    public ActionBarContainer f4523w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC4705i0 f4524x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f4525y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4526z;

    static {
        int i = Build.VERSION.SDK_INT;
        s0 r0Var = i >= 30 ? new r0() : i >= 29 ? new q0() : new p0();
        r0Var.g(e.b(0, 1, 0, 1));
        f4498W = r0Var.b();
        f4499i0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4521u = 0;
        this.f4505F = new Rect();
        this.f4506G = new Rect();
        this.f4507H = new Rect();
        this.f4508I = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        A0 a02 = A0.f2114b;
        this.J = a02;
        this.f4509K = a02;
        this.f4510L = a02;
        this.f4511M = a02;
        this.f4515Q = new k(3, this);
        this.f4516R = new RunnableC4692c(this, 0);
        this.f4517S = new RunnableC4692c(this, 1);
        i(context);
        this.f4518T = new C0349t();
        C4698f c4698f = new C4698f(context);
        c4698f.setWillNotDraw(true);
        this.f4519U = c4698f;
        addView(c4698f);
    }

    public static boolean g(View view, Rect rect, boolean z6) {
        boolean z9;
        C4696e c4696e = (C4696e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c4696e).leftMargin;
        int i4 = rect.left;
        if (i != i4) {
            ((ViewGroup.MarginLayoutParams) c4696e).leftMargin = i4;
            z9 = true;
        } else {
            z9 = false;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c4696e).topMargin;
        int i9 = rect.top;
        if (i6 != i9) {
            ((ViewGroup.MarginLayoutParams) c4696e).topMargin = i9;
            z9 = true;
        }
        int i10 = ((ViewGroup.MarginLayoutParams) c4696e).rightMargin;
        int i11 = rect.right;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) c4696e).rightMargin = i11;
            z9 = true;
        }
        if (z6) {
            int i12 = ((ViewGroup.MarginLayoutParams) c4696e).bottomMargin;
            int i13 = rect.bottom;
            if (i12 != i13) {
                ((ViewGroup.MarginLayoutParams) c4696e).bottomMargin = i13;
                return true;
            }
        }
        return z9;
    }

    @Override // O.r
    public final void a(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // O.InterfaceC0348s
    public final void b(View view, int i, int i4, int i6, int i9, int i10, int[] iArr) {
        c(view, i, i4, i6, i9, i10);
    }

    @Override // O.r
    public final void c(View view, int i, int i4, int i6, int i9, int i10) {
        if (i10 == 0) {
            onNestedScroll(view, i, i4, i6, i9);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4696e;
    }

    @Override // O.r
    public final boolean d(View view, View view2, int i, int i4) {
        return i4 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f4525y != null) {
            if (this.f4523w.getVisibility() == 0) {
                i = (int) (this.f4523w.getTranslationY() + this.f4523w.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f4525y.setBounds(0, i, getWidth(), this.f4525y.getIntrinsicHeight() + i);
            this.f4525y.draw(canvas);
        }
    }

    @Override // O.r
    public final void e(View view, View view2, int i, int i4) {
        if (i4 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // O.r
    public final void f(View view, int i, int i4, int[] iArr, int i6) {
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C4696e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4696e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f4523w;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0349t c0349t = this.f4518T;
        return c0349t.f2222b | c0349t.f2221a;
    }

    public CharSequence getTitle() {
        k();
        return ((Y0) this.f4524x).f39151a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f4516R);
        removeCallbacks(this.f4517S);
        ViewPropertyAnimator viewPropertyAnimator = this.f4514P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f4497V);
        this.f4520n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f4525y = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f4513O = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((Y0) this.f4524x).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((Y0) this.f4524x).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC4705i0 wrapper;
        if (this.f4522v == null) {
            this.f4522v = (ContentFrameLayout) findViewById(C5248R.id.action_bar_activity_content);
            this.f4523w = (ActionBarContainer) findViewById(C5248R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(C5248R.id.action_bar);
            if (findViewById instanceof InterfaceC4705i0) {
                wrapper = (InterfaceC4705i0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f4524x = wrapper;
        }
    }

    public final void l(m mVar, x xVar) {
        k();
        Y0 y02 = (Y0) this.f4524x;
        C4708k c4708k = y02.f39162m;
        Toolbar toolbar = y02.f39151a;
        if (c4708k == null) {
            y02.f39162m = new C4708k(toolbar.getContext());
        }
        C4708k c4708k2 = y02.f39162m;
        c4708k2.f39245x = xVar;
        if (mVar == null && toolbar.f4579n == null) {
            return;
        }
        toolbar.f();
        m mVar2 = toolbar.f4579n.f4527I;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            mVar2.r(toolbar.f4582p0);
            mVar2.r(toolbar.f4583q0);
        }
        if (toolbar.f4583q0 == null) {
            toolbar.f4583q0 = new T0(toolbar);
        }
        c4708k2.J = true;
        if (mVar != null) {
            mVar.b(c4708k2, toolbar.f4555C);
            mVar.b(toolbar.f4583q0, toolbar.f4555C);
        } else {
            c4708k2.h(toolbar.f4555C, null);
            toolbar.f4583q0.h(toolbar.f4555C, null);
            c4708k2.e();
            toolbar.f4583q0.e();
        }
        toolbar.f4579n.setPopupTheme(toolbar.f4556D);
        toolbar.f4579n.setPresenter(c4708k2);
        toolbar.f4582p0 = c4708k2;
        toolbar.w();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        A0 h3 = A0.h(this, windowInsets);
        boolean g9 = g(this.f4523w, new Rect(h3.b(), h3.d(), h3.c(), h3.a()), false);
        WeakHashMap weakHashMap = X.f2142a;
        Rect rect = this.f4505F;
        L.b(this, h3, rect);
        int i = rect.left;
        int i4 = rect.top;
        int i6 = rect.right;
        int i9 = rect.bottom;
        y0 y0Var = h3.f2115a;
        A0 l9 = y0Var.l(i, i4, i6, i9);
        this.J = l9;
        boolean z6 = true;
        if (!this.f4509K.equals(l9)) {
            this.f4509K = this.J;
            g9 = true;
        }
        Rect rect2 = this.f4506G;
        if (rect2.equals(rect)) {
            z6 = g9;
        } else {
            rect2.set(rect);
        }
        if (z6) {
            requestLayout();
        }
        return y0Var.a().f2115a.c().f2115a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = X.f2142a;
        J.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C4696e c4696e = (C4696e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = ((ViewGroup.MarginLayoutParams) c4696e).leftMargin + paddingLeft;
                int i12 = ((ViewGroup.MarginLayoutParams) c4696e).topMargin + paddingTop;
                childAt.layout(i11, i12, measuredWidth + i11, measuredHeight + i12);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i4) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.f4523w, i, 0, i4, 0);
        C4696e c4696e = (C4696e) this.f4523w.getLayoutParams();
        int max = Math.max(0, this.f4523w.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c4696e).leftMargin + ((ViewGroup.MarginLayoutParams) c4696e).rightMargin);
        int max2 = Math.max(0, this.f4523w.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c4696e).topMargin + ((ViewGroup.MarginLayoutParams) c4696e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f4523w.getMeasuredState());
        WeakHashMap weakHashMap = X.f2142a;
        boolean z6 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z6) {
            measuredHeight = this.f4520n;
            if (this.f4500A && this.f4523w.getTabContainer() != null) {
                measuredHeight += this.f4520n;
            }
        } else {
            measuredHeight = this.f4523w.getVisibility() != 8 ? this.f4523w.getMeasuredHeight() : 0;
        }
        Rect rect = this.f4505F;
        Rect rect2 = this.f4507H;
        rect2.set(rect);
        this.f4510L = this.J;
        if (!this.f4526z && !z6) {
            C4698f c4698f = this.f4519U;
            A0 a02 = f4498W;
            Rect rect3 = this.f4508I;
            L.b(c4698f, a02, rect3);
            if (!rect3.equals(f4499i0)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f4510L = this.f4510L.f2115a.l(0, measuredHeight, 0, 0);
                g(this.f4522v, rect2, true);
                if (!this.f4511M.equals(this.f4510L)) {
                    A0 a03 = this.f4510L;
                    this.f4511M = a03;
                    X.b(this.f4522v, a03);
                }
                measureChildWithMargins(this.f4522v, i, 0, i4, 0);
                C4696e c4696e2 = (C4696e) this.f4522v.getLayoutParams();
                int max3 = Math.max(max, this.f4522v.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c4696e2).leftMargin + ((ViewGroup.MarginLayoutParams) c4696e2).rightMargin);
                int max4 = Math.max(max2, this.f4522v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c4696e2).topMargin + ((ViewGroup.MarginLayoutParams) c4696e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f4522v.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i4, combineMeasuredStates2 << 16));
            }
        }
        e b9 = e.b(this.f4510L.b(), this.f4510L.d() + measuredHeight, this.f4510L.c(), this.f4510L.a());
        A0 a04 = this.f4510L;
        int i6 = Build.VERSION.SDK_INT;
        s0 r0Var = i6 >= 30 ? new r0(a04) : i6 >= 29 ? new q0(a04) : new p0(a04);
        r0Var.g(b9);
        this.f4510L = r0Var.b();
        g(this.f4522v, rect2, true);
        if (!this.f4511M.equals(this.f4510L)) {
        }
        measureChildWithMargins(this.f4522v, i, 0, i4, 0);
        C4696e c4696e22 = (C4696e) this.f4522v.getLayoutParams();
        int max32 = Math.max(max, this.f4522v.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c4696e22).leftMargin + ((ViewGroup.MarginLayoutParams) c4696e22).rightMargin);
        int max42 = Math.max(max2, this.f4522v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c4696e22).topMargin + ((ViewGroup.MarginLayoutParams) c4696e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f4522v.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i4, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f9, boolean z6) {
        if (!this.f4501B || !z6) {
            return false;
        }
        this.f4513O.fling(0, 0, 0, (int) f9, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f4513O.getFinalY() > this.f4523w.getHeight()) {
            h();
            this.f4517S.run();
        } else {
            h();
            this.f4516R.run();
        }
        this.f4502C = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f9) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i4, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i4, int i6, int i9) {
        int i10 = this.f4503D + i4;
        this.f4503D = i10;
        setActionBarHideOffset(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        M m9;
        C4634k c4634k;
        this.f4518T.f2221a = i;
        this.f4503D = getActionBarHideOffset();
        h();
        InterfaceC4694d interfaceC4694d = this.f4512N;
        if (interfaceC4694d == null || (c4634k = (m9 = (M) interfaceC4694d).f37885s) == null) {
            return;
        }
        c4634k.a();
        m9.f37885s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f4523w.getVisibility() != 0) {
            return false;
        }
        return this.f4501B;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f4501B || this.f4502C) {
            return;
        }
        if (this.f4503D <= this.f4523w.getHeight()) {
            h();
            postDelayed(this.f4516R, 600L);
        } else {
            h();
            postDelayed(this.f4517S, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i4 = this.f4504E ^ i;
        this.f4504E = i;
        boolean z6 = (i & 4) == 0;
        boolean z9 = (i & 256) != 0;
        InterfaceC4694d interfaceC4694d = this.f4512N;
        if (interfaceC4694d != null) {
            M m9 = (M) interfaceC4694d;
            m9.f37881o = !z9;
            if (z6 || !z9) {
                if (m9.f37882p) {
                    m9.f37882p = false;
                    m9.w(true);
                }
            } else if (!m9.f37882p) {
                m9.f37882p = true;
                m9.w(true);
            }
        }
        if ((i4 & 256) == 0 || this.f4512N == null) {
            return;
        }
        WeakHashMap weakHashMap = X.f2142a;
        J.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f4521u = i;
        InterfaceC4694d interfaceC4694d = this.f4512N;
        if (interfaceC4694d != null) {
            ((M) interfaceC4694d).f37880n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f4523w.setTranslationY(-Math.max(0, Math.min(i, this.f4523w.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC4694d interfaceC4694d) {
        this.f4512N = interfaceC4694d;
        if (getWindowToken() != null) {
            ((M) this.f4512N).f37880n = this.f4521u;
            int i = this.f4504E;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = X.f2142a;
                J.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z6) {
        this.f4500A = z6;
    }

    public void setHideOnContentScrollEnabled(boolean z6) {
        if (z6 != this.f4501B) {
            this.f4501B = z6;
            if (z6) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        Y0 y02 = (Y0) this.f4524x;
        y02.f39154d = i != 0 ? g.h(y02.f39151a.getContext(), i) : null;
        y02.d();
    }

    public void setLogo(int i) {
        k();
        Y0 y02 = (Y0) this.f4524x;
        y02.f39155e = i != 0 ? g.h(y02.f39151a.getContext(), i) : null;
        y02.d();
    }

    public void setOverlayMode(boolean z6) {
        this.f4526z = z6;
    }

    public void setShowingForActionMode(boolean z6) {
    }

    public void setUiOptions(int i) {
    }

    @Override // m.InterfaceC4703h0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((Y0) this.f4524x).f39160k = callback;
    }

    @Override // m.InterfaceC4703h0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        Y0 y02 = (Y0) this.f4524x;
        if (y02.f39157g) {
            return;
        }
        y02.f39158h = charSequence;
        if ((y02.f39152b & 8) != 0) {
            Toolbar toolbar = y02.f39151a;
            toolbar.setTitle(charSequence);
            if (y02.f39157g) {
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
        return new C4696e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        Y0 y02 = (Y0) this.f4524x;
        y02.f39154d = drawable;
        y02.d();
    }
}
