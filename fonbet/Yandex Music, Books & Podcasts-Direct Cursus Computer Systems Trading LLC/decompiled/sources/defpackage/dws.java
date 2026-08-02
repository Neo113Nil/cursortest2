package defpackage;

import ru.yandex.video.m3.player.tracks.TrackVariant;

/* loaded from: classes6.dex */
public final class dws {
    public final TrackVariant a;
    public final isb b;

    public dws(TrackVariant trackVariant, isb isbVar) {
        this.a = trackVariant;
        this.b = isbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dws)) {
            return false;
        }
        dws dwsVar = (dws) obj;
        return this.a.equals(dwsVar.a) && this.b.equals(dwsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackInfo(variant=" + this.a + ", format=" + this.b + ')';
    }
}
