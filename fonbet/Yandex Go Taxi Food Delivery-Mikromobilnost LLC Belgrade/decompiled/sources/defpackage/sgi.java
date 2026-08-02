package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class sgi {
    public final String a;
    public final String b;

    public sgi(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgi)) {
            return false;
        }
        sgi sgiVar = (sgi) obj;
        return jl40.l(this.a, sgiVar.a) && jl40.l(this.b, sgiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("DeliveryPaidInsuranceBubbleModel(text=", this.a, ", imageTag=", this.b, Extension.C_BRAKE);
    }
}
