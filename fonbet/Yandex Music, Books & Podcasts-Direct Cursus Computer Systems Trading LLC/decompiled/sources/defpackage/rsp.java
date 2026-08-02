package defpackage;

/* loaded from: classes3.dex */
public final class rsp implements tsp {
    public final p5n a;

    public rsp(p5n p5nVar) {
        p5nVar.getClass();
        this.a = p5nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rsp) && this.a == ((rsp) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Available(quality=" + this.a + ")";
    }
}
