package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.InputDevice;
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
import com.combinations.level.experts.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class c extends ViewGroup implements gn0, qv0, mk, ym0, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, jt {
    public static UpJpMKXj AIyqmrtNPT;
    public static Method P4U4zqyW7wx;
    public static Class R46bVSe7ra;
    public static Method b9xEq24R1;
    public static final ag0 iK7aQfvhG = new ag0();
    public static Method q2wN4kodRW;
    public final ag0 A1EKNP6CxJ;
    public final o6lobyFa AEn1Rrio;
    public final boolean AvO7iQsrTN;
    public final gY3jNtCS0 CMh55RymNfS;
    public boolean DmJncFq5;
    public wu0 E7jCp8Ls;
    public boolean EDwNPVYuViP0;
    public final float[] ES6ysExf;
    public final i EXrPz3p7hFb;
    public long EljAMC1QTz;
    public float FhVkB11j;
    public boolean Fm8W7vP7q;
    public final te0 HFYAaqMd6;
    public final f9 Hc2GqxcqBiX;
    public final in0 J3Xc8BaqpN8;
    public k61 JB4pnjMK;
    public y90 JFJ3QoxA;
    public final float[] JFXS9W1rB5s4;
    public hv K0ReC6MK;
    public final mt0 M3K9sHhK;
    public boolean MItybXapHX;
    public ag0 MZhzXH72;
    public gh Mjvvu5DE;
    public b2 MjxSquD6Av;
    public long NyNgffpi;
    public boolean OGdJP42E;
    public final fo0 OOA6hdeuvCS;
    public final fo0 Qd9Q8OZgvOo4;
    public g81 SyyZR548qbcW;
    public final fo0 TpUsjqg3bxO;
    public final d20 UjhVk5crk;
    public eg Uxq83abb04;
    public final rx0 VeqTn1PQw7;
    public final View WIEu4Ya2g8;
    public final g20 WRKkgoJXwDn;
    public final z1 WdrkLMV3xh;
    public final je0 WkXHDbKiD;
    public final LTGLyn7xQ XmVeRDAr;
    public final v4 XnEVoBF0td1l;
    public final fo0 Y6hRI1cF8;
    public final mg0 YTyqgZhdF;
    public boolean YXi2hvwn7WL;
    public final v0 YZjbz8VdP5;
    public final nt YmKjaVtbfp5Z;
    public final fo0 ZB4nixHlTE;
    public final int[] ZCWXqiC0;
    public final g60 arNh8D4Z5gB;
    public long bCsSzSHkbaQ;
    public boolean bfDgRvRIg;
    public final yc0 c4eaifQP;
    public MotionEvent cTIXpaxc;
    public final ml cilMamHF;
    public View d5idzIhj55b;
    public long dcDmLGVhzWm;
    public final ml dqB83aoLBB;
    public final p5 eUH21U3apd;
    public x00 encWxUiV2;
    public final c90 fX9rg6CD;
    public final d gHe2tSmr6w;
    public boolean gqMuANyCes;
    public final ag0 hOpoc9RpANL;
    public h81 iriv6doqetn;
    public final fo0 iwATDS1i01k;
    public final a j6IIN2O8eOU;
    public final xt jed7WnvkLvFq;
    public final c90 jivtDDk9H;
    public final g01 k8h8IjolWQ;
    public float kbVzROOfKK;
    public final v9 lv06NcmrQ;
    public final i0 mE4lRynR;
    public final i60 mOu10nynGul;
    public long mqNvfisv7;
    public final ml nXl1EmE5;
    public final k61 oCbv4H4NsA;
    public final fz oFzb77RX3H8t;
    public w ozMwhSAI;
    public final rf0 pog2g9KITJA;
    public final HkgleTzzRy qugwajBSa59j;
    public final AtomicReference rASgSCrgZkT7;
    public z90 rQPn8YBR;
    public final ra rezfBrjOrqK;
    public final i10 sb9fmtV8A;
    public final jEYdxQDjs uFEq9NpZ;
    public final k61 vaTCmWUgXF;
    public final jEYdxQDjs xtv4Xm13vGi;
    public final VJUcwvGgb9W z19UFEN2I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, se seVar) {
        super(context);
        rx0 rx0Var;
        VJUcwvGgb9W vJUcwvGgb9W;
        c cVar = this;
        cVar.OOA6hdeuvCS = z50.WRKkgoJXwDn(seVar);
        cVar.EljAMC1QTz = 9205357640488583168L;
        int i = 1;
        cVar.AvO7iQsrTN = true;
        cVar.mOu10nynGul = seVar.Mjvvu5DE;
        cVar.E7jCp8Ls = b9xEq24R1.DmJncFq5;
        cVar.XnEVoBF0td1l = new v4();
        int i2 = 0;
        cVar.uFEq9NpZ = new jEYdxQDjs(cVar, i2);
        cVar.iwATDS1i01k = new fo0(vc0.OOA6hdeuvCS(context), b9xEq24R1.Uxq83abb04);
        cVar.YmKjaVtbfp5Z = new nt(cVar, cVar);
        cVar.Mjvvu5DE = seVar.Yi7zF1RB1.JFJ3QoxA();
        cVar.mE4lRynR = new i0();
        cVar.jivtDDk9H = new c90(0);
        cVar.Y6hRI1cF8 = z50.WRKkgoJXwDn(Boolean.FALSE);
        cVar.cilMamHF = z50.iwATDS1i01k(new LTGLyn7xQ(cVar, i2));
        cVar.lv06NcmrQ = seVar.jivtDDk9H;
        cVar.WdrkLMV3xh = seVar.YmKjaVtbfp5Z;
        cVar.WRKkgoJXwDn = new g20();
        int i3 = 3;
        g60 g60Var = new g60(3);
        g60Var.JFXS9W1rB5s4(rv0.X1lG3V04pd);
        g60Var.c4eaifQP(cVar.getDensity());
        g60Var.NyNgffpi(cVar.getViewConfiguration());
        g60Var.ES6ysExf(new b(cVar).X1lG3V04pd(((nt) cVar.getFocusOwner()).OOA6hdeuvCS).X1lG3V04pd(cVar.getDragAndDropManager().X1lG3V04pd));
        cVar.arNh8D4Z5gB = g60Var;
        rf0 rf0Var = t20.GWasM1elztuh;
        cVar.pog2g9KITJA = new rf0();
        cVar.m9getLayoutNodes();
        cVar.M3K9sHhK = new mt0(cVar);
        cVar.k8h8IjolWQ = new g01(cVar.getRoot(), new zp(), cVar.m9getLayoutNodes());
        i iVar = new i(cVar);
        cVar.EXrPz3p7hFb = iVar;
        cVar.ozMwhSAI = new w(cVar, new wDCmwMuMZmB(0, cVar, p.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0, 0));
        cVar.AEn1Rrio = seVar.JFJ3QoxA;
        cVar.YZjbz8VdP5 = new v0(cVar);
        cVar.eUH21U3apd = new p5();
        cVar.A1EKNP6CxJ = new ag0();
        cVar.HFYAaqMd6 = new te0();
        g60 root = cVar.getRoot();
        ra raVar = new ra();
        raVar.Yi7zF1RB1 = root;
        raVar.X1lG3V04pd = new kz(root.A1EKNP6CxJ.X1lG3V04pd);
        raVar.xqGvceK5x = new j6IIN2O8eOU(21);
        raVar.OOA6hdeuvCS = new nz();
        cVar.rezfBrjOrqK = raVar;
        cVar.TpUsjqg3bxO = z50.WRKkgoJXwDn(new Configuration(context.getResources().getConfiguration()));
        cVar.dqB83aoLBB = z50.iwATDS1i01k(new LTGLyn7xQ(cVar, i));
        if (encWxUiV2()) {
            p5 autofillTree = cVar.getAutofillTree();
            rx0Var = new rx0();
            rx0Var.OOA6hdeuvCS = cVar;
            rx0Var.EljAMC1QTz = autofillTree;
            AutofillManager EljAMC1QTz = mqNvfisv7.EljAMC1QTz(cVar.getContext().getSystemService(mqNvfisv7.rQPn8YBR()));
            if (EljAMC1QTz == null) {
                o4.jivtDDk9H("Autofill service could not be located.");
                throw null;
            }
            rx0Var.AvO7iQsrTN = EljAMC1QTz;
            cVar.setImportantForAutofill(1);
            iriv6doqetn XnEVoBF0td1l = w60.XnEVoBF0td1l(cVar);
            AutofillId GWasM1elztuh = XnEVoBF0td1l != null ? n5.GWasM1elztuh(XnEVoBF0td1l.GWasM1elztuh) : null;
            if (GWasM1elztuh == null) {
                throw mr0.EljAMC1QTz("Required value was null.");
            }
            rx0Var.encWxUiV2 = GWasM1elztuh;
        } else {
            rx0Var = null;
        }
        cVar.VeqTn1PQw7 = rx0Var;
        if (encWxUiV2()) {
            AutofillManager EljAMC1QTz2 = mqNvfisv7.EljAMC1QTz(context.getSystemService(mqNvfisv7.rQPn8YBR()));
            if (EljAMC1QTz2 == null) {
                throw mr0.EljAMC1QTz("Autofill service could not be located.");
            }
            cVar = this;
            vJUcwvGgb9W = new VJUcwvGgb9W(new j6IIN2O8eOU(19, EljAMC1QTz2), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            vJUcwvGgb9W = null;
        }
        cVar.z19UFEN2I = vJUcwvGgb9W;
        cVar.CMh55RymNfS = seVar.E7jCp8Ls;
        cVar.qugwajBSa59j = seVar.XnEVoBF0td1l;
        cVar.J3Xc8BaqpN8 = new in0(new xwMnAITU0(cVar, i));
        cVar.c4eaifQP = new yc0(cVar.getRoot());
        cVar.mqNvfisv7 = 9223372034707292159L;
        cVar.ZCWXqiC0 = new int[]{0, 0};
        float[] rQPn8YBR = z50.rQPn8YBR();
        cVar.JFXS9W1rB5s4 = z50.rQPn8YBR();
        cVar.ES6ysExf = z50.rQPn8YBR();
        cVar.NyNgffpi = -1L;
        cVar.dcDmLGVhzWm = 9187343241974906880L;
        cVar.Qd9Q8OZgvOo4 = z50.WRKkgoJXwDn(null);
        cVar.nXl1EmE5 = z50.iwATDS1i01k(new LTGLyn7xQ(cVar, i3));
        cVar.rASgSCrgZkT7 = new AtomicReference(null);
        cVar.jed7WnvkLvFq = seVar.uFEq9NpZ;
        cVar.YTyqgZhdF = seVar.iwATDS1i01k;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = gt.GWasM1elztuh;
        p50 p50Var = p50.OOA6hdeuvCS;
        p50 p50Var2 = layoutDirection != 0 ? layoutDirection != 1 ? null : p50.EljAMC1QTz : p50Var;
        cVar.ZB4nixHlTE = z50.WRKkgoJXwDn(p50Var2 != null ? p50Var2 : p50Var);
        cVar.oFzb77RX3H8t = seVar.WIEu4Ya2g8;
        int i4 = 2;
        cVar.UjhVk5crk = new d20(cVar.isInTouchMode() ? 1 : 2);
        je0 je0Var = new je0();
        new rg0(new g6[16]);
        new rg0(new q70[16]);
        new rg0(new g60[16]);
        new rg0(new q70[16]);
        cVar.WkXHDbKiD = je0Var;
        cVar.vaTCmWUgXF = new k61(10);
        cVar.gHe2tSmr6w = new d(22);
        cVar.hOpoc9RpANL = new ag0();
        cVar.j6IIN2O8eOU = new a(cVar);
        cVar.xtv4Xm13vGi = new jEYdxQDjs(cVar, i);
        cVar.sb9fmtV8A = new i10(context, new xwMnAITU0(cVar, i2));
        cVar.XmVeRDAr = new LTGLyn7xQ(cVar, i4);
        int i5 = Build.VERSION.SDK_INT;
        cVar.Hc2GqxcqBiX = i5 < 29 ? new d(rQPn8YBR) : new g9();
        cVar.addOnAttachStateChangeListener(cVar.ozMwhSAI);
        cVar.setWillNotDraw(false);
        cVar.setFocusable(true);
        if (i5 >= 26) {
            o.GWasM1elztuh.GWasM1elztuh(cVar, 1, false);
        }
        cVar.setFocusableInTouchMode(true);
        cVar.setClipChildren(false);
        int i6 = ne1.GWasM1elztuh;
        if (cVar.getImportantForAccessibility() == 0) {
            cVar.setImportantForAccessibility(1);
        }
        cVar.setAccessibilityDelegate(iVar.EljAMC1QTz);
        cVar.setOnDragListener(cVar.getDragAndDropManager());
        cVar.getRoot().xqGvceK5x(cVar);
        if (i5 >= 29) {
            k.GWasM1elztuh.GWasM1elztuh(cVar);
        }
        if (WIEu4Ya2g8()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            cVar.WIEu4Ya2g8 = view;
            cVar.addView(view, -1);
        }
        cVar.fX9rg6CD = i5 >= 31 ? new c90(1) : null;
        cVar.oCbv4H4NsA = new k61(cVar);
    }

    public static long JFJ3QoxA(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    public static boolean WIEu4Ya2g8() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean YmKjaVtbfp5Z(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !ue0.GWasM1elztuh.GWasM1elztuh(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    public static boolean encWxUiV2() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.cilMamHF.getValue()).booleanValue();
    }

    private final h81 getLegacyTextInputServiceAndroid() {
        h81 h81Var = this.iriv6doqetn;
        if (h81Var != null) {
            return h81Var;
        }
        h81 h81Var2 = new h81(getView(), this);
        this.iriv6doqetn = h81Var2;
        return h81Var2;
    }

    private final se get_composeViewContext() {
        return (se) this.OOA6hdeuvCS.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o9oGstcVt9 get_viewTreeOwners() {
        mr0.WIEu4Ya2g8(this.Qd9Q8OZgvOo4.getValue());
        return null;
    }

    public static void mOu10nynGul(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof c) {
                ((c) childAt).lv06NcmrQ();
            } else if (childAt instanceof ViewGroup) {
                mOu10nynGul((ViewGroup) childAt);
            }
        }
    }

    public static View rQPn8YBR(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (o30.rQPn8YBR(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View rQPn8YBR = rQPn8YBR(viewGroup.getChildAt(i2), i);
                    if (rQPn8YBR != null) {
                        return rQPn8YBR;
                    }
                }
            }
        }
        return null;
    }

    private final void setAttached(boolean z) {
        this.Y6hRI1cF8.setValue(Boolean.valueOf(z));
    }

    private void setDensity(el elVar) {
        this.iwATDS1i01k.setValue(elVar);
    }

    private void setFontFamilyResolver(yt ytVar) {
        this.YTyqgZhdF.setValue(ytVar);
    }

    private void setLayoutDirection(p50 p50Var) {
        this.ZB4nixHlTE.setValue(p50Var);
    }

    private final void set_composeViewContext(se seVar) {
        this.OOA6hdeuvCS.setValue(seVar);
    }

    private final void set_viewTreeOwners(o9oGstcVt9 o9ogstcvt9) {
        this.Qd9Q8OZgvOo4.setValue(o9ogstcvt9);
    }

    public static void uFEq9NpZ(g60 g60Var) {
        g60Var.EXrPz3p7hFb();
        rg0 arNh8D4Z5gB = g60Var.arNh8D4Z5gB();
        Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
        int i = arNh8D4Z5gB.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            uFEq9NpZ((g60) objArr[i2]);
        }
    }

    public final void A1EKNP6CxJ(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (o30.rQPn8YBR(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(vc0.OOA6hdeuvCS(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) != 0) {
            this.jivtDDk9H.getClass();
        }
    }

    public final long AEn1Rrio(long j) {
        M3K9sHhK();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.dcDmLGVhzWm >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.dcDmLGVhzWm & 4294967295L));
        return z50.lv06NcmrQ(this.ES6ysExf, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public final void DmJncFq5(float f) {
        if (WIEu4Ya2g8()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.kbVzROOfKK) || f > this.kbVzROOfKK) {
                    this.kbVzROOfKK = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.FhVkB11j) || f < this.FhVkB11j) {
                    this.FhVkB11j = f;
                }
            }
        }
    }

    public final void E7jCp8Ls(g60 g60Var, boolean z) {
        this.c4eaifQP.AvO7iQsrTN(g60Var, z);
    }

    public final boolean EXrPz3p7hFb() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    @Override // defpackage.mk
    public final void GWasM1elztuh(t90 t90Var) {
        z90 z90Var = this.rQPn8YBR;
        if (z90Var != null) {
            dc0 dc0Var = (dc0) z90Var.GWasM1elztuh.EljAMC1QTz;
            if (dc0Var.OOA6hdeuvCS && !dc0Var.AvO7iQsrTN) {
                p9 p9Var = z90Var.xqGvceK5x;
                if (p9Var != null) {
                    p9Var.cancel();
                }
                z90Var.xqGvceK5x = null;
                return;
            }
            if (dc0Var.EljAMC1QTz) {
                return;
            }
            if (!dc0Var.AvO7iQsrTN) {
                uq0.GWasM1elztuh("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!dc0Var.encWxUiV2.mOu10nynGul()) {
                uq0.GWasM1elztuh("Attempted to start retaining exited values with pending exited values");
            }
            dc0Var.AvO7iQsrTN = false;
        }
    }

    public final void M3K9sHhK() {
        if (this.EDwNPVYuViP0) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.NyNgffpi) {
            this.NyNgffpi = currentAnimationTimeMillis;
            f9 f9Var = this.Hc2GqxcqBiX;
            float[] fArr = this.JFXS9W1rB5s4;
            f9Var.Yi7zF1RB1(this, fArr);
            fb1.AEn1Rrio(fArr, this.ES6ysExf);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.ZCWXqiC0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = f2 - iArr[1];
            this.dcDmLGVhzWm = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void MZhzXH72() {
        boolean z;
        View view;
        float[] fArr;
        int i;
        int[] iArr = this.ZCWXqiC0;
        getLocationOnScreen(iArr);
        long j = this.mqNvfisv7;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 != i4 || i3 != iArr[1] || this.NyNgffpi < 0) {
            this.mqNvfisv7 = (4294967295L & iArr[1]) | (i4 << 32);
            if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
                rg0 arNh8D4Z5gB = getRoot().arNh8D4Z5gB();
                Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
                int i5 = arNh8D4Z5gB.AvO7iQsrTN;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((g60) objArr[i6]).MZhzXH72.WIEu4Ya2g8.bCsSzSHkbaQ();
                }
                z = true;
                M3K9sHhK();
                view = this.d5idzIhj55b;
                if (view == null) {
                    view = getRootView();
                    this.d5idzIhj55b = view;
                }
                mt0 rectManager = getRectManager();
                long j2 = this.mqNvfisv7;
                long dqB83aoLBB = qj.dqB83aoLBB(this.dcDmLGVhzWm);
                int width = view.getWidth();
                int height = view.getHeight();
                rectManager.getClass();
                fArr = this.JFXS9W1rB5s4;
                if (fArr.length >= 16) {
                    i = 0;
                } else {
                    i = (((fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) ? 1 : 0);
                }
                j91 j91Var = rectManager.X1lG3V04pd;
                if ((i & 2) != 0) {
                    fArr = null;
                }
                rectManager.EljAMC1QTz = !j91Var.Yi7zF1RB1(j2, dqB83aoLBB, fArr, width, height) || rectManager.EljAMC1QTz;
                this.c4eaifQP.Yi7zF1RB1(z);
                getRectManager().GWasM1elztuh();
            }
        }
        z = false;
        M3K9sHhK();
        view = this.d5idzIhj55b;
        if (view == null) {
        }
        mt0 rectManager2 = getRectManager();
        long j22 = this.mqNvfisv7;
        long dqB83aoLBB2 = qj.dqB83aoLBB(this.dcDmLGVhzWm);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        rectManager2.getClass();
        fArr = this.JFXS9W1rB5s4;
        if (fArr.length >= 16) {
        }
        j91 j91Var2 = rectManager2.X1lG3V04pd;
        if ((i & 2) != 0) {
        }
        rectManager2.EljAMC1QTz = !j91Var2.Yi7zF1RB1(j22, dqB83aoLBB2, fArr, width2, height2) || rectManager2.EljAMC1QTz;
        this.c4eaifQP.Yi7zF1RB1(z);
        getRectManager().GWasM1elztuh();
    }

    public final boolean Mjvvu5DE(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final void WRKkgoJXwDn(g60 g60Var, boolean z, boolean z2, boolean z3) {
        g60 cilMamHF;
        g60 cilMamHF2;
        yc0 yc0Var = this.c4eaifQP;
        if (!z) {
            if (yc0Var.Mjvvu5DE(g60Var, z2) && z3) {
                ozMwhSAI(g60Var);
                return;
            }
            return;
        }
        f4 f4Var = yc0Var.Yi7zF1RB1;
        g60 g60Var2 = g60Var.E7jCp8Ls;
        k60 k60Var = g60Var.MZhzXH72;
        if (g60Var2 == null) {
            t10.Yi7zF1RB1("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int ordinal = k60Var.xqGvceK5x.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    o4.xqGvceK5x();
                    return;
                }
                if (!k60Var.OOA6hdeuvCS || z2) {
                    k60Var.OOA6hdeuvCS = true;
                    k60Var.WIEu4Ya2g8.WRKkgoJXwDn = true;
                    if (g60Var.YXi2hvwn7WL) {
                        return;
                    }
                    if ((o30.rQPn8YBR(g60Var.MZhzXH72(), Boolean.TRUE) || yc0.mOu10nynGul(g60Var)) && ((cilMamHF = g60Var.cilMamHF()) == null || !cilMamHF.MZhzXH72.OOA6hdeuvCS)) {
                        f4Var.GWasM1elztuh(g60Var, x30.OOA6hdeuvCS);
                    } else if ((g60Var.A1EKNP6CxJ() || yc0.JFJ3QoxA(g60Var)) && ((cilMamHF2 = g60Var.cilMamHF()) == null || !cilMamHF2.YmKjaVtbfp5Z())) {
                        f4Var.GWasM1elztuh(g60Var, x30.AvO7iQsrTN);
                    }
                    if (yc0Var.xqGvceK5x || !z3) {
                        return;
                    }
                    ozMwhSAI(g60Var);
                    return;
                }
                return;
            }
        }
        yc0Var.encWxUiV2.Yi7zF1RB1(new xc0(g60Var, true, z2));
    }

    public final void WdrkLMV3xh(g60 g60Var) {
        i iVar = this.EXrPz3p7hFb;
        iVar.M3K9sHhK = true;
        if (iVar.uFEq9NpZ()) {
            iVar.iwATDS1i01k(g60Var);
        }
        w wVar = this.ozMwhSAI;
        wVar.rQPn8YBR = true;
        if (wVar.encWxUiV2()) {
            wVar.E7jCp8Ls.mE4lRynR(kc1.GWasM1elztuh);
        }
    }

    @Override // defpackage.mk
    public final void X1lG3V04pd(t90 t90Var) {
        p9 p9Var;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(ki1.EXrPz3p7hFb());
        }
        z90 z90Var = this.rQPn8YBR;
        if (z90Var != null) {
            y90 y90Var = this.JFJ3QoxA;
            y90Var.getClass();
            j6IIN2O8eOU j6iin2o8eou = z90Var.GWasM1elztuh;
            dc0 dc0Var = (dc0) j6iin2o8eou.EljAMC1QTz;
            if (!dc0Var.OOA6hdeuvCS || dc0Var.AvO7iQsrTN) {
                return;
            }
            try {
                p9Var = ((gi1) y90Var).GWasM1elztuh.mE4lRynR(new d3(6, z90Var));
            } catch (CancellationException unused) {
                dc0 dc0Var2 = (dc0) j6iin2o8eou.EljAMC1QTz;
                if (!dc0Var2.EljAMC1QTz) {
                    if (dc0Var2.AvO7iQsrTN) {
                        uq0.GWasM1elztuh("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    dc0Var2.GWasM1elztuh();
                    dc0Var2.AvO7iQsrTN = true;
                }
                p9Var = null;
            }
            p9 p9Var2 = z90Var.xqGvceK5x;
            if (p9Var2 != null) {
                p9Var2.cancel();
            }
            z90Var.xqGvceK5x = p9Var;
        }
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
    public final int XnEVoBF0td1l(MotionEvent motionEvent) {
        boolean z;
        int actionMasked;
        MotionEvent motionEvent2;
        c cVar;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        boolean z2;
        kz kzVar;
        removeCallbacks(this.j6IIN2O8eOU);
        try {
            k8h8IjolWQ(motionEvent);
            this.EDwNPVYuViP0 = true;
            Y6hRI1cF8(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent4 = this.cTIXpaxc;
                boolean z3 = motionEvent4 != null && motionEvent4.getToolType(0) == 3;
                ra raVar = this.rezfBrjOrqK;
                if (motionEvent4 != null) {
                    try {
                        if (motionEvent4.getSource() == motionEvent.getSource() && motionEvent4.getToolType(0) == motionEvent.getToolType(0)) {
                            z = false;
                            if (z) {
                                if (motionEvent4.getButtonState() != 0 || (actionMasked = motionEvent4.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent4;
                                    if (!raVar.GWasM1elztuh) {
                                        qb0 qb0Var = (qb0) ((j6IIN2O8eOU) raVar.xqGvceK5x).EljAMC1QTz;
                                        int i = qb0Var.encWxUiV2;
                                        Object[] objArr = qb0Var.AvO7iQsrTN;
                                        for (int i2 = 0; i2 < i; i2++) {
                                            objArr[i2] = null;
                                        }
                                        qb0Var.encWxUiV2 = 0;
                                        qb0Var.OOA6hdeuvCS = false;
                                        ((kz) raVar.X1lG3V04pd).X1lG3V04pd();
                                    }
                                } else if (motionEvent4.getActionMasked() != 10 && z3) {
                                    eUH21U3apd(motionEvent4, 10, motionEvent4.getEventTime(), true);
                                    motionEvent2 = motionEvent4;
                                }
                                boolean z4 = motionEvent.getToolType(0) != 3;
                                if (z3 && z4 && actionMasked2 != 3 && actionMasked2 != 9 && Mjvvu5DE(motionEvent)) {
                                    cVar = this;
                                    cVar.eUH21U3apd(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    cVar = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = cVar.cTIXpaxc;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent5 = cVar.cTIXpaxc;
                                    pointerId = motionEvent5 == null ? motionEvent5.getPointerId(0) : -1;
                                    action = motionEvent.getAction();
                                    te0 te0Var = cVar.HFYAaqMd6;
                                    if (action == 9 || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent6 = cVar.cTIXpaxc;
                                            float x = motionEvent6 == null ? motionEvent6.getX() : Float.NaN;
                                            MotionEvent motionEvent7 = cVar.cTIXpaxc;
                                            z2 = x == motionEvent.getX() || (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) != motionEvent.getY();
                                            MotionEvent motionEvent8 = cVar.cTIXpaxc;
                                            boolean z5 = (motionEvent8 == null ? motionEvent8.getEventTime() : -1L) == motionEvent.getEventTime();
                                            if (!z2 || z5) {
                                                if (pointerId >= 0) {
                                                    te0Var.X1lG3V04pd.delete(pointerId);
                                                    te0Var.Yi7zF1RB1.delete(pointerId);
                                                }
                                                kzVar = (kz) raVar.X1lG3V04pd;
                                                if (kzVar.xqGvceK5x) {
                                                    kzVar.AvO7iQsrTN.GWasM1elztuh.AvO7iQsrTN();
                                                } else {
                                                    kzVar.xqGvceK5x = true;
                                                }
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        te0Var.X1lG3V04pd.delete(pointerId);
                                        te0Var.Yi7zF1RB1.delete(pointerId);
                                    }
                                }
                                cVar.cTIXpaxc = MotionEvent.obtainNoHistory(motionEvent);
                                int YZjbz8VdP5 = YZjbz8VdP5(motionEvent);
                                Trace.endSection();
                                cVar.EDwNPVYuViP0 = false;
                                return YZjbz8VdP5;
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
                cVar = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = cVar.cTIXpaxc;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent52 = cVar.cTIXpaxc;
                    if (motionEvent52 == null) {
                    }
                    action = motionEvent.getAction();
                    te0 te0Var2 = cVar.HFYAaqMd6;
                    if (action == 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent62 = cVar.cTIXpaxc;
                        if (motionEvent62 == null) {
                        }
                        MotionEvent motionEvent72 = cVar.cTIXpaxc;
                        if (motionEvent72 != null) {
                        }
                        if (x == motionEvent.getX()) {
                        }
                        MotionEvent motionEvent82 = cVar.cTIXpaxc;
                        if ((motionEvent82 == null ? motionEvent82.getEventTime() : -1L) == motionEvent.getEventTime()) {
                        }
                        if (!z2) {
                        }
                        if (pointerId >= 0) {
                        }
                        kzVar = (kz) raVar.X1lG3V04pd;
                        if (kzVar.xqGvceK5x) {
                        }
                    }
                }
                cVar.cTIXpaxc = MotionEvent.obtainNoHistory(motionEvent);
                int YZjbz8VdP52 = YZjbz8VdP5(motionEvent);
                Trace.endSection();
                cVar.EDwNPVYuViP0 = false;
                return YZjbz8VdP52;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.EDwNPVYuViP0 = false;
            throw th3;
        }
    }

    public final void Y6hRI1cF8(boolean z) {
        LTGLyn7xQ lTGLyn7xQ;
        yc0 yc0Var = this.c4eaifQP;
        if (yc0Var.Yi7zF1RB1.rQPn8YBR() || ((rg0) yc0Var.OOA6hdeuvCS.EljAMC1QTz).AvO7iQsrTN != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    lTGLyn7xQ = this.XmVeRDAr;
                } finally {
                    Trace.endSection();
                }
            } else {
                lTGLyn7xQ = null;
            }
            if (yc0Var.E7jCp8Ls(lTGLyn7xQ)) {
                requestLayout();
            }
            yc0Var.Yi7zF1RB1(false);
            getRectManager().GWasM1elztuh();
        }
    }

    public final int YZjbz8VdP5(MotionEvent motionEvent) {
        Object obj;
        if (this.OGdJP42E) {
            this.OGdJP42E = false;
            c90 c90Var = getComposeViewContext().mE4lRynR;
            int metaState = motionEvent.getMetaState();
            c90Var.getClass();
            rf1.GWasM1elztuh.setValue(new pq0(metaState));
        }
        te0 te0Var = this.HFYAaqMd6;
        d X1lG3V04pd = te0Var.X1lG3V04pd(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        ra raVar = this.rezfBrjOrqK;
        if (X1lG3V04pd == null) {
            if (!raVar.GWasM1elztuh) {
                qb0 qb0Var = (qb0) ((j6IIN2O8eOU) raVar.xqGvceK5x).EljAMC1QTz;
                int i = qb0Var.encWxUiV2;
                Object[] objArr = qb0Var.AvO7iQsrTN;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                qb0Var.encWxUiV2 = 0;
                qb0Var.OOA6hdeuvCS = false;
                ((kz) raVar.X1lG3V04pd).X1lG3V04pd();
            }
            return 0;
        }
        List list = (List) X1lG3V04pd.EljAMC1QTz;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i3 = size - 1;
                obj = list.get(size);
                if (((mq0) obj).OOA6hdeuvCS && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i3 < 0) {
                    break;
                }
                size = i3;
            }
        }
        obj = null;
        mq0 mq0Var = (mq0) obj;
        if (mq0Var != null) {
            this.EljAMC1QTz = mq0Var.xqGvceK5x;
        }
        int GWasM1elztuh = raVar.GWasM1elztuh(X1lG3V04pd, this, Mjvvu5DE(motionEvent));
        X1lG3V04pd.AvO7iQsrTN = null;
        if ((actionMasked != 0 && actionMasked != 5) || (GWasM1elztuh & 1) != 0) {
            return GWasM1elztuh;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        te0Var.X1lG3V04pd.delete(pointerId);
        te0Var.Yi7zF1RB1.delete(pointerId);
        return GWasM1elztuh;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        rt rtVar = ((nt) getFocusOwner()).X1lG3V04pd;
        if (!rtVar.Mjvvu5DE) {
            return;
        }
        if (!rtVar.OOA6hdeuvCS.Mjvvu5DE) {
            t10.Yi7zF1RB1("visitSubtreeIf called on an unattached node");
        }
        rg0 rg0Var = new rg0(new he0[16]);
        he0 he0Var = rtVar.OOA6hdeuvCS;
        he0 he0Var2 = he0Var.JFJ3QoxA;
        if (he0Var2 == null) {
            vc0.mOu10nynGul(rg0Var, he0Var);
        } else {
            rg0Var.Yi7zF1RB1(he0Var2);
        }
        while (true) {
            int i3 = rg0Var.AvO7iQsrTN;
            if (i3 == 0) {
                return;
            }
            he0 he0Var3 = (he0) rg0Var.rQPn8YBR(i3 - 1);
            if ((he0Var3.encWxUiV2 & 1024) != 0) {
                for (he0 he0Var4 = he0Var3; he0Var4 != null && he0Var4.Mjvvu5DE; he0Var4 = he0Var4.JFJ3QoxA) {
                    if ((he0Var4.AvO7iQsrTN & 1024) != 0) {
                        he0 he0Var5 = he0Var4;
                        rg0 rg0Var2 = null;
                        while (he0Var5 != null) {
                            int i4 = 0;
                            if (he0Var5 instanceof rt) {
                                rt rtVar2 = (rt) he0Var5;
                                if (rtVar2.Mjvvu5DE && rtVar2.XmVeRDAr().GWasM1elztuh) {
                                    super.addFocusables(arrayList, i, i2);
                                    rt rtVar3 = ((nt) getFocusOwner()).X1lG3V04pd;
                                    if (rtVar3.Mjvvu5DE) {
                                        if (!rtVar3.OOA6hdeuvCS.Mjvvu5DE) {
                                            t10.Yi7zF1RB1("visitSubtreeIf called on an unattached node");
                                        }
                                        rg0 rg0Var3 = new rg0(new he0[16]);
                                        he0 he0Var6 = rtVar3.OOA6hdeuvCS;
                                        he0 he0Var7 = he0Var6.JFJ3QoxA;
                                        if (he0Var7 == null) {
                                            vc0.mOu10nynGul(rg0Var3, he0Var6);
                                        } else {
                                            rg0Var3.Yi7zF1RB1(he0Var7);
                                        }
                                        while (true) {
                                            int i5 = rg0Var3.AvO7iQsrTN;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            he0 he0Var8 = (he0) rg0Var3.rQPn8YBR(i5 - 1);
                                            if ((he0Var8.encWxUiV2 & 1024) != 0) {
                                                for (he0 he0Var9 = he0Var8; he0Var9 != null && he0Var9.Mjvvu5DE; he0Var9 = he0Var9.JFJ3QoxA) {
                                                    if ((he0Var9.AvO7iQsrTN & 1024) != 0) {
                                                        he0 he0Var10 = he0Var9;
                                                        rg0 rg0Var4 = null;
                                                        while (he0Var10 != null) {
                                                            if (he0Var10 instanceof rt) {
                                                                rt rtVar4 = (rt) he0Var10;
                                                                if (rtVar4.Mjvvu5DE) {
                                                                    ot XmVeRDAr = rtVar4.XmVeRDAr();
                                                                    if (rtVar4.Mjvvu5DE && XmVeRDAr.GWasM1elztuh) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((he0Var10.AvO7iQsrTN & 1024) != 0 && (he0Var10 instanceof yk)) {
                                                                int i6 = 0;
                                                                for (he0 he0Var11 = ((yk) he0Var10).jivtDDk9H; he0Var11 != null; he0Var11 = he0Var11.JFJ3QoxA) {
                                                                    if ((he0Var11.AvO7iQsrTN & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            he0Var10 = he0Var11;
                                                                        } else {
                                                                            if (rg0Var4 == null) {
                                                                                rg0Var4 = new rg0(new he0[16]);
                                                                            }
                                                                            if (he0Var10 != null) {
                                                                                rg0Var4.Yi7zF1RB1(he0Var10);
                                                                                he0Var10 = null;
                                                                            }
                                                                            rg0Var4.Yi7zF1RB1(he0Var11);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            he0Var10 = vc0.E7jCp8Ls(rg0Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            vc0.mOu10nynGul(rg0Var3, he0Var8);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((he0Var5.AvO7iQsrTN & 1024) != 0 && (he0Var5 instanceof yk)) {
                                for (he0 he0Var12 = ((yk) he0Var5).jivtDDk9H; he0Var12 != null; he0Var12 = he0Var12.JFJ3QoxA) {
                                    if ((he0Var12.AvO7iQsrTN & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            he0Var5 = he0Var12;
                                        } else {
                                            if (rg0Var2 == null) {
                                                rg0Var2 = new rg0(new he0[16]);
                                            }
                                            if (he0Var5 != null) {
                                                rg0Var2.Yi7zF1RB1(he0Var5);
                                                he0Var5 = null;
                                            }
                                            rg0Var2.Yi7zF1RB1(he0Var12);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            he0Var5 = vc0.E7jCp8Ls(rg0Var2);
                        }
                    }
                }
            }
            vc0.mOu10nynGul(rg0Var, he0Var3);
        }
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

    public final void arNh8D4Z5gB(g60 g60Var, boolean z, boolean z2) {
        k60 k60Var = g60Var.MZhzXH72;
        x30 x30Var = x30.encWxUiV2;
        yc0 yc0Var = this.c4eaifQP;
        if (!z) {
            yc0Var.getClass();
            int ordinal = k60Var.xqGvceK5x.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                o4.xqGvceK5x();
                return;
            }
            g60 cilMamHF = g60Var.cilMamHF();
            boolean z3 = cilMamHF == null || cilMamHF.A1EKNP6CxJ();
            if (!z2) {
                if (g60Var.YmKjaVtbfp5Z()) {
                    return;
                }
                if (g60Var.WIEu4Ya2g8() && g60Var.A1EKNP6CxJ() == z3 && g60Var.A1EKNP6CxJ() == k60Var.WIEu4Ya2g8.WdrkLMV3xh) {
                    return;
                }
            }
            ad0 ad0Var = k60Var.WIEu4Ya2g8;
            ad0Var.arNh8D4Z5gB = true;
            ad0Var.pog2g9KITJA = true;
            if (!g60Var.YXi2hvwn7WL && ad0Var.WdrkLMV3xh && z3) {
                if ((cilMamHF == null || !cilMamHF.WIEu4Ya2g8()) && (cilMamHF == null || !cilMamHF.YmKjaVtbfp5Z())) {
                    yc0Var.Yi7zF1RB1.GWasM1elztuh(g60Var, x30Var);
                }
                if (yc0Var.xqGvceK5x) {
                    return;
                }
                ozMwhSAI(null);
                return;
            }
            return;
        }
        f4 f4Var = yc0Var.Yi7zF1RB1;
        int ordinal2 = k60Var.xqGvceK5x.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    o4.xqGvceK5x();
                    return;
                }
            }
        }
        if ((k60Var.OOA6hdeuvCS || k60Var.EljAMC1QTz) && !z2) {
            return;
        }
        k60Var.EljAMC1QTz = true;
        k60Var.AvO7iQsrTN = true;
        ad0 ad0Var2 = k60Var.WIEu4Ya2g8;
        ad0Var2.arNh8D4Z5gB = true;
        ad0Var2.pog2g9KITJA = true;
        if (g60Var.YXi2hvwn7WL) {
            return;
        }
        g60 cilMamHF2 = g60Var.cilMamHF();
        if (o30.rQPn8YBR(g60Var.MZhzXH72(), Boolean.TRUE) && ((cilMamHF2 == null || !cilMamHF2.MZhzXH72.OOA6hdeuvCS) && (cilMamHF2 == null || !cilMamHF2.MZhzXH72.EljAMC1QTz))) {
            f4Var.GWasM1elztuh(g60Var, x30.EljAMC1QTz);
        } else if (g60Var.A1EKNP6CxJ() && ((cilMamHF2 == null || !cilMamHF2.WIEu4Ya2g8()) && (cilMamHF2 == null || !cilMamHF2.YmKjaVtbfp5Z()))) {
            f4Var.GWasM1elztuh(g60Var, x30Var);
        }
        if (yc0Var.xqGvceK5x) {
            return;
        }
        ozMwhSAI(null);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        boolean isText;
        boolean isDate;
        boolean isList;
        boolean isToggle;
        CharSequence textValue;
        zz0 WdrkLMV3xh;
        hv hvVar;
        hv hvVar2;
        CharSequence textValue2;
        if (encWxUiV2()) {
            VJUcwvGgb9W vJUcwvGgb9W = this.z19UFEN2I;
            if (vJUcwvGgb9W != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray.keyAt(i);
                    AutofillValue AvO7iQsrTN = mqNvfisv7.AvO7iQsrTN(sparseArray.get(keyAt));
                    g60 g60Var = (g60) vJUcwvGgb9W.EljAMC1QTz.X1lG3V04pd.Yi7zF1RB1(keyAt);
                    if (g60Var != null && (WdrkLMV3xh = g60Var.WdrkLMV3xh()) != null) {
                        hg0 hg0Var = WdrkLMV3xh.OOA6hdeuvCS;
                        Object AvO7iQsrTN2 = hg0Var.AvO7iQsrTN(yz0.AvO7iQsrTN);
                        if (AvO7iQsrTN2 == null) {
                            AvO7iQsrTN2 = null;
                        }
                        VeqTn1PQw7 veqTn1PQw7 = (VeqTn1PQw7) AvO7iQsrTN2;
                        if (veqTn1PQw7 != null && (hvVar2 = (hv) veqTn1PQw7.Yi7zF1RB1) != null) {
                            textValue2 = AvO7iQsrTN.getTextValue();
                        }
                        Object AvO7iQsrTN3 = hg0Var.AvO7iQsrTN(yz0.encWxUiV2);
                        VeqTn1PQw7 veqTn1PQw72 = (VeqTn1PQw7) (AvO7iQsrTN3 != null ? AvO7iQsrTN3 : null);
                        if (veqTn1PQw72 != null && (hvVar = (hv) veqTn1PQw72.Yi7zF1RB1) != null) {
                        }
                    }
                }
            }
            rx0 rx0Var = this.VeqTn1PQw7;
            if (rx0Var != null) {
                p5 p5Var = (p5) rx0Var.EljAMC1QTz;
                if (p5Var.GWasM1elztuh.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    int keyAt2 = sparseArray.keyAt(i2);
                    AutofillValue AvO7iQsrTN4 = mqNvfisv7.AvO7iQsrTN(sparseArray.get(keyAt2));
                    isText = AvO7iQsrTN4.isText();
                    if (isText) {
                        textValue = AvO7iQsrTN4.getTextValue();
                        textValue.toString();
                        if (p5Var.GWasM1elztuh.get(Integer.valueOf(keyAt2)) != null) {
                            o4.YmKjaVtbfp5Z();
                            return;
                        }
                    } else {
                        isDate = AvO7iQsrTN4.isDate();
                        if (isDate) {
                            throw new nk0("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        isList = AvO7iQsrTN4.isList();
                        if (isList) {
                            throw new nk0("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        isToggle = AvO7iQsrTN4.isToggle();
                        if (isToggle) {
                            throw new nk0("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.EXrPz3p7hFb.OOA6hdeuvCS(false, i, this.EljAMC1QTz);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.EXrPz3p7hFb.OOA6hdeuvCS(true, i, this.EljAMC1QTz);
    }

    public final void cilMamHF(g60 g60Var, long j) {
        yc0 yc0Var = this.c4eaifQP;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            yc0Var.XnEVoBF0td1l(g60Var, j);
            if (!yc0Var.Yi7zF1RB1.rQPn8YBR()) {
                yc0Var.Yi7zF1RB1(false);
                getRectManager().GWasM1elztuh();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ag0 ag0Var = this.A1EKNP6CxJ;
        if (!isAttachedToWindow()) {
            uFEq9NpZ(getRoot());
        }
        Y6hRI1cF8(true);
        e41.JFJ3QoxA().XnEVoBF0td1l();
        this.DmJncFq5 = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            v9 v9Var = this.lv06NcmrQ;
            Jz7YUlEP53 jz7YUlEP53 = v9Var.GWasM1elztuh;
            Canvas canvas2 = jz7YUlEP53.GWasM1elztuh;
            jz7YUlEP53.GWasM1elztuh = canvas;
            getRoot().mOu10nynGul(jz7YUlEP53, null);
            v9Var.GWasM1elztuh.GWasM1elztuh = canvas2;
            if (ag0Var.mOu10nynGul()) {
                int i = ag0Var.Yi7zF1RB1;
                for (int i2 = 0; i2 < i; i2++) {
                    ((ry) ((fn0) ag0Var.EljAMC1QTz(i2))).AvO7iQsrTN();
                }
            }
            int i3 = te1.OOA6hdeuvCS;
            ag0Var.xqGvceK5x();
            this.DmJncFq5 = false;
            Trace.endSection();
            ag0 ag0Var2 = this.MZhzXH72;
            if (ag0Var2 != null) {
                ag0Var.Yi7zF1RB1(ag0Var2);
                ag0Var2.xqGvceK5x();
            }
            if (WIEu4Ya2g8()) {
                e4.GWasM1elztuh(this, this.kbVzROOfKK);
                View view = this.WIEu4Ya2g8;
                if (view != null) {
                    e4.GWasM1elztuh(view, this.FhVkB11j);
                    if (!Float.isNaN(this.FhVkB11j)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.kbVzROOfKK = Float.NaN;
                this.FhVkB11j = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:665:0x0456, code lost:
    
        if ((r2 / r3) >= 5.0f) goto L262;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [he0] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17, types: [q71] */
    /* JADX WARN: Type inference failed for: r0v32, types: [he0] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v40, types: [q71] */
    /* JADX WARN: Type inference failed for: r2v45, types: [he0] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v50, types: [q71] */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v81, types: [q71] */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30, types: [g10, xk] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43, types: [he0] */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v85 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v28, types: [rg0] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [rg0] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [g10, xk] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49, types: [he0] */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [he0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [he0] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v65, types: [rg0] */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69, types: [rg0] */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r5v90 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r5v94 */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r5v96 */
    /* JADX WARN: Type inference failed for: r5v97 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [rg0] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [rg0] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36, types: [he0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38, types: [he0] */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25, types: [rg0] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28, types: [rg0] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Throwable th;
        int i;
        String str;
        int i2;
        x0 x0Var;
        String str2;
        long j;
        x00 x00Var;
        Object obj;
        long j2;
        long j3;
        int i3;
        char c;
        int i4;
        long j4;
        he0 he0Var;
        xj0 xj0Var;
        boolean z;
        yk ykVar;
        xj0 xj0Var2;
        Object E7jCp8Ls;
        he0 he0Var2;
        boolean z2;
        int size;
        int size2;
        xj0 xj0Var3;
        boolean z3;
        yk ykVar2;
        xj0 xj0Var4;
        Object E7jCp8Ls2;
        boolean z4;
        PCrRnrghk5 pCrRnrghk5;
        int size3;
        xj0 xj0Var5;
        boolean z5;
        he0 he0Var3;
        xj0 xj0Var6;
        if (this.gqMuANyCes) {
            jEYdxQDjs jeydxqdjs = this.xtv4Xm13vGi;
            removeCallbacks(jeydxqdjs);
            if (motionEvent.getActionMasked() == 8) {
                this.gqMuANyCes = false;
            } else {
                jeydxqdjs.run();
            }
        }
        if (YmKjaVtbfp5Z(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        String str3 = "visitAncestors called on an unattached node";
        int i5 = -1;
        int i6 = 1;
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (XnEVoBF0td1l(motionEvent) & 4) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            motionEvent.getAxisValue(26);
            Context context = getContext();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 26) {
                Method method = re1.GWasM1elztuh;
                y3.OOA6hdeuvCS(viewConfiguration);
            } else {
                re1.GWasM1elztuh(viewConfiguration, context);
            }
            Context context2 = getContext();
            if (i7 >= 26) {
                y3.xqGvceK5x(viewConfiguration);
            } else {
                re1.GWasM1elztuh(viewConfiguration, context2);
            }
            motionEvent.getEventTime();
            motionEvent.getDeviceId();
            nt ntVar = (nt) getFocusOwner();
            if (ntVar.xqGvceK5x.OOA6hdeuvCS) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            rt Mjvvu5DE = qj.Mjvvu5DE(ntVar.X1lG3V04pd);
            if (Mjvvu5DE != null) {
                if (!Mjvvu5DE.OOA6hdeuvCS.Mjvvu5DE) {
                    t10.Yi7zF1RB1("visitAncestors called on an unattached node");
                }
                he0 he0Var4 = Mjvvu5DE.OOA6hdeuvCS;
                g60 eUH21U3apd = vc0.eUH21U3apd(Mjvvu5DE);
                loop0: while (true) {
                    if (eUH21U3apd == null) {
                        he0Var3 = null;
                        break;
                    }
                    if ((eUH21U3apd.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 16384) != 0) {
                        while (he0Var4 != null) {
                            if ((he0Var4.AvO7iQsrTN & 16384) != 0) {
                                he0Var3 = he0Var4;
                                rg0 rg0Var = null;
                                while (he0Var3 != null) {
                                    if (he0Var3 instanceof PCrRnrghk5) {
                                        break loop0;
                                    }
                                    if ((he0Var3.AvO7iQsrTN & 16384) != 0 && (he0Var3 instanceof yk)) {
                                        int i8 = 0;
                                        for (he0 he0Var5 = ((yk) he0Var3).jivtDDk9H; he0Var5 != null; he0Var5 = he0Var5.JFJ3QoxA) {
                                            if ((he0Var5.AvO7iQsrTN & 16384) != 0) {
                                                i8++;
                                                if (i8 == 1) {
                                                    he0Var3 = he0Var5;
                                                } else {
                                                    if (rg0Var == null) {
                                                        rg0Var = new rg0(new he0[16]);
                                                    }
                                                    if (he0Var3 != null) {
                                                        rg0Var.Yi7zF1RB1(he0Var3);
                                                        he0Var3 = null;
                                                    }
                                                    rg0Var.Yi7zF1RB1(he0Var5);
                                                }
                                            }
                                        }
                                        if (i8 == 1) {
                                        }
                                    }
                                    he0Var3 = vc0.E7jCp8Ls(rg0Var);
                                }
                            }
                            he0Var4 = he0Var4.mOu10nynGul;
                        }
                    }
                    eUH21U3apd = eUH21U3apd.cilMamHF();
                    he0Var4 = (eUH21U3apd == null || (xj0Var6 = eUH21U3apd.A1EKNP6CxJ) == null) ? null : xj0Var6.OOA6hdeuvCS;
                }
                pCrRnrghk5 = (PCrRnrghk5) he0Var3;
            } else {
                pCrRnrghk5 = null;
            }
            if (pCrRnrghk5 != null) {
                if (!pCrRnrghk5.OOA6hdeuvCS.Mjvvu5DE) {
                    t10.Yi7zF1RB1("visitAncestors called on an unattached node");
                }
                he0 he0Var6 = pCrRnrghk5.OOA6hdeuvCS.mOu10nynGul;
                g60 eUH21U3apd2 = vc0.eUH21U3apd(pCrRnrghk5);
                ArrayList arrayList = null;
                while (eUH21U3apd2 != null) {
                    if ((eUH21U3apd2.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 16384) != 0) {
                        while (he0Var6 != null) {
                            if ((he0Var6.AvO7iQsrTN & 16384) != 0) {
                                he0 he0Var7 = he0Var6;
                                rg0 rg0Var2 = null;
                                while (he0Var7 != null) {
                                    if (he0Var7 instanceof PCrRnrghk5) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(he0Var7);
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z5 && (he0Var7.AvO7iQsrTN & 16384) != 0 && (he0Var7 instanceof yk)) {
                                        int i9 = 0;
                                        for (he0 he0Var8 = ((yk) he0Var7).jivtDDk9H; he0Var8 != null; he0Var8 = he0Var8.JFJ3QoxA) {
                                            if ((he0Var8.AvO7iQsrTN & 16384) != 0) {
                                                i9++;
                                                if (i9 == 1) {
                                                    he0Var7 = he0Var8;
                                                } else {
                                                    if (rg0Var2 == null) {
                                                        rg0Var2 = new rg0(new he0[16]);
                                                    }
                                                    if (he0Var7 != null) {
                                                        rg0Var2.Yi7zF1RB1(he0Var7);
                                                        he0Var7 = null;
                                                    }
                                                    rg0Var2.Yi7zF1RB1(he0Var8);
                                                }
                                            }
                                        }
                                        if (i9 == 1) {
                                        }
                                    }
                                    he0Var7 = vc0.E7jCp8Ls(rg0Var2);
                                }
                            }
                            he0Var6 = he0Var6.mOu10nynGul;
                        }
                    }
                    eUH21U3apd2 = eUH21U3apd2.cilMamHF();
                    he0Var6 = (eUH21U3apd2 == null || (xj0Var5 = eUH21U3apd2.A1EKNP6CxJ) == null) ? null : xj0Var5.OOA6hdeuvCS;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i10 = size3 - 1;
                        ((PCrRnrghk5) arrayList.get(size3)).getClass();
                        if (i10 < 0) {
                            break;
                        }
                        size3 = i10;
                    }
                }
                he0 he0Var9 = pCrRnrghk5.OOA6hdeuvCS;
                rg0 rg0Var3 = null;
                while (he0Var9 != null) {
                    if (!(he0Var9 instanceof PCrRnrghk5) && (he0Var9.AvO7iQsrTN & 16384) != 0 && (he0Var9 instanceof yk)) {
                        int i11 = 0;
                        for (he0 he0Var10 = ((yk) he0Var9).jivtDDk9H; he0Var10 != null; he0Var10 = he0Var10.JFJ3QoxA) {
                            if ((he0Var10.AvO7iQsrTN & 16384) != 0) {
                                i11++;
                                if (i11 == 1) {
                                    he0Var9 = he0Var10;
                                } else {
                                    if (rg0Var3 == null) {
                                        rg0Var3 = new rg0(new he0[16]);
                                    }
                                    if (he0Var9 != null) {
                                        rg0Var3.Yi7zF1RB1(he0Var9);
                                        he0Var9 = null;
                                    }
                                    rg0Var3.Yi7zF1RB1(he0Var10);
                                }
                            }
                        }
                        if (i11 == 1) {
                        }
                    }
                    he0Var9 = vc0.E7jCp8Ls(rg0Var3);
                }
                if (!super.dispatchGenericMotionEvent(motionEvent)) {
                    he0 he0Var11 = pCrRnrghk5.OOA6hdeuvCS;
                    rg0 rg0Var4 = null;
                    while (he0Var11 != null) {
                        if (!(he0Var11 instanceof PCrRnrghk5) && (he0Var11.AvO7iQsrTN & 16384) != 0 && (he0Var11 instanceof yk)) {
                            int i12 = 0;
                            for (he0 he0Var12 = ((yk) he0Var11).jivtDDk9H; he0Var12 != null; he0Var12 = he0Var12.JFJ3QoxA) {
                                if ((he0Var12.AvO7iQsrTN & 16384) != 0) {
                                    i12++;
                                    if (i12 == 1) {
                                        he0Var11 = he0Var12;
                                    } else {
                                        if (rg0Var4 == null) {
                                            rg0Var4 = new rg0(new he0[16]);
                                        }
                                        if (he0Var11 != null) {
                                            rg0Var4.Yi7zF1RB1(he0Var11);
                                            he0Var11 = null;
                                        }
                                        rg0Var4.Yi7zF1RB1(he0Var12);
                                    }
                                }
                            }
                            if (i12 == 1) {
                            }
                        }
                        he0Var11 = vc0.E7jCp8Ls(rg0Var4);
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        for (int i13 = 0; i13 < size4; i13++) {
                            ((PCrRnrghk5) arrayList.get(i13)).getClass();
                        }
                    }
                }
            }
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        x00 x00Var2 = this.encWxUiV2;
        te0 te0Var = this.HFYAaqMd6;
        qb0 qb0Var = te0Var.OOA6hdeuvCS;
        SparseLongArray sparseLongArray = te0Var.Yi7zF1RB1;
        int actionMasked = motionEvent.getActionMasked();
        te0Var.Yi7zF1RB1(motionEvent);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            te0Var.X1lG3V04pd.clear();
            str = "visitAncestors called on an unattached node";
            i = 16;
            x0Var = null;
            th = null;
        } else {
            te0Var.GWasM1elztuh(motionEvent);
            if (actionMasked != 1) {
                if (actionMasked == 6) {
                    i5 = motionEvent.getActionIndex();
                }
                th = null;
            } else {
                th = null;
                i5 = 0;
            }
            boolean z6 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
            i = 16;
            int pointerCount = motionEvent.getPointerCount();
            ArrayList arrayList2 = new ArrayList(pointerCount);
            int i14 = 0;
            while (i14 < pointerCount) {
                int pointerId = motionEvent.getPointerId(i14);
                int i15 = i6;
                int indexOfKey = sparseLongArray.indexOfKey(pointerId);
                if (indexOfKey >= 0) {
                    str2 = str3;
                    j = sparseLongArray.valueAt(indexOfKey);
                    x00Var = x00Var2;
                } else {
                    str2 = str3;
                    j = te0Var.GWasM1elztuh;
                    x00Var = x00Var2;
                    te0Var.GWasM1elztuh = j + 1;
                    sparseLongArray.put(pointerId, j);
                }
                te0 te0Var2 = te0Var;
                long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getX(i14)) << 32) | (Float.floatToRawIntBits(motionEvent.getY(i14)) & 4294967295L);
                ?? r33 = i14 != i5 ? i15 : 0;
                int iwATDS1i01k = fb1.iwATDS1i01k(qb0Var.EljAMC1QTz, qb0Var.encWxUiV2, j);
                if (iwATDS1i01k < 0 || (obj = qb0Var.AvO7iQsrTN[iwATDS1i01k]) == ki1.mOu10nynGul) {
                    obj = th;
                }
                se0 se0Var = (se0) obj;
                if (i14 == i5) {
                    qb0Var.X1lG3V04pd(j);
                    j2 = j;
                    j3 = 2147483647L;
                    c = ' ';
                    i3 = 65535;
                } else {
                    if (z6) {
                        j3 = 2147483647L;
                        i3 = 65535;
                        j2 = j;
                        qb0Var.Yi7zF1RB1(j2, new se0(1 | ((motionEvent.getEventTime() & 2147483647L) << i15) | (((((short) Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) << 16)) << 32)));
                    } else {
                        j2 = j;
                        j3 = 2147483647L;
                        i3 = 65535;
                    }
                    c = ' ';
                }
                long eventTime = motionEvent.getEventTime();
                long j5 = j3;
                float pressure = motionEvent.getPressure(i14);
                int i16 = i3;
                int i17 = i5;
                long eventTime2 = se0Var != null ? (se0Var.GWasM1elztuh >> i15) & j5 : motionEvent.getEventTime();
                if (se0Var != null) {
                    float f = (short) (((int) (se0Var.GWasM1elztuh >>> c)) >>> 16);
                    i4 = i17;
                    j4 = (Float.floatToRawIntBits((short) (r5 & i16)) & 4294967295L) | (Float.floatToRawIntBits(f) << c);
                } else {
                    i4 = i17;
                    j4 = floatToRawIntBits;
                }
                arrayList2.add(new y00(j2, eventTime, floatToRawIntBits, r33, pressure, eventTime2, j4, se0Var != null ? (se0Var.GWasM1elztuh & 1) != 0 ? i15 : 0 : 0));
                i14++;
                te0Var = te0Var2;
                i6 = i15;
                str3 = str2;
                x00Var2 = x00Var;
                i5 = i4;
            }
            x00 x00Var3 = x00Var2;
            str = str3;
            int i18 = i6;
            te0Var.OOA6hdeuvCS(motionEvent);
            if (x00Var3 != null) {
                i2 = x00Var3.GWasM1elztuh;
            } else {
                if (!motionEvent.isFromSource(2097152)) {
                    o4.mE4lRynR("MotionEvent must be a touch navigation source");
                    return false;
                }
                InputDevice device = motionEvent.getDevice();
                if (device != null) {
                    InputDevice.MotionRange motionRange = device.getMotionRange(0);
                    InputDevice.MotionRange motionRange2 = device.getMotionRange(i18);
                    if (motionRange == null || motionRange2 != null) {
                        if (motionRange2 == null || motionRange != null) {
                            if (motionRange != null && motionRange2 != null) {
                                float range = motionRange.getRange();
                                float range2 = motionRange2.getRange();
                                if (range <= range2 || (range2 != 0.0f && range / range2 < 5.0f)) {
                                    if (range2 > range) {
                                        if (range != 0.0f) {
                                        }
                                    }
                                }
                            }
                        }
                        i2 = 2;
                    }
                    i2 = 1;
                }
                i2 = 0;
            }
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 2 || actionMasked != 5) {
            }
            x0Var = new x0();
            x0Var.Yi7zF1RB1 = arrayList2;
            x0Var.GWasM1elztuh = i2;
            x0Var.X1lG3V04pd = motionEvent;
            if (arrayList2.isEmpty()) {
                o4.mE4lRynR("changes cannot be empty");
                throw th;
            }
        }
        i10 i10Var = this.sb9fmtV8A;
        if (x0Var == null) {
            rt EljAMC1QTz = ((nt) getFocusOwner()).EljAMC1QTz();
            if (EljAMC1QTz != null) {
                if (!EljAMC1QTz.OOA6hdeuvCS.Mjvvu5DE) {
                    t10.Yi7zF1RB1(str);
                }
                ?? r2 = EljAMC1QTz.OOA6hdeuvCS;
                g60 eUH21U3apd3 = vc0.eUH21U3apd(EljAMC1QTz);
                loop26: while (true) {
                    if (eUH21U3apd3 == null) {
                        ykVar = th;
                        break;
                    }
                    int i19 = 2097152;
                    if ((eUH21U3apd3.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 2097152) != 0) {
                        for (he0 he0Var13 = r2; he0Var13 != null; he0Var13 = he0Var13.mOu10nynGul) {
                            if ((he0Var13.AvO7iQsrTN & i19) != 0) {
                                ykVar = he0Var13;
                                Throwable th2 = th;
                                while (ykVar != 0) {
                                    if (ykVar instanceof g10) {
                                        break loop26;
                                    }
                                    ?? r4 = th2;
                                    if ((ykVar.AvO7iQsrTN & i19) != 0) {
                                        r4 = th2;
                                        if (ykVar instanceof yk) {
                                            he0 he0Var14 = ykVar.jivtDDk9H;
                                            int i20 = 0;
                                            E7jCp8Ls = ykVar;
                                            r4 = th2;
                                            while (he0Var14 != null) {
                                                if ((he0Var14.AvO7iQsrTN & i19) != 0) {
                                                    i20++;
                                                    r4 = r4;
                                                    if (i20 == 1) {
                                                        E7jCp8Ls = he0Var14;
                                                    } else {
                                                        if (r4 == 0) {
                                                            r4 = new rg0(new he0[16]);
                                                        }
                                                        if (E7jCp8Ls != null) {
                                                            r4.Yi7zF1RB1(E7jCp8Ls);
                                                            E7jCp8Ls = th;
                                                        }
                                                        r4.Yi7zF1RB1(he0Var14);
                                                    }
                                                }
                                                he0Var14 = he0Var14.JFJ3QoxA;
                                                i19 = 2097152;
                                                E7jCp8Ls = E7jCp8Ls;
                                                r4 = r4;
                                            }
                                            r4 = r4;
                                            if (i20 == 1) {
                                                i19 = 2097152;
                                                ykVar = E7jCp8Ls;
                                                th2 = r4;
                                            }
                                        }
                                    }
                                    E7jCp8Ls = vc0.E7jCp8Ls(r4);
                                    i19 = 2097152;
                                    ykVar = E7jCp8Ls;
                                    th2 = r4;
                                }
                            }
                            i19 = 2097152;
                        }
                    }
                    eUH21U3apd3 = eUH21U3apd3.cilMamHF();
                    r2 = (eUH21U3apd3 == null || (xj0Var2 = eUH21U3apd3.A1EKNP6CxJ) == null) ? th : xj0Var2.OOA6hdeuvCS;
                }
                he0Var = (g10) ykVar;
            } else {
                he0Var = th;
            }
            if (he0Var != 0) {
                he0 he0Var15 = he0Var;
                if (!he0Var15.OOA6hdeuvCS.Mjvvu5DE) {
                    t10.Yi7zF1RB1(str);
                }
                ?? r0 = he0Var15.OOA6hdeuvCS.mOu10nynGul;
                g60 eUH21U3apd4 = vc0.eUH21U3apd(he0Var);
                ?? r42 = th;
                while (eUH21U3apd4 != null) {
                    int i21 = 2097152;
                    he0 he0Var16 = r0;
                    r42 = r42;
                    if ((eUH21U3apd4.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 2097152) != 0) {
                        while (he0Var16 != null) {
                            if ((he0Var16.AvO7iQsrTN & i21) != 0) {
                                yk ykVar3 = he0Var16;
                                ?? r6 = th;
                                while (ykVar3 != 0) {
                                    ArrayList arrayList3 = r42;
                                    if (ykVar3 instanceof g10) {
                                        if (r42 == 0) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(ykVar3);
                                        z = false;
                                        r42 = arrayList3;
                                    } else {
                                        z = true;
                                        r42 = r42;
                                    }
                                    if (z) {
                                        if ((ykVar3.AvO7iQsrTN & 2097152) != 0 && (ykVar3 instanceof yk)) {
                                            he0 he0Var17 = ykVar3.jivtDDk9H;
                                            int i22 = 0;
                                            ykVar3 = ykVar3;
                                            r6 = r6;
                                            while (he0Var17 != null) {
                                                ykVar3 = ykVar3;
                                                if ((he0Var17.AvO7iQsrTN & 2097152) != 0) {
                                                    i22++;
                                                    if (i22 == 1) {
                                                        ykVar3 = he0Var17;
                                                    } else {
                                                        r6 = r6 == 0 ? new rg0(new he0[16]) : r6;
                                                        if (ykVar3 != 0) {
                                                            r6.Yi7zF1RB1(ykVar3);
                                                            ykVar3 = th;
                                                        }
                                                        r6.Yi7zF1RB1(he0Var17);
                                                        he0Var17 = he0Var17.JFJ3QoxA;
                                                        ykVar3 = ykVar3;
                                                        r6 = r6;
                                                    }
                                                }
                                                he0Var17 = he0Var17.JFJ3QoxA;
                                                ykVar3 = ykVar3;
                                                r6 = r6;
                                            }
                                            if (i22 == 1) {
                                            }
                                        }
                                    }
                                    ykVar3 = vc0.E7jCp8Ls(r6);
                                }
                            }
                            i21 = 2097152;
                            he0Var16 = he0Var16.mOu10nynGul;
                            r42 = r42;
                        }
                    }
                    eUH21U3apd4 = eUH21U3apd4.cilMamHF();
                    r0 = (eUH21U3apd4 == null || (xj0Var = eUH21U3apd4.A1EKNP6CxJ) == null) ? th : xj0Var.OOA6hdeuvCS;
                }
                he0Var.lv06NcmrQ();
                if (r42 != 0) {
                    int size5 = r42.size();
                    for (int i23 = 0; i23 < size5; i23++) {
                        ((g10) r42.get(i23)).lv06NcmrQ();
                    }
                }
            }
            i10Var.Yi7zF1RB1 = 0;
            i10Var.X1lG3V04pd = true;
            return true;
        }
        nt ntVar2 = (nt) getFocusOwner();
        if (ntVar2.xqGvceK5x.OOA6hdeuvCS) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        } else {
            rt EljAMC1QTz2 = ntVar2.EljAMC1QTz();
            if (EljAMC1QTz2 != null) {
                if (!EljAMC1QTz2.OOA6hdeuvCS.Mjvvu5DE) {
                    t10.Yi7zF1RB1(str);
                }
                he0 he0Var18 = EljAMC1QTz2.OOA6hdeuvCS;
                g60 eUH21U3apd5 = vc0.eUH21U3apd(EljAMC1QTz2);
                he0 he0Var19 = he0Var18;
                loop14: while (true) {
                    if (eUH21U3apd5 == null) {
                        ykVar2 = th;
                        break;
                    }
                    int i24 = 2097152;
                    if ((eUH21U3apd5.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 2097152) != 0) {
                        for (he0 he0Var20 = he0Var19; he0Var20 != null; he0Var20 = he0Var20.mOu10nynGul) {
                            if ((he0Var20.AvO7iQsrTN & i24) != 0) {
                                ykVar2 = he0Var20;
                                Throwable th3 = th;
                                while (ykVar2 != 0) {
                                    if (ykVar2 instanceof g10) {
                                        break loop14;
                                    }
                                    ?? r5 = th3;
                                    if ((ykVar2.AvO7iQsrTN & i24) != 0) {
                                        r5 = th3;
                                        if (ykVar2 instanceof yk) {
                                            he0 he0Var21 = ykVar2.jivtDDk9H;
                                            int i25 = 0;
                                            E7jCp8Ls2 = ykVar2;
                                            r5 = th3;
                                            while (he0Var21 != null) {
                                                if ((he0Var21.AvO7iQsrTN & i24) != 0) {
                                                    i25++;
                                                    r5 = r5;
                                                    if (i25 == 1) {
                                                        E7jCp8Ls2 = he0Var21;
                                                    } else {
                                                        if (r5 == 0) {
                                                            r5 = new rg0(new he0[i]);
                                                        }
                                                        if (E7jCp8Ls2 != null) {
                                                            r5.Yi7zF1RB1(E7jCp8Ls2);
                                                            E7jCp8Ls2 = th;
                                                        }
                                                        r5.Yi7zF1RB1(he0Var21);
                                                    }
                                                }
                                                he0Var21 = he0Var21.JFJ3QoxA;
                                                i = 16;
                                                i24 = 2097152;
                                                E7jCp8Ls2 = E7jCp8Ls2;
                                                r5 = r5;
                                            }
                                            r5 = r5;
                                            if (i25 == 1) {
                                                i = 16;
                                                i24 = 2097152;
                                                ykVar2 = E7jCp8Ls2;
                                                th3 = r5;
                                            }
                                        }
                                    }
                                    E7jCp8Ls2 = vc0.E7jCp8Ls(r5);
                                    i = 16;
                                    i24 = 2097152;
                                    ykVar2 = E7jCp8Ls2;
                                    th3 = r5;
                                }
                            }
                            i = 16;
                            i24 = 2097152;
                        }
                    }
                    eUH21U3apd5 = eUH21U3apd5.cilMamHF();
                    i = 16;
                    he0Var19 = (eUH21U3apd5 == null || (xj0Var4 = eUH21U3apd5.A1EKNP6CxJ) == null) ? th : xj0Var4.OOA6hdeuvCS;
                }
                he0Var2 = (g10) ykVar2;
            } else {
                he0Var2 = th;
            }
            if (he0Var2 != 0) {
                he0 he0Var22 = he0Var2;
                if (!he0Var22.OOA6hdeuvCS.Mjvvu5DE) {
                    t10.Yi7zF1RB1(str);
                }
                ?? r02 = he0Var22.OOA6hdeuvCS.mOu10nynGul;
                g60 eUH21U3apd6 = vc0.eUH21U3apd(he0Var2);
                ?? r52 = th;
                while (eUH21U3apd6 != null) {
                    int i26 = 2097152;
                    he0 he0Var23 = r02;
                    r52 = r52;
                    if ((eUH21U3apd6.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 2097152) != 0) {
                        while (he0Var23 != null) {
                            if ((he0Var23.AvO7iQsrTN & i26) != 0) {
                                yk ykVar4 = he0Var23;
                                ?? r7 = th;
                                while (ykVar4 != 0) {
                                    ArrayList arrayList4 = r52;
                                    if (ykVar4 instanceof g10) {
                                        if (r52 == 0) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(ykVar4);
                                        z3 = false;
                                        r52 = arrayList4;
                                    } else {
                                        z3 = true;
                                        r52 = r52;
                                    }
                                    if (z3) {
                                        int i27 = 2097152;
                                        if ((ykVar4.AvO7iQsrTN & 2097152) != 0 && (ykVar4 instanceof yk)) {
                                            he0 he0Var24 = ykVar4.jivtDDk9H;
                                            int i28 = 0;
                                            ykVar4 = ykVar4;
                                            r7 = r7;
                                            while (he0Var24 != null) {
                                                if ((he0Var24.AvO7iQsrTN & i27) != 0) {
                                                    i28++;
                                                    r7 = r7;
                                                    if (i28 == 1) {
                                                        ykVar4 = he0Var24;
                                                    } else {
                                                        if (r7 == 0) {
                                                            r7 = new rg0(new he0[16]);
                                                        }
                                                        if (ykVar4 != 0) {
                                                            r7.Yi7zF1RB1(ykVar4);
                                                            ykVar4 = th;
                                                        }
                                                        r7.Yi7zF1RB1(he0Var24);
                                                    }
                                                }
                                                he0Var24 = he0Var24.JFJ3QoxA;
                                                i27 = 2097152;
                                                ykVar4 = ykVar4;
                                                r7 = r7;
                                            }
                                            if (i28 == 1) {
                                            }
                                        }
                                    }
                                    ykVar4 = vc0.E7jCp8Ls(r7);
                                }
                            }
                            i26 = 2097152;
                            he0Var23 = he0Var23.mOu10nynGul;
                            r52 = r52;
                        }
                    }
                    eUH21U3apd6 = eUH21U3apd6.cilMamHF();
                    r02 = (eUH21U3apd6 == null || (xj0Var3 = eUH21U3apd6.A1EKNP6CxJ) == null) ? th : xj0Var3.OOA6hdeuvCS;
                }
                hq0 hq0Var = hq0.OOA6hdeuvCS;
                if (r52 != 0 && r52.size() - 1 >= 0) {
                    while (true) {
                        int i29 = size2 - 1;
                        ((g10) r52.get(size2)).M3K9sHhK(x0Var, hq0Var);
                        if (i29 < 0) {
                            break;
                        }
                        size2 = i29;
                    }
                }
                he0Var2.M3K9sHhK(x0Var, hq0Var);
                hq0 hq0Var2 = hq0.EljAMC1QTz;
                he0Var2.M3K9sHhK(x0Var, hq0Var2);
                if (r52 != 0) {
                    int size6 = r52.size();
                    for (int i30 = 0; i30 < size6; i30++) {
                        ((g10) r52.get(i30)).M3K9sHhK(x0Var, hq0Var2);
                    }
                }
                hq0 hq0Var3 = hq0.AvO7iQsrTN;
                if (r52 != 0 && r52.size() - 1 >= 0) {
                    while (true) {
                        int i31 = size - 1;
                        ((g10) r52.get(size)).M3K9sHhK(x0Var, hq0Var3);
                        if (i31 < 0) {
                            break;
                        }
                        size = i31;
                    }
                }
                he0Var2.M3K9sHhK(x0Var, hq0Var3);
            }
            ArrayList arrayList5 = (ArrayList) x0Var.Yi7zF1RB1;
            int size7 = arrayList5.size();
            for (int i32 = 0; i32 < size7; i32++) {
                if (((y00) arrayList5.get(i32)).mOu10nynGul) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        i10Var.getClass();
        MotionEvent motionEvent2 = (MotionEvent) x0Var.X1lG3V04pd;
        int action = motionEvent2.getAction();
        if (action != 0) {
            z4 = true;
            if ((action == 1 || action == 2) && z2) {
                i10Var.Yi7zF1RB1 = 0;
                i10Var.X1lG3V04pd = true;
            }
        } else {
            z4 = true;
            i10Var.Yi7zF1RB1 = x0Var.GWasM1elztuh;
            i10Var.X1lG3V04pd = false;
        }
        i10Var.xqGvceK5x.onTouchEvent(motionEvent2);
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0154, code lost:
    
        if (mE4lRynR(r24) == false) goto L71;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.gqMuANyCes;
        jEYdxQDjs jeydxqdjs = this.xtv4Xm13vGi;
        if (z) {
            removeCallbacks(jeydxqdjs);
            jeydxqdjs.run();
        }
        if (!YmKjaVtbfp5Z(motionEvent) && isAttachedToWindow()) {
            i iVar = this.EXrPz3p7hFb;
            c cVar = iVar.encWxUiV2;
            AccessibilityManager accessibilityManager = iVar.rQPn8YBR;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    cVar.Y6hRI1cF8(true);
                    nz nzVar = new nz();
                    xj0 xj0Var = cVar.getRoot().A1EKNP6CxJ;
                    bk0 bk0Var = xj0Var.xqGvceK5x;
                    yu0 yu0Var = bk0.z19UFEN2I;
                    xj0Var.xqGvceK5x.NsRGN7gRqWF(bk0.qugwajBSa59j, bk0Var.R46bVSe7ra((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L)), nzVar, 1, true);
                    ag0 ag0Var = nzVar.OOA6hdeuvCS;
                    int i2 = ag0Var.Yi7zF1RB1 - 1;
                    while (true) {
                        if (-1 >= i2) {
                            i = Integer.MIN_VALUE;
                            break;
                        }
                        Object EljAMC1QTz = ag0Var.EljAMC1QTz(i2);
                        EljAMC1QTz.getClass();
                        g60 eUH21U3apd = vc0.eUH21U3apd((he0) EljAMC1QTz);
                        if (cVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(eUH21U3apd) != null) {
                            o4.YmKjaVtbfp5Z();
                            return false;
                        }
                        if (eUH21U3apd.A1EKNP6CxJ.xqGvceK5x(8)) {
                            int mE4lRynR = iVar.mE4lRynR(eUH21U3apd.EljAMC1QTz);
                            d01 AvO7iQsrTN = w60.AvO7iQsrTN(eUH21U3apd, false);
                            if (o30.EXrPz3p7hFb(AvO7iQsrTN)) {
                                if (!AvO7iQsrTN.rQPn8YBR().OOA6hdeuvCS.X1lG3V04pd(h01.pog2g9KITJA)) {
                                    i = mE4lRynR;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i2--;
                    }
                    cVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i3 = iVar.mOu10nynGul;
                    if (i3 != i) {
                        iVar.mOu10nynGul = i;
                        i.lv06NcmrQ(iVar, i, 128, null, 12);
                        i.lv06NcmrQ(iVar, i3, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i4 = iVar.mOu10nynGul;
                    if (i4 == Integer.MIN_VALUE) {
                        cVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i4 != Integer.MIN_VALUE) {
                        iVar.mOu10nynGul = Integer.MIN_VALUE;
                        i.lv06NcmrQ(iVar, Integer.MIN_VALUE, 128, null, 12);
                        i.lv06NcmrQ(iVar, i4, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && Mjvvu5DE(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.cTIXpaxc;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.cTIXpaxc = MotionEvent.obtainNoHistory(motionEvent);
                        this.gqMuANyCes = true;
                        postDelayed(jeydxqdjs, 8L);
                        return false;
                    }
                }
                if ((XnEVoBF0td1l(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (!isFocused()) {
            return ((nt) getFocusOwner()).xqGvceK5x(keyEvent, new psOJLYhIz(i, this, keyEvent));
        }
        c90 c90Var = getComposeViewContext().mE4lRynR;
        int metaState = keyEvent.getMetaState();
        c90Var.getClass();
        rf1.GWasM1elztuh.setValue(new pq0(metaState));
        return ((nt) getFocusOwner()).xqGvceK5x(keyEvent, hf.rQPn8YBR) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        xj0 xj0Var;
        if (isFocused()) {
            nt ntVar = (nt) getFocusOwner();
            if (ntVar.xqGvceK5x.OOA6hdeuvCS) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                rt Mjvvu5DE = qj.Mjvvu5DE(ntVar.X1lG3V04pd);
                if (Mjvvu5DE != null) {
                    if (!Mjvvu5DE.OOA6hdeuvCS.Mjvvu5DE) {
                        t10.Yi7zF1RB1("visitAncestors called on an unattached node");
                    }
                    he0 he0Var = Mjvvu5DE.OOA6hdeuvCS;
                    g60 eUH21U3apd = vc0.eUH21U3apd(Mjvvu5DE);
                    while (eUH21U3apd != null) {
                        if ((eUH21U3apd.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 131072) != 0) {
                            while (he0Var != null) {
                                if ((he0Var.AvO7iQsrTN & 131072) != 0) {
                                    he0 he0Var2 = he0Var;
                                    rg0 rg0Var = null;
                                    while (he0Var2 != null) {
                                        if ((he0Var2.AvO7iQsrTN & 131072) != 0 && (he0Var2 instanceof yk)) {
                                            int i = 0;
                                            for (he0 he0Var3 = ((yk) he0Var2).jivtDDk9H; he0Var3 != null; he0Var3 = he0Var3.JFJ3QoxA) {
                                                if ((he0Var3.AvO7iQsrTN & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        he0Var2 = he0Var3;
                                                    } else {
                                                        if (rg0Var == null) {
                                                            rg0Var = new rg0(new he0[16]);
                                                        }
                                                        if (he0Var2 != null) {
                                                            rg0Var.Yi7zF1RB1(he0Var2);
                                                            he0Var2 = null;
                                                        }
                                                        rg0Var.Yi7zF1RB1(he0Var3);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        he0Var2 = vc0.E7jCp8Ls(rg0Var);
                                    }
                                }
                                he0Var = he0Var.mOu10nynGul;
                            }
                        }
                        eUH21U3apd = eUH21U3apd.cilMamHF();
                        he0Var = (eUH21U3apd == null || (xj0Var = eUH21U3apd.A1EKNP6CxJ) == null) ? null : xj0Var.OOA6hdeuvCS;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            j.GWasM1elztuh.GWasM1elztuh(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object j5Var;
        rt EljAMC1QTz;
        if (this.gqMuANyCes) {
            jEYdxQDjs jeydxqdjs = this.xtv4Xm13vGi;
            removeCallbacks(jeydxqdjs);
            MotionEvent motionEvent2 = this.cTIXpaxc;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.gqMuANyCes = false;
            } else {
                jeydxqdjs.run();
            }
        }
        if (!YmKjaVtbfp5Z(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || mE4lRynR(motionEvent))) {
            int XnEVoBF0td1l = XnEVoBF0td1l(motionEvent);
            if ((XnEVoBF0td1l & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (j5Var = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    j5Var = new j5(1);
                }
                if (j5Var.equals(new j5(1)) && (EljAMC1QTz = ((nt) getFocusOwner()).EljAMC1QTz()) != null) {
                    bk0 YZjbz8VdP5 = vc0.YZjbz8VdP5(EljAMC1QTz);
                    kt0 eUH21U3apd = o50.iwATDS1i01k(YZjbz8VdP5).eUH21U3apd(YZjbz8VdP5, true);
                    long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L);
                    float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                    if (!((intBitsToFloat < eUH21U3apd.X1lG3V04pd) & (intBitsToFloat >= eUH21U3apd.GWasM1elztuh) & (intBitsToFloat2 >= eUH21U3apd.Yi7zF1RB1) & (intBitsToFloat2 < eUH21U3apd.xqGvceK5x))) {
                        ((nt) getFocusOwner()).Yi7zF1RB1(8, false, true);
                    }
                }
            }
            if ((XnEVoBF0td1l & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void eUH21U3apd(MotionEvent motionEvent, int i, long j, boolean z) {
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
            long jivtDDk9H = jivtDDk9H((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jivtDDk9H >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jivtDDk9H & 4294967295L));
            i5++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        d X1lG3V04pd = this.HFYAaqMd6.X1lG3V04pd(obtain, this);
        X1lG3V04pd.getClass();
        this.rezfBrjOrqK.GWasM1elztuh(X1lG3V04pd, this, true);
        obtain.recycle();
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return rQPn8YBR(this, i);
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
        kt0 GWasM1elztuh;
        if (view == null || this.c4eaifQP.X1lG3V04pd) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (findNextFocus != null && !findNextFocus.equals(this)) {
            for (ViewParent parent = findNextFocus.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
        }
        findNextFocus = null;
        if (view == this) {
            rt Mjvvu5DE = qj.Mjvvu5DE(((nt) getFocusOwner()).X1lG3V04pd);
            GWasM1elztuh = Mjvvu5DE != null ? qj.Y6hRI1cF8(Mjvvu5DE) : null;
            if (GWasM1elztuh == null) {
                GWasM1elztuh = gt.GWasM1elztuh(view, this);
            }
        } else {
            GWasM1elztuh = gt.GWasM1elztuh(view, this);
        }
        dt Yi7zF1RB1 = gt.Yi7zF1RB1(i);
        int i2 = Yi7zF1RB1 != null ? Yi7zF1RB1.GWasM1elztuh : 6;
        rt0 rt0Var = new rt0();
        if (((nt) getFocusOwner()).OOA6hdeuvCS(i2, GWasM1elztuh, new mnHdw6496Bs(0, rt0Var)) == null) {
            return view;
        }
        Object obj = rt0Var.OOA6hdeuvCS;
        if (obj != null) {
            if (findNextFocus == null || i2 == 1 || i2 == 2 || d70.lv06NcmrQ(qj.Y6hRI1cF8((rt) obj), gt.GWasM1elztuh(findNextFocus, this), GWasM1elztuh, i2)) {
                return this;
            }
        } else if (findNextFocus == null) {
            return super.focusSearch(view, i);
        }
        return findNextFocus;
    }

    public final b2 getAndroidViewsHandler$ui() {
        if (this.MjxSquD6Av == null) {
            b2 b2Var = new b2(getContext());
            this.MjxSquD6Av = b2Var;
            addView(b2Var, -1);
            requestLayout();
        }
        b2 b2Var2 = this.MjxSquD6Av;
        b2Var2.getClass();
        return b2Var2;
    }

    public k5 getAutofill() {
        return this.VeqTn1PQw7;
    }

    public o5 getAutofillManager() {
        return this.z19UFEN2I;
    }

    public p5 getAutofillTree() {
        return this.eUH21U3apd;
    }

    public final se getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.bfDgRvRIg;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.TpUsjqg3bxO.getValue();
    }

    public final w getContentCaptureManager$ui() {
        return this.ozMwhSAI;
    }

    public gh getCoroutineContext() {
        return this.Mjvvu5DE;
    }

    public el getDensity() {
        return (el) this.iwATDS1i01k.getValue();
    }

    public kt0 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            rt Mjvvu5DE = qj.Mjvvu5DE(((nt) getFocusOwner()).X1lG3V04pd);
            if (Mjvvu5DE != null) {
                return qj.Y6hRI1cF8(Mjvvu5DE);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return gt.GWasM1elztuh(findFocus, this);
        }
        return null;
    }

    public kt getFocusOwner() {
        return this.YmKjaVtbfp5Z;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        kt0 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.GWasM1elztuh);
            rect.top = Math.round(embeddedViewFocusRect.Yi7zF1RB1);
            rect.right = Math.round(embeddedViewFocusRect.X1lG3V04pd);
            rect.bottom = Math.round(embeddedViewFocusRect.xqGvceK5x);
            return;
        }
        if (o30.rQPn8YBR(((nt) getFocusOwner()).OOA6hdeuvCS(6, null, XdwzlWIkSDqF.AvO7iQsrTN), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public yt getFontFamilyResolver() {
        return (yt) this.YTyqgZhdF.getValue();
    }

    public xt getFontLoader() {
        return this.jed7WnvkLvFq;
    }

    public final y90 getFrameEndScheduler$ui() {
        return this.JFJ3QoxA;
    }

    public ny getGraphicsContext() {
        return this.YZjbz8VdP5;
    }

    public fz getHapticFeedBack() {
        return this.oFzb77RX3H8t;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.c4eaifQP.Yi7zF1RB1.rQPn8YBR() || !this.XnEVoBF0td1l.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public c20 getInputModeManager() {
        return this.UjhVk5crk;
    }

    public final g20 getInsetsListener() {
        return this.WRKkgoJXwDn;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.NyNgffpi;
    }

    @Override // android.view.View, android.view.ViewParent
    public p50 getLayoutDirection() {
        return (p50) this.ZB4nixHlTE.getValue();
    }

    public gb0 getLocaleList() {
        return (gb0) this.dqB83aoLBB.getValue();
    }

    public long getMeasureIteration() {
        yc0 yc0Var = this.c4eaifQP;
        if (!yc0Var.X1lG3V04pd) {
            t10.GWasM1elztuh("measureIteration should be only used during the measure/layout pass");
        }
        return yc0Var.AvO7iQsrTN;
    }

    public je0 getModifierLocalManager() {
        return this.WkXHDbKiD;
    }

    /* renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public c m10getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public tp0 getPlacementScope() {
        int i = vp0.Yi7zF1RB1;
        return new vb0(1, this);
    }

    public jq0 getPointerIconService() {
        return this.oCbv4H4NsA;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final x00 m3getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.encWxUiV2;
    }

    public mt0 getRectManager() {
        return this.M3K9sHhK;
    }

    public wu0 getRetainedValuesStore() {
        return this.E7jCp8Ls;
    }

    public g60 getRoot() {
        return this.arNh8D4Z5gB;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        c90 c90Var;
        if (Build.VERSION.SDK_INT < 31 || (c90Var = this.fX9rg6CD) == null) {
            return false;
        }
        return ((Boolean) c90Var.GWasM1elztuh.getValue()).booleanValue();
    }

    public g01 getSemanticsOwner() {
        return this.k8h8IjolWQ;
    }

    public i60 getSharedDrawScope() {
        return this.mOu10nynGul;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? c4.GWasM1elztuh.GWasM1elztuh(this) : this.MItybXapHX;
    }

    public in0 getSnapshotObserver() {
        return this.J3Xc8BaqpN8;
    }

    public s41 getSoftwareKeyboardController() {
        k61 k61Var = this.JB4pnjMK;
        if (k61Var != null) {
            return k61Var;
        }
        getTextInputService();
        k61 k61Var2 = new k61(26);
        this.JB4pnjMK = k61Var2;
        return k61Var2;
    }

    public g81 getTextInputService() {
        g81 g81Var = this.SyyZR548qbcW;
        if (g81Var != null) {
            return g81Var;
        }
        getLegacyTextInputServiceAndroid();
        g81 g81Var2 = new g81();
        new AtomicReference(null);
        this.SyyZR548qbcW = g81Var2;
        return g81Var2;
    }

    public z81 getTextToolbar() {
        return this.vaTCmWUgXF;
    }

    public final pv0 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public qe1 getViewConfiguration() {
        return this.WdrkLMV3xh;
    }

    public final o9oGstcVt9 getViewTreeOwners() {
        mr0.WIEu4Ya2g8(this.nXl1EmE5.getValue());
        return null;
    }

    public qf1 getWindowInfo() {
        return getComposeViewContext().mE4lRynR;
    }

    public final VJUcwvGgb9W get_autofillManager$ui() {
        return this.z19UFEN2I;
    }

    public final void iwATDS1i01k(g60 g60Var) {
        this.c4eaifQP.Mjvvu5DE(g60Var, false);
        rg0 arNh8D4Z5gB = g60Var.arNh8D4Z5gB();
        Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
        int i = arNh8D4Z5gB.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            iwATDS1i01k((g60) objArr[i2]);
        }
    }

    public final long jivtDDk9H(long j) {
        M3K9sHhK();
        long lv06NcmrQ = z50.lv06NcmrQ(this.JFXS9W1rB5s4, j);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.dcDmLGVhzWm >> 32)) + Float.intBitsToFloat((int) (lv06NcmrQ >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.dcDmLGVhzWm & 4294967295L)) + Float.intBitsToFloat((int) (lv06NcmrQ & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public final void k8h8IjolWQ(MotionEvent motionEvent) {
        this.NyNgffpi = AnimationUtils.currentAnimationTimeMillis();
        f9 f9Var = this.Hc2GqxcqBiX;
        float[] fArr = this.JFXS9W1rB5s4;
        f9Var.Yi7zF1RB1(this, fArr);
        fb1.AEn1Rrio(fArr, this.ES6ysExf);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long lv06NcmrQ = z50.lv06NcmrQ(fArr, (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (lv06NcmrQ >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (lv06NcmrQ & 4294967295L));
        this.dcDmLGVhzWm = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final void lv06NcmrQ() {
        ag0 ag0Var;
        VJUcwvGgb9W vJUcwvGgb9W;
        Object[] objArr;
        if (this.YXi2hvwn7WL) {
            r41 r41Var = getSnapshotObserver().GWasM1elztuh;
            synchronized (r41Var.AvO7iQsrTN) {
                try {
                    rg0 rg0Var = r41Var.EljAMC1QTz;
                    int i = rg0Var.AvO7iQsrTN;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = rg0Var.OOA6hdeuvCS;
                        if (i2 >= i) {
                            break;
                        }
                        q41 q41Var = (q41) objArr[i2];
                        q41Var.xqGvceK5x();
                        if (!q41Var.EljAMC1QTz.JFJ3QoxA()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = rg0Var.OOA6hdeuvCS;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    rg0Var.AvO7iQsrTN = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.YXi2hvwn7WL = false;
        }
        b2 b2Var = this.MjxSquD6Av;
        if (b2Var != null) {
            mOu10nynGul(b2Var);
        }
        if (encWxUiV2() && (vJUcwvGgb9W = this.z19UFEN2I) != null) {
            sf0 sf0Var = vJUcwvGgb9W.rQPn8YBR;
            if (sf0Var.xqGvceK5x == 0 && vJUcwvGgb9W.E7jCp8Ls) {
                ((AutofillManager) vJUcwvGgb9W.OOA6hdeuvCS.EljAMC1QTz).commit();
                vJUcwvGgb9W.E7jCp8Ls = false;
            }
            if (sf0Var.xqGvceK5x != 0) {
                vJUcwvGgb9W.E7jCp8Ls = true;
            }
        }
        while (this.hOpoc9RpANL.mOu10nynGul() && this.hOpoc9RpANL.EljAMC1QTz(0) != null) {
            int i5 = this.hOpoc9RpANL.Yi7zF1RB1;
            int i6 = 0;
            while (true) {
                ag0Var = this.hOpoc9RpANL;
                if (i6 < i5) {
                    wu wuVar = (wu) ag0Var.EljAMC1QTz(i6);
                    this.hOpoc9RpANL.uFEq9NpZ(i6, null);
                    if (wuVar != null) {
                        wuVar.GWasM1elztuh();
                    }
                    i6++;
                }
            }
            ag0Var.E7jCp8Ls(0, i5);
        }
    }

    public final boolean mE4lRynR(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.cTIXpaxc) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        wu0 wu0Var;
        Object obj;
        rx0 rx0Var;
        super.onAttachedToWindow();
        setAttached(true);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(ki1.EXrPz3p7hFb());
        }
        this.WRKkgoJXwDn.onViewAttachedToWindow(this);
        int i2 = 0;
        if (i > 28) {
            if (AIyqmrtNPT == null) {
                UpJpMKXj upJpMKXj = new UpJpMKXj();
                AIyqmrtNPT = upJpMKXj;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (R46bVSe7ra == null) {
                        R46bVSe7ra = Class.forName("android.os.SystemProperties");
                    }
                    if (b9xEq24R1 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = R46bVSe7ra;
                        b9xEq24R1 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = b9xEq24R1;
                    if (method != null) {
                        method.invoke(null, upJpMKXj);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            ag0 ag0Var = iK7aQfvhG;
            synchronized (ag0Var) {
                ag0Var.GWasM1elztuh(this);
            }
        }
        if (!this.bfDgRvRIg) {
            getComposeViewContext().X1lG3V04pd();
        }
        this.bfDgRvRIg = false;
        iwATDS1i01k(getRoot());
        uFEq9NpZ(getRoot());
        getSnapshotObserver().GWasM1elztuh.xqGvceK5x();
        if (encWxUiV2() && (rx0Var = this.VeqTn1PQw7) != null) {
            m5 m5Var = m5.GWasM1elztuh;
            m5Var.getClass();
            ((AutofillManager) rx0Var.AvO7iQsrTN).registerCallback(mqNvfisv7.OOA6hdeuvCS(m5Var));
        }
        t90 t90Var = getComposeViewContext().X1lG3V04pd;
        ff1 ff1Var = getComposeViewContext().OOA6hdeuvCS;
        y90 y90Var = this.JFJ3QoxA;
        if (t90Var == null || ff1Var == null || y90Var == null) {
            wu0Var = null;
        } else {
            ef1 OOA6hdeuvCS = ff1Var.OOA6hdeuvCS();
            bf1 bf1Var = new bf1();
            vh vhVar = vh.Yi7zF1RB1;
            vhVar.getClass();
            rx0 rx0Var2 = new rx0(OOA6hdeuvCS, bf1Var, vhVar);
            va GWasM1elztuh = st0.GWasM1elztuh(aa0.class);
            String GWasM1elztuh2 = GWasM1elztuh.GWasM1elztuh();
            if (GWasM1elztuh2 == null) {
                o4.mE4lRynR("Local and anonymous classes can not be ViewModels");
                return;
            }
            aa0 aa0Var = (aa0) rx0Var2.YmKjaVtbfp5Z(GWasM1elztuh, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(GWasM1elztuh2));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            rf0 rf0Var = aa0Var.Yi7zF1RB1;
            Object Yi7zF1RB1 = rf0Var.Yi7zF1RB1(id);
            if (Yi7zF1RB1 == null) {
                Yi7zF1RB1 = new ag0(1);
                rf0Var.encWxUiV2(id, Yi7zF1RB1);
            }
            ag0 ag0Var2 = (ag0) Yi7zF1RB1;
            Object[] objArr = ag0Var2.GWasM1elztuh;
            int i3 = ag0Var2.Yi7zF1RB1;
            while (true) {
                if (i2 >= i3) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((z90) obj).X1lG3V04pd) {
                    break;
                } else {
                    i2++;
                }
            }
            z90 z90Var = (z90) obj;
            if (z90Var == null) {
                z90Var = new z90();
                ag0Var2.GWasM1elztuh(z90Var);
            }
            z90Var.X1lG3V04pd = true;
            this.rQPn8YBR = z90Var;
            wu0Var = z90Var.Yi7zF1RB1;
        }
        if (wu0Var == null) {
            wu0Var = b9xEq24R1.DmJncFq5;
        }
        this.E7jCp8Ls = wu0Var;
        hv hvVar = this.K0ReC6MK;
        if (hvVar != null) {
            hvVar.mOu10nynGul(getComposeViewContext());
            this.K0ReC6MK = null;
        }
        w90 AvO7iQsrTN = getComposeViewContext().X1lG3V04pd.AvO7iQsrTN();
        AvO7iQsrTN.GWasM1elztuh(this);
        AvO7iQsrTN.GWasM1elztuh(this.ozMwhSAI);
        this.UjhVk5crk.GWasM1elztuh.setValue(new b20(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            n.GWasM1elztuh.Yi7zF1RB1(this);
        }
        VJUcwvGgb9W vJUcwvGgb9W = this.z19UFEN2I;
        if (vJUcwvGgb9W != null) {
            ((nt) getFocusOwner()).AvO7iQsrTN.GWasM1elztuh(vJUcwvGgb9W);
            getSemanticsOwner().xqGvceK5x.GWasM1elztuh(vJUcwvGgb9W);
        }
        ((nt) getFocusOwner()).AvO7iQsrTN.GWasM1elztuh(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.rASgSCrgZkT7.get() == null) {
            getLegacyTextInputServiceAndroid().getClass();
            return false;
        }
        o4.YmKjaVtbfp5Z();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A1EKNP6CxJ(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.rASgSCrgZkT7.get() == null) {
            getLegacyTextInputServiceAndroid().getClass();
            return null;
        }
        o4.YmKjaVtbfp5Z();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        d01 d01Var;
        AutofillId autofillId;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        w wVar = this.ozMwhSAI;
        wVar.getClass();
        for (long j : jArr) {
            f01 f01Var = (f01) wVar.AvO7iQsrTN().Yi7zF1RB1((int) j);
            if (f01Var != null && (d01Var = f01Var.GWasM1elztuh) != null) {
                m.YmKjaVtbfp5Z();
                autofillId = wVar.OOA6hdeuvCS.getAutofillId();
                ViewTranslationRequest.Builder XnEVoBF0td1l = m.XnEVoBF0td1l(autofillId, d01Var.EljAMC1QTz);
                Object AvO7iQsrTN = d01Var.xqGvceK5x.OOA6hdeuvCS.AvO7iQsrTN(h01.M3K9sHhK);
                if (AvO7iQsrTN == null) {
                    AvO7iQsrTN = null;
                }
                List list = (List) AvO7iQsrTN;
                if (list != null) {
                    forText = TranslationRequestValue.forText(new u3(xa0.GWasM1elztuh(list, "\n", null, 62)));
                    XnEVoBF0td1l.setValue("android:text", forText);
                    build = XnEVoBF0td1l.build();
                    consumer.accept(build);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        rx0 rx0Var;
        super.onDetachedFromWindow();
        setAttached(false);
        this.WRKkgoJXwDn.onViewDetachedFromWindow(this);
        View view = this.WIEu4Ya2g8;
        if (WIEu4Ya2g8() && view != null) {
            removeView(view);
        }
        if (Build.VERSION.SDK_INT > 28) {
            ag0 ag0Var = iK7aQfvhG;
            synchronized (ag0Var) {
                ag0Var.JFJ3QoxA(this);
            }
        }
        getComposeViewContext().Yi7zF1RB1();
        in0 snapshotObserver = getSnapshotObserver();
        el0 el0Var = snapshotObserver.GWasM1elztuh.encWxUiV2;
        if (el0Var != null) {
            el0Var.GWasM1elztuh();
        }
        r41 r41Var = snapshotObserver.GWasM1elztuh;
        synchronized (r41Var.AvO7iQsrTN) {
            rg0 rg0Var = r41Var.EljAMC1QTz;
            Object[] objArr = rg0Var.OOA6hdeuvCS;
            int i = rg0Var.AvO7iQsrTN;
            for (int i2 = 0; i2 < i; i2++) {
                q41 q41Var = (q41) objArr[i2];
                q41Var.OOA6hdeuvCS.GWasM1elztuh();
                q41Var.EljAMC1QTz.GWasM1elztuh();
                q41Var.E7jCp8Ls.GWasM1elztuh();
                q41Var.XnEVoBF0td1l.clear();
            }
        }
        w90 AvO7iQsrTN = getComposeViewContext().X1lG3V04pd.AvO7iQsrTN();
        AvO7iQsrTN.EljAMC1QTz(this.ozMwhSAI);
        AvO7iQsrTN.EljAMC1QTz(this);
        if (encWxUiV2() && (rx0Var = this.VeqTn1PQw7) != null) {
            m5 m5Var = m5.GWasM1elztuh;
            m5Var.getClass();
            ((AutofillManager) rx0Var.AvO7iQsrTN).unregisterCallback(mqNvfisv7.OOA6hdeuvCS(m5Var));
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        z90 z90Var = this.rQPn8YBR;
        if (z90Var != null) {
            z90Var.X1lG3V04pd = false;
        }
        this.rQPn8YBR = null;
        if (Build.VERSION.SDK_INT >= 31) {
            n.GWasM1elztuh.GWasM1elztuh(this);
        }
        VJUcwvGgb9W vJUcwvGgb9W = this.z19UFEN2I;
        if (vJUcwvGgb9W != null) {
            getSemanticsOwner().xqGvceK5x.JFJ3QoxA(vJUcwvGgb9W);
            ((nt) getFocusOwner()).AvO7iQsrTN.JFJ3QoxA(vJUcwvGgb9W);
        }
        mt0 rectManager = getRectManager();
        rectManager.EljAMC1QTz = rectManager.X1lG3V04pd.Yi7zF1RB1(0L, 0L, null, 0, 0);
        getRectManager().GWasM1elztuh();
        mt0 rectManager2 = getRectManager();
        AiiPg05cpff aiiPg05cpff = rectManager2.encWxUiV2;
        if (aiiPg05cpff != null) {
            rectManager2.GWasM1elztuh.removeCallbacks(aiiPg05cpff);
            rectManager2.encWxUiV2 = null;
        }
        ((nt) getFocusOwner()).AvO7iQsrTN.JFJ3QoxA(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        nt ntVar = (nt) getFocusOwner();
        p.encWxUiV2(ntVar.X1lG3V04pd, true);
        if (ntVar.EljAMC1QTz() != null) {
            rt EljAMC1QTz = ntVar.EljAMC1QTz();
            ntVar.encWxUiV2(null);
            if (EljAMC1QTz != null) {
                EljAMC1QTz.sb9fmtV8A(qt.OOA6hdeuvCS, qt.AvO7iQsrTN);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.NyNgffpi = 0L;
        MZhzXH72();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        A1EKNP6CxJ(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.NyNgffpi = 0L;
            this.c4eaifQP.E7jCp8Ls(this.XmVeRDAr);
            this.Uxq83abb04 = null;
            MZhzXH72();
            if (this.MjxSquD6Av != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        yc0 yc0Var = this.c4eaifQP;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                iwATDS1i01k(getRoot());
            }
            long JFJ3QoxA = JFJ3QoxA(i);
            long JFJ3QoxA2 = JFJ3QoxA(i2);
            long WdrkLMV3xh = fb1.WdrkLMV3xh((int) (JFJ3QoxA >>> 32), (int) (JFJ3QoxA & 4294967295L), (int) (JFJ3QoxA2 >>> 32), (int) (4294967295L & JFJ3QoxA2));
            eg egVar = this.Uxq83abb04;
            if (egVar == null) {
                this.Uxq83abb04 = new eg(WdrkLMV3xh);
                this.Fm8W7vP7q = false;
            } else if (!eg.Yi7zF1RB1(egVar.GWasM1elztuh, WdrkLMV3xh)) {
                this.Fm8W7vP7q = true;
            }
            yc0Var.mE4lRynR(WdrkLMV3xh);
            yc0Var.uFEq9NpZ();
            setMeasuredDimension(getRoot().MZhzXH72.WIEu4Ya2g8.OOA6hdeuvCS, getRoot().MZhzXH72.WIEu4Ya2g8.EljAMC1QTz);
            if (this.MjxSquD6Av != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().MZhzXH72.WIEu4Ya2g8.OOA6hdeuvCS, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().MZhzXH72.WIEu4Ya2g8.EljAMC1QTz, 1073741824));
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!encWxUiV2() || viewStructure == null) {
            return;
        }
        VJUcwvGgb9W vJUcwvGgb9W = this.z19UFEN2I;
        if (vJUcwvGgb9W != null) {
            g60 g60Var = vJUcwvGgb9W.EljAMC1QTz.GWasM1elztuh;
            AutofillId autofillId = vJUcwvGgb9W.JFJ3QoxA;
            String str = vJUcwvGgb9W.mOu10nynGul;
            mt0 mt0Var = vJUcwvGgb9W.encWxUiV2;
            z50.arNh8D4Z5gB(viewStructure, g60Var, autofillId, str, mt0Var);
            Object[] objArr = qk0.GWasM1elztuh;
            ag0 ag0Var = new ag0(2);
            ag0Var.GWasM1elztuh(g60Var);
            ag0Var.GWasM1elztuh(viewStructure);
            while (ag0Var.mOu10nynGul()) {
                Object rQPn8YBR = ag0Var.rQPn8YBR(ag0Var.Yi7zF1RB1 - 1);
                rQPn8YBR.getClass();
                ViewStructure viewStructure2 = (ViewStructure) rQPn8YBR;
                Object rQPn8YBR2 = ag0Var.rQPn8YBR(ag0Var.Yi7zF1RB1 - 1);
                rQPn8YBR2.getClass();
                og0 og0Var = (og0) ((g60) rQPn8YBR2).uFEq9NpZ();
                int i2 = og0Var.OOA6hdeuvCS.AvO7iQsrTN;
                for (int i3 = 0; i3 < i2; i3++) {
                    g60 g60Var2 = (g60) og0Var.get(i3);
                    if (!g60Var2.YXi2hvwn7WL && g60Var2.eUH21U3apd() && g60Var2.A1EKNP6CxJ()) {
                        zz0 WdrkLMV3xh = g60Var2.WdrkLMV3xh();
                        if (WdrkLMV3xh != null) {
                            hg0 hg0Var = WdrkLMV3xh.OOA6hdeuvCS;
                            if (hg0Var.Yi7zF1RB1(yz0.AvO7iQsrTN) || hg0Var.Yi7zF1RB1(yz0.encWxUiV2) || hg0Var.Yi7zF1RB1(h01.Mjvvu5DE) || hg0Var.Yi7zF1RB1(h01.mE4lRynR)) {
                                ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                z50.arNh8D4Z5gB(newChild, g60Var2, vJUcwvGgb9W.JFJ3QoxA, str, mt0Var);
                                ag0Var.GWasM1elztuh(g60Var2);
                                ag0Var.GWasM1elztuh(newChild);
                            }
                        }
                        ag0Var.GWasM1elztuh(g60Var2);
                        ag0Var.GWasM1elztuh(viewStructure2);
                    }
                }
            }
        }
        rx0 rx0Var = this.VeqTn1PQw7;
        if (rx0Var != null) {
            p5 p5Var = (p5) rx0Var.EljAMC1QTz;
            LinkedHashMap linkedHashMap = p5Var.GWasM1elztuh;
            LinkedHashMap linkedHashMap2 = p5Var.GWasM1elztuh;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int intValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    o4.YmKjaVtbfp5Z();
                    return;
                }
                ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                newChild2.setAutofillId((AutofillId) rx0Var.encWxUiV2, intValue);
                newChild2.setId(intValue, ((c) rx0Var.OOA6hdeuvCS).getContext().getPackageName(), null, null);
                newChild2.setAutofillType(1);
                throw null;
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
        if (this.AvO7iQsrTN) {
            int[] iArr = gt.GWasM1elztuh;
            p50 p50Var = p50.OOA6hdeuvCS;
            p50 p50Var2 = i != 0 ? i != 1 ? null : p50.EljAMC1QTz : p50Var;
            if (p50Var2 != null) {
                p50Var = p50Var2;
            }
            setLayoutDirection(p50Var);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        c90 c90Var;
        if (Build.VERSION.SDK_INT < 31 || (c90Var = this.fX9rg6CD) == null) {
            return;
        }
        g01 semanticsOwner = getSemanticsOwner();
        gh coroutineContext = getCoroutineContext();
        rg0 rg0Var = new rg0(new vx0[16]);
        d70.VeqTn1PQw7(semanticsOwner.GWasM1elztuh(), 0, new tx0(1, 8, rg0.class, rg0Var, "add", "add(Ljava/lang/Object;)Z"));
        Arrays.sort(rg0Var.OOA6hdeuvCS, 0, rg0Var.AvO7iQsrTN, new qc(0, new hv[]{ux0.AvO7iQsrTN, ux0.encWxUiV2}));
        int i = rg0Var.AvO7iQsrTN;
        vx0 vx0Var = (vx0) (i == 0 ? null : rg0Var.OOA6hdeuvCS[i - 1]);
        if (vx0Var == null) {
            return;
        }
        y20 y20Var = vx0Var.X1lG3V04pd;
        ie ieVar = new ie(vx0Var.GWasM1elztuh, y20Var, fb1.X1lG3V04pd(coroutineContext), c90Var, this);
        bk0 bk0Var = vx0Var.xqGvceK5x;
        long j = (y20Var.GWasM1elztuh << 32) | (y20Var.Yi7zF1RB1 & 4294967295L);
        ScrollCaptureTarget mOu10nynGul = m.mOu10nynGul(this, l60.pog2g9KITJA(n30.J3Xc8BaqpN8(o50.iwATDS1i01k(bk0Var).eUH21U3apd(bk0Var, true))), new Point((int) (j >> 32), (int) (j & 4294967295L)), ieVar);
        mOu10nynGul.setScrollBounds(l60.pog2g9KITJA(y20Var));
        consumer.accept(mOu10nynGul);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        MZhzXH72();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        this.UjhVk5crk.GWasM1elztuh.setValue(new b20(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        w wVar = this.ozMwhSAI;
        wVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (o30.rQPn8YBR(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            o30.Y6hRI1cF8(wVar, longSparseArray);
        } else {
            wVar.OOA6hdeuvCS.post(new t(0, wVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean EXrPz3p7hFb;
        this.OGdJP42E = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (EXrPz3p7hFb = ki1.EXrPz3p7hFb())) {
            return;
        }
        setShowLayoutBounds(EXrPz3p7hFb);
        uFEq9NpZ(getRoot());
    }

    public final void ozMwhSAI(g60 g60Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (g60Var != null) {
            while (g60Var != null && g60Var.Mjvvu5DE() == e60.OOA6hdeuvCS) {
                if (!this.Fm8W7vP7q) {
                    g60 cilMamHF = g60Var.cilMamHF();
                    if (cilMamHF == null) {
                        break;
                    }
                    long j = cilMamHF.A1EKNP6CxJ.X1lG3V04pd.encWxUiV2;
                    if (eg.EljAMC1QTz(j) && eg.OOA6hdeuvCS(j)) {
                        break;
                    }
                }
                g60Var = g60Var.cilMamHF();
            }
            if (g60Var == getRoot()) {
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

    public final void pog2g9KITJA() {
        i iVar = this.EXrPz3p7hFb;
        iVar.M3K9sHhK = true;
        Handler handler = iVar.encWxUiV2.getHandler();
        if (iVar.uFEq9NpZ() && !iVar.rezfBrjOrqK && handler != null) {
            iVar.rezfBrjOrqK = true;
            handler.post(iVar.dqB83aoLBB);
        }
        w wVar = this.ozMwhSAI;
        wVar.rQPn8YBR = true;
        Handler handler2 = wVar.OOA6hdeuvCS.getHandler();
        if (!wVar.encWxUiV2() || wVar.YmKjaVtbfp5Z || handler2 == null) {
            return;
        }
        wVar.YmKjaVtbfp5Z = true;
        handler2.post(wVar.Mjvvu5DE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2 = 1;
        if (!isFocused()) {
            dt Yi7zF1RB1 = gt.Yi7zF1RB1(i);
            int i3 = Yi7zF1RB1 != null ? Yi7zF1RB1.GWasM1elztuh : 7;
            Boolean OOA6hdeuvCS = ((nt) getFocusOwner()).OOA6hdeuvCS(i3, rect != null ? new kt0(rect.left, rect.top, rect.right, rect.bottom) : null, new LkTGMga05DQy(i3, 0));
            Boolean bool = Boolean.TRUE;
            if (!o30.rQPn8YBR(OOA6hdeuvCS, bool)) {
                if (!o30.rQPn8YBR(((nt) getFocusOwner()).OOA6hdeuvCS(i3, null, new LkTGMga05DQy(i3, i2)), bool)) {
                    if (hasFocus() && (i3 == 1 || i3 == 2)) {
                        return ((nt) getFocusOwner()).AvO7iQsrTN(i3);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.EXrPz3p7hFb.E7jCp8Ls = j;
    }

    public final void setComposeViewContext(se seVar) {
        if (getCoroutineContext() != seVar.Yi7zF1RB1.JFJ3QoxA() && !((og0) getRoot().uFEq9NpZ()).isEmpty()) {
            t10.GWasM1elztuh("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        y31 Mjvvu5DE = d70.Mjvvu5DE();
        hv OOA6hdeuvCS = Mjvvu5DE != null ? Mjvvu5DE.OOA6hdeuvCS() : null;
        y31 M3K9sHhK = d70.M3K9sHhK(Mjvvu5DE);
        try {
            se seVar2 = get_composeViewContext();
            if (seVar != seVar2) {
                if (isAttachedToWindow()) {
                    seVar2.Yi7zF1RB1();
                    seVar.X1lG3V04pd();
                }
                set_composeViewContext(seVar);
                setCoroutineContext(seVar.Yi7zF1RB1.JFJ3QoxA());
            }
        } finally {
            d70.A1EKNP6CxJ(Mjvvu5DE, M3K9sHhK, OOA6hdeuvCS);
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.bfDgRvRIg = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.TpUsjqg3bxO.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(w wVar) {
        this.ozMwhSAI = wVar;
    }

    public void setCoroutineContext(gh ghVar) {
        this.Mjvvu5DE = ghVar;
    }

    public final void setFrameEndScheduler$ui(y90 y90Var) {
        this.JFJ3QoxA = y90Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.NyNgffpi = j;
    }

    public final void setOnReadyForComposition(hv hvVar) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.bfDgRvRIg) {
            hvVar.mOu10nynGul(getComposeViewContext());
        } else {
            this.K0ReC6MK = hvVar;
        }
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m4setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(x00 x00Var) {
        this.encWxUiV2 = x00Var;
    }

    public void setShowLayoutBounds(boolean z) {
        this.MItybXapHX = z;
    }

    public void setUncaughtExceptionHandler(pv0 pv0Var) {
        this.c4eaifQP.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.jt
    public final void xqGvceK5x(rt rtVar, rt rtVar2) {
        xj0 xj0Var;
        boolean z;
        xj0 xj0Var2;
        boolean z2;
        if (rtVar != null) {
            rt rtVar3 = rtVar;
            if (!rtVar3.OOA6hdeuvCS.Mjvvu5DE) {
                t10.Yi7zF1RB1("visitAncestors called on an unattached node");
            }
            he0 he0Var = rtVar3.OOA6hdeuvCS;
            g60 eUH21U3apd = vc0.eUH21U3apd(rtVar);
            ig0 ig0Var = null;
            ArrayList arrayList = null;
            while (eUH21U3apd != null) {
                if ((eUH21U3apd.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 2097152) != 0) {
                    while (he0Var != null) {
                        if ((he0Var.AvO7iQsrTN & 2097152) != 0) {
                            he0 he0Var2 = he0Var;
                            rg0 rg0Var = null;
                            while (he0Var2 != null) {
                                if (he0Var2 instanceof g10) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(he0Var2);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (he0Var2.AvO7iQsrTN & 2097152) != 0 && (he0Var2 instanceof yk)) {
                                    int i = 0;
                                    for (he0 he0Var3 = ((yk) he0Var2).jivtDDk9H; he0Var3 != null; he0Var3 = he0Var3.JFJ3QoxA) {
                                        if ((he0Var3.AvO7iQsrTN & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                he0Var2 = he0Var3;
                                            } else {
                                                if (rg0Var == null) {
                                                    rg0Var = new rg0(new he0[16]);
                                                }
                                                if (he0Var2 != null) {
                                                    rg0Var.Yi7zF1RB1(he0Var2);
                                                    he0Var2 = null;
                                                }
                                                rg0Var.Yi7zF1RB1(he0Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                he0Var2 = vc0.E7jCp8Ls(rg0Var);
                            }
                        }
                        he0Var = he0Var.mOu10nynGul;
                    }
                }
                eUH21U3apd = eUH21U3apd.cilMamHF();
                he0Var = (eUH21U3apd == null || (xj0Var2 = eUH21U3apd.A1EKNP6CxJ) == null) ? null : xj0Var2.OOA6hdeuvCS;
            }
            if (arrayList == null) {
                return;
            }
            if (rtVar2 != null) {
                if (!rtVar2.OOA6hdeuvCS.Mjvvu5DE) {
                    t10.Yi7zF1RB1("visitAncestors called on an unattached node");
                }
                he0 he0Var4 = rtVar2.OOA6hdeuvCS;
                g60 eUH21U3apd2 = vc0.eUH21U3apd(rtVar2);
                ig0 ig0Var2 = null;
                while (eUH21U3apd2 != null) {
                    if ((eUH21U3apd2.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 2097152) != 0) {
                        while (he0Var4 != null) {
                            if ((he0Var4.AvO7iQsrTN & 2097152) != 0) {
                                he0 he0Var5 = he0Var4;
                                rg0 rg0Var2 = null;
                                while (he0Var5 != null) {
                                    if (he0Var5 instanceof g10) {
                                        if (ig0Var2 == null) {
                                            ig0 ig0Var3 = lx0.GWasM1elztuh;
                                            ig0Var2 = new ig0();
                                        }
                                        ig0Var2.GWasM1elztuh(he0Var5);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (he0Var5.AvO7iQsrTN & 2097152) != 0 && (he0Var5 instanceof yk)) {
                                        int i2 = 0;
                                        for (he0 he0Var6 = ((yk) he0Var5).jivtDDk9H; he0Var6 != null; he0Var6 = he0Var6.JFJ3QoxA) {
                                            if ((he0Var6.AvO7iQsrTN & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    he0Var5 = he0Var6;
                                                } else {
                                                    if (rg0Var2 == null) {
                                                        rg0Var2 = new rg0(new he0[16]);
                                                    }
                                                    if (he0Var5 != null) {
                                                        rg0Var2.Yi7zF1RB1(he0Var5);
                                                        he0Var5 = null;
                                                    }
                                                    rg0Var2.Yi7zF1RB1(he0Var6);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    he0Var5 = vc0.E7jCp8Ls(rg0Var2);
                                }
                            }
                            he0Var4 = he0Var4.mOu10nynGul;
                        }
                    }
                    eUH21U3apd2 = eUH21U3apd2.cilMamHF();
                    he0Var4 = (eUH21U3apd2 == null || (xj0Var = eUH21U3apd2.A1EKNP6CxJ) == null) ? null : xj0Var.OOA6hdeuvCS;
                }
                ig0Var = ig0Var2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                g10 g10Var = (g10) arrayList.get(i3);
                if (!(ig0Var != null ? ig0Var.X1lG3V04pd(g10Var) : false)) {
                    g10Var.lv06NcmrQ();
                }
            }
        }
    }

    public o6lobyFa getAccessibilityManager() {
        return this.AEn1Rrio;
    }

    /* renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public HkgleTzzRy m6getClipboard() {
        return this.qugwajBSa59j;
    }

    public gY3jNtCS0 getClipboardManager() {
        return this.CMh55RymNfS;
    }

    public i0 getDragAndDropManager() {
        return this.mE4lRynR;
    }

    /* renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public rf0 m9getLayoutNodes() {
        return this.pog2g9KITJA;
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

    @jl
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m2getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @jl
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public qv0 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(pv0 pv0Var) {
    }
}
