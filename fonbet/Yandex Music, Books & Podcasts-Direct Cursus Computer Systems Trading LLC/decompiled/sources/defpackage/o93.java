package defpackage;

/* loaded from: classes3.dex */
public final class o93 implements q93, qzn {
    public final tx a;

    public o93(tx txVar) {
        this.a = txVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o93) && this.a.equals(((o93) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RelatedAlbumsBlock(data=" + this.a + ")";
    }
}
