package m0;

import L1.AbstractC0023y;
import L1.C0012m;
import L1.C0016q;
import L1.G;
import L1.L;
import L1.N;
import L1.Y;
import O.C;
import O.K;
import O.j0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.p;
import androidx.window.layout.r;
import androidx.window.layout.s;
import androidx.window.layout.u;
import androidx.window.layout.v;
import androidx.window.layout.w;
import androidx.window.layout.x;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import k0.c0;
import t0.C0350b;

/* renamed from: m0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303k extends ViewGroup {

    /* renamed from: y, reason: collision with root package name */
    public static final boolean f4081y;

    /* renamed from: a, reason: collision with root package name */
    public int f4082a;

    /* renamed from: b, reason: collision with root package name */
    public int f4083b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f4084c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f4085d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public View f4086f;

    /* renamed from: g, reason: collision with root package name */
    public float f4087g;

    /* renamed from: h, reason: collision with root package name */
    public float f4088h;
    public int i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f4089k;

    /* renamed from: l, reason: collision with root package name */
    public float f4090l;

    /* renamed from: m, reason: collision with root package name */
    public float f4091m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f4092n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0300h f4093o;

    /* renamed from: p, reason: collision with root package name */
    public final U.e f4094p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4095q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4096r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f4097s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f4098t;

    /* renamed from: u, reason: collision with root package name */
    public int f4099u;

    /* renamed from: v, reason: collision with root package name */
    public androidx.window.layout.f f4100v;

    /* renamed from: w, reason: collision with root package name */
    public final C0298f f4101w;

    /* renamed from: x, reason: collision with root package name */
    public C0297e f4102x;

    static {
        f4081y = Build.VERSION.SDK_INT >= 29;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0303k(Context context) {
        super(context, null, 0);
        v vVar;
        WindowLayoutComponent b2;
        r rVar = null;
        this.f4082a = 0;
        this.f4087g = 1.0f;
        this.f4092n = new CopyOnWriteArrayList();
        this.f4096r = true;
        this.f4097s = new Rect();
        this.f4098t = new ArrayList();
        this.f4101w = new C0298f(this);
        float f2 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        K.l(this, new c0(this));
        setImportantForAccessibility(1);
        U.e eVar = new U.e(getContext(), this, new B0.f(2, this));
        eVar.f1175b = (int) (2.0f * eVar.f1175b);
        this.f4094p = eVar;
        eVar.f1184n = f2 * 400.0f;
        x.f2258a.getClass();
        int i = androidx.window.layout.a.f2214b;
        try {
            t1.h hVar = androidx.window.layout.i.f2236a;
            b2 = androidx.window.layout.i.b();
        } catch (Throwable unused) {
        }
        if (b2 != null) {
            vVar = new androidx.window.layout.c(b2);
            if (vVar == null) {
            }
            s sVar = new s(vVar);
            w.f2257b.getClass();
            setFoldingFeatureObserver(new C0297e(sVar, Build.VERSION.SDK_INT < 28 ? E.a.b(context) : new K.e(new Handler(context.getMainLooper()), 0)));
        }
        vVar = null;
        if (vVar == null) {
            u uVar = u.f2252c;
            if (u.f2252c == null) {
                ReentrantLock reentrantLock = u.f2253d;
                reentrantLock.lock();
                try {
                    if (u.f2252c == null) {
                        try {
                            t0.f c2 = p.c();
                            if (c2 != null) {
                                t0.f fVar = t0.f.f4371f;
                                D1.i.e(fVar, "other");
                                Object value = c2.e.getValue();
                                D1.i.d(value, "<get-bigInteger>(...)");
                                Object value2 = fVar.e.getValue();
                                D1.i.d(value2, "<get-bigInteger>(...)");
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    r rVar2 = new r(context);
                                    if (rVar2.i()) {
                                        rVar = rVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                        u.f2252c = new u(rVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            vVar = u.f2252c;
            D1.i.b(vVar);
        }
        s sVar2 = new s(vVar);
        w.f2257b.getClass();
        setFoldingFeatureObserver(new C0297e(sVar2, Build.VERSION.SDK_INT < 28 ? E.a.b(context) : new K.e(new Handler(context.getMainLooper()), 0)));
    }

    private G.c getSystemGestureInsets() {
        if (f4081y) {
            WeakHashMap weakHashMap = K.f747a;
            j0 a2 = C.a(this);
            if (a2 != null) {
                return a2.f819a.i();
            }
        }
        return null;
    }

    private void setFoldingFeatureObserver(C0297e c0297e) {
        this.f4102x = c0297e;
        c0297e.getClass();
        C0298f c0298f = this.f4101w;
        D1.i.e(c0298f, "onFoldingFeatureChangeListener");
        c0297e.f4073d = c0298f;
    }

    public final boolean a() {
        if (!this.e) {
            this.f4095q = false;
        }
        if (!this.f4096r && !f(1.0f)) {
            return false;
        }
        this.f4095q = false;
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() != 1) {
            super.addView(view, i, layoutParams);
            return;
        }
        C0302j c0302j = new C0302j(view.getContext());
        c0302j.addView(view);
        super.addView(c0302j, i, layoutParams);
    }

    public final boolean b(View view) {
        if (view == null) {
            return false;
        }
        return this.e && ((C0299g) view.getLayoutParams()).f4078c && this.f4087g > RecyclerView.f2111C0;
    }

    public final boolean c() {
        WeakHashMap weakHashMap = K.f747a;
        return getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0299g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        U.e eVar = this.f4094p;
        if (eVar.h()) {
            if (!this.e) {
                eVar.a();
            } else {
                WeakHashMap weakHashMap = K.f747a;
                postInvalidateOnAnimation();
            }
        }
    }

    public final boolean d() {
        return !this.e || this.f4087g == RecyclerView.f2111C0;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        super.draw(canvas);
        Drawable drawable = c() ? this.f4085d : this.f4084c;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (c()) {
            i2 = childAt.getRight();
            i = intrinsicWidth + i2;
        } else {
            int left = childAt.getLeft();
            int i3 = left - intrinsicWidth;
            i = left;
            i2 = i3;
        }
        drawable.setBounds(i2, top, i, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean c2 = c() ^ d();
        U.e eVar = this.f4094p;
        if (c2) {
            eVar.f1187q = 1;
            G.c systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                eVar.f1185o = Math.max(eVar.f1186p, systemGestureInsets.f261a);
            }
        } else {
            eVar.f1187q = 2;
            G.c systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                eVar.f1185o = Math.max(eVar.f1186p, systemGestureInsets2.f263c);
            }
        }
        C0299g c0299g = (C0299g) view.getLayoutParams();
        int save = canvas.save();
        if (this.e && !c0299g.f4077b && this.f4086f != null) {
            Rect rect = this.f4097s;
            canvas.getClipBounds(rect);
            if (c()) {
                rect.left = Math.max(rect.left, this.f4086f.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f4086f.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final void e(float f2) {
        boolean c2 = c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f4086f) {
                float f3 = 1.0f - this.f4088h;
                int i2 = this.f4089k;
                this.f4088h = f2;
                int i3 = ((int) (f3 * i2)) - ((int) ((1.0f - f2) * i2));
                if (c2) {
                    i3 = -i3;
                }
                childAt.offsetLeftAndRight(i3);
            }
        }
    }

    public final boolean f(float f2) {
        int paddingLeft;
        if (!this.e) {
            return false;
        }
        boolean c2 = c();
        C0299g c0299g = (C0299g) this.f4086f.getLayoutParams();
        if (c2) {
            int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) c0299g).rightMargin;
            paddingLeft = (int) (getWidth() - (((f2 * this.i) + paddingRight) + this.f4086f.getWidth()));
        } else {
            paddingLeft = (int) ((f2 * this.i) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0299g).leftMargin);
        }
        View view = this.f4086f;
        if (!this.f4094p.u(view, paddingLeft, view.getTop())) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
        WeakHashMap weakHashMap = K.f747a;
        postInvalidateOnAnimation();
        return true;
    }

    public final void g(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        View childAt;
        boolean z2;
        View view2 = view;
        boolean c2 = c();
        int width = c2 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = c2 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view.isOpaque()) {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            i = view.getLeft();
            i2 = view.getRight();
            i3 = view.getTop();
            i4 = view.getBottom();
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount && (childAt = getChildAt(i5)) != view2) {
            if (childAt.getVisibility() == 8) {
                z2 = c2;
            } else {
                z2 = c2;
                childAt.setVisibility((Math.max(c2 ? paddingLeft : width, childAt.getLeft()) < i || Math.max(paddingTop, childAt.getTop()) < i3 || Math.min(c2 ? width : paddingLeft, childAt.getRight()) > i2 || Math.min(height, childAt.getBottom()) > i4) ? 0 : 4);
            }
            i5++;
            view2 = view;
            c2 = z2;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0299g c0299g = new C0299g(-1, -1);
        c0299g.f4076a = RecyclerView.f2111C0;
        return c0299g;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0299g c0299g = new C0299g((ViewGroup.MarginLayoutParams) layoutParams);
            c0299g.f4076a = RecyclerView.f2111C0;
            return c0299g;
        }
        C0299g c0299g2 = new C0299g(layoutParams);
        c0299g2.f4076a = RecyclerView.f2111C0;
        return c0299g2;
    }

    @Deprecated
    public int getCoveredFadeColor() {
        return this.f4083b;
    }

    public final int getLockMode() {
        return this.f4099u;
    }

    public int getParallaxDistance() {
        return this.f4089k;
    }

    @Deprecated
    public int getSliderFadeColor() {
        return this.f4082a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Activity activity;
        v1.i f2;
        super.onAttachedToWindow();
        this.f4096r = true;
        if (this.f4102x != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                C0297e c0297e = this.f4102x;
                c0297e.getClass();
                Y y2 = c0297e.f4072c;
                if (y2 != null) {
                    y2.i(new L(y2.j(), null, y2));
                }
                G g2 = new G(c0297e.f4071b);
                v1.g e = g2.e(C0016q.f576b);
                v1.i iVar = g2;
                if (e == null) {
                    iVar = h0.f.v(g2, new N(null));
                }
                C0296d c0296d = new C0296d(c0297e, activity, null);
                v1.j jVar = v1.j.f4497a;
                Boolean bool = Boolean.FALSE;
                boolean booleanValue = ((Boolean) iVar.d(bool, C0012m.f569d)).booleanValue();
                boolean booleanValue2 = bool.booleanValue();
                if (booleanValue || booleanValue2) {
                    v1.i iVar2 = (v1.i) iVar.d(jVar, new C0012m(2, 2));
                    Object obj = jVar;
                    if (booleanValue2) {
                        obj = jVar.d(jVar, C0012m.f568c);
                    }
                    f2 = iVar2.f((v1.i) obj);
                } else {
                    f2 = iVar.f(jVar);
                }
                R1.d dVar = AbstractC0023y.f586a;
                if (f2 != dVar && f2.e(v1.e.f4496a) == null) {
                    f2 = f2.f(dVar);
                }
                Y y3 = new Y(f2, true);
                try {
                    Q1.a.h(h0.f.p(h0.f.j(c0296d, y3, y3)), null);
                    c0297e.f4072c = y3;
                } catch (Throwable th) {
                    y3.b(new t1.e(th));
                    throw th;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Y y2;
        super.onDetachedFromWindow();
        this.f4096r = true;
        C0297e c0297e = this.f4102x;
        if (c0297e != null && (y2 = c0297e.f4072c) != null) {
            y2.i(new L(y2.j(), null, y2));
        }
        ArrayList arrayList = this.f4098t;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = this.e;
        U.e eVar = this.f4094p;
        if (!z3 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            eVar.getClass();
            this.f4095q = U.e.l(childAt, x2, y2);
        }
        if (!this.e || (this.j && actionMasked != 0)) {
            eVar.b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            eVar.b();
            return false;
        }
        if (actionMasked == 0) {
            this.j = false;
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            this.f4090l = x3;
            this.f4091m = y3;
            eVar.getClass();
            if (U.e.l(this.f4086f, (int) x3, (int) y3) && b(this.f4086f)) {
                z2 = true;
                return eVar.t(motionEvent) || z2;
            }
        } else if (actionMasked == 2) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            float abs = Math.abs(x4 - this.f4090l);
            float abs2 = Math.abs(y4 - this.f4091m);
            if (abs > eVar.f1175b && abs2 > abs) {
                eVar.b();
                this.j = true;
                return false;
            }
        }
        z2 = false;
        if (eVar.t(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean c2 = c();
        int i11 = i3 - i;
        int paddingRight = c2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = c2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f4096r) {
            this.f4087g = (this.e && this.f4095q) ? RecyclerView.f2111C0 : 1.0f;
        }
        int i12 = paddingRight;
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                C0299g c0299g = (C0299g) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (c0299g.f4077b) {
                    int i14 = i11 - paddingLeft;
                    int min = (Math.min(paddingRight, i14) - i12) - (((ViewGroup.MarginLayoutParams) c0299g).leftMargin + ((ViewGroup.MarginLayoutParams) c0299g).rightMargin);
                    this.i = min;
                    int i15 = c2 ? ((ViewGroup.MarginLayoutParams) c0299g).rightMargin : ((ViewGroup.MarginLayoutParams) c0299g).leftMargin;
                    c0299g.f4078c = (measuredWidth / 2) + ((i12 + i15) + min) > i14;
                    float f2 = min;
                    int i16 = (int) (this.f4087g * f2);
                    i5 = i15 + i16 + i12;
                    this.f4087g = i16 / f2;
                    i6 = 0;
                } else if (!this.e || (i7 = this.f4089k) == 0) {
                    i5 = paddingRight;
                    i6 = 0;
                } else {
                    i6 = (int) ((1.0f - this.f4087g) * i7);
                    i5 = paddingRight;
                }
                if (c2) {
                    i9 = (i11 - i5) + i6;
                    i8 = i9 - measuredWidth;
                } else {
                    i8 = i5 - i6;
                    i9 = i8 + measuredWidth;
                }
                childAt.layout(i8, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                androidx.window.layout.f fVar = this.f4100v;
                if (fVar != null) {
                    C0350b c0350b = fVar.f2230a;
                    int b2 = c0350b.b();
                    int a2 = c0350b.a();
                    androidx.window.layout.e eVar = androidx.window.layout.e.f2223c;
                    if ((b2 > a2 ? androidx.window.layout.e.f2224d : eVar) == eVar && this.f4100v.a()) {
                        i10 = this.f4100v.f2230a.c().width();
                        paddingRight = Math.abs(i10) + childAt.getWidth() + paddingRight;
                    }
                }
                i10 = 0;
                paddingRight = Math.abs(i10) + childAt.getWidth() + paddingRight;
            }
            i13++;
            i12 = i5;
        }
        if (this.f4096r) {
            if (this.e && this.f4089k != 0) {
                e(this.f4087g);
            }
            g(this.f4086f);
        }
        this.f4096r = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0199, code lost:
    
        if (r5 == 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) r9).width == 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026a  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v21 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int paddingTop;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int makeMeasureSpec;
        ArrayList arrayList;
        U.e eVar;
        int i8;
        int i9;
        int i10;
        int minimumWidth;
        int makeMeasureSpec2;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        ?? r7 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            i3 = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = i3;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = 0;
        }
        int max = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f4086f = null;
        int i11 = 0;
        boolean z2 = false;
        int i12 = max;
        float f2 = RecyclerView.f2111C0;
        while (true) {
            i4 = 8;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            C0299g c0299g = (C0299g) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                c0299g.f4078c = r7;
            } else {
                float f3 = c0299g.f4076a;
                if (f3 > RecyclerView.f2111C0) {
                    f2 += f3;
                }
                int max2 = Math.max(max - (((ViewGroup.MarginLayoutParams) c0299g).leftMargin + ((ViewGroup.MarginLayoutParams) c0299g).rightMargin), (int) r7);
                int i13 = ((ViewGroup.MarginLayoutParams) c0299g).width;
                if (i13 == -2) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, mode == 0 ? mode : Integer.MIN_VALUE);
                } else {
                    makeMeasureSpec2 = i13 == -1 ? View.MeasureSpec.makeMeasureSpec(max2, mode) : View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                }
                childAt.measure(makeMeasureSpec2, ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) c0299g).height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    if (mode2 == Integer.MIN_VALUE) {
                        i3 = Math.min(measuredHeight, paddingTop);
                    } else if (mode2 == 0) {
                        i3 = measuredHeight;
                    }
                }
                i12 -= measuredWidth;
                if (i11 != 0) {
                    boolean z3 = i12 < 0;
                    c0299g.f4077b = z3;
                    z2 |= z3;
                    if (z3) {
                        this.f4086f = childAt;
                    }
                }
            }
            i11++;
            r7 = 0;
        }
        if (z2 || f2 > RecyclerView.f2111C0) {
            int i14 = 0;
            while (i14 < childCount) {
                View childAt2 = getChildAt(i14);
                if (childAt2.getVisibility() == i4) {
                    i7 = i12;
                } else {
                    C0299g c0299g2 = (C0299g) childAt2.getLayoutParams();
                    int measuredWidth2 = (((ViewGroup.MarginLayoutParams) c0299g2).width != 0 || c0299g2.f4076a <= RecyclerView.f2111C0) ? childAt2.getMeasuredWidth() : 0;
                    if (z2) {
                        i5 = max - (((ViewGroup.MarginLayoutParams) c0299g2).leftMargin + ((ViewGroup.MarginLayoutParams) c0299g2).rightMargin);
                        i6 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                    } else if (c0299g2.f4076a > RecyclerView.f2111C0) {
                        i5 = ((int) ((c0299g2.f4076a * Math.max(0, i12)) / f2)) + measuredWidth2;
                        i6 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                    } else {
                        i5 = measuredWidth2;
                        i6 = 0;
                    }
                    int paddingBottom = getPaddingBottom() + getPaddingTop();
                    C0299g c0299g3 = (C0299g) childAt2.getLayoutParams();
                    i7 = i12;
                    if (((ViewGroup.MarginLayoutParams) c0299g3).width == 0 && c0299g3.f4076a > RecyclerView.f2111C0) {
                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, ((ViewGroup.MarginLayoutParams) c0299g3).height);
                        if (measuredWidth2 != i5) {
                            childAt2.measure(i6, makeMeasureSpec);
                            int measuredHeight2 = childAt2.getMeasuredHeight();
                            if (measuredHeight2 > i3) {
                                if (mode2 == Integer.MIN_VALUE) {
                                    measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                                }
                                i3 = measuredHeight2;
                            }
                        }
                    }
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                    if (measuredWidth2 != i5) {
                    }
                }
                i14++;
                i12 = i7;
                i4 = 8;
            }
        }
        androidx.window.layout.f fVar = this.f4100v;
        if (fVar != null && fVar.a() && this.f4100v.f2230a.c().left != 0 && this.f4100v.f2230a.c().top == 0) {
            androidx.window.layout.f fVar2 = this.f4100v;
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            int i15 = iArr[0];
            Rect rect = new Rect(i15, iArr[1], getWidth() + i15, getWidth() + iArr[1]);
            Rect rect2 = new Rect(fVar2.f2230a.c());
            boolean intersect = rect2.intersect(rect);
            if (!(rect2.width() == 0 && rect2.height() == 0) && intersect) {
                rect2.offset(-iArr[0], -iArr[1]);
            } else {
                rect2 = null;
            }
            if (rect2 != null) {
                Rect rect3 = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rect2.left), getHeight() - getPaddingBottom());
                int width = getWidth() - getPaddingRight();
                arrayList = new ArrayList(Arrays.asList(rect3, new Rect(Math.min(width, rect2.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
                if (arrayList != null && !z2) {
                    i8 = 0;
                    while (i8 < childCount) {
                        View childAt3 = getChildAt(i8);
                        if (childAt3.getVisibility() != 8) {
                            Rect rect4 = (Rect) arrayList.get(i8);
                            C0299g c0299g4 = (C0299g) childAt3.getLayoutParams();
                            int i16 = ((ViewGroup.MarginLayoutParams) c0299g4).leftMargin + ((ViewGroup.MarginLayoutParams) c0299g4).rightMargin;
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                            childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), Integer.MIN_VALUE), makeMeasureSpec3);
                            if ((childAt3.getMeasuredWidthAndState() & 16777216) != 1) {
                                boolean z4 = childAt3 instanceof C0302j;
                                if (z4) {
                                    View childAt4 = ((C0302j) childAt3).getChildAt(0);
                                    WeakHashMap weakHashMap = K.f747a;
                                    minimumWidth = childAt4.getMinimumWidth();
                                } else {
                                    WeakHashMap weakHashMap2 = K.f747a;
                                    minimumWidth = childAt3.getMinimumWidth();
                                }
                                if (minimumWidth != 0) {
                                    i9 = rect4.width() < (z4 ? ((C0302j) childAt3).getChildAt(0).getMinimumWidth() : childAt3.getMinimumWidth()) ? 1073741824 : 1073741824;
                                }
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), 1073741824), makeMeasureSpec3);
                            }
                            childAt3.measure(View.MeasureSpec.makeMeasureSpec(max - i16, i9), makeMeasureSpec3);
                            if (i8 != 0) {
                                i10 = 1;
                                c0299g4.f4077b = true;
                                this.f4086f = childAt3;
                                z2 = true;
                                i8 += i10;
                            }
                        }
                        i10 = 1;
                        i8 += i10;
                    }
                }
                boolean z5 = z2;
                setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + i3);
                this.e = z5;
                eVar = this.f4094p;
                if (eVar.f1174a != 0 || z5) {
                }
                eVar.a();
                return;
            }
        }
        arrayList = null;
        if (arrayList != null) {
            i8 = 0;
            while (i8 < childCount) {
            }
        }
        boolean z52 = z2;
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + i3);
        this.e = z52;
        eVar = this.f4094p;
        if (eVar.f1174a != 0) {
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0301i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0301i c0301i = (C0301i) parcelable;
        super.onRestoreInstanceState(c0301i.f1147a);
        if (c0301i.f4079c) {
            if (!this.e) {
                this.f4095q = true;
            }
            if (this.f4096r || f(RecyclerView.f2111C0)) {
                this.f4095q = true;
            }
        } else {
            a();
        }
        this.f4095q = c0301i.f4079c;
        setLockMode(c0301i.f4080d);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0301i c0301i = new C0301i(super.onSaveInstanceState());
        c0301i.f4079c = this.e ? d() : this.f4095q;
        c0301i.f4080d = this.f4099u;
        return c0301i;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f4096r = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.e) {
            return super.onTouchEvent(motionEvent);
        }
        U.e eVar = this.f4094p;
        eVar.m(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f4090l = x2;
            this.f4091m = y2;
        } else if (actionMasked == 1 && b(this.f4086f)) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float f2 = x3 - this.f4090l;
            float f3 = y3 - this.f4091m;
            int i = eVar.f1175b;
            if ((f3 * f3) + (f2 * f2) < i * i && U.e.l(this.f4086f, (int) x3, (int) y3)) {
                a();
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view.getParent() instanceof C0302j) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.e) {
            return;
        }
        this.f4095q = view == this.f4086f;
    }

    @Deprecated
    public void setCoveredFadeColor(int i) {
        this.f4083b = i;
    }

    public final void setLockMode(int i) {
        this.f4099u = i;
    }

    @Deprecated
    public void setPanelSlideListener(InterfaceC0300h interfaceC0300h) {
        InterfaceC0300h interfaceC0300h2 = this.f4093o;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4092n;
        if (interfaceC0300h2 != null) {
            copyOnWriteArrayList.remove(interfaceC0300h2);
        }
        if (interfaceC0300h != null) {
            copyOnWriteArrayList.add(interfaceC0300h);
        }
        this.f4093o = interfaceC0300h;
    }

    public void setParallaxDistance(int i) {
        this.f4089k = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f4084c = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f4085d = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(getContext().getDrawable(i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(getContext().getDrawable(i));
    }

    @Deprecated
    public void setSliderFadeColor(int i) {
        this.f4082a = i;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0299g c0299g = new C0299g(context, attributeSet);
        c0299g.f4076a = RecyclerView.f2111C0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0299g.f4075d);
        c0299g.f4076a = obtainStyledAttributes.getFloat(0, RecyclerView.f2111C0);
        obtainStyledAttributes.recycle();
        return c0299g;
    }
}
