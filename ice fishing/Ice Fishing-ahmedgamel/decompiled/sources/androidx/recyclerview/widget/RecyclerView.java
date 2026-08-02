package androidx.recyclerview.widget;

import E2.M;
import G0.b;
import G3.e;
import K.n;
import N.c;
import O.AbstractC0329b0;
import O.C0347q;
import O.C0349t;
import O.InterfaceC0354y;
import O.L;
import O.N;
import O.X;
import O.Y;
import U.d;
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
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.IceFishing.LiveIceFishing.C5248R;
import com.anythink.core.common.d.j;
import com.anythink.expressad.video.module.a.a;
import com.google.android.gms.internal.ads.C2817Tl;
import com.google.android.gms.internal.ads.C3404j1;
import com.google.android.gms.internal.ads.C3698oP;
import com.google.android.gms.internal.ads.WP;
import h.C4543G;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import l.C4659e;
import l4.g;
import m.R0;
import r2.C4900e;
import s.k;
import s0.AbstractC4915a;
import t0.AbstractC4985A;
import t0.AbstractC4987C;
import t0.AbstractC4989E;
import t0.AbstractC4990F;
import t0.AbstractC4998N;
import t0.AbstractC5000P;
import t0.AbstractC5026v;
import t0.AbstractC5030z;
import t0.C4988D;
import t0.C4991G;
import t0.C4992H;
import t0.C4994J;
import t0.C4997M;
import t0.C5001Q;
import t0.C5005a;
import t0.C5012h;
import t0.C5015k;
import t0.C5022r;
import t0.C5024t;
import t0.C5025u;
import t0.C5029y;
import t0.InterfaceC4993I;
import t0.InterfaceC4996L;
import t0.InterfaceC5028x;
import t0.RunnableC4999O;
import t0.RunnableC5017m;
import t0.Z;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0354y {

    /* renamed from: T0, reason: collision with root package name */
    public static final int[] f5175T0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: U0, reason: collision with root package name */
    public static final Class[] f5176U0;

    /* renamed from: V0, reason: collision with root package name */
    public static final b f5177V0;

    /* renamed from: A, reason: collision with root package name */
    public final Rect f5178A;

    /* renamed from: A0, reason: collision with root package name */
    public final RunnableC4999O f5179A0;

    /* renamed from: B, reason: collision with root package name */
    public final Rect f5180B;

    /* renamed from: B0, reason: collision with root package name */
    public RunnableC5017m f5181B0;

    /* renamed from: C, reason: collision with root package name */
    public final RectF f5182C;
    public final C2817Tl C0;

    /* renamed from: D, reason: collision with root package name */
    public AbstractC5026v f5183D;

    /* renamed from: D0, reason: collision with root package name */
    public final C4997M f5184D0;

    /* renamed from: E, reason: collision with root package name */
    public AbstractC4987C f5185E;

    /* renamed from: E0, reason: collision with root package name */
    public AbstractC4990F f5186E0;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f5187F;

    /* renamed from: F0, reason: collision with root package name */
    public ArrayList f5188F0;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f5189G;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f5190G0;

    /* renamed from: H, reason: collision with root package name */
    public C5015k f5191H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f5192H0;

    /* renamed from: I, reason: collision with root package name */
    public boolean f5193I;

    /* renamed from: I0, reason: collision with root package name */
    public final C4543G f5194I0;
    public boolean J;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f5195J0;

    /* renamed from: K, reason: collision with root package name */
    public boolean f5196K;

    /* renamed from: K0, reason: collision with root package name */
    public C5001Q f5197K0;

    /* renamed from: L, reason: collision with root package name */
    public int f5198L;

    /* renamed from: L0, reason: collision with root package name */
    public final int[] f5199L0;

    /* renamed from: M, reason: collision with root package name */
    public boolean f5200M;

    /* renamed from: M0, reason: collision with root package name */
    public C0347q f5201M0;

    /* renamed from: N, reason: collision with root package name */
    public boolean f5202N;

    /* renamed from: N0, reason: collision with root package name */
    public final int[] f5203N0;

    /* renamed from: O, reason: collision with root package name */
    public boolean f5204O;

    /* renamed from: O0, reason: collision with root package name */
    public final int[] f5205O0;

    /* renamed from: P, reason: collision with root package name */
    public int f5206P;

    /* renamed from: P0, reason: collision with root package name */
    public final int[] f5207P0;

    /* renamed from: Q, reason: collision with root package name */
    public final AccessibilityManager f5208Q;

    /* renamed from: Q0, reason: collision with root package name */
    public final ArrayList f5209Q0;

    /* renamed from: R, reason: collision with root package name */
    public boolean f5210R;

    /* renamed from: R0, reason: collision with root package name */
    public final r3.b f5211R0;

    /* renamed from: S, reason: collision with root package name */
    public boolean f5212S;

    /* renamed from: S0, reason: collision with root package name */
    public final R0 f5213S0;

    /* renamed from: T, reason: collision with root package name */
    public int f5214T;

    /* renamed from: U, reason: collision with root package name */
    public int f5215U;

    /* renamed from: V, reason: collision with root package name */
    public C5029y f5216V;

    /* renamed from: W, reason: collision with root package name */
    public EdgeEffect f5217W;

    /* renamed from: i0, reason: collision with root package name */
    public EdgeEffect f5218i0;

    /* renamed from: j0, reason: collision with root package name */
    public EdgeEffect f5219j0;

    /* renamed from: k0, reason: collision with root package name */
    public EdgeEffect f5220k0;

    /* renamed from: l0, reason: collision with root package name */
    public AbstractC5030z f5221l0;
    public int m0;

    /* renamed from: n, reason: collision with root package name */
    public final e f5222n;

    /* renamed from: n0, reason: collision with root package name */
    public int f5223n0;

    /* renamed from: o0, reason: collision with root package name */
    public VelocityTracker f5224o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f5225p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f5226q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f5227r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f5228s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f5229t0;

    /* renamed from: u, reason: collision with root package name */
    public final C3698oP f5230u;

    /* renamed from: u0, reason: collision with root package name */
    public AbstractC4989E f5231u0;

    /* renamed from: v, reason: collision with root package name */
    public C4994J f5232v;

    /* renamed from: v0, reason: collision with root package name */
    public final int f5233v0;

    /* renamed from: w, reason: collision with root package name */
    public final M f5234w;

    /* renamed from: w0, reason: collision with root package name */
    public final int f5235w0;

    /* renamed from: x, reason: collision with root package name */
    public final g f5236x;

    /* renamed from: x0, reason: collision with root package name */
    public final float f5237x0;

    /* renamed from: y, reason: collision with root package name */
    public final WP f5238y;

    /* renamed from: y0, reason: collision with root package name */
    public final float f5239y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5240z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f5241z0;

    static {
        Class cls = Integer.TYPE;
        f5176U0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f5177V0 = new b(2);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5248R.attr.recyclerViewStyle);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView D8 = D(viewGroup.getChildAt(i));
            if (D8 != null) {
                return D8;
            }
        }
        return null;
    }

    public static AbstractC5000P I(View view) {
        if (view == null) {
            return null;
        }
        return ((C4988D) view.getLayoutParams()).f40604a;
    }

    private C0347q getScrollingChildHelper() {
        if (this.f5201M0 == null) {
            this.f5201M0 = new C0347q(this);
        }
        return this.f5201M0;
    }

    public static void j(AbstractC5000P abstractC5000P) {
        WeakReference weakReference = abstractC5000P.f40644b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC5000P.f40643a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC5000P.f40644b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View A(View view) {
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
    public final boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f5189G;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5015k c5015k = (C5015k) arrayList.get(i);
            int i4 = c5015k.f40767v;
            if (i4 == 1) {
                boolean d9 = c5015k.d(motionEvent.getX(), motionEvent.getY());
                boolean c9 = c5015k.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d9 || c9)) {
                    if (c9) {
                        c5015k.f40768w = 1;
                        c5015k.f40761p = (int) motionEvent.getX();
                    } else if (d9) {
                        c5015k.f40768w = 2;
                        c5015k.f40758m = (int) motionEvent.getY();
                    }
                    c5015k.f(2);
                    if (action == 3) {
                        this.f5191H = c5015k;
                        return true;
                    }
                }
            } else {
                if (i4 != 2) {
                    continue;
                }
                if (action == 3) {
                }
            }
        }
        return false;
    }

    public final void C(int[] iArr) {
        int f2 = this.f5236x.f();
        if (f2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < f2; i6++) {
            AbstractC5000P I8 = I(this.f5236x.e(i6));
            if (!I8.o()) {
                int b9 = I8.b();
                if (b9 < i) {
                    i = b9;
                }
                if (b9 > i4) {
                    i4 = b9;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i4;
    }

    public final AbstractC5000P E(int i) {
        AbstractC5000P abstractC5000P = null;
        if (this.f5210R) {
            return null;
        }
        int n9 = this.f5236x.n();
        for (int i4 = 0; i4 < n9; i4++) {
            AbstractC5000P I8 = I(this.f5236x.m(i4));
            if (I8 != null && !I8.h() && F(I8) == i) {
                if (!((ArrayList) this.f5236x.f38918w).contains(I8.f40643a)) {
                    return I8;
                }
                abstractC5000P = I8;
            }
        }
        return abstractC5000P;
    }

    public final int F(AbstractC5000P abstractC5000P) {
        if (((abstractC5000P.f40651j & 524) != 0) || !abstractC5000P.e()) {
            return -1;
        }
        M m9 = this.f5234w;
        int i = abstractC5000P.f40645c;
        ArrayList arrayList = (ArrayList) m9.f762v;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C5005a c5005a = (C5005a) arrayList.get(i4);
            int i6 = c5005a.f40695a;
            if (i6 != 1) {
                if (i6 == 2) {
                    int i9 = c5005a.f40696b;
                    if (i9 <= i) {
                        int i10 = c5005a.f40697c;
                        if (i9 + i10 > i) {
                            return -1;
                        }
                        i -= i10;
                    } else {
                        continue;
                    }
                } else if (i6 == 8) {
                    int i11 = c5005a.f40696b;
                    if (i11 == i) {
                        i = c5005a.f40697c;
                    } else {
                        if (i11 < i) {
                            i--;
                        }
                        if (c5005a.f40697c <= i) {
                            i++;
                        }
                    }
                }
            } else if (c5005a.f40696b <= i) {
                i += c5005a.f40697c;
            }
        }
        return i;
    }

    public final long G(AbstractC5000P abstractC5000P) {
        return this.f5183D.f40830b ? abstractC5000P.f40647e : abstractC5000P.f40645c;
    }

    public final AbstractC5000P H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        C4988D c4988d = (C4988D) view.getLayoutParams();
        boolean z6 = c4988d.f40606c;
        Rect rect = c4988d.f40605b;
        if (!z6 || (this.f5184D0.f40628g && (c4988d.f40604a.k() || c4988d.f40604a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f5187F;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f5178A;
            rect2.set(0, 0, 0, 0);
            ((AbstractC4985A) arrayList.get(i)).getClass();
            ((C4988D) view.getLayoutParams()).f40604a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c4988d.f40606c = false;
        return rect;
    }

    public final boolean K() {
        return !this.f5196K || this.f5210R || this.f5234w.m();
    }

    public final boolean L() {
        return this.f5214T > 0;
    }

    public final void M(int i) {
        if (this.f5185E == null) {
            return;
        }
        setScrollState(2);
        this.f5185E.n0(i);
        awakenScrollBars();
    }

    public final void N() {
        int n9 = this.f5236x.n();
        for (int i = 0; i < n9; i++) {
            ((C4988D) this.f5236x.m(i).getLayoutParams()).f40606c = true;
        }
        ArrayList arrayList = (ArrayList) this.f5230u.f33688e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C4988D c4988d = (C4988D) ((AbstractC5000P) arrayList.get(i4)).f40643a.getLayoutParams();
            if (c4988d != null) {
                c4988d.f40606c = true;
            }
        }
    }

    public final void O(int i, int i4, boolean z6) {
        int i6 = i + i4;
        int n9 = this.f5236x.n();
        for (int i9 = 0; i9 < n9; i9++) {
            AbstractC5000P I8 = I(this.f5236x.m(i9));
            if (I8 != null && !I8.o()) {
                int i10 = I8.f40645c;
                C4997M c4997m = this.f5184D0;
                if (i10 >= i6) {
                    I8.l(-i4, z6);
                    c4997m.f40627f = true;
                } else if (i10 >= i) {
                    I8.a(8);
                    I8.l(-i4, z6);
                    I8.f40645c = i - 1;
                    c4997m.f40627f = true;
                }
            }
        }
        C3698oP c3698oP = this.f5230u;
        ArrayList arrayList = (ArrayList) c3698oP.f33688e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC5000P abstractC5000P = (AbstractC5000P) arrayList.get(size);
            if (abstractC5000P != null) {
                int i11 = abstractC5000P.f40645c;
                if (i11 >= i6) {
                    abstractC5000P.l(-i4, z6);
                } else if (i11 >= i) {
                    abstractC5000P.a(8);
                    c3698oP.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.f5214T++;
    }

    public final void Q(boolean z6) {
        int i;
        AccessibilityManager accessibilityManager;
        int i4 = this.f5214T - 1;
        this.f5214T = i4;
        if (i4 < 1) {
            this.f5214T = 0;
            if (z6) {
                int i6 = this.f5206P;
                this.f5206P = 0;
                if (i6 != 0 && (accessibilityManager = this.f5208Q) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i6);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f5209Q0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC5000P abstractC5000P = (AbstractC5000P) arrayList.get(size);
                    if (abstractC5000P.f40643a.getParent() == this && !abstractC5000P.o() && (i = abstractC5000P.f40658q) != -1) {
                        WeakHashMap weakHashMap = X.f2142a;
                        abstractC5000P.f40643a.setImportantForAccessibility(i);
                        abstractC5000P.f40658q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5223n0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f5223n0 = motionEvent.getPointerId(i);
            int x9 = (int) (motionEvent.getX(i) + 0.5f);
            this.f5227r0 = x9;
            this.f5225p0 = x9;
            int y7 = (int) (motionEvent.getY(i) + 0.5f);
            this.f5228s0 = y7;
            this.f5226q0 = y7;
        }
    }

    public final void S() {
        if (this.f5195J0 || !this.f5193I) {
            return;
        }
        WeakHashMap weakHashMap = X.f2142a;
        postOnAnimation(this.f5211R0);
        this.f5195J0 = true;
    }

    public final void T(AbstractC5000P abstractC5000P, C0349t c0349t) {
        abstractC5000P.f40651j &= -8193;
        boolean z6 = this.f5184D0.f40629h;
        WP wp = this.f5238y;
        if (z6 && abstractC5000P.k() && !abstractC5000P.h() && !abstractC5000P.o()) {
            ((s.e) wp.f29153u).k(G(abstractC5000P), abstractC5000P);
        }
        k kVar = (k) wp.f29152n;
        Z z9 = (Z) kVar.getOrDefault(abstractC5000P, null);
        if (z9 == null) {
            z9 = Z.a();
            kVar.put(abstractC5000P, z9);
        }
        z9.f40693b = c0349t;
        z9.f40692a |= 4;
    }

    public final void U(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f5178A;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C4988D) {
            C4988D c4988d = (C4988D) layoutParams;
            if (!c4988d.f40606c) {
                int i = rect.left;
                Rect rect2 = c4988d.f40605b;
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
        this.f5185E.k0(this, view, this.f5178A, !this.f5196K, view2 == null);
    }

    public final void V() {
        VelocityTracker velocityTracker = this.f5224o0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z6 = false;
        c0(0);
        EdgeEffect edgeEffect = this.f5217W;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z6 = this.f5217W.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5218i0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z6 |= this.f5218i0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5219j0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z6 |= this.f5219j0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5220k0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z6 |= this.f5220k0.isFinished();
        }
        if (z6) {
            WeakHashMap weakHashMap = X.f2142a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean W(int i, int i4, MotionEvent motionEvent) {
        int i6;
        int i9;
        int i10;
        int i11;
        boolean z6;
        boolean z9;
        m();
        AbstractC5026v abstractC5026v = this.f5183D;
        int[] iArr = this.f5207P0;
        if (abstractC5026v != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            X(i, i4, iArr);
            i6 = iArr[0];
            i9 = iArr[1];
            i10 = i - i6;
            i11 = i4 - i9;
        } else {
            i6 = 0;
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if (!this.f5187F.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        s(i6, i9, i10, i11, this.f5203N0, 0, iArr);
        int i12 = iArr[0];
        int i13 = i10 - i12;
        int i14 = iArr[1];
        int i15 = i11 - i14;
        boolean z10 = (i12 == 0 && i14 == 0) ? false : true;
        int i16 = this.f5227r0;
        int[] iArr2 = this.f5203N0;
        int i17 = iArr2[0];
        this.f5227r0 = i16 - i17;
        int i18 = this.f5228s0;
        int i19 = iArr2[1];
        this.f5228s0 = i18 - i19;
        int[] iArr3 = this.f5205O0;
        iArr3[0] = iArr3[0] + i17;
        iArr3[1] = iArr3[1] + i19;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z6 = true;
            } else {
                float x9 = motionEvent.getX();
                float f2 = i13;
                float y7 = motionEvent.getY();
                float f9 = i15;
                if (f2 < 0.0f) {
                    v();
                    z6 = true;
                    d.a(this.f5217W, (-f2) / getWidth(), 1.0f - (y7 / getHeight()));
                } else {
                    z6 = true;
                    if (f2 > 0.0f) {
                        w();
                        d.a(this.f5219j0, f2 / getWidth(), y7 / getHeight());
                    } else {
                        z9 = false;
                        if (f9 >= 0.0f) {
                            x();
                            d.a(this.f5218i0, (-f9) / getHeight(), x9 / getWidth());
                        } else {
                            if (f9 > 0.0f) {
                                u();
                                d.a(this.f5220k0, f9 / getHeight(), 1.0f - (x9 / getWidth()));
                            }
                            if (!z9 || f2 != 0.0f || f9 != 0.0f) {
                                WeakHashMap weakHashMap = X.f2142a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z9 = z6;
                        if (!z9) {
                        }
                        WeakHashMap weakHashMap2 = X.f2142a;
                        postInvalidateOnAnimation();
                    }
                }
                z9 = z6;
                if (f9 >= 0.0f) {
                }
                z9 = z6;
                if (!z9) {
                }
                WeakHashMap weakHashMap22 = X.f2142a;
                postInvalidateOnAnimation();
            }
            l(i, i4);
        } else {
            z6 = true;
        }
        if (i6 != 0 || i9 != 0) {
            t(i6, i9);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z10 && i6 == 0 && i9 == 0) {
            return false;
        }
        return z6;
    }

    public final void X(int i, int i4, int[] iArr) {
        AbstractC5000P abstractC5000P;
        g gVar = this.f5236x;
        a0();
        P();
        int i6 = n.f1594a;
        Trace.beginSection("RV Scroll");
        C4997M c4997m = this.f5184D0;
        z(c4997m);
        C3698oP c3698oP = this.f5230u;
        int m0 = i != 0 ? this.f5185E.m0(i, c3698oP, c4997m) : 0;
        int o02 = i4 != 0 ? this.f5185E.o0(i4, c3698oP, c4997m) : 0;
        Trace.endSection();
        int f2 = gVar.f();
        for (int i9 = 0; i9 < f2; i9++) {
            View e9 = gVar.e(i9);
            AbstractC5000P H8 = H(e9);
            if (H8 != null && (abstractC5000P = H8.i) != null) {
                int left = e9.getLeft();
                int top = e9.getTop();
                View view = abstractC5000P.f40643a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        b0(false);
        if (iArr != null) {
            iArr[0] = m0;
            iArr[1] = o02;
        }
    }

    public final void Y(int i) {
        C5022r c5022r;
        if (this.f5202N) {
            return;
        }
        setScrollState(0);
        RunnableC4999O runnableC4999O = this.f5179A0;
        runnableC4999O.f40641z.removeCallbacks(runnableC4999O);
        runnableC4999O.f40637v.abortAnimation();
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C != null && (c5022r = abstractC4987C.f40594e) != null) {
            c5022r.i();
        }
        AbstractC4987C abstractC4987C2 = this.f5185E;
        if (abstractC4987C2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC4987C2.n0(i);
            awakenScrollBars();
        }
    }

    public final void Z(int i, int i4, boolean z6) {
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5202N) {
            return;
        }
        if (!abstractC4987C.d()) {
            i = 0;
        }
        if (!this.f5185E.e()) {
            i4 = 0;
        }
        if (i == 0 && i4 == 0) {
            return;
        }
        if (z6) {
            int i6 = i != 0 ? 1 : 0;
            if (i4 != 0) {
                i6 |= 2;
            }
            getScrollingChildHelper().g(i6, 1);
        }
        this.f5179A0.b(i, i4, Integer.MIN_VALUE, null);
    }

    public final void a0() {
        int i = this.f5198L + 1;
        this.f5198L = i;
        if (i != 1 || this.f5202N) {
            return;
        }
        this.f5200M = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i4) {
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C != null) {
            abstractC4987C.getClass();
        }
        super.addFocusables(arrayList, i, i4);
    }

    public final void b0(boolean z6) {
        if (this.f5198L < 1) {
            this.f5198L = 1;
        }
        if (!z6 && !this.f5202N) {
            this.f5200M = false;
        }
        if (this.f5198L == 1) {
            if (z6 && this.f5200M && !this.f5202N && this.f5185E != null && this.f5183D != null) {
                o();
            }
            if (!this.f5202N) {
                this.f5200M = false;
            }
        }
        this.f5198L--;
    }

    public final void c0(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C4988D) && this.f5185E.f((C4988D) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C != null && abstractC4987C.d()) {
            return this.f5185E.j(this.f5184D0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C != null && abstractC4987C.d()) {
            return this.f5185E.k(this.f5184D0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C != null && abstractC4987C.d()) {
            return this.f5185E.l(this.f5184D0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C != null && abstractC4987C.e()) {
            return this.f5185E.m(this.f5184D0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C != null && abstractC4987C.e()) {
            return this.f5185E.n(this.f5184D0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C != null && abstractC4987C.e()) {
            return this.f5185E.o(this.f5184D0);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f9, boolean z6) {
        return getScrollingChildHelper().a(f2, f9, z6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f9) {
        return getScrollingChildHelper().b(f2, f9);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i4, int i6, int i9, int[] iArr) {
        return getScrollingChildHelper().d(i, i4, i6, i9, iArr, 0, null);
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
        boolean z6;
        super.draw(canvas);
        ArrayList arrayList = this.f5187F;
        int size = arrayList.size();
        boolean z9 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC4985A) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f5217W;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z6 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f5240z ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f5217W;
            z6 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f5218i0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f5240z) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f5218i0;
            z6 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f5219j0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f5240z ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f5219j0;
            z6 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f5220k0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f5240z) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f5220k0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z9 = true;
            }
            z6 |= z9;
            canvas.restoreToCount(save4);
        }
        if ((z6 || this.f5221l0 == null || arrayList.size() <= 0 || !this.f5221l0.f()) ? z6 : true) {
            WeakHashMap weakHashMap = X.f2142a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        return super.drawChild(canvas, view, j6);
    }

    public final void f(AbstractC5000P abstractC5000P) {
        View view = abstractC5000P.f40643a;
        boolean z6 = view.getParent() == this;
        this.f5230u.j(H(view));
        if (abstractC5000P.j()) {
            this.f5236x.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z6) {
            this.f5236x.a(view, -1, true);
            return;
        }
        g gVar = this.f5236x;
        int indexOfChild = ((RecyclerView) ((C4659e) gVar.f38916u).f38688u).indexOfChild(view);
        if (indexOfChild >= 0) {
            ((C3404j1) gVar.f38917v).w(indexOfChild);
            gVar.p(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x018c, code lost:
    
        if ((r5 * r6) < 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0194, code lost:
    
        if ((r5 * r6) > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015e, code lost:
    
        if (r7 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x017e, code lost:
    
        if (r5 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0181, code lost:
    
        if (r7 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0184, code lost:
    
        if (r5 < 0) goto L135;
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
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View view2;
        int i4;
        char c9;
        boolean z6;
        this.f5185E.getClass();
        boolean z9 = true;
        boolean z10 = (this.f5183D == null || this.f5185E == null || L() || this.f5202N) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        C4997M c4997m = this.f5184D0;
        C3698oP c3698oP = this.f5230u;
        if (z10 && (i == 2 || i == 1)) {
            if (this.f5185E.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? a.f22518U : 33) == null) {
                    z6 = true;
                    if (!z6 && this.f5185E.d()) {
                        z6 = focusFinder.findNextFocus(this, view, !((this.f5185E.C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z6) {
                        m();
                        if (A(view) != null) {
                            a0();
                            this.f5185E.S(view, i, c3698oP, c4997m);
                            b0(false);
                        }
                        return null;
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                    if (view2 == null) {
                    }
                    if (view2 != null) {
                        if (A(view2) != null) {
                        }
                        if (z9) {
                        }
                    }
                    z9 = false;
                    if (z9) {
                    }
                }
            }
            z6 = false;
            if (!z6) {
                if (focusFinder.findNextFocus(this, view, !((this.f5185E.C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z6) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            z9 = false;
            if (z9) {
            }
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z10) {
                m();
                if (A(view) != null) {
                    a0();
                    view2 = this.f5185E.S(view, i, c3698oP, c4997m);
                    b0(false);
                }
                return null;
            }
            view2 = findNextFocus;
            if (view2 == null && !view2.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i);
                }
                U(view2, null);
                return view;
            }
            if (view2 != null && view2 != this) {
                if (A(view2) != null) {
                    z9 = false;
                } else if (view != null && A(view) != null) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    Rect rect = this.f5178A;
                    rect.set(0, 0, width, height);
                    int width2 = view2.getWidth();
                    int height2 = view2.getHeight();
                    Rect rect2 = this.f5180B;
                    rect2.set(0, 0, width2, height2);
                    offsetDescendantRectToMyCoords(view, rect);
                    offsetDescendantRectToMyCoords(view2, rect2);
                    int i6 = this.f5185E.C() == 1 ? -1 : 1;
                    int i9 = rect.left;
                    int i10 = rect2.left;
                    if ((i9 < i10 || rect.right <= i10) && rect.right < rect2.right) {
                        i4 = 1;
                    } else {
                        int i11 = rect.right;
                        int i12 = rect2.right;
                        i4 = ((i11 > i12 || i9 >= i12) && i9 > i10) ? -1 : 0;
                    }
                    int i13 = rect.top;
                    int i14 = rect2.top;
                    if ((i13 < i14 || rect.bottom <= i14) && rect.bottom < rect2.bottom) {
                        c9 = 1;
                    } else {
                        int i15 = rect.bottom;
                        int i16 = rect2.bottom;
                        c9 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? (char) 65535 : (char) 0;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 17) {
                                if (i != 33) {
                                    if (i != 66) {
                                        if (i != 130) {
                                            throw new IllegalArgumentException("Invalid direction: " + i + y());
                                        }
                                    }
                                }
                            }
                        } else if (c9 <= 0) {
                            if (c9 == 0) {
                            }
                        }
                    } else if (c9 >= 0) {
                        if (c9 == 0) {
                        }
                    }
                }
                return z9 ? view2 : super.focusSearch(view, i);
            }
            z9 = false;
            if (z9) {
            }
        }
    }

    public final void g(AbstractC4985A abstractC4985A) {
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C != null) {
            abstractC4987C.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f5187F;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC4985A);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C != null) {
            return abstractC4987C.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C != null) {
            return abstractC4987C.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC5026v getAdapter() {
        return this.f5183D;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C == null) {
            return super.getBaseline();
        }
        abstractC4987C.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i4) {
        return super.getChildDrawingOrder(i, i4);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f5240z;
    }

    public C5001Q getCompatAccessibilityDelegate() {
        return this.f5197K0;
    }

    public C5029y getEdgeEffectFactory() {
        return this.f5216V;
    }

    public AbstractC5030z getItemAnimator() {
        return this.f5221l0;
    }

    public int getItemDecorationCount() {
        return this.f5187F.size();
    }

    public AbstractC4987C getLayoutManager() {
        return this.f5185E;
    }

    public int getMaxFlingVelocity() {
        return this.f5235w0;
    }

    public int getMinFlingVelocity() {
        return this.f5233v0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AbstractC4989E getOnFlingListener() {
        return this.f5231u0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f5241z0;
    }

    public C4992H getRecycledViewPool() {
        return this.f5230u.c();
    }

    public int getScrollState() {
        return this.m0;
    }

    public final void h(AbstractC4990F abstractC4990F) {
        if (this.f5188F0 == null) {
            this.f5188F0 = new ArrayList();
        }
        this.f5188F0.add(abstractC4990F);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
        }
        if (this.f5215U > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f5193I;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f5202N;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2216d;
    }

    public final void k() {
        int n9 = this.f5236x.n();
        for (int i = 0; i < n9; i++) {
            AbstractC5000P I8 = I(this.f5236x.m(i));
            if (!I8.o()) {
                I8.f40646d = -1;
                I8.f40649g = -1;
            }
        }
        C3698oP c3698oP = this.f5230u;
        ArrayList arrayList = (ArrayList) c3698oP.f33688e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC5000P abstractC5000P = (AbstractC5000P) arrayList.get(i4);
            abstractC5000P.f40646d = -1;
            abstractC5000P.f40649g = -1;
        }
        ArrayList arrayList2 = (ArrayList) c3698oP.f33686c;
        int size2 = arrayList2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            AbstractC5000P abstractC5000P2 = (AbstractC5000P) arrayList2.get(i6);
            abstractC5000P2.f40646d = -1;
            abstractC5000P2.f40649g = -1;
        }
        ArrayList arrayList3 = (ArrayList) c3698oP.f33687d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i9 = 0; i9 < size3; i9++) {
                AbstractC5000P abstractC5000P3 = (AbstractC5000P) ((ArrayList) c3698oP.f33687d).get(i9);
                abstractC5000P3.f40646d = -1;
                abstractC5000P3.f40649g = -1;
            }
        }
    }

    public final void l(int i, int i4) {
        boolean z6;
        EdgeEffect edgeEffect = this.f5217W;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z6 = false;
        } else {
            this.f5217W.onRelease();
            z6 = this.f5217W.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5219j0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f5219j0.onRelease();
            z6 |= this.f5219j0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5218i0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.f5218i0.onRelease();
            z6 |= this.f5218i0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5220k0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.f5220k0.onRelease();
            z6 |= this.f5220k0.isFinished();
        }
        if (z6) {
            WeakHashMap weakHashMap = X.f2142a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        M m9 = this.f5234w;
        if (!this.f5196K || this.f5210R) {
            int i = n.f1594a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        if (m9.m()) {
            m9.getClass();
            if (m9.m()) {
                int i4 = n.f1594a;
                Trace.beginSection("RV FullInvalidate");
                o();
                Trace.endSection();
            }
        }
    }

    public final void n(int i, int i4) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = X.f2142a;
        setMeasuredDimension(AbstractC4987C.g(i, paddingRight, getMinimumWidth()), AbstractC4987C.g(i4, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0341, code lost:
    
        if (((java.util.ArrayList) r21.f5236x.f38918w).contains(getFocusedChild()) == false) goto L216;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ed  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [t0.P] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        boolean z6;
        ?? r11;
        View findViewById;
        boolean z9;
        C0349t c0349t;
        ?? r32;
        RecyclerView recyclerView;
        boolean g9;
        boolean z10;
        if (this.f5183D == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f5185E == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        C4997M c4997m = this.f5184D0;
        boolean z11 = false;
        c4997m.i = false;
        boolean z12 = true;
        if (c4997m.f40625d == 1) {
            p();
            this.f5185E.p0(this);
            q();
        } else {
            M m9 = this.f5234w;
            if ((((ArrayList) m9.f763w).isEmpty() || ((ArrayList) m9.f762v).isEmpty()) && this.f5185E.f40602n == getWidth() && this.f5185E.f40603o == getHeight()) {
                this.f5185E.p0(this);
            } else {
                this.f5185E.p0(this);
                q();
            }
        }
        c4997m.a(4);
        a0();
        P();
        c4997m.f40625d = 1;
        boolean z13 = c4997m.f40630j;
        View view = null;
        Long l9 = null;
        C3698oP c3698oP = this.f5230u;
        WP wp = this.f5238y;
        if (z13) {
            int f2 = this.f5236x.f() - 1;
            while (f2 >= 0) {
                AbstractC5000P I8 = I(this.f5236x.e(f2));
                if (I8.o()) {
                    z10 = z12;
                } else {
                    long G2 = G(I8);
                    this.f5221l0.getClass();
                    C0349t c0349t2 = new C0349t();
                    c0349t2.a(I8);
                    AbstractC5000P abstractC5000P = (AbstractC5000P) ((s.e) wp.f29153u).j(G2, l9);
                    if (abstractC5000P == null || abstractC5000P.o()) {
                        z10 = z12;
                        wp.c(I8, c0349t2);
                    } else {
                        k kVar = (k) wp.f29152n;
                        z10 = z12;
                        Z z14 = (Z) kVar.getOrDefault(abstractC5000P, l9);
                        boolean z15 = (z14 == null || (z14.f40692a & 1) == 0) ? false : z10;
                        Z z16 = (Z) kVar.getOrDefault(I8, l9);
                        boolean z17 = (z16 == null || (z16.f40692a & 1) == 0) ? false : z10;
                        if (z15 && abstractC5000P == I8) {
                            wp.c(I8, c0349t2);
                        } else {
                            C0349t f9 = wp.f(abstractC5000P, 4);
                            wp.c(I8, c0349t2);
                            C0349t f10 = wp.f(I8, 8);
                            if (f9 == null) {
                                int f11 = this.f5236x.f();
                                for (int i = 0; i < f11; i++) {
                                    AbstractC5000P I9 = I(this.f5236x.e(i));
                                    if (I9 != I8 && G(I9) == G2) {
                                        AbstractC5026v abstractC5026v = this.f5183D;
                                        if (abstractC5026v == null || !abstractC5026v.f40830b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + I9 + " \n View Holder 2:" + I8 + y());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + I9 + " \n View Holder 2:" + I8 + y());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC5000P + " cannot be found but it is necessary for " + I8 + y());
                            } else {
                                abstractC5000P.n(false);
                                if (z15) {
                                    f(abstractC5000P);
                                }
                                if (abstractC5000P != I8) {
                                    if (z17) {
                                        f(I8);
                                    }
                                    abstractC5000P.f40650h = I8;
                                    f(abstractC5000P);
                                    c3698oP.j(abstractC5000P);
                                    I8.n(false);
                                    I8.i = abstractC5000P;
                                }
                                if (this.f5221l0.a(abstractC5000P, I8, f9, f10)) {
                                    S();
                                }
                            }
                        }
                    }
                }
                f2--;
                z12 = z10;
                l9 = null;
            }
            z6 = z12;
            k kVar2 = (k) wp.f29152n;
            int i4 = kVar2.f40276v - 1;
            while (i4 >= 0) {
                AbstractC5000P abstractC5000P2 = (AbstractC5000P) kVar2.h(i4);
                Z z18 = (Z) kVar2.j(i4);
                int i6 = z18.f40692a;
                int i9 = i6 & 3;
                R0 r02 = this.f5213S0;
                if (i9 == 3) {
                    RecyclerView recyclerView2 = (RecyclerView) r02.f39127n;
                    recyclerView2.f5185E.i0(abstractC5000P2.f40643a, recyclerView2.f5230u);
                    r32 = z11;
                } else if ((i6 & 1) != 0) {
                    C0349t c0349t3 = z18.f40693b;
                    if (c0349t3 == null) {
                        RecyclerView recyclerView3 = (RecyclerView) r02.f39127n;
                        recyclerView3.f5185E.i0(abstractC5000P2.f40643a, recyclerView3.f5230u);
                        r32 = z11;
                    } else {
                        r02.f(abstractC5000P2, c0349t3, z18.f40694c);
                        r32 = z11;
                    }
                } else if ((i6 & 14) == 14) {
                    r02.d(abstractC5000P2, z18.f40693b, z18.f40694c);
                    r32 = z11;
                } else if ((i6 & 12) == 12) {
                    C0349t c0349t4 = z18.f40693b;
                    C0349t c0349t5 = z18.f40694c;
                    r02.getClass();
                    abstractC5000P2.n(z11);
                    RecyclerView recyclerView4 = (RecyclerView) r02.f39127n;
                    if (!recyclerView4.f5210R) {
                        C5012h c5012h = (C5012h) recyclerView4.f5221l0;
                        c5012h.getClass();
                        int i10 = c0349t4.f2221a;
                        int i11 = c0349t5.f2221a;
                        if (i10 == i11 && c0349t4.f2222b == c0349t5.f2222b) {
                            c5012h.c(abstractC5000P2);
                            recyclerView = recyclerView4;
                            g9 = false;
                        } else {
                            recyclerView = recyclerView4;
                            g9 = c5012h.g(abstractC5000P2, i10, c0349t4.f2222b, i11, c0349t5.f2222b);
                        }
                        if (g9) {
                            recyclerView.S();
                        }
                    } else if (recyclerView4.f5221l0.a(abstractC5000P2, abstractC5000P2, c0349t4, c0349t5)) {
                        recyclerView4.S();
                    }
                    r32 = 0;
                } else {
                    if ((i6 & 4) != 0) {
                        c0349t = null;
                        r02.f(abstractC5000P2, z18.f40693b, null);
                    } else {
                        c0349t = null;
                        if ((i6 & 8) != 0) {
                            r02.d(abstractC5000P2, z18.f40693b, z18.f40694c);
                        }
                    }
                    r32 = 0;
                    z18.f40692a = r32;
                    z18.f40693b = c0349t;
                    z18.f40694c = c0349t;
                    Z.f40691d.c(z18);
                    i4--;
                    z11 = false;
                }
                c0349t = null;
                z18.f40692a = r32;
                z18.f40693b = c0349t;
                z18.f40694c = c0349t;
                Z.f40691d.c(z18);
                i4--;
                z11 = false;
            }
            view = null;
        } else {
            z6 = true;
        }
        this.f5185E.h0(c3698oP);
        c4997m.f40623b = c4997m.f40626e;
        this.f5210R = false;
        this.f5212S = false;
        c4997m.f40630j = false;
        c4997m.f40631k = false;
        this.f5185E.f40595f = false;
        ArrayList arrayList = (ArrayList) c3698oP.f33687d;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C.f40599k) {
            abstractC4987C.f40598j = 0;
            abstractC4987C.f40599k = false;
            c3698oP.k();
        }
        this.f5185E.c0(c4997m);
        Q(z6);
        b0(false);
        ((k) wp.f29152n).clear();
        ((s.e) wp.f29153u).h();
        int[] iArr = this.f5199L0;
        int i12 = iArr[0];
        int i13 = iArr[1];
        C(iArr);
        if ((iArr[0] == i12 && iArr[1] == i13) ? false : true) {
            t(0, 0);
        }
        if (this.f5241z0 && this.f5183D != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j6 = c4997m.f40633m;
            if (j6 != -1 && (z9 = this.f5183D.f40830b) && z9) {
                int n9 = this.f5236x.n();
                int i14 = 0;
                r11 = view;
                while (true) {
                    if (i14 >= n9) {
                        break;
                    }
                    AbstractC5000P I10 = I(this.f5236x.m(i14));
                    if (I10 != null && !I10.h() && I10.f40647e == j6) {
                        if (!((ArrayList) this.f5236x.f38918w).contains(I10.f40643a)) {
                            r11 = I10;
                            break;
                        }
                        r11 = I10;
                    }
                    i14++;
                    r11 = r11;
                }
            } else {
                r11 = view;
            }
            if (r11 != null) {
                ArrayList arrayList2 = (ArrayList) this.f5236x.f38918w;
                View view2 = r11.f40643a;
                if (!arrayList2.contains(view2) && view2.hasFocusable()) {
                    view = view2;
                    if (view != null) {
                        int i15 = c4997m.f40634n;
                        if (i15 != -1 && (findViewById = view.findViewById(i15)) != null && findViewById.isFocusable()) {
                            view = findViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
            if (this.f5236x.f() > 0) {
                int i16 = c4997m.f40632l;
                int i17 = i16 != -1 ? i16 : 0;
                int b9 = c4997m.b();
                for (int i18 = i17; i18 < b9; i18++) {
                    AbstractC5000P E8 = E(i18);
                    if (E8 == null) {
                        break;
                    }
                    View view3 = E8.f40643a;
                    if (view3.hasFocusable()) {
                        view = view3;
                        break;
                    }
                }
                int min = Math.min(b9, i17) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    AbstractC5000P E9 = E(min);
                    if (E9 == null) {
                        break;
                    }
                    View view4 = E9.f40643a;
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
        c4997m.f40633m = -1L;
        c4997m.f40632l = -1;
        c4997m.f40634n = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f2;
        super.onAttachedToWindow();
        this.f5214T = 0;
        this.f5193I = true;
        this.f5196K = this.f5196K && !isLayoutRequested();
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C != null) {
            abstractC4987C.f40596g = true;
            abstractC4987C.Q(this);
        }
        this.f5195J0 = false;
        ThreadLocal threadLocal = RunnableC5017m.f40777x;
        RunnableC5017m runnableC5017m = (RunnableC5017m) threadLocal.get();
        this.f5181B0 = runnableC5017m;
        if (runnableC5017m == null) {
            RunnableC5017m runnableC5017m2 = new RunnableC5017m();
            runnableC5017m2.f40779n = new ArrayList();
            runnableC5017m2.f40782w = new ArrayList();
            this.f5181B0 = runnableC5017m2;
            WeakHashMap weakHashMap = X.f2142a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f2 = display.getRefreshRate();
            }
            f2 = 60.0f;
            RunnableC5017m runnableC5017m3 = this.f5181B0;
            runnableC5017m3.f40781v = (long) (1.0E9f / f2);
            threadLocal.set(runnableC5017m3);
        }
        this.f5181B0.f40779n.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C5022r c5022r;
        super.onDetachedFromWindow();
        AbstractC5030z abstractC5030z = this.f5221l0;
        if (abstractC5030z != null) {
            abstractC5030z.e();
        }
        setScrollState(0);
        RunnableC4999O runnableC4999O = this.f5179A0;
        runnableC4999O.f40641z.removeCallbacks(runnableC4999O);
        runnableC4999O.f40637v.abortAnimation();
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C != null && (c5022r = abstractC4987C.f40594e) != null) {
            c5022r.i();
        }
        this.f5193I = false;
        AbstractC4987C abstractC4987C2 = this.f5185E;
        if (abstractC4987C2 != null) {
            abstractC4987C2.f40596g = false;
            abstractC4987C2.R(this);
        }
        this.f5209Q0.clear();
        removeCallbacks(this.f5211R0);
        this.f5238y.getClass();
        while (Z.f40691d.a() != null) {
        }
        RunnableC5017m runnableC5017m = this.f5181B0;
        if (runnableC5017m != null) {
            runnableC5017m.f40779n.remove(this);
            this.f5181B0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f5187F;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC4985A) arrayList.get(i)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f9;
        if (this.f5185E != null && !this.f5202N && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f5185E.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f5185E.d()) {
                    f9 = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || f9 != 0.0f) {
                        W((int) (f9 * this.f5237x0), (int) (f2 * this.f5239y0), motionEvent);
                    }
                }
                f9 = 0.0f;
                if (f2 == 0.0f) {
                }
                W((int) (f9 * this.f5237x0), (int) (f2 * this.f5239y0), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f5185E.e()) {
                        f2 = -axisValue;
                        f9 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        W((int) (f9 * this.f5237x0), (int) (f2 * this.f5239y0), motionEvent);
                    } else if (this.f5185E.d()) {
                        f9 = axisValue;
                        f2 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        W((int) (f9 * this.f5237x0), (int) (f2 * this.f5239y0), motionEvent);
                    }
                }
                f2 = 0.0f;
                f9 = 0.0f;
                if (f2 == 0.0f) {
                }
                W((int) (f9 * this.f5237x0), (int) (f2 * this.f5239y0), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        if (!this.f5202N) {
            this.f5191H = null;
            if (B(motionEvent)) {
                V();
                setScrollState(0);
                return true;
            }
            AbstractC4987C abstractC4987C = this.f5185E;
            if (abstractC4987C != null) {
                boolean d9 = abstractC4987C.d();
                boolean e9 = this.f5185E.e();
                if (this.f5224o0 == null) {
                    this.f5224o0 = VelocityTracker.obtain();
                }
                this.f5224o0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f5204O) {
                        this.f5204O = false;
                    }
                    this.f5223n0 = motionEvent.getPointerId(0);
                    int x9 = (int) (motionEvent.getX() + 0.5f);
                    this.f5227r0 = x9;
                    this.f5225p0 = x9;
                    int y7 = (int) (motionEvent.getY() + 0.5f);
                    this.f5228s0 = y7;
                    this.f5226q0 = y7;
                    if (this.m0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        c0(1);
                    }
                    int[] iArr = this.f5205O0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = d9;
                    if (e9) {
                        i = (d9 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
                } else if (actionMasked == 1) {
                    this.f5224o0.clear();
                    c0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f5223n0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5223n0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y9 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.m0 != 1) {
                        int i4 = x10 - this.f5225p0;
                        int i6 = y9 - this.f5226q0;
                        if (d9 == 0 || Math.abs(i4) <= this.f5229t0) {
                            z6 = false;
                        } else {
                            this.f5227r0 = x10;
                            z6 = true;
                        }
                        if (e9 && Math.abs(i6) > this.f5229t0) {
                            this.f5228s0 = y9;
                            z6 = true;
                        }
                        if (z6) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    V();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f5223n0 = motionEvent.getPointerId(actionIndex);
                    int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f5227r0 = x11;
                    this.f5225p0 = x11;
                    int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f5228s0 = y10;
                    this.f5226q0 = y10;
                } else if (actionMasked == 6) {
                    R(motionEvent);
                }
                if (this.m0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        int i10 = n.f1594a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f5196K = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C == null) {
            n(i, i4);
            return;
        }
        boolean L2 = abstractC4987C.L();
        C4997M c4997m = this.f5184D0;
        if (!L2) {
            if (this.J) {
                this.f5185E.f40591b.n(i, i4);
                return;
            }
            if (c4997m.f40631k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC5026v abstractC5026v = this.f5183D;
            if (abstractC5026v != null) {
                c4997m.f40626e = abstractC5026v.a();
            } else {
                c4997m.f40626e = 0;
            }
            a0();
            this.f5185E.f40591b.n(i, i4);
            b0(false);
            c4997m.f40628g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        this.f5185E.f40591b.n(i, i4);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f5183D == null) {
            return;
        }
        if (c4997m.f40625d == 1) {
            p();
        }
        this.f5185E.q0(i, i4);
        c4997m.i = true;
        q();
        this.f5185E.s0(i, i4);
        if (this.f5185E.v0()) {
            this.f5185E.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            c4997m.i = true;
            q();
            this.f5185E.s0(i, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C4994J)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4994J c4994j = (C4994J) parcelable;
        this.f5232v = c4994j;
        super.onRestoreInstanceState(c4994j.f3390n);
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C == null || (parcelable2 = this.f5232v.f40614v) == null) {
            return;
        }
        abstractC4987C.d0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C4994J c4994j = new C4994J(super.onSaveInstanceState());
        C4994J c4994j2 = this.f5232v;
        if (c4994j2 != null) {
            c4994j.f40614v = c4994j2.f40614v;
            return c4994j;
        }
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C != null) {
            c4994j.f40614v = abstractC4987C.e0();
            return c4994j;
        }
        c4994j.f40614v = null;
        return c4994j;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i6, int i9) {
        super.onSizeChanged(i, i4, i6, i9);
        if (i == i6 && i4 == i9) {
            return;
        }
        this.f5220k0 = null;
        this.f5218i0 = null;
        this.f5219j0 = null;
        this.f5217W = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x0405, code lost:
    
        if (r2 < r5) goto L193;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0211  */
    /* JADX WARN: Type inference failed for: r9v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v45 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        int i;
        int minFlingVelocity;
        boolean z9;
        C5024t c5024t;
        float f2;
        int H8;
        PointF a9;
        int i4;
        int i6;
        boolean z10;
        if (!this.f5202N && !this.f5204O) {
            C5015k c5015k = this.f5191H;
            if (c5015k == null) {
                z6 = motionEvent.getAction() == 0 ? false : B(motionEvent);
            } else {
                if (c5015k.f40767v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean d9 = c5015k.d(motionEvent.getX(), motionEvent.getY());
                        boolean c9 = c5015k.c(motionEvent.getX(), motionEvent.getY());
                        if (d9 || c9) {
                            if (c9) {
                                c5015k.f40768w = 1;
                                c5015k.f40761p = (int) motionEvent.getX();
                            } else if (d9) {
                                c5015k.f40768w = 2;
                                c5015k.f40758m = (int) motionEvent.getY();
                            }
                            c5015k.f(2);
                        }
                    } else if (motionEvent.getAction() == 1 && c5015k.f40767v == 2) {
                        c5015k.f40758m = 0.0f;
                        c5015k.f40761p = 0.0f;
                        c5015k.f(1);
                        c5015k.f40768w = 0;
                    } else if (motionEvent.getAction() == 2 && c5015k.f40767v == 2) {
                        c5015k.g();
                        int i9 = c5015k.f40768w;
                        int i10 = c5015k.f40748b;
                        if (i9 == 1) {
                            float x9 = motionEvent.getX();
                            int[] iArr = c5015k.f40770y;
                            iArr[0] = i10;
                            int i11 = c5015k.f40762q - i10;
                            iArr[1] = i11;
                            float max = Math.max(i10, Math.min(i11, x9));
                            if (Math.abs(c5015k.f40760o - max) >= 2.0f) {
                                int e9 = C5015k.e(c5015k.f40761p, max, iArr, c5015k.f40764s.computeHorizontalScrollRange(), c5015k.f40764s.computeHorizontalScrollOffset(), c5015k.f40762q);
                                if (e9 != 0) {
                                    c5015k.f40764s.scrollBy(e9, 0);
                                }
                                c5015k.f40761p = max;
                            }
                        }
                        if (c5015k.f40768w == 2) {
                            float y7 = motionEvent.getY();
                            int[] iArr2 = c5015k.f40769x;
                            iArr2[0] = i10;
                            int i12 = c5015k.f40763r - i10;
                            iArr2[1] = i12;
                            float max2 = Math.max(i10, Math.min(i12, y7));
                            if (Math.abs(c5015k.f40757l - max2) >= 2.0f) {
                                int e10 = C5015k.e(c5015k.f40758m, max2, iArr2, c5015k.f40764s.computeVerticalScrollRange(), c5015k.f40764s.computeVerticalScrollOffset(), c5015k.f40763r);
                                if (e10 != 0) {
                                    c5015k.f40764s.scrollBy(0, e10);
                                }
                                c5015k.f40758m = max2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f5191H = null;
                }
                z6 = true;
            }
            if (z6) {
                V();
                setScrollState(0);
                return true;
            }
            AbstractC4987C abstractC4987C = this.f5185E;
            if (abstractC4987C != null) {
                boolean d10 = abstractC4987C.d();
                boolean e11 = this.f5185E.e();
                if (this.f5224o0 == null) {
                    this.f5224o0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.f5205O0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked == 0) {
                    this.f5223n0 = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.f5227r0 = x10;
                    this.f5225p0 = x10;
                    int y9 = (int) (motionEvent.getY() + 0.5f);
                    this.f5228s0 = y9;
                    this.f5226q0 = y9;
                    int i13 = d10;
                    if (e11) {
                        i13 = (d10 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i13, 0);
                } else {
                    if (actionMasked == 1) {
                        this.f5224o0.addMovement(obtain);
                        VelocityTracker velocityTracker = this.f5224o0;
                        int i14 = this.f5235w0;
                        velocityTracker.computeCurrentVelocity(1000, i14);
                        float f9 = d10 != 0 ? -this.f5224o0.getXVelocity(this.f5223n0) : 0.0f;
                        float f10 = e11 ? -this.f5224o0.getYVelocity(this.f5223n0) : 0.0f;
                        if (f9 == 0.0f && f10 == 0.0f) {
                            i6 = 0;
                        } else {
                            int i15 = (int) f9;
                            int i16 = (int) f10;
                            AbstractC4987C abstractC4987C2 = this.f5185E;
                            if (abstractC4987C2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.f5202N) {
                                int d11 = abstractC4987C2.d();
                                boolean e12 = this.f5185E.e();
                                int i17 = this.f5233v0;
                                if (d11 == 0 || Math.abs(i15) < i17) {
                                    i15 = 0;
                                }
                                if (!e12 || Math.abs(i16) < i17) {
                                    i16 = 0;
                                }
                                if (i15 != 0 || i16 != 0) {
                                    float f11 = i15;
                                    float f12 = i16;
                                    if (!dispatchNestedPreFling(f11, f12)) {
                                        boolean z11 = d11 != 0 || e12;
                                        dispatchNestedFling(f11, f12, z11);
                                        AbstractC4989E abstractC4989E = this.f5231u0;
                                        if (abstractC4989E != null) {
                                            C5025u c5025u = (C5025u) abstractC4989E;
                                            AbstractC4987C layoutManager = c5025u.f40825a.getLayoutManager();
                                            if (layoutManager != 0 && c5025u.f40825a.getAdapter() != null && ((Math.abs(i16) > (minFlingVelocity = c5025u.f40825a.getMinFlingVelocity()) || Math.abs(i15) > minFlingVelocity) && ((z9 = layoutManager instanceof InterfaceC4996L)))) {
                                                if (z9) {
                                                    f2 = 0.0f;
                                                    c5024t = new C5024t(0, c5025u.f40825a.getContext(), c5025u);
                                                } else {
                                                    f2 = 0.0f;
                                                    c5024t = null;
                                                }
                                                if (c5024t != null) {
                                                    int B3 = layoutManager.B();
                                                    if (B3 != 0) {
                                                        androidx.emoji2.text.g e13 = layoutManager.e() ? c5025u.e(layoutManager) : layoutManager.d() ? c5025u.d(layoutManager) : null;
                                                        if (e13 != null) {
                                                            int v9 = layoutManager.v();
                                                            int i18 = Integer.MIN_VALUE;
                                                            int i19 = Integer.MAX_VALUE;
                                                            View view = null;
                                                            View view2 = null;
                                                            i = 1;
                                                            int i20 = 0;
                                                            while (i20 < v9) {
                                                                int i21 = v9;
                                                                View u6 = layoutManager.u(i20);
                                                                if (u6 == null) {
                                                                    i4 = i20;
                                                                } else {
                                                                    i4 = i20;
                                                                    int b9 = C5025u.b(u6, e13);
                                                                    if (b9 <= 0 && b9 > i18) {
                                                                        view2 = u6;
                                                                        i18 = b9;
                                                                    }
                                                                    if (b9 >= 0 && b9 < i19) {
                                                                        view = u6;
                                                                        i19 = b9;
                                                                    }
                                                                }
                                                                i20 = i4 + 1;
                                                                v9 = i21;
                                                            }
                                                            boolean z12 = !layoutManager.d() ? i16 <= 0 : i15 <= 0;
                                                            if (z12 && view != null) {
                                                                H8 = AbstractC4987C.H(view);
                                                            } else if (z12 || view2 == null) {
                                                                if (z12) {
                                                                    view = view2;
                                                                }
                                                                if (view != null) {
                                                                    H8 = ((z9 && (a9 = ((InterfaceC4996L) layoutManager).a(layoutManager.B() + (-1))) != null && ((a9.x > f2 ? 1 : (a9.x == f2 ? 0 : -1)) < 0 || (a9.y > f2 ? 1 : (a9.y == f2 ? 0 : -1)) < 0)) == z12 ? -1 : 1) + AbstractC4987C.H(view);
                                                                    if (H8 >= 0) {
                                                                    }
                                                                }
                                                                H8 = -1;
                                                            } else {
                                                                H8 = AbstractC4987C.H(view2);
                                                            }
                                                            if (H8 != -1) {
                                                                c5024t.f40807a = H8;
                                                                layoutManager.y0(c5024t);
                                                                V();
                                                                obtain.recycle();
                                                                return true;
                                                            }
                                                            if (z11) {
                                                                if (e12) {
                                                                    d11 = (d11 == true ? 1 : 0) | 2;
                                                                }
                                                                getScrollingChildHelper().g(d11, i);
                                                                int i22 = -i14;
                                                                int max3 = Math.max(i22, Math.min(i15, i14));
                                                                int max4 = Math.max(i22, Math.min(i16, i14));
                                                                RunnableC4999O runnableC4999O = this.f5179A0;
                                                                RecyclerView recyclerView = runnableC4999O.f40641z;
                                                                recyclerView.setScrollState(2);
                                                                runnableC4999O.f40636u = 0;
                                                                runnableC4999O.f40635n = 0;
                                                                Interpolator interpolator = runnableC4999O.f40638w;
                                                                b bVar = f5177V0;
                                                                if (interpolator != bVar) {
                                                                    runnableC4999O.f40638w = bVar;
                                                                    runnableC4999O.f40637v = new OverScroller(recyclerView.getContext(), bVar);
                                                                }
                                                                runnableC4999O.f40637v.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                                runnableC4999O.a();
                                                                V();
                                                                obtain.recycle();
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                    i = 1;
                                                    H8 = -1;
                                                    if (H8 != -1) {
                                                    }
                                                    if (z11) {
                                                    }
                                                }
                                            }
                                        }
                                        i = 1;
                                        if (z11) {
                                        }
                                    }
                                }
                            }
                            i6 = 0;
                        }
                        setScrollState(i6);
                        V();
                        obtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f5223n0);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5223n0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y10 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i23 = this.f5227r0 - x11;
                        int i24 = this.f5228s0 - y10;
                        if (this.m0 != 1) {
                            if (d10 != 0) {
                                i23 = i23 > 0 ? Math.max(0, i23 - this.f5229t0) : Math.min(0, i23 + this.f5229t0);
                                if (i23 != 0) {
                                    z10 = true;
                                    if (e11) {
                                        i24 = i24 > 0 ? Math.max(0, i24 - this.f5229t0) : Math.min(0, i24 + this.f5229t0);
                                        if (i24 != 0) {
                                            z10 = true;
                                        }
                                    }
                                    if (z10) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z10 = false;
                            if (e11) {
                            }
                            if (z10) {
                            }
                        }
                        int i25 = i23;
                        int i26 = i24;
                        if (this.m0 == 1) {
                            int[] iArr4 = this.f5207P0;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            boolean r9 = r(d10 != 0 ? i25 : 0, e11 ? i26 : 0, 0, iArr4, this.f5203N0);
                            int[] iArr5 = this.f5203N0;
                            if (r9) {
                                i25 -= iArr4[0];
                                i26 -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i27 = i26;
                            this.f5227r0 = x11 - iArr5[0];
                            this.f5228s0 = y10 - iArr5[1];
                            if (W(d10 != 0 ? i25 : 0, e11 ? i27 : 0, motionEvent)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            RunnableC5017m runnableC5017m = this.f5181B0;
                            if (runnableC5017m != null && (i25 != 0 || i27 != 0)) {
                                runnableC5017m.a(this, i25, i27);
                            }
                        }
                    } else if (actionMasked == 3) {
                        V();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f5223n0 = motionEvent.getPointerId(actionIndex);
                        int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f5227r0 = x12;
                        this.f5225p0 = x12;
                        int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f5228s0 = y11;
                        this.f5226q0 = y11;
                    } else if (actionMasked == 6) {
                        R(motionEvent);
                    }
                }
                this.f5224o0.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x03e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        View A9;
        int F8;
        View view;
        Z z6;
        boolean z9;
        int i;
        boolean z10;
        boolean z11;
        char c9;
        boolean z12;
        boolean z13;
        C5005a q8;
        int i4;
        int i6;
        C5005a c5005a;
        C4997M c4997m = this.f5184D0;
        c4997m.a(1);
        z(c4997m);
        c4997m.i = false;
        a0();
        WP wp = this.f5238y;
        ((k) wp.f29152n).clear();
        s.e eVar = (s.e) wp.f29153u;
        eVar.h();
        P();
        if (this.f5210R) {
            M m9 = this.f5234w;
            m9.s((ArrayList) m9.f762v);
            m9.s((ArrayList) m9.f763w);
            if (this.f5212S) {
                this.f5185E.X();
            }
        }
        if (this.f5221l0 == null || !this.f5185E.z0()) {
            this.f5234w.h();
        } else {
            M m10 = this.f5234w;
            ArrayList arrayList = (ArrayList) m10.f762v;
            C4543G c4543g = (C4543G) m10.f765y;
            c4543g.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                boolean z14 = false;
                while (true) {
                    i = 8;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (((C5005a) arrayList.get(size)).f40695a == 8) {
                        if (z14) {
                            break;
                        }
                    } else {
                        z14 = true;
                    }
                    size--;
                }
                if (size == -1) {
                    break;
                }
                int i9 = size + 1;
                C5005a c5005a2 = (C5005a) arrayList.get(size);
                C5005a c5005a3 = (C5005a) arrayList.get(i9);
                int i10 = c5005a3.f40695a;
                if (i10 != 1) {
                    C5005a c5005a4 = null;
                    M m11 = (M) c4543g.f37843n;
                    if (i10 == 2) {
                        int i11 = c5005a2.f40696b;
                        int i12 = c5005a2.f40697c;
                        if (i11 < i12) {
                            if (c5005a3.f40696b == i11 && c5005a3.f40697c == i12 - i11) {
                                z12 = false;
                                z13 = true;
                            } else {
                                z12 = false;
                                z13 = false;
                            }
                        } else if (c5005a3.f40696b == i12 + 1 && c5005a3.f40697c == i11 - i12) {
                            z12 = true;
                            z13 = true;
                        } else {
                            z12 = true;
                            z13 = false;
                        }
                        int i13 = c5005a3.f40696b;
                        if (i12 < i13) {
                            c5005a3.f40696b = i13 - 1;
                        } else {
                            int i14 = c5005a3.f40697c;
                            if (i12 < i13 + i14) {
                                c5005a3.f40697c = i14 - 1;
                                c5005a2.f40695a = 2;
                                c5005a2.f40697c = 1;
                                if (c5005a3.f40697c == 0) {
                                    arrayList.remove(i9);
                                    m11.getClass();
                                    ((c) m11.f761u).c(c5005a3);
                                }
                            }
                        }
                        int i15 = c5005a2.f40696b;
                        int i16 = c5005a3.f40696b;
                        if (i15 <= i16) {
                            c5005a3.f40696b = i16 + 1;
                        } else {
                            int i17 = i16 + c5005a3.f40697c;
                            if (i15 < i17) {
                                c5005a4 = m11.q(2, i15 + 1, i17 - i15);
                                c5005a3.f40697c = c5005a2.f40696b - c5005a3.f40696b;
                            }
                        }
                        C5005a c5005a5 = c5005a4;
                        if (z13) {
                            arrayList.set(size, c5005a3);
                            arrayList.remove(i9);
                            m11.getClass();
                            ((c) m11.f761u).c(c5005a2);
                        } else {
                            if (z12) {
                                if (c5005a5 != null) {
                                    int i18 = c5005a2.f40696b;
                                    if (i18 > c5005a5.f40696b) {
                                        c5005a2.f40696b = i18 - c5005a5.f40697c;
                                    }
                                    int i19 = c5005a2.f40697c;
                                    if (i19 > c5005a5.f40696b) {
                                        c5005a2.f40697c = i19 - c5005a5.f40697c;
                                    }
                                }
                                int i20 = c5005a2.f40696b;
                                if (i20 > c5005a3.f40696b) {
                                    c5005a2.f40696b = i20 - c5005a3.f40697c;
                                }
                                int i21 = c5005a2.f40697c;
                                if (i21 > c5005a3.f40696b) {
                                    c5005a2.f40697c = i21 - c5005a3.f40697c;
                                }
                            } else {
                                if (c5005a5 != null) {
                                    int i22 = c5005a2.f40696b;
                                    if (i22 >= c5005a5.f40696b) {
                                        c5005a2.f40696b = i22 - c5005a5.f40697c;
                                    }
                                    int i23 = c5005a2.f40697c;
                                    if (i23 >= c5005a5.f40696b) {
                                        c5005a2.f40697c = i23 - c5005a5.f40697c;
                                    }
                                }
                                int i24 = c5005a2.f40696b;
                                if (i24 >= c5005a3.f40696b) {
                                    c5005a2.f40696b = i24 - c5005a3.f40697c;
                                }
                                int i25 = c5005a2.f40697c;
                                if (i25 >= c5005a3.f40696b) {
                                    c5005a2.f40697c = i25 - c5005a3.f40697c;
                                }
                            }
                            arrayList.set(size, c5005a3);
                            if (c5005a2.f40696b != c5005a2.f40697c) {
                                arrayList.set(i9, c5005a2);
                            } else {
                                arrayList.remove(i9);
                            }
                            if (c5005a5 != null) {
                                arrayList.add(size, c5005a5);
                            }
                        }
                    } else if (i10 == 4) {
                        int i26 = c5005a2.f40697c;
                        int i27 = c5005a3.f40696b;
                        if (i26 < i27) {
                            c5005a3.f40696b = i27 - 1;
                        } else {
                            int i28 = c5005a3.f40697c;
                            if (i26 < i27 + i28) {
                                c5005a3.f40697c = i28 - 1;
                                q8 = m11.q(4, c5005a2.f40696b, 1);
                                i4 = c5005a2.f40696b;
                                i6 = c5005a3.f40696b;
                                if (i4 > i6) {
                                    c5005a3.f40696b = i6 + 1;
                                } else {
                                    int i29 = i6 + c5005a3.f40697c;
                                    if (i4 < i29) {
                                        int i30 = i29 - i4;
                                        c5005a4 = m11.q(4, i4 + 1, i30);
                                        c5005a3.f40697c -= i30;
                                    }
                                }
                                c5005a = c5005a4;
                                arrayList.set(i9, c5005a2);
                                if (c5005a3.f40697c <= 0) {
                                    arrayList.set(size, c5005a3);
                                } else {
                                    arrayList.remove(size);
                                    m11.getClass();
                                    ((c) m11.f761u).c(c5005a3);
                                }
                                if (q8 != null) {
                                    arrayList.add(size, q8);
                                }
                                if (c5005a == null) {
                                    arrayList.add(size, c5005a);
                                }
                            }
                        }
                        q8 = null;
                        i4 = c5005a2.f40696b;
                        i6 = c5005a3.f40696b;
                        if (i4 > i6) {
                        }
                        c5005a = c5005a4;
                        arrayList.set(i9, c5005a2);
                        if (c5005a3.f40697c <= 0) {
                        }
                        if (q8 != null) {
                        }
                        if (c5005a == null) {
                        }
                    }
                } else {
                    int i31 = c5005a2.f40697c;
                    int i32 = c5005a3.f40696b;
                    int i33 = i31 < i32 ? -1 : 0;
                    int i34 = c5005a2.f40696b;
                    if (i34 < i32) {
                        i33++;
                    }
                    if (i32 <= i34) {
                        c5005a2.f40696b = i34 + c5005a3.f40697c;
                    }
                    int i35 = c5005a3.f40696b;
                    if (i35 <= i31) {
                        c5005a2.f40697c = i31 + c5005a3.f40697c;
                    }
                    c5005a3.f40696b = i35 + i33;
                    arrayList.set(size, c5005a3);
                    arrayList.set(i9, c5005a2);
                }
            }
            int size2 = arrayList.size();
            int i36 = 0;
            while (i36 < size2) {
                C5005a c5005a6 = (C5005a) arrayList.get(i36);
                int i37 = c5005a6.f40695a;
                if (i37 != 1) {
                    C4900e c4900e = (C4900e) m10.f764x;
                    if (i37 == 2) {
                        int i38 = c5005a6.f40696b;
                        int i39 = c5005a6.f40697c + i38;
                        int i40 = i38;
                        int i41 = 0;
                        char c10 = 65535;
                        while (i40 < i39) {
                            if (c4900e.c(i40) != null || m10.g(i40)) {
                                if (c10 == 0) {
                                    m10.j(m10.q(2, i38, i41));
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 = z10;
                                c9 = 1;
                            } else {
                                if (c10 == 1) {
                                    m10.r(m10.q(2, i38, i41));
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                c9 = 0;
                            }
                            if (z11) {
                                i40 -= i41;
                                i39 -= i41;
                                i41 = 1;
                            } else {
                                i41++;
                            }
                            i40++;
                            c10 = c9;
                        }
                        if (i41 != c5005a6.f40697c) {
                            ((c) m10.f761u).c(c5005a6);
                            c5005a6 = m10.q(2, i38, i41);
                        }
                        if (c10 == 0) {
                            m10.j(c5005a6);
                        } else {
                            m10.r(c5005a6);
                        }
                    } else if (i37 == 4) {
                        int i42 = c5005a6.f40696b;
                        int i43 = c5005a6.f40697c + i42;
                        int i44 = i42;
                        int i45 = 0;
                        char c11 = 65535;
                        while (i42 < i43) {
                            if (c4900e.c(i42) != null || m10.g(i42)) {
                                if (c11 == 0) {
                                    m10.j(m10.q(4, i44, i45));
                                    i44 = i42;
                                    i45 = 0;
                                }
                                c11 = 1;
                            } else {
                                if (c11 == 1) {
                                    m10.r(m10.q(4, i44, i45));
                                    i44 = i42;
                                    i45 = 0;
                                }
                                c11 = 0;
                            }
                            i45++;
                            i42++;
                        }
                        if (i45 != c5005a6.f40697c) {
                            ((c) m10.f761u).c(c5005a6);
                            c5005a6 = m10.q(4, i44, i45);
                        }
                        if (c11 == 0) {
                            m10.j(c5005a6);
                        } else {
                            m10.r(c5005a6);
                        }
                    } else if (i37 == i) {
                        m10.r(c5005a6);
                    }
                } else {
                    m10.r(c5005a6);
                }
                i36++;
                i = 8;
            }
            arrayList.clear();
        }
        boolean z15 = this.f5190G0 || this.f5192H0;
        boolean z16 = this.f5196K && this.f5221l0 != null && ((z9 = this.f5210R) || z15 || this.f5185E.f40595f) && (!z9 || this.f5183D.f40830b);
        C4997M c4997m2 = this.f5184D0;
        c4997m2.f40630j = z16;
        c4997m2.f40631k = z16 && z15 && !this.f5210R && this.f5221l0 != null && this.f5185E.z0();
        View focusedChild = (this.f5241z0 && hasFocus() && this.f5183D != null) ? getFocusedChild() : null;
        AbstractC5000P H8 = (focusedChild == null || (A9 = A(focusedChild)) == null) ? null : H(A9);
        if (H8 == null) {
            c4997m.f40633m = -1L;
            c4997m.f40632l = -1;
            c4997m.f40634n = -1;
        } else {
            c4997m.f40633m = this.f5183D.f40830b ? H8.f40647e : -1L;
            if (!this.f5210R) {
                if (H8.h()) {
                    F8 = H8.f40646d;
                } else {
                    RecyclerView recyclerView = H8.f40659r;
                    if (recyclerView != null) {
                        F8 = recyclerView.F(H8);
                    }
                }
                c4997m.f40632l = F8;
                view = H8.f40643a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                c4997m.f40634n = id;
            }
            F8 = -1;
            c4997m.f40632l = F8;
            view = H8.f40643a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            c4997m.f40634n = id2;
        }
        c4997m.f40629h = c4997m.f40630j && this.f5192H0;
        this.f5192H0 = false;
        this.f5190G0 = false;
        c4997m.f40628g = c4997m.f40631k;
        c4997m.f40626e = this.f5183D.a();
        C(this.f5199L0);
        boolean z17 = c4997m.f40630j;
        k kVar = (k) wp.f29152n;
        if (z17) {
            int f2 = this.f5236x.f();
            for (int i46 = 0; i46 < f2; i46++) {
                AbstractC5000P I8 = I(this.f5236x.e(i46));
                if (!I8.o() && (!I8.f() || this.f5183D.f40830b)) {
                    AbstractC5030z abstractC5030z = this.f5221l0;
                    AbstractC5030z.b(I8);
                    I8.c();
                    abstractC5030z.getClass();
                    C0349t c0349t = new C0349t();
                    c0349t.a(I8);
                    Z z18 = (Z) kVar.getOrDefault(I8, null);
                    if (z18 == null) {
                        z18 = Z.a();
                        kVar.put(I8, z18);
                    }
                    z18.f40693b = c0349t;
                    z18.f40692a |= 4;
                    if (c4997m.f40629h && I8.k() && !I8.h() && !I8.o() && !I8.f()) {
                        eVar.k(G(I8), I8);
                    }
                }
            }
        }
        if (c4997m.f40631k) {
            int n9 = this.f5236x.n();
            for (int i47 = 0; i47 < n9; i47++) {
                AbstractC5000P I9 = I(this.f5236x.m(i47));
                if (!I9.o() && I9.f40646d == -1) {
                    I9.f40646d = I9.f40645c;
                }
            }
            boolean z19 = c4997m.f40627f;
            c4997m.f40627f = false;
            this.f5185E.b0(this.f5230u, c4997m);
            c4997m.f40627f = z19;
            for (int i48 = 0; i48 < this.f5236x.f(); i48++) {
                AbstractC5000P I10 = I(this.f5236x.e(i48));
                if (!I10.o() && ((z6 = (Z) kVar.getOrDefault(I10, null)) == null || (z6.f40692a & 4) == 0)) {
                    AbstractC5030z.b(I10);
                    boolean z20 = (I10.f40651j & 8192) != 0;
                    AbstractC5030z abstractC5030z2 = this.f5221l0;
                    I10.c();
                    abstractC5030z2.getClass();
                    C0349t c0349t2 = new C0349t();
                    c0349t2.a(I10);
                    if (z20) {
                        T(I10, c0349t2);
                    } else {
                        Z z21 = (Z) kVar.getOrDefault(I10, null);
                        if (z21 == null) {
                            z21 = Z.a();
                            kVar.put(I10, z21);
                        }
                        z21.f40692a |= 2;
                        z21.f40693b = c0349t2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        Q(true);
        b0(false);
        c4997m.f40625d = 2;
    }

    public final void q() {
        a0();
        P();
        C4997M c4997m = this.f5184D0;
        c4997m.a(6);
        this.f5234w.h();
        c4997m.f40626e = this.f5183D.a();
        c4997m.f40624c = 0;
        c4997m.f40628g = false;
        this.f5185E.b0(this.f5230u, c4997m);
        c4997m.f40627f = false;
        this.f5232v = null;
        c4997m.f40630j = c4997m.f40630j && this.f5221l0 != null;
        c4997m.f40625d = 4;
        Q(true);
        b0(false);
    }

    public final boolean r(int i, int i4, int i6, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i4, i6, iArr, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z6) {
        AbstractC5000P I8 = I(view);
        if (I8 != null) {
            if (I8.j()) {
                I8.f40651j &= -257;
            } else if (!I8.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + I8 + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C5022r c5022r = this.f5185E.f40594e;
        if ((c5022r == null || !c5022r.f40811e) && !L() && view2 != null) {
            U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        return this.f5185E.k0(this, view, rect, z6, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        ArrayList arrayList = this.f5189G;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C5015k) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f5198L != 0 || this.f5202N) {
            this.f5200M = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i4, int i6, int i9, int[] iArr, int i10, int[] iArr2) {
        getScrollingChildHelper().d(i, i4, i6, i9, iArr, i10, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i4) {
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5202N) {
            return;
        }
        boolean d9 = abstractC4987C.d();
        boolean e9 = this.f5185E.e();
        if (d9 || e9) {
            if (!d9) {
                i = 0;
            }
            if (!e9) {
                i4 = 0;
            }
            W(i, i4, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i4) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f5206P |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C5001Q c5001q) {
        this.f5197K0 = c5001q;
        X.o(this, c5001q);
    }

    public void setAdapter(AbstractC5026v abstractC5026v) {
        setLayoutFrozen(false);
        AbstractC5026v abstractC5026v2 = this.f5183D;
        e eVar = this.f5222n;
        if (abstractC5026v2 != null) {
            abstractC5026v2.f40829a.unregisterObserver(eVar);
            this.f5183D.getClass();
        }
        AbstractC5030z abstractC5030z = this.f5221l0;
        if (abstractC5030z != null) {
            abstractC5030z.e();
        }
        AbstractC4987C abstractC4987C = this.f5185E;
        C3698oP c3698oP = this.f5230u;
        if (abstractC4987C != null) {
            abstractC4987C.g0(c3698oP);
            this.f5185E.h0(c3698oP);
        }
        ((ArrayList) c3698oP.f33686c).clear();
        c3698oP.d();
        M m9 = this.f5234w;
        m9.s((ArrayList) m9.f762v);
        m9.s((ArrayList) m9.f763w);
        AbstractC5026v abstractC5026v3 = this.f5183D;
        this.f5183D = abstractC5026v;
        if (abstractC5026v != null) {
            abstractC5026v.f40829a.registerObserver(eVar);
        }
        AbstractC5026v abstractC5026v4 = this.f5183D;
        ((ArrayList) c3698oP.f33686c).clear();
        c3698oP.d();
        C4992H c9 = c3698oP.c();
        if (abstractC5026v3 != null) {
            c9.f40613b--;
        }
        if (c9.f40613b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c9.f40612a;
                if (i >= sparseArray.size()) {
                    break;
                }
                ((C4991G) sparseArray.valueAt(i)).f40608a.clear();
                i++;
            }
        }
        if (abstractC5026v4 != null) {
            c9.f40613b++;
        }
        this.f5184D0.f40627f = true;
        this.f5212S |= false;
        this.f5210R = true;
        int n9 = this.f5236x.n();
        for (int i4 = 0; i4 < n9; i4++) {
            AbstractC5000P I8 = I(this.f5236x.m(i4));
            if (I8 != null && !I8.o()) {
                I8.a(6);
            }
        }
        N();
        C3698oP c3698oP2 = this.f5230u;
        ArrayList arrayList = (ArrayList) c3698oP2.f33688e;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC5000P abstractC5000P = (AbstractC5000P) arrayList.get(i6);
            if (abstractC5000P != null) {
                abstractC5000P.a(6);
                abstractC5000P.a(1024);
            }
        }
        AbstractC5026v abstractC5026v5 = ((RecyclerView) c3698oP2.f33691h).f5183D;
        if (abstractC5026v5 == null || !abstractC5026v5.f40830b) {
            c3698oP2.d();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC5028x interfaceC5028x) {
        if (interfaceC5028x == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z6) {
        if (z6 != this.f5240z) {
            this.f5220k0 = null;
            this.f5218i0 = null;
            this.f5219j0 = null;
            this.f5217W = null;
        }
        this.f5240z = z6;
        super.setClipToPadding(z6);
        if (this.f5196K) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C5029y c5029y) {
        c5029y.getClass();
        this.f5216V = c5029y;
        this.f5220k0 = null;
        this.f5218i0 = null;
        this.f5219j0 = null;
        this.f5217W = null;
    }

    public void setHasFixedSize(boolean z6) {
        this.J = z6;
    }

    public void setItemAnimator(AbstractC5030z abstractC5030z) {
        AbstractC5030z abstractC5030z2 = this.f5221l0;
        if (abstractC5030z2 != null) {
            abstractC5030z2.e();
            this.f5221l0.f40831a = null;
        }
        this.f5221l0 = abstractC5030z;
        if (abstractC5030z != null) {
            abstractC5030z.f40831a = this.f5194I0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C3698oP c3698oP = this.f5230u;
        c3698oP.f33684a = i;
        c3698oP.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z6) {
        suppressLayout(z6);
    }

    public void setLayoutManager(AbstractC4987C abstractC4987C) {
        RecyclerView recyclerView;
        C5022r c5022r;
        if (abstractC4987C == this.f5185E) {
            return;
        }
        setScrollState(0);
        RunnableC4999O runnableC4999O = this.f5179A0;
        runnableC4999O.f40641z.removeCallbacks(runnableC4999O);
        runnableC4999O.f40637v.abortAnimation();
        AbstractC4987C abstractC4987C2 = this.f5185E;
        if (abstractC4987C2 != null && (c5022r = abstractC4987C2.f40594e) != null) {
            c5022r.i();
        }
        AbstractC4987C abstractC4987C3 = this.f5185E;
        C3698oP c3698oP = this.f5230u;
        if (abstractC4987C3 != null) {
            AbstractC5030z abstractC5030z = this.f5221l0;
            if (abstractC5030z != null) {
                abstractC5030z.e();
            }
            this.f5185E.g0(c3698oP);
            this.f5185E.h0(c3698oP);
            ((ArrayList) c3698oP.f33686c).clear();
            c3698oP.d();
            if (this.f5193I) {
                AbstractC4987C abstractC4987C4 = this.f5185E;
                abstractC4987C4.f40596g = false;
                abstractC4987C4.R(this);
            }
            this.f5185E.t0(null);
            this.f5185E = null;
        } else {
            ((ArrayList) c3698oP.f33686c).clear();
            c3698oP.d();
        }
        g gVar = this.f5236x;
        ((C3404j1) gVar.f38917v).n();
        ArrayList arrayList = (ArrayList) gVar.f38918w;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = (RecyclerView) ((C4659e) gVar.f38916u).f38688u;
            if (size < 0) {
                break;
            }
            AbstractC5000P I8 = I((View) arrayList.get(size));
            if (I8 != null) {
                int i = I8.f40657p;
                if (recyclerView.L()) {
                    I8.f40658q = i;
                    recyclerView.f5209Q0.add(I8);
                } else {
                    WeakHashMap weakHashMap = X.f2142a;
                    I8.f40643a.setImportantForAccessibility(i);
                }
                I8.f40657p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f5185E = abstractC4987C;
        if (abstractC4987C != null) {
            if (abstractC4987C.f40591b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC4987C + " is already attached to a RecyclerView:" + abstractC4987C.f40591b.y());
            }
            abstractC4987C.t0(this);
            if (this.f5193I) {
                AbstractC4987C abstractC4987C5 = this.f5185E;
                abstractC4987C5.f40596g = true;
                abstractC4987C5.Q(this);
            }
        }
        c3698oP.k();
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
    public void setNestedScrollingEnabled(boolean z6) {
        C0347q scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f2216d) {
            WeakHashMap weakHashMap = X.f2142a;
            L.z(scrollingChildHelper.f2215c);
        }
        scrollingChildHelper.f2216d = z6;
    }

    public void setOnFlingListener(AbstractC4989E abstractC4989E) {
        this.f5231u0 = abstractC4989E;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC4990F abstractC4990F) {
        this.f5186E0 = abstractC4990F;
    }

    public void setPreserveFocusAfterLayout(boolean z6) {
        this.f5241z0 = z6;
    }

    public void setRecycledViewPool(C4992H c4992h) {
        C3698oP c3698oP = this.f5230u;
        if (((C4992H) c3698oP.f33690g) != null) {
            r1.f40613b--;
        }
        c3698oP.f33690g = c4992h;
        if (c4992h == null || ((RecyclerView) c3698oP.f33691h).getAdapter() == null) {
            return;
        }
        ((C4992H) c3698oP.f33690g).f40613b++;
    }

    public void setScrollState(int i) {
        C5022r c5022r;
        if (i == this.m0) {
            return;
        }
        this.m0 = i;
        if (i != 2) {
            RunnableC4999O runnableC4999O = this.f5179A0;
            runnableC4999O.f40641z.removeCallbacks(runnableC4999O);
            runnableC4999O.f40637v.abortAnimation();
            AbstractC4987C abstractC4987C = this.f5185E;
            if (abstractC4987C != null && (c5022r = abstractC4987C.f40594e) != null) {
                c5022r.i();
            }
        }
        AbstractC4987C abstractC4987C2 = this.f5185E;
        if (abstractC4987C2 != null) {
            abstractC4987C2.f0(i);
        }
        AbstractC4990F abstractC4990F = this.f5186E0;
        if (abstractC4990F != null) {
            abstractC4990F.a(this, i);
        }
        ArrayList arrayList = this.f5188F0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC4990F) this.f5188F0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f5229t0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f5229t0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC4998N abstractC4998N) {
        this.f5230u.getClass();
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
    public final void suppressLayout(boolean z6) {
        C5022r c5022r;
        if (z6 != this.f5202N) {
            i("Do not suppressLayout in layout or scroll");
            if (!z6) {
                this.f5202N = false;
                if (this.f5200M && this.f5185E != null && this.f5183D != null) {
                    requestLayout();
                }
                this.f5200M = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f5202N = true;
            this.f5204O = true;
            setScrollState(0);
            RunnableC4999O runnableC4999O = this.f5179A0;
            runnableC4999O.f40641z.removeCallbacks(runnableC4999O);
            runnableC4999O.f40637v.abortAnimation();
            AbstractC4987C abstractC4987C = this.f5185E;
            if (abstractC4987C == null || (c5022r = abstractC4987C.f40594e) == null) {
                return;
            }
            c5022r.i();
        }
    }

    public final void t(int i, int i4) {
        this.f5215U++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i4);
        AbstractC4990F abstractC4990F = this.f5186E0;
        if (abstractC4990F != null) {
            abstractC4990F.b(this, i, i4);
        }
        ArrayList arrayList = this.f5188F0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC4990F) this.f5188F0.get(size)).b(this, i, i4);
            }
        }
        this.f5215U--;
    }

    public final void u() {
        if (this.f5220k0 != null) {
            return;
        }
        this.f5216V.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5220k0 = edgeEffect;
        if (this.f5240z) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.f5217W != null) {
            return;
        }
        this.f5216V.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5217W = edgeEffect;
        if (this.f5240z) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.f5219j0 != null) {
            return;
        }
        this.f5216V.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5219j0 = edgeEffect;
        if (this.f5240z) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.f5218i0 != null) {
            return;
        }
        this.f5216V.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5218i0 = edgeEffect;
        if (this.f5240z) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f5183D + ", layout:" + this.f5185E + ", context:" + getContext();
    }

    public final void z(C4997M c4997m) {
        if (getScrollState() != 2) {
            c4997m.getClass();
            return;
        }
        OverScroller overScroller = this.f5179A0.f40637v;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c4997m.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float a9;
        int i4;
        TypedArray typedArray;
        char c9;
        int i6;
        char c10;
        AttributeSet attributeSet2;
        Constructor constructor;
        Object[] objArr;
        int i9 = 6;
        this.f5222n = new e(this);
        C3698oP c3698oP = new C3698oP();
        c3698oP.f33691h = this;
        ArrayList arrayList = new ArrayList();
        c3698oP.f33686c = arrayList;
        c3698oP.f33687d = null;
        c3698oP.f33688e = new ArrayList();
        c3698oP.f33689f = Collections.unmodifiableList(arrayList);
        c3698oP.f33684a = 2;
        c3698oP.f33685b = 2;
        this.f5230u = c3698oP;
        this.f5238y = new WP(5);
        this.f5178A = new Rect();
        this.f5180B = new Rect();
        this.f5182C = new RectF();
        this.f5187F = new ArrayList();
        this.f5189G = new ArrayList();
        this.f5198L = 0;
        this.f5210R = false;
        this.f5212S = false;
        this.f5214T = 0;
        this.f5215U = 0;
        this.f5216V = new C5029y();
        C5012h c5012h = new C5012h();
        c5012h.f40831a = null;
        c5012h.f40832b = new ArrayList();
        c5012h.f40833c = 120L;
        c5012h.f40834d = 120L;
        c5012h.f40835e = 250L;
        c5012h.f40836f = 250L;
        c5012h.f40729g = true;
        c5012h.f40730h = new ArrayList();
        c5012h.i = new ArrayList();
        c5012h.f40731j = new ArrayList();
        c5012h.f40732k = new ArrayList();
        c5012h.f40733l = new ArrayList();
        c5012h.f40734m = new ArrayList();
        c5012h.f40735n = new ArrayList();
        c5012h.f40736o = new ArrayList();
        c5012h.f40737p = new ArrayList();
        c5012h.f40738q = new ArrayList();
        c5012h.f40739r = new ArrayList();
        this.f5221l0 = c5012h;
        this.m0 = 0;
        this.f5223n0 = -1;
        this.f5237x0 = Float.MIN_VALUE;
        this.f5239y0 = Float.MIN_VALUE;
        this.f5241z0 = true;
        this.f5179A0 = new RunnableC4999O(this);
        this.C0 = new C2817Tl();
        C4997M c4997m = new C4997M();
        c4997m.f40622a = -1;
        c4997m.f40623b = 0;
        c4997m.f40624c = 0;
        c4997m.f40625d = 1;
        c4997m.f40626e = 0;
        c4997m.f40627f = false;
        c4997m.f40628g = false;
        c4997m.f40629h = false;
        c4997m.i = false;
        c4997m.f40630j = false;
        c4997m.f40631k = false;
        this.f5184D0 = c4997m;
        this.f5190G0 = false;
        this.f5192H0 = false;
        C4543G c4543g = new C4543G(this);
        this.f5194I0 = c4543g;
        this.f5195J0 = false;
        this.f5199L0 = new int[2];
        this.f5203N0 = new int[2];
        this.f5205O0 = new int[2];
        this.f5207P0 = new int[2];
        this.f5209Q0 = new ArrayList();
        this.f5211R0 = new r3.b(i9, this);
        this.f5213S0 = new R0(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5229t0 = viewConfiguration.getScaledTouchSlop();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            Method method = AbstractC0329b0.f2152a;
            a9 = Y.a(viewConfiguration);
        } else {
            a9 = AbstractC0329b0.a(viewConfiguration, context);
        }
        this.f5237x0 = a9;
        this.f5239y0 = i10 >= 26 ? Y.b(viewConfiguration) : AbstractC0329b0.a(viewConfiguration, context);
        this.f5233v0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5235w0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f5221l0.f40831a = c4543g;
        this.f5234w = new M(new C4900e(this));
        this.f5236x = new g(new C4659e(i9, this));
        WeakHashMap weakHashMap = X.f2142a;
        if ((i10 >= 26 ? N.c(this) : 0) == 0 && i10 >= 26) {
            N.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f5208Q = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C5001Q(this));
        int[] iArr = AbstractC4915a.f40281a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (i10 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f5240z = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
            }
            Resources resources = getContext().getResources();
            c10 = 2;
            i4 = i;
            i6 = 4;
            c9 = 3;
            typedArray = obtainStyledAttributes;
            attributeSet2 = attributeSet;
            new C5015k(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C5248R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(C5248R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(C5248R.dimen.fastscroll_margin));
        } else {
            i4 = i;
            typedArray = obtainStyledAttributes;
            c9 = 3;
            i6 = 4;
            c10 = 2;
            attributeSet2 = attributeSet;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(j.f13164z)) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    Class<? extends U> asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC4987C.class);
                    try {
                        constructor = asSubclass.getConstructor(f5176U0);
                        objArr = new Object[i6];
                        objArr[0] = context;
                        objArr[1] = attributeSet2;
                        objArr[c10] = Integer.valueOf(i4);
                        objArr[c9] = 0;
                    } catch (NoSuchMethodException e9) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e10) {
                            e10.initCause(e9);
                            throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Error creating LayoutManager " + str, e10);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC4987C) constructor.newInstance(objArr));
                } catch (ClassCastException e11) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Class is not a LayoutManager " + str, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Unable to find LayoutManager " + str, e12);
                } catch (IllegalAccessException e13) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Cannot access non-public constructor " + str, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                } catch (InvocationTargetException e15) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e15);
                }
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        int[] iArr2 = f5175T0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, iArr2, i4, 0);
        if (i11 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet2, obtainStyledAttributes2, i4, 0);
        }
        boolean z6 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z6);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC4987C abstractC4987C = this.f5185E;
        if (abstractC4987C != null) {
            return abstractC4987C.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    public void setRecyclerListener(InterfaceC4993I interfaceC4993I) {
    }
}
