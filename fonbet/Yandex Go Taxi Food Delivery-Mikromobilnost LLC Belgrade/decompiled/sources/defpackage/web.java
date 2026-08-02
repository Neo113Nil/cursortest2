package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class web {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public web(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof web)) {
            return false;
        }
        web webVar = (web) obj;
        return jl40.l(this.a, webVar.a) && jl40.l(this.b, webVar.b) && jl40.l(this.c, webVar.c) && jl40.l(this.d, webVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("CheckAgreementEntity(agreementId=", this.a, ", description=", this.b, ", infoText="), this.c, ", sourceAgreementDescription=", this.d, Extension.C_BRAKE);
    }
}
