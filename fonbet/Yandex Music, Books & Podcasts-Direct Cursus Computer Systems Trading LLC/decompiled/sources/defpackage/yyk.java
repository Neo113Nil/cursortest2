package defpackage;

/* loaded from: classes4.dex */
public final class yyk {
    public final k1l a;
    public final jyk b;
    public final oq7 c;
    public final s7l d;
    public final uoh e;
    public final q8b f;

    public yyk(k1l k1lVar, jyk jykVar, oq7 oq7Var, s7l s7lVar, uoh uohVar, q8b q8bVar) {
        this.a = k1lVar;
        this.b = jykVar;
        this.c = oq7Var;
        this.d = s7lVar;
        this.e = uohVar;
        this.f = q8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyk)) {
            return false;
        }
        yyk yykVar = (yyk) obj;
        return this.a.equals(yykVar.a) && this.b.equals(yykVar.b) && this.c.equals(yykVar.c) && this.d.equals(yykVar.d) && this.e.equals(yykVar.e) && this.f.equals(yykVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PlaybackCoreHolder(playbackProcessor=" + this.a + ", executorsRegistrar=" + this.b + ", sharedPlaybackHandles=" + this.c + ", playbackStopper=" + this.d + ", mediaOutputTargetProvider=" + this.e + ", enqueuedPlaybackCommandsTrackingPayloadProvider=" + this.f + ")";
    }
}
