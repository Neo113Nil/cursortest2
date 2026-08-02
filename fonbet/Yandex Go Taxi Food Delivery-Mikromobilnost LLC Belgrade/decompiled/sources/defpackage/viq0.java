package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class viq0 {
    public final String a;
    public final boolean b;

    public viq0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof viq0)) {
            return false;
        }
        viq0 viq0Var = (viq0) obj;
        return jl40.l(this.a, viq0Var.a) && this.b == viq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("SelectedTariffClass(tariffClass=", this.a, ", isSelected=", this.b, Extension.C_BRAKE);
    }
}
