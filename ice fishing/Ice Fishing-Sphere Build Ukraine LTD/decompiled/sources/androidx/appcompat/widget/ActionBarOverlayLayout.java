package androidx.appcompat.widget;

import L.C0038n;
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
import com.icecatchbiger.hookfrostmaster.R;
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
import w.AbstractC0276n;
import w.InterfaceC0270h;
import w.InterfaceC0271i;
import w.x;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0270h, InterfaceC0271i {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1134C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public final RunnableC0159c f1135A;

    /* renamed from: B, reason: collision with root package name */
    public final C0038n f1136B;

    /* renamed from: e, reason: collision with root package name */
    public int f1137e;

    /* renamed from: f, reason: collision with root package name */
    public ContentFrameLayout f1138f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarContainer f1139g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0179x f1140h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f1141i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1142j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1143k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1144l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1145m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1146n;

    /* renamed from: o, reason: collision with root package name */
    public int f1147o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1148p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f1149q;
    public final Rect r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f1150s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f1151t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f1152u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f1153v;

    /* renamed from: w, reason: collision with root package name */
    public OverScroller f1154w;

    /* renamed from: x, reason: collision with root package name */
    public ViewPropertyAnimator f1155x;

    /* renamed from: y, reason: collision with root package name */
    public final C0158b f1156y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0159c f1157z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1148p = new Rect();
        this.f1149q = new Rect();
        this.r = new Rect();
        this.f1150s = new Rect();
        this.f1151t = new Rect();
        this.f1152u = new Rect();
        this.f1153v = new Rect();
        this.f1156y = new C0158b(this);
        this.f1157z = new RunnableC0159c(this, 0);
        this.f1135A = new RunnableC0159c(this, 1);
        i(context);
        this.f1136B = new C0038n(2);
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

    @Override // w.InterfaceC0270h
    public final void b(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // w.InterfaceC0270h
    public final void c(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(viewGroup, i2, i3, i4, i5);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0161e;
    }

    @Override // w.InterfaceC0270h
    public final void d(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f1141i == null || this.f1142j) {
            return;
        }
        if (this.f1139g.getVisibility() == 0) {
            i2 = (int) (this.f1139g.getTranslationY() + this.f1139g.getBottom() + 0.5f);
        } else {
            i2 = 0;
        }
        this.f1141i.setBounds(0, i2, getWidth(), this.f1141i.getIntrinsicHeight() + i2);
        this.f1141i.draw(canvas);
    }

    @Override // w.InterfaceC0271i
    public final void e(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c(viewGroup, i2, i3, i4, i5, i6);
    }

    @Override // w.InterfaceC0270h
    public final boolean f(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        j();
        Field field = x.f3074a;
        getWindowSystemUiVisibility();
        boolean g2 = g(this.f1139g, rect, false);
        Rect rect2 = this.f1150s;
        rect2.set(rect);
        Method method = w0.f2318a;
        Rect rect3 = this.f1148p;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
        Rect rect4 = this.f1151t;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            g2 = true;
        }
        Rect rect5 = this.f1149q;
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
        ActionBarContainer actionBarContainer = this.f1139g;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0038n c0038n = this.f1136B;
        return c0038n.f583c | c0038n.f582b;
    }

    public CharSequence getTitle() {
        j();
        return ((q0) this.f1140h).f2252a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1157z);
        removeCallbacks(this.f1135A);
        ViewPropertyAnimator viewPropertyAnimator = this.f1155x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1134C);
        this.f1137e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1141i = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1142j = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1154w = new OverScroller(context);
    }

    public final void j() {
        InterfaceC0179x wrapper;
        if (this.f1138f == null) {
            this.f1138f = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1139g = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0179x) {
                wrapper = (InterfaceC0179x) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1140h = wrapper;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = x.f3074a;
        AbstractC0276n.c(this);
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
        measureChildWithMargins(this.f1139g, i2, 0, i3, 0);
        C0161e c0161e = (C0161e) this.f1139g.getLayoutParams();
        int i4 = 0;
        int max = Math.max(0, this.f1139g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0161e).leftMargin + ((ViewGroup.MarginLayoutParams) c0161e).rightMargin);
        int max2 = Math.max(0, this.f1139g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0161e).topMargin + ((ViewGroup.MarginLayoutParams) c0161e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1139g.getMeasuredState());
        Field field = x.f3074a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            i4 = this.f1137e;
            if (this.f1144l && this.f1139g.getTabContainer() != null) {
                i4 += this.f1137e;
            }
        } else if (this.f1139g.getVisibility() != 8) {
            i4 = this.f1139g.getMeasuredHeight();
        }
        Rect rect = this.f1148p;
        Rect rect2 = this.r;
        rect2.set(rect);
        Rect rect3 = this.f1152u;
        rect3.set(this.f1150s);
        if (this.f1143k || z2) {
            rect3.top += i4;
            rect3.bottom = rect3.bottom;
        } else {
            rect2.top += i4;
            rect2.bottom = rect2.bottom;
        }
        g(this.f1138f, rect2, true);
        Rect rect4 = this.f1153v;
        if (!rect4.equals(rect3)) {
            rect4.set(rect3);
            this.f1138f.a(rect3);
        }
        measureChildWithMargins(this.f1138f, i2, 0, i3, 0);
        C0161e c0161e2 = (C0161e) this.f1138f.getLayoutParams();
        int max3 = Math.max(max, this.f1138f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0161e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0161e2).rightMargin);
        int max4 = Math.max(max2, this.f1138f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0161e2).topMargin + ((ViewGroup.MarginLayoutParams) c0161e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1138f.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f1145m || !z2) {
            return false;
        }
        this.f1154w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1154w.getFinalY() > this.f1139g.getHeight()) {
            h();
            this.f1135A.run();
        } else {
            h();
            this.f1157z.run();
        }
        this.f1146n = true;
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
        int i6 = this.f1147o + i3;
        this.f1147o = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f1136B.f582b = i2;
        this.f1147o = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f1139g.getVisibility() != 0) {
            return false;
        }
        return this.f1145m;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1145m || this.f1146n) {
            return;
        }
        if (this.f1147o <= this.f1139g.getHeight()) {
            h();
            postDelayed(this.f1157z, 600L);
        } else {
            h();
            postDelayed(this.f1135A, 600L);
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
        this.f1139g.setTranslationY(-Math.max(0, Math.min(i2, this.f1139g.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0160d interfaceC0160d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f1144l = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f1145m) {
            this.f1145m = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        j();
        q0 q0Var = (q0) this.f1140h;
        q0Var.f2255d = i2 != 0 ? AbstractC0110a.a(q0Var.f2252a.getContext(), i2) : null;
        q0Var.c();
    }

    public void setLogo(int i2) {
        j();
        q0 q0Var = (q0) this.f1140h;
        q0Var.f2256e = i2 != 0 ? AbstractC0110a.a(q0Var.f2252a.getContext(), i2) : null;
        q0Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1143k = z2;
        this.f1142j = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((q0) this.f1140h).f2262k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        q0 q0Var = (q0) this.f1140h;
        if (q0Var.f2258g) {
            return;
        }
        q0Var.f2259h = charSequence;
        if ((q0Var.f2253b & 8) != 0) {
            q0Var.f2252a.setTitle(charSequence);
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
        q0 q0Var = (q0) this.f1140h;
        q0Var.f2255d = drawable;
        q0Var.c();
    }

    @Override // w.InterfaceC0270h
    public final void a(int i2, int i3, int[] iArr, int i4) {
    }
}
