package defpackage;

/* loaded from: classes5.dex */
public final class lrg extends org {
    public final Exception a;

    public lrg(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lrg) && this.a.equals(((lrg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "log-list.json failed to load with " + vut.U(this.a);
    }
}
