package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vdx0 implements bex0 {
    public final int a;
    public final boolean b;
    public final ob5 c;

    public vdx0(int i, boolean z, ob5 ob5Var) {
        this.a = i;
        this.b = z;
        this.c = ob5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdx0)) {
            return false;
        }
        vdx0 vdx0Var = (vdx0) obj;
        return this.a == vdx0Var.a && this.b == vdx0Var.b && jl40.l(this.c, vdx0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "LastVisibleItemIndexChanged(index=" + this.a + ", isScrollInProgress=" + this.b + ", baseTariffInfoUiState=" + this.c + Extension.C_BRAKE;
    }
}
