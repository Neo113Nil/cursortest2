package defpackage;

/* loaded from: classes4.dex */
public final class g6v {
    public final String a;
    public final String b;

    public g6v(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6v)) {
            return false;
        }
        g6v g6vVar = (g6v) obj;
        return this.a.equals(g6vVar.a) && this.b.equals(g6vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("WaveWordsAnalyticPayload(objectId=", this.a, ", objectType=", this.b, ")");
    }
}
