package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class lvu {
    public final List a;
    public final List b;
    public final List c;
    public final int d;

    public lvu(List list, List list2, List list3, int i) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvu)) {
            return false;
        }
        lvu lvuVar = (lvu) obj;
        return this.a.equals(lvuVar.a) && this.b.equals(lvuVar.b) && this.c.equals(lvuVar.c) && this.d == lvuVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + k5r.d(k5r.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "DownloadedTracksInfo(manualDownloadedTracks=" + this.a + ", autoCachedTracks=" + this.b + ", smartCachedTracks=" + this.c + ", count=" + this.d + ")";
    }
}
