package defpackage;

/* loaded from: classes4.dex */
public final class i6v implements k6v {
    public final q6v a;

    public i6v(q6v q6vVar) {
        this.a = q6vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6v) && this.a.equals(((i6v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Match(words=" + this.a + ")";
    }
}
