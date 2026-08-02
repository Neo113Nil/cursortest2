package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gzq {
    public final String a;
    public final List b;
    public final Set c;
    public final Set d;
    public final long e;
    public final long f;

    public gzq(String str, List list, Set set, Set set2, long j, long j2) {
        str.getClass();
        list.getClass();
        set.getClass();
        set2.getClass();
        this.a = str;
        this.b = list;
        this.c = set;
        this.d = set2;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzq)) {
            return false;
        }
        gzq gzqVar = (gzq) obj;
        return Intrinsics.d(this.a, gzqVar.a) && Intrinsics.d(this.b, gzqVar.b) && Intrinsics.d(this.c, gzqVar.c) && Intrinsics.d(this.d, gzqVar.d) && this.e == gzqVar.e && this.f == gzqVar.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + tlm.c(this.e, su4.f(this.d, su4.f(this.c, k5r.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder v = ouj.v("State(uid=", this.a, ", timeIntervals=", ", tracksToAdd=", this.b);
        v.append(this.c);
        v.append(", tracksToDelete=");
        v.append(this.d);
        v.append(", nextUpdateTimeMs=");
        v.append(this.e);
        v.append(", updateTimeMs=");
        v.append(this.f);
        v.append(")");
        return v.toString();
    }
}
