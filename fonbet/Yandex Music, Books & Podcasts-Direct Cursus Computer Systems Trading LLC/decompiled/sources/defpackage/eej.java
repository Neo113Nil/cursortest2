package defpackage;

/* loaded from: classes3.dex */
public final class eej {
    public final raj a;
    public final mqs b;

    public eej(raj rajVar, mqs mqsVar) {
        this.a = rajVar;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eej)) {
            return false;
        }
        eej eejVar = (eej) obj;
        return this.a.equals(eejVar.a) && this.b.equals(eejVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NonMusicTrackUiListItem(uiData=" + this.a + ", track=" + this.b + ")";
    }
}
