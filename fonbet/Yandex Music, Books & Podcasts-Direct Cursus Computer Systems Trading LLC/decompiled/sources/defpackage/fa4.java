package defpackage;

/* loaded from: classes5.dex */
public final class fa4 extends myo {
    public final Exception c;

    public fa4(Exception exc) {
        this.c = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa4) && this.c.equals(((fa4) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Certificate could not be encoded with: " + vut.U(this.c);
    }
}
