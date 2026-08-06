package defpackage;

/* loaded from: classes.dex */
public abstract class iy0 extends defpackage.xa implements defpackage.j90 {
    public final boolean ez2rX8ReCYw;

    public iy0(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.ez2rX8ReCYw = false;
    }

    public final defpackage.f90 EXtogiMhuM() {
        if (this.ez2rX8ReCYw) {
            return this;
        }
        defpackage.f90 f90Var = this.adDC3e2L;
        if (f90Var != null) {
            return f90Var;
        }
        defpackage.f90 r1MBDhnF = r1MBDhnF();
        this.adDC3e2L = r1MBDhnF;
        return r1MBDhnF;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.iy0) {
            defpackage.iy0 iy0Var = (defpackage.iy0) obj;
            return xiZrDbcSW0().equals(iy0Var.xiZrDbcSW0()) && this.EXtogiMhuM.equals(iy0Var.EXtogiMhuM) && this.riuEU0zW4.equals(iy0Var.riuEU0zW4) && defpackage.x70.QoRHpC4k(this.xiZrDbcSW0, iy0Var.xiZrDbcSW0);
        }
        if (obj instanceof defpackage.j90) {
            return obj.equals(EXtogiMhuM());
        }
        return false;
    }

    public final int hashCode() {
        return this.riuEU0zW4.hashCode() + defpackage.fx0.F7NU4MC0GW(xiZrDbcSW0().hashCode() * 31, 31, this.EXtogiMhuM);
    }

    public final java.lang.String toString() {
        defpackage.f90 EXtogiMhuM = EXtogiMhuM();
        if (EXtogiMhuM != this) {
            return EXtogiMhuM.toString();
        }
        return "property " + this.EXtogiMhuM + " (Kotlin reflection is not available)";
    }
}
