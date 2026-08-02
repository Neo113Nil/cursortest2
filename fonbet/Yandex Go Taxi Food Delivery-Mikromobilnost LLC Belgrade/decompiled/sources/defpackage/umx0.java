package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class umx0 {
    public final String a;
    public final ArrayList b;

    public umx0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umx0)) {
            return false;
        }
        umx0 umx0Var = (umx0) obj;
        return jl40.l(this.a, umx0Var.a) && this.b.equals(umx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n.k("TariffRuleModel(tariff=", this.a, ", rules=", Extension.C_BRAKE, this.b);
    }
}
