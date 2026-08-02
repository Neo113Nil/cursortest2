package defpackage;

/* loaded from: classes3.dex */
public final class fji implements gji {
    public final s9p a;

    public fji(s9p s9pVar) {
        this.a = s9pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fji) && this.a.equals(((fji) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Wave(seeds=" + this.a + ")";
    }
}
