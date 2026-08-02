package defpackage;

/* loaded from: classes4.dex */
public final class pkw {
    public final b6v a;
    public final int b;

    public pkw(b6v b6vVar, int i) {
        this.a = b6vVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkw)) {
            return false;
        }
        pkw pkwVar = (pkw) obj;
        return this.a.equals(pkwVar.a) && this.b == pkwVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "SourceWithKey(source=" + this.a + ", key=" + this.b + ")";
    }
}
