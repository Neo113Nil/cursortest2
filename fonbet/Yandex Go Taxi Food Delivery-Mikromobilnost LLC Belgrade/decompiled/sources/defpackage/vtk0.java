package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vtk0 {
    public final vuk0 a;
    public final puk0 b;

    public vtk0(vuk0 vuk0Var, puk0 puk0Var) {
        this.a = vuk0Var;
        this.b = puk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtk0)) {
            return false;
        }
        vtk0 vtk0Var = (vtk0) obj;
        return this.a.equals(vtk0Var.a) && this.b.equals(vtk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RoadsHeaderUiState(titleUiState=" + this.a + ", subtitleUiState=" + this.b + Extension.C_BRAKE;
    }
}
