package defpackage;

import java.util.HashSet;
import java.util.List;

/* loaded from: classes3.dex */
public final class ucc {
    public final long a;
    public final HashSet b;
    public final List c;

    public ucc(long j, HashSet hashSet, List list) {
        this.a = j;
        this.b = hashSet;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucc)) {
            return false;
        }
        ucc uccVar = (ucc) obj;
        return this.a == uccVar.a && this.b.equals(uccVar.b) && this.c.equals(uccVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "FiltersLocalData(lastTimeUpdateMillis=" + this.a + ", lastTrackIdList=" + this.b + ", filters=" + this.c + ")";
    }
}
