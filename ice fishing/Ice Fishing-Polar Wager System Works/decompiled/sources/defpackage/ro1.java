package defpackage;

/* loaded from: classes.dex */
public final class ro1 {
    public static final defpackage.ro1 oh6vYeIP;
    public final defpackage.no1 IHQe1A4L2xu;

    static {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 34) {
            oh6vYeIP = defpackage.lo1.PAEGRtP0bX;
        } else if (i >= 30) {
            oh6vYeIP = defpackage.jo1.V7bD7b8KA;
        } else {
            oh6vYeIP = defpackage.no1.oh6vYeIP;
        }
    }

    public ro1(android.view.WindowInsets windowInsets) {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.IHQe1A4L2xu = new defpackage.mo1(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.IHQe1A4L2xu = new defpackage.lo1(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.IHQe1A4L2xu = new defpackage.ko1(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.IHQe1A4L2xu = new defpackage.jo1(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.IHQe1A4L2xu = new defpackage.io1(this, windowInsets);
        } else if (i >= 28) {
            this.IHQe1A4L2xu = new defpackage.ho1(this, windowInsets);
        } else {
            this.IHQe1A4L2xu = new defpackage.go1(this, windowInsets);
        }
    }

    public static defpackage.i60 IHQe1A4L2xu(defpackage.i60 i60Var, int i, int i2, int i3, int i4) {
        int max = java.lang.Math.max(0, i60Var.IHQe1A4L2xu - i);
        int max2 = java.lang.Math.max(0, i60Var.oh6vYeIP - i2);
        int max3 = java.lang.Math.max(0, i60Var.r1MBDhnF - i3);
        int max4 = java.lang.Math.max(0, i60Var.F7NU4MC0GW - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? i60Var : defpackage.i60.oh6vYeIP(max, max2, max3, max4);
    }

    public static defpackage.ro1 r1MBDhnF(android.view.WindowInsets windowInsets, android.view.View view) {
        windowInsets.getClass();
        defpackage.ro1 ro1Var = new defpackage.ro1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = defpackage.mm1.IHQe1A4L2xu;
            defpackage.ro1 IHQe1A4L2xu = defpackage.im1.IHQe1A4L2xu(view);
            defpackage.no1 no1Var = ro1Var.IHQe1A4L2xu;
            no1Var.PAEGRtP0bX(IHQe1A4L2xu);
            android.view.View rootView = view.getRootView();
            no1Var.F7NU4MC0GW(rootView);
            no1Var.cnag84Bm(rootView);
            no1Var.QoRHpC4k();
            no1Var.NHJTzaLwkd(view.getWindowSystemUiVisibility());
        }
        return ro1Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ro1) {
            return java.util.Objects.equals(this.IHQe1A4L2xu, ((defpackage.ro1) obj).IHQe1A4L2xu);
        }
        return false;
    }

    public final int hashCode() {
        defpackage.no1 no1Var = this.IHQe1A4L2xu;
        if (no1Var == null) {
            return 0;
        }
        return no1Var.hashCode();
    }

    public final android.view.WindowInsets oh6vYeIP() {
        defpackage.no1 no1Var = this.IHQe1A4L2xu;
        if (no1Var instanceof defpackage.fo1) {
            return ((defpackage.fo1) no1Var).r1MBDhnF;
        }
        return null;
    }

    public ro1() {
        this.IHQe1A4L2xu = new defpackage.no1(this);
    }
}
