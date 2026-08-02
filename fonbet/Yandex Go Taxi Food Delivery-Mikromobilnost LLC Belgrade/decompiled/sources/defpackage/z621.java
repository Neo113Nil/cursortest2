package defpackage;

/* loaded from: classes15.dex */
public final class z621 {
    public final long a;
    public final Boolean b;

    public z621(long j, Boolean bool) {
        this.a = j;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z621)) {
            return false;
        }
        z621 z621Var = (z621) obj;
        return this.a == z621Var.a && this.b.equals(z621Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
    }

    public final String toString() {
        return "UpdateFieldsOperation(messageTimestamp=" + this.a + ", isStarred=" + this.b + ", urlPreviewDisabled=null)";
    }
}
