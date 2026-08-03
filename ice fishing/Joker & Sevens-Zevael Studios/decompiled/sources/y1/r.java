package y1;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
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
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import org.fortheloss.st.R;
import y0.m;
import y1.q0;
import y1.r;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r extends ViewGroup implements x1.m1, x1.t1, androidx.lifecycle.f, x1.k1 {
    public static Class L0;
    public static Method M0;
    public static Method N0;
    public static final s.a0 O0 = new s.a0();
    public static c6.a P0;
    public final g A;
    public float A0;
    public final f1.f B;
    public float B0;
    public final z0.j C;
    public final b4.g C0;
    public final ArrayList D;
    public final a1.a D0;
    public ArrayList E;
    public boolean E0;
    public boolean F;
    public final q F0;
    public final r1.d G;
    public final r0 G0;
    public final a0.u H;
    public boolean H0;
    public oc.c I;
    public final d2.j I0;
    public final x4.n J;
    public View J0;
    public final z0.b K;
    public final g1 K0;
    public boolean L;
    public final i M;
    public final h N;
    public final x1.o1 O;
    public boolean P;
    public n0 Q;
    public s2.a R;
    public boolean S;
    public final x1.v0 T;
    public long U;
    public final int[] V;
    public final float[] W;

    /* renamed from: a0, reason: collision with root package name */
    public final float[] f8601a0;

    /* renamed from: b0, reason: collision with root package name */
    public long f8602b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f8603c0;

    /* renamed from: d0, reason: collision with root package name */
    public long f8604d0;

    /* renamed from: e0, reason: collision with root package name */
    public final m0.l1 f8605e0;

    /* renamed from: f0, reason: collision with root package name */
    public final m0.i0 f8606f0;

    /* renamed from: g, reason: collision with root package name */
    public long f8607g;

    /* renamed from: g0, reason: collision with root package name */
    public oc.c f8608g0;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8609h;
    public final j h0;

    /* renamed from: i, reason: collision with root package name */
    public final x1.i0 f8610i;

    /* renamed from: i0, reason: collision with root package name */
    public final k f8611i0;

    /* renamed from: j, reason: collision with root package name */
    public final m0.l1 f8612j;

    /* renamed from: j0, reason: collision with root package name */
    public final l f8613j0;

    /* renamed from: k, reason: collision with root package name */
    public final View f8614k;

    /* renamed from: k0, reason: collision with root package name */
    public final x4.s f8615k0;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8616l;

    /* renamed from: l0, reason: collision with root package name */
    public final l2.c f8617l0;

    /* renamed from: m, reason: collision with root package name */
    public final d1.i f8618m;

    /* renamed from: m0, reason: collision with root package name */
    public final AtomicReference f8619m0;

    /* renamed from: n, reason: collision with root package name */
    public fc.i f8620n;

    /* renamed from: n0, reason: collision with root package name */
    public final g1 f8621n0;

    /* renamed from: o, reason: collision with root package name */
    public final b1.a f8622o;

    /* renamed from: o0, reason: collision with root package name */
    public final g1 f8623o0;

    /* renamed from: p, reason: collision with root package name */
    public final d2.j f8624p;

    /* renamed from: p0, reason: collision with root package name */
    public final m0.l1 f8625p0;

    /* renamed from: q, reason: collision with root package name */
    public final f1.p f8626q;

    /* renamed from: q0, reason: collision with root package name */
    public int f8627q0;

    /* renamed from: r, reason: collision with root package name */
    public final m0 f8628r;

    /* renamed from: r0, reason: collision with root package name */
    public final m0.l1 f8629r0;

    /* renamed from: s, reason: collision with root package name */
    public final v1.o f8630s;

    /* renamed from: s0, reason: collision with root package name */
    public final n1.b f8631s0;

    /* renamed from: t, reason: collision with root package name */
    public final x1.g0 f8632t;

    /* renamed from: t0, reason: collision with root package name */
    public final o1.c f8633t0;

    /* renamed from: u, reason: collision with root package name */
    public final s.u f8634u;

    /* renamed from: u0, reason: collision with root package name */
    public final w1.c f8635u0;

    /* renamed from: v, reason: collision with root package name */
    public final f2.a f8636v;

    /* renamed from: v0, reason: collision with root package name */
    public final g1 f8637v0;

    /* renamed from: w, reason: collision with root package name */
    public final r f8638w;

    /* renamed from: w0, reason: collision with root package name */
    public MotionEvent f8639w0;

    /* renamed from: x, reason: collision with root package name */
    public final e2.p f8640x;

    /* renamed from: x0, reason: collision with root package name */
    public long f8641x0;

    /* renamed from: y, reason: collision with root package name */
    public final y f8642y;

    /* renamed from: y0, reason: collision with root package name */
    public final x4.e f8643y0;

    /* renamed from: z, reason: collision with root package name */
    public a1.h f8644z;

    /* renamed from: z0, reason: collision with root package name */
    public final s.a0 f8645z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [y1.j] */
    /* JADX WARN: Type inference failed for: r3v17, types: [y1.k] */
    /* JADX WARN: Type inference failed for: r3v18, types: [y1.l] */
    public r(Context context, fc.i iVar) {
        super(context);
        s0 s0Var;
        this.f8607g = 9205357640488583168L;
        int i10 = 1;
        this.f8609h = true;
        this.f8610i = new x1.i0();
        s2.e b2 = i7.b.b(context);
        m0.z0 z0Var = m0.z0.f4842j;
        this.f8612j = new m0.l1(b2, z0Var);
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        boolean z10 = i11 >= 35;
        this.f8616l = z10;
        e2.d dVar = new e2.d();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dVar);
        x1.y0 y0Var = new x1.y0() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // x1.y0
            public final m f() {
                return new q0();
            }

            @Override // x1.y0
            public final void g(m mVar) {
                ((q0) mVar).getClass();
            }

            public final int hashCode() {
                return r.this.hashCode();
            }
        };
        this.f8618m = new d1.i(this, this);
        this.f8620n = iVar;
        this.f8622o = new b1.a();
        this.f8624p = new d2.j(1);
        y0.n a6 = androidx.compose.ui.input.key.a.a(new p(this, i12));
        y0.n a8 = androidx.compose.ui.input.rotary.a.a();
        this.f8626q = new f1.p();
        this.f8628r = new m0(ViewConfiguration.get(context));
        v1.o oVar = new v1.o();
        this.f8630s = oVar;
        x1.g0 g0Var = new x1.g0(3);
        v1.e0 e0Var = g0Var.A;
        v1.m0 m0Var = v1.m0.f7100a;
        if (!pc.j.a(e0Var, m0Var)) {
            g0Var.A = m0Var;
            g0Var.C();
        }
        g0Var.X(getDensity());
        g0Var.b0(getViewConfiguration());
        g0Var.a0(androidx.compose.ui.layout.b.b(oVar).d(emptySemanticsElement).d(a8).d(a6).d(((d1.i) getFocusOwner()).f1580e).d(m52getDragAndDropManager().f940c).d(y0Var));
        this.f8632t = g0Var;
        s.u uVar = s.l.f6301a;
        this.f8634u = new s.u();
        getLayoutNodes();
        this.f8636v = new f2.a();
        this.f8638w = this;
        this.f8640x = new e2.p(getRoot(), dVar, getLayoutNodes());
        y yVar = new y(this);
        this.f8642y = yVar;
        this.f8644z = new a1.h(this, new d.x(0, this, e0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 0, 3));
        g gVar = new g();
        Object systemService = context.getSystemService("accessibility");
        pc.j.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.A = gVar;
        this.B = new f1.f(this);
        this.C = new z0.j();
        this.D = new ArrayList();
        this.G = new r1.d();
        x1.g0 root = getRoot();
        a0.u uVar2 = new a0.u();
        uVar2.f136b = root;
        uVar2.f137c = new r1.c(root.I.f7988c);
        uVar2.f138d = new m7.g(12);
        uVar2.f139e = new x1.q();
        this.H = uVar2;
        this.I = n.f8585h;
        this.J = new x4.n(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw a4.d.e("Autofill service could not be located.");
        }
        this.K = new z0.b(new m7.g(23, autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.M = new i(context);
        m51getClipboardManager();
        this.N = new h();
        this.O = new x1.o1(new p(this, i10));
        this.T = new x1.v0(getRoot());
        long j3 = Integer.MAX_VALUE;
        this.U = (j3 & 4294967295L) | (j3 << 32);
        this.V = new int[]{0, 0};
        float[] i13 = f1.d0.i();
        this.W = f1.d0.i();
        this.f8601a0 = f1.d0.i();
        this.f8602b0 = -1L;
        this.f8604d0 = 9187343241974906880L;
        this.f8605e0 = m0.z.s(null);
        this.f8606f0 = m0.z.n(new q(this, i10));
        this.h0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: y1.j
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                r.this.I();
            }
        };
        this.f8611i0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: y1.k
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                r.this.I();
            }
        };
        this.f8613j0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: y1.l
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z11) {
                r.this.f8633t0.f5150a.setValue(new o1.a(z11 ? 1 : 2));
            }
        };
        this.f8615k0 = new x4.s(getView(), this);
        l2.c cVar = new l2.c();
        new AtomicReference(null);
        this.f8617l0 = cVar;
        this.f8619m0 = new AtomicReference(null);
        getTextInputService();
        this.f8621n0 = new g1();
        this.f8623o0 = new g1();
        this.f8625p0 = new m0.l1(x4.f.H(context), z0Var);
        this.f8627q0 = i11 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        s2.l lVar = s2.l.f6396g;
        s2.l lVar2 = layoutDirection != 0 ? layoutDirection != 1 ? null : s2.l.f6397h : lVar;
        this.f8629r0 = m0.z.s(lVar2 != null ? lVar2 : lVar);
        this.f8631s0 = new n1.b();
        this.f8633t0 = new o1.c(isInTouchMode() ? 1 : 2);
        this.f8635u0 = new w1.c(this);
        this.f8637v0 = new g1();
        this.f8643y0 = new x4.e(11);
        this.f8645z0 = new s.a0();
        this.C0 = new b4.g(16, this);
        this.D0 = new a1.a(13, this);
        this.F0 = new q(this, 0);
        if (i11 < 29) {
            x4.c cVar2 = new x4.c();
            cVar2.f8290g = i13;
            cVar2.f8291h = new int[2];
            s0Var = cVar2;
        } else {
            s0Var = new s0();
        }
        this.G0 = s0Var;
        addOnAttachStateChangeListener(this.f8644z);
        setWillNotDraw(false);
        setFocusable(true);
        d0.f8497a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        h3.w.b(this, yVar);
        setOnDragListener(m52getDragAndDropManager());
        getRoot().d(this);
        if (i11 >= 29) {
            a0.f8465a.a(this);
        }
        if (z10) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.f8614k = view;
            addView(view, -1);
        }
        this.I0 = i11 >= 31 ? new d2.j(0) : null;
        g1 g1Var = new g1();
        r1.k.f5961a.getClass();
        this.K0 = g1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m get_viewTreeOwners() {
        return (m) this.f8605e0.getValue();
    }

    public static void i(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof r) {
                ((r) childAt).w();
            } else if (childAt instanceof ViewGroup) {
                i((ViewGroup) childAt);
            }
        }
    }

    public static long j(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            return (0 << 32) | size;
        }
        if (mode == 0) {
            return (0 << 32) | Integer.MAX_VALUE;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j3 = size;
        return j3 | (j3 << 32);
    }

    public static View k(View view, int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (pc.j.a(declaredMethod.invoke(view, null), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View k3 = k(viewGroup.getChildAt(i11), i10);
                    if (k3 != null) {
                        return k3;
                    }
                }
            }
        }
        return null;
    }

    public static void n(x1.g0 g0Var) {
        g0Var.B();
        o0.e w3 = g0Var.w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            n((x1.g0) objArr[i11]);
        }
    }

    public static boolean p(MotionEvent motionEvent) {
        boolean z10 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z10) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i10 = 1; i10 < pointerCount; i10++) {
                z10 = (Float.floatToRawIntBits(motionEvent.getX(i10)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i10)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !i1.f8556a.a(motionEvent, i10));
                if (z10) {
                    break;
                }
            }
        }
        return z10;
    }

    private void setDensity(s2.c cVar) {
        this.f8612j.setValue(cVar);
    }

    private void setFontFamilyResolver(k2.d dVar) {
        this.f8625p0.setValue(dVar);
    }

    private void setLayoutDirection(s2.l lVar) {
        this.f8629r0.setValue(lVar);
    }

    private final void set_viewTreeOwners(m mVar) {
        this.f8605e0.setValue(mVar);
    }

    public final void A() {
        y yVar = this.f8642y;
        yVar.A = true;
        if (yVar.q() && !yVar.L) {
            yVar.L = true;
            yVar.f8687l.post(yVar.N);
        }
        a1.h hVar = this.f8644z;
        hVar.f176m = true;
        if (!hVar.j() || hVar.f183t) {
            return;
        }
        hVar.f183t = true;
        hVar.f178o.post(hVar.f184u);
    }

    public final void B() {
        if (this.f8603c0) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.f8602b0) {
            this.f8602b0 = currentAnimationTimeMillis;
            r0 r0Var = this.G0;
            float[] fArr = this.W;
            r0Var.a(this, fArr);
            e0.r(fArr, this.f8601a0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.V;
            view.getLocationOnScreen(iArr);
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            float f12 = iArr[0];
            float f13 = f11 - iArr[1];
            this.f8604d0 = (Float.floatToRawIntBits(f10 - f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L);
        }
    }

    public final void C(MotionEvent motionEvent) {
        this.f8602b0 = AnimationUtils.currentAnimationTimeMillis();
        r0 r0Var = this.G0;
        float[] fArr = this.W;
        r0Var.a(this, fArr);
        e0.r(fArr, this.f8601a0);
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long m10 = f1.d0.m(fArr, (Float.floatToRawIntBits(x10) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (m10 >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (m10 & 4294967295L));
        this.f8604d0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final boolean D() {
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void E(x1.g0 g0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (g0Var != null) {
            while (g0Var != null && g0Var.q() == x1.e0.f8019g) {
                if (!this.S) {
                    x1.g0 s10 = g0Var.s();
                    if (s10 == null) {
                        break;
                    }
                    long j3 = s10.I.f7988c.f7088j;
                    if (s2.a.f(j3) && s2.a.e(j3)) {
                        break;
                    }
                }
                g0Var = g0Var.s();
            }
            if (g0Var == getRoot()) {
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

    public final long F(long j3) {
        B();
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (this.f8604d0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (this.f8604d0 & 4294967295L));
        return f1.d0.m(this.f8601a0, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public final int G(MotionEvent motionEvent) {
        Object obj;
        if (this.H0) {
            this.H0 = false;
            int metaState = motionEvent.getMetaState();
            this.f8624p.getClass();
            r1.f8646a.setValue(new r1.s(metaState));
        }
        r1.d dVar = this.G;
        x4.e a6 = dVar.a(motionEvent, this);
        a0.u uVar = this.H;
        if (a6 == null) {
            if (!uVar.f135a) {
                s.o oVar = (s.o) ((m7.g) uVar.f138d).f4957h;
                int i10 = oVar.f6311j;
                Object[] objArr = oVar.f6310i;
                for (int i11 = 0; i11 < i10; i11++) {
                    objArr[i11] = null;
                }
                oVar.f6311j = 0;
                oVar.f6308g = false;
                ((r1.c) uVar.f137c).c();
            }
            return 0;
        }
        List list = (List) a6.f8294g;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i12 = size - 1;
                obj = list.get(size);
                if (((r1.p) obj).f5985e) {
                    break;
                }
                if (i12 < 0) {
                    break;
                }
                size = i12;
            }
        }
        obj = null;
        r1.p pVar = (r1.p) obj;
        if (pVar != null) {
            this.f8607g = pVar.f5984d;
        }
        int g8 = uVar.g(a6, this, q(motionEvent));
        a6.f8295h = null;
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (g8 & 1) != 0) {
            return g8;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        dVar.f5940c.delete(pointerId);
        dVar.f5939b.delete(pointerId);
        return g8;
    }

    public final void H(MotionEvent motionEvent, int i10, long j3, boolean z10) {
        int actionMasked = motionEvent.getActionMasked();
        int i11 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i11 = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            i11 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i11 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerPropertiesArr[i12] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i13 = 0; i13 < pointerCount; i13++) {
            pointerCoordsArr[i13] = new MotionEvent.PointerCoords();
        }
        int i14 = 0;
        while (i14 < pointerCount) {
            int i15 = ((i11 < 0 || i14 < i11) ? 0 : 1) + i14;
            motionEvent.getPointerProperties(i15, pointerPropertiesArr[i14]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i14];
            motionEvent.getPointerCoords(i15, pointerCoords);
            float f10 = pointerCoords.x;
            long s10 = s((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (s10 >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (s10 & 4294967295L));
            i14++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j3 : motionEvent.getDownTime(), j3, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        x4.e a6 = this.G.a(obtain, this);
        pc.j.b(a6);
        this.H.g(a6, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        boolean z10;
        View view;
        long j3;
        long T;
        float[] fArr;
        int i10;
        f2.b bVar;
        boolean z11;
        long j6;
        int[] iArr = this.V;
        getLocationOnScreen(iArr);
        long j10 = this.U;
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (j10 & 4294967295L);
        int i13 = iArr[0];
        if (i11 != i13 || i12 != iArr[1] || this.f8602b0 < 0) {
            this.U = (i13 << 32) | (iArr[1] & 4294967295L);
            if (i11 != Integer.MAX_VALUE && i12 != Integer.MAX_VALUE) {
                getRoot().J.f8103p.a0();
                z10 = true;
                B();
                view = this.J0;
                if (view == null) {
                    view = getRootView();
                    this.J0 = view;
                }
                f2.a rectManager = getRectManager();
                j3 = this.U;
                T = x4.f.T(this.f8604d0);
                int width = view.getWidth();
                int height = view.getHeight();
                rectManager.getClass();
                fArr = this.W;
                i10 = i7.b.i(fArr);
                bVar = rectManager.f2294b;
                if ((i10 & 2) != 0) {
                    fArr = null;
                }
                if (s2.i.a(T, bVar.f2305c)) {
                    bVar.f2305c = T;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!s2.i.a(j3, bVar.f2306d)) {
                    bVar.f2306d = j3;
                    z11 = true;
                }
                if (fArr != null) {
                    z11 = true;
                }
                j6 = (width << 32) | (height & 4294967295L);
                if (j6 != bVar.f2307e) {
                    bVar.f2307e = j6;
                    z11 = true;
                }
                rectManager.f2297e = !z11 || rectManager.f2297e;
                this.T.a(z10);
                getRectManager().a();
            }
        }
        z10 = false;
        B();
        view = this.J0;
        if (view == null) {
        }
        f2.a rectManager2 = getRectManager();
        j3 = this.U;
        T = x4.f.T(this.f8604d0);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        rectManager2.getClass();
        fArr = this.W;
        i10 = i7.b.i(fArr);
        bVar = rectManager2.f2294b;
        if ((i10 & 2) != 0) {
        }
        if (s2.i.a(T, bVar.f2305c)) {
        }
        if (!s2.i.a(j3, bVar.f2306d)) {
        }
        if (fArr != null) {
        }
        j6 = (width2 << 32) | (height2 & 4294967295L);
        if (j6 != bVar.f2307e) {
        }
        rectManager2.f2297e = !z11 || rectManager2.f2297e;
        this.T.a(z10);
        getRectManager().a();
    }

    public final void J(float f10) {
        if (this.f8616l) {
            if (f10 > 0.0f) {
                if (Float.isNaN(this.A0) || f10 > this.A0) {
                    this.A0 = f10;
                    return;
                }
                return;
            }
            if (f10 < 0.0f) {
                if (Float.isNaN(this.B0) || f10 < this.B0) {
                    this.B0 = f10;
                }
            }
        }
    }

    @Override // androidx.lifecycle.f
    public final void a(androidx.lifecycle.u uVar) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(e0.p());
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        e2.j u10;
        oc.c cVar;
        z0.b bVar = this.K;
        if (bVar != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = sparseArray.keyAt(i10);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                if (autofillValue.isText()) {
                    x1.g0 g0Var = (x1.g0) bVar.f9051b.f2004c.b(keyAt);
                    if (g0Var != null && (u10 = g0Var.u()) != null) {
                        Object g8 = u10.f1985g.g(e2.i.f1965g);
                        if (g8 == null) {
                            g8 = null;
                        }
                        e2.a aVar = (e2.a) g8;
                        if (aVar != null && (cVar = (oc.c) aVar.f1945b) != null) {
                        }
                    }
                } else if (autofillValue.isDate()) {
                    Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                } else if (autofillValue.isList()) {
                    Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                } else if (autofillValue.isToggle()) {
                    Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                }
            }
        }
        x4.n nVar = this.J;
        if (nVar != null) {
            z0.j jVar = (z0.j) nVar.f8317b;
            if (jVar.f9060a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i11 = 0; i11 < size2; i11++) {
                int keyAt2 = sparseArray.keyAt(i11);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(keyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (jVar.f9060a.get(Integer.valueOf(keyAt2)) != null) {
                        throw new ClassCastException();
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new ac.h("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new ac.h("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new ac.h("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f8642y.h(false, i10, this.f8607g);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f8642y.h(true, i10, this.f8607g);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            n(getRoot());
        }
        t(true);
        w0.m.k().m();
        this.F = true;
        f1.p pVar = this.f8626q;
        f1.b bVar = pVar.f2276a;
        Canvas canvas2 = bVar.f2214a;
        bVar.f2214a = canvas;
        getRoot().i(bVar, null);
        pVar.f2276a.f2214a = canvas2;
        ArrayList arrayList = this.D;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((f1) ((x1.l1) arrayList.get(i10))).f();
            }
        }
        int i11 = p1.f8598g;
        arrayList.clear();
        this.F = false;
        ArrayList arrayList2 = this.E;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (this.f8616l) {
            p0.a(this, this.A0);
            View view = this.f8614k;
            if (view == null) {
                pc.j.k("frameRateCategoryView");
                throw null;
            }
            p0.a(view, this.B0);
            if (!Float.isNaN(this.B0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.A0 = Float.NaN;
            this.B0 = Float.NaN;
        }
        getRectManager().a();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        x1.c1 c1Var;
        t1.a aVar;
        int size;
        x1.c1 c1Var2;
        y0.m mVar;
        x1.c1 c1Var3;
        if (this.E0) {
            a1.a aVar2 = this.D0;
            removeCallbacks(aVar2);
            if (motionEvent.getActionMasked() == 8) {
                this.E0 = false;
            } else {
                aVar2.run();
            }
        }
        if (p(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() != 8) {
            if (!motionEvent.isFromSource(2)) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Float.floatToRawIntBits(x10);
                Float.floatToRawIntBits(y10);
                motionEvent.getEventTime();
                motionEvent.getActionMasked();
                d1.i iVar = (d1.i) getFocusOwner();
                if (iVar.f1579d.f1574e) {
                    System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
                } else {
                    d1.r g8 = d1.e.g(iVar.f1578c);
                    if (g8 != null) {
                        if (!g8.f8443g.f8456t) {
                            u1.a.b("visitAncestors called on an unattached node");
                        }
                        y0.m mVar2 = g8.f8443g;
                        x1.g0 v10 = x1.f.v(g8);
                        while (v10 != null) {
                            if ((v10.I.f7991f.f8446j & 2097152) != 0) {
                                while (mVar2 != null) {
                                    if ((mVar2.f8445i & 2097152) != 0) {
                                        y0.m mVar3 = mVar2;
                                        o0.e eVar = null;
                                        while (mVar3 != null) {
                                            if ((mVar3.f8445i & 2097152) != 0 && (mVar3 instanceof x1.m)) {
                                                int i10 = 0;
                                                for (y0.m mVar4 = ((x1.m) mVar3).f8110v; mVar4 != null; mVar4 = mVar4.f8448l) {
                                                    if ((mVar4.f8445i & 2097152) != 0) {
                                                        i10++;
                                                        if (i10 == 1) {
                                                            mVar3 = mVar4;
                                                        } else {
                                                            if (eVar == null) {
                                                                eVar = new o0.e(new y0.m[16]);
                                                            }
                                                            if (mVar3 != null) {
                                                                eVar.b(mVar3);
                                                                mVar3 = null;
                                                            }
                                                            eVar.b(mVar4);
                                                        }
                                                    }
                                                }
                                                if (i10 == 1) {
                                                }
                                            }
                                            mVar3 = x1.f.f(eVar);
                                        }
                                    }
                                    mVar2 = mVar2.f8447k;
                                }
                            }
                            v10 = v10.s();
                            mVar2 = (v10 == null || (c1Var = v10.I) == null) ? null : c1Var.f7990e;
                        }
                    }
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (m(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        getContext();
        viewConfiguration.getScaledVerticalScrollFactor();
        getContext();
        viewConfiguration.getScaledHorizontalScrollFactor();
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        d1.h focusOwner = getFocusOwner();
        c1.b bVar = new c1.b(10, this, motionEvent);
        d1.i iVar2 = (d1.i) focusOwner;
        if (iVar2.f1579d.f1574e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        d1.r g10 = d1.e.g(iVar2.f1578c);
        if (g10 != null) {
            if (!g10.f8443g.f8456t) {
                u1.a.b("visitAncestors called on an unattached node");
            }
            y0.m mVar5 = g10.f8443g;
            x1.g0 v11 = x1.f.v(g10);
            loop0: while (true) {
                if (v11 == null) {
                    mVar = null;
                    break;
                }
                if ((v11.I.f7991f.f8446j & 16384) != 0) {
                    while (mVar5 != null) {
                        if ((mVar5.f8445i & 16384) != 0) {
                            mVar = mVar5;
                            o0.e eVar2 = null;
                            while (mVar != null) {
                                if (mVar instanceof t1.a) {
                                    break loop0;
                                }
                                if ((mVar.f8445i & 16384) != 0 && (mVar instanceof x1.m)) {
                                    int i11 = 0;
                                    for (y0.m mVar6 = ((x1.m) mVar).f8110v; mVar6 != null; mVar6 = mVar6.f8448l) {
                                        if ((mVar6.f8445i & 16384) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                mVar = mVar6;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new o0.e(new y0.m[16]);
                                                }
                                                if (mVar != null) {
                                                    eVar2.b(mVar);
                                                    mVar = null;
                                                }
                                                eVar2.b(mVar6);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                mVar = x1.f.f(eVar2);
                            }
                        }
                        mVar5 = mVar5.f8447k;
                    }
                }
                v11 = v11.s();
                mVar5 = (v11 == null || (c1Var3 = v11.I) == null) ? null : c1Var3.f7990e;
            }
            aVar = (t1.a) mVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            t1.a aVar3 = aVar;
            if (!aVar3.f8443g.f8456t) {
                u1.a.b("visitAncestors called on an unattached node");
            }
            y0.m mVar7 = aVar3.f8443g.f8447k;
            x1.g0 v12 = x1.f.v(aVar);
            ArrayList arrayList = null;
            while (v12 != null) {
                if ((v12.I.f7991f.f8446j & 16384) != 0) {
                    while (mVar7 != null) {
                        if ((mVar7.f8445i & 16384) != 0) {
                            y0.m mVar8 = mVar7;
                            o0.e eVar3 = null;
                            while (mVar8 != null) {
                                if (mVar8 instanceof t1.a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(mVar8);
                                } else if ((mVar8.f8445i & 16384) != 0 && (mVar8 instanceof x1.m)) {
                                    int i12 = 0;
                                    for (y0.m mVar9 = ((x1.m) mVar8).f8110v; mVar9 != null; mVar9 = mVar9.f8448l) {
                                        if ((mVar9.f8445i & 16384) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                mVar8 = mVar9;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new o0.e(new y0.m[16]);
                                                }
                                                if (mVar8 != null) {
                                                    eVar3.b(mVar8);
                                                    mVar8 = null;
                                                }
                                                eVar3.b(mVar9);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                mVar8 = x1.f.f(eVar3);
                            }
                        }
                        mVar7 = mVar7.f8447k;
                    }
                }
                v12 = v12.s();
                mVar7 = (v12 == null || (c1Var2 = v12.I) == null) ? null : c1Var2.f7990e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i13 = size - 1;
                    ((t1.a) arrayList.get(size)).getClass();
                    if (i13 < 0) {
                        break;
                    }
                    size = i13;
                }
            }
            y0.m mVar10 = aVar3.f8443g;
            o0.e eVar4 = null;
            while (mVar10 != null) {
                if (mVar10 instanceof t1.a) {
                } else if ((mVar10.f8445i & 16384) != 0 && (mVar10 instanceof x1.m)) {
                    int i14 = 0;
                    for (y0.m mVar11 = ((x1.m) mVar10).f8110v; mVar11 != null; mVar11 = mVar11.f8448l) {
                        if ((mVar11.f8445i & 16384) != 0) {
                            i14++;
                            if (i14 == 1) {
                                mVar10 = mVar11;
                            } else {
                                if (eVar4 == null) {
                                    eVar4 = new o0.e(new y0.m[16]);
                                }
                                if (mVar10 != null) {
                                    eVar4.b(mVar10);
                                    mVar10 = null;
                                }
                                eVar4.b(mVar11);
                            }
                        }
                    }
                    if (i14 == 1) {
                    }
                }
                mVar10 = x1.f.f(eVar4);
            }
            if (!((Boolean) bVar.invoke()).booleanValue()) {
                y0.m mVar12 = aVar3.f8443g;
                o0.e eVar5 = null;
                while (mVar12 != null) {
                    if (mVar12 instanceof t1.a) {
                    } else if ((mVar12.f8445i & 16384) != 0 && (mVar12 instanceof x1.m)) {
                        int i15 = 0;
                        for (y0.m mVar13 = ((x1.m) mVar12).f8110v; mVar13 != null; mVar13 = mVar13.f8448l) {
                            if ((mVar13.f8445i & 16384) != 0) {
                                i15++;
                                if (i15 == 1) {
                                    mVar12 = mVar13;
                                } else {
                                    if (eVar5 == null) {
                                        eVar5 = new o0.e(new y0.m[16]);
                                    }
                                    if (mVar12 != null) {
                                        eVar5.b(mVar12);
                                        mVar12 = null;
                                    }
                                    eVar5.b(mVar13);
                                }
                            }
                        }
                        if (i15 == 1) {
                        }
                    }
                    mVar12 = x1.f.f(eVar5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        n nVar = ((t1.a) arrayList.get(i16)).f6512u;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0159, code lost:
    
        if (r(r24) == false) goto L71;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10 = this.E0;
        a1.a aVar = this.D0;
        if (z10) {
            removeCallbacks(aVar);
            aVar.run();
        }
        if (!p(motionEvent) && isAttachedToWindow()) {
            y yVar = this.f8642y;
            r rVar = yVar.f8679d;
            AccessibilityManager accessibilityManager = yVar.f8682g;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    rVar.t(true);
                    x1.q qVar = new x1.q();
                    x1.c1 c1Var = rVar.getRoot().I;
                    x1.f1 f1Var = c1Var.f7989d;
                    f1.e0 e0Var = x1.f1.P;
                    c1Var.f7989d.G0(x1.f1.S, f1Var.y0((Float.floatToRawIntBits(x10) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L)), qVar, 1, true);
                    int K = bc.n.K(qVar);
                    while (true) {
                        if (-1 >= K) {
                            i10 = Integer.MIN_VALUE;
                            break;
                        }
                        Object e10 = qVar.f8147g.e(K);
                        pc.j.c(e10, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                        x1.g0 v10 = x1.f.v((y0.m) e10);
                        if (rVar.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(v10) != null) {
                            throw new ClassCastException();
                        }
                        if (v10.I.d(8)) {
                            int v11 = yVar.v(v10.f8042h);
                            e2.n a6 = e2.q.a(v10, false);
                            if (e2.q.f(a6)) {
                                if (!a6.k().f1985g.c(e2.s.f2048x)) {
                                    i10 = v11;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        K--;
                    }
                    rVar.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    int i11 = yVar.f8680e;
                    if (i11 != i10) {
                        yVar.f8680e = i10;
                        y.z(yVar, i10, 128, null, 12);
                        y.z(yVar, i11, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i12 = yVar.f8680e;
                    if (i12 == Integer.MIN_VALUE) {
                        rVar.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    } else if (i12 != Integer.MIN_VALUE) {
                        yVar.f8680e = Integer.MIN_VALUE;
                        y.z(yVar, Integer.MIN_VALUE, 128, null, 12);
                        y.z(yVar, i12, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && q(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.f8639w0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.f8639w0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.E0 = true;
                        postDelayed(aVar, 8L);
                        return false;
                    }
                }
                if ((m(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((d1.i) getFocusOwner()).d(keyEvent, new c1.b(9, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f8624p.getClass();
        r1.f8646a.setValue(new r1.s(metaState));
        return ((d1.i) getFocusOwner()).d(keyEvent, d1.g.f1575g) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        x1.c1 c1Var;
        if (isFocused()) {
            d1.i iVar = (d1.i) getFocusOwner();
            if (iVar.f1579d.f1574e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                d1.r g8 = d1.e.g(iVar.f1578c);
                if (g8 != null) {
                    if (!g8.f8443g.f8456t) {
                        u1.a.b("visitAncestors called on an unattached node");
                    }
                    y0.m mVar = g8.f8443g;
                    x1.g0 v10 = x1.f.v(g8);
                    while (v10 != null) {
                        if ((v10.I.f7991f.f8446j & 131072) != 0) {
                            while (mVar != null) {
                                if ((mVar.f8445i & 131072) != 0) {
                                    y0.m mVar2 = mVar;
                                    o0.e eVar = null;
                                    while (mVar2 != null) {
                                        if ((mVar2.f8445i & 131072) != 0 && (mVar2 instanceof x1.m)) {
                                            int i10 = 0;
                                            for (y0.m mVar3 = ((x1.m) mVar2).f8110v; mVar3 != null; mVar3 = mVar3.f8448l) {
                                                if ((mVar3.f8445i & 131072) != 0) {
                                                    i10++;
                                                    if (i10 == 1) {
                                                        mVar2 = mVar3;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new o0.e(new y0.m[16]);
                                                        }
                                                        if (mVar2 != null) {
                                                            eVar.b(mVar2);
                                                            mVar2 = null;
                                                        }
                                                        eVar.b(mVar3);
                                                    }
                                                }
                                            }
                                            if (i10 == 1) {
                                            }
                                        }
                                        mVar2 = x1.f.f(eVar);
                                    }
                                }
                                mVar = mVar.f8447k;
                            }
                        }
                        v10 = v10.s();
                        mVar = (v10 == null || (c1Var = v10.I) == null) ? null : c1Var.f7990e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            z.f8727a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.E0) {
            a1.a aVar = this.D0;
            removeCallbacks(aVar);
            MotionEvent motionEvent2 = this.f8639w0;
            pc.j.b(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.E0 = false;
            } else {
                aVar.run();
            }
        }
        if (!p(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || r(motionEvent))) {
            int m10 = m(motionEvent);
            if ((m10 & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((m10 & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i10) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return k(this, i10);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i10));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i10) {
        e1.c d10;
        if (view == null || this.T.f8191c) {
            return super.focusSearch(view, i10);
        }
        Object obj = d1.f8498f.get();
        pc.j.b(obj);
        View b2 = ((d1) obj).b(i10, view, this);
        if (view == this) {
            d1.r g8 = d1.e.g(((d1.i) getFocusOwner()).f1578c);
            d10 = g8 != null ? d1.e.j(g8) : null;
            if (d10 == null) {
                d10 = d1.e.d(view, this);
            }
        } else {
            d10 = d1.e.d(view, this);
        }
        d1.b B = d1.e.B(i10);
        int i11 = B != null ? B.f1568a : 6;
        pc.s sVar = new pc.s();
        if (((d1.i) getFocusOwner()).e(i11, d10, new b0.t0(sVar, 2)) != null) {
            Object obj2 = sVar.f5683g;
            if (obj2 != null) {
                if (b2 != null) {
                    if (i11 == 1 || i11 == 2) {
                        return super.focusSearch(view, i10);
                    }
                    if (d1.e.o(d1.e.j((d1.r) obj2), d1.e.d(b2, this), d10, i11)) {
                    }
                }
                return this;
            }
            if (b2 == null) {
            }
            return b2;
        }
        return view;
    }

    public final n0 getAndroidViewsHandler$ui_release() {
        if (this.Q == null) {
            n0 n0Var = new n0(getContext());
            this.Q = n0Var;
            addView(n0Var, -1);
            requestLayout();
        }
        n0 n0Var2 = this.Q;
        pc.j.b(n0Var2);
        return n0Var2;
    }

    public z0.e getAutofill() {
        return this.J;
    }

    public z0.i getAutofillManager() {
        return this.K;
    }

    public z0.j getAutofillTree() {
        return this.C;
    }

    public final oc.c getConfigurationChangeObserver() {
        return this.I;
    }

    public final a1.h getContentCaptureManager$ui_release() {
        return this.f8644z;
    }

    public fc.i getCoroutineContext() {
        return this.f8620n;
    }

    public s2.c getDensity() {
        return (s2.c) this.f8612j.getValue();
    }

    public e1.c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            d1.r g8 = d1.e.g(((d1.i) getFocusOwner()).f1578c);
            if (g8 != null) {
                return d1.e.j(g8);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return d1.e.d(findFocus, this);
        }
        return null;
    }

    public d1.h getFocusOwner() {
        return this.f8618m;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        e1.c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f1931a);
            rect.top = Math.round(embeddedViewFocusRect.f1932b);
            rect.right = Math.round(embeddedViewFocusRect.f1933c);
            rect.bottom = Math.round(embeddedViewFocusRect.f1934d);
            return;
        }
        if (pc.j.a(((d1.i) getFocusOwner()).e(6, null, n.f8586i), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public k2.d getFontFamilyResolver() {
        return (k2.d) this.f8625p0.getValue();
    }

    public k2.c getFontLoader() {
        return this.f8623o0;
    }

    public f1.u getGraphicsContext() {
        return this.B;
    }

    public n1.a getHapticFeedBack() {
        return this.f8631s0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.T.f8190b.A();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public o1.b getInputModeManager() {
        return this.f8633t0;
    }

    public final v1.o getInsetsListener() {
        return this.f8630s;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f8602b0;
    }

    @Override // android.view.View, android.view.ViewParent
    public s2.l getLayoutDirection() {
        return (s2.l) this.f8629r0.getValue();
    }

    public long getMeasureIteration() {
        x1.v0 v0Var = this.T;
        if (!v0Var.f8191c) {
            u1.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return v0Var.f8195g;
    }

    public w1.c getModifierLocalManager() {
        return this.f8635u0;
    }

    public v1.i0 getPlacementScope() {
        int i10 = v1.l0.f7097b;
        return new v1.b0(1, this);
    }

    public r1.l getPointerIconService() {
        return this.K0;
    }

    public f2.a getRectManager() {
        return this.f8636v;
    }

    public x1.g0 getRoot() {
        return this.f8632t;
    }

    public x1.t1 getRootForTest() {
        return this.f8638w;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        d2.j jVar;
        if (Build.VERSION.SDK_INT < 31 || (jVar = this.I0) == null) {
            return false;
        }
        return ((Boolean) jVar.f1649a.getValue()).booleanValue();
    }

    public e2.p getSemanticsOwner() {
        return this.f8640x;
    }

    public x1.i0 getSharedDrawScope() {
        return this.f8610i;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? o0.f8595a.a(this) : this.P;
    }

    public x1.o1 getSnapshotObserver() {
        return this.O;
    }

    public l1 getSoftwareKeyboardController() {
        return this.f8621n0;
    }

    public l2.c getTextInputService() {
        return this.f8617l0;
    }

    public m1 getTextToolbar() {
        return this.f8637v0;
    }

    public final x1.s1 getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    public o1 getViewConfiguration() {
        return this.f8628r;
    }

    public final m getViewTreeOwners() {
        return (m) this.f8606f0.getValue();
    }

    public q1 getWindowInfo() {
        return this.f8624p;
    }

    public final z0.b get_autofillManager$ui_release() {
        return this.K;
    }

    public final void l(x1.g0 g0Var, boolean z10) {
        this.T.f(g0Var, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0160 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:90:0x0034, B:92:0x003e, B:97:0x004e, B:100:0x007d, B:102:0x0081, B:104:0x0090, B:106:0x0096, B:13:0x00a1, B:21:0x00b4, B:23:0x00ba, B:107:0x0056, B:113:0x0062, B:116:0x006a), top: B:89:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked;
        MotionEvent motionEvent2;
        r rVar;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        boolean z11;
        r1.c cVar;
        removeCallbacks(this.C0);
        try {
            C(motionEvent);
            this.f8603c0 = true;
            t(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent4 = this.f8639w0;
                boolean z12 = motionEvent4 != null && motionEvent4.getToolType(0) == 3;
                a0.u uVar = this.H;
                if (motionEvent4 != null) {
                    try {
                        if (motionEvent4.getSource() == motionEvent.getSource() && motionEvent4.getToolType(0) == motionEvent.getToolType(0)) {
                            z10 = false;
                            if (z10) {
                                if (motionEvent4.getButtonState() != 0 || (actionMasked = motionEvent4.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent4;
                                    if (!uVar.f135a) {
                                        s.o oVar = (s.o) ((m7.g) uVar.f138d).f4957h;
                                        int i10 = oVar.f6311j;
                                        Object[] objArr = oVar.f6310i;
                                        for (int i11 = 0; i11 < i10; i11++) {
                                            objArr[i11] = null;
                                        }
                                        oVar.f6311j = 0;
                                        oVar.f6308g = false;
                                        ((r1.c) uVar.f137c).c();
                                    }
                                } else if (motionEvent4.getActionMasked() != 10 && z12) {
                                    H(motionEvent4, 10, motionEvent4.getEventTime(), true);
                                    motionEvent2 = motionEvent4;
                                }
                                boolean z13 = motionEvent.getToolType(0) != 3;
                                if (z12 && z13 && actionMasked2 != 3 && actionMasked2 != 9 && q(motionEvent)) {
                                    rVar = this;
                                    rVar.H(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    rVar = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = rVar.f8639w0;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent5 = rVar.f8639w0;
                                    pointerId = motionEvent5 == null ? motionEvent5.getPointerId(0) : -1;
                                    action = motionEvent.getAction();
                                    r1.d dVar = rVar.G;
                                    if (action == 9 || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent6 = rVar.f8639w0;
                                            float x10 = motionEvent6 == null ? motionEvent6.getX() : Float.NaN;
                                            MotionEvent motionEvent7 = rVar.f8639w0;
                                            z11 = x10 == motionEvent.getX() || (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) != motionEvent.getY();
                                            MotionEvent motionEvent8 = rVar.f8639w0;
                                            boolean z14 = (motionEvent8 == null ? motionEvent8.getEventTime() : -1L) == motionEvent.getEventTime();
                                            if (!z11 || z14) {
                                                if (pointerId >= 0) {
                                                    dVar.f5940c.delete(pointerId);
                                                    dVar.f5939b.delete(pointerId);
                                                }
                                                cVar = (r1.c) uVar.f137c;
                                                if (cVar.f5933d) {
                                                    cVar.f5936g.f5952a.g();
                                                } else {
                                                    cVar.f5933d = true;
                                                }
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        dVar.f5940c.delete(pointerId);
                                        dVar.f5939b.delete(pointerId);
                                    }
                                }
                                rVar.f8639w0 = MotionEvent.obtainNoHistory(motionEvent);
                                int G = G(motionEvent);
                                Trace.endSection();
                                rVar.f8603c0 = false;
                                return G;
                            }
                        }
                        z10 = true;
                        if (z10) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                motionEvent2 = motionEvent4;
                if (motionEvent.getToolType(0) != 3) {
                }
                if (z12) {
                }
                rVar = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = rVar.f8639w0;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent52 = rVar.f8639w0;
                    if (motionEvent52 == null) {
                    }
                    action = motionEvent.getAction();
                    r1.d dVar2 = rVar.G;
                    if (action == 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent62 = rVar.f8639w0;
                        if (motionEvent62 == null) {
                        }
                        MotionEvent motionEvent72 = rVar.f8639w0;
                        if (motionEvent72 != null) {
                        }
                        if (x10 == motionEvent.getX()) {
                        }
                        MotionEvent motionEvent82 = rVar.f8639w0;
                        if ((motionEvent82 == null ? motionEvent82.getEventTime() : -1L) == motionEvent.getEventTime()) {
                        }
                        if (!z11) {
                        }
                        if (pointerId >= 0) {
                        }
                        cVar = (r1.c) uVar.f137c;
                        if (cVar.f5933d) {
                        }
                    }
                }
                rVar.f8639w0 = MotionEvent.obtainNoHistory(motionEvent);
                int G2 = G(motionEvent);
                Trace.endSection();
                rVar.f8603c0 = false;
                return G2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.f8603c0 = false;
            throw th3;
        }
    }

    public final void o(x1.g0 g0Var) {
        this.T.p(g0Var, false);
        o0.e w3 = g0Var.w();
        Object[] objArr = w3.f5134g;
        int i10 = w3.f5136i;
        for (int i11 = 0; i11 < i10; i11++) {
            o((x1.g0) objArr[i11]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.w h10;
        androidx.lifecycle.u uVar;
        super.onAttachedToWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            setShowLayoutBounds(e0.p());
        }
        this.f8630s.onViewAttachedToWindow(this);
        if (i10 > 28) {
            if (P0 == null) {
                c6.a aVar = new c6.a(r2);
                P0 = aVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (L0 == null) {
                        L0 = Class.forName("android.os.SystemProperties");
                    }
                    if (N0 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = L0;
                        N0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = N0;
                    if (method != null) {
                        method.invoke(null, aVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            s.a0 a0Var = O0;
            synchronized (a0Var) {
                a0Var.a(this);
            }
        }
        this.f8624p.f1649a.setValue(Boolean.valueOf(hasWindowFocus()));
        this.f8624p.getClass();
        this.f8624p.getClass();
        o(getRoot());
        n(getRoot());
        getSnapshotObserver().f8130a.b();
        x4.n nVar = this.J;
        if (nVar != null) {
            z0.h hVar = z0.h.f9059a;
            hVar.getClass();
            ((AutofillManager) nVar.f8318c).registerCallback(hVar);
        }
        androidx.lifecycle.u e10 = androidx.lifecycle.m0.e(this);
        e4.e C = v6.a.C(this);
        m viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (e10 != null && C != null && (e10 != (uVar = viewTreeOwners.f8582a) || C != uVar))) {
            if (e10 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (C == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (h10 = viewTreeOwners.f8582a.h()) != null) {
                h10.f(this);
            }
            e10.h().a(this);
            m mVar = new m(e10, C);
            set_viewTreeOwners(mVar);
            oc.c cVar = this.f8608g0;
            if (cVar != null) {
                cVar.invoke(mVar);
            }
            this.f8608g0 = null;
        }
        this.f8633t0.f5150a.setValue(new o1.a(isInTouchMode() ? 1 : 2));
        m viewTreeOwners2 = getViewTreeOwners();
        androidx.lifecycle.w h11 = viewTreeOwners2 != null ? viewTreeOwners2.f8582a.h() : null;
        if (h11 == null) {
            throw a4.d.e("No lifecycle owner exists");
        }
        h11.a(this);
        h11.a(this.f8644z);
        getViewTreeObserver().addOnGlobalLayoutListener(this.h0);
        getViewTreeObserver().addOnScrollChangedListener(this.f8611i0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f8613j0);
        if (Build.VERSION.SDK_INT >= 31) {
            c0.f8487a.b(this);
        }
        z0.b bVar = this.K;
        if (bVar != null) {
            ((d1.i) getFocusOwner()).f1582g.a(bVar);
            getSemanticsOwner().f2005d.a(bVar);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.f8619m0.get() != null) {
            throw new ClassCastException();
        }
        this.f8615k0.getClass();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(i7.b.b(getContext()));
        this.f8624p.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f8627q0) {
            this.f8627q0 = i10 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(x4.f.H(getContext()));
        }
        this.I.invoke(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.f8619m0.get() != null) {
            throw new ClassCastException();
        }
        this.f8615k0.getClass();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        e2.n nVar;
        String a6;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        a1.h hVar = this.f8644z;
        hVar.getClass();
        for (long j3 : jArr) {
            e2.o oVar = (e2.o) hVar.i().b((int) j3);
            if (oVar != null && (nVar = oVar.f2000a) != null) {
                a1.c.p();
                ViewTranslationRequest.Builder l10 = a1.c.l(hVar.f170g.getAutofillId(), nVar.f1999g);
                Object g8 = nVar.f1996d.f1985g.g(e2.s.f2049y);
                if (g8 == null) {
                    g8 = null;
                }
                List list = (List) g8;
                if (list != null && (a6 = u2.a.a(list, "\n", null, 62)) != null) {
                    forText = TranslationRequestValue.forText(new h2.e(a6, 0));
                    l10.setValue("android:text", forText);
                    build = l10.build();
                    consumer.accept(build);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8630s.onViewDetachedFromWindow(this);
        if (this.f8616l) {
            View view = this.f8614k;
            if (view == null) {
                pc.j.k("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        if (Build.VERSION.SDK_INT > 28) {
            s.a0 a0Var = O0;
            synchronized (a0Var) {
                a0Var.i(this);
            }
        }
        x1.o1 snapshotObserver = getSnapshotObserver();
        c6.f fVar = snapshotObserver.f8130a.f7613h;
        if (fVar != null) {
            fVar.f();
        }
        w0.t tVar = snapshotObserver.f8130a;
        synchronized (tVar.f7612g) {
            o0.e eVar = tVar.f7611f;
            Object[] objArr = eVar.f5134g;
            int i10 = eVar.f5136i;
            for (int i11 = 0; i11 < i10; i11++) {
                w0.s sVar = (w0.s) objArr[i11];
                sVar.f7598e.a();
                sVar.f7599f.a();
                sVar.f7604k.a();
                sVar.f7605l.clear();
            }
        }
        this.f8624p.getClass();
        m viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.w h10 = viewTreeOwners != null ? viewTreeOwners.f8582a.h() : null;
        if (h10 == null) {
            throw a4.d.e("No lifecycle owner exists");
        }
        h10.f(this.f8644z);
        h10.f(this);
        x4.n nVar = this.J;
        if (nVar != null) {
            z0.h hVar = z0.h.f9059a;
            hVar.getClass();
            ((AutofillManager) nVar.f8318c).unregisterCallback(hVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.h0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f8611i0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f8613j0);
        if (Build.VERSION.SDK_INT >= 31) {
            c0.f8487a.a(this);
        }
        z0.b bVar = this.K;
        if (bVar != null) {
            getSemanticsOwner().f2005d.i(bVar);
            ((d1.i) getFocusOwner()).f1582g.i(bVar);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10 || hasFocus()) {
            return;
        }
        d1.e.e(((d1.i) getFocusOwner()).f1578c, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f8602b0 = 0L;
        this.T.j(this.F0);
        this.R = null;
        I();
        if (this.Q != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        x1.v0 v0Var = this.T;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                o(getRoot());
            }
            long j3 = j(i10);
            long j6 = j(i11);
            long k3 = bc.a0.k((int) (j3 >>> 32), (int) (j3 & 4294967295L), (int) (j6 >>> 32), (int) (4294967295L & j6));
            s2.a aVar = this.R;
            if (aVar == null) {
                this.R = new s2.a(k3);
                this.S = false;
            } else if (!s2.a.b(aVar.f6381a, k3)) {
                this.S = true;
            }
            v0Var.q(k3);
            v0Var.l();
            setMeasuredDimension(getRoot().J.f8103p.f7085g, getRoot().J.f8103p.f7086h);
            if (this.Q != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().J.f8103p.f7085g, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().J.f8103p.f7086h, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        if (viewStructure != null) {
            z0.b bVar = this.K;
            if (bVar != null) {
                x1.g0 g0Var = bVar.f9051b.f2002a;
                AutofillId autofillId = bVar.f9055f;
                String str = bVar.f9054e;
                f2.a aVar = bVar.f9053d;
                ud.g.i(viewStructure, g0Var, autofillId, str, aVar);
                Object[] objArr = s.l0.f6302a;
                s.a0 a0Var = new s.a0(2);
                a0Var.a(g0Var);
                a0Var.a(viewStructure);
                while (a0Var.h()) {
                    Object j3 = a0Var.j(a0Var.f6220b - 1);
                    pc.j.c(j3, "null cannot be cast to non-null type android.view.ViewStructure");
                    ViewStructure viewStructure2 = (ViewStructure) j3;
                    Object j6 = a0Var.j(a0Var.f6220b - 1);
                    pc.j.c(j6, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
                    o0.b bVar2 = (o0.b) ((x1.g0) j6).m();
                    int i11 = bVar2.f5128g.f5136i;
                    for (int i12 = 0; i12 < i11; i12++) {
                        x1.g0 g0Var2 = (x1.g0) bVar2.get(i12);
                        if (!g0Var2.R && g0Var2.G() && g0Var2.H()) {
                            e2.j u10 = g0Var2.u();
                            if (u10 != null) {
                                s.g0 g0Var3 = u10.f1985g;
                                if (g0Var3.b(e2.i.f1965g) || g0Var3.b(e2.s.f2041q) || g0Var3.b(e2.s.f2042r)) {
                                    ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    ud.g.i(newChild, g0Var2, autofillId, str, aVar);
                                    a0Var.a(g0Var2);
                                    a0Var.a(newChild);
                                }
                            }
                            a0Var.a(g0Var2);
                            a0Var.a(viewStructure2);
                        }
                    }
                }
            }
            x4.n nVar = this.J;
            if (nVar != null) {
                z0.j jVar = (z0.j) nVar.f8317b;
                LinkedHashMap linkedHashMap = jVar.f9060a;
                LinkedHashMap linkedHashMap2 = jVar.f9060a;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int intValue = ((Number) entry.getKey()).intValue();
                    if (entry.getValue() != null) {
                        throw new ClassCastException();
                    }
                    ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                    newChild2.setAutofillId((AutofillId) nVar.f8319d, intValue);
                    newChild2.setId(intValue, ((r) nVar.f8316a).getContext().getPackageName(), null, null);
                    newChild2.setAutofillType(1);
                    throw null;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        int toolType = motionEvent.getToolType(i10);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && (toolType == 2 || toolType == 4)) {
            getPointerIconService().getClass();
        }
        return super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        if (this.f8609h) {
            s2.l lVar = s2.l.f6396g;
            s2.l lVar2 = i10 != 0 ? i10 != 1 ? null : s2.l.f6397h : lVar;
            if (lVar2 != null) {
                lVar = lVar2;
            }
            setLayoutDirection(lVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        d2.j jVar;
        if (Build.VERSION.SDK_INT >= 31 && (jVar = this.I0) != null) {
            e2.p semanticsOwner = getSemanticsOwner();
            fc.i coroutineContext = getCoroutineContext();
            o0.e eVar = new o0.e(new d2.k[16]);
            i7.b.G(semanticsOwner.a(), 0, new d2.i(1, o0.e.class, eVar, "add", "add(Ljava/lang/Object;)Z"));
            bc.l.b0(eVar.f5134g, new dc.a(0, new oc.c[]{d2.b.f1629i, d2.b.f1630j}), 0, eVar.f5136i);
            int i10 = eVar.f5136i;
            d2.k kVar = (d2.k) (i10 == 0 ? null : eVar.f5134g[i10 - 1]);
            if (kVar != null) {
                s2.j jVar2 = kVar.f1652c;
                d2.d dVar = new d2.d(kVar.f1650a, jVar2, yc.a0.a(coroutineContext), jVar, this);
                x1.f1 f1Var = kVar.f1653d;
                long j3 = (jVar2.f6391a << 32) | (jVar2.f6392b & 4294967295L);
                ScrollCaptureTarget h10 = a1.c.h(this, f1.d0.r(a.a.H(v1.p0.g(f1Var).C(f1Var, true))), new Point((int) (j3 >> 32), (int) (j3 & 4294967295L)), dVar);
                h10.setScrollBounds(f1.d0.r(jVar2));
                consumer.accept(h10);
            }
        }
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        a1.h hVar = this.f8644z;
        hVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (pc.j.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            bc.a0.i(hVar, longSparseArray);
        } else {
            hVar.f170g.post(new a1.d(0, hVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        boolean p8;
        this.f8624p.f1649a.setValue(Boolean.valueOf(z10));
        this.H0 = true;
        super.onWindowFocusChanged(z10);
        if (!z10 || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (p8 = e0.p())) {
            return;
        }
        setShowLayoutBounds(p8);
        n(getRoot());
    }

    public final boolean q(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return 0.0f <= x10 && x10 <= ((float) getWidth()) && 0.0f <= y10 && y10 <= ((float) getHeight());
    }

    public final boolean r(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f8639w0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int ordinal = ((d1.i) getFocusOwner()).f1578c.t0().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return super.requestFocus(i10, rect);
        }
        if (ordinal != 3) {
            throw new ac.d();
        }
        d1.b B = d1.e.B(i10);
        int i11 = B != null ? B.f1568a : 7;
        return pc.j.a(((d1.i) getFocusOwner()).e(i11, rect != null ? f1.d0.u(rect) : null, new a0.w(i11, 1)), Boolean.TRUE);
    }

    public final long s(long j3) {
        B();
        long m10 = f1.d0.m(this.W, j3);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.f8604d0 >> 32)) + Float.intBitsToFloat((int) (m10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.f8604d0 & 4294967295L)) + Float.intBitsToFloat((int) (m10 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j3) {
        this.f8642y.f8683h = j3;
    }

    public final void setConfigurationChangeObserver(oc.c cVar) {
        this.I = cVar;
    }

    public final void setContentCaptureManager$ui_release(a1.h hVar) {
        this.f8644z = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public void setCoroutineContext(fc.i iVar) {
        this.f8620n = iVar;
        y0.m mVar = getRoot().I.f7991f;
        if (mVar instanceof r1.z) {
            ((r1.z) mVar).s0();
        }
        if (!mVar.f8443g.f8456t) {
            u1.a.b("visitSubtreeIf called on an unattached node");
        }
        o0.e eVar = new o0.e(new y0.m[16]);
        y0.m mVar2 = mVar.f8443g;
        y0.m mVar3 = mVar2.f8448l;
        if (mVar3 == null) {
            x1.f.b(eVar, mVar2);
        } else {
            eVar.b(mVar3);
        }
        while (true) {
            int i10 = eVar.f5136i;
            if (i10 == 0) {
                return;
            }
            y0.m mVar4 = (y0.m) eVar.k(i10 - 1);
            if ((mVar4.f8446j & 16) != 0) {
                for (y0.m mVar5 = mVar4; mVar5 != null; mVar5 = mVar5.f8448l) {
                    if ((mVar5.f8445i & 16) != 0) {
                        x1.m mVar6 = mVar5;
                        ?? r5 = 0;
                        while (mVar6 != 0) {
                            if (mVar6 instanceof x1.r1) {
                                x1.r1 r1Var = (x1.r1) mVar6;
                                if (r1Var instanceof r1.z) {
                                    ((r1.z) r1Var).s0();
                                }
                            } else if ((mVar6.f8445i & 16) != 0 && (mVar6 instanceof x1.m)) {
                                y0.m mVar7 = mVar6.f8110v;
                                int i11 = 0;
                                mVar6 = mVar6;
                                r5 = r5;
                                while (mVar7 != null) {
                                    if ((mVar7.f8445i & 16) != 0) {
                                        i11++;
                                        r5 = r5;
                                        if (i11 == 1) {
                                            mVar6 = mVar7;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new o0.e(new y0.m[16]);
                                            }
                                            if (mVar6 != 0) {
                                                r5.b(mVar6);
                                                mVar6 = 0;
                                            }
                                            r5.b(mVar7);
                                        }
                                    }
                                    mVar7 = mVar7.f8448l;
                                    mVar6 = mVar6;
                                    r5 = r5;
                                }
                                if (i11 == 1) {
                                }
                            }
                            mVar6 = x1.f.f(r5);
                        }
                    }
                }
            }
            x1.f.b(eVar, mVar4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j3) {
        this.f8602b0 = j3;
    }

    public final void setOnViewTreeOwnersAvailable(oc.c cVar) {
        m viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            cVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f8608g0 = cVar;
    }

    public void setShowLayoutBounds(boolean z10) {
        this.P = z10;
    }

    public void setUncaughtExceptionHandler(x1.s1 s1Var) {
        this.T.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(boolean z10) {
        q qVar;
        x1.v0 v0Var = this.T;
        if (v0Var.f8190b.A() || ((o0.e) v0Var.f8193e.f8294g).f5136i != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    qVar = this.F0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                qVar = null;
            }
            if (v0Var.j(qVar)) {
                requestLayout();
            }
            v0Var.a(false);
            Trace.endSection();
        }
    }

    public final void u(x1.g0 g0Var, long j3) {
        x1.v0 v0Var = this.T;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            v0Var.k(g0Var, j3);
            if (!v0Var.f8190b.A()) {
                v0Var.a(false);
            }
            getRectManager().a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void v(x1.l1 l1Var, boolean z10) {
        ArrayList arrayList = this.D;
        if (!z10) {
            if (this.F) {
                return;
            }
            arrayList.remove(l1Var);
            ArrayList arrayList2 = this.E;
            if (arrayList2 != null) {
                arrayList2.remove(l1Var);
                return;
            }
            return;
        }
        if (!this.F) {
            arrayList.add(l1Var);
            return;
        }
        ArrayList arrayList3 = this.E;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.E = arrayList3;
        }
        arrayList3.add(l1Var);
    }

    public final void w() {
        if (this.L) {
            w0.t tVar = getSnapshotObserver().f8130a;
            synchronized (tVar.f7612g) {
                try {
                    o0.e eVar = tVar.f7611f;
                    int i10 = eVar.f5136i;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        w0.s sVar = (w0.s) eVar.f5134g[i12];
                        sVar.d();
                        if (!sVar.f7599f.j()) {
                            i11++;
                        } else if (i11 > 0) {
                            Object[] objArr = eVar.f5134g;
                            objArr[i12 - i11] = objArr[i12];
                        }
                    }
                    int i13 = i10 - i11;
                    Arrays.fill(eVar.f5134g, i13, i10, (Object) null);
                    eVar.f5136i = i13;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.L = false;
        }
        n0 n0Var = this.Q;
        if (n0Var != null) {
            i(n0Var);
        }
        z0.b bVar = this.K;
        if (bVar != null) {
            s.v vVar = bVar.f9056g;
            if (vVar.f6347d == 0 && bVar.f9057h) {
                ((AutofillManager) bVar.f9050a.f4957h).commit();
                bVar.f9057h = false;
            }
            if (vVar.f6347d != 0) {
                bVar.f9057h = true;
            }
        }
        while (this.f8645z0.h() && this.f8645z0.e(0) != null) {
            int i14 = this.f8645z0.f6220b;
            for (int i15 = 0; i15 < i14; i15++) {
                oc.a aVar = (oc.a) this.f8645z0.e(i15);
                s.a0 a0Var = this.f8645z0;
                if (i15 < 0 || i15 >= a0Var.f6220b) {
                    a0Var.m(i15);
                    throw null;
                }
                Object[] objArr2 = a0Var.f6219a;
                Object obj = objArr2[i15];
                objArr2[i15] = null;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.f8645z0.k(0, i14);
        }
    }

    public final void x(x1.g0 g0Var) {
        y yVar = this.f8642y;
        yVar.A = true;
        if (yVar.q()) {
            yVar.r(g0Var);
        }
        a1.h hVar = this.f8644z;
        hVar.f176m = true;
        if (hVar.j()) {
            hVar.f177n.s(ac.o.f277a);
        }
    }

    public final void y(x1.g0 g0Var, boolean z10, boolean z11, boolean z12) {
        x1.g0 s10;
        x1.g0 s11;
        x1.v0 v0Var = this.T;
        if (!z10) {
            if (v0Var.p(g0Var, z11) && z12) {
                E(g0Var);
                return;
            }
            return;
        }
        a5.c cVar = v0Var.f8190b;
        x1.g0 g0Var2 = g0Var.f8047m;
        x1.k0 k0Var = g0Var.J;
        if (g0Var2 == null) {
            u1.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int ordinal = k0Var.f8091d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    throw new ac.d();
                }
                if (!k0Var.f8092e || z11) {
                    k0Var.f8092e = true;
                    k0Var.f8103p.f8215z = true;
                    if (g0Var.R) {
                        return;
                    }
                    if ((pc.j.a(g0Var.I(), Boolean.TRUE) || x1.v0.h(g0Var)) && ((s10 = g0Var.s()) == null || !s10.J.f8092e)) {
                        cVar.b(g0Var, x1.t.f8161g);
                    } else if ((g0Var.H() || x1.v0.i(g0Var)) && ((s11 = g0Var.s()) == null || !s11.p())) {
                        cVar.b(g0Var, x1.t.f8163i);
                    }
                    if (v0Var.f8192d || !z12) {
                        return;
                    }
                    E(g0Var);
                    return;
                }
                return;
            }
        }
        v0Var.f8196h.b(new x1.u0(g0Var, true, z11));
    }

    public final void z(x1.g0 g0Var, boolean z10, boolean z11) {
        x1.k0 k0Var = g0Var.J;
        x1.t tVar = x1.t.f8164j;
        x1.v0 v0Var = this.T;
        if (!z10) {
            v0Var.getClass();
            int ordinal = k0Var.f8091d.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                throw new ac.d();
            }
            x1.g0 s10 = g0Var.s();
            boolean z12 = s10 == null || s10.H();
            if (!z11) {
                if (g0Var.p()) {
                    return;
                }
                if (g0Var.o() && g0Var.H() == z12 && g0Var.H() == k0Var.f8103p.f8214y) {
                    return;
                }
            }
            x1.x0 x0Var = k0Var.f8103p;
            x0Var.A = true;
            x0Var.B = true;
            if (!g0Var.R && x0Var.f8214y && z12) {
                if ((s10 == null || !s10.o()) && (s10 == null || !s10.p())) {
                    v0Var.f8190b.b(g0Var, tVar);
                }
                if (v0Var.f8192d) {
                    return;
                }
                E(null);
                return;
            }
            return;
        }
        a5.c cVar = v0Var.f8190b;
        int ordinal2 = k0Var.f8091d.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    throw new ac.d();
                }
            }
        }
        if ((k0Var.f8092e || k0Var.f8093f) && !z11) {
            return;
        }
        k0Var.f8093f = true;
        k0Var.f8094g = true;
        x1.x0 x0Var2 = k0Var.f8103p;
        x0Var2.A = true;
        x0Var2.B = true;
        if (g0Var.R) {
            return;
        }
        x1.g0 s11 = g0Var.s();
        if (pc.j.a(g0Var.I(), Boolean.TRUE) && ((s11 == null || !s11.J.f8092e) && (s11 == null || !s11.J.f8093f))) {
            cVar.b(g0Var, x1.t.f8162h);
        } else if (g0Var.H() && ((s11 == null || !s11.o()) && (s11 == null || !s11.p()))) {
            cVar.b(g0Var, tVar);
        }
        if (v0Var.f8192d) {
            return;
        }
        E(null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        pc.j.b(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i10, layoutParams, true);
    }

    public g getAccessibilityManager() {
        return this.A;
    }

    /* renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public h m50getClipboard() {
        return this.N;
    }

    /* renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public i m51getClipboardManager() {
        return this.M;
    }

    /* renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public b1.a m52getDragAndDropManager() {
        return this.f8622o;
    }

    public s.u getLayoutNodes() {
        return this.f8634u;
    }

    public r getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i10;
        generateDefaultLayoutParams.height = i11;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i10, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @ac.a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @ac.a
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui_release(x1.s1 s1Var) {
    }
}
