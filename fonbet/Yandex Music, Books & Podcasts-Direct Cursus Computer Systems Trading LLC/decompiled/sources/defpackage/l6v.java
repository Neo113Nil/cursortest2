package defpackage;

/* loaded from: classes4.dex */
public final class l6v {
    public final String a;
    public final String b;

    public l6v(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6v)) {
            return false;
        }
        l6v l6vVar = (l6v) obj;
        return this.a.equals(l6vVar.a) && this.b.equals(l6vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("WaveWordsBigCard(id=", this.a, ", text=", this.b, ")");
    }
}
