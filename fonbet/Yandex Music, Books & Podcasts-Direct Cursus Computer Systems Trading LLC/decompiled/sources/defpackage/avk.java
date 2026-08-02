package defpackage;

/* loaded from: classes3.dex */
public final class avk {
    public final p9w a;
    public final p9w b;
    public final p9w c;
    public final nxv d;
    public final nxv e;
    public final jyr f;

    public avk(p9w p9wVar, p9w p9wVar2, p9w p9wVar3, nxv nxvVar, nxv nxvVar2, jyr jyrVar) {
        this.a = p9wVar;
        this.b = p9wVar2;
        this.c = p9wVar3;
        this.d = nxvVar;
        this.e = nxvVar2;
        this.f = jyrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avk)) {
            return false;
        }
        avk avkVar = (avk) obj;
        return this.a.equals(avkVar.a) && this.b.equals(avkVar.b) && this.c.equals(avkVar.c) && this.d.equals(avkVar.d) && this.e.equals(avkVar.e) && this.f.equals(avkVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + k5r.e(this.a.hashCode() * 31, 31, false)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PlayAudioConfig(trackChangeReason=" + this.a + ", fixNegative4=false, diagnoseNegativeOnly=" + this.b + ", diagnoseNegativeTotal=" + this.c + ", diagnoseBundles=" + this.d + ", seekOnBackSkip=" + this.e + ", crossfadeSetsEnabled=" + this.f + ")";
    }
}
