package defpackage;

/* loaded from: classes4.dex */
public final class dgl {
    public static final dgl b = new dgl(0);
    public static final dgl c = new dgl(Long.MAX_VALUE);
    public final long a;

    public dgl(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dgl) && this.a == ((dgl) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return dfi.e(this.a, "LimitRestrictions(maxLimit=", ")");
    }
}
