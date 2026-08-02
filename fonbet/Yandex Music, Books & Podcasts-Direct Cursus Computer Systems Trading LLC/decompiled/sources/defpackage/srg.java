package defpackage;

import java.security.InvalidKeyException;

/* loaded from: classes5.dex */
public final class srg extends myo {
    public final InvalidKeyException c;

    public srg(InvalidKeyException invalidKeyException) {
        this.c = invalidKeyException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof srg) && this.c.equals(((srg) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Log's public key cannot be used with " + vut.U(this.c);
    }
}
