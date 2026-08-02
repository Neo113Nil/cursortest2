package defpackage;

/* loaded from: classes3.dex */
public final class dtp {
    public final wsp a;
    public final zsp b;
    public final tsp c;
    public final ctp d;
    public final qsp e;
    public final nsp f;

    public dtp(wsp wspVar, zsp zspVar, tsp tspVar, ctp ctpVar, qsp qspVar, nsp nspVar) {
        this.a = wspVar;
        this.b = zspVar;
        this.c = tspVar;
        this.d = ctpVar;
        this.e = qspVar;
        this.f = nspVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtp)) {
            return false;
        }
        dtp dtpVar = (dtp) obj;
        return this.a.equals(dtpVar.a) && this.b.equals(dtpVar.b) && this.c.equals(dtpVar.c) && this.d.equals(dtpVar.d) && this.e.equals(dtpVar.e) && this.f == dtpVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SettingsState(repeatState=" + this.a + ", shuffleState=" + this.b + ", qualityState=" + this.c + ", timerState=" + this.d + ", playbackSpeedState=" + this.e + ", lyricsState=" + this.f + ")";
    }
}
