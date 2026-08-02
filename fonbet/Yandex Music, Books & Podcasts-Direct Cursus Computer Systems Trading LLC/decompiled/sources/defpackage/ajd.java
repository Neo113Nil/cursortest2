package defpackage;

/* loaded from: classes5.dex */
public final class ajd extends bjd {
    public final dkd a;

    public ajd(dkd dkdVar) {
        this.a = dkdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajd) && this.a.equals(((ajd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Ok";
    }
}
