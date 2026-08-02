package defpackage;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class wiw implements ziw {
    public final IOException a;

    public wiw(IOException iOException) {
        this.a = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wiw) && this.a.equals(((wiw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NetworkError(error=" + this.a + ")";
    }
}
