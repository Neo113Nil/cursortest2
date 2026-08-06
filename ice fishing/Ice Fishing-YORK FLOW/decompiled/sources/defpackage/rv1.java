package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class rv1 extends defpackage.zv1 {
    public static boolean GE9mJIPrb8gP = false;
    public static boolean P05cfTpS5W5L = false;
    public static java.lang.reflect.Field QiMR8OkAhezm;
    public static java.lang.reflect.Constructor e6mdH7fiFuta;
    public android.view.WindowInsets WDYagTQQm9ns;
    public defpackage.v80 oh71FJcDz6S2;

    public rv1() {
        this.WDYagTQQm9ns = GE9mJIPrb8gP();
    }

    private static android.view.WindowInsets GE9mJIPrb8gP() {
        if (!P05cfTpS5W5L) {
            try {
                QiMR8OkAhezm = android.view.WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (java.lang.ReflectiveOperationException e) {
                android.util.Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            P05cfTpS5W5L = true;
        }
        java.lang.reflect.Field field = QiMR8OkAhezm;
        if (field != null) {
            try {
                android.view.WindowInsets windowInsets = (android.view.WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new android.view.WindowInsets(windowInsets);
                }
            } catch (java.lang.ReflectiveOperationException e2) {
                android.util.Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!GE9mJIPrb8gP) {
            try {
                e6mdH7fiFuta = android.view.WindowInsets.class.getConstructor(android.graphics.Rect.class);
            } catch (java.lang.ReflectiveOperationException e3) {
                android.util.Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            GE9mJIPrb8gP = true;
        }
        java.lang.reflect.Constructor constructor = e6mdH7fiFuta;
        if (constructor != null) {
            try {
                return (android.view.WindowInsets) constructor.newInstance(new android.graphics.Rect());
            } catch (java.lang.ReflectiveOperationException e4) {
                android.util.Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // defpackage.zv1
    public void P05cfTpS5W5L(defpackage.v80 v80Var) {
        android.view.WindowInsets windowInsets = this.WDYagTQQm9ns;
        if (windowInsets != null) {
            this.WDYagTQQm9ns = windowInsets.replaceSystemWindowInsets(v80Var.ZpBGe2uQfcn8, v80Var.giKS3J6vZuNy, v80Var.fWTAfUmVKrZq, v80Var.JhCgjQRTAOCT);
        }
    }

    @Override // defpackage.zv1
    public defpackage.mw1 giKS3J6vZuNy() {
        ZpBGe2uQfcn8();
        defpackage.mw1 fWTAfUmVKrZq = defpackage.mw1.fWTAfUmVKrZq(this.WDYagTQQm9ns, null);
        defpackage.v80[] v80VarArr = this.giKS3J6vZuNy;
        defpackage.jw1 jw1Var = fWTAfUmVKrZq.ZpBGe2uQfcn8;
        jw1Var.maCixPsq4ml2(v80VarArr);
        jw1Var.VFeft99leXEK(this.oh71FJcDz6S2);
        jw1Var.w7APNrr0aGRc(null);
        jw1Var.dG7RjM6DqYVL(this.fWTAfUmVKrZq);
        jw1Var.OcTWLQzke1i2(this.JhCgjQRTAOCT);
        return fWTAfUmVKrZq;
    }

    @Override // defpackage.zv1
    public void oh71FJcDz6S2(defpackage.v80 v80Var) {
        this.oh71FJcDz6S2 = v80Var;
    }

    public rv1(defpackage.mw1 mw1Var) {
        super(mw1Var);
        this.WDYagTQQm9ns = mw1Var.giKS3J6vZuNy();
    }
}
