package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class s3a0 {
    public final String a;

    public s3a0(String str) {
        this.a = str;
        if (evu0.J(str)) {
            ny61.g("PaymentKitSessionId value cannot be blank");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3a0) && this.a.equals(((s3a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("PaymentKitSessionId(value=", this.a, Extension.C_BRAKE);
    }
}
