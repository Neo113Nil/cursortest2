package defpackage;

/* loaded from: classes4.dex */
public final class lps extends nps {
    public final String a;
    public final yhm b;

    public lps(String str, yhm yhmVar) {
        this.a = str;
        this.b = yhmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lps)) {
            return false;
        }
        lps lpsVar = (lps) obj;
        return this.a.equals(lpsVar.a) && this.b.equals(lpsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Chosen(key=" + this.a + ", rectangle=" + this.b + ")";
    }
}
