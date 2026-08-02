package defpackage;

/* loaded from: classes5.dex */
public final class r5a implements ohb {
    public final q5a a;

    public r5a(q5a q5aVar) {
        this.a = q5aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r5a) && this.a.equals(((r5a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DocumentOriginChangedEvent(origin=" + this.a + ")";
    }
}
