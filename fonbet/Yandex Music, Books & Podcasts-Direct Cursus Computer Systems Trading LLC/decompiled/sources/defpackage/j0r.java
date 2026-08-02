package defpackage;

/* loaded from: classes3.dex */
public final class j0r {
    public final h0r a;
    public final p0r b;

    public j0r(h0r h0rVar, p0r p0rVar) {
        this.a = h0rVar;
        this.b = p0rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0r)) {
            return false;
        }
        j0r j0rVar = (j0r) obj;
        return this.a.equals(j0rVar.a) && this.b.equals(j0rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SmartPreviewTrackItem(smartPreview=" + this.a + ", uiData=" + this.b + ")";
    }
}
