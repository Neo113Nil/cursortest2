package defpackage;

/* loaded from: classes3.dex */
public final class xit implements o0k {
    public final o0k a;
    public final q0k b;

    public xit(o0k o0kVar, q0k q0kVar) {
        this.a = o0kVar;
        this.b = q0kVar;
    }

    @Override // defpackage.o0k
    public final float a() {
        return Math.max(this.a.a(), this.b.d);
    }

    @Override // defpackage.o0k
    public final float b(xof xofVar) {
        xofVar.getClass();
        return Math.max(this.a.b(xofVar), this.b.b(xofVar));
    }

    @Override // defpackage.o0k
    public final float c(xof xofVar) {
        xofVar.getClass();
        return Math.max(this.a.c(xofVar), this.b.c(xofVar));
    }

    @Override // defpackage.o0k
    public final float d() {
        return Math.max(this.a.d(), this.b.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xit)) {
            return false;
        }
        xit xitVar = (xit) obj;
        return xitVar.a.equals(this.a) && xitVar.b.equals(this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " union " + this.b + ")";
    }
}
