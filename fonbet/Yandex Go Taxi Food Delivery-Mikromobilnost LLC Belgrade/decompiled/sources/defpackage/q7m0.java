package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class q7m0 {
    public final String a;
    public final String b;

    public q7m0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7m0)) {
            return false;
        }
        q7m0 q7m0Var = (q7m0) obj;
        return jl40.l(this.a, q7m0Var.a) && jl40.l(this.b, q7m0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("SavingsAccountProgressState(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
