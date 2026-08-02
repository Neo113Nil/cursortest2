package defpackage;

/* loaded from: classes3.dex */
public final class kmi implements lmi, hmi {
    public final rr5 a;

    public kmi(rr5 rr5Var) {
        this.a = rr5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kmi) && this.a.equals(((kmi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Short(compositeTrackId=" + this.a + ")";
    }
}
