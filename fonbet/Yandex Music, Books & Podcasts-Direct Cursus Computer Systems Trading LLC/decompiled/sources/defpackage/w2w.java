package defpackage;

import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class w2w {
    public final pwv a;
    public final awv b;
    public final a2w c;
    public final ixv d;
    public final jzv e;
    public final tzv f;
    public final q2w g;
    public final fsv h;
    public final vrv i;

    public w2w(pwv pwvVar, awv awvVar, a2w a2wVar, ixv ixvVar, jzv jzvVar, tzv tzvVar, q2w q2wVar, fsv fsvVar, vrv vrvVar) {
        this.a = pwvVar;
        this.b = awvVar;
        this.c = a2wVar;
        this.d = ixvVar;
        this.e = jzvVar;
        this.f = tzvVar;
        this.g = q2wVar;
        this.h = fsvVar;
        this.i = vrvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2w)) {
            return false;
        }
        w2w w2wVar = (w2w) obj;
        return this.a.equals(w2wVar.a) && this.b.equals(w2wVar.b) && this.c.equals(w2wVar.c) && this.d.equals(w2wVar.d) && this.e.equals(w2wVar.e) && this.f.equals(w2wVar.f) && this.g.equals(w2wVar.g) && this.h.equals(w2wVar.h) && this.i.equals(w2wVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + f1d.a(R.array.wizard_outboarding_text, f1d.a(R.string.wizard_onboarding_text, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WizardStringResources(header=" + this.a + ", footer=" + this.b + ", search=" + this.c + ", likedArtists=" + this.d + ", onboarding=" + this.e + ", outboarding=" + this.f + ", skipDialog=" + this.g + ", artistBlock=" + this.h + ", accessibility=" + this.i + ")";
    }
}
