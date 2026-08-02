package defpackage;

/* loaded from: classes3.dex */
public final class lyk {
    public final x6s a;
    public final p9w b;
    public final ae c;
    public final q9w d;
    public final p9w e;
    public final x6s f;
    public final p9w g;

    public lyk(x6s x6sVar, p9w p9wVar, ae aeVar, q9w q9wVar, p9w p9wVar2, x6s x6sVar2, p9w p9wVar3) {
        this.a = x6sVar;
        this.b = p9wVar;
        this.c = aeVar;
        this.d = q9wVar;
        this.e = p9wVar2;
        this.f = x6sVar2;
        this.g = p9wVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyk)) {
            return false;
        }
        lyk lykVar = (lyk) obj;
        return this.a.equals(lykVar.a) && this.b.equals(lykVar.b) && this.c.equals(lykVar.c) && this.d.equals(lykVar.d) && this.e.equals(lykVar.e) && this.f.equals(lykVar.f) && this.g.equals(lykVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + k5r.e(Boolean.hashCode(false) * 31, 31, false)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PlaybackConfig(isStopOnPlayableChangeRemoved=false, mayPlayPreviewTracks=false, prefetcherEnabled=" + this.a + ", crossfadeSetsEnabled=" + this.b + ", radioPlaybackConfig=" + this.c + ", resetQueueInfoProvider=" + this.d + ", disableTickerOnPauseEnabled=" + this.e + ", mediaSessionPluginEnabled=" + this.f + ", cachedPlaybackLaunchInfoEnabled=" + this.g + ")";
    }
}
