package defpackage;

/* loaded from: classes4.dex */
public final class c6l implements e6l {
    public final w0l a;

    public c6l(w0l w0lVar) {
        this.a = w0lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6l) && this.a == ((c6l) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PreparingQueue(playingState=" + this.a + ")";
    }
}
