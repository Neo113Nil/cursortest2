package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class tja implements uja {
    public final int a;
    public final long b;
    public final List c;
    public final ArrayList d;

    public tja(int i, long j, List list, ArrayList arrayList) {
        list.getClass();
        this.a = i;
        this.b = j;
        this.c = list;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tja)) {
            return false;
        }
        tja tjaVar = (tja) obj;
        return this.a == tjaVar.a && this.b == tjaVar.b && Intrinsics.d(this.c, tjaVar.c) && this.d.equals(tjaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.d(tlm.c(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "Success(tracksTotalCount=" + this.a + ", tracksTotalDuration=" + this.b + ", filters=" + this.c + ", coverTrackList=" + this.d + ")";
    }
}
