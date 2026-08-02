package defpackage;

/* loaded from: classes3.dex */
public final class fni {
    public final b4e a;
    public final ozi b;
    public final lal c;
    public final lyk d;
    public final avk e;
    public final gqg f;

    public fni(b4e b4eVar, ozi oziVar, lal lalVar, lyk lykVar, avk avkVar, gqg gqgVar) {
        this.a = b4eVar;
        this.b = oziVar;
        this.c = lalVar;
        this.d = lykVar;
        this.e = avkVar;
        this.f = gqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fni)) {
            return false;
        }
        fni fniVar = (fni) obj;
        return this.a.equals(fniVar.a) && this.b.equals(fniVar.b) && this.c.equals(fniVar.c) && this.d.equals(fniVar.d) && this.e.equals(fniVar.e) && this.f.equals(fniVar.f);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + k5r.e(k5r.e(k5r.e(k5r.e((((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + 1317166011) * 31, 31, true), 31, false), 31, false), 31, true);
    }

    public final String toString() {
        return "MusicIntegrationConfiguration(hostInfo=" + this.a + ", networkConfig=" + this.b + ", playerConfig=" + this.c + ", playbackConfig=" + this.d + ", playAudioConfig=" + this.e + ", localizationConfig=" + this.f + ", secretStorageKey=p93jhgh689SBReK6ghtw62, mayPlayPreview=true, isRawJsonForTracksEnabled=false, isExplicitForbiddenByDefault=false, isVideoWaveEnabled=true, userSessionCoordinatorEnabled=false)";
    }
}
