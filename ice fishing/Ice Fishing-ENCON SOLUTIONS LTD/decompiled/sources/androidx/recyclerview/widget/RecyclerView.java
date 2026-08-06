package androidx.recyclerview.widget;

import I0.b;
import N1.n;
import O.a;
import P.A;
import P.C;
import P.C0053b;
import P.C0054c;
import P.C0058g;
import P.C0060i;
import P.D;
import P.E;
import P.F;
import P.G;
import P.H;
import P.J;
import P.P;
import P.RunnableC0062k;
import P.q;
import P.s;
import P.t;
import P.u;
import P.w;
import P.z;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import m0.j;
import u.d;
import y.AbstractC1083p;
import y.B;
import y.C1074g;
import y.r;
import y.x;
import y.y;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: m0, reason: collision with root package name */
    public static final int[] f2528m0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: n0, reason: collision with root package name */
    public static final int[] f2529n0 = {R.attr.clipToPadding};

    /* renamed from: o0, reason: collision with root package name */
    public static final Class[] f2530o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final q f2531p0;

    /* renamed from: A, reason: collision with root package name */
    public EdgeEffect f2532A;

    /* renamed from: B, reason: collision with root package name */
    public EdgeEffect f2533B;

    /* renamed from: C, reason: collision with root package name */
    public EdgeEffect f2534C;

    /* renamed from: D, reason: collision with root package name */
    public u f2535D;

    /* renamed from: E, reason: collision with root package name */
    public int f2536E;

    /* renamed from: F, reason: collision with root package name */
    public int f2537F;
    public VelocityTracker G;

    /* renamed from: H, reason: collision with root package name */
    public int f2538H;

    /* renamed from: I, reason: collision with root package name */
    public int f2539I;

    /* renamed from: J, reason: collision with root package name */
    public int f2540J;

    /* renamed from: K, reason: collision with root package name */
    public int f2541K;

    /* renamed from: L, reason: collision with root package name */
    public int f2542L;

    /* renamed from: R, reason: collision with root package name */
    public final int f2543R;

    /* renamed from: S, reason: collision with root package name */
    public final int f2544S;

    /* renamed from: T, reason: collision with root package name */
    public final float f2545T;

    /* renamed from: U, reason: collision with root package name */
    public final float f2546U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f2547V;

    /* renamed from: W, reason: collision with root package name */
    public final H f2548W;

    /* renamed from: a, reason: collision with root package name */
    public final C f2549a;

    /* renamed from: a0, reason: collision with root package name */
    public RunnableC0062k f2550a0;

    /* renamed from: b, reason: collision with root package name */
    public E f2551b;

    /* renamed from: b0, reason: collision with root package name */
    public final C0060i f2552b0;

    /* renamed from: c, reason: collision with root package name */
    public final b f2553c;

    /* renamed from: c0, reason: collision with root package name */
    public final F f2554c0;

    /* renamed from: d, reason: collision with root package name */
    public final b f2555d;

    /* renamed from: d0, reason: collision with root package name */
    public ArrayList f2556d0;

    /* renamed from: e, reason: collision with root package name */
    public final j f2557e;
    public final j e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2558f;
    public J f0;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f2559g;

    /* renamed from: g0, reason: collision with root package name */
    public C1074g f2560g0;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f2561h;

    /* renamed from: h0, reason: collision with root package name */
    public final int[] f2562h0;

    /* renamed from: i, reason: collision with root package name */
    public w f2563i;

    /* renamed from: i0, reason: collision with root package name */
    public final int[] f2564i0;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2565j;

    /* renamed from: j0, reason: collision with root package name */
    public final int[] f2566j0;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2567k;
    public final ArrayList k0;

    /* renamed from: l, reason: collision with root package name */
    public C0058g f2568l;

    /* renamed from: l0, reason: collision with root package name */
    public final C.b f2569l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2570m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2571n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2572o;

    /* renamed from: p, reason: collision with root package name */
    public int f2573p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2574q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2575r;

    /* renamed from: s, reason: collision with root package name */
    public int f2576s;
    public final AccessibilityManager t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2577u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2578v;

    /* renamed from: w, reason: collision with root package name */
    public int f2579w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2580x;

    /* renamed from: y, reason: collision with root package name */
    public t f2581y;

    /* renamed from: z, reason: collision with root package name */
    public EdgeEffect f2582z;

    static {
        Class cls = Integer.TYPE;
        f2530o0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f2531p0 = new q();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float a2;
        char c2;
        int i2;
        TypedArray typedArray;
        char c3;
        Constructor constructor;
        int i3 = 15;
        this.f2549a = new C(this);
        this.f2557e = new j(17);
        this.f2559g = new Rect();
        this.f2561h = new Rect();
        new RectF();
        this.f2565j = new ArrayList();
        this.f2567k = new ArrayList();
        this.f2573p = 0;
        this.f2577u = false;
        this.f2578v = false;
        this.f2579w = 0;
        this.f2580x = 0;
        this.f2581y = new t();
        C0054c c0054c = new C0054c();
        Object[] objArr = null;
        c0054c.f1366a = null;
        c0054c.f1367b = new ArrayList();
        c0054c.f1368c = 250L;
        c0054c.f1369d = 250L;
        c0054c.f1302e = new ArrayList();
        c0054c.f1303f = new ArrayList();
        c0054c.f1304g = new ArrayList();
        c0054c.f1305h = new ArrayList();
        c0054c.f1306i = new ArrayList();
        c0054c.f1307j = new ArrayList();
        c0054c.f1308k = new ArrayList();
        c0054c.f1309l = new ArrayList();
        c0054c.f1310m = new ArrayList();
        c0054c.f1311n = new ArrayList();
        c0054c.f1312o = new ArrayList();
        this.f2535D = c0054c;
        this.f2536E = 0;
        this.f2537F = -1;
        this.f2545T = Float.MIN_VALUE;
        this.f2546U = Float.MIN_VALUE;
        boolean z2 = true;
        this.f2547V = true;
        this.f2548W = new H(this);
        this.f2552b0 = new C0060i();
        F f2 = new F();
        f2.f1260a = 0;
        f2.f1261b = false;
        f2.f1262c = false;
        f2.f1263d = false;
        f2.f1264e = false;
        this.f2554c0 = f2;
        j jVar = new j(i3, false);
        this.e0 = jVar;
        this.f2562h0 = new int[2];
        this.f2564i0 = new int[2];
        this.f2566j0 = new int[2];
        this.k0 = new ArrayList();
        this.f2569l0 = new C.b(5, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2529n0, 0, 0);
            this.f2558f = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f2558f = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2542L = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = B.f8537a;
            a2 = y.a(viewConfiguration);
        } else {
            a2 = B.a(viewConfiguration, context);
        }
        this.f2545T = a2;
        this.f2546U = i4 >= 26 ? y.b(viewConfiguration) : B.a(viewConfiguration, context);
        this.f2543R = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2544S = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2535D.f1366a = jVar;
        this.f2553c = new b(new j(14, this));
        this.f2555d = new b(new C.j(i3, this));
        Field field = x.f8596a;
        if ((i4 >= 26 ? r.c(this) : 0) == 0 && i4 >= 26) {
            r.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.t = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new J(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f1232a, 0, 0);
            String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (obtainStyledAttributes2.getBoolean(2, false)) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(5);
                Drawable drawable = obtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + h());
                }
                Resources resources = getContext().getResources();
                c2 = 3;
                i2 = 4;
                typedArray = obtainStyledAttributes2;
                c3 = 2;
                new C0058g(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.watchfacestudio.spraktum.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.watchfacestudio.spraktum.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.watchfacestudio.spraktum.R.dimen.fastscroll_margin));
            } else {
                c2 = 3;
                i2 = 4;
                typedArray = obtainStyledAttributes2;
                c3 = 2;
            }
            typedArray.recycle();
            if (string != null) {
                String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        trim = context.getPackageName() + trim;
                    } else if (!trim.contains(".")) {
                        trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                    }
                    try {
                        Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(trim).asSubclass(w.class);
                        try {
                            constructor = asSubclass.getConstructor(f2530o0);
                            Object[] objArr2 = new Object[i2];
                            objArr2[0] = context;
                            objArr2[1] = attributeSet;
                            objArr2[c3] = 0;
                            objArr2[c2] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e2) {
                            try {
                                constructor = asSubclass.getConstructor(null);
                            } catch (NoSuchMethodException e3) {
                                e3.initCause(e2);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e3);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((w) constructor.newInstance(objArr));
                    } catch (ClassCastException e4) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e4);
                    } catch (ClassNotFoundException e5) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e5);
                    } catch (IllegalAccessException e6) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e6);
                    } catch (InstantiationException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e7);
                    } catch (InvocationTargetException e8) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e8);
                    }
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f2528m0, 0, 0);
            z2 = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z2);
    }

    private C1074g getScrollingChildHelper() {
        if (this.f2560g0 == null) {
            this.f2560g0 = new C1074g(this);
        }
        return this.f2560g0;
    }

    public static void j(View view) {
        if (view == null) {
            return;
        }
        ((P.x) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        w wVar = this.f2563i;
        if (wVar != null) {
            wVar.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    public final void b(String str) {
        if (this.f2579w > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
        }
        if (this.f2580x > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + h()));
        }
    }

    public final void c(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.f2582z;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.f2582z.onRelease();
            z2 = this.f2582z.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2533B;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.f2533B.onRelease();
            z2 |= this.f2533B.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2532A;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.f2532A.onRelease();
            z2 |= this.f2532A.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2534C;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.f2534C.onRelease();
            z2 |= this.f2534C.isFinished();
        }
        if (z2) {
            Field field = x.f8596a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof P.x) && this.f2563i.d((P.x) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        w wVar = this.f2563i;
        if (wVar != null && wVar.b()) {
            return this.f2563i.f(this.f2554c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        w wVar = this.f2563i;
        if (wVar != null && wVar.b()) {
            this.f2563i.g(this.f2554c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        w wVar = this.f2563i;
        if (wVar != null && wVar.b()) {
            return this.f2563i.h(this.f2554c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        w wVar = this.f2563i;
        if (wVar != null && wVar.c()) {
            return this.f2563i.i(this.f2554c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        w wVar = this.f2563i;
        if (wVar != null && wVar.c()) {
            this.f2563i.j(this.f2554c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        w wVar = this.f2563i;
        if (wVar != null && wVar.c()) {
            return this.f2563i.k(this.f2554c0);
        }
        return 0;
    }

    public final void d() {
        b bVar = this.f2553c;
        if (!this.f2572o || this.f2577u) {
            int i2 = d.f8475a;
            Trace.beginSection("RV FullInvalidate");
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
            return;
        }
        if (((ArrayList) bVar.f722c).size() > 0) {
            bVar.getClass();
            if (((ArrayList) bVar.f722c).size() > 0) {
                int i3 = d.f8475a;
                Trace.beginSection("RV FullInvalidate");
                Log.e("RecyclerView", "No adapter attached; skipping layout");
                Trace.endSection();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().d(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList arrayList = this.f2565j;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0058g c0058g = (C0058g) arrayList.get(i2);
            if (c0058g.f1329l != c0058g.f1331n.getWidth() || c0058g.f1330m != c0058g.f1331n.getHeight()) {
                c0058g.f1329l = c0058g.f1331n.getWidth();
                c0058g.f1330m = c0058g.f1331n.getHeight();
                c0058g.e(0);
            } else if (c0058g.f1338v != 0) {
                if (c0058g.f1332o) {
                    int i3 = c0058g.f1329l;
                    int i4 = c0058g.f1321d;
                    int i5 = i3 - i4;
                    int i6 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = c0058g.f1319b;
                    stateListDrawable.setBounds(0, 0, i4, 0);
                    int i7 = c0058g.f1330m;
                    Drawable drawable = c0058g.f1320c;
                    drawable.setBounds(0, 0, c0058g.f1322e, i7);
                    RecyclerView recyclerView = c0058g.f1331n;
                    Field field = x.f8596a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i4, i6);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate(-i4, -i6);
                    } else {
                        canvas.translate(i5, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i6);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i5, -i6);
                    }
                }
                if (c0058g.f1333p) {
                    int i8 = c0058g.f1330m;
                    int i9 = c0058g.f1325h;
                    int i10 = i8 - i9;
                    StateListDrawable stateListDrawable2 = c0058g.f1323f;
                    stateListDrawable2.setBounds(0, 0, 0, i9);
                    int i11 = c0058g.f1329l;
                    Drawable drawable2 = c0058g.f1324g;
                    drawable2.setBounds(0, 0, i11, c0058g.f1326i);
                    canvas.translate(0.0f, i10);
                    drawable2.draw(canvas);
                    canvas.translate(0 - (0 / 2), 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-r9, -i10);
                }
            }
        }
        EdgeEffect edgeEffect = this.f2582z;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f2558f ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f2582z;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f2532A;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2558f) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2532A;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f2533B;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2558f ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f2533B;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2534C;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2558f) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f2534C;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f2535D == null || arrayList.size() <= 0 || !this.f2535D.b()) ? z2 : true) {
            Field field2 = x.f8596a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = x.f8596a;
        setMeasuredDimension(w.e(i2, paddingRight, getMinimumWidth()), w.e(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i2) {
        int i3;
        this.f2563i.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i2);
        if (findNextFocus != null && !findNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i2);
            }
            o(findNextFocus, null);
            return view;
        }
        if (findNextFocus != null && findNextFocus != this && i(findNextFocus) != null) {
            if (view == null || i(view) == null) {
                return findNextFocus;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f2559g;
            char c2 = 0;
            rect.set(0, 0, width, height);
            int width2 = findNextFocus.getWidth();
            int height2 = findNextFocus.getHeight();
            Rect rect2 = this.f2561h;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect2);
            RecyclerView recyclerView = this.f2563i.f1373b;
            Field field = x.f8596a;
            int i4 = recyclerView.getLayoutDirection() == 1 ? -1 : 1;
            int i5 = rect.left;
            int i6 = rect2.left;
            if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
                i3 = 1;
            } else {
                int i7 = rect.right;
                int i8 = rect2.right;
                i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
            }
            int i9 = rect.top;
            int i10 = rect2.top;
            if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                c2 = 1;
            } else {
                int i11 = rect.bottom;
                int i12 = rect2.bottom;
                if ((i11 > i12 || i9 >= i12) && i9 > i10) {
                    c2 = 65535;
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 17) {
                        if (i2 != 33) {
                            if (i2 != 66) {
                                if (i2 != 130) {
                                    throw new IllegalArgumentException("Invalid direction: " + i2 + h());
                                }
                                if (c2 > 0) {
                                    return findNextFocus;
                                }
                            } else if (i3 > 0) {
                                return findNextFocus;
                            }
                        } else if (c2 < 0) {
                            return findNextFocus;
                        }
                    } else if (i3 < 0) {
                        return findNextFocus;
                    }
                } else {
                    if (c2 > 0) {
                        return findNextFocus;
                    }
                    if (c2 == 0 && i3 * i4 >= 0) {
                        return findNextFocus;
                    }
                }
            } else {
                if (c2 < 0) {
                    return findNextFocus;
                }
                if (c2 == 0 && i3 * i4 <= 0) {
                    return findNextFocus;
                }
            }
        }
        return super.focusSearch(view, i2);
    }

    public final boolean g(int[] iArr, int i2) {
        return getScrollingChildHelper().d(0, 0, 0, 0, iArr, i2, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        w wVar = this.f2563i;
        if (wVar != null) {
            return wVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        w wVar = this.f2563i;
        if (wVar != null) {
            return wVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public P.r getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        w wVar = this.f2563i;
        if (wVar == null) {
            return super.getBaseline();
        }
        wVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2558f;
    }

    public J getCompatAccessibilityDelegate() {
        return this.f0;
    }

    public t getEdgeEffectFactory() {
        return this.f2581y;
    }

    public u getItemAnimator() {
        return this.f2535D;
    }

    public int getItemDecorationCount() {
        return this.f2565j.size();
    }

    public w getLayoutManager() {
        return this.f2563i;
    }

    public int getMaxFlingVelocity() {
        return this.f2544S;
    }

    public int getMinFlingVelocity() {
        return this.f2543R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public P.y getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2547V;
    }

    public P.B getRecycledViewPool() {
        C c2 = this.f2549a;
        if (c2.f1257e == null) {
            P.B b2 = new P.B();
            b2.f1251a = new SparseArray();
            b2.f1252b = 0;
            c2.f1257e = b2;
        }
        return c2.f1257e;
    }

    public int getScrollState() {
        return this.f2536E;
    }

    public final String h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f2563i + ", context:" + getContext();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View i(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2570m;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f8586d;
    }

    public final boolean k() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        return !this.f2572o || this.f2577u || ((ArrayList) this.f2553c.f722c).size() > 0;
    }

    public final void m() {
        int D2 = this.f2555d.D();
        for (int i2 = 0; i2 < D2; i2++) {
            ((P.x) this.f2555d.C(i2).getLayoutParams()).f1380b = true;
        }
        ArrayList arrayList = this.f2549a.f1254b;
        if (arrayList.size() <= 0) {
            return;
        }
        C1.a.n(arrayList.get(0));
        throw null;
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2537F) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f2537F = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.f2540J = x2;
            this.f2538H = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.f2541K = y2;
            this.f2539I = y2;
        }
    }

    public final void o(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2559g;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof P.x) {
            P.x xVar = (P.x) layoutParams;
            if (!xVar.f1380b) {
                int i2 = rect.left;
                Rect rect2 = xVar.f1379a;
                rect.left = i2 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f2563i.G(this, view, this.f2559g, !this.f2572o, view2 == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r1 >= 30.0f) goto L19;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f2;
        super.onAttachedToWindow();
        boolean z2 = false;
        this.f2579w = 0;
        this.f2570m = true;
        if (this.f2572o && !isLayoutRequested()) {
            z2 = true;
        }
        this.f2572o = z2;
        w wVar = this.f2563i;
        if (wVar != null) {
            wVar.f1376e = true;
        }
        ThreadLocal threadLocal = RunnableC0062k.f1348e;
        RunnableC0062k runnableC0062k = (RunnableC0062k) threadLocal.get();
        this.f2550a0 = runnableC0062k;
        if (runnableC0062k == null) {
            RunnableC0062k runnableC0062k2 = new RunnableC0062k();
            runnableC0062k2.f1350a = new ArrayList();
            runnableC0062k2.f1353d = new ArrayList();
            this.f2550a0 = runnableC0062k2;
            Field field = x.f8596a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f2 = display.getRefreshRate();
            }
            f2 = 60.0f;
            RunnableC0062k runnableC0062k3 = this.f2550a0;
            runnableC0062k3.f1352c = (long) (1.0E9f / f2);
            threadLocal.set(runnableC0062k3);
        }
        this.f2550a0.f1350a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object obj;
        super.onDetachedFromWindow();
        u uVar = this.f2535D;
        if (uVar != null) {
            uVar.a();
        }
        setScrollState(0);
        H h2 = this.f2548W;
        h2.f1271g.removeCallbacks(h2);
        h2.f1267c.abortAnimation();
        this.f2570m = false;
        w wVar = this.f2563i;
        if (wVar != null) {
            wVar.f1376e = false;
            wVar.z(this);
        }
        this.k0.clear();
        removeCallbacks(this.f2569l0);
        this.f2557e.getClass();
        do {
            n nVar = P.f1298a;
            int i2 = nVar.f1223a;
            obj = null;
            if (i2 > 0) {
                int i3 = i2 - 1;
                Object[] objArr = (Object[]) nVar.f1224b;
                Object obj2 = objArr[i3];
                i.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i3] = null;
                nVar.f1223a--;
                obj = obj2;
            }
        } while (obj != null);
        RunnableC0062k runnableC0062k = this.f2550a0;
        if (runnableC0062k != null) {
            runnableC0062k.f1350a.remove(this);
            this.f2550a0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2565j;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0058g) arrayList.get(i2)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.f2563i != null && !this.f2574q && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f2563i.c() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f2563i.b()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || f3 != 0.0f) {
                        q((int) (f3 * this.f2545T), (int) (f2 * this.f2546U), motionEvent);
                    }
                }
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                q((int) (f3 * this.f2545T), (int) (f2 * this.f2546U), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f2563i.c()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        q((int) (f3 * this.f2545T), (int) (f2 * this.f2546U), motionEvent);
                    } else if (this.f2563i.b()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        q((int) (f3 * this.f2545T), (int) (f2 * this.f2546U), motionEvent);
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                q((int) (f3 * this.f2545T), (int) (f2 * this.f2546U), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f2574q) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f2568l = null;
        }
        ArrayList arrayList = this.f2567k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0058g c0058g = (C0058g) arrayList.get(i2);
            if (c0058g.c(motionEvent) && action != 3) {
                this.f2568l = c0058g;
                p();
                setScrollState(0);
                return true;
            }
        }
        w wVar = this.f2563i;
        if (wVar == null) {
            return false;
        }
        boolean b2 = wVar.b();
        boolean c2 = this.f2563i.c();
        if (this.G == null) {
            this.G = VelocityTracker.obtain();
        }
        this.G.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f2575r) {
                this.f2575r = false;
            }
            this.f2537F = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f2540J = x2;
            this.f2538H = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f2541K = y2;
            this.f2539I = y2;
            if (this.f2536E == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f2566j0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = b2;
            if (c2) {
                i3 = (b2 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i3, 0);
        } else if (actionMasked == 1) {
            this.G.clear();
            s(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f2537F);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2537F + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f2536E != 1) {
                int i4 = x3 - this.f2538H;
                int i5 = y3 - this.f2539I;
                if (b2 == 0 || Math.abs(i4) <= this.f2542L) {
                    z2 = false;
                } else {
                    this.f2540J = x3;
                    z2 = true;
                }
                if (c2 && Math.abs(i5) > this.f2542L) {
                    this.f2541K = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            p();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f2537F = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2540J = x4;
            this.f2538H = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2541K = y4;
            this.f2539I = y4;
        } else if (actionMasked == 6) {
            n(motionEvent);
        }
        return this.f2536E == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = d.f8475a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.f2572o = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        w wVar = this.f2563i;
        if (wVar == null) {
            e(i2, i3);
            return;
        }
        if (wVar.y()) {
            View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getMode(i3);
            this.f2563i.f1373b.e(i2, i3);
        } else {
            if (this.f2571n) {
                this.f2563i.f1373b.e(i2, i3);
                return;
            }
            F f2 = this.f2554c0;
            if (f2.f1264e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            f2.getClass();
            this.f2573p++;
            this.f2563i.f1373b.e(i2, i3);
            if (this.f2573p < 1) {
                this.f2573p = 1;
            }
            this.f2573p--;
            f2.f1262c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (this.f2579w > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof E)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        E e2 = (E) parcelable;
        this.f2551b = e2;
        super.onRestoreInstanceState(e2.f307a);
        w wVar = this.f2563i;
        if (wVar == null || (parcelable2 = this.f2551b.f1259c) == null) {
            return;
        }
        wVar.B(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        E e2 = new E(super.onSaveInstanceState());
        E e3 = this.f2551b;
        if (e3 != null) {
            e2.f1259c = e3.f1259c;
        } else {
            w wVar = this.f2563i;
            if (wVar != null) {
                e2.f1259c = wVar.C();
            } else {
                e2.f1259c = null;
            }
        }
        return e2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.f2534C = null;
        this.f2532A = null;
        this.f2533B = null;
        this.f2582z = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f2574q || this.f2575r) {
            return false;
        }
        int action = motionEvent.getAction();
        C0058g c0058g = this.f2568l;
        if (c0058g != null) {
            if (action != 0) {
                if (c0058g.f1334q != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean b2 = c0058g.b(motionEvent.getX(), motionEvent.getY());
                        boolean a2 = c0058g.a(motionEvent.getX(), motionEvent.getY());
                        if (b2 || a2) {
                            if (a2) {
                                c0058g.f1335r = 1;
                                c0058g.f1328k = (int) motionEvent.getX();
                            } else if (b2) {
                                c0058g.f1335r = 2;
                                c0058g.f1327j = (int) motionEvent.getY();
                            }
                            c0058g.e(2);
                        }
                    } else if (motionEvent.getAction() == 1 && c0058g.f1334q == 2) {
                        c0058g.f1327j = 0.0f;
                        c0058g.f1328k = 0.0f;
                        c0058g.e(1);
                        c0058g.f1335r = 0;
                    } else if (motionEvent.getAction() == 2 && c0058g.f1334q == 2) {
                        c0058g.f();
                        int i2 = c0058g.f1335r;
                        int i3 = c0058g.f1318a;
                        if (i2 == 1) {
                            float x2 = motionEvent.getX();
                            int[] iArr = c0058g.t;
                            iArr[0] = i3;
                            int i4 = c0058g.f1329l - i3;
                            iArr[1] = i4;
                            float max = Math.max(i3, Math.min(i4, x2));
                            if (Math.abs(0 - max) >= 2.0f) {
                                float f2 = c0058g.f1328k;
                                int computeHorizontalScrollRange = c0058g.f1331n.computeHorizontalScrollRange();
                                c0058g.f1331n.computeHorizontalScrollOffset();
                                int d2 = C0058g.d(f2, max, iArr, computeHorizontalScrollRange, 0, c0058g.f1329l);
                                if (d2 != 0) {
                                    c0058g.f1331n.scrollBy(d2, 0);
                                }
                                c0058g.f1328k = max;
                            }
                        }
                        if (c0058g.f1335r == 2) {
                            float y2 = motionEvent.getY();
                            int[] iArr2 = c0058g.f1336s;
                            iArr2[0] = i3;
                            int i5 = c0058g.f1330m - i3;
                            iArr2[1] = i5;
                            float max2 = Math.max(i3, Math.min(i5, y2));
                            if (Math.abs(0 - max2) >= 2.0f) {
                                float f3 = c0058g.f1327j;
                                int computeVerticalScrollRange = c0058g.f1331n.computeVerticalScrollRange();
                                c0058g.f1331n.computeVerticalScrollOffset();
                                int d3 = C0058g.d(f3, max2, iArr2, computeVerticalScrollRange, 0, c0058g.f1330m);
                                if (d3 != 0) {
                                    c0058g.f1331n.scrollBy(0, d3);
                                }
                                c0058g.f1327j = max2;
                            }
                        }
                    }
                }
                if (action == 3 || action == 1) {
                    this.f2568l = null;
                }
                p();
                setScrollState(0);
                return true;
            }
            this.f2568l = null;
        }
        if (action != 0) {
            ArrayList arrayList = this.f2567k;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0058g c0058g2 = (C0058g) arrayList.get(i6);
                if (c0058g2.c(motionEvent)) {
                    this.f2568l = c0058g2;
                    p();
                    setScrollState(0);
                    return true;
                }
            }
        }
        w wVar = this.f2563i;
        if (wVar == null) {
            return false;
        }
        boolean b3 = wVar.b();
        boolean c2 = this.f2563i.c();
        if (this.G == null) {
            this.G = VelocityTracker.obtain();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f2566j0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            this.f2537F = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.f2540J = x3;
            this.f2538H = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.f2541K = y3;
            this.f2539I = y3;
            int i7 = b3;
            if (c2) {
                i7 = (b3 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i7, 0);
        } else {
            if (actionMasked == 1) {
                this.G.addMovement(obtain);
                VelocityTracker velocityTracker = this.G;
                int i8 = this.f2544S;
                velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, i8);
                float f4 = b3 != 0 ? -this.G.getXVelocity(this.f2537F) : 0.0f;
                float f5 = c2 ? -this.G.getYVelocity(this.f2537F) : 0.0f;
                if (f4 != 0.0f || f5 != 0.0f) {
                    int i9 = (int) f4;
                    int i10 = (int) f5;
                    w wVar2 = this.f2563i;
                    if (wVar2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f2574q) {
                        boolean b4 = wVar2.b();
                        boolean c3 = this.f2563i.c();
                        int i11 = this.f2543R;
                        if (b4 == 0 || Math.abs(i9) < i11) {
                            i9 = 0;
                        }
                        if (!c3 || Math.abs(i10) < i11) {
                            i10 = 0;
                        }
                        if (i9 != 0 || i10 != 0) {
                            float f6 = i9;
                            float f7 = i10;
                            if (!dispatchNestedPreFling(f6, f7)) {
                                boolean z3 = b4 != 0 || c3;
                                dispatchNestedFling(f6, f7, z3);
                                int i12 = b4;
                                if (z3) {
                                    if (c3) {
                                        i12 = (b4 ? 1 : 0) | 2;
                                    }
                                    getScrollingChildHelper().g(i12, 1);
                                    int i13 = -i8;
                                    int max3 = Math.max(i13, Math.min(i9, i8));
                                    int max4 = Math.max(i13, Math.min(i10, i8));
                                    H h2 = this.f2548W;
                                    h2.f1271g.setScrollState(2);
                                    h2.f1266b = 0;
                                    h2.f1265a = 0;
                                    h2.f1267c.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                    h2.a();
                                    p();
                                    obtain.recycle();
                                    return true;
                                }
                            }
                        }
                    }
                }
                setScrollState(0);
                p();
                obtain.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f2537F);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2537F + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i14 = this.f2540J - x4;
                int i15 = this.f2541K - y4;
                boolean f8 = f(i14, i15, this.f2564i0, this.f2562h0, 0);
                int[] iArr4 = this.f2562h0;
                if (f8) {
                    int[] iArr5 = this.f2564i0;
                    i14 -= iArr5[0];
                    i15 -= iArr5[1];
                    obtain.offsetLocation(iArr4[0], iArr4[1]);
                    iArr3[0] = iArr3[0] + iArr4[0];
                    iArr3[1] = iArr3[1] + iArr4[1];
                }
                if (this.f2536E != 1) {
                    if (b3 != 0) {
                        int abs = Math.abs(i14);
                        int i16 = this.f2542L;
                        if (abs > i16) {
                            i14 = i14 > 0 ? i14 - i16 : i14 + i16;
                            z2 = true;
                            if (c2) {
                                int abs2 = Math.abs(i15);
                                int i17 = this.f2542L;
                                if (abs2 > i17) {
                                    i15 = i15 > 0 ? i15 - i17 : i15 + i17;
                                    z2 = true;
                                }
                            }
                            if (z2) {
                                setScrollState(1);
                            }
                        }
                    }
                    z2 = false;
                    if (c2) {
                    }
                    if (z2) {
                    }
                }
                int i18 = i15;
                if (this.f2536E == 1) {
                    this.f2540J = x4 - iArr4[0];
                    this.f2541K = y4 - iArr4[1];
                    q(b3 != 0 ? i14 : 0, c2 ? i18 : 0, obtain);
                    RunnableC0062k runnableC0062k = this.f2550a0;
                    if (runnableC0062k != null && (i14 != 0 || i18 != 0)) {
                        runnableC0062k.a(this, i14, i18);
                    }
                }
            } else if (actionMasked == 3) {
                p();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f2537F = motionEvent.getPointerId(actionIndex);
                int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f2540J = x5;
                this.f2538H = x5;
                int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f2541K = y5;
                this.f2539I = y5;
            } else if (actionMasked == 6) {
                n(motionEvent);
            }
        }
        this.G.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    public final void p() {
        VelocityTracker velocityTracker = this.G;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        s(0);
        EdgeEffect edgeEffect = this.f2582z;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f2582z.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2532A;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f2532A.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2533B;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f2533B.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2534C;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f2534C.isFinished();
        }
        if (z2) {
            Field field = x.f8596a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(int i2, int i3, MotionEvent motionEvent) {
        d();
        if (!this.f2565j.isEmpty()) {
            invalidate();
        }
        int[] iArr = this.f2562h0;
        boolean z2 = false;
        boolean z3 = true;
        if (g(iArr, 0)) {
            int i4 = this.f2540J;
            int i5 = iArr[0];
            this.f2540J = i4 - i5;
            int i6 = this.f2541K;
            int i7 = iArr[1];
            this.f2541K = i6 - i7;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i5, i7);
            }
            int[] iArr2 = this.f2566j0;
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x2 = motionEvent.getX();
                float f2 = 0;
                float y2 = motionEvent.getY();
                if (f2 < 0.0f) {
                    if (this.f2582z == null) {
                        this.f2581y.getClass();
                        EdgeEffect edgeEffect = new EdgeEffect(getContext());
                        this.f2582z = edgeEffect;
                        if (this.f2558f) {
                            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    C.d.a(this.f2582z, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else {
                    if (f2 > 0.0f) {
                        if (this.f2533B == null) {
                            this.f2581y.getClass();
                            EdgeEffect edgeEffect2 = new EdgeEffect(getContext());
                            this.f2533B = edgeEffect2;
                            if (this.f2558f) {
                                edgeEffect2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                            } else {
                                edgeEffect2.setSize(getMeasuredHeight(), getMeasuredWidth());
                            }
                        }
                        C.d.a(this.f2533B, f2 / getWidth(), y2 / getHeight());
                    }
                    if (f2 >= 0.0f) {
                        if (this.f2532A == null) {
                            this.f2581y.getClass();
                            EdgeEffect edgeEffect3 = new EdgeEffect(getContext());
                            this.f2532A = edgeEffect3;
                            if (this.f2558f) {
                                edgeEffect3.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect3.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        C.d.a(this.f2532A, (-f2) / getHeight(), x2 / getWidth());
                    } else if (f2 > 0.0f) {
                        if (this.f2534C == null) {
                            this.f2581y.getClass();
                            EdgeEffect edgeEffect4 = new EdgeEffect(getContext());
                            this.f2534C = edgeEffect4;
                            if (this.f2558f) {
                                edgeEffect4.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect4.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        C.d.a(this.f2534C, f2 / getHeight(), 1.0f - (x2 / getWidth()));
                    } else {
                        z3 = z2;
                    }
                    if (!z3 || f2 != 0.0f || f2 != 0.0f) {
                        Field field = x.f8596a;
                        postInvalidateOnAnimation();
                    }
                }
                z2 = true;
                if (f2 >= 0.0f) {
                }
                if (!z3) {
                }
                Field field2 = x.f8596a;
                postInvalidateOnAnimation();
            }
            c(i2, i3);
        }
        if (awakenScrollBars()) {
            return;
        }
        invalidate();
    }

    public final void r(int i2, int i3) {
        int i4;
        w wVar = this.f2563i;
        if (wVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2574q) {
            return;
        }
        int i5 = !wVar.b() ? 0 : i2;
        int i6 = !this.f2563i.c() ? 0 : i3;
        if (i5 == 0 && i6 == 0) {
            return;
        }
        H h2 = this.f2548W;
        h2.getClass();
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        boolean z2 = abs > abs2;
        int sqrt = (int) Math.sqrt(0);
        int sqrt2 = (int) Math.sqrt((i6 * i6) + (i5 * i5));
        RecyclerView recyclerView = h2.f1271g;
        int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
        int i7 = width / 2;
        float f2 = width;
        float f3 = i7;
        float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
        if (sqrt > 0) {
            i4 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
        } else {
            if (!z2) {
                abs = abs2;
            }
            i4 = (int) (((abs / f2) + 1.0f) * 300.0f);
        }
        int min = Math.min(i4, 2000);
        q qVar = f2531p0;
        if (h2.f1268d != qVar) {
            h2.f1268d = qVar;
            h2.f1267c = new OverScroller(recyclerView.getContext(), qVar);
        }
        recyclerView.setScrollState(2);
        h2.f1266b = 0;
        h2.f1265a = 0;
        h2.f1267c.startScroll(0, 0, i5, i6, min);
        h2.a();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        j(view);
        view.clearAnimation();
        j(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f2563i.getClass();
        if (this.f2579w <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f2563i.G(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f2567k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0058g) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2573p != 0 || this.f2574q) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i2) {
        getScrollingChildHelper().h(i2);
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        w wVar = this.f2563i;
        if (wVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2574q) {
            return;
        }
        boolean b2 = wVar.b();
        boolean c2 = this.f2563i.c();
        if (b2 || c2) {
            if (!b2) {
                i2 = 0;
            }
            if (!c2) {
                i3 = 0;
            }
            q(i2, i3, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.f2579w <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f2576s |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(J j2) {
        this.f0 = j2;
        x.a(this, j2);
    }

    public void setAdapter(P.r rVar) {
        setLayoutFrozen(false);
        u uVar = this.f2535D;
        if (uVar != null) {
            uVar.a();
        }
        w wVar = this.f2563i;
        C c2 = this.f2549a;
        if (wVar != null) {
            wVar.E();
            this.f2563i.F(c2);
        }
        c2.f1253a.clear();
        ArrayList arrayList = c2.f1254b;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            C1.a.n(arrayList.get(size));
            throw null;
        }
        arrayList.clear();
        C0060i c0060i = c2.f1258f.f2552b0;
        c0060i.getClass();
        c0060i.f1342c = 0;
        b bVar = this.f2553c;
        bVar.L((ArrayList) bVar.f722c);
        bVar.L((ArrayList) bVar.f723d);
        c2.f1253a.clear();
        ArrayList arrayList2 = c2.f1254b;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            C1.a.n(arrayList2.get(size2));
            throw null;
        }
        arrayList2.clear();
        RecyclerView recyclerView = c2.f1258f;
        C0060i c0060i2 = recyclerView.f2552b0;
        c0060i2.getClass();
        c0060i2.f1342c = 0;
        if (c2.f1257e == null) {
            P.B b2 = new P.B();
            b2.f1251a = new SparseArray();
            b2.f1252b = 0;
            c2.f1257e = b2;
        }
        P.B b3 = c2.f1257e;
        if (b3.f1252b == 0) {
            SparseArray sparseArray = b3.f1251a;
            if (sparseArray.size() > 0) {
                ((A) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f2554c0.f1261b = true;
        this.f2578v = this.f2578v;
        this.f2577u = true;
        int D2 = this.f2555d.D();
        for (int i2 = 0; i2 < D2; i2++) {
            j(this.f2555d.C(i2));
        }
        m();
        int size3 = arrayList2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            if (arrayList2.get(i3) != null) {
                throw new ClassCastException();
            }
        }
        int size4 = arrayList2.size() - 1;
        if (size4 >= 0) {
            C1.a.n(arrayList2.get(size4));
            throw null;
        }
        arrayList2.clear();
        C0060i c0060i3 = recyclerView.f2552b0;
        c0060i3.getClass();
        c0060i3.f1342c = 0;
        requestLayout();
    }

    public void setChildDrawingOrderCallback(s sVar) {
        if (sVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f2558f) {
            this.f2534C = null;
            this.f2532A = null;
            this.f2533B = null;
            this.f2582z = null;
        }
        this.f2558f = z2;
        super.setClipToPadding(z2);
        if (this.f2572o) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(t tVar) {
        tVar.getClass();
        this.f2581y = tVar;
        this.f2534C = null;
        this.f2532A = null;
        this.f2533B = null;
        this.f2582z = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f2571n = z2;
    }

    public void setItemAnimator(u uVar) {
        u uVar2 = this.f2535D;
        if (uVar2 != null) {
            uVar2.a();
            this.f2535D.f1366a = null;
        }
        this.f2535D = uVar;
        if (uVar != null) {
            uVar.f1366a = this.e0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        C c2 = this.f2549a;
        c2.f1255c = i2;
        c2.b();
    }

    public void setLayoutFrozen(boolean z2) {
        if (z2 != this.f2574q) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z2) {
                this.f2574q = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2574q = true;
            this.f2575r = true;
            setScrollState(0);
            H h2 = this.f2548W;
            h2.f1271g.removeCallbacks(h2);
            h2.f1267c.abortAnimation();
        }
    }

    public void setLayoutManager(w wVar) {
        C.j jVar;
        if (wVar == this.f2563i) {
            return;
        }
        setScrollState(0);
        H h2 = this.f2548W;
        h2.f1271g.removeCallbacks(h2);
        h2.f1267c.abortAnimation();
        w wVar2 = this.f2563i;
        C c2 = this.f2549a;
        if (wVar2 != null) {
            u uVar = this.f2535D;
            if (uVar != null) {
                uVar.a();
            }
            this.f2563i.E();
            this.f2563i.F(c2);
            c2.f1253a.clear();
            ArrayList arrayList = c2.f1254b;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                C1.a.n(arrayList.get(size));
                throw null;
            }
            arrayList.clear();
            C0060i c0060i = c2.f1258f.f2552b0;
            c0060i.getClass();
            c0060i.f1342c = 0;
            if (this.f2570m) {
                w wVar3 = this.f2563i;
                wVar3.f1376e = false;
                wVar3.z(this);
            }
            this.f2563i.I(null);
            this.f2563i = null;
        } else {
            c2.f1253a.clear();
            ArrayList arrayList2 = c2.f1254b;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                C1.a.n(arrayList2.get(size2));
                throw null;
            }
            arrayList2.clear();
            C0060i c0060i2 = c2.f1258f.f2552b0;
            c0060i2.getClass();
            c0060i2.f1342c = 0;
        }
        b bVar = this.f2555d;
        ((C0053b) bVar.f722c).d();
        ArrayList arrayList3 = (ArrayList) bVar.f723d;
        int size3 = arrayList3.size() - 1;
        while (true) {
            jVar = (C.j) bVar.f721b;
            if (size3 < 0) {
                break;
            }
            j((View) arrayList3.get(size3));
            arrayList3.remove(size3);
            size3--;
        }
        RecyclerView recyclerView = (RecyclerView) jVar.f124b;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f2563i = wVar;
        if (wVar != null) {
            if (wVar.f1373b != null) {
                throw new IllegalArgumentException("LayoutManager " + wVar + " is already attached to a RecyclerView:" + wVar.f1373b.h());
            }
            wVar.I(this);
            if (this.f2570m) {
                this.f2563i.f1376e = true;
            }
        }
        c2.b();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C1074g scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f8586d) {
            Field field = x.f8596a;
            AbstractC1083p.z(scrollingChildHelper.f8585c);
        }
        scrollingChildHelper.f8586d = z2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f2547V = z2;
    }

    public void setRecycledViewPool(P.B b2) {
        C c2 = this.f2549a;
        if (c2.f1257e != null) {
            r1.f1252b--;
        }
        c2.f1257e = b2;
        if (b2 != null) {
            c2.f1258f.getAdapter();
        }
    }

    public void setScrollState(int i2) {
        if (i2 == this.f2536E) {
            return;
        }
        this.f2536E = i2;
        if (i2 != 2) {
            H h2 = this.f2548W;
            h2.f1271g.removeCallbacks(h2);
            h2.f1267c.abortAnimation();
        }
        w wVar = this.f2563i;
        if (wVar != null) {
            wVar.D(i2);
        }
        ArrayList arrayList = this.f2556d0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((z) this.f2556d0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.f2542L = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.f2542L = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(G g2) {
        this.f2549a.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        w wVar = this.f2563i;
        if (wVar != null) {
            return wVar.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public void setOnFlingListener(P.y yVar) {
    }

    @Deprecated
    public void setOnScrollListener(z zVar) {
    }

    public void setRecyclerListener(D d2) {
    }
}
