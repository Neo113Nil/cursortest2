package defpackage;

/* loaded from: classes5.dex */
public final class tin extends vin {
    public final Exception a;

    public tin(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tin) && this.a.equals(((tin) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "log-list.json failed to load with " + vut.U(this.a);
    }
}
