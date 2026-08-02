package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class smi {
    public final List a;
    public final zlj0 b;

    public smi(List list, zlj0 zlj0Var) {
        this.a = list;
        this.b = zlj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smi)) {
            return false;
        }
        smi smiVar = (smi) obj;
        return this.a.equals(smiVar.a) && jl40.l(this.b, smiVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zlj0 zlj0Var = this.b;
        return hashCode + (zlj0Var == null ? 0 : zlj0Var.hashCode());
    }

    public final String toString() {
        return "DeliveryRequirements(sectionModels=" + this.a + ", bottomButtonModel=" + this.b + Extension.C_BRAKE;
    }
}
