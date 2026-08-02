package defpackage;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class r831 extends s831 {
    public final IOException j;

    public r831(IOException iOException) {
        this.j = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r831) && this.j.equals(((r831) obj).j);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final String toString() {
        return "Failure: IOException " + this.j;
    }
}
