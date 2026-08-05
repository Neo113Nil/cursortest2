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
import defpackage.FzsqRtM7;
import defpackage.VM67d7Sv;
import defpackage.a20;
import defpackage.a5;
import defpackage.as;
import defpackage.b20;
import defpackage.bg0;
import defpackage.c20;
import defpackage.cw;
import defpackage.d20;
import defpackage.e20;
import defpackage.eb;
import defpackage.f0;
import defpackage.f20;
import defpackage.fw;
import defpackage.g20;
import defpackage.hg0;
import defpackage.i20;
import defpackage.j10;
import defpackage.jd0;
import defpackage.jg0;
import defpackage.k10;
import defpackage.l10;
import defpackage.lq;
import defpackage.m1;
import defpackage.m10;
import defpackage.mg0;
import defpackage.o10;
import defpackage.p10;
import defpackage.p70;
import defpackage.pl;
import defpackage.q10;
import defpackage.q50;
import defpackage.q70;
import defpackage.rl;
import defpackage.t10;
import defpackage.u10;
import defpackage.ug;
import defpackage.v10;
import defpackage.w10;
import defpackage.x00;
import defpackage.x10;
import defpackage.y10;
import defpackage.z10;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final Class[] AxnhUDtd;
    public static final k10 d3vfVszL;
    public static final int[] yzvmSy3z = {R.attr.nestedScrollingEnabled};
    public int B1cjorwa;
    public boolean CTE3lpUp;
    public final l10 D4B4MtvK;
    public int DK9slbsy;
    public final f20 ESscZ9M1;
    public boolean Ey6iv0m0;
    public int FXJmAAN1;
    public boolean FySoLYna;
    public int HdOGZAzC;
    public boolean I5GHvsYW;
    public final int KRabZ4CU;
    public boolean KlHjfFWx;
    public final pl LfKQckgD;
    public boolean LvHlPNBd;
    public final z10 MdtA4re8;
    public boolean Mq3SeTnW;
    public final int[] N2kLh4D5;
    public int N8VPGzVC;
    public final b20 NCTxEWno;
    public m10 OnDfzHZD;
    public final ArrayList OxcuoDLp;
    public final f0 P7K7Inc8;
    public boolean QT4Tf9Dt;
    public boolean Qr9iLBAD;
    public int RXQxj5Oe;
    public final j10 S7WAX0X5;
    public final ArrayList SMax8wMR;
    public int SgZGMMPL;
    public ArrayList Sjrx9cEN;
    public final float TrssYQ34;
    public final AccessibilityManager U0LaHZX7;
    public rl VGmz0ccI;
    public final VM67d7Sv VgvYg0wo;
    public EdgeEffect VhgXwMj9;
    public boolean WYNAV5pd;
    public final l10 Wi7iiXC4;
    public int X1t0wlBd;
    public q10 Xkz7p5xa;
    public final int[] XrPeKzBk;
    public int ZyZthT5G;
    public EdgeEffect aZz0PFXp;
    public ug amk52bBQ;
    public final q50 b2ZJblxo;
    public final int bvfAo0eO;
    public final int[] dHozS53r;
    public EdgeEffect eIA6dogk;
    public final Rect eVhOlqcC;
    public int euDDoUNr;
    public cw f7oeun2L;
    public int fVMzMhyS;
    public boolean g2aRJUAd;
    public boolean gjV1z5T1;
    public final float gmkaJpmS;
    public boolean hGvurcGl;
    public int hzgxAD8d;
    public boolean i7xS8jrb;
    public final j10 jb9XjC4I;
    public final Rect k3x7lurq;
    public final ArrayList lDXGDhIF;
    public boolean lwWCatUu;
    public int nSmgoSB5;
    public i20 orhfF2Ya;
    public final RectF ow5vqvCr;
    public final d20 pP9Y2m6O;
    public EdgeEffect pRiPUEwG;
    public final ArrayList sjUBp5pO;
    public w10 tef3qNMP;
    public final int[] uQ3KJUK5;
    public c20 wxUZMvaN;
    public t10 ygLcUYwZ;
    public p10 ytu5o6f4;
    public VelocityTracker zCflySGU;

    static {
        Class cls = Integer.TYPE;
        AxnhUDtd = new Class[]{Context.class, AttributeSet.class, cls, cls};
        d3vfVszL = new k10();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v4 */
    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kolosta.rejin.jilosa.R.attr.recyclerViewStyle);
        float qoPGr6Ce;
        char c;
        int i;
        boolean z;
        char c2;
        TypedArray typedArray;
        int i2;
        Constructor constructor;
        Object[] objArr;
        this.NCTxEWno = new b20(this);
        this.MdtA4re8 = new z10(this);
        q50 q50Var = new q50();
        q50Var.qoPGr6Ce = new p70(0);
        q50Var.NCTxEWno = new lq();
        this.b2ZJblxo = q50Var;
        this.jb9XjC4I = new j10(this, 0);
        this.eVhOlqcC = new Rect();
        this.k3x7lurq = new Rect();
        this.ow5vqvCr = new RectF();
        this.lDXGDhIF = new ArrayList();
        this.sjUBp5pO = new ArrayList();
        this.OxcuoDLp = new ArrayList();
        this.RXQxj5Oe = 0;
        this.i7xS8jrb = false;
        this.Mq3SeTnW = false;
        this.euDDoUNr = 0;
        this.SgZGMMPL = 0;
        this.ytu5o6f4 = new p10();
        eb ebVar = new eb();
        ebVar.qoPGr6Ce = null;
        ebVar.NCTxEWno = new ArrayList();
        ebVar.MdtA4re8 = 120L;
        ebVar.wxUZMvaN = 120L;
        ebVar.VgvYg0wo = 250L;
        ebVar.P7K7Inc8 = 250L;
        ebVar.b2ZJblxo = true;
        ebVar.Qr9iLBAD = new ArrayList();
        ebVar.jb9XjC4I = new ArrayList();
        ebVar.eVhOlqcC = new ArrayList();
        ebVar.k3x7lurq = new ArrayList();
        ebVar.ow5vqvCr = new ArrayList();
        ebVar.OnDfzHZD = new ArrayList();
        ebVar.ygLcUYwZ = new ArrayList();
        ebVar.lDXGDhIF = new ArrayList();
        ebVar.sjUBp5pO = new ArrayList();
        ebVar.OxcuoDLp = new ArrayList();
        ebVar.amk52bBQ = new ArrayList();
        this.Xkz7p5xa = ebVar;
        this.fVMzMhyS = 0;
        this.hzgxAD8d = -1;
        this.gmkaJpmS = Float.MIN_VALUE;
        this.TrssYQ34 = Float.MIN_VALUE;
        this.g2aRJUAd = true;
        this.ESscZ9M1 = new f20(this);
        this.LfKQckgD = new pl();
        d20 d20Var = new d20();
        d20Var.qoPGr6Ce = 0;
        d20Var.NCTxEWno = 0;
        d20Var.MdtA4re8 = 1;
        d20Var.wxUZMvaN = 0;
        d20Var.VgvYg0wo = false;
        d20Var.P7K7Inc8 = false;
        d20Var.b2ZJblxo = false;
        d20Var.Qr9iLBAD = false;
        d20Var.jb9XjC4I = false;
        d20Var.eVhOlqcC = false;
        this.pP9Y2m6O = d20Var;
        this.LvHlPNBd = false;
        this.hGvurcGl = false;
        l10 l10Var = new l10(this);
        this.Wi7iiXC4 = l10Var;
        this.QT4Tf9Dt = false;
        this.dHozS53r = new int[2];
        this.uQ3KJUK5 = new int[2];
        this.XrPeKzBk = new int[2];
        this.N2kLh4D5 = new int[2];
        this.SMax8wMR = new ArrayList();
        this.S7WAX0X5 = new j10(this, 1);
        this.B1cjorwa = 0;
        this.X1t0wlBd = 0;
        this.D4B4MtvK = new l10(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.ZyZthT5G = viewConfiguration.getScaledTouchSlop();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            Method method = jg0.qoPGr6Ce;
            qoPGr6Ce = as.qoPGr6Ce(viewConfiguration);
        } else {
            qoPGr6Ce = jg0.qoPGr6Ce(viewConfiguration, context);
        }
        this.gmkaJpmS = qoPGr6Ce;
        this.TrssYQ34 = i3 >= 26 ? as.NCTxEWno(viewConfiguration) : jg0.qoPGr6Ce(viewConfiguration, context);
        this.bvfAo0eO = viewConfiguration.getScaledMinimumFlingVelocity();
        this.KRabZ4CU = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.Xkz7p5xa.qoPGr6Ce = l10Var;
        this.VgvYg0wo = new VM67d7Sv(new l10(this));
        this.P7K7Inc8 = new f0(new l10(this));
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        if ((i3 >= 26 ? bg0.qoPGr6Ce(this) : 0) == 0 && i3 >= 26) {
            bg0.NCTxEWno(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.U0LaHZX7 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new i20(this));
        int[] iArr = x00.qoPGr6Ce;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.kolosta.rejin.jilosa.R.attr.recyclerViewStyle, 0);
        hg0.jb9XjC4I(this, context, iArr, attributeSet, obtainStyledAttributes, com.kolosta.rejin.jilosa.R.attr.recyclerViewStyle);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.Qr9iLBAD = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                m1.sjUBp5pO("Trying to set fast scroller without both required drawables.".concat(RXQxj5Oe()));
                throw null;
            }
            Resources resources = getContext().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(com.kolosta.rejin.jilosa.R.dimen.fastscroll_default_thickness);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(com.kolosta.rejin.jilosa.R.dimen.fastscroll_minimum_range);
            c2 = 2;
            int dimensionPixelOffset = resources.getDimensionPixelOffset(com.kolosta.rejin.jilosa.R.dimen.fastscroll_margin);
            typedArray = obtainStyledAttributes;
            c = 3;
            i = com.kolosta.rejin.jilosa.R.attr.recyclerViewStyle;
            z = 1;
            i2 = 4;
            new ug(this, stateListDrawable, drawable, stateListDrawable2, drawable2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelOffset);
        } else {
            c = 3;
            i = com.kolosta.rejin.jilosa.R.attr.recyclerViewStyle;
            z = 1;
            c2 = 2;
            typedArray = obtainStyledAttributes;
            i2 = 4;
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
                String str = trim;
                try {
                    Class asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(t10.class);
                    try {
                        constructor = asSubclass.getConstructor(AxnhUDtd);
                        objArr = new Object[i2];
                        objArr[0] = context;
                        objArr[z] = attributeSet;
                        objArr[c2] = Integer.valueOf(i);
                        objArr[c] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(z);
                    setLayoutManager((t10) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    m1.wxUZMvaN(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    m1.wxUZMvaN(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    m1.wxUZMvaN(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    m1.wxUZMvaN(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    m1.wxUZMvaN(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = yzvmSy3z;
        int i4 = i;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i4, 0);
        hg0.jb9XjC4I(this, context, iArr2, attributeSet, obtainStyledAttributes2, i4);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    public static void b2ZJblxo(g20 g20Var) {
        WeakReference weakReference = g20Var.NCTxEWno;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == g20Var.qoPGr6Ce) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            g20Var.NCTxEWno = null;
        }
    }

    public static g20 euDDoUNr(View view) {
        if (view == null) {
            return null;
        }
        return ((u10) view.getLayoutParams()).qoPGr6Ce;
    }

    private cw getScrollingChildHelper() {
        cw cwVar = this.f7oeun2L;
        if (cwVar != null) {
            return cwVar;
        }
        cw cwVar2 = new cw(this);
        this.f7oeun2L = cwVar2;
        return cwVar2;
    }

    public static RecyclerView lwWCatUu(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView lwWCatUu = lwWCatUu(viewGroup.getChildAt(i));
            if (lwWCatUu != null) {
                return lwWCatUu;
            }
        }
        return null;
    }

    public final void DK9slbsy(int[] iArr) {
        f0 f0Var = this.P7K7Inc8;
        int lDXGDhIF = f0Var.lDXGDhIF();
        if (lDXGDhIF == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < lDXGDhIF; i3++) {
            g20 euDDoUNr = euDDoUNr(f0Var.ygLcUYwZ(i3));
            if (!euDDoUNr.ygLcUYwZ()) {
                int NCTxEWno = euDDoUNr.NCTxEWno();
                if (NCTxEWno < i) {
                    i = NCTxEWno;
                }
                if (NCTxEWno > i2) {
                    i2 = NCTxEWno;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final void Ey6iv0m0() {
        if (this.VhgXwMj9 != null) {
            return;
        }
        this.ytu5o6f4.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.VhgXwMj9 = edgeEffect;
        if (this.Qr9iLBAD) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void FXJmAAN1(g20 g20Var, fw fwVar) {
        g20Var.jb9XjC4I &= -8193;
        boolean z = this.pP9Y2m6O.b2ZJblxo;
        q50 q50Var = this.b2ZJblxo;
        if (z && g20Var.eVhOlqcC() && !g20Var.b2ZJblxo() && !g20Var.ygLcUYwZ()) {
            this.OnDfzHZD.getClass();
            ((lq) q50Var.NCTxEWno).wxUZMvaN(g20Var.MdtA4re8, g20Var);
        }
        p70 p70Var = (p70) q50Var.qoPGr6Ce;
        mg0 mg0Var = (mg0) p70Var.get(g20Var);
        if (mg0Var == null) {
            mg0Var = mg0.qoPGr6Ce();
            p70Var.put(g20Var, mg0Var);
        }
        mg0Var.NCTxEWno = fwVar;
        mg0Var.qoPGr6Ce |= 4;
    }

    public final void FySoLYna(d20 d20Var) {
        if (getScrollState() != 2) {
            d20Var.getClass();
            return;
        }
        OverScroller overScroller = this.ESscZ9M1.wxUZMvaN;
        overScroller.getFinalX();
        overScroller.getCurrX();
        d20Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean HdOGZAzC(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        eVhOlqcC();
        m10 m10Var = this.OnDfzHZD;
        int[] iArr = this.N2kLh4D5;
        if (m10Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            ZyZthT5G(i, i2, iArr);
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
        if (!this.sjUBp5pO.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        sjUBp5pO(i4, i5, i6, i7, this.uQ3KJUK5, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z3 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.N8VPGzVC;
        int[] iArr2 = this.uQ3KJUK5;
        int i13 = iArr2[0];
        this.N8VPGzVC = i12 - i13;
        int i14 = this.HdOGZAzC;
        int i15 = iArr2[1];
        this.HdOGZAzC = i14 - i15;
        int[] iArr3 = this.XrPeKzBk;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z = true;
            } else {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < 0.0f) {
                    KlHjfFWx();
                    z = true;
                    this.eIA6dogk.onPull((-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    if (f > 0.0f) {
                        Ey6iv0m0();
                        this.VhgXwMj9.onPull(f / getWidth(), y / getHeight());
                    } else {
                        z2 = false;
                        if (f2 >= 0.0f) {
                            I5GHvsYW();
                            this.pRiPUEwG.onPull((-f2) / getHeight(), x / getWidth());
                        } else {
                            if (f2 > 0.0f) {
                                amk52bBQ();
                                this.aZz0PFXp.onPull(f2 / getHeight(), 1.0f - (x / getWidth()));
                            }
                            if (!z2 || f != 0.0f || f2 != 0.0f) {
                                WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                                postInvalidateOnAnimation();
                            }
                        }
                        z2 = z;
                        if (!z2) {
                        }
                        WeakHashMap weakHashMap2 = hg0.qoPGr6Ce;
                        postInvalidateOnAnimation();
                    }
                }
                z2 = z;
                if (f2 >= 0.0f) {
                }
                z2 = z;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = hg0.qoPGr6Ce;
                postInvalidateOnAnimation();
            }
            jb9XjC4I(i, i2);
        } else {
            z = true;
        }
        if (i4 != 0 || i5 != 0) {
            OxcuoDLp(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z3 && i4 == 0 && i5 == 0) {
            return false;
        }
        return z;
    }

    public final void I5GHvsYW() {
        if (this.pRiPUEwG != null) {
            return;
        }
        this.ytu5o6f4.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.pRiPUEwG = edgeEffect;
        if (this.Qr9iLBAD) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void KRabZ4CU() {
        int i = this.RXQxj5Oe + 1;
        this.RXQxj5Oe = i;
        if (i != 1 || this.gjV1z5T1) {
            return;
        }
        this.FySoLYna = false;
    }

    public final void KlHjfFWx() {
        if (this.eIA6dogk != null) {
            return;
        }
        this.ytu5o6f4.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.eIA6dogk = edgeEffect;
        if (this.Qr9iLBAD) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final g20 Mq3SeTnW(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return euDDoUNr(view);
        }
        m1.eVhOlqcC("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final void N8VPGzVC() {
        VelocityTracker velocityTracker = this.zCflySGU;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        TrssYQ34(0);
        EdgeEffect edgeEffect = this.eIA6dogk;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.eIA6dogk.isFinished();
        }
        EdgeEffect edgeEffect2 = this.pRiPUEwG;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.pRiPUEwG.isFinished();
        }
        EdgeEffect edgeEffect3 = this.VhgXwMj9;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.VhgXwMj9.isFinished();
        }
        EdgeEffect edgeEffect4 = this.aZz0PFXp;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.aZz0PFXp.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = hg0.qoPGr6Ce;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x007f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OnDfzHZD() {
        int i7xS8jrb;
        View view;
        mg0 mg0Var;
        View gjV1z5T1;
        d20 d20Var = this.pP9Y2m6O;
        d20Var.qoPGr6Ce(1);
        FySoLYna(d20Var);
        d20Var.Qr9iLBAD = false;
        KRabZ4CU();
        q50 q50Var = this.b2ZJblxo;
        p70 p70Var = (p70) q50Var.qoPGr6Ce;
        p70 p70Var2 = (p70) q50Var.qoPGr6Ce;
        p70Var.clear();
        lq lqVar = (lq) q50Var.NCTxEWno;
        lqVar.qoPGr6Ce();
        aZz0PFXp();
        zCflySGU();
        g20 g20Var = null;
        View focusedChild = (this.g2aRJUAd && hasFocus() && this.OnDfzHZD != null) ? getFocusedChild() : null;
        if (focusedChild != null && (gjV1z5T1 = gjV1z5T1(focusedChild)) != null) {
            g20Var = Mq3SeTnW(gjV1z5T1);
        }
        if (g20Var == null) {
            d20Var.ow5vqvCr = -1L;
            d20Var.k3x7lurq = -1;
            d20Var.OnDfzHZD = -1;
        } else {
            this.OnDfzHZD.getClass();
            d20Var.ow5vqvCr = -1L;
            if (!this.i7xS8jrb) {
                if (g20Var.b2ZJblxo()) {
                    i7xS8jrb = g20Var.wxUZMvaN;
                } else {
                    RecyclerView recyclerView = g20Var.OxcuoDLp;
                    if (recyclerView != null) {
                        i7xS8jrb = recyclerView.i7xS8jrb(g20Var);
                    }
                }
                d20Var.k3x7lurq = i7xS8jrb;
                view = g20Var.qoPGr6Ce;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                d20Var.OnDfzHZD = id;
            }
            i7xS8jrb = -1;
            d20Var.k3x7lurq = i7xS8jrb;
            view = g20Var.qoPGr6Ce;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            d20Var.OnDfzHZD = id2;
        }
        d20Var.b2ZJblxo = d20Var.jb9XjC4I && this.hGvurcGl;
        this.hGvurcGl = false;
        this.LvHlPNBd = false;
        d20Var.P7K7Inc8 = d20Var.eVhOlqcC;
        d20Var.wxUZMvaN = this.OnDfzHZD.qoPGr6Ce();
        DK9slbsy(this.dHozS53r);
        boolean z = d20Var.jb9XjC4I;
        f0 f0Var = this.P7K7Inc8;
        if (z) {
            int lDXGDhIF = f0Var.lDXGDhIF();
            for (int i = 0; i < lDXGDhIF; i++) {
                g20 euDDoUNr = euDDoUNr(f0Var.ygLcUYwZ(i));
                if (!euDDoUNr.ygLcUYwZ()) {
                    if (euDDoUNr.VgvYg0wo()) {
                        this.OnDfzHZD.getClass();
                    } else {
                        q10 q10Var = this.Xkz7p5xa;
                        q10.NCTxEWno(euDDoUNr);
                        euDDoUNr.MdtA4re8();
                        q10Var.getClass();
                        fw fwVar = new fw();
                        fwVar.qoPGr6Ce(euDDoUNr);
                        mg0 mg0Var2 = (mg0) p70Var2.get(euDDoUNr);
                        if (mg0Var2 == null) {
                            mg0Var2 = mg0.qoPGr6Ce();
                            p70Var2.put(euDDoUNr, mg0Var2);
                        }
                        mg0Var2.NCTxEWno = fwVar;
                        mg0Var2.qoPGr6Ce |= 4;
                        if (d20Var.b2ZJblxo && euDDoUNr.eVhOlqcC() && !euDDoUNr.b2ZJblxo() && !euDDoUNr.ygLcUYwZ() && !euDDoUNr.VgvYg0wo()) {
                            this.OnDfzHZD.getClass();
                            lqVar.wxUZMvaN(euDDoUNr.MdtA4re8, euDDoUNr);
                        }
                    }
                }
            }
        }
        if (d20Var.eVhOlqcC) {
            int gjV1z5T12 = f0Var.gjV1z5T1();
            for (int i2 = 0; i2 < gjV1z5T12; i2++) {
                g20 euDDoUNr2 = euDDoUNr(f0Var.FySoLYna(i2));
                if (!euDDoUNr2.ygLcUYwZ() && euDDoUNr2.wxUZMvaN == -1) {
                    euDDoUNr2.wxUZMvaN = euDDoUNr2.MdtA4re8;
                }
            }
            boolean z2 = d20Var.VgvYg0wo;
            d20Var.VgvYg0wo = false;
            this.ygLcUYwZ.LfKQckgD(this.MdtA4re8, d20Var);
            d20Var.VgvYg0wo = z2;
            for (int i3 = 0; i3 < f0Var.lDXGDhIF(); i3++) {
                g20 euDDoUNr3 = euDDoUNr(f0Var.ygLcUYwZ(i3));
                if (!euDDoUNr3.ygLcUYwZ() && ((mg0Var = (mg0) p70Var2.get(euDDoUNr3)) == null || (mg0Var.qoPGr6Ce & 4) == 0)) {
                    q10.NCTxEWno(euDDoUNr3);
                    boolean z3 = (euDDoUNr3.jb9XjC4I & 8192) != 0;
                    q10 q10Var2 = this.Xkz7p5xa;
                    euDDoUNr3.MdtA4re8();
                    q10Var2.getClass();
                    fw fwVar2 = new fw();
                    fwVar2.qoPGr6Ce(euDDoUNr3);
                    if (z3) {
                        FXJmAAN1(euDDoUNr3, fwVar2);
                    } else {
                        mg0 mg0Var3 = (mg0) p70Var2.get(euDDoUNr3);
                        if (mg0Var3 == null) {
                            mg0Var3 = mg0.qoPGr6Ce();
                            p70Var2.put(euDDoUNr3, mg0Var3);
                        }
                        mg0Var3.qoPGr6Ce |= 2;
                        mg0Var3.NCTxEWno = fwVar2;
                    }
                }
            }
            Qr9iLBAD();
        } else {
            Qr9iLBAD();
        }
        Xkz7p5xa(true);
        gmkaJpmS(false);
        d20Var.MdtA4re8 = 2;
    }

    public final void OxcuoDLp(int i, int i2) {
        this.SgZGMMPL++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        w10 w10Var = this.tef3qNMP;
        if (w10Var != null) {
            w10Var.qoPGr6Ce(this);
        }
        ArrayList arrayList = this.Sjrx9cEN;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((w10) this.Sjrx9cEN.get(size)).qoPGr6Ce(this);
            }
        }
        this.SgZGMMPL--;
    }

    public final void P7K7Inc8(String str) {
        if (!eIA6dogk()) {
            if (this.SgZGMMPL > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(RXQxj5Oe()));
            }
        } else if (str == null) {
            m1.Ey6iv0m0("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(RXQxj5Oe()));
        } else {
            m1.Ey6iv0m0(str);
        }
    }

    public final void Qr9iLBAD() {
        f0 f0Var = this.P7K7Inc8;
        int gjV1z5T1 = f0Var.gjV1z5T1();
        for (int i = 0; i < gjV1z5T1; i++) {
            g20 euDDoUNr = euDDoUNr(f0Var.FySoLYna(i));
            if (!euDDoUNr.ygLcUYwZ()) {
                euDDoUNr.wxUZMvaN = -1;
                euDDoUNr.P7K7Inc8 = -1;
            }
        }
        z10 z10Var = this.MdtA4re8;
        ArrayList arrayList = z10Var.qoPGr6Ce;
        ArrayList arrayList2 = z10Var.MdtA4re8;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            g20 g20Var = (g20) arrayList2.get(i2);
            g20Var.wxUZMvaN = -1;
            g20Var.P7K7Inc8 = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            g20 g20Var2 = (g20) arrayList.get(i3);
            g20Var2.wxUZMvaN = -1;
            g20Var2.P7K7Inc8 = -1;
        }
        ArrayList arrayList3 = z10Var.NCTxEWno;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                g20 g20Var3 = (g20) z10Var.NCTxEWno.get(i4);
                g20Var3.wxUZMvaN = -1;
                g20Var3.P7K7Inc8 = -1;
            }
        }
    }

    public final String RXQxj5Oe() {
        return " " + super.toString() + ", adapter:" + this.OnDfzHZD + ", layout:" + this.ygLcUYwZ + ", context:" + getContext();
    }

    public final Rect SgZGMMPL(View view) {
        u10 u10Var = (u10) view.getLayoutParams();
        boolean z = u10Var.MdtA4re8;
        Rect rect = u10Var.NCTxEWno;
        if (!z || (this.pP9Y2m6O.P7K7Inc8 && (u10Var.qoPGr6Ce.eVhOlqcC() || u10Var.qoPGr6Ce.VgvYg0wo()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.sjUBp5pO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.eVhOlqcC;
            rect2.set(0, 0, 0, 0);
            ((ug) arrayList.get(i)).getClass();
            ((u10) view.getLayoutParams()).qoPGr6Ce.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        u10Var.MdtA4re8 = false;
        return rect;
    }

    public final void TrssYQ34(int i) {
        getScrollingChildHelper().Qr9iLBAD(i);
    }

    public final g20 U0LaHZX7(int i) {
        g20 g20Var = null;
        if (this.i7xS8jrb) {
            return null;
        }
        f0 f0Var = this.P7K7Inc8;
        int gjV1z5T1 = f0Var.gjV1z5T1();
        for (int i2 = 0; i2 < gjV1z5T1; i2++) {
            g20 euDDoUNr = euDDoUNr(f0Var.FySoLYna(i2));
            if (euDDoUNr != null && !euDDoUNr.b2ZJblxo() && i7xS8jrb(euDDoUNr) == i) {
                if (!((ArrayList) f0Var.VgvYg0wo).contains(euDDoUNr.qoPGr6Ce)) {
                    return euDDoUNr;
                }
                g20Var = euDDoUNr;
            }
        }
        return g20Var;
    }

    public final void VgvYg0wo(g20 g20Var) {
        View view = g20Var.qoPGr6Ce;
        boolean z = view.getParent() == this;
        this.MdtA4re8.k3x7lurq(Mq3SeTnW(view));
        boolean jb9XjC4I = g20Var.jb9XjC4I();
        f0 f0Var = this.P7K7Inc8;
        if (jb9XjC4I) {
            f0Var.jb9XjC4I(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            f0Var.Qr9iLBAD(view, -1, true);
            return;
        }
        int indexOfChild = ((l10) f0Var.MdtA4re8).qoPGr6Ce.indexOfChild(view);
        if (indexOfChild < 0) {
            m1.lDXGDhIF(view, "view is not a child, cannot hide ");
        } else {
            ((a5) f0Var.wxUZMvaN).Qr9iLBAD(indexOfChild);
            f0Var.lwWCatUu(view);
        }
    }

    public final void VhgXwMj9(int i, int i2, boolean z) {
        int i3 = i + i2;
        f0 f0Var = this.P7K7Inc8;
        int gjV1z5T1 = f0Var.gjV1z5T1();
        for (int i4 = 0; i4 < gjV1z5T1; i4++) {
            g20 euDDoUNr = euDDoUNr(f0Var.FySoLYna(i4));
            if (euDDoUNr != null && !euDDoUNr.ygLcUYwZ()) {
                int i5 = euDDoUNr.MdtA4re8;
                d20 d20Var = this.pP9Y2m6O;
                if (i5 >= i3) {
                    euDDoUNr.k3x7lurq(-i2, z);
                    d20Var.VgvYg0wo = true;
                } else if (i5 >= i) {
                    euDDoUNr.qoPGr6Ce(8);
                    euDDoUNr.k3x7lurq(-i2, z);
                    euDDoUNr.MdtA4re8 = i - 1;
                    d20Var.VgvYg0wo = true;
                }
            }
        }
        z10 z10Var = this.MdtA4re8;
        ArrayList arrayList = z10Var.MdtA4re8;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g20 g20Var = (g20) arrayList.get(size);
            if (g20Var != null) {
                int i6 = g20Var.MdtA4re8;
                if (i6 >= i3) {
                    g20Var.k3x7lurq(-i2, z);
                } else if (i6 >= i) {
                    g20Var.qoPGr6Ce(8);
                    z10Var.P7K7Inc8(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean WYNAV5pd(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.OxcuoDLp;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ug ugVar = (ug) arrayList.get(i);
            int i2 = ugVar.RXQxj5Oe;
            if (i2 == 1) {
                boolean NCTxEWno = ugVar.NCTxEWno(motionEvent.getX(), motionEvent.getY());
                boolean qoPGr6Ce = ugVar.qoPGr6Ce(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (NCTxEWno || qoPGr6Ce)) {
                    if (qoPGr6Ce) {
                        ugVar.FySoLYna = 1;
                        ugVar.sjUBp5pO = (int) motionEvent.getX();
                    } else if (NCTxEWno) {
                        ugVar.FySoLYna = 2;
                        ugVar.OnDfzHZD = (int) motionEvent.getY();
                    }
                    ugVar.wxUZMvaN(2);
                    if (action == 3) {
                        this.amk52bBQ = ugVar;
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

    public final void Xkz7p5xa(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.euDDoUNr - 1;
        this.euDDoUNr = i2;
        if (i2 < 1) {
            this.euDDoUNr = 0;
            if (z) {
                int i3 = this.DK9slbsy;
                this.DK9slbsy = 0;
                if (i3 != 0 && (accessibilityManager = this.U0LaHZX7) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.SMax8wMR;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    g20 g20Var = (g20) arrayList.get(size);
                    if (g20Var.qoPGr6Ce.getParent() == this && !g20Var.ygLcUYwZ() && (i = g20Var.sjUBp5pO) != -1) {
                        View view = g20Var.qoPGr6Ce;
                        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                        view.setImportantForAccessibility(i);
                        g20Var.sjUBp5pO = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void ZyZthT5G(int i, int i2, int[] iArr) {
        g20 g20Var;
        KRabZ4CU();
        aZz0PFXp();
        int i3 = jd0.qoPGr6Ce;
        Trace.beginSection("RV Scroll");
        d20 d20Var = this.pP9Y2m6O;
        FySoLYna(d20Var);
        z10 z10Var = this.MdtA4re8;
        int uQ3KJUK5 = i != 0 ? this.ygLcUYwZ.uQ3KJUK5(i, z10Var, d20Var) : 0;
        int XrPeKzBk = i2 != 0 ? this.ygLcUYwZ.XrPeKzBk(i2, z10Var, d20Var) : 0;
        Trace.endSection();
        f0 f0Var = this.P7K7Inc8;
        int lDXGDhIF = f0Var.lDXGDhIF();
        for (int i4 = 0; i4 < lDXGDhIF; i4++) {
            View ygLcUYwZ = f0Var.ygLcUYwZ(i4);
            g20 Mq3SeTnW = Mq3SeTnW(ygLcUYwZ);
            if (Mq3SeTnW != null && (g20Var = Mq3SeTnW.Qr9iLBAD) != null) {
                View view = g20Var.qoPGr6Ce;
                int left = ygLcUYwZ.getLeft();
                int top = ygLcUYwZ.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Xkz7p5xa(true);
        gmkaJpmS(false);
        if (iArr != null) {
            iArr[0] = uQ3KJUK5;
            iArr[1] = XrPeKzBk;
        }
    }

    public final void aZz0PFXp() {
        this.euDDoUNr++;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var != null) {
            t10Var.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void amk52bBQ() {
        if (this.aZz0PFXp != null) {
            return;
        }
        this.ytu5o6f4.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.aZz0PFXp = edgeEffect;
        if (this.Qr9iLBAD) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void bvfAo0eO(int i, int i2, boolean z) {
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.gjV1z5T1) {
            return;
        }
        int i3 = !t10Var.MdtA4re8() ? 0 : i;
        int i4 = !this.ygLcUYwZ.wxUZMvaN() ? 0 : i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        if (z) {
            int i5 = i3 != 0 ? 1 : 0;
            if (i4 != 0) {
                i5 |= 2;
            }
            getScrollingChildHelper().b2ZJblxo(i5, 1);
        }
        f20 f20Var = this.ESscZ9M1;
        RecyclerView recyclerView = f20Var.Qr9iLBAD;
        int abs = Math.abs(i3);
        int abs2 = Math.abs(i4);
        boolean z2 = abs > abs2;
        int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
        if (!z2) {
            abs = abs2;
        }
        int min = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        Interpolator interpolator = f20Var.VgvYg0wo;
        k10 k10Var = d3vfVszL;
        if (interpolator != k10Var) {
            f20Var.VgvYg0wo = k10Var;
            f20Var.wxUZMvaN = new OverScroller(recyclerView.getContext(), k10Var);
        }
        f20Var.MdtA4re8 = 0;
        f20Var.NCTxEWno = 0;
        recyclerView.setScrollState(2);
        f20Var.wxUZMvaN.startScroll(0, 0, i3, i4, min);
        if (f20Var.P7K7Inc8) {
            f20Var.b2ZJblxo = true;
            return;
        }
        RecyclerView recyclerView2 = f20Var.Qr9iLBAD;
        recyclerView2.removeCallbacks(f20Var);
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        recyclerView2.postOnAnimation(f20Var);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof u10) && this.ygLcUYwZ.VgvYg0wo((u10) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var != null && t10Var.MdtA4re8()) {
            return this.ygLcUYwZ.jb9XjC4I(this.pP9Y2m6O);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var != null && t10Var.MdtA4re8()) {
            return this.ygLcUYwZ.eVhOlqcC(this.pP9Y2m6O);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var != null && t10Var.MdtA4re8()) {
            return this.ygLcUYwZ.k3x7lurq(this.pP9Y2m6O);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var != null && t10Var.wxUZMvaN()) {
            return this.ygLcUYwZ.ow5vqvCr(this.pP9Y2m6O);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var != null && t10Var.wxUZMvaN()) {
            return this.ygLcUYwZ.OnDfzHZD(this.pP9Y2m6O);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var != null && t10Var.wxUZMvaN()) {
            return this.ygLcUYwZ.ygLcUYwZ(this.pP9Y2m6O);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().qoPGr6Ce(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().NCTxEWno(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().MdtA4re8(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().wxUZMvaN(i, i2, i3, i4, iArr, 0, null);
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
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.sjUBp5pO;
        int size = arrayList.size();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            ug ugVar = (ug) arrayList.get(i);
            if (ugVar.OxcuoDLp != ugVar.KlHjfFWx.getWidth() || ugVar.amk52bBQ != ugVar.KlHjfFWx.getHeight()) {
                ugVar.OxcuoDLp = ugVar.KlHjfFWx.getWidth();
                ugVar.amk52bBQ = ugVar.KlHjfFWx.getHeight();
                ugVar.wxUZMvaN(0);
            } else if (ugVar.lwWCatUu != 0) {
                if (ugVar.Ey6iv0m0) {
                    int i2 = ugVar.OxcuoDLp;
                    int i3 = ugVar.VgvYg0wo;
                    int i4 = i2 - i3;
                    int i5 = ugVar.ow5vqvCr;
                    int i6 = ugVar.k3x7lurq;
                    int i7 = i5 - (i6 / 2);
                    StateListDrawable stateListDrawable = ugVar.MdtA4re8;
                    stateListDrawable.setBounds(0, 0, i3, i6);
                    Drawable drawable = ugVar.wxUZMvaN;
                    drawable.setBounds(0, 0, ugVar.P7K7Inc8, ugVar.amk52bBQ);
                    RecyclerView recyclerView = ugVar.KlHjfFWx;
                    WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i3, i7);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i3, -i7);
                    } else {
                        canvas.translate(i4, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i7);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i4, -i7);
                    }
                }
                if (ugVar.I5GHvsYW) {
                    int i8 = ugVar.amk52bBQ;
                    int i9 = ugVar.jb9XjC4I;
                    int i10 = i8 - i9;
                    int i11 = ugVar.lDXGDhIF;
                    int i12 = ugVar.ygLcUYwZ;
                    StateListDrawable stateListDrawable2 = ugVar.b2ZJblxo;
                    stateListDrawable2.setBounds(0, 0, i12, i9);
                    Drawable drawable2 = ugVar.Qr9iLBAD;
                    drawable2.setBounds(0, 0, ugVar.OxcuoDLp, ugVar.eVhOlqcC);
                    canvas.translate(0.0f, i10);
                    drawable2.draw(canvas);
                    canvas.translate(i11 - (i12 / 2), 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-r8, -i10);
                }
            }
            i++;
        }
        EdgeEffect edgeEffect = this.eIA6dogk;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.Qr9iLBAD ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.eIA6dogk;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.pRiPUEwG;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.Qr9iLBAD) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.pRiPUEwG;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.VhgXwMj9;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.Qr9iLBAD ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.VhgXwMj9;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.aZz0PFXp;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.Qr9iLBAD) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.aZz0PFXp;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if ((z || this.Xkz7p5xa == null || arrayList.size() <= 0 || !this.Xkz7p5xa.P7K7Inc8()) ? z : true) {
            WeakHashMap weakHashMap2 = hg0.qoPGr6Ce;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final boolean eIA6dogk() {
        return this.euDDoUNr > 0;
    }

    public final void eVhOlqcC() {
        if (!this.I5GHvsYW || this.i7xS8jrb) {
            int i = jd0.qoPGr6Ce;
            Trace.beginSection("RV FullInvalidate");
            ow5vqvCr();
            Trace.endSection();
            return;
        }
        VM67d7Sv vM67d7Sv = this.VgvYg0wo;
        if (((ArrayList) vM67d7Sv.MdtA4re8).size() > 0) {
            int i2 = vM67d7Sv.qoPGr6Ce;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (((ArrayList) vM67d7Sv.MdtA4re8).size() > 0) {
                    int i3 = jd0.qoPGr6Ce;
                    Trace.beginSection("RV FullInvalidate");
                    ow5vqvCr();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = jd0.qoPGr6Ce;
            Trace.beginSection("RV PartialInvalidate");
            KRabZ4CU();
            aZz0PFXp();
            vM67d7Sv.lDXGDhIF();
            if (!this.FySoLYna) {
                f0 f0Var = this.P7K7Inc8;
                int lDXGDhIF = f0Var.lDXGDhIF();
                int i5 = 0;
                while (true) {
                    if (i5 < lDXGDhIF) {
                        g20 euDDoUNr = euDDoUNr(f0Var.ygLcUYwZ(i5));
                        if (euDDoUNr != null && !euDDoUNr.ygLcUYwZ() && euDDoUNr.eVhOlqcC()) {
                            ow5vqvCr();
                            break;
                        }
                        i5++;
                    } else {
                        vM67d7Sv.MdtA4re8();
                        break;
                    }
                }
            }
            gmkaJpmS(true);
            Xkz7p5xa(true);
            Trace.endSection();
        }
    }

    public final void fVMzMhyS(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.hzgxAD8d) {
            int i = actionIndex == 0 ? 1 : 0;
            this.hzgxAD8d = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.N8VPGzVC = x;
            this.FXJmAAN1 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.HdOGZAzC = y;
            this.nSmgoSB5 = y;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0191, code lost:
    
        if ((r5 * r6) >= 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015d, code lost:
    
        if (r16 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017b, code lost:
    
        if (r5 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017e, code lost:
    
        if (r16 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0181, code lost:
    
        if (r5 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0189, code lost:
    
        if ((r5 * r6) <= 0) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View view2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char c;
        boolean z;
        this.ygLcUYwZ.getClass();
        boolean z2 = (this.OnDfzHZD == null || this.ygLcUYwZ == null || eIA6dogk() || this.gjV1z5T1) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        d20 d20Var = this.pP9Y2m6O;
        z10 z10Var = this.MdtA4re8;
        if (z2 && (i == 2 || i == 1)) {
            if (this.ygLcUYwZ.wxUZMvaN()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                    if (!z && this.ygLcUYwZ.MdtA4re8()) {
                        z = focusFinder.findNextFocus(this, view, !((this.ygLcUYwZ.U0LaHZX7() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z) {
                        eVhOlqcC();
                        if (gjV1z5T1(view) != null) {
                            KRabZ4CU();
                            this.ygLcUYwZ.HdOGZAzC(view, i, z10Var, d20Var);
                            gmkaJpmS(false);
                        }
                        return null;
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                    if (view2 == null) {
                    }
                    if (view2 != null) {
                        if (view != null) {
                            int width = view.getWidth();
                            int height = view.getHeight();
                            Rect rect = this.eVhOlqcC;
                            rect.set(0, 0, width, height);
                            int width2 = view2.getWidth();
                            int height2 = view2.getHeight();
                            Rect rect2 = this.k3x7lurq;
                            rect2.set(0, 0, width2, height2);
                            offsetDescendantRectToMyCoords(view, rect);
                            offsetDescendantRectToMyCoords(view2, rect2);
                            if (this.ygLcUYwZ.U0LaHZX7() != 1) {
                            }
                            i2 = rect.left;
                            i3 = rect2.left;
                            if (i2 >= i3) {
                            }
                            i5 = 1;
                            i6 = rect.top;
                            i7 = rect2.top;
                            if (i6 >= i7) {
                            }
                            c = 1;
                            if (i == 1) {
                            }
                        }
                        return view2;
                    }
                    return super.focusSearch(view, i);
                }
            }
            z = false;
            if (!z) {
                if (focusFinder.findNextFocus(this, view, !((this.ygLcUYwZ.U0LaHZX7() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            return super.focusSearch(view, i);
        }
        View findNextFocus = focusFinder.findNextFocus(this, view, i);
        if (findNextFocus == null && z2) {
            eVhOlqcC();
            if (gjV1z5T1(view) != null) {
                KRabZ4CU();
                view2 = this.ygLcUYwZ.HdOGZAzC(view, i, z10Var, d20Var);
                gmkaJpmS(false);
            }
            return null;
        }
        view2 = findNextFocus;
        if (view2 == null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            nSmgoSB5(view2, null);
            return view;
        }
        if (view2 != null && view2 != this && view2 != view && gjV1z5T1(view2) != null) {
            if (view != null && gjV1z5T1(view) != null) {
                int width3 = view.getWidth();
                int height3 = view.getHeight();
                Rect rect3 = this.eVhOlqcC;
                rect3.set(0, 0, width3, height3);
                int width22 = view2.getWidth();
                int height22 = view2.getHeight();
                Rect rect22 = this.k3x7lurq;
                rect22.set(0, 0, width22, height22);
                offsetDescendantRectToMyCoords(view, rect3);
                offsetDescendantRectToMyCoords(view2, rect22);
                int i9 = this.ygLcUYwZ.U0LaHZX7() != 1 ? -1 : 1;
                i2 = rect3.left;
                i3 = rect22.left;
                if ((i2 >= i3 || (i4 = rect3.right) <= i3) && (i4 = rect3.right) < rect22.right) {
                    i5 = 1;
                } else {
                    int i10 = rect22.right;
                    i5 = ((i4 > i10 || i2 >= i10) && i2 > i3) ? -1 : 0;
                }
                i6 = rect3.top;
                i7 = rect22.top;
                if ((i6 >= i7 || (i8 = rect3.bottom) <= i7) && (i8 = rect3.bottom) < rect22.bottom) {
                    c = 1;
                } else {
                    int i11 = rect22.bottom;
                    c = ((i8 > i11 || i6 >= i11) && i6 > i7) ? (char) 65535 : (char) 0;
                }
                if (i == 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i != 66) {
                                    if (i != 130) {
                                        throw new IllegalArgumentException("Invalid direction: " + i + RXQxj5Oe());
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
            return view2;
        }
        return super.focusSearch(view, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var != null) {
            return t10Var.OxcuoDLp();
        }
        m1.Ey6iv0m0("RecyclerView has no LayoutManager".concat(RXQxj5Oe()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var != null) {
            return t10Var.amk52bBQ(getContext(), attributeSet);
        }
        m1.Ey6iv0m0("RecyclerView has no LayoutManager".concat(RXQxj5Oe()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public m10 getAdapter() {
        return this.OnDfzHZD;
    }

    @Override // android.view.View
    public int getBaseline() {
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var == null) {
            return super.getBaseline();
        }
        t10Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.Qr9iLBAD;
    }

    public i20 getCompatAccessibilityDelegate() {
        return this.orhfF2Ya;
    }

    public p10 getEdgeEffectFactory() {
        return this.ytu5o6f4;
    }

    public q10 getItemAnimator() {
        return this.Xkz7p5xa;
    }

    public int getItemDecorationCount() {
        return this.sjUBp5pO.size();
    }

    public t10 getLayoutManager() {
        return this.ygLcUYwZ;
    }

    public int getMaxFlingVelocity() {
        return this.KRabZ4CU;
    }

    public int getMinFlingVelocity() {
        return this.bvfAo0eO;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public v10 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.g2aRJUAd;
    }

    public y10 getRecycledViewPool() {
        return this.MdtA4re8.MdtA4re8();
    }

    public int getScrollState() {
        return this.fVMzMhyS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View gjV1z5T1(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    public final void gmkaJpmS(boolean z) {
        int i = this.RXQxj5Oe;
        if (i < 1) {
            this.RXQxj5Oe = 1;
            i = 1;
        }
        if (!z && !this.gjV1z5T1) {
            this.FySoLYna = false;
        }
        if (i == 1) {
            if (z && this.FySoLYna && !this.gjV1z5T1 && this.ygLcUYwZ != null && this.OnDfzHZD != null) {
                ow5vqvCr();
            }
            if (!this.gjV1z5T1) {
                this.FySoLYna = false;
            }
        }
        this.RXQxj5Oe--;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().P7K7Inc8(0);
    }

    public final void hzgxAD8d() {
        if (this.QT4Tf9Dt || !this.KlHjfFWx) {
            return;
        }
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        postOnAnimation(this.S7WAX0X5);
        this.QT4Tf9Dt = true;
    }

    public final int i7xS8jrb(g20 g20Var) {
        if ((g20Var.jb9XjC4I & 524) == 0 && g20Var.wxUZMvaN()) {
            int i = g20Var.MdtA4re8;
            ArrayList arrayList = (ArrayList) this.VgvYg0wo.MdtA4re8;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                FzsqRtM7 fzsqRtM7 = (FzsqRtM7) arrayList.get(i2);
                int i3 = fzsqRtM7.qoPGr6Ce;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = fzsqRtM7.NCTxEWno;
                        if (i4 <= i) {
                            int i5 = fzsqRtM7.wxUZMvaN;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = fzsqRtM7.NCTxEWno;
                        if (i6 == i) {
                            i = fzsqRtM7.wxUZMvaN;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (fzsqRtM7.wxUZMvaN <= i) {
                                i++;
                            }
                        }
                    }
                } else if (fzsqRtM7.NCTxEWno <= i) {
                    i += fzsqRtM7.wxUZMvaN;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.KlHjfFWx;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.gjV1z5T1;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().wxUZMvaN;
    }

    public final void jb9XjC4I(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.eIA6dogk;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.eIA6dogk.onRelease();
            z = this.eIA6dogk.isFinished();
        }
        EdgeEffect edgeEffect2 = this.VhgXwMj9;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.VhgXwMj9.onRelease();
            z |= this.VhgXwMj9.isFinished();
        }
        EdgeEffect edgeEffect3 = this.pRiPUEwG;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.pRiPUEwG.onRelease();
            z |= this.pRiPUEwG.isFinished();
        }
        EdgeEffect edgeEffect4 = this.aZz0PFXp;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.aZz0PFXp.onRelease();
            z |= this.aZz0PFXp.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = hg0.qoPGr6Ce;
            postInvalidateOnAnimation();
        }
    }

    public final void k3x7lurq(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        setMeasuredDimension(t10.P7K7Inc8(i, paddingRight, getMinimumWidth()), t10.P7K7Inc8(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean lDXGDhIF(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().MdtA4re8(i, i2, i3, iArr, iArr2);
    }

    public final void nSmgoSB5(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.eVhOlqcC;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof u10) {
            u10 u10Var = (u10) layoutParams;
            if (!u10Var.MdtA4re8) {
                Rect rect2 = u10Var.NCTxEWno;
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
        this.ygLcUYwZ.dHozS53r(this, view, this.eVhOlqcC, !this.I5GHvsYW, view2 == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f;
        super.onAttachedToWindow();
        this.euDDoUNr = 0;
        this.KlHjfFWx = true;
        this.I5GHvsYW = this.I5GHvsYW && !isLayoutRequested();
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var != null) {
            t10Var.P7K7Inc8 = true;
            t10Var.nSmgoSB5(this);
        }
        this.QT4Tf9Dt = false;
        ThreadLocal threadLocal = rl.P7K7Inc8;
        rl rlVar = (rl) threadLocal.get();
        this.VGmz0ccI = rlVar;
        if (rlVar == null) {
            rl rlVar2 = new rl();
            rlVar2.NCTxEWno = new ArrayList();
            rlVar2.VgvYg0wo = new ArrayList();
            this.VGmz0ccI = rlVar2;
            WeakHashMap weakHashMap = hg0.qoPGr6Ce;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            rl rlVar3 = this.VGmz0ccI;
            rlVar3.wxUZMvaN = (long) (1.0E9f / f);
            threadLocal.set(rlVar3);
        }
        this.VGmz0ccI.NCTxEWno.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q10 q10Var = this.Xkz7p5xa;
        if (q10Var != null) {
            q10Var.VgvYg0wo();
        }
        setScrollState(0);
        f20 f20Var = this.ESscZ9M1;
        f20Var.Qr9iLBAD.removeCallbacks(f20Var);
        f20Var.wxUZMvaN.abortAnimation();
        this.KlHjfFWx = false;
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var != null) {
            t10Var.P7K7Inc8 = false;
            t10Var.N8VPGzVC(this);
        }
        this.SMax8wMR.clear();
        removeCallbacks(this.S7WAX0X5);
        this.b2ZJblxo.getClass();
        while (mg0.wxUZMvaN.qoPGr6Ce() != null) {
        }
        rl rlVar = this.VGmz0ccI;
        if (rlVar != null) {
            rlVar.NCTxEWno.remove(this);
            this.VGmz0ccI = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.sjUBp5pO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ug) arrayList.get(i)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        t10 t10Var;
        if (this.ygLcUYwZ != null && !this.gjV1z5T1 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.ygLcUYwZ.wxUZMvaN() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.ygLcUYwZ.MdtA4re8()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (f == 0.0f || f2 != 0.0f) {
                        int i = (int) (f2 * this.gmkaJpmS);
                        int i2 = (int) (f * this.TrssYQ34);
                        t10Var = this.ygLcUYwZ;
                        if (t10Var == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            return false;
                        }
                        if (!this.gjV1z5T1) {
                            int[] iArr = this.N2kLh4D5;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean MdtA4re8 = t10Var.MdtA4re8();
                            boolean wxUZMvaN = this.ygLcUYwZ.wxUZMvaN();
                            getScrollingChildHelper().b2ZJblxo(wxUZMvaN ? (MdtA4re8 ? 1 : 0) | 2 : MdtA4re8 ? 1 : 0, 1);
                            if (lDXGDhIF(MdtA4re8 ? i : 0, wxUZMvaN ? i2 : 0, 1, this.N2kLh4D5, this.uQ3KJUK5)) {
                                i -= iArr[0];
                                i2 -= iArr[1];
                            }
                            HdOGZAzC(MdtA4re8 ? i : 0, wxUZMvaN ? i2 : 0, motionEvent, 1);
                            rl rlVar = this.VGmz0ccI;
                            if (rlVar != null && (i != 0 || i2 != 0)) {
                                rlVar.qoPGr6Ce(this, i, i2);
                            }
                            TrssYQ34(1);
                        }
                    }
                }
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                int i3 = (int) (f2 * this.gmkaJpmS);
                int i22 = (int) (f * this.TrssYQ34);
                t10Var = this.ygLcUYwZ;
                if (t10Var == null) {
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.ygLcUYwZ.wxUZMvaN()) {
                        f = -axisValue;
                        f2 = 0.0f;
                        if (f == 0.0f) {
                        }
                        int i32 = (int) (f2 * this.gmkaJpmS);
                        int i222 = (int) (f * this.TrssYQ34);
                        t10Var = this.ygLcUYwZ;
                        if (t10Var == null) {
                        }
                    } else if (this.ygLcUYwZ.MdtA4re8()) {
                        f2 = axisValue;
                        f = 0.0f;
                        if (f == 0.0f) {
                        }
                        int i322 = (int) (f2 * this.gmkaJpmS);
                        int i2222 = (int) (f * this.TrssYQ34);
                        t10Var = this.ygLcUYwZ;
                        if (t10Var == null) {
                        }
                    }
                }
                f = 0.0f;
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                int i3222 = (int) (f2 * this.gmkaJpmS);
                int i22222 = (int) (f * this.TrssYQ34);
                t10Var = this.ygLcUYwZ;
                if (t10Var == null) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.gjV1z5T1) {
            this.amk52bBQ = null;
            if (WYNAV5pd(motionEvent)) {
                N8VPGzVC();
                setScrollState(0);
                return true;
            }
            t10 t10Var = this.ygLcUYwZ;
            if (t10Var != null) {
                boolean MdtA4re8 = t10Var.MdtA4re8();
                boolean wxUZMvaN = this.ygLcUYwZ.wxUZMvaN();
                VelocityTracker velocityTracker = this.zCflySGU;
                if (velocityTracker == null) {
                    velocityTracker = VelocityTracker.obtain();
                    this.zCflySGU = velocityTracker;
                }
                velocityTracker.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.WYNAV5pd) {
                        this.WYNAV5pd = false;
                    }
                    this.hzgxAD8d = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.N8VPGzVC = x;
                    this.FXJmAAN1 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.HdOGZAzC = y;
                    this.nSmgoSB5 = y;
                    if (this.fVMzMhyS == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        TrssYQ34(1);
                    }
                    int[] iArr = this.XrPeKzBk;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = MdtA4re8;
                    if (wxUZMvaN) {
                        i = (MdtA4re8 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().b2ZJblxo(i, 0);
                } else if (actionMasked == 1) {
                    this.zCflySGU.clear();
                    TrssYQ34(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.hzgxAD8d);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.hzgxAD8d + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.fVMzMhyS != 1) {
                        int i2 = x2 - this.FXJmAAN1;
                        int i3 = y2 - this.nSmgoSB5;
                        if (MdtA4re8 == 0 || Math.abs(i2) <= this.ZyZthT5G) {
                            z = false;
                        } else {
                            this.N8VPGzVC = x2;
                            z = true;
                        }
                        if (wxUZMvaN && Math.abs(i3) > this.ZyZthT5G) {
                            this.HdOGZAzC = y2;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    N8VPGzVC();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.hzgxAD8d = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.N8VPGzVC = x3;
                    this.FXJmAAN1 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.HdOGZAzC = y3;
                    this.nSmgoSB5 = y3;
                } else if (actionMasked == 6) {
                    fVMzMhyS(motionEvent);
                }
                if (this.fVMzMhyS == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = jd0.qoPGr6Ce;
        Trace.beginSection("RV OnLayout");
        ow5vqvCr();
        Trace.endSection();
        this.I5GHvsYW = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var == null) {
            k3x7lurq(i, i2);
            return;
        }
        boolean aZz0PFXp = t10Var.aZz0PFXp();
        boolean z = false;
        d20 d20Var = this.pP9Y2m6O;
        if (aZz0PFXp) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.ygLcUYwZ.NCTxEWno.k3x7lurq(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.CTE3lpUp = z;
            if (z || this.OnDfzHZD == null) {
                return;
            }
            if (d20Var.MdtA4re8 == 1) {
                OnDfzHZD();
            }
            this.ygLcUYwZ.SMax8wMR(i, i2);
            d20Var.Qr9iLBAD = true;
            ygLcUYwZ();
            this.ygLcUYwZ.CTE3lpUp(i, i2);
            if (this.ygLcUYwZ.D4B4MtvK()) {
                this.ygLcUYwZ.SMax8wMR(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                d20Var.Qr9iLBAD = true;
                ygLcUYwZ();
                this.ygLcUYwZ.CTE3lpUp(i, i2);
            }
            this.B1cjorwa = getMeasuredWidth();
            this.X1t0wlBd = getMeasuredHeight();
            return;
        }
        if (this.Ey6iv0m0) {
            this.ygLcUYwZ.NCTxEWno.k3x7lurq(i, i2);
            return;
        }
        if (this.lwWCatUu) {
            KRabZ4CU();
            aZz0PFXp();
            zCflySGU();
            Xkz7p5xa(true);
            if (d20Var.eVhOlqcC) {
                d20Var.P7K7Inc8 = true;
            } else {
                this.VgvYg0wo.wxUZMvaN();
                d20Var.P7K7Inc8 = false;
            }
            this.lwWCatUu = false;
            gmkaJpmS(false);
        } else if (d20Var.eVhOlqcC) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        m10 m10Var = this.OnDfzHZD;
        if (m10Var != null) {
            d20Var.wxUZMvaN = m10Var.qoPGr6Ce();
        } else {
            d20Var.wxUZMvaN = 0;
        }
        KRabZ4CU();
        this.ygLcUYwZ.NCTxEWno.k3x7lurq(i, i2);
        gmkaJpmS(false);
        d20Var.P7K7Inc8 = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (eIA6dogk()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c20)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c20 c20Var = (c20) parcelable;
        this.wxUZMvaN = c20Var;
        super.onRestoreInstanceState(c20Var.NCTxEWno);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c20 c20Var = new c20(super.onSaveInstanceState());
        c20 c20Var2 = this.wxUZMvaN;
        if (c20Var2 != null) {
            c20Var.wxUZMvaN = c20Var2.wxUZMvaN;
            return c20Var;
        }
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var != null) {
            c20Var.wxUZMvaN = t10Var.Sjrx9cEN();
            return c20Var;
        }
        c20Var.wxUZMvaN = null;
        return c20Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.aZz0PFXp = null;
        this.pRiPUEwG = null;
        this.VhgXwMj9 = null;
        this.eIA6dogk = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.gjV1z5T1 && !this.WYNAV5pd) {
            ug ugVar = this.amk52bBQ;
            if (ugVar == null) {
                z = motionEvent.getAction() == 0 ? false : WYNAV5pd(motionEvent);
            } else {
                int i = ugVar.NCTxEWno;
                if (ugVar.RXQxj5Oe != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean NCTxEWno = ugVar.NCTxEWno(motionEvent.getX(), motionEvent.getY());
                        boolean qoPGr6Ce = ugVar.qoPGr6Ce(motionEvent.getX(), motionEvent.getY());
                        if (NCTxEWno || qoPGr6Ce) {
                            if (qoPGr6Ce) {
                                ugVar.FySoLYna = 1;
                                ugVar.sjUBp5pO = (int) motionEvent.getX();
                            } else if (NCTxEWno) {
                                ugVar.FySoLYna = 2;
                                ugVar.OnDfzHZD = (int) motionEvent.getY();
                            }
                            ugVar.wxUZMvaN(2);
                        }
                    } else if (motionEvent.getAction() == 1 && ugVar.RXQxj5Oe == 2) {
                        ugVar.OnDfzHZD = 0.0f;
                        ugVar.sjUBp5pO = 0.0f;
                        ugVar.wxUZMvaN(1);
                        ugVar.FySoLYna = 0;
                    } else if (motionEvent.getAction() == 2 && ugVar.RXQxj5Oe == 2) {
                        ugVar.VgvYg0wo();
                        if (ugVar.FySoLYna == 1) {
                            float x = motionEvent.getX();
                            int[] iArr = ugVar.WYNAV5pd;
                            iArr[0] = i;
                            int i2 = ugVar.OxcuoDLp - i;
                            iArr[1] = i2;
                            float max = Math.max(i, Math.min(i2, x));
                            if (Math.abs(ugVar.lDXGDhIF - max) >= 2.0f) {
                                int MdtA4re8 = ug.MdtA4re8(ugVar.sjUBp5pO, max, iArr, ugVar.KlHjfFWx.computeHorizontalScrollRange(), ugVar.KlHjfFWx.computeHorizontalScrollOffset(), ugVar.OxcuoDLp);
                                if (MdtA4re8 != 0) {
                                    ugVar.KlHjfFWx.scrollBy(MdtA4re8, 0);
                                }
                                ugVar.sjUBp5pO = max;
                            }
                        }
                        if (ugVar.FySoLYna == 2) {
                            float y = motionEvent.getY();
                            int[] iArr2 = ugVar.gjV1z5T1;
                            iArr2[0] = i;
                            int i3 = ugVar.amk52bBQ - i;
                            iArr2[1] = i3;
                            float max2 = Math.max(i, Math.min(i3, y));
                            if (Math.abs(ugVar.ow5vqvCr - max2) >= 2.0f) {
                                int MdtA4re82 = ug.MdtA4re8(ugVar.OnDfzHZD, max2, iArr2, ugVar.KlHjfFWx.computeVerticalScrollRange(), ugVar.KlHjfFWx.computeVerticalScrollOffset(), ugVar.amk52bBQ);
                                if (MdtA4re82 != 0) {
                                    ugVar.KlHjfFWx.scrollBy(0, MdtA4re82);
                                }
                                ugVar.OnDfzHZD = max2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.amk52bBQ = null;
                }
                z = true;
            }
            if (z) {
                N8VPGzVC();
                setScrollState(0);
                return true;
            }
            t10 t10Var = this.ygLcUYwZ;
            if (t10Var != null) {
                boolean MdtA4re83 = t10Var.MdtA4re8();
                boolean wxUZMvaN = this.ygLcUYwZ.wxUZMvaN();
                if (this.zCflySGU == null) {
                    this.zCflySGU = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.XrPeKzBk;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked == 0) {
                    this.hzgxAD8d = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.N8VPGzVC = x2;
                    this.FXJmAAN1 = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.HdOGZAzC = y2;
                    this.nSmgoSB5 = y2;
                    int i4 = MdtA4re83;
                    if (wxUZMvaN) {
                        i4 = (MdtA4re83 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().b2ZJblxo(i4, 0);
                } else {
                    if (actionMasked == 1) {
                        this.zCflySGU.addMovement(obtain);
                        VelocityTracker velocityTracker = this.zCflySGU;
                        int i5 = this.KRabZ4CU;
                        velocityTracker.computeCurrentVelocity(1000, i5);
                        float f = MdtA4re83 != 0 ? -this.zCflySGU.getXVelocity(this.hzgxAD8d) : 0.0f;
                        float f2 = wxUZMvaN ? -this.zCflySGU.getYVelocity(this.hzgxAD8d) : 0.0f;
                        if (f != 0.0f || f2 != 0.0f) {
                            int i6 = (int) f;
                            int i7 = (int) f2;
                            t10 t10Var2 = this.ygLcUYwZ;
                            if (t10Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.gjV1z5T1) {
                                boolean MdtA4re84 = t10Var2.MdtA4re8();
                                boolean wxUZMvaN2 = this.ygLcUYwZ.wxUZMvaN();
                                int i8 = this.bvfAo0eO;
                                if (MdtA4re84 == 0 || Math.abs(i6) < i8) {
                                    i6 = 0;
                                }
                                if (!wxUZMvaN2 || Math.abs(i7) < i8) {
                                    i7 = 0;
                                }
                                if (i6 != 0 || i7 != 0) {
                                    float f3 = i6;
                                    float f4 = i7;
                                    if (!dispatchNestedPreFling(f3, f4)) {
                                        boolean z3 = MdtA4re84 != 0 || wxUZMvaN2;
                                        dispatchNestedFling(f3, f4, z3);
                                        int i9 = MdtA4re84;
                                        if (z3) {
                                            if (wxUZMvaN2) {
                                                i9 = (MdtA4re84 ? 1 : 0) | 2;
                                            }
                                            getScrollingChildHelper().b2ZJblxo(i9, 1);
                                            int i10 = -i5;
                                            int max3 = Math.max(i10, Math.min(i6, i5));
                                            int max4 = Math.max(i10, Math.min(i7, i5));
                                            f20 f20Var = this.ESscZ9M1;
                                            RecyclerView recyclerView = f20Var.Qr9iLBAD;
                                            recyclerView.setScrollState(2);
                                            f20Var.MdtA4re8 = 0;
                                            f20Var.NCTxEWno = 0;
                                            Interpolator interpolator = f20Var.VgvYg0wo;
                                            k10 k10Var = d3vfVszL;
                                            if (interpolator != k10Var) {
                                                f20Var.VgvYg0wo = k10Var;
                                                f20Var.wxUZMvaN = new OverScroller(recyclerView.getContext(), k10Var);
                                            }
                                            f20Var.wxUZMvaN.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                            if (f20Var.P7K7Inc8) {
                                                f20Var.b2ZJblxo = true;
                                            } else {
                                                RecyclerView recyclerView2 = f20Var.Qr9iLBAD;
                                                recyclerView2.removeCallbacks(f20Var);
                                                WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                                                recyclerView2.postOnAnimation(f20Var);
                                            }
                                            N8VPGzVC();
                                            obtain.recycle();
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                        setScrollState(0);
                        N8VPGzVC();
                        obtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.hzgxAD8d);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.hzgxAD8d + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i11 = this.N8VPGzVC - x3;
                        int i12 = this.HdOGZAzC - y3;
                        if (this.fVMzMhyS != 1) {
                            if (MdtA4re83 != 0) {
                                int i13 = this.ZyZthT5G;
                                i11 = i11 > 0 ? Math.max(0, i11 - i13) : Math.min(0, i11 + i13);
                                if (i11 != 0) {
                                    z2 = true;
                                    if (wxUZMvaN) {
                                        int i14 = this.ZyZthT5G;
                                        i12 = i12 > 0 ? Math.max(0, i12 - i14) : Math.min(0, i12 + i14);
                                        if (i12 != 0) {
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z2 = false;
                            if (wxUZMvaN) {
                            }
                            if (z2) {
                            }
                        }
                        int i15 = i11;
                        int i16 = i12;
                        if (this.fVMzMhyS == 1) {
                            int[] iArr4 = this.N2kLh4D5;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            boolean lDXGDhIF = lDXGDhIF(MdtA4re83 != 0 ? i15 : 0, wxUZMvaN ? i16 : 0, 0, iArr4, this.uQ3KJUK5);
                            int[] iArr5 = this.uQ3KJUK5;
                            if (lDXGDhIF) {
                                i15 -= iArr4[0];
                                i16 -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i17 = i16;
                            this.N8VPGzVC = x3 - iArr5[0];
                            this.HdOGZAzC = y3 - iArr5[1];
                            if (HdOGZAzC(MdtA4re83 != 0 ? i15 : 0, wxUZMvaN ? i17 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            rl rlVar = this.VGmz0ccI;
                            if (rlVar != null && (i15 != 0 || i17 != 0)) {
                                rlVar.qoPGr6Ce(this, i15, i17);
                            }
                        }
                    } else if (actionMasked == 3) {
                        N8VPGzVC();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.hzgxAD8d = motionEvent.getPointerId(actionIndex);
                        int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.N8VPGzVC = x4;
                        this.FXJmAAN1 = x4;
                        int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.HdOGZAzC = y4;
                        this.nSmgoSB5 = y4;
                    } else if (actionMasked == 6) {
                        fVMzMhyS(motionEvent);
                    }
                }
                this.zCflySGU.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0338, code lost:
    
        if (((java.util.ArrayList) r7.VgvYg0wo).contains(getFocusedChild()) == false) goto L193;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ow5vqvCr() {
        boolean z;
        View findViewById;
        p70 p70Var;
        fw fwVar;
        int i;
        boolean b2ZJblxo;
        boolean z2;
        int i2;
        if (this.OnDfzHZD == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.ygLcUYwZ == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        d20 d20Var = this.pP9Y2m6O;
        boolean z3 = false;
        d20Var.Qr9iLBAD = false;
        boolean z4 = true;
        Object[] objArr = this.CTE3lpUp && !(this.B1cjorwa == getWidth() && this.X1t0wlBd == getHeight());
        this.B1cjorwa = 0;
        this.X1t0wlBd = 0;
        this.CTE3lpUp = false;
        if (d20Var.MdtA4re8 == 1) {
            OnDfzHZD();
            this.ygLcUYwZ.N2kLh4D5(this);
            ygLcUYwZ();
        } else {
            VM67d7Sv vM67d7Sv = this.VgvYg0wo;
            if ((((ArrayList) vM67d7Sv.wxUZMvaN).isEmpty() || ((ArrayList) vM67d7Sv.MdtA4re8).isEmpty()) && !objArr == true && this.ygLcUYwZ.OnDfzHZD == getWidth() && this.ygLcUYwZ.ygLcUYwZ == getHeight()) {
                this.ygLcUYwZ.N2kLh4D5(this);
            } else {
                this.ygLcUYwZ.N2kLh4D5(this);
                ygLcUYwZ();
            }
        }
        int i3 = 4;
        d20Var.qoPGr6Ce(4);
        KRabZ4CU();
        aZz0PFXp();
        d20Var.MdtA4re8 = 1;
        boolean z5 = d20Var.jb9XjC4I;
        f0 f0Var = this.P7K7Inc8;
        z10 z10Var = this.MdtA4re8;
        q50 q50Var = this.b2ZJblxo;
        if (z5) {
            int lDXGDhIF = f0Var.lDXGDhIF() - 1;
            while (lDXGDhIF >= 0) {
                g20 euDDoUNr = euDDoUNr(f0Var.ygLcUYwZ(lDXGDhIF));
                if (euDDoUNr.ygLcUYwZ()) {
                    z2 = z4;
                } else {
                    this.OnDfzHZD.getClass();
                    long j = euDDoUNr.MdtA4re8;
                    this.Xkz7p5xa.getClass();
                    fw fwVar2 = new fw();
                    fwVar2.qoPGr6Ce(euDDoUNr);
                    lq lqVar = (lq) q50Var.NCTxEWno;
                    z2 = z4;
                    p70 p70Var2 = (p70) q50Var.qoPGr6Ce;
                    g20 g20Var = (g20) lqVar.NCTxEWno(j);
                    if (g20Var == null || g20Var.ygLcUYwZ()) {
                        q50Var.qoPGr6Ce(euDDoUNr, fwVar2);
                    } else {
                        mg0 mg0Var = (mg0) p70Var2.get(g20Var);
                        boolean z6 = (mg0Var == null || (mg0Var.qoPGr6Ce & 1) == 0) ? z3 : z2;
                        mg0 mg0Var2 = (mg0) p70Var2.get(euDDoUNr);
                        boolean z7 = (mg0Var2 == null || (mg0Var2.qoPGr6Ce & 1) == 0) ? z3 : z2;
                        if (z6 && g20Var == euDDoUNr) {
                            q50Var.qoPGr6Ce(euDDoUNr, fwVar2);
                        } else {
                            fw k3x7lurq = q50Var.k3x7lurq(g20Var, i3);
                            q50Var.qoPGr6Ce(euDDoUNr, fwVar2);
                            fw k3x7lurq2 = q50Var.k3x7lurq(euDDoUNr, 8);
                            if (k3x7lurq == null) {
                                int lDXGDhIF2 = f0Var.lDXGDhIF();
                                int i4 = 0;
                                while (i4 < lDXGDhIF2) {
                                    g20 euDDoUNr2 = euDDoUNr(f0Var.ygLcUYwZ(i4));
                                    if (euDDoUNr2 == euDDoUNr) {
                                        i2 = i4;
                                    } else {
                                        this.OnDfzHZD.getClass();
                                        i2 = i4;
                                        if (euDDoUNr2.MdtA4re8 == j) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + euDDoUNr2 + " \n View Holder 2:" + euDDoUNr + RXQxj5Oe());
                                        }
                                    }
                                    i4 = i2 + 1;
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + g20Var + " cannot be found but it is necessary for " + euDDoUNr + RXQxj5Oe());
                            } else {
                                g20Var.OnDfzHZD(false);
                                if (z6) {
                                    VgvYg0wo(g20Var);
                                }
                                if (g20Var != euDDoUNr) {
                                    if (z7) {
                                        VgvYg0wo(euDDoUNr);
                                    }
                                    g20Var.b2ZJblxo = euDDoUNr;
                                    VgvYg0wo(g20Var);
                                    z10Var.k3x7lurq(g20Var);
                                    euDDoUNr.OnDfzHZD(false);
                                    euDDoUNr.Qr9iLBAD = g20Var;
                                }
                                if (this.Xkz7p5xa.qoPGr6Ce(g20Var, euDDoUNr, k3x7lurq, k3x7lurq2)) {
                                    hzgxAD8d();
                                }
                            }
                        }
                    }
                }
                lDXGDhIF--;
                z4 = z2;
                z3 = false;
                i3 = 4;
            }
            z = z4;
            p70 p70Var3 = (p70) q50Var.qoPGr6Ce;
            int i5 = p70Var3.wxUZMvaN - 1;
            while (i5 >= 0) {
                g20 g20Var2 = (g20) p70Var3.P7K7Inc8(i5);
                mg0 mg0Var3 = (mg0) p70Var3.b2ZJblxo(i5);
                int i6 = mg0Var3.qoPGr6Ce;
                int i7 = i6 & 3;
                l10 l10Var = this.D4B4MtvK;
                if (i7 == 3) {
                    RecyclerView recyclerView = l10Var.qoPGr6Ce;
                    recyclerView.ygLcUYwZ.QT4Tf9Dt(g20Var2.qoPGr6Ce, recyclerView.MdtA4re8);
                } else if ((i6 & 1) != 0) {
                    fw fwVar3 = mg0Var3.NCTxEWno;
                    if (fwVar3 == null) {
                        RecyclerView recyclerView2 = l10Var.qoPGr6Ce;
                        recyclerView2.ygLcUYwZ.QT4Tf9Dt(g20Var2.qoPGr6Ce, recyclerView2.MdtA4re8);
                    } else {
                        l10Var.b2ZJblxo(g20Var2, fwVar3, mg0Var3.MdtA4re8);
                    }
                } else if ((i6 & 14) == 14) {
                    l10Var.P7K7Inc8(g20Var2, mg0Var3.NCTxEWno, mg0Var3.MdtA4re8);
                } else if ((i6 & 12) == 12) {
                    fw fwVar4 = mg0Var3.NCTxEWno;
                    fw fwVar5 = mg0Var3.MdtA4re8;
                    l10Var.getClass();
                    g20Var2.OnDfzHZD(false);
                    RecyclerView recyclerView3 = l10Var.qoPGr6Ce;
                    boolean z8 = recyclerView3.i7xS8jrb;
                    q10 q10Var = recyclerView3.Xkz7p5xa;
                    if (!z8) {
                        eb ebVar = (eb) q10Var;
                        ebVar.getClass();
                        int i8 = fwVar4.qoPGr6Ce;
                        int i9 = fwVar5.qoPGr6Ce;
                        if (i8 == i9) {
                            p70Var = p70Var3;
                            if (fwVar4.NCTxEWno == fwVar5.NCTxEWno) {
                                ebVar.MdtA4re8(g20Var2);
                                b2ZJblxo = false;
                                if (b2ZJblxo) {
                                    recyclerView3.hzgxAD8d();
                                }
                                i = 0;
                                fwVar = null;
                                mg0Var3.qoPGr6Ce = i;
                                mg0Var3.NCTxEWno = fwVar;
                                mg0Var3.MdtA4re8 = fwVar;
                                mg0.wxUZMvaN.MdtA4re8(mg0Var3);
                                i5--;
                                p70Var3 = p70Var;
                            }
                        } else {
                            p70Var = p70Var3;
                        }
                        b2ZJblxo = ebVar.b2ZJblxo(g20Var2, i8, fwVar4.NCTxEWno, i9, fwVar5.NCTxEWno);
                        if (b2ZJblxo) {
                        }
                        i = 0;
                        fwVar = null;
                        mg0Var3.qoPGr6Ce = i;
                        mg0Var3.NCTxEWno = fwVar;
                        mg0Var3.MdtA4re8 = fwVar;
                        mg0.wxUZMvaN.MdtA4re8(mg0Var3);
                        i5--;
                        p70Var3 = p70Var;
                    } else if (q10Var.qoPGr6Ce(g20Var2, g20Var2, fwVar4, fwVar5)) {
                        recyclerView3.hzgxAD8d();
                    }
                } else {
                    p70Var = p70Var3;
                    if ((i6 & 4) != 0) {
                        fwVar = null;
                        l10Var.b2ZJblxo(g20Var2, mg0Var3.NCTxEWno, null);
                    } else {
                        fwVar = null;
                        if ((i6 & 8) != 0) {
                            l10Var.P7K7Inc8(g20Var2, mg0Var3.NCTxEWno, mg0Var3.MdtA4re8);
                        }
                    }
                    i = 0;
                    mg0Var3.qoPGr6Ce = i;
                    mg0Var3.NCTxEWno = fwVar;
                    mg0Var3.MdtA4re8 = fwVar;
                    mg0.wxUZMvaN.MdtA4re8(mg0Var3);
                    i5--;
                    p70Var3 = p70Var;
                }
                p70Var = p70Var3;
                i = 0;
                fwVar = null;
                mg0Var3.qoPGr6Ce = i;
                mg0Var3.NCTxEWno = fwVar;
                mg0Var3.MdtA4re8 = fwVar;
                mg0.wxUZMvaN.MdtA4re8(mg0Var3);
                i5--;
                p70Var3 = p70Var;
            }
        } else {
            z = true;
        }
        View view = null;
        this.ygLcUYwZ.Wi7iiXC4(z10Var);
        d20Var.qoPGr6Ce = d20Var.wxUZMvaN;
        this.i7xS8jrb = false;
        this.Mq3SeTnW = false;
        d20Var.jb9XjC4I = false;
        d20Var.eVhOlqcC = false;
        this.ygLcUYwZ.VgvYg0wo = false;
        ArrayList arrayList = z10Var.NCTxEWno;
        if (arrayList != null) {
            arrayList.clear();
        }
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var.eVhOlqcC) {
            t10Var.jb9XjC4I = 0;
            t10Var.eVhOlqcC = false;
            z10Var.ow5vqvCr();
        }
        this.ygLcUYwZ.pP9Y2m6O(d20Var);
        boolean z9 = z;
        Xkz7p5xa(z9);
        gmkaJpmS(false);
        ((p70) q50Var.qoPGr6Ce).clear();
        ((lq) q50Var.NCTxEWno).qoPGr6Ce();
        int[] iArr = this.dHozS53r;
        int i10 = iArr[0];
        int i11 = iArr[z9 ? 1 : 0];
        DK9slbsy(iArr);
        if (iArr[0] != i10 || iArr[z9 ? 1 : 0] != i11) {
            OxcuoDLp(0, 0);
        }
        if (this.g2aRJUAd && this.OnDfzHZD != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            if (d20Var.ow5vqvCr != -1) {
                this.OnDfzHZD.getClass();
            }
            if (f0Var.lDXGDhIF() > 0) {
                int i12 = d20Var.k3x7lurq;
                if (i12 == -1) {
                    i12 = 0;
                }
                int NCTxEWno = d20Var.NCTxEWno();
                for (int i13 = i12; i13 < NCTxEWno; i13++) {
                    g20 U0LaHZX7 = U0LaHZX7(i13);
                    if (U0LaHZX7 == null) {
                        break;
                    }
                    View view2 = U0LaHZX7.qoPGr6Ce;
                    if (view2.hasFocusable()) {
                        view = view2;
                        break;
                    }
                }
                int min = Math.min(NCTxEWno, i12) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    g20 U0LaHZX72 = U0LaHZX7(min);
                    if (U0LaHZX72 == null) {
                        break;
                    }
                    View view3 = U0LaHZX72.qoPGr6Ce;
                    if (view3.hasFocusable()) {
                        view = view3;
                        break;
                    }
                    min--;
                }
            }
            if (view != null) {
                int i14 = d20Var.OnDfzHZD;
                if (i14 != -1 && (findViewById = view.findViewById(i14)) != null && findViewById.isFocusable()) {
                    view = findViewById;
                }
                view.requestFocus();
            }
        }
        d20Var.ow5vqvCr = -1L;
        d20Var.k3x7lurq = -1;
        d20Var.OnDfzHZD = -1;
    }

    public final void pRiPUEwG() {
        f0 f0Var = this.P7K7Inc8;
        int gjV1z5T1 = f0Var.gjV1z5T1();
        for (int i = 0; i < gjV1z5T1; i++) {
            ((u10) f0Var.FySoLYna(i).getLayoutParams()).MdtA4re8 = true;
        }
        ArrayList arrayList = this.MdtA4re8.MdtA4re8;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            u10 u10Var = (u10) ((g20) arrayList.get(i2)).qoPGr6Ce.getLayoutParams();
            if (u10Var != null) {
                u10Var.MdtA4re8 = true;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        g20 euDDoUNr = euDDoUNr(view);
        if (euDDoUNr != null) {
            if (euDDoUNr.jb9XjC4I()) {
                euDDoUNr.jb9XjC4I &= -257;
            } else if (!euDDoUNr.ygLcUYwZ()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + euDDoUNr + RXQxj5Oe());
            }
        }
        view.clearAnimation();
        euDDoUNr(view);
        m10 m10Var = this.OnDfzHZD;
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.ygLcUYwZ.getClass();
        if (!eIA6dogk() && view2 != null) {
            nSmgoSB5(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.ygLcUYwZ.dHozS53r(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.OxcuoDLp;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ug) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.RXQxj5Oe != 0 || this.gjV1z5T1) {
            this.FySoLYna = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.gjV1z5T1) {
            return;
        }
        boolean MdtA4re8 = t10Var.MdtA4re8();
        boolean wxUZMvaN = this.ygLcUYwZ.wxUZMvaN();
        if (MdtA4re8 || wxUZMvaN) {
            if (!MdtA4re8) {
                i = 0;
            }
            if (!wxUZMvaN) {
                i2 = 0;
            }
            HdOGZAzC(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!eIA6dogk()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.DK9slbsy |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(i20 i20Var) {
        this.orhfF2Ya = i20Var;
        hg0.eVhOlqcC(this, i20Var);
    }

    public void setAdapter(m10 m10Var) {
        setLayoutFrozen(false);
        m10 m10Var2 = this.OnDfzHZD;
        b20 b20Var = this.NCTxEWno;
        if (m10Var2 != null) {
            m10Var2.qoPGr6Ce.unregisterObserver(b20Var);
            this.OnDfzHZD.getClass();
        }
        q10 q10Var = this.Xkz7p5xa;
        if (q10Var != null) {
            q10Var.VgvYg0wo();
        }
        t10 t10Var = this.ygLcUYwZ;
        z10 z10Var = this.MdtA4re8;
        if (t10Var != null) {
            t10Var.hGvurcGl(z10Var);
            this.ygLcUYwZ.Wi7iiXC4(z10Var);
        }
        z10Var.qoPGr6Ce.clear();
        z10Var.VgvYg0wo();
        VM67d7Sv vM67d7Sv = this.VgvYg0wo;
        vM67d7Sv.sjUBp5pO((ArrayList) vM67d7Sv.MdtA4re8);
        vM67d7Sv.sjUBp5pO((ArrayList) vM67d7Sv.wxUZMvaN);
        vM67d7Sv.qoPGr6Ce = 0;
        m10 m10Var3 = this.OnDfzHZD;
        this.OnDfzHZD = m10Var;
        if (m10Var != null) {
            m10Var.qoPGr6Ce.registerObserver(b20Var);
        }
        t10 t10Var2 = this.ygLcUYwZ;
        if (t10Var2 != null) {
            t10Var2.FXJmAAN1();
        }
        m10 m10Var4 = this.OnDfzHZD;
        z10Var.qoPGr6Ce.clear();
        z10Var.VgvYg0wo();
        y10 MdtA4re8 = z10Var.MdtA4re8();
        if (m10Var3 != null) {
            MdtA4re8.NCTxEWno--;
        }
        if (MdtA4re8.NCTxEWno == 0) {
            SparseArray sparseArray = MdtA4re8.qoPGr6Ce;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((x10) sparseArray.valueAt(i)).qoPGr6Ce.clear();
            }
        }
        if (m10Var4 != null) {
            MdtA4re8.NCTxEWno++;
        }
        this.pP9Y2m6O.VgvYg0wo = true;
        this.Mq3SeTnW = this.Mq3SeTnW;
        this.i7xS8jrb = true;
        f0 f0Var = this.P7K7Inc8;
        int gjV1z5T1 = f0Var.gjV1z5T1();
        for (int i2 = 0; i2 < gjV1z5T1; i2++) {
            g20 euDDoUNr = euDDoUNr(f0Var.FySoLYna(i2));
            if (euDDoUNr != null && !euDDoUNr.ygLcUYwZ()) {
                euDDoUNr.qoPGr6Ce(6);
            }
        }
        pRiPUEwG();
        ArrayList arrayList = z10Var.MdtA4re8;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            g20 g20Var = (g20) arrayList.get(i3);
            if (g20Var != null) {
                g20Var.qoPGr6Ce(6);
                g20Var.qoPGr6Ce(1024);
            }
        }
        z10Var.VgvYg0wo();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(o10 o10Var) {
        if (o10Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.Qr9iLBAD) {
            this.aZz0PFXp = null;
            this.pRiPUEwG = null;
            this.VhgXwMj9 = null;
            this.eIA6dogk = null;
        }
        this.Qr9iLBAD = z;
        super.setClipToPadding(z);
        if (this.I5GHvsYW) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(p10 p10Var) {
        p10Var.getClass();
        this.ytu5o6f4 = p10Var;
        this.aZz0PFXp = null;
        this.pRiPUEwG = null;
        this.VhgXwMj9 = null;
        this.eIA6dogk = null;
    }

    public void setHasFixedSize(boolean z) {
        this.Ey6iv0m0 = z;
    }

    public void setItemAnimator(q10 q10Var) {
        q10 q10Var2 = this.Xkz7p5xa;
        if (q10Var2 != null) {
            q10Var2.VgvYg0wo();
            this.Xkz7p5xa.qoPGr6Ce = null;
        }
        this.Xkz7p5xa = q10Var;
        if (q10Var != null) {
            q10Var.qoPGr6Ce = this.Wi7iiXC4;
        }
    }

    public void setItemViewCacheSize(int i) {
        z10 z10Var = this.MdtA4re8;
        z10Var.VgvYg0wo = i;
        z10Var.ow5vqvCr();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(t10 t10Var) {
        RecyclerView recyclerView;
        if (t10Var == this.ygLcUYwZ) {
            return;
        }
        setScrollState(0);
        f20 f20Var = this.ESscZ9M1;
        f20Var.Qr9iLBAD.removeCallbacks(f20Var);
        f20Var.wxUZMvaN.abortAnimation();
        t10 t10Var2 = this.ygLcUYwZ;
        z10 z10Var = this.MdtA4re8;
        if (t10Var2 != null) {
            q10 q10Var = this.Xkz7p5xa;
            if (q10Var != null) {
                q10Var.VgvYg0wo();
            }
            this.ygLcUYwZ.hGvurcGl(z10Var);
            this.ygLcUYwZ.Wi7iiXC4(z10Var);
            z10Var.qoPGr6Ce.clear();
            z10Var.VgvYg0wo();
            if (this.KlHjfFWx) {
                t10 t10Var3 = this.ygLcUYwZ;
                t10Var3.P7K7Inc8 = false;
                t10Var3.N8VPGzVC(this);
            }
            this.ygLcUYwZ.B1cjorwa(null);
            this.ygLcUYwZ = null;
        } else {
            z10Var.qoPGr6Ce.clear();
            z10Var.VgvYg0wo();
        }
        f0 f0Var = this.P7K7Inc8;
        ((a5) f0Var.wxUZMvaN).b2ZJblxo();
        ArrayList arrayList = (ArrayList) f0Var.VgvYg0wo;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((l10) f0Var.MdtA4re8).qoPGr6Ce;
            if (size < 0) {
                break;
            }
            g20 euDDoUNr = euDDoUNr((View) arrayList.get(size));
            if (euDDoUNr != null) {
                int i = euDDoUNr.lDXGDhIF;
                if (recyclerView.eIA6dogk()) {
                    euDDoUNr.sjUBp5pO = i;
                    recyclerView.SMax8wMR.add(euDDoUNr);
                } else {
                    View view = euDDoUNr.qoPGr6Ce;
                    WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                    view.setImportantForAccessibility(i);
                }
                euDDoUNr.lDXGDhIF = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            euDDoUNr(childAt);
            m10 m10Var = recyclerView.OnDfzHZD;
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.ygLcUYwZ = t10Var;
        if (t10Var != null) {
            if (t10Var.NCTxEWno != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(t10Var);
                String RXQxj5Oe = t10Var.NCTxEWno.RXQxj5Oe();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(RXQxj5Oe);
                throw new IllegalArgumentException(sb.toString());
            }
            t10Var.B1cjorwa(this);
            if (this.KlHjfFWx) {
                t10 t10Var4 = this.ygLcUYwZ;
                t10Var4.P7K7Inc8 = true;
                t10Var4.nSmgoSB5(this);
            }
        }
        z10Var.ow5vqvCr();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            m1.sjUBp5pO("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        cw scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.wxUZMvaN) {
            ViewGroup viewGroup = scrollingChildHelper.MdtA4re8;
            WeakHashMap weakHashMap = hg0.qoPGr6Ce;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.wxUZMvaN = z;
    }

    @Deprecated
    public void setOnScrollListener(w10 w10Var) {
        this.tef3qNMP = w10Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.g2aRJUAd = z;
    }

    public void setRecycledViewPool(y10 y10Var) {
        z10 z10Var = this.MdtA4re8;
        if (z10Var.b2ZJblxo != null) {
            r0.NCTxEWno--;
        }
        z10Var.b2ZJblxo = y10Var;
        if (y10Var == null || z10Var.Qr9iLBAD.getAdapter() == null) {
            return;
        }
        z10Var.b2ZJblxo.NCTxEWno++;
    }

    public void setScrollState(int i) {
        if (i == this.fVMzMhyS) {
            return;
        }
        this.fVMzMhyS = i;
        if (i != 2) {
            f20 f20Var = this.ESscZ9M1;
            f20Var.Qr9iLBAD.removeCallbacks(f20Var);
            f20Var.wxUZMvaN.abortAnimation();
        }
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var != null) {
            t10Var.LvHlPNBd(i);
        }
        ArrayList arrayList = this.Sjrx9cEN;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((w10) this.Sjrx9cEN.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.ZyZthT5G = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.ZyZthT5G = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(e20 e20Var) {
        this.MdtA4re8.getClass();
    }

    public final void sjUBp5pO(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().wxUZMvaN(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().b2ZJblxo(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().Qr9iLBAD(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.gjV1z5T1) {
            P7K7Inc8("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.gjV1z5T1 = false;
                if (this.FySoLYna && this.ygLcUYwZ != null && this.OnDfzHZD != null) {
                    requestLayout();
                }
                this.FySoLYna = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.gjV1z5T1 = true;
            this.WYNAV5pd = true;
            setScrollState(0);
            f20 f20Var = this.ESscZ9M1;
            f20Var.Qr9iLBAD.removeCallbacks(f20Var);
            f20Var.wxUZMvaN.abortAnimation();
        }
    }

    public final void ygLcUYwZ() {
        KRabZ4CU();
        aZz0PFXp();
        d20 d20Var = this.pP9Y2m6O;
        d20Var.qoPGr6Ce(6);
        this.VgvYg0wo.wxUZMvaN();
        d20Var.wxUZMvaN = this.OnDfzHZD.qoPGr6Ce();
        d20Var.NCTxEWno = 0;
        if (this.wxUZMvaN != null) {
            m10 m10Var = this.OnDfzHZD;
            m10Var.getClass();
            int k3x7lurq = q70.k3x7lurq(1);
            if (k3x7lurq == 1 ? m10Var.qoPGr6Ce() > 0 : k3x7lurq != 2) {
                Parcelable parcelable = this.wxUZMvaN.wxUZMvaN;
                if (parcelable != null) {
                    this.ygLcUYwZ.tef3qNMP(parcelable);
                }
                this.wxUZMvaN = null;
            }
        }
        d20Var.P7K7Inc8 = false;
        this.ygLcUYwZ.LfKQckgD(this.MdtA4re8, d20Var);
        d20Var.VgvYg0wo = false;
        d20Var.jb9XjC4I = d20Var.jb9XjC4I && this.Xkz7p5xa != null;
        d20Var.MdtA4re8 = 4;
        Xkz7p5xa(true);
        gmkaJpmS(false);
    }

    public final boolean ytu5o6f4() {
        return !this.I5GHvsYW || this.i7xS8jrb || ((ArrayList) this.VgvYg0wo.MdtA4re8).size() > 0;
    }

    public final void zCflySGU() {
        boolean z;
        boolean z2;
        boolean z3 = this.i7xS8jrb;
        VM67d7Sv vM67d7Sv = this.VgvYg0wo;
        boolean z4 = false;
        if (z3) {
            vM67d7Sv.sjUBp5pO((ArrayList) vM67d7Sv.MdtA4re8);
            vM67d7Sv.sjUBp5pO((ArrayList) vM67d7Sv.wxUZMvaN);
            vM67d7Sv.qoPGr6Ce = 0;
            if (this.Mq3SeTnW) {
                this.ygLcUYwZ.TrssYQ34();
            }
        }
        if (this.Xkz7p5xa != null && this.ygLcUYwZ.AxnhUDtd()) {
            vM67d7Sv.lDXGDhIF();
        } else {
            vM67d7Sv.wxUZMvaN();
        }
        boolean z5 = this.LvHlPNBd || this.hGvurcGl;
        if (this.I5GHvsYW && this.Xkz7p5xa != null && ((z2 = this.i7xS8jrb) || z5 || this.ygLcUYwZ.VgvYg0wo)) {
            if (!z2) {
                z = true;
                d20 d20Var = this.pP9Y2m6O;
                d20Var.jb9XjC4I = z;
                if (z && z5 && !this.i7xS8jrb && this.Xkz7p5xa != null && this.ygLcUYwZ.AxnhUDtd()) {
                    z4 = true;
                }
                d20Var.eVhOlqcC = z4;
            }
            this.OnDfzHZD.getClass();
        }
        z = false;
        d20 d20Var2 = this.pP9Y2m6O;
        d20Var2.jb9XjC4I = z;
        if (z) {
            z4 = true;
        }
        d20Var2.eVhOlqcC = z4;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        t10 t10Var = this.ygLcUYwZ;
        if (t10Var != null) {
            return t10Var.KlHjfFWx(layoutParams);
        }
        m1.Ey6iv0m0("RecyclerView has no LayoutManager".concat(RXQxj5Oe()));
        return null;
    }

    public void setOnFlingListener(v10 v10Var) {
    }

    @Deprecated
    public void setRecyclerListener(a20 a20Var) {
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
