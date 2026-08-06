package defpackage;

/* loaded from: classes.dex */
public final class gs {
    public android.widget.EdgeEffect AARZUJiTa;
    public android.widget.EdgeEffect EXtogiMhuM;
    public android.widget.EdgeEffect F7NU4MC0GW;
    public final android.content.Context IHQe1A4L2xu;
    public android.widget.EdgeEffect SH1y5HwkJhh;
    public android.widget.EdgeEffect adDC3e2L;
    public android.widget.EdgeEffect ez2rX8ReCYw;
    public final int oh6vYeIP;
    public long r1MBDhnF = 0;
    public android.widget.EdgeEffect riuEU0zW4;
    public android.widget.EdgeEffect xiZrDbcSW0;

    public gs(android.content.Context context, int i) {
        this.IHQe1A4L2xu = context;
        this.oh6vYeIP = i;
    }

    public static boolean AARZUJiTa(android.widget.EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((android.os.Build.VERSION.SDK_INT >= 31 ? defpackage.t5.r1MBDhnF(edgeEffect) : 0.0f) == 0.0f);
    }

    public static boolean xiZrDbcSW0(android.widget.EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public final android.widget.EdgeEffect F7NU4MC0GW() {
        android.widget.EdgeEffect edgeEffect = this.AARZUJiTa;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect IHQe1A4L2xu = IHQe1A4L2xu(defpackage.ks0.xiZrDbcSW0);
        this.AARZUJiTa = IHQe1A4L2xu;
        return IHQe1A4L2xu;
    }

    public final android.widget.EdgeEffect IHQe1A4L2xu(defpackage.ks0 ks0Var) {
        int i = android.os.Build.VERSION.SDK_INT;
        android.content.Context context = this.IHQe1A4L2xu;
        android.widget.EdgeEffect IHQe1A4L2xu = i >= 31 ? defpackage.t5.IHQe1A4L2xu(context) : new defpackage.n20(context);
        IHQe1A4L2xu.setColor(this.oh6vYeIP);
        if (!defpackage.i70.IHQe1A4L2xu(this.r1MBDhnF, 0L)) {
            long j = this.r1MBDhnF;
            if (ks0Var == defpackage.ks0.adDC3e2L) {
                IHQe1A4L2xu.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return IHQe1A4L2xu;
            }
            IHQe1A4L2xu.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return IHQe1A4L2xu;
    }

    public final android.widget.EdgeEffect adDC3e2L() {
        android.widget.EdgeEffect edgeEffect = this.F7NU4MC0GW;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect IHQe1A4L2xu = IHQe1A4L2xu(defpackage.ks0.adDC3e2L);
        this.F7NU4MC0GW = IHQe1A4L2xu;
        return IHQe1A4L2xu;
    }

    public final android.widget.EdgeEffect oh6vYeIP() {
        android.widget.EdgeEffect edgeEffect = this.adDC3e2L;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect IHQe1A4L2xu = IHQe1A4L2xu(defpackage.ks0.adDC3e2L);
        this.adDC3e2L = IHQe1A4L2xu;
        return IHQe1A4L2xu;
    }

    public final android.widget.EdgeEffect r1MBDhnF() {
        android.widget.EdgeEffect edgeEffect = this.xiZrDbcSW0;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect IHQe1A4L2xu = IHQe1A4L2xu(defpackage.ks0.xiZrDbcSW0);
        this.xiZrDbcSW0 = IHQe1A4L2xu;
        return IHQe1A4L2xu;
    }
}
