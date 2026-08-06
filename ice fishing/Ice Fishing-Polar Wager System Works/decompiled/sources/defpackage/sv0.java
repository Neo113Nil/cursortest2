package defpackage;

/* loaded from: classes.dex */
public final class sv0 {
    public final long AARZUJiTa;
    public final java.util.ArrayList DFo87pBq1E5;
    public final boolean EXtogiMhuM;
    public final boolean F7NU4MC0GW;
    public defpackage.sv0 G3OKOH3wZRC;
    public final long IHQe1A4L2xu;
    public final long JlrlGoKF;
    public boolean QoRHpC4k;
    public final long SH1y5HwkJhh;
    public final long SyNS6RMn;
    public final float adDC3e2L;
    public boolean cnag84Bm;
    public final float ez2rX8ReCYw;
    public final long oh6vYeIP;
    public final long r1MBDhnF;
    public final int riuEU0zW4;
    public final long xiZrDbcSW0;

    public sv0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.IHQe1A4L2xu = j;
        this.oh6vYeIP = j2;
        this.r1MBDhnF = j3;
        this.F7NU4MC0GW = z;
        this.adDC3e2L = f;
        this.xiZrDbcSW0 = j4;
        this.AARZUJiTa = j5;
        this.EXtogiMhuM = z2;
        this.riuEU0zW4 = i;
        this.SH1y5HwkJhh = j6;
        this.ez2rX8ReCYw = f2;
        this.JlrlGoKF = j7;
        this.SyNS6RMn = 0L;
        this.cnag84Bm = z3;
        this.QoRHpC4k = z3;
    }

    public final void IHQe1A4L2xu() {
        defpackage.sv0 sv0Var = this.G3OKOH3wZRC;
        if (sv0Var == null) {
            this.cnag84Bm = true;
            this.QoRHpC4k = true;
        } else if (sv0Var != null) {
            sv0Var.IHQe1A4L2xu();
        }
    }

    public final boolean oh6vYeIP() {
        defpackage.sv0 sv0Var = this.G3OKOH3wZRC;
        return sv0Var != null ? sv0Var.oh6vYeIP() : this.cnag84Bm || this.QoRHpC4k;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PointerInputChange(id=");
        sb.append((java.lang.Object) defpackage.c80.yIx6ChFVk(this.IHQe1A4L2xu));
        sb.append(", uptimeMillis=");
        sb.append(this.oh6vYeIP);
        sb.append(", position=");
        sb.append((java.lang.Object) defpackage.gq0.AARZUJiTa(this.r1MBDhnF));
        sb.append(", pressed=");
        sb.append(this.F7NU4MC0GW);
        sb.append(", pressure=");
        sb.append(this.adDC3e2L);
        sb.append(", previousUptimeMillis=");
        sb.append(this.xiZrDbcSW0);
        sb.append(", previousPosition=");
        sb.append((java.lang.Object) defpackage.gq0.AARZUJiTa(this.AARZUJiTa));
        sb.append(", previousPressed=");
        sb.append(this.EXtogiMhuM);
        sb.append(", isConsumed=");
        sb.append(oh6vYeIP());
        sb.append(", type=");
        sb.append((java.lang.Object) defpackage.yv0.IHQe1A4L2xu(this.riuEU0zW4));
        sb.append(", historical=");
        java.lang.Object obj = this.DFo87pBq1E5;
        if (obj == null) {
            obj = defpackage.nt.adDC3e2L;
        }
        sb.append(obj);
        sb.append(", scrollDelta=");
        sb.append((java.lang.Object) defpackage.gq0.AARZUJiTa(this.SH1y5HwkJhh));
        sb.append(", scaleFactor=");
        sb.append(this.ez2rX8ReCYw);
        sb.append(", panOffset=");
        sb.append((java.lang.Object) defpackage.gq0.AARZUJiTa(this.JlrlGoKF));
        sb.append(')');
        return sb.toString();
    }

    public sv0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, java.util.ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.DFo87pBq1E5 = arrayList;
        this.SyNS6RMn = j8;
    }
}
