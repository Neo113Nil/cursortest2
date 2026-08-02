package defpackage;

/* loaded from: classes4.dex */
public final class b4v implements c4v {
    public final l3v a;

    public b4v(l3v l3vVar) {
        this.a = l3vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4v) && this.a.equals(((b4v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(queueUiState=" + this.a + ")";
    }
}
