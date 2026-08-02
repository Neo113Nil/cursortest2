package androidx.core.widget;

import O.AbstractC0327a0;
import O.AbstractC0329b0;
import O.C;
import O.C0337g;
import O.C0347q;
import O.C0349t;
import O.D;
import O.E;
import O.InterfaceC0348s;
import O.InterfaceC0354y;
import O.L;
import O.X;
import U.e;
import U.h;
import U.i;
import U.j;
import U.k;
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
import com.IceFishing.LiveIceFishing.C5248R;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.expressad.video.module.a.a;
import i1.C4585b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0348s, InterfaceC0354y {

    /* renamed from: U, reason: collision with root package name */
    public static final float f4666U = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: V, reason: collision with root package name */
    public static final h f4667V = new h(0);

    /* renamed from: W, reason: collision with root package name */
    public static final int[] f4668W = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public boolean f4669A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4670B;

    /* renamed from: C, reason: collision with root package name */
    public View f4671C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4672D;

    /* renamed from: E, reason: collision with root package name */
    public VelocityTracker f4673E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4674F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4675G;

    /* renamed from: H, reason: collision with root package name */
    public final int f4676H;

    /* renamed from: I, reason: collision with root package name */
    public final int f4677I;
    public final int J;

    /* renamed from: K, reason: collision with root package name */
    public int f4678K;

    /* renamed from: L, reason: collision with root package name */
    public final int[] f4679L;

    /* renamed from: M, reason: collision with root package name */
    public final int[] f4680M;

    /* renamed from: N, reason: collision with root package name */
    public int f4681N;

    /* renamed from: O, reason: collision with root package name */
    public int f4682O;

    /* renamed from: P, reason: collision with root package name */
    public k f4683P;

    /* renamed from: Q, reason: collision with root package name */
    public final C0349t f4684Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0347q f4685R;

    /* renamed from: S, reason: collision with root package name */
    public float f4686S;

    /* renamed from: T, reason: collision with root package name */
    public final C0337g f4687T;

    /* renamed from: n, reason: collision with root package name */
    public final float f4688n;

    /* renamed from: u, reason: collision with root package name */
    public long f4689u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f4690v;

    /* renamed from: w, reason: collision with root package name */
    public final OverScroller f4691w;

    /* renamed from: x, reason: collision with root package name */
    public final EdgeEffect f4692x;

    /* renamed from: y, reason: collision with root package name */
    public final EdgeEffect f4693y;

    /* renamed from: z, reason: collision with root package name */
    public int f4694z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5248R.attr.nestedScrollViewStyle);
        this.f4690v = new Rect();
        this.f4669A = true;
        this.f4670B = false;
        this.f4671C = null;
        this.f4672D = false;
        this.f4675G = true;
        this.f4678K = -1;
        this.f4679L = new int[2];
        this.f4680M = new int[2];
        this.f4687T = new C0337g(getContext(), new C4585b(14, this));
        int i = Build.VERSION.SDK_INT;
        this.f4692x = i >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f4693y = i >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f4688n = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f4691w = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4676H = viewConfiguration.getScaledTouchSlop();
        this.f4677I = viewConfiguration.getScaledMinimumFlingVelocity();
        this.J = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4668W, C5248R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f4684Q = new C0349t();
        this.f4685R = new C0347q(this);
        setNestedScrollingEnabled(true);
        X.o(this, f4667V);
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, nestedScrollView);
    }

    @Override // O.r
    public final void a(int i, View view) {
        C0349t c0349t = this.f4684Q;
        if (i == 1) {
            c0349t.f2222b = 0;
        } else {
            c0349t.f2221a = 0;
        }
        w(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // O.InterfaceC0348s
    public final void b(View view, int i, int i4, int i6, int i9, int i10, int[] iArr) {
        n(i9, i10, iArr);
    }

    @Override // O.r
    public final void c(View view, int i, int i4, int i6, int i9, int i10) {
        n(i9, i10, null);
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i;
        if (this.f4691w.isFinished()) {
            return;
        }
        this.f4691w.computeScrollOffset();
        int currY = this.f4691w.getCurrY();
        int i4 = currY - this.f4682O;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f4693y;
        EdgeEffect edgeEffect2 = this.f4692x;
        if (i4 <= 0 || com.bumptech.glide.h.e(edgeEffect2) == 0.0f) {
            if (i4 < 0 && com.bumptech.glide.h.e(edgeEffect) != 0.0f) {
                float f2 = height;
                round = Math.round(com.bumptech.glide.h.k(edgeEffect, (i4 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
                if (round != i4) {
                    edgeEffect.finish();
                }
            }
            int i6 = i4;
            this.f4682O = currY;
            int[] iArr = this.f4680M;
            iArr[1] = 0;
            this.f4685R.c(0, i6, 1, iArr, null);
            i = i6 - iArr[1];
            int scrollRange = getScrollRange();
            if (i != 0) {
                int scrollY = getScrollY();
                p(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i9 = i - scrollY2;
                iArr[1] = 0;
                this.f4685R.d(0, scrollY2, 0, i9, this.f4679L, 1, iArr);
                i = i9 - iArr[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f4691w.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f4691w.getCurrVelocity());
                    }
                }
                this.f4691w.abortAnimation();
                w(1);
            }
            if (this.f4691w.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = Math.round(com.bumptech.glide.h.k(edgeEffect2, ((-i4) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i4) {
            edgeEffect2.finish();
        }
        i4 -= round;
        int i62 = i4;
        this.f4682O = currY;
        int[] iArr2 = this.f4680M;
        iArr2[1] = 0;
        this.f4685R.c(0, i62, 1, iArr2, null);
        i = i62 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i != 0) {
        }
        if (i != 0) {
        }
        if (this.f4691w.isFinished()) {
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

    @Override // O.r
    public final boolean d(View view, View view2, int i, int i4) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f9, boolean z6) {
        return this.f4685R.a(f2, f9, z6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f9) {
        return this.f4685R.b(f2, f9);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i4, int[] iArr, int[] iArr2) {
        return this.f4685R.c(i, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i4, int i6, int i9, int[] iArr) {
        return this.f4685R.d(i, i4, i6, i9, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f4692x;
        int i4 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (i.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (i.a(this)) {
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
        EdgeEffect edgeEffect2 = this.f4693y;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (i.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i4 = getPaddingLeft();
        }
        if (i.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i4 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // O.r
    public final void e(View view, View view2, int i, int i4) {
        C0349t c0349t = this.f4684Q;
        if (i4 == 1) {
            c0349t.f2222b = i;
        } else {
            c0349t.f2221a = i;
        }
        this.f4685R.g(2, i4);
    }

    @Override // O.r
    public final void f(View view, int i, int i4, int[] iArr, int i6) {
        this.f4685R.c(i, i4, i6, iArr, null);
    }

    public final boolean g(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m(maxScrollAmount, getHeight(), findNextFocus)) {
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
            Rect rect = this.f4690v;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && !m(0, getHeight(), findFocus)) {
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
        C0349t c0349t = this.f4684Q;
        return c0349t.f2222b | c0349t.f2221a;
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
        if (this.f4686S == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f4686S = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f4686S;
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
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i6 = rect.bottom;
        if (i6 > i4 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i4, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i6 >= i4) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i4 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f4685R.f(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.f4690v.setEmpty();
        int childCount = getChildCount();
        int i = a.f22518U;
        if (childCount > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? k(33) : g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? k(a.f22518U) : g(a.f22518U);
                    }
                    if (keyCode == 62) {
                        if (keyEvent.isShiftPressed()) {
                            i = 33;
                        }
                        q(i);
                        return false;
                    }
                    if (keyCode == 92) {
                        return k(33);
                    }
                    if (keyCode == 93) {
                        return k(a.f22518U);
                    }
                    if (keyCode == 122) {
                        q(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        q(a.f22518U);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, a.f22518U);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(a.f22518U)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f4685R.f2216d;
    }

    public final void j(int i) {
        if (getChildCount() > 0) {
            this.f4691w.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f4685R.g(2, 1);
            this.f4682O = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final boolean k(int i) {
        int childCount;
        boolean z6 = i == 130;
        int height = getHeight();
        Rect rect = this.f4690v;
        rect.top = 0;
        rect.bottom = height;
        if (z6 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i, rect.top, rect.bottom);
    }

    public final boolean m(int i, int i4, View view) {
        Rect rect = this.f4690v;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i4;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i4, int i6, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i, int i4, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f4685R.d(0, scrollY2, 0, i - scrollY2, null, i4, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4678K) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4694z = (int) motionEvent.getY(i);
            this.f4678K = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f4673E;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4670B = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x012b, code lost:
    
        if (r2 >= 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00d7, code lost:
    
        if (r2 >= 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        int i;
        int i4;
        int i6;
        int i9;
        int i10;
        int scaledMaximumFlingVelocity;
        boolean z6;
        VelocityTracker velocityTracker;
        float f9;
        float f10;
        long j6;
        float f11;
        float sqrt;
        int i11;
        float f12;
        VelocityTracker velocityTracker2;
        int i12;
        float f13;
        if (motionEvent.getAction() != 8 || this.f4672D) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i = 9;
            f2 = motionEvent.getAxisValue(9);
            i4 = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            f2 = motionEvent.getAxisValue(26);
            i4 = getWidth() / 2;
            i = 26;
        } else {
            f2 = 0.0f;
            i = 0;
            i4 = 0;
        }
        if (f2 == 0.0f) {
            return false;
        }
        s(-((int) (getVerticalScrollFactorCompat() * f2)), i4, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i == 0) {
            return true;
        }
        C0337g c0337g = this.f4687T;
        c0337g.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i13 = c0337g.f2168f;
        int[] iArr = c0337g.f2170h;
        int i14 = 1;
        if (i13 == source && c0337g.f2169g == deviceId && c0337g.f2167e == i) {
            z6 = false;
            i6 = 20;
            i9 = 0;
        } else {
            Context context = c0337g.f2163a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            i6 = 20;
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i9 = 0;
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 34) {
                Method method = AbstractC0329b0.f2152a;
                i10 = AbstractC0327a0.b(viewConfiguration, deviceId2, i, source2);
            } else {
                Method method2 = AbstractC0329b0.f2152a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device != null && device.getMotionRange(i, source2) != null) {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID) : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        i10 = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier != 0) {
                        i10 = resources.getDimensionPixelSize(identifier);
                    }
                }
                i10 = Integer.MAX_VALUE;
            }
            iArr[0] = i10;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i15 >= 34) {
                scaledMaximumFlingVelocity = AbstractC0327a0.a(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if ((device2 == null || device2.getMotionRange(i, source3) == null) ? false : true) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID) : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 != 0) {
                        scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2);
                    }
                }
                scaledMaximumFlingVelocity = Integer.MIN_VALUE;
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c0337g.f2168f = source;
            c0337g.f2169g = deviceId;
            c0337g.f2167e = i;
            z6 = true;
        }
        if (iArr[i9] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker3 = c0337g.f2165c;
            if (velocityTracker3 == null) {
                return true;
            }
            velocityTracker3.recycle();
            c0337g.f2165c = null;
            return true;
        }
        if (c0337g.f2165c == null) {
            c0337g.f2165c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker4 = c0337g.f2165c;
        Map map = D.f2121a;
        velocityTracker4.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = D.f2121a;
            if (!map2.containsKey(velocityTracker4)) {
                map2.put(velocityTracker4, new E());
            }
            E e9 = (E) map2.get(velocityTracker4);
            e9.getClass();
            long eventTime = motionEvent.getEventTime();
            int i16 = e9.f2125d;
            long[] jArr = e9.f2123b;
            if (i16 != 0 && eventTime - jArr[e9.f2126e] > 40) {
                e9.f2125d = i9;
                e9.f2124c = 0.0f;
            }
            int i17 = (e9.f2126e + 1) % 20;
            e9.f2126e = i17;
            int i18 = e9.f2125d;
            if (i18 != i6) {
                e9.f2125d = i18 + 1;
            }
            e9.f2122a[i17] = motionEvent.getAxisValue(26);
            jArr[e9.f2126e] = eventTime;
        }
        float f14 = Float.MAX_VALUE;
        velocityTracker4.computeCurrentVelocity(1000, Float.MAX_VALUE);
        E e10 = (E) D.f2121a.get(velocityTracker4);
        if (e10 != null) {
            int i19 = e10.f2125d;
            if (i19 >= 2) {
                int i20 = e10.f2126e;
                int i21 = ((i20 + 20) - (i19 - 1)) % 20;
                long[] jArr2 = e10.f2123b;
                long j9 = jArr2[i20];
                while (true) {
                    j6 = jArr2[i21];
                    if (j9 - j6 <= 100) {
                        break;
                    }
                    e10.f2125d--;
                    i21 = (i21 + 1) % 20;
                }
                int i22 = e10.f2125d;
                if (i22 >= 2) {
                    float[] fArr = e10.f2122a;
                    if (i22 == 2) {
                        int i23 = (i21 + 1) % 20;
                        if (j6 != jArr2[i23]) {
                            velocityTracker = velocityTracker4;
                            f11 = Float.MAX_VALUE;
                            i11 = 1000;
                            sqrt = fArr[i23] / (r17 - j6);
                        }
                    } else {
                        float f15 = 0.0f;
                        int i24 = 0;
                        int i25 = 0;
                        while (true) {
                            if (i24 >= e10.f2125d - 1) {
                                break;
                            }
                            int i26 = i24 + i21;
                            long j10 = jArr2[i26 % 20];
                            int i27 = (i26 + 1) % 20;
                            if (jArr2[i27] == j10) {
                                velocityTracker2 = velocityTracker4;
                                f12 = f14;
                                i12 = i14;
                            } else {
                                i25++;
                                f12 = f14;
                                velocityTracker2 = velocityTracker4;
                                float sqrt2 = (f15 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f15) * 2.0f));
                                float f16 = fArr[i27] / (jArr2[i27] - j10);
                                float abs = (Math.abs(f16) * (f16 - sqrt2)) + f15;
                                i12 = i14;
                                if (i25 == i12) {
                                    abs *= 0.5f;
                                }
                                f15 = abs;
                            }
                            i24 += i12;
                            f14 = f12;
                            i14 = i12;
                            velocityTracker4 = velocityTracker2;
                        }
                        velocityTracker = velocityTracker4;
                        f11 = f14;
                        sqrt = ((float) Math.sqrt(Math.abs(f15) * 2.0f)) * (f15 < 0.0f ? -1.0f : 1.0f);
                        i11 = 1000;
                    }
                    f13 = sqrt * i11;
                    e10.f2124c = f13;
                    if (f13 >= (-Math.abs(f11))) {
                        e10.f2124c = -Math.abs(f11);
                    } else if (e10.f2124c > Math.abs(f11)) {
                        e10.f2124c = Math.abs(f11);
                    }
                }
            }
            velocityTracker = velocityTracker4;
            f11 = Float.MAX_VALUE;
            i11 = 1000;
            sqrt = 0.0f;
            f13 = sqrt * i11;
            e10.f2124c = f13;
            if (f13 >= (-Math.abs(f11))) {
            }
        } else {
            velocityTracker = velocityTracker4;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            f9 = C.a(velocityTracker, i);
        } else {
            VelocityTracker velocityTracker5 = velocityTracker;
            if (i == 0) {
                f9 = velocityTracker5.getXVelocity();
            } else if (i == 1) {
                f9 = velocityTracker5.getYVelocity();
            } else {
                E e11 = (E) D.f2121a.get(velocityTracker5);
                f9 = (e11 == null || i != 26) ? 0.0f : e11.f2124c;
            }
        }
        NestedScrollView nestedScrollView = (NestedScrollView) c0337g.f2164b.f38152u;
        float f17 = f9 * (-nestedScrollView.getVerticalScrollFactorCompat());
        float signum = Math.signum(f17);
        if (z6 || (signum != Math.signum(c0337g.f2166d) && signum != 0.0f)) {
            nestedScrollView.f4691w.abortAnimation();
        }
        if (Math.abs(f17) < iArr[0]) {
            return true;
        }
        float max = Math.max(-r3, Math.min(f17, iArr[1]));
        if (max == 0.0f) {
            f10 = 0.0f;
        } else {
            nestedScrollView.f4691w.abortAnimation();
            nestedScrollView.j((int) max);
            f10 = max;
        }
        c0337g.f2166d = f10;
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action == 2 && this.f4672D) {
            return true;
        }
        int i = action & p.f9259b;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i4 = this.f4678K;
                    if (i4 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i4);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i4 + " in onInterceptTouchEvent");
                        } else {
                            int y7 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y7 - this.f4694z) > this.f4676H && (2 & getNestedScrollAxes()) == 0) {
                                this.f4672D = true;
                                this.f4694z = y7;
                                if (this.f4673E == null) {
                                    this.f4673E = VelocityTracker.obtain();
                                }
                                this.f4673E.addMovement(motionEvent);
                                this.f4681N = 0;
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
            this.f4672D = false;
            this.f4678K = -1;
            VelocityTracker velocityTracker = this.f4673E;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f4673E = null;
            }
            if (this.f4691w.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y9 = (int) motionEvent.getY();
            int x9 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y9 >= childAt.getTop() - scrollY && y9 < childAt.getBottom() - scrollY && x9 >= childAt.getLeft() && x9 < childAt.getRight()) {
                    this.f4694z = y9;
                    this.f4678K = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f4673E;
                    if (velocityTracker2 == null) {
                        this.f4673E = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f4673E.addMovement(motionEvent);
                    this.f4691w.computeScrollOffset();
                    if (!v(motionEvent) && this.f4691w.isFinished()) {
                        z6 = false;
                    }
                    this.f4672D = z6;
                    this.f4685R.g(2, 0);
                }
            }
            if (!v(motionEvent) && this.f4691w.isFinished()) {
                z6 = false;
            }
            this.f4672D = z6;
            VelocityTracker velocityTracker3 = this.f4673E;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f4673E = null;
            }
        }
        return this.f4672D;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        int i10;
        super.onLayout(z6, i, i4, i6, i9);
        int i11 = 0;
        this.f4669A = false;
        View view = this.f4671C;
        if (view != null && l(view, this)) {
            View view2 = this.f4671C;
            Rect rect = this.f4690v;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h3 = h(rect);
            if (h3 != 0) {
                scrollBy(0, h3);
            }
        }
        this.f4671C = null;
        if (!this.f4670B) {
            if (this.f4683P != null) {
                scrollTo(getScrollX(), this.f4683P.f3244n);
                this.f4683P = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i10 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i10 = 0;
            }
            int paddingTop = ((i9 - i4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i10 && scrollY >= 0) {
                i11 = paddingTop + scrollY > i10 ? i10 - paddingTop : scrollY;
            }
            if (i11 != scrollY) {
                scrollTo(getScrollX(), i11);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f4670B = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (this.f4674F && View.MeasureSpec.getMode(i4) != 0 && getChildCount() > 0) {
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
    public final boolean onNestedFling(View view, float f2, float f9, boolean z6) {
        if (z6) {
            return false;
        }
        dispatchNestedFling(0.0f, f9, true);
        j((int) f9);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f9) {
        return this.f4685R.b(f2, f9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i4, int[] iArr) {
        this.f4685R.c(i, i4, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i4, int i6, int i9) {
        n(i9, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        e(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i4, boolean z6, boolean z9) {
        super.scrollTo(i, i4);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = a.f22518U;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && m(0, getHeight(), findNextFocus)) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        this.f4683P = kVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f3244n = getScrollY();
        return kVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i4, int i6, int i9) {
        super.onScrollChanged(i, i4, i6, i9);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i6, int i9) {
        super.onSizeChanged(i, i4, i6, i9);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m(0, i9, findFocus)) {
            return;
        }
        Rect rect = this.f4690v;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h3 = h(rect);
        if (h3 != 0) {
            if (this.f4675G) {
                u(0, h3, false);
            } else {
                scrollBy(0, h3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return d(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        a(0, view);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f4673E == null) {
            this.f4673E = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4681N = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f2 = 0.0f;
        obtain.offsetLocation(0.0f, this.f4681N);
        C0347q c0347q = this.f4685R;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f4693y;
            EdgeEffect edgeEffect2 = this.f4692x;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f4673E;
                velocityTracker.computeCurrentVelocity(1000, this.J);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f4678K);
                if (Math.abs(yVelocity) >= this.f4677I) {
                    if (com.bumptech.glide.h.e(edgeEffect2) != 0.0f) {
                        if (t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (com.bumptech.glide.h.e(edgeEffect) != 0.0f) {
                        int i = -yVelocity;
                        if (t(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            j(i);
                        }
                    } else {
                        int i4 = -yVelocity;
                        float f9 = i4;
                        if (!c0347q.b(0.0f, f9)) {
                            dispatchNestedFling(0.0f, f9, true);
                            j(i4);
                        }
                    }
                } else if (this.f4691w.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f4678K = -1;
                this.f4672D = false;
                VelocityTracker velocityTracker2 = this.f4673E;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f4673E = null;
                }
                w(0);
                this.f4692x.onRelease();
                this.f4693y.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f4678K);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f4678K + " in onTouchEvent");
                } else {
                    int y7 = (int) motionEvent.getY(findPointerIndex);
                    int i6 = this.f4694z - y7;
                    float x9 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i6 / getHeight();
                    if (com.bumptech.glide.h.e(edgeEffect2) != 0.0f) {
                        float f10 = -com.bumptech.glide.h.k(edgeEffect2, -height, x9);
                        if (com.bumptech.glide.h.e(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f2 = f10;
                    } else if (com.bumptech.glide.h.e(edgeEffect) != 0.0f) {
                        float k9 = com.bumptech.glide.h.k(edgeEffect, height, 1.0f - x9);
                        if (com.bumptech.glide.h.e(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f2 = k9;
                    }
                    int round = Math.round(f2 * getHeight());
                    if (round != 0) {
                        invalidate();
                    }
                    int i9 = i6 - round;
                    if (!this.f4672D && Math.abs(i9) > this.f4676H) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f4672D = true;
                        i9 = i9 > 0 ? i9 - this.f4676H : i9 + this.f4676H;
                    }
                    if (this.f4672D) {
                        int s9 = s(i9, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f4694z = y7 - s9;
                        this.f4681N += s9;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f4672D && getChildCount() > 0 && this.f4691w.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f4678K = -1;
                this.f4672D = false;
                VelocityTracker velocityTracker3 = this.f4673E;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f4673E = null;
                }
                w(0);
                this.f4692x.onRelease();
                this.f4693y.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f4694z = (int) motionEvent.getY(actionIndex);
                this.f4678K = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.f4694z = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f4678K));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f4672D && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f4691w.isFinished()) {
                this.f4691w.abortAnimation();
                w(1);
            }
            int y9 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f4694z = y9;
            this.f4678K = pointerId;
            c0347q.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f4673E;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(int i, int i4, int i6, int i9) {
        int i10;
        boolean z6;
        int i11;
        boolean z9;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i12 = i6 + i;
        if (i4 <= 0 && i4 >= 0) {
            i10 = i4;
            z6 = false;
        } else {
            i10 = 0;
            z6 = true;
        }
        if (i12 > i9) {
            i11 = i9;
        } else {
            if (i12 >= 0) {
                i11 = i12;
                z9 = false;
                if (z9 && !this.f4685R.f(1)) {
                    this.f4691w.springBack(i10, i11, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i10, i11);
                return !z6 || z9;
            }
            i11 = 0;
        }
        z9 = true;
        if (z9) {
            this.f4691w.springBack(i10, i11, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i10, i11);
        if (z6) {
        }
    }

    public final void q(int i) {
        boolean z6 = i == 130;
        int height = getHeight();
        Rect rect = this.f4690v;
        if (z6) {
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
        int i4 = rect.top;
        int i6 = height + i4;
        rect.bottom = i6;
        r(i, i4, i6);
    }

    public final boolean r(int i, int i4, int i6) {
        boolean z6;
        int height = getHeight();
        int scrollY = getScrollY();
        int i9 = height + scrollY;
        boolean z9 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = focusables.get(i10);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top < i6) {
                boolean z11 = i4 < top && bottom < i6;
                if (view == null) {
                    view = view2;
                    z10 = z11;
                } else {
                    boolean z12 = (z9 && top < view.getTop()) || (!z9 && bottom > view.getBottom());
                    if (z10) {
                        if (z11) {
                            if (!z12) {
                            }
                            view = view2;
                        }
                    } else if (z11) {
                        view = view2;
                        z10 = true;
                    } else {
                        if (!z12) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i4 < scrollY || i6 > i9) {
            s(z9 ? i4 - scrollY : i6 - i9, 0, 1, true);
            z6 = true;
        } else {
            z6 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f4669A) {
            this.f4671C = view2;
        } else {
            Rect rect = this.f4690v;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h3 = h(rect);
            if (h3 != 0) {
                scrollBy(0, h3);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h3 = h(rect);
        boolean z9 = h3 != 0;
        if (z9) {
            if (z6) {
                scrollBy(0, h3);
                return z9;
            }
            u(0, h3, false);
        }
        return z9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        VelocityTracker velocityTracker;
        if (z6 && (velocityTracker = this.f4673E) != null) {
            velocityTracker.recycle();
            this.f4673E = null;
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4669A = true;
        super.requestLayout();
    }

    public final int s(int i, int i4, int i6, boolean z6) {
        int i9;
        int i10;
        boolean z9;
        VelocityTracker velocityTracker;
        C0347q c0347q = this.f4685R;
        if (i6 == 1) {
            c0347q.g(2, i6);
        }
        boolean c9 = this.f4685R.c(0, i, i6, this.f4680M, this.f4679L);
        int[] iArr = this.f4680M;
        int[] iArr2 = this.f4679L;
        if (c9) {
            i9 = i - iArr[1];
            i10 = iArr2[1];
        } else {
            i9 = i;
            i10 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z10 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z6;
        boolean z11 = p(i9, 0, scrollY, scrollRange) && !c0347q.f(i6);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f4685R.d(0, scrollY2, 0, i9 - scrollY2, this.f4679L, i6, iArr);
        int i11 = i10 + iArr2[1];
        int i12 = i9 - iArr[1];
        int i13 = scrollY + i12;
        EdgeEffect edgeEffect = this.f4693y;
        EdgeEffect edgeEffect2 = this.f4692x;
        if (i13 < 0) {
            if (z10) {
                com.bumptech.glide.h.k(edgeEffect2, (-i12) / getHeight(), i4 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i13 > scrollRange && z10) {
            com.bumptech.glide.h.k(edgeEffect, i12 / getHeight(), 1.0f - (i4 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z9 = z11;
        } else {
            postInvalidateOnAnimation();
            z9 = false;
        }
        if (z9 && i6 == 0 && (velocityTracker = this.f4673E) != null) {
            velocityTracker.clear();
        }
        if (i6 == 1) {
            w(i6);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i11;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i4) {
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
            if (height >= height2 || i4 < 0) {
                i4 = 0;
            } else if (height + i4 > height2) {
                i4 = height2 - height;
            }
            if (i == getScrollX() && i4 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i4);
        }
    }

    public void setFillViewport(boolean z6) {
        if (z6 != this.f4674F) {
            this.f4674F = z6;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        C0347q c0347q = this.f4685R;
        if (c0347q.f2216d) {
            WeakHashMap weakHashMap = X.f2142a;
            L.z(c0347q.f2215c);
        }
        c0347q.f2216d = z6;
    }

    public void setSmoothScrollingEnabled(boolean z6) {
        this.f4675G = z6;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f4685R.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float e9 = com.bumptech.glide.h.e(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f2 = this.f4688n * 0.015f;
        double log = Math.log(abs / f2);
        double d9 = f4666U;
        return ((float) (Math.exp((d9 / (d9 - 1.0d)) * log) * ((double) f2))) < e9;
    }

    public final void u(int i, int i4, boolean z6) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f4689u > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f4691w.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i4 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z6) {
                this.f4685R.g(2, 1);
            } else {
                w(1);
            }
            this.f4682O = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f4691w.isFinished()) {
                this.f4691w.abortAnimation();
                w(1);
            }
            scrollBy(i, i4);
        }
        this.f4689u = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z6;
        EdgeEffect edgeEffect = this.f4692x;
        if (com.bumptech.glide.h.e(edgeEffect) != 0.0f) {
            com.bumptech.glide.h.k(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z6 = true;
        } else {
            z6 = false;
        }
        EdgeEffect edgeEffect2 = this.f4693y;
        if (com.bumptech.glide.h.e(edgeEffect2) == 0.0f) {
            return z6;
        }
        com.bumptech.glide.h.k(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i) {
        this.f4685R.h(i);
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

    public void setOnScrollChangeListener(j jVar) {
    }
}
