package androidx.appcompat.widget;

import P.C0064m;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.watchfacestudio.spraktum.R;
import d.AbstractC0142a;
import h.C0206b;
import h.C0209e;
import h.InterfaceC0208d;
import h.InterfaceC0226w;
import h.RunnableC0207c;
import h.n0;
import h.t0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import y.AbstractC1081n;
import y.InterfaceC1075h;
import y.InterfaceC1076i;
import y.x;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1075h, InterfaceC1076i {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2089y = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: a, reason: collision with root package name */
    public int f2090a;

    /* renamed from: b, reason: collision with root package name */
    public ContentFrameLayout f2091b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarContainer f2092c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0226w f2093d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f2094e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2095f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2096g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2097h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2098i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2099j;

    /* renamed from: k, reason: collision with root package name */
    public int f2100k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f2101l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f2102m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f2103n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f2104o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f2105p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f2106q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f2107r;

    /* renamed from: s, reason: collision with root package name */
    public OverScroller f2108s;
    public ViewPropertyAnimator t;

    /* renamed from: u, reason: collision with root package name */
    public final C0206b f2109u;

    /* renamed from: v, reason: collision with root package name */
    public final RunnableC0207c f2110v;

    /* renamed from: w, reason: collision with root package name */
    public final RunnableC0207c f2111w;

    /* renamed from: x, reason: collision with root package name */
    public final C0064m f2112x;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2101l = new Rect();
        this.f2102m = new Rect();
        this.f2103n = new Rect();
        this.f2104o = new Rect();
        this.f2105p = new Rect();
        this.f2106q = new Rect();
        this.f2107r = new Rect();
        this.f2109u = new C0206b(this);
        this.f2110v = new RunnableC0207c(this, 0);
        this.f2111w = new RunnableC0207c(this, 1);
        i(context);
        this.f2112x = new C0064m(2);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0209e c0209e = (C0209e) view.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) c0209e).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) c0209e).leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = ((ViewGroup.MarginLayoutParams) c0209e).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) c0209e).topMargin = i5;
            z3 = true;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c0209e).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c0209e).rightMargin = i7;
            z3 = true;
        }
        if (z2) {
            int i8 = ((ViewGroup.MarginLayoutParams) c0209e).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) c0209e).bottomMargin = i9;
                return true;
            }
        }
        return z3;
    }

    @Override // y.InterfaceC1075h
    public final void a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // y.InterfaceC1075h
    public final void b(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(viewGroup, i2, i3, i4, i5);
        }
    }

    @Override // y.InterfaceC1075h
    public final void c(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0209e;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f2094e == null || this.f2095f) {
            return;
        }
        if (this.f2092c.getVisibility() == 0) {
            i2 = (int) (this.f2092c.getTranslationY() + this.f2092c.getBottom() + 0.5f);
        } else {
            i2 = 0;
        }
        this.f2094e.setBounds(0, i2, getWidth(), this.f2094e.getIntrinsicHeight() + i2);
        this.f2094e.draw(canvas);
    }

    @Override // y.InterfaceC1076i
    public final void e(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        b(viewGroup, i2, i3, i4, i5, i6);
    }

    @Override // y.InterfaceC1075h
    public final boolean f(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        j();
        Field field = x.f8596a;
        getWindowSystemUiVisibility();
        boolean g2 = g(this.f2092c, rect, false);
        Rect rect2 = this.f2104o;
        rect2.set(rect);
        Method method = t0.f3355a;
        Rect rect3 = this.f2101l;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
        Rect rect4 = this.f2105p;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            g2 = true;
        }
        Rect rect5 = this.f2102m;
        if (!rect5.equals(rect3)) {
            rect5.set(rect3);
            g2 = true;
        }
        if (g2) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0209e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0209e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2092c;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0064m c0064m = this.f2112x;
        return c0064m.f1356c | c0064m.f1355b;
    }

    public CharSequence getTitle() {
        j();
        return ((n0) this.f2093d).f3297a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f2110v);
        removeCallbacks(this.f2111w);
        ViewPropertyAnimator viewPropertyAnimator = this.t;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2089y);
        this.f2090a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f2094e = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f2095f = context.getApplicationInfo().targetSdkVersion < 19;
        this.f2108s = new OverScroller(context);
    }

    public final void j() {
        InterfaceC0226w wrapper;
        if (this.f2091b == null) {
            this.f2091b = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f2092c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0226w) {
                wrapper = (InterfaceC0226w) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f2093d = wrapper;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = x.f8596a;
        AbstractC1081n.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0209e c0209e = (C0209e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) c0209e).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) c0209e).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        j();
        measureChildWithMargins(this.f2092c, i2, 0, i3, 0);
        C0209e c0209e = (C0209e) this.f2092c.getLayoutParams();
        int i4 = 0;
        int max = Math.max(0, this.f2092c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0209e).leftMargin + ((ViewGroup.MarginLayoutParams) c0209e).rightMargin);
        int max2 = Math.max(0, this.f2092c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0209e).topMargin + ((ViewGroup.MarginLayoutParams) c0209e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f2092c.getMeasuredState());
        Field field = x.f8596a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            i4 = this.f2090a;
            if (this.f2097h && this.f2092c.getTabContainer() != null) {
                i4 += this.f2090a;
            }
        } else if (this.f2092c.getVisibility() != 8) {
            i4 = this.f2092c.getMeasuredHeight();
        }
        Rect rect = this.f2101l;
        Rect rect2 = this.f2103n;
        rect2.set(rect);
        Rect rect3 = this.f2106q;
        rect3.set(this.f2104o);
        if (this.f2096g || z2) {
            rect3.top += i4;
            rect3.bottom = rect3.bottom;
        } else {
            rect2.top += i4;
            rect2.bottom = rect2.bottom;
        }
        g(this.f2091b, rect2, true);
        Rect rect4 = this.f2107r;
        if (!rect4.equals(rect3)) {
            rect4.set(rect3);
            this.f2091b.a(rect3);
        }
        measureChildWithMargins(this.f2091b, i2, 0, i3, 0);
        C0209e c0209e2 = (C0209e) this.f2091b.getLayoutParams();
        int max3 = Math.max(max, this.f2091b.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0209e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0209e2).rightMargin);
        int max4 = Math.max(max2, this.f2091b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0209e2).topMargin + ((ViewGroup.MarginLayoutParams) c0209e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f2091b.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f2098i || !z2) {
            return false;
        }
        this.f2108s.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f2108s.getFinalY() > this.f2092c.getHeight()) {
            h();
            this.f2111w.run();
        } else {
            h();
            this.f2110v.run();
        }
        this.f2099j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f2100k + i3;
        this.f2100k = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f2112x.f1355b = i2;
        this.f2100k = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f2092c.getVisibility() != 0) {
            return false;
        }
        return this.f2098i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f2098i || this.f2099j) {
            return;
        }
        if (this.f2100k <= this.f2092c.getHeight()) {
            h();
            postDelayed(this.f2110v, 600L);
        } else {
            h();
            postDelayed(this.f2111w, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.f2092c.setTranslationY(-Math.max(0, Math.min(i2, this.f2092c.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0208d interfaceC0208d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f2097h = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f2098i) {
            this.f2098i = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        j();
        n0 n0Var = (n0) this.f2093d;
        n0Var.f3300d = i2 != 0 ? AbstractC0142a.a(n0Var.f3297a.getContext(), i2) : null;
        n0Var.c();
    }

    public void setLogo(int i2) {
        j();
        n0 n0Var = (n0) this.f2093d;
        n0Var.f3301e = i2 != 0 ? AbstractC0142a.a(n0Var.f3297a.getContext(), i2) : null;
        n0Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f2096g = z2;
        this.f2095f = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((n0) this.f2093d).f3307k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        n0 n0Var = (n0) this.f2093d;
        if (n0Var.f3303g) {
            return;
        }
        n0Var.f3304h = charSequence;
        if ((n0Var.f3298b & 8) != 0) {
            n0Var.f3297a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0209e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        n0 n0Var = (n0) this.f2093d;
        n0Var.f3300d = drawable;
        n0Var.c();
    }

    @Override // y.InterfaceC1075h
    public final void d(int i2, int i3, int[] iArr, int i4) {
    }
}
