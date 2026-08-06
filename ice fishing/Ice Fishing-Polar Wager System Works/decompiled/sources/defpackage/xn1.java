package defpackage;

/* loaded from: classes.dex */
public final class xn1 extends defpackage.eo1 {
    public static java.lang.reflect.Field AARZUJiTa = null;
    public static boolean EXtogiMhuM = false;
    public static boolean SH1y5HwkJhh = false;
    public static java.lang.reflect.Constructor riuEU0zW4;
    public android.view.WindowInsets adDC3e2L;
    public defpackage.i60 xiZrDbcSW0;

    public xn1() {
        this.adDC3e2L = SH1y5HwkJhh();
    }

    private static android.view.WindowInsets SH1y5HwkJhh() {
        if (!EXtogiMhuM) {
            try {
                AARZUJiTa = android.view.WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (java.lang.ReflectiveOperationException e) {
                android.util.Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            EXtogiMhuM = true;
        }
        java.lang.reflect.Field field = AARZUJiTa;
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
        if (!SH1y5HwkJhh) {
            try {
                riuEU0zW4 = android.view.WindowInsets.class.getConstructor(android.graphics.Rect.class);
            } catch (java.lang.ReflectiveOperationException e3) {
                android.util.Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            SH1y5HwkJhh = true;
        }
        java.lang.reflect.Constructor constructor = riuEU0zW4;
        if (constructor != null) {
            try {
                return (android.view.WindowInsets) constructor.newInstance(new android.graphics.Rect());
            } catch (java.lang.ReflectiveOperationException e4) {
                android.util.Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // defpackage.eo1
    public void EXtogiMhuM(defpackage.i60 i60Var) {
        android.view.WindowInsets windowInsets = this.adDC3e2L;
        if (windowInsets != null) {
            this.adDC3e2L = windowInsets.replaceSystemWindowInsets(i60Var.IHQe1A4L2xu, i60Var.oh6vYeIP, i60Var.r1MBDhnF, i60Var.F7NU4MC0GW);
        }
    }

    @Override // defpackage.eo1
    public defpackage.ro1 oh6vYeIP() {
        IHQe1A4L2xu();
        defpackage.ro1 r1MBDhnF = defpackage.ro1.r1MBDhnF(this.adDC3e2L, null);
        defpackage.i60[] i60VarArr = this.oh6vYeIP;
        defpackage.no1 no1Var = r1MBDhnF.IHQe1A4L2xu;
        no1Var.V7bD7b8KA(i60VarArr);
        no1Var.abhbClRa(this.xiZrDbcSW0);
        no1Var.kNAkVymC(null);
        no1Var.QQUzIjv3iOC5(this.r1MBDhnF);
        no1Var.C0U8sNJm(this.F7NU4MC0GW);
        return r1MBDhnF;
    }

    @Override // defpackage.eo1
    public void xiZrDbcSW0(defpackage.i60 i60Var) {
        this.xiZrDbcSW0 = i60Var;
    }

    public xn1(defpackage.ro1 ro1Var) {
        super(ro1Var);
        this.adDC3e2L = ro1Var.oh6vYeIP();
    }
}
