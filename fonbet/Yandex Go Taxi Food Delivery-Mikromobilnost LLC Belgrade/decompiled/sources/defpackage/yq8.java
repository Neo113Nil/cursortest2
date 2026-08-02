package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class yq8 extends ye0 {
    public final long b;

    public yq8(long j) {
        super("care.insuranceWebViewLoaded");
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yq8) && this.b == ((yq8) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return qv10.k(this.b, "InsuranceWebViewLoaded(durationMS=", Extension.C_BRAKE);
    }
}
