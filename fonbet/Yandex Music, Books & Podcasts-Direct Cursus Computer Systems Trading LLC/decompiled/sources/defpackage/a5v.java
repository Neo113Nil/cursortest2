package defpackage;

/* loaded from: classes4.dex */
public final class a5v implements b5v {
    public final tfo a;
    public final q4q b;

    public a5v(tfo tfoVar, q4q q4qVar) {
        this.a = tfoVar;
        this.b = q4qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5v)) {
            return false;
        }
        a5v a5vVar = (a5v) obj;
        return this.a.equals(a5vVar.a) && this.b.equals(a5vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SessionStarted(batch=" + this.a + ", waveEntity=" + this.b + ")";
    }
}
