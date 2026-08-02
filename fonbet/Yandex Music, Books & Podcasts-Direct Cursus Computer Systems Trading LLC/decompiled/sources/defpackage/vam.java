package defpackage;

/* loaded from: classes3.dex */
public final class vam implements cbm, qzn {
    public final mxs a;

    public vam(mxs mxsVar) {
        this.a = mxsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vam) && this.a.equals(((vam) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AllEpisodesBlock(data=" + this.a + ")";
    }
}
