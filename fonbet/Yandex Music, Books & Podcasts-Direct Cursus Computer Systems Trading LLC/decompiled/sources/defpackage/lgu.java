package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
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
import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayout;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class lgu extends ViewGroup {
    public static final int[] I0 = {R.attr.layout_gravity};
    public static final t1n J0 = new t1n(15);
    public static final q0f K0 = new q0f(4);
    public static final t1n L0 = new t1n(16);
    public int A;
    public xfu A0;
    public float B;
    public ArrayList B0;
    public float C;
    public ozw C0;
    public float D;
    public int D0;
    public float E;
    public int E0;
    public int F;
    public ArrayList F0;
    public VelocityTracker G;
    public final yyo G0;
    public int H;
    public int H0;
    public int I;
    public int J;
    public int K;
    public EdgeEffect L;
    public int a;
    public final ArrayList b;
    public final vfu c;
    public final Rect d;
    public h2k e;
    public int f;
    public int g;
    public Parcelable h;
    public Scroller i;
    public boolean j;
    public nr2 k;
    public int l;
    public Drawable m;
    public int n;
    public int o;
    public float p;
    public float q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public EdgeEffect v0;
    public boolean w;
    public boolean w0;
    public boolean x;
    public boolean x0;
    public int y;
    public int y0;
    public int z;
    public ArrayList z0;

    public lgu(@NonNull Context context) {
        super(context);
        this.b = new ArrayList();
        this.c = new vfu();
        this.d = new Rect();
        this.g = -1;
        this.h = null;
        this.p = -3.4028235E38f;
        this.q = Float.MAX_VALUE;
        this.v = 1;
        this.F = -1;
        this.w0 = true;
        this.G0 = new yyo(12, this);
        this.H0 = 0;
        l();
    }

    public static boolean d(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && d(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.t != z) {
            this.t = z;
        }
    }

    public final void A() {
        if (this.E0 != 0) {
            ArrayList arrayList = this.F0;
            if (arrayList == null) {
                this.F0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.F0.add(getChildAt(i));
            }
            Collections.sort(this.F0, L0);
        }
    }

    public final vfu a(int i, int i2) {
        ViewGroup viewGroup;
        vfu vfuVar = new vfu();
        vfuVar.b = i;
        pq2 pq2Var = (pq2) this.e;
        xo9 xo9Var = pq2Var.d;
        xxo xxoVar = xo9Var.d;
        if (wyf.N(xxoVar)) {
            i = (pq2Var.b() - i) - 1;
        }
        rq2 rq2Var = (rq2) xo9Var.h.get(Integer.valueOf(i));
        if (rq2Var != null) {
            viewGroup = rq2Var.a;
            viewGroup.getParent();
        } else {
            viewGroup = (ViewGroup) xo9Var.a.a(xo9Var.i);
            xj9 xj9Var = (xj9) xo9Var.m.m().get(i);
            xo9 xo9Var2 = pq2Var.d;
            rq2 rq2Var2 = new rq2(xo9Var2, viewGroup, xj9Var, i);
            xo9Var2.h.put(Integer.valueOf(i), rq2Var2);
            rq2Var = rq2Var2;
        }
        addView(viewGroup);
        xo9Var.g.put(viewGroup, rq2Var);
        if (i == xxoVar.getCurrentItem()) {
            rq2Var.a();
        }
        SparseArray<Parcelable> sparseArray = pq2Var.c;
        if (sparseArray != null) {
            viewGroup.restoreHierarchyState(sparseArray);
        }
        vfuVar.a = viewGroup;
        this.e.getClass();
        vfuVar.d = 1.0f;
        ArrayList arrayList = this.b;
        if (i2 < 0 || i2 >= arrayList.size()) {
            arrayList.add(vfuVar);
            return vfuVar;
        }
        arrayList.add(i2, vfuVar);
        return vfuVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        vfu i3;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (i3 = i(childAt)) != null && i3.b == this.f) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        vfu i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (i = i(childAt)) != null && i.b == this.f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        wfu wfuVar = (wfu) layoutParams;
        boolean z = wfuVar.a | (view.getClass().getAnnotation(ufu.class) != null);
        wfuVar.a = z;
        if (!this.s) {
            super.addView(view, i, layoutParams);
        } else if (z) {
            xq0.q("Cannot add pager decor view during layout");
        } else {
            wfuVar.d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    public void b(xfu xfuVar) {
        if (this.z0 == null) {
            this.z0 = new ArrayList();
        }
        this.z0.add(xfuVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i) {
        View findNextFocus;
        boolean z;
        int i2;
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
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
            boolean z2 = true;
            z = false;
            if (findNextFocus == null && findNextFocus != findFocus) {
                Rect rect = this.d;
                if (i == 17) {
                    int i3 = h(rect, findNextFocus).left;
                    int i4 = h(rect, findFocus).left;
                    if (findFocus == null || i3 < i4) {
                        requestFocus = findNextFocus.requestFocus();
                    } else {
                        int i5 = this.f;
                        if (i5 > 0) {
                            x(i5 - 1, true);
                            z = z2;
                        }
                        z2 = false;
                        z = z2;
                    }
                } else if (i == 66) {
                    requestFocus = (findFocus == null || h(rect, findNextFocus).left > h(rect, findFocus).left) ? findNextFocus.requestFocus() : o();
                }
                z = requestFocus;
            } else if (i != 17 || i == 1) {
                i2 = this.f;
                if (i2 > 0) {
                    x(i2 - 1, true);
                    z = z2;
                }
                z2 = false;
                z = z2;
            } else if (i == 66 || i == 2) {
                z = o();
            }
            if (z) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
            }
            return z;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        boolean z22 = true;
        z = false;
        if (findNextFocus == null) {
        }
        if (i != 17) {
        }
        i2 = this.f;
        if (i2 > 0) {
        }
        z22 = false;
        z = z22;
        if (z) {
        }
        return z;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.p)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.q));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof wfu) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.j = true;
        if (this.i.isFinished() || !this.i.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.i.getCurrX();
        int currY = this.i.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!p(currX)) {
                this.i.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = wdu.a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        z = keyEvent.hasModifiers(2) ? o() : c(66);
                    } else if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            z = c(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            z = c(1);
                        }
                    }
                    if (!z) {
                        return false;
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        int i = this.f;
                        if (i > 0) {
                            x(i - 1, true);
                            z = true;
                        }
                    } else {
                        z = c(17);
                    }
                    if (!z) {
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        vfu i;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (i = i(childAt)) != null && i.b == this.f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        h2k h2kVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (h2kVar = this.e) != null && h2kVar.b() > 1)) {
            if (!this.L.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.p * width);
                this.L.setSize(height, width);
                z = this.L.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.v0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.q + 1.0f)) * width2);
                this.v0.setSize(height2, width2);
                z |= this.v0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.L.finish();
            this.v0.finish();
        }
        if (z) {
            WeakHashMap weakHashMap = wdu.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.m;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(boolean z) {
        boolean z2 = this.H0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.i.isFinished()) {
                this.i.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.i.getCurrX();
                int currY = this.i.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        p(currX);
                    }
                }
            }
        }
        this.u = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                break;
            }
            vfu vfuVar = (vfu) arrayList.get(i);
            if (vfuVar.c) {
                vfuVar.c = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            yyo yyoVar = this.G0;
            if (!z) {
                yyoVar.run();
            } else {
                WeakHashMap weakHashMap = wdu.a;
                postOnAnimation(yyoVar);
            }
        }
    }

    public final void f() {
        int b = this.e.b();
        this.a = b;
        ArrayList arrayList = this.b;
        boolean z = arrayList.size() < (this.v * 2) + 1 && arrayList.size() < b;
        int i = this.f;
        boolean z2 = false;
        while (arrayList.size() > 0) {
            vfu vfuVar = (vfu) arrayList.get(0);
            h2k h2kVar = this.e;
            ViewGroup viewGroup = vfuVar.a;
            h2kVar.getClass();
            arrayList.remove(0);
            if (!z2) {
                this.e.getClass();
                z2 = true;
            }
            this.e.a(this, vfuVar.b, vfuVar.a);
            int i2 = this.f;
            if (i2 == vfuVar.b) {
                i = Math.max(0, Math.min(i2, b - 1));
            }
            z = true;
        }
        if (z2) {
            this.e.getClass();
        }
        Collections.sort(arrayList, J0);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                wfu wfuVar = (wfu) getChildAt(i3).getLayoutParams();
                if (!wfuVar.a) {
                    wfuVar.c = 0.0f;
                }
            }
            y(i, 0, false, true);
            requestLayout();
        }
    }

    public final void g(int i) {
        xfu xfuVar = this.A0;
        if (xfuVar != null) {
            xfuVar.b(i);
        }
        ArrayList arrayList = this.z0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                xfu xfuVar2 = (xfu) this.z0.get(i2);
                if (xfuVar2 != null) {
                    xfuVar2.b(i);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        wfu wfuVar = new wfu(-1, -1);
        wfuVar.c = 0.0f;
        return wfuVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        wfu wfuVar = new wfu(context, attributeSet);
        wfuVar.c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I0);
        wfuVar.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return wfuVar;
    }

    public h2k getAdapter() {
        return this.e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        if (this.E0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((wfu) ((View) this.F0.get(i2)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.v;
    }

    public int getPageMargin() {
        return this.l;
    }

    public final Rect h(Rect rect, View view) {
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

    public final vfu i(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return null;
            }
            vfu vfuVar = (vfu) arrayList.get(i);
            h2k h2kVar = this.e;
            ViewGroup viewGroup = vfuVar.a;
            ((pq2) h2kVar).getClass();
            if (viewGroup == view) {
                return vfuVar;
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
    public final vfu j() {
        vfu vfuVar;
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.l / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        vfu vfuVar2 = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                break;
            }
            vfu vfuVar3 = (vfu) arrayList.get(i2);
            if (z || vfuVar3.b == (i = i3 + 1)) {
                vfuVar = vfuVar3;
            } else {
                float f4 = f + f3 + f2;
                vfu vfuVar4 = this.c;
                vfuVar4.e = f4;
                vfuVar4.b = i;
                this.e.getClass();
                vfuVar4.d = 1.0f;
                i2--;
                vfuVar = vfuVar4;
            }
            f = vfuVar.e;
            float f5 = vfuVar.d + f + f2;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f5 || i2 == arrayList.size() - 1) {
                break;
            }
            int i4 = vfuVar.b;
            float f6 = vfuVar.d;
            i2++;
            vfu vfuVar5 = vfuVar;
            i3 = i4;
            f3 = f6;
            vfuVar2 = vfuVar5;
            z = false;
        }
        return vfuVar;
    }

    public final vfu k(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            vfu vfuVar = (vfu) arrayList.get(i2);
            if (vfuVar.b == i) {
                return vfuVar;
            }
            i2++;
        }
    }

    public final void l() {
        setWillNotDraw(false);
        setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        setFocusable(true);
        Context context = getContext();
        this.i = new Scroller(context, K0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.A = viewConfiguration.getScaledPagingTouchSlop();
        this.H = (int) (400.0f * f);
        this.I = viewConfiguration.getScaledMaximumFlingVelocity();
        this.L = new EdgeEffect(context);
        this.v0 = new EdgeEffect(context);
        this.J = (int) (25.0f * f);
        this.K = (int) (2.0f * f);
        this.y = (int) (f * 16.0f);
        wdu.q(this, new fu2(9, this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        ndu.n(this, new y8p(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i, float f, int i2) {
        rq2 rq2Var;
        int max;
        int i3;
        int left;
        if (this.y0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                wfu wfuVar = (wfu) childAt.getLayoutParams();
                if (wfuVar.a) {
                    int i5 = wfuVar.b & 7;
                    if (i5 != 1) {
                        if (i5 == 3) {
                            i3 = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
                            i3 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i3;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i6 = max;
                    i3 = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i3;
                }
            }
        }
        xfu xfuVar = this.A0;
        if (xfuVar != null) {
            xfuVar.a(i, f, i2);
        }
        ArrayList arrayList = this.z0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                xfu xfuVar2 = (xfu) this.z0.get(i7);
                if (xfuVar2 != null) {
                    xfuVar2.a(i, f, i2);
                }
            }
        }
        if (this.C0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(i8);
                if (!((wfu) childAt2.getLayoutParams()).a) {
                    float left2 = (childAt2.getLeft() - scrollX2) / getClientWidth();
                    xo9 xo9Var = (xo9) this.C0.b;
                    if (!xo9Var.n && left2 > -1.0f && left2 < 1.0f && (rq2Var = (rq2) xo9Var.g.get(childAt2)) != null) {
                        rq2Var.a();
                    }
                }
            }
        }
        this.x0 = true;
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.F) {
            int i = actionIndex == 0 ? 1 : 0;
            this.B = motionEvent.getX(i);
            this.F = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.G;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o() {
        h2k h2kVar = this.e;
        if (h2kVar == null || this.f >= h2kVar.b() - 1) {
            return false;
        }
        x(this.f + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.G0);
        Scroller scroller = this.i;
        if (scroller != null && !scroller.isFinished()) {
            this.i.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        ArrayList arrayList;
        int i2;
        super.onDraw(canvas);
        if (this.l <= 0 || this.m == null) {
            return;
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2.size() <= 0 || this.e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f2 = this.l / width;
        int i3 = 0;
        vfu vfuVar = (vfu) arrayList2.get(0);
        float f3 = vfuVar.e;
        int size = arrayList2.size();
        int i4 = vfuVar.b;
        int i5 = ((vfu) arrayList2.get(size - 1)).b;
        while (i4 < i5) {
            while (true) {
                i = vfuVar.b;
                if (i4 <= i || i3 >= size) {
                    break;
                }
                i3++;
                vfuVar = (vfu) arrayList2.get(i3);
            }
            if (i4 == i) {
                float f4 = vfuVar.e;
                float f5 = vfuVar.d;
                f = (f4 + f5) * width;
                f3 = f4 + f5 + f2;
            } else {
                this.e.getClass();
                f = (f3 + 1.0f) * width;
                f3 = 1.0f + f2 + f3;
            }
            if (this.l + f > scrollX) {
                arrayList = arrayList2;
                i2 = scrollX;
                this.m.setBounds(Math.round(f), this.n, Math.round(this.l + f), this.o);
                this.m.draw(canvas);
            } else {
                arrayList = arrayList2;
                i2 = scrollX;
            }
            if (f > i2 + r3) {
                return;
            }
            i4++;
            arrayList2 = arrayList;
            scrollX = i2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 3 || action == 1) {
            v();
            return false;
        }
        if (action != 0) {
            if (this.w) {
                return true;
            }
            if (this.x) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.D = x;
            this.B = x;
            float y = motionEvent.getY();
            this.E = y;
            this.C = y;
            this.F = motionEvent.getPointerId(0);
            this.x = false;
            this.j = true;
            this.i.computeScrollOffset();
            if (this.H0 != 2 || Math.abs(this.i.getFinalX() - this.i.getCurrX()) <= this.K) {
                e(false);
                this.w = false;
            } else {
                this.i.abortAnimation();
                this.u = false;
                r();
                this.w = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.F;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.B;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.E);
                if (f != 0.0f) {
                    float f2 = this.B;
                    if ((f2 >= this.z || f <= 0.0f) && ((f2 <= getWidth() - this.z || f >= 0.0f) && d((int) f, (int) x2, (int) y2, this, false))) {
                        this.B = x2;
                        this.C = y2;
                        this.x = true;
                        return false;
                    }
                }
                float f3 = this.A;
                if (abs > f3 && abs * 0.5f > abs2) {
                    this.w = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f4 = this.D;
                    float f5 = this.A;
                    this.B = f > 0.0f ? f4 + f5 : f4 - f5;
                    this.C = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f3) {
                    this.x = true;
                }
                if (this.w && q(x2)) {
                    WeakHashMap weakHashMap = wdu.a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            n(motionEvent);
        }
        if (this.G == null) {
            this.G = VelocityTracker.obtain();
        }
        this.G.addMovement(motionEvent);
        return this.w;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        vfu i5;
        int max;
        int i6;
        int max2;
        int i7;
        int childCount = getChildCount();
        int i8 = i3 - i;
        int i9 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                wfu wfuVar = (wfu) childAt.getLayoutParams();
                if (wfuVar.a) {
                    int i12 = wfuVar.b;
                    int i13 = i12 & 7;
                    int i14 = i12 & 112;
                    if (i13 != 1) {
                        if (i13 == 3) {
                            i6 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            i6 = paddingLeft;
                        } else {
                            max = (i8 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i14 == 16) {
                            if (i14 == 48) {
                                i7 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i14 != 80) {
                                i7 = paddingTop;
                            } else {
                                max2 = (i9 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i15 = paddingLeft + scrollX;
                            childAt.layout(i15, paddingTop, childAt.getMeasuredWidth() + i15, childAt.getMeasuredHeight() + paddingTop);
                            i10++;
                            paddingTop = i7;
                            paddingLeft = i6;
                        } else {
                            max2 = Math.max((i9 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i16 = max2;
                        i7 = paddingTop;
                        paddingTop = i16;
                        int i152 = paddingLeft + scrollX;
                        childAt.layout(i152, paddingTop, childAt.getMeasuredWidth() + i152, childAt.getMeasuredHeight() + paddingTop);
                        i10++;
                        paddingTop = i7;
                        paddingLeft = i6;
                    } else {
                        max = Math.max((i8 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i17 = max;
                    i6 = paddingLeft;
                    paddingLeft = i17;
                    if (i14 == 16) {
                    }
                    int i162 = max2;
                    i7 = paddingTop;
                    paddingTop = i162;
                    int i1522 = paddingLeft + scrollX;
                    childAt.layout(i1522, paddingTop, childAt.getMeasuredWidth() + i1522, childAt.getMeasuredHeight() + paddingTop);
                    i10++;
                    paddingTop = i7;
                    paddingLeft = i6;
                }
            }
        }
        int i18 = (i8 - paddingLeft) - paddingRight;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                wfu wfuVar2 = (wfu) childAt2.getLayoutParams();
                if (!wfuVar2.a && (i5 = i(childAt2)) != null) {
                    float f = i18;
                    int i20 = ((int) (i5.e * f)) + paddingLeft;
                    if (wfuVar2.d) {
                        wfuVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * wfuVar2.c), 1073741824), View.MeasureSpec.makeMeasureSpec((i9 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i20, paddingTop, childAt2.getMeasuredWidth() + i20, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.n = paddingTop;
        this.o = i9 - paddingBottom;
        this.y0 = i10;
        if (this.w0) {
            z2 = false;
            w(this.f, 0, false, false);
        } else {
            z2 = false;
        }
        this.w0 = z2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        wfu wfuVar;
        wfu wfuVar2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.z = Math.min(measuredWidth / 10, this.y);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (wfuVar2 = (wfu) childAt.getLayoutParams()) != null && wfuVar2.a) {
                int i6 = wfuVar2.b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) wfuVar2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) wfuVar2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.r = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.s = true;
        r();
        this.s = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((wfuVar = (wfu) childAt2.getLayoutParams()) == null || !wfuVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * wfuVar.c), 1073741824), this.r);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        vfu i5;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (i5 = i(childAt)) != null && i5.b == this.f && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof yfu)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        yfu yfuVar = (yfu) parcelable;
        super.onRestoreInstanceState(yfuVar.a);
        h2k h2kVar = this.e;
        if (h2kVar == null) {
            this.g = yfuVar.c;
            this.h = yfuVar.d;
            return;
        }
        Parcelable parcelable2 = yfuVar.d;
        pq2 pq2Var = (pq2) h2kVar;
        if (parcelable2 instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable2;
            bundle.setClassLoader(pq2.class.getClassLoader());
            pq2Var.c = bundle.getSparseParcelableArray("div_tabs_child_states");
        } else {
            pq2Var.c = null;
        }
        y(yfuVar.c, 0, false, true);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        yfu yfuVar = new yfu(super.onSaveInstanceState());
        yfuVar.c = this.f;
        h2k h2kVar = this.e;
        if (h2kVar != null) {
            xy0 xy0Var = ((pq2) h2kVar).d.g;
            SparseArray<Parcelable> sparseArray = new SparseArray<>(xy0Var.c);
            Iterator it = ((uy0) xy0Var.keySet()).iterator();
            while (it.hasNext()) {
                ((ViewGroup) it.next()).saveHierarchyState(sparseArray);
            }
            Bundle bundle = new Bundle();
            bundle.putSparseParcelableArray("div_tabs_child_states", sparseArray);
            yfuVar.d = bundle;
        }
        return yfuVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.l;
            t(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h2k h2kVar;
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (h2kVar = this.e) == null || h2kVar.b() == 0) {
            return false;
        }
        if (this.G == null) {
            this.G = VelocityTracker.obtain();
        }
        this.G.addMovement(motionEvent);
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 0) {
            this.i.abortAnimation();
            this.u = false;
            r();
            float x = motionEvent.getX();
            this.D = x;
            this.B = x;
            float y = motionEvent.getY();
            this.E = y;
            this.C = y;
            this.F = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.w) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.F);
                    if (findPointerIndex == -1) {
                        z = v();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.B);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.C);
                        if (abs > this.A && abs > abs2) {
                            this.w = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f = this.D;
                            float f2 = x2 - f;
                            int i = this.A;
                            this.B = f2 > 0.0f ? f + i : f - i;
                            this.C = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.w) {
                    z = q(motionEvent.getX(motionEvent.findPointerIndex(this.F)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.B = motionEvent.getX(actionIndex);
                    this.F = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    n(motionEvent);
                    this.B = motionEvent.getX(motionEvent.findPointerIndex(this.F));
                }
            } else if (this.w) {
                w(this.f, 0, true, false);
                z = v();
            }
        } else if (this.w) {
            VelocityTracker velocityTracker = this.G;
            velocityTracker.computeCurrentVelocity(1000, this.I);
            int xVelocity = (int) velocityTracker.getXVelocity(this.F);
            this.u = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            vfu j = j();
            float f3 = clientWidth;
            int i2 = j.b;
            float f4 = ((scrollX / f3) - j.e) / (j.d + (this.l / f3));
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.F)) - this.D)) <= this.J || Math.abs(xVelocity) <= this.H) {
                i2 += (int) (f4 + (i2 >= this.f ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                i2++;
            }
            ArrayList arrayList = this.b;
            if (arrayList.size() > 0) {
                i2 = Math.max(((vfu) arrayList.get(0)).b, Math.min(i2, ((vfu) vz1.m(arrayList, 1)).b));
            }
            y(i2, xVelocity, true, true);
            z = v();
        }
        if (z) {
            WeakHashMap weakHashMap = wdu.a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final boolean p(int i) {
        if (this.b.size() == 0) {
            if (!this.w0) {
                this.x0 = false;
                m(0, 0.0f, 0);
                if (!this.x0) {
                    xq0.q("onPageScrolled did not call superclass implementation");
                    return false;
                }
            }
            return false;
        }
        vfu j = j();
        int clientWidth = getClientWidth();
        int i2 = this.l;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = j.b;
        float f2 = ((i / f) - j.e) / (j.d + (i2 / f));
        this.x0 = false;
        m(i4, f2, (int) (i3 * f2));
        if (this.x0) {
            return true;
        }
        xq0.q("onPageScrolled did not call superclass implementation");
        return false;
    }

    public final boolean q(float f) {
        boolean z;
        boolean z2;
        float f2 = this.B - f;
        this.B = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.p * clientWidth;
        float f4 = this.q * clientWidth;
        ArrayList arrayList = this.b;
        boolean z3 = false;
        vfu vfuVar = (vfu) arrayList.get(0);
        vfu vfuVar2 = (vfu) vz1.m(arrayList, 1);
        if (vfuVar.b != 0) {
            f3 = vfuVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (vfuVar2.b != this.e.b() - 1) {
            f4 = vfuVar2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.L.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.v0.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.B = (scrollX - i) + this.B;
        scrollTo(i, getScrollY());
        p(i);
        return z3;
    }

    public final void r() {
        s(this.f);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.s) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
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
    public final void s(int i) {
        vfu vfuVar;
        String hexString;
        ArrayList arrayList;
        vfu vfuVar2;
        float f;
        vfu vfuVar3;
        vfu i2;
        int i3;
        int i4;
        vfu vfuVar4;
        vfu vfuVar5;
        vfu vfuVar6;
        int i5 = this.f;
        if (i5 != i) {
            vfuVar = k(i5);
            this.f = i;
        } else {
            vfuVar = null;
        }
        if (this.e == null) {
            A();
            return;
        }
        if (this.u) {
            A();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.e.getClass();
        int i6 = this.v;
        int max = Math.max(0, this.f - i6);
        int b = this.e.b();
        int min = Math.min(b - 1, this.f + i6);
        if (b != this.a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            hrg.w(this.a, b, ", found: ", " Pager id: ", sb);
            sb.append(hexString);
            sb.append(" Pager class: ");
            sb.append(getClass());
            sb.append(" Problematic adapter: ");
            wvs.k(sb, this.e.getClass());
            return;
        }
        int i7 = 0;
        while (true) {
            arrayList = this.b;
            if (i7 >= arrayList.size()) {
                break;
            }
            vfuVar2 = (vfu) arrayList.get(i7);
            int i8 = vfuVar2.b;
            int i9 = this.f;
            if (i8 < i9) {
                i7++;
            }
        }
        if (vfuVar2 == null && b > 0) {
            vfuVar2 = a(this.f, i7);
        }
        if (vfuVar2 != null) {
            int i10 = i7 - 1;
            vfu vfuVar7 = i10 >= 0 ? (vfu) arrayList.get(i10) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - vfuVar2.d);
            float f2 = 0.0f;
            for (int i11 = this.f - 1; i11 >= 0; i11--) {
                if (f2 >= paddingLeft && i11 < max) {
                    if (vfuVar7 == null) {
                        break;
                    }
                    if (i11 == vfuVar7.b && !vfuVar7.c) {
                        arrayList.remove(i10);
                        this.e.a(this, i11, vfuVar7.a);
                        i10--;
                        i7--;
                        if (i10 >= 0) {
                            vfuVar6 = (vfu) arrayList.get(i10);
                            vfuVar7 = vfuVar6;
                        }
                        vfuVar6 = null;
                        vfuVar7 = vfuVar6;
                    }
                } else if (vfuVar7 == null || i11 != vfuVar7.b) {
                    f2 += a(i11, i10 + 1).d;
                    i7++;
                    if (i10 >= 0) {
                        vfuVar6 = (vfu) arrayList.get(i10);
                        vfuVar7 = vfuVar6;
                    }
                    vfuVar6 = null;
                    vfuVar7 = vfuVar6;
                } else {
                    f2 += vfuVar7.d;
                    i10--;
                    if (i10 >= 0) {
                        vfuVar6 = (vfu) arrayList.get(i10);
                        vfuVar7 = vfuVar6;
                    }
                    vfuVar6 = null;
                    vfuVar7 = vfuVar6;
                }
            }
            f = 0.0f;
            float f3 = vfuVar2.d;
            int i12 = i7 + 1;
            if (f3 < 2.0f) {
                vfu vfuVar8 = i12 < arrayList.size() ? (vfu) arrayList.get(i12) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i13 = i12;
                for (int i14 = this.f + 1; i14 < b; i14++) {
                    if (f3 >= paddingRight && i14 > min) {
                        if (vfuVar8 == null) {
                            break;
                        }
                        if (i14 == vfuVar8.b && !vfuVar8.c) {
                            arrayList.remove(i13);
                            this.e.a(this, i14, vfuVar8.a);
                            if (i13 < arrayList.size()) {
                                vfuVar8 = (vfu) arrayList.get(i13);
                            }
                            vfuVar8 = null;
                        }
                    } else if (vfuVar8 == null || i14 != vfuVar8.b) {
                        vfu a = a(i14, i13);
                        i13++;
                        f3 += a.d;
                        if (i13 < arrayList.size()) {
                            vfuVar8 = (vfu) arrayList.get(i13);
                        }
                        vfuVar8 = null;
                    } else {
                        f3 += vfuVar8.d;
                        i13++;
                        if (i13 < arrayList.size()) {
                            vfuVar8 = (vfu) arrayList.get(i13);
                        }
                        vfuVar8 = null;
                    }
                }
            }
            int b2 = this.e.b();
            int clientWidth2 = getClientWidth();
            float f4 = clientWidth2 > 0 ? this.l / clientWidth2 : 0.0f;
            if (vfuVar != null) {
                int i15 = vfuVar.b;
                int i16 = vfuVar2.b;
                if (i15 < i16) {
                    float f5 = vfuVar.e + vfuVar.d + f4;
                    int i17 = i15 + 1;
                    int i18 = 0;
                    while (i17 <= vfuVar2.b && i18 < arrayList.size()) {
                        Object obj = arrayList.get(i18);
                        while (true) {
                            vfuVar5 = (vfu) obj;
                            if (i17 <= vfuVar5.b || i18 >= arrayList.size() - 1) {
                                break;
                            }
                            i18++;
                            obj = arrayList.get(i18);
                        }
                        while (i17 < vfuVar5.b) {
                            this.e.getClass();
                            f5 += 1.0f + f4;
                            i17++;
                        }
                        vfuVar5.e = f5;
                        f5 += vfuVar5.d + f4;
                        i17++;
                    }
                } else if (i15 > i16) {
                    int size = arrayList.size() - 1;
                    float f6 = vfuVar.e;
                    while (true) {
                        i15--;
                        if (i15 < vfuVar2.b || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            vfuVar4 = (vfu) obj2;
                            if (i15 >= vfuVar4.b || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i15 > vfuVar4.b) {
                            this.e.getClass();
                            f6 -= 1.0f + f4;
                            i15--;
                        }
                        f6 -= vfuVar4.d + f4;
                        vfuVar4.e = f6;
                    }
                }
            }
            int size2 = arrayList.size();
            float f7 = vfuVar2.e;
            int i19 = vfuVar2.b;
            int i20 = i19 - 1;
            this.p = i19 == 0 ? f7 : -3.4028235E38f;
            int i21 = b2 - 1;
            this.q = i19 == i21 ? (vfuVar2.d + f7) - 1.0f : Float.MAX_VALUE;
            int i22 = i7 - 1;
            while (i22 >= 0) {
                vfu vfuVar9 = (vfu) arrayList.get(i22);
                while (true) {
                    i4 = vfuVar9.b;
                    if (i20 <= i4) {
                        break;
                    }
                    i20--;
                    this.e.getClass();
                    f7 -= 1.0f + f4;
                }
                f7 -= vfuVar9.d + f4;
                vfuVar9.e = f7;
                if (i4 == 0) {
                    this.p = f7;
                }
                i22--;
                i20--;
            }
            float f8 = vfuVar2.e + vfuVar2.d + f4;
            int i23 = vfuVar2.b;
            while (true) {
                i23++;
                if (i12 >= size2) {
                    break;
                }
                vfu vfuVar10 = (vfu) arrayList.get(i12);
                while (true) {
                    i3 = vfuVar10.b;
                    if (i23 >= i3) {
                        break;
                    }
                    i23++;
                    this.e.getClass();
                    f8 += 1.0f + f4;
                }
                if (i3 == i21) {
                    this.q = (vfuVar10.d + f8) - 1.0f;
                }
                vfuVar10.e = f8;
                f8 += vfuVar10.d + f4;
                i12++;
            }
            this.e.getClass();
        } else {
            f = 0.0f;
        }
        this.e.getClass();
        int childCount = getChildCount();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt = getChildAt(i24);
            wfu wfuVar = (wfu) childAt.getLayoutParams();
            wfuVar.f = i24;
            if (!wfuVar.a && wfuVar.c == f && (i2 = i(childAt)) != null) {
                wfuVar.c = i2.d;
                wfuVar.e = i2.b;
            }
        }
        A();
        if (hasFocus()) {
            View findFocus = findFocus();
            if (findFocus != null) {
                while (true) {
                    Object parent = findFocus.getParent();
                    if (parent == this) {
                        vfuVar3 = i(findFocus);
                        break;
                    } else if (parent == null || !(parent instanceof View)) {
                        break;
                    } else {
                        findFocus = (View) parent;
                    }
                }
            }
            vfuVar3 = null;
            if (vfuVar3 == null || vfuVar3.b != this.f) {
                for (int i25 = 0; i25 < getChildCount(); i25++) {
                    View childAt2 = getChildAt(i25);
                    vfu i26 = i(childAt2);
                    if (i26 != null && i26.b == this.f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public void setAdapter(h2k h2kVar) {
        ArrayList arrayList = this.b;
        h2k h2kVar2 = this.e;
        if (h2kVar2 != null) {
            synchronized (h2kVar2) {
                h2kVar2.b = null;
            }
            this.e.getClass();
            for (int i = 0; i < arrayList.size(); i++) {
                vfu vfuVar = (vfu) arrayList.get(i);
                this.e.a(this, vfuVar.b, vfuVar.a);
            }
            this.e.getClass();
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((wfu) getChildAt(i2).getLayoutParams()).a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f = 0;
            scrollTo(0, 0);
        }
        this.e = h2kVar;
        this.a = 0;
        if (h2kVar != null) {
            if (this.k == null) {
                this.k = new nr2(4, this);
            }
            h2k h2kVar3 = this.e;
            nr2 nr2Var = this.k;
            synchronized (h2kVar3) {
                h2kVar3.b = nr2Var;
            }
            this.u = false;
            boolean z = this.w0;
            this.w0 = true;
            this.a = this.e.b();
            if (this.g >= 0) {
                h2k h2kVar4 = this.e;
                Parcelable parcelable = this.h;
                pq2 pq2Var = (pq2) h2kVar4;
                if (parcelable instanceof Bundle) {
                    pq2Var.getClass();
                    Bundle bundle = (Bundle) parcelable;
                    bundle.setClassLoader(pq2.class.getClassLoader());
                    pq2Var.c = bundle.getSparseParcelableArray("div_tabs_child_states");
                } else {
                    pq2Var.c = null;
                }
                y(this.g, 0, false, true);
                this.g = -1;
                this.h = null;
            } else if (z) {
                requestLayout();
            } else {
                r();
            }
        }
        ArrayList arrayList2 = this.B0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.B0.size();
        for (int i3 = 0; i3 < size; i3++) {
            g1s g1sVar = (g1s) this.B0.get(i3);
            TabLayout tabLayout = g1sVar.b;
            if (tabLayout.y0 == this) {
                tabLayout.j(h2kVar, g1sVar.a);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.u = false;
        y(i, 0, !this.w0, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.v) {
            this.v = i;
            r();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(xfu xfuVar) {
        this.A0 = xfuVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.l;
        this.l = i;
        int width = getWidth();
        t(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.m = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.H0 == i) {
            return;
        }
        this.H0 = i;
        if (this.C0 != null) {
            boolean z = i != 0;
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).setLayerType(z ? this.D0 : 0, null);
            }
        }
        xfu xfuVar = this.A0;
        if (xfuVar != null) {
            xfuVar.c(i);
        }
        ArrayList arrayList = this.z0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                xfu xfuVar2 = (xfu) this.z0.get(i3);
                if (xfuVar2 != null) {
                    xfuVar2.c(i);
                }
            }
        }
    }

    public final void t(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.b.isEmpty()) {
            if (!this.i.isFinished()) {
                this.i.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        vfu k = k(this.f);
        int min = (int) ((k != null ? Math.min(k.e, this.q) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            e(false);
            scrollTo(min, getScrollY());
        }
    }

    public void u(xfu xfuVar) {
        ArrayList arrayList = this.z0;
        if (arrayList != null) {
            arrayList.remove(xfuVar);
        }
    }

    public final boolean v() {
        this.F = -1;
        this.w = false;
        this.x = false;
        VelocityTracker velocityTracker = this.G;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.G = null;
        }
        this.L.onRelease();
        this.v0.onRelease();
        return this.L.isFinished() || this.v0.isFinished();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.m;
    }

    public final void w(int i, int i2, boolean z, boolean z2) {
        int scrollX;
        int abs;
        vfu k = k(i);
        int max = k != null ? (int) (Math.max(this.p, Math.min(k.e, this.q)) * getClientWidth()) : 0;
        if (!z) {
            if (z2) {
                g(i);
            }
            e(false);
            scrollTo(max, 0);
            p(max);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.i;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                boolean z3 = this.j;
                Scroller scroller2 = this.i;
                scrollX = z3 ? scroller2.getCurrX() : scroller2.getStartX();
                this.i.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = max - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                e(false);
                r();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i6 = clientWidth / 2;
                float f = clientWidth;
                float f2 = i6;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                int abs2 = Math.abs(i2);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    this.e.getClass();
                    abs = (int) (((Math.abs(i4) / ((f * 1.0f) + this.l)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.j = false;
                this.i.startScroll(i3, scrollY, i4, i5, min);
                WeakHashMap weakHashMap = wdu.a;
                postInvalidateOnAnimation();
            }
        }
        if (z2) {
            g(i);
        }
    }

    public void x(int i, boolean z) {
        this.u = false;
        y(i, 0, z, false);
    }

    public final void y(int i, int i2, boolean z, boolean z2) {
        h2k h2kVar = this.e;
        if (h2kVar == null || h2kVar.b() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.b;
        if (!z2 && this.f == i && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.e.b()) {
            i = this.e.b() - 1;
        }
        int i3 = this.v;
        int i4 = this.f;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((vfu) arrayList.get(i5)).c = true;
            }
        }
        boolean z3 = this.f != i;
        if (!this.w0) {
            s(i);
            w(i, i2, z, z3);
        } else {
            this.f = i;
            if (z3) {
                g(i);
            }
            requestLayout();
        }
    }

    public final void z(ozw ozwVar) {
        boolean z = this.C0 == null;
        this.C0 = ozwVar;
        setChildrenDrawingOrderEnabled(true);
        this.E0 = 1;
        this.D0 = 2;
        if (z) {
            r();
        }
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getDrawable(i));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public lgu(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList();
        this.c = new vfu();
        this.d = new Rect();
        this.g = -1;
        this.h = null;
        this.p = -3.4028235E38f;
        this.q = Float.MAX_VALUE;
        this.v = 1;
        this.F = -1;
        this.w0 = true;
        this.G0 = new yyo(12, this);
        this.H0 = 0;
        l();
    }
}
