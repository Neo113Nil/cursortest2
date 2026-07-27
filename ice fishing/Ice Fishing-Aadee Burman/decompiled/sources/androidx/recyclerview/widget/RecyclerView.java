package androidx.recyclerview.widget;

import C2.N;
import E3.e;
import F1.a;
import G0.b;
import K.n;
import N.c;
import O.AbstractC0324b0;
import O.C0342q;
import O.C0344t;
import O.InterfaceC0349y;
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
import com.anythink.core.common.d.j;
import com.google.android.gms.internal.ads.C2780Sl;
import com.google.android.gms.internal.ads.C3381j1;
import com.google.android.gms.internal.ads.C3675oP;
import com.icefishing.icefishinglive2.C5275R;
import g1.C4522b;
import g1.C4523c;
import j4.g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import l.C4648e;
import r3.C4953b;
import s.k;
import s0.AbstractC4965a;
import t0.AbstractC4987B;
import t0.AbstractC4990E;
import t0.AbstractC4992G;
import t0.AbstractC4993H;
import t0.AbstractC5001P;
import t0.AbstractC5003S;
import t0.AbstractC5027v;
import t0.AbstractC5031z;
import t0.C4986A;
import t0.C4991F;
import t0.C4994I;
import t0.C4995J;
import t0.C4997L;
import t0.C5000O;
import t0.C5004T;
import t0.C5006a;
import t0.C5013h;
import t0.C5016k;
import t0.C5024s;
import t0.C5026u;
import t0.C5030y;
import t0.InterfaceC4996K;
import t0.InterfaceC4999N;
import t0.InterfaceC5029x;
import t0.RunnableC5002Q;
import t0.RunnableC5018m;
import t0.b0;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0349y {

    /* renamed from: Y0, reason: collision with root package name */
    public static final int[] f5208Y0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: Z0, reason: collision with root package name */
    public static final Class[] f5209Z0;

    /* renamed from: a1, reason: collision with root package name */
    public static final b f5210a1;

    /* renamed from: A, reason: collision with root package name */
    public final Rect f5211A;

    /* renamed from: A0, reason: collision with root package name */
    public final int f5212A0;

    /* renamed from: B, reason: collision with root package name */
    public final Rect f5213B;

    /* renamed from: B0, reason: collision with root package name */
    public final int f5214B0;

    /* renamed from: C, reason: collision with root package name */
    public final RectF f5215C;
    public final float C0;

    /* renamed from: D, reason: collision with root package name */
    public AbstractC5027v f5216D;

    /* renamed from: D0, reason: collision with root package name */
    public final float f5217D0;

    /* renamed from: E, reason: collision with root package name */
    public AbstractC4990E f5218E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f5219E0;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f5220F;

    /* renamed from: F0, reason: collision with root package name */
    public final RunnableC5002Q f5221F0;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f5222G;

    /* renamed from: G0, reason: collision with root package name */
    public RunnableC5018m f5223G0;

    /* renamed from: H, reason: collision with root package name */
    public C5016k f5224H;

    /* renamed from: H0, reason: collision with root package name */
    public final C2780Sl f5225H0;

    /* renamed from: I, reason: collision with root package name */
    public boolean f5226I;

    /* renamed from: I0, reason: collision with root package name */
    public final C5000O f5227I0;
    public boolean J;

    /* renamed from: J0, reason: collision with root package name */
    public AbstractC4993H f5228J0;

    /* renamed from: K, reason: collision with root package name */
    public boolean f5229K;

    /* renamed from: K0, reason: collision with root package name */
    public ArrayList f5230K0;

    /* renamed from: L, reason: collision with root package name */
    public int f5231L;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f5232L0;

    /* renamed from: M, reason: collision with root package name */
    public boolean f5233M;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f5234M0;

    /* renamed from: N, reason: collision with root package name */
    public boolean f5235N;

    /* renamed from: N0, reason: collision with root package name */
    public final C4986A f5236N0;

    /* renamed from: O, reason: collision with root package name */
    public boolean f5237O;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f5238O0;

    /* renamed from: P, reason: collision with root package name */
    public int f5239P;

    /* renamed from: P0, reason: collision with root package name */
    public C5004T f5240P0;

    /* renamed from: Q, reason: collision with root package name */
    public final AccessibilityManager f5241Q;

    /* renamed from: Q0, reason: collision with root package name */
    public final int[] f5242Q0;

    /* renamed from: R, reason: collision with root package name */
    public boolean f5243R;

    /* renamed from: R0, reason: collision with root package name */
    public C0342q f5244R0;

    /* renamed from: S, reason: collision with root package name */
    public boolean f5245S;

    /* renamed from: S0, reason: collision with root package name */
    public final int[] f5246S0;

    /* renamed from: T, reason: collision with root package name */
    public int f5247T;

    /* renamed from: T0, reason: collision with root package name */
    public final int[] f5248T0;

    /* renamed from: U, reason: collision with root package name */
    public int f5249U;

    /* renamed from: U0, reason: collision with root package name */
    public final int[] f5250U0;

    /* renamed from: V, reason: collision with root package name */
    public C5030y f5251V;

    /* renamed from: V0, reason: collision with root package name */
    public final ArrayList f5252V0;

    /* renamed from: W, reason: collision with root package name */
    public EdgeEffect f5253W;

    /* renamed from: W0, reason: collision with root package name */
    public final p3.b f5254W0;

    /* renamed from: X0, reason: collision with root package name */
    public final a f5255X0;

    /* renamed from: n, reason: collision with root package name */
    public final e f5256n;

    /* renamed from: n0, reason: collision with root package name */
    public EdgeEffect f5257n0;

    /* renamed from: o0, reason: collision with root package name */
    public EdgeEffect f5258o0;

    /* renamed from: p0, reason: collision with root package name */
    public EdgeEffect f5259p0;

    /* renamed from: q0, reason: collision with root package name */
    public AbstractC5031z f5260q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f5261r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f5262s0;

    /* renamed from: t0, reason: collision with root package name */
    public VelocityTracker f5263t0;

    /* renamed from: u, reason: collision with root package name */
    public final C3675oP f5264u;

    /* renamed from: u0, reason: collision with root package name */
    public int f5265u0;

    /* renamed from: v, reason: collision with root package name */
    public C4997L f5266v;

    /* renamed from: v0, reason: collision with root package name */
    public int f5267v0;

    /* renamed from: w, reason: collision with root package name */
    public final N f5268w;

    /* renamed from: w0, reason: collision with root package name */
    public int f5269w0;

    /* renamed from: x, reason: collision with root package name */
    public final g f5270x;

    /* renamed from: x0, reason: collision with root package name */
    public int f5271x0;

    /* renamed from: y, reason: collision with root package name */
    public final k8.b f5272y;

    /* renamed from: y0, reason: collision with root package name */
    public int f5273y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5274z;

    /* renamed from: z0, reason: collision with root package name */
    public AbstractC4992G f5275z0;

    static {
        Class cls = Integer.TYPE;
        f5209Z0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f5210a1 = new b(2);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5275R.attr.recyclerViewStyle);
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

    public static AbstractC5003S I(View view) {
        if (view == null) {
            return null;
        }
        return ((C4991F) view.getLayoutParams()).f40551a;
    }

    private C0342q getScrollingChildHelper() {
        if (this.f5244R0 == null) {
            this.f5244R0 = new C0342q(this);
        }
        return this.f5244R0;
    }

    public static void j(AbstractC5003S abstractC5003S) {
        WeakReference weakReference = abstractC5003S.f40591b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC5003S.f40590a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC5003S.f40591b = null;
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
        ArrayList arrayList = this.f5222G;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5016k c5016k = (C5016k) arrayList.get(i);
            int i6 = c5016k.f40714v;
            if (i6 == 1) {
                boolean d2 = c5016k.d(motionEvent.getX(), motionEvent.getY());
                boolean c9 = c5016k.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d2 || c9)) {
                    if (c9) {
                        c5016k.f40715w = 1;
                        c5016k.f40708p = (int) motionEvent.getX();
                    } else if (d2) {
                        c5016k.f40715w = 2;
                        c5016k.f40705m = (int) motionEvent.getY();
                    }
                    c5016k.f(2);
                    if (action == 3) {
                        this.f5224H = c5016k;
                        return true;
                    }
                }
            } else {
                if (i6 != 2) {
                    continue;
                }
                if (action == 3) {
                }
            }
        }
        return false;
    }

    public final void C(int[] iArr) {
        int g4 = this.f5270x.g();
        if (g4 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i9 = 0; i9 < g4; i9++) {
            AbstractC5003S I8 = I(this.f5270x.f(i9));
            if (!I8.o()) {
                int b9 = I8.b();
                if (b9 < i) {
                    i = b9;
                }
                if (b9 > i6) {
                    i6 = b9;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i6;
    }

    public final AbstractC5003S E(int i) {
        AbstractC5003S abstractC5003S = null;
        if (this.f5243R) {
            return null;
        }
        int n9 = this.f5270x.n();
        for (int i6 = 0; i6 < n9; i6++) {
            AbstractC5003S I8 = I(this.f5270x.m(i6));
            if (I8 != null && !I8.h() && F(I8) == i) {
                if (!((ArrayList) this.f5270x.f38406w).contains(I8.f40590a)) {
                    return I8;
                }
                abstractC5003S = I8;
            }
        }
        return abstractC5003S;
    }

    public final int F(AbstractC5003S abstractC5003S) {
        if (((abstractC5003S.f40598j & 524) != 0) || !abstractC5003S.e()) {
            return -1;
        }
        N n9 = this.f5268w;
        int i = abstractC5003S.f40592c;
        ArrayList arrayList = (ArrayList) n9.f302v;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C5006a c5006a = (C5006a) arrayList.get(i6);
            int i9 = c5006a.f40638a;
            if (i9 != 1) {
                if (i9 == 2) {
                    int i10 = c5006a.f40639b;
                    if (i10 <= i) {
                        int i11 = c5006a.f40640c;
                        if (i10 + i11 > i) {
                            return -1;
                        }
                        i -= i11;
                    } else {
                        continue;
                    }
                } else if (i9 == 8) {
                    int i12 = c5006a.f40639b;
                    if (i12 == i) {
                        i = c5006a.f40640c;
                    } else {
                        if (i12 < i) {
                            i--;
                        }
                        if (c5006a.f40640c <= i) {
                            i++;
                        }
                    }
                }
            } else if (c5006a.f40639b <= i) {
                i += c5006a.f40640c;
            }
        }
        return i;
    }

    public final long G(AbstractC5003S abstractC5003S) {
        return this.f5216D.f40778b ? abstractC5003S.f40594e : abstractC5003S.f40592c;
    }

    public final AbstractC5003S H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        C4991F c4991f = (C4991F) view.getLayoutParams();
        boolean z3 = c4991f.f40553c;
        Rect rect = c4991f.f40552b;
        if (!z3 || (this.f5227I0.f40575g && (c4991f.f40551a.k() || c4991f.f40551a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f5220F;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f5211A;
            rect2.set(0, 0, 0, 0);
            ((AbstractC4987B) arrayList.get(i)).getClass();
            ((C4991F) view.getLayoutParams()).f40551a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c4991f.f40553c = false;
        return rect;
    }

    public final boolean K() {
        return !this.f5229K || this.f5243R || this.f5268w.m();
    }

    public final boolean L() {
        return this.f5247T > 0;
    }

    public final void M(int i) {
        if (this.f5218E == null) {
            return;
        }
        setScrollState(2);
        this.f5218E.n0(i);
        awakenScrollBars();
    }

    public final void N() {
        int n9 = this.f5270x.n();
        for (int i = 0; i < n9; i++) {
            ((C4991F) this.f5270x.m(i).getLayoutParams()).f40553c = true;
        }
        ArrayList arrayList = (ArrayList) this.f5264u.f32901e;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C4991F c4991f = (C4991F) ((AbstractC5003S) arrayList.get(i6)).f40590a.getLayoutParams();
            if (c4991f != null) {
                c4991f.f40553c = true;
            }
        }
    }

    public final void O(int i, int i6, boolean z3) {
        int i9 = i + i6;
        int n9 = this.f5270x.n();
        for (int i10 = 0; i10 < n9; i10++) {
            AbstractC5003S I8 = I(this.f5270x.m(i10));
            if (I8 != null && !I8.o()) {
                int i11 = I8.f40592c;
                C5000O c5000o = this.f5227I0;
                if (i11 >= i9) {
                    I8.l(-i6, z3);
                    c5000o.f40574f = true;
                } else if (i11 >= i) {
                    I8.a(8);
                    I8.l(-i6, z3);
                    I8.f40592c = i - 1;
                    c5000o.f40574f = true;
                }
            }
        }
        C3675oP c3675oP = this.f5264u;
        ArrayList arrayList = (ArrayList) c3675oP.f32901e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC5003S abstractC5003S = (AbstractC5003S) arrayList.get(size);
            if (abstractC5003S != null) {
                int i12 = abstractC5003S.f40592c;
                if (i12 >= i9) {
                    abstractC5003S.l(-i6, z3);
                } else if (i12 >= i) {
                    abstractC5003S.a(8);
                    c3675oP.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.f5247T++;
    }

    public final void Q(boolean z3) {
        int i;
        AccessibilityManager accessibilityManager;
        int i6 = this.f5247T - 1;
        this.f5247T = i6;
        if (i6 < 1) {
            this.f5247T = 0;
            if (z3) {
                int i9 = this.f5239P;
                this.f5239P = 0;
                if (i9 != 0 && (accessibilityManager = this.f5241Q) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i9);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f5252V0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC5003S abstractC5003S = (AbstractC5003S) arrayList.get(size);
                    if (abstractC5003S.f40590a.getParent() == this && !abstractC5003S.o() && (i = abstractC5003S.f40605q) != -1) {
                        WeakHashMap weakHashMap = X.f2054a;
                        abstractC5003S.f40590a.setImportantForAccessibility(i);
                        abstractC5003S.f40605q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5262s0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f5262s0 = motionEvent.getPointerId(i);
            int x9 = (int) (motionEvent.getX(i) + 0.5f);
            this.f5269w0 = x9;
            this.f5265u0 = x9;
            int y7 = (int) (motionEvent.getY(i) + 0.5f);
            this.f5271x0 = y7;
            this.f5267v0 = y7;
        }
    }

    public final void S() {
        if (this.f5238O0 || !this.f5226I) {
            return;
        }
        WeakHashMap weakHashMap = X.f2054a;
        postOnAnimation(this.f5254W0);
        this.f5238O0 = true;
    }

    public final void T(AbstractC5003S abstractC5003S, C0344t c0344t) {
        abstractC5003S.f40598j &= -8193;
        boolean z3 = this.f5227I0.f40576h;
        k8.b bVar = this.f5272y;
        if (z3 && abstractC5003S.k() && !abstractC5003S.h() && !abstractC5003S.o()) {
            ((s.e) bVar.f38707u).k(G(abstractC5003S), abstractC5003S);
        }
        k kVar = (k) bVar.f38706n;
        b0 b0Var = (b0) kVar.getOrDefault(abstractC5003S, null);
        if (b0Var == null) {
            b0Var = b0.a();
            kVar.put(abstractC5003S, b0Var);
        }
        b0Var.f40646b = c0344t;
        b0Var.f40645a |= 4;
    }

    public final void U(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f5211A;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C4991F) {
            C4991F c4991f = (C4991F) layoutParams;
            if (!c4991f.f40553c) {
                int i = rect.left;
                Rect rect2 = c4991f.f40552b;
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
        this.f5218E.k0(this, view, this.f5211A, !this.f5229K, view2 == null);
    }

    public final void V() {
        VelocityTracker velocityTracker = this.f5263t0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z3 = false;
        c0(0);
        EdgeEffect edgeEffect = this.f5253W;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = this.f5253W.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5257n0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 |= this.f5257n0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5258o0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 |= this.f5258o0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5259p0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z3 |= this.f5259p0.isFinished();
        }
        if (z3) {
            WeakHashMap weakHashMap = X.f2054a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean W(int i, int i6, MotionEvent motionEvent) {
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3;
        boolean z6;
        m();
        AbstractC5027v abstractC5027v = this.f5216D;
        int[] iArr = this.f5250U0;
        if (abstractC5027v != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            X(i, i6, iArr);
            i9 = iArr[0];
            i10 = iArr[1];
            i11 = i - i9;
            i12 = i6 - i10;
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        if (!this.f5220F.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        s(i9, i10, i11, i12, this.f5246S0, 0, iArr);
        int i13 = iArr[0];
        int i14 = i11 - i13;
        int i15 = iArr[1];
        int i16 = i12 - i15;
        boolean z9 = (i13 == 0 && i15 == 0) ? false : true;
        int i17 = this.f5269w0;
        int[] iArr2 = this.f5246S0;
        int i18 = iArr2[0];
        this.f5269w0 = i17 - i18;
        int i19 = this.f5271x0;
        int i20 = iArr2[1];
        this.f5271x0 = i19 - i20;
        int[] iArr3 = this.f5248T0;
        iArr3[0] = iArr3[0] + i18;
        iArr3[1] = iArr3[1] + i20;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z3 = true;
            } else {
                float x9 = motionEvent.getX();
                float f3 = i14;
                float y7 = motionEvent.getY();
                float f9 = i16;
                if (f3 < 0.0f) {
                    v();
                    z3 = true;
                    d.a(this.f5253W, (-f3) / getWidth(), 1.0f - (y7 / getHeight()));
                } else {
                    z3 = true;
                    if (f3 > 0.0f) {
                        w();
                        d.a(this.f5258o0, f3 / getWidth(), y7 / getHeight());
                    } else {
                        z6 = false;
                        if (f9 >= 0.0f) {
                            x();
                            d.a(this.f5257n0, (-f9) / getHeight(), x9 / getWidth());
                        } else {
                            if (f9 > 0.0f) {
                                u();
                                d.a(this.f5259p0, f9 / getHeight(), 1.0f - (x9 / getWidth()));
                            }
                            if (!z6 || f3 != 0.0f || f9 != 0.0f) {
                                WeakHashMap weakHashMap = X.f2054a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z6 = z3;
                        if (!z6) {
                        }
                        WeakHashMap weakHashMap2 = X.f2054a;
                        postInvalidateOnAnimation();
                    }
                }
                z6 = z3;
                if (f9 >= 0.0f) {
                }
                z6 = z3;
                if (!z6) {
                }
                WeakHashMap weakHashMap22 = X.f2054a;
                postInvalidateOnAnimation();
            }
            l(i, i6);
        } else {
            z3 = true;
        }
        if (i9 != 0 || i10 != 0) {
            t(i9, i10);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z9 && i9 == 0 && i10 == 0) {
            return false;
        }
        return z3;
    }

    public final void X(int i, int i6, int[] iArr) {
        AbstractC5003S abstractC5003S;
        g gVar = this.f5270x;
        a0();
        P();
        int i9 = n.f1485a;
        Trace.beginSection("RV Scroll");
        C5000O c5000o = this.f5227I0;
        z(c5000o);
        C3675oP c3675oP = this.f5264u;
        int m0 = i != 0 ? this.f5218E.m0(i, c3675oP, c5000o) : 0;
        int o02 = i6 != 0 ? this.f5218E.o0(i6, c3675oP, c5000o) : 0;
        Trace.endSection();
        int g4 = gVar.g();
        for (int i10 = 0; i10 < g4; i10++) {
            View f3 = gVar.f(i10);
            AbstractC5003S H8 = H(f3);
            if (H8 != null && (abstractC5003S = H8.i) != null) {
                int left = f3.getLeft();
                int top = f3.getTop();
                View view = abstractC5003S.f40590a;
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
        C5024s c5024s;
        if (this.f5235N) {
            return;
        }
        setScrollState(0);
        RunnableC5002Q runnableC5002Q = this.f5221F0;
        runnableC5002Q.f40588z.removeCallbacks(runnableC5002Q);
        runnableC5002Q.f40584v.abortAnimation();
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E != null && (c5024s = abstractC4990E.f40541e) != null) {
            c5024s.i();
        }
        AbstractC4990E abstractC4990E2 = this.f5218E;
        if (abstractC4990E2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC4990E2.n0(i);
            awakenScrollBars();
        }
    }

    public final void Z(int i, int i6, boolean z3) {
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5235N) {
            return;
        }
        if (!abstractC4990E.d()) {
            i = 0;
        }
        if (!this.f5218E.e()) {
            i6 = 0;
        }
        if (i == 0 && i6 == 0) {
            return;
        }
        if (z3) {
            int i9 = i != 0 ? 1 : 0;
            if (i6 != 0) {
                i9 |= 2;
            }
            getScrollingChildHelper().g(i9, 1);
        }
        this.f5221F0.b(i, i6, Integer.MIN_VALUE, null);
    }

    public final void a0() {
        int i = this.f5231L + 1;
        this.f5231L = i;
        if (i != 1 || this.f5235N) {
            return;
        }
        this.f5233M = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i6) {
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E != null) {
            abstractC4990E.getClass();
        }
        super.addFocusables(arrayList, i, i6);
    }

    public final void b0(boolean z3) {
        if (this.f5231L < 1) {
            this.f5231L = 1;
        }
        if (!z3 && !this.f5235N) {
            this.f5233M = false;
        }
        if (this.f5231L == 1) {
            if (z3 && this.f5233M && !this.f5235N && this.f5218E != null && this.f5216D != null) {
                o();
            }
            if (!this.f5235N) {
                this.f5233M = false;
            }
        }
        this.f5231L--;
    }

    public final void c0(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C4991F) && this.f5218E.f((C4991F) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E != null && abstractC4990E.d()) {
            return this.f5218E.j(this.f5227I0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E != null && abstractC4990E.d()) {
            return this.f5218E.k(this.f5227I0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E != null && abstractC4990E.d()) {
            return this.f5218E.l(this.f5227I0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E != null && abstractC4990E.e()) {
            return this.f5218E.m(this.f5227I0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E != null && abstractC4990E.e()) {
            return this.f5218E.n(this.f5227I0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E != null && abstractC4990E.e()) {
            return this.f5218E.o(this.f5227I0);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f9, boolean z3) {
        return getScrollingChildHelper().a(f3, f9, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f9) {
        return getScrollingChildHelper().b(f3, f9);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i6, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i6, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i6, int i9, int i10, int[] iArr) {
        return getScrollingChildHelper().d(i, i6, i9, i10, iArr, 0, null);
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
        boolean z3;
        super.draw(canvas);
        ArrayList arrayList = this.f5220F;
        int size = arrayList.size();
        boolean z6 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC4987B) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f5253W;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z3 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f5274z ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f5253W;
            z3 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f5257n0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f5274z) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f5257n0;
            z3 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f5258o0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f5274z ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f5258o0;
            z3 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f5259p0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f5274z) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f5259p0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z6 = true;
            }
            z3 |= z6;
            canvas.restoreToCount(save4);
        }
        if ((z3 || this.f5260q0 == null || arrayList.size() <= 0 || !this.f5260q0.f()) ? z3 : true) {
            WeakHashMap weakHashMap = X.f2054a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        return super.drawChild(canvas, view, j6);
    }

    public final void f(AbstractC5003S abstractC5003S) {
        View view = abstractC5003S.f40590a;
        boolean z3 = view.getParent() == this;
        this.f5264u.j(H(view));
        if (abstractC5003S.j()) {
            this.f5270x.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z3) {
            this.f5270x.a(view, -1, true);
            return;
        }
        g gVar = this.f5270x;
        int indexOfChild = ((RecyclerView) ((C4648e) gVar.f38404u).f38761u).indexOfChild(view);
        if (indexOfChild >= 0) {
            ((C3381j1) gVar.f38405v).w(indexOfChild);
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
        int i6;
        char c9;
        boolean z3;
        this.f5218E.getClass();
        boolean z6 = true;
        boolean z9 = (this.f5216D == null || this.f5218E == null || L() || this.f5235N) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        C5000O c5000o = this.f5227I0;
        C3675oP c3675oP = this.f5264u;
        if (z9 && (i == 2 || i == 1)) {
            if (this.f5218E.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? com.anythink.expressad.video.module.a.a.f21731U : 33) == null) {
                    z3 = true;
                    if (!z3 && this.f5218E.d()) {
                        z3 = focusFinder.findNextFocus(this, view, !((this.f5218E.C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z3) {
                        m();
                        if (A(view) != null) {
                            a0();
                            this.f5218E.S(view, i, c3675oP, c5000o);
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
                        if (z6) {
                        }
                    }
                    z6 = false;
                    if (z6) {
                    }
                }
            }
            z3 = false;
            if (!z3) {
                if (focusFinder.findNextFocus(this, view, !((this.f5218E.C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z3) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            z6 = false;
            if (z6) {
            }
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z9) {
                m();
                if (A(view) != null) {
                    a0();
                    view2 = this.f5218E.S(view, i, c3675oP, c5000o);
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
                    z6 = false;
                } else if (view != null && A(view) != null) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    Rect rect = this.f5211A;
                    rect.set(0, 0, width, height);
                    int width2 = view2.getWidth();
                    int height2 = view2.getHeight();
                    Rect rect2 = this.f5213B;
                    rect2.set(0, 0, width2, height2);
                    offsetDescendantRectToMyCoords(view, rect);
                    offsetDescendantRectToMyCoords(view2, rect2);
                    int i9 = this.f5218E.C() == 1 ? -1 : 1;
                    int i10 = rect.left;
                    int i11 = rect2.left;
                    if ((i10 < i11 || rect.right <= i11) && rect.right < rect2.right) {
                        i6 = 1;
                    } else {
                        int i12 = rect.right;
                        int i13 = rect2.right;
                        i6 = ((i12 > i13 || i10 >= i13) && i10 > i11) ? -1 : 0;
                    }
                    int i14 = rect.top;
                    int i15 = rect2.top;
                    if ((i14 < i15 || rect.bottom <= i15) && rect.bottom < rect2.bottom) {
                        c9 = 1;
                    } else {
                        int i16 = rect.bottom;
                        int i17 = rect2.bottom;
                        c9 = ((i16 > i17 || i14 >= i17) && i14 > i15) ? (char) 65535 : (char) 0;
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
                return z6 ? view2 : super.focusSearch(view, i);
            }
            z6 = false;
            if (z6) {
            }
        }
    }

    public final void g(AbstractC4987B abstractC4987B) {
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E != null) {
            abstractC4990E.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f5220F;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC4987B);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E != null) {
            return abstractC4990E.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E != null) {
            return abstractC4990E.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC5027v getAdapter() {
        return this.f5216D;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E == null) {
            return super.getBaseline();
        }
        abstractC4990E.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i6) {
        return super.getChildDrawingOrder(i, i6);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f5274z;
    }

    public C5004T getCompatAccessibilityDelegate() {
        return this.f5240P0;
    }

    public C5030y getEdgeEffectFactory() {
        return this.f5251V;
    }

    public AbstractC5031z getItemAnimator() {
        return this.f5260q0;
    }

    public int getItemDecorationCount() {
        return this.f5220F.size();
    }

    public AbstractC4990E getLayoutManager() {
        return this.f5218E;
    }

    public int getMaxFlingVelocity() {
        return this.f5214B0;
    }

    public int getMinFlingVelocity() {
        return this.f5212A0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AbstractC4992G getOnFlingListener() {
        return this.f5275z0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f5219E0;
    }

    public C4995J getRecycledViewPool() {
        return this.f5264u.c();
    }

    public int getScrollState() {
        return this.f5261r0;
    }

    public final void h(AbstractC4993H abstractC4993H) {
        if (this.f5230K0 == null) {
            this.f5230K0 = new ArrayList();
        }
        this.f5230K0.add(abstractC4993H);
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
        if (this.f5249U > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f5226I;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f5235N;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2128d;
    }

    public final void k() {
        int n9 = this.f5270x.n();
        for (int i = 0; i < n9; i++) {
            AbstractC5003S I8 = I(this.f5270x.m(i));
            if (!I8.o()) {
                I8.f40593d = -1;
                I8.f40596g = -1;
            }
        }
        C3675oP c3675oP = this.f5264u;
        ArrayList arrayList = (ArrayList) c3675oP.f32901e;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC5003S abstractC5003S = (AbstractC5003S) arrayList.get(i6);
            abstractC5003S.f40593d = -1;
            abstractC5003S.f40596g = -1;
        }
        ArrayList arrayList2 = (ArrayList) c3675oP.f32899c;
        int size2 = arrayList2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            AbstractC5003S abstractC5003S2 = (AbstractC5003S) arrayList2.get(i9);
            abstractC5003S2.f40593d = -1;
            abstractC5003S2.f40596g = -1;
        }
        ArrayList arrayList3 = (ArrayList) c3675oP.f32900d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i10 = 0; i10 < size3; i10++) {
                AbstractC5003S abstractC5003S3 = (AbstractC5003S) ((ArrayList) c3675oP.f32900d).get(i10);
                abstractC5003S3.f40593d = -1;
                abstractC5003S3.f40596g = -1;
            }
        }
    }

    public final void l(int i, int i6) {
        boolean z3;
        EdgeEffect edgeEffect = this.f5253W;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z3 = false;
        } else {
            this.f5253W.onRelease();
            z3 = this.f5253W.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5258o0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f5258o0.onRelease();
            z3 |= this.f5258o0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5257n0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i6 > 0) {
            this.f5257n0.onRelease();
            z3 |= this.f5257n0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5259p0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i6 < 0) {
            this.f5259p0.onRelease();
            z3 |= this.f5259p0.isFinished();
        }
        if (z3) {
            WeakHashMap weakHashMap = X.f2054a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        N n9 = this.f5268w;
        if (!this.f5229K || this.f5243R) {
            int i = n.f1485a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        if (n9.m()) {
            n9.getClass();
            if (n9.m()) {
                int i6 = n.f1485a;
                Trace.beginSection("RV FullInvalidate");
                o();
                Trace.endSection();
            }
        }
    }

    public final void n(int i, int i6) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = X.f2054a;
        setMeasuredDimension(AbstractC4990E.g(i, paddingRight, getMinimumWidth()), AbstractC4990E.g(i6, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0341, code lost:
    
        if (((java.util.ArrayList) r21.f5270x.f38406w).contains(getFocusedChild()) == false) goto L216;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ed  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [t0.S] */
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
        boolean z3;
        ?? r11;
        View findViewById;
        boolean z6;
        C0344t c0344t;
        ?? r32;
        RecyclerView recyclerView;
        boolean g4;
        boolean z9;
        if (this.f5216D == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f5218E == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        C5000O c5000o = this.f5227I0;
        boolean z10 = false;
        c5000o.i = false;
        boolean z11 = true;
        if (c5000o.f40572d == 1) {
            p();
            this.f5218E.p0(this);
            q();
        } else {
            N n9 = this.f5268w;
            if ((((ArrayList) n9.f303w).isEmpty() || ((ArrayList) n9.f302v).isEmpty()) && this.f5218E.f40549n == getWidth() && this.f5218E.f40550o == getHeight()) {
                this.f5218E.p0(this);
            } else {
                this.f5218E.p0(this);
                q();
            }
        }
        c5000o.a(4);
        a0();
        P();
        c5000o.f40572d = 1;
        boolean z12 = c5000o.f40577j;
        View view = null;
        Long l9 = null;
        C3675oP c3675oP = this.f5264u;
        k8.b bVar = this.f5272y;
        if (z12) {
            int g9 = this.f5270x.g() - 1;
            while (g9 >= 0) {
                AbstractC5003S I8 = I(this.f5270x.f(g9));
                if (I8.o()) {
                    z9 = z11;
                } else {
                    long G7 = G(I8);
                    this.f5260q0.getClass();
                    C0344t c0344t2 = new C0344t();
                    c0344t2.a(I8);
                    AbstractC5003S abstractC5003S = (AbstractC5003S) ((s.e) bVar.f38707u).j(G7, l9);
                    if (abstractC5003S == null || abstractC5003S.o()) {
                        z9 = z11;
                        bVar.a(I8, c0344t2);
                    } else {
                        k kVar = (k) bVar.f38706n;
                        z9 = z11;
                        b0 b0Var = (b0) kVar.getOrDefault(abstractC5003S, l9);
                        boolean z13 = (b0Var == null || (b0Var.f40645a & 1) == 0) ? false : z9;
                        b0 b0Var2 = (b0) kVar.getOrDefault(I8, l9);
                        boolean z14 = (b0Var2 == null || (b0Var2.f40645a & 1) == 0) ? false : z9;
                        if (z13 && abstractC5003S == I8) {
                            bVar.a(I8, c0344t2);
                        } else {
                            C0344t c9 = bVar.c(abstractC5003S, 4);
                            bVar.a(I8, c0344t2);
                            C0344t c10 = bVar.c(I8, 8);
                            if (c9 == null) {
                                int g10 = this.f5270x.g();
                                for (int i = 0; i < g10; i++) {
                                    AbstractC5003S I9 = I(this.f5270x.f(i));
                                    if (I9 != I8 && G(I9) == G7) {
                                        AbstractC5027v abstractC5027v = this.f5216D;
                                        if (abstractC5027v == null || !abstractC5027v.f40778b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + I9 + " \n View Holder 2:" + I8 + y());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + I9 + " \n View Holder 2:" + I8 + y());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC5003S + " cannot be found but it is necessary for " + I8 + y());
                            } else {
                                abstractC5003S.n(false);
                                if (z13) {
                                    f(abstractC5003S);
                                }
                                if (abstractC5003S != I8) {
                                    if (z14) {
                                        f(I8);
                                    }
                                    abstractC5003S.f40597h = I8;
                                    f(abstractC5003S);
                                    c3675oP.j(abstractC5003S);
                                    I8.n(false);
                                    I8.i = abstractC5003S;
                                }
                                if (this.f5260q0.a(abstractC5003S, I8, c9, c10)) {
                                    S();
                                }
                            }
                        }
                    }
                }
                g9--;
                z11 = z9;
                l9 = null;
            }
            z3 = z11;
            k kVar2 = (k) bVar.f38706n;
            int i6 = kVar2.f40437v - 1;
            while (i6 >= 0) {
                AbstractC5003S abstractC5003S2 = (AbstractC5003S) kVar2.h(i6);
                b0 b0Var3 = (b0) kVar2.j(i6);
                int i9 = b0Var3.f40645a;
                int i10 = i9 & 3;
                a aVar = this.f5255X0;
                if (i10 == 3) {
                    RecyclerView recyclerView2 = (RecyclerView) aVar.f903u;
                    recyclerView2.f5218E.i0(abstractC5003S2.f40590a, recyclerView2.f5264u);
                    r32 = z10;
                } else if ((i9 & 1) != 0) {
                    C0344t c0344t3 = b0Var3.f40646b;
                    if (c0344t3 == null) {
                        RecyclerView recyclerView3 = (RecyclerView) aVar.f903u;
                        recyclerView3.f5218E.i0(abstractC5003S2.f40590a, recyclerView3.f5264u);
                        r32 = z10;
                    } else {
                        aVar.t(abstractC5003S2, c0344t3, b0Var3.f40647c);
                        r32 = z10;
                    }
                } else if ((i9 & 14) == 14) {
                    aVar.s(abstractC5003S2, b0Var3.f40646b, b0Var3.f40647c);
                    r32 = z10;
                } else if ((i9 & 12) == 12) {
                    C0344t c0344t4 = b0Var3.f40646b;
                    C0344t c0344t5 = b0Var3.f40647c;
                    aVar.getClass();
                    abstractC5003S2.n(z10);
                    RecyclerView recyclerView4 = (RecyclerView) aVar.f903u;
                    if (!recyclerView4.f5243R) {
                        C5013h c5013h = (C5013h) recyclerView4.f5260q0;
                        c5013h.getClass();
                        int i11 = c0344t4.f2133a;
                        int i12 = c0344t5.f2133a;
                        if (i11 == i12 && c0344t4.f2134b == c0344t5.f2134b) {
                            c5013h.c(abstractC5003S2);
                            recyclerView = recyclerView4;
                            g4 = false;
                        } else {
                            recyclerView = recyclerView4;
                            g4 = c5013h.g(abstractC5003S2, i11, c0344t4.f2134b, i12, c0344t5.f2134b);
                        }
                        if (g4) {
                            recyclerView.S();
                        }
                    } else if (recyclerView4.f5260q0.a(abstractC5003S2, abstractC5003S2, c0344t4, c0344t5)) {
                        recyclerView4.S();
                    }
                    r32 = 0;
                } else {
                    if ((i9 & 4) != 0) {
                        c0344t = null;
                        aVar.t(abstractC5003S2, b0Var3.f40646b, null);
                    } else {
                        c0344t = null;
                        if ((i9 & 8) != 0) {
                            aVar.s(abstractC5003S2, b0Var3.f40646b, b0Var3.f40647c);
                        }
                    }
                    r32 = 0;
                    b0Var3.f40645a = r32;
                    b0Var3.f40646b = c0344t;
                    b0Var3.f40647c = c0344t;
                    b0.f40644d.c(b0Var3);
                    i6--;
                    z10 = false;
                }
                c0344t = null;
                b0Var3.f40645a = r32;
                b0Var3.f40646b = c0344t;
                b0Var3.f40647c = c0344t;
                b0.f40644d.c(b0Var3);
                i6--;
                z10 = false;
            }
            view = null;
        } else {
            z3 = true;
        }
        this.f5218E.h0(c3675oP);
        c5000o.f40570b = c5000o.f40573e;
        this.f5243R = false;
        this.f5245S = false;
        c5000o.f40577j = false;
        c5000o.f40578k = false;
        this.f5218E.f40542f = false;
        ArrayList arrayList = (ArrayList) c3675oP.f32900d;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E.f40546k) {
            abstractC4990E.f40545j = 0;
            abstractC4990E.f40546k = false;
            c3675oP.k();
        }
        this.f5218E.c0(c5000o);
        Q(z3);
        b0(false);
        ((k) bVar.f38706n).clear();
        ((s.e) bVar.f38707u).h();
        int[] iArr = this.f5242Q0;
        int i13 = iArr[0];
        int i14 = iArr[1];
        C(iArr);
        if ((iArr[0] == i13 && iArr[1] == i14) ? false : true) {
            t(0, 0);
        }
        if (this.f5219E0 && this.f5216D != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j6 = c5000o.f40580m;
            if (j6 != -1 && (z6 = this.f5216D.f40778b) && z6) {
                int n10 = this.f5270x.n();
                int i15 = 0;
                r11 = view;
                while (true) {
                    if (i15 >= n10) {
                        break;
                    }
                    AbstractC5003S I10 = I(this.f5270x.m(i15));
                    if (I10 != null && !I10.h() && I10.f40594e == j6) {
                        if (!((ArrayList) this.f5270x.f38406w).contains(I10.f40590a)) {
                            r11 = I10;
                            break;
                        }
                        r11 = I10;
                    }
                    i15++;
                    r11 = r11;
                }
            } else {
                r11 = view;
            }
            if (r11 != null) {
                ArrayList arrayList2 = (ArrayList) this.f5270x.f38406w;
                View view2 = r11.f40590a;
                if (!arrayList2.contains(view2) && view2.hasFocusable()) {
                    view = view2;
                    if (view != null) {
                        int i16 = c5000o.f40581n;
                        if (i16 != -1 && (findViewById = view.findViewById(i16)) != null && findViewById.isFocusable()) {
                            view = findViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
            if (this.f5270x.g() > 0) {
                int i17 = c5000o.f40579l;
                int i18 = i17 != -1 ? i17 : 0;
                int b9 = c5000o.b();
                for (int i19 = i18; i19 < b9; i19++) {
                    AbstractC5003S E8 = E(i19);
                    if (E8 == null) {
                        break;
                    }
                    View view3 = E8.f40590a;
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
                    AbstractC5003S E9 = E(min);
                    if (E9 == null) {
                        break;
                    }
                    View view4 = E9.f40590a;
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
        c5000o.f40580m = -1L;
        c5000o.f40579l = -1;
        c5000o.f40581n = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f3;
        super.onAttachedToWindow();
        this.f5247T = 0;
        this.f5226I = true;
        this.f5229K = this.f5229K && !isLayoutRequested();
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E != null) {
            abstractC4990E.f40543g = true;
            abstractC4990E.Q(this);
        }
        this.f5238O0 = false;
        ThreadLocal threadLocal = RunnableC5018m.f40724x;
        RunnableC5018m runnableC5018m = (RunnableC5018m) threadLocal.get();
        this.f5223G0 = runnableC5018m;
        if (runnableC5018m == null) {
            RunnableC5018m runnableC5018m2 = new RunnableC5018m();
            runnableC5018m2.f40726n = new ArrayList();
            runnableC5018m2.f40729w = new ArrayList();
            this.f5223G0 = runnableC5018m2;
            WeakHashMap weakHashMap = X.f2054a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f3 = display.getRefreshRate();
            }
            f3 = 60.0f;
            RunnableC5018m runnableC5018m3 = this.f5223G0;
            runnableC5018m3.f40728v = (long) (1.0E9f / f3);
            threadLocal.set(runnableC5018m3);
        }
        this.f5223G0.f40726n.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C5024s c5024s;
        super.onDetachedFromWindow();
        AbstractC5031z abstractC5031z = this.f5260q0;
        if (abstractC5031z != null) {
            abstractC5031z.e();
        }
        setScrollState(0);
        RunnableC5002Q runnableC5002Q = this.f5221F0;
        runnableC5002Q.f40588z.removeCallbacks(runnableC5002Q);
        runnableC5002Q.f40584v.abortAnimation();
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E != null && (c5024s = abstractC4990E.f40541e) != null) {
            c5024s.i();
        }
        this.f5226I = false;
        AbstractC4990E abstractC4990E2 = this.f5218E;
        if (abstractC4990E2 != null) {
            abstractC4990E2.f40543g = false;
            abstractC4990E2.R(this);
        }
        this.f5252V0.clear();
        removeCallbacks(this.f5254W0);
        this.f5272y.getClass();
        while (b0.f40644d.a() != null) {
        }
        RunnableC5018m runnableC5018m = this.f5223G0;
        if (runnableC5018m != null) {
            runnableC5018m.f40726n.remove(this);
            this.f5223G0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f5220F;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC4987B) arrayList.get(i)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f3;
        float f9;
        if (this.f5218E != null && !this.f5235N && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.f5218E.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f5218E.d()) {
                    f9 = motionEvent.getAxisValue(10);
                    if (f3 == 0.0f || f9 != 0.0f) {
                        W((int) (f9 * this.C0), (int) (f3 * this.f5217D0), motionEvent);
                    }
                }
                f9 = 0.0f;
                if (f3 == 0.0f) {
                }
                W((int) (f9 * this.C0), (int) (f3 * this.f5217D0), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f5218E.e()) {
                        f3 = -axisValue;
                        f9 = 0.0f;
                        if (f3 == 0.0f) {
                        }
                        W((int) (f9 * this.C0), (int) (f3 * this.f5217D0), motionEvent);
                    } else if (this.f5218E.d()) {
                        f9 = axisValue;
                        f3 = 0.0f;
                        if (f3 == 0.0f) {
                        }
                        W((int) (f9 * this.C0), (int) (f3 * this.f5217D0), motionEvent);
                    }
                }
                f3 = 0.0f;
                f9 = 0.0f;
                if (f3 == 0.0f) {
                }
                W((int) (f9 * this.C0), (int) (f3 * this.f5217D0), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        if (!this.f5235N) {
            this.f5224H = null;
            if (B(motionEvent)) {
                V();
                setScrollState(0);
                return true;
            }
            AbstractC4990E abstractC4990E = this.f5218E;
            if (abstractC4990E != null) {
                boolean d2 = abstractC4990E.d();
                boolean e9 = this.f5218E.e();
                if (this.f5263t0 == null) {
                    this.f5263t0 = VelocityTracker.obtain();
                }
                this.f5263t0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f5237O) {
                        this.f5237O = false;
                    }
                    this.f5262s0 = motionEvent.getPointerId(0);
                    int x9 = (int) (motionEvent.getX() + 0.5f);
                    this.f5269w0 = x9;
                    this.f5265u0 = x9;
                    int y7 = (int) (motionEvent.getY() + 0.5f);
                    this.f5271x0 = y7;
                    this.f5267v0 = y7;
                    if (this.f5261r0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        c0(1);
                    }
                    int[] iArr = this.f5248T0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = d2;
                    if (e9) {
                        i = (d2 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
                } else if (actionMasked == 1) {
                    this.f5263t0.clear();
                    c0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f5262s0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5262s0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y9 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f5261r0 != 1) {
                        int i6 = x10 - this.f5265u0;
                        int i9 = y9 - this.f5267v0;
                        if (d2 == 0 || Math.abs(i6) <= this.f5273y0) {
                            z3 = false;
                        } else {
                            this.f5269w0 = x10;
                            z3 = true;
                        }
                        if (e9 && Math.abs(i9) > this.f5273y0) {
                            this.f5271x0 = y9;
                            z3 = true;
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    V();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f5262s0 = motionEvent.getPointerId(actionIndex);
                    int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f5269w0 = x11;
                    this.f5265u0 = x11;
                    int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f5271x0 = y10;
                    this.f5267v0 = y10;
                } else if (actionMasked == 6) {
                    R(motionEvent);
                }
                if (this.f5261r0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        int i11 = n.f1485a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f5229K = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i6) {
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E == null) {
            n(i, i6);
            return;
        }
        boolean L6 = abstractC4990E.L();
        C5000O c5000o = this.f5227I0;
        if (!L6) {
            if (this.J) {
                this.f5218E.f40538b.n(i, i6);
                return;
            }
            if (c5000o.f40578k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC5027v abstractC5027v = this.f5216D;
            if (abstractC5027v != null) {
                c5000o.f40573e = abstractC5027v.a();
            } else {
                c5000o.f40573e = 0;
            }
            a0();
            this.f5218E.f40538b.n(i, i6);
            b0(false);
            c5000o.f40575g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i6);
        this.f5218E.f40538b.n(i, i6);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f5216D == null) {
            return;
        }
        if (c5000o.f40572d == 1) {
            p();
        }
        this.f5218E.q0(i, i6);
        c5000o.i = true;
        q();
        this.f5218E.s0(i, i6);
        if (this.f5218E.v0()) {
            this.f5218E.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            c5000o.i = true;
            q();
            this.f5218E.s0(i, i6);
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
        if (!(parcelable instanceof C4997L)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4997L c4997l = (C4997L) parcelable;
        this.f5266v = c4997l;
        super.onRestoreInstanceState(c4997l.f3267n);
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E == null || (parcelable2 = this.f5266v.f40561v) == null) {
            return;
        }
        abstractC4990E.d0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C4997L c4997l = new C4997L(super.onSaveInstanceState());
        C4997L c4997l2 = this.f5266v;
        if (c4997l2 != null) {
            c4997l.f40561v = c4997l2.f40561v;
            return c4997l;
        }
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E != null) {
            c4997l.f40561v = abstractC4990E.e0();
            return c4997l;
        }
        c4997l.f40561v = null;
        return c4997l;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i6, int i9, int i10) {
        super.onSizeChanged(i, i6, i9, i10);
        if (i == i9 && i6 == i10) {
            return;
        }
        this.f5259p0 = null;
        this.f5257n0 = null;
        this.f5258o0 = null;
        this.f5253W = null;
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
        boolean z3;
        int i;
        int minFlingVelocity;
        boolean z6;
        C4953b c4953b;
        float f3;
        int H8;
        PointF a9;
        int i6;
        int i9;
        boolean z9;
        if (!this.f5235N && !this.f5237O) {
            C5016k c5016k = this.f5224H;
            if (c5016k == null) {
                z3 = motionEvent.getAction() == 0 ? false : B(motionEvent);
            } else {
                if (c5016k.f40714v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean d2 = c5016k.d(motionEvent.getX(), motionEvent.getY());
                        boolean c9 = c5016k.c(motionEvent.getX(), motionEvent.getY());
                        if (d2 || c9) {
                            if (c9) {
                                c5016k.f40715w = 1;
                                c5016k.f40708p = (int) motionEvent.getX();
                            } else if (d2) {
                                c5016k.f40715w = 2;
                                c5016k.f40705m = (int) motionEvent.getY();
                            }
                            c5016k.f(2);
                        }
                    } else if (motionEvent.getAction() == 1 && c5016k.f40714v == 2) {
                        c5016k.f40705m = 0.0f;
                        c5016k.f40708p = 0.0f;
                        c5016k.f(1);
                        c5016k.f40715w = 0;
                    } else if (motionEvent.getAction() == 2 && c5016k.f40714v == 2) {
                        c5016k.g();
                        int i10 = c5016k.f40715w;
                        int i11 = c5016k.f40695b;
                        if (i10 == 1) {
                            float x9 = motionEvent.getX();
                            int[] iArr = c5016k.f40717y;
                            iArr[0] = i11;
                            int i12 = c5016k.f40709q - i11;
                            iArr[1] = i12;
                            float max = Math.max(i11, Math.min(i12, x9));
                            if (Math.abs(c5016k.f40707o - max) >= 2.0f) {
                                int e9 = C5016k.e(c5016k.f40708p, max, iArr, c5016k.f40711s.computeHorizontalScrollRange(), c5016k.f40711s.computeHorizontalScrollOffset(), c5016k.f40709q);
                                if (e9 != 0) {
                                    c5016k.f40711s.scrollBy(e9, 0);
                                }
                                c5016k.f40708p = max;
                            }
                        }
                        if (c5016k.f40715w == 2) {
                            float y7 = motionEvent.getY();
                            int[] iArr2 = c5016k.f40716x;
                            iArr2[0] = i11;
                            int i13 = c5016k.f40710r - i11;
                            iArr2[1] = i13;
                            float max2 = Math.max(i11, Math.min(i13, y7));
                            if (Math.abs(c5016k.f40704l - max2) >= 2.0f) {
                                int e10 = C5016k.e(c5016k.f40705m, max2, iArr2, c5016k.f40711s.computeVerticalScrollRange(), c5016k.f40711s.computeVerticalScrollOffset(), c5016k.f40710r);
                                if (e10 != 0) {
                                    c5016k.f40711s.scrollBy(0, e10);
                                }
                                c5016k.f40705m = max2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f5224H = null;
                }
                z3 = true;
            }
            if (z3) {
                V();
                setScrollState(0);
                return true;
            }
            AbstractC4990E abstractC4990E = this.f5218E;
            if (abstractC4990E != null) {
                boolean d9 = abstractC4990E.d();
                boolean e11 = this.f5218E.e();
                if (this.f5263t0 == null) {
                    this.f5263t0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.f5248T0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked == 0) {
                    this.f5262s0 = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.f5269w0 = x10;
                    this.f5265u0 = x10;
                    int y9 = (int) (motionEvent.getY() + 0.5f);
                    this.f5271x0 = y9;
                    this.f5267v0 = y9;
                    int i14 = d9;
                    if (e11) {
                        i14 = (d9 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i14, 0);
                } else {
                    if (actionMasked == 1) {
                        this.f5263t0.addMovement(obtain);
                        VelocityTracker velocityTracker = this.f5263t0;
                        int i15 = this.f5214B0;
                        velocityTracker.computeCurrentVelocity(1000, i15);
                        float f9 = d9 != 0 ? -this.f5263t0.getXVelocity(this.f5262s0) : 0.0f;
                        float f10 = e11 ? -this.f5263t0.getYVelocity(this.f5262s0) : 0.0f;
                        if (f9 == 0.0f && f10 == 0.0f) {
                            i9 = 0;
                        } else {
                            int i16 = (int) f9;
                            int i17 = (int) f10;
                            AbstractC4990E abstractC4990E2 = this.f5218E;
                            if (abstractC4990E2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.f5235N) {
                                int d10 = abstractC4990E2.d();
                                boolean e12 = this.f5218E.e();
                                int i18 = this.f5212A0;
                                if (d10 == 0 || Math.abs(i16) < i18) {
                                    i16 = 0;
                                }
                                if (!e12 || Math.abs(i17) < i18) {
                                    i17 = 0;
                                }
                                if (i16 != 0 || i17 != 0) {
                                    float f11 = i16;
                                    float f12 = i17;
                                    if (!dispatchNestedPreFling(f11, f12)) {
                                        boolean z10 = d10 != 0 || e12;
                                        dispatchNestedFling(f11, f12, z10);
                                        AbstractC4992G abstractC4992G = this.f5275z0;
                                        if (abstractC4992G != null) {
                                            C5026u c5026u = (C5026u) abstractC4992G;
                                            AbstractC4990E layoutManager = c5026u.f40773a.getLayoutManager();
                                            if (layoutManager != 0 && c5026u.f40773a.getAdapter() != null && ((Math.abs(i17) > (minFlingVelocity = c5026u.f40773a.getMinFlingVelocity()) || Math.abs(i16) > minFlingVelocity) && ((z6 = layoutManager instanceof InterfaceC4999N)))) {
                                                if (z6) {
                                                    f3 = 0.0f;
                                                    c4953b = new C4953b(1, c5026u.f40773a.getContext(), c5026u);
                                                } else {
                                                    f3 = 0.0f;
                                                    c4953b = null;
                                                }
                                                if (c4953b != null) {
                                                    int B9 = layoutManager.B();
                                                    if (B9 != 0) {
                                                        androidx.emoji2.text.g e13 = layoutManager.e() ? c5026u.e(layoutManager) : layoutManager.d() ? c5026u.d(layoutManager) : null;
                                                        if (e13 != null) {
                                                            int v9 = layoutManager.v();
                                                            int i19 = Integer.MIN_VALUE;
                                                            int i20 = Integer.MAX_VALUE;
                                                            View view = null;
                                                            View view2 = null;
                                                            i = 1;
                                                            int i21 = 0;
                                                            while (i21 < v9) {
                                                                int i22 = v9;
                                                                View u3 = layoutManager.u(i21);
                                                                if (u3 == null) {
                                                                    i6 = i21;
                                                                } else {
                                                                    i6 = i21;
                                                                    int b9 = C5026u.b(u3, e13);
                                                                    if (b9 <= 0 && b9 > i19) {
                                                                        view2 = u3;
                                                                        i19 = b9;
                                                                    }
                                                                    if (b9 >= 0 && b9 < i20) {
                                                                        view = u3;
                                                                        i20 = b9;
                                                                    }
                                                                }
                                                                i21 = i6 + 1;
                                                                v9 = i22;
                                                            }
                                                            boolean z11 = !layoutManager.d() ? i17 <= 0 : i16 <= 0;
                                                            if (z11 && view != null) {
                                                                H8 = AbstractC4990E.H(view);
                                                            } else if (z11 || view2 == null) {
                                                                if (z11) {
                                                                    view = view2;
                                                                }
                                                                if (view != null) {
                                                                    H8 = ((z6 && (a9 = ((InterfaceC4999N) layoutManager).a(layoutManager.B() + (-1))) != null && ((a9.x > f3 ? 1 : (a9.x == f3 ? 0 : -1)) < 0 || (a9.y > f3 ? 1 : (a9.y == f3 ? 0 : -1)) < 0)) == z11 ? -1 : 1) + AbstractC4990E.H(view);
                                                                    if (H8 >= 0) {
                                                                    }
                                                                }
                                                                H8 = -1;
                                                            } else {
                                                                H8 = AbstractC4990E.H(view2);
                                                            }
                                                            if (H8 != -1) {
                                                                c4953b.f40757a = H8;
                                                                layoutManager.y0(c4953b);
                                                                V();
                                                                obtain.recycle();
                                                                return true;
                                                            }
                                                            if (z10) {
                                                                if (e12) {
                                                                    d10 = (d10 == true ? 1 : 0) | 2;
                                                                }
                                                                getScrollingChildHelper().g(d10, i);
                                                                int i23 = -i15;
                                                                int max3 = Math.max(i23, Math.min(i16, i15));
                                                                int max4 = Math.max(i23, Math.min(i17, i15));
                                                                RunnableC5002Q runnableC5002Q = this.f5221F0;
                                                                RecyclerView recyclerView = runnableC5002Q.f40588z;
                                                                recyclerView.setScrollState(2);
                                                                runnableC5002Q.f40583u = 0;
                                                                runnableC5002Q.f40582n = 0;
                                                                Interpolator interpolator = runnableC5002Q.f40585w;
                                                                b bVar = f5210a1;
                                                                if (interpolator != bVar) {
                                                                    runnableC5002Q.f40585w = bVar;
                                                                    runnableC5002Q.f40584v = new OverScroller(recyclerView.getContext(), bVar);
                                                                }
                                                                runnableC5002Q.f40584v.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                                runnableC5002Q.a();
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
                                                    if (z10) {
                                                    }
                                                }
                                            }
                                        }
                                        i = 1;
                                        if (z10) {
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
                        int findPointerIndex = motionEvent.findPointerIndex(this.f5262s0);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5262s0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y10 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i24 = this.f5269w0 - x11;
                        int i25 = this.f5271x0 - y10;
                        if (this.f5261r0 != 1) {
                            if (d9 != 0) {
                                i24 = i24 > 0 ? Math.max(0, i24 - this.f5273y0) : Math.min(0, i24 + this.f5273y0);
                                if (i24 != 0) {
                                    z9 = true;
                                    if (e11) {
                                        i25 = i25 > 0 ? Math.max(0, i25 - this.f5273y0) : Math.min(0, i25 + this.f5273y0);
                                        if (i25 != 0) {
                                            z9 = true;
                                        }
                                    }
                                    if (z9) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z9 = false;
                            if (e11) {
                            }
                            if (z9) {
                            }
                        }
                        int i26 = i24;
                        int i27 = i25;
                        if (this.f5261r0 == 1) {
                            int[] iArr4 = this.f5250U0;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            boolean r9 = r(d9 != 0 ? i26 : 0, e11 ? i27 : 0, 0, iArr4, this.f5246S0);
                            int[] iArr5 = this.f5246S0;
                            if (r9) {
                                i26 -= iArr4[0];
                                i27 -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i28 = i27;
                            this.f5269w0 = x11 - iArr5[0];
                            this.f5271x0 = y10 - iArr5[1];
                            if (W(d9 != 0 ? i26 : 0, e11 ? i28 : 0, motionEvent)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            RunnableC5018m runnableC5018m = this.f5223G0;
                            if (runnableC5018m != null && (i26 != 0 || i28 != 0)) {
                                runnableC5018m.a(this, i26, i28);
                            }
                        }
                    } else if (actionMasked == 3) {
                        V();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f5262s0 = motionEvent.getPointerId(actionIndex);
                        int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f5269w0 = x12;
                        this.f5265u0 = x12;
                        int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f5271x0 = y11;
                        this.f5267v0 = y11;
                    } else if (actionMasked == 6) {
                        R(motionEvent);
                    }
                }
                this.f5263t0.addMovement(obtain);
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
        b0 b0Var;
        boolean z3;
        int i;
        boolean z6;
        boolean z9;
        char c9;
        boolean z10;
        boolean z11;
        C5006a q8;
        int i6;
        int i9;
        C5006a c5006a;
        C5000O c5000o = this.f5227I0;
        c5000o.a(1);
        z(c5000o);
        c5000o.i = false;
        a0();
        k8.b bVar = this.f5272y;
        ((k) bVar.f38706n).clear();
        s.e eVar = (s.e) bVar.f38707u;
        eVar.h();
        P();
        if (this.f5243R) {
            N n9 = this.f5268w;
            n9.s((ArrayList) n9.f302v);
            n9.s((ArrayList) n9.f303w);
            if (this.f5245S) {
                this.f5218E.X();
            }
        }
        if (this.f5260q0 == null || !this.f5218E.z0()) {
            this.f5268w.h();
        } else {
            N n10 = this.f5268w;
            ArrayList arrayList = (ArrayList) n10.f302v;
            C4523c c4523c = (C4523c) n10.f305y;
            c4523c.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                boolean z12 = false;
                while (true) {
                    i = 8;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (((C5006a) arrayList.get(size)).f40638a == 8) {
                        if (z12) {
                            break;
                        }
                    } else {
                        z12 = true;
                    }
                    size--;
                }
                if (size == -1) {
                    break;
                }
                int i10 = size + 1;
                C5006a c5006a2 = (C5006a) arrayList.get(size);
                C5006a c5006a3 = (C5006a) arrayList.get(i10);
                int i11 = c5006a3.f40638a;
                if (i11 != 1) {
                    C5006a c5006a4 = null;
                    N n11 = (N) c4523c.f37627u;
                    if (i11 == 2) {
                        int i12 = c5006a2.f40639b;
                        int i13 = c5006a2.f40640c;
                        if (i12 < i13) {
                            if (c5006a3.f40639b == i12 && c5006a3.f40640c == i13 - i12) {
                                z10 = false;
                                z11 = true;
                            } else {
                                z10 = false;
                                z11 = false;
                            }
                        } else if (c5006a3.f40639b == i13 + 1 && c5006a3.f40640c == i12 - i13) {
                            z10 = true;
                            z11 = true;
                        } else {
                            z10 = true;
                            z11 = false;
                        }
                        int i14 = c5006a3.f40639b;
                        if (i13 < i14) {
                            c5006a3.f40639b = i14 - 1;
                        } else {
                            int i15 = c5006a3.f40640c;
                            if (i13 < i14 + i15) {
                                c5006a3.f40640c = i15 - 1;
                                c5006a2.f40638a = 2;
                                c5006a2.f40640c = 1;
                                if (c5006a3.f40640c == 0) {
                                    arrayList.remove(i10);
                                    n11.getClass();
                                    ((c) n11.f301u).c(c5006a3);
                                }
                            }
                        }
                        int i16 = c5006a2.f40639b;
                        int i17 = c5006a3.f40639b;
                        if (i16 <= i17) {
                            c5006a3.f40639b = i17 + 1;
                        } else {
                            int i18 = i17 + c5006a3.f40640c;
                            if (i16 < i18) {
                                c5006a4 = n11.q(2, i16 + 1, i18 - i16);
                                c5006a3.f40640c = c5006a2.f40639b - c5006a3.f40639b;
                            }
                        }
                        C5006a c5006a5 = c5006a4;
                        if (z11) {
                            arrayList.set(size, c5006a3);
                            arrayList.remove(i10);
                            n11.getClass();
                            ((c) n11.f301u).c(c5006a2);
                        } else {
                            if (z10) {
                                if (c5006a5 != null) {
                                    int i19 = c5006a2.f40639b;
                                    if (i19 > c5006a5.f40639b) {
                                        c5006a2.f40639b = i19 - c5006a5.f40640c;
                                    }
                                    int i20 = c5006a2.f40640c;
                                    if (i20 > c5006a5.f40639b) {
                                        c5006a2.f40640c = i20 - c5006a5.f40640c;
                                    }
                                }
                                int i21 = c5006a2.f40639b;
                                if (i21 > c5006a3.f40639b) {
                                    c5006a2.f40639b = i21 - c5006a3.f40640c;
                                }
                                int i22 = c5006a2.f40640c;
                                if (i22 > c5006a3.f40639b) {
                                    c5006a2.f40640c = i22 - c5006a3.f40640c;
                                }
                            } else {
                                if (c5006a5 != null) {
                                    int i23 = c5006a2.f40639b;
                                    if (i23 >= c5006a5.f40639b) {
                                        c5006a2.f40639b = i23 - c5006a5.f40640c;
                                    }
                                    int i24 = c5006a2.f40640c;
                                    if (i24 >= c5006a5.f40639b) {
                                        c5006a2.f40640c = i24 - c5006a5.f40640c;
                                    }
                                }
                                int i25 = c5006a2.f40639b;
                                if (i25 >= c5006a3.f40639b) {
                                    c5006a2.f40639b = i25 - c5006a3.f40640c;
                                }
                                int i26 = c5006a2.f40640c;
                                if (i26 >= c5006a3.f40639b) {
                                    c5006a2.f40640c = i26 - c5006a3.f40640c;
                                }
                            }
                            arrayList.set(size, c5006a3);
                            if (c5006a2.f40639b != c5006a2.f40640c) {
                                arrayList.set(i10, c5006a2);
                            } else {
                                arrayList.remove(i10);
                            }
                            if (c5006a5 != null) {
                                arrayList.add(size, c5006a5);
                            }
                        }
                    } else if (i11 == 4) {
                        int i27 = c5006a2.f40640c;
                        int i28 = c5006a3.f40639b;
                        if (i27 < i28) {
                            c5006a3.f40639b = i28 - 1;
                        } else {
                            int i29 = c5006a3.f40640c;
                            if (i27 < i28 + i29) {
                                c5006a3.f40640c = i29 - 1;
                                q8 = n11.q(4, c5006a2.f40639b, 1);
                                i6 = c5006a2.f40639b;
                                i9 = c5006a3.f40639b;
                                if (i6 > i9) {
                                    c5006a3.f40639b = i9 + 1;
                                } else {
                                    int i30 = i9 + c5006a3.f40640c;
                                    if (i6 < i30) {
                                        int i31 = i30 - i6;
                                        c5006a4 = n11.q(4, i6 + 1, i31);
                                        c5006a3.f40640c -= i31;
                                    }
                                }
                                c5006a = c5006a4;
                                arrayList.set(i10, c5006a2);
                                if (c5006a3.f40640c <= 0) {
                                    arrayList.set(size, c5006a3);
                                } else {
                                    arrayList.remove(size);
                                    n11.getClass();
                                    ((c) n11.f301u).c(c5006a3);
                                }
                                if (q8 != null) {
                                    arrayList.add(size, q8);
                                }
                                if (c5006a == null) {
                                    arrayList.add(size, c5006a);
                                }
                            }
                        }
                        q8 = null;
                        i6 = c5006a2.f40639b;
                        i9 = c5006a3.f40639b;
                        if (i6 > i9) {
                        }
                        c5006a = c5006a4;
                        arrayList.set(i10, c5006a2);
                        if (c5006a3.f40640c <= 0) {
                        }
                        if (q8 != null) {
                        }
                        if (c5006a == null) {
                        }
                    }
                } else {
                    int i32 = c5006a2.f40640c;
                    int i33 = c5006a3.f40639b;
                    int i34 = i32 < i33 ? -1 : 0;
                    int i35 = c5006a2.f40639b;
                    if (i35 < i33) {
                        i34++;
                    }
                    if (i33 <= i35) {
                        c5006a2.f40639b = i35 + c5006a3.f40640c;
                    }
                    int i36 = c5006a3.f40639b;
                    if (i36 <= i32) {
                        c5006a2.f40640c = i32 + c5006a3.f40640c;
                    }
                    c5006a3.f40639b = i36 + i34;
                    arrayList.set(size, c5006a3);
                    arrayList.set(i10, c5006a2);
                }
            }
            int size2 = arrayList.size();
            int i37 = 0;
            while (i37 < size2) {
                C5006a c5006a6 = (C5006a) arrayList.get(i37);
                int i38 = c5006a6.f40638a;
                if (i38 != 1) {
                    C4522b c4522b = (C4522b) n10.f304x;
                    if (i38 == 2) {
                        int i39 = c5006a6.f40639b;
                        int i40 = c5006a6.f40640c + i39;
                        int i41 = i39;
                        int i42 = 0;
                        char c10 = 65535;
                        while (i41 < i40) {
                            if (c4522b.C(i41) != null || n10.g(i41)) {
                                if (c10 == 0) {
                                    n10.j(n10.q(2, i39, i42));
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                z9 = z6;
                                c9 = 1;
                            } else {
                                if (c10 == 1) {
                                    n10.r(n10.q(2, i39, i42));
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                c9 = 0;
                            }
                            if (z9) {
                                i41 -= i42;
                                i40 -= i42;
                                i42 = 1;
                            } else {
                                i42++;
                            }
                            i41++;
                            c10 = c9;
                        }
                        if (i42 != c5006a6.f40640c) {
                            ((c) n10.f301u).c(c5006a6);
                            c5006a6 = n10.q(2, i39, i42);
                        }
                        if (c10 == 0) {
                            n10.j(c5006a6);
                        } else {
                            n10.r(c5006a6);
                        }
                    } else if (i38 == 4) {
                        int i43 = c5006a6.f40639b;
                        int i44 = c5006a6.f40640c + i43;
                        int i45 = i43;
                        int i46 = 0;
                        char c11 = 65535;
                        while (i43 < i44) {
                            if (c4522b.C(i43) != null || n10.g(i43)) {
                                if (c11 == 0) {
                                    n10.j(n10.q(4, i45, i46));
                                    i45 = i43;
                                    i46 = 0;
                                }
                                c11 = 1;
                            } else {
                                if (c11 == 1) {
                                    n10.r(n10.q(4, i45, i46));
                                    i45 = i43;
                                    i46 = 0;
                                }
                                c11 = 0;
                            }
                            i46++;
                            i43++;
                        }
                        if (i46 != c5006a6.f40640c) {
                            ((c) n10.f301u).c(c5006a6);
                            c5006a6 = n10.q(4, i45, i46);
                        }
                        if (c11 == 0) {
                            n10.j(c5006a6);
                        } else {
                            n10.r(c5006a6);
                        }
                    } else if (i38 == i) {
                        n10.r(c5006a6);
                    }
                } else {
                    n10.r(c5006a6);
                }
                i37++;
                i = 8;
            }
            arrayList.clear();
        }
        boolean z13 = this.f5232L0 || this.f5234M0;
        boolean z14 = this.f5229K && this.f5260q0 != null && ((z3 = this.f5243R) || z13 || this.f5218E.f40542f) && (!z3 || this.f5216D.f40778b);
        C5000O c5000o2 = this.f5227I0;
        c5000o2.f40577j = z14;
        c5000o2.f40578k = z14 && z13 && !this.f5243R && this.f5260q0 != null && this.f5218E.z0();
        View focusedChild = (this.f5219E0 && hasFocus() && this.f5216D != null) ? getFocusedChild() : null;
        AbstractC5003S H8 = (focusedChild == null || (A9 = A(focusedChild)) == null) ? null : H(A9);
        if (H8 == null) {
            c5000o.f40580m = -1L;
            c5000o.f40579l = -1;
            c5000o.f40581n = -1;
        } else {
            c5000o.f40580m = this.f5216D.f40778b ? H8.f40594e : -1L;
            if (!this.f5243R) {
                if (H8.h()) {
                    F8 = H8.f40593d;
                } else {
                    RecyclerView recyclerView = H8.f40606r;
                    if (recyclerView != null) {
                        F8 = recyclerView.F(H8);
                    }
                }
                c5000o.f40579l = F8;
                view = H8.f40590a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                c5000o.f40581n = id;
            }
            F8 = -1;
            c5000o.f40579l = F8;
            view = H8.f40590a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            c5000o.f40581n = id2;
        }
        c5000o.f40576h = c5000o.f40577j && this.f5234M0;
        this.f5234M0 = false;
        this.f5232L0 = false;
        c5000o.f40575g = c5000o.f40578k;
        c5000o.f40573e = this.f5216D.a();
        C(this.f5242Q0);
        boolean z15 = c5000o.f40577j;
        k kVar = (k) bVar.f38706n;
        if (z15) {
            int g4 = this.f5270x.g();
            for (int i47 = 0; i47 < g4; i47++) {
                AbstractC5003S I8 = I(this.f5270x.f(i47));
                if (!I8.o() && (!I8.f() || this.f5216D.f40778b)) {
                    AbstractC5031z abstractC5031z = this.f5260q0;
                    AbstractC5031z.b(I8);
                    I8.c();
                    abstractC5031z.getClass();
                    C0344t c0344t = new C0344t();
                    c0344t.a(I8);
                    b0 b0Var2 = (b0) kVar.getOrDefault(I8, null);
                    if (b0Var2 == null) {
                        b0Var2 = b0.a();
                        kVar.put(I8, b0Var2);
                    }
                    b0Var2.f40646b = c0344t;
                    b0Var2.f40645a |= 4;
                    if (c5000o.f40576h && I8.k() && !I8.h() && !I8.o() && !I8.f()) {
                        eVar.k(G(I8), I8);
                    }
                }
            }
        }
        if (c5000o.f40578k) {
            int n12 = this.f5270x.n();
            for (int i48 = 0; i48 < n12; i48++) {
                AbstractC5003S I9 = I(this.f5270x.m(i48));
                if (!I9.o() && I9.f40593d == -1) {
                    I9.f40593d = I9.f40592c;
                }
            }
            boolean z16 = c5000o.f40574f;
            c5000o.f40574f = false;
            this.f5218E.b0(this.f5264u, c5000o);
            c5000o.f40574f = z16;
            for (int i49 = 0; i49 < this.f5270x.g(); i49++) {
                AbstractC5003S I10 = I(this.f5270x.f(i49));
                if (!I10.o() && ((b0Var = (b0) kVar.getOrDefault(I10, null)) == null || (b0Var.f40645a & 4) == 0)) {
                    AbstractC5031z.b(I10);
                    boolean z17 = (I10.f40598j & 8192) != 0;
                    AbstractC5031z abstractC5031z2 = this.f5260q0;
                    I10.c();
                    abstractC5031z2.getClass();
                    C0344t c0344t2 = new C0344t();
                    c0344t2.a(I10);
                    if (z17) {
                        T(I10, c0344t2);
                    } else {
                        b0 b0Var3 = (b0) kVar.getOrDefault(I10, null);
                        if (b0Var3 == null) {
                            b0Var3 = b0.a();
                            kVar.put(I10, b0Var3);
                        }
                        b0Var3.f40645a |= 2;
                        b0Var3.f40646b = c0344t2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        Q(true);
        b0(false);
        c5000o.f40572d = 2;
    }

    public final void q() {
        a0();
        P();
        C5000O c5000o = this.f5227I0;
        c5000o.a(6);
        this.f5268w.h();
        c5000o.f40573e = this.f5216D.a();
        c5000o.f40571c = 0;
        c5000o.f40575g = false;
        this.f5218E.b0(this.f5264u, c5000o);
        c5000o.f40574f = false;
        this.f5266v = null;
        c5000o.f40577j = c5000o.f40577j && this.f5260q0 != null;
        c5000o.f40572d = 4;
        Q(true);
        b0(false);
    }

    public final boolean r(int i, int i6, int i9, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i6, i9, iArr, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z3) {
        AbstractC5003S I8 = I(view);
        if (I8 != null) {
            if (I8.j()) {
                I8.f40598j &= -257;
            } else if (!I8.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + I8 + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C5024s c5024s = this.f5218E.f40541e;
        if ((c5024s == null || !c5024s.f40761e) && !L() && view2 != null) {
            U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.f5218E.k0(this, view, rect, z3, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        ArrayList arrayList = this.f5222G;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C5016k) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f5231L != 0 || this.f5235N) {
            this.f5233M = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i6, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        getScrollingChildHelper().d(i, i6, i9, i10, iArr, i11, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i6) {
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5235N) {
            return;
        }
        boolean d2 = abstractC4990E.d();
        boolean e9 = this.f5218E.e();
        if (d2 || e9) {
            if (!d2) {
                i = 0;
            }
            if (!e9) {
                i6 = 0;
            }
            W(i, i6, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i6) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f5239P |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C5004T c5004t) {
        this.f5240P0 = c5004t;
        X.o(this, c5004t);
    }

    public void setAdapter(AbstractC5027v abstractC5027v) {
        setLayoutFrozen(false);
        AbstractC5027v abstractC5027v2 = this.f5216D;
        e eVar = this.f5256n;
        if (abstractC5027v2 != null) {
            abstractC5027v2.f40777a.unregisterObserver(eVar);
            this.f5216D.getClass();
        }
        AbstractC5031z abstractC5031z = this.f5260q0;
        if (abstractC5031z != null) {
            abstractC5031z.e();
        }
        AbstractC4990E abstractC4990E = this.f5218E;
        C3675oP c3675oP = this.f5264u;
        if (abstractC4990E != null) {
            abstractC4990E.g0(c3675oP);
            this.f5218E.h0(c3675oP);
        }
        ((ArrayList) c3675oP.f32899c).clear();
        c3675oP.d();
        N n9 = this.f5268w;
        n9.s((ArrayList) n9.f302v);
        n9.s((ArrayList) n9.f303w);
        AbstractC5027v abstractC5027v3 = this.f5216D;
        this.f5216D = abstractC5027v;
        if (abstractC5027v != null) {
            abstractC5027v.f40777a.registerObserver(eVar);
        }
        AbstractC5027v abstractC5027v4 = this.f5216D;
        ((ArrayList) c3675oP.f32899c).clear();
        c3675oP.d();
        C4995J c9 = c3675oP.c();
        if (abstractC5027v3 != null) {
            c9.f40560b--;
        }
        if (c9.f40560b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c9.f40559a;
                if (i >= sparseArray.size()) {
                    break;
                }
                ((C4994I) sparseArray.valueAt(i)).f40555a.clear();
                i++;
            }
        }
        if (abstractC5027v4 != null) {
            c9.f40560b++;
        }
        this.f5227I0.f40574f = true;
        this.f5245S |= false;
        this.f5243R = true;
        int n10 = this.f5270x.n();
        for (int i6 = 0; i6 < n10; i6++) {
            AbstractC5003S I8 = I(this.f5270x.m(i6));
            if (I8 != null && !I8.o()) {
                I8.a(6);
            }
        }
        N();
        C3675oP c3675oP2 = this.f5264u;
        ArrayList arrayList = (ArrayList) c3675oP2.f32901e;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC5003S abstractC5003S = (AbstractC5003S) arrayList.get(i9);
            if (abstractC5003S != null) {
                abstractC5003S.a(6);
                abstractC5003S.a(1024);
            }
        }
        AbstractC5027v abstractC5027v5 = ((RecyclerView) c3675oP2.f32904h).f5216D;
        if (abstractC5027v5 == null || !abstractC5027v5.f40778b) {
            c3675oP2.d();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC5029x interfaceC5029x) {
        if (interfaceC5029x == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        if (z3 != this.f5274z) {
            this.f5259p0 = null;
            this.f5257n0 = null;
            this.f5258o0 = null;
            this.f5253W = null;
        }
        this.f5274z = z3;
        super.setClipToPadding(z3);
        if (this.f5229K) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C5030y c5030y) {
        c5030y.getClass();
        this.f5251V = c5030y;
        this.f5259p0 = null;
        this.f5257n0 = null;
        this.f5258o0 = null;
        this.f5253W = null;
    }

    public void setHasFixedSize(boolean z3) {
        this.J = z3;
    }

    public void setItemAnimator(AbstractC5031z abstractC5031z) {
        AbstractC5031z abstractC5031z2 = this.f5260q0;
        if (abstractC5031z2 != null) {
            abstractC5031z2.e();
            this.f5260q0.f40779a = null;
        }
        this.f5260q0 = abstractC5031z;
        if (abstractC5031z != null) {
            abstractC5031z.f40779a = this.f5236N0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C3675oP c3675oP = this.f5264u;
        c3675oP.f32897a = i;
        c3675oP.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z3) {
        suppressLayout(z3);
    }

    public void setLayoutManager(AbstractC4990E abstractC4990E) {
        RecyclerView recyclerView;
        C5024s c5024s;
        if (abstractC4990E == this.f5218E) {
            return;
        }
        setScrollState(0);
        RunnableC5002Q runnableC5002Q = this.f5221F0;
        runnableC5002Q.f40588z.removeCallbacks(runnableC5002Q);
        runnableC5002Q.f40584v.abortAnimation();
        AbstractC4990E abstractC4990E2 = this.f5218E;
        if (abstractC4990E2 != null && (c5024s = abstractC4990E2.f40541e) != null) {
            c5024s.i();
        }
        AbstractC4990E abstractC4990E3 = this.f5218E;
        C3675oP c3675oP = this.f5264u;
        if (abstractC4990E3 != null) {
            AbstractC5031z abstractC5031z = this.f5260q0;
            if (abstractC5031z != null) {
                abstractC5031z.e();
            }
            this.f5218E.g0(c3675oP);
            this.f5218E.h0(c3675oP);
            ((ArrayList) c3675oP.f32899c).clear();
            c3675oP.d();
            if (this.f5226I) {
                AbstractC4990E abstractC4990E4 = this.f5218E;
                abstractC4990E4.f40543g = false;
                abstractC4990E4.R(this);
            }
            this.f5218E.t0(null);
            this.f5218E = null;
        } else {
            ((ArrayList) c3675oP.f32899c).clear();
            c3675oP.d();
        }
        g gVar = this.f5270x;
        ((C3381j1) gVar.f38405v).r();
        ArrayList arrayList = (ArrayList) gVar.f38406w;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = (RecyclerView) ((C4648e) gVar.f38404u).f38761u;
            if (size < 0) {
                break;
            }
            AbstractC5003S I8 = I((View) arrayList.get(size));
            if (I8 != null) {
                int i = I8.f40604p;
                if (recyclerView.L()) {
                    I8.f40605q = i;
                    recyclerView.f5252V0.add(I8);
                } else {
                    WeakHashMap weakHashMap = X.f2054a;
                    I8.f40590a.setImportantForAccessibility(i);
                }
                I8.f40604p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = recyclerView.getChildAt(i6);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f5218E = abstractC4990E;
        if (abstractC4990E != null) {
            if (abstractC4990E.f40538b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC4990E + " is already attached to a RecyclerView:" + abstractC4990E.f40538b.y());
            }
            abstractC4990E.t0(this);
            if (this.f5226I) {
                AbstractC4990E abstractC4990E5 = this.f5218E;
                abstractC4990E5.f40543g = true;
                abstractC4990E5.Q(this);
            }
        }
        c3675oP.k();
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
    public void setNestedScrollingEnabled(boolean z3) {
        C0342q scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f2128d) {
            WeakHashMap weakHashMap = X.f2054a;
            L.z(scrollingChildHelper.f2127c);
        }
        scrollingChildHelper.f2128d = z3;
    }

    public void setOnFlingListener(AbstractC4992G abstractC4992G) {
        this.f5275z0 = abstractC4992G;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC4993H abstractC4993H) {
        this.f5228J0 = abstractC4993H;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.f5219E0 = z3;
    }

    public void setRecycledViewPool(C4995J c4995j) {
        C3675oP c3675oP = this.f5264u;
        if (((C4995J) c3675oP.f32903g) != null) {
            r1.f40560b--;
        }
        c3675oP.f32903g = c4995j;
        if (c4995j == null || ((RecyclerView) c3675oP.f32904h).getAdapter() == null) {
            return;
        }
        ((C4995J) c3675oP.f32903g).f40560b++;
    }

    public void setScrollState(int i) {
        C5024s c5024s;
        if (i == this.f5261r0) {
            return;
        }
        this.f5261r0 = i;
        if (i != 2) {
            RunnableC5002Q runnableC5002Q = this.f5221F0;
            runnableC5002Q.f40588z.removeCallbacks(runnableC5002Q);
            runnableC5002Q.f40584v.abortAnimation();
            AbstractC4990E abstractC4990E = this.f5218E;
            if (abstractC4990E != null && (c5024s = abstractC4990E.f40541e) != null) {
                c5024s.i();
            }
        }
        AbstractC4990E abstractC4990E2 = this.f5218E;
        if (abstractC4990E2 != null) {
            abstractC4990E2.f0(i);
        }
        AbstractC4993H abstractC4993H = this.f5228J0;
        if (abstractC4993H != null) {
            abstractC4993H.a(this, i);
        }
        ArrayList arrayList = this.f5230K0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC4993H) this.f5230K0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f5273y0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f5273y0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC5001P abstractC5001P) {
        this.f5264u.getClass();
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
    public final void suppressLayout(boolean z3) {
        C5024s c5024s;
        if (z3 != this.f5235N) {
            i("Do not suppressLayout in layout or scroll");
            if (!z3) {
                this.f5235N = false;
                if (this.f5233M && this.f5218E != null && this.f5216D != null) {
                    requestLayout();
                }
                this.f5233M = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f5235N = true;
            this.f5237O = true;
            setScrollState(0);
            RunnableC5002Q runnableC5002Q = this.f5221F0;
            runnableC5002Q.f40588z.removeCallbacks(runnableC5002Q);
            runnableC5002Q.f40584v.abortAnimation();
            AbstractC4990E abstractC4990E = this.f5218E;
            if (abstractC4990E == null || (c5024s = abstractC4990E.f40541e) == null) {
                return;
            }
            c5024s.i();
        }
    }

    public final void t(int i, int i6) {
        this.f5249U++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i6);
        AbstractC4993H abstractC4993H = this.f5228J0;
        if (abstractC4993H != null) {
            abstractC4993H.b(this, i, i6);
        }
        ArrayList arrayList = this.f5230K0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC4993H) this.f5230K0.get(size)).b(this, i, i6);
            }
        }
        this.f5249U--;
    }

    public final void u() {
        if (this.f5259p0 != null) {
            return;
        }
        this.f5251V.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5259p0 = edgeEffect;
        if (this.f5274z) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.f5253W != null) {
            return;
        }
        this.f5251V.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5253W = edgeEffect;
        if (this.f5274z) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.f5258o0 != null) {
            return;
        }
        this.f5251V.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5258o0 = edgeEffect;
        if (this.f5274z) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.f5257n0 != null) {
            return;
        }
        this.f5251V.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5257n0 = edgeEffect;
        if (this.f5274z) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f5216D + ", layout:" + this.f5218E + ", context:" + getContext();
    }

    public final void z(C5000O c5000o) {
        if (getScrollState() != 2) {
            c5000o.getClass();
            return;
        }
        OverScroller overScroller = this.f5221F0.f40584v;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c5000o.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float a9;
        TypedArray typedArray;
        int i6;
        char c9;
        char c10;
        AttributeSet attributeSet2;
        int i9;
        Constructor constructor;
        Object[] objArr;
        int i10 = 29;
        int i11 = 6;
        this.f5256n = new e();
        C3675oP c3675oP = new C3675oP();
        c3675oP.f32904h = this;
        ArrayList arrayList = new ArrayList();
        c3675oP.f32899c = arrayList;
        c3675oP.f32900d = null;
        c3675oP.f32901e = new ArrayList();
        c3675oP.f32902f = Collections.unmodifiableList(arrayList);
        c3675oP.f32897a = 2;
        c3675oP.f32898b = 2;
        this.f5264u = c3675oP;
        this.f5272y = new k8.b(3);
        this.f5211A = new Rect();
        this.f5213B = new Rect();
        this.f5215C = new RectF();
        this.f5220F = new ArrayList();
        this.f5222G = new ArrayList();
        this.f5231L = 0;
        this.f5243R = false;
        this.f5245S = false;
        this.f5247T = 0;
        this.f5249U = 0;
        this.f5251V = new C5030y();
        C5013h c5013h = new C5013h();
        c5013h.f40779a = null;
        c5013h.f40780b = new ArrayList();
        c5013h.f40781c = 120L;
        c5013h.f40782d = 120L;
        c5013h.f40783e = 250L;
        c5013h.f40784f = 250L;
        c5013h.f40676g = true;
        c5013h.f40677h = new ArrayList();
        c5013h.i = new ArrayList();
        c5013h.f40678j = new ArrayList();
        c5013h.f40679k = new ArrayList();
        c5013h.f40680l = new ArrayList();
        c5013h.f40681m = new ArrayList();
        c5013h.f40682n = new ArrayList();
        c5013h.f40683o = new ArrayList();
        c5013h.f40684p = new ArrayList();
        c5013h.f40685q = new ArrayList();
        c5013h.f40686r = new ArrayList();
        this.f5260q0 = c5013h;
        this.f5261r0 = 0;
        this.f5262s0 = -1;
        this.C0 = Float.MIN_VALUE;
        this.f5217D0 = Float.MIN_VALUE;
        this.f5219E0 = true;
        this.f5221F0 = new RunnableC5002Q(this);
        this.f5225H0 = new C2780Sl();
        C5000O c5000o = new C5000O();
        c5000o.f40569a = -1;
        c5000o.f40570b = 0;
        c5000o.f40571c = 0;
        c5000o.f40572d = 1;
        c5000o.f40573e = 0;
        c5000o.f40574f = false;
        c5000o.f40575g = false;
        c5000o.f40576h = false;
        c5000o.i = false;
        c5000o.f40577j = false;
        c5000o.f40578k = false;
        this.f5227I0 = c5000o;
        this.f5232L0 = false;
        this.f5234M0 = false;
        C4986A c4986a = new C4986A(this);
        this.f5236N0 = c4986a;
        this.f5238O0 = false;
        this.f5242Q0 = new int[2];
        this.f5246S0 = new int[2];
        this.f5248T0 = new int[2];
        this.f5250U0 = new int[2];
        this.f5252V0 = new ArrayList();
        this.f5254W0 = new p3.b(i11, this);
        this.f5255X0 = new a(i10, this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5273y0 = viewConfiguration.getScaledTouchSlop();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            Method method = AbstractC0324b0.f2064a;
            a9 = Y.a(viewConfiguration);
        } else {
            a9 = AbstractC0324b0.a(viewConfiguration, context);
        }
        this.C0 = a9;
        this.f5217D0 = i12 >= 26 ? Y.b(viewConfiguration) : AbstractC0324b0.a(viewConfiguration, context);
        this.f5212A0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5214B0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f5260q0.f40779a = c4986a;
        this.f5268w = new N(new C4522b(i10, this));
        this.f5270x = new g(new C4648e(i11, this));
        WeakHashMap weakHashMap = X.f2054a;
        if ((i12 >= 26 ? O.N.c(this) : 0) == 0 && i12 >= 26) {
            O.N.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f5241Q = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C5004T(this));
        int[] iArr = AbstractC4965a.f40442a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (i12 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f5274z = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
            }
            Resources resources = getContext().getResources();
            c9 = 3;
            c10 = 2;
            i9 = i;
            typedArray = obtainStyledAttributes;
            i6 = 4;
            attributeSet2 = attributeSet;
            new C5016k(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C5275R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(C5275R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(C5275R.dimen.fastscroll_margin));
        } else {
            typedArray = obtainStyledAttributes;
            i6 = 4;
            c9 = 3;
            c10 = 2;
            attributeSet2 = attributeSet;
            i9 = i;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(j.f12378z)) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    Class<? extends U> asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC4990E.class);
                    try {
                        constructor = asSubclass.getConstructor(f5209Z0);
                        Object[] objArr2 = new Object[i6];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet2;
                        objArr2[c10] = Integer.valueOf(i9);
                        objArr2[c9] = 0;
                        objArr = objArr2;
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
                    setLayoutManager((AbstractC4990E) constructor.newInstance(objArr));
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
        int i13 = Build.VERSION.SDK_INT;
        int[] iArr2 = f5208Y0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, iArr2, i9, 0);
        if (i13 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet2, obtainStyledAttributes2, i9, 0);
        }
        boolean z3 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC4990E abstractC4990E = this.f5218E;
        if (abstractC4990E != null) {
            return abstractC4990E.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    public void setRecyclerListener(InterfaceC4996K interfaceC4996K) {
    }
}
