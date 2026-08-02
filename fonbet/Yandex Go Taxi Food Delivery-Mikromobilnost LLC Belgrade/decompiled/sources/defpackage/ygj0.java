package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ygj0 {
    public final String a;
    public final List b;

    public ygj0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygj0)) {
            return false;
        }
        ygj0 ygj0Var = (ygj0) obj;
        return jl40.l(this.a, ygj0Var.a) && jl40.l(this.b, ygj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("RequirementGroupInfo(tariffClass=", this.a, ", list=", Extension.C_BRAKE, this.b);
    }
}
