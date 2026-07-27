package androidx.core.widget;

import A.e;
import A.h;
import A.i;
import A.j;
import A.k;
import A.m;
import L.C0063n;
import a.AbstractC0069a;
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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import w.AbstractC0263A;
import w.AbstractC0264B;
import w.AbstractC0279k;
import w.AbstractC0280l;
import w.AbstractC0284p;
import w.C0271c;
import w.C0275g;
import w.C0281m;
import w.InterfaceC0277i;
import w.x;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0277i {

    /* renamed from: G, reason: collision with root package name */
    public static final float f1310G = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: H, reason: collision with root package name */
    public static final h f1311H = new h();

    /* renamed from: I, reason: collision with root package name */
    public static final int[] f1312I = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public int f1313A;

    /* renamed from: B, reason: collision with root package name */
    public m f1314B;

    /* renamed from: C, reason: collision with root package name */
    public final C0063n f1315C;

    /* renamed from: D, reason: collision with root package name */
    public final C0275g f1316D;

    /* renamed from: E, reason: collision with root package name */
    public float f1317E;

    /* renamed from: F, reason: collision with root package name */
    public final C0271c f1318F;

    /* renamed from: f, reason: collision with root package name */
    public final float f1319f;

    /* renamed from: g, reason: collision with root package name */
    public long f1320g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f1321h;

    /* renamed from: i, reason: collision with root package name */
    public final OverScroller f1322i;

    /* renamed from: j, reason: collision with root package name */
    public final EdgeEffect f1323j;

    /* renamed from: k, reason: collision with root package name */
    public final EdgeEffect f1324k;

    /* renamed from: l, reason: collision with root package name */
    public int f1325l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1326m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1327n;

    /* renamed from: o, reason: collision with root package name */
    public View f1328o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1329p;

    /* renamed from: q, reason: collision with root package name */
    public VelocityTracker f1330q;
    public boolean r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1331s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1332t;

    /* renamed from: u, reason: collision with root package name */
    public final int f1333u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1334v;

    /* renamed from: w, reason: collision with root package name */
    public int f1335w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f1336x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f1337y;

    /* renamed from: z, reason: collision with root package name */
    public int f1338z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.icedrifter.arcticquest.R.attr.nestedScrollViewStyle);
        this.f1321h = new Rect();
        this.f1326m = true;
        this.f1327n = false;
        this.f1328o = null;
        this.f1329p = false;
        this.f1331s = true;
        this.f1335w = -1;
        this.f1336x = new int[2];
        this.f1337y = new int[2];
        this.f1318F = new C0271c(getContext(), new j(0, this));
        int i2 = Build.VERSION.SDK_INT;
        this.f1323j = i2 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f1324k = i2 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f1319f = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1322i = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1332t = viewConfiguration.getScaledTouchSlop();
        this.f1333u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1334v = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1312I, com.icedrifter.arcticquest.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1315C = new C0063n(2);
        this.f1316D = new C0275g(this);
        setNestedScrollingEnabled(true);
        x.a(this, f1311H);
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    @Override // w.InterfaceC0276h
    public final void a(int i2, int i3, int[] iArr, int i4) {
        this.f1316D.c(i2, i3, iArr, null, i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // w.InterfaceC0276h
    public final void b(View view, View view2, int i2, int i3) {
        C0063n c0063n = this.f1315C;
        if (i3 == 1) {
            c0063n.f661c = i2;
        } else {
            c0063n.f660b = i2;
        }
        u(2, i3);
    }

    @Override // w.InterfaceC0276h
    public final void c(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6) {
        m(i5, i6, null);
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i2;
        if (this.f1322i.isFinished()) {
            return;
        }
        this.f1322i.computeScrollOffset();
        int currY = this.f1322i.getCurrY();
        int i3 = currY - this.f1313A;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f1324k;
        EdgeEffect edgeEffect2 = this.f1323j;
        if (i3 <= 0 || AbstractC0069a.o(edgeEffect2) == 0.0f) {
            if (i3 < 0 && AbstractC0069a.o(edgeEffect) != 0.0f) {
                float f2 = height;
                round = Math.round(AbstractC0069a.v(edgeEffect, (i3 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
                if (round != i3) {
                    edgeEffect.finish();
                }
            }
            this.f1313A = currY;
            int[] iArr = this.f1337y;
            iArr[1] = 0;
            this.f1316D.c(0, i3, iArr, null, 1);
            i2 = i3 - iArr[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                o(i2, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i2 - scrollY2;
                iArr[1] = 0;
                this.f1316D.d(0, scrollY2, 0, i4, this.f1336x, 1, iArr);
                i2 = i4 - iArr[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i2 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f1322i.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f1322i.getCurrVelocity());
                    }
                }
                this.f1322i.abortAnimation();
                w(1);
            }
            if (this.f1322i.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = Math.round(AbstractC0069a.v(edgeEffect2, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i3) {
            edgeEffect2.finish();
        }
        i3 -= round;
        this.f1313A = currY;
        int[] iArr2 = this.f1337y;
        iArr2[1] = 0;
        this.f1316D.c(0, i3, iArr2, null, 1);
        i2 = i3 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i2 != 0) {
        }
        if (i2 != 0) {
        }
        if (this.f1322i.isFinished()) {
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
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // w.InterfaceC0276h
    public final void d(View view, int i2) {
        C0063n c0063n = this.f1315C;
        if (i2 == 1) {
            c0063n.f661c = 0;
        } else {
            c0063n.f660b = 0;
        }
        w(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        this.f1321h.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        z2 = keyEvent.isAltPressed() ? j(33) : g(33);
                    } else if (keyCode == 20) {
                        z2 = keyEvent.isAltPressed() ? j(130) : g(130);
                    } else if (keyCode == 62) {
                        p(keyEvent.isShiftPressed() ? 33 : 130);
                    } else if (keyCode == 92) {
                        z2 = j(33);
                    } else if (keyCode == 93) {
                        z2 = j(130);
                    } else if (keyCode == 122) {
                        p(33);
                    } else if (keyCode == 123) {
                        p(130);
                    }
                    return !z2;
                }
                z2 = false;
                if (!z2) {
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
                z2 = true;
                if (!z2) {
                }
            }
        }
        z2 = false;
        if (!z2) {
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f1316D.a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f1316D.b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f1316D.c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f1316D.d(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1323j;
        int i3 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (i.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft();
            } else {
                i2 = 0;
            }
            if (i.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i2, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f1324k;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (i.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i3 = getPaddingLeft();
        }
        if (i.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i3 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // w.InterfaceC0277i
    public final void e(ViewGroup viewGroup, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        m(i5, i6, iArr);
    }

    @Override // w.InterfaceC0276h
    public final boolean f(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public final boolean g(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !l(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f1321h;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && !l(findFocus, 0, getHeight())) {
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
        C0063n c0063n = this.f1315C;
        return c0063n.f661c | c0063n.f660b;
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
        if (this.f1317E == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1317E = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1317E;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1316D.f(0);
    }

    public final void i(int i2) {
        if (getChildCount() > 0) {
            this.f1322i.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.f1313A = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1316D.f3059d;
    }

    public final boolean j(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1321h;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i2, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i2, int i3) {
        Rect rect = this.f1321h;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i2 >= getScrollY() && rect.top - i2 <= getScrollY() + i3;
    }

    public final void m(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1316D.d(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1335w) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f1325l = (int) motionEvent.getY(i2);
            this.f1335w = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f1330q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i2, int i3, int i4, int i5) {
        boolean z2;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i6 = i4 + i2;
        if (i3 <= 0 && i3 >= 0) {
            z2 = false;
        } else {
            i3 = 0;
            z2 = true;
        }
        if (i6 <= i5) {
            if (i6 >= 0) {
                i5 = i6;
                z3 = false;
                if (z3 && !this.f1316D.f(1)) {
                    this.f1322i.springBack(i3, i5, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i3, i5);
                return z2 || z3;
            }
            i5 = 0;
        }
        z3 = true;
        if (z3) {
            this.f1322i.springBack(i3, i5, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i3, i5);
        if (z2) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1327n = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        int i2;
        int i3;
        char c2;
        int i4;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        int dimensionPixelSize;
        char c3;
        boolean z2;
        VelocityTracker velocityTracker;
        float f3;
        float f4;
        long j2;
        float sqrt;
        int i5;
        VelocityTracker velocityTracker2;
        float[] fArr;
        int i6;
        float f5;
        if (motionEvent.getAction() != 8 || this.f1329p) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i2 = 9;
            f2 = motionEvent.getAxisValue(9);
            i3 = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            f2 = motionEvent.getAxisValue(26);
            i3 = getWidth() / 2;
            i2 = 26;
        } else {
            f2 = 0.0f;
            i2 = 0;
            i3 = 0;
        }
        if (f2 == 0.0f) {
            return false;
        }
        r(-((int) (getVerticalScrollFactorCompat() * f2)), i3, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i2 == 0) {
            return true;
        }
        C0271c c0271c = this.f1318F;
        c0271c.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i7 = c0271c.f3052f;
        int[] iArr = c0271c.f3054h;
        if (i7 == source && c0271c.f3053g == deviceId && c0271c.f3051e == i2) {
            c3 = 0;
            z2 = false;
        } else {
            Context context = c0271c.f3047a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 34) {
                Method method = AbstractC0264B.f3010a;
                i4 = AbstractC0263A.b(viewConfiguration, deviceId2, i2, source2);
            } else {
                Method method2 = AbstractC0264B.f3010a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i2, source2) == null) {
                    c2 = 0;
                    i4 = Integer.MAX_VALUE;
                    iArr[c2] = i4;
                    int deviceId3 = motionEvent.getDeviceId();
                    int source3 = motionEvent.getSource();
                    if (i8 < 34) {
                        scaledMaximumFlingVelocity = AbstractC0263A.a(viewConfiguration, deviceId3, i2, source3);
                    } else {
                        InputDevice device2 = InputDevice.getDevice(deviceId3);
                        int i9 = Integer.MIN_VALUE;
                        if ((device2 == null || device2.getMotionRange(i2, source3) == null) ? false : true) {
                            Resources resources = context.getResources();
                            int identifier = (source3 == 4194304 && i2 == 26) ? resources.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                            Objects.requireNonNull(viewConfiguration);
                            if (identifier == -1) {
                                scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                            } else if (identifier != 0 && (dimensionPixelSize = resources.getDimensionPixelSize(identifier)) >= 0) {
                                i9 = dimensionPixelSize;
                            }
                        }
                        scaledMaximumFlingVelocity = i9;
                    }
                    iArr[1] = scaledMaximumFlingVelocity;
                    c0271c.f3052f = source;
                    c0271c.f3053g = deviceId;
                    c0271c.f3051e = i2;
                    c3 = 0;
                    z2 = true;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source2 == 4194304 && i2 == 26) ? resources2.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier2 != 0) {
                        scaledMinimumFlingVelocity = resources2.getDimensionPixelSize(identifier2);
                        if (scaledMinimumFlingVelocity < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    } else {
                        i4 = Integer.MAX_VALUE;
                    }
                    i4 = scaledMinimumFlingVelocity;
                }
            }
            c2 = 0;
            iArr[c2] = i4;
            int deviceId32 = motionEvent.getDeviceId();
            int source32 = motionEvent.getSource();
            if (i8 < 34) {
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c0271c.f3052f = source;
            c0271c.f3053g = deviceId;
            c0271c.f3051e = i2;
            c3 = 0;
            z2 = true;
        }
        if (iArr[c3] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker3 = c0271c.f3049c;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                c0271c.f3049c = null;
            }
        } else {
            if (c0271c.f3049c == null) {
                c0271c.f3049c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker4 = c0271c.f3049c;
            Map map = AbstractC0280l.f3061a;
            velocityTracker4.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = AbstractC0280l.f3061a;
                if (!map2.containsKey(velocityTracker4)) {
                    map2.put(velocityTracker4, new C0281m());
                }
                C0281m c0281m = (C0281m) map2.get(velocityTracker4);
                c0281m.getClass();
                long eventTime = motionEvent.getEventTime();
                int i10 = c0281m.f3065d;
                long[] jArr = c0281m.f3063b;
                if (i10 != 0 && eventTime - jArr[c0281m.f3066e] > 40) {
                    c0281m.f3065d = 0;
                    c0281m.f3064c = 0.0f;
                }
                int i11 = (c0281m.f3066e + 1) % 20;
                c0281m.f3066e = i11;
                int i12 = c0281m.f3065d;
                if (i12 != 20) {
                    c0281m.f3065d = i12 + 1;
                }
                c0281m.f3062a[i11] = motionEvent.getAxisValue(26);
                jArr[c0281m.f3066e] = eventTime;
            }
            velocityTracker4.computeCurrentVelocity(1000, Float.MAX_VALUE);
            C0281m c0281m2 = (C0281m) AbstractC0280l.f3061a.get(velocityTracker4);
            if (c0281m2 != null) {
                int i13 = c0281m2.f3065d;
                if (i13 >= 2) {
                    int i14 = c0281m2.f3066e;
                    int i15 = ((i14 + 20) - (i13 - 1)) % 20;
                    long[] jArr2 = c0281m2.f3063b;
                    long j3 = jArr2[i14];
                    while (true) {
                        j2 = jArr2[i15];
                        if (j3 - j2 <= 100) {
                            break;
                        }
                        c0281m2.f3065d--;
                        i15 = (i15 + 1) % 20;
                    }
                    int i16 = c0281m2.f3065d;
                    if (i16 >= 2) {
                        float[] fArr2 = c0281m2.f3062a;
                        if (i16 == 2) {
                            int i17 = (i15 + 1) % 20;
                            if (j2 != jArr2[i17]) {
                                velocityTracker = velocityTracker4;
                                i5 = 1000;
                                sqrt = fArr2[i17] / (r8 - j2);
                            }
                        } else {
                            float f6 = 0.0f;
                            int i18 = 0;
                            int i19 = 0;
                            while (true) {
                                if (i18 >= c0281m2.f3065d - 1) {
                                    break;
                                }
                                int i20 = i18 + i15;
                                long j4 = jArr2[i20 % 20];
                                int i21 = (i20 + 1) % 20;
                                if (jArr2[i21] == j4) {
                                    velocityTracker2 = velocityTracker4;
                                    fArr = fArr2;
                                    i6 = 1;
                                } else {
                                    i19++;
                                    velocityTracker2 = velocityTracker4;
                                    float sqrt2 = (f6 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f6) * 2.0f));
                                    float f7 = fArr2[i21];
                                    long j5 = jArr2[i21];
                                    fArr = fArr2;
                                    float f8 = f7 / (j5 - j4);
                                    float abs = (Math.abs(f8) * (f8 - sqrt2)) + f6;
                                    i6 = 1;
                                    if (i19 == 1) {
                                        abs *= 0.5f;
                                    }
                                    f6 = abs;
                                }
                                i18 += i6;
                                fArr2 = fArr;
                                velocityTracker4 = velocityTracker2;
                            }
                            velocityTracker = velocityTracker4;
                            sqrt = ((float) Math.sqrt(Math.abs(f6) * 2.0f)) * (f6 < 0.0f ? -1.0f : 1.0f);
                            i5 = 1000;
                        }
                        f5 = sqrt * i5;
                        c0281m2.f3064c = f5;
                        if (f5 >= (-Math.abs(Float.MAX_VALUE))) {
                            c0281m2.f3064c = -Math.abs(Float.MAX_VALUE);
                        } else if (c0281m2.f3064c > Math.abs(Float.MAX_VALUE)) {
                            c0281m2.f3064c = Math.abs(Float.MAX_VALUE);
                        }
                    }
                }
                velocityTracker = velocityTracker4;
                i5 = 1000;
                sqrt = 0.0f;
                f5 = sqrt * i5;
                c0281m2.f3064c = f5;
                if (f5 >= (-Math.abs(Float.MAX_VALUE))) {
                }
            } else {
                velocityTracker = velocityTracker4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f3 = AbstractC0279k.a(velocityTracker, i2);
            } else {
                VelocityTracker velocityTracker5 = velocityTracker;
                if (i2 == 0) {
                    f3 = velocityTracker5.getXVelocity();
                } else if (i2 == 1) {
                    f3 = velocityTracker5.getYVelocity();
                } else {
                    C0281m c0281m3 = (C0281m) AbstractC0280l.f3061a.get(velocityTracker5);
                    f3 = (c0281m3 == null || i2 != 26) ? 0.0f : c0281m3.f3064c;
                }
            }
            NestedScrollView nestedScrollView = (NestedScrollView) c0271c.f3048b.f30g;
            float f9 = f3 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f9);
            if (z2 || (signum != Math.signum(c0271c.f3050d) && signum != 0.0f)) {
                nestedScrollView.f1322i.abortAnimation();
            }
            if (Math.abs(f9) >= iArr[0]) {
                float max = Math.max(-r4, Math.min(f9, iArr[1]));
                if (max == 0.0f) {
                    f4 = 0.0f;
                } else {
                    nestedScrollView.f1322i.abortAnimation();
                    nestedScrollView.i((int) max);
                    f4 = max;
                }
                c0271c.f3050d = f4;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f1329p) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.f1335w;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f1325l) > this.f1332t && (2 & getNestedScrollAxes()) == 0) {
                                this.f1329p = true;
                                this.f1325l = y2;
                                if (this.f1330q == null) {
                                    this.f1330q = VelocityTracker.obtain();
                                }
                                this.f1330q.addMovement(motionEvent);
                                this.f1338z = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        n(motionEvent);
                    }
                }
            }
            this.f1329p = false;
            this.f1335w = -1;
            VelocityTracker velocityTracker = this.f1330q;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1330q = null;
            }
            if (this.f1322i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.f1325l = y3;
                    this.f1335w = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1330q;
                    if (velocityTracker2 == null) {
                        this.f1330q = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1330q.addMovement(motionEvent);
                    this.f1322i.computeScrollOffset();
                    if (!v(motionEvent) && this.f1322i.isFinished()) {
                        z2 = false;
                    }
                    this.f1329p = z2;
                    u(2, 0);
                }
            }
            if (!v(motionEvent) && this.f1322i.isFinished()) {
                z2 = false;
            }
            this.f1329p = z2;
            VelocityTracker velocityTracker3 = this.f1330q;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1330q = null;
            }
        }
        return this.f1329p;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        super.onLayout(z2, i2, i3, i4, i5);
        int i7 = 0;
        this.f1326m = false;
        View view = this.f1328o;
        if (view != null && k(view, this)) {
            View view2 = this.f1328o;
            Rect rect = this.f1321h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                scrollBy(0, h2);
            }
        }
        this.f1328o = null;
        if (!this.f1327n) {
            if (this.f1314B != null) {
                scrollTo(getScrollX(), this.f1314B.f32a);
                this.f1314B = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i6 = 0;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i6 && scrollY >= 0) {
                i7 = paddingTop + scrollY > i6 ? i6 - paddingTop : scrollY;
            }
            if (i7 != scrollY) {
                scrollTo(getScrollX(), i7);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1327n = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.r && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        i((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.f1316D.b(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        this.f1316D.c(i2, i3, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        m(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        b(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (findNextFocus != null && l(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.getSuperState());
        this.f1314B = mVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f32a = getScrollY();
        return mVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !l(findFocus, 0, i5)) {
            return;
        }
        Rect rect = this.f1321h;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h2 = h(rect);
        if (h2 != 0) {
            if (this.f1331s) {
                t(0, h2, false);
            } else {
                scrollBy(0, h2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        d(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f1330q == null) {
            this.f1330q = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1338z = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f2 = 0.0f;
        obtain.offsetLocation(0.0f, this.f1338z);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1324k;
            EdgeEffect edgeEffect2 = this.f1323j;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1330q;
                velocityTracker.computeCurrentVelocity(1000, this.f1334v);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1335w);
                if (Math.abs(yVelocity) >= this.f1333u) {
                    if (AbstractC0069a.o(edgeEffect2) != 0.0f) {
                        if (s(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (AbstractC0069a.o(edgeEffect) != 0.0f) {
                        int i2 = -yVelocity;
                        if (s(edgeEffect, i2)) {
                            edgeEffect.onAbsorb(i2);
                        } else {
                            i(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f3 = i3;
                        if (!this.f1316D.b(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            i(i3);
                        }
                    }
                } else if (this.f1322i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1335w = -1;
                this.f1329p = false;
                VelocityTracker velocityTracker2 = this.f1330q;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1330q = null;
                }
                w(0);
                this.f1323j.onRelease();
                this.f1324k.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1335w);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1335w + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i4 = this.f1325l - y2;
                    float x2 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (AbstractC0069a.o(edgeEffect2) != 0.0f) {
                        float f4 = -AbstractC0069a.v(edgeEffect2, -height, x2);
                        if (AbstractC0069a.o(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f2 = f4;
                    } else if (AbstractC0069a.o(edgeEffect) != 0.0f) {
                        float v2 = AbstractC0069a.v(edgeEffect, height, 1.0f - x2);
                        if (AbstractC0069a.o(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f2 = v2;
                    }
                    int round = Math.round(f2 * getHeight());
                    if (round != 0) {
                        invalidate();
                    }
                    int i5 = i4 - round;
                    if (!this.f1329p && Math.abs(i5) > this.f1332t) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1329p = true;
                        i5 = i5 > 0 ? i5 - this.f1332t : i5 + this.f1332t;
                    }
                    if (this.f1329p) {
                        int r = r(i5, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f1325l = y2 - r;
                        this.f1338z += r;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1329p && getChildCount() > 0 && this.f1322i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1335w = -1;
                this.f1329p = false;
                VelocityTracker velocityTracker3 = this.f1330q;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1330q = null;
                }
                w(0);
                this.f1323j.onRelease();
                this.f1324k.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1325l = (int) motionEvent.getY(actionIndex);
                this.f1335w = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f1325l = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1335w));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1329p && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1322i.isFinished()) {
                this.f1322i.abortAnimation();
                w(1);
            }
            int y3 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f1325l = y3;
            this.f1335w = pointerId;
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1330q;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1321h;
        if (z2) {
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
        int i3 = rect.top;
        int i4 = height + i3;
        rect.bottom = i4;
        q(i2, i3, i4);
    }

    public final boolean q(int i2, int i3, int i4) {
        boolean z2;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z3 = i2 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i3 < bottom && top < i4) {
                boolean z5 = i3 < top && bottom < i4;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5) {
                            if (!z6) {
                            }
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else {
                        if (!z6) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i3 < scrollY || i4 > i5) {
            r(z3 ? i3 - scrollY : i4 - i5, 0, 1, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i2);
        }
        return z2;
    }

    public final int r(int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        boolean z3;
        VelocityTracker velocityTracker;
        if (i4 == 1) {
            u(2, i4);
        }
        boolean c2 = this.f1316D.c(0, i2, this.f1337y, this.f1336x, i4);
        int[] iArr = this.f1337y;
        int[] iArr2 = this.f1336x;
        if (c2) {
            i5 = i2 - iArr[1];
            i6 = iArr2[1];
        } else {
            i5 = i2;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2;
        boolean z5 = o(i5, 0, scrollY, scrollRange) && !this.f1316D.f(i4);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f1316D.d(0, scrollY2, 0, i5 - scrollY2, this.f1336x, i4, iArr);
        int i7 = i6 + iArr2[1];
        int i8 = i5 - iArr[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.f1324k;
        EdgeEffect edgeEffect2 = this.f1323j;
        if (i9 < 0) {
            if (z4) {
                AbstractC0069a.v(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z4) {
            AbstractC0069a.v(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z3 = z5;
        } else {
            postInvalidateOnAnimation();
            z3 = false;
        }
        if (z3 && i4 == 0 && (velocityTracker = this.f1330q) != null) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            w(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f1326m) {
            this.f1328o = view2;
        } else {
            Rect rect = this.f1321h;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                scrollBy(0, h2);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h2 = h(rect);
        boolean z3 = h2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, h2);
            } else {
                t(0, h2, false);
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f1330q) != null) {
            velocityTracker.recycle();
            this.f1330q = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1326m = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float o2 = AbstractC0069a.o(edgeEffect) * getHeight();
        float abs = Math.abs(-i2) * 0.35f;
        float f2 = this.f1319f * 0.015f;
        double log = Math.log(abs / f2);
        double d2 = f1310G;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * log) * ((double) f2))) < o2;
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i2 < 0) {
                i2 = 0;
            } else if (width + i2 > width2) {
                i2 = width2 - width;
            }
            if (height >= height2 || i3 < 0) {
                i3 = 0;
            } else if (height + i3 > height2) {
                i3 = height2 - height;
            }
            if (i2 == getScrollX() && i3 == getScrollY()) {
                return;
            }
            super.scrollTo(i2, i3);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.r) {
            this.r = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0275g c0275g = this.f1316D;
        if (c0275g.f3059d) {
            Field field = x.f3069a;
            AbstractC0284p.z(c0275g.f3058c);
        }
        c0275g.f3059d = z2;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f1331s = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return this.f1316D.g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i2, int i3, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1320g > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1322i.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                u(2, 1);
            } else {
                w(1);
            }
            this.f1313A = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f1322i.isFinished()) {
                this.f1322i.abortAnimation();
                w(1);
            }
            scrollBy(i2, i3);
        }
        this.f1320g = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void u(int i2, int i3) {
        this.f1316D.g(2, i3);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1323j;
        if (AbstractC0069a.o(edgeEffect) != 0.0f) {
            AbstractC0069a.v(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f1324k;
        if (AbstractC0069a.o(edgeEffect2) == 0.0f) {
            return z2;
        }
        AbstractC0069a.v(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i2) {
        this.f1316D.h(i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
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
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(k kVar) {
    }
}
