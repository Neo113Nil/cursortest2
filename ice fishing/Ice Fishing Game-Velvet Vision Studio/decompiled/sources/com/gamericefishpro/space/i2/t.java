package com.gamericefishpro.space.i2;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.i9.y3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends ViewGroup implements com.gamericefishpro.space.h2.o1, com.gamericefishpro.space.h2.v1, com.gamericefishpro.space.z4.f, com.gamericefishpro.space.h2.m1, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, com.gamericefishpro.space.m1.f {
    public static Class c1;
    public static Method d1;
    public static Method e1;
    public static final com.gamericefishpro.space.t.d0 f1 = new com.gamericefishpro.space.t.d0();
    public static com.appsflyer.internal.s g1;
    public static Method h1;
    public final com.gamericefishpro.space.ph.r A;
    public Function1 A0;
    public final j B;
    public final com.gamericefishpro.space.u6.l B0;
    public final com.gamericefishpro.space.t0.f1 C;
    public final com.gamericefishpro.space.v2.c C0;
    public final View D;
    public final AtomicReference D0;
    public final boolean E;
    public final j1 E0;
    public final com.gamericefishpro.space.m1.k F;
    public final j1 F0;
    public CoroutineContext G;
    public final com.gamericefishpro.space.t0.f1 G0;
    public final com.gamericefishpro.space.k1.b H;
    public final com.gamericefishpro.space.t0.f1 H0;
    public final l1 I;
    public final com.gamericefishpro.space.w1.b I0;
    public final com.gamericefishpro.space.o1.r J;
    public final com.gamericefishpro.space.x1.c J0;
    public final p0 K;
    public final com.gamericefishpro.space.g2.b K0;
    public final com.gamericefishpro.space.f2.o L;
    public final j1 L0;
    public final com.gamericefishpro.space.h2.f0 M;
    public MotionEvent M0;
    public final com.gamericefishpro.space.t.w N;
    public long N0;
    public final com.gamericefishpro.space.p2.b O;
    public final com.gamericefishpro.space.u6.c O0;
    public final t P;
    public final com.gamericefishpro.space.t.d0 P0;
    public final com.gamericefishpro.space.o2.q Q;
    public float Q0;
    public final z R;
    public float R0;
    public com.gamericefishpro.space.j1.d S;
    public final com.gamericefishpro.space.h4.b S0;
    public final g T;
    public final j T0;
    public final com.gamericefishpro.space.o1.e U;
    public boolean U0;
    public final com.gamericefishpro.space.i1.i V;
    public final i1 V0;
    public final com.gamericefishpro.space.t.d0 W;
    public final r W0;
    public final u0 X0;
    public boolean Y0;
    public final l1 Z0;
    public com.gamericefishpro.space.t.d0 a0;
    public View a1;
    public boolean b0;
    public final j1 b1;
    public boolean c0;
    public long d;
    public final com.gamericefishpro.space.b2.e d0;
    public final boolean e;
    public final com.gamericefishpro.space.b2.p e0;
    public final com.gamericefishpro.space.t0.f1 f0;
    public final com.gamericefishpro.space.tb.s g0;
    public final com.gamericefishpro.space.i1.b h0;
    public com.gamericefishpro.space.y1.a i;
    public boolean i0;
    public final i j0;
    public final h k0;
    public final com.gamericefishpro.space.h2.q1 l0;
    public boolean m0;
    public q0 n0;
    public com.gamericefishpro.space.c3.a o0;
    public boolean p0;
    public final com.gamericefishpro.space.h2.t0 q0;
    public long r0;
    public final int[] s0;
    public final float[] t0;
    public final float[] u0;
    public final com.gamericefishpro.space.h2.h0 v;
    public long v0;
    public m1 w;
    public boolean w0;
    public long x0;
    public n1 y;
    public final com.gamericefishpro.space.t0.f1 y0;
    public com.gamericefishpro.space.c1.d z;
    public final com.gamericefishpro.space.t0.d0 z0;

    public t(Context context, CoroutineContext coroutineContext) {
        com.gamericefishpro.space.c3.l lVar;
        super(context);
        this.d = 9205357640488583168L;
        int i = 1;
        this.e = true;
        this.v = new com.gamericefishpro.space.h2.h0();
        this.z = com.gamericefishpro.space.c1.a.d;
        this.A = new com.gamericefishpro.space.ph.r();
        this.B = new j(this, 0);
        com.gamericefishpro.space.c3.e eVarA = com.gamericefishpro.space.i.a.a(context);
        com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.f.w;
        this.C = new com.gamericefishpro.space.t0.f1(eVarA, fVar);
        int i2 = Build.VERSION.SDK_INT;
        boolean z = i2 >= 35;
        this.E = z;
        com.gamericefishpro.space.o2.e eVar = new com.gamericefishpro.space.o2.e();
        this.F = new com.gamericefishpro.space.m1.k(this, this);
        this.G = coroutineContext;
        this.H = new com.gamericefishpro.space.k1.b();
        this.I = new l1(0);
        this.J = new com.gamericefishpro.space.o1.r();
        this.K = new p0(ViewConfiguration.get(context));
        this.L = new com.gamericefishpro.space.f2.o();
        com.gamericefishpro.space.h2.f0 f0Var = new com.gamericefishpro.space.h2.f0(3);
        f0Var.c0(com.gamericefishpro.space.f2.z0.b);
        f0Var.Z(getDensity());
        f0Var.e0(getViewConfiguration());
        f0Var.d0(new s(this).c(((com.gamericefishpro.space.m1.k) getFocusOwner()).e).c(m8getDragAndDropManager().c));
        this.M = f0Var;
        com.gamericefishpro.space.t.w wVar = com.gamericefishpro.space.t.m.a;
        this.N = new com.gamericefishpro.space.t.w();
        getLayoutNodes();
        this.O = new com.gamericefishpro.space.p2.b();
        this.P = this;
        this.Q = new com.gamericefishpro.space.o2.q(getRoot(), eVar, getLayoutNodes());
        z zVar = new z(this);
        this.R = zVar;
        this.S = new com.gamericefishpro.space.j1.d(this, new o(0, this, f0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0));
        g gVar = new g();
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.T = gVar;
        this.U = new com.gamericefishpro.space.o1.e(this);
        this.V = new com.gamericefishpro.space.i1.i();
        this.W = new com.gamericefishpro.space.t.d0();
        this.d0 = new com.gamericefishpro.space.b2.e();
        com.gamericefishpro.space.h2.f0 root = getRoot();
        com.gamericefishpro.space.b2.p pVar = new com.gamericefishpro.space.b2.p();
        pVar.b = root;
        pVar.c = new com.gamericefishpro.space.b2.c(root.Z.c);
        int i3 = 2;
        pVar.d = new com.gamericefishpro.space.vb.c(2);
        pVar.e = new com.gamericefishpro.space.h2.o();
        this.e0 = pVar;
        this.f0 = com.gamericefishpro.space.t0.i.v(new Configuration(context.getResources().getConfiguration()));
        com.gamericefishpro.space.i1.i autofillTree = getAutofillTree();
        com.gamericefishpro.space.tb.s sVar = new com.gamericefishpro.space.tb.s();
        sVar.d = this;
        sVar.e = autofillTree;
        AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        sVar.i = autofillManager;
        setImportantForAutofill(1);
        AutofillId autofillId = getAutofillId();
        if (autofillId == null) {
            throw com.gamericefishpro.space.m5.a.e("Required value was null.");
        }
        sVar.v = autofillId;
        this.g0 = sVar;
        AutofillManager autofillManager2 = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager2 == null) {
            throw com.gamericefishpro.space.m5.a.e("Autofill service could not be located.");
        }
        this.h0 = new com.gamericefishpro.space.i1.b(new com.gamericefishpro.space.vb.c(22, autofillManager2), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.j0 = new i(context);
        m7getClipboardManager();
        this.k0 = new h();
        this.l0 = new com.gamericefishpro.space.h2.q1(new m(this, i3));
        this.q0 = new com.gamericefishpro.space.h2.t0(getRoot());
        long j = Integer.MAX_VALUE;
        this.r0 = (j & 4294967295L) | (j << 32);
        this.s0 = new int[]{0, 0};
        float[] fArrI = com.gamericefishpro.space.o1.o.i();
        this.t0 = com.gamericefishpro.space.o1.o.i();
        this.u0 = com.gamericefishpro.space.o1.o.i();
        this.v0 = -1L;
        this.x0 = 9187343241974906880L;
        this.y0 = com.gamericefishpro.space.t0.i.v(null);
        this.z0 = com.gamericefishpro.space.t0.i.p(new r(this, i));
        View view = getView();
        new com.gamericefishpro.space.u6.e(view);
        Choreographer.getInstance();
        com.gamericefishpro.space.u6.l lVar2 = new com.gamericefishpro.space.u6.l();
        lVar2.d = view;
        long j2 = com.gamericefishpro.space.r2.h0.b;
        int length = new com.gamericefishpro.space.r2.e("").e.length();
        int i4 = com.gamericefishpro.space.r2.h0.c;
        int i5 = (int) (j2 >> 32);
        int i6 = i5 < 0 ? 0 : i5;
        i6 = i6 > length ? length : i6;
        int i7 = (int) (j2 & 4294967295L);
        int i8 = i7 < 0 ? 0 : i7;
        length = i8 <= length ? i8 : length;
        if (i6 != i5 || length != i7) {
            com.gamericefishpro.space.r2.a0.b(i6, length);
        }
        int i9 = com.gamericefishpro.space.v2.b.e;
        new ArrayList();
        lVar2.e = com.gamericefishpro.space.oh.i.a(com.gamericefishpro.space.oh.j.e, new com.gamericefishpro.space.a2.b(14, lVar2));
        new CursorAnchorInfo.Builder();
        new Matrix();
        this.B0 = lVar2;
        com.gamericefishpro.space.v2.c cVar = new com.gamericefishpro.space.v2.c();
        new AtomicReference(null);
        this.C0 = cVar;
        this.D0 = new AtomicReference(null);
        getTextInputService();
        this.E0 = new j1();
        this.F0 = new j1();
        this.G0 = new com.gamericefishpro.space.t0.f1(com.gamericefishpro.space.u6.f.o(context), fVar);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = com.gamericefishpro.space.m1.d.a;
        if (layoutDirection != 0) {
            lVar = layoutDirection != 1 ? null : com.gamericefishpro.space.c3.l.e;
        } else {
            lVar = com.gamericefishpro.space.c3.l.d;
        }
        this.H0 = com.gamericefishpro.space.t0.i.v(lVar == null ? com.gamericefishpro.space.c3.l.d : lVar);
        this.I0 = new com.gamericefishpro.space.w1.b();
        this.J0 = new com.gamericefishpro.space.x1.c(isInTouchMode() ? 1 : 2, new m(this, 0));
        com.gamericefishpro.space.g2.b bVar = new com.gamericefishpro.space.g2.b();
        new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h2.b[16]);
        new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.b9.a[16]);
        new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h2.f0[16]);
        new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.b9.a[16]);
        this.K0 = bVar;
        j1 j1Var = new j1();
        v1[] v1VarArr = v1.d;
        this.L0 = j1Var;
        this.O0 = new com.gamericefishpro.space.u6.c(5);
        this.P0 = new com.gamericefishpro.space.t.d0();
        int i10 = 1;
        this.S0 = new com.gamericefishpro.space.h4.b(i10, this);
        this.T0 = new j(this, i10);
        this.V0 = new i1(context, new m(this, i10));
        this.W0 = new r(this, 0);
        this.X0 = i2 < 29 ? new com.gamericefishpro.space.u6.s(fArrI) : new v0();
        addOnAttachStateChangeListener(this.S);
        setWillNotDraw(false);
        setFocusable(true);
        e0.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        com.gamericefishpro.space.d4.l0.l(this, zVar);
        setOnDragListener(m8getDragAndDropManager());
        getRoot().b(this);
        if (i2 >= 29) {
            b0.a.a(this);
        }
        if (z) {
            View view2 = new View(context);
            view2.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view2.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.D = view2;
            addView(view2, -1);
        }
        this.Z0 = i2 >= 31 ? new l1(1) : null;
        j1 j1Var2 = new j1();
        com.gamericefishpro.space.b2.k.a.getClass();
        this.b1 = j1Var2;
    }

    public static final void d(t tVar, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        z zVar = tVar.R;
        if (Intrinsics.a(str, zVar.X)) {
            int iD2 = zVar.V.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!Intrinsics.a(str, zVar.Y) || (iD = zVar.W.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l get_viewTreeOwners() {
        return (l) this.y0.getValue();
    }

    public static void h(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof t) {
                ((t) childAt).y();
            } else if (childAt instanceof ViewGroup) {
                h((ViewGroup) childAt);
            }
        }
    }

    public static long i(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
            return (((long) 0) << 32) | ((long) size);
        }
        if (mode == 0) {
            com.gamericefishpro.space.oh.w wVar2 = com.gamericefishpro.space.oh.x.d;
            return (((long) 0) << 32) | ((long) Integer.MAX_VALUE);
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        com.gamericefishpro.space.oh.w wVar3 = com.gamericefishpro.space.oh.x.d;
        return j | (j << 32);
    }

    public static View k(View view, int i) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (Intrinsics.a(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewK = k(viewGroup.getChildAt(i2), i);
                    if (viewK != null) {
                        return viewK;
                    }
                }
            }
        }
        return null;
    }

    public static void o(com.gamericefishpro.space.h2.f0 f0Var) {
        f0Var.D();
        com.gamericefishpro.space.v0.e eVarZ = f0Var.z();
        Object[] objArr = eVarZ.d;
        int i = eVarZ.i;
        for (int i2 = 0; i2 < i; i2++) {
            o((com.gamericefishpro.space.h2.f0) objArr[i2]);
        }
    }

    public static boolean q(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !q1.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private void setDensity(com.gamericefishpro.space.c3.c cVar) {
        this.C.setValue(cVar);
    }

    private void setFontFamilyResolver(com.gamericefishpro.space.u2.d dVar) {
        this.G0.setValue(dVar);
    }

    private void setLayoutDirection(com.gamericefishpro.space.c3.l lVar) {
        this.H0.setValue(lVar);
    }

    private final void set_viewTreeOwners(l lVar) {
        this.y0.setValue(lVar);
    }

    public final void A(com.gamericefishpro.space.h2.f0 f0Var, boolean z, boolean z2, boolean z3) {
        com.gamericefishpro.space.h2.f0 f0VarV;
        com.gamericefishpro.space.h2.f0 f0VarV2;
        com.gamericefishpro.space.h2.t0 t0Var = this.q0;
        if (!z) {
            if (t0Var.p(f0Var, z2) && z3) {
                G(f0Var);
                return;
            }
            return;
        }
        com.gamericefishpro.space.a8.c cVar = t0Var.b;
        com.gamericefishpro.space.h2.f0 f0Var2 = f0Var.B;
        com.gamericefishpro.space.h2.j0 j0Var = f0Var.a0;
        if (f0Var2 == null) {
            com.gamericefishpro.space.e2.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = j0Var.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new com.gamericefishpro.space.oh.k();
                }
                if (!j0Var.e || z2) {
                    j0Var.e = true;
                    j0Var.p.M = true;
                    if (f0Var.k0) {
                        return;
                    }
                    if ((Intrinsics.a(f0Var.J(), Boolean.TRUE) || com.gamericefishpro.space.h2.t0.h(f0Var)) && ((f0VarV = f0Var.v()) == null || !f0VarV.a0.e)) {
                        cVar.c(f0Var, com.gamericefishpro.space.h2.s.d);
                    } else if ((f0Var.I() || com.gamericefishpro.space.h2.t0.i(f0Var)) && ((f0VarV2 = f0Var.v()) == null || !f0VarV2.q())) {
                        cVar.c(f0Var, com.gamericefishpro.space.h2.s.i);
                    }
                    if (t0Var.d || !z3) {
                        return;
                    }
                    G(f0Var);
                    return;
                }
                return;
            }
        }
        t0Var.h.b(new com.gamericefishpro.space.h2.s0(f0Var, true, z2));
    }

    public final void B(com.gamericefishpro.space.h2.f0 f0Var, boolean z, boolean z2) {
        com.gamericefishpro.space.h2.j0 j0Var = f0Var.a0;
        com.gamericefishpro.space.h2.t0 t0Var = this.q0;
        if (!z) {
            t0Var.getClass();
            int iOrdinal = j0Var.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                throw new com.gamericefishpro.space.oh.k();
            }
            com.gamericefishpro.space.h2.f0 f0VarV = f0Var.v();
            boolean z3 = f0VarV == null || f0VarV.I();
            if (!z2) {
                if (f0Var.q()) {
                    return;
                }
                if (f0Var.p() && f0Var.I() == z3 && f0Var.I() == j0Var.p.L) {
                    return;
                }
            }
            com.gamericefishpro.space.h2.v0 v0Var = j0Var.p;
            v0Var.N = true;
            v0Var.O = true;
            if (!f0Var.k0 && v0Var.L && z3) {
                if ((f0VarV == null || !f0VarV.p()) && (f0VarV == null || !f0VarV.q())) {
                    t0Var.b.c(f0Var, com.gamericefishpro.space.h2.s.v);
                }
                if (t0Var.d) {
                    return;
                }
                G(null);
                return;
            }
            return;
        }
        com.gamericefishpro.space.a8.c cVar = t0Var.b;
        int iOrdinal2 = j0Var.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    throw new com.gamericefishpro.space.oh.k();
                }
            }
        }
        if ((j0Var.e || j0Var.f) && !z2) {
            return;
        }
        j0Var.f = true;
        j0Var.g = true;
        com.gamericefishpro.space.h2.v0 v0Var2 = j0Var.p;
        v0Var2.N = true;
        v0Var2.O = true;
        if (f0Var.k0) {
            return;
        }
        com.gamericefishpro.space.h2.f0 f0VarV2 = f0Var.v();
        if (Intrinsics.a(f0Var.J(), Boolean.TRUE) && ((f0VarV2 == null || !f0VarV2.a0.e) && (f0VarV2 == null || !f0VarV2.a0.f))) {
            cVar.c(f0Var, com.gamericefishpro.space.h2.s.e);
        } else if (f0Var.I() && ((f0VarV2 == null || !f0VarV2.p()) && (f0VarV2 == null || !f0VarV2.q()))) {
            cVar.c(f0Var, com.gamericefishpro.space.h2.s.v);
        }
        if (t0Var.d) {
            return;
        }
        G(null);
    }

    public final void C() {
        z zVar = this.R;
        zVar.R = true;
        if (zVar.v() && !zVar.c0) {
            zVar.c0 = true;
            zVar.C.post(zVar.e0);
        }
        com.gamericefishpro.space.j1.d dVar = this.S;
        dVar.z = true;
        if (!dVar.g() || dVar.G) {
            return;
        }
        dVar.G = true;
        dVar.B.post(dVar.H);
    }

    public final void D() {
        if (this.w0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.v0) {
            this.v0 = jCurrentAnimationTimeMillis;
            u0 u0Var = this.X0;
            float[] fArr = this.t0;
            u0Var.a(this, fArr);
            f0.l(fArr, this.u0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.s0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.x0 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    public final void E(MotionEvent motionEvent) {
        this.v0 = AnimationUtils.currentAnimationTimeMillis();
        u0 u0Var = this.X0;
        float[] fArr = this.t0;
        u0Var.a(this, fArr);
        f0.l(fArr, this.u0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jQ = com.gamericefishpro.space.o1.o.q(fArr, (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jQ >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jQ & 4294967295L));
        this.x0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    public final boolean F() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void G(com.gamericefishpro.space.h2.f0 f0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (f0Var != null) {
            while (f0Var != null && f0Var.r() == com.gamericefishpro.space.h2.d0.d) {
                if (!this.p0) {
                    com.gamericefishpro.space.h2.f0 f0VarV = f0Var.v();
                    if (f0VarV == null) {
                        break;
                    }
                    long j = f0VarV.Z.c.v;
                    if (com.gamericefishpro.space.c3.a.f(j) && com.gamericefishpro.space.c3.a.e(j)) {
                        break;
                    }
                }
                f0Var = f0Var.v();
            }
            if (f0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long H(long j) {
        D();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.x0 >> 32));
        return com.gamericefishpro.space.o1.o.q(this.u0, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.x0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public final int I(MotionEvent motionEvent) {
        Object obj;
        if (this.Y0) {
            this.Y0 = false;
            int metaState = motionEvent.getMetaState();
            this.I.getClass();
            c2.a.setValue(new com.gamericefishpro.space.b2.x(metaState));
        }
        com.gamericefishpro.space.b2.e eVar = this.d0;
        com.gamericefishpro.space.u6.c cVarC = eVar.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        com.gamericefishpro.space.b2.p pVar = this.e0;
        if (cVarC == null) {
            if (!pVar.a) {
                ((com.gamericefishpro.space.t.q) ((com.gamericefishpro.space.vb.c) pVar.d).e).a();
                ((com.gamericefishpro.space.b2.c) pVar.c).c();
            }
            return 0;
        }
        List list = (List) cVarC.d;
        int size = list.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i = size - 1;
            obj = list.get(size);
            if (((com.gamericefishpro.space.b2.o) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i < 0) {
                obj = null;
                break;
            }
            size = i;
        }
        com.gamericefishpro.space.b2.o oVar = (com.gamericefishpro.space.b2.o) obj;
        if (oVar != null) {
            this.d = oVar.d;
        }
        int iA = pVar.a(cVarC, this, r(motionEvent));
        cVarC.e = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iA & 1) != 0) {
            return iA;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        eVar.c.delete(pointerId);
        eVar.b.delete(pointerId);
        return iA;
    }

    public final void J(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jT = t((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jT >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jT & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        com.gamericefishpro.space.u6.c cVarC = this.d0.c(motionEventObtain, this);
        Intrinsics.b(cVarC);
        this.e0.a(cVarC, this, true);
        motionEventObtain.recycle();
    }

    public final void K(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (Intrinsics.a(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(com.gamericefishpro.space.i.a.a(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) != 0) {
            this.I.getClass();
        }
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration2.fontWeightAdjustment : 0) != (i >= 31 ? configuration.fontWeightAdjustment : 0)) {
            setFontFamilyResolver(com.gamericefishpro.space.u6.f.o(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    public final void L() {
        boolean z;
        int i;
        boolean z2;
        int[] iArr = this.s0;
        getLocationOnScreen(iArr);
        long j = this.r0;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 == i4 && i3 == iArr[1] && this.v0 >= 0) {
            z = false;
        } else {
            this.r0 = (((long) i4) << 32) | (((long) iArr[1]) & 4294967295L);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                getRoot().a0.p.k0();
                z = true;
            }
        }
        D();
        View rootView = this.a1;
        if (rootView == null) {
            rootView = getRootView();
            this.a1 = rootView;
        }
        com.gamericefishpro.space.p2.b rectManager = getRectManager();
        long j2 = this.r0;
        long jD = com.gamericefishpro.space.a.a.D(this.x0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.t0;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = (((fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) ? 1 : 0);
        }
        com.gamericefishpro.space.p2.e eVar = rectManager.b;
        if ((i & 2) != 0) {
            fArr = null;
        }
        if (com.gamericefishpro.space.c3.i.a(jD, eVar.d)) {
            z2 = false;
        } else {
            eVar.d = jD;
            z2 = true;
        }
        if (!com.gamericefishpro.space.c3.i.a(j2, eVar.e)) {
            eVar.e = j2;
            z2 = true;
        }
        if (fArr != null) {
            eVar.g = fArr;
            z2 = true;
        }
        long j3 = (((long) width) << 32) | (((long) height) & 4294967295L);
        if (j3 != eVar.f) {
            eVar.f = j3;
            z2 = true;
        }
        rectManager.e = z2 || rectManager.e;
        this.q0.a(z);
        getRectManager().a();
    }

    public final void M(float f) {
        if (this.E) {
            if (f > 0.0f) {
                if (Float.isNaN(this.Q0) || f > this.Q0) {
                    this.Q0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.R0) || f < this.R0) {
                    this.R0 = f;
                }
            }
        }
    }

    @Override // com.gamericefishpro.space.m1.f
    public final void a(com.gamericefishpro.space.m1.u uVar, com.gamericefishpro.space.m1.u uVar2) {
        com.gamericefishpro.space.h2.a1 a1Var;
        com.gamericefishpro.space.h2.a1 a1Var2;
        if (uVar != null) {
            com.gamericefishpro.space.m1.u uVar3 = uVar;
            if (!uVar3.d.G) {
                com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
            }
            com.gamericefishpro.space.h1.l lVar = uVar3.d;
            com.gamericefishpro.space.h2.f0 f0VarS = com.gamericefishpro.space.h2.k.s(uVar);
            LinkedHashSet linkedHashSet = null;
            ArrayList arrayList = null;
            while (f0VarS != null) {
                if ((f0VarS.Z.f.v & 2097152) != 0) {
                    while (lVar != null) {
                        if ((lVar.i & 2097152) != 0) {
                            com.gamericefishpro.space.h1.l lVarE = lVar;
                            com.gamericefishpro.space.v0.e eVar = null;
                            while (lVarE != null) {
                                if (lVarE instanceof com.gamericefishpro.space.y1.c) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(lVarE);
                                } else if ((lVarE.i & 2097152) != 0 && (lVarE instanceof com.gamericefishpro.space.h2.j)) {
                                    int i = 0;
                                    for (com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) lVarE).I; lVar2 != null; lVar2 = lVar2.y) {
                                        if ((lVar2.i & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                lVarE = lVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                }
                                                if (lVarE != null) {
                                                    eVar.b(lVarE);
                                                    lVarE = null;
                                                }
                                                eVar.b(lVar2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                lVarE = com.gamericefishpro.space.h2.k.e(eVar);
                            }
                        }
                        lVar = lVar.w;
                    }
                }
                f0VarS = f0VarS.v();
                lVar = (f0VarS == null || (a1Var2 = f0VarS.Z) == null) ? null : a1Var2.e;
            }
            if (arrayList == null) {
                return;
            }
            if (uVar2 != null) {
                if (!uVar2.d.G) {
                    com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                }
                com.gamericefishpro.space.h1.l lVar3 = uVar2.d;
                com.gamericefishpro.space.h2.f0 f0VarS2 = com.gamericefishpro.space.h2.k.s(uVar2);
                LinkedHashSet linkedHashSet2 = null;
                while (f0VarS2 != null) {
                    if ((f0VarS2.Z.f.v & 2097152) != 0) {
                        while (lVar3 != null) {
                            if ((lVar3.i & 2097152) != 0) {
                                com.gamericefishpro.space.h1.l lVarE2 = lVar3;
                                com.gamericefishpro.space.v0.e eVar2 = null;
                                while (lVarE2 != null) {
                                    if (lVarE2 instanceof com.gamericefishpro.space.y1.c) {
                                        if (linkedHashSet2 == null) {
                                            linkedHashSet2 = new LinkedHashSet();
                                        }
                                        linkedHashSet2.add(lVarE2);
                                    } else if ((lVarE2.i & 2097152) != 0 && (lVarE2 instanceof com.gamericefishpro.space.h2.j)) {
                                        int i2 = 0;
                                        for (com.gamericefishpro.space.h1.l lVar4 = ((com.gamericefishpro.space.h2.j) lVarE2).I; lVar4 != null; lVar4 = lVar4.y) {
                                            if ((lVar4.i & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    lVarE2 = lVar4;
                                                } else {
                                                    if (eVar2 == null) {
                                                        eVar2 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                    }
                                                    if (lVarE2 != null) {
                                                        eVar2.b(lVarE2);
                                                        lVarE2 = null;
                                                    }
                                                    eVar2.b(lVar4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    lVarE2 = com.gamericefishpro.space.h2.k.e(eVar2);
                                }
                            }
                            lVar3 = lVar3.w;
                        }
                    }
                    f0VarS2 = f0VarS2.v();
                    lVar3 = (f0VarS2 == null || (a1Var = f0VarS2.Z) == null) ? null : a1Var.e;
                }
                linkedHashSet = linkedHashSet2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                com.gamericefishpro.space.y1.c cVar = (com.gamericefishpro.space.y1.c) arrayList.get(i3);
                if (!(linkedHashSet != null ? linkedHashSet.contains(cVar) : false)) {
                    cVar.u();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        com.gamericefishpro.space.m1.u uVar = ((com.gamericefishpro.space.m1.k) getFocusOwner()).c;
        if (!uVar.G) {
            return;
        }
        if (!uVar.d.G) {
            com.gamericefishpro.space.e2.a.b("visitSubtreeIf called on an unattached node");
        }
        com.gamericefishpro.space.v0.e eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
        com.gamericefishpro.space.h1.l lVar = uVar.d;
        com.gamericefishpro.space.h1.l lVar2 = lVar.y;
        if (lVar2 == null) {
            com.gamericefishpro.space.h2.k.b(eVar, lVar);
        } else {
            eVar.b(lVar2);
        }
        while (true) {
            int i3 = eVar.i;
            if (i3 == 0) {
                return;
            }
            com.gamericefishpro.space.h1.l lVar3 = (com.gamericefishpro.space.h1.l) eVar.l(i3 - 1);
            if ((lVar3.v & 1024) != 0) {
                for (com.gamericefishpro.space.h1.l lVar4 = lVar3; lVar4 != null && lVar4.G; lVar4 = lVar4.y) {
                    if ((lVar4.i & 1024) != 0) {
                        com.gamericefishpro.space.h1.l lVarE = lVar4;
                        com.gamericefishpro.space.v0.e eVar2 = null;
                        while (lVarE != null) {
                            int i4 = 0;
                            if (lVarE instanceof com.gamericefishpro.space.m1.u) {
                                com.gamericefishpro.space.m1.u uVar2 = (com.gamericefishpro.space.m1.u) lVarE;
                                if (uVar2.G && uVar2.C0().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    com.gamericefishpro.space.m1.u uVar3 = ((com.gamericefishpro.space.m1.k) getFocusOwner()).c;
                                    if (uVar3.G) {
                                        if (!uVar3.d.G) {
                                            com.gamericefishpro.space.e2.a.b("visitSubtreeIf called on an unattached node");
                                        }
                                        com.gamericefishpro.space.v0.e eVar3 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                        com.gamericefishpro.space.h1.l lVar5 = uVar3.d;
                                        com.gamericefishpro.space.h1.l lVar6 = lVar5.y;
                                        if (lVar6 == null) {
                                            com.gamericefishpro.space.h2.k.b(eVar3, lVar5);
                                        } else {
                                            eVar3.b(lVar6);
                                        }
                                        while (true) {
                                            int i5 = eVar3.i;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            com.gamericefishpro.space.h1.l lVar7 = (com.gamericefishpro.space.h1.l) eVar3.l(i5 - 1);
                                            if ((lVar7.v & 1024) != 0) {
                                                for (com.gamericefishpro.space.h1.l lVar8 = lVar7; lVar8 != null && lVar8.G; lVar8 = lVar8.y) {
                                                    if ((lVar8.i & 1024) != 0) {
                                                        com.gamericefishpro.space.h1.l lVarE2 = lVar8;
                                                        com.gamericefishpro.space.v0.e eVar4 = null;
                                                        while (lVarE2 != null) {
                                                            if (lVarE2 instanceof com.gamericefishpro.space.m1.u) {
                                                                com.gamericefishpro.space.m1.u uVar4 = (com.gamericefishpro.space.m1.u) lVarE2;
                                                                if (uVar4.G) {
                                                                    com.gamericefishpro.space.m1.o oVarC0 = uVar4.C0();
                                                                    if (uVar4.G && !uVar4.H && oVarC0.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((lVarE2.i & 1024) != 0 && (lVarE2 instanceof com.gamericefishpro.space.h2.j)) {
                                                                int i6 = 0;
                                                                for (com.gamericefishpro.space.h1.l lVar9 = ((com.gamericefishpro.space.h2.j) lVarE2).I; lVar9 != null; lVar9 = lVar9.y) {
                                                                    if ((lVar9.i & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            lVarE2 = lVar9;
                                                                        } else {
                                                                            if (eVar4 == null) {
                                                                                eVar4 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                                            }
                                                                            if (lVarE2 != null) {
                                                                                eVar4.b(lVarE2);
                                                                                lVarE2 = null;
                                                                            }
                                                                            eVar4.b(lVar9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            lVarE2 = com.gamericefishpro.space.h2.k.e(eVar4);
                                                        }
                                                    }
                                                }
                                            }
                                            com.gamericefishpro.space.h2.k.b(eVar3, lVar7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((lVarE.i & 1024) != 0 && (lVarE instanceof com.gamericefishpro.space.h2.j)) {
                                for (com.gamericefishpro.space.h1.l lVar10 = ((com.gamericefishpro.space.h2.j) lVarE).I; lVar10 != null; lVar10 = lVar10.y) {
                                    if ((lVar10.i & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            lVarE = lVar10;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                            }
                                            if (lVarE != null) {
                                                eVar2.b(lVarE);
                                                lVarE = null;
                                            }
                                            eVar2.b(lVar10);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            lVarE = com.gamericefishpro.space.h2.k.e(eVar2);
                        }
                    }
                }
            }
            com.gamericefishpro.space.h2.k.b(eVar, lVar3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        com.gamericefishpro.space.o2.l lVarX;
        Function1 function1;
        Function1 function2;
        com.gamericefishpro.space.i1.b bVar = this.h0;
        if (bVar != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                com.gamericefishpro.space.h2.f0 f0Var = (com.gamericefishpro.space.h2.f0) bVar.e.c.b(iKeyAt);
                if (f0Var != null && (lVarX = f0Var.x()) != null) {
                    com.gamericefishpro.space.t.h0 h0Var = lVarX.d;
                    Object objG = h0Var.g(com.gamericefishpro.space.o2.k.g);
                    if (objG == null) {
                        objG = null;
                    }
                    com.gamericefishpro.space.o2.a aVar = (com.gamericefishpro.space.o2.a) objG;
                    if (aVar != null && (function2 = (Function1) aVar.b) != null) {
                    }
                    Object objG2 = h0Var.g(com.gamericefishpro.space.o2.k.h);
                    com.gamericefishpro.space.o2.a aVar2 = (com.gamericefishpro.space.o2.a) (objG2 != null ? objG2 : null);
                    if (aVar2 != null && (function1 = (Function1) aVar2.b) != null) {
                    }
                }
            }
        }
        com.gamericefishpro.space.tb.s sVar = this.g0;
        if (sVar != null) {
            com.gamericefishpro.space.i1.i iVar = (com.gamericefishpro.space.i1.i) sVar.e;
            if (iVar.a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (iVar.a.get(Integer.valueOf(iKeyAt2)) != null) {
                        throw new ClassCastException();
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        Intrinsics.checkNotNullParameter("An operation is not implemented: b/138604541: Add onFill() callback for date", "message");
                        throw new com.gamericefishpro.space.oh.l("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        Intrinsics.checkNotNullParameter("An operation is not implemented: b/138604541: Add onFill() callback for list", "message");
                        throw new com.gamericefishpro.space.oh.l("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        Intrinsics.checkNotNullParameter("An operation is not implemented: b/138604541:  Add onFill() callback for toggle", "message");
                        throw new com.gamericefishpro.space.oh.l("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // com.gamericefishpro.space.z4.f
    public final void b(com.gamericefishpro.space.z4.u uVar) {
        com.gamericefishpro.space.t0.g gVarS;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(f0.j());
        }
        n1 n1Var = this.y;
        if (n1Var != null) {
            m1 m1Var = this.w;
            Intrinsics.b(m1Var);
            com.gamericefishpro.space.vb.c cVar = n1Var.a;
            com.gamericefishpro.space.c1.c cVar2 = (com.gamericefishpro.space.c1.c) cVar.e;
            if (!cVar2.d || cVar2.i) {
                return;
            }
            try {
                gVarS = ((q2) m1Var).a.s(new com.gamericefishpro.space.a2.b(6, n1Var));
            } catch (CancellationException unused) {
                com.gamericefishpro.space.c1.c cVar3 = (com.gamericefishpro.space.c1.c) cVar.e;
                if (!cVar3.e) {
                    if (cVar3.i) {
                        com.gamericefishpro.space.d1.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar3.a();
                    cVar3.i = true;
                }
                gVarS = null;
            }
            com.gamericefishpro.space.t0.g gVar = n1Var.d;
            if (gVar != null) {
                gVar.cancel();
            }
            n1Var.d = gVarS;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.R.m(false, i, this.d);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.R.m(true, i, this.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            o(getRoot());
        }
        u(true);
        com.gamericefishpro.space.f1.p.j().m();
        this.b0 = true;
        com.gamericefishpro.space.o1.r rVar = this.J;
        com.gamericefishpro.space.o1.b bVar = rVar.a;
        Canvas canvas2 = bVar.a;
        bVar.a = canvas;
        getRoot().i(bVar, null);
        rVar.a.a = canvas2;
        com.gamericefishpro.space.t.d0 d0Var = this.W;
        if (d0Var.i()) {
            int i = d0Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((g1) ((com.gamericefishpro.space.h2.n1) d0Var.f(i2))).f();
            }
        }
        int i3 = a2.d;
        d0Var.d();
        this.b0 = false;
        com.gamericefishpro.space.t.d0 d0Var2 = this.a0;
        if (d0Var2 != null) {
            d0Var.b(d0Var2);
            d0Var2.d();
        }
        if (this.E) {
            s0.a(this, this.Q0);
            View view = this.D;
            if (view == null) {
                Intrinsics.h("frameRateCategoryView");
                throw null;
            }
            s0.a(view, this.R0);
            if (!Float.isNaN(this.R0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.Q0 = Float.NaN;
            this.R0 = Float.NaN;
        }
        getRectManager().a();
    }

    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v13 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instruction units count: 1987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.i2.t.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0158  */
    /* JADX WARN: Code duplicated, block: B:68:0x015f A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.U0;
        j jVar = this.T0;
        if (z) {
            removeCallbacks(jVar);
            jVar.run();
        }
        if (!q(motionEvent) && isAttachedToWindow()) {
            z zVar = this.R;
            t tVar = zVar.v;
            AccessibilityManager accessibilityManager = zVar.z;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    tVar.u(true);
                    com.gamericefishpro.space.h2.o oVar = new com.gamericefishpro.space.h2.o();
                    com.gamericefishpro.space.h2.f0 root = tVar.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
                    com.gamericefishpro.space.h2.a1 a1Var = root.Z;
                    com.gamericefishpro.space.h2.f1 f1Var = a1Var.d;
                    com.gamericefishpro.space.o1.h0 h0Var = com.gamericefishpro.space.h2.f1.f0;
                    a1Var.d.P0(com.gamericefishpro.space.h2.f1.i0, f1Var.H0(jFloatToRawIntBits), oVar, 1, true);
                    int iE = com.gamericefishpro.space.ph.x.e(oVar);
                    while (true) {
                        if (-1 < iE) {
                            Object objF = oVar.d.f(iE);
                            Intrinsics.c(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                            com.gamericefishpro.space.h2.f0 f0VarS = com.gamericefishpro.space.h2.k.s((com.gamericefishpro.space.h1.l) objF);
                            if (tVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(f0VarS) == null) {
                                if (f0VarS.Z.d(8)) {
                                    int iA = zVar.A(f0VarS.e);
                                    com.gamericefishpro.space.o2.o oVarA = com.gamericefishpro.space.o2.r.a(f0VarS, false);
                                    if (com.gamericefishpro.space.o2.r.f(oVarA)) {
                                        if (!oVarA.k().d.c(com.gamericefishpro.space.o2.s.z)) {
                                            i = iA;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                iE--;
                            }
                        }
                        i = Integer.MIN_VALUE;
                        break;
                    }
                    tVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i2 = zVar.w;
                    if (i2 != i) {
                        zVar.w = i;
                        z.E(zVar, i, 128, null, 12);
                        z.E(zVar, i2, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i3 = zVar.w;
                    if (i3 == Integer.MIN_VALUE) {
                        tVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i3 != Integer.MIN_VALUE) {
                        zVar.w = Integer.MIN_VALUE;
                        z.E(zVar, Integer.MIN_VALUE, 128, null, 12);
                        z.E(zVar, i3, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && r(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.M0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.M0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.U0 = true;
                        postDelayed(jVar, 8L);
                        return false;
                    }
                } else if ((n(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (s(motionEvent)) {
                if ((n(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((com.gamericefishpro.space.m1.k) getFocusOwner()).d(keyEvent, new com.gamericefishpro.space.b2.b(4, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.I.getClass();
        c2.a.setValue(new com.gamericefishpro.space.b2.x(metaState));
        return ((com.gamericefishpro.space.m1.k) getFocusOwner()).d(keyEvent, com.gamericefishpro.space.m1.g.d) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        com.gamericefishpro.space.h2.a1 a1Var;
        if (isFocused()) {
            com.gamericefishpro.space.m1.k kVar = (com.gamericefishpro.space.m1.k) getFocusOwner();
            if (kVar.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                com.gamericefishpro.space.m1.u uVarV = a4.v(kVar.c);
                if (uVarV != null) {
                    if (!uVarV.d.G) {
                        com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                    }
                    com.gamericefishpro.space.h1.l lVar = uVarV.d;
                    com.gamericefishpro.space.h2.f0 f0VarS = com.gamericefishpro.space.h2.k.s(uVarV);
                    while (f0VarS != null) {
                        if ((f0VarS.Z.f.v & 131072) != 0) {
                            while (lVar != null) {
                                if ((lVar.i & 131072) != 0) {
                                    com.gamericefishpro.space.h1.l lVarE = lVar;
                                    com.gamericefishpro.space.v0.e eVar = null;
                                    while (lVarE != null) {
                                        if ((lVarE.i & 131072) != 0 && (lVarE instanceof com.gamericefishpro.space.h2.j)) {
                                            int i = 0;
                                            for (com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) lVarE).I; lVar2 != null; lVar2 = lVar2.y) {
                                                if ((lVar2.i & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        lVarE = lVar2;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                        }
                                                        if (lVarE != null) {
                                                            eVar.b(lVarE);
                                                            lVarE = null;
                                                        }
                                                        eVar.b(lVar2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        lVarE = com.gamericefishpro.space.h2.k.e(eVar);
                                    }
                                }
                                lVar = lVar.w;
                            }
                        }
                        f0VarS = f0VarS.v();
                        lVar = (f0VarS == null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            a0.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object t0Var;
        com.gamericefishpro.space.m1.u uVarF;
        if (this.U0) {
            j jVar = this.T0;
            removeCallbacks(jVar);
            MotionEvent motionEvent2 = this.M0;
            Intrinsics.b(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.U0 = false;
            } else {
                jVar.run();
            }
        }
        if (!q(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || s(motionEvent))) {
            int iN = n(motionEvent);
            if ((iN & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (t0Var = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    t0Var = new t0(1);
                }
                if (t0Var.equals(new t0(1)) && (uVarF = ((com.gamericefishpro.space.m1.k) getFocusOwner()).f()) != null) {
                    com.gamericefishpro.space.h2.f1 f1VarR = com.gamericefishpro.space.h2.k.r(uVarF);
                    com.gamericefishpro.space.n1.c cVarZ = com.gamericefishpro.space.f2.x.h(f1VarR).z(f1VarR, true);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    if (!((fIntBitsToFloat < cVarZ.c) & (fIntBitsToFloat >= cVarZ.a) & (fIntBitsToFloat2 >= cVarZ.b) & (fIntBitsToFloat2 < cVarZ.d))) {
                        ((com.gamericefishpro.space.m1.k) getFocusOwner()).b(8, false, true);
                    }
                }
            }
            if ((iN & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return k(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        com.gamericefishpro.space.n1.c cVarA;
        if (view == null || this.q0.c) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        Intrinsics.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !f0.a(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            com.gamericefishpro.space.m1.u uVarV = a4.v(((com.gamericefishpro.space.m1.k) getFocusOwner()).c);
            cVarA = uVarV != null ? a4.w(uVarV) : null;
            if (cVarA == null) {
                cVarA = com.gamericefishpro.space.m1.d.a(view, this);
            }
        } else {
            cVarA = com.gamericefishpro.space.m1.d.a(view, this);
        }
        com.gamericefishpro.space.m1.c cVarD = com.gamericefishpro.space.m1.d.d(i);
        int i2 = cVarD != null ? cVarD.a : 6;
        com.gamericefishpro.space.ei.a0 a0Var = new com.gamericefishpro.space.ei.a0();
        if (((com.gamericefishpro.space.m1.k) getFocusOwner()).e(i2, cVarA, new com.gamericefishpro.space.a2.k(a0Var, 1)) == null) {
            return view;
        }
        Object obj = a0Var.d;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || d5.K(a4.w((com.gamericefishpro.space.m1.u) obj), com.gamericefishpro.space.m1.d.a(viewFindNextFocus, this), cVarA, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public final q0 getAndroidViewsHandler$ui() {
        if (this.n0 == null) {
            q0 q0Var = new q0(getContext());
            this.n0 = q0Var;
            addView(q0Var, -1);
            requestLayout();
        }
        q0 q0Var2 = this.n0;
        Intrinsics.b(q0Var2);
        return q0Var2;
    }

    public com.gamericefishpro.space.i1.f getAutofill() {
        return this.g0;
    }

    public com.gamericefishpro.space.i1.h getAutofillManager() {
        return this.h0;
    }

    public com.gamericefishpro.space.i1.i getAutofillTree() {
        return this.V;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.f0.getValue();
    }

    public final com.gamericefishpro.space.j1.d getContentCaptureManager$ui() {
        return this.S;
    }

    public CoroutineContext getCoroutineContext() {
        return this.G;
    }

    public com.gamericefishpro.space.c3.c getDensity() {
        return (com.gamericefishpro.space.c3.c) this.C.getValue();
    }

    public com.gamericefishpro.space.n1.c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            com.gamericefishpro.space.m1.u uVarV = a4.v(((com.gamericefishpro.space.m1.k) getFocusOwner()).c);
            if (uVarV != null) {
                return a4.w(uVarV);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return com.gamericefishpro.space.m1.d.a(viewFindFocus, this);
        }
        return null;
    }

    public com.gamericefishpro.space.m1.h getFocusOwner() {
        return this.F;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        com.gamericefishpro.space.n1.c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (Intrinsics.a(((com.gamericefishpro.space.m1.k) getFocusOwner()).e(6, null, p.e), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public com.gamericefishpro.space.u2.d getFontFamilyResolver() {
        return (com.gamericefishpro.space.u2.d) this.G0.getValue();
    }

    public com.gamericefishpro.space.u2.c getFontLoader() {
        return this.F0;
    }

    public final m1 getFrameEndScheduler$ui() {
        return this.w;
    }

    public com.gamericefishpro.space.o1.v getGraphicsContext() {
        return this.U;
    }

    public com.gamericefishpro.space.w1.a getHapticFeedBack() {
        return this.I0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.q0.b.q() || !this.A.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public com.gamericefishpro.space.x1.b getInputModeManager() {
        return this.J0;
    }

    public final com.gamericefishpro.space.f2.o getInsetsListener() {
        return this.L;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.v0;
    }

    @Override // android.view.View, android.view.ViewParent
    public com.gamericefishpro.space.c3.l getLayoutDirection() {
        return (com.gamericefishpro.space.c3.l) this.H0.getValue();
    }

    public long getMeasureIteration() {
        com.gamericefishpro.space.h2.t0 t0Var = this.q0;
        if (!t0Var.c) {
            com.gamericefishpro.space.e2.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return t0Var.g;
    }

    public com.gamericefishpro.space.g2.b getModifierLocalManager() {
        return this.K0;
    }

    public com.gamericefishpro.space.f2.t0 getPlacementScope() {
        int i = com.gamericefishpro.space.f2.w0.b;
        return new com.gamericefishpro.space.f2.i0(1, this);
    }

    public com.gamericefishpro.space.b2.l getPointerIconService() {
        return this.b1;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final com.gamericefishpro.space.y1.a m3getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.i;
    }

    public com.gamericefishpro.space.p2.b getRectManager() {
        return this.O;
    }

    public com.gamericefishpro.space.c1.d getRetainedValuesStore() {
        return this.z;
    }

    public com.gamericefishpro.space.h2.f0 getRoot() {
        return this.M;
    }

    public com.gamericefishpro.space.h2.v1 getRootForTest() {
        return this.P;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        l1 l1Var;
        if (Build.VERSION.SDK_INT < 31 || (l1Var = this.Z0) == null) {
            return false;
        }
        return ((Boolean) l1Var.a.getValue()).booleanValue();
    }

    public com.gamericefishpro.space.o2.q getSemanticsOwner() {
        return this.Q;
    }

    public com.gamericefishpro.space.h2.h0 getSharedDrawScope() {
        return this.v;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? r0.a.a(this) : this.m0;
    }

    public com.gamericefishpro.space.h2.q1 getSnapshotObserver() {
        return this.l0;
    }

    public t1 getSoftwareKeyboardController() {
        return this.E0;
    }

    public com.gamericefishpro.space.v2.c getTextInputService() {
        return this.C0;
    }

    public u1 getTextToolbar() {
        return this.L0;
    }

    public final com.gamericefishpro.space.h2.u1 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public z1 getViewConfiguration() {
        return this.K;
    }

    public final l getViewTreeOwners() {
        return (l) this.z0.getValue();
    }

    public b2 getWindowInfo() {
        return this.I;
    }

    public final com.gamericefishpro.space.i1.b get_autofillManager$ui() {
        return this.h0;
    }

    @Override // com.gamericefishpro.space.z4.f
    public final void l(com.gamericefishpro.space.z4.u uVar) {
        n1 n1Var = this.y;
        if (n1Var != null) {
            com.gamericefishpro.space.c1.c cVar = (com.gamericefishpro.space.c1.c) n1Var.a.e;
            if (cVar.d && !cVar.i) {
                com.gamericefishpro.space.t0.g gVar = n1Var.d;
                if (gVar != null) {
                    gVar.cancel();
                }
                n1Var.d = null;
                return;
            }
            if (cVar.e) {
                return;
            }
            if (!cVar.i) {
                com.gamericefishpro.space.d1.a.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!cVar.v.i()) {
                com.gamericefishpro.space.d1.a.a("Attempted to start retaining exited values with pending exited values");
            }
            cVar.i = false;
        }
    }

    public final void m(com.gamericefishpro.space.h2.f0 f0Var, boolean z) {
        this.q0.f(f0Var, z);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    public final int n(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        t tVar;
        removeCallbacks(this.S0);
        try {
            E(motionEvent);
            this.w0 = true;
            u(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.M0;
                boolean z = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                com.gamericefishpro.space.b2.p pVar = this.e0;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!pVar.a) {
                                ((com.gamericefishpro.space.t.q) ((com.gamericefishpro.space.vb.c) pVar.d).e).a();
                                ((com.gamericefishpro.space.b2.c) pVar.c).c();
                            }
                        } else if (motionEvent3.getActionMasked() == 10 || !z) {
                            motionEvent2 = motionEvent3;
                        } else {
                            J(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    motionEvent2 = motionEvent3;
                }
                boolean z2 = motionEvent.getToolType(0) == 3;
                if (z || !z2 || actionMasked2 == 3 || actionMasked2 == 9 || !r(motionEvent)) {
                    tVar = this;
                } else {
                    tVar = this;
                    tVar.J(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = tVar.M0;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = tVar.M0;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    com.gamericefishpro.space.b2.e eVar = tVar.d0;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            eVar.c.delete(pointerId);
                            eVar.b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = tVar.M0;
                        float x = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = tVar.M0;
                        boolean z3 = (x == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = tVar.M0;
                        boolean z4 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z3 || z4) {
                            if (pointerId >= 0) {
                                eVar.c.delete(pointerId);
                                eVar.b.delete(pointerId);
                            }
                            com.gamericefishpro.space.b2.c cVar = (com.gamericefishpro.space.b2.c) pVar.c;
                            if (cVar.d) {
                                cVar.d = true;
                            } else {
                                cVar.g.a.g();
                            }
                        }
                    }
                }
                tVar.M0 = MotionEvent.obtainNoHistory(motionEvent);
                int I = I(motionEvent);
                Trace.endSection();
                tVar.w0 = false;
                return I;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.w0 = false;
            throw th3;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        com.gamericefishpro.space.c1.d dVar;
        com.gamericefishpro.space.z4.w wVarG;
        Object obj;
        super.onAttachedToWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(f0.j());
        }
        this.L.onViewAttachedToWindow(this);
        int i2 = 1;
        if (i > 28) {
            if (g1 == null) {
                com.appsflyer.internal.s sVar = new com.appsflyer.internal.s(i2);
                g1 = sVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (c1 == null) {
                        c1 = Class.forName("android.os.SystemProperties");
                    }
                    if (e1 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = c1;
                        e1 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = e1;
                    if (method != null) {
                        method.invoke(null, sVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            com.gamericefishpro.space.t.d0 d0Var = f1;
            synchronized (d0Var) {
                d0Var.a(this);
                Unit unit = Unit.a;
            }
        }
        this.I.a.setValue(Boolean.valueOf(hasWindowFocus()));
        this.I.getClass();
        this.I.getClass();
        p(getRoot());
        o(getRoot());
        getSnapshotObserver().a.d();
        com.gamericefishpro.space.tb.s sVar2 = this.g0;
        if (sVar2 != null) {
            com.gamericefishpro.space.i1.g gVar = com.gamericefishpro.space.i1.g.a;
            gVar.getClass();
            ((AutofillManager) sVar2.i).registerCallback(gVar);
        }
        com.gamericefishpro.space.z4.u uVarE = com.gamericefishpro.space.z4.m0.e(this);
        com.gamericefishpro.space.z5.e eVarB = com.gamericefishpro.space.z5.g.b(this);
        com.gamericefishpro.space.z4.y0 y0VarF = com.gamericefishpro.space.z4.m0.f(this);
        m1 m1Var = this.w;
        if (uVarE == null || y0VarF == null || m1Var == null) {
            dVar = null;
        } else {
            com.gamericefishpro.space.z4.x0 store = y0VarF.f();
            com.gamericefishpro.space.z4.v0 factory = new com.gamericefishpro.space.z4.v0();
            com.gamericefishpro.space.c5.a defaultCreationExtras = com.gamericefishpro.space.c5.a.b;
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(defaultCreationExtras, "extras");
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
            com.gamericefishpro.space.u6.i iVar = new com.gamericefishpro.space.u6.i(store, factory, defaultCreationExtras);
            com.gamericefishpro.space.ei.g modelClass = com.gamericefishpro.space.ei.b0.a(o1.class);
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            String strB = modelClass.b();
            if (strB == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            o1 o1Var = (o1) iVar.d(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            Object parent = getParent();
            Intrinsics.c(parent, "null cannot be cast to non-null type android.view.View");
            int id = ((View) parent).getId();
            com.gamericefishpro.space.t.w wVar = o1Var.b;
            Object objB = wVar.b(id);
            if (objB == null) {
                objB = new com.gamericefishpro.space.t.d0(1);
                wVar.h(id, objB);
            }
            com.gamericefishpro.space.t.d0 d0Var2 = (com.gamericefishpro.space.t.d0) objB;
            Object[] objArr = d0Var2.a;
            int i3 = d0Var2.b;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    obj = null;
                    break;
                }
                obj = objArr[i4];
                if (!((n1) obj).c) {
                    break;
                } else {
                    i4++;
                }
            }
            n1 n1Var = (n1) obj;
            if (n1Var == null) {
                n1Var = new n1();
                d0Var2.a(n1Var);
            }
            n1Var.c = true;
            this.y = n1Var;
            dVar = n1Var.b;
        }
        if (dVar == null) {
            dVar = com.gamericefishpro.space.c1.a.d;
        }
        this.z = dVar;
        l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (uVarE != null && eVarB != null && (uVarE != viewTreeOwners.a || eVarB != viewTreeOwners.b || y0VarF != viewTreeOwners.c))) {
            if (uVarE == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (eVarB == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (wVarG = viewTreeOwners.a.g()) != null) {
                wVarG.f(this);
            }
            uVarE.g().a(this);
            l lVar = new l(uVarE, eVarB, y0VarF);
            set_viewTreeOwners(lVar);
            Function1 function1 = this.A0;
            if (function1 != null) {
                function1.invoke(lVar);
            }
            this.A0 = null;
        }
        this.J0.a.setValue(new com.gamericefishpro.space.x1.a(isInTouchMode() ? 1 : 2));
        l viewTreeOwners2 = getViewTreeOwners();
        com.gamericefishpro.space.z4.w wVarG2 = viewTreeOwners2 != null ? viewTreeOwners2.a.g() : null;
        if (wVarG2 == null) {
            throw com.gamericefishpro.space.m5.a.e("No lifecycle owner exists");
        }
        wVarG2.a(this);
        wVarG2.a(this.S);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            d0.a.b(this);
        }
        com.gamericefishpro.space.i1.b bVar = this.h0;
        if (bVar != null) {
            ((com.gamericefishpro.space.m1.k) getFocusOwner()).g.a(bVar);
            getSemanticsOwner().d.a(bVar);
        }
        ((com.gamericefishpro.space.m1.k) getFocusOwner()).g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.D0.get() != null) {
            throw new ClassCastException();
        }
        this.B0.getClass();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        K(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.D0.get() != null) {
            throw new ClassCastException();
        }
        this.B0.getClass();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        com.gamericefishpro.space.o2.o oVar;
        String strA;
        com.gamericefishpro.space.j1.d dVar = this.S;
        dVar.getClass();
        for (long j : jArr) {
            com.gamericefishpro.space.o2.p pVar = (com.gamericefishpro.space.o2.p) dVar.f().b((int) j);
            if (pVar != null && (oVar = pVar.a) != null) {
                com.gamericefishpro.space.a4.b.u();
                ViewTranslationRequest.Builder builderP = com.gamericefishpro.space.a4.b.p(dVar.d.getAutofillId(), oVar.g);
                Object objG = oVar.d.d.g(com.gamericefishpro.space.o2.s.A);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null && (strA = com.gamericefishpro.space.e3.a.a(list, "\n", null, 62)) != null) {
                    builderP.setValue("android:text", TranslationRequestValue.forText(new com.gamericefishpro.space.r2.e(strA)));
                    consumer.accept(builderP.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L.onViewDetachedFromWindow(this);
        if (this.E) {
            View view = this.D;
            if (view == null) {
                Intrinsics.h("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        if (Build.VERSION.SDK_INT > 28) {
            com.gamericefishpro.space.t.d0 d0Var = f1;
            synchronized (d0Var) {
                d0Var.j(this);
                Unit unit = Unit.a;
            }
        }
        com.gamericefishpro.space.h2.q1 snapshotObserver = getSnapshotObserver();
        com.gamericefishpro.space.a8.b bVar = snapshotObserver.a.h;
        if (bVar != null) {
            bVar.e();
        }
        com.gamericefishpro.space.f1.y yVar = snapshotObserver.a;
        synchronized (yVar.g) {
            try {
                com.gamericefishpro.space.v0.e eVar = yVar.f;
                Object[] objArr = eVar.d;
                int i = eVar.i;
                for (int i2 = 0; i2 < i; i2++) {
                    com.gamericefishpro.space.f1.x xVar = (com.gamericefishpro.space.f1.x) objArr[i2];
                    xVar.e.a();
                    xVar.f.a();
                    xVar.l.a();
                    xVar.m.clear();
                }
                Unit unit2 = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.I.getClass();
        l viewTreeOwners = getViewTreeOwners();
        com.gamericefishpro.space.z4.w wVarG = viewTreeOwners != null ? viewTreeOwners.a.g() : null;
        if (wVarG == null) {
            throw com.gamericefishpro.space.m5.a.e("No lifecycle owner exists");
        }
        wVarG.f(this.S);
        wVarG.f(this);
        com.gamericefishpro.space.tb.s sVar = this.g0;
        if (sVar != null) {
            com.gamericefishpro.space.i1.g gVar = com.gamericefishpro.space.i1.g.a;
            gVar.getClass();
            ((AutofillManager) sVar.i).unregisterCallback(gVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        n1 n1Var = this.y;
        if (n1Var != null) {
            n1Var.c = false;
        }
        this.y = null;
        if (Build.VERSION.SDK_INT >= 31) {
            d0.a.a(this);
        }
        com.gamericefishpro.space.i1.b bVar2 = this.h0;
        if (bVar2 != null) {
            getSemanticsOwner().d.j(bVar2);
            ((com.gamericefishpro.space.m1.k) getFocusOwner()).g.j(bVar2);
        }
        com.gamericefishpro.space.p2.b rectManager = getRectManager();
        com.gamericefishpro.space.f3.a aVar = rectManager.g;
        if (aVar != null) {
            com.gamericefishpro.space.h1.a.a.removeCallbacks(aVar);
            rectManager.g = null;
        }
        ((com.gamericefishpro.space.m1.k) getFocusOwner()).g.j(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        com.gamericefishpro.space.m1.k kVar = (com.gamericefishpro.space.m1.k) getFocusOwner();
        y3.p(kVar.c, true);
        if (kVar.f() != null) {
            com.gamericefishpro.space.m1.u uVarF = kVar.f();
            kVar.h(null);
            if (uVarF != null) {
                uVarF.B0(com.gamericefishpro.space.m1.s.d, com.gamericefishpro.space.m1.s.i);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.v0 = 0L;
        L();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        K(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.v0 = 0L;
        this.q0.j(this.W0);
        this.o0 = null;
        L();
        if (this.n0 != null) {
            getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        com.gamericefishpro.space.h2.t0 t0Var = this.q0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                p(getRoot());
            }
            long jI = i(i);
            com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
            long jI2 = i(i2);
            long jX = d5.x((int) (jI >>> 32), (int) (jI & 4294967295L), (int) (jI2 >>> 32), (int) (4294967295L & jI2));
            com.gamericefishpro.space.c3.a aVar = this.o0;
            if (aVar == null) {
                this.o0 = new com.gamericefishpro.space.c3.a(jX);
                this.p0 = false;
            } else if (!com.gamericefishpro.space.c3.a.b(aVar.a, jX)) {
                this.p0 = true;
            }
            t0Var.q(jX);
            t0Var.l();
            setMeasuredDimension(getRoot().a0.p.d, getRoot().a0.p.e);
            if (this.n0 != null) {
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().a0.p.d, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().a0.p.e, 1073741824));
            }
            Unit unit = Unit.a;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure != null) {
            com.gamericefishpro.space.i1.b bVar = this.h0;
            if (bVar != null) {
                com.gamericefishpro.space.h2.f0 f0Var = bVar.e.a;
                AutofillId autofillId = bVar.y;
                String str = bVar.w;
                com.gamericefishpro.space.p2.b bVar2 = bVar.v;
                com.gamericefishpro.space.u6.f.J(viewStructure, f0Var, autofillId, str, bVar2);
                Object[] objArr = com.gamericefishpro.space.t.n0.a;
                com.gamericefishpro.space.t.d0 d0Var = new com.gamericefishpro.space.t.d0(2);
                d0Var.a(f0Var);
                d0Var.a(viewStructure);
                while (d0Var.i()) {
                    Object objK = d0Var.k(d0Var.b - 1);
                    Intrinsics.c(objK, "null cannot be cast to non-null type android.view.ViewStructure");
                    ViewStructure viewStructure2 = (ViewStructure) objK;
                    Object objK2 = d0Var.k(d0Var.b - 1);
                    Intrinsics.c(objK2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
                    com.gamericefishpro.space.v0.b bVar3 = (com.gamericefishpro.space.v0.b) ((com.gamericefishpro.space.h2.f0) objK2).n();
                    int i2 = bVar3.d.i;
                    for (int i3 = 0; i3 < i2; i3++) {
                        com.gamericefishpro.space.h2.f0 f0Var2 = (com.gamericefishpro.space.h2.f0) bVar3.get(i3);
                        if (!f0Var2.k0 && f0Var2.H() && f0Var2.I()) {
                            com.gamericefishpro.space.o2.l lVarX = f0Var2.x();
                            if (lVarX != null) {
                                com.gamericefishpro.space.t.h0 h0Var = lVarX.d;
                                if (h0Var.b(com.gamericefishpro.space.o2.k.g) || h0Var.b(com.gamericefishpro.space.o2.k.h) || h0Var.b(com.gamericefishpro.space.o2.s.q) || h0Var.b(com.gamericefishpro.space.o2.s.r)) {
                                    ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    com.gamericefishpro.space.u6.f.J(viewStructureNewChild, f0Var2, autofillId, str, bVar2);
                                    d0Var.a(f0Var2);
                                    d0Var.a(viewStructureNewChild);
                                } else {
                                    d0Var.a(f0Var2);
                                    d0Var.a(viewStructure2);
                                }
                            } else {
                                d0Var.a(f0Var2);
                                d0Var.a(viewStructure2);
                            }
                        }
                    }
                }
            }
            com.gamericefishpro.space.tb.s sVar = this.g0;
            if (sVar != null) {
                com.gamericefishpro.space.i1.i iVar = (com.gamericefishpro.space.i1.i) sVar.e;
                LinkedHashMap linkedHashMap = iVar.a;
                LinkedHashMap linkedHashMap2 = iVar.a;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    if (entry.getValue() != null) {
                        throw new ClassCastException();
                    }
                    ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                    viewStructureNewChild2.setAutofillId((AutofillId) sVar.v, iIntValue);
                    viewStructureNewChild2.setId(iIntValue, ((t) sVar.d).getContext().getPackageName(), null, null);
                    viewStructureNewChild2.setAutofillType(1);
                    throw null;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        int toolType = motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && (toolType == 2 || toolType == 4)) {
            getPointerIconService().getClass();
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        com.gamericefishpro.space.c3.l lVar;
        if (this.e) {
            int[] iArr = com.gamericefishpro.space.m1.d.a;
            if (i != 0) {
                lVar = i != 1 ? null : com.gamericefishpro.space.c3.l.e;
            } else {
                lVar = com.gamericefishpro.space.c3.l.d;
            }
            if (lVar == null) {
                lVar = com.gamericefishpro.space.c3.l.d;
            }
            setLayoutDirection(lVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        l1 l1Var;
        if (Build.VERSION.SDK_INT >= 31 && (l1Var = this.Z0) != null) {
            com.gamericefishpro.space.o2.q semanticsOwner = getSemanticsOwner();
            CoroutineContext coroutineContext = getCoroutineContext();
            com.gamericefishpro.space.v0.e eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.n2.i[16]);
            com.gamericefishpro.space.a.a.H(semanticsOwner.a(), 0, new com.gamericefishpro.space.n2.h(1, 8, com.gamericefishpro.space.v0.e.class, eVar, "add", "add(Ljava/lang/Object;)Z"));
            Function1[] selectors = {com.gamericefishpro.space.n2.b.i, com.gamericefishpro.space.n2.b.v};
            Intrinsics.checkNotNullParameter(selectors, "selectors");
            com.gamericefishpro.space.ph.u.m(eVar.d, new com.gamericefishpro.space.o2.x(1, selectors), 0, eVar.i);
            int i = eVar.i;
            com.gamericefishpro.space.n2.i iVar = (com.gamericefishpro.space.n2.i) (i == 0 ? null : eVar.d[i - 1]);
            if (iVar != null) {
                com.gamericefishpro.space.c3.j jVar = iVar.c;
                com.gamericefishpro.space.n2.c cVar = new com.gamericefishpro.space.n2.c(iVar.a, jVar, com.gamericefishpro.space.pi.a0.b(coroutineContext), l1Var, this);
                com.gamericefishpro.space.h2.f1 f1Var = iVar.d;
                com.gamericefishpro.space.n1.c cVarZ = com.gamericefishpro.space.f2.x.h(f1Var).z(f1Var, true);
                long j = (((long) jVar.a) << 32) | (((long) jVar.b) & 4294967295L);
                ScrollCaptureTarget scrollCaptureTargetK = com.gamericefishpro.space.a4.b.k(this, com.gamericefishpro.space.o1.o.w(com.gamericefishpro.space.b9.a.D(cVarZ)), new Point((int) (j >> 32), (int) (j & 4294967295L)), cVar);
                scrollCaptureTargetK.setScrollBounds(com.gamericefishpro.space.o1.o.w(jVar));
                consumer.accept(scrollCaptureTargetK);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        L();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        this.J0.a.setValue(new com.gamericefishpro.space.x1.a(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        com.gamericefishpro.space.j1.d dVar = this.S;
        dVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (Intrinsics.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            com.gamericefishpro.space.d9.h.s(dVar, longSparseArray);
        } else {
            dVar.d.post(new com.gamericefishpro.space.bb.h(6, dVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zJ;
        this.I.a.setValue(Boolean.valueOf(z));
        this.Y0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zJ = f0.j())) {
            return;
        }
        setShowLayoutBounds(zJ);
        o(getRoot());
    }

    public final void p(com.gamericefishpro.space.h2.f0 f0Var) {
        this.q0.p(f0Var, false);
        com.gamericefishpro.space.v0.e eVarZ = f0Var.z();
        Object[] objArr = eVarZ.d;
        int i = eVarZ.i;
        for (int i2 = 0; i2 < i; i2++) {
            p((com.gamericefishpro.space.h2.f0) objArr[i2]);
        }
    }

    public final boolean r(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (!isFocused()) {
            com.gamericefishpro.space.m1.c cVarD = com.gamericefishpro.space.m1.d.d(i);
            int i2 = cVarD != null ? cVarD.a : 7;
            Boolean boolE = ((com.gamericefishpro.space.m1.k) getFocusOwner()).e(i2, rect != null ? com.gamericefishpro.space.o1.o.A(rect) : null, new q(i2, 0));
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.a(boolE, bool)) {
                if (!Intrinsics.a(((com.gamericefishpro.space.m1.k) getFocusOwner()).e(i2, null, new q(i2, 1)), bool)) {
                    if (!hasFocus()) {
                        return false;
                    }
                    if (i2 == 1 || i2 == 2) {
                        return ((com.gamericefishpro.space.m1.k) getFocusOwner()).g(i2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean s(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.M0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.R.A = j;
    }

    public final void setConfiguration(Configuration configuration) {
        this.f0.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(com.gamericefishpro.space.j1.d dVar) {
        this.S = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public void setCoroutineContext(CoroutineContext coroutineContext) {
        this.G = coroutineContext;
        com.gamericefishpro.space.h1.l lVar = getRoot().Z.f;
        if (lVar instanceof com.gamericefishpro.space.b2.f0) {
            ((com.gamericefishpro.space.b2.f0) lVar).B0();
        }
        if (!lVar.d.G) {
            com.gamericefishpro.space.e2.a.b("visitSubtreeIf called on an unattached node");
        }
        com.gamericefishpro.space.v0.e eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
        com.gamericefishpro.space.h1.l lVar2 = lVar.d;
        com.gamericefishpro.space.h1.l lVar3 = lVar2.y;
        if (lVar3 == null) {
            com.gamericefishpro.space.h2.k.b(eVar, lVar2);
        } else {
            eVar.b(lVar3);
        }
        while (true) {
            int i = eVar.i;
            if (i == 0) {
                return;
            }
            com.gamericefishpro.space.h1.l lVar4 = (com.gamericefishpro.space.h1.l) eVar.l(i - 1);
            if ((lVar4.v & 16) != 0) {
                for (com.gamericefishpro.space.h1.l lVar5 = lVar4; lVar5 != null && lVar5.G; lVar5 = lVar5.y) {
                    if ((lVar5.i & 16) != 0) {
                        ?? E = lVar5;
                        ?? eVar2 = 0;
                        while (E != 0) {
                            if (E instanceof com.gamericefishpro.space.h2.t1) {
                                com.gamericefishpro.space.h2.t1 t1Var = (com.gamericefishpro.space.h2.t1) E;
                                if (t1Var instanceof com.gamericefishpro.space.b2.f0) {
                                    ((com.gamericefishpro.space.b2.f0) t1Var).B0();
                                }
                            } else if ((E.i & 16) != 0 && (E instanceof com.gamericefishpro.space.h2.j)) {
                                com.gamericefishpro.space.h1.l lVar6 = ((com.gamericefishpro.space.h2.j) E).I;
                                int i2 = 0;
                                E = E;
                                eVar2 = eVar2;
                                while (lVar6 != null) {
                                    if ((lVar6.i & 16) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            eVar2 = eVar2;
                                            E = lVar6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                            }
                                            if (E != 0) {
                                                eVar2.b(E);
                                                E = 0;
                                            }
                                            eVar2.b(lVar6);
                                        }
                                    }
                                    lVar6 = lVar6.y;
                                    E = E;
                                    eVar2 = eVar2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            E = com.gamericefishpro.space.h2.k.e(eVar2);
                        }
                    }
                }
            }
            com.gamericefishpro.space.h2.k.b(eVar, lVar4);
        }
    }

    public final void setFrameEndScheduler$ui(m1 m1Var) {
        this.w = m1Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.v0 = j;
    }

    public final void setOnViewTreeOwnersAvailable(Function1<? super l, Unit> function1) {
        l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            function1.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.A0 = function1;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m4setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(com.gamericefishpro.space.y1.a aVar) {
        this.i = aVar;
    }

    public void setShowLayoutBounds(boolean z) {
        this.m0 = z;
    }

    public void setUncaughtExceptionHandler(com.gamericefishpro.space.h2.u1 u1Var) {
        this.q0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final long t(long j) {
        D();
        long jQ = com.gamericefishpro.space.o1.o.q(this.t0, j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.x0 >> 32)) + Float.intBitsToFloat((int) (jQ >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.x0 & 4294967295L)) + Float.intBitsToFloat((int) (jQ & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void u(boolean z) {
        r rVar;
        com.gamericefishpro.space.h2.t0 t0Var = this.q0;
        if (t0Var.b.q() || ((com.gamericefishpro.space.v0.e) t0Var.e.d).i != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    rVar = this.W0;
                } finally {
                    Trace.endSection();
                }
            } else {
                rVar = null;
            }
            if (t0Var.j(rVar)) {
                requestLayout();
            }
            t0Var.a(false);
            if (this.c0) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.c0 = false;
            }
            Unit unit = Unit.a;
        }
    }

    public final void v(com.gamericefishpro.space.h2.f0 f0Var, long j) {
        com.gamericefishpro.space.h2.t0 t0Var = this.q0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            t0Var.k(f0Var, j);
            if (!t0Var.b.q()) {
                t0Var.a(false);
                if (this.c0) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.c0 = false;
                }
            }
            getRectManager().a();
            Unit unit = Unit.a;
        } finally {
            Trace.endSection();
        }
    }

    public final boolean w(int i) {
        if (i == 7 || i == 8) {
            return false;
        }
        Integer numC = com.gamericefishpro.space.m1.d.c(i);
        if (numC == null) {
            throw com.gamericefishpro.space.m5.a.e("Invalid focus direction");
        }
        int iIntValue = numC.intValue();
        com.gamericefishpro.space.m1.u uVarF = ((com.gamericefishpro.space.m1.k) getFocusOwner()).f();
        if (uVarF == null) {
            throw new IllegalStateException("findNextViewInEmbeddedView called when owner does not have anything focused.");
        }
        Integer numC2 = com.gamericefishpro.space.m1.d.c(i);
        if (numC2 == null) {
            throw com.gamericefishpro.space.m5.a.e("Invalid focus direction");
        }
        int iIntValue2 = numC2.intValue();
        com.gamericefishpro.space.f3.z zVar = com.gamericefishpro.space.h2.k.s(uVarF).I;
        View interopView = zVar != null ? zVar.getInteropView() : null;
        View viewFindFocus = findFocus();
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = getRootView();
        Intrinsics.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
        if (viewFindNextFocus == null || interopView == null || !f0.a(interopView, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (viewFindNextFocus != null) {
            return com.gamericefishpro.space.m1.d.b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
        }
        return false;
    }

    public final void x(com.gamericefishpro.space.h2.n1 n1Var, boolean z) {
        com.gamericefishpro.space.t.d0 d0Var = this.W;
        if (!z) {
            if (this.b0) {
                return;
            }
            d0Var.j(n1Var);
            com.gamericefishpro.space.t.d0 d0Var2 = this.a0;
            if (d0Var2 != null) {
                d0Var2.j(n1Var);
                return;
            }
            return;
        }
        if (!this.b0) {
            d0Var.a(n1Var);
            return;
        }
        com.gamericefishpro.space.t.d0 d0Var3 = this.a0;
        if (d0Var3 == null) {
            d0Var3 = new com.gamericefishpro.space.t.d0();
            this.a0 = d0Var3;
        }
        d0Var3.a(n1Var);
    }

    public final void y() {
        if (this.i0) {
            com.gamericefishpro.space.f1.y yVar = getSnapshotObserver().a;
            synchronized (yVar.g) {
                try {
                    com.gamericefishpro.space.v0.e eVar = yVar.f;
                    int i = eVar.i;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        com.gamericefishpro.space.f1.x xVar = (com.gamericefishpro.space.f1.x) eVar.d[i3];
                        xVar.d();
                        if (!xVar.f.j()) {
                            i2++;
                        } else if (i2 > 0) {
                            Object[] objArr = eVar.d;
                            objArr[i3 - i2] = objArr[i3];
                        }
                    }
                    Object[] objArr2 = eVar.d;
                    int i4 = i - i2;
                    Intrinsics.checkNotNullParameter(objArr2, "<this>");
                    Arrays.fill(objArr2, i4, i, (Object) null);
                    eVar.i = i4;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.i0 = false;
        }
        q0 q0Var = this.n0;
        if (q0Var != null) {
            h(q0Var);
        }
        com.gamericefishpro.space.i1.b bVar = this.h0;
        if (bVar != null) {
            com.gamericefishpro.space.t.x xVar2 = bVar.z;
            if (xVar2.d == 0 && bVar.A) {
                ((AutofillManager) bVar.d.e).commit();
                bVar.A = false;
            }
            if (xVar2.d != 0) {
                bVar.A = true;
            }
        }
        while (this.P0.i() && this.P0.f(0) != null) {
            int i5 = this.P0.b;
            for (int i6 = 0; i6 < i5; i6++) {
                Function0 function0 = (Function0) this.P0.f(i6);
                com.gamericefishpro.space.t.d0 d0Var = this.P0;
                if (i6 < 0 || i6 >= d0Var.b) {
                    d0Var.n(i6);
                    throw null;
                }
                Object[] objArr3 = d0Var.a;
                Object obj = objArr3[i6];
                objArr3[i6] = null;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.P0.l(0, i5);
        }
    }

    public final void z(com.gamericefishpro.space.h2.f0 f0Var) {
        z zVar = this.R;
        zVar.R = true;
        if (zVar.v()) {
            zVar.w(f0Var);
        }
        com.gamericefishpro.space.j1.d dVar = this.S;
        dVar.z = true;
        if (dVar.g()) {
            dVar.A.k(Unit.a);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        Intrinsics.b(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    public g getAccessibilityManager() {
        return this.T;
    }

    /* JADX INFO: renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public h m6getClipboard() {
        return this.k0;
    }

    /* JADX INFO: renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public i m7getClipboardManager() {
        return this.j0;
    }

    /* JADX INFO: renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public com.gamericefishpro.space.k1.b m8getDragAndDropManager() {
        return this.H;
    }

    public com.gamericefishpro.space.t.w getLayoutNodes() {
        return this.N;
    }

    public t getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        Unit unit = Unit.a;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @com.gamericefishpro.space.oh.a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m2getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @com.gamericefishpro.space.oh.a
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(com.gamericefishpro.space.h2.u1 u1Var) {
    }
}
