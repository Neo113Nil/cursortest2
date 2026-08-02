package defpackage;

/* loaded from: classes4.dex */
public final class j2p implements k2p {
    public final qze a;

    public j2p(qze qzeVar) {
        this.a = qzeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2p) && this.a.equals(((j2p) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Success(data=" + this.a + ")";
    }
}
