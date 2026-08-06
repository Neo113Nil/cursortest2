package defpackage;

/* loaded from: classes.dex */
public final class uv0 {
    public final int AARZUJiTa;
    public final long DFo87pBq1E5;
    public final boolean EXtogiMhuM;
    public final long F7NU4MC0GW;
    public final long IHQe1A4L2xu;
    public final long JlrlGoKF;
    public final long SH1y5HwkJhh;
    public final boolean adDC3e2L;
    public final float ez2rX8ReCYw;
    public final long oh6vYeIP;
    public final long r1MBDhnF;
    public final java.util.ArrayList riuEU0zW4;
    public final float xiZrDbcSW0;

    public uv0(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, java.util.ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.IHQe1A4L2xu = j;
        this.oh6vYeIP = j2;
        this.r1MBDhnF = j3;
        this.F7NU4MC0GW = j4;
        this.adDC3e2L = z;
        this.xiZrDbcSW0 = f;
        this.AARZUJiTa = i;
        this.EXtogiMhuM = z2;
        this.riuEU0zW4 = arrayList;
        this.SH1y5HwkJhh = j5;
        this.ez2rX8ReCYw = f2;
        this.JlrlGoKF = j6;
        this.DFo87pBq1E5 = j7;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.uv0)) {
            return false;
        }
        defpackage.uv0 uv0Var = (defpackage.uv0) obj;
        return defpackage.c80.G3OKOH3wZRC(this.IHQe1A4L2xu, uv0Var.IHQe1A4L2xu) && this.oh6vYeIP == uv0Var.oh6vYeIP && defpackage.gq0.oh6vYeIP(this.r1MBDhnF, uv0Var.r1MBDhnF) && defpackage.gq0.oh6vYeIP(this.F7NU4MC0GW, uv0Var.F7NU4MC0GW) && this.adDC3e2L == uv0Var.adDC3e2L && java.lang.Float.compare(this.xiZrDbcSW0, uv0Var.xiZrDbcSW0) == 0 && this.AARZUJiTa == uv0Var.AARZUJiTa && this.EXtogiMhuM == uv0Var.EXtogiMhuM && this.riuEU0zW4.equals(uv0Var.riuEU0zW4) && defpackage.gq0.oh6vYeIP(this.SH1y5HwkJhh, uv0Var.SH1y5HwkJhh) && java.lang.Float.compare(this.ez2rX8ReCYw, uv0Var.ez2rX8ReCYw) == 0 && defpackage.gq0.oh6vYeIP(this.JlrlGoKF, uv0Var.JlrlGoKF) && defpackage.gq0.oh6vYeIP(this.DFo87pBq1E5, uv0Var.DFo87pBq1E5);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.DFo87pBq1E5) + defpackage.fx0.r1MBDhnF(defpackage.fx0.IHQe1A4L2xu(this.ez2rX8ReCYw, defpackage.fx0.r1MBDhnF((this.riuEU0zW4.hashCode() + defpackage.fx0.adDC3e2L(defpackage.fx0.oh6vYeIP(this.AARZUJiTa, defpackage.fx0.IHQe1A4L2xu(this.xiZrDbcSW0, defpackage.fx0.adDC3e2L(defpackage.fx0.r1MBDhnF(defpackage.fx0.r1MBDhnF(defpackage.fx0.r1MBDhnF(java.lang.Long.hashCode(this.IHQe1A4L2xu) * 31, 31, this.oh6vYeIP), 31, this.r1MBDhnF), 31, this.F7NU4MC0GW), 31, this.adDC3e2L), 31), 31), 31, this.EXtogiMhuM)) * 31, 31, this.SH1y5HwkJhh), 31), 31, this.JlrlGoKF);
    }

    public final java.lang.String toString() {
        return "PointerInputEventData(id=" + ((java.lang.Object) defpackage.c80.yIx6ChFVk(this.IHQe1A4L2xu)) + ", uptime=" + this.oh6vYeIP + ", positionOnScreen=" + ((java.lang.Object) defpackage.gq0.AARZUJiTa(this.r1MBDhnF)) + ", position=" + ((java.lang.Object) defpackage.gq0.AARZUJiTa(this.F7NU4MC0GW)) + ", down=" + this.adDC3e2L + ", pressure=" + this.xiZrDbcSW0 + ", type=" + ((java.lang.Object) defpackage.yv0.IHQe1A4L2xu(this.AARZUJiTa)) + ", activeHover=" + this.EXtogiMhuM + ", historical=" + this.riuEU0zW4 + ", scrollDelta=" + ((java.lang.Object) defpackage.gq0.AARZUJiTa(this.SH1y5HwkJhh)) + ", scaleGestureFactor=" + this.ez2rX8ReCYw + ", panGestureOffset=" + ((java.lang.Object) defpackage.gq0.AARZUJiTa(this.JlrlGoKF)) + ", originalEventPosition=" + ((java.lang.Object) defpackage.gq0.AARZUJiTa(this.DFo87pBq1E5)) + ')';
    }
}
