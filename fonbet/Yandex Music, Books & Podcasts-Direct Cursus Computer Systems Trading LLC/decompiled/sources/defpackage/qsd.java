package defpackage;

/* loaded from: classes.dex */
public final class qsd {
    public final mg3 a;
    public final psd b;
    public final jpc c;

    public qsd(mg3 mg3Var, psd psdVar, jpc jpcVar) {
        int i = mg3Var.b;
        this.a = mg3Var;
        this.b = psdVar;
        this.c = jpcVar;
        int i2 = mg3Var.c;
        int i3 = mg3Var.a;
        if (i2 - i3 == 0 && mg3Var.d - i == 0) {
            xq0.x("Bounds must be non zero");
            throw null;
        }
        if (i3 == 0 || i == 0) {
            return;
        }
        xq0.x("Bounding rectangle must start at the top or left window edge for folding features");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!qsd.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        qsd qsdVar = (qsd) obj;
        return this.a.equals(qsdVar.a) && this.b.equals(qsdVar.b) && this.c.equals(qsdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return qsd.class.getSimpleName() + " { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
