package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import h3.a1;
import h3.e;
import h3.f;
import h3.g;
import h3.j0;
import h3.l0;
import h3.m0;
import h3.n0;
import h3.o;
import h3.o0;
import h3.p0;
import h3.q;
import h3.u;
import h3.w;
import h3.x0;
import java.lang.reflect.Field;
import m.b0;
import m.d;
import m.s1;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements e, f {
    public static final int[] E = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public final m.b A;
    public final m.c B;
    public final m.c C;
    public final g D;

    /* renamed from: g, reason: collision with root package name */
    public int f402g;

    /* renamed from: h, reason: collision with root package name */
    public ContentFrameLayout f403h;

    /* renamed from: i, reason: collision with root package name */
    public ActionBarContainer f404i;

    /* renamed from: j, reason: collision with root package name */
    public b0 f405j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f406k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f407l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f408m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f409n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f410o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f411p;

    /* renamed from: q, reason: collision with root package name */
    public int f412q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f413r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f414s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f415t;

    /* renamed from: u, reason: collision with root package name */
    public a1 f416u;

    /* renamed from: v, reason: collision with root package name */
    public a1 f417v;

    /* renamed from: w, reason: collision with root package name */
    public a1 f418w;

    /* renamed from: x, reason: collision with root package name */
    public a1 f419x;

    /* renamed from: y, reason: collision with root package name */
    public OverScroller f420y;

    /* renamed from: z, reason: collision with root package name */
    public ViewPropertyAnimator f421z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f413r = new Rect();
        this.f414s = new Rect();
        this.f415t = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        a1 a1Var = a1.f2744b;
        this.f416u = a1Var;
        this.f417v = a1Var;
        this.f418w = a1Var;
        this.f419x = a1Var;
        this.A = new m.b(this);
        this.B = new m.c(this, 0);
        this.C = new m.c(this, 1);
        i(context);
        this.D = new g();
    }

    public static boolean g(View view, Rect rect, boolean z10) {
        boolean z11;
        m.e eVar = (m.e) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    @Override // h3.e
    public final void a(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // h3.e
    public final void b(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // h3.f
    public final void c(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        e(nestedScrollView, i10, i11, i12, i13, i14);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof m.e;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f406k == null || this.f407l) {
            return;
        }
        if (this.f404i.getVisibility() == 0) {
            i10 = (int) (this.f404i.getTranslationY() + this.f404i.getBottom() + 0.5f);
        } else {
            i10 = 0;
        }
        this.f406k.setBounds(0, i10, getWidth(), this.f406k.getIntrinsicHeight() + i10);
        this.f406k.draw(canvas);
    }

    @Override // h3.e
    public final void e(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(nestedScrollView, i10, i11, i12, i13);
        }
    }

    @Override // h3.e
    public final boolean f(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new m.e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new m.e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f404i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        g gVar = this.D;
        return gVar.f2779b | gVar.f2778a;
    }

    public CharSequence getTitle() {
        j();
        return ((s1) this.f405j).f4439a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.B);
        removeCallbacks(this.C);
        ViewPropertyAnimator viewPropertyAnimator = this.f421z;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(E);
        this.f402g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f406k = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f407l = context.getApplicationInfo().targetSdkVersion < 19;
        this.f420y = new OverScroller(context);
    }

    public final void j() {
        b0 wrapper;
        if (this.f403h == null) {
            this.f403h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f404i = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof b0) {
                wrapper = (b0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f405j = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        a1 c3 = a1.c(this, windowInsets);
        x0 x0Var = c3.f2745a;
        boolean g8 = g(this.f404i, new Rect(x0Var.k().f194a, x0Var.k().f195b, x0Var.k().f196c, x0Var.k().f197d), false);
        Field field = w.f2829a;
        Rect rect = this.f413r;
        q.b(this, c3, rect);
        a1 m10 = x0Var.m(rect.left, rect.top, rect.right, rect.bottom);
        this.f416u = m10;
        boolean z10 = true;
        if (!this.f417v.equals(m10)) {
            this.f417v = this.f416u;
            g8 = true;
        }
        Rect rect2 = this.f414s;
        if (rect2.equals(rect)) {
            z10 = g8;
        } else {
            rect2.set(rect);
        }
        if (z10) {
            requestLayout();
        }
        return x0Var.a().f2745a.c().f2745a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = w.f2829a;
        o.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                m.e eVar = (m.e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        j();
        measureChildWithMargins(this.f404i, i10, 0, i11, 0);
        m.e eVar = (m.e) this.f404i.getLayoutParams();
        int max = Math.max(0, this.f404i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f404i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f404i.getMeasuredState());
        Field field = w.f2829a;
        boolean z10 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z10) {
            measuredHeight = this.f402g;
            if (this.f409n && this.f404i.getTabContainer() != null) {
                measuredHeight += this.f402g;
            }
        } else {
            measuredHeight = this.f404i.getVisibility() != 8 ? this.f404i.getMeasuredHeight() : 0;
        }
        Rect rect = this.f413r;
        Rect rect2 = this.f415t;
        rect2.set(rect);
        a1 a1Var = this.f416u;
        this.f418w = a1Var;
        if (this.f408m || z10) {
            a3.b b2 = a3.b.b(a1Var.f2745a.k().f194a, this.f418w.f2745a.k().f195b + measuredHeight, this.f418w.f2745a.k().f196c, this.f418w.f2745a.k().f197d);
            a1 a1Var2 = this.f418w;
            int i12 = Build.VERSION.SDK_INT;
            p0 o0Var = i12 >= 34 ? new o0(a1Var2) : i12 >= 31 ? new n0(a1Var2) : i12 >= 30 ? new m0(a1Var2) : i12 >= 29 ? new l0(a1Var2) : new j0(a1Var2);
            o0Var.g(b2);
            this.f418w = o0Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f418w = a1Var.f2745a.m(0, measuredHeight, 0, 0);
        }
        g(this.f403h, rect2, true);
        if (!this.f419x.equals(this.f418w)) {
            a1 a1Var3 = this.f418w;
            this.f419x = a1Var3;
            ContentFrameLayout contentFrameLayout = this.f403h;
            int i13 = Build.VERSION.SDK_INT;
            WindowInsets b10 = a1Var3.b();
            if (b10 != null) {
                WindowInsets a6 = i13 >= 30 ? u.a(contentFrameLayout, b10) : o.a(contentFrameLayout, b10);
                if (!a6.equals(b10)) {
                    a1.c(contentFrameLayout, a6);
                }
            }
        }
        measureChildWithMargins(this.f403h, i10, 0, i11, 0);
        m.e eVar2 = (m.e) this.f403h.getLayoutParams();
        int max3 = Math.max(max, this.f403h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f403h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f403h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f410o || !z10) {
            return false;
        }
        this.f420y.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f420y.getFinalY() > this.f404i.getHeight()) {
            h();
            this.C.run();
        } else {
            h();
            this.B.run();
        }
        this.f411p = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f412q + i11;
        this.f412q = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.D.f2778a = i10;
        this.f412q = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f404i.getVisibility() != 0) {
            return false;
        }
        return this.f410o;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f410o || this.f411p) {
            return;
        }
        if (this.f412q <= this.f404i.getHeight()) {
            h();
            postDelayed(this.B, 600L);
        } else {
            h();
            postDelayed(this.C, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public void setActionBarHideOffset(int i10) {
        h();
        this.f404i.setTranslationY(-Math.max(0, Math.min(i10, this.f404i.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f409n = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f410o) {
            this.f410o = z10;
            if (z10) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        j();
        s1 s1Var = (s1) this.f405j;
        s1Var.f4442d = i10 != 0 ? j.a.a(s1Var.f4439a.getContext(), i10) : null;
        s1Var.c();
    }

    public void setLogo(int i10) {
        j();
        s1 s1Var = (s1) this.f405j;
        s1Var.f4443e = i10 != 0 ? j.a.a(s1Var.f4439a.getContext(), i10) : null;
        s1Var.c();
    }

    public void setOverlayMode(boolean z10) {
        this.f408m = z10;
        this.f407l = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((s1) this.f405j).f4449k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        s1 s1Var = (s1) this.f405j;
        if (s1Var.f4445g) {
            return;
        }
        s1Var.f4446h = charSequence;
        if ((s1Var.f4440b & 8) != 0) {
            s1Var.f4439a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new m.e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        s1 s1Var = (s1) this.f405j;
        s1Var.f4442d = drawable;
        s1Var.c();
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // h3.e
    public final void d(int i10, int i11, int[] iArr, int i12) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }
}
