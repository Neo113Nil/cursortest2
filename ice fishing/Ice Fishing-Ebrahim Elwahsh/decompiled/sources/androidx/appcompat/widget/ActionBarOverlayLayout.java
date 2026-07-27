package androidx.appcompat.widget;

import D0.k;
import G.e;
import O.A0;
import O.C0357t;
import O.InterfaceC0356s;
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
import com.bumptech.glide.f;
import com.icefishing.icefishingliveapp.C5284R;
import h.M;
import java.util.WeakHashMap;
import k.C4623k;
import l.l;
import l.w;
import m.C4731e;
import m.C4733f;
import m.C4743k;
import m.InterfaceC4729d;
import m.InterfaceC4738h0;
import m.InterfaceC4740i0;
import m.RunnableC4727c;
import m.T0;
import m.Y0;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC4738h0, r, InterfaceC0356s {

    /* renamed from: V, reason: collision with root package name */
    public static final int[] f4644V = {C5284R.attr.actionBarSize, R.attr.windowContentOverlay};

    /* renamed from: W, reason: collision with root package name */
    public static final A0 f4645W;

    /* renamed from: n0, reason: collision with root package name */
    public static final Rect f4646n0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f4647A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4648B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f4649C;

    /* renamed from: D, reason: collision with root package name */
    public int f4650D;

    /* renamed from: E, reason: collision with root package name */
    public int f4651E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f4652F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f4653G;

    /* renamed from: H, reason: collision with root package name */
    public final Rect f4654H;

    /* renamed from: I, reason: collision with root package name */
    public final Rect f4655I;
    public A0 J;

    /* renamed from: K, reason: collision with root package name */
    public A0 f4656K;

    /* renamed from: L, reason: collision with root package name */
    public A0 f4657L;

    /* renamed from: M, reason: collision with root package name */
    public A0 f4658M;

    /* renamed from: N, reason: collision with root package name */
    public InterfaceC4729d f4659N;

    /* renamed from: O, reason: collision with root package name */
    public OverScroller f4660O;

    /* renamed from: P, reason: collision with root package name */
    public ViewPropertyAnimator f4661P;

    /* renamed from: Q, reason: collision with root package name */
    public final k f4662Q;

    /* renamed from: R, reason: collision with root package name */
    public final RunnableC4727c f4663R;

    /* renamed from: S, reason: collision with root package name */
    public final RunnableC4727c f4664S;

    /* renamed from: T, reason: collision with root package name */
    public final C0357t f4665T;

    /* renamed from: U, reason: collision with root package name */
    public final C4733f f4666U;

    /* renamed from: n, reason: collision with root package name */
    public int f4667n;

    /* renamed from: u, reason: collision with root package name */
    public int f4668u;

    /* renamed from: v, reason: collision with root package name */
    public ContentFrameLayout f4669v;

    /* renamed from: w, reason: collision with root package name */
    public ActionBarContainer f4670w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC4740i0 f4671x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f4672y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4673z;

    static {
        int i = Build.VERSION.SDK_INT;
        s0 r0Var = i >= 30 ? new r0() : i >= 29 ? new q0() : new p0();
        r0Var.g(e.b(0, 1, 0, 1));
        f4645W = r0Var.b();
        f4646n0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4668u = 0;
        this.f4652F = new Rect();
        this.f4653G = new Rect();
        this.f4654H = new Rect();
        this.f4655I = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        A0 a02 = A0.f2212b;
        this.J = a02;
        this.f4656K = a02;
        this.f4657L = a02;
        this.f4658M = a02;
        this.f4662Q = new k(4, this);
        this.f4663R = new RunnableC4727c(this, 0);
        this.f4664S = new RunnableC4727c(this, 1);
        i(context);
        this.f4665T = new C0357t();
        C4733f c4733f = new C4733f(context);
        c4733f.setWillNotDraw(true);
        this.f4666U = c4733f;
        addView(c4733f);
    }

    public static boolean g(View view, Rect rect, boolean z8) {
        boolean z9;
        C4731e c4731e = (C4731e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c4731e).leftMargin;
        int i4 = rect.left;
        if (i != i4) {
            ((ViewGroup.MarginLayoutParams) c4731e).leftMargin = i4;
            z9 = true;
        } else {
            z9 = false;
        }
        int i9 = ((ViewGroup.MarginLayoutParams) c4731e).topMargin;
        int i10 = rect.top;
        if (i9 != i10) {
            ((ViewGroup.MarginLayoutParams) c4731e).topMargin = i10;
            z9 = true;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) c4731e).rightMargin;
        int i12 = rect.right;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) c4731e).rightMargin = i12;
            z9 = true;
        }
        if (z8) {
            int i13 = ((ViewGroup.MarginLayoutParams) c4731e).bottomMargin;
            int i14 = rect.bottom;
            if (i13 != i14) {
                ((ViewGroup.MarginLayoutParams) c4731e).bottomMargin = i14;
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

    @Override // O.InterfaceC0356s
    public final void b(View view, int i, int i4, int i9, int i10, int i11, int[] iArr) {
        c(view, i, i4, i9, i10, i11);
    }

    @Override // O.r
    public final void c(View view, int i, int i4, int i9, int i10, int i11) {
        if (i11 == 0) {
            onNestedScroll(view, i, i4, i9, i10);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4731e;
    }

    @Override // O.r
    public final boolean d(View view, View view2, int i, int i4) {
        return i4 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f4672y != null) {
            if (this.f4670w.getVisibility() == 0) {
                i = (int) (this.f4670w.getTranslationY() + this.f4670w.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f4672y.setBounds(0, i, getWidth(), this.f4672y.getIntrinsicHeight() + i);
            this.f4672y.draw(canvas);
        }
    }

    @Override // O.r
    public final void e(View view, View view2, int i, int i4) {
        if (i4 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // O.r
    public final void f(View view, int i, int i4, int[] iArr, int i9) {
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C4731e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4731e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f4670w;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0357t c0357t = this.f4665T;
        return c0357t.f2320b | c0357t.f2319a;
    }

    public CharSequence getTitle() {
        k();
        return ((Y0) this.f4671x).f39353a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f4663R);
        removeCallbacks(this.f4664S);
        ViewPropertyAnimator viewPropertyAnimator = this.f4661P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f4644V);
        this.f4667n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f4672y = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f4660O = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((Y0) this.f4671x).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((Y0) this.f4671x).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC4740i0 wrapper;
        if (this.f4669v == null) {
            this.f4669v = (ContentFrameLayout) findViewById(C5284R.id.action_bar_activity_content);
            this.f4670w = (ActionBarContainer) findViewById(C5284R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(C5284R.id.action_bar);
            if (findViewById instanceof InterfaceC4740i0) {
                wrapper = (InterfaceC4740i0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f4671x = wrapper;
        }
    }

    public final void l(l lVar, w wVar) {
        k();
        Y0 y02 = (Y0) this.f4671x;
        C4743k c4743k = y02.f39364m;
        Toolbar toolbar = y02.f39353a;
        if (c4743k == null) {
            y02.f39364m = new C4743k(toolbar.getContext());
        }
        C4743k c4743k2 = y02.f39364m;
        c4743k2.f39447x = wVar;
        if (lVar == null && toolbar.f4724n == null) {
            return;
        }
        toolbar.f();
        l lVar2 = toolbar.f4724n.f4674I;
        if (lVar2 == lVar) {
            return;
        }
        if (lVar2 != null) {
            lVar2.r(toolbar.f4733u0);
            lVar2.r(toolbar.f4735v0);
        }
        if (toolbar.f4735v0 == null) {
            toolbar.f4735v0 = new T0(toolbar);
        }
        c4743k2.J = true;
        if (lVar != null) {
            lVar.b(c4743k2, toolbar.f4704C);
            lVar.b(toolbar.f4735v0, toolbar.f4704C);
        } else {
            c4743k2.h(toolbar.f4704C, null);
            toolbar.f4735v0.h(toolbar.f4704C, null);
            c4743k2.d();
            toolbar.f4735v0.d();
        }
        toolbar.f4724n.setPopupTheme(toolbar.f4705D);
        toolbar.f4724n.setPresenter(c4743k2);
        toolbar.f4733u0 = c4743k2;
        toolbar.w();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        A0 h9 = A0.h(this, windowInsets);
        boolean g9 = g(this.f4670w, new Rect(h9.b(), h9.d(), h9.c(), h9.a()), false);
        WeakHashMap weakHashMap = X.f2240a;
        Rect rect = this.f4652F;
        L.b(this, h9, rect);
        int i = rect.left;
        int i4 = rect.top;
        int i9 = rect.right;
        int i10 = rect.bottom;
        y0 y0Var = h9.f2213a;
        A0 l9 = y0Var.l(i, i4, i9, i10);
        this.J = l9;
        boolean z8 = true;
        if (!this.f4656K.equals(l9)) {
            this.f4656K = this.J;
            g9 = true;
        }
        Rect rect2 = this.f4653G;
        if (rect2.equals(rect)) {
            z8 = g9;
        } else {
            rect2.set(rect);
        }
        if (z8) {
            requestLayout();
        }
        return y0Var.a().f2213a.c().f2213a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = X.f2240a;
        J.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C4731e c4731e = (C4731e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = ((ViewGroup.MarginLayoutParams) c4731e).leftMargin + paddingLeft;
                int i13 = ((ViewGroup.MarginLayoutParams) c4731e).topMargin + paddingTop;
                childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
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
        measureChildWithMargins(this.f4670w, i, 0, i4, 0);
        C4731e c4731e = (C4731e) this.f4670w.getLayoutParams();
        int max = Math.max(0, this.f4670w.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c4731e).leftMargin + ((ViewGroup.MarginLayoutParams) c4731e).rightMargin);
        int max2 = Math.max(0, this.f4670w.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c4731e).topMargin + ((ViewGroup.MarginLayoutParams) c4731e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f4670w.getMeasuredState());
        WeakHashMap weakHashMap = X.f2240a;
        boolean z8 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z8) {
            measuredHeight = this.f4667n;
            if (this.f4647A && this.f4670w.getTabContainer() != null) {
                measuredHeight += this.f4667n;
            }
        } else {
            measuredHeight = this.f4670w.getVisibility() != 8 ? this.f4670w.getMeasuredHeight() : 0;
        }
        Rect rect = this.f4652F;
        Rect rect2 = this.f4654H;
        rect2.set(rect);
        this.f4657L = this.J;
        if (!this.f4673z && !z8) {
            C4733f c4733f = this.f4666U;
            A0 a02 = f4645W;
            Rect rect3 = this.f4655I;
            L.b(c4733f, a02, rect3);
            if (!rect3.equals(f4646n0)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f4657L = this.f4657L.f2213a.l(0, measuredHeight, 0, 0);
                g(this.f4669v, rect2, true);
                if (!this.f4658M.equals(this.f4657L)) {
                    A0 a03 = this.f4657L;
                    this.f4658M = a03;
                    X.b(this.f4669v, a03);
                }
                measureChildWithMargins(this.f4669v, i, 0, i4, 0);
                C4731e c4731e2 = (C4731e) this.f4669v.getLayoutParams();
                int max3 = Math.max(max, this.f4669v.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c4731e2).leftMargin + ((ViewGroup.MarginLayoutParams) c4731e2).rightMargin);
                int max4 = Math.max(max2, this.f4669v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c4731e2).topMargin + ((ViewGroup.MarginLayoutParams) c4731e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f4669v.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i4, combineMeasuredStates2 << 16));
            }
        }
        e b9 = e.b(this.f4657L.b(), this.f4657L.d() + measuredHeight, this.f4657L.c(), this.f4657L.a());
        A0 a04 = this.f4657L;
        int i9 = Build.VERSION.SDK_INT;
        s0 r0Var = i9 >= 30 ? new r0(a04) : i9 >= 29 ? new q0(a04) : new p0(a04);
        r0Var.g(b9);
        this.f4657L = r0Var.b();
        g(this.f4669v, rect2, true);
        if (!this.f4658M.equals(this.f4657L)) {
        }
        measureChildWithMargins(this.f4669v, i, 0, i4, 0);
        C4731e c4731e22 = (C4731e) this.f4669v.getLayoutParams();
        int max32 = Math.max(max, this.f4669v.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c4731e22).leftMargin + ((ViewGroup.MarginLayoutParams) c4731e22).rightMargin);
        int max42 = Math.max(max2, this.f4669v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c4731e22).topMargin + ((ViewGroup.MarginLayoutParams) c4731e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f4669v.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i4, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f9, boolean z8) {
        if (!this.f4648B || !z8) {
            return false;
        }
        this.f4660O.fling(0, 0, 0, (int) f9, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f4660O.getFinalY() > this.f4670w.getHeight()) {
            h();
            this.f4664S.run();
        } else {
            h();
            this.f4663R.run();
        }
        this.f4649C = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f9) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i4, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i4, int i9, int i10) {
        int i11 = this.f4650D + i4;
        this.f4650D = i11;
        setActionBarHideOffset(i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        M m8;
        C4623k c4623k;
        this.f4665T.f2319a = i;
        this.f4650D = getActionBarHideOffset();
        h();
        InterfaceC4729d interfaceC4729d = this.f4659N;
        if (interfaceC4729d == null || (c4623k = (m8 = (M) interfaceC4729d).f38072s) == null) {
            return;
        }
        c4623k.a();
        m8.f38072s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f4670w.getVisibility() != 0) {
            return false;
        }
        return this.f4648B;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f4648B || this.f4649C) {
            return;
        }
        if (this.f4650D <= this.f4670w.getHeight()) {
            h();
            postDelayed(this.f4663R, 600L);
        } else {
            h();
            postDelayed(this.f4664S, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i4 = this.f4651E ^ i;
        this.f4651E = i;
        boolean z8 = (i & 4) == 0;
        boolean z9 = (i & 256) != 0;
        InterfaceC4729d interfaceC4729d = this.f4659N;
        if (interfaceC4729d != null) {
            M m8 = (M) interfaceC4729d;
            m8.f38068o = !z9;
            if (z8 || !z9) {
                if (m8.f38069p) {
                    m8.f38069p = false;
                    m8.w(true);
                }
            } else if (!m8.f38069p) {
                m8.f38069p = true;
                m8.w(true);
            }
        }
        if ((i4 & 256) == 0 || this.f4659N == null) {
            return;
        }
        WeakHashMap weakHashMap = X.f2240a;
        J.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f4668u = i;
        InterfaceC4729d interfaceC4729d = this.f4659N;
        if (interfaceC4729d != null) {
            ((M) interfaceC4729d).f38067n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f4670w.setTranslationY(-Math.max(0, Math.min(i, this.f4670w.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC4729d interfaceC4729d) {
        this.f4659N = interfaceC4729d;
        if (getWindowToken() != null) {
            ((M) this.f4659N).f38067n = this.f4668u;
            int i = this.f4651E;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = X.f2240a;
                J.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z8) {
        this.f4647A = z8;
    }

    public void setHideOnContentScrollEnabled(boolean z8) {
        if (z8 != this.f4648B) {
            this.f4648B = z8;
            if (z8) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        Y0 y02 = (Y0) this.f4671x;
        y02.f39356d = i != 0 ? f.h(y02.f39353a.getContext(), i) : null;
        y02.d();
    }

    public void setLogo(int i) {
        k();
        Y0 y02 = (Y0) this.f4671x;
        y02.f39357e = i != 0 ? f.h(y02.f39353a.getContext(), i) : null;
        y02.d();
    }

    public void setOverlayMode(boolean z8) {
        this.f4673z = z8;
    }

    public void setShowingForActionMode(boolean z8) {
    }

    public void setUiOptions(int i) {
    }

    @Override // m.InterfaceC4738h0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((Y0) this.f4671x).f39362k = callback;
    }

    @Override // m.InterfaceC4738h0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        Y0 y02 = (Y0) this.f4671x;
        if (y02.f39359g) {
            return;
        }
        y02.f39360h = charSequence;
        if ((y02.f39354b & 8) != 0) {
            Toolbar toolbar = y02.f39353a;
            toolbar.setTitle(charSequence);
            if (y02.f39359g) {
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
        return new C4731e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        Y0 y02 = (Y0) this.f4671x;
        y02.f39356d = drawable;
        y02.d();
    }
}
