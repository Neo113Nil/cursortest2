package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
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
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.a42;
import defpackage.adi;
import defpackage.aeu;
import defpackage.ane;
import defpackage.aqd;
import defpackage.b6e;
import defpackage.bcx;
import defpackage.beu;
import defpackage.bfg;
import defpackage.bfo;
import defpackage.bkp;
import defpackage.bzf;
import defpackage.c28;
import defpackage.c3r;
import defpackage.c5p;
import defpackage.c9g;
import defpackage.cbv;
import defpackage.ce0;
import defpackage.cf0;
import defpackage.cg6;
import defpackage.cr;
import defpackage.cr3;
import defpackage.cw7;
import defpackage.cxb;
import defpackage.d5;
import defpackage.de0;
import defpackage.df0;
import defpackage.dfo;
import defpackage.dpc;
import defpackage.dwf;
import defpackage.dzd;
import defpackage.dzf;
import defpackage.e7o;
import defpackage.edi;
import defpackage.epi;
import defpackage.eqi;
import defpackage.eud;
import defpackage.f8j;
import defpackage.fc6;
import defpackage.fe0;
import defpackage.fe2;
import defpackage.feh;
import defpackage.ff7;
import defpackage.fs7;
import defpackage.g2r;
import defpackage.ga6;
import defpackage.ge0;
import defpackage.ge2;
import defpackage.gf0;
import defpackage.gfh;
import defpackage.ghh;
import defpackage.gj0;
import defpackage.gld;
import defpackage.gpa;
import defpackage.gpi;
import defpackage.grb;
import defpackage.gvt;
import defpackage.gzd;
import defpackage.h5n;
import defpackage.ha0;
import defpackage.he0;
import defpackage.hes;
import defpackage.hfh;
import defpackage.hfo;
import defpackage.hfp;
import defpackage.hqe;
import defpackage.i4s;
import defpackage.ib;
import defpackage.ide;
import defpackage.ie0;
import defpackage.ie2;
import defpackage.ieh;
import defpackage.if0;
import defpackage.iur;
import defpackage.jb0;
import defpackage.je0;
import defpackage.jei;
import defpackage.jf0;
import defpackage.jfh;
import defpackage.jfm;
import defpackage.jfp;
import defpackage.jh3;
import defpackage.jsk;
import defpackage.jx7;
import defpackage.k8j;
import defpackage.ke2;
import defpackage.kfm;
import defpackage.kma;
import defpackage.kpc;
import defpackage.kpf;
import defpackage.kpv;
import defpackage.l1b;
import defpackage.l1j;
import defpackage.l48;
import defpackage.lco;
import defpackage.lcs;
import defpackage.le0;
import defpackage.le2;
import defpackage.loc;
import defpackage.lpv;
import defpackage.lsk;
import defpackage.lx7;
import defpackage.m5;
import defpackage.me0;
import defpackage.me2;
import defpackage.met;
import defpackage.mpf;
import defpackage.msd;
import defpackage.ne0;
import defpackage.net;
import defpackage.nfm;
import defpackage.ng0;
import defpackage.nm6;
import defpackage.npf;
import defpackage.nw7;
import defpackage.nyf;
import defpackage.o5b;
import defpackage.ocs;
import defpackage.ofm;
import defpackage.opf;
import defpackage.ouj;
import defpackage.ovg;
import defpackage.oxa;
import defpackage.pe0;
import defpackage.pnn;
import defpackage.ppc;
import defpackage.pt0;
import defpackage.pu3;
import defpackage.q9;
import defpackage.qd0;
import defpackage.qe0;
import defpackage.qf0;
import defpackage.qfp;
import defpackage.qgg;
import defpackage.qld;
import defpackage.qnn;
import defpackage.qpf;
import defpackage.r3b;
import defpackage.rds;
import defpackage.re0;
import defpackage.rf0;
import defpackage.rj7;
import defpackage.rm7;
import defpackage.rne;
import defpackage.rwd;
import defpackage.sd0;
import defpackage.se0;
import defpackage.sme;
import defpackage.smp;
import defpackage.sne;
import defpackage.soi;
import defpackage.swf;
import defpackage.szf;
import defpackage.td0;
import defpackage.tf0;
import defpackage.tfp;
import defpackage.th0;
import defpackage.tne;
import defpackage.toc;
import defpackage.toi;
import defpackage.tpi;
import defpackage.tzj;
import defpackage.ud0;
import defpackage.ufm;
import defpackage.ufp;
import defpackage.uh0;
import defpackage.uj0;
import defpackage.une;
import defpackage.uoc;
import defpackage.uod;
import defpackage.uwf;
import defpackage.uwg;
import defpackage.uzj;
import defpackage.v2r;
import defpackage.vci;
import defpackage.vpe;
import defpackage.vx7;
import defpackage.wdu;
import defpackage.wgj;
import defpackage.whj;
import defpackage.woo;
import defpackage.wpe;
import defpackage.wr3;
import defpackage.wzj;
import defpackage.x6k;
import defpackage.x97;
import defpackage.xci;
import defpackage.xeu;
import defpackage.xg0;
import defpackage.xgj;
import defpackage.xof;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.xr3;
import defpackage.xv;
import defpackage.y8p;
import defpackage.ybs;
import defpackage.yci;
import defpackage.yd5;
import defpackage.ye0;
import defpackage.ygj;
import defpackage.yk3;
import defpackage.yn7;
import defpackage.ynn;
import defpackage.yr3;
import defpackage.ywf;
import defpackage.zco;
import defpackage.zi0;
import defpackage.znn;
import defpackage.zwf;
import defpackage.zwg;
import defpackage.zx7;
import defpackage.zy;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements uzj, bfo, ieh, yn7 {
    public static Class j1;
    public static Method k1;
    public Function1 A;
    public final float[] A0;
    public final qd0 B;
    public long B0;
    public final sd0 C;
    public boolean C0;
    public boolean D;
    public long D0;
    public final de0 E;
    public boolean E0;
    public final ce0 F;
    public final x6k F0;
    public final wzj G;
    public final zx7 G0;
    public boolean H;
    public Function1 H0;
    public uj0 I;
    public final ib I0;
    public gpa J;
    public final fe0 J0;
    public ga6 K;
    public final ge0 K0;
    public boolean L;
    public final ocs L0;
    public final lcs M0;
    public final AtomicReference N0;
    public final nw7 O0;
    public final l48 P0;
    public final x6k Q0;
    public int R0;
    public final x6k S0;
    public final rm7 T0;
    public final une U0;
    public final adi V0;
    public final zi0 W0;
    public MotionEvent X0;
    public long Y0;
    public final y8p Z0;
    public long a;
    public final gpi a1;
    public final boolean b;
    public final q9 b1;
    public final opf c;
    public final he0 c1;
    public final x6k d;
    public boolean d1;
    public final uoc e;
    public final pe0 e1;
    public CoroutineContext f;
    public final wr3 f1;
    public final ng0 g;
    public boolean g1;
    public final dwf h;
    public final fc6 h1;
    public final pu3 i;
    public final qe0 i1;
    public final gj0 j;
    public final mpf k;
    public final soi l;
    public final znn m;
    public final AndroidComposeView n;
    public final tfp o;
    public final ye0 p;
    public tf0 q;
    public final jb0 r;
    public final xg0 s;
    public final me2 t;
    public final ArrayList u;
    public ArrayList v;
    public final hfh v0;
    public boolean w;
    public long w0;
    public boolean x;
    public final int[] x0;
    public final cr3 y;
    public final float[] y0;
    public final yk3 z;
    public final float[] z0;

    /* JADX WARN: Type inference failed for: r1v35, types: [ge0] */
    public AndroidComposeView(@NotNull Context context, @NotNull CoroutineContext coroutineContext) {
        super(context);
        sd0 sd0Var;
        this.a = 9205357640488583168L;
        int i = 1;
        this.b = true;
        this.c = new opf();
        lx7 i2 = ff7.i(context);
        rwd rwdVar = rwd.h;
        this.d = new x6k(i2, rwdVar);
        o5b o5bVar = new o5b();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(o5bVar);
        edi ediVar = new edi() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // defpackage.edi
            public final xci e() {
                jh3 jh3Var = new jh3();
                jh3Var.o = AndroidComposeView.this;
                return jh3Var;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return AndroidComposeView.this.hashCode();
            }

            @Override // defpackage.edi
            public final void j(xci xciVar) {
                ((jh3) xciVar).o = AndroidComposeView.this;
            }
        };
        int i3 = 0;
        int i4 = 0;
        this.e = new uoc(new m5(1, this, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", i3, 10), new le0(2, this, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", i3, 0), new m5(1, this, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", i3, 11), new zy(i4, this, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", i3, 12), new zy(i4, this, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", i3, 13), new me0(i4, 0, AndroidComposeView.class, this, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;"));
        this.f = coroutineContext;
        this.g = new ng0();
        this.h = new dwf();
        yci a = androidx.compose.ui.input.key.a.a(vci.a, new je0(this, i));
        yci a2 = androidx.compose.ui.input.rotary.a.a();
        this.i = new pu3();
        this.j = new gj0(ViewConfiguration.get(context));
        mpf mpfVar = new mpf(3);
        mpfVar.b0(dfo.c);
        mpfVar.Z(getDensity());
        mpfVar.d0(getViewConfiguration());
        mpfVar.c0(emptySemanticsElement.f(a2).f(a).f(((uoc) getFocusOwner()).i).f(getDragAndDropManager().c).f(ediVar));
        this.k = mpfVar;
        soi soiVar = vpe.a;
        this.l = new soi();
        m0getLayoutNodes();
        this.m = new znn();
        this.n = this;
        this.o = new tfp(getRoot(), o5bVar, m0getLayoutNodes());
        ye0 ye0Var = new ye0(this);
        this.p = ye0Var;
        final AndroidComposeView androidComposeView = this;
        androidComposeView.q = new tf0(androidComposeView, new zy(0, androidComposeView, jf0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 11));
        androidComposeView.r = new jb0(context);
        androidComposeView.s = new xg0(androidComposeView);
        androidComposeView.t = new me2();
        androidComposeView.u = new ArrayList();
        androidComposeView.y = new cr3();
        mpf root = androidComposeView.getRoot();
        yk3 yk3Var = new yk3();
        yk3Var.b = root;
        yk3Var.c = new dzd((ane) root.F.c);
        int i5 = 0;
        yk3Var.d = new oxa(28, (byte) 0);
        yk3Var.e = new gzd();
        androidComposeView.z = yk3Var;
        androidComposeView.A = d5.z;
        androidComposeView.B = h() ? new qd0(androidComposeView, androidComposeView.getAutofillTree()) : null;
        if (h()) {
            AutofillManager d = td0.d(context.getSystemService(td0.e()));
            if (d == null) {
                throw ouj.f("Autofill service could not be located.");
            }
            androidComposeView = this;
            sd0Var = new sd0(new ke2(d), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            sd0Var = null;
        }
        androidComposeView.C = sd0Var;
        androidComposeView.E = new de0(context);
        androidComposeView.F = new ce0(androidComposeView.getClipboardManager());
        androidComposeView.G = new wzj(new je0(androidComposeView, r3));
        androidComposeView.v0 = new hfh(androidComposeView.getRoot());
        long j = Integer.MAX_VALUE;
        androidComposeView.w0 = (j & 4294967295L) | (j << 32);
        androidComposeView.x0 = new int[]{0, 0};
        float[] a3 = feh.a();
        androidComposeView.y0 = a3;
        androidComposeView.z0 = feh.a();
        androidComposeView.A0 = feh.a();
        androidComposeView.B0 = -1L;
        androidComposeView.D0 = 9187343241974906880L;
        androidComposeView.E0 = true;
        androidComposeView.F0 = szf.g0(null);
        androidComposeView.G0 = szf.U(new pe0(androidComposeView, r3));
        androidComposeView.I0 = new ib(i, androidComposeView);
        androidComposeView.J0 = new fe0(i5, androidComposeView);
        androidComposeView.K0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: ge0
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                AndroidComposeView.this.U0.a.setValue(new sne(z ? 1 : 2));
            }
        };
        ocs ocsVar = new ocs(androidComposeView.getView(), androidComposeView);
        androidComposeView.L0 = ocsVar;
        androidComposeView.M0 = new lcs(ocsVar);
        androidComposeView.N0 = new AtomicReference(null);
        androidComposeView.O0 = new nw7(androidComposeView.getTextInputService());
        androidComposeView.P0 = new l48(13);
        androidComposeView.Q0 = new x6k(cxb.N(context), rwdVar);
        Configuration configuration = context.getResources().getConfiguration();
        int i6 = Build.VERSION.SDK_INT;
        androidComposeView.R0 = i6 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        xof xofVar = layoutDirection != 0 ? layoutDirection != 1 ? null : xof.b : xof.a;
        androidComposeView.S0 = szf.g0(xofVar == null ? xof.a : xofVar);
        androidComposeView.T0 = new rm7(androidComposeView, 1);
        androidComposeView.U0 = new une(androidComposeView.isInTouchMode() ? 1 : 2, new je0(androidComposeView, i5));
        androidComposeView.V0 = new adi(androidComposeView);
        androidComposeView.W0 = new zi0(androidComposeView);
        androidComposeView.Z0 = new y8p();
        androidComposeView.a1 = new gpi();
        androidComposeView.b1 = new q9(4, androidComposeView);
        androidComposeView.c1 = new he0(i5, androidComposeView);
        androidComposeView.e1 = new pe0(androidComposeView, i);
        androidComposeView.f1 = i6 < 29 ? new xr3(a3) : new yr3();
        androidComposeView.addOnAttachStateChangeListener(androidComposeView.q);
        androidComposeView.setWillNotDraw(false);
        androidComposeView.setFocusable(true);
        if (i6 >= 26) {
            if0.a.a(androidComposeView, 1, false);
        }
        androidComposeView.setFocusableInTouchMode(true);
        androidComposeView.setClipChildren(false);
        wdu.q(androidComposeView, ye0Var);
        androidComposeView.setOnDragListener(androidComposeView.getDragAndDropManager());
        androidComposeView.getRoot().d(androidComposeView);
        if (i6 >= 29) {
            df0.a.a(androidComposeView);
        }
        androidComposeView.h1 = i6 >= 31 ? new fc6(3) : null;
        androidComposeView.i1 = new qe0(androidComposeView);
    }

    public static final void b(AndroidComposeView androidComposeView, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int d;
        ye0 ye0Var = androidComposeView.p;
        if (Intrinsics.d(str, ye0Var.G)) {
            int d2 = ye0Var.E.d(i);
            if (d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d2);
                return;
            }
            return;
        }
        if (!Intrinsics.d(str, ye0Var.H) || (d = ye0Var.F.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, d);
    }

    public static final boolean f(AndroidComposeView androidComposeView, loc locVar, ynn ynnVar) {
        Integer K;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            return true;
        }
        return super.requestFocus((locVar == null || (K = yd5.K(locVar.a)) == null) ? 130 : K.intValue(), ynnVar != null ? uwf.D(ynnVar) : null);
    }

    @vx7
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @vx7
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ie0 get_viewTreeOwners() {
        return (ie0) this.F0.getValue();
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void i(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).x();
            } else if (childAt instanceof ViewGroup) {
                i((ViewGroup) childAt);
            }
        }
    }

    public static long j(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            met metVar = net.b;
            return (0 << 32) | size;
        }
        if (mode == 0) {
            met metVar2 = net.b;
            return (0 << 32) | Integer.MAX_VALUE;
        }
        if (mode != 1073741824) {
            e7o.n();
            return 0L;
        }
        long j = size;
        met metVar3 = net.b;
        return j | (j << 32);
    }

    public static View k(int i, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (Intrinsics.d(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View k = k(i, viewGroup.getChildAt(i2));
                    if (k != null) {
                        return k;
                    }
                }
            }
        }
        return null;
    }

    public static void n(mpf mpfVar) {
        mpfVar.C();
        eqi y = mpfVar.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            n((mpf) objArr[i2]);
        }
    }

    public static boolean p(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !jei.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private void setDensity(jx7 jx7Var) {
        this.d.setValue(jx7Var);
    }

    private void setFontFamilyResolver(ppc ppcVar) {
        this.Q0.setValue(ppcVar);
    }

    private void setLayoutDirection(xof xofVar) {
        this.S0.setValue(xofVar);
    }

    private final void set_viewTreeOwners(ie0 ie0Var) {
        this.F0.setValue(ie0Var);
    }

    public final void A(mpf mpfVar, boolean z, boolean z2, boolean z3) {
        mpf u;
        mpf u2;
        zwg zwgVar;
        npf npfVar;
        hfh hfhVar = this.v0;
        if (!z) {
            if (hfhVar.q(mpfVar, z2) && z3) {
                G(mpfVar);
                return;
            }
            return;
        }
        pt0 pt0Var = hfhVar.b;
        mpf mpfVar2 = mpfVar.h;
        qpf qpfVar = mpfVar.G;
        if (mpfVar2 == null) {
            sme.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int ordinal = qpfVar.d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    b6e.s();
                    return;
                }
                if (!qpfVar.e || z2) {
                    qpfVar.e = true;
                    qpfVar.p.v = true;
                    if (mpfVar.v0) {
                        return;
                    }
                    if ((Intrinsics.d(mpfVar.I(), Boolean.TRUE) || (qpfVar.e && (mpfVar.s() == kpf.a || !((zwgVar = qpfVar.q) == null || (npfVar = zwgVar.s) == null || !npfVar.e())))) && ((u = mpfVar.u()) == null || !u.G.e)) {
                        pt0Var.k(mpfVar, true);
                    } else if ((mpfVar.H() || hfh.i(mpfVar)) && ((u2 = mpfVar.u()) == null || !u2.r())) {
                        pt0Var.k(mpfVar, false);
                    }
                    if (hfhVar.d || !z3) {
                        return;
                    }
                    G(mpfVar);
                    return;
                }
                return;
            }
        }
        hfhVar.h.d(new gfh(mpfVar, true, z2));
    }

    public final void B(mpf mpfVar, boolean z, boolean z2) {
        qpf qpfVar = mpfVar.G;
        hfh hfhVar = this.v0;
        if (!z) {
            hfhVar.getClass();
            int ordinal = qpfVar.d.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                b6e.s();
                return;
            }
            mpf u = mpfVar.u();
            boolean z3 = u == null || u.H();
            if (!z2) {
                if (mpfVar.r()) {
                    return;
                }
                if (mpfVar.q() && mpfVar.H() == z3 && mpfVar.H() == qpfVar.p.u) {
                    return;
                }
            }
            jfh jfhVar = qpfVar.p;
            jfhVar.w = true;
            jfhVar.x = true;
            if (!mpfVar.v0 && jfhVar.u && z3) {
                if ((u == null || !u.q()) && (u == null || !u.r())) {
                    hfhVar.b.k(mpfVar, false);
                }
                if (hfhVar.d) {
                    return;
                }
                G(null);
                return;
            }
            return;
        }
        pt0 pt0Var = hfhVar.b;
        int ordinal2 = qpfVar.d.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    b6e.s();
                    return;
                }
            }
        }
        if ((qpfVar.e || qpfVar.f) && !z2) {
            return;
        }
        qpfVar.f = true;
        qpfVar.g = true;
        jfh jfhVar2 = qpfVar.p;
        jfhVar2.w = true;
        jfhVar2.x = true;
        if (mpfVar.v0) {
            return;
        }
        mpf u2 = mpfVar.u();
        if (Intrinsics.d(mpfVar.I(), Boolean.TRUE) && ((u2 == null || !u2.G.e) && (u2 == null || !u2.G.f))) {
            pt0Var.k(mpfVar, true);
        } else if (mpfVar.H() && ((u2 == null || !u2.q()) && (u2 == null || !u2.r()))) {
            pt0Var.k(mpfVar, false);
        }
        if (hfhVar.d) {
            return;
        }
        G(null);
    }

    public final void C() {
        ye0 ye0Var = this.p;
        ye0Var.A = true;
        if (ye0Var.u() && !ye0Var.L) {
            ye0Var.L = true;
            ye0Var.l.post(ye0Var.M);
        }
        tf0 tf0Var = this.q;
        tf0Var.g = true;
        if (!tf0Var.f() || tf0Var.n) {
            return;
        }
        tf0Var.n = true;
        tf0Var.i.post(tf0Var.o);
    }

    public final void D() {
        if (this.C0) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.B0) {
            this.B0 = currentAnimationTimeMillis;
            wr3 wr3Var = this.f1;
            float[] fArr = this.z0;
            wr3Var.a(this, fArr);
            yd5.z(fArr, this.A0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.x0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = f2 - iArr[1];
            this.D0 = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        }
    }

    public final void E(MotionEvent motionEvent) {
        this.B0 = AnimationUtils.currentAnimationTimeMillis();
        wr3 wr3Var = this.f1;
        float[] fArr = this.z0;
        wr3Var.a(this, fArr);
        yd5.z(fArr, this.A0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long b = feh.b((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (b >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (b & 4294967295L));
        this.D0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final void F(tzj tzjVar) {
        y8p y8pVar;
        eqi eqiVar;
        Reference poll;
        if (this.J != null) {
            c28 c28Var = xeu.p;
        }
        do {
            y8pVar = this.Z0;
            ReferenceQueue referenceQueue = (ReferenceQueue) y8pVar.c;
            eqiVar = (eqi) y8pVar.b;
            poll = referenceQueue.poll();
            if (poll != null) {
                eqiVar.l(poll);
            }
        } while (poll != null);
        eqiVar.d(new WeakReference(tzjVar, (ReferenceQueue) y8pVar.c));
        this.u.remove(tzjVar);
    }

    public final void G(mpf mpfVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (mpfVar != null) {
            while (mpfVar != null && mpfVar.G.p.l == kpf.a) {
                if (!this.L) {
                    mpf u = mpfVar.u();
                    if (u == null) {
                        break;
                    }
                    long j = ((ane) u.F.c).d;
                    if (ga6.g(j) && ga6.f(j)) {
                        break;
                    }
                }
                mpfVar = mpfVar.u();
            }
            if (mpfVar == getRoot()) {
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
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.D0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.D0 & 4294967295L));
        return feh.b((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), this.A0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int J(MotionEvent motionEvent) {
        Object obj;
        nfm nfmVar;
        int u;
        int actionMasked;
        if (this.g1) {
            this.g1 = false;
            int metaState = motionEvent.getMetaState();
            this.h.getClass();
            lpv.a.setValue(new ufm(metaState));
        }
        cr3 cr3Var = this.y;
        aqd a = cr3Var.a(motionEvent, this);
        yk3 yk3Var = this.z;
        if (a == null) {
            if (!yk3Var.a) {
                ((ovg) ((oxa) yk3Var.d).b).b();
                ((dzd) yk3Var.c).f();
            }
            return 0;
        }
        List list = (List) a.b;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = list.get(size);
                if (((nfm) obj).e) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
            nfmVar = (nfm) obj;
            if (nfmVar != null) {
                this.a = nfmVar.d;
            }
            u = yk3Var.u(a, this, q(motionEvent));
            actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 && actionMasked != 5) || (u & 1) != 0) {
                return u;
            }
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            ((SparseBooleanArray) cr3Var.e).delete(pointerId);
            ((SparseLongArray) cr3Var.d).delete(pointerId);
            return u;
        }
        obj = null;
        nfmVar = (nfm) obj;
        if (nfmVar != null) {
        }
        u = yk3Var.u(a, this, q(motionEvent));
        actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
        }
        int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
        ((SparseBooleanArray) cr3Var.e).delete(pointerId2);
        ((SparseLongArray) cr3Var.d).delete(pointerId2);
        return u;
    }

    public final void K(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i2 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((i2 < 0 || i5 < i2) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            float f = pointerCoords.x;
            long t = t((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (t >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (t & 4294967295L));
            i5++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        aqd a = this.y.a(obtain, this);
        a.getClass();
        this.z.u(a, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(Function2 function2, cg6 cg6Var) {
        se0 se0Var;
        int i;
        if (cg6Var instanceof se0) {
            se0Var = (se0) cg6Var;
            int i2 = se0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                se0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = se0Var.j;
                nm6 nm6Var = nm6.a;
                i = se0Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    je0 je0Var = new je0(this, 3);
                    se0Var.l = 1;
                    if (gld.Q(new lco(je0Var, this.N0, function2, (Continuation) null), se0Var) == nm6Var) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
            }
        }
        se0Var = new se0(this, cg6Var);
        Object obj2 = se0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = se0Var.l;
        if (i != 0) {
        }
        rj7.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M() {
        boolean z;
        long j;
        long Q;
        float[] fArr;
        int t;
        eud eudVar;
        boolean z2;
        int[] iArr = this.x0;
        getLocationOnScreen(iArr);
        long j2 = this.w0;
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        int i3 = iArr[0];
        if (i != i3 || i2 != iArr[1] || this.B0 < 0) {
            this.w0 = (4294967295L & iArr[1]) | (i3 << 32);
            if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
                getRoot().G.p.H0();
                z = true;
                D();
                znn rectManager = getRectManager();
                j = this.w0;
                Q = xv.Q(this.D0);
                rectManager.getClass();
                fArr = this.z0;
                t = zwf.t(fArr);
                eudVar = rectManager.b;
                if ((t & 2) != 0) {
                    fArr = null;
                }
                if (wpe.b(Q, eudVar.b)) {
                    eudVar.b = Q;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!wpe.b(j, eudVar.c)) {
                    eudVar.c = j;
                    z2 = true;
                }
                if (fArr != null) {
                    z2 = true;
                }
                rectManager.e = !z2 || rectManager.e;
                this.v0.b(z);
                getRectManager().a();
            }
        }
        z = false;
        D();
        znn rectManager2 = getRectManager();
        j = this.w0;
        Q = xv.Q(this.D0);
        rectManager2.getClass();
        fArr = this.z0;
        t = zwf.t(fArr);
        eudVar = rectManager2.b;
        if ((t & 2) != 0) {
        }
        if (wpe.b(Q, eudVar.b)) {
        }
        if (!wpe.b(j, eudVar.c)) {
        }
        if (fArr != null) {
        }
        rectManager2.e = !z2 || rectManager2.e;
        this.v0.b(z);
        getRectManager().a();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        if (h()) {
            sd0 sd0Var = this.C;
            if (sd0Var != null) {
                sd0Var.a(sparseArray);
            }
            qd0 qd0Var = this.B;
            if (qd0Var != null) {
                gvt.K(qd0Var, sparseArray);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.p.m(i, this.a, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.p.m(i, this.a, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            n(getRoot());
        }
        u(true);
        g2r.k().m();
        this.w = true;
        pu3 pu3Var = this.i;
        ud0 ud0Var = pu3Var.a;
        Canvas canvas2 = ud0Var.a;
        ud0Var.a = canvas;
        getRoot().j(ud0Var, null);
        pu3Var.a.a = canvas2;
        ArrayList arrayList = this.u;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((tzj) arrayList.get(i)).k();
            }
        }
        if (xeu.t) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        arrayList.clear();
        this.w = false;
        ArrayList arrayList2 = this.v;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        getRectManager().a();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        hfo hfoVar;
        int size;
        cr crVar;
        xci xciVar;
        cr crVar2;
        if (this.d1) {
            he0 he0Var = this.c1;
            removeCallbacks(he0Var);
            if (motionEvent.getActionMasked() == 8) {
                this.d1 = false;
            } else {
                he0Var.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (p(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(RemoteCameraConfig.Camera.BITRATE)) {
            return (m(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            Method method = beu.a;
            gvt.v(viewConfiguration);
        } else {
            beu.a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i >= 26) {
            gvt.u(viewConfiguration);
        } else {
            beu.a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        toc focusOwner = getFocusOwner();
        ha0 ha0Var = new ha0(3, this, motionEvent);
        uoc uocVar = (uoc) focusOwner;
        if (uocVar.g.f) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        dpc x = ff7.x(uocVar.f);
        if (x != null) {
            if (!x.a.n) {
                sme.b("visitAncestors called on an unattached node");
            }
            xci xciVar2 = x.a;
            mpf F = bcx.F(x);
            loop0: while (true) {
                if (F == null) {
                    xciVar = null;
                    break;
                }
                if ((((xci) F.F.f).d & 16384) != 0) {
                    while (xciVar2 != null) {
                        if ((xciVar2.c & 16384) != 0) {
                            eqi eqiVar = null;
                            xciVar = xciVar2;
                            while (xciVar != null) {
                                if (xciVar instanceof hfo) {
                                    break loop0;
                                }
                                if ((xciVar.c & 16384) != 0 && (xciVar instanceof cw7)) {
                                    int i2 = 0;
                                    for (xci xciVar3 = ((cw7) xciVar).p; xciVar3 != null; xciVar3 = xciVar3.f) {
                                        if ((xciVar3.c & 16384) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                xciVar = xciVar3;
                                            } else {
                                                if (eqiVar == null) {
                                                    eqiVar = new eqi(new xci[16]);
                                                }
                                                if (xciVar != null) {
                                                    eqiVar.d(xciVar);
                                                    xciVar = null;
                                                }
                                                eqiVar.d(xciVar3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                xciVar = bcx.p(eqiVar);
                            }
                        }
                        xciVar2 = xciVar2.e;
                    }
                }
                F = F.u();
                xciVar2 = (F == null || (crVar2 = F.F) == null) ? null : (i4s) crVar2.e;
            }
            hfoVar = (hfo) xciVar;
        } else {
            hfoVar = null;
        }
        if (hfoVar != null) {
            if (!hfoVar.a.n) {
                sme.b("visitAncestors called on an unattached node");
            }
            xci xciVar4 = hfoVar.a.e;
            mpf F2 = bcx.F(hfoVar);
            ArrayList arrayList = null;
            while (F2 != null) {
                if ((((xci) F2.F.f).d & 16384) != 0) {
                    while (xciVar4 != null) {
                        if ((xciVar4.c & 16384) != 0) {
                            xci xciVar5 = xciVar4;
                            eqi eqiVar2 = null;
                            while (xciVar5 != null) {
                                if (xciVar5 instanceof hfo) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(xciVar5);
                                } else if ((xciVar5.c & 16384) != 0 && (xciVar5 instanceof cw7)) {
                                    int i3 = 0;
                                    for (xci xciVar6 = ((cw7) xciVar5).p; xciVar6 != null; xciVar6 = xciVar6.f) {
                                        if ((xciVar6.c & 16384) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                xciVar5 = xciVar6;
                                            } else {
                                                if (eqiVar2 == null) {
                                                    eqiVar2 = new eqi(new xci[16]);
                                                }
                                                if (xciVar5 != null) {
                                                    eqiVar2.d(xciVar5);
                                                    xciVar5 = null;
                                                }
                                                eqiVar2.d(xciVar6);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                xciVar5 = bcx.p(eqiVar2);
                            }
                        }
                        xciVar4 = xciVar4.e;
                    }
                }
                F2 = F2.u();
                xciVar4 = (F2 == null || (crVar = F2.F) == null) ? null : (i4s) crVar.e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i4 = size - 1;
                    ((hfo) arrayList.get(size)).getClass();
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
            xci xciVar7 = hfoVar.a;
            eqi eqiVar3 = null;
            while (xciVar7 != null) {
                if (xciVar7 instanceof hfo) {
                } else if ((xciVar7.c & 16384) != 0 && (xciVar7 instanceof cw7)) {
                    int i5 = 0;
                    for (xci xciVar8 = ((cw7) xciVar7).p; xciVar8 != null; xciVar8 = xciVar8.f) {
                        if ((xciVar8.c & 16384) != 0) {
                            i5++;
                            if (i5 == 1) {
                                xciVar7 = xciVar8;
                            } else {
                                if (eqiVar3 == null) {
                                    eqiVar3 = new eqi(new xci[16]);
                                }
                                if (xciVar7 != null) {
                                    eqiVar3.d(xciVar7);
                                    xciVar7 = null;
                                }
                                eqiVar3.d(xciVar8);
                            }
                        }
                    }
                    if (i5 == 1) {
                    }
                }
                xciVar7 = bcx.p(eqiVar3);
            }
            if (!((Boolean) ha0Var.invoke()).booleanValue()) {
                xci xciVar9 = hfoVar.a;
                eqi eqiVar4 = null;
                while (xciVar9 != null) {
                    if (xciVar9 instanceof hfo) {
                    } else if ((xciVar9.c & 16384) != 0 && (xciVar9 instanceof cw7)) {
                        int i6 = 0;
                        for (xci xciVar10 = ((cw7) xciVar9).p; xciVar10 != null; xciVar10 = xciVar10.f) {
                            if ((xciVar10.c & 16384) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    xciVar9 = xciVar10;
                                } else {
                                    if (eqiVar4 == null) {
                                        eqiVar4 = new eqi(new xci[16]);
                                    }
                                    if (xciVar9 != null) {
                                        eqiVar4.d(xciVar9);
                                        xciVar9 = null;
                                    }
                                    eqiVar4.d(xciVar10);
                                }
                            }
                        }
                        if (i6 == 1) {
                        }
                    }
                    xciVar9 = bcx.p(eqiVar4);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        d5 d5Var = ((hfo) arrayList.get(i7)).o;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0156, code lost:
    
        if (r(r24) == false) goto L69;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.d1;
        he0 he0Var = this.c1;
        if (z) {
            removeCallbacks(he0Var);
            he0Var.run();
        }
        if (!p(motionEvent) && isAttachedToWindow()) {
            ye0 ye0Var = this.p;
            AndroidComposeView androidComposeView = ye0Var.d;
            AccessibilityManager accessibilityManager = ye0Var.g;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    androidComposeView.u(true);
                    gzd gzdVar = new gzd();
                    cr crVar = androidComposeView.getRoot().F;
                    f8j f8jVar = (f8j) crVar.d;
                    zco zcoVar = f8j.H;
                    ((f8j) crVar.d).g1(f8j.L, f8jVar.X0((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L)), gzdVar, 1, true);
                    gpi gpiVar = gzdVar.a;
                    for (int i2 = gpiVar.b - 1; -1 < i2; i2--) {
                        Object e = gpiVar.e(i2);
                        e.getClass();
                        mpf F = bcx.F((xci) e);
                        if (androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(F) != null) {
                            break;
                        }
                        if (F.F.M(8)) {
                            int z2 = ye0Var.z(F.b);
                            qfp g = bfg.g(F, false);
                            if (bkp.l0(g)) {
                                if (!g.i().a.c(ufp.y)) {
                                    i = z2;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i = Integer.MIN_VALUE;
                    androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    int i3 = ye0Var.e;
                    if (i3 != i) {
                        ye0Var.e = i;
                        ye0.D(ye0Var, i, 128, null, 12);
                        ye0.D(ye0Var, i3, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i4 = ye0Var.e;
                    if (i4 == Integer.MIN_VALUE) {
                        androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    } else if (i4 != Integer.MIN_VALUE) {
                        ye0Var.e = Integer.MIN_VALUE;
                        ye0.D(ye0Var, Integer.MIN_VALUE, 128, null, 12);
                        ye0.D(ye0Var, i4, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && q(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.X0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.X0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.d1 = true;
                        postDelayed(he0Var, 8L);
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
            return ((uoc) getFocusOwner()).c(keyEvent, new ha0(2, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.h.getClass();
        lpv.a.setValue(new ufm(metaState));
        return ((uoc) getFocusOwner()).c(keyEvent, grb.v) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        cr crVar;
        if (isFocused()) {
            uoc uocVar = (uoc) getFocusOwner();
            if (uocVar.g.f) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                dpc x = ff7.x(uocVar.f);
                if (x != null) {
                    if (!x.a.n) {
                        sme.b("visitAncestors called on an unattached node");
                    }
                    xci xciVar = x.a;
                    mpf F = bcx.F(x);
                    while (F != null) {
                        if ((((xci) F.F.f).d & SQLiteDatabase.OPEN_SHAREDCACHE) != 0) {
                            while (xciVar != null) {
                                if ((xciVar.c & SQLiteDatabase.OPEN_SHAREDCACHE) != 0) {
                                    xci xciVar2 = xciVar;
                                    eqi eqiVar = null;
                                    while (xciVar2 != null) {
                                        if ((xciVar2.c & SQLiteDatabase.OPEN_SHAREDCACHE) != 0 && (xciVar2 instanceof cw7)) {
                                            int i = 0;
                                            for (xci xciVar3 = ((cw7) xciVar2).p; xciVar3 != null; xciVar3 = xciVar3.f) {
                                                if ((xciVar3.c & SQLiteDatabase.OPEN_SHAREDCACHE) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        xciVar2 = xciVar3;
                                                    } else {
                                                        if (eqiVar == null) {
                                                            eqiVar = new eqi(new xci[16]);
                                                        }
                                                        if (xciVar2 != null) {
                                                            eqiVar.d(xciVar2);
                                                            xciVar2 = null;
                                                        }
                                                        eqiVar.d(xciVar3);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        xciVar2 = bcx.p(eqiVar);
                                    }
                                }
                                xciVar = xciVar.e;
                            }
                        }
                        F = F.u();
                        xciVar = (F == null || (crVar = F.F) == null) ? null : (i4s) crVar.e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            cf0.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.d1) {
            he0 he0Var = this.c1;
            removeCallbacks(he0Var);
            MotionEvent motionEvent2 = this.X0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.d1 = false;
            } else {
                he0Var.run();
            }
        }
        if (!p(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || r(motionEvent))) {
            int m = m(motionEvent);
            if ((m & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((m & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return k(i, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        ynn p;
        if (view == null || this.v0.c) {
            return super.focusSearch(view, i);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (view == this) {
            dpc x = ff7.x(((uoc) getFocusOwner()).f);
            p = x != null ? ff7.y(x) : null;
            if (p == null) {
                p = yd5.p(view, this);
            }
        } else {
            p = yd5.p(view, this);
        }
        loc O = yd5.O(i);
        int i2 = O != null ? O.a : 6;
        xqn xqnVar = new xqn();
        if (((uoc) getFocusOwner()).d(i2, p, new ne0(xqnVar, 0)) != null) {
            Object obj = xqnVar.a;
            if (obj != null) {
                if (findNextFocus != null) {
                    if (i2 == 1 || i2 == 2) {
                        return super.focusSearch(view, i);
                    }
                    obj.getClass();
                    if (c9g.G(ff7.y((dpc) obj), yd5.p(findNextFocus, this), p, i2)) {
                    }
                }
                return this;
            }
            if (findNextFocus == null) {
            }
            return findNextFocus;
        }
        return view;
    }

    @NotNull
    public final uj0 getAndroidViewsHandler$ui_release() {
        if (this.I == null) {
            uj0 uj0Var = new uj0(getContext());
            this.I = uj0Var;
            addView(uj0Var, -1);
            requestLayout();
        }
        uj0 uj0Var2 = this.I;
        uj0Var2.getClass();
        return uj0Var2;
    }

    @Override // defpackage.uzj
    public fe2 getAutofill() {
        return this.B;
    }

    @Override // defpackage.uzj
    public le2 getAutofillManager() {
        return this.C;
    }

    @Override // defpackage.uzj
    @NotNull
    public me2 getAutofillTree() {
        return this.t;
    }

    @NotNull
    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.A;
    }

    @NotNull
    public final tf0 getContentCaptureManager$ui_release() {
        return this.q;
    }

    @Override // defpackage.uzj
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f;
    }

    @Override // defpackage.uzj
    @NotNull
    public jx7 getDensity() {
        return (jx7) this.d.getValue();
    }

    @Override // defpackage.uzj
    @NotNull
    public toc getFocusOwner() {
        return this.e;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        ynn y = y();
        if (y != null) {
            rect.left = Math.round(y.a);
            rect.top = Math.round(y.b);
            rect.right = Math.round(y.c);
            rect.bottom = Math.round(y.d);
            return;
        }
        if (Intrinsics.d(((uoc) getFocusOwner()).d(6, null, d5.A), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // defpackage.uzj
    @NotNull
    public ppc getFontFamilyResolver() {
        return (ppc) this.Q0.getValue();
    }

    @Override // defpackage.uzj
    @NotNull
    public kpc getFontLoader() {
        return this.P0;
    }

    @Override // defpackage.uzj
    @NotNull
    public uod getGraphicsContext() {
        return this.s;
    }

    @Override // defpackage.uzj
    @NotNull
    public msd getHapticFeedBack() {
        return this.T0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.v0.b.v();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // defpackage.uzj
    @NotNull
    public tne getInputModeManager() {
        return this.U0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.B0;
    }

    @Override // android.view.View, android.view.ViewParent, defpackage.uzj
    @NotNull
    public xof getLayoutDirection() {
        return (xof) this.S0.getValue();
    }

    public long getMeasureIteration() {
        hfh hfhVar = this.v0;
        if (!hfhVar.c) {
            sme.a("measureIteration should be only used during the measure/layout pass");
        }
        return hfhVar.g;
    }

    @Override // defpackage.uzj
    @NotNull
    public adi getModifierLocalManager() {
        return this.V0;
    }

    @Override // defpackage.uzj
    @NotNull
    public jsk getPlacementScope() {
        int i = lsk.b;
        return new uwg(1, this);
    }

    @Override // defpackage.uzj
    @NotNull
    public kfm getPointerIconService() {
        return this.i1;
    }

    @Override // defpackage.uzj
    @NotNull
    public znn getRectManager() {
        return this.m;
    }

    @Override // defpackage.uzj
    @NotNull
    public mpf getRoot() {
        return this.k;
    }

    @NotNull
    public bfo getRootForTest() {
        return this.n;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        fc6 fc6Var;
        if (Build.VERSION.SDK_INT < 31 || (fc6Var = this.h1) == null) {
            return false;
        }
        return ((Boolean) ((x6k) fc6Var.b).getValue()).booleanValue();
    }

    @Override // defpackage.uzj
    @NotNull
    public tfp getSemanticsOwner() {
        return this.o;
    }

    @Override // defpackage.uzj
    @NotNull
    public opf getSharedDrawScope() {
        return this.c;
    }

    @Override // defpackage.uzj
    public boolean getShowLayoutBounds() {
        return this.H;
    }

    @Override // defpackage.uzj
    @NotNull
    public wzj getSnapshotObserver() {
        return this.G;
    }

    @Override // defpackage.uzj
    @NotNull
    public c3r getSoftwareKeyboardController() {
        return this.O0;
    }

    @Override // defpackage.uzj
    @NotNull
    public lcs getTextInputService() {
        return this.M0;
    }

    @Override // defpackage.uzj
    @NotNull
    public hes getTextToolbar() {
        return this.W0;
    }

    @NotNull
    public View getView() {
        return this;
    }

    @Override // defpackage.uzj
    @NotNull
    public aeu getViewConfiguration() {
        return this.j;
    }

    public final ie0 getViewTreeOwners() {
        return (ie0) this.G0.getValue();
    }

    @Override // defpackage.uzj
    @NotNull
    public kpv getWindowInfo() {
        return this.h;
    }

    public final sd0 get_autofillManager$ui_release() {
        return this.C;
    }

    public final void l(mpf mpfVar, boolean z) {
        this.v0.g(mpfVar, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f5, B:44:0x00fb, B:46:0x0101, B:48:0x0107, B:49:0x010d, B:51:0x0111, B:52:0x0115, B:57:0x0128, B:59:0x012c, B:60:0x0133, B:66:0x0144, B:67:0x0152, B:69:0x015a, B:70:0x015d, B:76:0x0166), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f5, B:44:0x00fb, B:46:0x0101, B:48:0x0107, B:49:0x010d, B:51:0x0111, B:52:0x0115, B:57:0x0128, B:59:0x012c, B:60:0x0133, B:66:0x0144, B:67:0x0152, B:69:0x015a, B:70:0x015d, B:76:0x0166), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f5, B:44:0x00fb, B:46:0x0101, B:48:0x0107, B:49:0x010d, B:51:0x0111, B:52:0x0115, B:57:0x0128, B:59:0x012c, B:60:0x0133, B:66:0x0144, B:67:0x0152, B:69:0x015a, B:70:0x015d, B:76:0x0166), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f5, B:44:0x00fb, B:46:0x0101, B:48:0x0107, B:49:0x010d, B:51:0x0111, B:52:0x0115, B:57:0x0128, B:59:0x012c, B:60:0x0133, B:66:0x0144, B:67:0x0152, B:69:0x015a, B:70:0x015d, B:76:0x0166), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f5, B:44:0x00fb, B:46:0x0101, B:48:0x0107, B:49:0x010d, B:51:0x0111, B:52:0x0115, B:57:0x0128, B:59:0x012c, B:60:0x0133, B:66:0x0144, B:67:0x0152, B:69:0x015a, B:70:0x015d, B:76:0x0166), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0144 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f5, B:44:0x00fb, B:46:0x0101, B:48:0x0107, B:49:0x010d, B:51:0x0111, B:52:0x0115, B:57:0x0128, B:59:0x012c, B:60:0x0133, B:66:0x0144, B:67:0x0152, B:69:0x015a, B:70:0x015d, B:76:0x0166), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015a A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f5, B:44:0x00fb, B:46:0x0101, B:48:0x0107, B:49:0x010d, B:51:0x0111, B:52:0x0115, B:57:0x0128, B:59:0x012c, B:60:0x0133, B:66:0x0144, B:67:0x0152, B:69:0x015a, B:70:0x015d, B:76:0x0166), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f5, B:44:0x00fb, B:46:0x0101, B:48:0x0107, B:49:0x010d, B:51:0x0111, B:52:0x0115, B:57:0x0128, B:59:0x012c, B:60:0x0133, B:66:0x0144, B:67:0x0152, B:69:0x015a, B:70:0x015d, B:76:0x0166), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:90:0x0034, B:92:0x003e, B:97:0x004e, B:100:0x007d, B:102:0x0081, B:13:0x0093, B:21:0x00a6, B:23:0x00ac, B:103:0x0056, B:109:0x0062, B:112:0x006a), top: B:89:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(MotionEvent motionEvent) {
        boolean z;
        int actionMasked;
        MotionEvent motionEvent2;
        AndroidComposeView androidComposeView;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        boolean z2;
        dzd dzdVar;
        removeCallbacks(this.b1);
        try {
            E(motionEvent);
            this.C0 = true;
            u(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent4 = this.X0;
                boolean z3 = motionEvent4 != null && motionEvent4.getToolType(0) == 3;
                yk3 yk3Var = this.z;
                if (motionEvent4 != null) {
                    try {
                        if (motionEvent4.getSource() == motionEvent.getSource() && motionEvent4.getToolType(0) == motionEvent.getToolType(0)) {
                            z = false;
                            if (z) {
                                if (motionEvent4.getButtonState() != 0 || (actionMasked = motionEvent4.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent4;
                                    if (!yk3Var.a) {
                                        ((ovg) ((oxa) yk3Var.d).b).b();
                                        ((dzd) yk3Var.c).f();
                                    }
                                } else if (motionEvent4.getActionMasked() != 10 && z3) {
                                    K(motionEvent4, 10, motionEvent4.getEventTime(), true);
                                    motionEvent2 = motionEvent4;
                                }
                                boolean z4 = motionEvent.getToolType(0) != 3;
                                if (z3 && z4 && actionMasked2 != 3 && actionMasked2 != 9 && q(motionEvent)) {
                                    androidComposeView = this;
                                    androidComposeView.K(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    androidComposeView = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = androidComposeView.X0;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent5 = androidComposeView.X0;
                                    pointerId = motionEvent5 == null ? motionEvent5.getPointerId(0) : -1;
                                    action = motionEvent.getAction();
                                    cr3 cr3Var = androidComposeView.y;
                                    if (action == 9 || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent6 = androidComposeView.X0;
                                            float x = motionEvent6 == null ? motionEvent6.getX() : Float.NaN;
                                            MotionEvent motionEvent7 = androidComposeView.X0;
                                            z2 = x == motionEvent.getX() || (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) != motionEvent.getY();
                                            MotionEvent motionEvent8 = androidComposeView.X0;
                                            boolean z5 = (motionEvent8 == null ? motionEvent8.getEventTime() : -1L) == motionEvent.getEventTime();
                                            if (!z2 || z5) {
                                                if (pointerId >= 0) {
                                                    ((SparseBooleanArray) cr3Var.e).delete(pointerId);
                                                    ((SparseLongArray) cr3Var.d).delete(pointerId);
                                                }
                                                dzdVar = (dzd) yk3Var.c;
                                                if (dzdVar.c) {
                                                    ((k8j) dzdVar.g).a.i();
                                                } else {
                                                    dzdVar.c = true;
                                                }
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        ((SparseBooleanArray) cr3Var.e).delete(pointerId);
                                        ((SparseLongArray) cr3Var.d).delete(pointerId);
                                    }
                                }
                                androidComposeView.X0 = MotionEvent.obtainNoHistory(motionEvent);
                                int J = J(motionEvent);
                                Trace.endSection();
                                androidComposeView.C0 = false;
                                return J;
                            }
                        }
                        z = true;
                        if (z) {
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
                if (z3) {
                }
                androidComposeView = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = androidComposeView.X0;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent52 = androidComposeView.X0;
                    if (motionEvent52 == null) {
                    }
                    action = motionEvent.getAction();
                    cr3 cr3Var2 = androidComposeView.y;
                    if (action == 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent62 = androidComposeView.X0;
                        if (motionEvent62 == null) {
                        }
                        MotionEvent motionEvent72 = androidComposeView.X0;
                        if (motionEvent72 != null) {
                        }
                        if (x == motionEvent.getX()) {
                        }
                        MotionEvent motionEvent82 = androidComposeView.X0;
                        if ((motionEvent82 == null ? motionEvent82.getEventTime() : -1L) == motionEvent.getEventTime()) {
                        }
                        if (!z2) {
                        }
                        if (pointerId >= 0) {
                        }
                        dzdVar = (dzd) yk3Var.c;
                        if (dzdVar.c) {
                        }
                    }
                }
                androidComposeView.X0 = MotionEvent.obtainNoHistory(motionEvent);
                int J2 = J(motionEvent);
                Trace.endSection();
                androidComposeView.C0 = false;
                return J2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.C0 = false;
            throw th3;
        }
    }

    public final void o(mpf mpfVar) {
        this.v0.q(mpfVar, false);
        eqi y = mpfVar.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            o((mpf) objArr[i2]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        nyf lifecycle;
        dzf dzfVar;
        qd0 qd0Var;
        super.onAttachedToWindow();
        boolean hasWindowFocus = hasWindowFocus();
        dwf dwfVar = this.h;
        dwfVar.c.setValue(Boolean.valueOf(hasWindowFocus));
        pe0 pe0Var = new pe0(this, 0);
        if (dwfVar.b == null) {
            dwfVar.a = pe0Var;
        }
        x6k x6kVar = dwfVar.b;
        if (x6kVar != null) {
            x6kVar.setValue(new hqe(ghh.n(this)));
        }
        o(getRoot());
        n(getRoot());
        getSnapshotObserver().a.g();
        if (h() && (qd0Var = this.B) != null) {
            ie2.a.a(qd0Var);
        }
        dzf E = swf.E(this);
        woo y = ywf.y(this);
        ie0 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (E != null && y != null && (E != (dzfVar = viewTreeOwners.a) || y != dzfVar))) {
            if (E == null) {
                xq0.q("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            if (y == null) {
                xq0.q("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                return;
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.a.getLifecycle()) != null) {
                lifecycle.d(this);
            }
            E.getLifecycle().a(this);
            ie0 ie0Var = new ie0(E, y);
            set_viewTreeOwners(ie0Var);
            Function1 function1 = this.H0;
            if (function1 != null) {
                function1.invoke(ie0Var);
            }
            this.H0 = null;
        }
        this.U0.a.setValue(new sne(isInTouchMode() ? 1 : 2));
        ie0 viewTreeOwners2 = getViewTreeOwners();
        nyf lifecycle2 = viewTreeOwners2 != null ? viewTreeOwners2.a.getLifecycle() : null;
        if (lifecycle2 == null) {
            throw ouj.f("No lifecycle owner exists");
        }
        lifecycle2.a(this);
        lifecycle2.a(this.q);
        getViewTreeObserver().addOnGlobalLayoutListener(this.I0);
        getViewTreeObserver().addOnScrollChangedListener(this.J0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.K0);
        if (Build.VERSION.SDK_INT >= 31) {
            gf0.a.b(this);
        }
        sd0 sd0Var = this.C;
        if (sd0Var != null) {
            ((uoc) getFocusOwner()).k.a(sd0Var);
            getSemanticsOwner().d.a(sd0Var);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        smp smpVar = (smp) this.N0.get();
        th0 th0Var = (th0) (smpVar != null ? smpVar.b : null);
        if (th0Var == null) {
            return this.L0.d;
        }
        smp smpVar2 = (smp) th0Var.d.get();
        rne rneVar = (rne) (smpVar2 != null ? smpVar2.b : null);
        return rneVar != null && (rneVar.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(ff7.i(getContext()));
        x6k x6kVar = this.h.b;
        if (x6kVar != null) {
            x6kVar.setValue(new hqe(ghh.n(this)));
        }
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration.fontWeightAdjustment : 0) != this.R0) {
            this.R0 = i >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(cxb.N(getContext()));
        }
        this.A.invoke(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        int i2;
        int i3;
        smp smpVar = (smp) this.N0.get();
        th0 th0Var = (th0) (smpVar != null ? smpVar.b : null);
        if (th0Var != null) {
            smp smpVar2 = (smp) th0Var.d.get();
            rne rneVar = (rne) (smpVar2 != null ? smpVar2.b : null);
            if (rneVar == null) {
                return null;
            }
            synchronized (rneVar.c) {
                if (rneVar.e) {
                    return null;
                }
                qnn a = rneVar.a.a(editorInfo);
                kma kmaVar = new kma(20, rneVar);
                int i4 = Build.VERSION.SDK_INT;
                InputConnection ygjVar = i4 >= 34 ? new ygj(a, kmaVar) : i4 >= 25 ? new xgj(a, kmaVar) : new wgj(a, kmaVar);
                rneVar.d.d(new cbv(ygjVar));
                return ygjVar;
            }
        }
        ocs ocsVar = this.L0;
        if (!ocsVar.d) {
            return null;
        }
        ide ideVar = ocsVar.h;
        ybs ybsVar = ocsVar.g;
        int i5 = ideVar.e;
        boolean z = ideVar.a;
        int i6 = 7;
        if (i5 != 1) {
            if (i5 == 0) {
                i = 1;
            } else if (i5 == 2) {
                i = 2;
            } else if (i5 == 6) {
                i = 5;
            } else if (i5 == 5) {
                i = 7;
            } else if (i5 == 3) {
                i = 3;
            } else if (i5 == 4) {
                i = 4;
            } else {
                if (i5 != 7) {
                    xq0.q("invalid ImeAction");
                    return null;
                }
                i = 6;
            }
            editorInfo.imeOptions = i;
            i2 = ideVar.d;
            if (i2 == 1) {
            }
            if (!z) {
            }
            i3 = editorInfo.inputType;
            if ((i3 & 1) == 1) {
            }
            long j = ybsVar.b;
            int i7 = rds.c;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            l1b.l(editorInfo, ybsVar.a.b);
            editorInfo.imeOptions |= 33554432;
            if (r3b.d()) {
            }
            pnn pnnVar = new pnn(ocsVar.g, new c5p(i6, ocsVar), ocsVar.h.c);
            ocsVar.i.add(new WeakReference(pnnVar));
            return pnnVar;
        }
        if (!z) {
            i = 0;
            editorInfo.imeOptions = i;
            i2 = ideVar.d;
            if (i2 == 1) {
                editorInfo.inputType = 1;
            } else if (i2 == 2) {
                editorInfo.inputType = 1;
                editorInfo.imeOptions = Integer.MIN_VALUE | i;
            } else if (i2 == 3) {
                editorInfo.inputType = 2;
            } else if (i2 == 4) {
                editorInfo.inputType = 3;
            } else if (i2 == 5) {
                editorInfo.inputType = 17;
            } else if (i2 == 6) {
                editorInfo.inputType = 33;
            } else if (i2 == 7) {
                editorInfo.inputType = 129;
            } else if (i2 == 8) {
                editorInfo.inputType = 18;
            } else {
                if (i2 != 9) {
                    xq0.q("Invalid Keyboard Type");
                    return null;
                }
                editorInfo.inputType = 8194;
            }
            if (!z) {
                int i8 = editorInfo.inputType;
                if ((i8 & 1) == 1) {
                    editorInfo.inputType = i8 | SQLiteDatabase.OPEN_SHAREDCACHE;
                    if (i5 == 1) {
                        editorInfo.imeOptions |= 1073741824;
                    }
                }
            }
            i3 = editorInfo.inputType;
            if ((i3 & 1) == 1) {
                int i9 = ideVar.b;
                if (i9 == 1) {
                    editorInfo.inputType = i3 | 4096;
                } else if (i9 == 2) {
                    editorInfo.inputType = i3 | RemoteCameraConfig.Notification.ID;
                } else if (i9 == 3) {
                    editorInfo.inputType = i3 | 16384;
                }
                if (ideVar.c) {
                    editorInfo.inputType |= SQLiteDatabase.OPEN_NOMUTEX;
                }
            }
            long j2 = ybsVar.b;
            int i72 = rds.c;
            editorInfo.initialSelStart = (int) (j2 >> 32);
            editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
            l1b.l(editorInfo, ybsVar.a.b);
            editorInfo.imeOptions |= 33554432;
            if (r3b.d()) {
                r3b.a().i(editorInfo);
            }
            pnn pnnVar2 = new pnn(ocsVar.g, new c5p(i6, ocsVar), ocsVar.h.c);
            ocsVar.i.add(new WeakReference(pnnVar2));
            return pnnVar2;
        }
        i = 6;
        editorInfo.imeOptions = i;
        i2 = ideVar.d;
        if (i2 == 1) {
        }
        if (!z) {
        }
        i3 = editorInfo.inputType;
        if ((i3 & 1) == 1) {
        }
        long j22 = ybsVar.b;
        int i722 = rds.c;
        editorInfo.initialSelStart = (int) (j22 >> 32);
        editorInfo.initialSelEnd = (int) (j22 & 4294967295L);
        l1b.l(editorInfo, ybsVar.a.b);
        editorInfo.imeOptions |= 33554432;
        if (r3b.d()) {
        }
        pnn pnnVar22 = new pnn(ocsVar.g, new c5p(i6, ocsVar), ocsVar.h.c);
        ocsVar.i.add(new WeakReference(pnnVar22));
        return pnnVar22;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        tf0 tf0Var = this.q;
        tf0Var.getClass();
        rf0.t(tf0Var, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        qd0 qd0Var;
        super.onDetachedFromWindow();
        a42 a42Var = getSnapshotObserver().a;
        h5n h5nVar = (h5n) a42Var.i;
        if (h5nVar != null) {
            h5nVar.b();
        }
        a42Var.b();
        dwf dwfVar = this.h;
        if (dwfVar.b == null) {
            dwfVar.a = null;
        }
        ie0 viewTreeOwners = getViewTreeOwners();
        nyf lifecycle = viewTreeOwners != null ? viewTreeOwners.a.getLifecycle() : null;
        if (lifecycle == null) {
            throw ouj.f("No lifecycle owner exists");
        }
        lifecycle.d(this.q);
        lifecycle.d(this);
        if (h() && (qd0Var = this.B) != null) {
            ie2.a.b(qd0Var);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.I0);
        getViewTreeObserver().removeOnScrollChangedListener(this.J0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.K0);
        if (Build.VERSION.SDK_INT >= 31) {
            gf0.a.a(this);
        }
        sd0 sd0Var = this.C;
        if (sd0Var != null) {
            getSemanticsOwner().d.h(sd0Var);
            ((uoc) getFocusOwner()).k.h(sd0Var);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        x97.r(((uoc) getFocusOwner()).f, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.B0 = 0L;
        this.v0.k(this.e1);
        this.K = null;
        M();
        if (this.I != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        hfh hfhVar = this.v0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                o(getRoot());
            }
            long j = j(i);
            met metVar = net.b;
            long j2 = j(i2);
            long z = qld.z((int) (j >>> 32), (int) (j & 4294967295L), (int) (j2 >>> 32), (int) (4294967295L & j2));
            ga6 ga6Var = this.K;
            if (ga6Var == null) {
                this.K = new ga6(z);
                this.L = false;
            } else if (!ga6.c(ga6Var.a, z)) {
                this.L = true;
            }
            hfhVar.r(z);
            hfhVar.m();
            setMeasuredDimension(getRoot().G.p.a, getRoot().G.p.b);
            if (this.I != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().G.p.a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().G.p.b, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!h() || viewStructure == null) {
            return;
        }
        sd0 sd0Var = this.C;
        if (sd0Var != null) {
            mpf mpfVar = sd0Var.b.a;
            AutofillId autofillId = sd0Var.g;
            String str = sd0Var.e;
            znn znnVar = sd0Var.d;
            bzf.K(viewStructure, mpfVar, autofillId, str, znnVar);
            Object[] objArr = whj.a;
            gpi gpiVar = new gpi(2);
            gpiVar.a(mpfVar);
            gpiVar.a(viewStructure);
            while (true) {
                int i2 = gpiVar.b;
                if (i2 == 0) {
                    break;
                }
                Object i3 = gpiVar.i(i2 - 1);
                i3.getClass();
                ViewStructure viewStructure2 = (ViewStructure) i3;
                Object i4 = gpiVar.i(gpiVar.b - 1);
                i4.getClass();
                List o = ((mpf) i4).o();
                int size = o.size();
                for (int i5 = 0; i5 < size; i5++) {
                    mpf mpfVar2 = (mpf) ((epi) o).get(i5);
                    if (!mpfVar2.v0 && mpfVar2.G() && mpfVar2.H()) {
                        jfp w = mpfVar2.w();
                        if (w != null) {
                            tpi tpiVar = w.a;
                            if (tpiVar.b(hfp.g) || tpiVar.b(ufp.p) || tpiVar.b(ufp.q)) {
                                ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                bzf.K(newChild, mpfVar2, sd0Var.g, str, znnVar);
                                gpiVar.a(mpfVar2);
                                gpiVar.a(newChild);
                            }
                        }
                        gpiVar.a(mpfVar2);
                        gpiVar.a(viewStructure2);
                    }
                }
            }
        }
        qd0 qd0Var = this.B;
        if (qd0Var != null) {
            me2 me2Var = qd0Var.b;
            LinkedHashMap linkedHashMap = me2Var.a;
            LinkedHashMap linkedHashMap2 = me2Var.a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int intValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    l1j.f();
                    return;
                }
                ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                ge2.c(newChild2, qd0Var.d, intValue);
                newChild2.setId(intValue, qd0Var.a.getContext().getPackageName(), null, null);
                ge2.d(newChild2, 1);
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        jfm jfmVar;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (jfmVar = ((qe0) getPointerIconService()).a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return jfmVar instanceof uh0 ? PointerIcon.getSystemIcon(context, ((uh0) jfmVar).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // defpackage.yn7
    public final void onResume(dzf dzfVar) {
        setShowLayoutBounds(fs7.g());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.b) {
            xof xofVar = i != 0 ? i != 1 ? null : xof.b : xof.a;
            if (xofVar == null) {
                xofVar = xof.a;
            }
            setLayoutDirection(xofVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        fc6 fc6Var;
        if (Build.VERSION.SDK_INT < 31 || (fc6Var = this.h1) == null) {
            return;
        }
        fc6Var.c(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        tf0 tf0Var = this.q;
        tf0Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (Intrinsics.d(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            rf0.h(tf0Var, longSparseArray);
        } else {
            tf0Var.a.post(new qf0(0, tf0Var, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean g;
        this.h.c.setValue(Boolean.valueOf(z));
        this.g1 = true;
        super.onWindowFocusChanged(z);
        if (!z || getShowLayoutBounds() == (g = fs7.g())) {
            return;
        }
        setShowLayoutBounds(g);
        n(getRoot());
    }

    public final boolean q(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean r(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.X0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (((uoc) getFocusOwner()).f.U0().a()) {
            return super.requestFocus(i, rect);
        }
        loc O = yd5.O(i);
        int i2 = O != null ? O.a : 7;
        return Intrinsics.d(((uoc) getFocusOwner()).d(i2, rect != null ? uwf.F(rect) : null, new re0(i2, 0)), Boolean.TRUE);
    }

    public final void s(float[] fArr) {
        D();
        feh.e(fArr, this.z0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.D0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.D0 & 4294967295L));
        float[] fArr2 = this.y0;
        feh.d(fArr2);
        feh.f(fArr2, intBitsToFloat, intBitsToFloat2);
        jf0.T(fArr, fArr2);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.p.h = j;
    }

    public final void setConfigurationChangeObserver(@NotNull Function1<? super Configuration, Unit> function1) {
        this.A = function1;
    }

    public final void setContentCaptureManager$ui_release(@NotNull tf0 tf0Var) {
        this.q = tf0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [xci] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [xci] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eqi] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eqi] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public void setCoroutineContext(@NotNull CoroutineContext coroutineContext) {
        this.f = coroutineContext;
        xci xciVar = (xci) getRoot().F.f;
        if (xciVar instanceof iur) {
            ((iur) xciVar).U0();
        }
        if (!xciVar.a.n) {
            sme.b("visitSubtreeIf called on an unattached node");
        }
        eqi eqiVar = new eqi(new xci[16]);
        xci xciVar2 = xciVar.a;
        xci xciVar3 = xciVar2.f;
        if (xciVar3 == null) {
            bcx.o(eqiVar, xciVar2);
        } else {
            eqiVar.d(xciVar3);
        }
        while (true) {
            int i = eqiVar.c;
            if (i == 0) {
                return;
            }
            xci xciVar4 = (xci) eqiVar.m(i - 1);
            if ((xciVar4.d & 16) != 0) {
                for (xci xciVar5 = xciVar4; xciVar5 != null; xciVar5 = xciVar5.f) {
                    if ((xciVar5.c & 16) != 0) {
                        cw7 cw7Var = xciVar5;
                        ?? r5 = 0;
                        while (cw7Var != 0) {
                            if (cw7Var instanceof ofm) {
                                ofm ofmVar = (ofm) cw7Var;
                                if (ofmVar instanceof iur) {
                                    ((iur) ofmVar).U0();
                                }
                            } else if ((cw7Var.c & 16) != 0 && (cw7Var instanceof cw7)) {
                                xci xciVar6 = cw7Var.p;
                                int i2 = 0;
                                cw7Var = cw7Var;
                                r5 = r5;
                                while (xciVar6 != null) {
                                    if ((xciVar6.c & 16) != 0) {
                                        i2++;
                                        r5 = r5;
                                        if (i2 == 1) {
                                            cw7Var = xciVar6;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new eqi(new xci[16]);
                                            }
                                            if (cw7Var != 0) {
                                                r5.d(cw7Var);
                                                cw7Var = 0;
                                            }
                                            r5.d(xciVar6);
                                        }
                                    }
                                    xciVar6 = xciVar6.f;
                                    cw7Var = cw7Var;
                                    r5 = r5;
                                }
                                if (i2 == 1) {
                                }
                            }
                            cw7Var = bcx.p(r5);
                        }
                    }
                }
            }
            bcx.o(eqiVar, xciVar4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.B0 = j;
    }

    public final void setOnViewTreeOwnersAvailable(@NotNull Function1<? super ie0, Unit> function1) {
        ie0 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            function1.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.H0 = function1;
    }

    @Override // defpackage.uzj
    public void setShowLayoutBounds(boolean z) {
        this.H = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final long t(long j) {
        D();
        long b = feh.b(j, this.z0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.D0 >> 32)) + Float.intBitsToFloat((int) (b >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.D0 & 4294967295L)) + Float.intBitsToFloat((int) (b & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void u(boolean z) {
        pe0 pe0Var;
        hfh hfhVar = this.v0;
        if (hfhVar.b.v() || ((eqi) hfhVar.e.b).c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    pe0Var = this.e1;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                pe0Var = null;
            }
            if (hfhVar.k(pe0Var)) {
                requestLayout();
            }
            hfhVar.b(false);
            if (this.x) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.x = false;
            }
            Trace.endSection();
        }
    }

    public final void v(mpf mpfVar, long j) {
        hfh hfhVar = this.v0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            hfhVar.l(mpfVar, j);
            if (!hfhVar.b.v()) {
                hfhVar.b(false);
                if (this.x) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.x = false;
                }
            }
            getRectManager().a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void w(tzj tzjVar, boolean z) {
        boolean z2 = this.w;
        ArrayList arrayList = this.u;
        if (!z) {
            if (z2) {
                return;
            }
            arrayList.remove(tzjVar);
            ArrayList arrayList2 = this.v;
            if (arrayList2 != null) {
                arrayList2.remove(tzjVar);
                return;
            }
            return;
        }
        if (!z2) {
            arrayList.add(tzjVar);
            return;
        }
        ArrayList arrayList3 = this.v;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.v = arrayList3;
        }
        arrayList3.add(tzjVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a7, code lost:
    
        r5.l(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00aa, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x() {
        int i;
        gpi gpiVar;
        sd0 sd0Var;
        Object[] objArr;
        if (this.D) {
            a42 a42Var = getSnapshotObserver().a;
            synchronized (a42Var.b) {
                try {
                    eqi eqiVar = (eqi) a42Var.h;
                    int i2 = eqiVar.c;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        objArr = eqiVar.a;
                        if (i3 >= i2) {
                            break;
                        }
                        v2r v2rVar = (v2r) objArr[i3];
                        v2rVar.e();
                        if (!(v2rVar.f.e != 0)) {
                            i4++;
                        } else if (i4 > 0) {
                            Object[] objArr2 = eqiVar.a;
                            objArr2[i3 - i4] = objArr2[i3];
                        }
                        i3++;
                    }
                    int i5 = i2 - i4;
                    Arrays.fill(objArr, i5, i2, (Object) null);
                    eqiVar.c = i5;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.D = false;
        }
        uj0 uj0Var = this.I;
        if (uj0Var != null) {
            i(uj0Var);
        }
        if (h() && (sd0Var = this.C) != null) {
            toi toiVar = sd0Var.h;
            if (toiVar.d == 0 && sd0Var.i) {
                sd0Var.a.b();
                sd0Var.i = false;
            }
            if (toiVar.d != 0) {
                sd0Var.i = true;
            }
        }
        loop1: while (true) {
            gpi gpiVar2 = this.a1;
            if (gpiVar2.b == 0 || gpiVar2.e(0) == null) {
                return;
            }
            i = this.a1.b;
            int i6 = 0;
            while (true) {
                gpiVar = this.a1;
                if (i6 < i) {
                    Function0 function0 = (Function0) gpiVar.e(i6);
                    gpi gpiVar3 = this.a1;
                    if (i6 < 0 || i6 >= gpiVar3.b) {
                        break loop1;
                    }
                    Object[] objArr3 = gpiVar3.a;
                    Object obj = objArr3[i6];
                    objArr3[i6] = null;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    i6++;
                }
            }
            gpiVar.j(0, i);
        }
    }

    public final ynn y() {
        if (isFocused()) {
            dpc x = ff7.x(((uoc) getFocusOwner()).f);
            if (x != null) {
                return ff7.y(x);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return yd5.p(findFocus, this);
        }
        return null;
    }

    public final void z(mpf mpfVar) {
        ye0 ye0Var = this.p;
        ye0Var.A = true;
        if (ye0Var.u()) {
            ye0Var.v(mpfVar);
        }
        tf0 tf0Var = this.q;
        tf0Var.g = true;
        if (tf0Var.f()) {
            tf0Var.h.c(Unit.a);
        }
    }

    @Override // defpackage.uzj
    @NotNull
    public jb0 getAccessibilityManager() {
        return this.r;
    }

    @Override // defpackage.uzj
    @NotNull
    public ce0 getClipboard() {
        return this.F;
    }

    @Override // defpackage.uzj
    @NotNull
    public de0 getClipboardManager() {
        return this.E;
    }

    @Override // defpackage.uzj
    @NotNull
    public ng0 getDragAndDropManager() {
        return this.g;
    }

    @NotNull
    /* renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public soi m0getLayoutNodes() {
        return this.l;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
