package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ygg extends avf {
    public final long c;
    public final List d;
    public final ArrayList e;

    public ygg(long j, List list, ArrayList arrayList) {
        list.getClass();
        this.c = j;
        this.d = list;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygg)) {
            return false;
        }
        ygg yggVar = (ygg) obj;
        return this.c == yggVar.c && Intrinsics.d(this.d, yggVar.d) && this.e.equals(yggVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.d(Long.hashCode(this.c) * 31, 31, this.d);
    }

    public final String toString() {
        return "DownloadsState(durationMs=" + this.c + ", topTracks=" + this.d + ", topEntities=" + this.e + ")";
    }
}
