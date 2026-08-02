package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class tq8 extends ye0 {
    public final long b;

    public tq8(long j) {
        super("care.didRedirectToCare");
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tq8) && this.b == ((tq8) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return qv10.k(this.b, "DidRedirectToCare(redirectToCarePageTime=", Extension.C_BRAKE);
    }
}
