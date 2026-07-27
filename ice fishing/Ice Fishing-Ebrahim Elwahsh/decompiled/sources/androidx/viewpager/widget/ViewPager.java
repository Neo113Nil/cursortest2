package androidx.viewpager.widget;

import B.i;
import F3.C;
import G0.a;
import G0.b;
import G0.c;
import G0.d;
import G0.f;
import G0.g;
import G0.h;
import O.L;
import O.X;
import S0.l;
import W3.e;
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
    public static final int[] f5415H0 = {R.attr.layout_gravity};

    /* renamed from: I0, reason: collision with root package name */
    public static final i f5416I0 = new i(1);

    /* renamed from: J0, reason: collision with root package name */
    public static final b f5417J0 = new b(0);

    /* renamed from: K0, reason: collision with root package name */
    public static final i f5418K0 = new i(2);

    /* renamed from: A, reason: collision with root package name */
    public Parcelable f5419A;

    /* renamed from: A0, reason: collision with root package name */
    public g f5420A0;

    /* renamed from: B, reason: collision with root package name */
    public final Scroller f5421B;

    /* renamed from: B0, reason: collision with root package name */
    public e f5422B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f5423C;
    public int C0;

    /* renamed from: D, reason: collision with root package name */
    public h f5424D;

    /* renamed from: D0, reason: collision with root package name */
    public int f5425D0;

    /* renamed from: E, reason: collision with root package name */
    public int f5426E;

    /* renamed from: E0, reason: collision with root package name */
    public ArrayList f5427E0;

    /* renamed from: F, reason: collision with root package name */
    public Drawable f5428F;

    /* renamed from: F0, reason: collision with root package name */
    public final C f5429F0;

    /* renamed from: G, reason: collision with root package name */
    public int f5430G;

    /* renamed from: G0, reason: collision with root package name */
    public int f5431G0;

    /* renamed from: H, reason: collision with root package name */
    public int f5432H;

    /* renamed from: I, reason: collision with root package name */
    public float f5433I;
    public float J;

    /* renamed from: K, reason: collision with root package name */
    public int f5434K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f5435L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f5436M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f5437N;

    /* renamed from: O, reason: collision with root package name */
    public int f5438O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f5439P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f5440Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f5441R;

    /* renamed from: S, reason: collision with root package name */
    public int f5442S;

    /* renamed from: T, reason: collision with root package name */
    public final int f5443T;

    /* renamed from: U, reason: collision with root package name */
    public float f5444U;

    /* renamed from: V, reason: collision with root package name */
    public float f5445V;

    /* renamed from: W, reason: collision with root package name */
    public float f5446W;

    /* renamed from: n, reason: collision with root package name */
    public int f5447n;

    /* renamed from: n0, reason: collision with root package name */
    public float f5448n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f5449o0;

    /* renamed from: p0, reason: collision with root package name */
    public VelocityTracker f5450p0;

    /* renamed from: q0, reason: collision with root package name */
    public final int f5451q0;

    /* renamed from: r0, reason: collision with root package name */
    public final int f5452r0;

    /* renamed from: s0, reason: collision with root package name */
    public final int f5453s0;

    /* renamed from: t0, reason: collision with root package name */
    public final int f5454t0;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f5455u;

    /* renamed from: u0, reason: collision with root package name */
    public final EdgeEffect f5456u0;

    /* renamed from: v, reason: collision with root package name */
    public final d f5457v;

    /* renamed from: v0, reason: collision with root package name */
    public final EdgeEffect f5458v0;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f5459w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f5460w0;

    /* renamed from: x, reason: collision with root package name */
    public a f5461x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f5462x0;

    /* renamed from: y, reason: collision with root package name */
    public int f5463y;

    /* renamed from: y0, reason: collision with root package name */
    public int f5464y0;

    /* renamed from: z, reason: collision with root package name */
    public int f5465z;

    /* renamed from: z0, reason: collision with root package name */
    public ArrayList f5466z0;

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5455u = new ArrayList();
        this.f5457v = new d();
        this.f5459w = new Rect();
        this.f5465z = -1;
        this.f5419A = null;
        this.f5433I = -3.4028235E38f;
        this.J = Float.MAX_VALUE;
        this.f5438O = 1;
        this.f5449o0 = -1;
        this.f5460w0 = true;
        this.f5429F0 = new C(1, this);
        this.f5431G0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f5421B = new Scroller(context2, f5417J0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f6 = context2.getResources().getDisplayMetrics().density;
        this.f5443T = viewConfiguration.getScaledPagingTouchSlop();
        this.f5451q0 = (int) (400.0f * f6);
        this.f5452r0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5456u0 = new EdgeEffect(context2);
        this.f5458v0 = new EdgeEffect(context2);
        this.f5453s0 = (int) (25.0f * f6);
        this.f5454t0 = (int) (2.0f * f6);
        this.f5441R = (int) (f6 * 16.0f);
        X.o(this, new f(0, this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        L.u(this, new l(this));
    }

    public static boolean c(int i, int i4, int i9, View view, boolean z8) {
        int i10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i11 = i4 + scrollX;
                if (i11 >= childAt.getLeft() && i11 < childAt.getRight() && (i10 = i9 + scrollY) >= childAt.getTop() && i10 < childAt.getBottom() && c(i, i11 - childAt.getLeft(), i10 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        return z8 && view.canScrollHorizontally(-i);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z8) {
        if (this.f5436M != z8) {
            this.f5436M = z8;
        }
    }

    public final d a(int i, int i4) {
        d dVar = new d();
        dVar.f1177b = i;
        dVar.f1176a = this.f5461x.c(this, i);
        this.f5461x.getClass();
        dVar.f1179d = 1.0f;
        ArrayList arrayList = this.f5455u;
        if (i4 < 0 || i4 >= arrayList.size()) {
            arrayList.add(dVar);
            return dVar;
        }
        arrayList.add(i4, dVar);
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i4) {
        d h9;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() == 0 && (h9 = h(childAt)) != null && h9.f1177b == this.f5463y) {
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
        d h9;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (h9 = h(childAt)) != null && h9.f1177b == this.f5463y) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        G0.e eVar = (G0.e) layoutParams;
        boolean z8 = eVar.f1181a | (view.getClass().getAnnotation(c.class) != null);
        eVar.f1181a = z8;
        if (!this.f5435L) {
            super.addView(view, i, layoutParams);
        } else {
            if (z8) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            eVar.f1184d = true;
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
        boolean z8;
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
            z8 = false;
            if (findNextFocus == null && findNextFocus != findFocus) {
                Rect rect = this.f5459w;
                if (i == 17) {
                    int i9 = g(rect, findNextFocus).left;
                    int i10 = g(rect, findFocus).left;
                    if (findFocus == null || i9 < i10) {
                        requestFocus = findNextFocus.requestFocus();
                    } else {
                        int i11 = this.f5463y;
                        if (i11 > 0) {
                            this.f5437N = false;
                            u(i11 - 1, 0, true, false);
                            z8 = z9;
                        }
                        z9 = false;
                        z8 = z9;
                    }
                } else if (i == 66) {
                    requestFocus = (findFocus == null || g(rect, findNextFocus).left > g(rect, findFocus).left) ? findNextFocus.requestFocus() : m();
                }
                z8 = requestFocus;
            } else if (i != 17 || i == 1) {
                i4 = this.f5463y;
                if (i4 > 0) {
                    this.f5437N = false;
                    u(i4 - 1, 0, true, false);
                    z8 = z9;
                }
                z9 = false;
                z8 = z9;
            } else if (i == 66 || i == 2) {
                z8 = m();
            }
            if (z8) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
            }
            return z8;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        boolean z92 = true;
        z8 = false;
        if (findNextFocus == null) {
        }
        if (i != 17) {
        }
        i4 = this.f5463y;
        if (i4 > 0) {
        }
        z92 = false;
        z8 = z92;
        if (z8) {
        }
        return z8;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.f5461x == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f5433I)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.J));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof G0.e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f5423C = true;
        Scroller scroller = this.f5421B;
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
        WeakHashMap weakHashMap = X.f2240a;
        postInvalidateOnAnimation();
    }

    public final void d(boolean z8) {
        Scroller scroller = this.f5421B;
        boolean z9 = this.f5431G0 == 2;
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
        this.f5437N = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5455u;
            if (i >= arrayList.size()) {
                break;
            }
            d dVar = (d) arrayList.get(i);
            if (dVar.f1178c) {
                dVar.f1178c = false;
                z9 = true;
            }
            i++;
        }
        if (z9) {
            C c4 = this.f5429F0;
            if (!z8) {
                c4.run();
            } else {
                WeakHashMap weakHashMap = X.f2240a;
                postOnAnimation(c4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z8;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        z8 = keyEvent.hasModifiers(2) ? m() : b(66);
                    } else if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            z8 = b(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            z8 = b(1);
                        }
                    }
                    if (!z8) {
                        return false;
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        int i = this.f5463y;
                        if (i > 0) {
                            this.f5437N = false;
                            u(i - 1, 0, true, false);
                            z8 = true;
                        }
                    } else {
                        z8 = b(17);
                    }
                    if (!z8) {
                    }
                }
            }
            z8 = false;
            if (!z8) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        d h9;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (h9 = h(childAt)) != null && h9.f1177b == this.f5463y && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        a aVar;
        EdgeEffect edgeEffect = this.f5458v0;
        EdgeEffect edgeEffect2 = this.f5456u0;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z8 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f5461x) != null && aVar.b() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f5433I * width);
                edgeEffect2.setSize(height, width);
                z8 = edgeEffect2.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!edgeEffect.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.J + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                z8 |= edgeEffect.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (z8) {
            WeakHashMap weakHashMap = X.f2240a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5428F;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        int b9 = this.f5461x.b();
        this.f5447n = b9;
        ArrayList arrayList = this.f5455u;
        boolean z8 = arrayList.size() < (this.f5438O * 2) + 1 && arrayList.size() < b9;
        int i = this.f5463y;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            d dVar = (d) arrayList.get(i4);
            a aVar = this.f5461x;
            Object obj = dVar.f1176a;
            aVar.getClass();
        }
        Collections.sort(arrayList, f5416I0);
        if (z8) {
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                G0.e eVar = (G0.e) getChildAt(i9).getLayoutParams();
                if (!eVar.f1181a) {
                    eVar.f1183c = 0.0f;
                }
            }
            u(i, 0, false, true);
            requestLayout();
        }
    }

    public final void f(int i) {
        g gVar = this.f5420A0;
        if (gVar != null) {
            gVar.b(i);
        }
        ArrayList arrayList = this.f5466z0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                g gVar2 = (g) this.f5466z0.get(i4);
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
        G0.e eVar = new G0.e(-1, -1);
        eVar.f1183c = 0.0f;
        return eVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f5461x;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i4) {
        if (this.f5425D0 == 2) {
            i4 = (i - 1) - i4;
        }
        return ((G0.e) ((View) this.f5427E0.get(i4)).getLayoutParams()).f1186f;
    }

    public int getCurrentItem() {
        return this.f5463y;
    }

    public int getOffscreenPageLimit() {
        return this.f5438O;
    }

    public int getPageMargin() {
        return this.f5426E;
    }

    public final d h(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5455u;
            if (i >= arrayList.size()) {
                return null;
            }
            d dVar = (d) arrayList.get(i);
            if (this.f5461x.d(view, dVar.f1176a)) {
                return dVar;
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
    public final d i() {
        d dVar;
        int i;
        int clientWidth = getClientWidth();
        float f6 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f9 = clientWidth > 0 ? this.f5426E / clientWidth : 0.0f;
        int i4 = 0;
        boolean z8 = true;
        d dVar2 = null;
        int i9 = -1;
        float f10 = 0.0f;
        while (true) {
            ArrayList arrayList = this.f5455u;
            if (i4 >= arrayList.size()) {
                break;
            }
            d dVar3 = (d) arrayList.get(i4);
            if (z8 || dVar3.f1177b == (i = i9 + 1)) {
                dVar = dVar3;
            } else {
                float f11 = f6 + f10 + f9;
                d dVar4 = this.f5457v;
                dVar4.f1180e = f11;
                dVar4.f1177b = i;
                this.f5461x.getClass();
                dVar4.f1179d = 1.0f;
                i4--;
                dVar = dVar4;
            }
            f6 = dVar.f1180e;
            float f12 = dVar.f1179d + f6 + f9;
            if (!z8 && scrollX < f6) {
                break;
            }
            if (scrollX < f12 || i4 == arrayList.size() - 1) {
                break;
            }
            int i10 = dVar.f1177b;
            float f13 = dVar.f1179d;
            i4++;
            d dVar5 = dVar;
            i9 = i10;
            f10 = f13;
            dVar2 = dVar5;
            z8 = false;
        }
        return dVar;
    }

    public final d j(int i) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f5455u;
            if (i4 >= arrayList.size()) {
                return null;
            }
            d dVar = (d) arrayList.get(i4);
            if (dVar.f1177b == i) {
                return dVar;
            }
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i, int i4, float f6) {
        int max;
        int i9;
        int left;
        if (this.f5464y0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                G0.e eVar = (G0.e) childAt.getLayoutParams();
                if (eVar.f1181a) {
                    int i11 = eVar.f1182b & 7;
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
        g gVar = this.f5420A0;
        if (gVar != null) {
            gVar.a(i);
        }
        ArrayList arrayList = this.f5466z0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                g gVar2 = (g) this.f5466z0.get(i13);
                if (gVar2 != null) {
                    gVar2.a(i);
                }
            }
        }
        if (this.f5422B0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = getChildAt(i14);
                if (!((G0.e) childAt2.getLayoutParams()).f1181a) {
                    float left2 = (childAt2.getLeft() - scrollX2) / getClientWidth();
                    this.f5422B0.getClass();
                    childAt2.setScaleY(1.0f - (Math.abs(left2) * 0.100000024f));
                    childAt2.setScaleX((Math.abs(left2) * 0.100000024f) + 0.9f);
                }
            }
        }
        this.f5462x0 = true;
    }

    public final void l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5449o0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f5444U = motionEvent.getX(i);
            this.f5449o0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f5450p0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean m() {
        a aVar = this.f5461x;
        if (aVar == null || this.f5463y >= aVar.b() - 1) {
            return false;
        }
        int i = this.f5463y + 1;
        this.f5437N = false;
        u(i, 0, true, false);
        return true;
    }

    public final boolean n(int i) {
        if (this.f5455u.size() == 0) {
            if (!this.f5460w0) {
                this.f5462x0 = false;
                k(0, 0, 0.0f);
                if (!this.f5462x0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        d i4 = i();
        int clientWidth = getClientWidth();
        int i9 = this.f5426E;
        int i10 = clientWidth + i9;
        float f6 = clientWidth;
        int i11 = i4.f1177b;
        float f9 = ((i / f6) - i4.f1180e) / (i4.f1179d + (i9 / f6));
        this.f5462x0 = false;
        k(i11, (int) (i10 * f9), f9);
        if (this.f5462x0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean o(float f6) {
        boolean z8;
        boolean z9;
        float f9 = this.f5444U - f6;
        this.f5444U = f6;
        float scrollX = getScrollX() + f9;
        float clientWidth = getClientWidth();
        float f10 = this.f5433I * clientWidth;
        float f11 = this.J * clientWidth;
        ArrayList arrayList = this.f5455u;
        boolean z10 = false;
        d dVar = (d) arrayList.get(0);
        d dVar2 = (d) arrayList.get(arrayList.size() - 1);
        if (dVar.f1177b != 0) {
            f10 = dVar.f1180e * clientWidth;
            z8 = false;
        } else {
            z8 = true;
        }
        if (dVar2.f1177b != this.f5461x.b() - 1) {
            f11 = dVar2.f1180e * clientWidth;
            z9 = false;
        } else {
            z9 = true;
        }
        if (scrollX < f10) {
            if (z8) {
                this.f5456u0.onPull(Math.abs(f10 - scrollX) / clientWidth);
                z10 = true;
            }
            scrollX = f10;
        } else if (scrollX > f11) {
            if (z9) {
                this.f5458v0.onPull(Math.abs(scrollX - f11) / clientWidth);
                z10 = true;
            }
            scrollX = f11;
        }
        int i = (int) scrollX;
        this.f5444U = (scrollX - i) + this.f5444U;
        scrollTo(i, getScrollY());
        n(i);
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5460w0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f5429F0);
        Scroller scroller = this.f5421B;
        if (scroller != null && !scroller.isFinished()) {
            this.f5421B.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f6;
        ArrayList arrayList;
        int i4;
        super.onDraw(canvas);
        if (this.f5426E <= 0 || this.f5428F == null) {
            return;
        }
        ArrayList arrayList2 = this.f5455u;
        if (arrayList2.size() <= 0 || this.f5461x == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f9 = this.f5426E / width;
        int i9 = 0;
        d dVar = (d) arrayList2.get(0);
        float f10 = dVar.f1180e;
        int size = arrayList2.size();
        int i10 = dVar.f1177b;
        int i11 = ((d) arrayList2.get(size - 1)).f1177b;
        while (i10 < i11) {
            while (true) {
                i = dVar.f1177b;
                if (i10 <= i || i9 >= size) {
                    break;
                }
                i9++;
                dVar = (d) arrayList2.get(i9);
            }
            if (i10 == i) {
                float f11 = dVar.f1180e;
                float f12 = dVar.f1179d;
                f6 = (f11 + f12) * width;
                f10 = f11 + f12 + f9;
            } else {
                this.f5461x.getClass();
                f6 = (f10 + 1.0f) * width;
                f10 = 1.0f + f9 + f10;
            }
            if (this.f5426E + f6 > scrollX) {
                arrayList = arrayList2;
                i4 = scrollX;
                this.f5428F.setBounds(Math.round(f6), this.f5430G, Math.round(this.f5426E + f6), this.f5432H);
                this.f5428F.draw(canvas);
            } else {
                arrayList = arrayList2;
                i4 = scrollX;
            }
            if (f6 > i4 + r3) {
                return;
            }
            i10++;
            arrayList2 = arrayList;
            scrollX = i4;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = this.f5443T;
        Scroller scroller = this.f5421B;
        int action = motionEvent.getAction() & p.f8630b;
        if (action == 3 || action == 1) {
            s();
            return false;
        }
        if (action != 0) {
            if (this.f5439P) {
                return true;
            }
            if (this.f5440Q) {
                return false;
            }
        }
        if (action == 0) {
            float x3 = motionEvent.getX();
            this.f5446W = x3;
            this.f5444U = x3;
            float y6 = motionEvent.getY();
            this.f5448n0 = y6;
            this.f5445V = y6;
            this.f5449o0 = motionEvent.getPointerId(0);
            this.f5440Q = false;
            this.f5423C = true;
            scroller.computeScrollOffset();
            if (this.f5431G0 != 2 || Math.abs(scroller.getFinalX() - scroller.getCurrX()) <= this.f5454t0) {
                d(false);
                this.f5439P = false;
            } else {
                scroller.abortAnimation();
                this.f5437N = false;
                p();
                this.f5439P = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i4 = this.f5449o0;
            if (i4 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i4);
                float x9 = motionEvent.getX(findPointerIndex);
                float f6 = x9 - this.f5444U;
                float abs = Math.abs(f6);
                float y8 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y8 - this.f5448n0);
                if (f6 != 0.0f) {
                    float f9 = this.f5444U;
                    if ((f9 >= this.f5442S || f6 <= 0.0f) && ((f9 <= getWidth() - this.f5442S || f6 >= 0.0f) && c((int) f6, (int) x9, (int) y8, this, false))) {
                        this.f5444U = x9;
                        this.f5445V = y8;
                        this.f5440Q = true;
                        return false;
                    }
                }
                float f10 = i;
                if (abs > f10 && abs * 0.5f > abs2) {
                    this.f5439P = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f11 = this.f5446W;
                    float f12 = i;
                    this.f5444U = f6 > 0.0f ? f11 + f12 : f11 - f12;
                    this.f5445V = y8;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f10) {
                    this.f5440Q = true;
                }
                if (this.f5439P && o(x9)) {
                    WeakHashMap weakHashMap = X.f2240a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            l(motionEvent);
        }
        if (this.f5450p0 == null) {
            this.f5450p0 = VelocityTracker.obtain();
        }
        this.f5450p0.addMovement(motionEvent);
        return this.f5439P;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        boolean z9;
        d h9;
        int max;
        int i11;
        int max2;
        int i12;
        int childCount = getChildCount();
        int i13 = i9 - i;
        int i14 = i10 - i4;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                G0.e eVar = (G0.e) childAt.getLayoutParams();
                if (eVar.f1181a) {
                    int i17 = eVar.f1182b;
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
                G0.e eVar2 = (G0.e) childAt2.getLayoutParams();
                if (!eVar2.f1181a && (h9 = h(childAt2)) != null) {
                    float f6 = i23;
                    int i25 = ((int) (h9.f1180e * f6)) + paddingLeft;
                    if (eVar2.f1184d) {
                        eVar2.f1184d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f6 * eVar2.f1183c), 1073741824), View.MeasureSpec.makeMeasureSpec((i14 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i25, paddingTop, childAt2.getMeasuredWidth() + i25, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f5430G = paddingTop;
        this.f5432H = i14 - paddingBottom;
        this.f5464y0 = i15;
        if (this.f5460w0) {
            z9 = false;
            t(this.f5463y, 0, false, false);
        } else {
            z9 = false;
        }
        this.f5460w0 = z9;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        G0.e eVar;
        G0.e eVar2;
        int i9;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i4));
        int measuredWidth = getMeasuredWidth();
        this.f5442S = Math.min(measuredWidth / 10, this.f5441R);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            boolean z8 = true;
            int i11 = 1073741824;
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8 && (eVar2 = (G0.e) childAt.getLayoutParams()) != null && eVar2.f1181a) {
                int i12 = eVar2.f1182b;
                int i13 = i12 & 7;
                int i14 = i12 & 112;
                boolean z9 = i14 == 48 || i14 == 80;
                if (i13 != 3 && i13 != 5) {
                    z8 = false;
                }
                int i15 = Integer.MIN_VALUE;
                if (z9) {
                    i9 = Integer.MIN_VALUE;
                    i15 = 1073741824;
                } else {
                    i9 = z8 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i16 = ((ViewGroup.LayoutParams) eVar2).width;
                if (i16 != -2) {
                    if (i16 == -1) {
                        i16 = paddingLeft;
                    }
                    i15 = 1073741824;
                } else {
                    i16 = paddingLeft;
                }
                int i17 = ((ViewGroup.LayoutParams) eVar2).height;
                if (i17 == -2) {
                    i17 = measuredHeight;
                    i11 = i9;
                } else if (i17 == -1) {
                    i17 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, i15), View.MeasureSpec.makeMeasureSpec(i17, i11));
                if (z9) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z8) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i10++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f5434K = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f5435L = true;
        p();
        this.f5435L = false;
        int childCount2 = getChildCount();
        for (int i18 = 0; i18 < childCount2; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8 && ((eVar = (G0.e) childAt2.getLayoutParams()) == null || !eVar.f1181a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * eVar.f1183c), 1073741824), this.f5434K);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i4;
        int i9;
        int i10;
        d h9;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i9 = childCount;
            i4 = 0;
            i10 = 1;
        } else {
            i4 = childCount - 1;
            i9 = -1;
            i10 = -1;
        }
        while (i4 != i9) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (h9 = h(childAt)) != null && h9.f1177b == this.f5463y && childAt.requestFocus(i, rect)) {
                return true;
            }
            i4 += i10;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof G0.i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        G0.i iVar = (G0.i) parcelable;
        super.onRestoreInstanceState(iVar.f3318n);
        if (this.f5461x != null) {
            u(iVar.f1191v, 0, false, true);
        } else {
            this.f5465z = iVar.f1191v;
            this.f5419A = iVar.f1192w;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        G0.i iVar = new G0.i(super.onSaveInstanceState());
        iVar.f1191v = this.f5463y;
        a aVar = this.f5461x;
        if (aVar != null) {
            aVar.getClass();
            iVar.f1192w = null;
        }
        return iVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i9, int i10) {
        super.onSizeChanged(i, i4, i9, i10);
        if (i != i9) {
            int i11 = this.f5426E;
            r(i, i9, i11, i11);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        int i = this.f5443T;
        boolean z8 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f5461x) == null || aVar.b() == 0) {
            return false;
        }
        if (this.f5450p0 == null) {
            this.f5450p0 = VelocityTracker.obtain();
        }
        this.f5450p0.addMovement(motionEvent);
        int action = motionEvent.getAction() & p.f8630b;
        if (action == 0) {
            this.f5421B.abortAnimation();
            this.f5437N = false;
            p();
            float x3 = motionEvent.getX();
            this.f5446W = x3;
            this.f5444U = x3;
            float y6 = motionEvent.getY();
            this.f5448n0 = y6;
            this.f5445V = y6;
            this.f5449o0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f5439P) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f5449o0);
                    if (findPointerIndex == -1) {
                        z8 = s();
                    } else {
                        float x9 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x9 - this.f5444U);
                        float y8 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y8 - this.f5445V);
                        if (abs > i && abs > abs2) {
                            this.f5439P = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f6 = this.f5446W;
                            float f9 = i;
                            this.f5444U = x9 - f6 > 0.0f ? f6 + f9 : f6 - f9;
                            this.f5445V = y8;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f5439P) {
                    z8 = o(motionEvent.getX(motionEvent.findPointerIndex(this.f5449o0)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f5444U = motionEvent.getX(actionIndex);
                    this.f5449o0 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    l(motionEvent);
                    this.f5444U = motionEvent.getX(motionEvent.findPointerIndex(this.f5449o0));
                }
            } else if (this.f5439P) {
                t(this.f5463y, 0, true, false);
                z8 = s();
            }
        } else if (this.f5439P) {
            VelocityTracker velocityTracker = this.f5450p0;
            velocityTracker.computeCurrentVelocity(1000, this.f5452r0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f5449o0);
            this.f5437N = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            d i4 = i();
            float f10 = clientWidth;
            int i9 = i4.f1177b;
            float f11 = ((scrollX / f10) - i4.f1180e) / (i4.f1179d + (this.f5426E / f10));
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f5449o0)) - this.f5446W)) <= this.f5453s0 || Math.abs(xVelocity) <= this.f5451q0) {
                i9 += (int) (f11 + (i9 >= this.f5463y ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                i9++;
            }
            ArrayList arrayList = this.f5455u;
            if (arrayList.size() > 0) {
                i9 = Math.max(((d) arrayList.get(0)).f1177b, Math.min(i9, ((d) arrayList.get(arrayList.size() - 1)).f1177b));
            }
            u(i9, xVelocity, true, true);
            z8 = s();
        }
        if (z8) {
            WeakHashMap weakHashMap = X.f2240a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final void p() {
        q(this.f5463y);
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
        d dVar;
        String hexString;
        ArrayList arrayList;
        d dVar2;
        float f6;
        d dVar3;
        d h9;
        int i4;
        int i9;
        d dVar4;
        d dVar5;
        d dVar6;
        int i10 = this.f5463y;
        if (i10 != i) {
            dVar = j(i10);
            this.f5463y = i;
        } else {
            dVar = null;
        }
        if (this.f5461x == null) {
            w();
            return;
        }
        if (this.f5437N) {
            w();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f5461x.getClass();
        int i11 = this.f5438O;
        int max = Math.max(0, this.f5463y - i11);
        int b9 = this.f5461x.b();
        int min = Math.min(b9 - 1, this.f5463y + i11);
        if (b9 != this.f5447n) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f5447n + ", found: " + b9 + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f5461x.getClass());
        }
        int i12 = 0;
        while (true) {
            arrayList = this.f5455u;
            if (i12 >= arrayList.size()) {
                break;
            }
            dVar2 = (d) arrayList.get(i12);
            int i13 = dVar2.f1177b;
            int i14 = this.f5463y;
            if (i13 < i14) {
                i12++;
            }
        }
        if (dVar2 == null && b9 > 0) {
            dVar2 = a(this.f5463y, i12);
        }
        if (dVar2 != null) {
            int i15 = i12 - 1;
            d dVar7 = i15 >= 0 ? (d) arrayList.get(i15) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - dVar2.f1179d);
            float f9 = 0.0f;
            for (int i16 = this.f5463y - 1; i16 >= 0; i16--) {
                if (f9 >= paddingLeft && i16 < max) {
                    if (dVar7 == null) {
                        break;
                    }
                    if (i16 == dVar7.f1177b && !dVar7.f1178c) {
                        arrayList.remove(i15);
                        this.f5461x.a(this, dVar7.f1176a);
                        i15--;
                        i12--;
                        if (i15 >= 0) {
                            dVar6 = (d) arrayList.get(i15);
                            dVar7 = dVar6;
                        }
                        dVar6 = null;
                        dVar7 = dVar6;
                    }
                } else if (dVar7 == null || i16 != dVar7.f1177b) {
                    f9 += a(i16, i15 + 1).f1179d;
                    i12++;
                    if (i15 >= 0) {
                        dVar6 = (d) arrayList.get(i15);
                        dVar7 = dVar6;
                    }
                    dVar6 = null;
                    dVar7 = dVar6;
                } else {
                    f9 += dVar7.f1179d;
                    i15--;
                    if (i15 >= 0) {
                        dVar6 = (d) arrayList.get(i15);
                        dVar7 = dVar6;
                    }
                    dVar6 = null;
                    dVar7 = dVar6;
                }
            }
            f6 = 0.0f;
            float f10 = dVar2.f1179d;
            int i17 = i12 + 1;
            if (f10 < 2.0f) {
                d dVar8 = i17 < arrayList.size() ? (d) arrayList.get(i17) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i18 = i17;
                for (int i19 = this.f5463y + 1; i19 < b9; i19++) {
                    if (f10 >= paddingRight && i19 > min) {
                        if (dVar8 == null) {
                            break;
                        }
                        if (i19 == dVar8.f1177b && !dVar8.f1178c) {
                            arrayList.remove(i18);
                            this.f5461x.a(this, dVar8.f1176a);
                            if (i18 < arrayList.size()) {
                                dVar8 = (d) arrayList.get(i18);
                            }
                            dVar8 = null;
                        }
                    } else if (dVar8 == null || i19 != dVar8.f1177b) {
                        d a9 = a(i19, i18);
                        i18++;
                        f10 += a9.f1179d;
                        if (i18 < arrayList.size()) {
                            dVar8 = (d) arrayList.get(i18);
                        }
                        dVar8 = null;
                    } else {
                        f10 += dVar8.f1179d;
                        i18++;
                        if (i18 < arrayList.size()) {
                            dVar8 = (d) arrayList.get(i18);
                        }
                        dVar8 = null;
                    }
                }
            }
            int b10 = this.f5461x.b();
            int clientWidth2 = getClientWidth();
            float f11 = clientWidth2 > 0 ? this.f5426E / clientWidth2 : 0.0f;
            if (dVar != null) {
                int i20 = dVar.f1177b;
                int i21 = dVar2.f1177b;
                if (i20 < i21) {
                    float f12 = dVar.f1180e + dVar.f1179d + f11;
                    int i22 = i20 + 1;
                    int i23 = 0;
                    while (i22 <= dVar2.f1177b && i23 < arrayList.size()) {
                        Object obj = arrayList.get(i23);
                        while (true) {
                            dVar5 = (d) obj;
                            if (i22 <= dVar5.f1177b || i23 >= arrayList.size() - 1) {
                                break;
                            }
                            i23++;
                            obj = arrayList.get(i23);
                        }
                        while (i22 < dVar5.f1177b) {
                            this.f5461x.getClass();
                            f12 += 1.0f + f11;
                            i22++;
                        }
                        dVar5.f1180e = f12;
                        f12 += dVar5.f1179d + f11;
                        i22++;
                    }
                } else if (i20 > i21) {
                    int size = arrayList.size() - 1;
                    float f13 = dVar.f1180e;
                    while (true) {
                        i20--;
                        if (i20 < dVar2.f1177b || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            dVar4 = (d) obj2;
                            if (i20 >= dVar4.f1177b || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i20 > dVar4.f1177b) {
                            this.f5461x.getClass();
                            f13 -= 1.0f + f11;
                            i20--;
                        }
                        f13 -= dVar4.f1179d + f11;
                        dVar4.f1180e = f13;
                    }
                }
            }
            int size2 = arrayList.size();
            float f14 = dVar2.f1180e;
            int i24 = dVar2.f1177b;
            int i25 = i24 - 1;
            this.f5433I = i24 == 0 ? f14 : -3.4028235E38f;
            int i26 = b10 - 1;
            this.J = i24 == i26 ? (dVar2.f1179d + f14) - 1.0f : Float.MAX_VALUE;
            int i27 = i12 - 1;
            while (i27 >= 0) {
                d dVar9 = (d) arrayList.get(i27);
                while (true) {
                    i9 = dVar9.f1177b;
                    if (i25 <= i9) {
                        break;
                    }
                    i25--;
                    this.f5461x.getClass();
                    f14 -= 1.0f + f11;
                }
                f14 -= dVar9.f1179d + f11;
                dVar9.f1180e = f14;
                if (i9 == 0) {
                    this.f5433I = f14;
                }
                i27--;
                i25--;
            }
            float f15 = dVar2.f1180e + dVar2.f1179d + f11;
            int i28 = dVar2.f1177b;
            while (true) {
                i28++;
                if (i17 >= size2) {
                    break;
                }
                d dVar10 = (d) arrayList.get(i17);
                while (true) {
                    i4 = dVar10.f1177b;
                    if (i28 >= i4) {
                        break;
                    }
                    i28++;
                    this.f5461x.getClass();
                    f15 += 1.0f + f11;
                }
                if (i4 == i26) {
                    this.J = (dVar10.f1179d + f15) - 1.0f;
                }
                dVar10.f1180e = f15;
                f15 += dVar10.f1179d + f11;
                i17++;
            }
            this.f5461x.getClass();
        } else {
            f6 = 0.0f;
        }
        this.f5461x.getClass();
        int childCount = getChildCount();
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt = getChildAt(i29);
            G0.e eVar = (G0.e) childAt.getLayoutParams();
            eVar.f1186f = i29;
            if (!eVar.f1181a && eVar.f1183c == f6 && (h9 = h(childAt)) != null) {
                eVar.f1183c = h9.f1179d;
                eVar.f1185e = h9.f1177b;
            }
        }
        w();
        if (hasFocus()) {
            View findFocus = findFocus();
            if (findFocus != null) {
                while (true) {
                    Object parent = findFocus.getParent();
                    if (parent == this) {
                        dVar3 = h(findFocus);
                        break;
                    } else if (parent == null || !(parent instanceof View)) {
                        break;
                    } else {
                        findFocus = (View) parent;
                    }
                }
            }
            dVar3 = null;
            if (dVar3 == null || dVar3.f1177b != this.f5463y) {
                for (int i30 = 0; i30 < getChildCount(); i30++) {
                    View childAt2 = getChildAt(i30);
                    d h10 = h(childAt2);
                    if (h10 != null && h10.f1177b == this.f5463y && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void r(int i, int i4, int i9, int i10) {
        if (i4 > 0 && !this.f5455u.isEmpty()) {
            if (!this.f5421B.isFinished()) {
                this.f5421B.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i4 - getPaddingLeft()) - getPaddingRight()) + i10)) * (((i - getPaddingLeft()) - getPaddingRight()) + i9)), getScrollY());
                return;
            }
        }
        d j9 = j(this.f5463y);
        int min = (int) ((j9 != null ? Math.min(j9.f1180e, this.J) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            d(false);
            scrollTo(min, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f5435L) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final boolean s() {
        this.f5449o0 = -1;
        this.f5439P = false;
        this.f5440Q = false;
        VelocityTracker velocityTracker = this.f5450p0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5450p0 = null;
        }
        this.f5456u0.onRelease();
        this.f5458v0.onRelease();
        return this.f5456u0.isFinished() || this.f5458v0.isFinished();
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList;
        a aVar2 = this.f5461x;
        if (aVar2 != null) {
            synchronized (aVar2) {
            }
            this.f5461x.getClass();
            int i = 0;
            while (true) {
                arrayList = this.f5455u;
                if (i >= arrayList.size()) {
                    break;
                }
                d dVar = (d) arrayList.get(i);
                a aVar3 = this.f5461x;
                int i4 = dVar.f1177b;
                aVar3.a(this, dVar.f1176a);
                i++;
            }
            this.f5461x.getClass();
            arrayList.clear();
            int i9 = 0;
            while (i9 < getChildCount()) {
                if (!((G0.e) getChildAt(i9).getLayoutParams()).f1181a) {
                    removeViewAt(i9);
                    i9--;
                }
                i9++;
            }
            this.f5463y = 0;
            scrollTo(0, 0);
        }
        this.f5461x = aVar;
        this.f5447n = 0;
        if (aVar != null) {
            if (this.f5424D == null) {
                this.f5424D = new h(0, this);
            }
            synchronized (this.f5461x) {
            }
            this.f5437N = false;
            boolean z8 = this.f5460w0;
            this.f5460w0 = true;
            this.f5447n = this.f5461x.b();
            if (this.f5465z >= 0) {
                this.f5461x.getClass();
                u(this.f5465z, 0, false, true);
                this.f5465z = -1;
                this.f5419A = null;
                return;
            }
            if (z8) {
                requestLayout();
            } else {
                p();
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f5437N = false;
        u(i, 0, !this.f5460w0, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f5438O) {
            this.f5438O = i;
            p();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(g gVar) {
        this.f5420A0 = gVar;
    }

    public void setPageMargin(int i) {
        int i4 = this.f5426E;
        this.f5426E = i;
        int width = getWidth();
        r(width, width, i, i4);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f5428F = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.f5431G0 == i) {
            return;
        }
        this.f5431G0 = i;
        if (this.f5422B0 != null) {
            boolean z8 = i != 0;
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                getChildAt(i4).setLayerType(z8 ? this.C0 : 0, null);
            }
        }
        ArrayList arrayList = this.f5466z0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
            }
        }
    }

    public final void t(int i, int i4, boolean z8, boolean z9) {
        int scrollX;
        int abs;
        Scroller scroller = this.f5421B;
        d j9 = j(i);
        int max = j9 != null ? (int) (Math.max(this.f5433I, Math.min(j9.f1180e, this.J)) * getClientWidth()) : 0;
        if (!z8) {
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
                scrollX = this.f5423C ? scroller.getCurrX() : scroller.getStartX();
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
                float f6 = clientWidth;
                float f9 = i12;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i10) * 1.0f) / f6) - 0.5f) * 0.47123894f)) * f9) + f9;
                int abs2 = Math.abs(i4);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    this.f5461x.getClass();
                    abs = (int) (((Math.abs(i10) / ((f6 * 1.0f) + this.f5426E)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.f5423C = false;
                this.f5421B.startScroll(i9, scrollY, i10, i11, min);
                WeakHashMap weakHashMap = X.f2240a;
                postInvalidateOnAnimation();
            }
        }
        if (z9) {
            f(i);
        }
    }

    public final void u(int i, int i4, boolean z8, boolean z9) {
        a aVar = this.f5461x;
        if (aVar == null || aVar.b() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.f5455u;
        if (!z9 && this.f5463y == i && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f5461x.b()) {
            i = this.f5461x.b() - 1;
        }
        int i9 = this.f5438O;
        int i10 = this.f5463y;
        if (i > i10 + i9 || i < i10 - i9) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).f1178c = true;
            }
        }
        boolean z10 = this.f5463y != i;
        if (!this.f5460w0) {
            q(i);
            t(i, i4, z8, z10);
        } else {
            this.f5463y = i;
            if (z10) {
                f(i);
            }
            requestLayout();
        }
    }

    public final void v(e eVar) {
        boolean z8 = this.f5422B0 == null;
        this.f5422B0 = eVar;
        setChildrenDrawingOrderEnabled(true);
        this.f5425D0 = 1;
        this.C0 = 2;
        if (z8) {
            p();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5428F;
    }

    public final void w() {
        if (this.f5425D0 != 0) {
            ArrayList arrayList = this.f5427E0;
            if (arrayList == null) {
                this.f5427E0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f5427E0.add(getChildAt(i));
            }
            Collections.sort(this.f5427E0, f5418K0);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        G0.e eVar = new G0.e(context, attributeSet);
        eVar.f1183c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5415H0);
        eVar.f1182b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return eVar;
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(E.a.b(getContext(), i));
    }
}
