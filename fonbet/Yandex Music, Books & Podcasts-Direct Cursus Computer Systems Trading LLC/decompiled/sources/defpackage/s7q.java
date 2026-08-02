package defpackage;

/* loaded from: classes4.dex */
public final class s7q implements t7q {
    public final g4q a;

    public s7q(g4q g4qVar) {
        this.a = g4qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7q) && this.a.equals(((s7q) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Stopped(queue=" + this.a + ")";
    }
}
