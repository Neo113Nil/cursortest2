package androidx.core.widget;

import a0.u;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import bc.a0;
import d.a;
import h3.c;
import h3.e;
import h3.f;
import h3.g;
import h3.l;
import h3.m;
import h3.n;
import h3.q;
import h3.w;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import l3.d;
import l3.h;
import l3.i;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements f {
    public static final float I = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final l3.f J = new l3.f();
    public static final int[] K = {R.attr.fillViewport};
    public final int[] A;
    public int B;
    public int C;
    public i D;
    public final g E;
    public final u F;
    public float G;
    public final c H;

    /* renamed from: g, reason: collision with root package name */
    public final float f628g;

    /* renamed from: h, reason: collision with root package name */
    public long f629h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f630i;

    /* renamed from: j, reason: collision with root package name */
    public final OverScroller f631j;

    /* renamed from: k, reason: collision with root package name */
    public final EdgeEffect f632k;

    /* renamed from: l, reason: collision with root package name */
    public final EdgeEffect f633l;

    /* renamed from: m, reason: collision with root package name */
    public l f634m;

    /* renamed from: n, reason: collision with root package name */
    public int f635n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f636o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f637p;

    /* renamed from: q, reason: collision with root package name */
    public View f638q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f639r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f640s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f641t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f642u;

    /* renamed from: v, reason: collision with root package name */
    public final int f643v;

    /* renamed from: w, reason: collision with root package name */
    public final int f644w;

    /* renamed from: x, reason: collision with root package name */
    public final int f645x;

    /* renamed from: y, reason: collision with root package name */
    public int f646y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f647z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, org.fortheloss.st.R.attr.nestedScrollViewStyle);
        this.f630i = new Rect();
        this.f636o = true;
        this.f637p = false;
        this.f638q = null;
        this.f639r = false;
        this.f642u = true;
        this.f646y = -1;
        this.f647z = new int[2];
        this.A = new int[2];
        this.H = new c(getContext(), new f8.c(24, this));
        int i10 = Build.VERSION.SDK_INT;
        this.f632k = i10 >= 31 ? d.a(context, attributeSet) : new EdgeEffect(context);
        this.f633l = i10 >= 31 ? d.a(context, attributeSet) : new EdgeEffect(context);
        this.f628g = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f631j = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f643v = viewConfiguration.getScaledTouchSlop();
        this.f644w = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f645x = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K, org.fortheloss.st.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.E = new g();
        u uVar = new u();
        uVar.f138d = this;
        this.F = uVar;
        setNestedScrollingEnabled(true);
        w.b(this, J);
    }

    private l getScrollFeedbackProvider() {
        if (this.f634m == null) {
            this.f634m = new l(this);
        }
        return this.f634m;
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    @Override // h3.e
    public final void a(View view, View view2, int i10, int i11) {
        g gVar = this.E;
        if (i11 == 1) {
            gVar.f2779b = i10;
        } else {
            gVar.f2778a = i10;
        }
        u(2, i11);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // h3.e
    public final void b(View view, int i10) {
        g gVar = this.E;
        if (i10 == 1) {
            gVar.f2779b = 0;
        } else {
            gVar.f2778a = 0;
        }
        w(i10);
    }

    @Override // h3.f
    public final void c(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        m(i13, i14, iArr);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i10;
        if (this.f631j.isFinished()) {
            return;
        }
        this.f631j.computeScrollOffset();
        int currY = this.f631j.getCurrY();
        int i11 = currY - this.C;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f632k;
        EdgeEffect edgeEffect2 = this.f633l;
        if (i11 <= 0 || a0.n(edgeEffect) == 0.0f) {
            if (i11 < 0 && a0.n(edgeEffect2) != 0.0f) {
                float f10 = height;
                round = Math.round(a0.D(edgeEffect2, (i11 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
                if (round != i11) {
                    edgeEffect2.finish();
                }
            }
            int i12 = i11;
            this.C = currY;
            int[] iArr = this.A;
            iArr[1] = 0;
            this.F.b(0, i12, 1, iArr, null);
            i10 = i12 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                l3.g.a(this, Math.abs(this.f631j.getCurrVelocity()));
            }
            if (i10 != 0) {
                int scrollY = getScrollY();
                o(i10, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i13 = i10 - scrollY2;
                iArr[1] = 0;
                this.F.c(0, scrollY2, 0, i13, this.f647z, 1, iArr);
                i10 = i13 - iArr[1];
            }
            if (i10 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i10 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f631j.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f631j.getCurrVelocity());
                    }
                }
                this.f631j.abortAnimation();
                w(1);
            }
            if (this.f631j.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = Math.round(a0.D(edgeEffect, ((-i11) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i11) {
            edgeEffect.finish();
        }
        i11 -= round;
        int i122 = i11;
        this.C = currY;
        int[] iArr2 = this.A;
        iArr2[1] = 0;
        this.F.b(0, i122, 1, iArr2, null);
        i10 = i122 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i10 != 0) {
        }
        if (i10 != 0) {
        }
        if (this.f631j.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? (scrollY - max) + bottom : bottom;
    }

    @Override // h3.e
    public final void d(int i10, int i11, int[] iArr, int i12) {
        this.F.b(i10, i11, i12, iArr, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        if (!super.dispatchKeyEvent(keyEvent)) {
            this.f630i.setEmpty();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                    if (keyEvent.getAction() == 0) {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyCode == 19) {
                            z10 = keyEvent.isAltPressed() ? j(33) : g(33);
                        } else if (keyCode == 20) {
                            z10 = keyEvent.isAltPressed() ? j(130) : g(130);
                        } else if (keyCode == 62) {
                            p(keyEvent.isShiftPressed() ? 33 : 130);
                        } else if (keyCode == 92) {
                            z10 = j(33);
                        } else if (keyCode == 93) {
                            z10 = j(130);
                        } else if (keyCode == 122) {
                            p(33);
                        } else if (keyCode == 123) {
                            p(130);
                        }
                        if (z10) {
                            return false;
                        }
                    }
                    z10 = false;
                    if (z10) {
                    }
                }
            }
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                    z10 = true;
                    if (z10) {
                    }
                }
            }
            z10 = false;
            if (z10) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        ViewParent e10;
        u uVar = this.F;
        if (uVar.f135a && (e10 = uVar.e(0)) != null) {
            try {
                return e10.onNestedFling((NestedScrollView) uVar.f138d, f10, f11, z10);
            } catch (AbstractMethodError e11) {
                Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onNestedFling", e11);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.F.a(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.F.b(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.F.c(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f632k;
        int i11 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i10 = getPaddingLeft();
            } else {
                i10 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i10, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f633l;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i11 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i11 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // h3.e
    public final void e(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13, int i14) {
        m(i13, i14, null);
    }

    @Override // h3.e
    public final boolean f(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public final boolean g(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !l(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f630i;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(h(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i10);
        }
        if (view != null && view.isFocused() && !l(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        g gVar = this.E;
        return gVar.f2779b | gVar.f2778a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.G == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.G = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.G;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.F.e(0) != null;
    }

    public final void i(int i10) {
        if (getChildCount() > 0) {
            this.f631j.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.C = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                l3.g.a(this, Math.abs(this.f631j.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.F.f135a;
    }

    public final boolean j(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f630i;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i10, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i10, int i11) {
        Rect rect = this.f630i;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11;
    }

    public final void m(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.F.c(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f646y) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f635n = (int) motionEvent.getY(i10);
            this.f646y = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f640s;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10;
        int i15;
        boolean z11;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i16 = i12 + i10;
        if (i11 <= 0 && i11 >= 0) {
            i14 = i11;
            z10 = false;
        } else {
            i14 = 0;
            z10 = true;
        }
        if (i16 > i13) {
            i15 = i13;
        } else {
            if (i16 >= 0) {
                i15 = i16;
                z11 = false;
                if (z11 && this.F.e(1) == null) {
                    this.f631j.springBack(i14, i15, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i14, i15);
                return !z10 || z11;
            }
            i15 = 0;
        }
        z11 = true;
        if (z11) {
            this.f631j.springBack(i14, i15, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i14, i15);
        if (z10) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f637p = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x011e, code lost:
    
        if (r0 >= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00d3, code lost:
    
        if (r7 >= 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        NestedScrollView nestedScrollView;
        float f11;
        NestedScrollView nestedScrollView2;
        float f12;
        long j3;
        float f13;
        float sqrt;
        int i15;
        NestedScrollView nestedScrollView3;
        float f14;
        if (motionEvent.getAction() != 8 || this.f639r) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            i11 = (int) motionEvent.getX();
            i10 = 9;
            f10 = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            i11 = getWidth() / 2;
            f10 = axisValue2;
            i10 = 26;
        } else {
            f10 = 0.0f;
            i10 = 0;
            i11 = 0;
        }
        if (f10 == 0.0f) {
            return false;
        }
        r(-((int) (getVerticalScrollFactorCompat() * f10)), i10, motionEvent, i11, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i10 != 0) {
            c cVar = this.H;
            NestedScrollView nestedScrollView4 = (NestedScrollView) cVar.f2753b.f2340h;
            int[] iArr = cVar.f2759h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i16 = 1;
            if (cVar.f2757f == source && cVar.f2758g == deviceId && cVar.f2756e == i10) {
                z10 = false;
                i12 = 0;
            } else {
                Context context = cVar.f2752a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                i12 = 0;
                int source2 = motionEvent.getSource();
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 34) {
                    i13 = a.f(viewConfiguration, deviceId2, i10, source2);
                } else {
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device != null && device.getMotionRange(i10, source2) != null) {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i10 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            i13 = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier != 0) {
                            i13 = resources.getDimensionPixelSize(identifier);
                        }
                    }
                    i13 = Integer.MAX_VALUE;
                }
                iArr[0] = i13;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i17 >= 34) {
                    i14 = a.e(viewConfiguration, deviceId3, i10, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 != null && device2.getMotionRange(i10, source3) != null) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i10 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            i14 = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 != 0) {
                            i14 = resources2.getDimensionPixelSize(identifier2);
                        }
                    }
                    i14 = Integer.MIN_VALUE;
                }
                iArr[1] = i14;
                cVar.f2757f = source;
                cVar.f2758g = deviceId;
                cVar.f2756e = i10;
                z10 = true;
            }
            if (iArr[i12] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker = cVar.f2754c;
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                cVar.f2754c = null;
                return true;
            }
            if (cVar.f2754c == null) {
                cVar.f2754c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = cVar.f2754c;
            Map map = m.f2798a;
            velocityTracker2.addMovement(motionEvent);
            int i18 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = m.f2798a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new n());
                }
                n nVar = (n) map2.get(velocityTracker2);
                long[] jArr = nVar.f2800b;
                long eventTime = motionEvent.getEventTime();
                if (nVar.f2802d != 0 && eventTime - jArr[nVar.f2803e] > 40) {
                    nVar.f2802d = i12;
                    nVar.f2801c = 0.0f;
                }
                int i19 = (nVar.f2803e + 1) % 20;
                nVar.f2803e = i19;
                int i20 = nVar.f2802d;
                if (i20 != 20) {
                    nVar.f2802d = i20 + 1;
                }
                nVar.f2799a[i19] = motionEvent.getAxisValue(26);
                jArr[nVar.f2803e] = eventTime;
            }
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            n nVar2 = (n) m.f2798a.get(velocityTracker2);
            if (nVar2 != null) {
                float[] fArr = nVar2.f2799a;
                long[] jArr2 = nVar2.f2800b;
                int i21 = nVar2.f2802d;
                if (i21 >= 2) {
                    int i22 = nVar2.f2803e;
                    int i23 = ((i22 + 20) - (i21 - 1)) % 20;
                    long j6 = jArr2[i22];
                    while (true) {
                        j3 = jArr2[i23];
                        if (j6 - j3 <= 100) {
                            break;
                        }
                        nVar2.f2802d--;
                        i23 = (i23 + 1) % 20;
                    }
                    int i24 = nVar2.f2802d;
                    if (i24 >= 2) {
                        if (i24 == 2) {
                            int i25 = (i23 + 1) % 20;
                            if (j3 != jArr2[i25]) {
                                nestedScrollView = nestedScrollView4;
                                f13 = Float.MAX_VALUE;
                                i15 = 1000;
                                sqrt = fArr[i25] / (r12 - j3);
                            }
                        } else {
                            f13 = Float.MAX_VALUE;
                            float f15 = 0.0f;
                            int i26 = 0;
                            int i27 = 0;
                            while (true) {
                                if (i26 >= nVar2.f2802d - 1) {
                                    break;
                                }
                                int i28 = i26 + i23;
                                long j10 = jArr2[i28 % 20];
                                int i29 = (i28 + 1) % i18;
                                if (jArr2[i29] == j10) {
                                    nestedScrollView3 = nestedScrollView4;
                                } else {
                                    i27++;
                                    nestedScrollView3 = nestedScrollView4;
                                    float sqrt2 = (f15 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f15) * 2.0f));
                                    float f16 = fArr[i29] / (jArr2[i29] - j10);
                                    float abs = (Math.abs(f16) * (f16 - sqrt2)) + f15;
                                    if (i27 == i16) {
                                        abs *= 0.5f;
                                    }
                                    f15 = abs;
                                }
                                i26++;
                                nestedScrollView4 = nestedScrollView3;
                                i18 = 20;
                                i16 = 1;
                            }
                            nestedScrollView = nestedScrollView4;
                            sqrt = ((float) Math.sqrt(Math.abs(f15) * 2.0f)) * (f15 < 0.0f ? -1.0f : 1.0f);
                            i15 = 1000;
                        }
                        f14 = sqrt * i15;
                        nVar2.f2801c = f14;
                        if (f14 >= (-Math.abs(f13))) {
                            nVar2.f2801c = -Math.abs(f13);
                        } else if (nVar2.f2801c > Math.abs(f13)) {
                            nVar2.f2801c = Math.abs(f13);
                        }
                    }
                }
                nestedScrollView = nestedScrollView4;
                f13 = Float.MAX_VALUE;
                i15 = 1000;
                sqrt = 0.0f;
                f14 = sqrt * i15;
                nVar2.f2801c = f14;
                if (f14 >= (-Math.abs(f13))) {
                }
            } else {
                nestedScrollView = nestedScrollView4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f11 = a.b(velocityTracker2, i10);
            } else if (i10 == 0) {
                f11 = velocityTracker2.getXVelocity();
            } else if (i10 == 1) {
                f11 = velocityTracker2.getYVelocity();
            } else {
                n nVar3 = (n) m.f2798a.get(velocityTracker2);
                f11 = (nVar3 == null || i10 != 26) ? 0.0f : nVar3.f2801c;
            }
            float f17 = f11 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f17);
            if (z10 || !(signum == Math.signum(cVar.f2755d) || signum == 0.0f)) {
                nestedScrollView2 = nestedScrollView;
                nestedScrollView2.f631j.abortAnimation();
            } else {
                nestedScrollView2 = nestedScrollView;
            }
            if (Math.abs(f17) >= iArr[0]) {
                float max = Math.max(-r2, Math.min(f17, iArr[1]));
                if (max == 0.0f) {
                    f12 = 0.0f;
                } else {
                    nestedScrollView2.f631j.abortAnimation();
                    nestedScrollView2.i((int) max);
                    f12 = max;
                }
                cVar.f2755d = f12;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f639r) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.f646y;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f635n) > this.f643v && (2 & getNestedScrollAxes()) == 0) {
                                this.f639r = true;
                                this.f635n = y10;
                                if (this.f640s == null) {
                                    this.f640s = VelocityTracker.obtain();
                                }
                                this.f640s.addMovement(motionEvent);
                                this.B = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 6) {
                        n(motionEvent);
                    }
                }
            }
            this.f639r = false;
            this.f646y = -1;
            VelocityTracker velocityTracker = this.f640s;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f640s = null;
            }
            if (this.f631j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y11 = (int) motionEvent.getY();
            int x10 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y11 >= childAt.getTop() - scrollY && y11 < childAt.getBottom() - scrollY && x10 >= childAt.getLeft() && x10 < childAt.getRight()) {
                    this.f635n = y11;
                    this.f646y = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f640s;
                    if (velocityTracker2 == null) {
                        this.f640s = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f640s.addMovement(motionEvent);
                    this.f631j.computeScrollOffset();
                    if (!v(motionEvent) && this.f631j.isFinished()) {
                        z10 = false;
                    }
                    this.f639r = z10;
                    u(2, 0);
                }
            }
            if (!v(motionEvent) && this.f631j.isFinished()) {
                z10 = false;
            }
            this.f639r = z10;
            VelocityTracker velocityTracker3 = this.f640s;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f640s = null;
            }
        }
        return this.f639r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = 0;
        this.f636o = false;
        View view = this.f638q;
        if (view != null && k(view, this)) {
            View view2 = this.f638q;
            Rect rect = this.f630i;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h10 = h(rect);
            if (h10 != 0) {
                scrollBy(0, h10);
            }
        }
        this.f638q = null;
        if (!this.f637p) {
            if (this.D != null) {
                scrollTo(getScrollX(), this.D.f4150g);
                this.D = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i14 = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i14 && scrollY >= 0) {
                i15 = paddingTop + scrollY > i14 ? i14 - paddingTop : scrollY;
            }
            if (i15 != scrollY) {
                scrollTo(getScrollX(), i15);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f637p = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f641t && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        i((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return this.F.a(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        this.F.b(i10, i11, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        a(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (findNextFocus != null && l(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i10, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        this.D = iVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        iVar.f4150g = getScrollY();
        return iVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !l(findFocus, 0, i13)) {
            return;
        }
        Rect rect = this.f630i;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h10 = h(rect);
        if (h10 != 0) {
            if (this.f642u) {
                t(0, h10, false);
            } else {
                scrollBy(0, h10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return f(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float D;
        int round;
        int i10;
        ViewParent parent2;
        if (this.f640s == null) {
            this.f640s = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f10 = 0.0f;
        obtain.offsetLocation(0.0f, this.B);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f632k;
            EdgeEffect edgeEffect2 = this.f633l;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f640s;
                velocityTracker.computeCurrentVelocity(1000, this.f645x);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f646y);
                if (Math.abs(yVelocity) >= this.f644w) {
                    if (a0.n(edgeEffect) != 0.0f) {
                        if (s(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (a0.n(edgeEffect2) != 0.0f) {
                        int i11 = -yVelocity;
                        if (s(edgeEffect2, i11)) {
                            edgeEffect2.onAbsorb(i11);
                        } else {
                            i(i11);
                        }
                    } else {
                        int i12 = -yVelocity;
                        float f11 = i12;
                        if (!this.F.a(0.0f, f11)) {
                            dispatchNestedFling(0.0f, f11, true);
                            i(i12);
                        }
                    }
                } else if (this.f631j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f646y = -1;
                this.f639r = false;
                VelocityTracker velocityTracker2 = this.f640s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f640s = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f646y);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f646y + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(findPointerIndex);
                    int i13 = this.f635n - y10;
                    float x10 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i13 / getHeight();
                    if (a0.n(edgeEffect) != 0.0f) {
                        D = -a0.D(edgeEffect, -height, x10);
                        if (a0.n(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (a0.n(edgeEffect2) != 0.0f) {
                            D = a0.D(edgeEffect2, height, 1.0f - x10);
                            if (a0.n(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f10 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i10 = i13 - round;
                        if (!this.f639r && Math.abs(i10) > this.f643v) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f639r = true;
                            i10 = i10 <= 0 ? i10 - this.f643v : i10 + this.f643v;
                        }
                        if (this.f639r) {
                            int r5 = r(i10, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f635n = y10 - r5;
                            this.B += r5;
                        }
                    }
                    f10 = D;
                    round = Math.round(f10 * getHeight());
                    if (round != 0) {
                    }
                    i10 = i13 - round;
                    if (!this.f639r) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.f639r = true;
                        if (i10 <= 0) {
                        }
                    }
                    if (this.f639r) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f639r && getChildCount() > 0) {
                    if (this.f631j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f646y = -1;
                this.f639r = false;
                VelocityTracker velocityTracker3 = this.f640s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f640s = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f635n = (int) motionEvent.getY(actionIndex);
                this.f646y = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f635n = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f646y));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f639r && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f631j.isFinished()) {
                this.f631j.abortAnimation();
                w(1);
            }
            int y11 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f635n = y11;
            this.f646y = pointerId;
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f640s;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f630i;
        if (z10) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i11 = rect.top;
        int i12 = height + i11;
        rect.bottom = i12;
        q(i10, i11, i12);
    }

    public final boolean q(int i10, int i11, int i12) {
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z11 = i10 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = focusables.get(i14);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z13 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13) {
                            if (!z14) {
                            }
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else {
                        if (!z14) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i11 < scrollY || i12 > i13) {
            r(z11 ? i11 - scrollY : i12 - i13, -1, null, 0, 1, true);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i10);
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r(int i10, int i11, MotionEvent motionEvent, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker;
        if (i13 == 1) {
            u(2, i13);
        }
        boolean b2 = this.F.b(0, i10, i13, this.A, this.f647z);
        int[] iArr = this.f647z;
        int[] iArr2 = this.A;
        if (b2) {
            i14 = i10 - iArr2[1];
            i15 = iArr[1];
        } else {
            i14 = i10;
            i15 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z13 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z10;
        boolean z14 = o(i14, 0, scrollY, scrollRange) && this.F.e(i13) == null;
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f2796a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i11, scrollY2);
        }
        iArr2[1] = 0;
        this.F.c(0, scrollY2, 0, i14 - scrollY2, this.f647z, i13, iArr2);
        int i16 = i15 + iArr[1];
        int i17 = i14 - iArr2[1];
        int i18 = scrollY + i17;
        EdgeEffect edgeEffect = this.f633l;
        EdgeEffect edgeEffect2 = this.f632k;
        if (i18 < 0) {
            if (z13) {
                a0.D(edgeEffect2, (-i17) / getHeight(), i12 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().f2796a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i11, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i18 > scrollRange && z13) {
            a0.D(edgeEffect, i17 / getHeight(), 1.0f - (i12 / getWidth()));
            if (motionEvent != null) {
                z11 = false;
                getScrollFeedbackProvider().f2796a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i11, false);
            } else {
                z11 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z12 = z11;
            } else {
                z12 = z14;
            }
            if (z12 && i13 == 0 && (velocityTracker = this.f640s) != null) {
                velocityTracker.clear();
            }
            if (i13 == 1) {
                w(i13);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i16;
        }
        z11 = false;
        if (edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z12 = z11;
        if (z12) {
            velocityTracker.clear();
        }
        if (i13 == 1) {
        }
        return i16;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f636o) {
            this.f638q = view2;
        } else {
            Rect rect = this.f630i;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h10 = h(rect);
            if (h10 != 0) {
                scrollBy(0, h10);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h10 = h(rect);
        boolean z11 = h10 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, h10);
                return z11;
            }
            t(0, h10, false);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f640s) != null) {
            velocityTracker.recycle();
            this.f640s = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f636o = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float n7 = a0.n(edgeEffect) * getHeight();
        float abs = Math.abs(-i10) * 0.35f;
        float f10 = this.f628g * 0.015f;
        double log = Math.log(abs / f10);
        double d10 = I;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * ((double) f10))) < n7;
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 == getScrollX() && i11 == getScrollY()) {
                return;
            }
            super.scrollTo(i10, i11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f641t) {
            this.f641t = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        u uVar = this.F;
        if (uVar.f135a) {
            NestedScrollView nestedScrollView = (NestedScrollView) uVar.f138d;
            Field field = w.f2829a;
            q.h(nestedScrollView);
        }
        uVar.f135a = z10;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f642u = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return u(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i10, int i11, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f629h > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f631j.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z10) {
                u(2, 1);
            } else {
                w(1);
            }
            this.C = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f631j.isFinished()) {
                this.f631j.abortAnimation();
                w(1);
            }
            scrollBy(i10, i11);
        }
        this.f629h = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean u(int i10, int i11) {
        boolean onStartNestedScroll;
        u uVar = this.F;
        View view = (NestedScrollView) uVar.f138d;
        if (uVar.e(i11) != null) {
            return true;
        }
        if (uVar.f135a) {
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z10 = parent instanceof e;
                if (z10) {
                    onStartNestedScroll = ((e) parent).f(view2, view, i10, i11);
                } else {
                    if (i11 == 0) {
                        try {
                            onStartNestedScroll = parent.onStartNestedScroll(view2, view, i10);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                        }
                    }
                    onStartNestedScroll = false;
                }
                if (onStartNestedScroll) {
                    if (i11 == 0) {
                        uVar.f136b = parent;
                    } else if (i11 == 1) {
                        uVar.f137c = parent;
                    }
                    if (z10) {
                        ((e) parent).a(view2, view, i10, i11);
                        return true;
                    }
                    if (i11 != 0) {
                        return true;
                    }
                    try {
                        parent.onNestedScrollAccepted(view2, view, i10);
                        return true;
                    } catch (AbstractMethodError e11) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                        return true;
                    }
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f632k;
        if (a0.n(edgeEffect) != 0.0f) {
            a0.D(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f633l;
        if (a0.n(edgeEffect2) == 0.0f) {
            return z10;
        }
        a0.D(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i10) {
        u uVar = this.F;
        ViewParent e10 = uVar.e(i10);
        if (e10 != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) uVar.f138d;
            if (e10 instanceof e) {
                ((e) e10).b(nestedScrollView, i10);
            } else if (i10 == 0) {
                try {
                    e10.onStopNestedScroll(nestedScrollView);
                } catch (AbstractMethodError e11) {
                    Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onStopNestedScroll", e11);
                }
            }
            if (i10 == 0) {
                uVar.f136b = null;
            } else {
                if (i10 != 1) {
                    return;
                }
                uVar.f137c = null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(h hVar) {
    }
}
