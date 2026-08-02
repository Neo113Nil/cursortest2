package defpackage;

/* loaded from: classes3.dex */
public final class a63 {
    public final x43 a;
    public final thj b;

    public a63(x43 x43Var, thj thjVar) {
        this.a = x43Var;
        this.b = thjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a63)) {
            return false;
        }
        a63 a63Var = (a63) obj;
        return this.a.equals(a63Var.a) && this.b.equals(a63Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BlockItemDynamicAnalyticsPayload(blockPayload=" + this.a + ", objectInfo=" + this.b + ")";
    }
}
