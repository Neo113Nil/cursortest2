package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.sr2;

/* loaded from: classes7.dex */
public final class z271 {
    public final String a;
    public final sr2 b;

    public z271(String str, sr2 sr2Var) {
        this.a = str;
        this.b = sr2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z271)) {
            return false;
        }
        z271 z271Var = (z271) obj;
        return jl40.l(this.a, z271Var.a) && this.b == z271Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        sr2 sr2Var = this.b;
        return hashCode + (sr2Var != null ? sr2Var.hashCode() : 0);
    }

    public final String toString() {
        return "TokenResult(bidderToken=" + this.a + ", stubReason=" + this.b + Extension.C_BRAKE;
    }
}
