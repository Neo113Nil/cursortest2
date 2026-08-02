package defpackage;

/* loaded from: classes4.dex */
public final class k9b implements m9b {
    public final p8k a;

    public k9b(p8k p8kVar) {
        this.a = p8kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k9b) && this.a.equals(((k9b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PartialEntity(data=" + this.a + ")";
    }
}
