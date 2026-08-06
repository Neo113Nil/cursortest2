package defpackage;

/* loaded from: classes.dex */
public final class r2 {
    public java.lang.Object F7NU4MC0GW;
    public int IHQe1A4L2xu;
    public final java.lang.Object oh6vYeIP;
    public java.lang.Object r1MBDhnF;

    public r2(android.os.Bundle bundle) {
        bundle.getClass();
        java.lang.String string = bundle.getString("nav-entry-state:id");
        if (string == null) {
            defpackage.c80.abhbClRa("nav-entry-state:id");
            throw null;
        }
        this.oh6vYeIP = string;
        this.IHQe1A4L2xu = defpackage.s70.PAEGRtP0bX(bundle, "nav-entry-state:destination-id");
        android.os.Bundle bundle2 = bundle.getBundle("nav-entry-state:args");
        if (bundle2 == null) {
            defpackage.c80.abhbClRa("nav-entry-state:args");
            throw null;
        }
        this.r1MBDhnF = bundle2;
        android.os.Bundle bundle3 = bundle.getBundle("nav-entry-state:saved-state");
        if (bundle3 != null) {
            this.F7NU4MC0GW = bundle3;
        } else {
            defpackage.c80.abhbClRa("nav-entry-state:saved-state");
            throw null;
        }
    }

    public void AARZUJiTa(android.graphics.Shader shader) {
        this.r1MBDhnF = shader;
        ((android.graphics.Paint) this.oh6vYeIP).setShader(shader);
    }

    public void EXtogiMhuM(int i) {
        ((android.graphics.Paint) this.oh6vYeIP).setStrokeCap(i == 2 ? android.graphics.Paint.Cap.SQUARE : i == 1 ? android.graphics.Paint.Cap.ROUND : i == 0 ? android.graphics.Paint.Cap.BUTT : android.graphics.Paint.Cap.BUTT);
    }

    public void F7NU4MC0GW(int i) {
        if (this.IHQe1A4L2xu == i) {
            return;
        }
        this.IHQe1A4L2xu = i;
        android.graphics.Paint paint = (android.graphics.Paint) this.oh6vYeIP;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(defpackage.w70.p4kuH6PDtgom(i));
        } else {
            paint.setXfermode(new android.graphics.PorterDuffXfermode(defpackage.w70.wll2JLbTBC2(i)));
        }
    }

    public int IHQe1A4L2xu() {
        android.graphics.Paint.Cap strokeCap = ((android.graphics.Paint) this.oh6vYeIP).getStrokeCap();
        int i = strokeCap == null ? -1 : defpackage.s2.IHQe1A4L2xu[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public void SH1y5HwkJhh(int i) {
        ((android.graphics.Paint) this.oh6vYeIP).setStyle(i == 1 ? android.graphics.Paint.Style.STROKE : android.graphics.Paint.Style.FILL);
    }

    public void adDC3e2L(long j) {
        ((android.graphics.Paint) this.oh6vYeIP).setColor(defpackage.w70.yIx6ChFVk(j));
    }

    public int oh6vYeIP() {
        android.graphics.Paint.Join strokeJoin = ((android.graphics.Paint) this.oh6vYeIP).getStrokeJoin();
        int i = strokeJoin == null ? -1 : defpackage.s2.oh6vYeIP[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public void r1MBDhnF(float f) {
        ((android.graphics.Paint) this.oh6vYeIP).setAlpha((int) java.lang.Math.rint(f * 255.0f));
    }

    public void riuEU0zW4() {
        ((android.graphics.Paint) this.oh6vYeIP).setStrokeJoin(android.graphics.Paint.Join.MITER);
    }

    public void xiZrDbcSW0(defpackage.f8 f8Var) {
        this.F7NU4MC0GW = f8Var;
        ((android.graphics.Paint) this.oh6vYeIP).setColorFilter(f8Var != null ? f8Var.IHQe1A4L2xu : null);
    }

    public r2(defpackage.nm0 nm0Var, int i) {
        this.oh6vYeIP = nm0Var.SH1y5HwkJhh;
        this.IHQe1A4L2xu = i;
        defpackage.pm0 pm0Var = nm0Var.JlrlGoKF;
        this.r1MBDhnF = pm0Var.IHQe1A4L2xu();
        android.os.Bundle SyNS6RMn = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
        this.F7NU4MC0GW = SyNS6RMn;
        pm0Var.EXtogiMhuM.abhbClRa(SyNS6RMn);
    }

    public r2(android.graphics.Paint paint) {
        this.oh6vYeIP = paint;
        this.IHQe1A4L2xu = 3;
    }
}
