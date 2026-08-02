package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class rq8 extends ye0 {
    public final String b;

    public rq8(String str) {
        super("care.contractCreated");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rq8) && jl40.l(this.b, ((rq8) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("ContractCreate(contractType=", this.b, Extension.C_BRAKE);
    }
}
