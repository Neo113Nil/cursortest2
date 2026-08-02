package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class i0u extends j0u {
    public final IOException a;

    public i0u(IOException iOException) {
        this.a = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0u) && this.a.equals(((i0u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure: IOException " + this.a;
    }
}
