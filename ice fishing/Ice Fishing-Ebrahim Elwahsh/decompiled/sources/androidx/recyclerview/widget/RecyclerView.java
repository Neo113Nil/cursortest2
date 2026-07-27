package androidx.recyclerview.widget;

import B2.N;
import C3.e;
import G0.b;
import K.n;
import N.c;
import O.AbstractC0337b0;
import O.C0355q;
import O.C0357t;
import O.InterfaceC0362y;
import O.L;
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
import androidx.emoji2.text.g;
import com.anythink.core.common.d.j;
import com.anythink.expressad.video.module.a.a;
import com.google.android.gms.internal.ads.BP;
import com.google.android.gms.internal.ads.C2830Vl;
import com.google.android.gms.internal.ads.C3288h1;
import com.icefishing.icefishingliveapp.C5284R;
import g1.C4523c;
import g1.C4524d;
import i8.m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import m.Q0;
import p3.C4859b;
import q2.R0;
import s.k;
import s0.AbstractC4987a;
import t0.AbstractC5017A;
import t0.AbstractC5019C;
import t0.AbstractC5021E;
import t0.AbstractC5022F;
import t0.AbstractC5030N;
import t0.AbstractC5032P;
import t0.AbstractC5059v;
import t0.AbstractC5063z;
import t0.C5020D;
import t0.C5023G;
import t0.C5024H;
import t0.C5026J;
import t0.C5029M;
import t0.C5033Q;
import t0.C5038a;
import t0.C5045h;
import t0.C5048k;
import t0.C5056s;
import t0.C5058u;
import t0.C5062y;
import t0.InterfaceC5025I;
import t0.InterfaceC5028L;
import t0.InterfaceC5061x;
import t0.RunnableC5031O;
import t0.RunnableC5050m;
import t0.Z;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0362y {

    /* renamed from: Y0, reason: collision with root package name */
    public static final int[] f5320Y0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: Z0, reason: collision with root package name */
    public static final Class[] f5321Z0;

    /* renamed from: a1, reason: collision with root package name */
    public static final b f5322a1;

    /* renamed from: A, reason: collision with root package name */
    public final Rect f5323A;

    /* renamed from: A0, reason: collision with root package name */
    public final int f5324A0;

    /* renamed from: B, reason: collision with root package name */
    public final Rect f5325B;

    /* renamed from: B0, reason: collision with root package name */
    public final int f5326B0;

    /* renamed from: C, reason: collision with root package name */
    public final RectF f5327C;
    public final float C0;

    /* renamed from: D, reason: collision with root package name */
    public AbstractC5059v f5328D;

    /* renamed from: D0, reason: collision with root package name */
    public final float f5329D0;

    /* renamed from: E, reason: collision with root package name */
    public AbstractC5019C f5330E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f5331E0;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f5332F;

    /* renamed from: F0, reason: collision with root package name */
    public final RunnableC5031O f5333F0;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f5334G;

    /* renamed from: G0, reason: collision with root package name */
    public RunnableC5050m f5335G0;

    /* renamed from: H, reason: collision with root package name */
    public C5048k f5336H;

    /* renamed from: H0, reason: collision with root package name */
    public final C2830Vl f5337H0;

    /* renamed from: I, reason: collision with root package name */
    public boolean f5338I;

    /* renamed from: I0, reason: collision with root package name */
    public final C5029M f5339I0;
    public boolean J;

    /* renamed from: J0, reason: collision with root package name */
    public AbstractC5022F f5340J0;

    /* renamed from: K, reason: collision with root package name */
    public boolean f5341K;

    /* renamed from: K0, reason: collision with root package name */
    public ArrayList f5342K0;

    /* renamed from: L, reason: collision with root package name */
    public int f5343L;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f5344L0;

    /* renamed from: M, reason: collision with root package name */
    public boolean f5345M;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f5346M0;

    /* renamed from: N, reason: collision with root package name */
    public boolean f5347N;

    /* renamed from: N0, reason: collision with root package name */
    public final m f5348N0;

    /* renamed from: O, reason: collision with root package name */
    public boolean f5349O;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f5350O0;

    /* renamed from: P, reason: collision with root package name */
    public int f5351P;

    /* renamed from: P0, reason: collision with root package name */
    public C5033Q f5352P0;

    /* renamed from: Q, reason: collision with root package name */
    public final AccessibilityManager f5353Q;

    /* renamed from: Q0, reason: collision with root package name */
    public final int[] f5354Q0;

    /* renamed from: R, reason: collision with root package name */
    public boolean f5355R;

    /* renamed from: R0, reason: collision with root package name */
    public C0355q f5356R0;

    /* renamed from: S, reason: collision with root package name */
    public boolean f5357S;

    /* renamed from: S0, reason: collision with root package name */
    public final int[] f5358S0;

    /* renamed from: T, reason: collision with root package name */
    public int f5359T;

    /* renamed from: T0, reason: collision with root package name */
    public final int[] f5360T0;

    /* renamed from: U, reason: collision with root package name */
    public int f5361U;

    /* renamed from: U0, reason: collision with root package name */
    public final int[] f5362U0;

    /* renamed from: V, reason: collision with root package name */
    public C5062y f5363V;

    /* renamed from: V0, reason: collision with root package name */
    public final ArrayList f5364V0;

    /* renamed from: W, reason: collision with root package name */
    public EdgeEffect f5365W;

    /* renamed from: W0, reason: collision with root package name */
    public final R0 f5366W0;

    /* renamed from: X0, reason: collision with root package name */
    public final C4523c f5367X0;

    /* renamed from: n, reason: collision with root package name */
    public final e f5368n;

    /* renamed from: n0, reason: collision with root package name */
    public EdgeEffect f5369n0;

    /* renamed from: o0, reason: collision with root package name */
    public EdgeEffect f5370o0;

    /* renamed from: p0, reason: collision with root package name */
    public EdgeEffect f5371p0;

    /* renamed from: q0, reason: collision with root package name */
    public AbstractC5063z f5372q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f5373r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f5374s0;

    /* renamed from: t0, reason: collision with root package name */
    public VelocityTracker f5375t0;

    /* renamed from: u, reason: collision with root package name */
    public final BP f5376u;

    /* renamed from: u0, reason: collision with root package name */
    public int f5377u0;

    /* renamed from: v, reason: collision with root package name */
    public C5026J f5378v;

    /* renamed from: v0, reason: collision with root package name */
    public int f5379v0;

    /* renamed from: w, reason: collision with root package name */
    public final N f5380w;

    /* renamed from: w0, reason: collision with root package name */
    public int f5381w0;

    /* renamed from: x, reason: collision with root package name */
    public final Q0 f5382x;

    /* renamed from: x0, reason: collision with root package name */
    public int f5383x0;

    /* renamed from: y, reason: collision with root package name */
    public final S0.e f5384y;

    /* renamed from: y0, reason: collision with root package name */
    public int f5385y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5386z;

    /* renamed from: z0, reason: collision with root package name */
    public AbstractC5021E f5387z0;

    static {
        Class cls = Integer.TYPE;
        f5321Z0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f5322a1 = new b(2);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5284R.attr.recyclerViewStyle);
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

    public static AbstractC5032P I(View view) {
        if (view == null) {
            return null;
        }
        return ((C5020D) view.getLayoutParams()).f40576a;
    }

    private C0355q getScrollingChildHelper() {
        if (this.f5356R0 == null) {
            this.f5356R0 = new C0355q(this);
        }
        return this.f5356R0;
    }

    public static void j(AbstractC5032P abstractC5032P) {
        WeakReference weakReference = abstractC5032P.f40616b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC5032P.f40615a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC5032P.f40616b = null;
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
        ArrayList arrayList = this.f5334G;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5048k c5048k = (C5048k) arrayList.get(i);
            int i4 = c5048k.f40739v;
            if (i4 == 1) {
                boolean d2 = c5048k.d(motionEvent.getX(), motionEvent.getY());
                boolean c4 = c5048k.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d2 || c4)) {
                    if (c4) {
                        c5048k.f40740w = 1;
                        c5048k.f40733p = (int) motionEvent.getX();
                    } else if (d2) {
                        c5048k.f40740w = 2;
                        c5048k.f40730m = (int) motionEvent.getY();
                    }
                    c5048k.f(2);
                    if (action == 3) {
                        this.f5336H = c5048k;
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
        int e6 = this.f5382x.e();
        if (e6 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i9 = 0; i9 < e6; i9++) {
            AbstractC5032P I2 = I(this.f5382x.d(i9));
            if (!I2.o()) {
                int b9 = I2.b();
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

    public final AbstractC5032P E(int i) {
        AbstractC5032P abstractC5032P = null;
        if (this.f5355R) {
            return null;
        }
        int l9 = this.f5382x.l();
        for (int i4 = 0; i4 < l9; i4++) {
            AbstractC5032P I2 = I(this.f5382x.k(i4));
            if (I2 != null && !I2.h() && F(I2) == i) {
                if (!((ArrayList) this.f5382x.f39327d).contains(I2.f40615a)) {
                    return I2;
                }
                abstractC5032P = I2;
            }
        }
        return abstractC5032P;
    }

    public final int F(AbstractC5032P abstractC5032P) {
        if (((abstractC5032P.f40623j & 524) != 0) || !abstractC5032P.e()) {
            return -1;
        }
        N n9 = this.f5380w;
        int i = abstractC5032P.f40617c;
        ArrayList arrayList = (ArrayList) n9.f197v;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C5038a c5038a = (C5038a) arrayList.get(i4);
            int i9 = c5038a.f40667a;
            if (i9 != 1) {
                if (i9 == 2) {
                    int i10 = c5038a.f40668b;
                    if (i10 <= i) {
                        int i11 = c5038a.f40669c;
                        if (i10 + i11 > i) {
                            return -1;
                        }
                        i -= i11;
                    } else {
                        continue;
                    }
                } else if (i9 == 8) {
                    int i12 = c5038a.f40668b;
                    if (i12 == i) {
                        i = c5038a.f40669c;
                    } else {
                        if (i12 < i) {
                            i--;
                        }
                        if (c5038a.f40669c <= i) {
                            i++;
                        }
                    }
                }
            } else if (c5038a.f40668b <= i) {
                i += c5038a.f40669c;
            }
        }
        return i;
    }

    public final long G(AbstractC5032P abstractC5032P) {
        return this.f5328D.f40800b ? abstractC5032P.f40619e : abstractC5032P.f40617c;
    }

    public final AbstractC5032P H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        C5020D c5020d = (C5020D) view.getLayoutParams();
        boolean z8 = c5020d.f40578c;
        Rect rect = c5020d.f40577b;
        if (!z8 || (this.f5339I0.f40600g && (c5020d.f40576a.k() || c5020d.f40576a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f5332F;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f5323A;
            rect2.set(0, 0, 0, 0);
            ((AbstractC5017A) arrayList.get(i)).getClass();
            ((C5020D) view.getLayoutParams()).f40576a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c5020d.f40578c = false;
        return rect;
    }

    public final boolean K() {
        return !this.f5341K || this.f5355R || this.f5380w.n();
    }

    public final boolean L() {
        return this.f5359T > 0;
    }

    public final void M(int i) {
        if (this.f5330E == null) {
            return;
        }
        setScrollState(2);
        this.f5330E.n0(i);
        awakenScrollBars();
    }

    public final void N() {
        int l9 = this.f5382x.l();
        for (int i = 0; i < l9; i++) {
            ((C5020D) this.f5382x.k(i).getLayoutParams()).f40578c = true;
        }
        ArrayList arrayList = (ArrayList) this.f5376u.f24039e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C5020D c5020d = (C5020D) ((AbstractC5032P) arrayList.get(i4)).f40615a.getLayoutParams();
            if (c5020d != null) {
                c5020d.f40578c = true;
            }
        }
    }

    public final void O(int i, int i4, boolean z8) {
        int i9 = i + i4;
        int l9 = this.f5382x.l();
        for (int i10 = 0; i10 < l9; i10++) {
            AbstractC5032P I2 = I(this.f5382x.k(i10));
            if (I2 != null && !I2.o()) {
                int i11 = I2.f40617c;
                C5029M c5029m = this.f5339I0;
                if (i11 >= i9) {
                    I2.l(-i4, z8);
                    c5029m.f40599f = true;
                } else if (i11 >= i) {
                    I2.a(8);
                    I2.l(-i4, z8);
                    I2.f40617c = i - 1;
                    c5029m.f40599f = true;
                }
            }
        }
        BP bp = this.f5376u;
        ArrayList arrayList = (ArrayList) bp.f24039e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC5032P abstractC5032P = (AbstractC5032P) arrayList.get(size);
            if (abstractC5032P != null) {
                int i12 = abstractC5032P.f40617c;
                if (i12 >= i9) {
                    abstractC5032P.l(-i4, z8);
                } else if (i12 >= i) {
                    abstractC5032P.a(8);
                    bp.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.f5359T++;
    }

    public final void Q(boolean z8) {
        int i;
        AccessibilityManager accessibilityManager;
        int i4 = this.f5359T - 1;
        this.f5359T = i4;
        if (i4 < 1) {
            this.f5359T = 0;
            if (z8) {
                int i9 = this.f5351P;
                this.f5351P = 0;
                if (i9 != 0 && (accessibilityManager = this.f5353Q) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i9);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f5364V0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC5032P abstractC5032P = (AbstractC5032P) arrayList.get(size);
                    if (abstractC5032P.f40615a.getParent() == this && !abstractC5032P.o() && (i = abstractC5032P.f40630q) != -1) {
                        WeakHashMap weakHashMap = X.f2240a;
                        abstractC5032P.f40615a.setImportantForAccessibility(i);
                        abstractC5032P.f40630q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5374s0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f5374s0 = motionEvent.getPointerId(i);
            int x3 = (int) (motionEvent.getX(i) + 0.5f);
            this.f5381w0 = x3;
            this.f5377u0 = x3;
            int y6 = (int) (motionEvent.getY(i) + 0.5f);
            this.f5383x0 = y6;
            this.f5379v0 = y6;
        }
    }

    public final void S() {
        if (this.f5350O0 || !this.f5338I) {
            return;
        }
        WeakHashMap weakHashMap = X.f2240a;
        postOnAnimation(this.f5366W0);
        this.f5350O0 = true;
    }

    public final void T(AbstractC5032P abstractC5032P, C0357t c0357t) {
        abstractC5032P.f40623j &= -8193;
        boolean z8 = this.f5339I0.f40601h;
        S0.e eVar = this.f5384y;
        if (z8 && abstractC5032P.k() && !abstractC5032P.h() && !abstractC5032P.o()) {
            ((s.e) eVar.f2892v).k(G(abstractC5032P), abstractC5032P);
        }
        k kVar = (k) eVar.f2891u;
        Z z9 = (Z) kVar.getOrDefault(abstractC5032P, null);
        if (z9 == null) {
            z9 = Z.a();
            kVar.put(abstractC5032P, z9);
        }
        z9.f40665b = c0357t;
        z9.f40664a |= 4;
    }

    public final void U(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f5323A;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C5020D) {
            C5020D c5020d = (C5020D) layoutParams;
            if (!c5020d.f40578c) {
                int i = rect.left;
                Rect rect2 = c5020d.f40577b;
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
        this.f5330E.k0(this, view, this.f5323A, !this.f5341K, view2 == null);
    }

    public final void V() {
        VelocityTracker velocityTracker = this.f5375t0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z8 = false;
        c0(0);
        EdgeEffect edgeEffect = this.f5365W;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z8 = this.f5365W.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5369n0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z8 |= this.f5369n0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5370o0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z8 |= this.f5370o0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5371p0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z8 |= this.f5371p0.isFinished();
        }
        if (z8) {
            WeakHashMap weakHashMap = X.f2240a;
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
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z8;
        boolean z9;
        m();
        AbstractC5059v abstractC5059v = this.f5328D;
        int[] iArr = this.f5362U0;
        if (abstractC5059v != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            X(i, i4, iArr);
            i9 = iArr[0];
            i10 = iArr[1];
            i11 = i - i9;
            i12 = i4 - i10;
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        if (!this.f5332F.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        s(i9, i10, i11, i12, this.f5358S0, 0, iArr);
        int i13 = iArr[0];
        int i14 = i11 - i13;
        int i15 = iArr[1];
        int i16 = i12 - i15;
        boolean z10 = (i13 == 0 && i15 == 0) ? false : true;
        int i17 = this.f5381w0;
        int[] iArr2 = this.f5358S0;
        int i18 = iArr2[0];
        this.f5381w0 = i17 - i18;
        int i19 = this.f5383x0;
        int i20 = iArr2[1];
        this.f5383x0 = i19 - i20;
        int[] iArr3 = this.f5360T0;
        iArr3[0] = iArr3[0] + i18;
        iArr3[1] = iArr3[1] + i20;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z8 = true;
            } else {
                float x3 = motionEvent.getX();
                float f6 = i14;
                float y6 = motionEvent.getY();
                float f9 = i16;
                if (f6 < 0.0f) {
                    v();
                    z8 = true;
                    d.a(this.f5365W, (-f6) / getWidth(), 1.0f - (y6 / getHeight()));
                } else {
                    z8 = true;
                    if (f6 > 0.0f) {
                        w();
                        d.a(this.f5370o0, f6 / getWidth(), y6 / getHeight());
                    } else {
                        z9 = false;
                        if (f9 >= 0.0f) {
                            x();
                            d.a(this.f5369n0, (-f9) / getHeight(), x3 / getWidth());
                        } else {
                            if (f9 > 0.0f) {
                                u();
                                d.a(this.f5371p0, f9 / getHeight(), 1.0f - (x3 / getWidth()));
                            }
                            if (!z9 || f6 != 0.0f || f9 != 0.0f) {
                                WeakHashMap weakHashMap = X.f2240a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z9 = z8;
                        if (!z9) {
                        }
                        WeakHashMap weakHashMap2 = X.f2240a;
                        postInvalidateOnAnimation();
                    }
                }
                z9 = z8;
                if (f9 >= 0.0f) {
                }
                z9 = z8;
                if (!z9) {
                }
                WeakHashMap weakHashMap22 = X.f2240a;
                postInvalidateOnAnimation();
            }
            l(i, i4);
        } else {
            z8 = true;
        }
        if (i9 != 0 || i10 != 0) {
            t(i9, i10);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z10 && i9 == 0 && i10 == 0) {
            return false;
        }
        return z8;
    }

    public final void X(int i, int i4, int[] iArr) {
        AbstractC5032P abstractC5032P;
        Q0 q02 = this.f5382x;
        a0();
        P();
        int i9 = n.f1482a;
        Trace.beginSection("RV Scroll");
        C5029M c5029m = this.f5339I0;
        z(c5029m);
        BP bp = this.f5376u;
        int m0 = i != 0 ? this.f5330E.m0(i, bp, c5029m) : 0;
        int o02 = i4 != 0 ? this.f5330E.o0(i4, bp, c5029m) : 0;
        Trace.endSection();
        int e6 = q02.e();
        for (int i10 = 0; i10 < e6; i10++) {
            View d2 = q02.d(i10);
            AbstractC5032P H6 = H(d2);
            if (H6 != null && (abstractC5032P = H6.i) != null) {
                int left = d2.getLeft();
                int top = d2.getTop();
                View view = abstractC5032P.f40615a;
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
        C5056s c5056s;
        if (this.f5347N) {
            return;
        }
        setScrollState(0);
        RunnableC5031O runnableC5031O = this.f5333F0;
        runnableC5031O.f40613z.removeCallbacks(runnableC5031O);
        runnableC5031O.f40609v.abortAnimation();
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C != null && (c5056s = abstractC5019C.f40566e) != null) {
            c5056s.i();
        }
        AbstractC5019C abstractC5019C2 = this.f5330E;
        if (abstractC5019C2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC5019C2.n0(i);
            awakenScrollBars();
        }
    }

    public final void Z(int i, int i4, boolean z8) {
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5347N) {
            return;
        }
        if (!abstractC5019C.d()) {
            i = 0;
        }
        if (!this.f5330E.e()) {
            i4 = 0;
        }
        if (i == 0 && i4 == 0) {
            return;
        }
        if (z8) {
            int i9 = i != 0 ? 1 : 0;
            if (i4 != 0) {
                i9 |= 2;
            }
            getScrollingChildHelper().g(i9, 1);
        }
        this.f5333F0.b(i, i4, Integer.MIN_VALUE, null);
    }

    public final void a0() {
        int i = this.f5343L + 1;
        this.f5343L = i;
        if (i != 1 || this.f5347N) {
            return;
        }
        this.f5345M = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i4) {
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C != null) {
            abstractC5019C.getClass();
        }
        super.addFocusables(arrayList, i, i4);
    }

    public final void b0(boolean z8) {
        if (this.f5343L < 1) {
            this.f5343L = 1;
        }
        if (!z8 && !this.f5347N) {
            this.f5345M = false;
        }
        if (this.f5343L == 1) {
            if (z8 && this.f5345M && !this.f5347N && this.f5330E != null && this.f5328D != null) {
                o();
            }
            if (!this.f5347N) {
                this.f5345M = false;
            }
        }
        this.f5343L--;
    }

    public final void c0(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C5020D) && this.f5330E.f((C5020D) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C != null && abstractC5019C.d()) {
            return this.f5330E.j(this.f5339I0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C != null && abstractC5019C.d()) {
            return this.f5330E.k(this.f5339I0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C != null && abstractC5019C.d()) {
            return this.f5330E.l(this.f5339I0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C != null && abstractC5019C.e()) {
            return this.f5330E.m(this.f5339I0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C != null && abstractC5019C.e()) {
            return this.f5330E.n(this.f5339I0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C != null && abstractC5019C.e()) {
            return this.f5330E.o(this.f5339I0);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f6, float f9, boolean z8) {
        return getScrollingChildHelper().a(f6, f9, z8);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f6, float f9) {
        return getScrollingChildHelper().b(f6, f9);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i4, int i9, int i10, int[] iArr) {
        return getScrollingChildHelper().d(i, i4, i9, i10, iArr, 0, null);
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
        boolean z8;
        super.draw(canvas);
        ArrayList arrayList = this.f5332F;
        int size = arrayList.size();
        boolean z9 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC5017A) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f5365W;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z8 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f5386z ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f5365W;
            z8 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f5369n0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f5386z) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f5369n0;
            z8 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f5370o0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f5386z ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f5370o0;
            z8 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f5371p0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f5386z) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f5371p0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z9 = true;
            }
            z8 |= z9;
            canvas.restoreToCount(save4);
        }
        if ((z8 || this.f5372q0 == null || arrayList.size() <= 0 || !this.f5372q0.f()) ? z8 : true) {
            WeakHashMap weakHashMap = X.f2240a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j9) {
        return super.drawChild(canvas, view, j9);
    }

    public final void f(AbstractC5032P abstractC5032P) {
        View view = abstractC5032P.f40615a;
        boolean z8 = view.getParent() == this;
        this.f5376u.j(H(view));
        if (abstractC5032P.j()) {
            this.f5382x.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z8) {
            this.f5382x.a(view, -1, true);
            return;
        }
        Q0 q02 = this.f5382x;
        int indexOfChild = ((RecyclerView) ((C4524d) q02.f39325b).f37858u).indexOfChild(view);
        if (indexOfChild >= 0) {
            ((C3288h1) q02.f39326c).r(indexOfChild);
            q02.m(view);
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
        char c4;
        boolean z8;
        this.f5330E.getClass();
        boolean z9 = true;
        boolean z10 = (this.f5328D == null || this.f5330E == null || L() || this.f5347N) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        C5029M c5029m = this.f5339I0;
        BP bp = this.f5376u;
        if (z10 && (i == 2 || i == 1)) {
            if (this.f5330E.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? a.f21889U : 33) == null) {
                    z8 = true;
                    if (!z8 && this.f5330E.d()) {
                        z8 = focusFinder.findNextFocus(this, view, !((this.f5330E.C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z8) {
                        m();
                        if (A(view) != null) {
                            a0();
                            this.f5330E.S(view, i, bp, c5029m);
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
            z8 = false;
            if (!z8) {
                if (focusFinder.findNextFocus(this, view, !((this.f5330E.C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z8) {
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
                    view2 = this.f5330E.S(view, i, bp, c5029m);
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
                    Rect rect = this.f5323A;
                    rect.set(0, 0, width, height);
                    int width2 = view2.getWidth();
                    int height2 = view2.getHeight();
                    Rect rect2 = this.f5325B;
                    rect2.set(0, 0, width2, height2);
                    offsetDescendantRectToMyCoords(view, rect);
                    offsetDescendantRectToMyCoords(view2, rect2);
                    int i9 = this.f5330E.C() == 1 ? -1 : 1;
                    int i10 = rect.left;
                    int i11 = rect2.left;
                    if ((i10 < i11 || rect.right <= i11) && rect.right < rect2.right) {
                        i4 = 1;
                    } else {
                        int i12 = rect.right;
                        int i13 = rect2.right;
                        i4 = ((i12 > i13 || i10 >= i13) && i10 > i11) ? -1 : 0;
                    }
                    int i14 = rect.top;
                    int i15 = rect2.top;
                    if ((i14 < i15 || rect.bottom <= i15) && rect.bottom < rect2.bottom) {
                        c4 = 1;
                    } else {
                        int i16 = rect.bottom;
                        int i17 = rect2.bottom;
                        c4 = ((i16 > i17 || i14 >= i17) && i14 > i15) ? (char) 65535 : (char) 0;
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
                        } else if (c4 <= 0) {
                            if (c4 == 0) {
                            }
                        }
                    } else if (c4 >= 0) {
                        if (c4 == 0) {
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

    public final void g(AbstractC5017A abstractC5017A) {
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C != null) {
            abstractC5019C.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f5332F;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC5017A);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C != null) {
            return abstractC5019C.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C != null) {
            return abstractC5019C.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC5059v getAdapter() {
        return this.f5328D;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C == null) {
            return super.getBaseline();
        }
        abstractC5019C.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i4) {
        return super.getChildDrawingOrder(i, i4);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f5386z;
    }

    public C5033Q getCompatAccessibilityDelegate() {
        return this.f5352P0;
    }

    public C5062y getEdgeEffectFactory() {
        return this.f5363V;
    }

    public AbstractC5063z getItemAnimator() {
        return this.f5372q0;
    }

    public int getItemDecorationCount() {
        return this.f5332F.size();
    }

    public AbstractC5019C getLayoutManager() {
        return this.f5330E;
    }

    public int getMaxFlingVelocity() {
        return this.f5326B0;
    }

    public int getMinFlingVelocity() {
        return this.f5324A0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AbstractC5021E getOnFlingListener() {
        return this.f5387z0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f5331E0;
    }

    public C5024H getRecycledViewPool() {
        return this.f5376u.c();
    }

    public int getScrollState() {
        return this.f5373r0;
    }

    public final void h(AbstractC5022F abstractC5022F) {
        if (this.f5342K0 == null) {
            this.f5342K0 = new ArrayList();
        }
        this.f5342K0.add(abstractC5022F);
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
        if (this.f5361U > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f5338I;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f5347N;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2314d;
    }

    public final void k() {
        int l9 = this.f5382x.l();
        for (int i = 0; i < l9; i++) {
            AbstractC5032P I2 = I(this.f5382x.k(i));
            if (!I2.o()) {
                I2.f40618d = -1;
                I2.f40621g = -1;
            }
        }
        BP bp = this.f5376u;
        ArrayList arrayList = (ArrayList) bp.f24039e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC5032P abstractC5032P = (AbstractC5032P) arrayList.get(i4);
            abstractC5032P.f40618d = -1;
            abstractC5032P.f40621g = -1;
        }
        ArrayList arrayList2 = (ArrayList) bp.f24037c;
        int size2 = arrayList2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            AbstractC5032P abstractC5032P2 = (AbstractC5032P) arrayList2.get(i9);
            abstractC5032P2.f40618d = -1;
            abstractC5032P2.f40621g = -1;
        }
        ArrayList arrayList3 = (ArrayList) bp.f24038d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i10 = 0; i10 < size3; i10++) {
                AbstractC5032P abstractC5032P3 = (AbstractC5032P) ((ArrayList) bp.f24038d).get(i10);
                abstractC5032P3.f40618d = -1;
                abstractC5032P3.f40621g = -1;
            }
        }
    }

    public final void l(int i, int i4) {
        boolean z8;
        EdgeEffect edgeEffect = this.f5365W;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z8 = false;
        } else {
            this.f5365W.onRelease();
            z8 = this.f5365W.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5370o0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f5370o0.onRelease();
            z8 |= this.f5370o0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5369n0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.f5369n0.onRelease();
            z8 |= this.f5369n0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5371p0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.f5371p0.onRelease();
            z8 |= this.f5371p0.isFinished();
        }
        if (z8) {
            WeakHashMap weakHashMap = X.f2240a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        N n9 = this.f5380w;
        if (!this.f5341K || this.f5355R) {
            int i = n.f1482a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        if (n9.n()) {
            n9.getClass();
            if (n9.n()) {
                int i4 = n.f1482a;
                Trace.beginSection("RV FullInvalidate");
                o();
                Trace.endSection();
            }
        }
    }

    public final void n(int i, int i4) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = X.f2240a;
        setMeasuredDimension(AbstractC5019C.g(i, paddingRight, getMinimumWidth()), AbstractC5019C.g(i4, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0341, code lost:
    
        if (((java.util.ArrayList) r21.f5382x.f39327d).contains(getFocusedChild()) == false) goto L216;
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
        boolean z8;
        ?? r11;
        View findViewById;
        boolean z9;
        C0357t c0357t;
        ?? r32;
        RecyclerView recyclerView;
        boolean g9;
        boolean z10;
        if (this.f5328D == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f5330E == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        C5029M c5029m = this.f5339I0;
        boolean z11 = false;
        c5029m.i = false;
        boolean z12 = true;
        if (c5029m.f40597d == 1) {
            p();
            this.f5330E.p0(this);
            q();
        } else {
            N n9 = this.f5380w;
            if ((((ArrayList) n9.f198w).isEmpty() || ((ArrayList) n9.f197v).isEmpty()) && this.f5330E.f40574n == getWidth() && this.f5330E.f40575o == getHeight()) {
                this.f5330E.p0(this);
            } else {
                this.f5330E.p0(this);
                q();
            }
        }
        c5029m.a(4);
        a0();
        P();
        c5029m.f40597d = 1;
        boolean z13 = c5029m.f40602j;
        View view = null;
        Long l9 = null;
        BP bp = this.f5376u;
        S0.e eVar = this.f5384y;
        if (z13) {
            int e6 = this.f5382x.e() - 1;
            while (e6 >= 0) {
                AbstractC5032P I2 = I(this.f5382x.d(e6));
                if (I2.o()) {
                    z10 = z12;
                } else {
                    long G7 = G(I2);
                    this.f5372q0.getClass();
                    C0357t c0357t2 = new C0357t();
                    c0357t2.a(I2);
                    AbstractC5032P abstractC5032P = (AbstractC5032P) ((s.e) eVar.f2892v).j(G7, l9);
                    if (abstractC5032P == null || abstractC5032P.o()) {
                        z10 = z12;
                        eVar.b(I2, c0357t2);
                    } else {
                        k kVar = (k) eVar.f2891u;
                        z10 = z12;
                        Z z14 = (Z) kVar.getOrDefault(abstractC5032P, l9);
                        boolean z15 = (z14 == null || (z14.f40664a & 1) == 0) ? false : z10;
                        Z z16 = (Z) kVar.getOrDefault(I2, l9);
                        boolean z17 = (z16 == null || (z16.f40664a & 1) == 0) ? false : z10;
                        if (z15 && abstractC5032P == I2) {
                            eVar.b(I2, c0357t2);
                        } else {
                            C0357t l10 = eVar.l(abstractC5032P, 4);
                            eVar.b(I2, c0357t2);
                            C0357t l11 = eVar.l(I2, 8);
                            if (l10 == null) {
                                int e9 = this.f5382x.e();
                                for (int i = 0; i < e9; i++) {
                                    AbstractC5032P I8 = I(this.f5382x.d(i));
                                    if (I8 != I2 && G(I8) == G7) {
                                        AbstractC5059v abstractC5059v = this.f5328D;
                                        if (abstractC5059v == null || !abstractC5059v.f40800b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + I8 + " \n View Holder 2:" + I2 + y());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + I8 + " \n View Holder 2:" + I2 + y());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC5032P + " cannot be found but it is necessary for " + I2 + y());
                            } else {
                                abstractC5032P.n(false);
                                if (z15) {
                                    f(abstractC5032P);
                                }
                                if (abstractC5032P != I2) {
                                    if (z17) {
                                        f(I2);
                                    }
                                    abstractC5032P.f40622h = I2;
                                    f(abstractC5032P);
                                    bp.j(abstractC5032P);
                                    I2.n(false);
                                    I2.i = abstractC5032P;
                                }
                                if (this.f5372q0.a(abstractC5032P, I2, l10, l11)) {
                                    S();
                                }
                            }
                        }
                    }
                }
                e6--;
                z12 = z10;
                l9 = null;
            }
            z8 = z12;
            k kVar2 = (k) eVar.f2891u;
            int i4 = kVar2.f40409v - 1;
            while (i4 >= 0) {
                AbstractC5032P abstractC5032P2 = (AbstractC5032P) kVar2.h(i4);
                Z z18 = (Z) kVar2.j(i4);
                int i9 = z18.f40664a;
                int i10 = i9 & 3;
                C4523c c4523c = this.f5367X0;
                if (i10 == 3) {
                    RecyclerView recyclerView2 = (RecyclerView) c4523c.f37856u;
                    recyclerView2.f5330E.i0(abstractC5032P2.f40615a, recyclerView2.f5376u);
                    r32 = z11;
                } else if ((i9 & 1) != 0) {
                    C0357t c0357t3 = z18.f40665b;
                    if (c0357t3 == null) {
                        RecyclerView recyclerView3 = (RecyclerView) c4523c.f37856u;
                        recyclerView3.f5330E.i0(abstractC5032P2.f40615a, recyclerView3.f5376u);
                        r32 = z11;
                    } else {
                        c4523c.B(abstractC5032P2, c0357t3, z18.f40666c);
                        r32 = z11;
                    }
                } else if ((i9 & 14) == 14) {
                    c4523c.y(abstractC5032P2, z18.f40665b, z18.f40666c);
                    r32 = z11;
                } else if ((i9 & 12) == 12) {
                    C0357t c0357t4 = z18.f40665b;
                    C0357t c0357t5 = z18.f40666c;
                    c4523c.getClass();
                    abstractC5032P2.n(z11);
                    RecyclerView recyclerView4 = (RecyclerView) c4523c.f37856u;
                    if (!recyclerView4.f5355R) {
                        C5045h c5045h = (C5045h) recyclerView4.f5372q0;
                        c5045h.getClass();
                        int i11 = c0357t4.f2319a;
                        int i12 = c0357t5.f2319a;
                        if (i11 == i12 && c0357t4.f2320b == c0357t5.f2320b) {
                            c5045h.c(abstractC5032P2);
                            recyclerView = recyclerView4;
                            g9 = false;
                        } else {
                            recyclerView = recyclerView4;
                            g9 = c5045h.g(abstractC5032P2, i11, c0357t4.f2320b, i12, c0357t5.f2320b);
                        }
                        if (g9) {
                            recyclerView.S();
                        }
                    } else if (recyclerView4.f5372q0.a(abstractC5032P2, abstractC5032P2, c0357t4, c0357t5)) {
                        recyclerView4.S();
                    }
                    r32 = 0;
                } else {
                    if ((i9 & 4) != 0) {
                        c0357t = null;
                        c4523c.B(abstractC5032P2, z18.f40665b, null);
                    } else {
                        c0357t = null;
                        if ((i9 & 8) != 0) {
                            c4523c.y(abstractC5032P2, z18.f40665b, z18.f40666c);
                        }
                    }
                    r32 = 0;
                    z18.f40664a = r32;
                    z18.f40665b = c0357t;
                    z18.f40666c = c0357t;
                    Z.f40663d.c(z18);
                    i4--;
                    z11 = false;
                }
                c0357t = null;
                z18.f40664a = r32;
                z18.f40665b = c0357t;
                z18.f40666c = c0357t;
                Z.f40663d.c(z18);
                i4--;
                z11 = false;
            }
            view = null;
        } else {
            z8 = true;
        }
        this.f5330E.h0(bp);
        c5029m.f40595b = c5029m.f40598e;
        this.f5355R = false;
        this.f5357S = false;
        c5029m.f40602j = false;
        c5029m.f40603k = false;
        this.f5330E.f40567f = false;
        ArrayList arrayList = (ArrayList) bp.f24038d;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C.f40571k) {
            abstractC5019C.f40570j = 0;
            abstractC5019C.f40571k = false;
            bp.k();
        }
        this.f5330E.c0(c5029m);
        Q(z8);
        b0(false);
        ((k) eVar.f2891u).clear();
        ((s.e) eVar.f2892v).h();
        int[] iArr = this.f5354Q0;
        int i13 = iArr[0];
        int i14 = iArr[1];
        C(iArr);
        if ((iArr[0] == i13 && iArr[1] == i14) ? false : true) {
            t(0, 0);
        }
        if (this.f5331E0 && this.f5328D != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j9 = c5029m.f40605m;
            if (j9 != -1 && (z9 = this.f5328D.f40800b) && z9) {
                int l12 = this.f5382x.l();
                int i15 = 0;
                r11 = view;
                while (true) {
                    if (i15 >= l12) {
                        break;
                    }
                    AbstractC5032P I9 = I(this.f5382x.k(i15));
                    if (I9 != null && !I9.h() && I9.f40619e == j9) {
                        if (!((ArrayList) this.f5382x.f39327d).contains(I9.f40615a)) {
                            r11 = I9;
                            break;
                        }
                        r11 = I9;
                    }
                    i15++;
                    r11 = r11;
                }
            } else {
                r11 = view;
            }
            if (r11 != null) {
                ArrayList arrayList2 = (ArrayList) this.f5382x.f39327d;
                View view2 = r11.f40615a;
                if (!arrayList2.contains(view2) && view2.hasFocusable()) {
                    view = view2;
                    if (view != null) {
                        int i16 = c5029m.f40606n;
                        if (i16 != -1 && (findViewById = view.findViewById(i16)) != null && findViewById.isFocusable()) {
                            view = findViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
            if (this.f5382x.e() > 0) {
                int i17 = c5029m.f40604l;
                int i18 = i17 != -1 ? i17 : 0;
                int b9 = c5029m.b();
                for (int i19 = i18; i19 < b9; i19++) {
                    AbstractC5032P E8 = E(i19);
                    if (E8 == null) {
                        break;
                    }
                    View view3 = E8.f40615a;
                    if (view3.hasFocusable()) {
                        view = view3;
                        break;
                    }
                }
                int min = Math.min(b9, i18) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    AbstractC5032P E9 = E(min);
                    if (E9 == null) {
                        break;
                    }
                    View view4 = E9.f40615a;
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
        c5029m.f40605m = -1L;
        c5029m.f40604l = -1;
        c5029m.f40606n = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f6;
        super.onAttachedToWindow();
        this.f5359T = 0;
        this.f5338I = true;
        this.f5341K = this.f5341K && !isLayoutRequested();
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C != null) {
            abstractC5019C.f40568g = true;
            abstractC5019C.Q(this);
        }
        this.f5350O0 = false;
        ThreadLocal threadLocal = RunnableC5050m.f40749x;
        RunnableC5050m runnableC5050m = (RunnableC5050m) threadLocal.get();
        this.f5335G0 = runnableC5050m;
        if (runnableC5050m == null) {
            RunnableC5050m runnableC5050m2 = new RunnableC5050m();
            runnableC5050m2.f40751n = new ArrayList();
            runnableC5050m2.f40754w = new ArrayList();
            this.f5335G0 = runnableC5050m2;
            WeakHashMap weakHashMap = X.f2240a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f6 = display.getRefreshRate();
            }
            f6 = 60.0f;
            RunnableC5050m runnableC5050m3 = this.f5335G0;
            runnableC5050m3.f40753v = (long) (1.0E9f / f6);
            threadLocal.set(runnableC5050m3);
        }
        this.f5335G0.f40751n.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C5056s c5056s;
        super.onDetachedFromWindow();
        AbstractC5063z abstractC5063z = this.f5372q0;
        if (abstractC5063z != null) {
            abstractC5063z.e();
        }
        setScrollState(0);
        RunnableC5031O runnableC5031O = this.f5333F0;
        runnableC5031O.f40613z.removeCallbacks(runnableC5031O);
        runnableC5031O.f40609v.abortAnimation();
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C != null && (c5056s = abstractC5019C.f40566e) != null) {
            c5056s.i();
        }
        this.f5338I = false;
        AbstractC5019C abstractC5019C2 = this.f5330E;
        if (abstractC5019C2 != null) {
            abstractC5019C2.f40568g = false;
            abstractC5019C2.R(this);
        }
        this.f5364V0.clear();
        removeCallbacks(this.f5366W0);
        this.f5384y.getClass();
        while (Z.f40663d.a() != null) {
        }
        RunnableC5050m runnableC5050m = this.f5335G0;
        if (runnableC5050m != null) {
            runnableC5050m.f40751n.remove(this);
            this.f5335G0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f5332F;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC5017A) arrayList.get(i)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f6;
        float f9;
        if (this.f5330E != null && !this.f5347N && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f6 = this.f5330E.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f5330E.d()) {
                    f9 = motionEvent.getAxisValue(10);
                    if (f6 == 0.0f || f9 != 0.0f) {
                        W((int) (f9 * this.C0), (int) (f6 * this.f5329D0), motionEvent);
                    }
                }
                f9 = 0.0f;
                if (f6 == 0.0f) {
                }
                W((int) (f9 * this.C0), (int) (f6 * this.f5329D0), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f5330E.e()) {
                        f6 = -axisValue;
                        f9 = 0.0f;
                        if (f6 == 0.0f) {
                        }
                        W((int) (f9 * this.C0), (int) (f6 * this.f5329D0), motionEvent);
                    } else if (this.f5330E.d()) {
                        f9 = axisValue;
                        f6 = 0.0f;
                        if (f6 == 0.0f) {
                        }
                        W((int) (f9 * this.C0), (int) (f6 * this.f5329D0), motionEvent);
                    }
                }
                f6 = 0.0f;
                f9 = 0.0f;
                if (f6 == 0.0f) {
                }
                W((int) (f9 * this.C0), (int) (f6 * this.f5329D0), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        if (!this.f5347N) {
            this.f5336H = null;
            if (B(motionEvent)) {
                V();
                setScrollState(0);
                return true;
            }
            AbstractC5019C abstractC5019C = this.f5330E;
            if (abstractC5019C != null) {
                boolean d2 = abstractC5019C.d();
                boolean e6 = this.f5330E.e();
                if (this.f5375t0 == null) {
                    this.f5375t0 = VelocityTracker.obtain();
                }
                this.f5375t0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f5349O) {
                        this.f5349O = false;
                    }
                    this.f5374s0 = motionEvent.getPointerId(0);
                    int x3 = (int) (motionEvent.getX() + 0.5f);
                    this.f5381w0 = x3;
                    this.f5377u0 = x3;
                    int y6 = (int) (motionEvent.getY() + 0.5f);
                    this.f5383x0 = y6;
                    this.f5379v0 = y6;
                    if (this.f5373r0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        c0(1);
                    }
                    int[] iArr = this.f5360T0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = d2;
                    if (e6) {
                        i = (d2 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
                } else if (actionMasked == 1) {
                    this.f5375t0.clear();
                    c0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f5374s0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5374s0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x9 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y8 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f5373r0 != 1) {
                        int i4 = x9 - this.f5377u0;
                        int i9 = y8 - this.f5379v0;
                        if (d2 == 0 || Math.abs(i4) <= this.f5385y0) {
                            z8 = false;
                        } else {
                            this.f5381w0 = x9;
                            z8 = true;
                        }
                        if (e6 && Math.abs(i9) > this.f5385y0) {
                            this.f5383x0 = y8;
                            z8 = true;
                        }
                        if (z8) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    V();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f5374s0 = motionEvent.getPointerId(actionIndex);
                    int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f5381w0 = x10;
                    this.f5377u0 = x10;
                    int y9 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f5383x0 = y9;
                    this.f5379v0 = y9;
                } else if (actionMasked == 6) {
                    R(motionEvent);
                }
                if (this.f5373r0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        int i11 = n.f1482a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f5341K = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C == null) {
            n(i, i4);
            return;
        }
        boolean L8 = abstractC5019C.L();
        C5029M c5029m = this.f5339I0;
        if (!L8) {
            if (this.J) {
                this.f5330E.f40563b.n(i, i4);
                return;
            }
            if (c5029m.f40603k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC5059v abstractC5059v = this.f5328D;
            if (abstractC5059v != null) {
                c5029m.f40598e = abstractC5059v.a();
            } else {
                c5029m.f40598e = 0;
            }
            a0();
            this.f5330E.f40563b.n(i, i4);
            b0(false);
            c5029m.f40600g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        this.f5330E.f40563b.n(i, i4);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f5328D == null) {
            return;
        }
        if (c5029m.f40597d == 1) {
            p();
        }
        this.f5330E.q0(i, i4);
        c5029m.i = true;
        q();
        this.f5330E.s0(i, i4);
        if (this.f5330E.v0()) {
            this.f5330E.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            c5029m.i = true;
            q();
            this.f5330E.s0(i, i4);
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
        if (!(parcelable instanceof C5026J)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5026J c5026j = (C5026J) parcelable;
        this.f5378v = c5026j;
        super.onRestoreInstanceState(c5026j.f3318n);
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C == null || (parcelable2 = this.f5378v.f40586v) == null) {
            return;
        }
        abstractC5019C.d0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C5026J c5026j = new C5026J(super.onSaveInstanceState());
        C5026J c5026j2 = this.f5378v;
        if (c5026j2 != null) {
            c5026j.f40586v = c5026j2.f40586v;
            return c5026j;
        }
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C != null) {
            c5026j.f40586v = abstractC5019C.e0();
            return c5026j;
        }
        c5026j.f40586v = null;
        return c5026j;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i9, int i10) {
        super.onSizeChanged(i, i4, i9, i10);
        if (i == i9 && i4 == i10) {
            return;
        }
        this.f5371p0 = null;
        this.f5369n0 = null;
        this.f5370o0 = null;
        this.f5365W = null;
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
        boolean z8;
        int i;
        int minFlingVelocity;
        boolean z9;
        C4859b c4859b;
        float f6;
        int H6;
        PointF a9;
        int i4;
        int i9;
        boolean z10;
        if (!this.f5347N && !this.f5349O) {
            C5048k c5048k = this.f5336H;
            if (c5048k == null) {
                z8 = motionEvent.getAction() == 0 ? false : B(motionEvent);
            } else {
                if (c5048k.f40739v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean d2 = c5048k.d(motionEvent.getX(), motionEvent.getY());
                        boolean c4 = c5048k.c(motionEvent.getX(), motionEvent.getY());
                        if (d2 || c4) {
                            if (c4) {
                                c5048k.f40740w = 1;
                                c5048k.f40733p = (int) motionEvent.getX();
                            } else if (d2) {
                                c5048k.f40740w = 2;
                                c5048k.f40730m = (int) motionEvent.getY();
                            }
                            c5048k.f(2);
                        }
                    } else if (motionEvent.getAction() == 1 && c5048k.f40739v == 2) {
                        c5048k.f40730m = 0.0f;
                        c5048k.f40733p = 0.0f;
                        c5048k.f(1);
                        c5048k.f40740w = 0;
                    } else if (motionEvent.getAction() == 2 && c5048k.f40739v == 2) {
                        c5048k.g();
                        int i10 = c5048k.f40740w;
                        int i11 = c5048k.f40720b;
                        if (i10 == 1) {
                            float x3 = motionEvent.getX();
                            int[] iArr = c5048k.f40742y;
                            iArr[0] = i11;
                            int i12 = c5048k.f40734q - i11;
                            iArr[1] = i12;
                            float max = Math.max(i11, Math.min(i12, x3));
                            if (Math.abs(c5048k.f40732o - max) >= 2.0f) {
                                int e6 = C5048k.e(c5048k.f40733p, max, iArr, c5048k.f40736s.computeHorizontalScrollRange(), c5048k.f40736s.computeHorizontalScrollOffset(), c5048k.f40734q);
                                if (e6 != 0) {
                                    c5048k.f40736s.scrollBy(e6, 0);
                                }
                                c5048k.f40733p = max;
                            }
                        }
                        if (c5048k.f40740w == 2) {
                            float y6 = motionEvent.getY();
                            int[] iArr2 = c5048k.f40741x;
                            iArr2[0] = i11;
                            int i13 = c5048k.f40735r - i11;
                            iArr2[1] = i13;
                            float max2 = Math.max(i11, Math.min(i13, y6));
                            if (Math.abs(c5048k.f40729l - max2) >= 2.0f) {
                                int e9 = C5048k.e(c5048k.f40730m, max2, iArr2, c5048k.f40736s.computeVerticalScrollRange(), c5048k.f40736s.computeVerticalScrollOffset(), c5048k.f40735r);
                                if (e9 != 0) {
                                    c5048k.f40736s.scrollBy(0, e9);
                                }
                                c5048k.f40730m = max2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f5336H = null;
                }
                z8 = true;
            }
            if (z8) {
                V();
                setScrollState(0);
                return true;
            }
            AbstractC5019C abstractC5019C = this.f5330E;
            if (abstractC5019C != null) {
                boolean d3 = abstractC5019C.d();
                boolean e10 = this.f5330E.e();
                if (this.f5375t0 == null) {
                    this.f5375t0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.f5360T0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked == 0) {
                    this.f5374s0 = motionEvent.getPointerId(0);
                    int x9 = (int) (motionEvent.getX() + 0.5f);
                    this.f5381w0 = x9;
                    this.f5377u0 = x9;
                    int y8 = (int) (motionEvent.getY() + 0.5f);
                    this.f5383x0 = y8;
                    this.f5379v0 = y8;
                    int i14 = d3;
                    if (e10) {
                        i14 = (d3 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i14, 0);
                } else {
                    if (actionMasked == 1) {
                        this.f5375t0.addMovement(obtain);
                        VelocityTracker velocityTracker = this.f5375t0;
                        int i15 = this.f5326B0;
                        velocityTracker.computeCurrentVelocity(1000, i15);
                        float f9 = d3 != 0 ? -this.f5375t0.getXVelocity(this.f5374s0) : 0.0f;
                        float f10 = e10 ? -this.f5375t0.getYVelocity(this.f5374s0) : 0.0f;
                        if (f9 == 0.0f && f10 == 0.0f) {
                            i9 = 0;
                        } else {
                            int i16 = (int) f9;
                            int i17 = (int) f10;
                            AbstractC5019C abstractC5019C2 = this.f5330E;
                            if (abstractC5019C2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.f5347N) {
                                int d9 = abstractC5019C2.d();
                                boolean e11 = this.f5330E.e();
                                int i18 = this.f5324A0;
                                if (d9 == 0 || Math.abs(i16) < i18) {
                                    i16 = 0;
                                }
                                if (!e11 || Math.abs(i17) < i18) {
                                    i17 = 0;
                                }
                                if (i16 != 0 || i17 != 0) {
                                    float f11 = i16;
                                    float f12 = i17;
                                    if (!dispatchNestedPreFling(f11, f12)) {
                                        boolean z11 = d9 != 0 || e11;
                                        dispatchNestedFling(f11, f12, z11);
                                        AbstractC5021E abstractC5021E = this.f5387z0;
                                        if (abstractC5021E != null) {
                                            C5058u c5058u = (C5058u) abstractC5021E;
                                            AbstractC5019C layoutManager = c5058u.f40795a.getLayoutManager();
                                            if (layoutManager != 0 && c5058u.f40795a.getAdapter() != null && ((Math.abs(i17) > (minFlingVelocity = c5058u.f40795a.getMinFlingVelocity()) || Math.abs(i16) > minFlingVelocity) && ((z9 = layoutManager instanceof InterfaceC5028L)))) {
                                                if (z9) {
                                                    f6 = 0.0f;
                                                    c4859b = new C4859b(1, c5058u.f40795a.getContext(), c5058u);
                                                } else {
                                                    f6 = 0.0f;
                                                    c4859b = null;
                                                }
                                                if (c4859b != null) {
                                                    int B8 = layoutManager.B();
                                                    if (B8 != 0) {
                                                        g e12 = layoutManager.e() ? c5058u.e(layoutManager) : layoutManager.d() ? c5058u.d(layoutManager) : null;
                                                        if (e12 != null) {
                                                            int v6 = layoutManager.v();
                                                            int i19 = Integer.MIN_VALUE;
                                                            int i20 = Integer.MAX_VALUE;
                                                            View view = null;
                                                            View view2 = null;
                                                            i = 1;
                                                            int i21 = 0;
                                                            while (i21 < v6) {
                                                                int i22 = v6;
                                                                View u7 = layoutManager.u(i21);
                                                                if (u7 == null) {
                                                                    i4 = i21;
                                                                } else {
                                                                    i4 = i21;
                                                                    int b9 = C5058u.b(u7, e12);
                                                                    if (b9 <= 0 && b9 > i19) {
                                                                        view2 = u7;
                                                                        i19 = b9;
                                                                    }
                                                                    if (b9 >= 0 && b9 < i20) {
                                                                        view = u7;
                                                                        i20 = b9;
                                                                    }
                                                                }
                                                                i21 = i4 + 1;
                                                                v6 = i22;
                                                            }
                                                            boolean z12 = !layoutManager.d() ? i17 <= 0 : i16 <= 0;
                                                            if (z12 && view != null) {
                                                                H6 = AbstractC5019C.H(view);
                                                            } else if (z12 || view2 == null) {
                                                                if (z12) {
                                                                    view = view2;
                                                                }
                                                                if (view != null) {
                                                                    H6 = ((z9 && (a9 = ((InterfaceC5028L) layoutManager).a(layoutManager.B() + (-1))) != null && ((a9.x > f6 ? 1 : (a9.x == f6 ? 0 : -1)) < 0 || (a9.y > f6 ? 1 : (a9.y == f6 ? 0 : -1)) < 0)) == z12 ? -1 : 1) + AbstractC5019C.H(view);
                                                                    if (H6 >= 0) {
                                                                    }
                                                                }
                                                                H6 = -1;
                                                            } else {
                                                                H6 = AbstractC5019C.H(view2);
                                                            }
                                                            if (H6 != -1) {
                                                                c4859b.f40779a = H6;
                                                                layoutManager.y0(c4859b);
                                                                V();
                                                                obtain.recycle();
                                                                return true;
                                                            }
                                                            if (z11) {
                                                                if (e11) {
                                                                    d9 = (d9 == true ? 1 : 0) | 2;
                                                                }
                                                                getScrollingChildHelper().g(d9, i);
                                                                int i23 = -i15;
                                                                int max3 = Math.max(i23, Math.min(i16, i15));
                                                                int max4 = Math.max(i23, Math.min(i17, i15));
                                                                RunnableC5031O runnableC5031O = this.f5333F0;
                                                                RecyclerView recyclerView = runnableC5031O.f40613z;
                                                                recyclerView.setScrollState(2);
                                                                runnableC5031O.f40608u = 0;
                                                                runnableC5031O.f40607n = 0;
                                                                Interpolator interpolator = runnableC5031O.f40610w;
                                                                b bVar = f5322a1;
                                                                if (interpolator != bVar) {
                                                                    runnableC5031O.f40610w = bVar;
                                                                    runnableC5031O.f40609v = new OverScroller(recyclerView.getContext(), bVar);
                                                                }
                                                                runnableC5031O.f40609v.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                                runnableC5031O.a();
                                                                V();
                                                                obtain.recycle();
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                    i = 1;
                                                    H6 = -1;
                                                    if (H6 != -1) {
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
                            i9 = 0;
                        }
                        setScrollState(i9);
                        V();
                        obtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f5374s0);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5374s0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y9 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i24 = this.f5381w0 - x10;
                        int i25 = this.f5383x0 - y9;
                        if (this.f5373r0 != 1) {
                            if (d3 != 0) {
                                i24 = i24 > 0 ? Math.max(0, i24 - this.f5385y0) : Math.min(0, i24 + this.f5385y0);
                                if (i24 != 0) {
                                    z10 = true;
                                    if (e10) {
                                        i25 = i25 > 0 ? Math.max(0, i25 - this.f5385y0) : Math.min(0, i25 + this.f5385y0);
                                        if (i25 != 0) {
                                            z10 = true;
                                        }
                                    }
                                    if (z10) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z10 = false;
                            if (e10) {
                            }
                            if (z10) {
                            }
                        }
                        int i26 = i24;
                        int i27 = i25;
                        if (this.f5373r0 == 1) {
                            int[] iArr4 = this.f5362U0;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            boolean r9 = r(d3 != 0 ? i26 : 0, e10 ? i27 : 0, 0, iArr4, this.f5358S0);
                            int[] iArr5 = this.f5358S0;
                            if (r9) {
                                i26 -= iArr4[0];
                                i27 -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i28 = i27;
                            this.f5381w0 = x10 - iArr5[0];
                            this.f5383x0 = y9 - iArr5[1];
                            if (W(d3 != 0 ? i26 : 0, e10 ? i28 : 0, motionEvent)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            RunnableC5050m runnableC5050m = this.f5335G0;
                            if (runnableC5050m != null && (i26 != 0 || i28 != 0)) {
                                runnableC5050m.a(this, i26, i28);
                            }
                        }
                    } else if (actionMasked == 3) {
                        V();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f5374s0 = motionEvent.getPointerId(actionIndex);
                        int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f5381w0 = x11;
                        this.f5377u0 = x11;
                        int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f5383x0 = y10;
                        this.f5379v0 = y10;
                    } else if (actionMasked == 6) {
                        R(motionEvent);
                    }
                }
                this.f5375t0.addMovement(obtain);
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
        View A8;
        int F8;
        View view;
        Z z8;
        boolean z9;
        int i;
        boolean z10;
        boolean z11;
        char c4;
        boolean z12;
        boolean z13;
        C5038a r9;
        int i4;
        int i9;
        C5038a c5038a;
        C5029M c5029m = this.f5339I0;
        c5029m.a(1);
        z(c5029m);
        c5029m.i = false;
        a0();
        S0.e eVar = this.f5384y;
        ((k) eVar.f2891u).clear();
        s.e eVar2 = (s.e) eVar.f2892v;
        eVar2.h();
        P();
        if (this.f5355R) {
            N n9 = this.f5380w;
            n9.t((ArrayList) n9.f197v);
            n9.t((ArrayList) n9.f198w);
            if (this.f5357S) {
                this.f5330E.X();
            }
        }
        if (this.f5372q0 == null || !this.f5330E.z0()) {
            this.f5380w.h();
        } else {
            N n10 = this.f5380w;
            ArrayList arrayList = (ArrayList) n10.f197v;
            m mVar = (m) n10.f200y;
            mVar.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                boolean z14 = false;
                while (true) {
                    i = 8;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (((C5038a) arrayList.get(size)).f40667a == 8) {
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
                int i10 = size + 1;
                C5038a c5038a2 = (C5038a) arrayList.get(size);
                C5038a c5038a3 = (C5038a) arrayList.get(i10);
                int i11 = c5038a3.f40667a;
                if (i11 != 1) {
                    C5038a c5038a4 = null;
                    N n11 = (N) mVar.f38384n;
                    if (i11 == 2) {
                        int i12 = c5038a2.f40668b;
                        int i13 = c5038a2.f40669c;
                        if (i12 < i13) {
                            if (c5038a3.f40668b == i12 && c5038a3.f40669c == i13 - i12) {
                                z12 = false;
                                z13 = true;
                            } else {
                                z12 = false;
                                z13 = false;
                            }
                        } else if (c5038a3.f40668b == i13 + 1 && c5038a3.f40669c == i12 - i13) {
                            z12 = true;
                            z13 = true;
                        } else {
                            z12 = true;
                            z13 = false;
                        }
                        int i14 = c5038a3.f40668b;
                        if (i13 < i14) {
                            c5038a3.f40668b = i14 - 1;
                        } else {
                            int i15 = c5038a3.f40669c;
                            if (i13 < i14 + i15) {
                                c5038a3.f40669c = i15 - 1;
                                c5038a2.f40667a = 2;
                                c5038a2.f40669c = 1;
                                if (c5038a3.f40669c == 0) {
                                    arrayList.remove(i10);
                                    n11.getClass();
                                    ((c) n11.f196u).c(c5038a3);
                                }
                            }
                        }
                        int i16 = c5038a2.f40668b;
                        int i17 = c5038a3.f40668b;
                        if (i16 <= i17) {
                            c5038a3.f40668b = i17 + 1;
                        } else {
                            int i18 = i17 + c5038a3.f40669c;
                            if (i16 < i18) {
                                c5038a4 = n11.r(2, i16 + 1, i18 - i16);
                                c5038a3.f40669c = c5038a2.f40668b - c5038a3.f40668b;
                            }
                        }
                        C5038a c5038a5 = c5038a4;
                        if (z13) {
                            arrayList.set(size, c5038a3);
                            arrayList.remove(i10);
                            n11.getClass();
                            ((c) n11.f196u).c(c5038a2);
                        } else {
                            if (z12) {
                                if (c5038a5 != null) {
                                    int i19 = c5038a2.f40668b;
                                    if (i19 > c5038a5.f40668b) {
                                        c5038a2.f40668b = i19 - c5038a5.f40669c;
                                    }
                                    int i20 = c5038a2.f40669c;
                                    if (i20 > c5038a5.f40668b) {
                                        c5038a2.f40669c = i20 - c5038a5.f40669c;
                                    }
                                }
                                int i21 = c5038a2.f40668b;
                                if (i21 > c5038a3.f40668b) {
                                    c5038a2.f40668b = i21 - c5038a3.f40669c;
                                }
                                int i22 = c5038a2.f40669c;
                                if (i22 > c5038a3.f40668b) {
                                    c5038a2.f40669c = i22 - c5038a3.f40669c;
                                }
                            } else {
                                if (c5038a5 != null) {
                                    int i23 = c5038a2.f40668b;
                                    if (i23 >= c5038a5.f40668b) {
                                        c5038a2.f40668b = i23 - c5038a5.f40669c;
                                    }
                                    int i24 = c5038a2.f40669c;
                                    if (i24 >= c5038a5.f40668b) {
                                        c5038a2.f40669c = i24 - c5038a5.f40669c;
                                    }
                                }
                                int i25 = c5038a2.f40668b;
                                if (i25 >= c5038a3.f40668b) {
                                    c5038a2.f40668b = i25 - c5038a3.f40669c;
                                }
                                int i26 = c5038a2.f40669c;
                                if (i26 >= c5038a3.f40668b) {
                                    c5038a2.f40669c = i26 - c5038a3.f40669c;
                                }
                            }
                            arrayList.set(size, c5038a3);
                            if (c5038a2.f40668b != c5038a2.f40669c) {
                                arrayList.set(i10, c5038a2);
                            } else {
                                arrayList.remove(i10);
                            }
                            if (c5038a5 != null) {
                                arrayList.add(size, c5038a5);
                            }
                        }
                    } else if (i11 == 4) {
                        int i27 = c5038a2.f40669c;
                        int i28 = c5038a3.f40668b;
                        if (i27 < i28) {
                            c5038a3.f40668b = i28 - 1;
                        } else {
                            int i29 = c5038a3.f40669c;
                            if (i27 < i28 + i29) {
                                c5038a3.f40669c = i29 - 1;
                                r9 = n11.r(4, c5038a2.f40668b, 1);
                                i4 = c5038a2.f40668b;
                                i9 = c5038a3.f40668b;
                                if (i4 > i9) {
                                    c5038a3.f40668b = i9 + 1;
                                } else {
                                    int i30 = i9 + c5038a3.f40669c;
                                    if (i4 < i30) {
                                        int i31 = i30 - i4;
                                        c5038a4 = n11.r(4, i4 + 1, i31);
                                        c5038a3.f40669c -= i31;
                                    }
                                }
                                c5038a = c5038a4;
                                arrayList.set(i10, c5038a2);
                                if (c5038a3.f40669c <= 0) {
                                    arrayList.set(size, c5038a3);
                                } else {
                                    arrayList.remove(size);
                                    n11.getClass();
                                    ((c) n11.f196u).c(c5038a3);
                                }
                                if (r9 != null) {
                                    arrayList.add(size, r9);
                                }
                                if (c5038a == null) {
                                    arrayList.add(size, c5038a);
                                }
                            }
                        }
                        r9 = null;
                        i4 = c5038a2.f40668b;
                        i9 = c5038a3.f40668b;
                        if (i4 > i9) {
                        }
                        c5038a = c5038a4;
                        arrayList.set(i10, c5038a2);
                        if (c5038a3.f40669c <= 0) {
                        }
                        if (r9 != null) {
                        }
                        if (c5038a == null) {
                        }
                    }
                } else {
                    int i32 = c5038a2.f40669c;
                    int i33 = c5038a3.f40668b;
                    int i34 = i32 < i33 ? -1 : 0;
                    int i35 = c5038a2.f40668b;
                    if (i35 < i33) {
                        i34++;
                    }
                    if (i33 <= i35) {
                        c5038a2.f40668b = i35 + c5038a3.f40669c;
                    }
                    int i36 = c5038a3.f40668b;
                    if (i36 <= i32) {
                        c5038a2.f40669c = i32 + c5038a3.f40669c;
                    }
                    c5038a3.f40668b = i36 + i34;
                    arrayList.set(size, c5038a3);
                    arrayList.set(i10, c5038a2);
                }
            }
            int size2 = arrayList.size();
            int i37 = 0;
            while (i37 < size2) {
                C5038a c5038a6 = (C5038a) arrayList.get(i37);
                int i38 = c5038a6.f40667a;
                if (i38 != 1) {
                    h8.d dVar = (h8.d) n10.f199x;
                    if (i38 == 2) {
                        int i39 = c5038a6.f40668b;
                        int i40 = c5038a6.f40669c + i39;
                        int i41 = i39;
                        int i42 = 0;
                        char c9 = 65535;
                        while (i41 < i40) {
                            if (dVar.f(i41) != null || n10.g(i41)) {
                                if (c9 == 0) {
                                    n10.j(n10.r(2, i39, i42));
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 = z10;
                                c4 = 1;
                            } else {
                                if (c9 == 1) {
                                    n10.s(n10.r(2, i39, i42));
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                c4 = 0;
                            }
                            if (z11) {
                                i41 -= i42;
                                i40 -= i42;
                                i42 = 1;
                            } else {
                                i42++;
                            }
                            i41++;
                            c9 = c4;
                        }
                        if (i42 != c5038a6.f40669c) {
                            ((c) n10.f196u).c(c5038a6);
                            c5038a6 = n10.r(2, i39, i42);
                        }
                        if (c9 == 0) {
                            n10.j(c5038a6);
                        } else {
                            n10.s(c5038a6);
                        }
                    } else if (i38 == 4) {
                        int i43 = c5038a6.f40668b;
                        int i44 = c5038a6.f40669c + i43;
                        int i45 = i43;
                        int i46 = 0;
                        char c10 = 65535;
                        while (i43 < i44) {
                            if (dVar.f(i43) != null || n10.g(i43)) {
                                if (c10 == 0) {
                                    n10.j(n10.r(4, i45, i46));
                                    i45 = i43;
                                    i46 = 0;
                                }
                                c10 = 1;
                            } else {
                                if (c10 == 1) {
                                    n10.s(n10.r(4, i45, i46));
                                    i45 = i43;
                                    i46 = 0;
                                }
                                c10 = 0;
                            }
                            i46++;
                            i43++;
                        }
                        if (i46 != c5038a6.f40669c) {
                            ((c) n10.f196u).c(c5038a6);
                            c5038a6 = n10.r(4, i45, i46);
                        }
                        if (c10 == 0) {
                            n10.j(c5038a6);
                        } else {
                            n10.s(c5038a6);
                        }
                    } else if (i38 == i) {
                        n10.s(c5038a6);
                    }
                } else {
                    n10.s(c5038a6);
                }
                i37++;
                i = 8;
            }
            arrayList.clear();
        }
        boolean z15 = this.f5344L0 || this.f5346M0;
        boolean z16 = this.f5341K && this.f5372q0 != null && ((z9 = this.f5355R) || z15 || this.f5330E.f40567f) && (!z9 || this.f5328D.f40800b);
        C5029M c5029m2 = this.f5339I0;
        c5029m2.f40602j = z16;
        c5029m2.f40603k = z16 && z15 && !this.f5355R && this.f5372q0 != null && this.f5330E.z0();
        View focusedChild = (this.f5331E0 && hasFocus() && this.f5328D != null) ? getFocusedChild() : null;
        AbstractC5032P H6 = (focusedChild == null || (A8 = A(focusedChild)) == null) ? null : H(A8);
        if (H6 == null) {
            c5029m.f40605m = -1L;
            c5029m.f40604l = -1;
            c5029m.f40606n = -1;
        } else {
            c5029m.f40605m = this.f5328D.f40800b ? H6.f40619e : -1L;
            if (!this.f5355R) {
                if (H6.h()) {
                    F8 = H6.f40618d;
                } else {
                    RecyclerView recyclerView = H6.f40631r;
                    if (recyclerView != null) {
                        F8 = recyclerView.F(H6);
                    }
                }
                c5029m.f40604l = F8;
                view = H6.f40615a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                c5029m.f40606n = id;
            }
            F8 = -1;
            c5029m.f40604l = F8;
            view = H6.f40615a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            c5029m.f40606n = id2;
        }
        c5029m.f40601h = c5029m.f40602j && this.f5346M0;
        this.f5346M0 = false;
        this.f5344L0 = false;
        c5029m.f40600g = c5029m.f40603k;
        c5029m.f40598e = this.f5328D.a();
        C(this.f5354Q0);
        boolean z17 = c5029m.f40602j;
        k kVar = (k) eVar.f2891u;
        if (z17) {
            int e6 = this.f5382x.e();
            for (int i47 = 0; i47 < e6; i47++) {
                AbstractC5032P I2 = I(this.f5382x.d(i47));
                if (!I2.o() && (!I2.f() || this.f5328D.f40800b)) {
                    AbstractC5063z abstractC5063z = this.f5372q0;
                    AbstractC5063z.b(I2);
                    I2.c();
                    abstractC5063z.getClass();
                    C0357t c0357t = new C0357t();
                    c0357t.a(I2);
                    Z z18 = (Z) kVar.getOrDefault(I2, null);
                    if (z18 == null) {
                        z18 = Z.a();
                        kVar.put(I2, z18);
                    }
                    z18.f40665b = c0357t;
                    z18.f40664a |= 4;
                    if (c5029m.f40601h && I2.k() && !I2.h() && !I2.o() && !I2.f()) {
                        eVar2.k(G(I2), I2);
                    }
                }
            }
        }
        if (c5029m.f40603k) {
            int l9 = this.f5382x.l();
            for (int i48 = 0; i48 < l9; i48++) {
                AbstractC5032P I8 = I(this.f5382x.k(i48));
                if (!I8.o() && I8.f40618d == -1) {
                    I8.f40618d = I8.f40617c;
                }
            }
            boolean z19 = c5029m.f40599f;
            c5029m.f40599f = false;
            this.f5330E.b0(this.f5376u, c5029m);
            c5029m.f40599f = z19;
            for (int i49 = 0; i49 < this.f5382x.e(); i49++) {
                AbstractC5032P I9 = I(this.f5382x.d(i49));
                if (!I9.o() && ((z8 = (Z) kVar.getOrDefault(I9, null)) == null || (z8.f40664a & 4) == 0)) {
                    AbstractC5063z.b(I9);
                    boolean z20 = (I9.f40623j & 8192) != 0;
                    AbstractC5063z abstractC5063z2 = this.f5372q0;
                    I9.c();
                    abstractC5063z2.getClass();
                    C0357t c0357t2 = new C0357t();
                    c0357t2.a(I9);
                    if (z20) {
                        T(I9, c0357t2);
                    } else {
                        Z z21 = (Z) kVar.getOrDefault(I9, null);
                        if (z21 == null) {
                            z21 = Z.a();
                            kVar.put(I9, z21);
                        }
                        z21.f40664a |= 2;
                        z21.f40665b = c0357t2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        Q(true);
        b0(false);
        c5029m.f40597d = 2;
    }

    public final void q() {
        a0();
        P();
        C5029M c5029m = this.f5339I0;
        c5029m.a(6);
        this.f5380w.h();
        c5029m.f40598e = this.f5328D.a();
        c5029m.f40596c = 0;
        c5029m.f40600g = false;
        this.f5330E.b0(this.f5376u, c5029m);
        c5029m.f40599f = false;
        this.f5378v = null;
        c5029m.f40602j = c5029m.f40602j && this.f5372q0 != null;
        c5029m.f40597d = 4;
        Q(true);
        b0(false);
    }

    public final boolean r(int i, int i4, int i9, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i4, i9, iArr, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z8) {
        AbstractC5032P I2 = I(view);
        if (I2 != null) {
            if (I2.j()) {
                I2.f40623j &= -257;
            } else if (!I2.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + I2 + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C5056s c5056s = this.f5330E.f40566e;
        if ((c5056s == null || !c5056s.f40783e) && !L() && view2 != null) {
            U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        return this.f5330E.k0(this, view, rect, z8, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z8) {
        ArrayList arrayList = this.f5334G;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C5048k) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z8);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f5343L != 0 || this.f5347N) {
            this.f5345M = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i4, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        getScrollingChildHelper().d(i, i4, i9, i10, iArr, i11, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i4) {
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5347N) {
            return;
        }
        boolean d2 = abstractC5019C.d();
        boolean e6 = this.f5330E.e();
        if (d2 || e6) {
            if (!d2) {
                i = 0;
            }
            if (!e6) {
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
            this.f5351P |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C5033Q c5033q) {
        this.f5352P0 = c5033q;
        X.o(this, c5033q);
    }

    public void setAdapter(AbstractC5059v abstractC5059v) {
        setLayoutFrozen(false);
        AbstractC5059v abstractC5059v2 = this.f5328D;
        e eVar = this.f5368n;
        if (abstractC5059v2 != null) {
            abstractC5059v2.f40799a.unregisterObserver(eVar);
            this.f5328D.getClass();
        }
        AbstractC5063z abstractC5063z = this.f5372q0;
        if (abstractC5063z != null) {
            abstractC5063z.e();
        }
        AbstractC5019C abstractC5019C = this.f5330E;
        BP bp = this.f5376u;
        if (abstractC5019C != null) {
            abstractC5019C.g0(bp);
            this.f5330E.h0(bp);
        }
        ((ArrayList) bp.f24037c).clear();
        bp.d();
        N n9 = this.f5380w;
        n9.t((ArrayList) n9.f197v);
        n9.t((ArrayList) n9.f198w);
        AbstractC5059v abstractC5059v3 = this.f5328D;
        this.f5328D = abstractC5059v;
        if (abstractC5059v != null) {
            abstractC5059v.f40799a.registerObserver(eVar);
        }
        AbstractC5059v abstractC5059v4 = this.f5328D;
        ((ArrayList) bp.f24037c).clear();
        bp.d();
        C5024H c4 = bp.c();
        if (abstractC5059v3 != null) {
            c4.f40585b--;
        }
        if (c4.f40585b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c4.f40584a;
                if (i >= sparseArray.size()) {
                    break;
                }
                ((C5023G) sparseArray.valueAt(i)).f40580a.clear();
                i++;
            }
        }
        if (abstractC5059v4 != null) {
            c4.f40585b++;
        }
        this.f5339I0.f40599f = true;
        this.f5357S |= false;
        this.f5355R = true;
        int l9 = this.f5382x.l();
        for (int i4 = 0; i4 < l9; i4++) {
            AbstractC5032P I2 = I(this.f5382x.k(i4));
            if (I2 != null && !I2.o()) {
                I2.a(6);
            }
        }
        N();
        BP bp2 = this.f5376u;
        ArrayList arrayList = (ArrayList) bp2.f24039e;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC5032P abstractC5032P = (AbstractC5032P) arrayList.get(i9);
            if (abstractC5032P != null) {
                abstractC5032P.a(6);
                abstractC5032P.a(1024);
            }
        }
        AbstractC5059v abstractC5059v5 = ((RecyclerView) bp2.f24042h).f5328D;
        if (abstractC5059v5 == null || !abstractC5059v5.f40800b) {
            bp2.d();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC5061x interfaceC5061x) {
        if (interfaceC5061x == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z8) {
        if (z8 != this.f5386z) {
            this.f5371p0 = null;
            this.f5369n0 = null;
            this.f5370o0 = null;
            this.f5365W = null;
        }
        this.f5386z = z8;
        super.setClipToPadding(z8);
        if (this.f5341K) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C5062y c5062y) {
        c5062y.getClass();
        this.f5363V = c5062y;
        this.f5371p0 = null;
        this.f5369n0 = null;
        this.f5370o0 = null;
        this.f5365W = null;
    }

    public void setHasFixedSize(boolean z8) {
        this.J = z8;
    }

    public void setItemAnimator(AbstractC5063z abstractC5063z) {
        AbstractC5063z abstractC5063z2 = this.f5372q0;
        if (abstractC5063z2 != null) {
            abstractC5063z2.e();
            this.f5372q0.f40801a = null;
        }
        this.f5372q0 = abstractC5063z;
        if (abstractC5063z != null) {
            abstractC5063z.f40801a = this.f5348N0;
        }
    }

    public void setItemViewCacheSize(int i) {
        BP bp = this.f5376u;
        bp.f24035a = i;
        bp.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z8) {
        suppressLayout(z8);
    }

    public void setLayoutManager(AbstractC5019C abstractC5019C) {
        RecyclerView recyclerView;
        C5056s c5056s;
        if (abstractC5019C == this.f5330E) {
            return;
        }
        setScrollState(0);
        RunnableC5031O runnableC5031O = this.f5333F0;
        runnableC5031O.f40613z.removeCallbacks(runnableC5031O);
        runnableC5031O.f40609v.abortAnimation();
        AbstractC5019C abstractC5019C2 = this.f5330E;
        if (abstractC5019C2 != null && (c5056s = abstractC5019C2.f40566e) != null) {
            c5056s.i();
        }
        AbstractC5019C abstractC5019C3 = this.f5330E;
        BP bp = this.f5376u;
        if (abstractC5019C3 != null) {
            AbstractC5063z abstractC5063z = this.f5372q0;
            if (abstractC5063z != null) {
                abstractC5063z.e();
            }
            this.f5330E.g0(bp);
            this.f5330E.h0(bp);
            ((ArrayList) bp.f24037c).clear();
            bp.d();
            if (this.f5338I) {
                AbstractC5019C abstractC5019C4 = this.f5330E;
                abstractC5019C4.f40568g = false;
                abstractC5019C4.R(this);
            }
            this.f5330E.t0(null);
            this.f5330E = null;
        } else {
            ((ArrayList) bp.f24037c).clear();
            bp.d();
        }
        Q0 q02 = this.f5382x;
        ((C3288h1) q02.f39326c).n();
        ArrayList arrayList = (ArrayList) q02.f39327d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = (RecyclerView) ((C4524d) q02.f39325b).f37858u;
            if (size < 0) {
                break;
            }
            AbstractC5032P I2 = I((View) arrayList.get(size));
            if (I2 != null) {
                int i = I2.f40629p;
                if (recyclerView.L()) {
                    I2.f40630q = i;
                    recyclerView.f5364V0.add(I2);
                } else {
                    WeakHashMap weakHashMap = X.f2240a;
                    I2.f40615a.setImportantForAccessibility(i);
                }
                I2.f40629p = 0;
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
        this.f5330E = abstractC5019C;
        if (abstractC5019C != null) {
            if (abstractC5019C.f40563b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC5019C + " is already attached to a RecyclerView:" + abstractC5019C.f40563b.y());
            }
            abstractC5019C.t0(this);
            if (this.f5338I) {
                AbstractC5019C abstractC5019C5 = this.f5330E;
                abstractC5019C5.f40568g = true;
                abstractC5019C5.Q(this);
            }
        }
        bp.k();
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
    public void setNestedScrollingEnabled(boolean z8) {
        C0355q scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f2314d) {
            WeakHashMap weakHashMap = X.f2240a;
            L.z(scrollingChildHelper.f2313c);
        }
        scrollingChildHelper.f2314d = z8;
    }

    public void setOnFlingListener(AbstractC5021E abstractC5021E) {
        this.f5387z0 = abstractC5021E;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC5022F abstractC5022F) {
        this.f5340J0 = abstractC5022F;
    }

    public void setPreserveFocusAfterLayout(boolean z8) {
        this.f5331E0 = z8;
    }

    public void setRecycledViewPool(C5024H c5024h) {
        BP bp = this.f5376u;
        if (((C5024H) bp.f24041g) != null) {
            r1.f40585b--;
        }
        bp.f24041g = c5024h;
        if (c5024h == null || ((RecyclerView) bp.f24042h).getAdapter() == null) {
            return;
        }
        ((C5024H) bp.f24041g).f40585b++;
    }

    public void setScrollState(int i) {
        C5056s c5056s;
        if (i == this.f5373r0) {
            return;
        }
        this.f5373r0 = i;
        if (i != 2) {
            RunnableC5031O runnableC5031O = this.f5333F0;
            runnableC5031O.f40613z.removeCallbacks(runnableC5031O);
            runnableC5031O.f40609v.abortAnimation();
            AbstractC5019C abstractC5019C = this.f5330E;
            if (abstractC5019C != null && (c5056s = abstractC5019C.f40566e) != null) {
                c5056s.i();
            }
        }
        AbstractC5019C abstractC5019C2 = this.f5330E;
        if (abstractC5019C2 != null) {
            abstractC5019C2.f0(i);
        }
        AbstractC5022F abstractC5022F = this.f5340J0;
        if (abstractC5022F != null) {
            abstractC5022F.a(this, i);
        }
        ArrayList arrayList = this.f5342K0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC5022F) this.f5342K0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f5385y0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f5385y0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC5030N abstractC5030N) {
        this.f5376u.getClass();
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
    public final void suppressLayout(boolean z8) {
        C5056s c5056s;
        if (z8 != this.f5347N) {
            i("Do not suppressLayout in layout or scroll");
            if (!z8) {
                this.f5347N = false;
                if (this.f5345M && this.f5330E != null && this.f5328D != null) {
                    requestLayout();
                }
                this.f5345M = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f5347N = true;
            this.f5349O = true;
            setScrollState(0);
            RunnableC5031O runnableC5031O = this.f5333F0;
            runnableC5031O.f40613z.removeCallbacks(runnableC5031O);
            runnableC5031O.f40609v.abortAnimation();
            AbstractC5019C abstractC5019C = this.f5330E;
            if (abstractC5019C == null || (c5056s = abstractC5019C.f40566e) == null) {
                return;
            }
            c5056s.i();
        }
    }

    public final void t(int i, int i4) {
        this.f5361U++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i4);
        AbstractC5022F abstractC5022F = this.f5340J0;
        if (abstractC5022F != null) {
            abstractC5022F.b(this, i, i4);
        }
        ArrayList arrayList = this.f5342K0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC5022F) this.f5342K0.get(size)).b(this, i, i4);
            }
        }
        this.f5361U--;
    }

    public final void u() {
        if (this.f5371p0 != null) {
            return;
        }
        this.f5363V.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5371p0 = edgeEffect;
        if (this.f5386z) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.f5365W != null) {
            return;
        }
        this.f5363V.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5365W = edgeEffect;
        if (this.f5386z) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.f5370o0 != null) {
            return;
        }
        this.f5363V.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5370o0 = edgeEffect;
        if (this.f5386z) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.f5369n0 != null) {
            return;
        }
        this.f5363V.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5369n0 = edgeEffect;
        if (this.f5386z) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f5328D + ", layout:" + this.f5330E + ", context:" + getContext();
    }

    public final void z(C5029M c5029m) {
        if (getScrollState() != 2) {
            c5029m.getClass();
            return;
        }
        OverScroller overScroller = this.f5333F0.f40609v;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c5029m.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float a9;
        TypedArray typedArray;
        char c4;
        char c9;
        boolean z8;
        int i4;
        int i9;
        Constructor constructor;
        Object[] objArr;
        int i10 = 7;
        int i11 = 28;
        this.f5368n = new e(this);
        BP bp = new BP();
        bp.f24042h = this;
        ArrayList arrayList = new ArrayList();
        bp.f24037c = arrayList;
        bp.f24038d = null;
        bp.f24039e = new ArrayList();
        bp.f24040f = Collections.unmodifiableList(arrayList);
        bp.f24035a = 2;
        bp.f24036b = 2;
        this.f5376u = bp;
        this.f5384y = new S0.e(17);
        this.f5323A = new Rect();
        this.f5325B = new Rect();
        this.f5327C = new RectF();
        this.f5332F = new ArrayList();
        this.f5334G = new ArrayList();
        this.f5343L = 0;
        this.f5355R = false;
        this.f5357S = false;
        this.f5359T = 0;
        this.f5361U = 0;
        this.f5363V = new C5062y();
        C5045h c5045h = new C5045h();
        c5045h.f40801a = null;
        c5045h.f40802b = new ArrayList();
        c5045h.f40803c = 120L;
        c5045h.f40804d = 120L;
        c5045h.f40805e = 250L;
        c5045h.f40806f = 250L;
        c5045h.f40701g = true;
        c5045h.f40702h = new ArrayList();
        c5045h.i = new ArrayList();
        c5045h.f40703j = new ArrayList();
        c5045h.f40704k = new ArrayList();
        c5045h.f40705l = new ArrayList();
        c5045h.f40706m = new ArrayList();
        c5045h.f40707n = new ArrayList();
        c5045h.f40708o = new ArrayList();
        c5045h.f40709p = new ArrayList();
        c5045h.f40710q = new ArrayList();
        c5045h.f40711r = new ArrayList();
        this.f5372q0 = c5045h;
        this.f5373r0 = 0;
        this.f5374s0 = -1;
        this.C0 = Float.MIN_VALUE;
        this.f5329D0 = Float.MIN_VALUE;
        this.f5331E0 = true;
        this.f5333F0 = new RunnableC5031O(this);
        this.f5337H0 = new C2830Vl();
        C5029M c5029m = new C5029M();
        c5029m.f40594a = -1;
        c5029m.f40595b = 0;
        c5029m.f40596c = 0;
        c5029m.f40597d = 1;
        c5029m.f40598e = 0;
        c5029m.f40599f = false;
        c5029m.f40600g = false;
        c5029m.f40601h = false;
        c5029m.i = false;
        c5029m.f40602j = false;
        c5029m.f40603k = false;
        this.f5339I0 = c5029m;
        this.f5344L0 = false;
        this.f5346M0 = false;
        m mVar = new m(this);
        this.f5348N0 = mVar;
        this.f5350O0 = false;
        this.f5354Q0 = new int[2];
        this.f5358S0 = new int[2];
        this.f5360T0 = new int[2];
        this.f5362U0 = new int[2];
        this.f5364V0 = new ArrayList();
        this.f5366W0 = new R0(5, this);
        this.f5367X0 = new C4523c(i11, this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5385y0 = viewConfiguration.getScaledTouchSlop();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            Method method = AbstractC0337b0.f2250a;
            a9 = Y.a(viewConfiguration);
        } else {
            a9 = AbstractC0337b0.a(viewConfiguration, context);
        }
        this.C0 = a9;
        this.f5329D0 = i12 >= 26 ? Y.b(viewConfiguration) : AbstractC0337b0.a(viewConfiguration, context);
        this.f5324A0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5326B0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f5372q0.f40801a = mVar;
        this.f5380w = new N(new h8.d(i10, this));
        this.f5382x = new Q0(new C4524d(i11, this));
        WeakHashMap weakHashMap = X.f2240a;
        if ((i12 >= 26 ? O.N.c(this) : 0) == 0 && i12 >= 26) {
            O.N.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f5353Q = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C5033Q(this));
        int[] iArr = AbstractC4987a.f40414a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (i12 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f5386z = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
            }
            Resources resources = getContext().getResources();
            c4 = 3;
            c9 = 2;
            typedArray = obtainStyledAttributes;
            z8 = 1;
            i9 = 4;
            i4 = i;
            new C5048k(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C5284R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(C5284R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(C5284R.dimen.fastscroll_margin));
        } else {
            typedArray = obtainStyledAttributes;
            c4 = 3;
            c9 = 2;
            z8 = 1;
            i4 = i;
            i9 = 4;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(j.f12535z)) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    Class asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC5019C.class);
                    try {
                        constructor = asSubclass.getConstructor(f5321Z0);
                        Object[] objArr2 = new Object[i9];
                        objArr2[0] = context;
                        objArr2[z8] = attributeSet;
                        objArr2[c9] = Integer.valueOf(i4);
                        objArr2[c4] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e6) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e9) {
                            e9.initCause(e6);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e9);
                        }
                    }
                    constructor.setAccessible(z8);
                    setLayoutManager((AbstractC5019C) constructor.newInstance(objArr));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e10);
                } catch (ClassNotFoundException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e11);
                } catch (IllegalAccessException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e12);
                } catch (InstantiationException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                } catch (InvocationTargetException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                }
            }
        }
        int i13 = Build.VERSION.SDK_INT;
        int[] iArr2 = f5320Y0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i4, 0);
        if (i13 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i4, 0);
        }
        boolean z9 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z9);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC5019C abstractC5019C = this.f5330E;
        if (abstractC5019C != null) {
            return abstractC5019C.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    public void setRecyclerListener(InterfaceC5025I interfaceC5025I) {
    }
}
