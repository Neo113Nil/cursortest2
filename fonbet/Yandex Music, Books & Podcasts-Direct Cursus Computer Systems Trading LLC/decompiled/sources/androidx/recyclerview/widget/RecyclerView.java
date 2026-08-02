package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
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
import android.view.KeyEvent;
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
import androidx.annotation.NonNull;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.amh;
import defpackage.apn;
import defpackage.apo;
import defpackage.au1;
import defpackage.beu;
import defpackage.bpn;
import defpackage.c1t;
import defpackage.c9n;
import defpackage.cib;
import defpackage.ciq;
import defpackage.cpn;
import defpackage.dpn;
import defpackage.fpn;
import defpackage.g3k;
import defpackage.g8c;
import defpackage.gpn;
import defpackage.gvt;
import defpackage.h3k;
import defpackage.hpn;
import defpackage.i38;
import defpackage.i7g;
import defpackage.ipn;
import defpackage.jen;
import defpackage.jj4;
import defpackage.jpn;
import defpackage.jyi;
import defpackage.k5r;
import defpackage.kac;
import defpackage.kpn;
import defpackage.l1j;
import defpackage.ll4;
import defpackage.lpn;
import defpackage.ltg;
import defpackage.lyi;
import defpackage.m1d;
import defpackage.m5c;
import defpackage.mpn;
import defpackage.npn;
import defpackage.opn;
import defpackage.ouj;
import defpackage.ovg;
import defpackage.pon;
import defpackage.q0f;
import defpackage.qdu;
import defpackage.qon;
import defpackage.qpn;
import defpackage.qzc;
import defpackage.rj;
import defpackage.rj7;
import defpackage.rzf;
import defpackage.sj;
import defpackage.sml;
import defpackage.tn7;
import defpackage.ton;
import defpackage.tyf;
import defpackage.u75;
import defpackage.uon;
import defpackage.veu;
import defpackage.von;
import defpackage.vtm;
import defpackage.wdu;
import defpackage.won;
import defpackage.wvs;
import defpackage.xq0;
import defpackage.ydu;
import defpackage.yon;
import defpackage.zon;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements jyi {
    public static boolean j1 = false;
    public static boolean k1 = false;
    public static final int[] l1 = {R.attr.nestedScrollingEnabled};
    public static final float m1 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean n1 = true;
    public static final boolean o1 = true;
    public static final Class[] p1;
    public static final q0f q1;
    public static final lpn r1;
    public boolean A;
    public int A0;
    public final AccessibilityManager B;
    public int B0;
    public ArrayList C;
    public int C0;
    public boolean D;
    public int D0;
    public boolean E;
    public bpn E0;
    public int F;
    public final int F0;
    public int G;
    public final int G0;
    public uon H;
    public final float H0;
    public EdgeEffect I;
    public final float I0;
    public EdgeEffect J;
    public boolean J0;
    public EdgeEffect K;
    public final npn K0;
    public EdgeEffect L;
    public m1d L0;
    public final ll4 M0;
    public final kpn N0;
    public dpn O0;
    public ArrayList P0;
    public boolean Q0;
    public boolean R0;
    public final vtm S0;
    public boolean T0;
    public qpn U0;
    public ton V0;
    public final int[] W0;
    public lyi X0;
    public final int[] Y0;
    public final int[] Z0;
    public final float a;
    public final int[] a1;
    public final hpn b;
    public final ArrayList b1;
    public final amh c;
    public final pon c1;
    public ipn d;
    public boolean d1;
    public final sj e;
    public int e1;
    public final c1t f;
    public int f1;
    public final apo g;
    public final boolean g1;
    public boolean h;
    public final cib h1;
    public final pon i;
    public final i38 i1;
    public final Rect j;
    public final Rect k;
    public final RectF l;
    public qon m;
    public yon n;
    public final ArrayList o;
    public final ArrayList p;
    public final ArrayList q;
    public cpn r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public von v0;
    public boolean w;
    public int w0;
    public boolean x;
    public int x0;
    public boolean y;
    public VelocityTracker y0;
    public int z;
    public int z0;

    static {
        Class cls = Integer.TYPE;
        p1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        q1 = new q0f(2);
        r1 = new lpn();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Class[]] */
    public RecyclerView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float a;
        char c;
        Throwable th;
        boolean z;
        char c2;
        int i2;
        TypedArray typedArray;
        int i3;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        this.b = new hpn(this);
        this.c = new amh(this);
        this.g = new apo(13);
        this.i = new pon(this, 0);
        this.j = new Rect();
        this.k = new Rect();
        this.l = new RectF();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.v = 0;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        this.H = r1;
        tn7 tn7Var = new tn7();
        tn7Var.a = null;
        tn7Var.b = new ArrayList();
        tn7Var.c = 120L;
        tn7Var.d = 120L;
        tn7Var.e = 250L;
        tn7Var.f = 250L;
        int i4 = 1;
        tn7Var.g = true;
        tn7Var.h = new ArrayList();
        tn7Var.i = new ArrayList();
        tn7Var.j = new ArrayList();
        tn7Var.k = new ArrayList();
        tn7Var.l = new ArrayList();
        tn7Var.m = new ArrayList();
        tn7Var.n = new ArrayList();
        tn7Var.o = new ArrayList();
        tn7Var.p = new ArrayList();
        tn7Var.q = new ArrayList();
        tn7Var.r = new ArrayList();
        this.v0 = tn7Var;
        this.w0 = 0;
        this.x0 = -1;
        this.H0 = Float.MIN_VALUE;
        this.I0 = Float.MIN_VALUE;
        this.J0 = true;
        this.K0 = new npn(this);
        this.M0 = o1 ? new ll4() : null;
        kpn kpnVar = new kpn();
        kpnVar.a = -1;
        kpnVar.b = 0;
        kpnVar.c = 0;
        kpnVar.d = 1;
        kpnVar.e = 0;
        kpnVar.f = false;
        kpnVar.g = false;
        kpnVar.h = false;
        kpnVar.i = false;
        kpnVar.j = false;
        kpnVar.k = false;
        this.N0 = kpnVar;
        this.Q0 = false;
        this.R0 = false;
        vtm vtmVar = new vtm(this);
        this.S0 = vtmVar;
        this.T0 = false;
        this.W0 = new int[2];
        this.Y0 = new int[2];
        this.Z0 = new int[2];
        this.a1 = new int[2];
        this.b1 = new ArrayList();
        this.c1 = new pon(this, i4);
        this.e1 = 0;
        this.f1 = 0;
        this.h1 = new cib(25, this);
        this.i1 = new i38(getContext(), new sml(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.D0 = viewConfiguration.getScaledTouchSlop();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            Method method = beu.a;
            a = gvt.u(viewConfiguration);
        } else {
            a = beu.a(viewConfiguration, context);
        }
        this.H0 = a;
        this.I0 = i5 >= 26 ? gvt.v(viewConfiguration) : beu.a(viewConfiguration, context);
        this.F0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.G0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.v0.a = vtmVar;
        this.e = new sj(new qzc(27, this));
        this.f = new c1t(new g8c(this));
        WeakHashMap weakHashMap = wdu.a;
        if ((i5 >= 26 ? qdu.a(this) : 0) == 0 && i5 >= 26) {
            qdu.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new qpn(this));
        int[] iArr = jen.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        wdu.p(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        }
        this.h = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                xq0.x("Trying to set fast scroller without both required drawables.".concat(M()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c2 = 2;
            z = 1;
            typedArray = obtainStyledAttributes;
            i2 = i;
            c = 3;
            th = null;
            i3 = 4;
            new m5c(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(ru.yandex.music.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(ru.yandex.music.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(ru.yandex.music.R.dimen.fastscroll_margin));
        } else {
            c = 3;
            th = null;
            z = 1;
            c2 = 2;
            i2 = i;
            typedArray = obtainStyledAttributes;
            i3 = 4;
        }
        typedArray.recycle();
        this.g1 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            try {
                                classLoader = context.getClassLoader();
                            } catch (ClassNotFoundException e) {
                                e = e;
                                th = null;
                                l1j.l(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e);
                                throw th;
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                th = null;
                                l1j.l(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e);
                                throw th;
                            } catch (InstantiationException e3) {
                                e = e3;
                                th = null;
                                l1j.l(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw th;
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                th = null;
                                l1j.l(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw th;
                            }
                        }
                        ?? asSubclass = Class.forName(str, false, classLoader).asSubclass(yon.class);
                        try {
                            constructor = asSubclass.getConstructor(p1);
                            objArr = new Object[i3];
                            objArr[0] = context;
                            objArr[z] = attributeSet;
                            objArr[c2] = Integer.valueOf(i2);
                            objArr[c] = 0;
                        } catch (NoSuchMethodException e5) {
                            try {
                                constructor = asSubclass.getConstructor(th);
                                objArr = null;
                            } catch (NoSuchMethodException e6) {
                                e6.initCause(e5);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e6);
                            }
                        }
                        constructor.setAccessible(z);
                        setLayoutManager((yon) constructor.newInstance(objArr));
                    } catch (ClassCastException e7) {
                        l1j.l(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e7);
                        throw null;
                    }
                } catch (ClassNotFoundException e8) {
                    e = e8;
                } catch (IllegalAccessException e9) {
                    e = e9;
                } catch (InstantiationException e10) {
                    e = e10;
                } catch (InvocationTargetException e11) {
                    e = e11;
                }
            }
        }
        int[] iArr2 = l1;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        wdu.p(this, context, iArr2, attributeSet, obtainStyledAttributes2, i2, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(ru.yandex.music.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView R(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView R = R(viewGroup.getChildAt(i));
            if (R != null) {
                return R;
            }
        }
        return null;
    }

    public static int Y(View view) {
        opn b0 = b0(view);
        if (b0 != null) {
            return b0.b();
        }
        return -1;
    }

    public static int Z(View view) {
        opn b0 = b0(view);
        if (b0 != null) {
            return b0.d();
        }
        return -1;
    }

    public static opn b0(View view) {
        if (view == null) {
            return null;
        }
        return ((zon) view.getLayoutParams()).a;
    }

    private lyi getScrollingChildHelper() {
        if (this.X0 == null) {
            this.X0 = new lyi(this);
        }
        return this.X0;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        j1 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        k1 = z;
    }

    public static void v(opn opnVar) {
        WeakReference weakReference = opnVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == opnVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            opnVar.b = null;
        }
    }

    public static int y(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && ltg.F(edgeEffect) != 0.0f) {
            int round = Math.round(ltg.H(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || ltg.F(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int round2 = Math.round(ltg.H(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    public final void A(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = wdu.a;
        setMeasuredDimension(yon.A(i, paddingRight, getMinimumWidth()), yon.A(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean A0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float F = ltg.F(edgeEffect) * i2;
        float abs = Math.abs(-i) * 0.35f;
        float f = this.a * 0.015f;
        double log = Math.log(abs / f);
        double d = m1;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < F;
    }

    public final void B(View view) {
        opn b0 = b0(view);
        qon qonVar = this.m;
        if (qonVar != null && b0 != null) {
            qonVar.getClass();
        }
        ArrayList arrayList = this.C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((apn) this.C.get(size)).a(view);
            }
        }
    }

    public final void B0(int i, int i2, boolean z) {
        yon yonVar = this.n;
        if (yonVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.x) {
            return;
        }
        if (!yonVar.x()) {
            i = 0;
        }
        if (!this.n.y()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().h(i3, 1);
        }
        this.K0.c(i, i2, Integer.MIN_VALUE, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0351, code lost:
    
        if (((java.util.ArrayList) r21.f.e).contains(getFocusedChild()) == false) goto L225;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03fd  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C() {
        boolean z;
        opn opnVar;
        View findViewById;
        boolean z2;
        c9n c9nVar;
        ?? r3;
        RecyclerView recyclerView;
        boolean g;
        boolean z3;
        if (this.m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        kpn kpnVar = this.N0;
        boolean z4 = false;
        kpnVar.i = false;
        boolean z5 = true;
        boolean z6 = this.d1 && !(this.e1 == getWidth() && this.f1 == getHeight());
        this.e1 = 0;
        this.f1 = 0;
        this.d1 = false;
        if (kpnVar.d == 1) {
            D();
            this.n.V0(this);
            E();
        } else {
            sj sjVar = this.e;
            if ((((ArrayList) sjVar.d).isEmpty() || ((ArrayList) sjVar.c).isEmpty()) && !z6 && this.n.n == getWidth() && this.n.o == getHeight()) {
                this.n.V0(this);
            } else {
                this.n.V0(this);
                E();
            }
        }
        kpnVar.a(4);
        D0();
        i0();
        kpnVar.d = 1;
        boolean z7 = kpnVar.j;
        amh amhVar = this.c;
        apo apoVar = this.g;
        if (z7) {
            int l = this.f.l() - 1;
            while (l >= 0) {
                opn b0 = b0(this.f.k(l));
                if (b0.r()) {
                    z3 = z5;
                } else {
                    long X = X(b0);
                    this.v0.getClass();
                    c9n c9nVar2 = new c9n(11, (byte) 0);
                    c9nVar2.g(b0);
                    ovg ovgVar = (ovg) apoVar.c;
                    ciq ciqVar = (ciq) apoVar.b;
                    opn opnVar2 = (opn) ovgVar.c(X);
                    if (opnVar2 == null || opnVar2.r()) {
                        z3 = z5;
                        apoVar.k(b0, c9nVar2);
                    } else {
                        z3 = z5;
                        veu veuVar = (veu) ciqVar.get(opnVar2);
                        boolean z8 = (veuVar == null || (veuVar.a & 1) == 0) ? false : z3;
                        veu veuVar2 = (veu) ciqVar.get(b0);
                        boolean z9 = (veuVar2 == null || (veuVar2.a & 1) == 0) ? false : z3;
                        if (z8 && opnVar2 == b0) {
                            apoVar.k(b0, c9nVar2);
                        } else {
                            c9n q = apoVar.q(opnVar2, 4);
                            apoVar.k(b0, c9nVar2);
                            c9n q2 = apoVar.q(b0, 8);
                            if (q == null) {
                                int l2 = this.f.l();
                                for (int i = 0; i < l2; i++) {
                                    opn b02 = b0(this.f.k(i));
                                    if (b02 != b0 && X(b02) == X) {
                                        qon qonVar = this.m;
                                        if (qonVar == null || !qonVar.b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(b02);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(b0);
                                            wvs.k(sb, M());
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(b02);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(b0);
                                        wvs.k(sb2, M());
                                        return;
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + opnVar2 + " cannot be found but it is necessary for " + b0 + M());
                            } else {
                                opnVar2.q(false);
                                if (z8) {
                                    r(opnVar2);
                                }
                                if (opnVar2 != b0) {
                                    if (z9) {
                                        r(b0);
                                    }
                                    opnVar2.h = b0;
                                    r(opnVar2);
                                    amhVar.m(opnVar2);
                                    b0.q(false);
                                    b0.i = opnVar2;
                                }
                                if (this.v0.a(opnVar2, b0, q, q2)) {
                                    n0();
                                }
                            }
                        }
                    }
                }
                l--;
                z5 = z3;
            }
            z = z5;
            ciq ciqVar2 = (ciq) apoVar.b;
            int i2 = ciqVar2.c - 1;
            while (i2 >= 0) {
                opn opnVar3 = (opn) ciqVar2.f(i2);
                veu veuVar3 = (veu) ciqVar2.h(i2);
                int i3 = veuVar3.a;
                int i4 = i3 & 3;
                cib cibVar = this.h1;
                if (i4 == 3) {
                    RecyclerView recyclerView2 = (RecyclerView) cibVar.b;
                    yon yonVar = recyclerView2.n;
                    View view = opnVar3.a;
                    amh amhVar2 = recyclerView2.c;
                    yonVar.O0(view);
                    amhVar2.i(view);
                    r3 = z4;
                } else if ((i3 & 1) != 0) {
                    c9n c9nVar3 = veuVar3.b;
                    if (c9nVar3 == null) {
                        RecyclerView recyclerView3 = (RecyclerView) cibVar.b;
                        yon yonVar2 = recyclerView3.n;
                        View view2 = opnVar3.a;
                        amh amhVar3 = recyclerView3.c;
                        yonVar2.O0(view2);
                        amhVar3.i(view2);
                        r3 = z4;
                    } else {
                        cibVar.H(opnVar3, c9nVar3, veuVar3.c);
                        r3 = z4;
                    }
                } else if ((i3 & 14) == 14) {
                    cibVar.D(opnVar3, veuVar3.b, veuVar3.c);
                    r3 = z4;
                } else if ((i3 & 12) == 12) {
                    c9n c9nVar4 = veuVar3.b;
                    c9n c9nVar5 = veuVar3.c;
                    cibVar.getClass();
                    opnVar3.q(z4);
                    RecyclerView recyclerView4 = (RecyclerView) cibVar.b;
                    boolean z10 = recyclerView4.D;
                    von vonVar = recyclerView4.v0;
                    if (!z10) {
                        tn7 tn7Var = (tn7) vonVar;
                        tn7Var.getClass();
                        int i5 = c9nVar4.b;
                        int i6 = c9nVar5.b;
                        if (i5 == i6 && c9nVar4.c == c9nVar5.c) {
                            tn7Var.c(opnVar3);
                            recyclerView = recyclerView4;
                            g = false;
                        } else {
                            recyclerView = recyclerView4;
                            g = tn7Var.g(opnVar3, i5, c9nVar4.c, i6, c9nVar5.c);
                        }
                        if (g) {
                            recyclerView.n0();
                        }
                    } else if (vonVar.a(opnVar3, opnVar3, c9nVar4, c9nVar5)) {
                        recyclerView4.n0();
                    }
                    r3 = 0;
                } else {
                    if ((i3 & 4) != 0) {
                        c9nVar = null;
                        cibVar.H(opnVar3, veuVar3.b, null);
                    } else {
                        c9nVar = null;
                        if ((i3 & 8) != 0) {
                            cibVar.D(opnVar3, veuVar3.b, veuVar3.c);
                        }
                    }
                    r3 = 0;
                    veuVar3.a = r3;
                    veuVar3.b = c9nVar;
                    veuVar3.c = c9nVar;
                    veu.d.c(veuVar3);
                    i2--;
                    z4 = false;
                }
                c9nVar = null;
                veuVar3.a = r3;
                veuVar3.b = c9nVar;
                veuVar3.c = c9nVar;
                veu.d.c(veuVar3);
                i2--;
                z4 = false;
            }
        } else {
            z = true;
        }
        View view3 = null;
        this.n.N0(amhVar);
        kpnVar.b = kpnVar.e;
        this.D = false;
        this.E = false;
        kpnVar.j = false;
        kpnVar.k = false;
        this.n.f = false;
        ArrayList arrayList = (ArrayList) amhVar.e;
        if (arrayList != null) {
            arrayList.clear();
        }
        yon yonVar3 = this.n;
        if (yonVar3.k) {
            yonVar3.j = 0;
            yonVar3.k = false;
            amhVar.n();
        }
        this.n.F0(kpnVar);
        boolean z11 = z;
        j0(z11);
        F0(false);
        ((ciq) apoVar.b).clear();
        ((ovg) apoVar.c).b();
        int[] iArr = this.W0;
        int i7 = iArr[0];
        int i8 = iArr[z11 ? 1 : 0];
        Q(iArr);
        if ((iArr[0] == i7 && iArr[z11 ? 1 : 0] == i8) ? false : true) {
            H(0, 0);
        }
        if (this.J0 && this.m != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j = kpnVar.m;
            if (j != -1 && (z2 = this.m.b) && z2) {
                int o = this.f.o();
                int i9 = 0;
                opnVar = null;
                while (true) {
                    if (i9 >= o) {
                        break;
                    }
                    opn b03 = b0(this.f.n(i9));
                    if (b03 != null && !b03.k() && b03.e == j) {
                        if (!((ArrayList) this.f.e).contains(b03.a)) {
                            opnVar = b03;
                            break;
                        }
                        opnVar = b03;
                    }
                    i9++;
                }
            } else {
                opnVar = null;
            }
            if (opnVar != null) {
                View view4 = opnVar.a;
                if (!((ArrayList) this.f.e).contains(view4) && view4.hasFocusable()) {
                    view3 = view4;
                    if (view3 != null) {
                        int i10 = kpnVar.n;
                        if (i10 != -1 && (findViewById = view3.findViewById(i10)) != null && findViewById.isFocusable()) {
                            view3 = findViewById;
                        }
                        view3.requestFocus();
                    }
                }
            }
            if (this.f.l() > 0) {
                int i11 = kpnVar.l;
                int i12 = i11 != -1 ? i11 : 0;
                int b = kpnVar.b();
                for (int i13 = i12; i13 < b; i13++) {
                    opn S = S(i13);
                    if (S == null) {
                        break;
                    }
                    View view5 = S.a;
                    if (view5.hasFocusable()) {
                        view3 = view5;
                        break;
                    }
                }
                int min = Math.min(b, i12) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    opn S2 = S(min);
                    if (S2 == null) {
                        break;
                    }
                    View view6 = S2.a;
                    if (view6.hasFocusable()) {
                        view3 = view6;
                        break;
                    }
                    min--;
                }
            }
            if (view3 != null) {
            }
        }
        kpnVar.m = -1L;
        kpnVar.l = -1;
        kpnVar.n = -1;
    }

    public final void C0(int i) {
        if (this.x) {
            return;
        }
        yon yonVar = this.n;
        if (yonVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            yonVar.d1(this, i);
        }
    }

    public final void D() {
        veu veuVar;
        View O;
        kpn kpnVar = this.N0;
        kpnVar.a(1);
        N(kpnVar);
        kpnVar.i = false;
        D0();
        apo apoVar = this.g;
        ciq ciqVar = (ciq) apoVar.b;
        ciq ciqVar2 = (ciq) apoVar.b;
        ciqVar.clear();
        ovg ovgVar = (ovg) apoVar.c;
        ovgVar.b();
        i0();
        o0();
        opn opnVar = null;
        View focusedChild = (this.J0 && hasFocus() && this.m != null) ? getFocusedChild() : null;
        if (focusedChild != null && (O = O(focusedChild)) != null) {
            opnVar = a0(O);
        }
        if (opnVar == null) {
            kpnVar.m = -1L;
            kpnVar.l = -1;
            kpnVar.n = -1;
        } else {
            kpnVar.m = this.m.b ? opnVar.e : -1L;
            kpnVar.l = this.D ? -1 : opnVar.k() ? opnVar.d : opnVar.b();
            View view = opnVar.a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            kpnVar.n = id;
        }
        kpnVar.h = kpnVar.j && this.R0;
        this.R0 = false;
        this.Q0 = false;
        kpnVar.g = kpnVar.k;
        kpnVar.e = this.m.c();
        Q(this.W0);
        if (kpnVar.j) {
            int l = this.f.l();
            for (int i = 0; i < l; i++) {
                opn b0 = b0(this.f.k(i));
                if (!b0.r() && (!b0.i() || this.m.b)) {
                    von vonVar = this.v0;
                    von.b(b0);
                    b0.f();
                    vonVar.getClass();
                    c9n c9nVar = new c9n(11, (byte) 0);
                    c9nVar.g(b0);
                    veu veuVar2 = (veu) ciqVar2.get(b0);
                    if (veuVar2 == null) {
                        veuVar2 = veu.a();
                        ciqVar2.put(b0, veuVar2);
                    }
                    veuVar2.b = c9nVar;
                    veuVar2.a |= 4;
                    if (kpnVar.h && b0.n() && !b0.k() && !b0.r() && !b0.i()) {
                        ovgVar.f(X(b0), b0);
                    }
                }
            }
        }
        if (kpnVar.k) {
            int o = this.f.o();
            for (int i2 = 0; i2 < o; i2++) {
                opn b02 = b0(this.f.n(i2));
                if (j1 && b02.c == -1 && !b02.k()) {
                    xq0.q("view holder cannot have position -1 unless it is removed".concat(M()));
                    return;
                }
                if (!b02.r() && b02.d == -1) {
                    b02.d = b02.c;
                }
            }
            boolean z = kpnVar.f;
            kpnVar.f = false;
            this.n.E0(this.c, kpnVar);
            kpnVar.f = z;
            for (int i3 = 0; i3 < this.f.l(); i3++) {
                opn b03 = b0(this.f.k(i3));
                if (!b03.r() && ((veuVar = (veu) ciqVar2.get(b03)) == null || (veuVar.a & 4) == 0)) {
                    von.b(b03);
                    boolean z2 = (b03.j & RemoteCameraConfig.Notification.ID) != 0;
                    von vonVar2 = this.v0;
                    b03.f();
                    vonVar2.getClass();
                    c9n c9nVar2 = new c9n(11, (byte) 0);
                    c9nVar2.g(b03);
                    if (z2) {
                        q0(b03, c9nVar2);
                    } else {
                        veu veuVar3 = (veu) ciqVar2.get(b03);
                        if (veuVar3 == null) {
                            veuVar3 = veu.a();
                            ciqVar2.put(b03, veuVar3);
                        }
                        veuVar3.a |= 2;
                        veuVar3.b = c9nVar2;
                    }
                }
            }
            w();
        } else {
            w();
        }
        j0(true);
        F0(false);
        kpnVar.d = 2;
    }

    public final void D0() {
        int i = this.v + 1;
        this.v = i;
        if (i != 1 || this.x) {
            return;
        }
        this.w = false;
    }

    public final void E() {
        D0();
        i0();
        kpn kpnVar = this.N0;
        kpnVar.a(6);
        this.e.d();
        kpnVar.e = this.m.c();
        kpnVar.c = 0;
        if (this.d != null) {
            qon qonVar = this.m;
            int D = ouj.D(qonVar.c);
            if (D == 1 ? qonVar.c() > 0 : D != 2) {
                Parcelable parcelable = this.d.c;
                if (parcelable != null) {
                    this.n.H0(parcelable);
                }
                this.d = null;
            }
        }
        kpnVar.g = false;
        this.n.E0(this.c, kpnVar);
        kpnVar.f = false;
        kpnVar.j = kpnVar.j && this.v0 != null;
        kpnVar.d = 4;
        j0(true);
        F0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E0(int i) {
        boolean x = this.n.x();
        int i2 = x;
        if (this.n.y()) {
            i2 = (x ? 1 : 0) | 2;
        }
        getScrollingChildHelper().h(i2, i);
    }

    public final boolean F(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void F0(boolean z) {
        if (this.v < 1) {
            if (j1) {
                xq0.q("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(M()));
                return;
            }
            this.v = 1;
        }
        if (!z && !this.x) {
            this.w = false;
        }
        if (this.v == 1) {
            if (z && this.w && !this.x && this.n != null && this.m != null) {
                C();
            }
            if (!this.x) {
                this.w = false;
            }
        }
        this.v--;
    }

    public final void G(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void G0() {
        i7g i7gVar;
        setScrollState(0);
        npn npnVar = this.K0;
        npnVar.g.removeCallbacks(npnVar);
        npnVar.c.abortAnimation();
        yon yonVar = this.n;
        if (yonVar == null || (i7gVar = yonVar.e) == null) {
            return;
        }
        i7gVar.k();
    }

    public final void H(int i, int i2) {
        this.G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        m0(i, i2);
        dpn dpnVar = this.O0;
        if (dpnVar != null) {
            dpnVar.b(this, i, i2);
        }
        ArrayList arrayList = this.P0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((dpn) this.P0.get(size)).b(this, i, i2);
            }
        }
        this.G--;
    }

    public final void I() {
        if (this.L != null) {
            return;
        }
        ((lpn) this.H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.L = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void J() {
        if (this.I != null) {
            return;
        }
        ((lpn) this.H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.I = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void K() {
        if (this.K != null) {
            return;
        }
        ((lpn) this.H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.K = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void L() {
        if (this.J != null) {
            return;
        }
        ((lpn) this.H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.J = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String M() {
        return StringUtil.SPACE + super.toString() + ", adapter:" + this.m + ", layout:" + this.n + ", context:" + getContext();
    }

    public final void N(kpn kpnVar) {
        if (getScrollState() != 2) {
            kpnVar.getClass();
            return;
        }
        OverScroller overScroller = this.K0.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        kpnVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View O(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    public final boolean P(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cpn cpnVar = (cpn) arrayList.get(i);
            if (cpnVar.e(motionEvent) && action != 3) {
                this.r = cpnVar;
                return true;
            }
        }
        return false;
    }

    public final void Q(int[] iArr) {
        int l = this.f.l();
        if (l == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < l; i3++) {
            opn b0 = b0(this.f.k(i3));
            if (!b0.r()) {
                int d = b0.d();
                if (d < i) {
                    i = d;
                }
                if (d > i2) {
                    i2 = d;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final opn S(int i) {
        opn opnVar = null;
        if (this.D) {
            return null;
        }
        int o = this.f.o();
        for (int i2 = 0; i2 < o; i2++) {
            opn b0 = b0(this.f.n(i2));
            if (b0 != null && !b0.k() && W(b0) == i) {
                if (!((ArrayList) this.f.e).contains(b0.a)) {
                    return b0;
                }
                opnVar = b0;
            }
        }
        return opnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final opn T(int i, boolean z) {
        int o = this.f.o();
        opn opnVar = null;
        for (int i2 = 0; i2 < o; i2++) {
            opn b0 = b0(this.f.n(i2));
            if (b0 != null && !b0.k()) {
                if (z) {
                    if (b0.c != i) {
                        continue;
                    }
                    if (((ArrayList) this.f.e).contains(b0.a)) {
                        return b0;
                    }
                    opnVar = b0;
                } else {
                    if (b0.d() != i) {
                        continue;
                    }
                    if (((ArrayList) this.f.e).contains(b0.a)) {
                    }
                }
            }
        }
        return opnVar;
    }

    public boolean U(int i, int i2) {
        return V(i, i2, this.F0, this.G0);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        npn npnVar;
        float f;
        float f2;
        int minFlingVelocity;
        boolean z;
        int f3;
        yon yonVar = this.n;
        if (yonVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.x) {
            boolean x = yonVar.x();
            boolean y = this.n.y();
            if (!x || Math.abs(i) < i3) {
                i = 0;
            }
            if (!y || Math.abs(i2) < i3) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i != 0) {
                    EdgeEffect edgeEffect = this.I;
                    if (edgeEffect == null || ltg.F(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.K;
                        if (edgeEffect2 != null && ltg.F(edgeEffect2) != 0.0f) {
                            if (A0(this.K, i, getWidth())) {
                                this.K.onAbsorb(i);
                                i = 0;
                            }
                            i5 = i;
                            i = 0;
                        }
                    } else {
                        int i7 = -i;
                        if (A0(this.I, i7, getWidth())) {
                            this.I.onAbsorb(i7);
                            i = 0;
                        }
                        i5 = i;
                        i = 0;
                    }
                    if (i2 != 0) {
                        EdgeEffect edgeEffect3 = this.J;
                        if (edgeEffect3 == null || ltg.F(edgeEffect3) == 0.0f) {
                            EdgeEffect edgeEffect4 = this.L;
                            if (edgeEffect4 != null && ltg.F(edgeEffect4) != 0.0f) {
                                if (A0(this.L, i2, getHeight())) {
                                    this.L.onAbsorb(i2);
                                    i2 = 0;
                                }
                                i6 = 0;
                            }
                        } else {
                            int i8 = -i2;
                            if (A0(this.J, i8, getHeight())) {
                                this.J.onAbsorb(i8);
                                i2 = 0;
                            }
                            i6 = 0;
                        }
                        npnVar = this.K0;
                        if (i5 == 0 || i2 != 0) {
                            int i9 = -i4;
                            i5 = Math.max(i9, Math.min(i5, i4));
                            i2 = Math.max(i9, Math.min(i2, i4));
                            E0(1);
                            npnVar.a(i5, i2);
                        }
                        if (i == 0 || i6 != 0) {
                            f = i;
                            f2 = i6;
                            if (!dispatchNestedPreFling(f, f2)) {
                                boolean z2 = x || y;
                                dispatchNestedFling(f, f2, z2);
                                bpn bpnVar = this.E0;
                                if (bpnVar != null) {
                                    h3k h3kVar = (h3k) bpnVar;
                                    yon layoutManager = h3kVar.a.getLayoutManager();
                                    if (layoutManager != null && h3kVar.a.getAdapter() != null && ((Math.abs(i6) > (minFlingVelocity = h3kVar.a.getMinFlingVelocity()) || Math.abs(i) > minFlingVelocity) && ((z = layoutManager instanceof jpn)))) {
                                        g3k g3kVar = !z ? null : new g3k(h3kVar, h3kVar.a.getContext());
                                        if (g3kVar != null && (f3 = h3kVar.f(layoutManager, i, i6)) != -1) {
                                            g3kVar.a = f3;
                                            layoutManager.e1(g3kVar);
                                            return true;
                                        }
                                    }
                                }
                                if (z2) {
                                    E0(1);
                                    int i10 = -i4;
                                    npnVar.a(Math.max(i10, Math.min(i, i4)), Math.max(i10, Math.min(i6, i4)));
                                    return true;
                                }
                            }
                        } else if (i5 != 0 || i2 != 0) {
                            return true;
                        }
                    }
                    i6 = i2;
                    i2 = 0;
                    npnVar = this.K0;
                    if (i5 == 0) {
                    }
                    int i92 = -i4;
                    i5 = Math.max(i92, Math.min(i5, i4));
                    i2 = Math.max(i92, Math.min(i2, i4));
                    E0(1);
                    npnVar.a(i5, i2);
                    if (i == 0) {
                    }
                    f = i;
                    f2 = i6;
                    if (!dispatchNestedPreFling(f, f2)) {
                    }
                }
                i5 = 0;
                if (i2 != 0) {
                }
                i6 = i2;
                i2 = 0;
                npnVar = this.K0;
                if (i5 == 0) {
                }
                int i922 = -i4;
                i5 = Math.max(i922, Math.min(i5, i4));
                i2 = Math.max(i922, Math.min(i2, i4));
                E0(1);
                npnVar.a(i5, i2);
                if (i == 0) {
                }
                f = i;
                f2 = i6;
                if (!dispatchNestedPreFling(f, f2)) {
                }
            }
        }
        return false;
    }

    public final int W(opn opnVar) {
        if ((opnVar.j & 524) == 0 && opnVar.h()) {
            int i = opnVar.c;
            ArrayList arrayList = (ArrayList) this.e.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                rj rjVar = (rj) arrayList.get(i2);
                int i3 = rjVar.a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = rjVar.b;
                        if (i4 <= i) {
                            int i5 = rjVar.d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = rjVar.b;
                        if (i6 == i) {
                            i = rjVar.d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (rjVar.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (rjVar.b <= i) {
                    i += rjVar.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long X(opn opnVar) {
        return this.m.b ? opnVar.e : opnVar.c;
    }

    public final opn a0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return b0(view);
        }
        wvs.i("View ", view, " is not a direct child of ", this);
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        yon yonVar = this.n;
        if (yonVar != null) {
            yonVar.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final Rect c0(View view) {
        zon zonVar = (zon) view.getLayoutParams();
        boolean z = zonVar.c;
        Rect rect = zonVar.b;
        if (z) {
            kpn kpnVar = this.N0;
            if (!kpnVar.g || (!zonVar.a.n() && !zonVar.a.i())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.p;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.j;
                    rect2.set(0, 0, 0, 0);
                    ((won) arrayList.get(i)).f(rect2, view, this, kpnVar);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                zonVar.c = false;
                return rect;
            }
        }
        return rect;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof zon) && this.n.z((zon) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        yon yonVar = this.n;
        if (yonVar != null && yonVar.x()) {
            return this.n.D(this.N0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        yon yonVar = this.n;
        if (yonVar != null && yonVar.x()) {
            return this.n.E(this.N0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        yon yonVar = this.n;
        if (yonVar != null && yonVar.x()) {
            return this.n.F(this.N0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        yon yonVar = this.n;
        if (yonVar != null && yonVar.y()) {
            return this.n.G(this.N0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        yon yonVar = this.n;
        if (yonVar != null && yonVar.y()) {
            return this.n.H(this.N0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        yon yonVar = this.n;
        if (yonVar != null && yonVar.y()) {
            return this.n.I(this.N0);
        }
        return 0;
    }

    public final boolean d0() {
        return !this.u || this.D || this.e.j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        yon layoutManager = getLayoutManager();
        int i = 0;
        if (layoutManager != null) {
            if (layoutManager.y()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        B0(0, measuredHeight, false);
                        return true;
                    }
                    B0(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean l0 = layoutManager.l0();
                    if (keyCode == 122) {
                        if (l0) {
                            i = getAdapter().c();
                        }
                    } else if (!l0) {
                        i = getAdapter().c();
                    }
                    C0(i);
                    return true;
                }
            } else if (layoutManager.x()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        B0(measuredWidth, 0, false);
                        return true;
                    }
                    B0(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean l02 = layoutManager.l0();
                    if (keyCode2 == 122) {
                        if (l02) {
                            i = getAdapter().c();
                        }
                    } else if (!l02) {
                        i = getAdapter().c();
                    }
                    C0(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
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
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((won) arrayList.get(i)).h(canvas, this, this.N0);
        }
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.I;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.J;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.K;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if ((z || this.v0 == null || arrayList.size() <= 0 || !this.v0.f()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final boolean e0() {
        return this.F > 0;
    }

    @Override // defpackage.jyi
    public final void f(int i) {
        getScrollingChildHelper().i(i);
    }

    public final void f0(int i) {
        if (this.n == null) {
            return;
        }
        setScrollState(2);
        this.n.T0(i);
        awakenScrollBars();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017a, code lost:
    
        if (r5 < 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0182, code lost:
    
        if ((r5 * r6) <= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x018a, code lost:
    
        if ((r5 * r6) >= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0164, code lost:
    
        if (r7 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0174, code lost:
    
        if (r5 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0177, code lost:
    
        if (r7 < 0) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View view2;
        int i2;
        char c;
        boolean z;
        this.n.getClass();
        boolean z2 = true;
        boolean z3 = (this.m == null || this.n == null || e0() || this.x) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        kpn kpnVar = this.N0;
        amh amhVar = this.c;
        if (z3 && (i == 2 || i == 1)) {
            if (this.n.y()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                    if (!z && this.n.x()) {
                        z = focusFinder.findNextFocus(this, view, !((this.n.b.getLayoutDirection() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z) {
                        z();
                        if (O(view) != null) {
                            D0();
                            this.n.u0(view, i, amhVar, kpnVar);
                            F0(false);
                        }
                        return null;
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                    if (view2 == null) {
                    }
                    if (view2 != null) {
                        if (O(view2) != null) {
                        }
                        if (z2) {
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
            }
            z = false;
            if (!z) {
                if (focusFinder.findNextFocus(this, view, !((this.n.b.getLayoutDirection() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            z2 = false;
            if (z2) {
            }
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z3) {
                z();
                if (O(view) != null) {
                    D0();
                    view2 = this.n.u0(view, i, amhVar, kpnVar);
                    F0(false);
                }
                return null;
            }
            view2 = findNextFocus;
            if (view2 == null && !view2.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i);
                }
                w0(view2, null);
                return view;
            }
            if (view2 != null && view2 != this && view2 != view) {
                if (O(view2) != null) {
                    z2 = false;
                } else if (view != null && O(view) != null) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    Rect rect = this.j;
                    rect.set(0, 0, width, height);
                    int width2 = view2.getWidth();
                    int height2 = view2.getHeight();
                    Rect rect2 = this.k;
                    rect2.set(0, 0, width2, height2);
                    offsetDescendantRectToMyCoords(view, rect);
                    offsetDescendantRectToMyCoords(view2, rect2);
                    int i3 = this.n.b.getLayoutDirection() == 1 ? -1 : 1;
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
                        c = 1;
                    } else {
                        int i10 = rect.bottom;
                        int i11 = rect2.bottom;
                        c = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (char) 65535 : (char) 0;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 17) {
                                if (i != 33) {
                                    if (i != 66) {
                                        if (i != 130) {
                                            jj4.g(i, "Invalid direction: ", M());
                                            return null;
                                        }
                                    }
                                }
                            }
                        } else if (c <= 0) {
                            if (c == 0) {
                            }
                        }
                    } else if (c >= 0) {
                        if (c == 0) {
                        }
                    }
                }
                return z2 ? view2 : super.focusSearch(view, i);
            }
            z2 = false;
            if (z2) {
            }
        }
    }

    public final void g0() {
        int o = this.f.o();
        for (int i = 0; i < o; i++) {
            ((zon) this.f.n(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.c.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zon zonVar = (zon) ((opn) arrayList.get(i2)).a.getLayoutParams();
            if (zonVar != null) {
                zonVar.c = true;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        yon yonVar = this.n;
        if (yonVar != null) {
            return yonVar.M();
        }
        xq0.q("RecyclerView has no LayoutManager".concat(M()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        yon yonVar = this.n;
        if (yonVar != null) {
            return yonVar.N(getContext(), attributeSet);
        }
        xq0.q("RecyclerView has no LayoutManager".concat(M()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public qon getAdapter() {
        return this.m;
    }

    @Override // android.view.View
    public int getBaseline() {
        yon yonVar = this.n;
        if (yonVar == null) {
            return super.getBaseline();
        }
        yonVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        ton tonVar = this.V0;
        return tonVar == null ? super.getChildDrawingOrder(i, i2) : tonVar.b(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.h;
    }

    public qpn getCompatAccessibilityDelegate() {
        return this.U0;
    }

    @NonNull
    public uon getEdgeEffectFactory() {
        return this.H;
    }

    public von getItemAnimator() {
        return this.v0;
    }

    public int getItemDecorationCount() {
        return this.p.size();
    }

    public yon getLayoutManager() {
        return this.n;
    }

    public int getMaxFlingVelocity() {
        return this.G0;
    }

    public int getMinFlingVelocity() {
        return this.F0;
    }

    public long getNanoTime() {
        if (o1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public bpn getOnFlingListener() {
        return this.E0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.J0;
    }

    @NonNull
    public fpn getRecycledViewPool() {
        return this.c.c();
    }

    public int getScrollState() {
        return this.w0;
    }

    public final void h0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int o = this.f.o();
        for (int i4 = 0; i4 < o; i4++) {
            opn b0 = b0(this.f.n(i4));
            if (b0 != null && !b0.r()) {
                int i5 = b0.c;
                kpn kpnVar = this.N0;
                if (i5 >= i3) {
                    if (k1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + b0 + " now at position " + (b0.c - i2));
                    }
                    b0.o(-i2, z);
                    kpnVar.f = true;
                } else if (i5 >= i) {
                    if (k1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + b0 + " now REMOVED");
                    }
                    b0.a(8);
                    b0.o(-i2, z);
                    b0.c = i - 1;
                    kpnVar.f = true;
                }
            }
        }
        amh amhVar = this.c;
        ArrayList arrayList = (ArrayList) amhVar.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            opn opnVar = (opn) arrayList.get(size);
            if (opnVar != null) {
                int i6 = opnVar.c;
                if (i6 >= i3) {
                    if (k1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + opnVar + " now at position " + (opnVar.c - i2));
                    }
                    opnVar.o(-i2, z);
                } else if (i6 >= i) {
                    opnVar.a(8);
                    amhVar.h(size);
                }
            }
        }
        requestLayout();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i0() {
        this.F++;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j0(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.F - 1;
        this.F = i2;
        if (i2 < 1) {
            if (j1 && i2 < 0) {
                xq0.q("layout or scroll counter cannot go below zero.Some calls are not matching".concat(M()));
                return;
            }
            this.F = 0;
            if (z) {
                int i3 = this.z;
                this.z = 0;
                if (i3 != 0 && (accessibilityManager = this.B) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.b1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    opn opnVar = (opn) arrayList.get(size);
                    if (opnVar.a.getParent() == this && !opnVar.r() && (i = opnVar.q) != -1) {
                        opnVar.a.setImportantForAccessibility(i);
                        opnVar.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void k0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.x0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.x0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.B0 = x;
            this.z0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.C0 = y;
            this.A0 = y;
        }
    }

    public void l0(int i) {
    }

    public void m0(int i, int i2) {
    }

    public final void n0() {
        if (this.T0 || !this.s) {
            return;
        }
        WeakHashMap weakHashMap = wdu.a;
        postOnAnimation(this.c1);
        this.T0 = true;
    }

    public final void o0() {
        boolean z;
        boolean z2 = false;
        if (this.D) {
            sj sjVar = this.e;
            sjVar.p((ArrayList) sjVar.c);
            sjVar.p((ArrayList) sjVar.d);
            sjVar.a = 0;
            if (this.E) {
                this.n.A0();
            }
        }
        boolean z3 = this.v0 != null && this.n.f1();
        sj sjVar2 = this.e;
        if (z3) {
            sjVar2.o();
        } else {
            sjVar2.d();
        }
        boolean z4 = this.Q0 || this.R0;
        boolean z5 = this.u && this.v0 != null && ((z = this.D) || z4 || this.n.f) && (!z || this.m.b);
        kpn kpnVar = this.N0;
        kpnVar.j = z5;
        if (z5 && z4 && !this.D && this.v0 != null && this.n.f1()) {
            z2 = true;
        }
        kpnVar.k = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f;
        super.onAttachedToWindow();
        this.F = 0;
        this.s = true;
        this.u = this.u && !isLayoutRequested();
        this.c.e();
        yon yonVar = this.n;
        if (yonVar != null) {
            yonVar.g = true;
            yonVar.s0(this);
        }
        this.T0 = false;
        if (o1) {
            ThreadLocal threadLocal = m1d.e;
            m1d m1dVar = (m1d) threadLocal.get();
            this.L0 = m1dVar;
            if (m1dVar == null) {
                this.L0 = new m1d();
                WeakHashMap weakHashMap = wdu.a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f = display.getRefreshRate();
                }
                f = 60.0f;
                m1d m1dVar2 = this.L0;
                m1dVar2.c = (long) (1.0E9f / f);
                threadLocal.set(m1dVar2);
            }
            ArrayList arrayList = this.L0.a;
            if (j1 && arrayList.contains(this)) {
                xq0.q("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m1d m1dVar;
        super.onDetachedFromWindow();
        von vonVar = this.v0;
        if (vonVar != null) {
            vonVar.e();
        }
        G0();
        int i = 0;
        this.s = false;
        yon yonVar = this.n;
        amh amhVar = this.c;
        if (yonVar != null) {
            yonVar.g = false;
            yonVar.t0(this, amhVar);
        }
        this.b1.clear();
        removeCallbacks(this.c1);
        this.g.getClass();
        while (veu.d.f() != null) {
        }
        ArrayList arrayList = (ArrayList) amhVar.f;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            tyf.l(((opn) arrayList.get(i2)).a);
        }
        amhVar.f(((RecyclerView) amhVar.h).m, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                rj7.m();
                return;
            }
            ArrayList arrayList2 = tyf.w(childAt).a;
            for (int g = u75.g(arrayList2); -1 < g; g--) {
                ((ydu) arrayList2.get(g)).a.m();
            }
            i = i3;
        }
        if (!o1 || (m1dVar = this.L0) == null) {
            return;
        }
        boolean remove = m1dVar.a.remove(this);
        if (!j1 || remove) {
            this.L0 = null;
        } else {
            xq0.q("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((won) arrayList.get(i)).g(canvas, this, this.N0);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i;
        boolean z;
        if (this.n != null && !this.x && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f2 = this.n.y() ? -motionEvent.getAxisValue(9) : 0.0f;
                f = this.n.x() ? motionEvent.getAxisValue(10) : 0.0f;
                i = 0;
                z = false;
                r2 = f2;
            } else if ((motionEvent.getSource() & RemoteCameraConfig.Camera.BITRATE) != 0) {
                f = motionEvent.getAxisValue(26);
                if (this.n.y()) {
                    float f3 = -f;
                    f = 0.0f;
                    r2 = f3;
                } else if (!this.n.x()) {
                    f = 0.0f;
                }
                i = 26;
                z = this.g1;
            } else {
                f = 0.0f;
                i = 0;
                z = false;
            }
            int i2 = (int) (r2 * this.I0);
            int i3 = (int) (f * this.H0);
            if (z) {
                OverScroller overScroller = this.K0.c;
                B0((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                yon yonVar = this.n;
                if (yonVar == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.x) {
                    int[] iArr = this.a1;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean x = yonVar.x();
                    boolean y = this.n.y();
                    int i4 = y ? (x ? 1 : 0) | 2 : x ? 1 : 0;
                    float y2 = motionEvent.getY();
                    float x2 = motionEvent.getX();
                    int s0 = i3 - s0(i3, y2);
                    int t0 = i2 - t0(i2, x2);
                    getScrollingChildHelper().h(i4, 1);
                    if (F(x ? s0 : 0, y ? t0 : 0, 1, this.a1, this.Y0)) {
                        s0 -= iArr[0];
                        t0 -= iArr[1];
                    }
                    x0(x ? s0 : 0, y ? t0 : 0, motionEvent, 1);
                    m1d m1dVar = this.L0;
                    if (m1dVar != null && (s0 != 0 || t0 != 0)) {
                        m1dVar.a(this, s0, t0);
                    }
                    f(1);
                }
            }
            if (i != 0 && !z) {
                this.i1.a(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.x) {
            this.r = null;
            if (P(motionEvent)) {
                VelocityTracker velocityTracker = this.y0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                f(0);
                r0();
                setScrollState(0);
                return true;
            }
            yon yonVar = this.n;
            if (yonVar != null) {
                boolean x = yonVar.x();
                boolean y = this.n.y();
                if (this.y0 == null) {
                    this.y0 = VelocityTracker.obtain();
                }
                this.y0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.y) {
                        this.y = false;
                    }
                    this.x0 = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.B0 = x2;
                    this.z0 = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.C0 = y2;
                    this.A0 = y2;
                    EdgeEffect edgeEffect = this.I;
                    if (edgeEffect == null || ltg.F(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        ltg.H(this.I, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.K;
                    if (edgeEffect2 != null && ltg.F(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        ltg.H(this.K, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.J;
                    if (edgeEffect3 != null && ltg.F(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        ltg.H(this.J, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.L;
                    if (edgeEffect4 != null && ltg.F(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        ltg.H(this.L, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.w0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        f(1);
                    }
                    int[] iArr = this.Z0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    E0(0);
                } else if (actionMasked == 1) {
                    this.y0.clear();
                    f(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.x0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.x0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.w0 != 1) {
                        int i = x3 - this.z0;
                        int i2 = y3 - this.A0;
                        if (!x || Math.abs(i) <= this.D0) {
                            z2 = false;
                        } else {
                            this.B0 = x3;
                            z2 = true;
                        }
                        if (y && Math.abs(i2) > this.D0) {
                            this.C0 = y3;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.y0;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    f(0);
                    r0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.x0 = motionEvent.getPointerId(actionIndex);
                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.B0 = x4;
                    this.z0 = x4;
                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.C0 = y4;
                    this.A0 = y4;
                } else if (actionMasked == 6) {
                    k0(motionEvent);
                }
                if (this.w0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        C();
        Trace.endSection();
        this.u = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        yon yonVar = this.n;
        if (yonVar == null) {
            A(i, i2);
            return;
        }
        boolean k0 = yonVar.k0();
        amh amhVar = this.c;
        boolean z = false;
        kpn kpnVar = this.N0;
        if (k0) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.n.G0(amhVar, kpnVar, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.d1 = z;
            if (z || this.m == null) {
                return;
            }
            if (kpnVar.d == 1) {
                D();
            }
            this.n.W0(i, i2);
            kpnVar.i = true;
            E();
            this.n.Y0(i, i2);
            if (this.n.b1()) {
                this.n.W0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                kpnVar.i = true;
                E();
                this.n.Y0(i, i2);
            }
            this.e1 = getMeasuredWidth();
            this.f1 = getMeasuredHeight();
            return;
        }
        if (this.t) {
            this.n.G0(amhVar, kpnVar, i, i2);
            return;
        }
        if (this.A) {
            D0();
            i0();
            o0();
            j0(true);
            if (kpnVar.k) {
                kpnVar.g = true;
            } else {
                this.e.d();
                kpnVar.g = false;
            }
            this.A = false;
            F0(false);
        } else if (kpnVar.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        qon qonVar = this.m;
        if (qonVar != null) {
            kpnVar.e = qonVar.c();
        } else {
            kpnVar.e = 0;
        }
        D0();
        this.n.G0(amhVar, kpnVar, i, i2);
        F0(false);
        kpnVar.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (e0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ipn)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ipn ipnVar = (ipn) parcelable;
        this.d = ipnVar;
        super.onRestoreInstanceState(ipnVar.a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ipn ipnVar = new ipn(super.onSaveInstanceState());
        ipn ipnVar2 = this.d;
        if (ipnVar2 != null) {
            ipnVar.c = ipnVar2.c;
            return ipnVar;
        }
        yon yonVar = this.n;
        if (yonVar != null) {
            ipnVar.c = yonVar.I0();
            return ipnVar;
        }
        ipnVar.c = null;
        return ipnVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.L = null;
        this.J = null;
        this.K = null;
        this.I = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.x && !this.y) {
            cpn cpnVar = this.r;
            if (cpnVar == null) {
                z = motionEvent.getAction() == 0 ? false : P(motionEvent);
            } else {
                cpnVar.d(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.r = null;
                }
                z = true;
            }
            if (z) {
                VelocityTracker velocityTracker = this.y0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                f(0);
                r0();
                setScrollState(0);
                return true;
            }
            yon yonVar = this.n;
            if (yonVar != null) {
                boolean x = yonVar.x();
                boolean y = this.n.y();
                if (this.y0 == null) {
                    this.y0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.Z0;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked == 0) {
                    this.x0 = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.B0 = x2;
                    this.z0 = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.C0 = y2;
                    this.A0 = y2;
                    E0(0);
                } else {
                    if (actionMasked == 1) {
                        this.y0.addMovement(obtain);
                        this.y0.computeCurrentVelocity(1000, this.G0);
                        float f = x ? -this.y0.getXVelocity(this.x0) : 0.0f;
                        float f2 = y ? -this.y0.getYVelocity(this.x0) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !U((int) f, (int) f2)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker2 = this.y0;
                        if (velocityTracker2 != null) {
                            velocityTracker2.clear();
                        }
                        f(0);
                        r0();
                        obtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.x0);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.x0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i = this.B0 - x3;
                        int i2 = this.C0 - y3;
                        if (this.w0 != 1) {
                            if (x) {
                                int i3 = this.D0;
                                i = i > 0 ? Math.max(0, i - i3) : Math.min(0, i + i3);
                                if (i != 0) {
                                    z2 = true;
                                    if (y) {
                                        int i4 = this.D0;
                                        i2 = i2 > 0 ? Math.max(0, i2 - i4) : Math.min(0, i2 + i4);
                                        if (i2 != 0) {
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z2 = false;
                            if (y) {
                            }
                            if (z2) {
                            }
                        }
                        if (this.w0 == 1) {
                            int[] iArr2 = this.a1;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int s0 = i - s0(i, motionEvent.getY());
                            int t0 = i2 - t0(i2, motionEvent.getX());
                            boolean F = F(x ? s0 : 0, y ? t0 : 0, 0, this.a1, this.Y0);
                            int[] iArr3 = this.Y0;
                            if (F) {
                                s0 -= iArr2[0];
                                t0 -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i5 = s0;
                            int i6 = t0;
                            this.B0 = x3 - iArr3[0];
                            this.C0 = y3 - iArr3[1];
                            if (x0(x ? i5 : 0, y ? i6 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            m1d m1dVar = this.L0;
                            if (m1dVar != null && (i5 != 0 || i6 != 0)) {
                                m1dVar.a(this, i5, i6);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker3 = this.y0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        f(0);
                        r0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.x0 = motionEvent.getPointerId(actionIndex);
                        int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.B0 = x4;
                        this.z0 = x4;
                        int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.C0 = y4;
                        this.A0 = y4;
                    } else if (actionMasked == 6) {
                        k0(motionEvent);
                    }
                }
                this.y0.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p0(boolean z) {
        this.E = z | this.E;
        this.D = true;
        int o = this.f.o();
        for (int i = 0; i < o; i++) {
            opn b0 = b0(this.f.n(i));
            if (b0 != null && !b0.r()) {
                b0.a(6);
            }
        }
        g0();
        amh amhVar = this.c;
        ArrayList arrayList = (ArrayList) amhVar.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            opn opnVar = (opn) arrayList.get(i2);
            if (opnVar != null) {
                opnVar.a(6);
                opnVar.a(1024);
            }
        }
        qon qonVar = ((RecyclerView) amhVar.h).m;
        if (qonVar == null || !qonVar.b) {
            amhVar.g();
        }
    }

    public final void q0(opn opnVar, c9n c9nVar) {
        opnVar.j &= -8193;
        boolean z = this.N0.h;
        apo apoVar = this.g;
        if (z && opnVar.n() && !opnVar.k() && !opnVar.r()) {
            ((ovg) apoVar.c).f(X(opnVar), opnVar);
        }
        ciq ciqVar = (ciq) apoVar.b;
        veu veuVar = (veu) ciqVar.get(opnVar);
        if (veuVar == null) {
            veuVar = veu.a();
            ciqVar.put(opnVar, veuVar);
        }
        veuVar.b = c9nVar;
        veuVar.a |= 4;
    }

    public final void r(opn opnVar) {
        View view = opnVar.a;
        boolean z = view.getParent() == this;
        this.c.m(a0(view));
        boolean m = opnVar.m();
        c1t c1tVar = this.f;
        if (m) {
            c1tVar.g(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            c1tVar.f(view, -1, true);
            return;
        }
        int indexOfChild = ((RecyclerView) ((g8c) c1tVar.c).a).indexOfChild(view);
        if (indexOfChild < 0) {
            kac.j(view, "view is not a child, cannot hide ");
        } else {
            ((au1) c1tVar.d).S(indexOfChild);
            c1tVar.p(view);
        }
    }

    public final void r0() {
        boolean z;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.I.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.L.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        opn b0 = b0(view);
        if (b0 != null) {
            if (b0.m()) {
                b0.j &= -257;
            } else if (!b0.r()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(b0);
                xq0.s(sb, M());
                return;
            }
        } else if (j1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            xq0.s(sb2, M());
            return;
        }
        view.clearAnimation();
        B(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        i7g i7gVar = this.n.e;
        if ((i7gVar == null || !i7gVar.e) && !e0() && view2 != null) {
            w0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.n.Q0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cpn) arrayList.get(i)).c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.v != 0 || this.x) {
            this.w = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(won wonVar) {
        yon yonVar = this.n;
        if (yonVar != null) {
            yonVar.v("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(wonVar);
        g0();
        requestLayout();
    }

    public final int s0(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.I;
        float f2 = 0.0f;
        if (edgeEffect == null || ltg.F(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.K;
            if (edgeEffect2 != null && ltg.F(edgeEffect2) != 0.0f) {
                boolean canScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.K;
                if (canScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float H = ltg.H(edgeEffect3, width, height);
                    if (ltg.F(this.K) == 0.0f) {
                        this.K.onRelease();
                    }
                    f2 = H;
                }
                invalidate();
            }
        } else {
            boolean canScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.I;
            if (canScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -ltg.H(edgeEffect4, -width, 1.0f - height);
                if (ltg.F(this.I) == 0.0f) {
                    this.I.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        yon yonVar = this.n;
        if (yonVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.x) {
            return;
        }
        boolean x = yonVar.x();
        boolean y = this.n.y();
        if (x || y) {
            if (!x) {
                i = 0;
            }
            if (!y) {
                i2 = 0;
            }
            x0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!e0()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.z |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(qpn qpnVar) {
        this.U0 = qpnVar;
        wdu.q(this, qpnVar);
    }

    public void setAdapter(qon qonVar) {
        setLayoutFrozen(false);
        qon qonVar2 = this.m;
        hpn hpnVar = this.b;
        if (qonVar2 != null) {
            qonVar2.t(hpnVar);
            this.m.getClass();
        }
        von vonVar = this.v0;
        if (vonVar != null) {
            vonVar.e();
        }
        yon yonVar = this.n;
        amh amhVar = this.c;
        if (yonVar != null) {
            yonVar.M0(amhVar);
            this.n.N0(amhVar);
        }
        ((ArrayList) amhVar.d).clear();
        amhVar.g();
        sj sjVar = this.e;
        sjVar.p((ArrayList) sjVar.c);
        sjVar.p((ArrayList) sjVar.d);
        sjVar.a = 0;
        qon qonVar3 = this.m;
        this.m = qonVar;
        if (qonVar != null) {
            qonVar.r(hpnVar);
        }
        yon yonVar2 = this.n;
        if (yonVar2 != null) {
            yonVar2.r0();
        }
        qon qonVar4 = this.m;
        ((ArrayList) amhVar.d).clear();
        amhVar.g();
        amhVar.f(qonVar3, true);
        fpn c = amhVar.c();
        if (qonVar3 != null) {
            c.b--;
        }
        if (c.b == 0) {
            c.a();
        }
        if (qonVar4 != null) {
            c.b++;
        }
        amhVar.e();
        this.N0.f = true;
        p0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(ton tonVar) {
        if (tonVar == this.V0) {
            return;
        }
        this.V0 = tonVar;
        setChildrenDrawingOrderEnabled(tonVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.h) {
            this.L = null;
            this.J = null;
            this.K = null;
            this.I = null;
        }
        this.h = z;
        super.setClipToPadding(z);
        if (this.u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull uon uonVar) {
        uonVar.getClass();
        this.H = uonVar;
        this.L = null;
        this.J = null;
        this.K = null;
        this.I = null;
    }

    public void setHasFixedSize(boolean z) {
        this.t = z;
    }

    public void setItemAnimator(von vonVar) {
        von vonVar2 = this.v0;
        if (vonVar2 != null) {
            vonVar2.e();
            this.v0.a = null;
        }
        this.v0 = vonVar;
        if (vonVar != null) {
            vonVar.a = this.S0;
        }
    }

    public void setItemViewCacheSize(int i) {
        amh amhVar = this.c;
        amhVar.b = i;
        amhVar.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(yon yonVar) {
        RecyclerView recyclerView;
        if (yonVar == this.n) {
            return;
        }
        G0();
        yon yonVar2 = this.n;
        amh amhVar = this.c;
        if (yonVar2 != null) {
            von vonVar = this.v0;
            if (vonVar != null) {
                vonVar.e();
            }
            this.n.M0(amhVar);
            this.n.N0(amhVar);
            ((ArrayList) amhVar.d).clear();
            amhVar.g();
            if (this.s) {
                yon yonVar3 = this.n;
                yonVar3.g = false;
                yonVar3.t0(this, amhVar);
            }
            this.n.Z0(null);
            this.n = null;
        } else {
            ((ArrayList) amhVar.d).clear();
            amhVar.g();
        }
        c1t c1tVar = this.f;
        ((au1) c1tVar.d).Q();
        ArrayList arrayList = (ArrayList) c1tVar.e;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = (RecyclerView) ((g8c) c1tVar.c).a;
            if (size < 0) {
                break;
            }
            opn b0 = b0((View) arrayList.get(size));
            if (b0 != null) {
                int i = b0.p;
                if (recyclerView.e0()) {
                    b0.q = i;
                    recyclerView.b1.add(b0);
                } else {
                    b0.a.setImportantForAccessibility(i);
                }
                b0.p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.B(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.n = yonVar;
        if (yonVar != null) {
            if (yonVar.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(yonVar);
                wvs.l(sb, " is already attached to a RecyclerView:", yonVar.b.M());
                return;
            } else {
                yonVar.Z0(this);
                if (this.s) {
                    yon yonVar4 = this.n;
                    yonVar4.g = true;
                    yonVar4.s0(this);
                }
            }
        }
        amhVar.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            xq0.x("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().g(z);
    }

    public void setOnFlingListener(bpn bpnVar) {
        this.E0 = bpnVar;
    }

    @Deprecated
    public void setOnScrollListener(dpn dpnVar) {
        this.O0 = dpnVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.J0 = z;
    }

    public void setRecycledViewPool(fpn fpnVar) {
        amh amhVar = this.c;
        RecyclerView recyclerView = (RecyclerView) amhVar.h;
        amhVar.f(recyclerView.m, false);
        if (((fpn) amhVar.g) != null) {
            r2.b--;
        }
        amhVar.g = fpnVar;
        if (fpnVar != null && recyclerView.getAdapter() != null) {
            ((fpn) amhVar.g).b++;
        }
        amhVar.e();
    }

    public void setScrollState(int i) {
        i7g i7gVar;
        if (i == this.w0) {
            return;
        }
        if (k1) {
            StringBuilder q = k5r.q(i, "setting scroll state to ", " from ");
            q.append(this.w0);
            Log.d("RecyclerView", q.toString(), new Exception());
        }
        this.w0 = i;
        if (i != 2) {
            npn npnVar = this.K0;
            npnVar.g.removeCallbacks(npnVar);
            npnVar.c.abortAnimation();
            yon yonVar = this.n;
            if (yonVar != null && (i7gVar = yonVar.e) != null) {
                i7gVar.k();
            }
        }
        yon yonVar2 = this.n;
        if (yonVar2 != null) {
            yonVar2.J0(i);
        }
        l0(i);
        dpn dpnVar = this.O0;
        if (dpnVar != null) {
            dpnVar.a(this, i);
        }
        ArrayList arrayList = this.P0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((dpn) this.P0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.D0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.D0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(mpn mpnVar) {
        this.c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.x) {
            u("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.x = true;
                this.y = true;
                G0();
                return;
            }
            this.x = false;
            if (this.w && this.n != null && this.m != null) {
                requestLayout();
            }
            this.w = false;
        }
    }

    public final void t(dpn dpnVar) {
        if (this.P0 == null) {
            this.P0 = new ArrayList();
        }
        this.P0.add(dpnVar);
    }

    public final int t0(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.J;
        float f2 = 0.0f;
        if (edgeEffect == null || ltg.F(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.L;
            if (edgeEffect2 != null && ltg.F(edgeEffect2) != 0.0f) {
                boolean canScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.L;
                if (canScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float H = ltg.H(edgeEffect3, height, 1.0f - width);
                    if (ltg.F(this.L) == 0.0f) {
                        this.L.onRelease();
                    }
                    f2 = H;
                }
                invalidate();
            }
        } else {
            boolean canScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.J;
            if (canScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -ltg.H(edgeEffect4, -height, width);
                if (ltg.F(this.J) == 0.0f) {
                    this.J.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    public final void u(String str) {
        if (!e0()) {
            if (this.G > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(M()));
            }
        } else if (str == null) {
            xq0.q("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(M()));
        } else {
            xq0.q(str);
        }
    }

    public final void u0(won wonVar) {
        yon yonVar = this.n;
        if (yonVar != null) {
            yonVar.v("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        arrayList.remove(wonVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        g0();
        requestLayout();
    }

    public final void v0(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        int itemDecorationCount2 = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount2) {
            u0((won) this.p.get(i));
            return;
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount2);
    }

    public final void w() {
        int o = this.f.o();
        for (int i = 0; i < o; i++) {
            opn b0 = b0(this.f.n(i));
            if (!b0.r()) {
                b0.d = -1;
                b0.g = -1;
            }
        }
        amh amhVar = this.c;
        ArrayList arrayList = (ArrayList) amhVar.d;
        ArrayList arrayList2 = (ArrayList) amhVar.f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            opn opnVar = (opn) arrayList2.get(i2);
            opnVar.d = -1;
            opnVar.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            opn opnVar2 = (opn) arrayList.get(i3);
            opnVar2.d = -1;
            opnVar2.g = -1;
        }
        ArrayList arrayList3 = (ArrayList) amhVar.e;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                opn opnVar3 = (opn) ((ArrayList) amhVar.e).get(i4);
                opnVar3.d = -1;
                opnVar3.g = -1;
            }
        }
    }

    public final void w0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof zon) {
            zon zonVar = (zon) layoutParams;
            if (!zonVar.c) {
                Rect rect2 = zonVar.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.n.Q0(this, view, this.j, !this.u, view2 == null);
    }

    public final void x(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.I.onRelease();
            z = this.I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.K.onRelease();
            z |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.J.onRelease();
            z |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.L.onRelease();
            z |= this.L.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        z();
        qon qonVar = this.m;
        int[] iArr = this.a1;
        if (qonVar != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            y0(i, i2, iArr);
            i4 = iArr[0];
            i5 = iArr[1];
            i6 = i - i4;
            i7 = i2 - i5;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.p.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        G(i4, i5, i6, i7, this.Y0, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z4 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.B0;
        int[] iArr2 = this.Y0;
        int i13 = iArr2[0];
        this.B0 = i12 - i13;
        int i14 = this.C0;
        int i15 = iArr2[1];
        this.C0 = i14 - i15;
        int[] iArr3 = this.Z0;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || rzf.H(motionEvent, 8194)) {
                z = true;
                z2 = false;
            } else {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < 0.0f) {
                    J();
                    z = true;
                    z2 = false;
                    ltg.H(this.I, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    z2 = false;
                    if (f > 0.0f) {
                        K();
                        ltg.H(this.K, f / getWidth(), y / getHeight());
                    } else {
                        z3 = false;
                        if (f2 >= 0.0f) {
                            L();
                            ltg.H(this.J, (-f2) / getHeight(), x / getWidth());
                        } else {
                            if (f2 > 0.0f) {
                                I();
                                ltg.H(this.L, f2 / getHeight(), 1.0f - (x / getWidth()));
                            }
                            if (!z3 || f != 0.0f || f2 != 0.0f) {
                                postInvalidateOnAnimation();
                            }
                            if (Build.VERSION.SDK_INT >= 31 && rzf.H(motionEvent, RemoteCameraConfig.Camera.BITRATE)) {
                                r0();
                            }
                        }
                        z3 = z;
                        if (!z3) {
                        }
                        postInvalidateOnAnimation();
                        if (Build.VERSION.SDK_INT >= 31) {
                            r0();
                        }
                    }
                }
                z3 = z;
                if (f2 >= 0.0f) {
                }
                z3 = z;
                if (!z3) {
                }
                postInvalidateOnAnimation();
                if (Build.VERSION.SDK_INT >= 31) {
                }
            }
            x(i, i2);
        } else {
            z = true;
            z2 = false;
        }
        if (i4 != 0 || i5 != 0) {
            H(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z4 && i4 == 0 && i5 == 0) ? z2 : z;
    }

    public final void y0(int i, int i2, int[] iArr) {
        opn opnVar;
        D0();
        i0();
        Trace.beginSection("RV Scroll");
        kpn kpnVar = this.N0;
        N(kpnVar);
        amh amhVar = this.c;
        int S0 = i != 0 ? this.n.S0(i, amhVar, kpnVar) : 0;
        int U0 = i2 != 0 ? this.n.U0(i2, amhVar, kpnVar) : 0;
        Trace.endSection();
        int l = this.f.l();
        for (int i3 = 0; i3 < l; i3++) {
            View k = this.f.k(i3);
            opn a0 = a0(k);
            if (a0 != null && (opnVar = a0.i) != null) {
                View view = opnVar.a;
                int left = k.getLeft();
                int top = k.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        j0(true);
        F0(false);
        if (iArr != null) {
            iArr[0] = S0;
            iArr[1] = U0;
        }
    }

    public final void z() {
        if (!this.u || this.D) {
            Trace.beginSection("RV FullInvalidate");
            C();
            Trace.endSection();
            return;
        }
        if (this.e.j()) {
            sj sjVar = this.e;
            int i = sjVar.a;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (sjVar.j()) {
                    Trace.beginSection("RV FullInvalidate");
                    C();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            D0();
            i0();
            this.e.o();
            if (!this.w) {
                int l = this.f.l();
                int i2 = 0;
                while (true) {
                    if (i2 < l) {
                        opn b0 = b0(this.f.k(i2));
                        if (b0 != null && !b0.r() && b0.n()) {
                            C();
                            break;
                        }
                        i2++;
                    } else {
                        this.e.c();
                        break;
                    }
                }
            }
            F0(true);
            j0(true);
            Trace.endSection();
        }
    }

    public final void z0(int i) {
        if (this.x) {
            return;
        }
        G0();
        yon yonVar = this.n;
        if (yonVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            yonVar.T0(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        yon yonVar = this.n;
        if (yonVar != null) {
            return yonVar.O(layoutParams);
        }
        xq0.q("RecyclerView has no LayoutManager".concat(M()));
        return null;
    }

    @Deprecated
    public void setRecyclerListener(gpn gpnVar) {
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ru.yandex.music.R.attr.recyclerViewStyle);
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }
}
