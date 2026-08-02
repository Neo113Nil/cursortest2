package defpackage;

/* loaded from: classes3.dex */
public final class saj {
    public final raj a;
    public final mqs b;

    public saj(raj rajVar, mqs mqsVar) {
        this.a = rajVar;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof saj)) {
            return false;
        }
        saj sajVar = (saj) obj;
        return this.a.equals(sajVar.a) && this.b.equals(sajVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NonMusicCoverTrackUiModel(uiData=" + this.a + ", track=" + this.b + ")";
    }
}
