package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fts {
    public final zvs a;
    public final o5n b;
    public final thr c;
    public final p9 d;
    public final oxs e;
    public final ets f;

    public fts(zvs zvsVar, o5n o5nVar, thr thrVar, p9 p9Var, oxs oxsVar, ets etsVar) {
        zvsVar.getClass();
        o5nVar.getClass();
        thrVar.getClass();
        this.a = zvsVar;
        this.b = o5nVar;
        this.c = thrVar;
        this.d = p9Var;
        this.e = oxsVar;
        this.f = etsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fts)) {
            return false;
        }
        fts ftsVar = (fts) obj;
        return Intrinsics.d(this.a, ftsVar.a) && this.b == ftsVar.b && this.c == ftsVar.c && this.d.equals(ftsVar.d) && Intrinsics.d(this.e, ftsVar.e) && this.f.equals(ftsVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31)) * 31;
        oxs oxsVar = this.e;
        return this.f.hashCode() + ((hashCode + (oxsVar == null ? 0 : oxsVar.hashCode())) * 31);
    }

    public final String toString() {
        return "TrackContentSources(trackId=" + this.a + ", quality=" + this.b + ", storage=" + this.c + ", location=" + this.d + ", trackLoudnessData=" + this.e + ", techInfo=" + this.f + ")";
    }
}
