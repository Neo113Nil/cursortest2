package defpackage;

/* loaded from: classes6.dex */
public final class dnm {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final Integer e;
    public final boolean f;
    public final c5p g;

    public dnm(Integer num, Integer num2, Integer num3, String str, Integer num4, boolean z, c5p c5pVar) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = str;
        this.e = num4;
        this.f = z;
        this.g = c5pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!dnm.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        dnm dnmVar = (dnm) obj;
        return this.a.equals(dnmVar.a) && this.b.equals(dnmVar.b) && this.c.equals(dnmVar.c) && this.e.equals(dnmVar.e) && this.f == dnmVar.f && this.d.equals(dnmVar.d) && this.g.equals(dnmVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + k5r.c(tlm.c(-9223372036854775807L, k5r.e(k5r.e((this.e.intValue() + ((this.c.intValue() + ((this.b.intValue() + ((this.a.intValue() + (Long.hashCode(5242880L) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f), 31, false), 961), 961, this.d);
    }

    public final String toString() {
        return "PreloadConfig(maxDownloadBytes=5242880, maxDownloadSegmentCount=" + this.a + ", maxWidth=" + this.b + ", maxHeight=" + this.c + ", additionalParameters=null, vsid=" + this.d + ", sourceIndex=" + this.e + ", omitAudio=" + this.f + ", isForceRefresh=false, experimentalPreloadLiveDashConfig=null, startPosition=-9223372036854775807, eventIndexGenerator=" + this.g + ')';
    }
}
