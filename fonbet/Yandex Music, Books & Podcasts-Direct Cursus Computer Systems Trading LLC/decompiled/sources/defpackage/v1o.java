package defpackage;

/* loaded from: classes4.dex */
public final class v1o {
    public final int a;
    public final boolean b;

    public v1o(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1o)) {
            return false;
        }
        v1o v1oVar = (v1o) obj;
        return this.a == v1oVar.a && this.b == v1oVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BatchExecutionResult(batchId=" + this.a + ", success=" + this.b + ")";
    }
}
