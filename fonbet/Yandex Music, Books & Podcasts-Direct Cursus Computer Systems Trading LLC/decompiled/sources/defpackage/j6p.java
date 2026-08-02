package defpackage;

/* loaded from: classes3.dex */
public final class j6p extends l6p {
    public final v7p a;

    public j6p(v7p v7pVar) {
        this.a = v7pVar;
    }

    @Override // defpackage.l6p
    public final men a() {
        return fdc.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j6p) && this.a.equals(((j6p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RecognizedTrack(track=" + this.a + ")";
    }
}
