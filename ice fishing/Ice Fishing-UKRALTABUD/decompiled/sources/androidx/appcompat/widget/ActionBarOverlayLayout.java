package androidx.appcompat.widget;

import L.C0063n;
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
import com.icedrifter.arcticquest.R;
import d.AbstractC0110a;
import h.C0158b;
import h.C0161e;
import h.InterfaceC0160d;
import h.InterfaceC0179x;
import h.RunnableC0159c;
import h.q0;
import h.w0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import w.AbstractC0282n;
import w.InterfaceC0276h;
import w.InterfaceC0277i;
import w.x;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0276h, InterfaceC0277i {

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f1126D = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public final RunnableC0159c f1127A;

    /* renamed from: B, reason: collision with root package name */
    public final RunnableC0159c f1128B;

    /* renamed from: C, reason: collision with root package name */
    public final C0063n f1129C;

    /* renamed from: f, reason: collision with root package name */
    public int f1130f;

    /* renamed from: g, reason: collision with root package name */
    public ContentFrameLayout f1131g;

    /* renamed from: h, reason: collision with root package name */
    public ActionBarContainer f1132h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0179x f1133i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1134j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1135k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1136l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1137m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1138n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1139o;

    /* renamed from: p, reason: collision with root package name */
    public int f1140p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f1141q;
    public final Rect r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f1142s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f1143t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f1144u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f1145v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f1146w;

    /* renamed from: x, reason: collision with root package name */
    public OverScroller f1147x;

    /* renamed from: y, reason: collision with root package name */
    public ViewPropertyAnimator f1148y;

    /* renamed from: z, reason: collision with root package name */
    public final C0158b f1149z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1141q = new Rect();
        this.r = new Rect();
        this.f1142s = new Rect();
        this.f1143t = new Rect();
        this.f1144u = new Rect();
        this.f1145v = new Rect();
        this.f1146w = new Rect();
        this.f1149z = new C0158b(this);
        this.f1127A = new RunnableC0159c(this, 0);
        this.f1128B = new RunnableC0159c(this, 1);
        i(context);
        this.f1129C = new C0063n(2);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0161e c0161e = (C0161e) view.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) c0161e).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) c0161e).leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = ((ViewGroup.MarginLayoutParams) c0161e).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) c0161e).topMargin = i5;
            z3 = true;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c0161e).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c0161e).rightMargin = i7;
            z3 = true;
        }
        if (z2) {
            int i8 = ((ViewGroup.MarginLayoutParams) c0161e).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) c0161e).bottomMargin = i9;
                return true;
            }
        }
        return z3;
    }

    @Override // w.InterfaceC0276h
    public final void b(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // w.InterfaceC0276h
    public final void c(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(viewGroup, i2, i3, i4, i5);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0161e;
    }

    @Override // w.InterfaceC0276h
    public final void d(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f1134j == null || this.f1135k) {
            return;
        }
        if (this.f1132h.getVisibility() == 0) {
            i2 = (int) (this.f1132h.getTranslationY() + this.f1132h.getBottom() + 0.5f);
        } else {
            i2 = 0;
        }
        this.f1134j.setBounds(0, i2, getWidth(), this.f1134j.getIntrinsicHeight() + i2);
        this.f1134j.draw(canvas);
    }

    @Override // w.InterfaceC0277i
    public final void e(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c(viewGroup, i2, i3, i4, i5, i6);
    }

    @Override // w.InterfaceC0276h
    public final boolean f(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        j();
        Field field = x.f3069a;
        getWindowSystemUiVisibility();
        boolean g2 = g(this.f1132h, rect, false);
        Rect rect2 = this.f1143t;
        rect2.set(rect);
        Method method = w0.f2310a;
        Rect rect3 = this.f1141q;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
        Rect rect4 = this.f1144u;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            g2 = true;
        }
        Rect rect5 = this.r;
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
        return new C0161e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0161e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1132h;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0063n c0063n = this.f1129C;
        return c0063n.f661c | c0063n.f660b;
    }

    public CharSequence getTitle() {
        j();
        return ((q0) this.f1133i).f2244a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1127A);
        removeCallbacks(this.f1128B);
        ViewPropertyAnimator viewPropertyAnimator = this.f1148y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1126D);
        this.f1130f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1134j = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1135k = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1147x = new OverScroller(context);
    }

    public final void j() {
        InterfaceC0179x wrapper;
        if (this.f1131g == null) {
            this.f1131g = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1132h = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0179x) {
                wrapper = (InterfaceC0179x) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1133i = wrapper;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = x.f3069a;
        AbstractC0282n.c(this);
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
                C0161e c0161e = (C0161e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) c0161e).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) c0161e).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        j();
        measureChildWithMargins(this.f1132h, i2, 0, i3, 0);
        C0161e c0161e = (C0161e) this.f1132h.getLayoutParams();
        int i4 = 0;
        int max = Math.max(0, this.f1132h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0161e).leftMargin + ((ViewGroup.MarginLayoutParams) c0161e).rightMargin);
        int max2 = Math.max(0, this.f1132h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0161e).topMargin + ((ViewGroup.MarginLayoutParams) c0161e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1132h.getMeasuredState());
        Field field = x.f3069a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            i4 = this.f1130f;
            if (this.f1137m && this.f1132h.getTabContainer() != null) {
                i4 += this.f1130f;
            }
        } else if (this.f1132h.getVisibility() != 8) {
            i4 = this.f1132h.getMeasuredHeight();
        }
        Rect rect = this.f1141q;
        Rect rect2 = this.f1142s;
        rect2.set(rect);
        Rect rect3 = this.f1145v;
        rect3.set(this.f1143t);
        if (this.f1136l || z2) {
            rect3.top += i4;
            rect3.bottom = rect3.bottom;
        } else {
            rect2.top += i4;
            rect2.bottom = rect2.bottom;
        }
        g(this.f1131g, rect2, true);
        Rect rect4 = this.f1146w;
        if (!rect4.equals(rect3)) {
            rect4.set(rect3);
            this.f1131g.a(rect3);
        }
        measureChildWithMargins(this.f1131g, i2, 0, i3, 0);
        C0161e c0161e2 = (C0161e) this.f1131g.getLayoutParams();
        int max3 = Math.max(max, this.f1131g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0161e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0161e2).rightMargin);
        int max4 = Math.max(max2, this.f1131g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0161e2).topMargin + ((ViewGroup.MarginLayoutParams) c0161e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1131g.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f1138n || !z2) {
            return false;
        }
        this.f1147x.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1147x.getFinalY() > this.f1132h.getHeight()) {
            h();
            this.f1128B.run();
        } else {
            h();
            this.f1127A.run();
        }
        this.f1139o = true;
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
        int i6 = this.f1140p + i3;
        this.f1140p = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f1129C.f660b = i2;
        this.f1140p = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f1132h.getVisibility() != 0) {
            return false;
        }
        return this.f1138n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1138n || this.f1139o) {
            return;
        }
        if (this.f1140p <= this.f1132h.getHeight()) {
            h();
            postDelayed(this.f1127A, 600L);
        } else {
            h();
            postDelayed(this.f1128B, 600L);
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
        this.f1132h.setTranslationY(-Math.max(0, Math.min(i2, this.f1132h.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0160d interfaceC0160d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f1137m = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f1138n) {
            this.f1138n = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        j();
        q0 q0Var = (q0) this.f1133i;
        q0Var.f2247d = i2 != 0 ? AbstractC0110a.a(q0Var.f2244a.getContext(), i2) : null;
        q0Var.c();
    }

    public void setLogo(int i2) {
        j();
        q0 q0Var = (q0) this.f1133i;
        q0Var.f2248e = i2 != 0 ? AbstractC0110a.a(q0Var.f2244a.getContext(), i2) : null;
        q0Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1136l = z2;
        this.f1135k = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((q0) this.f1133i).f2254k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        q0 q0Var = (q0) this.f1133i;
        if (q0Var.f2250g) {
            return;
        }
        q0Var.f2251h = charSequence;
        if ((q0Var.f2245b & 8) != 0) {
            q0Var.f2244a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0161e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        q0 q0Var = (q0) this.f1133i;
        q0Var.f2247d = drawable;
        q0Var.c();
    }

    @Override // w.InterfaceC0276h
    public final void a(int i2, int i3, int[] iArr, int i4) {
    }
}
