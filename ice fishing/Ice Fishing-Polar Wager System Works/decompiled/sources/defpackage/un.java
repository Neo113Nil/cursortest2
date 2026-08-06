package defpackage;

/* loaded from: classes.dex */
public final class un implements defpackage.qn {
    public final defpackage.yy AARZUJiTa;
    public final float adDC3e2L;
    public final float xiZrDbcSW0;

    public un(float f, float f2, defpackage.yy yyVar) {
        this.adDC3e2L = f;
        this.xiZrDbcSW0 = f2;
        this.AARZUJiTa = yyVar;
    }

    @Override // defpackage.qn
    public final float EXtogiMhuM() {
        return this.xiZrDbcSW0;
    }

    @Override // defpackage.qn
    public final long G3OKOH3wZRC(float f) {
        return defpackage.e90.V7bD7b8KA(4294967296L, this.AARZUJiTa.IHQe1A4L2xu(f));
    }

    @Override // defpackage.qn
    public final float UsuH8pd5P(long j) {
        if (defpackage.gg1.IHQe1A4L2xu(defpackage.fg1.oh6vYeIP(j), 4294967296L)) {
            return this.AARZUJiTa.oh6vYeIP(defpackage.fg1.r1MBDhnF(j));
        }
        defpackage.db.AARZUJiTa("Only Sp can convert to Px");
        return 0.0f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.un)) {
            return false;
        }
        defpackage.un unVar = (defpackage.un) obj;
        return java.lang.Float.compare(this.adDC3e2L, unVar.adDC3e2L) == 0 && java.lang.Float.compare(this.xiZrDbcSW0, unVar.xiZrDbcSW0) == 0 && this.AARZUJiTa.equals(unVar.AARZUJiTa);
    }

    public final int hashCode() {
        return this.AARZUJiTa.hashCode() + defpackage.fx0.IHQe1A4L2xu(this.xiZrDbcSW0, java.lang.Float.hashCode(this.adDC3e2L) * 31, 31);
    }

    @Override // defpackage.qn
    public final float oh6vYeIP() {
        return this.adDC3e2L;
    }

    public final java.lang.String toString() {
        return "DensityWithConverter(density=" + this.adDC3e2L + ", fontScale=" + this.xiZrDbcSW0 + ", converter=" + this.AARZUJiTa + ')';
    }
}
