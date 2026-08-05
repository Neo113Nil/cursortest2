package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class u90 {
    public final long NCTxEWno;
    public final long qoPGr6Ce;

    public u90(long j, long j2) {
        this.qoPGr6Ce = j;
        this.NCTxEWno = j2;
        if (j < 0) {
            m1.jb9XjC4I("stopTimeout(", j, " ms) cannot be negative");
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        m1.jb9XjC4I("replayExpiration(", j2, " ms) cannot be negative");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u90)) {
            return false;
        }
        u90 u90Var = (u90) obj;
        return this.qoPGr6Ce == u90Var.qoPGr6Ce && this.NCTxEWno == u90Var.NCTxEWno;
    }

    public final int hashCode() {
        return Long.hashCode(this.NCTxEWno) + (Long.hashCode(this.qoPGr6Ce) * 31);
    }

    public final String toString() {
        mp mpVar = new mp(2);
        long j = this.qoPGr6Ce;
        if (j > 0) {
            mpVar.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.NCTxEWno;
        if (j2 < Long.MAX_VALUE) {
            mpVar.add("replayExpiration=" + j2 + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + x5.Sjrx9cEN(ra.P7K7Inc8(mpVar), null, null, null, null, 63) + ')';
    }
}
