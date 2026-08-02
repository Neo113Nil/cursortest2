package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zpv0 {
    public final String a;
    public final m3u0 b;
    public final oz40 c;
    public final m3u0 d;
    public final n6w e;

    public zpv0(String str, oz40 oz40Var, oz40 oz40Var2, oz40 oz40Var3, yx40 yx40Var) {
        this.a = str;
        this.b = oz40Var;
        this.c = oz40Var2;
        this.d = oz40Var3;
        this.e = yx40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpv0)) {
            return false;
        }
        zpv0 zpv0Var = (zpv0) obj;
        if (!jl40.l(this.a, zpv0Var.a) || !jl40.l(this.b, zpv0Var.b) || !this.c.equals(zpv0Var.c) || !jl40.l(this.d, zpv0Var.d) || !jl40.l(this.e, zpv0Var.e)) {
            return false;
        }
        mvz0 mvz0Var = t1a1.a;
        return mvz0Var.equals(mvz0Var);
    }

    public final int hashCode() {
        return Float.hashCode(8.0f) + g8e.c(24.0f, g8e.c(12.0f, Float.hashCode(16.0f) * 31, 31), 31) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SummaryTooltipState(id=" + this.a + ", tooltipAlignmentState=" + this.b + ", tooltipContentUiState=" + this.c + ", anchorPositionInWindowState=" + this.d + ", anchorWidthState=" + this.e + ", properties=" + t1a1.a + Extension.C_BRAKE;
    }
}
