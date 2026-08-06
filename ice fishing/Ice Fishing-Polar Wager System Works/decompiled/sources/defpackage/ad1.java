package defpackage;

/* loaded from: classes.dex */
public class ad1 implements defpackage.cb1, defpackage.if1, defpackage.kj, defpackage.fp1, defpackage.rv0, defpackage.my, defpackage.eg1, defpackage.h6, defpackage.j6, defpackage.jb1 {
    public final /* synthetic */ int adDC3e2L;
    public static final defpackage.ad1 xiZrDbcSW0 = new defpackage.ad1(0);
    public static final defpackage.ad1 AARZUJiTa = new defpackage.ad1(1);
    public static final defpackage.ad1 EXtogiMhuM = new defpackage.ad1(2);
    public static final defpackage.ad1 riuEU0zW4 = new defpackage.ad1(3);
    public static final defpackage.ad1 SH1y5HwkJhh = new defpackage.ad1(4);
    public static final defpackage.ad1 ez2rX8ReCYw = new defpackage.ad1(5);
    public static final defpackage.gp1 JlrlGoKF = new defpackage.gp1();

    public ad1() {
        this.adDC3e2L = 16;
        new defpackage.gg0(16);
        long[] jArr = defpackage.z41.IHQe1A4L2xu;
        new defpackage.nl0();
    }

    @Override // defpackage.h6
    public void AARZUJiTa(defpackage.ki0 ki0Var, int i, int[] iArr, defpackage.w90 w90Var, int[] iArr2) {
        int i2 = this.adDC3e2L;
        defpackage.w90 w90Var2 = defpackage.w90.adDC3e2L;
        switch (i2) {
            case 14:
                if (w90Var != w90Var2) {
                    defpackage.mj1.mAr5m2L7gYDP(i, iArr, iArr2, true);
                    break;
                } else {
                    defpackage.mj1.mAr5m2L7gYDP(i, iArr, iArr2, false);
                    break;
                }
            default:
                if (w90Var != w90Var2) {
                    defpackage.mj1.hyxIchWRW(i, iArr, iArr2, true);
                    break;
                } else {
                    defpackage.mj1.hyxIchWRW(i, iArr, iArr2, false);
                    break;
                }
        }
    }

    @Override // defpackage.j6
    public void EXtogiMhuM(int i, defpackage.ki0 ki0Var, int[] iArr, int[] iArr2) {
        switch (this.adDC3e2L) {
            case 14:
                defpackage.mj1.mAr5m2L7gYDP(i, iArr, iArr2, false);
                break;
            default:
                defpackage.mj1.hyxIchWRW(i, iArr, iArr2, false);
                break;
        }
    }

    @Override // defpackage.cb1
    public boolean F7NU4MC0GW(java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.x70.QoRHpC4k(obj, obj2);
    }

    @Override // defpackage.h6, defpackage.j6
    public float IHQe1A4L2xu() {
        switch (this.adDC3e2L) {
        }
        return 0.0f;
    }

    @Override // defpackage.fp1
    public defpackage.bp1 adDC3e2L(android.content.ContextWrapper contextWrapper, defpackage.rn rnVar) {
        rnVar.getClass();
        android.content.Context context = contextWrapper;
        while (true) {
            if (!(context instanceof android.content.ContextWrapper)) {
                context = contextWrapper;
                break;
            }
            if ((context instanceof android.app.Activity) || (context instanceof android.inputmethodservice.InputMethodService)) {
                break;
            }
            android.content.ContextWrapper contextWrapper2 = (android.content.ContextWrapper) context;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            context = contextWrapper2.getBaseContext();
            context.getClass();
        }
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            defpackage.v8.IHQe1A4L2xu.getClass();
            int i = android.os.Build.VERSION.SDK_INT;
            return new defpackage.bp1(new defpackage.t8((i >= 30 ? defpackage.w8.adDC3e2L : i >= 29 ? defpackage.n.V7bD7b8KA : i >= 28 ? defpackage.n.kNAkVymC : defpackage.n.fnWB2E7cs).xiZrDbcSW0(activity)), rnVar.AARZUJiTa(activity));
        }
        if (!(context instanceof android.inputmethodservice.InputMethodService) && !(context instanceof android.app.Application)) {
            defpackage.db.fnWB2E7cs("Must provide a UiContext or Application Context");
            return null;
        }
        java.lang.Object systemService = contextWrapper.getSystemService("window");
        systemService.getClass();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getRealSize(point);
        return new defpackage.bp1(new android.graphics.Rect(0, 0, point.x, point.y), rnVar.AARZUJiTa(contextWrapper));
    }

    @Override // defpackage.if1
    public float oh6vYeIP() {
        return Float.NaN;
    }

    @Override // defpackage.if1
    public long r1MBDhnF() {
        int i = defpackage.ae.AARZUJiTa;
        return defpackage.ae.xiZrDbcSW0;
    }

    public android.content.pm.Signature[] riuEU0zW4(android.content.pm.PackageManager packageManager, java.lang.String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public java.lang.String toString() {
        switch (this.adDC3e2L) {
            case 0:
                return "StructuralEqualityPolicy";
            case 14:
                return "Arrangement#Center";
            case 15:
                return "Arrangement#SpaceBetween";
            case 20:
                return "Empty";
            case 21:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.if1
    public defpackage.h1 xiZrDbcSW0() {
        return null;
    }

    public /* synthetic */ ad1(int i) {
        this.adDC3e2L = i;
    }

    public ad1(defpackage.v0 v0Var) {
        this.adDC3e2L = 8;
        defpackage.qv0.IHQe1A4L2xu.getClass();
    }
}
