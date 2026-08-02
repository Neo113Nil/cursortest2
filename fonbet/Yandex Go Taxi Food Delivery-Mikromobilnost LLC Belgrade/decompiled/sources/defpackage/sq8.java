package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class sq8 extends ye0 {
    public final long b;

    public sq8(long j) {
        super("care.didModifyRequest");
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sq8) && this.b == ((sq8) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return qv10.k(this.b, "DidModifyRequest(authTime=", Extension.C_BRAKE);
    }
}
