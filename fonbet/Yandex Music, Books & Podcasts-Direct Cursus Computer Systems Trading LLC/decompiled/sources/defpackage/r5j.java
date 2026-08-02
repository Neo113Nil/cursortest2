package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r5j {
    public final rr5 a;
    public final kys b;
    public final long c;
    public final int d;
    public final Long e;

    public r5j(rr5 rr5Var, kys kysVar, long j, int i, Long l) {
        rr5Var.getClass();
        this.a = rr5Var;
        this.b = kysVar;
        this.c = j;
        this.d = i;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5j)) {
            return false;
        }
        r5j r5jVar = (r5j) obj;
        return Intrinsics.d(this.a, r5jVar.a) && this.b == r5jVar.b && this.c == r5jVar.c && this.d == r5jVar.d && Intrinsics.d(this.e, r5jVar.e);
    }

    public final int hashCode() {
        int a = f1d.a(this.d, tlm.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31);
        Long l = this.e;
        return a + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "NewTrackOperation(trackId=" + this.a + ", type=" + this.b + ", playlistNativeId=" + this.c + ", position=" + this.d + ", timestamp=" + this.e + ")";
    }
}
