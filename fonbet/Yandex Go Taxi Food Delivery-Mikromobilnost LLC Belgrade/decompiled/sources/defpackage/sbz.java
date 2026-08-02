package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class sbz {
    public final rbz a;
    public final qbz b;
    public final String c;
    public final obz d;
    public final Integer e;
    public final Integer f;

    public sbz(rbz rbzVar, qbz qbzVar, String str, obz obzVar, Integer num, Integer num2) {
        this.a = rbzVar;
        this.b = qbzVar;
        this.c = str;
        this.d = obzVar;
        this.e = num;
        this.f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbz)) {
            return false;
        }
        sbz sbzVar = (sbz) obj;
        return this.a.equals(sbzVar.a) && jl40.l(this.b, sbzVar.b) && this.c.equals(sbzVar.c) && this.d.equals(sbzVar.d) && jl40.l(this.e, sbzVar.e) && jl40.l(this.f, sbzVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        qbz qbzVar = this.b;
        int hashCode2 = (this.d.hashCode() + unr0.b((hashCode + (qbzVar == null ? 0 : qbzVar.hashCode())) * 31, 31, this.c)) * 31;
        Integer num = this.e;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "LocationPermissionWithAgreementUiState(title=" + this.a + ", location=" + this.b + ", buttonTitle=" + this.c + ", agreement=" + this.d + ", logoIcon=" + this.e + ", backgroundImage=" + this.f + Extension.C_BRAKE;
    }
}
