package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class r0 extends myo {
    public final IOException c;

    public r0(IOException iOException) {
        this.c = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && this.c.equals(((r0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Error during ASN.1 parsing of certificate with: " + vut.U(this.c);
    }
}
