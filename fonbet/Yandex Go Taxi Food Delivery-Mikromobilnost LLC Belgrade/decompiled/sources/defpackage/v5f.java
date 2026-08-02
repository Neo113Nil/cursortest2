package defpackage;

/* loaded from: classes2.dex */
public final class v5f {
    public final u5f a;

    public v5f(u5f u5fVar) {
        this.a = u5fVar;
    }

    public final u5f a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v5f) && this.a.equals(((v5f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Invoice(externalCreate=" + this.a + ')';
    }
}
