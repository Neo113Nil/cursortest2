package defpackage;

/* loaded from: classes5.dex */
public final class rrg extends org {
    public final Exception a;

    public rrg(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rrg) && this.a.equals(((rrg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "log-list.sig failed to load with " + vut.U(this.a);
    }
}
