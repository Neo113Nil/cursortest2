package defpackage;

/* loaded from: classes4.dex */
public final class b9v {
    public final String a;

    public b9v(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9v) && this.a.equals(((b9v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("WaveWordsViewReport(cardId=", this.a, ")");
    }
}
