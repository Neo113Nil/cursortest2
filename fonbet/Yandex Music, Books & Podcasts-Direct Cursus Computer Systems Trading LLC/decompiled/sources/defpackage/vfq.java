package defpackage;

import java.security.SignatureException;

/* loaded from: classes5.dex */
public final class vfq extends myo {
    public final SignatureException c;

    public vfq(SignatureException signatureException) {
        this.c = signatureException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vfq) && this.c.equals(((vfq) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Signature object not properly initialized or signature from SCT is improperly encoded with: " + vut.U(this.c);
    }
}
