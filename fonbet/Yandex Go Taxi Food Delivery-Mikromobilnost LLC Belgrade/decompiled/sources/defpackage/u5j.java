package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class u5j extends f6j {
    public final String a;
    public final String b;

    public u5j(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5j)) {
            return false;
        }
        u5j u5jVar = (u5j) obj;
        return this.a.equals(u5jVar.a) && jl40.l(this.b, u5jVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("CandidateRejected(driverDescription=", this.a, ", candidateId=", this.b, Extension.C_BRAKE);
    }
}
