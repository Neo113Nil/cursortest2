package defpackage;

/* loaded from: classes4.dex */
public final class pyq implements ryq {
    public final String a;

    public pyq(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pyq) && this.a.equals(((pyq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Error(message=", this.a, ")");
    }
}
