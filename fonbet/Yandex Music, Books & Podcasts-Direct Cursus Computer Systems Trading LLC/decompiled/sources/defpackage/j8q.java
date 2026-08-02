package defpackage;

/* loaded from: classes4.dex */
public final class j8q {
    public final String a;

    public j8q(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8q) && this.a.equals(((j8q) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Misspell(suggest=", this.a, ")");
    }
}
