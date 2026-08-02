package defpackage;

/* loaded from: classes5.dex */
public final class emp {
    public final String a;
    public final yku b;

    public emp(String str, yku ykuVar) {
        this.a = str;
        this.b = ykuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emp)) {
            return false;
        }
        emp empVar = (emp) obj;
        return this.a.equals(empVar.a) && this.b.equals(empVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.a + ", wave=" + this.b + ")";
    }
}
