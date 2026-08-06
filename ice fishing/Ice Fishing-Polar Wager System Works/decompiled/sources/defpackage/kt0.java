package defpackage;

/* loaded from: classes.dex */
public final class kt0 implements defpackage.j5 {
    public final int AARZUJiTa;
    public final int EXtogiMhuM;
    public final defpackage.kf1 F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    public final defpackage.iv0 adDC3e2L;
    public final int oh6vYeIP;
    public final long r1MBDhnF;
    public final defpackage.vf1 riuEU0zW4;
    public final defpackage.je0 xiZrDbcSW0;

    public kt0(int i, int i2, long j, defpackage.kf1 kf1Var, defpackage.iv0 iv0Var, defpackage.je0 je0Var, int i3, int i4, defpackage.vf1 vf1Var) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = i2;
        this.r1MBDhnF = j;
        this.F7NU4MC0GW = kf1Var;
        this.adDC3e2L = iv0Var;
        this.xiZrDbcSW0 = je0Var;
        this.AARZUJiTa = i3;
        this.EXtogiMhuM = i4;
        this.riuEU0zW4 = vf1Var;
        if (defpackage.fg1.IHQe1A4L2xu(j, defpackage.fg1.r1MBDhnF) || defpackage.fg1.r1MBDhnF(j) >= 0.0f) {
            return;
        }
        defpackage.y50.oh6vYeIP("lineHeight can't be negative (" + defpackage.fg1.r1MBDhnF(j) + ')');
    }

    public final defpackage.kt0 IHQe1A4L2xu(defpackage.kt0 kt0Var) {
        return kt0Var == null ? this : defpackage.lt0.IHQe1A4L2xu(this, kt0Var.IHQe1A4L2xu, kt0Var.oh6vYeIP, kt0Var.r1MBDhnF, kt0Var.F7NU4MC0GW, kt0Var.adDC3e2L, kt0Var.xiZrDbcSW0, kt0Var.AARZUJiTa, kt0Var.EXtogiMhuM, kt0Var.riuEU0zW4);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.kt0)) {
            return false;
        }
        defpackage.kt0 kt0Var = (defpackage.kt0) obj;
        return this.IHQe1A4L2xu == kt0Var.IHQe1A4L2xu && this.oh6vYeIP == kt0Var.oh6vYeIP && defpackage.fg1.IHQe1A4L2xu(this.r1MBDhnF, kt0Var.r1MBDhnF) && defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, kt0Var.F7NU4MC0GW) && defpackage.x70.QoRHpC4k(this.adDC3e2L, kt0Var.adDC3e2L) && defpackage.x70.QoRHpC4k(this.xiZrDbcSW0, kt0Var.xiZrDbcSW0) && this.AARZUJiTa == kt0Var.AARZUJiTa && this.EXtogiMhuM == kt0Var.EXtogiMhuM && defpackage.x70.QoRHpC4k(this.riuEU0zW4, kt0Var.riuEU0zW4);
    }

    public final int hashCode() {
        int oh6vYeIP = defpackage.fx0.oh6vYeIP(this.oh6vYeIP, java.lang.Integer.hashCode(this.IHQe1A4L2xu) * 31, 31);
        defpackage.gg1[] gg1VarArr = defpackage.fg1.oh6vYeIP;
        int r1MBDhnF = defpackage.fx0.r1MBDhnF(oh6vYeIP, 31, this.r1MBDhnF);
        defpackage.kf1 kf1Var = this.F7NU4MC0GW;
        int hashCode = (r1MBDhnF + (kf1Var != null ? kf1Var.hashCode() : 0)) * 31;
        defpackage.iv0 iv0Var = this.adDC3e2L;
        int hashCode2 = (hashCode + (iv0Var != null ? iv0Var.hashCode() : 0)) * 31;
        defpackage.je0 je0Var = this.xiZrDbcSW0;
        int oh6vYeIP2 = defpackage.fx0.oh6vYeIP(this.EXtogiMhuM, defpackage.fx0.oh6vYeIP(this.AARZUJiTa, (hashCode2 + (je0Var != null ? je0Var.hashCode() : 0)) * 31, 31), 31);
        defpackage.vf1 vf1Var = this.riuEU0zW4;
        return oh6vYeIP2 + (vf1Var != null ? vf1Var.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ParagraphStyle(textAlign=" + ((java.lang.Object) defpackage.cf1.IHQe1A4L2xu(this.IHQe1A4L2xu)) + ", textDirection=" + ((java.lang.Object) defpackage.hf1.IHQe1A4L2xu(this.oh6vYeIP)) + ", lineHeight=" + ((java.lang.Object) defpackage.fg1.F7NU4MC0GW(this.r1MBDhnF)) + ", textIndent=" + this.F7NU4MC0GW + ", platformStyle=" + this.adDC3e2L + ", lineHeightStyle=" + this.xiZrDbcSW0 + ", lineBreak=" + ((java.lang.Object) defpackage.ee0.IHQe1A4L2xu(this.AARZUJiTa)) + ", hyphens=" + ((java.lang.Object) defpackage.n40.IHQe1A4L2xu(this.EXtogiMhuM)) + ", textMotion=" + this.riuEU0zW4 + ')';
    }
}
