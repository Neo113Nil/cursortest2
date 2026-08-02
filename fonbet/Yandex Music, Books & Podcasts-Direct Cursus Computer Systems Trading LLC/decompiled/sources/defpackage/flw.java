package defpackage;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class flw implements ilw {
    public final IOException a;

    public flw(IOException iOException) {
        this.a = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof flw) && this.a.equals(((flw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.a + ")";
    }
}
