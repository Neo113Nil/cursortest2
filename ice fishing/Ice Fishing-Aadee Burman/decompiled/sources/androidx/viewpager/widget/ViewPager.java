package androidx.viewpager.widget;

import B.i;
import G0.a;
import G0.b;
import G0.c;
import G0.d;
import G0.f;
import G0.g;
import G0.h;
import G0.j;
import O.L;
import O.X;
import a4.e;
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

    /* renamed from: H0, reason: collision with root package name */
    public static final int[] f5303H0 = {R.attr.layout_gravity};

    /* renamed from: I0, reason: collision with root package name */
    public static final i f5304I0 = new i(1);

    /* renamed from: J0, reason: collision with root package name */
    public static final b f5305J0 = new b(0);

    /* renamed from: K0, reason: collision with root package name */
    public static final i f5306K0 = new i(2);

    /* renamed from: A, reason: collision with root package name */
    public Parcelable f5307A;

    /* renamed from: A0, reason: collision with root package name */
    public h f5308A0;

    /* renamed from: B, reason: collision with root package name */
    public final Scroller f5309B;

    /* renamed from: B0, reason: collision with root package name */
    public e f5310B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f5311C;
    public int C0;

    /* renamed from: D, reason: collision with root package name */
    public G0.i f5312D;

    /* renamed from: D0, reason: collision with root package name */
    public int f5313D0;

    /* renamed from: E, reason: collision with root package name */
    public int f5314E;

    /* renamed from: E0, reason: collision with root package name */
    public ArrayList f5315E0;

    /* renamed from: F, reason: collision with root package name */
    public Drawable f5316F;

    /* renamed from: F0, reason: collision with root package name */
    public final c f5317F0;

    /* renamed from: G, reason: collision with root package name */
    public int f5318G;

    /* renamed from: G0, reason: collision with root package name */
    public int f5319G0;

    /* renamed from: H, reason: collision with root package name */
    public int f5320H;

    /* renamed from: I, reason: collision with root package name */
    public float f5321I;
    public float J;

    /* renamed from: K, reason: collision with root package name */
    public int f5322K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f5323L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f5324M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f5325N;

    /* renamed from: O, reason: collision with root package name */
    public int f5326O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f5327P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f5328Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f5329R;

    /* renamed from: S, reason: collision with root package name */
    public int f5330S;

    /* renamed from: T, reason: collision with root package name */
    public final int f5331T;

    /* renamed from: U, reason: collision with root package name */
    public float f5332U;

    /* renamed from: V, reason: collision with root package name */
    public float f5333V;

    /* renamed from: W, reason: collision with root package name */
    public float f5334W;

    /* renamed from: n, reason: collision with root package name */
    public int f5335n;

    /* renamed from: n0, reason: collision with root package name */
    public float f5336n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f5337o0;

    /* renamed from: p0, reason: collision with root package name */
    public VelocityTracker f5338p0;

    /* renamed from: q0, reason: collision with root package name */
    public final int f5339q0;

    /* renamed from: r0, reason: collision with root package name */
    public final int f5340r0;

    /* renamed from: s0, reason: collision with root package name */
    public final int f5341s0;

    /* renamed from: t0, reason: collision with root package name */
    public final int f5342t0;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f5343u;

    /* renamed from: u0, reason: collision with root package name */
    public final EdgeEffect f5344u0;

    /* renamed from: v, reason: collision with root package name */
    public final G0.e f5345v;

    /* renamed from: v0, reason: collision with root package name */
    public final EdgeEffect f5346v0;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f5347w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f5348w0;

    /* renamed from: x, reason: collision with root package name */
    public a f5349x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f5350x0;

    /* renamed from: y, reason: collision with root package name */
    public int f5351y;

    /* renamed from: y0, reason: collision with root package name */
    public int f5352y0;

    /* renamed from: z, reason: collision with root package name */
    public int f5353z;

    /* renamed from: z0, reason: collision with root package name */
    public ArrayList f5354z0;

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5343u = new ArrayList();
        this.f5345v = new G0.e();
        this.f5347w = new Rect();
        this.f5353z = -1;
        this.f5307A = null;
        this.f5321I = -3.4028235E38f;
        this.J = Float.MAX_VALUE;
        this.f5326O = 1;
        this.f5337o0 = -1;
        this.f5348w0 = true;
        this.f5317F0 = new c(0, this);
        this.f5319G0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f5309B = new Scroller(context2, f5305J0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f3 = context2.getResources().getDisplayMetrics().density;
        this.f5331T = viewConfiguration.getScaledPagingTouchSlop();
        this.f5339q0 = (int) (400.0f * f3);
        this.f5340r0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5344u0 = new EdgeEffect(context2);
        this.f5346v0 = new EdgeEffect(context2);
        this.f5341s0 = (int) (25.0f * f3);
        this.f5342t0 = (int) (2.0f * f3);
        this.f5329R = (int) (f3 * 16.0f);
        X.o(this, new g(0, this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        L.u(this, new S0.c(this));
    }

    public static boolean c(int i, int i6, int i9, View view, boolean z3) {
        int i10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i11 = i6 + scrollX;
                if (i11 >= childAt.getLeft() && i11 < childAt.getRight() && (i10 = i9 + scrollY) >= childAt.getTop() && i10 < childAt.getBottom() && c(i, i11 - childAt.getLeft(), i10 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        return z3 && view.canScrollHorizontally(-i);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z3) {
        if (this.f5324M != z3) {
            this.f5324M = z3;
        }
    }

    public final G0.e a(int i, int i6) {
        G0.e eVar = new G0.e();
        eVar.f1033b = i;
        eVar.f1032a = this.f5349x.c(this, i);
        this.f5349x.getClass();
        eVar.f1035d = 1.0f;
        ArrayList arrayList = this.f5343u;
        if (i6 < 0 || i6 >= arrayList.size()) {
            arrayList.add(eVar);
            return eVar;
        }
        arrayList.add(i6, eVar);
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i6) {
        G0.e h9;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() == 0 && (h9 = h(childAt)) != null && h9.f1033b == this.f5351y) {
                    childAt.addFocusables(arrayList, i, i6);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i6 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        G0.e h9;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (h9 = h(childAt)) != null && h9.f1033b == this.f5351y) {
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
        boolean z3 = fVar.f1037a | (view.getClass().getAnnotation(d.class) != null);
        fVar.f1037a = z3;
        if (!this.f5323L) {
            super.addView(view, i, layoutParams);
        } else {
            if (z3) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            fVar.f1040d = true;
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
        boolean z3;
        int i6;
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
            boolean z6 = true;
            z3 = false;
            if (findNextFocus == null && findNextFocus != findFocus) {
                Rect rect = this.f5347w;
                if (i == 17) {
                    int i9 = g(rect, findNextFocus).left;
                    int i10 = g(rect, findFocus).left;
                    if (findFocus == null || i9 < i10) {
                        requestFocus = findNextFocus.requestFocus();
                    } else {
                        int i11 = this.f5351y;
                        if (i11 > 0) {
                            this.f5325N = false;
                            u(i11 - 1, 0, true, false);
                            z3 = z6;
                        }
                        z6 = false;
                        z3 = z6;
                    }
                } else if (i == 66) {
                    requestFocus = (findFocus == null || g(rect, findNextFocus).left > g(rect, findFocus).left) ? findNextFocus.requestFocus() : m();
                }
                z3 = requestFocus;
            } else if (i != 17 || i == 1) {
                i6 = this.f5351y;
                if (i6 > 0) {
                    this.f5325N = false;
                    u(i6 - 1, 0, true, false);
                    z3 = z6;
                }
                z6 = false;
                z3 = z6;
            } else if (i == 66 || i == 2) {
                z3 = m();
            }
            if (z3) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
            }
            return z3;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        boolean z62 = true;
        z3 = false;
        if (findNextFocus == null) {
        }
        if (i != 17) {
        }
        i6 = this.f5351y;
        if (i6 > 0) {
        }
        z62 = false;
        z3 = z62;
        if (z3) {
        }
        return z3;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.f5349x == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f5321I)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.J));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f5311C = true;
        Scroller scroller = this.f5309B;
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
        WeakHashMap weakHashMap = X.f2054a;
        postInvalidateOnAnimation();
    }

    public final void d(boolean z3) {
        Scroller scroller = this.f5309B;
        boolean z6 = this.f5319G0 == 2;
        if (z6) {
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
        this.f5325N = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5343u;
            if (i >= arrayList.size()) {
                break;
            }
            G0.e eVar = (G0.e) arrayList.get(i);
            if (eVar.f1034c) {
                eVar.f1034c = false;
                z6 = true;
            }
            i++;
        }
        if (z6) {
            c cVar = this.f5317F0;
            if (!z3) {
                cVar.run();
            } else {
                WeakHashMap weakHashMap = X.f2054a;
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
        boolean z3;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        z3 = keyEvent.hasModifiers(2) ? m() : b(66);
                    } else if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            z3 = b(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            z3 = b(1);
                        }
                    }
                    if (!z3) {
                        return false;
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        int i = this.f5351y;
                        if (i > 0) {
                            this.f5325N = false;
                            u(i - 1, 0, true, false);
                            z3 = true;
                        }
                    } else {
                        z3 = b(17);
                    }
                    if (!z3) {
                    }
                }
            }
            z3 = false;
            if (!z3) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        G0.e h9;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (h9 = h(childAt)) != null && h9.f1033b == this.f5351y && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        a aVar;
        EdgeEffect edgeEffect = this.f5346v0;
        EdgeEffect edgeEffect2 = this.f5344u0;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z3 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f5349x) != null && aVar.b() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f5321I * width);
                edgeEffect2.setSize(height, width);
                z3 = edgeEffect2.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!edgeEffect.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.J + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                z3 |= edgeEffect.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (z3) {
            WeakHashMap weakHashMap = X.f2054a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5316F;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        int b9 = this.f5349x.b();
        this.f5335n = b9;
        ArrayList arrayList = this.f5343u;
        boolean z3 = arrayList.size() < (this.f5326O * 2) + 1 && arrayList.size() < b9;
        int i = this.f5351y;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            G0.e eVar = (G0.e) arrayList.get(i6);
            a aVar = this.f5349x;
            Object obj = eVar.f1032a;
            aVar.getClass();
        }
        Collections.sort(arrayList, f5304I0);
        if (z3) {
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                f fVar = (f) getChildAt(i9).getLayoutParams();
                if (!fVar.f1037a) {
                    fVar.f1039c = 0.0f;
                }
            }
            u(i, 0, false, true);
            requestLayout();
        }
    }

    public final void f(int i) {
        h hVar = this.f5308A0;
        if (hVar != null) {
            hVar.b(i);
        }
        ArrayList arrayList = this.f5354z0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                h hVar2 = (h) this.f5354z0.get(i6);
                if (hVar2 != null) {
                    hVar2.b(i);
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
        fVar.f1039c = 0.0f;
        return fVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f5349x;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i6) {
        if (this.f5313D0 == 2) {
            i6 = (i - 1) - i6;
        }
        return ((f) ((View) this.f5315E0.get(i6)).getLayoutParams()).f1042f;
    }

    public int getCurrentItem() {
        return this.f5351y;
    }

    public int getOffscreenPageLimit() {
        return this.f5326O;
    }

    public int getPageMargin() {
        return this.f5314E;
    }

    public final G0.e h(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5343u;
            if (i >= arrayList.size()) {
                return null;
            }
            G0.e eVar = (G0.e) arrayList.get(i);
            if (this.f5349x.d(view, eVar.f1032a)) {
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
    public final G0.e i() {
        G0.e eVar;
        int i;
        int clientWidth = getClientWidth();
        float f3 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f9 = clientWidth > 0 ? this.f5314E / clientWidth : 0.0f;
        int i6 = 0;
        boolean z3 = true;
        G0.e eVar2 = null;
        int i9 = -1;
        float f10 = 0.0f;
        while (true) {
            ArrayList arrayList = this.f5343u;
            if (i6 >= arrayList.size()) {
                break;
            }
            G0.e eVar3 = (G0.e) arrayList.get(i6);
            if (z3 || eVar3.f1033b == (i = i9 + 1)) {
                eVar = eVar3;
            } else {
                float f11 = f3 + f10 + f9;
                G0.e eVar4 = this.f5345v;
                eVar4.f1036e = f11;
                eVar4.f1033b = i;
                this.f5349x.getClass();
                eVar4.f1035d = 1.0f;
                i6--;
                eVar = eVar4;
            }
            f3 = eVar.f1036e;
            float f12 = eVar.f1035d + f3 + f9;
            if (!z3 && scrollX < f3) {
                break;
            }
            if (scrollX < f12 || i6 == arrayList.size() - 1) {
                break;
            }
            int i10 = eVar.f1033b;
            float f13 = eVar.f1035d;
            i6++;
            G0.e eVar5 = eVar;
            i9 = i10;
            f10 = f13;
            eVar2 = eVar5;
            z3 = false;
        }
        return eVar;
    }

    public final G0.e j(int i) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f5343u;
            if (i6 >= arrayList.size()) {
                return null;
            }
            G0.e eVar = (G0.e) arrayList.get(i6);
            if (eVar.f1033b == i) {
                return eVar;
            }
            i6++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i, int i6, float f3) {
        int max;
        int i9;
        int left;
        if (this.f5352y0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.f1037a) {
                    int i11 = fVar.f1038b & 7;
                    if (i11 != 1) {
                        if (i11 == 3) {
                            i9 = childAt.getWidth() + paddingLeft;
                        } else if (i11 != 5) {
                            i9 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i9;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i12 = max;
                    i9 = paddingLeft;
                    paddingLeft = i12;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i9;
                }
            }
        }
        h hVar = this.f5308A0;
        if (hVar != null) {
            hVar.a(i);
        }
        ArrayList arrayList = this.f5354z0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                h hVar2 = (h) this.f5354z0.get(i13);
                if (hVar2 != null) {
                    hVar2.a(i);
                }
            }
        }
        if (this.f5310B0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = getChildAt(i14);
                if (!((f) childAt2.getLayoutParams()).f1037a) {
                    float left2 = (childAt2.getLeft() - scrollX2) / getClientWidth();
                    this.f5310B0.getClass();
                    childAt2.setScaleY(1.0f - (Math.abs(left2) * 0.100000024f));
                    childAt2.setScaleX((Math.abs(left2) * 0.100000024f) + 0.9f);
                }
            }
        }
        this.f5350x0 = true;
    }

    public final void l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5337o0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f5332U = motionEvent.getX(i);
            this.f5337o0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f5338p0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean m() {
        a aVar = this.f5349x;
        if (aVar == null || this.f5351y >= aVar.b() - 1) {
            return false;
        }
        int i = this.f5351y + 1;
        this.f5325N = false;
        u(i, 0, true, false);
        return true;
    }

    public final boolean n(int i) {
        if (this.f5343u.size() == 0) {
            if (!this.f5348w0) {
                this.f5350x0 = false;
                k(0, 0, 0.0f);
                if (!this.f5350x0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        G0.e i6 = i();
        int clientWidth = getClientWidth();
        int i9 = this.f5314E;
        int i10 = clientWidth + i9;
        float f3 = clientWidth;
        int i11 = i6.f1033b;
        float f9 = ((i / f3) - i6.f1036e) / (i6.f1035d + (i9 / f3));
        this.f5350x0 = false;
        k(i11, (int) (i10 * f9), f9);
        if (this.f5350x0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean o(float f3) {
        boolean z3;
        boolean z6;
        float f9 = this.f5332U - f3;
        this.f5332U = f3;
        float scrollX = getScrollX() + f9;
        float clientWidth = getClientWidth();
        float f10 = this.f5321I * clientWidth;
        float f11 = this.J * clientWidth;
        ArrayList arrayList = this.f5343u;
        boolean z9 = false;
        G0.e eVar = (G0.e) arrayList.get(0);
        G0.e eVar2 = (G0.e) arrayList.get(arrayList.size() - 1);
        if (eVar.f1033b != 0) {
            f10 = eVar.f1036e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (eVar2.f1033b != this.f5349x.b() - 1) {
            f11 = eVar2.f1036e * clientWidth;
            z6 = false;
        } else {
            z6 = true;
        }
        if (scrollX < f10) {
            if (z3) {
                this.f5344u0.onPull(Math.abs(f10 - scrollX) / clientWidth);
                z9 = true;
            }
            scrollX = f10;
        } else if (scrollX > f11) {
            if (z6) {
                this.f5346v0.onPull(Math.abs(scrollX - f11) / clientWidth);
                z9 = true;
            }
            scrollX = f11;
        }
        int i = (int) scrollX;
        this.f5332U = (scrollX - i) + this.f5332U;
        scrollTo(i, getScrollY());
        n(i);
        return z9;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5348w0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f5317F0);
        Scroller scroller = this.f5309B;
        if (scroller != null && !scroller.isFinished()) {
            this.f5309B.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f3;
        ArrayList arrayList;
        int i6;
        super.onDraw(canvas);
        if (this.f5314E <= 0 || this.f5316F == null) {
            return;
        }
        ArrayList arrayList2 = this.f5343u;
        if (arrayList2.size() <= 0 || this.f5349x == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f9 = this.f5314E / width;
        int i9 = 0;
        G0.e eVar = (G0.e) arrayList2.get(0);
        float f10 = eVar.f1036e;
        int size = arrayList2.size();
        int i10 = eVar.f1033b;
        int i11 = ((G0.e) arrayList2.get(size - 1)).f1033b;
        while (i10 < i11) {
            while (true) {
                i = eVar.f1033b;
                if (i10 <= i || i9 >= size) {
                    break;
                }
                i9++;
                eVar = (G0.e) arrayList2.get(i9);
            }
            if (i10 == i) {
                float f11 = eVar.f1036e;
                float f12 = eVar.f1035d;
                f3 = (f11 + f12) * width;
                f10 = f11 + f12 + f9;
            } else {
                this.f5349x.getClass();
                f3 = (f10 + 1.0f) * width;
                f10 = 1.0f + f9 + f10;
            }
            if (this.f5314E + f3 > scrollX) {
                arrayList = arrayList2;
                i6 = scrollX;
                this.f5316F.setBounds(Math.round(f3), this.f5318G, Math.round(this.f5314E + f3), this.f5320H);
                this.f5316F.draw(canvas);
            } else {
                arrayList = arrayList2;
                i6 = scrollX;
            }
            if (f3 > i6 + r3) {
                return;
            }
            i10++;
            arrayList2 = arrayList;
            scrollX = i6;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = this.f5331T;
        Scroller scroller = this.f5309B;
        int action = motionEvent.getAction() & p.f8473b;
        if (action == 3 || action == 1) {
            s();
            return false;
        }
        if (action != 0) {
            if (this.f5327P) {
                return true;
            }
            if (this.f5328Q) {
                return false;
            }
        }
        if (action == 0) {
            float x9 = motionEvent.getX();
            this.f5334W = x9;
            this.f5332U = x9;
            float y7 = motionEvent.getY();
            this.f5336n0 = y7;
            this.f5333V = y7;
            this.f5337o0 = motionEvent.getPointerId(0);
            this.f5328Q = false;
            this.f5311C = true;
            scroller.computeScrollOffset();
            if (this.f5319G0 != 2 || Math.abs(scroller.getFinalX() - scroller.getCurrX()) <= this.f5342t0) {
                d(false);
                this.f5327P = false;
            } else {
                scroller.abortAnimation();
                this.f5325N = false;
                p();
                this.f5327P = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i6 = this.f5337o0;
            if (i6 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i6);
                float x10 = motionEvent.getX(findPointerIndex);
                float f3 = x10 - this.f5332U;
                float abs = Math.abs(f3);
                float y9 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y9 - this.f5336n0);
                if (f3 != 0.0f) {
                    float f9 = this.f5332U;
                    if ((f9 >= this.f5330S || f3 <= 0.0f) && ((f9 <= getWidth() - this.f5330S || f3 >= 0.0f) && c((int) f3, (int) x10, (int) y9, this, false))) {
                        this.f5332U = x10;
                        this.f5333V = y9;
                        this.f5328Q = true;
                        return false;
                    }
                }
                float f10 = i;
                if (abs > f10 && abs * 0.5f > abs2) {
                    this.f5327P = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f11 = this.f5334W;
                    float f12 = i;
                    this.f5332U = f3 > 0.0f ? f11 + f12 : f11 - f12;
                    this.f5333V = y9;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f10) {
                    this.f5328Q = true;
                }
                if (this.f5327P && o(x10)) {
                    WeakHashMap weakHashMap = X.f2054a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            l(motionEvent);
        }
        if (this.f5338p0 == null) {
            this.f5338p0 = VelocityTracker.obtain();
        }
        this.f5338p0.addMovement(motionEvent);
        return this.f5327P;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        boolean z6;
        G0.e h9;
        int max;
        int i11;
        int max2;
        int i12;
        int childCount = getChildCount();
        int i13 = i9 - i;
        int i14 = i10 - i6;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.f1037a) {
                    int i17 = fVar.f1038b;
                    int i18 = i17 & 7;
                    int i19 = i17 & 112;
                    if (i18 != 1) {
                        if (i18 == 3) {
                            i11 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i18 != 5) {
                            i11 = paddingLeft;
                        } else {
                            max = (i13 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i19 == 16) {
                            if (i19 == 48) {
                                i12 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i19 != 80) {
                                i12 = paddingTop;
                            } else {
                                max2 = (i14 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i20 = paddingLeft + scrollX;
                            childAt.layout(i20, paddingTop, childAt.getMeasuredWidth() + i20, childAt.getMeasuredHeight() + paddingTop);
                            i15++;
                            paddingTop = i12;
                            paddingLeft = i11;
                        } else {
                            max2 = Math.max((i14 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i21 = max2;
                        i12 = paddingTop;
                        paddingTop = i21;
                        int i202 = paddingLeft + scrollX;
                        childAt.layout(i202, paddingTop, childAt.getMeasuredWidth() + i202, childAt.getMeasuredHeight() + paddingTop);
                        i15++;
                        paddingTop = i12;
                        paddingLeft = i11;
                    } else {
                        max = Math.max((i13 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i22 = max;
                    i11 = paddingLeft;
                    paddingLeft = i22;
                    if (i19 == 16) {
                    }
                    int i212 = max2;
                    i12 = paddingTop;
                    paddingTop = i212;
                    int i2022 = paddingLeft + scrollX;
                    childAt.layout(i2022, paddingTop, childAt.getMeasuredWidth() + i2022, childAt.getMeasuredHeight() + paddingTop);
                    i15++;
                    paddingTop = i12;
                    paddingLeft = i11;
                }
            }
        }
        int i23 = (i13 - paddingLeft) - paddingRight;
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt2 = getChildAt(i24);
            if (childAt2.getVisibility() != 8) {
                f fVar2 = (f) childAt2.getLayoutParams();
                if (!fVar2.f1037a && (h9 = h(childAt2)) != null) {
                    float f3 = i23;
                    int i25 = ((int) (h9.f1036e * f3)) + paddingLeft;
                    if (fVar2.f1040d) {
                        fVar2.f1040d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f3 * fVar2.f1039c), 1073741824), View.MeasureSpec.makeMeasureSpec((i14 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i25, paddingTop, childAt2.getMeasuredWidth() + i25, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f5318G = paddingTop;
        this.f5320H = i14 - paddingBottom;
        this.f5352y0 = i15;
        if (this.f5348w0) {
            z6 = false;
            t(this.f5351y, 0, false, false);
        } else {
            z6 = false;
        }
        this.f5348w0 = z6;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i6) {
        f fVar;
        f fVar2;
        int i9;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i6));
        int measuredWidth = getMeasuredWidth();
        this.f5330S = Math.min(measuredWidth / 10, this.f5329R);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            boolean z3 = true;
            int i11 = 1073741824;
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8 && (fVar2 = (f) childAt.getLayoutParams()) != null && fVar2.f1037a) {
                int i12 = fVar2.f1038b;
                int i13 = i12 & 7;
                int i14 = i12 & 112;
                boolean z6 = i14 == 48 || i14 == 80;
                if (i13 != 3 && i13 != 5) {
                    z3 = false;
                }
                int i15 = Integer.MIN_VALUE;
                if (z6) {
                    i9 = Integer.MIN_VALUE;
                    i15 = 1073741824;
                } else {
                    i9 = z3 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i16 = ((ViewGroup.LayoutParams) fVar2).width;
                if (i16 != -2) {
                    if (i16 == -1) {
                        i16 = paddingLeft;
                    }
                    i15 = 1073741824;
                } else {
                    i16 = paddingLeft;
                }
                int i17 = ((ViewGroup.LayoutParams) fVar2).height;
                if (i17 == -2) {
                    i17 = measuredHeight;
                    i11 = i9;
                } else if (i17 == -1) {
                    i17 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, i15), View.MeasureSpec.makeMeasureSpec(i17, i11));
                if (z6) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z3) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i10++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f5322K = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f5323L = true;
        p();
        this.f5323L = false;
        int childCount2 = getChildCount();
        for (int i18 = 0; i18 < childCount2; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8 && ((fVar = (f) childAt2.getLayoutParams()) == null || !fVar.f1037a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * fVar.f1039c), 1073741824), this.f5322K);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i6;
        int i9;
        int i10;
        G0.e h9;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i9 = childCount;
            i6 = 0;
            i10 = 1;
        } else {
            i6 = childCount - 1;
            i9 = -1;
            i10 = -1;
        }
        while (i6 != i9) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 0 && (h9 = h(childAt)) != null && h9.f1033b == this.f5351y && childAt.requestFocus(i, rect)) {
                return true;
            }
            i6 += i10;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.f3267n);
        if (this.f5349x != null) {
            u(jVar.f1047v, 0, false, true);
        } else {
            this.f5353z = jVar.f1047v;
            this.f5307A = jVar.f1048w;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f1047v = this.f5351y;
        a aVar = this.f5349x;
        if (aVar != null) {
            aVar.getClass();
            jVar.f1048w = null;
        }
        return jVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i6, int i9, int i10) {
        super.onSizeChanged(i, i6, i9, i10);
        if (i != i9) {
            int i11 = this.f5314E;
            r(i, i9, i11, i11);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        int i = this.f5331T;
        boolean z3 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f5349x) == null || aVar.b() == 0) {
            return false;
        }
        if (this.f5338p0 == null) {
            this.f5338p0 = VelocityTracker.obtain();
        }
        this.f5338p0.addMovement(motionEvent);
        int action = motionEvent.getAction() & p.f8473b;
        if (action == 0) {
            this.f5309B.abortAnimation();
            this.f5325N = false;
            p();
            float x9 = motionEvent.getX();
            this.f5334W = x9;
            this.f5332U = x9;
            float y7 = motionEvent.getY();
            this.f5336n0 = y7;
            this.f5333V = y7;
            this.f5337o0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f5327P) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f5337o0);
                    if (findPointerIndex == -1) {
                        z3 = s();
                    } else {
                        float x10 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x10 - this.f5332U);
                        float y9 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y9 - this.f5333V);
                        if (abs > i && abs > abs2) {
                            this.f5327P = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f3 = this.f5334W;
                            float f9 = i;
                            this.f5332U = x10 - f3 > 0.0f ? f3 + f9 : f3 - f9;
                            this.f5333V = y9;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f5327P) {
                    z3 = o(motionEvent.getX(motionEvent.findPointerIndex(this.f5337o0)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f5332U = motionEvent.getX(actionIndex);
                    this.f5337o0 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    l(motionEvent);
                    this.f5332U = motionEvent.getX(motionEvent.findPointerIndex(this.f5337o0));
                }
            } else if (this.f5327P) {
                t(this.f5351y, 0, true, false);
                z3 = s();
            }
        } else if (this.f5327P) {
            VelocityTracker velocityTracker = this.f5338p0;
            velocityTracker.computeCurrentVelocity(1000, this.f5340r0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f5337o0);
            this.f5325N = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            G0.e i6 = i();
            float f10 = clientWidth;
            int i9 = i6.f1033b;
            float f11 = ((scrollX / f10) - i6.f1036e) / (i6.f1035d + (this.f5314E / f10));
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f5337o0)) - this.f5334W)) <= this.f5341s0 || Math.abs(xVelocity) <= this.f5339q0) {
                i9 += (int) (f11 + (i9 >= this.f5351y ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                i9++;
            }
            ArrayList arrayList = this.f5343u;
            if (arrayList.size() > 0) {
                i9 = Math.max(((G0.e) arrayList.get(0)).f1033b, Math.min(i9, ((G0.e) arrayList.get(arrayList.size() - 1)).f1033b));
            }
            u(i9, xVelocity, true, true);
            z3 = s();
        }
        if (z3) {
            WeakHashMap weakHashMap = X.f2054a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final void p() {
        q(this.f5351y);
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
        G0.e eVar;
        String hexString;
        ArrayList arrayList;
        G0.e eVar2;
        float f3;
        G0.e eVar3;
        G0.e h9;
        int i6;
        int i9;
        G0.e eVar4;
        G0.e eVar5;
        G0.e eVar6;
        int i10 = this.f5351y;
        if (i10 != i) {
            eVar = j(i10);
            this.f5351y = i;
        } else {
            eVar = null;
        }
        if (this.f5349x == null) {
            w();
            return;
        }
        if (this.f5325N) {
            w();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f5349x.getClass();
        int i11 = this.f5326O;
        int max = Math.max(0, this.f5351y - i11);
        int b9 = this.f5349x.b();
        int min = Math.min(b9 - 1, this.f5351y + i11);
        if (b9 != this.f5335n) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f5335n + ", found: " + b9 + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f5349x.getClass());
        }
        int i12 = 0;
        while (true) {
            arrayList = this.f5343u;
            if (i12 >= arrayList.size()) {
                break;
            }
            eVar2 = (G0.e) arrayList.get(i12);
            int i13 = eVar2.f1033b;
            int i14 = this.f5351y;
            if (i13 < i14) {
                i12++;
            }
        }
        if (eVar2 == null && b9 > 0) {
            eVar2 = a(this.f5351y, i12);
        }
        if (eVar2 != null) {
            int i15 = i12 - 1;
            G0.e eVar7 = i15 >= 0 ? (G0.e) arrayList.get(i15) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - eVar2.f1035d);
            float f9 = 0.0f;
            for (int i16 = this.f5351y - 1; i16 >= 0; i16--) {
                if (f9 >= paddingLeft && i16 < max) {
                    if (eVar7 == null) {
                        break;
                    }
                    if (i16 == eVar7.f1033b && !eVar7.f1034c) {
                        arrayList.remove(i15);
                        this.f5349x.a(this, eVar7.f1032a);
                        i15--;
                        i12--;
                        if (i15 >= 0) {
                            eVar6 = (G0.e) arrayList.get(i15);
                            eVar7 = eVar6;
                        }
                        eVar6 = null;
                        eVar7 = eVar6;
                    }
                } else if (eVar7 == null || i16 != eVar7.f1033b) {
                    f9 += a(i16, i15 + 1).f1035d;
                    i12++;
                    if (i15 >= 0) {
                        eVar6 = (G0.e) arrayList.get(i15);
                        eVar7 = eVar6;
                    }
                    eVar6 = null;
                    eVar7 = eVar6;
                } else {
                    f9 += eVar7.f1035d;
                    i15--;
                    if (i15 >= 0) {
                        eVar6 = (G0.e) arrayList.get(i15);
                        eVar7 = eVar6;
                    }
                    eVar6 = null;
                    eVar7 = eVar6;
                }
            }
            f3 = 0.0f;
            float f10 = eVar2.f1035d;
            int i17 = i12 + 1;
            if (f10 < 2.0f) {
                G0.e eVar8 = i17 < arrayList.size() ? (G0.e) arrayList.get(i17) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i18 = i17;
                for (int i19 = this.f5351y + 1; i19 < b9; i19++) {
                    if (f10 >= paddingRight && i19 > min) {
                        if (eVar8 == null) {
                            break;
                        }
                        if (i19 == eVar8.f1033b && !eVar8.f1034c) {
                            arrayList.remove(i18);
                            this.f5349x.a(this, eVar8.f1032a);
                            if (i18 < arrayList.size()) {
                                eVar8 = (G0.e) arrayList.get(i18);
                            }
                            eVar8 = null;
                        }
                    } else if (eVar8 == null || i19 != eVar8.f1033b) {
                        G0.e a9 = a(i19, i18);
                        i18++;
                        f10 += a9.f1035d;
                        if (i18 < arrayList.size()) {
                            eVar8 = (G0.e) arrayList.get(i18);
                        }
                        eVar8 = null;
                    } else {
                        f10 += eVar8.f1035d;
                        i18++;
                        if (i18 < arrayList.size()) {
                            eVar8 = (G0.e) arrayList.get(i18);
                        }
                        eVar8 = null;
                    }
                }
            }
            int b10 = this.f5349x.b();
            int clientWidth2 = getClientWidth();
            float f11 = clientWidth2 > 0 ? this.f5314E / clientWidth2 : 0.0f;
            if (eVar != null) {
                int i20 = eVar.f1033b;
                int i21 = eVar2.f1033b;
                if (i20 < i21) {
                    float f12 = eVar.f1036e + eVar.f1035d + f11;
                    int i22 = i20 + 1;
                    int i23 = 0;
                    while (i22 <= eVar2.f1033b && i23 < arrayList.size()) {
                        Object obj = arrayList.get(i23);
                        while (true) {
                            eVar5 = (G0.e) obj;
                            if (i22 <= eVar5.f1033b || i23 >= arrayList.size() - 1) {
                                break;
                            }
                            i23++;
                            obj = arrayList.get(i23);
                        }
                        while (i22 < eVar5.f1033b) {
                            this.f5349x.getClass();
                            f12 += 1.0f + f11;
                            i22++;
                        }
                        eVar5.f1036e = f12;
                        f12 += eVar5.f1035d + f11;
                        i22++;
                    }
                } else if (i20 > i21) {
                    int size = arrayList.size() - 1;
                    float f13 = eVar.f1036e;
                    while (true) {
                        i20--;
                        if (i20 < eVar2.f1033b || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            eVar4 = (G0.e) obj2;
                            if (i20 >= eVar4.f1033b || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i20 > eVar4.f1033b) {
                            this.f5349x.getClass();
                            f13 -= 1.0f + f11;
                            i20--;
                        }
                        f13 -= eVar4.f1035d + f11;
                        eVar4.f1036e = f13;
                    }
                }
            }
            int size2 = arrayList.size();
            float f14 = eVar2.f1036e;
            int i24 = eVar2.f1033b;
            int i25 = i24 - 1;
            this.f5321I = i24 == 0 ? f14 : -3.4028235E38f;
            int i26 = b10 - 1;
            this.J = i24 == i26 ? (eVar2.f1035d + f14) - 1.0f : Float.MAX_VALUE;
            int i27 = i12 - 1;
            while (i27 >= 0) {
                G0.e eVar9 = (G0.e) arrayList.get(i27);
                while (true) {
                    i9 = eVar9.f1033b;
                    if (i25 <= i9) {
                        break;
                    }
                    i25--;
                    this.f5349x.getClass();
                    f14 -= 1.0f + f11;
                }
                f14 -= eVar9.f1035d + f11;
                eVar9.f1036e = f14;
                if (i9 == 0) {
                    this.f5321I = f14;
                }
                i27--;
                i25--;
            }
            float f15 = eVar2.f1036e + eVar2.f1035d + f11;
            int i28 = eVar2.f1033b;
            while (true) {
                i28++;
                if (i17 >= size2) {
                    break;
                }
                G0.e eVar10 = (G0.e) arrayList.get(i17);
                while (true) {
                    i6 = eVar10.f1033b;
                    if (i28 >= i6) {
                        break;
                    }
                    i28++;
                    this.f5349x.getClass();
                    f15 += 1.0f + f11;
                }
                if (i6 == i26) {
                    this.J = (eVar10.f1035d + f15) - 1.0f;
                }
                eVar10.f1036e = f15;
                f15 += eVar10.f1035d + f11;
                i17++;
            }
            this.f5349x.getClass();
        } else {
            f3 = 0.0f;
        }
        this.f5349x.getClass();
        int childCount = getChildCount();
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt = getChildAt(i29);
            f fVar = (f) childAt.getLayoutParams();
            fVar.f1042f = i29;
            if (!fVar.f1037a && fVar.f1039c == f3 && (h9 = h(childAt)) != null) {
                fVar.f1039c = h9.f1035d;
                fVar.f1041e = h9.f1033b;
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
            if (eVar3 == null || eVar3.f1033b != this.f5351y) {
                for (int i30 = 0; i30 < getChildCount(); i30++) {
                    View childAt2 = getChildAt(i30);
                    G0.e h10 = h(childAt2);
                    if (h10 != null && h10.f1033b == this.f5351y && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void r(int i, int i6, int i9, int i10) {
        if (i6 > 0 && !this.f5343u.isEmpty()) {
            if (!this.f5309B.isFinished()) {
                this.f5309B.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i6 - getPaddingLeft()) - getPaddingRight()) + i10)) * (((i - getPaddingLeft()) - getPaddingRight()) + i9)), getScrollY());
                return;
            }
        }
        G0.e j6 = j(this.f5351y);
        int min = (int) ((j6 != null ? Math.min(j6.f1036e, this.J) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            d(false);
            scrollTo(min, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f5323L) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final boolean s() {
        this.f5337o0 = -1;
        this.f5327P = false;
        this.f5328Q = false;
        VelocityTracker velocityTracker = this.f5338p0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5338p0 = null;
        }
        this.f5344u0.onRelease();
        this.f5346v0.onRelease();
        return this.f5344u0.isFinished() || this.f5346v0.isFinished();
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList;
        a aVar2 = this.f5349x;
        if (aVar2 != null) {
            synchronized (aVar2) {
            }
            this.f5349x.getClass();
            int i = 0;
            while (true) {
                arrayList = this.f5343u;
                if (i >= arrayList.size()) {
                    break;
                }
                G0.e eVar = (G0.e) arrayList.get(i);
                a aVar3 = this.f5349x;
                int i6 = eVar.f1033b;
                aVar3.a(this, eVar.f1032a);
                i++;
            }
            this.f5349x.getClass();
            arrayList.clear();
            int i9 = 0;
            while (i9 < getChildCount()) {
                if (!((f) getChildAt(i9).getLayoutParams()).f1037a) {
                    removeViewAt(i9);
                    i9--;
                }
                i9++;
            }
            this.f5351y = 0;
            scrollTo(0, 0);
        }
        this.f5349x = aVar;
        this.f5335n = 0;
        if (aVar != null) {
            if (this.f5312D == null) {
                this.f5312D = new G0.i(0, this);
            }
            synchronized (this.f5349x) {
            }
            this.f5325N = false;
            boolean z3 = this.f5348w0;
            this.f5348w0 = true;
            this.f5335n = this.f5349x.b();
            if (this.f5353z >= 0) {
                this.f5349x.getClass();
                u(this.f5353z, 0, false, true);
                this.f5353z = -1;
                this.f5307A = null;
                return;
            }
            if (z3) {
                requestLayout();
            } else {
                p();
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f5325N = false;
        u(i, 0, !this.f5348w0, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f5326O) {
            this.f5326O = i;
            p();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(h hVar) {
        this.f5308A0 = hVar;
    }

    public void setPageMargin(int i) {
        int i6 = this.f5314E;
        this.f5314E = i;
        int width = getWidth();
        r(width, width, i, i6);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f5316F = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.f5319G0 == i) {
            return;
        }
        this.f5319G0 = i;
        if (this.f5310B0 != null) {
            boolean z3 = i != 0;
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                getChildAt(i6).setLayerType(z3 ? this.C0 : 0, null);
            }
        }
        ArrayList arrayList = this.f5354z0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
            }
        }
    }

    public final void t(int i, int i6, boolean z3, boolean z6) {
        int scrollX;
        int abs;
        Scroller scroller = this.f5309B;
        G0.e j6 = j(i);
        int max = j6 != null ? (int) (Math.max(this.f5321I, Math.min(j6.f1036e, this.J)) * getClientWidth()) : 0;
        if (!z3) {
            if (z6) {
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
                scrollX = this.f5311C ? scroller.getCurrX() : scroller.getStartX();
                scroller.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i9 = scrollX;
            int scrollY = getScrollY();
            int i10 = max - i9;
            int i11 = 0 - scrollY;
            if (i10 == 0 && i11 == 0) {
                d(false);
                p();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i12 = clientWidth / 2;
                float f3 = clientWidth;
                float f9 = i12;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i10) * 1.0f) / f3) - 0.5f) * 0.47123894f)) * f9) + f9;
                int abs2 = Math.abs(i6);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    this.f5349x.getClass();
                    abs = (int) (((Math.abs(i10) / ((f3 * 1.0f) + this.f5314E)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.f5311C = false;
                this.f5309B.startScroll(i9, scrollY, i10, i11, min);
                WeakHashMap weakHashMap = X.f2054a;
                postInvalidateOnAnimation();
            }
        }
        if (z6) {
            f(i);
        }
    }

    public final void u(int i, int i6, boolean z3, boolean z6) {
        a aVar = this.f5349x;
        if (aVar == null || aVar.b() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.f5343u;
        if (!z6 && this.f5351y == i && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f5349x.b()) {
            i = this.f5349x.b() - 1;
        }
        int i9 = this.f5326O;
        int i10 = this.f5351y;
        if (i > i10 + i9 || i < i10 - i9) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((G0.e) arrayList.get(i11)).f1034c = true;
            }
        }
        boolean z9 = this.f5351y != i;
        if (!this.f5348w0) {
            q(i);
            t(i, i6, z3, z9);
        } else {
            this.f5351y = i;
            if (z9) {
                f(i);
            }
            requestLayout();
        }
    }

    public final void v(e eVar) {
        boolean z3 = this.f5310B0 == null;
        this.f5310B0 = eVar;
        setChildrenDrawingOrderEnabled(true);
        this.f5313D0 = 1;
        this.C0 = 2;
        if (z3) {
            p();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5316F;
    }

    public final void w() {
        if (this.f5313D0 != 0) {
            ArrayList arrayList = this.f5315E0;
            if (arrayList == null) {
                this.f5315E0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f5315E0.add(getChildAt(i));
            }
            Collections.sort(this.f5315E0, f5306K0);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        f fVar = new f(context, attributeSet);
        fVar.f1039c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5303H0);
        fVar.f1038b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return fVar;
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(E.a.b(getContext(), i));
    }
}
