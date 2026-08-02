package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class iss {
    public final zvs a;
    public final o5n b;
    public final thr c;
    public final bb6 d;
    public final String e;
    public final css f;
    public final long g;
    public final fss h;
    public final hss i;

    public iss(zvs zvsVar, o5n o5nVar, thr thrVar, bb6 bb6Var, String str, css cssVar, long j, fss fssVar, hss hssVar) {
        zvsVar.getClass();
        o5nVar.getClass();
        thrVar.getClass();
        str.getClass();
        cssVar.getClass();
        this.a = zvsVar;
        this.b = o5nVar;
        this.c = thrVar;
        this.d = bb6Var;
        this.e = str;
        this.f = cssVar;
        this.g = j;
        this.h = fssVar;
        this.i = hssVar;
    }

    public final ess a() {
        return new ess(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iss)) {
            return false;
        }
        iss issVar = (iss) obj;
        return Intrinsics.d(this.a, issVar.a) && this.b == issVar.b && this.c == issVar.c && this.d == issVar.d && Intrinsics.d(this.e, issVar.e) && this.f == issVar.f && this.g == issVar.g && Intrinsics.d(this.h, issVar.h) && this.i.equals(issVar.i);
    }

    public final int hashCode() {
        int c = tlm.c(this.g, (this.f.hashCode() + k5r.c((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e)) * 31, 31);
        fss fssVar = this.h;
        return this.i.hashCode() + ((c + (fssVar == null ? 0 : fssVar.hashCode())) * 31);
    }

    public final String toString() {
        return "TrackCacheRow(trackId=" + this.a + ", quality=" + this.b + ", storage=" + this.c + ", container=" + this.d + ", cacheKey=" + this.e + ", cacheType=" + this.f + ", addedTimestamp=" + this.g + ", trackLoudnessInfo=" + this.h + ", trackTechInfo=" + this.i + ")";
    }
}
