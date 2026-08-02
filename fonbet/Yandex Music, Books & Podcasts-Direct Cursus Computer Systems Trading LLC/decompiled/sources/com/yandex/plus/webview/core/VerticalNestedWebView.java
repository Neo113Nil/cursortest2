package com.yandex.plus.webview.core;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import defpackage.jyi;
import defpackage.ltg;
import defpackage.lyi;
import defpackage.wdu;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public class VerticalNestedWebView extends WebView implements jyi {
    public final com.yandex.plus.webview.core.nestedscroll.a a;
    public final int[] b;
    public final int[] c;
    public final EdgeEffect d;
    public final EdgeEffect e;
    public int f;
    public final lyi g;
    public boolean h;
    public VelocityTracker i;
    public final int j;
    public int k;
    public int l;
    public final OverScroller m;
    public final int n;
    public final int o;
    public int p;

    public VerticalNestedWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        com.yandex.plus.webview.core.nestedscroll.a aVar = new com.yandex.plus.webview.core.nestedscroll.a();
        aVar.e = -1;
        this.a = aVar;
        this.b = new int[2];
        this.c = new int[2];
        this.h = false;
        this.k = -1;
        setOverScrollMode(2);
        this.d = ltg.z(context, attributeSet);
        this.e = ltg.z(context, attributeSet);
        this.m = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.j = viewConfiguration.getScaledTouchSlop();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.o = viewConfiguration.getScaledMaximumFlingVelocity();
        this.g = new lyi(this);
        setNestedScrollingEnabled(true);
    }

    public final boolean a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        boolean z2;
        int i9;
        int i10;
        int overScrollMode = getOverScrollMode();
        boolean z3 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z4 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z5 = overScrollMode == 0 || (overScrollMode == 1 && z3);
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        int i11 = i3 + i;
        int i12 = !z5 ? 0 : i7;
        int i13 = i4 + i2;
        int i14 = !z6 ? 0 : i8;
        int i15 = -i12;
        int i16 = i12 + i5;
        int i17 = -i14;
        int i18 = i14 + i6;
        if (i11 > i16) {
            i11 = i16;
            z = true;
        } else if (i11 < i15) {
            z = true;
            i11 = i15;
        } else {
            z = false;
        }
        if (i13 > i18) {
            i13 = i18;
            z2 = true;
        } else if (i13 < i17) {
            z2 = true;
            i13 = i17;
        } else {
            z2 = false;
        }
        if (!z2 || this.g.f(1)) {
            i9 = i11;
            i10 = i13;
        } else {
            int i19 = i11;
            int i20 = i13;
            this.m.springBack(i19, i20, 0, 0, 0, getScrollRange());
            i9 = i19;
            i10 = i20;
        }
        onOverScrolled(i9, i10, z, z2);
        return z || z2;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void computeScroll() {
        int i;
        OverScroller overScroller = this.m;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i2 = currY - this.p;
        this.p = currY;
        int[] iArr = this.c;
        iArr[1] = 0;
        this.g.c(0, i2, 1, iArr, null);
        int i3 = i2 - iArr[1];
        int scrollRange = getScrollRange();
        if (i3 != 0) {
            int scrollY = getScrollY();
            a(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0);
            int scrollY2 = getScrollY() - scrollY;
            int i4 = i3 - scrollY2;
            iArr[1] = 0;
            i = 1;
            this.g.d(0, scrollY2, 0, i4, this.b, 1, iArr);
            i3 = i4 - iArr[1];
        } else {
            i = 1;
        }
        if (i3 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == i && scrollRange > 0)) {
                if (i3 < 0) {
                    EdgeEffect edgeEffect = this.d;
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                } else {
                    EdgeEffect edgeEffect2 = this.e;
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
            }
            overScroller.abortAnimation();
            f(i);
        }
        if (overScroller.isFinished()) {
            f(i);
        } else {
            WeakHashMap weakHashMap = wdu.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.g.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.g.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.g.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.g.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // defpackage.jyi
    public final void f(int i) {
        this.g.i(i);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return 2;
    }

    public int getScrollRange() {
        return computeVerticalScrollRange();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.g.f(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.g.d;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        com.yandex.plus.webview.core.nestedscroll.a aVar = this.a;
        if (aVar.a) {
            aVar.b = true;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        com.yandex.plus.webview.core.nestedscroll.a aVar = this.a;
        if (aVar.a) {
            aVar.b = true;
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r2 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02df  */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        ViewParent parent;
        boolean z2;
        float H;
        int round;
        EdgeEffect edgeEffect;
        com.yandex.plus.webview.core.nestedscroll.a aVar = this.a;
        aVar.getClass();
        motionEvent.getClass();
        int action = motionEvent.getAction();
        float f = 0.0f;
        boolean z3 = false;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(aVar.e);
                    Float f2 = aVar.d;
                    Float f3 = aVar.c;
                    if (findPointerIndex != -1 && f2 != null && f3 != null) {
                        boolean z4 = (f3.floatValue() - motionEvent.getX(findPointerIndex) == 0.0f && f2.floatValue() - motionEvent.getY(findPointerIndex) == 0.0f) ? false : true;
                        if (!aVar.a && z4) {
                            aVar.a = true;
                        }
                        if (aVar.a && !aVar.b) {
                            z = true;
                            if (!z) {
                                if (this.i == null) {
                                    this.i = VelocityTracker.obtain();
                                }
                                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                                int actionMasked = motionEvent.getActionMasked();
                                int[] iArr = this.b;
                                if (actionMasked == 0) {
                                    this.l = 0;
                                    iArr[1] = 0;
                                }
                                obtain.offsetLocation(0.0f, this.l);
                                lyi lyiVar = this.g;
                                if (actionMasked != 0) {
                                    EdgeEffect edgeEffect2 = this.e;
                                    EdgeEffect edgeEffect3 = this.d;
                                    if (actionMasked == 1) {
                                        VelocityTracker velocityTracker = this.i;
                                        velocityTracker.computeCurrentVelocity(1000, this.o);
                                        int yVelocity = (int) velocityTracker.getYVelocity(this.k);
                                        if (Math.abs(yVelocity) >= this.n) {
                                            if (ltg.F(edgeEffect3) != 0.0f) {
                                                edgeEffect3.onAbsorb(yVelocity);
                                            } else if (ltg.F(edgeEffect2) != 0.0f) {
                                                edgeEffect2.onAbsorb(-yVelocity);
                                            } else {
                                                z2 = false;
                                                if (!z2) {
                                                    int i2 = -yVelocity;
                                                    float f4 = i2;
                                                    if (!lyiVar.b(0.0f, f4)) {
                                                        dispatchNestedFling(0.0f, f4, true);
                                                        this.m.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
                                                        lyiVar.h(2, 1);
                                                        this.p = getScrollY();
                                                        WeakHashMap weakHashMap = wdu.a;
                                                        postInvalidateOnAnimation();
                                                    }
                                                }
                                            }
                                            z2 = true;
                                            if (!z2) {
                                            }
                                        } else if (this.m.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                                            WeakHashMap weakHashMap2 = wdu.a;
                                            postInvalidateOnAnimation();
                                        }
                                        this.k = -1;
                                        this.h = false;
                                        VelocityTracker velocityTracker2 = this.i;
                                        if (velocityTracker2 != null) {
                                            velocityTracker2.recycle();
                                            this.i = null;
                                        }
                                        f(0);
                                        edgeEffect3.onRelease();
                                        edgeEffect2.onRelease();
                                    } else if (actionMasked == 2) {
                                        int findPointerIndex2 = motionEvent.findPointerIndex(this.k);
                                        if (findPointerIndex2 != -1) {
                                            int y = (int) motionEvent.getY(findPointerIndex2);
                                            int i3 = this.f - y;
                                            float x = motionEvent.getX(findPointerIndex2) / getWidth();
                                            float height = i3 / getHeight();
                                            if (ltg.F(edgeEffect3) != 0.0f) {
                                                H = -ltg.H(edgeEffect3, -height, x);
                                                if (ltg.F(edgeEffect3) == 0.0f) {
                                                    edgeEffect3.onRelease();
                                                }
                                            } else {
                                                if (ltg.F(edgeEffect2) != 0.0f) {
                                                    H = ltg.H(edgeEffect2, height, 1.0f - x);
                                                    if (ltg.F(edgeEffect2) == 0.0f) {
                                                        edgeEffect2.onRelease();
                                                    }
                                                }
                                                round = Math.round(f * getHeight());
                                                if (round != 0) {
                                                    invalidate();
                                                }
                                                int i4 = i3 - round;
                                                if (!this.h) {
                                                    int abs = Math.abs(i4);
                                                    int i5 = this.j;
                                                    if (abs > i5) {
                                                        ViewParent parent2 = getParent();
                                                        if (parent2 != null) {
                                                            parent2.requestDisallowInterceptTouchEvent(true);
                                                        }
                                                        this.h = true;
                                                        i4 = i4 > 0 ? i4 - i5 : i4 + i5;
                                                    }
                                                }
                                                int i6 = i4;
                                                if (this.h) {
                                                    boolean c = this.g.c(0, i6, 0, this.c, this.b);
                                                    int[] iArr2 = this.c;
                                                    if (c) {
                                                        i6 -= iArr2[1];
                                                        this.l += iArr[1];
                                                    }
                                                    this.f = y - iArr[1];
                                                    int scrollY = getScrollY();
                                                    int scrollRange = getScrollRange();
                                                    int overScrollMode = getOverScrollMode();
                                                    boolean z5 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                                                    int i7 = i6;
                                                    boolean z6 = a(0, i7, 0, getScrollY(), 0, scrollRange, 0, 0) && !lyiVar.f(0);
                                                    int scrollY2 = getScrollY() - scrollY;
                                                    iArr2[1] = 0;
                                                    this.g.d(0, scrollY2, 0, i7 - scrollY2, this.b, 0, iArr2);
                                                    int i8 = this.f;
                                                    int i9 = iArr[1];
                                                    this.f = i8 - i9;
                                                    this.l += i9;
                                                    if (z5) {
                                                        int i10 = i7 - iArr2[1];
                                                        int i11 = scrollY + i10;
                                                        if (i11 < 0) {
                                                            edgeEffect = edgeEffect3;
                                                            ltg.H(edgeEffect, (-i10) / getHeight(), motionEvent.getX(findPointerIndex2) / getWidth());
                                                            if (!edgeEffect2.isFinished()) {
                                                                edgeEffect2.onRelease();
                                                            }
                                                        } else {
                                                            edgeEffect = edgeEffect3;
                                                            if (i11 > scrollRange) {
                                                                ltg.H(edgeEffect2, i10 / getHeight(), 1.0f - (motionEvent.getX(findPointerIndex2) / getWidth()));
                                                                if (!edgeEffect.isFinished()) {
                                                                    edgeEffect.onRelease();
                                                                }
                                                            }
                                                        }
                                                        if (!edgeEffect.isFinished() || !edgeEffect2.isFinished()) {
                                                            WeakHashMap weakHashMap3 = wdu.a;
                                                            postInvalidateOnAnimation();
                                                            if (z3) {
                                                                this.i.clear();
                                                            }
                                                        }
                                                    }
                                                    z3 = z6;
                                                    if (z3) {
                                                    }
                                                }
                                            }
                                            f = H;
                                            round = Math.round(f * getHeight());
                                            if (round != 0) {
                                            }
                                            int i42 = i3 - round;
                                            if (!this.h) {
                                            }
                                            int i62 = i42;
                                            if (this.h) {
                                            }
                                        }
                                    } else if (actionMasked == 3) {
                                        if (this.h) {
                                            if (this.m.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                                                WeakHashMap weakHashMap4 = wdu.a;
                                                postInvalidateOnAnimation();
                                            }
                                        }
                                        this.k = -1;
                                        this.h = false;
                                        VelocityTracker velocityTracker3 = this.i;
                                        if (velocityTracker3 != null) {
                                            velocityTracker3.recycle();
                                            this.i = null;
                                        }
                                        f(0);
                                        edgeEffect3.onRelease();
                                        edgeEffect2.onRelease();
                                    } else if (actionMasked == 5) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        this.f = (int) motionEvent.getY(actionIndex);
                                        this.k = motionEvent.getPointerId(actionIndex);
                                    } else if (actionMasked == 6) {
                                        int actionIndex2 = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex2) == this.k) {
                                            int i12 = actionIndex2 != 0 ? 0 : 1;
                                            this.f = (int) motionEvent.getY(i12);
                                            this.k = motionEvent.getPointerId(i12);
                                            VelocityTracker velocityTracker4 = this.i;
                                            if (velocityTracker4 != null) {
                                                velocityTracker4.clear();
                                            }
                                        }
                                        if (motionEvent.findPointerIndex(this.k) != -1) {
                                            this.f = (int) motionEvent.getY(motionEvent.findPointerIndex(this.k));
                                        }
                                    }
                                } else {
                                    if (!this.h || (parent = getParent()) == null) {
                                        i = 1;
                                    } else {
                                        i = 1;
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                    OverScroller overScroller = this.m;
                                    if (!overScroller.isFinished()) {
                                        overScroller.abortAnimation();
                                        f(i);
                                    }
                                    this.f = (int) motionEvent.getY();
                                    this.k = motionEvent.getPointerId(0);
                                    lyiVar.h(2, 0);
                                }
                                VelocityTracker velocityTracker5 = this.i;
                                if (velocityTracker5 != null) {
                                    velocityTracker5.addMovement(obtain);
                                }
                                obtain.recycle();
                            }
                            return super.onTouchEvent(motionEvent);
                        }
                    }
                }
            }
            boolean z7 = aVar.a && !aVar.b;
            aVar.c = null;
            aVar.d = null;
            aVar.e = -1;
            aVar.a = false;
            aVar.b = false;
            z = z7;
            if (!z) {
            }
            return super.onTouchEvent(motionEvent);
        }
        aVar.c = null;
        aVar.d = null;
        aVar.e = -1;
        aVar.a = false;
        aVar.b = false;
        aVar.c = Float.valueOf(motionEvent.getX());
        aVar.d = Float.valueOf(motionEvent.getY());
        aVar.e = motionEvent.getPointerId(0);
        z = false;
        if (!z) {
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        if (this.h) {
            return true;
        }
        a(i, i2, i3, i4, i5, i6, i7, i8);
        return true;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.g.g(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.g.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        f(0);
    }

    public VerticalNestedWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.webViewStyle);
    }

    public VerticalNestedWebView(Context context) {
        this(context, null);
    }
}
