package defpackage;

/* loaded from: classes4.dex */
public final class v7r implements w7r {
    public final z6r a;

    public v7r(z6r z6rVar) {
        this.a = z6rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7r) && this.a.equals(((v7r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(splash=" + this.a + ")";
    }
}
