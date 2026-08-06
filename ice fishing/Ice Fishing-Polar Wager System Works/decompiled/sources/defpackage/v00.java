package defpackage;

/* loaded from: classes.dex */
public class v00 extends defpackage.xa implements defpackage.u00, defpackage.f90, defpackage.s00 {
    public final int ez2rX8ReCYw;

    public v00(int i, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.ez2rX8ReCYw = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [f90] */
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.v00) {
            defpackage.v00 v00Var = (defpackage.v00) obj;
            return this.EXtogiMhuM.equals(v00Var.EXtogiMhuM) && this.riuEU0zW4.equals(v00Var.riuEU0zW4) && defpackage.x70.QoRHpC4k(this.xiZrDbcSW0, v00Var.xiZrDbcSW0) && xiZrDbcSW0().equals(v00Var.xiZrDbcSW0());
        }
        if (!(obj instanceof defpackage.v00)) {
            return false;
        }
        ?? r0 = this.adDC3e2L;
        if (r0 == 0) {
            r1MBDhnF();
            this.adDC3e2L = this;
        } else {
            this = r0;
        }
        return obj.equals(this);
    }

    public final int hashCode() {
        xiZrDbcSW0();
        return this.riuEU0zW4.hashCode() + defpackage.fx0.F7NU4MC0GW(xiZrDbcSW0().hashCode() * 31, 31, this.EXtogiMhuM);
    }

    @Override // defpackage.u00
    public final int oh6vYeIP() {
        return this.ez2rX8ReCYw;
    }

    @Override // defpackage.xa
    public final defpackage.f90 r1MBDhnF() {
        defpackage.sz0.IHQe1A4L2xu.getClass();
        return this;
    }

    public final java.lang.String toString() {
        defpackage.f90 f90Var = this.adDC3e2L;
        if (f90Var == null) {
            r1MBDhnF();
            this.adDC3e2L = this;
            f90Var = this;
        }
        if (f90Var != this) {
            return f90Var.toString();
        }
        java.lang.String str = this.EXtogiMhuM;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : defpackage.fx0.ez2rX8ReCYw("function ", str, " (Kotlin reflection is not available)");
    }

    public v00(int i, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2) {
        this(i, defpackage.wa.adDC3e2L, cls, str, str2, i2, 0);
    }
}
