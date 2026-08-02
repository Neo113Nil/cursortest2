package defpackage;

/* loaded from: classes4.dex */
public final class q6v {
    public final m6v a;
    public final o6v b;

    public q6v(m6v m6vVar, o6v o6vVar) {
        this.a = m6vVar;
        this.b = o6vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6v)) {
            return false;
        }
        q6v q6vVar = (q6v) obj;
        return this.a.equals(q6vVar.a) && this.b == q6vVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WaveWordsCardWithState(card=" + this.a + ", feedbackState=" + this.b + ")";
    }
}
