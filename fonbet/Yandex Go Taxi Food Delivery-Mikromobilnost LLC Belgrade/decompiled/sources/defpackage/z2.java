package defpackage;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class z2 extends glp0 {
    public final IOException a;

    public z2(IOException iOException) {
        this.a = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z2) && jl40.l(this.a, ((z2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error during ASN.1 parsing of certificate with: ".concat(kca1.g(this.a));
    }
}
