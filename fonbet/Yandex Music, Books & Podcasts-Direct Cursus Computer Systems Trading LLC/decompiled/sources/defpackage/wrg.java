package defpackage;

import java.security.NoSuchAlgorithmException;

/* loaded from: classes5.dex */
public final class wrg extends asg {
    public final NoSuchAlgorithmException a;

    public wrg(NoSuchAlgorithmException noSuchAlgorithmException) {
        this.a = noSuchAlgorithmException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wrg) && this.a.equals(((wrg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Invalid signature (public key) with " + vut.U(this.a);
    }
}
