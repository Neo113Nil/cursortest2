package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import androidx.annotation.NonNull;
import defpackage.avr;
import defpackage.bvr;
import defpackage.c9n;
import defpackage.cvr;
import defpackage.dvr;
import defpackage.evr;
import defpackage.il4;
import defpackage.jyi;
import defpackage.kyi;
import defpackage.lyi;
import defpackage.myi;
import defpackage.ndu;
import defpackage.nyi;
import defpackage.ol4;
import defpackage.oyi;
import defpackage.pl4;
import defpackage.qdn;
import defpackage.tph;
import defpackage.wdu;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements nyi, myi, jyi, oyi, kyi {
    public static final int[] K = {R.attr.enabled};
    public bvr A;
    public bvr B;
    public tph C;
    public tph D;
    public boolean E;
    public int F;
    public boolean G;
    public final avr H;
    public final bvr I;
    public final bvr J;
    public View a;
    public dvr b;
    public boolean c;
    public final int d;
    public float e;
    public float f;
    public final c9n g;
    public final lyi h;
    public final int[] i;
    public final int[] j;
    public final int[] k;
    public boolean l;
    public final int m;
    public int n;
    public float o;
    public float p;
    public boolean q;
    public int r;
    public final DecelerateInterpolator s;
    public final il4 t;
    public int u;
    public int v;
    public final int w;
    public int x;
    public int y;
    public final pl4 z;

    public SwipeRefreshLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.e = -1.0f;
        this.i = new int[2];
        this.j = new int[2];
        this.k = new int[2];
        this.r = -1;
        this.u = -1;
        this.H = new avr(this, 0);
        this.I = new bvr(this, 2);
        this.J = new bvr(this, 3);
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.s = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.F = (int) (displayMetrics.density * 40.0f);
        il4 il4Var = new il4(getContext());
        float f = il4Var.getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = il4Var.getContext().obtainStyledAttributes(qdn.a);
        il4Var.b = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = wdu.a;
        ndu.l(il4Var, f * 4.0f);
        shapeDrawable.getPaint().setColor(il4Var.b);
        il4Var.setBackground(shapeDrawable);
        this.t = il4Var;
        pl4 pl4Var = new pl4(getContext());
        this.z = pl4Var;
        pl4Var.c(1);
        this.t.setImageDrawable(this.z);
        this.t.setVisibility(8);
        addView(this.t);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.x = i;
        this.e = i;
        this.g = new c9n(9, (byte) 0);
        this.h = new lyi(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.F;
        this.n = i2;
        this.w = i2;
        j(1.0f);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, K);
        setEnabled(obtainStyledAttributes2.getBoolean(0, true));
        obtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.t.getBackground().setAlpha(i);
        this.z.setAlpha(i);
    }

    public final boolean a() {
        View view = this.a;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.t)) {
                    this.a = childAt;
                    return;
                }
            }
        }
    }

    @Override // defpackage.myi
    public final void c(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.myi
    public final void d(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.h.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.h.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.h.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.h.d(i, i2, i3, i4, iArr, 0, null);
    }

    public final void e(float f) {
        if (f > this.e) {
            m(true, true);
            return;
        }
        this.c = false;
        pl4 pl4Var = this.z;
        ol4 ol4Var = pl4Var.a;
        ol4Var.e = 0.0f;
        ol4Var.f = 0.0f;
        pl4Var.invalidateSelf();
        avr avrVar = new avr(this, 1);
        this.v = this.n;
        bvr bvrVar = this.J;
        bvrVar.reset();
        bvrVar.setDuration(200L);
        bvrVar.setInterpolator(this.s);
        this.t.a = avrVar;
        this.t.clearAnimation();
        this.t.startAnimation(bvrVar);
        pl4 pl4Var2 = this.z;
        ol4 ol4Var2 = pl4Var2.a;
        if (ol4Var2.n) {
            ol4Var2.n = false;
        }
        pl4Var2.invalidateSelf();
    }

    @Override // defpackage.jyi
    public final void f(int i) {
    }

    @Override // defpackage.myi
    public final void g(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.u;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c9n c9nVar = this.g;
        return c9nVar.c | c9nVar.b;
    }

    public int getProgressCircleDiameter() {
        return this.F;
    }

    public int getProgressViewEndOffset() {
        return this.x;
    }

    public int getProgressViewStartOffset() {
        return this.w;
    }

    @Override // defpackage.nyi
    public final void h(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.h.d(i, i2, i3, i4, this.j, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        if ((i7 == 0 ? i4 + this.j[1] : i7) >= 0 || a()) {
            return;
        }
        float abs = this.f + Math.abs(r14);
        this.f = abs;
        i(abs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.h.f(0);
    }

    public final void i(float f) {
        tph tphVar;
        tph tphVar2;
        pl4 pl4Var = this.z;
        ol4 ol4Var = pl4Var.a;
        if (!ol4Var.n) {
            ol4Var.n = true;
        }
        pl4Var.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f / this.e));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.e;
        int i = this.y;
        if (i <= 0) {
            i = this.x;
        }
        float f2 = i;
        double max2 = Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.w + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.t.getVisibility() != 0) {
            this.t.setVisibility(0);
        }
        this.t.setScaleX(1.0f);
        this.t.setScaleY(1.0f);
        float f3 = this.e;
        pl4 pl4Var2 = this.z;
        if (f < f3) {
            if (pl4Var2.a.t > 76 && ((tphVar2 = this.C) == null || !tphVar2.hasStarted() || tphVar2.hasEnded())) {
                tph tphVar3 = new tph(this, this.z.a.t, 76);
                tphVar3.setDuration(300L);
                il4 il4Var = this.t;
                il4Var.a = null;
                il4Var.clearAnimation();
                this.t.startAnimation(tphVar3);
                this.C = tphVar3;
            }
        } else if (pl4Var2.a.t < 255 && ((tphVar = this.D) == null || !tphVar.hasStarted() || tphVar.hasEnded())) {
            tph tphVar4 = new tph(this, this.z.a.t, KotlinVersion.MAX_COMPONENT_VALUE);
            tphVar4.setDuration(300L);
            il4 il4Var2 = this.t;
            il4Var2.a = null;
            il4Var2.clearAnimation();
            this.t.startAnimation(tphVar4);
            this.D = tphVar4;
        }
        float min2 = Math.min(0.8f, max * 0.8f);
        pl4 pl4Var3 = this.z;
        ol4 ol4Var2 = pl4Var3.a;
        ol4Var2.e = 0.0f;
        ol4Var2.f = min2;
        pl4Var3.invalidateSelf();
        float min3 = Math.min(1.0f, max);
        pl4 pl4Var4 = this.z;
        ol4 ol4Var3 = pl4Var4.a;
        if (min3 != ol4Var3.p) {
            ol4Var3.p = min3;
        }
        pl4Var4.invalidateSelf();
        pl4 pl4Var5 = this.z;
        pl4Var5.a.g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        pl4Var5.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.n);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.h.d;
    }

    public final void j(float f) {
        setTargetOffsetTopAndBottom((this.v + ((int) ((this.w - r0) * f))) - this.t.getTop());
    }

    @Override // defpackage.myi
    public final void k(View view, int i, int i2, int i3, int i4, int i5) {
        h(view, i, i2, i3, i4, i5, this.k);
    }

    public final void l() {
        this.t.clearAnimation();
        this.z.stop();
        this.t.setVisibility(8);
        setColorViewAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        setTargetOffsetTopAndBottom(this.w - this.n);
        this.n = this.t.getTop();
    }

    public final void m(boolean z, boolean z2) {
        if (this.c != z) {
            this.E = z2;
            b();
            this.c = z;
            avr avrVar = this.H;
            if (!z) {
                bvr bvrVar = new bvr(this, 1);
                this.B = bvrVar;
                bvrVar.setDuration(150L);
                il4 il4Var = this.t;
                il4Var.a = avrVar;
                il4Var.clearAnimation();
                this.t.startAnimation(this.B);
                return;
            }
            this.v = this.n;
            bvr bvrVar2 = this.I;
            bvrVar2.reset();
            bvrVar2.setDuration(200L);
            bvrVar2.setInterpolator(this.s);
            if (avrVar != null) {
                this.t.a = avrVar;
            }
            this.t.clearAnimation();
            this.t.startAnimation(bvrVar2);
        }
    }

    public final void n(float f) {
        float f2 = this.p;
        float f3 = f - f2;
        float f4 = this.d;
        if (f3 <= f4 || this.q) {
            return;
        }
        this.o = f2 + f4;
        this.q = true;
        this.z.setAlpha(76);
    }

    @Override // defpackage.myi
    public final boolean o(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.c && !this.l) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        int i = this.r;
                        if (i == -1) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        if (findPointerIndex >= 0) {
                            n(motionEvent.getY(findPointerIndex));
                        }
                    } else if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.r) {
                                this.r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            }
                        }
                    }
                    return this.q;
                }
                this.q = false;
                this.r = -1;
                return this.q;
            }
            setTargetOffsetTopAndBottom(this.w - this.t.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.r = pointerId;
            this.q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 >= 0) {
                this.p = motionEvent.getY(findPointerIndex2);
                return this.q;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.a == null) {
            b();
        }
        View view = this.a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.t.getMeasuredWidth();
        int measuredHeight2 = this.t.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.n;
        this.t.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a == null) {
            b();
        }
        View view = this.a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.t.measure(View.MeasureSpec.makeMeasureSpec(this.F, 1073741824), View.MeasureSpec.makeMeasureSpec(this.F, 1073741824));
        this.u = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.t) {
                this.u = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.h.a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.h.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f = 0.0f;
                } else {
                    this.f = f - f2;
                    iArr[1] = i2;
                }
                i(this.f);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.i;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        h(view, i, i2, i3, i4, 0, this.k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.g.b = i;
        startNestedScroll(i & 2);
        this.f = 0.0f;
        this.l = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        evr evrVar = (evr) parcelable;
        super.onRestoreInstanceState(evrVar.getSuperState());
        setRefreshing(evrVar.a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new evr(super.onSaveInstanceState(), this.c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.c || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.g.b = 0;
        this.l = false;
        float f = this.f;
        if (f > 0.0f) {
            e(f);
            this.f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.c && !this.l) {
            if (actionMasked == 0) {
                this.r = motionEvent.getPointerId(0);
                this.q = false;
                return true;
            }
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.r);
                if (findPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.q) {
                    float y = (motionEvent.getY(findPointerIndex) - this.o) * 0.5f;
                    this.q = false;
                    e(y);
                }
                this.r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.r);
                if (findPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                n(y2);
                if (this.q) {
                    float f = (y2 - this.o) * 0.5f;
                    if (f > 0.0f) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        i(f);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.r) {
                            this.r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.r = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.a;
        if (view != null) {
            WeakHashMap weakHashMap = wdu.a;
            if (!ndu.i(view)) {
                if (this.G || (parent = getParent()) == null) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(z);
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.t.setScaleX(f);
        this.t.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        pl4 pl4Var = this.z;
        ol4 ol4Var = pl4Var.a;
        ol4Var.i = iArr;
        ol4Var.a(0);
        ol4Var.a(0);
        pl4Var.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        l();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.G = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.h.g(z);
    }

    public void setOnRefreshListener(dvr dvrVar) {
        this.b = dvrVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.t.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.c == z) {
            m(z, false);
            return;
        }
        this.c = z;
        setTargetOffsetTopAndBottom((this.x + this.w) - this.n);
        this.E = false;
        this.t.setVisibility(0);
        this.z.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        bvr bvrVar = new bvr(this, 0);
        this.A = bvrVar;
        bvrVar.setDuration(this.m);
        avr avrVar = this.H;
        if (avrVar != null) {
            this.t.a = avrVar;
        }
        this.t.clearAnimation();
        this.t.startAnimation(this.A);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.F = (int) (displayMetrics.density * 56.0f);
            } else {
                this.F = (int) (displayMetrics.density * 40.0f);
            }
            this.t.setImageDrawable(null);
            this.z.c(i);
            this.t.setImageDrawable(this.z);
        }
    }

    public void setSlingshotDistance(int i) {
        this.y = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        il4 il4Var = this.t;
        il4Var.bringToFront();
        WeakHashMap weakHashMap = wdu.a;
        il4Var.offsetTopAndBottom(i);
        this.n = il4Var.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.h.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.h.i(0);
    }

    public void setOnChildScrollUpCallback(cvr cvrVar) {
    }

    public SwipeRefreshLayout(@NonNull Context context) {
        this(context, null);
    }
}
