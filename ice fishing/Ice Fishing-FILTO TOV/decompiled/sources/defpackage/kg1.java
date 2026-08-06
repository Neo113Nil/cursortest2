package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class kg1 extends sg1 {
    public static Field WIEu4Ya2g8 = null;
    public static boolean XnEVoBF0td1l = false;
    public static Field YmKjaVtbfp5Z;
    public static Class iwATDS1i01k;
    public static Method uFEq9NpZ;
    public e20 AvO7iQsrTN;
    public Rect[][] E7jCp8Ls;
    public wg1 EljAMC1QTz;
    public int JFJ3QoxA;
    public e20 OOA6hdeuvCS;
    public final WindowInsets X1lG3V04pd;
    public int encWxUiV2;
    public int mOu10nynGul;
    public Rect[][] rQPn8YBR;
    public e20[] xqGvceK5x;

    public kg1(wg1 wg1Var, WindowInsets windowInsets) {
        super(wg1Var);
        this.OOA6hdeuvCS = null;
        this.rQPn8YBR = new Rect[10][];
        this.E7jCp8Ls = new Rect[10][];
        this.X1lG3V04pd = windowInsets;
    }

    private Rect[] EXrPz3p7hFb(e20 e20Var) {
        ArrayList arrayList = new ArrayList();
        int i = e20Var.GWasM1elztuh;
        int i2 = e20Var.xqGvceK5x;
        int i3 = e20Var.X1lG3V04pd;
        int i4 = e20Var.Yi7zF1RB1;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, e20Var.GWasM1elztuh, this.mOu10nynGul));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.JFJ3QoxA, i4));
        }
        if (i3 != 0) {
            int i5 = this.JFJ3QoxA;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.mOu10nynGul));
        }
        if (i2 != 0) {
            int i6 = this.mOu10nynGul;
            arrayList.add(new Rect(0, i6 - i2, this.JFJ3QoxA, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    public static boolean HFYAaqMd6(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    private qm M3K9sHhK(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.GWasM1elztuh.GWasM1elztuh.mE4lRynR()) {
            return qm.GWasM1elztuh(point.x, point.y, true, 0, 0, 0, 0);
        }
        tv0 k8h8IjolWQ = qj.k8h8IjolWQ(display, 0);
        tv0 k8h8IjolWQ2 = qj.k8h8IjolWQ(display, 1);
        tv0 k8h8IjolWQ3 = qj.k8h8IjolWQ(display, 2);
        tv0 k8h8IjolWQ4 = qj.k8h8IjolWQ(display, 3);
        return qm.GWasM1elztuh(point.x, point.y, false, k8h8IjolWQ != null ? k8h8IjolWQ.Yi7zF1RB1 : 0, k8h8IjolWQ2 != null ? k8h8IjolWQ2.Yi7zF1RB1 : 0, k8h8IjolWQ3 != null ? k8h8IjolWQ3.Yi7zF1RB1 : 0, k8h8IjolWQ4 != null ? k8h8IjolWQ4.Yi7zF1RB1 : 0);
    }

    private static void MZhzXH72() {
        try {
            uFEq9NpZ = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            iwATDS1i01k = cls;
            WIEu4Ya2g8 = cls.getDeclaredField("mVisibleInsets");
            YmKjaVtbfp5Z = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            WIEu4Ya2g8.setAccessible(true);
            YmKjaVtbfp5Z.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        XnEVoBF0td1l = true;
    }

    private e20 YZjbz8VdP5() {
        wg1 wg1Var = this.EljAMC1QTz;
        return wg1Var != null ? wg1Var.GWasM1elztuh.rQPn8YBR() : e20.OOA6hdeuvCS;
    }

    private e20 eUH21U3apd(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!XnEVoBF0td1l) {
            MZhzXH72();
        }
        Method method = uFEq9NpZ;
        if (method != null && iwATDS1i01k != null && WIEu4Ya2g8 != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) WIEu4Ya2g8.get(YmKjaVtbfp5Z.get(invoke));
                if (rect != null) {
                    return e20.Yi7zF1RB1(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static List<Rect> k8h8IjolWQ(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[w60.WIEu4Ya2g8(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private e20 ozMwhSAI(int i, boolean z) {
        e20 e20Var = e20.OOA6hdeuvCS;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                e20Var = e20.GWasM1elztuh(e20Var, AEn1Rrio(i2, z));
            }
        }
        return e20Var;
    }

    public boolean A1EKNP6CxJ(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !AEn1Rrio(i, false).equals(e20.OOA6hdeuvCS);
    }

    public e20 AEn1Rrio(int i, boolean z) {
        e20 rQPn8YBR;
        int i2;
        e20 e20Var = e20.OOA6hdeuvCS;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    e20[] e20VarArr = this.xqGvceK5x;
                    rQPn8YBR = e20VarArr != null ? e20VarArr[w60.WIEu4Ya2g8(8)] : null;
                    if (rQPn8YBR != null) {
                        return rQPn8YBR;
                    }
                    e20 XnEVoBF0td1l2 = XnEVoBF0td1l();
                    e20 YZjbz8VdP5 = YZjbz8VdP5();
                    int i3 = XnEVoBF0td1l2.xqGvceK5x;
                    if (i3 > YZjbz8VdP5.xqGvceK5x) {
                        return e20.Yi7zF1RB1(0, 0, 0, i3);
                    }
                    e20 e20Var2 = this.AvO7iQsrTN;
                    if (e20Var2 != null && !e20Var2.equals(e20Var) && (i2 = this.AvO7iQsrTN.xqGvceK5x) > YZjbz8VdP5.xqGvceK5x) {
                        return e20.Yi7zF1RB1(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return E7jCp8Ls();
                    }
                    if (i == 32) {
                        return JFJ3QoxA();
                    }
                    if (i == 64) {
                        return uFEq9NpZ();
                    }
                    if (i == 128) {
                        wg1 wg1Var = this.EljAMC1QTz;
                        om AvO7iQsrTN = wg1Var != null ? wg1Var.GWasM1elztuh.AvO7iQsrTN() : AvO7iQsrTN();
                        if (AvO7iQsrTN != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return e20.Yi7zF1RB1(i4 >= 28 ? nm.OOA6hdeuvCS(AvO7iQsrTN.GWasM1elztuh) : 0, i4 >= 28 ? nm.AvO7iQsrTN(AvO7iQsrTN.GWasM1elztuh) : 0, i4 >= 28 ? nm.EljAMC1QTz(AvO7iQsrTN.GWasM1elztuh) : 0, i4 >= 28 ? nm.xqGvceK5x(AvO7iQsrTN.GWasM1elztuh) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    e20 YZjbz8VdP52 = YZjbz8VdP5();
                    e20 rQPn8YBR2 = rQPn8YBR();
                    return e20.Yi7zF1RB1(Math.max(YZjbz8VdP52.GWasM1elztuh, rQPn8YBR2.GWasM1elztuh), 0, Math.max(YZjbz8VdP52.X1lG3V04pd, rQPn8YBR2.X1lG3V04pd), Math.max(YZjbz8VdP52.xqGvceK5x, rQPn8YBR2.xqGvceK5x));
                }
                if ((this.encWxUiV2 & 2) == 0) {
                    e20 XnEVoBF0td1l3 = XnEVoBF0td1l();
                    wg1 wg1Var2 = this.EljAMC1QTz;
                    rQPn8YBR = wg1Var2 != null ? wg1Var2.GWasM1elztuh.rQPn8YBR() : null;
                    int i5 = XnEVoBF0td1l3.xqGvceK5x;
                    if (rQPn8YBR != null) {
                        i5 = Math.min(i5, rQPn8YBR.xqGvceK5x);
                    }
                    return e20.Yi7zF1RB1(XnEVoBF0td1l3.GWasM1elztuh, 0, XnEVoBF0td1l3.X1lG3V04pd, i5);
                }
            }
        } else {
            if (z) {
                return e20.Yi7zF1RB1(0, Math.max(YZjbz8VdP5().Yi7zF1RB1, XnEVoBF0td1l().Yi7zF1RB1), 0, 0);
            }
            if ((this.encWxUiV2 & 4) == 0) {
                return e20.Yi7zF1RB1(0, XnEVoBF0td1l().Yi7zF1RB1, 0, 0);
            }
        }
        return e20Var;
    }

    public void DmJncFq5(e20 e20Var) {
        this.AvO7iQsrTN = e20Var;
    }

    @Override // defpackage.sg1
    public List<Rect> EljAMC1QTz(int i) {
        return k8h8IjolWQ(this.E7jCp8Ls, i);
    }

    @Override // defpackage.sg1
    public List<Rect> OOA6hdeuvCS(int i) {
        return k8h8IjolWQ(this.rQPn8YBR, i);
    }

    @Override // defpackage.sg1
    public void WIEu4Ya2g8() {
        for (int i = 1; i <= 512; i <<= 1) {
            int WIEu4Ya2g82 = w60.WIEu4Ya2g8(i);
            this.rQPn8YBR[WIEu4Ya2g82] = EXrPz3p7hFb(encWxUiV2(i));
            if (i != 8) {
                this.E7jCp8Ls[WIEu4Ya2g82] = EXrPz3p7hFb(mOu10nynGul(i));
            }
        }
    }

    @Override // defpackage.sg1
    public void WRKkgoJXwDn(int i) {
        this.encWxUiV2 = i;
    }

    @Override // defpackage.sg1
    public final e20 XnEVoBF0td1l() {
        if (this.OOA6hdeuvCS == null) {
            WindowInsets windowInsets = this.X1lG3V04pd;
            this.OOA6hdeuvCS = e20.Yi7zF1RB1(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.OOA6hdeuvCS;
    }

    @Override // defpackage.sg1
    public wg1 YmKjaVtbfp5Z(int i, int i2, int i3, int i4) {
        wg1 X1lG3V04pd = wg1.X1lG3V04pd(this.X1lG3V04pd, null);
        int i5 = Build.VERSION.SDK_INT;
        jg1 ig1Var = i5 >= 36 ? new ig1(X1lG3V04pd) : i5 >= 35 ? new hg1(X1lG3V04pd) : i5 >= 34 ? new gg1(X1lG3V04pd) : i5 >= 31 ? new fg1(X1lG3V04pd) : i5 >= 30 ? new eg1(X1lG3V04pd) : i5 >= 29 ? new dg1(X1lG3V04pd) : new cg1(X1lG3V04pd);
        ig1Var.encWxUiV2(wg1.GWasM1elztuh(XnEVoBF0td1l(), i, i2, i3, i4));
        ig1Var.EljAMC1QTz(wg1.GWasM1elztuh(rQPn8YBR(), i, i2, i3, i4));
        return ig1Var.Yi7zF1RB1();
    }

    @Override // defpackage.sg1
    public void arNh8D4Z5gB(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.rQPn8YBR = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.sg1
    public void cilMamHF(e20[] e20VarArr) {
        this.xqGvceK5x = e20VarArr;
    }

    @Override // defpackage.sg1
    public e20 encWxUiV2(int i) {
        return ozMwhSAI(i, false);
    }

    @Override // defpackage.sg1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        kg1 kg1Var = (kg1) obj;
        return Objects.equals(this.AvO7iQsrTN, kg1Var.AvO7iQsrTN) && HFYAaqMd6(this.encWxUiV2, kg1Var.encWxUiV2);
    }

    @Override // defpackage.sg1
    public void iwATDS1i01k(View view) {
        M3K9sHhK(view);
    }

    @Override // defpackage.sg1
    public boolean jivtDDk9H(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !A1EKNP6CxJ(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.sg1
    public void lv06NcmrQ(wg1 wg1Var) {
        this.EljAMC1QTz = wg1Var;
    }

    @Override // defpackage.sg1
    public boolean mE4lRynR() {
        return this.X1lG3V04pd.isRound();
    }

    @Override // defpackage.sg1
    public e20 mOu10nynGul(int i) {
        return ozMwhSAI(i, true);
    }

    @Override // defpackage.sg1
    public void pog2g9KITJA(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.E7jCp8Ls = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.sg1
    public void xqGvceK5x(View view) {
        this.JFJ3QoxA = view.getWidth();
        this.mOu10nynGul = view.getHeight();
        e20 eUH21U3apd = eUH21U3apd(view);
        if (eUH21U3apd == null) {
            eUH21U3apd = e20.OOA6hdeuvCS;
        }
        DmJncFq5(eUH21U3apd);
    }

    @Override // defpackage.sg1
    public void Y6hRI1cF8(qm qmVar) {
    }
}
