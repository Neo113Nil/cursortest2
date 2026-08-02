package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class q421 {
    public final String a;
    public final String b;

    public q421(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q421)) {
            return false;
        }
        q421 q421Var = (q421) obj;
        return jl40.l(this.a, q421Var.a) && jl40.l(this.b, q421Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("RequirementData(name=", this.a, ", optionName=", this.b, Extension.C_BRAKE);
    }
}
