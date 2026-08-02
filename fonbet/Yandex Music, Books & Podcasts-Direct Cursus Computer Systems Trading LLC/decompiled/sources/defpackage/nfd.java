package defpackage;

/* loaded from: classes5.dex */
public final class nfd extends pfd {
    public final se5 a;

    public nfd(se5 se5Var) {
        this.a = se5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nfd) && this.a.equals(((nfd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Queue(queue=" + this.a + ")";
    }
}
