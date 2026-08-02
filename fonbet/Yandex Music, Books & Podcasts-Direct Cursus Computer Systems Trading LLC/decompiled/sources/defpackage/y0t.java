package defpackage;

/* loaded from: classes6.dex */
public final class y0t implements x0t {
    public final hjp a;
    public final jsg b;

    public y0t(hjp hjpVar, jsg jsgVar) {
        this.a = hjpVar;
        this.b = jsgVar;
    }

    @Override // defpackage.x0t
    public final arr b() {
        return this.a;
    }

    @Override // defpackage.x0t
    public final arr c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0t)) {
            return false;
        }
        y0t y0tVar = (y0t) obj;
        return this.a.equals(y0tVar.a) && this.b.equals(y0tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackSelectionRestrictionsProviderImpl(surfaceSizeSupplier=" + this.a + ", startQualitySupplier=" + this.b + ')';
    }
}
