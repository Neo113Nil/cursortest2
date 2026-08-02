package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class v2a0 {
    public final String a;

    public v2a0(String str) {
        this.a = str;
        if (evu0.J(str)) {
            ny61.g("PaymentKitApiInstanceId value cannot be blank");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2a0) && jl40.l(this.a, ((v2a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("PaymentKitApiInstanceId(value=", this.a, Extension.C_BRAKE);
    }
}
