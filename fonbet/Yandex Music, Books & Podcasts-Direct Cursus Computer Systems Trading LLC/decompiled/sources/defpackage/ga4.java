package defpackage;

import java.security.cert.CertificateParsingException;

/* loaded from: classes5.dex */
public final class ga4 extends myo {
    public final CertificateParsingException c;

    public ga4(CertificateParsingException certificateParsingException) {
        this.c = certificateParsingException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ga4) && this.c.equals(((ga4) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Error parsing cert with: " + vut.U(this.c);
    }
}
