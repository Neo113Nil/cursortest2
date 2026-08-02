package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class zjj0 {
    public final String a;
    public final String b;

    public zjj0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjj0)) {
            return false;
        }
        zjj0 zjj0Var = (zjj0) obj;
        return jl40.l(this.a, zjj0Var.a) && jl40.l(this.b, zjj0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("RequirementScrollParams(requirementName=", this.a, ", groupName=", this.b, Extension.C_BRAKE);
    }
}
