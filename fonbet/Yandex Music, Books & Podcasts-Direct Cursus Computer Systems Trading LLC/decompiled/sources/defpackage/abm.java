package defpackage;

/* loaded from: classes3.dex */
public final class abm implements cbm, qzn {
    public final tx a;

    public abm(tx txVar) {
        this.a = txVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof abm) && this.a.equals(((abm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RelatedAlbumsBlock(data=" + this.a + ")";
    }
}
