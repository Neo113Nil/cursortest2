package defpackage;

import java.security.SignatureException;

/* loaded from: classes5.dex */
public final class zrg extends asg {
    public final SignatureException a;

    public zrg(SignatureException signatureException) {
        this.a = signatureException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zrg) && this.a.equals(((zrg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Invalid signature (public key) with " + vut.U(this.a);
    }
}
