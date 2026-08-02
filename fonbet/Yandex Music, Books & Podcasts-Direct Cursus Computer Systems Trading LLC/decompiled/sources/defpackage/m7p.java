package defpackage;

/* loaded from: classes3.dex */
public final class m7p extends y7p {
    public final int a;
    public final e4p b;

    public m7p(int i, e4p e4pVar) {
        e4pVar.getClass();
        this.a = i;
        this.b = e4pVar;
    }

    @Override // defpackage.y7p
    public final e4p b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7p)) {
            return false;
        }
        m7p m7pVar = (m7p) obj;
        return this.a == m7pVar.a && this.b == m7pVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Header(textRes=" + this.a + ", source=" + this.b + ")";
    }
}
