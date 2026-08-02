package defpackage;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lja {
    public final Set a;
    public final Map b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final jyr f;

    public lja(Set set, Map map, Set set2, Set set3, Set set4) {
        set.getClass();
        map.getClass();
        set2.getClass();
        set3.getClass();
        set4.getClass();
        this.a = set;
        this.b = map;
        this.c = set2;
        this.d = set3;
        this.e = set4;
        this.f = btf.b(new yg6(27, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lja)) {
            return false;
        }
        lja ljaVar = (lja) obj;
        return Intrinsics.d(this.a, ljaVar.a) && Intrinsics.d(this.b, ljaVar.b) && Intrinsics.d(this.c, ljaVar.c) && Intrinsics.d(this.d, ljaVar.d) && Intrinsics.d(this.e, ljaVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + su4.f(this.d, su4.f(this.c, f1d.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DownloadedTracks(permanentTracks=" + this.a.size() + ", tempTracks=" + this.c + ")";
    }
}
