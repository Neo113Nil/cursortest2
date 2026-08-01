package androidx.recyclerview.widget;

import D1.h;
import E0.b;
import F.i;
import O.C0035k;
import O.C0038n;
import R.j;
import S.a;
import U.d;
import V.g;
import a.AbstractC0078a;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
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
import j0.AbstractC0176a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k0.B;
import k0.C;
import k0.C0187a;
import k0.C0188b;
import k0.C0190d;
import k0.C0197k;
import k0.C0200n;
import k0.C0201o;
import k0.C0209x;
import k0.C0211z;
import k0.E;
import k0.F;
import k0.G;
import k0.H;
import k0.K;
import k0.L;
import k0.M;
import k0.N;
import k0.O;
import k0.P;
import k0.Q;
import k0.RunnableC0186A;
import k0.RunnableC0203q;
import k0.S;
import k0.T;
import k0.U;
import k0.W;
import k0.X;
import k0.Y;
import k0.Z;
import k0.a0;
import k0.b0;
import k0.d0;
import k0.l0;
import r.C0340h;
import r.C0342j;
import u.AbstractC0357e;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: A0, reason: collision with root package name */
    public static boolean f2109A0 = false;

    /* renamed from: B0, reason: collision with root package name */
    public static final int[] f2110B0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: C0, reason: collision with root package name */
    public static final float f2111C0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: D0, reason: collision with root package name */
    public static final boolean f2112D0 = true;

    /* renamed from: E0, reason: collision with root package name */
    public static final boolean f2113E0 = true;

    /* renamed from: F0, reason: collision with root package name */
    public static final boolean f2114F0 = true;

    /* renamed from: G0, reason: collision with root package name */
    public static final Class[] f2115G0;
    public static final d H0;

    /* renamed from: I0, reason: collision with root package name */
    public static final Y f2116I0;
    public static boolean z0 = false;

    /* renamed from: A, reason: collision with root package name */
    public boolean f2117A;

    /* renamed from: B, reason: collision with root package name */
    public final AccessibilityManager f2118B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2119C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2120D;

    /* renamed from: E, reason: collision with root package name */
    public int f2121E;

    /* renamed from: F, reason: collision with root package name */
    public int f2122F;

    /* renamed from: G, reason: collision with root package name */
    public F f2123G;

    /* renamed from: H, reason: collision with root package name */
    public EdgeEffect f2124H;

    /* renamed from: I, reason: collision with root package name */
    public EdgeEffect f2125I;
    public EdgeEffect J;

    /* renamed from: K, reason: collision with root package name */
    public EdgeEffect f2126K;

    /* renamed from: L, reason: collision with root package name */
    public G f2127L;

    /* renamed from: M, reason: collision with root package name */
    public int f2128M;

    /* renamed from: N, reason: collision with root package name */
    public int f2129N;

    /* renamed from: O, reason: collision with root package name */
    public VelocityTracker f2130O;

    /* renamed from: P, reason: collision with root package name */
    public int f2131P;

    /* renamed from: Q, reason: collision with root package name */
    public int f2132Q;

    /* renamed from: R, reason: collision with root package name */
    public int f2133R;

    /* renamed from: S, reason: collision with root package name */
    public int f2134S;

    /* renamed from: T, reason: collision with root package name */
    public int f2135T;

    /* renamed from: U, reason: collision with root package name */
    public M f2136U;

    /* renamed from: V, reason: collision with root package name */
    public final int f2137V;

    /* renamed from: W, reason: collision with root package name */
    public final int f2138W;

    /* renamed from: a, reason: collision with root package name */
    public final float f2139a;

    /* renamed from: a0, reason: collision with root package name */
    public final float f2140a0;

    /* renamed from: b, reason: collision with root package name */
    public final T f2141b;

    /* renamed from: b0, reason: collision with root package name */
    public final float f2142b0;

    /* renamed from: c, reason: collision with root package name */
    public final Q f2143c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2144c0;

    /* renamed from: d, reason: collision with root package name */
    public U f2145d;

    /* renamed from: d0, reason: collision with root package name */
    public final a0 f2146d0;
    public final C0188b e;

    /* renamed from: e0, reason: collision with root package name */
    public RunnableC0203q f2147e0;

    /* renamed from: f, reason: collision with root package name */
    public final C0190d f2148f;

    /* renamed from: f0, reason: collision with root package name */
    public final C0201o f2149f0;

    /* renamed from: g, reason: collision with root package name */
    public final i f2150g;

    /* renamed from: g0, reason: collision with root package name */
    public final X f2151g0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2152h;

    /* renamed from: h0, reason: collision with root package name */
    public N f2153h0;
    public final RunnableC0186A i;

    /* renamed from: i0, reason: collision with root package name */
    public ArrayList f2154i0;
    public final Rect j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f2155j0;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f2156k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f2157k0;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f2158l;

    /* renamed from: l0, reason: collision with root package name */
    public final B f2159l0;

    /* renamed from: m, reason: collision with root package name */
    public C f2160m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f2161m0;

    /* renamed from: n, reason: collision with root package name */
    public K f2162n;

    /* renamed from: n0, reason: collision with root package name */
    public d0 f2163n0;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f2164o;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f2165o0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f2166p;

    /* renamed from: p0, reason: collision with root package name */
    public C0035k f2167p0;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f2168q;

    /* renamed from: q0, reason: collision with root package name */
    public final int[] f2169q0;

    /* renamed from: r, reason: collision with root package name */
    public C0200n f2170r;

    /* renamed from: r0, reason: collision with root package name */
    public final int[] f2171r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2172s;
    public final int[] s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2173t;

    /* renamed from: t0, reason: collision with root package name */
    public final ArrayList f2174t0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2175u;

    /* renamed from: u0, reason: collision with root package name */
    public final RunnableC0186A f2176u0;

    /* renamed from: v, reason: collision with root package name */
    public int f2177v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f2178v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2179w;

    /* renamed from: w0, reason: collision with root package name */
    public int f2180w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2181x;

    /* renamed from: x0, reason: collision with root package name */
    public int f2182x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2183y;

    /* renamed from: y0, reason: collision with root package name */
    public final B f2184y0;

    /* renamed from: z, reason: collision with root package name */
    public int f2185z;

    static {
        Class cls = Integer.TYPE;
        f2115G0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        H0 = new d(1);
        f2116I0 = new Y();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.recyclerViewStyle);
    }

    public static RecyclerView G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView G2 = G(viewGroup.getChildAt(i));
            if (G2 != null) {
                return G2;
            }
        }
        return null;
    }

    public static b0 L(View view) {
        if (view == null) {
            return null;
        }
        return ((L) view.getLayoutParams()).f3396a;
    }

    private C0035k getScrollingChildHelper() {
        if (this.f2167p0 == null) {
            this.f2167p0 = new C0035k(this);
        }
        return this.f2167p0;
    }

    public static void l(b0 b0Var) {
        WeakReference weakReference = b0Var.f3450b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == b0Var.f3449a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            b0Var.f3450b = null;
        }
    }

    public static int o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && AbstractC0078a.D(edgeEffect) != f2111C0) {
            int round = Math.round(AbstractC0078a.T(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || AbstractC0078a.D(edgeEffect2) == f2111C0) {
            return i;
        }
        float f2 = i2;
        int round2 = Math.round(AbstractC0078a.T(edgeEffect2, (i * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    public static void setDebugAssertionsEnabled(boolean z2) {
        z0 = z2;
    }

    public static void setVerboseLoggingEnabled(boolean z2) {
        f2109A0 = z2;
    }

    public final void A() {
        if (this.f2125I != null) {
            return;
        }
        ((Y) this.f2123G).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2125I = edgeEffect;
        if (this.f2152h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.f2160m + ", layout:" + this.f2162n + ", context:" + getContext();
    }

    public final void C(X x2) {
        if (getScrollState() != 2) {
            x2.getClass();
            return;
        }
        OverScroller overScroller = this.f2146d0.f3439c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        x2.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View D(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f2168q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0200n c0200n = (C0200n) arrayList.get(i);
            int i2 = c0200n.f3568v;
            if (i2 == 1) {
                boolean d2 = c0200n.d(motionEvent.getX(), motionEvent.getY());
                boolean c2 = c0200n.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d2 || c2)) {
                    if (c2) {
                        c0200n.f3569w = 1;
                        c0200n.f3562p = (int) motionEvent.getX();
                    } else if (d2) {
                        c0200n.f3569w = 2;
                        c0200n.f3559m = (int) motionEvent.getY();
                    }
                    c0200n.f(2);
                    if (action == 3) {
                        this.f2170r = c0200n;
                        return true;
                    }
                }
            } else {
                if (i2 != 2) {
                    continue;
                }
                if (action == 3) {
                }
            }
        }
        return false;
    }

    public final void F(int[] iArr) {
        int e = this.f2148f.e();
        if (e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < e; i3++) {
            b0 L2 = L(this.f2148f.d(i3));
            if (!L2.q()) {
                int c2 = L2.c();
                if (c2 < i) {
                    i = c2;
                }
                if (c2 > i2) {
                    i2 = c2;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final b0 H(int i) {
        b0 b0Var = null;
        if (this.f2119C) {
            return null;
        }
        int h2 = this.f2148f.h();
        for (int i2 = 0; i2 < h2; i2++) {
            b0 L2 = L(this.f2148f.g(i2));
            if (L2 != null && !L2.j() && I(L2) == i) {
                if (!this.f2148f.f3471c.contains(L2.f3449a)) {
                    return L2;
                }
                b0Var = L2;
            }
        }
        return b0Var;
    }

    public final int I(b0 b0Var) {
        if (b0Var.e(524) || !b0Var.g()) {
            return -1;
        }
        C0188b c0188b = this.e;
        int i = b0Var.f3451c;
        ArrayList arrayList = (ArrayList) c0188b.f3445c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0187a c0187a = (C0187a) arrayList.get(i2);
            int i3 = c0187a.f3433a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c0187a.f3434b;
                    if (i4 <= i) {
                        int i5 = c0187a.f3436d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c0187a.f3434b;
                    if (i6 == i) {
                        i = c0187a.f3436d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c0187a.f3436d <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0187a.f3434b <= i) {
                i += c0187a.f3436d;
            }
        }
        return i;
    }

    public final long J(b0 b0Var) {
        return this.f2160m.f3371b ? b0Var.e : b0Var.f3451c;
    }

    public final b0 K(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return L(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect M(View view) {
        L l2 = (L) view.getLayoutParams();
        boolean z2 = l2.f3398c;
        Rect rect = l2.f3397b;
        if (!z2) {
            return rect;
        }
        if (this.f2151g0.f3427g && (l2.f3396a.m() || l2.f3396a.h())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f2166p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.j;
            rect2.set(0, 0, 0, 0);
            ((H) arrayList.get(i)).getClass();
            ((L) view.getLayoutParams()).f3396a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        l2.f3398c = false;
        return rect;
    }

    public final boolean N() {
        return !this.f2175u || this.f2119C || this.e.j();
    }

    public final boolean O() {
        return this.f2121E > 0;
    }

    public final void P(int i) {
        if (this.f2162n == null) {
            return;
        }
        setScrollState(2);
        this.f2162n.r0(i);
        awakenScrollBars();
    }

    public final void Q() {
        int h2 = this.f2148f.h();
        for (int i = 0; i < h2; i++) {
            ((L) this.f2148f.g(i).getLayoutParams()).f3398c = true;
        }
        ArrayList arrayList = this.f2143c.f3409c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            L l2 = (L) ((b0) arrayList.get(i2)).f3449a.getLayoutParams();
            if (l2 != null) {
                l2.f3398c = true;
            }
        }
    }

    public final void R(int i, int i2, boolean z2) {
        int i3 = i + i2;
        int h2 = this.f2148f.h();
        for (int i4 = 0; i4 < h2; i4++) {
            b0 L2 = L(this.f2148f.g(i4));
            if (L2 != null && !L2.q()) {
                int i5 = L2.f3451c;
                X x2 = this.f2151g0;
                if (i5 >= i3) {
                    if (f2109A0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + L2 + " now at position " + (L2.f3451c - i2));
                    }
                    L2.n(-i2, z2);
                    x2.f3426f = true;
                } else if (i5 >= i) {
                    if (f2109A0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + L2 + " now REMOVED");
                    }
                    L2.a(8);
                    L2.n(-i2, z2);
                    L2.f3451c = i - 1;
                    x2.f3426f = true;
                }
            }
        }
        Q q2 = this.f2143c;
        ArrayList arrayList = q2.f3409c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b0 b0Var = (b0) arrayList.get(size);
            if (b0Var != null) {
                int i6 = b0Var.f3451c;
                if (i6 >= i3) {
                    if (f2109A0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + b0Var + " now at position " + (b0Var.f3451c - i2));
                    }
                    b0Var.n(-i2, z2);
                } else if (i6 >= i) {
                    b0Var.a(8);
                    q2.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void S() {
        this.f2121E++;
    }

    public final void T(boolean z2) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f2121E - 1;
        this.f2121E = i2;
        if (i2 < 1) {
            if (z0 && i2 < 0) {
                throw new IllegalStateException(h.d(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f2121E = 0;
            if (z2) {
                int i3 = this.f2185z;
                this.f2185z = 0;
                if (i3 != 0 && (accessibilityManager = this.f2118B) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f2174t0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    b0 b0Var = (b0) arrayList.get(size);
                    if (b0Var.f3449a.getParent() == this && !b0Var.q() && (i = b0Var.f3462q) != -1) {
                        WeakHashMap weakHashMap = O.K.f747a;
                        b0Var.f3449a.setImportantForAccessibility(i);
                        b0Var.f3462q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void U(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2129N) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2129N = motionEvent.getPointerId(i);
            int x2 = (int) (motionEvent.getX(i) + 0.5f);
            this.f2133R = x2;
            this.f2131P = x2;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.f2134S = y2;
            this.f2132Q = y2;
        }
    }

    public final void V() {
        if (this.f2161m0 || !this.f2172s) {
            return;
        }
        WeakHashMap weakHashMap = O.K.f747a;
        postOnAnimation(this.f2176u0);
        this.f2161m0 = true;
    }

    public final void W() {
        boolean z2;
        boolean z3 = false;
        if (this.f2119C) {
            C0188b c0188b = this.e;
            c0188b.q((ArrayList) c0188b.f3445c);
            c0188b.q((ArrayList) c0188b.f3446d);
            c0188b.f3443a = 0;
            if (this.f2120D) {
                this.f2162n.a0();
            }
        }
        if (this.f2127L == null || !this.f2162n.D0()) {
            this.e.d();
        } else {
            this.e.p();
        }
        boolean z4 = this.f2155j0 || this.f2157k0;
        boolean z5 = this.f2175u && this.f2127L != null && ((z2 = this.f2119C) || z4 || this.f2162n.f3388f) && (!z2 || this.f2160m.f3371b);
        X x2 = this.f2151g0;
        x2.j = z5;
        if (z5 && z4 && !this.f2119C && this.f2127L != null && this.f2162n.D0()) {
            z3 = true;
        }
        x2.f3429k = z3;
    }

    public final void X(boolean z2) {
        this.f2120D = z2 | this.f2120D;
        this.f2119C = true;
        int h2 = this.f2148f.h();
        for (int i = 0; i < h2; i++) {
            b0 L2 = L(this.f2148f.g(i));
            if (L2 != null && !L2.q()) {
                L2.a(6);
            }
        }
        Q();
        Q q2 = this.f2143c;
        ArrayList arrayList = q2.f3409c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            b0 b0Var = (b0) arrayList.get(i2);
            if (b0Var != null) {
                b0Var.a(6);
                b0Var.a(1024);
            }
        }
        C c2 = q2.f3413h.f2160m;
        if (c2 == null || !c2.f3371b) {
            q2.f();
        }
    }

    public final void Y(b0 b0Var, C0038n c0038n) {
        b0Var.j &= -8193;
        boolean z2 = this.f2151g0.f3428h;
        i iVar = this.f2150g;
        if (z2 && b0Var.m() && !b0Var.j() && !b0Var.q()) {
            ((C0340h) iVar.f209c).d(J(b0Var), b0Var);
        }
        C0342j c0342j = (C0342j) iVar.f208b;
        l0 l0Var = (l0) c0342j.get(b0Var);
        if (l0Var == null) {
            l0Var = l0.a();
            c0342j.put(b0Var, l0Var);
        }
        l0Var.f3542b = c0038n;
        l0Var.f3541a |= 4;
    }

    public final int Z(int i, float f2) {
        float height = f2 / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.f2124H;
        float f3 = f2111C0;
        if (edgeEffect == null || AbstractC0078a.D(edgeEffect) == f2111C0) {
            EdgeEffect edgeEffect2 = this.J;
            if (edgeEffect2 != null && AbstractC0078a.D(edgeEffect2) != f2111C0) {
                if (canScrollHorizontally(1)) {
                    this.J.onRelease();
                } else {
                    float T2 = AbstractC0078a.T(this.J, width, height);
                    if (AbstractC0078a.D(this.J) == f2111C0) {
                        this.J.onRelease();
                    }
                    f3 = T2;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f2124H.onRelease();
            } else {
                float f4 = -AbstractC0078a.T(this.f2124H, -width, 1.0f - height);
                if (AbstractC0078a.D(this.f2124H) == f2111C0) {
                    this.f2124H.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getWidth());
    }

    public final int a0(int i, float f2) {
        float width = f2 / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.f2125I;
        float f3 = f2111C0;
        if (edgeEffect == null || AbstractC0078a.D(edgeEffect) == f2111C0) {
            EdgeEffect edgeEffect2 = this.f2126K;
            if (edgeEffect2 != null && AbstractC0078a.D(edgeEffect2) != f2111C0) {
                if (canScrollVertically(1)) {
                    this.f2126K.onRelease();
                } else {
                    float T2 = AbstractC0078a.T(this.f2126K, height, 1.0f - width);
                    if (AbstractC0078a.D(this.f2126K) == f2111C0) {
                        this.f2126K.onRelease();
                    }
                    f3 = T2;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f2125I.onRelease();
            } else {
                float f4 = -AbstractC0078a.T(this.f2125I, -height, width);
                if (AbstractC0078a.D(this.f2125I) == f2111C0) {
                    this.f2125I.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        K k2 = this.f2162n;
        if (k2 != null) {
            k2.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof L) {
            L l2 = (L) layoutParams;
            if (!l2.f3398c) {
                int i = rect.left;
                Rect rect2 = l2.f3397b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f2162n.o0(this, view, this.j, !this.f2175u, view2 == null);
    }

    public final void c0() {
        VelocityTracker velocityTracker = this.f2130O;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        k0(0);
        EdgeEffect edgeEffect = this.f2124H;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f2124H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2125I;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f2125I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2126K;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f2126K.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = O.K.f747a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof L) && this.f2162n.f((L) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        K k2 = this.f2162n;
        if (k2 != null && k2.d()) {
            return this.f2162n.j(this.f2151g0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        K k2 = this.f2162n;
        if (k2 != null && k2.d()) {
            return this.f2162n.k(this.f2151g0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        K k2 = this.f2162n;
        if (k2 != null && k2.d()) {
            return this.f2162n.l(this.f2151g0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        K k2 = this.f2162n;
        if (k2 != null && k2.e()) {
            return this.f2162n.m(this.f2151g0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        K k2 = this.f2162n;
        if (k2 != null && k2.e()) {
            return this.f2162n.n(this.f2151g0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        K k2 = this.f2162n;
        if (k2 != null && k2.e()) {
            return this.f2162n.o(this.f2151g0);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        p();
        C c2 = this.f2160m;
        int[] iArr = this.s0;
        if (c2 != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            e0(i, i2, iArr);
            int i8 = iArr[0];
            int i9 = iArr[1];
            i4 = i8;
            i5 = i9;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.f2166p.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        v(i4, i5, i6, i7, this.f2169q0, i3, iArr);
        int i10 = iArr[0];
        int i11 = i6 - i10;
        int i12 = iArr[1];
        int i13 = i7 - i12;
        boolean z3 = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.f2133R;
        int[] iArr2 = this.f2169q0;
        int i15 = iArr2[0];
        this.f2133R = i14 - i15;
        int i16 = this.f2134S;
        int i17 = iArr2[1];
        this.f2134S = i16 - i17;
        int[] iArr3 = this.f2171r0;
        iArr3[0] = iArr3[0] + i15;
        iArr3[1] = iArr3[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x2 = motionEvent.getX();
                float f2 = i11;
                float y2 = motionEvent.getY();
                float f3 = i13;
                if (f2 < f2111C0) {
                    y();
                    AbstractC0078a.T(this.f2124H, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else if (f2 > f2111C0) {
                    z();
                    AbstractC0078a.T(this.J, f2 / getWidth(), y2 / getHeight());
                } else {
                    z2 = false;
                    if (f3 >= f2111C0) {
                        A();
                        AbstractC0078a.T(this.f2125I, (-f3) / getHeight(), x2 / getWidth());
                    } else {
                        if (f3 > f2111C0) {
                            x();
                            AbstractC0078a.T(this.f2126K, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                        }
                        if (!z2 || f2 != f2111C0 || f3 != f2111C0) {
                            WeakHashMap weakHashMap = O.K.f747a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                    WeakHashMap weakHashMap2 = O.K.f747a;
                    postInvalidateOnAnimation();
                }
                z2 = true;
                if (f3 >= f2111C0) {
                }
                z2 = true;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = O.K.f747a;
                postInvalidateOnAnimation();
            }
            n(i, i2);
        }
        if (i4 != 0 || i5 != 0) {
            w(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z3 && i4 == 0 && i5 == 0) ? false : true;
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
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
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
        ArrayList arrayList = this.f2166p;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((H) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f2124H;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f2152h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, f2111C0);
            EdgeEffect edgeEffect2 = this.f2124H;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f2125I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2152h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2125I;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.J;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2152h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.J;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2126K;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2152h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f2126K;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f2127L == null || arrayList.size() <= 0 || !this.f2127L.f()) ? z2 : true) {
            WeakHashMap weakHashMap = O.K.f747a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0(int i, int i2, int[] iArr) {
        b0 b0Var;
        C0190d c0190d = this.f2148f;
        i0();
        S();
        int i3 = K.i.f387a;
        Trace.beginSection("RV Scroll");
        X x2 = this.f2151g0;
        C(x2);
        Q q2 = this.f2143c;
        int q02 = i != 0 ? this.f2162n.q0(i, q2, x2) : 0;
        int s0 = i2 != 0 ? this.f2162n.s0(i2, q2, x2) : 0;
        Trace.endSection();
        int e = c0190d.e();
        for (int i4 = 0; i4 < e; i4++) {
            View d2 = c0190d.d(i4);
            b0 K2 = K(d2);
            if (K2 != null && (b0Var = K2.i) != null) {
                int left = d2.getLeft();
                int top = d2.getTop();
                View view = b0Var.f3449a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        T(true);
        j0(false);
        if (iArr != null) {
            iArr[0] = q02;
            iArr[1] = s0;
        }
    }

    public final void f0(int i) {
        C0209x c0209x;
        if (this.f2181x) {
            return;
        }
        setScrollState(0);
        a0 a0Var = this.f2146d0;
        a0Var.f3442g.removeCallbacks(a0Var);
        a0Var.f3439c.abortAnimation();
        K k2 = this.f2162n;
        if (k2 != null && (c0209x = k2.e) != null) {
            c0209x.i();
        }
        K k3 = this.f2162n;
        if (k3 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            k3.r0(i);
            awakenScrollBars();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017d, code lost:
    
        if (r5 < 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0185, code lost:
    
        if ((r5 * r6) <= 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x018d, code lost:
    
        if ((r5 * r6) >= 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        if (r7 > 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0177, code lost:
    
        if (r5 > 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017a, code lost:
    
        if (r7 < 0) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View view2;
        int i2;
        char c2;
        boolean z2;
        this.f2162n.getClass();
        boolean z3 = true;
        boolean z4 = (this.f2160m == null || this.f2162n == null || O() || this.f2181x) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        X x2 = this.f2151g0;
        Q q2 = this.f2143c;
        if (z4 && (i == 2 || i == 1)) {
            if (this.f2162n.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z2 = true;
                    if (!z2 && this.f2162n.d()) {
                        z2 = focusFinder.findNextFocus(this, view, !((this.f2162n.C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z2) {
                        p();
                        if (D(view) == null) {
                            return null;
                        }
                        i0();
                        this.f2162n.U(view, i, q2, x2);
                        j0(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                }
            }
            z2 = false;
            if (!z2) {
                if (focusFinder.findNextFocus(this, view, !((this.f2162n.C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z2) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z4) {
                p();
                if (D(view) == null) {
                    return null;
                }
                i0();
                view2 = this.f2162n.U(view, i, q2, x2);
                j0(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            b0(view2, null);
            return view;
        }
        if (view2 != null && view2 != this && view2 != view) {
            if (D(view2) == null) {
                z3 = false;
            } else if (view != null && D(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.j;
                rect.set(0, 0, width, height);
                int width2 = view2.getWidth();
                int height2 = view2.getHeight();
                Rect rect2 = this.f2156k;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(view2, rect2);
                int i3 = this.f2162n.C() == 1 ? -1 : 1;
                int i4 = rect.left;
                int i5 = rect2.left;
                if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                    i2 = 1;
                } else {
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
                }
                int i8 = rect.top;
                int i9 = rect2.top;
                if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                    c2 = 1;
                } else {
                    int i10 = rect.bottom;
                    int i11 = rect2.bottom;
                    c2 = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (char) 65535 : (char) 0;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i != 66) {
                                    if (i != 130) {
                                        StringBuilder sb = new StringBuilder("Invalid direction: ");
                                        sb.append(i);
                                        throw new IllegalArgumentException(h.d(this, sb));
                                    }
                                }
                            }
                        }
                    } else if (c2 <= 0) {
                        if (c2 == 0) {
                        }
                    }
                } else if (c2 >= 0) {
                    if (c2 == 0) {
                    }
                }
            }
            return !z3 ? view2 : super.focusSearch(view, i);
        }
        z3 = false;
        if (!z3) {
        }
    }

    public final boolean g0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float D2 = AbstractC0078a.D(edgeEffect) * i2;
        float abs = Math.abs(-i) * 0.35f;
        float f2 = this.f2139a * 0.015f;
        double log = Math.log(abs / f2);
        double d2 = f2111C0;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * log) * ((double) f2))) < D2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        K k2 = this.f2162n;
        if (k2 != null) {
            return k2.r();
        }
        throw new IllegalStateException(h.d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        K k2 = this.f2162n;
        if (k2 != null) {
            return k2.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(h.d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C getAdapter() {
        return this.f2160m;
    }

    @Override // android.view.View
    public int getBaseline() {
        K k2 = this.f2162n;
        if (k2 == null) {
            return super.getBaseline();
        }
        k2.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2152h;
    }

    public d0 getCompatAccessibilityDelegate() {
        return this.f2163n0;
    }

    public F getEdgeEffectFactory() {
        return this.f2123G;
    }

    public G getItemAnimator() {
        return this.f2127L;
    }

    public int getItemDecorationCount() {
        return this.f2166p.size();
    }

    public K getLayoutManager() {
        return this.f2162n;
    }

    public int getMaxFlingVelocity() {
        return this.f2138W;
    }

    public int getMinFlingVelocity() {
        return this.f2137V;
    }

    public long getNanoTime() {
        if (f2114F0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public M getOnFlingListener() {
        return this.f2136U;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2144c0;
    }

    public P getRecycledViewPool() {
        return this.f2143c.c();
    }

    public int getScrollState() {
        return this.f2128M;
    }

    public final void h(b0 b0Var) {
        View view = b0Var.f3449a;
        boolean z2 = view.getParent() == this;
        this.f2143c.l(K(view));
        if (b0Var.l()) {
            this.f2148f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.f2148f.a(view, -1, true);
            return;
        }
        C0190d c0190d = this.f2148f;
        int indexOfChild = c0190d.f3469a.f3369a.indexOfChild(view);
        if (indexOfChild >= 0) {
            c0190d.f3470b.h(indexOfChild);
            c0190d.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0(int i, int i2, boolean z2) {
        K k2 = this.f2162n;
        if (k2 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2181x) {
            return;
        }
        if (!k2.d()) {
            i = 0;
        }
        if (!this.f2162n.e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z2) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().g(i3, 1);
        }
        this.f2146d0.c(i, i2, Integer.MIN_VALUE, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(H h2) {
        K k2 = this.f2162n;
        if (k2 != null) {
            k2.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f2166p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(h2);
        Q();
        requestLayout();
    }

    public final void i0() {
        int i = this.f2177v + 1;
        this.f2177v = i;
        if (i != 1 || this.f2181x) {
            return;
        }
        this.f2179w = false;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2172s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f2181x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f823d;
    }

    public final void j(N n2) {
        if (this.f2154i0 == null) {
            this.f2154i0 = new ArrayList();
        }
        this.f2154i0.add(n2);
    }

    public final void j0(boolean z2) {
        if (this.f2177v < 1) {
            if (z0) {
                throw new IllegalStateException(h.d(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f2177v = 1;
        }
        if (!z2 && !this.f2181x) {
            this.f2179w = false;
        }
        if (this.f2177v == 1) {
            if (z2 && this.f2179w && !this.f2181x && this.f2162n != null && this.f2160m != null) {
                r();
            }
            if (!this.f2181x) {
                this.f2179w = false;
            }
        }
        this.f2177v--;
    }

    public final void k(String str) {
        if (O()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(h.d(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f2122F > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(h.d(this, new StringBuilder(""))));
        }
    }

    public final void k0(int i) {
        getScrollingChildHelper().h(i);
    }

    public final void m() {
        int h2 = this.f2148f.h();
        for (int i = 0; i < h2; i++) {
            b0 L2 = L(this.f2148f.g(i));
            if (!L2.q()) {
                L2.f3452d = -1;
                L2.f3454g = -1;
            }
        }
        Q q2 = this.f2143c;
        ArrayList arrayList = q2.f3409c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            b0 b0Var = (b0) arrayList.get(i2);
            b0Var.f3452d = -1;
            b0Var.f3454g = -1;
        }
        ArrayList arrayList2 = q2.f3407a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            b0 b0Var2 = (b0) arrayList2.get(i3);
            b0Var2.f3452d = -1;
            b0Var2.f3454g = -1;
        }
        ArrayList arrayList3 = q2.f3408b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                b0 b0Var3 = (b0) q2.f3408b.get(i4);
                b0Var3.f3452d = -1;
                b0Var3.f3454g = -1;
            }
        }
    }

    public final void n(int i, int i2) {
        boolean z2;
        EdgeEffect edgeEffect = this.f2124H;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z2 = false;
        } else {
            this.f2124H.onRelease();
            z2 = this.f2124H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.J.onRelease();
            z2 |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2125I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f2125I.onRelease();
            z2 |= this.f2125I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2126K;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f2126K.onRelease();
            z2 |= this.f2126K.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = O.K.f747a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f2;
        super.onAttachedToWindow();
        this.f2121E = 0;
        this.f2172s = true;
        this.f2175u = this.f2175u && !isLayoutRequested();
        this.f2143c.d();
        K k2 = this.f2162n;
        if (k2 != null) {
            k2.f3389g = true;
            k2.S(this);
        }
        this.f2161m0 = false;
        if (f2114F0) {
            ThreadLocal threadLocal = RunnableC0203q.e;
            RunnableC0203q runnableC0203q = (RunnableC0203q) threadLocal.get();
            this.f2147e0 = runnableC0203q;
            if (runnableC0203q == null) {
                RunnableC0203q runnableC0203q2 = new RunnableC0203q();
                runnableC0203q2.f3582a = new ArrayList();
                runnableC0203q2.f3585d = new ArrayList();
                this.f2147e0 = runnableC0203q2;
                WeakHashMap weakHashMap = O.K.f747a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f2 = display.getRefreshRate();
                }
                f2 = 60.0f;
                RunnableC0203q runnableC0203q3 = this.f2147e0;
                runnableC0203q3.f3584c = (long) (1.0E9f / f2);
                threadLocal.set(runnableC0203q3);
            }
            RunnableC0203q runnableC0203q4 = this.f2147e0;
            runnableC0203q4.getClass();
            boolean z2 = z0;
            ArrayList arrayList = runnableC0203q4.f3582a;
            if (z2 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Q q2;
        RunnableC0203q runnableC0203q;
        C0209x c0209x;
        super.onDetachedFromWindow();
        G g2 = this.f2127L;
        if (g2 != null) {
            g2.e();
        }
        int i = 0;
        setScrollState(0);
        a0 a0Var = this.f2146d0;
        a0Var.f3442g.removeCallbacks(a0Var);
        a0Var.f3439c.abortAnimation();
        K k2 = this.f2162n;
        if (k2 != null && (c0209x = k2.e) != null) {
            c0209x.i();
        }
        this.f2172s = false;
        K k3 = this.f2162n;
        if (k3 != null) {
            k3.f3389g = false;
            k3.T(this);
        }
        this.f2174t0.clear();
        removeCallbacks(this.f2176u0);
        this.f2150g.getClass();
        while (l0.f3540d.a() != null) {
        }
        int i2 = 0;
        while (true) {
            q2 = this.f2143c;
            ArrayList arrayList = q2.f3409c;
            if (i2 >= arrayList.size()) {
                break;
            }
            j.k(((b0) arrayList.get(i2)).f3449a);
            i2++;
        }
        q2.e(q2.f3413h.f2160m, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            a aVar = (a) childAt.getTag(com.lumenpath.harispro.hrnavigator.R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new a();
                childAt.setTag(com.lumenpath.harispro.hrnavigator.R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList2 = aVar.f1055a;
            int E2 = u1.h.E(arrayList2);
            if (-1 < E2) {
                arrayList2.get(E2).getClass();
                throw new ClassCastException();
            }
            i = i3;
        }
        if (!f2114F0 || (runnableC0203q = this.f2147e0) == null) {
            return;
        }
        boolean remove = runnableC0203q.f3582a.remove(this);
        if (z0 && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f2147e0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2166p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((H) arrayList.get(i)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        K k2;
        if (this.f2162n != null && !this.f2181x && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f2162n.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f2162n.d()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == f2111C0 || f3 != f2111C0) {
                        int i = (int) (f3 * this.f2140a0);
                        int i2 = (int) (f2 * this.f2142b0);
                        k2 = this.f2162n;
                        if (k2 == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.f2181x) {
                            int[] iArr = this.s0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean d2 = k2.d();
                            boolean e = this.f2162n.e();
                            int i3 = e ? (d2 ? 1 : 0) | 2 : d2 ? 1 : 0;
                            float y2 = motionEvent.getY();
                            float x2 = motionEvent.getX();
                            int Z2 = i - Z(i, y2);
                            int a02 = i2 - a0(i2, x2);
                            getScrollingChildHelper().g(i3, 1);
                            if (u(d2 ? Z2 : 0, e ? a02 : 0, 1, this.s0, this.f2169q0)) {
                                Z2 -= iArr[0];
                                a02 -= iArr[1];
                            }
                            d0(d2 ? Z2 : 0, e ? a02 : 0, motionEvent, 1);
                            RunnableC0203q runnableC0203q = this.f2147e0;
                            if (runnableC0203q != null && (Z2 != 0 || a02 != 0)) {
                                runnableC0203q.a(this, Z2, a02);
                            }
                            k0(1);
                        }
                    }
                }
                f3 = 0.0f;
                if (f2 == f2111C0) {
                }
                int i4 = (int) (f3 * this.f2140a0);
                int i22 = (int) (f2 * this.f2142b0);
                k2 = this.f2162n;
                if (k2 == null) {
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f2162n.e()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == f2111C0) {
                        }
                        int i42 = (int) (f3 * this.f2140a0);
                        int i222 = (int) (f2 * this.f2142b0);
                        k2 = this.f2162n;
                        if (k2 == null) {
                        }
                    } else if (this.f2162n.d()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == f2111C0) {
                        }
                        int i422 = (int) (f3 * this.f2140a0);
                        int i2222 = (int) (f2 * this.f2142b0);
                        k2 = this.f2162n;
                        if (k2 == null) {
                        }
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == f2111C0) {
                }
                int i4222 = (int) (f3 * this.f2140a0);
                int i22222 = (int) (f2 * this.f2142b0);
                k2 = this.f2162n;
                if (k2 == null) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        if (this.f2181x) {
            return false;
        }
        this.f2170r = null;
        if (E(motionEvent)) {
            c0();
            setScrollState(0);
            return true;
        }
        K k2 = this.f2162n;
        if (k2 == null) {
            return false;
        }
        boolean d2 = k2.d();
        boolean e = this.f2162n.e();
        if (this.f2130O == null) {
            this.f2130O = VelocityTracker.obtain();
        }
        this.f2130O.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f2183y) {
                this.f2183y = false;
            }
            this.f2129N = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f2133R = x2;
            this.f2131P = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f2134S = y2;
            this.f2132Q = y2;
            EdgeEffect edgeEffect = this.f2124H;
            if (edgeEffect == null || AbstractC0078a.D(edgeEffect) == f2111C0 || canScrollHorizontally(-1)) {
                z2 = false;
            } else {
                AbstractC0078a.T(this.f2124H, f2111C0, 1.0f - (motionEvent.getY() / getHeight()));
                z2 = true;
            }
            EdgeEffect edgeEffect2 = this.J;
            boolean z4 = z2;
            if (edgeEffect2 != null) {
                z4 = z2;
                if (AbstractC0078a.D(edgeEffect2) != f2111C0) {
                    z4 = z2;
                    if (!canScrollHorizontally(1)) {
                        AbstractC0078a.T(this.J, f2111C0, motionEvent.getY() / getHeight());
                        z4 = true;
                    }
                }
            }
            EdgeEffect edgeEffect3 = this.f2125I;
            boolean z5 = z4;
            if (edgeEffect3 != null) {
                z5 = z4;
                if (AbstractC0078a.D(edgeEffect3) != f2111C0) {
                    z5 = z4;
                    if (!canScrollVertically(-1)) {
                        AbstractC0078a.T(this.f2125I, f2111C0, motionEvent.getX() / getWidth());
                        z5 = true;
                    }
                }
            }
            EdgeEffect edgeEffect4 = this.f2126K;
            boolean z6 = z5;
            if (edgeEffect4 != null) {
                z6 = z5;
                if (AbstractC0078a.D(edgeEffect4) != f2111C0) {
                    z6 = z5;
                    if (!canScrollVertically(1)) {
                        AbstractC0078a.T(this.f2126K, f2111C0, 1.0f - (motionEvent.getX() / getWidth()));
                        z6 = true;
                    }
                }
            }
            if (z6 || this.f2128M == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                k0(1);
            }
            int[] iArr = this.f2171r0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = d2;
            if (e) {
                i = (d2 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i, 0);
        } else if (actionMasked == 1) {
            this.f2130O.clear();
            k0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f2129N);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2129N + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f2128M != 1) {
                int i2 = x3 - this.f2131P;
                int i3 = y3 - this.f2132Q;
                if (d2 == 0 || Math.abs(i2) <= this.f2135T) {
                    z3 = false;
                } else {
                    this.f2133R = x3;
                    z3 = true;
                }
                if (e && Math.abs(i3) > this.f2135T) {
                    this.f2134S = y3;
                    z3 = true;
                }
                if (z3) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            c0();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f2129N = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2133R = x4;
            this.f2131P = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2134S = y4;
            this.f2132Q = y4;
        } else if (actionMasked == 6) {
            U(motionEvent);
        }
        return this.f2128M == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5 = K.i.f387a;
        Trace.beginSection("RV OnLayout");
        r();
        Trace.endSection();
        this.f2175u = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        K k2 = this.f2162n;
        if (k2 == null) {
            q(i, i2);
            return;
        }
        boolean L2 = k2.L();
        Q q2 = this.f2143c;
        boolean z2 = false;
        X x2 = this.f2151g0;
        if (L2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f2162n.g0(q2, x2, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.f2178v0 = z2;
            if (z2 || this.f2160m == null) {
                return;
            }
            if (x2.f3425d == 1) {
                s();
            }
            this.f2162n.u0(i, i2);
            x2.i = true;
            t();
            this.f2162n.w0(i, i2);
            if (this.f2162n.z0()) {
                this.f2162n.u0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                x2.i = true;
                t();
                this.f2162n.w0(i, i2);
            }
            this.f2180w0 = getMeasuredWidth();
            this.f2182x0 = getMeasuredHeight();
            return;
        }
        if (this.f2173t) {
            this.f2162n.g0(q2, x2, i, i2);
            return;
        }
        if (this.f2117A) {
            i0();
            S();
            W();
            T(true);
            if (x2.f3429k) {
                x2.f3427g = true;
            } else {
                this.e.d();
                x2.f3427g = false;
            }
            this.f2117A = false;
            j0(false);
        } else if (x2.f3429k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        C c2 = this.f2160m;
        if (c2 != null) {
            x2.e = c2.a();
        } else {
            x2.e = 0;
        }
        i0();
        this.f2162n.g0(q2, x2, i, i2);
        j0(false);
        x2.f3427g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (O()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof U)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        U u2 = (U) parcelable;
        this.f2145d = u2;
        super.onRestoreInstanceState(u2.f1147a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        U u2 = new U(super.onSaveInstanceState());
        U u3 = this.f2145d;
        if (u3 != null) {
            u2.f3415c = u3.f3415c;
        } else {
            K k2 = this.f2162n;
            if (k2 != null) {
                u2.f3415c = k2.i0();
            } else {
                u2.f3415c = null;
            }
        }
        return u2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f2126K = null;
        this.f2125I = null;
        this.J = null;
        this.f2124H = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x04d4, code lost:
    
        if (r2 < r4) goto L240;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x039d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0213  */
    /* JADX WARN: Type inference failed for: r5v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v28 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        RecyclerView recyclerView;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        int i;
        int i2;
        a0 a0Var;
        float f2;
        float f3;
        a0 a0Var2;
        MotionEvent motionEvent4;
        int minFlingVelocity;
        boolean z3;
        int H2;
        PointF a2;
        a0 a0Var3;
        int i3;
        RecyclerView recyclerView2;
        boolean z4;
        if (this.f2181x || this.f2183y) {
            return false;
        }
        C0200n c0200n = this.f2170r;
        if (c0200n == null) {
            z2 = motionEvent.getAction() == 0 ? false : E(motionEvent);
        } else {
            if (c0200n.f3568v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean d2 = c0200n.d(motionEvent.getX(), motionEvent.getY());
                    boolean c2 = c0200n.c(motionEvent.getX(), motionEvent.getY());
                    if (d2 || c2) {
                        if (c2) {
                            c0200n.f3569w = 1;
                            c0200n.f3562p = (int) motionEvent.getX();
                        } else if (d2) {
                            c0200n.f3569w = 2;
                            c0200n.f3559m = (int) motionEvent.getY();
                        }
                        c0200n.f(2);
                    }
                } else if (motionEvent.getAction() == 1 && c0200n.f3568v == 2) {
                    c0200n.f3559m = f2111C0;
                    c0200n.f3562p = f2111C0;
                    c0200n.f(1);
                    c0200n.f3569w = 0;
                } else if (motionEvent.getAction() == 2 && c0200n.f3568v == 2) {
                    c0200n.g();
                    int i4 = c0200n.f3569w;
                    int i5 = c0200n.f3551b;
                    if (i4 == 1) {
                        float x2 = motionEvent.getX();
                        int[] iArr = c0200n.f3571y;
                        iArr[0] = i5;
                        int i6 = c0200n.f3563q - i5;
                        iArr[1] = i6;
                        float max = Math.max(i5, Math.min(i6, x2));
                        if (Math.abs(c0200n.f3561o - max) >= 2.0f) {
                            int e = C0200n.e(c0200n.f3562p, max, iArr, c0200n.f3565s.computeHorizontalScrollRange(), c0200n.f3565s.computeHorizontalScrollOffset(), c0200n.f3563q);
                            if (e != 0) {
                                c0200n.f3565s.scrollBy(e, 0);
                            }
                            c0200n.f3562p = max;
                        }
                    }
                    if (c0200n.f3569w == 2) {
                        float y2 = motionEvent.getY();
                        int[] iArr2 = c0200n.f3570x;
                        iArr2[0] = i5;
                        int i7 = c0200n.f3564r - i5;
                        iArr2[1] = i7;
                        float max2 = Math.max(i5, Math.min(i7, y2));
                        if (Math.abs(c0200n.f3558l - max2) >= 2.0f) {
                            int e2 = C0200n.e(c0200n.f3559m, max2, iArr2, c0200n.f3565s.computeVerticalScrollRange(), c0200n.f3565s.computeVerticalScrollOffset(), c0200n.f3564r);
                            if (e2 != 0) {
                                c0200n.f3565s.scrollBy(0, e2);
                            }
                            c0200n.f3559m = max2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f2170r = null;
            }
            z2 = true;
        }
        if (z2) {
            c0();
            setScrollState(0);
            return true;
        }
        K k2 = this.f2162n;
        if (k2 == null) {
            return false;
        }
        boolean d3 = k2.d();
        boolean e3 = this.f2162n.e();
        if (this.f2130O == null) {
            this.f2130O = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f2171r0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            recyclerView = this;
            motionEvent2 = obtain;
            recyclerView.f2129N = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            recyclerView.f2133R = x3;
            recyclerView.f2131P = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            recyclerView.f2134S = y3;
            recyclerView.f2132Q = y3;
            int i8 = d3;
            if (e3) {
                i8 = (d3 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i8, 0);
        } else {
            if (actionMasked == 1) {
                this.f2130O.addMovement(obtain);
                VelocityTracker velocityTracker = this.f2130O;
                int i9 = this.f2138W;
                velocityTracker.computeCurrentVelocity(1000, i9);
                float f4 = d3 != 0 ? -this.f2130O.getXVelocity(this.f2129N) : 0.0f;
                float f5 = e3 ? -this.f2130O.getYVelocity(this.f2129N) : 0.0f;
                if (f4 == f2111C0 && f5 == f2111C0) {
                    recyclerView2 = this;
                    i3 = 0;
                    motionEvent4 = obtain;
                } else {
                    int i10 = (int) f4;
                    int i11 = (int) f5;
                    K k3 = this.f2162n;
                    if (k3 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f2181x) {
                        int d4 = k3.d();
                        boolean e4 = this.f2162n.e();
                        int i12 = this.f2137V;
                        if (d4 == 0 || Math.abs(i10) < i12) {
                            i10 = 0;
                        }
                        if (!e4 || Math.abs(i11) < i12) {
                            i11 = 0;
                        }
                        if (i10 != 0 || i11 != 0) {
                            if (i10 != 0) {
                                EdgeEffect edgeEffect = this.f2124H;
                                if (edgeEffect == null || AbstractC0078a.D(edgeEffect) == f2111C0) {
                                    EdgeEffect edgeEffect2 = this.J;
                                    if (edgeEffect2 != null && AbstractC0078a.D(edgeEffect2) != f2111C0) {
                                        if (g0(this.J, i10, getWidth())) {
                                            this.J.onAbsorb(i10);
                                            i10 = 0;
                                        }
                                        i = i10;
                                        i10 = 0;
                                    }
                                } else {
                                    int i13 = -i10;
                                    if (g0(this.f2124H, i13, getWidth())) {
                                        this.f2124H.onAbsorb(i13);
                                        i10 = 0;
                                    }
                                    i = i10;
                                    i10 = 0;
                                }
                                if (i11 != 0) {
                                    EdgeEffect edgeEffect3 = this.f2125I;
                                    if (edgeEffect3 == null || AbstractC0078a.D(edgeEffect3) == f2111C0) {
                                        EdgeEffect edgeEffect4 = this.f2126K;
                                        if (edgeEffect4 != null && AbstractC0078a.D(edgeEffect4) != f2111C0) {
                                            if (g0(this.f2126K, i11, getHeight())) {
                                                this.f2126K.onAbsorb(i11);
                                                i11 = 0;
                                            }
                                            i2 = 0;
                                        }
                                    } else {
                                        int i14 = -i11;
                                        if (g0(this.f2125I, i14, getHeight())) {
                                            this.f2125I.onAbsorb(i14);
                                            i11 = 0;
                                        }
                                        i2 = 0;
                                    }
                                    a0Var = this.f2146d0;
                                    if (i == 0 || i11 != 0) {
                                        int i15 = -i9;
                                        i = Math.max(i15, Math.min(i, i9));
                                        i11 = Math.max(i15, Math.min(i11, i9));
                                        a0Var.a(i, i11);
                                    }
                                    if (i10 == 0 || i2 != 0) {
                                        f2 = i10;
                                        f3 = i2;
                                        if (!dispatchNestedPreFling(f2, f3)) {
                                            boolean z5 = d4 != 0 || e4;
                                            dispatchNestedFling(f2, f3, z5);
                                            M m2 = this.f2136U;
                                            if (m2 != null) {
                                                C0211z c0211z = (C0211z) m2;
                                                K layoutManager = c0211z.f3628a.getLayoutManager();
                                                if (layoutManager != 0 && c0211z.f3628a.getAdapter() != null && ((Math.abs(i2) > (minFlingVelocity = c0211z.f3628a.getMinFlingVelocity()) || Math.abs(i10) > minFlingVelocity) && ((z3 = layoutManager instanceof W)))) {
                                                    b bVar = !z3 ? null : new b(c0211z, c0211z.f3628a.getContext(), 1);
                                                    if (bVar != null) {
                                                        int B2 = layoutManager.B();
                                                        if (B2 != 0) {
                                                            g e5 = layoutManager.e() ? c0211z.e(layoutManager) : layoutManager.d() ? c0211z.d(layoutManager) : null;
                                                            if (e5 != null) {
                                                                int v2 = layoutManager.v();
                                                                motionEvent4 = obtain;
                                                                int i16 = Integer.MIN_VALUE;
                                                                int i17 = Integer.MAX_VALUE;
                                                                int i18 = 0;
                                                                View view = null;
                                                                View view2 = null;
                                                                while (i18 < v2) {
                                                                    int i19 = v2;
                                                                    View u2 = layoutManager.u(i18);
                                                                    if (u2 == null) {
                                                                        a0Var3 = a0Var;
                                                                    } else {
                                                                        a0Var3 = a0Var;
                                                                        int b2 = C0211z.b(u2, e5);
                                                                        if (b2 <= 0 && b2 > i16) {
                                                                            view2 = u2;
                                                                            i16 = b2;
                                                                        }
                                                                        if (b2 >= 0 && b2 < i17) {
                                                                            view = u2;
                                                                            i17 = b2;
                                                                        }
                                                                    }
                                                                    i18++;
                                                                    v2 = i19;
                                                                    a0Var = a0Var3;
                                                                }
                                                                a0Var2 = a0Var;
                                                                boolean z6 = !layoutManager.d() ? i2 <= 0 : i10 <= 0;
                                                                if (z6 && view != null) {
                                                                    H2 = K.H(view);
                                                                } else if (z6 || view2 == null) {
                                                                    if (z6) {
                                                                        view = view2;
                                                                    }
                                                                    if (view != null) {
                                                                        H2 = ((z3 && (a2 = ((W) layoutManager).a(layoutManager.B() - 1)) != null && ((a2.x > f2111C0 ? 1 : (a2.x == f2111C0 ? 0 : -1)) < 0 || (a2.y > f2111C0 ? 1 : (a2.y == f2111C0 ? 0 : -1)) < 0)) == z6 ? -1 : 1) + K.H(view);
                                                                        if (H2 >= 0) {
                                                                        }
                                                                    }
                                                                    H2 = -1;
                                                                } else {
                                                                    H2 = K.H(view2);
                                                                }
                                                                if (H2 != -1) {
                                                                    bVar.f3614a = H2;
                                                                    layoutManager.C0(bVar);
                                                                }
                                                                if (z5) {
                                                                    if (e4) {
                                                                        d4 = (d4 == true ? 1 : 0) | 2;
                                                                    }
                                                                    getScrollingChildHelper().g(d4, 1);
                                                                    int i20 = -i9;
                                                                    a0Var2.a(Math.max(i20, Math.min(i10, i9)), Math.max(i20, Math.min(i2, i9)));
                                                                }
                                                                i3 = 0;
                                                                recyclerView2 = this;
                                                            }
                                                        }
                                                        a0Var2 = a0Var;
                                                        motionEvent4 = obtain;
                                                        H2 = -1;
                                                        if (H2 != -1) {
                                                        }
                                                        if (z5) {
                                                        }
                                                        i3 = 0;
                                                        recyclerView2 = this;
                                                    }
                                                }
                                            }
                                            a0Var2 = a0Var;
                                            motionEvent4 = obtain;
                                            if (z5) {
                                            }
                                            i3 = 0;
                                            recyclerView2 = this;
                                        }
                                    } else if (i != 0 || i11 != 0) {
                                        motionEvent4 = obtain;
                                    }
                                    c0();
                                    motionEvent3 = motionEvent4;
                                    motionEvent3.recycle();
                                    return true;
                                }
                                i2 = i11;
                                i11 = 0;
                                a0Var = this.f2146d0;
                                if (i == 0) {
                                }
                                int i152 = -i9;
                                i = Math.max(i152, Math.min(i, i9));
                                i11 = Math.max(i152, Math.min(i11, i9));
                                a0Var.a(i, i11);
                                if (i10 == 0) {
                                }
                                f2 = i10;
                                f3 = i2;
                                if (!dispatchNestedPreFling(f2, f3)) {
                                }
                            }
                            i = 0;
                            if (i11 != 0) {
                            }
                            i2 = i11;
                            i11 = 0;
                            a0Var = this.f2146d0;
                            if (i == 0) {
                            }
                            int i1522 = -i9;
                            i = Math.max(i1522, Math.min(i, i9));
                            i11 = Math.max(i1522, Math.min(i11, i9));
                            a0Var.a(i, i11);
                            if (i10 == 0) {
                            }
                            f2 = i10;
                            f3 = i2;
                            if (!dispatchNestedPreFling(f2, f3)) {
                            }
                        }
                    }
                    motionEvent4 = obtain;
                    i3 = 0;
                    recyclerView2 = this;
                }
                recyclerView2.setScrollState(i3);
                c0();
                motionEvent3 = motionEvent4;
                motionEvent3.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f2129N);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2129N + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i21 = this.f2133R - x4;
                int i22 = this.f2134S - y4;
                if (this.f2128M != 1) {
                    if (d3 != 0) {
                        i21 = i21 > 0 ? Math.max(0, i21 - this.f2135T) : Math.min(0, i21 + this.f2135T);
                        if (i21 != 0) {
                            z4 = true;
                            if (e3) {
                                i22 = i22 > 0 ? Math.max(0, i22 - this.f2135T) : Math.min(0, i22 + this.f2135T);
                                if (i22 != 0) {
                                    z4 = true;
                                }
                            }
                            if (z4) {
                                setScrollState(1);
                            }
                        }
                    }
                    z4 = false;
                    if (e3) {
                    }
                    if (z4) {
                    }
                }
                if (this.f2128M == 1) {
                    int[] iArr4 = this.s0;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    int Z2 = i21 - Z(i21, motionEvent.getY());
                    int a02 = i22 - a0(i22, motionEvent.getX());
                    boolean u3 = u(d3 != 0 ? Z2 : 0, e3 ? a02 : 0, 0, this.s0, this.f2169q0);
                    int[] iArr5 = this.f2169q0;
                    if (u3) {
                        Z2 -= iArr4[0];
                        a02 -= iArr4[1];
                        iArr3[0] = iArr3[0] + iArr5[0];
                        iArr3[1] = iArr3[1] + iArr5[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i23 = Z2;
                    int i24 = a02;
                    this.f2133R = x4 - iArr5[0];
                    this.f2134S = y4 - iArr5[1];
                    if (d0(d3 != 0 ? i23 : 0, e3 ? i24 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC0203q runnableC0203q = this.f2147e0;
                    if (runnableC0203q != null && (i23 != 0 || i24 != 0)) {
                        runnableC0203q.a(this, i23, i24);
                    }
                }
            } else if (actionMasked == 3) {
                c0();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f2129N = motionEvent.getPointerId(actionIndex);
                int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f2133R = x5;
                this.f2131P = x5;
                int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f2134S = y5;
                this.f2132Q = y5;
            } else if (actionMasked == 6) {
                U(motionEvent);
            }
            recyclerView = this;
            motionEvent2 = obtain;
        }
        motionEvent3 = motionEvent2;
        recyclerView.f2130O.addMovement(motionEvent3);
        motionEvent3.recycle();
        return true;
    }

    public final void p() {
        C0190d c0190d = this.f2148f;
        C0188b c0188b = this.e;
        if (!this.f2175u || this.f2119C) {
            int i = K.i.f387a;
            Trace.beginSection("RV FullInvalidate");
            r();
            Trace.endSection();
            return;
        }
        if (c0188b.j()) {
            int i2 = c0188b.f3443a;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (c0188b.j()) {
                    int i3 = K.i.f387a;
                    Trace.beginSection("RV FullInvalidate");
                    r();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = K.i.f387a;
            Trace.beginSection("RV PartialInvalidate");
            i0();
            S();
            c0188b.p();
            if (!this.f2179w) {
                int e = c0190d.e();
                int i5 = 0;
                while (true) {
                    if (i5 < e) {
                        b0 L2 = L(c0190d.d(i5));
                        if (L2 != null && !L2.q() && L2.m()) {
                            r();
                            break;
                        }
                        i5++;
                    } else {
                        c0188b.c();
                        break;
                    }
                }
            }
            j0(true);
            T(true);
            Trace.endSection();
        }
    }

    public final void q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = O.K.f747a;
        setMeasuredDimension(K.g(i, paddingRight, getMinimumWidth()), K.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x032e, code lost:
    
        if (r19.f2148f.f3471c.contains(getFocusedChild()) == false) goto L223;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03d4  */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        b0 b0Var;
        View findViewById;
        boolean z2;
        C0038n c0038n;
        ?? r3;
        RecyclerView recyclerView;
        boolean g2;
        if (this.f2160m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f2162n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        X x2 = this.f2151g0;
        boolean z3 = false;
        x2.i = false;
        int i = 1;
        boolean z4 = this.f2178v0 && !(this.f2180w0 == getWidth() && this.f2182x0 == getHeight());
        this.f2180w0 = 0;
        this.f2182x0 = 0;
        this.f2178v0 = false;
        if (x2.f3425d == 1) {
            s();
            this.f2162n.t0(this);
            t();
        } else {
            C0188b c0188b = this.e;
            if ((((ArrayList) c0188b.f3446d).isEmpty() || ((ArrayList) c0188b.f3445c).isEmpty()) && !z4 && this.f2162n.f3394n == getWidth() && this.f2162n.f3395o == getHeight()) {
                this.f2162n.t0(this);
            } else {
                this.f2162n.t0(this);
                t();
            }
        }
        x2.a(4);
        i0();
        S();
        x2.f3425d = 1;
        boolean z5 = x2.j;
        Q q2 = this.f2143c;
        i iVar = this.f2150g;
        if (z5) {
            int e = this.f2148f.e() - 1;
            while (e >= 0) {
                b0 L2 = L(this.f2148f.d(e));
                if (!L2.q()) {
                    long J = J(L2);
                    this.f2127L.getClass();
                    C0038n c0038n2 = new C0038n();
                    c0038n2.a(L2);
                    b0 b0Var2 = (b0) ((C0340h) iVar.f209c).b(J);
                    if (b0Var2 == null || b0Var2.q()) {
                        iVar.c(L2, c0038n2);
                    } else {
                        C0342j c0342j = (C0342j) iVar.f208b;
                        l0 l0Var = (l0) c0342j.get(b0Var2);
                        int i2 = (l0Var == null || (l0Var.f3541a & i) == 0) ? 0 : i;
                        l0 l0Var2 = (l0) c0342j.get(L2);
                        int i3 = (l0Var2 == null || (l0Var2.f3541a & i) == 0) ? 0 : i;
                        if (i2 == 0 || b0Var2 != L2) {
                            C0038n F2 = iVar.F(b0Var2, 4);
                            iVar.c(L2, c0038n2);
                            C0038n F3 = iVar.F(L2, 8);
                            if (F2 == null) {
                                int e2 = this.f2148f.e();
                                for (int i4 = 0; i4 < e2; i4++) {
                                    b0 L3 = L(this.f2148f.d(i4));
                                    if (L3 != L2 && J(L3) == J) {
                                        C c2 = this.f2160m;
                                        if (c2 == null || !c2.f3371b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(L3);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(L2);
                                            throw new IllegalStateException(h.d(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(L3);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(L2);
                                        throw new IllegalStateException(h.d(this, sb2));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + b0Var2 + " cannot be found but it is necessary for " + L2 + B());
                            } else {
                                b0Var2.p(false);
                                if (i2 != 0) {
                                    h(b0Var2);
                                }
                                if (b0Var2 != L2) {
                                    if (i3 != 0) {
                                        h(L2);
                                    }
                                    b0Var2.f3455h = L2;
                                    h(b0Var2);
                                    q2.l(b0Var2);
                                    L2.p(false);
                                    L2.i = b0Var2;
                                }
                                if (this.f2127L.a(b0Var2, L2, F2, F3)) {
                                    V();
                                }
                            }
                        } else {
                            iVar.c(L2, c0038n2);
                        }
                    }
                }
                e--;
                i = 1;
            }
            C0342j c0342j2 = (C0342j) iVar.f208b;
            int i5 = c0342j2.f4322c - 1;
            while (i5 >= 0) {
                b0 b0Var3 = (b0) c0342j2.f(i5);
                l0 l0Var3 = (l0) c0342j2.g(i5);
                int i6 = l0Var3.f3541a;
                int i7 = i6 & 3;
                B b2 = this.f2184y0;
                if (i7 == 3) {
                    RecyclerView recyclerView2 = b2.f3369a;
                    recyclerView2.f2162n.m0(b0Var3.f3449a, recyclerView2.f2143c);
                    r3 = z3;
                } else if ((i6 & 1) != 0) {
                    C0038n c0038n3 = l0Var3.f3542b;
                    if (c0038n3 == null) {
                        RecyclerView recyclerView3 = b2.f3369a;
                        recyclerView3.f2162n.m0(b0Var3.f3449a, recyclerView3.f2143c);
                        r3 = z3;
                    } else {
                        b2.g(b0Var3, c0038n3, l0Var3.f3543c);
                        r3 = z3;
                    }
                } else if ((i6 & 14) == 14) {
                    b2.f(b0Var3, l0Var3.f3542b, l0Var3.f3543c);
                    r3 = z3;
                } else if ((i6 & 12) == 12) {
                    C0038n c0038n4 = l0Var3.f3542b;
                    C0038n c0038n5 = l0Var3.f3543c;
                    b2.getClass();
                    b0Var3.p(z3);
                    RecyclerView recyclerView4 = b2.f3369a;
                    if (!recyclerView4.f2119C) {
                        C0197k c0197k = (C0197k) recyclerView4.f2127L;
                        c0197k.getClass();
                        int i8 = c0038n4.f825a;
                        int i9 = c0038n5.f825a;
                        if (i8 == i9 && c0038n4.f826b == c0038n5.f826b) {
                            c0197k.c(b0Var3);
                            recyclerView = recyclerView4;
                            g2 = false;
                        } else {
                            recyclerView = recyclerView4;
                            g2 = c0197k.g(b0Var3, i8, c0038n4.f826b, i9, c0038n5.f826b);
                        }
                        if (g2) {
                            recyclerView.V();
                        }
                    } else if (recyclerView4.f2127L.a(b0Var3, b0Var3, c0038n4, c0038n5)) {
                        recyclerView4.V();
                    }
                    r3 = 0;
                } else {
                    if ((i6 & 4) != 0) {
                        c0038n = null;
                        b2.g(b0Var3, l0Var3.f3542b, null);
                    } else {
                        c0038n = null;
                        if ((i6 & 8) != 0) {
                            b2.f(b0Var3, l0Var3.f3542b, l0Var3.f3543c);
                        }
                    }
                    r3 = 0;
                    l0Var3.f3541a = r3;
                    l0Var3.f3542b = c0038n;
                    l0Var3.f3543c = c0038n;
                    l0.f3540d.c(l0Var3);
                    i5--;
                    z3 = false;
                }
                c0038n = null;
                l0Var3.f3541a = r3;
                l0Var3.f3542b = c0038n;
                l0Var3.f3543c = c0038n;
                l0.f3540d.c(l0Var3);
                i5--;
                z3 = false;
            }
        }
        View view = null;
        this.f2162n.l0(q2);
        x2.f3423b = x2.e;
        this.f2119C = false;
        this.f2120D = false;
        x2.j = false;
        x2.f3429k = false;
        this.f2162n.f3388f = false;
        ArrayList arrayList = q2.f3408b;
        if (arrayList != null) {
            arrayList.clear();
        }
        K k2 = this.f2162n;
        if (k2.f3391k) {
            k2.j = 0;
            k2.f3391k = false;
            q2.m();
        }
        this.f2162n.f0(x2);
        T(true);
        j0(false);
        ((C0342j) iVar.f208b).clear();
        ((C0340h) iVar.f209c).a();
        int[] iArr = this.f2165o0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        F(iArr);
        if ((iArr[0] == i10 && iArr[1] == i11) ? false : true) {
            w(0, 0);
        }
        if (this.f2144c0 && this.f2160m != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j = x2.f3431m;
            if (j != -1 && (z2 = this.f2160m.f3371b) && z2) {
                int h2 = this.f2148f.h();
                int i12 = 0;
                b0Var = null;
                while (true) {
                    if (i12 >= h2) {
                        break;
                    }
                    b0 L4 = L(this.f2148f.g(i12));
                    if (L4 != null && !L4.j() && L4.e == j) {
                        if (!this.f2148f.f3471c.contains(L4.f3449a)) {
                            b0Var = L4;
                            break;
                        }
                        b0Var = L4;
                    }
                    i12++;
                }
            } else {
                b0Var = null;
            }
            if (b0Var != null) {
                ArrayList arrayList2 = this.f2148f.f3471c;
                View view2 = b0Var.f3449a;
                if (!arrayList2.contains(view2) && view2.hasFocusable()) {
                    view = view2;
                    if (view != null) {
                        int i13 = x2.f3432n;
                        if (i13 != -1 && (findViewById = view.findViewById(i13)) != null && findViewById.isFocusable()) {
                            view = findViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
            if (this.f2148f.e() > 0) {
                int i14 = x2.f3430l;
                int i15 = i14 != -1 ? i14 : 0;
                int b3 = x2.b();
                for (int i16 = i15; i16 < b3; i16++) {
                    b0 H2 = H(i16);
                    if (H2 == null) {
                        break;
                    }
                    View view3 = H2.f3449a;
                    if (view3.hasFocusable()) {
                        view = view3;
                        break;
                    }
                }
                int min = Math.min(b3, i15) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    b0 H3 = H(min);
                    if (H3 == null) {
                        break;
                    }
                    View view4 = H3.f3449a;
                    if (view4.hasFocusable()) {
                        view = view4;
                        break;
                    }
                    min--;
                }
            }
            if (view != null) {
            }
        }
        x2.f3431m = -1L;
        x2.f3430l = -1;
        x2.f3432n = -1;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        b0 L2 = L(view);
        if (L2 != null) {
            if (L2.l()) {
                L2.j &= -257;
            } else if (!L2.q()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(L2);
                throw new IllegalArgumentException(h.d(this, sb));
            }
        } else if (z0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(h.d(this, sb2));
        }
        view.clearAnimation();
        L(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0209x c0209x = this.f2162n.e;
        if ((c0209x == null || !c0209x.e) && !O() && view2 != null) {
            b0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f2162n.o0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f2168q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0200n) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2177v != 0 || this.f2181x) {
            this.f2179w = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x007e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        int I2;
        View view;
        l0 l0Var;
        View D2;
        X x2 = this.f2151g0;
        x2.a(1);
        C(x2);
        x2.i = false;
        i0();
        i iVar = this.f2150g;
        ((C0342j) iVar.f208b).clear();
        C0340h c0340h = (C0340h) iVar.f209c;
        c0340h.a();
        S();
        W();
        b0 b0Var = null;
        View focusedChild = (this.f2144c0 && hasFocus() && this.f2160m != null) ? getFocusedChild() : null;
        if (focusedChild != null && (D2 = D(focusedChild)) != null) {
            b0Var = K(D2);
        }
        if (b0Var == null) {
            x2.f3431m = -1L;
            x2.f3430l = -1;
            x2.f3432n = -1;
        } else {
            x2.f3431m = this.f2160m.f3371b ? b0Var.e : -1L;
            if (!this.f2119C) {
                if (b0Var.j()) {
                    I2 = b0Var.f3452d;
                } else {
                    RecyclerView recyclerView = b0Var.f3463r;
                    if (recyclerView != null) {
                        I2 = recyclerView.I(b0Var);
                    }
                }
                x2.f3430l = I2;
                view = b0Var.f3449a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                x2.f3432n = id;
            }
            I2 = -1;
            x2.f3430l = I2;
            view = b0Var.f3449a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            x2.f3432n = id2;
        }
        x2.f3428h = x2.j && this.f2157k0;
        this.f2157k0 = false;
        this.f2155j0 = false;
        x2.f3427g = x2.f3429k;
        x2.e = this.f2160m.a();
        F(this.f2165o0);
        boolean z2 = x2.j;
        C0342j c0342j = (C0342j) iVar.f208b;
        if (z2) {
            int e = this.f2148f.e();
            for (int i = 0; i < e; i++) {
                b0 L2 = L(this.f2148f.d(i));
                if (!L2.q() && (!L2.h() || this.f2160m.f3371b)) {
                    G g2 = this.f2127L;
                    G.b(L2);
                    L2.d();
                    g2.getClass();
                    C0038n c0038n = new C0038n();
                    c0038n.a(L2);
                    l0 l0Var2 = (l0) c0342j.get(L2);
                    if (l0Var2 == null) {
                        l0Var2 = l0.a();
                        c0342j.put(L2, l0Var2);
                    }
                    l0Var2.f3542b = c0038n;
                    l0Var2.f3541a |= 4;
                    if (x2.f3428h && L2.m() && !L2.j() && !L2.q() && !L2.h()) {
                        c0340h.d(J(L2), L2);
                    }
                }
            }
        }
        if (x2.f3429k) {
            int h2 = this.f2148f.h();
            for (int i2 = 0; i2 < h2; i2++) {
                b0 L3 = L(this.f2148f.g(i2));
                if (z0 && L3.f3451c == -1 && !L3.j()) {
                    throw new IllegalStateException(h.d(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!L3.q() && L3.f3452d == -1) {
                    L3.f3452d = L3.f3451c;
                }
            }
            boolean z3 = x2.f3426f;
            x2.f3426f = false;
            this.f2162n.e0(this.f2143c, x2);
            x2.f3426f = z3;
            for (int i3 = 0; i3 < this.f2148f.e(); i3++) {
                b0 L4 = L(this.f2148f.d(i3));
                if (!L4.q() && ((l0Var = (l0) c0342j.get(L4)) == null || (l0Var.f3541a & 4) == 0)) {
                    G.b(L4);
                    boolean e2 = L4.e(8192);
                    G g3 = this.f2127L;
                    L4.d();
                    g3.getClass();
                    C0038n c0038n2 = new C0038n();
                    c0038n2.a(L4);
                    if (e2) {
                        Y(L4, c0038n2);
                    } else {
                        l0 l0Var3 = (l0) c0342j.get(L4);
                        if (l0Var3 == null) {
                            l0Var3 = l0.a();
                            c0342j.put(L4, l0Var3);
                        }
                        l0Var3.f3541a |= 2;
                        l0Var3.f3542b = c0038n2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        T(true);
        j0(false);
        x2.f3425d = 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        K k2 = this.f2162n;
        if (k2 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2181x) {
            return;
        }
        boolean d2 = k2.d();
        boolean e = this.f2162n.e();
        if (d2 || e) {
            if (!d2) {
                i = 0;
            }
            if (!e) {
                i2 = 0;
            }
            d0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!O()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f2185z |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(d0 d0Var) {
        this.f2163n0 = d0Var;
        O.K.l(this, d0Var);
    }

    public void setAdapter(C c2) {
        setLayoutFrozen(false);
        C c3 = this.f2160m;
        T t2 = this.f2141b;
        if (c3 != null) {
            c3.f3370a.unregisterObserver(t2);
            this.f2160m.getClass();
        }
        G g2 = this.f2127L;
        if (g2 != null) {
            g2.e();
        }
        K k2 = this.f2162n;
        Q q2 = this.f2143c;
        if (k2 != null) {
            k2.k0(q2);
            this.f2162n.l0(q2);
        }
        q2.f3407a.clear();
        q2.f();
        C0188b c0188b = this.e;
        c0188b.q((ArrayList) c0188b.f3445c);
        c0188b.q((ArrayList) c0188b.f3446d);
        c0188b.f3443a = 0;
        C c4 = this.f2160m;
        this.f2160m = c2;
        if (c2 != null) {
            c2.f3370a.registerObserver(t2);
        }
        K k3 = this.f2162n;
        if (k3 != null) {
            k3.R();
        }
        C c5 = this.f2160m;
        q2.f3407a.clear();
        q2.f();
        q2.e(c4, true);
        P c6 = q2.c();
        if (c4 != null) {
            c6.f3405b--;
        }
        if (c6.f3405b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c6.f3404a;
                if (i >= sparseArray.size()) {
                    break;
                }
                O o2 = (O) sparseArray.valueAt(i);
                Iterator it = o2.f3400a.iterator();
                while (it.hasNext()) {
                    j.k(((b0) it.next()).f3449a);
                }
                o2.f3400a.clear();
                i++;
            }
        }
        if (c5 != null) {
            c6.f3405b++;
        }
        q2.d();
        this.f2151g0.f3426f = true;
        X(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(E e) {
        if (e == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f2152h) {
            this.f2126K = null;
            this.f2125I = null;
            this.J = null;
            this.f2124H = null;
        }
        this.f2152h = z2;
        super.setClipToPadding(z2);
        if (this.f2175u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(F f2) {
        f2.getClass();
        this.f2123G = f2;
        this.f2126K = null;
        this.f2125I = null;
        this.J = null;
        this.f2124H = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f2173t = z2;
    }

    public void setItemAnimator(G g2) {
        G g3 = this.f2127L;
        if (g3 != null) {
            g3.e();
            this.f2127L.f3373a = null;
        }
        this.f2127L = g2;
        if (g2 != null) {
            g2.f3373a = this.f2159l0;
        }
    }

    public void setItemViewCacheSize(int i) {
        Q q2 = this.f2143c;
        q2.e = i;
        q2.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(K k2) {
        RecyclerView recyclerView;
        C0209x c0209x;
        if (k2 == this.f2162n) {
            return;
        }
        setScrollState(0);
        a0 a0Var = this.f2146d0;
        a0Var.f3442g.removeCallbacks(a0Var);
        a0Var.f3439c.abortAnimation();
        K k3 = this.f2162n;
        if (k3 != null && (c0209x = k3.e) != null) {
            c0209x.i();
        }
        K k4 = this.f2162n;
        Q q2 = this.f2143c;
        if (k4 != null) {
            G g2 = this.f2127L;
            if (g2 != null) {
                g2.e();
            }
            this.f2162n.k0(q2);
            this.f2162n.l0(q2);
            q2.f3407a.clear();
            q2.f();
            if (this.f2172s) {
                K k5 = this.f2162n;
                k5.f3389g = false;
                k5.T(this);
            }
            this.f2162n.x0(null);
            this.f2162n = null;
        } else {
            q2.f3407a.clear();
            q2.f();
        }
        C0190d c0190d = this.f2148f;
        c0190d.f3470b.g();
        ArrayList arrayList = c0190d.f3471c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = c0190d.f3469a.f3369a;
            if (size < 0) {
                break;
            }
            b0 L2 = L((View) arrayList.get(size));
            if (L2 != null) {
                int i = L2.f3461p;
                if (recyclerView.O()) {
                    L2.f3462q = i;
                    recyclerView.f2174t0.add(L2);
                } else {
                    WeakHashMap weakHashMap = O.K.f747a;
                    L2.f3449a.setImportantForAccessibility(i);
                }
                L2.f3461p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            L(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f2162n = k2;
        if (k2 != null) {
            if (k2.f3385b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(k2);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(h.d(k2.f3385b, sb));
            }
            k2.x0(this);
            if (this.f2172s) {
                K k6 = this.f2162n;
                k6.f3389g = true;
                k6.S(this);
            }
        }
        q2.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0035k scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f823d) {
            WeakHashMap weakHashMap = O.K.f747a;
            O.B.m(scrollingChildHelper.f822c);
        }
        scrollingChildHelper.f823d = z2;
    }

    public void setOnFlingListener(M m2) {
        this.f2136U = m2;
    }

    @Deprecated
    public void setOnScrollListener(N n2) {
        this.f2153h0 = n2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f2144c0 = z2;
    }

    public void setRecycledViewPool(P p2) {
        Q q2 = this.f2143c;
        RecyclerView recyclerView = q2.f3413h;
        q2.e(recyclerView.f2160m, false);
        if (q2.f3412g != null) {
            r2.f3405b--;
        }
        q2.f3412g = p2;
        if (p2 != null && recyclerView.getAdapter() != null) {
            q2.f3412g.f3405b++;
        }
        q2.d();
    }

    @Deprecated
    public void setRecyclerListener(S s2) {
    }

    public void setScrollState(int i) {
        C0209x c0209x;
        if (i == this.f2128M) {
            return;
        }
        if (f2109A0) {
            Log.d("RecyclerView", "setting scroll state to " + i + " from " + this.f2128M, new Exception());
        }
        this.f2128M = i;
        if (i != 2) {
            a0 a0Var = this.f2146d0;
            a0Var.f3442g.removeCallbacks(a0Var);
            a0Var.f3439c.abortAnimation();
            K k2 = this.f2162n;
            if (k2 != null && (c0209x = k2.e) != null) {
                c0209x.i();
            }
        }
        K k3 = this.f2162n;
        if (k3 != null) {
            k3.j0(i);
        }
        N n2 = this.f2153h0;
        if (n2 != null) {
            n2.a(this, i);
        }
        ArrayList arrayList = this.f2154i0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((N) this.f2154i0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f2135T = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f2135T = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(Z z2) {
        this.f2143c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        C0209x c0209x;
        if (z2 != this.f2181x) {
            k("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f2181x = false;
                if (this.f2179w && this.f2162n != null && this.f2160m != null) {
                    requestLayout();
                }
                this.f2179w = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, f2111C0, f2111C0, 0));
            this.f2181x = true;
            this.f2183y = true;
            setScrollState(0);
            a0 a0Var = this.f2146d0;
            a0Var.f3442g.removeCallbacks(a0Var);
            a0Var.f3439c.abortAnimation();
            K k2 = this.f2162n;
            if (k2 == null || (c0209x = k2.e) == null) {
                return;
            }
            c0209x.i();
        }
    }

    public final void t() {
        i0();
        S();
        X x2 = this.f2151g0;
        x2.a(6);
        this.e.d();
        x2.e = this.f2160m.a();
        x2.f3424c = 0;
        if (this.f2145d != null) {
            C c2 = this.f2160m;
            int a2 = AbstractC0357e.a(c2.f3372c);
            if (a2 == 1 ? c2.a() > 0 : a2 != 2) {
                Parcelable parcelable = this.f2145d.f3415c;
                if (parcelable != null) {
                    this.f2162n.h0(parcelable);
                }
                this.f2145d = null;
            }
        }
        x2.f3427g = false;
        this.f2162n.e0(this.f2143c, x2);
        x2.f3426f = false;
        x2.j = x2.j && this.f2127L != null;
        x2.f3425d = 4;
        T(true);
        j0(false);
    }

    public final boolean u(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void v(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void w(int i, int i2) {
        this.f2122F++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        N n2 = this.f2153h0;
        if (n2 != null) {
            n2.b(this, i, i2);
        }
        ArrayList arrayList = this.f2154i0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((N) this.f2154i0.get(size)).b(this, i, i2);
            }
        }
        this.f2122F--;
    }

    public final void x() {
        if (this.f2126K != null) {
            return;
        }
        ((Y) this.f2123G).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2126K = edgeEffect;
        if (this.f2152h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void y() {
        if (this.f2124H != null) {
            return;
        }
        ((Y) this.f2123G).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2124H = edgeEffect;
        if (this.f2152h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.J != null) {
            return;
        }
        ((Y) this.f2123G).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.J = edgeEffect;
        if (this.f2152h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        char c2;
        Object[] objArr;
        Constructor constructor;
        int i3 = 1;
        this.f2141b = new T(this);
        this.f2143c = new Q(this);
        this.f2150g = new i(13);
        this.i = new RunnableC0186A(this, 0);
        this.j = new Rect();
        this.f2156k = new Rect();
        this.f2158l = new RectF();
        this.f2164o = new ArrayList();
        this.f2166p = new ArrayList();
        this.f2168q = new ArrayList();
        this.f2177v = 0;
        this.f2119C = false;
        this.f2120D = false;
        this.f2121E = 0;
        this.f2122F = 0;
        this.f2123G = f2116I0;
        C0197k c0197k = new C0197k();
        c0197k.f3373a = null;
        c0197k.f3374b = new ArrayList();
        c0197k.f3375c = 120L;
        c0197k.f3376d = 120L;
        c0197k.e = 250L;
        c0197k.f3377f = 250L;
        c0197k.f3525g = true;
        c0197k.f3526h = new ArrayList();
        c0197k.i = new ArrayList();
        c0197k.j = new ArrayList();
        c0197k.f3527k = new ArrayList();
        c0197k.f3528l = new ArrayList();
        c0197k.f3529m = new ArrayList();
        c0197k.f3530n = new ArrayList();
        c0197k.f3531o = new ArrayList();
        c0197k.f3532p = new ArrayList();
        c0197k.f3533q = new ArrayList();
        c0197k.f3534r = new ArrayList();
        this.f2127L = c0197k;
        this.f2128M = 0;
        this.f2129N = -1;
        this.f2140a0 = Float.MIN_VALUE;
        this.f2142b0 = Float.MIN_VALUE;
        this.f2144c0 = true;
        this.f2146d0 = new a0(this);
        this.f2149f0 = f2114F0 ? new C0201o() : null;
        X x2 = new X();
        x2.f3422a = -1;
        x2.f3423b = 0;
        x2.f3424c = 0;
        x2.f3425d = 1;
        x2.e = 0;
        x2.f3426f = false;
        x2.f3427g = false;
        x2.f3428h = false;
        x2.i = false;
        x2.j = false;
        x2.f3429k = false;
        this.f2151g0 = x2;
        this.f2155j0 = false;
        this.f2157k0 = false;
        B b2 = new B(this);
        this.f2159l0 = b2;
        this.f2161m0 = false;
        this.f2165o0 = new int[2];
        this.f2169q0 = new int[2];
        this.f2171r0 = new int[2];
        this.s0 = new int[2];
        this.f2174t0 = new ArrayList();
        this.f2176u0 = new RunnableC0186A(this, i3);
        this.f2180w0 = 0;
        this.f2182x0 = 0;
        this.f2184y0 = new B(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2135T = viewConfiguration.getScaledTouchSlop();
        this.f2140a0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f2142b0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.f2137V = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2138W = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2139a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2127L.f3373a = b2;
        this.e = new C0188b(new B(this));
        this.f2148f = new C0190d(new B(this));
        WeakHashMap weakHashMap = O.K.f747a;
        if (O.E.a(this) == 0) {
            O.E.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f2118B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new d0(this));
        int[] iArr = AbstractC0176a.f3308a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        O.K.k(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f2152h = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(h.d(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            i2 = 4;
            c2 = 2;
            new C0200n(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.lumenpath.harispro.hrnavigator.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.lumenpath.harispro.hrnavigator.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.lumenpath.harispro.hrnavigator.R.dimen.fastscroll_margin));
        } else {
            i2 = 4;
            c2 = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    Class<? extends U> asSubclass = Class.forName(trim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(K.class);
                    try {
                        constructor = asSubclass.getConstructor(f2115G0);
                        objArr = new Object[i2];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[c2] = Integer.valueOf(i);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            objArr = null;
                            constructor = asSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((K) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e7);
                }
            }
        }
        int[] iArr2 = f2110B0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        O.K.k(this, context, iArr2, attributeSet, obtainStyledAttributes2, i);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(com.lumenpath.harispro.hrnavigator.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        K k2 = this.f2162n;
        if (k2 != null) {
            return k2.t(layoutParams);
        }
        throw new IllegalStateException(h.d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
