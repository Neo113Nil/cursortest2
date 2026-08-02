package defpackage;

/* loaded from: classes3.dex */
public final class alu {
    public final rr5 a;

    public alu(rr5 rr5Var) {
        this.a = rr5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof alu) && this.a.equals(((alu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Track(compositeTrackId=" + this.a + ")";
    }
}
