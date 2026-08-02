package defpackage;

import java.security.SignatureException;

/* loaded from: classes4.dex */
public final class rbs0 extends glp0 {
    public final SignatureException a;

    public rbs0(SignatureException signatureException) {
        this.a = signatureException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rbs0) && jl40.l(this.a, ((rbs0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Signature object not properly initialized or signature from SCT is improperly encoded with: ".concat(kca1.g(this.a));
    }
}
