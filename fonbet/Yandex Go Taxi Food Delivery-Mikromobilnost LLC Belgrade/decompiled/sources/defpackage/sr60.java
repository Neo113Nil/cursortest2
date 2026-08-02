package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sr60 {
    public final String a;
    public final int b;

    public sr60(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr60)) {
            return false;
        }
        sr60 sr60Var = (sr60) obj;
        return jl40.l(this.a, sr60Var.a) && this.b == sr60Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "Offer(offerId=", this.a, ", ttlSec=", Extension.C_BRAKE);
    }
}
