package defpackage;

/* loaded from: classes3.dex */
public final class gdj {
    public final mqs a;
    public final raj b;

    public gdj(raj rajVar, mqs mqsVar) {
        this.a = mqsVar;
        this.b = rajVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdj)) {
            return false;
        }
        gdj gdjVar = (gdj) obj;
        return this.a.equals(gdjVar.a) && this.b.equals(gdjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "NonMusicTrackItem(track=" + this.a + ", trackUiData=" + this.b + ")";
    }
}
