package defpackage;

import java.security.InvalidKeyException;

/* loaded from: classes5.dex */
public final class xrg extends asg {
    public final InvalidKeyException a;

    public xrg(InvalidKeyException invalidKeyException) {
        this.a = invalidKeyException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xrg) && this.a.equals(((xrg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Invalid signature (public key) with " + vut.U(this.a);
    }
}
