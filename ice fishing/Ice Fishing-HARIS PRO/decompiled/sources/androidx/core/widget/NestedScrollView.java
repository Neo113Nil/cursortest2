package androidx.core.widget;

import B.b;
import O.AbstractC0042s;
import O.AbstractC0043t;
import O.B;
import O.C0032h;
import O.C0035k;
import O.C0038n;
import O.C0044u;
import O.InterfaceC0037m;
import O.K;
import R.c;
import R.e;
import R.f;
import R.g;
import R.h;
import a.AbstractC0078a;
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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0037m {

    /* renamed from: B, reason: collision with root package name */
    public static final float f1936B = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: C, reason: collision with root package name */
    public static final e f1937C = new e(0);

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f1938D = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public final C0032h f1939A;

    /* renamed from: a, reason: collision with root package name */
    public final float f1940a;

    /* renamed from: b, reason: collision with root package name */
    public long f1941b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f1942c;

    /* renamed from: d, reason: collision with root package name */
    public final OverScroller f1943d;
    public final EdgeEffect e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f1944f;

    /* renamed from: g, reason: collision with root package name */
    public int f1945g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1946h;
    public boolean i;
    public View j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1947k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f1948l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1949m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1950n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1951o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1952p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1953q;

    /* renamed from: r, reason: collision with root package name */
    public int f1954r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f1955s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f1956t;

    /* renamed from: u, reason: collision with root package name */
    public int f1957u;

    /* renamed from: v, reason: collision with root package name */
    public int f1958v;

    /* renamed from: w, reason: collision with root package name */
    public h f1959w;

    /* renamed from: x, reason: collision with root package name */
    public final C0038n f1960x;

    /* renamed from: y, reason: collision with root package name */
    public final C0035k f1961y;

    /* renamed from: z, reason: collision with root package name */
    public float f1962z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.nestedScrollViewStyle);
        this.f1942c = new Rect();
        this.f1946h = true;
        this.i = false;
        this.j = null;
        this.f1947k = false;
        this.f1950n = true;
        this.f1954r = -1;
        this.f1955s = new int[2];
        this.f1956t = new int[2];
        this.f1939A = new C0032h(getContext(), new b(12, this));
        int i = Build.VERSION.SDK_INT;
        this.e = i >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f1944f = i >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f1940a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1943d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1951o = viewConfiguration.getScaledTouchSlop();
        this.f1952p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1953q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1938D, com.lumenpath.harispro.hrnavigator.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1960x = new C0038n();
        this.f1961y = new C0035k(this);
        setNestedScrollingEnabled(true);
        K.l(this, f1937C);
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, nestedScrollView);
    }

    @Override // O.InterfaceC0036l
    public final void a(View view, View view2, int i, int i2) {
        C0038n c0038n = this.f1960x;
        if (i2 == 1) {
            c0038n.f826b = i;
        } else {
            c0038n.f825a = i;
        }
        this.f1961y.g(2, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // O.InterfaceC0037m
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        n(i4, i5, iArr);
    }

    @Override // O.InterfaceC0036l
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        n(i4, i5, null);
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i;
        if (this.f1943d.isFinished()) {
            return;
        }
        this.f1943d.computeScrollOffset();
        int currY = this.f1943d.getCurrY();
        int i2 = currY - this.f1958v;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f1944f;
        EdgeEffect edgeEffect2 = this.e;
        if (i2 <= 0 || AbstractC0078a.D(edgeEffect2) == RecyclerView.f2111C0) {
            if (i2 < 0 && AbstractC0078a.D(edgeEffect) != RecyclerView.f2111C0) {
                float f2 = height;
                round = Math.round(AbstractC0078a.T(edgeEffect, (i2 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
                if (round != i2) {
                    edgeEffect.finish();
                }
            }
            this.f1958v = currY;
            int[] iArr = this.f1956t;
            iArr[1] = 0;
            this.f1961y.c(0, i2, 1, iArr, null);
            i = i2 - iArr[1];
            int scrollRange = getScrollRange();
            if (K.b.a()) {
                f.a(this, Math.abs(this.f1943d.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                p(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i - scrollY2;
                iArr[1] = 0;
                this.f1961y.d(0, scrollY2, 0, i3, this.f1955s, 1, iArr);
                i = i3 - iArr[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f1943d.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f1943d.getCurrVelocity());
                    }
                }
                this.f1943d.abortAnimation();
                w(1);
            }
            if (this.f1943d.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = Math.round(AbstractC0078a.T(edgeEffect2, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i2) {
            edgeEffect2.finish();
        }
        i2 -= round;
        this.f1958v = currY;
        int[] iArr2 = this.f1956t;
        iArr2[1] = 0;
        this.f1961y.c(0, i2, 1, iArr2, null);
        i = i2 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (K.b.a()) {
        }
        if (i != 0) {
        }
        if (i != 0) {
        }
        if (this.f1943d.isFinished()) {
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

    public final boolean d(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f1942c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && !m(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f1961y.a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f1961y.b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1961y.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1961y.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.e;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f1944f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i2 - width2, max);
        canvas.rotate(180.0f, width2, RecyclerView.f2111C0);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // O.InterfaceC0036l
    public final void e(View view, int i) {
        C0038n c0038n = this.f1960x;
        if (i == 1) {
            c0038n.f826b = 0;
        } else {
            c0038n.f825a = 0;
        }
        w(i);
    }

    @Override // O.InterfaceC0036l
    public final void f(View view, int i, int i2, int[] iArr, int i3) {
        this.f1961y.c(i, i2, i3, iArr, null);
    }

    @Override // O.InterfaceC0036l
    public final boolean g(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return RecyclerView.f2111C0;
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
        C0038n c0038n = this.f1960x;
        return c0038n.f826b | c0038n.f825a;
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
            return RecyclerView.f2111C0;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f1962z == RecyclerView.f2111C0) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1962z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1962z;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1961y.f(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.f1942c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? k(33) : d(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? k(130) : d(130);
                }
                if (keyCode == 62) {
                    q(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return k(33);
                }
                if (keyCode == 93) {
                    return k(130);
                }
                if (keyCode == 122) {
                    q(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                q(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1961y.f823d;
    }

    public final void j(int i) {
        if (getChildCount() > 0) {
            this.f1943d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1961y.g(2, 1);
            this.f1958v = getScrollY();
            postInvalidateOnAnimation();
            if (K.b.a()) {
                f.a(this, Math.abs(this.f1943d.getCurrVelocity()));
            }
        }
    }

    public final boolean k(int i) {
        int childCount;
        boolean z2 = i == 130;
        int height = getHeight();
        Rect rect = this.f1942c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i, int i2) {
        Rect rect = this.f1942c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1961y.d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1954r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1945g = (int) motionEvent.getY(i);
            this.f1954r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1948l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        int i;
        int i2;
        char c2;
        int i3;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        int dimensionPixelSize;
        char c3;
        boolean z2;
        VelocityTracker velocityTracker;
        float f3;
        float f4;
        long j;
        float sqrt;
        int i4;
        VelocityTracker velocityTracker2;
        float[] fArr;
        int i5;
        float f5;
        if (motionEvent.getAction() != 8 || this.f1947k) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i = 9;
            f2 = motionEvent.getAxisValue(9);
            i2 = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            f2 = motionEvent.getAxisValue(26);
            i2 = getWidth() / 2;
            i = 26;
        } else {
            f2 = 0.0f;
            i = 0;
            i2 = 0;
        }
        if (f2 == RecyclerView.f2111C0) {
            return false;
        }
        s(-((int) (getVerticalScrollFactorCompat() * f2)), i2, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i == 0) {
            return true;
        }
        C0032h c0032h = this.f1939A;
        c0032h.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i6 = c0032h.f812f;
        int[] iArr = c0032h.f814h;
        if (i6 == source && c0032h.f813g == deviceId && c0032h.e == i) {
            c3 = 0;
            z2 = false;
        } else {
            Context context = c0032h.f808a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 34) {
                i3 = AbstractC0042s.f(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    c2 = 0;
                    i3 = Integer.MAX_VALUE;
                    iArr[c2] = i3;
                    int deviceId3 = motionEvent.getDeviceId();
                    int source3 = motionEvent.getSource();
                    if (i7 < 34) {
                        scaledMaximumFlingVelocity = AbstractC0042s.e(viewConfiguration, deviceId3, i, source3);
                    } else {
                        InputDevice device2 = InputDevice.getDevice(deviceId3);
                        int i8 = Integer.MIN_VALUE;
                        if ((device2 == null || device2.getMotionRange(i, source3) == null) ? false : true) {
                            Resources resources = context.getResources();
                            int identifier = (source3 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                            Objects.requireNonNull(viewConfiguration);
                            if (identifier == -1) {
                                scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                            } else if (identifier != 0 && (dimensionPixelSize = resources.getDimensionPixelSize(identifier)) >= 0) {
                                i8 = dimensionPixelSize;
                            }
                        }
                        scaledMaximumFlingVelocity = i8;
                    }
                    iArr[1] = scaledMaximumFlingVelocity;
                    c0032h.f812f = source;
                    c0032h.f813g = deviceId;
                    c0032h.e = i;
                    c3 = 0;
                    z2 = true;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source2 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier2 != 0) {
                        scaledMinimumFlingVelocity = resources2.getDimensionPixelSize(identifier2);
                        if (scaledMinimumFlingVelocity < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    } else {
                        i3 = Integer.MAX_VALUE;
                    }
                    i3 = scaledMinimumFlingVelocity;
                }
            }
            c2 = 0;
            iArr[c2] = i3;
            int deviceId32 = motionEvent.getDeviceId();
            int source32 = motionEvent.getSource();
            if (i7 < 34) {
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c0032h.f812f = source;
            c0032h.f813g = deviceId;
            c0032h.e = i;
            c3 = 0;
            z2 = true;
        }
        if (iArr[c3] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker3 = c0032h.f810c;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                c0032h.f810c = null;
            }
        } else {
            if (c0032h.f810c == null) {
                c0032h.f810c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker4 = c0032h.f810c;
            Map map = AbstractC0043t.f830a;
            velocityTracker4.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = AbstractC0043t.f830a;
                if (!map2.containsKey(velocityTracker4)) {
                    map2.put(velocityTracker4, new C0044u());
                }
                C0044u c0044u = (C0044u) map2.get(velocityTracker4);
                c0044u.getClass();
                long eventTime = motionEvent.getEventTime();
                int i9 = c0044u.f834d;
                long[] jArr = c0044u.f832b;
                if (i9 != 0 && eventTime - jArr[c0044u.e] > 40) {
                    c0044u.f834d = 0;
                    c0044u.f833c = RecyclerView.f2111C0;
                }
                int i10 = (c0044u.e + 1) % 20;
                c0044u.e = i10;
                int i11 = c0044u.f834d;
                if (i11 != 20) {
                    c0044u.f834d = i11 + 1;
                }
                c0044u.f831a[i10] = motionEvent.getAxisValue(26);
                jArr[c0044u.e] = eventTime;
            }
            velocityTracker4.computeCurrentVelocity(1000, Float.MAX_VALUE);
            C0044u c0044u2 = (C0044u) AbstractC0043t.f830a.get(velocityTracker4);
            if (c0044u2 != null) {
                int i12 = c0044u2.f834d;
                if (i12 >= 2) {
                    int i13 = c0044u2.e;
                    int i14 = ((i13 + 20) - (i12 - 1)) % 20;
                    long[] jArr2 = c0044u2.f832b;
                    long j2 = jArr2[i13];
                    while (true) {
                        j = jArr2[i14];
                        if (j2 - j <= 100) {
                            break;
                        }
                        c0044u2.f834d--;
                        i14 = (i14 + 1) % 20;
                    }
                    int i15 = c0044u2.f834d;
                    if (i15 >= 2) {
                        float[] fArr2 = c0044u2.f831a;
                        if (i15 == 2) {
                            int i16 = (i14 + 1) % 20;
                            if (j != jArr2[i16]) {
                                velocityTracker = velocityTracker4;
                                i4 = 1000;
                                sqrt = fArr2[i16] / (r8 - j);
                            }
                        } else {
                            float f6 = RecyclerView.f2111C0;
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                if (i17 >= c0044u2.f834d - 1) {
                                    break;
                                }
                                int i19 = i17 + i14;
                                long j3 = jArr2[i19 % 20];
                                int i20 = (i19 + 1) % 20;
                                if (jArr2[i20] == j3) {
                                    velocityTracker2 = velocityTracker4;
                                    fArr = fArr2;
                                    i5 = 1;
                                } else {
                                    i18++;
                                    velocityTracker2 = velocityTracker4;
                                    float sqrt2 = (f6 < RecyclerView.f2111C0 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f6) * 2.0f));
                                    float f7 = fArr2[i20];
                                    long j4 = jArr2[i20];
                                    fArr = fArr2;
                                    float f8 = f7 / (j4 - j3);
                                    float abs = (Math.abs(f8) * (f8 - sqrt2)) + f6;
                                    i5 = 1;
                                    if (i18 == 1) {
                                        abs *= 0.5f;
                                    }
                                    f6 = abs;
                                }
                                i17 += i5;
                                fArr2 = fArr;
                                velocityTracker4 = velocityTracker2;
                            }
                            velocityTracker = velocityTracker4;
                            sqrt = ((float) Math.sqrt(Math.abs(f6) * 2.0f)) * (f6 < RecyclerView.f2111C0 ? -1.0f : 1.0f);
                            i4 = 1000;
                        }
                        f5 = sqrt * i4;
                        c0044u2.f833c = f5;
                        if (f5 >= (-Math.abs(Float.MAX_VALUE))) {
                            c0044u2.f833c = -Math.abs(Float.MAX_VALUE);
                        } else if (c0044u2.f833c > Math.abs(Float.MAX_VALUE)) {
                            c0044u2.f833c = Math.abs(Float.MAX_VALUE);
                        }
                    }
                }
                velocityTracker = velocityTracker4;
                i4 = 1000;
                sqrt = RecyclerView.f2111C0;
                f5 = sqrt * i4;
                c0044u2.f833c = f5;
                if (f5 >= (-Math.abs(Float.MAX_VALUE))) {
                }
            } else {
                velocityTracker = velocityTracker4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f3 = AbstractC0042s.b(velocityTracker, i);
            } else {
                VelocityTracker velocityTracker5 = velocityTracker;
                if (i == 0) {
                    f3 = velocityTracker5.getXVelocity();
                } else if (i == 1) {
                    f3 = velocityTracker5.getYVelocity();
                } else {
                    C0044u c0044u3 = (C0044u) AbstractC0043t.f830a.get(velocityTracker5);
                    f3 = (c0044u3 == null || i != 26) ? RecyclerView.f2111C0 : c0044u3.f833c;
                }
            }
            NestedScrollView nestedScrollView = (NestedScrollView) c0032h.f809b.f10b;
            float f9 = f3 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f9);
            if (z2 || (signum != Math.signum(c0032h.f811d) && signum != RecyclerView.f2111C0)) {
                nestedScrollView.f1943d.abortAnimation();
            }
            if (Math.abs(f9) >= iArr[0]) {
                float max = Math.max(-r4, Math.min(f9, iArr[1]));
                if (max == RecyclerView.f2111C0) {
                    f4 = 0.0f;
                } else {
                    nestedScrollView.f1943d.abortAnimation();
                    nestedScrollView.j((int) max);
                    f4 = max;
                }
                c0032h.f811d = f4;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f1947k) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f1954r;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f1945g) > this.f1951o && (2 & getNestedScrollAxes()) == 0) {
                                this.f1947k = true;
                                this.f1945g = y2;
                                if (this.f1948l == null) {
                                    this.f1948l = VelocityTracker.obtain();
                                }
                                this.f1948l.addMovement(motionEvent);
                                this.f1957u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        o(motionEvent);
                    }
                }
            }
            this.f1947k = false;
            this.f1954r = -1;
            VelocityTracker velocityTracker = this.f1948l;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1948l = null;
            }
            if (this.f1943d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
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
                    this.f1945g = y3;
                    this.f1954r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1948l;
                    if (velocityTracker2 == null) {
                        this.f1948l = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1948l.addMovement(motionEvent);
                    this.f1943d.computeScrollOffset();
                    if (!v(motionEvent) && this.f1943d.isFinished()) {
                        z2 = false;
                    }
                    this.f1947k = z2;
                    this.f1961y.g(2, 0);
                }
            }
            if (!v(motionEvent) && this.f1943d.isFinished()) {
                z2 = false;
            }
            this.f1947k = z2;
            VelocityTracker velocityTracker3 = this.f1948l;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1948l = null;
            }
        }
        return this.f1947k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z2, i, i2, i3, i4);
        int i6 = 0;
        this.f1946h = false;
        View view = this.j;
        if (view != null && l(view, this)) {
            View view2 = this.j;
            Rect rect = this.f1942c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                scrollBy(0, h2);
            }
        }
        this.j = null;
        if (!this.i) {
            if (this.f1959w != null) {
                scrollTo(getScrollX(), this.f1959w.f1004a);
                this.f1959w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1949m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(RecyclerView.f2111C0, f3, true);
        j((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.f1961y.b(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.f1961y.c(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        n(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z2, boolean z3) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && m(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        this.f1959w = hVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f1004a = getScrollY();
        return hVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m(findFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f1942c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h2 = h(rect);
        if (h2 != 0) {
            if (this.f1950n) {
                u(0, h2, false);
            } else {
                scrollBy(0, h2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return g(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f1948l == null) {
            this.f1948l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1957u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f2 = this.f1957u;
        float f3 = RecyclerView.f2111C0;
        obtain.offsetLocation(RecyclerView.f2111C0, f2);
        C0035k c0035k = this.f1961y;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1944f;
            EdgeEffect edgeEffect2 = this.e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1948l;
                velocityTracker.computeCurrentVelocity(1000, this.f1953q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1954r);
                if (Math.abs(yVelocity) >= this.f1952p) {
                    if (AbstractC0078a.D(edgeEffect2) != RecyclerView.f2111C0) {
                        if (t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (AbstractC0078a.D(edgeEffect) != RecyclerView.f2111C0) {
                        int i = -yVelocity;
                        if (t(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            j(i);
                        }
                    } else {
                        int i2 = -yVelocity;
                        float f4 = i2;
                        if (!c0035k.b(RecyclerView.f2111C0, f4)) {
                            dispatchNestedFling(RecyclerView.f2111C0, f4, true);
                            j(i2);
                        }
                    }
                } else if (this.f1943d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1954r = -1;
                this.f1947k = false;
                VelocityTracker velocityTracker2 = this.f1948l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1948l = null;
                }
                w(0);
                this.e.onRelease();
                this.f1944f.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1954r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1954r + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i3 = this.f1945g - y2;
                    float x2 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i3 / getHeight();
                    if (AbstractC0078a.D(edgeEffect2) != RecyclerView.f2111C0) {
                        float f5 = -AbstractC0078a.T(edgeEffect2, -height, x2);
                        if (AbstractC0078a.D(edgeEffect2) == RecyclerView.f2111C0) {
                            edgeEffect2.onRelease();
                        }
                        f3 = f5;
                    } else if (AbstractC0078a.D(edgeEffect) != RecyclerView.f2111C0) {
                        float T2 = AbstractC0078a.T(edgeEffect, height, 1.0f - x2);
                        if (AbstractC0078a.D(edgeEffect) == RecyclerView.f2111C0) {
                            edgeEffect.onRelease();
                        }
                        f3 = T2;
                    }
                    int round = Math.round(f3 * getHeight());
                    if (round != 0) {
                        invalidate();
                    }
                    int i4 = i3 - round;
                    if (!this.f1947k && Math.abs(i4) > this.f1951o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1947k = true;
                        i4 = i4 > 0 ? i4 - this.f1951o : i4 + this.f1951o;
                    }
                    if (this.f1947k) {
                        int s2 = s(i4, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f1945g = y2 - s2;
                        this.f1957u += s2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1947k && getChildCount() > 0 && this.f1943d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1954r = -1;
                this.f1947k = false;
                VelocityTracker velocityTracker3 = this.f1948l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1948l = null;
                }
                w(0);
                this.e.onRelease();
                this.f1944f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1945g = (int) motionEvent.getY(actionIndex);
                this.f1954r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.f1945g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1954r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1947k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1943d.isFinished()) {
                this.f1943d.abortAnimation();
                w(1);
            }
            int y3 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f1945g = y3;
            this.f1954r = pointerId;
            c0035k.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1948l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            z2 = false;
        } else {
            i2 = 0;
            z2 = true;
        }
        if (i5 <= i4) {
            if (i5 >= 0) {
                i4 = i5;
                z3 = false;
                if (z3 && !this.f1961y.f(1)) {
                    this.f1943d.springBack(i2, i4, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i2, i4);
                return z2 || z3;
            }
            i4 = 0;
        }
        z3 = true;
        if (z3) {
            this.f1943d.springBack(i2, i4, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i2, i4);
        if (z2) {
            return true;
        }
    }

    public final void q(int i) {
        boolean z2 = i == 130;
        int height = getHeight();
        Rect rect = this.f1942c;
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
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        r(i, i2, i3);
    }

    public final boolean r(int i, int i2, int i3) {
        boolean z2;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z3 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z5 = i2 < top && bottom < i3;
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
        if (i2 < scrollY || i3 > i4) {
            s(z3 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f1946h) {
            this.j = view2;
        } else {
            Rect rect = this.f1942c;
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
                u(0, h2, false);
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f1948l) != null) {
            velocityTracker.recycle();
            this.f1948l = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1946h = true;
        super.requestLayout();
    }

    public final int s(int i, int i2, int i3, boolean z2) {
        int i4;
        int i5;
        boolean z3;
        VelocityTracker velocityTracker;
        C0035k c0035k = this.f1961y;
        if (i3 == 1) {
            c0035k.g(2, i3);
        }
        boolean c2 = this.f1961y.c(0, i, i3, this.f1956t, this.f1955s);
        int[] iArr = this.f1956t;
        int[] iArr2 = this.f1955s;
        if (c2) {
            i4 = i - iArr[1];
            i5 = iArr2[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2;
        boolean z5 = p(i4, 0, scrollY, scrollRange) && !c0035k.f(i3);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f1961y.d(0, scrollY2, 0, i4 - scrollY2, this.f1955s, i3, iArr);
        int i6 = i5 + iArr2[1];
        int i7 = i4 - iArr[1];
        int i8 = scrollY + i7;
        EdgeEffect edgeEffect = this.f1944f;
        EdgeEffect edgeEffect2 = this.e;
        if (i8 < 0) {
            if (z4) {
                AbstractC0078a.T(edgeEffect2, (-i7) / getHeight(), i2 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i8 > scrollRange && z4) {
            AbstractC0078a.T(edgeEffect, i7 / getHeight(), 1.0f - (i2 / getWidth()));
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
        if (z3 && i3 == 0 && (velocityTracker = this.f1948l) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            w(i3);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i6;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f1949m) {
            this.f1949m = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0035k c0035k = this.f1961y;
        if (c0035k.f823d) {
            WeakHashMap weakHashMap = K.f747a;
            B.m(c0035k.f822c);
        }
        c0035k.f823d = z2;
    }

    public void setOnScrollChangeListener(g gVar) {
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f1950n = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f1961y.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float D2 = AbstractC0078a.D(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f2 = this.f1940a * 0.015f;
        double log = Math.log(abs / f2);
        double d2 = f1936B;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * log) * ((double) f2))) < D2;
    }

    public final void u(int i, int i2, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1941b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1943d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                this.f1961y.g(2, 1);
            } else {
                w(1);
            }
            this.f1958v = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f1943d.isFinished()) {
                this.f1943d.abortAnimation();
                w(1);
            }
            scrollBy(i, i2);
        }
        this.f1941b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.e;
        if (AbstractC0078a.D(edgeEffect) != RecyclerView.f2111C0) {
            AbstractC0078a.T(edgeEffect, RecyclerView.f2111C0, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f1944f;
        if (AbstractC0078a.D(edgeEffect2) == RecyclerView.f2111C0) {
            return z2;
        }
        AbstractC0078a.T(edgeEffect2, RecyclerView.f2111C0, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i) {
        this.f1961y.h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
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
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
