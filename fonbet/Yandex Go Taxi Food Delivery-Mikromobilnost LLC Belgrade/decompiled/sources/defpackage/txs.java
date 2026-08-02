package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class txs {
    public final String a;
    public final String b;
    public final String c;

    public txs(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txs)) {
            return false;
        }
        txs txsVar = (txs) obj;
        return jl40.l(this.a, txsVar.a) && jl40.l(this.b, txsVar.b) && jl40.l(this.c, txsVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("GeneratedReport(id=", this.a, ", type=", this.b, ", version="), this.c, Extension.C_BRAKE);
    }
}
