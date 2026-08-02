package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r3t {
    public final Set a;
    public final ArrayList b;
    public final Set c;
    public final Set d;
    public final Set e;

    public r3t(Set set, ArrayList arrayList, Set set2, Set set3, Set set4) {
        set.getClass();
        set2.getClass();
        set3.getClass();
        set4.getClass();
        this.a = set;
        this.b = arrayList;
        this.c = set2;
        this.d = set3;
        this.e = set4;
        btf.b(new wfs(8, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3t)) {
            return false;
        }
        r3t r3tVar = (r3t) obj;
        return Intrinsics.d(this.a, r3tVar.a) && this.b.equals(r3tVar.b) && Intrinsics.d(this.c, r3tVar.c) && Intrinsics.d(this.d, r3tVar.d) && Intrinsics.d(this.e, r3tVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + su4.f(this.d, su4.f(this.c, dfi.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "TracksCacheStatus(permanentTracks=" + this.a + ", permanentTracksWithCacheTrackData=" + this.b + ", tempTracks=" + this.c + ", autoCachedTracks=" + this.d + ", smartCachedTracks=" + this.e + ")";
    }
}
