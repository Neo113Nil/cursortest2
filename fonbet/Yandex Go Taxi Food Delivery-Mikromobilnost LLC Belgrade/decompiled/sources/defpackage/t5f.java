package defpackage;

/* loaded from: classes2.dex */
public final class t5f implements za70 {
    public final v5f a;

    public t5f(v5f v5fVar) {
        this.a = v5fVar;
    }

    public final v5f a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t5f) && this.a.equals(((t5f) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Data(invoice=" + this.a + ')';
    }
}
