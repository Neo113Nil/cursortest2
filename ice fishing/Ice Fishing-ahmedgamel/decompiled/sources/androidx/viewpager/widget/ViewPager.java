package androidx.viewpager.widget;

import A3.o;
import G0.a;
import G0.b;
import G0.c;
import G0.d;
import G0.e;
import G0.f;
import G0.g;
import G0.h;
import G0.i;
import O.L;
import O.X;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.anythink.basead.exoplayer.k.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] C0 = {R.attr.layout_gravity};

    /* renamed from: D0, reason: collision with root package name */
    public static final o f5269D0 = new o(2);

    /* renamed from: E0, reason: collision with root package name */
    public static final b f5270E0 = new b(0);

    /* renamed from: F0, reason: collision with root package name */
    public static final o f5271F0 = new o(3);

    /* renamed from: A, reason: collision with root package name */
    public Parcelable f5272A;

    /* renamed from: A0, reason: collision with root package name */
    public final c f5273A0;

    /* renamed from: B, reason: collision with root package name */
    public final Scroller f5274B;

    /* renamed from: B0, reason: collision with root package name */
    public int f5275B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f5276C;

    /* renamed from: D, reason: collision with root package name */
    public h f5277D;

    /* renamed from: E, reason: collision with root package name */
    public int f5278E;

    /* renamed from: F, reason: collision with root package name */
    public Drawable f5279F;

    /* renamed from: G, reason: collision with root package name */
    public int f5280G;

    /* renamed from: H, reason: collision with root package name */
    public int f5281H;

    /* renamed from: I, reason: collision with root package name */
    public float f5282I;
    public float J;

    /* renamed from: K, reason: collision with root package name */
    public int f5283K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f5284L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f5285M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f5286N;

    /* renamed from: O, reason: collision with root package name */
    public int f5287O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f5288P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f5289Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f5290R;

    /* renamed from: S, reason: collision with root package name */
    public int f5291S;

    /* renamed from: T, reason: collision with root package name */
    public final int f5292T;

    /* renamed from: U, reason: collision with root package name */
    public float f5293U;

    /* renamed from: V, reason: collision with root package name */
    public float f5294V;

    /* renamed from: W, reason: collision with root package name */
    public float f5295W;

    /* renamed from: i0, reason: collision with root package name */
    public float f5296i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f5297j0;

    /* renamed from: k0, reason: collision with root package name */
    public VelocityTracker f5298k0;

    /* renamed from: l0, reason: collision with root package name */
    public final int f5299l0;
    public final int m0;

    /* renamed from: n, reason: collision with root package name */
    public int f5300n;

    /* renamed from: n0, reason: collision with root package name */
    public final int f5301n0;

    /* renamed from: o0, reason: collision with root package name */
    public final int f5302o0;

    /* renamed from: p0, reason: collision with root package name */
    public final EdgeEffect f5303p0;

    /* renamed from: q0, reason: collision with root package name */
    public final EdgeEffect f5304q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f5305r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f5306s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f5307t0;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f5308u;

    /* renamed from: u0, reason: collision with root package name */
    public ArrayList f5309u0;

    /* renamed from: v, reason: collision with root package name */
    public final e f5310v;

    /* renamed from: v0, reason: collision with root package name */
    public g f5311v0;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f5312w;

    /* renamed from: w0, reason: collision with root package name */
    public G3.e f5313w0;

    /* renamed from: x, reason: collision with root package name */
    public a f5314x;

    /* renamed from: x0, reason: collision with root package name */
    public int f5315x0;

    /* renamed from: y, reason: collision with root package name */
    public int f5316y;

    /* renamed from: y0, reason: collision with root package name */
    public int f5317y0;

    /* renamed from: z, reason: collision with root package name */
    public int f5318z;

    /* renamed from: z0, reason: collision with root package name */
    public ArrayList f5319z0;

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5308u = new ArrayList();
        this.f5310v = new e();
        this.f5312w = new Rect();
        this.f5318z = -1;
        this.f5272A = null;
        this.f5282I = -3.4028235E38f;
        this.J = Float.MAX_VALUE;
        this.f5287O = 1;
        this.f5297j0 = -1;
        this.f5305r0 = true;
        this.f5273A0 = new c(0, this);
        this.f5275B0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f5274B = new Scroller(context2, f5270E0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f2 = context2.getResources().getDisplayMetrics().density;
        this.f5292T = viewConfiguration.getScaledPagingTouchSlop();
        this.f5299l0 = (int) (400.0f * f2);
        this.m0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5303p0 = new EdgeEffect(context2);
        this.f5304q0 = new EdgeEffect(context2);
        this.f5301n0 = (int) (25.0f * f2);
        this.f5302o0 = (int) (2.0f * f2);
        this.f5290R = (int) (f2 * 16.0f);
        X.o(this, new A3.a(2, this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        L.u(this, new S0.c(this));
    }

    public static boolean c(int i, int i4, int i6, View view, boolean z6) {
        int i9;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i10 = i4 + scrollX;
                if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && (i9 = i6 + scrollY) >= childAt.getTop() && i9 < childAt.getBottom() && c(i, i10 - childAt.getLeft(), i9 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        return z6 && view.canScrollHorizontally(-i);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z6) {
        if (this.f5285M != z6) {
            this.f5285M = z6;
        }
    }

    public final e a(int i, int i4) {
        e eVar = new e();
        eVar.f1059b = i;
        eVar.f1058a = this.f5314x.c(this, i);
        this.f5314x.getClass();
        eVar.f1061d = 1.0f;
        ArrayList arrayList = this.f5308u;
        if (i4 < 0 || i4 >= arrayList.size()) {
            arrayList.add(eVar);
            return eVar;
        }
        arrayList.add(i4, eVar);
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i4) {
        e h3;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() == 0 && (h3 = h(childAt)) != null && h3.f1059b == this.f5316y) {
                    childAt.addFocusables(arrayList, i, i4);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i4 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        e h3;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (h3 = h(childAt)) != null && h3.f1059b == this.f5316y) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        f fVar = (f) layoutParams;
        boolean z6 = fVar.f1063a | (view.getClass().getAnnotation(d.class) != null);
        fVar.f1063a = z6;
        if (!this.f5284L) {
            super.addView(view, i, layoutParams);
        } else {
            if (z6) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            fVar.f1066d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i) {
        View findNextFocus;
        boolean z6;
        int i4;
        boolean requestFocus;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
            boolean z9 = true;
            z6 = false;
            if (findNextFocus == null && findNextFocus != findFocus) {
                Rect rect = this.f5312w;
                if (i == 17) {
                    int i6 = g(rect, findNextFocus).left;
                    int i9 = g(rect, findFocus).left;
                    if (findFocus == null || i6 < i9) {
                        requestFocus = findNextFocus.requestFocus();
                    } else {
                        int i10 = this.f5316y;
                        if (i10 > 0) {
                            this.f5286N = false;
                            u(i10 - 1, 0, true, false);
                            z6 = z9;
                        }
                        z9 = false;
                        z6 = z9;
                    }
                } else if (i == 66) {
                    requestFocus = (findFocus == null || g(rect, findNextFocus).left > g(rect, findFocus).left) ? findNextFocus.requestFocus() : m();
                }
                z6 = requestFocus;
            } else if (i != 17 || i == 1) {
                i4 = this.f5316y;
                if (i4 > 0) {
                    this.f5286N = false;
                    u(i4 - 1, 0, true, false);
                    z6 = z9;
                }
                z9 = false;
                z6 = z9;
            } else if (i == 66 || i == 2) {
                z6 = m();
            }
            if (z6) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
            }
            return z6;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        boolean z92 = true;
        z6 = false;
        if (findNextFocus == null) {
        }
        if (i != 17) {
        }
        i4 = this.f5316y;
        if (i4 > 0) {
        }
        z92 = false;
        z6 = z92;
        if (z6) {
        }
        return z6;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.f5314x == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f5282I)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.J));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f5276C = true;
        Scroller scroller = this.f5274B;
        if (scroller.isFinished() || !scroller.computeScrollOffset()) {
            d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = scroller.getCurrX();
        int currY = scroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!n(currX)) {
                scroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = X.f2142a;
        postInvalidateOnAnimation();
    }

    public final void d(boolean z6) {
        Scroller scroller = this.f5274B;
        boolean z9 = this.f5275B0 == 2;
        if (z9) {
            setScrollingCacheEnabled(false);
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        n(currX);
                    }
                }
            }
        }
        this.f5286N = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5308u;
            if (i >= arrayList.size()) {
                break;
            }
            e eVar = (e) arrayList.get(i);
            if (eVar.f1060c) {
                eVar.f1060c = false;
                z9 = true;
            }
            i++;
        }
        if (z9) {
            c cVar = this.f5273A0;
            if (!z6) {
                cVar.run();
            } else {
                WeakHashMap weakHashMap = X.f2142a;
                postOnAnimation(cVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z6;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        z6 = keyEvent.hasModifiers(2) ? m() : b(66);
                    } else if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            z6 = b(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            z6 = b(1);
                        }
                    }
                    if (!z6) {
                        return false;
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        int i = this.f5316y;
                        if (i > 0) {
                            this.f5286N = false;
                            u(i - 1, 0, true, false);
                            z6 = true;
                        }
                    } else {
                        z6 = b(17);
                    }
                    if (!z6) {
                    }
                }
            }
            z6 = false;
            if (!z6) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        e h3;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (h3 = h(childAt)) != null && h3.f1059b == this.f5316y && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        a aVar;
        EdgeEffect edgeEffect = this.f5304q0;
        EdgeEffect edgeEffect2 = this.f5303p0;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z6 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f5314x) != null && aVar.b() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f5282I * width);
                edgeEffect2.setSize(height, width);
                z6 = edgeEffect2.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!edgeEffect.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.J + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                z6 |= edgeEffect.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (z6) {
            WeakHashMap weakHashMap = X.f2142a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5279F;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        int b9 = this.f5314x.b();
        this.f5300n = b9;
        ArrayList arrayList = this.f5308u;
        boolean z6 = arrayList.size() < (this.f5287O * 2) + 1 && arrayList.size() < b9;
        int i = this.f5316y;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            e eVar = (e) arrayList.get(i4);
            a aVar = this.f5314x;
            Object obj = eVar.f1058a;
            aVar.getClass();
        }
        Collections.sort(arrayList, f5269D0);
        if (z6) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                f fVar = (f) getChildAt(i6).getLayoutParams();
                if (!fVar.f1063a) {
                    fVar.f1065c = 0.0f;
                }
            }
            u(i, 0, false, true);
            requestLayout();
        }
    }

    public final void f(int i) {
        g gVar = this.f5311v0;
        if (gVar != null) {
            gVar.b(i);
        }
        ArrayList arrayList = this.f5309u0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                g gVar2 = (g) this.f5309u0.get(i4);
                if (gVar2 != null) {
                    gVar2.b(i);
                }
            }
        }
    }

    public final Rect g(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        f fVar = new f(-1, -1);
        fVar.f1065c = 0.0f;
        return fVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f5314x;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i4) {
        if (this.f5317y0 == 2) {
            i4 = (i - 1) - i4;
        }
        return ((f) ((View) this.f5319z0.get(i4)).getLayoutParams()).f1068f;
    }

    public int getCurrentItem() {
        return this.f5316y;
    }

    public int getOffscreenPageLimit() {
        return this.f5287O;
    }

    public int getPageMargin() {
        return this.f5278E;
    }

    public final e h(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5308u;
            if (i >= arrayList.size()) {
                return null;
            }
            e eVar = (e) arrayList.get(i);
            if (this.f5314x.d(view, eVar.f1058a)) {
                return eVar;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e i() {
        e eVar;
        int i;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f9 = clientWidth > 0 ? this.f5278E / clientWidth : 0.0f;
        int i4 = 0;
        boolean z6 = true;
        e eVar2 = null;
        int i6 = -1;
        float f10 = 0.0f;
        while (true) {
            ArrayList arrayList = this.f5308u;
            if (i4 >= arrayList.size()) {
                break;
            }
            e eVar3 = (e) arrayList.get(i4);
            if (z6 || eVar3.f1059b == (i = i6 + 1)) {
                eVar = eVar3;
            } else {
                float f11 = f2 + f10 + f9;
                e eVar4 = this.f5310v;
                eVar4.f1062e = f11;
                eVar4.f1059b = i;
                this.f5314x.getClass();
                eVar4.f1061d = 1.0f;
                i4--;
                eVar = eVar4;
            }
            f2 = eVar.f1062e;
            float f12 = eVar.f1061d + f2 + f9;
            if (!z6 && scrollX < f2) {
                break;
            }
            if (scrollX < f12 || i4 == arrayList.size() - 1) {
                break;
            }
            int i9 = eVar.f1059b;
            float f13 = eVar.f1061d;
            i4++;
            e eVar5 = eVar;
            i6 = i9;
            f10 = f13;
            eVar2 = eVar5;
            z6 = false;
        }
        return eVar;
    }

    public final e j(int i) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f5308u;
            if (i4 >= arrayList.size()) {
                return null;
            }
            e eVar = (e) arrayList.get(i4);
            if (eVar.f1059b == i) {
                return eVar;
            }
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i, int i4, float f2) {
        int max;
        int i6;
        int left;
        if (this.f5307t0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.f1063a) {
                    int i10 = fVar.f1064b & 7;
                    if (i10 != 1) {
                        if (i10 == 3) {
                            i6 = childAt.getWidth() + paddingLeft;
                        } else if (i10 != 5) {
                            i6 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i6;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i11 = max;
                    i6 = paddingLeft;
                    paddingLeft = i11;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i6;
                }
            }
        }
        g gVar = this.f5311v0;
        if (gVar != null) {
            gVar.a(i);
        }
        ArrayList arrayList = this.f5309u0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                g gVar2 = (g) this.f5309u0.get(i12);
                if (gVar2 != null) {
                    gVar2.a(i);
                }
            }
        }
        if (this.f5313w0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = getChildAt(i13);
                if (!((f) childAt2.getLayoutParams()).f1063a) {
                    float left2 = (childAt2.getLeft() - scrollX2) / getClientWidth();
                    this.f5313w0.getClass();
                    childAt2.setScaleY(1.0f - (Math.abs(left2) * 0.100000024f));
                    childAt2.setScaleX((Math.abs(left2) * 0.100000024f) + 0.9f);
                }
            }
        }
        this.f5306s0 = true;
    }

    public final void l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5297j0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f5293U = motionEvent.getX(i);
            this.f5297j0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f5298k0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean m() {
        a aVar = this.f5314x;
        if (aVar == null || this.f5316y >= aVar.b() - 1) {
            return false;
        }
        int i = this.f5316y + 1;
        this.f5286N = false;
        u(i, 0, true, false);
        return true;
    }

    public final boolean n(int i) {
        if (this.f5308u.size() == 0) {
            if (!this.f5305r0) {
                this.f5306s0 = false;
                k(0, 0, 0.0f);
                if (!this.f5306s0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        e i4 = i();
        int clientWidth = getClientWidth();
        int i6 = this.f5278E;
        int i9 = clientWidth + i6;
        float f2 = clientWidth;
        int i10 = i4.f1059b;
        float f9 = ((i / f2) - i4.f1062e) / (i4.f1061d + (i6 / f2));
        this.f5306s0 = false;
        k(i10, (int) (i9 * f9), f9);
        if (this.f5306s0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean o(float f2) {
        boolean z6;
        boolean z9;
        float f9 = this.f5293U - f2;
        this.f5293U = f2;
        float scrollX = getScrollX() + f9;
        float clientWidth = getClientWidth();
        float f10 = this.f5282I * clientWidth;
        float f11 = this.J * clientWidth;
        ArrayList arrayList = this.f5308u;
        boolean z10 = false;
        e eVar = (e) arrayList.get(0);
        e eVar2 = (e) arrayList.get(arrayList.size() - 1);
        if (eVar.f1059b != 0) {
            f10 = eVar.f1062e * clientWidth;
            z6 = false;
        } else {
            z6 = true;
        }
        if (eVar2.f1059b != this.f5314x.b() - 1) {
            f11 = eVar2.f1062e * clientWidth;
            z9 = false;
        } else {
            z9 = true;
        }
        if (scrollX < f10) {
            if (z6) {
                this.f5303p0.onPull(Math.abs(f10 - scrollX) / clientWidth);
                z10 = true;
            }
            scrollX = f10;
        } else if (scrollX > f11) {
            if (z9) {
                this.f5304q0.onPull(Math.abs(scrollX - f11) / clientWidth);
                z10 = true;
            }
            scrollX = f11;
        }
        int i = (int) scrollX;
        this.f5293U = (scrollX - i) + this.f5293U;
        scrollTo(i, getScrollY());
        n(i);
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5305r0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f5273A0);
        Scroller scroller = this.f5274B;
        if (scroller != null && !scroller.isFinished()) {
            this.f5274B.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f2;
        ArrayList arrayList;
        int i4;
        super.onDraw(canvas);
        if (this.f5278E <= 0 || this.f5279F == null) {
            return;
        }
        ArrayList arrayList2 = this.f5308u;
        if (arrayList2.size() <= 0 || this.f5314x == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f9 = this.f5278E / width;
        int i6 = 0;
        e eVar = (e) arrayList2.get(0);
        float f10 = eVar.f1062e;
        int size = arrayList2.size();
        int i9 = eVar.f1059b;
        int i10 = ((e) arrayList2.get(size - 1)).f1059b;
        while (i9 < i10) {
            while (true) {
                i = eVar.f1059b;
                if (i9 <= i || i6 >= size) {
                    break;
                }
                i6++;
                eVar = (e) arrayList2.get(i6);
            }
            if (i9 == i) {
                float f11 = eVar.f1062e;
                float f12 = eVar.f1061d;
                f2 = (f11 + f12) * width;
                f10 = f11 + f12 + f9;
            } else {
                this.f5314x.getClass();
                f2 = (f10 + 1.0f) * width;
                f10 = 1.0f + f9 + f10;
            }
            if (this.f5278E + f2 > scrollX) {
                arrayList = arrayList2;
                i4 = scrollX;
                this.f5279F.setBounds(Math.round(f2), this.f5280G, Math.round(this.f5278E + f2), this.f5281H);
                this.f5279F.draw(canvas);
            } else {
                arrayList = arrayList2;
                i4 = scrollX;
            }
            if (f2 > i4 + r3) {
                return;
            }
            i9++;
            arrayList2 = arrayList;
            scrollX = i4;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = this.f5292T;
        Scroller scroller = this.f5274B;
        int action = motionEvent.getAction() & p.f9259b;
        if (action == 3 || action == 1) {
            s();
            return false;
        }
        if (action != 0) {
            if (this.f5288P) {
                return true;
            }
            if (this.f5289Q) {
                return false;
            }
        }
        if (action == 0) {
            float x9 = motionEvent.getX();
            this.f5295W = x9;
            this.f5293U = x9;
            float y7 = motionEvent.getY();
            this.f5296i0 = y7;
            this.f5294V = y7;
            this.f5297j0 = motionEvent.getPointerId(0);
            this.f5289Q = false;
            this.f5276C = true;
            scroller.computeScrollOffset();
            if (this.f5275B0 != 2 || Math.abs(scroller.getFinalX() - scroller.getCurrX()) <= this.f5302o0) {
                d(false);
                this.f5288P = false;
            } else {
                scroller.abortAnimation();
                this.f5286N = false;
                p();
                this.f5288P = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i4 = this.f5297j0;
            if (i4 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i4);
                float x10 = motionEvent.getX(findPointerIndex);
                float f2 = x10 - this.f5293U;
                float abs = Math.abs(f2);
                float y9 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y9 - this.f5296i0);
                if (f2 != 0.0f) {
                    float f9 = this.f5293U;
                    if ((f9 >= this.f5291S || f2 <= 0.0f) && ((f9 <= getWidth() - this.f5291S || f2 >= 0.0f) && c((int) f2, (int) x10, (int) y9, this, false))) {
                        this.f5293U = x10;
                        this.f5294V = y9;
                        this.f5289Q = true;
                        return false;
                    }
                }
                float f10 = i;
                if (abs > f10 && abs * 0.5f > abs2) {
                    this.f5288P = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f11 = this.f5295W;
                    float f12 = i;
                    this.f5293U = f2 > 0.0f ? f11 + f12 : f11 - f12;
                    this.f5294V = y9;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f10) {
                    this.f5289Q = true;
                }
                if (this.f5288P && o(x10)) {
                    WeakHashMap weakHashMap = X.f2142a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            l(motionEvent);
        }
        if (this.f5298k0 == null) {
            this.f5298k0 = VelocityTracker.obtain();
        }
        this.f5298k0.addMovement(motionEvent);
        return this.f5288P;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        boolean z9;
        e h3;
        int max;
        int i10;
        int max2;
        int i11;
        int childCount = getChildCount();
        int i12 = i6 - i;
        int i13 = i9 - i4;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.f1063a) {
                    int i16 = fVar.f1064b;
                    int i17 = i16 & 7;
                    int i18 = i16 & 112;
                    if (i17 != 1) {
                        if (i17 == 3) {
                            i10 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i17 != 5) {
                            i10 = paddingLeft;
                        } else {
                            max = (i12 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i18 == 16) {
                            if (i18 == 48) {
                                i11 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i18 != 80) {
                                i11 = paddingTop;
                            } else {
                                max2 = (i13 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i19 = paddingLeft + scrollX;
                            childAt.layout(i19, paddingTop, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + paddingTop);
                            i14++;
                            paddingTop = i11;
                            paddingLeft = i10;
                        } else {
                            max2 = Math.max((i13 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i20 = max2;
                        i11 = paddingTop;
                        paddingTop = i20;
                        int i192 = paddingLeft + scrollX;
                        childAt.layout(i192, paddingTop, childAt.getMeasuredWidth() + i192, childAt.getMeasuredHeight() + paddingTop);
                        i14++;
                        paddingTop = i11;
                        paddingLeft = i10;
                    } else {
                        max = Math.max((i12 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i21 = max;
                    i10 = paddingLeft;
                    paddingLeft = i21;
                    if (i18 == 16) {
                    }
                    int i202 = max2;
                    i11 = paddingTop;
                    paddingTop = i202;
                    int i1922 = paddingLeft + scrollX;
                    childAt.layout(i1922, paddingTop, childAt.getMeasuredWidth() + i1922, childAt.getMeasuredHeight() + paddingTop);
                    i14++;
                    paddingTop = i11;
                    paddingLeft = i10;
                }
            }
        }
        int i22 = (i12 - paddingLeft) - paddingRight;
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt2 = getChildAt(i23);
            if (childAt2.getVisibility() != 8) {
                f fVar2 = (f) childAt2.getLayoutParams();
                if (!fVar2.f1063a && (h3 = h(childAt2)) != null) {
                    float f2 = i22;
                    int i24 = ((int) (h3.f1062e * f2)) + paddingLeft;
                    if (fVar2.f1066d) {
                        fVar2.f1066d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * fVar2.f1065c), 1073741824), View.MeasureSpec.makeMeasureSpec((i13 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i24, paddingTop, childAt2.getMeasuredWidth() + i24, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f5280G = paddingTop;
        this.f5281H = i13 - paddingBottom;
        this.f5307t0 = i14;
        if (this.f5305r0) {
            z9 = false;
            t(this.f5316y, 0, false, false);
        } else {
            z9 = false;
        }
        this.f5305r0 = z9;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        f fVar;
        f fVar2;
        int i6;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i4));
        int measuredWidth = getMeasuredWidth();
        this.f5291S = Math.min(measuredWidth / 10, this.f5290R);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i9 = 0;
        while (true) {
            boolean z6 = true;
            int i10 = 1073741824;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8 && (fVar2 = (f) childAt.getLayoutParams()) != null && fVar2.f1063a) {
                int i11 = fVar2.f1064b;
                int i12 = i11 & 7;
                int i13 = i11 & 112;
                boolean z9 = i13 == 48 || i13 == 80;
                if (i12 != 3 && i12 != 5) {
                    z6 = false;
                }
                int i14 = Integer.MIN_VALUE;
                if (z9) {
                    i6 = Integer.MIN_VALUE;
                    i14 = 1073741824;
                } else {
                    i6 = z6 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i15 = ((ViewGroup.LayoutParams) fVar2).width;
                if (i15 != -2) {
                    if (i15 == -1) {
                        i15 = paddingLeft;
                    }
                    i14 = 1073741824;
                } else {
                    i15 = paddingLeft;
                }
                int i16 = ((ViewGroup.LayoutParams) fVar2).height;
                if (i16 == -2) {
                    i16 = measuredHeight;
                    i10 = i6;
                } else if (i16 == -1) {
                    i16 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, i14), View.MeasureSpec.makeMeasureSpec(i16, i10));
                if (z9) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z6) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i9++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f5283K = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f5284L = true;
        p();
        this.f5284L = false;
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8 && ((fVar = (f) childAt2.getLayoutParams()) == null || !fVar.f1063a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * fVar.f1065c), 1073741824), this.f5283K);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i4;
        int i6;
        int i9;
        e h3;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i6 = childCount;
            i4 = 0;
            i9 = 1;
        } else {
            i4 = childCount - 1;
            i6 = -1;
            i9 = -1;
        }
        while (i4 != i6) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (h3 = h(childAt)) != null && h3.f1059b == this.f5316y && childAt.requestFocus(i, rect)) {
                return true;
            }
            i4 += i9;
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
        super.onRestoreInstanceState(iVar.f3390n);
        if (this.f5314x != null) {
            u(iVar.f1071v, 0, false, true);
        } else {
            this.f5318z = iVar.f1071v;
            this.f5272A = iVar.f1072w;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        iVar.f1071v = this.f5316y;
        a aVar = this.f5314x;
        if (aVar != null) {
            aVar.getClass();
            iVar.f1072w = null;
        }
        return iVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i6, int i9) {
        super.onSizeChanged(i, i4, i6, i9);
        if (i != i6) {
            int i10 = this.f5278E;
            r(i, i6, i10, i10);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        int i = this.f5292T;
        boolean z6 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f5314x) == null || aVar.b() == 0) {
            return false;
        }
        if (this.f5298k0 == null) {
            this.f5298k0 = VelocityTracker.obtain();
        }
        this.f5298k0.addMovement(motionEvent);
        int action = motionEvent.getAction() & p.f9259b;
        if (action == 0) {
            this.f5274B.abortAnimation();
            this.f5286N = false;
            p();
            float x9 = motionEvent.getX();
            this.f5295W = x9;
            this.f5293U = x9;
            float y7 = motionEvent.getY();
            this.f5296i0 = y7;
            this.f5294V = y7;
            this.f5297j0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f5288P) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f5297j0);
                    if (findPointerIndex == -1) {
                        z6 = s();
                    } else {
                        float x10 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x10 - this.f5293U);
                        float y9 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y9 - this.f5294V);
                        if (abs > i && abs > abs2) {
                            this.f5288P = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f2 = this.f5295W;
                            float f9 = i;
                            this.f5293U = x10 - f2 > 0.0f ? f2 + f9 : f2 - f9;
                            this.f5294V = y9;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f5288P) {
                    z6 = o(motionEvent.getX(motionEvent.findPointerIndex(this.f5297j0)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f5293U = motionEvent.getX(actionIndex);
                    this.f5297j0 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    l(motionEvent);
                    this.f5293U = motionEvent.getX(motionEvent.findPointerIndex(this.f5297j0));
                }
            } else if (this.f5288P) {
                t(this.f5316y, 0, true, false);
                z6 = s();
            }
        } else if (this.f5288P) {
            VelocityTracker velocityTracker = this.f5298k0;
            velocityTracker.computeCurrentVelocity(1000, this.m0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f5297j0);
            this.f5286N = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            e i4 = i();
            float f10 = clientWidth;
            int i6 = i4.f1059b;
            float f11 = ((scrollX / f10) - i4.f1062e) / (i4.f1061d + (this.f5278E / f10));
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f5297j0)) - this.f5295W)) <= this.f5301n0 || Math.abs(xVelocity) <= this.f5299l0) {
                i6 += (int) (f11 + (i6 >= this.f5316y ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                i6++;
            }
            ArrayList arrayList = this.f5308u;
            if (arrayList.size() > 0) {
                i6 = Math.max(((e) arrayList.get(0)).f1059b, Math.min(i6, ((e) arrayList.get(arrayList.size() - 1)).f1059b));
            }
            u(i6, xVelocity, true, true);
            z6 = s();
        }
        if (z6) {
            WeakHashMap weakHashMap = X.f2142a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final void p() {
        q(this.f5316y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r10 == r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        r9 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(int i) {
        e eVar;
        String hexString;
        ArrayList arrayList;
        e eVar2;
        float f2;
        e eVar3;
        e h3;
        int i4;
        int i6;
        e eVar4;
        e eVar5;
        e eVar6;
        int i9 = this.f5316y;
        if (i9 != i) {
            eVar = j(i9);
            this.f5316y = i;
        } else {
            eVar = null;
        }
        if (this.f5314x == null) {
            w();
            return;
        }
        if (this.f5286N) {
            w();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f5314x.getClass();
        int i10 = this.f5287O;
        int max = Math.max(0, this.f5316y - i10);
        int b9 = this.f5314x.b();
        int min = Math.min(b9 - 1, this.f5316y + i10);
        if (b9 != this.f5300n) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f5300n + ", found: " + b9 + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f5314x.getClass());
        }
        int i11 = 0;
        while (true) {
            arrayList = this.f5308u;
            if (i11 >= arrayList.size()) {
                break;
            }
            eVar2 = (e) arrayList.get(i11);
            int i12 = eVar2.f1059b;
            int i13 = this.f5316y;
            if (i12 < i13) {
                i11++;
            }
        }
        if (eVar2 == null && b9 > 0) {
            eVar2 = a(this.f5316y, i11);
        }
        if (eVar2 != null) {
            int i14 = i11 - 1;
            e eVar7 = i14 >= 0 ? (e) arrayList.get(i14) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - eVar2.f1061d);
            float f9 = 0.0f;
            for (int i15 = this.f5316y - 1; i15 >= 0; i15--) {
                if (f9 >= paddingLeft && i15 < max) {
                    if (eVar7 == null) {
                        break;
                    }
                    if (i15 == eVar7.f1059b && !eVar7.f1060c) {
                        arrayList.remove(i14);
                        this.f5314x.a(this, eVar7.f1058a);
                        i14--;
                        i11--;
                        if (i14 >= 0) {
                            eVar6 = (e) arrayList.get(i14);
                            eVar7 = eVar6;
                        }
                        eVar6 = null;
                        eVar7 = eVar6;
                    }
                } else if (eVar7 == null || i15 != eVar7.f1059b) {
                    f9 += a(i15, i14 + 1).f1061d;
                    i11++;
                    if (i14 >= 0) {
                        eVar6 = (e) arrayList.get(i14);
                        eVar7 = eVar6;
                    }
                    eVar6 = null;
                    eVar7 = eVar6;
                } else {
                    f9 += eVar7.f1061d;
                    i14--;
                    if (i14 >= 0) {
                        eVar6 = (e) arrayList.get(i14);
                        eVar7 = eVar6;
                    }
                    eVar6 = null;
                    eVar7 = eVar6;
                }
            }
            f2 = 0.0f;
            float f10 = eVar2.f1061d;
            int i16 = i11 + 1;
            if (f10 < 2.0f) {
                e eVar8 = i16 < arrayList.size() ? (e) arrayList.get(i16) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i17 = i16;
                for (int i18 = this.f5316y + 1; i18 < b9; i18++) {
                    if (f10 >= paddingRight && i18 > min) {
                        if (eVar8 == null) {
                            break;
                        }
                        if (i18 == eVar8.f1059b && !eVar8.f1060c) {
                            arrayList.remove(i17);
                            this.f5314x.a(this, eVar8.f1058a);
                            if (i17 < arrayList.size()) {
                                eVar8 = (e) arrayList.get(i17);
                            }
                            eVar8 = null;
                        }
                    } else if (eVar8 == null || i18 != eVar8.f1059b) {
                        e a9 = a(i18, i17);
                        i17++;
                        f10 += a9.f1061d;
                        if (i17 < arrayList.size()) {
                            eVar8 = (e) arrayList.get(i17);
                        }
                        eVar8 = null;
                    } else {
                        f10 += eVar8.f1061d;
                        i17++;
                        if (i17 < arrayList.size()) {
                            eVar8 = (e) arrayList.get(i17);
                        }
                        eVar8 = null;
                    }
                }
            }
            int b10 = this.f5314x.b();
            int clientWidth2 = getClientWidth();
            float f11 = clientWidth2 > 0 ? this.f5278E / clientWidth2 : 0.0f;
            if (eVar != null) {
                int i19 = eVar.f1059b;
                int i20 = eVar2.f1059b;
                if (i19 < i20) {
                    float f12 = eVar.f1062e + eVar.f1061d + f11;
                    int i21 = i19 + 1;
                    int i22 = 0;
                    while (i21 <= eVar2.f1059b && i22 < arrayList.size()) {
                        Object obj = arrayList.get(i22);
                        while (true) {
                            eVar5 = (e) obj;
                            if (i21 <= eVar5.f1059b || i22 >= arrayList.size() - 1) {
                                break;
                            }
                            i22++;
                            obj = arrayList.get(i22);
                        }
                        while (i21 < eVar5.f1059b) {
                            this.f5314x.getClass();
                            f12 += 1.0f + f11;
                            i21++;
                        }
                        eVar5.f1062e = f12;
                        f12 += eVar5.f1061d + f11;
                        i21++;
                    }
                } else if (i19 > i20) {
                    int size = arrayList.size() - 1;
                    float f13 = eVar.f1062e;
                    while (true) {
                        i19--;
                        if (i19 < eVar2.f1059b || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            eVar4 = (e) obj2;
                            if (i19 >= eVar4.f1059b || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i19 > eVar4.f1059b) {
                            this.f5314x.getClass();
                            f13 -= 1.0f + f11;
                            i19--;
                        }
                        f13 -= eVar4.f1061d + f11;
                        eVar4.f1062e = f13;
                    }
                }
            }
            int size2 = arrayList.size();
            float f14 = eVar2.f1062e;
            int i23 = eVar2.f1059b;
            int i24 = i23 - 1;
            this.f5282I = i23 == 0 ? f14 : -3.4028235E38f;
            int i25 = b10 - 1;
            this.J = i23 == i25 ? (eVar2.f1061d + f14) - 1.0f : Float.MAX_VALUE;
            int i26 = i11 - 1;
            while (i26 >= 0) {
                e eVar9 = (e) arrayList.get(i26);
                while (true) {
                    i6 = eVar9.f1059b;
                    if (i24 <= i6) {
                        break;
                    }
                    i24--;
                    this.f5314x.getClass();
                    f14 -= 1.0f + f11;
                }
                f14 -= eVar9.f1061d + f11;
                eVar9.f1062e = f14;
                if (i6 == 0) {
                    this.f5282I = f14;
                }
                i26--;
                i24--;
            }
            float f15 = eVar2.f1062e + eVar2.f1061d + f11;
            int i27 = eVar2.f1059b;
            while (true) {
                i27++;
                if (i16 >= size2) {
                    break;
                }
                e eVar10 = (e) arrayList.get(i16);
                while (true) {
                    i4 = eVar10.f1059b;
                    if (i27 >= i4) {
                        break;
                    }
                    i27++;
                    this.f5314x.getClass();
                    f15 += 1.0f + f11;
                }
                if (i4 == i25) {
                    this.J = (eVar10.f1061d + f15) - 1.0f;
                }
                eVar10.f1062e = f15;
                f15 += eVar10.f1061d + f11;
                i16++;
            }
            this.f5314x.getClass();
        } else {
            f2 = 0.0f;
        }
        this.f5314x.getClass();
        int childCount = getChildCount();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt = getChildAt(i28);
            f fVar = (f) childAt.getLayoutParams();
            fVar.f1068f = i28;
            if (!fVar.f1063a && fVar.f1065c == f2 && (h3 = h(childAt)) != null) {
                fVar.f1065c = h3.f1061d;
                fVar.f1067e = h3.f1059b;
            }
        }
        w();
        if (hasFocus()) {
            View findFocus = findFocus();
            if (findFocus != null) {
                while (true) {
                    Object parent = findFocus.getParent();
                    if (parent == this) {
                        eVar3 = h(findFocus);
                        break;
                    } else if (parent == null || !(parent instanceof View)) {
                        break;
                    } else {
                        findFocus = (View) parent;
                    }
                }
            }
            eVar3 = null;
            if (eVar3 == null || eVar3.f1059b != this.f5316y) {
                for (int i29 = 0; i29 < getChildCount(); i29++) {
                    View childAt2 = getChildAt(i29);
                    e h9 = h(childAt2);
                    if (h9 != null && h9.f1059b == this.f5316y && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void r(int i, int i4, int i6, int i9) {
        if (i4 > 0 && !this.f5308u.isEmpty()) {
            if (!this.f5274B.isFinished()) {
                this.f5274B.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i4 - getPaddingLeft()) - getPaddingRight()) + i9)) * (((i - getPaddingLeft()) - getPaddingRight()) + i6)), getScrollY());
                return;
            }
        }
        e j6 = j(this.f5316y);
        int min = (int) ((j6 != null ? Math.min(j6.f1062e, this.J) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            d(false);
            scrollTo(min, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f5284L) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final boolean s() {
        this.f5297j0 = -1;
        this.f5288P = false;
        this.f5289Q = false;
        VelocityTracker velocityTracker = this.f5298k0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5298k0 = null;
        }
        this.f5303p0.onRelease();
        this.f5304q0.onRelease();
        return this.f5303p0.isFinished() || this.f5304q0.isFinished();
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList;
        a aVar2 = this.f5314x;
        if (aVar2 != null) {
            synchronized (aVar2) {
            }
            this.f5314x.getClass();
            int i = 0;
            while (true) {
                arrayList = this.f5308u;
                if (i >= arrayList.size()) {
                    break;
                }
                e eVar = (e) arrayList.get(i);
                a aVar3 = this.f5314x;
                int i4 = eVar.f1059b;
                aVar3.a(this, eVar.f1058a);
                i++;
            }
            this.f5314x.getClass();
            arrayList.clear();
            int i6 = 0;
            while (i6 < getChildCount()) {
                if (!((f) getChildAt(i6).getLayoutParams()).f1063a) {
                    removeViewAt(i6);
                    i6--;
                }
                i6++;
            }
            this.f5316y = 0;
            scrollTo(0, 0);
        }
        this.f5314x = aVar;
        this.f5300n = 0;
        if (aVar != null) {
            if (this.f5277D == null) {
                this.f5277D = new h(0, this);
            }
            synchronized (this.f5314x) {
            }
            this.f5286N = false;
            boolean z6 = this.f5305r0;
            this.f5305r0 = true;
            this.f5300n = this.f5314x.b();
            if (this.f5318z >= 0) {
                this.f5314x.getClass();
                u(this.f5318z, 0, false, true);
                this.f5318z = -1;
                this.f5272A = null;
                return;
            }
            if (z6) {
                requestLayout();
            } else {
                p();
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f5286N = false;
        u(i, 0, !this.f5305r0, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f5287O) {
            this.f5287O = i;
            p();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(g gVar) {
        this.f5311v0 = gVar;
    }

    public void setPageMargin(int i) {
        int i4 = this.f5278E;
        this.f5278E = i;
        int width = getWidth();
        r(width, width, i, i4);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f5279F = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.f5275B0 == i) {
            return;
        }
        this.f5275B0 = i;
        if (this.f5313w0 != null) {
            boolean z6 = i != 0;
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                getChildAt(i4).setLayerType(z6 ? this.f5315x0 : 0, null);
            }
        }
        ArrayList arrayList = this.f5309u0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
            }
        }
    }

    public final void t(int i, int i4, boolean z6, boolean z9) {
        int scrollX;
        int abs;
        Scroller scroller = this.f5274B;
        e j6 = j(i);
        int max = j6 != null ? (int) (Math.max(this.f5282I, Math.min(j6.f1062e, this.J)) * getClientWidth()) : 0;
        if (!z6) {
            if (z9) {
                f(i);
            }
            d(false);
            scrollTo(max, 0);
            n(max);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.f5276C ? scroller.getCurrX() : scroller.getStartX();
                scroller.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i6 = scrollX;
            int scrollY = getScrollY();
            int i9 = max - i6;
            int i10 = 0 - scrollY;
            if (i9 == 0 && i10 == 0) {
                d(false);
                p();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i11 = clientWidth / 2;
                float f2 = clientWidth;
                float f9 = i11;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i9) * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f9) + f9;
                int abs2 = Math.abs(i4);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    this.f5314x.getClass();
                    abs = (int) (((Math.abs(i9) / ((f2 * 1.0f) + this.f5278E)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.f5276C = false;
                this.f5274B.startScroll(i6, scrollY, i9, i10, min);
                WeakHashMap weakHashMap = X.f2142a;
                postInvalidateOnAnimation();
            }
        }
        if (z9) {
            f(i);
        }
    }

    public final void u(int i, int i4, boolean z6, boolean z9) {
        a aVar = this.f5314x;
        if (aVar == null || aVar.b() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.f5308u;
        if (!z9 && this.f5316y == i && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f5314x.b()) {
            i = this.f5314x.b() - 1;
        }
        int i6 = this.f5287O;
        int i9 = this.f5316y;
        if (i > i9 + i6 || i < i9 - i6) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((e) arrayList.get(i10)).f1060c = true;
            }
        }
        boolean z10 = this.f5316y != i;
        if (!this.f5305r0) {
            q(i);
            t(i, i4, z6, z10);
        } else {
            this.f5316y = i;
            if (z10) {
                f(i);
            }
            requestLayout();
        }
    }

    public final void v(G3.e eVar) {
        boolean z6 = this.f5313w0 == null;
        this.f5313w0 = eVar;
        setChildrenDrawingOrderEnabled(true);
        this.f5317y0 = 1;
        this.f5315x0 = 2;
        if (z6) {
            p();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5279F;
    }

    public final void w() {
        if (this.f5317y0 != 0) {
            ArrayList arrayList = this.f5319z0;
            if (arrayList == null) {
                this.f5319z0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f5319z0.add(getChildAt(i));
            }
            Collections.sort(this.f5319z0, f5271F0);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        f fVar = new f(context, attributeSet);
        fVar.f1065c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0);
        fVar.f1064b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return fVar;
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(E.a.b(getContext(), i));
    }
}
