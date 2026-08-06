package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class cg1 extends jg1 {
    public static Field AvO7iQsrTN = null;
    public static boolean JFJ3QoxA = false;
    public static boolean encWxUiV2 = false;
    public static Constructor mOu10nynGul;
    public e20 EljAMC1QTz;
    public WindowInsets OOA6hdeuvCS;

    public cg1() {
        this.OOA6hdeuvCS = JFJ3QoxA();
    }

    private static WindowInsets JFJ3QoxA() {
        if (!encWxUiV2) {
            try {
                AvO7iQsrTN = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            encWxUiV2 = true;
        }
        Field field = AvO7iQsrTN;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!JFJ3QoxA) {
            try {
                mOu10nynGul = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            JFJ3QoxA = true;
        }
        Constructor constructor = mOu10nynGul;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // defpackage.jg1
    public void EljAMC1QTz(e20 e20Var) {
        this.EljAMC1QTz = e20Var;
    }

    @Override // defpackage.jg1
    public wg1 Yi7zF1RB1() {
        GWasM1elztuh();
        wg1 X1lG3V04pd = wg1.X1lG3V04pd(this.OOA6hdeuvCS, null);
        e20[] e20VarArr = this.Yi7zF1RB1;
        sg1 sg1Var = X1lG3V04pd.GWasM1elztuh;
        sg1Var.cilMamHF(e20VarArr);
        sg1Var.WdrkLMV3xh(this.EljAMC1QTz);
        sg1Var.Y6hRI1cF8(null);
        sg1Var.arNh8D4Z5gB(this.X1lG3V04pd);
        sg1Var.pog2g9KITJA(this.xqGvceK5x);
        return X1lG3V04pd;
    }

    @Override // defpackage.jg1
    public void encWxUiV2(e20 e20Var) {
        WindowInsets windowInsets = this.OOA6hdeuvCS;
        if (windowInsets != null) {
            this.OOA6hdeuvCS = windowInsets.replaceSystemWindowInsets(e20Var.GWasM1elztuh, e20Var.Yi7zF1RB1, e20Var.X1lG3V04pd, e20Var.xqGvceK5x);
        }
    }

    public cg1(wg1 wg1Var) {
        super(wg1Var);
        this.OOA6hdeuvCS = wg1Var.Yi7zF1RB1();
    }
}
