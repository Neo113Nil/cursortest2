package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class iys {
    public final long a;
    public final rr5 b;
    public final kys c;
    public final long d;
    public final int e;
    public final Long f;

    public iys(long j, rr5 rr5Var, kys kysVar, long j2, int i, Long l) {
        this.a = j;
        this.b = rr5Var;
        this.c = kysVar;
        this.d = j2;
        this.e = i;
        this.f = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iys)) {
            return false;
        }
        iys iysVar = (iys) obj;
        return this.a == iysVar.a && this.b.equals(iysVar.b) && this.c == iysVar.c && this.d == iysVar.d && this.e == iysVar.e && Intrinsics.d(this.f, iysVar.f);
    }

    public final int hashCode() {
        int a = f1d.a(this.e, tlm.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31), 31);
        Long l = this.f;
        return a + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "TrackOperation(id=" + this.a + ", trackId=" + this.b + ", type=" + this.c + ", playlistNativeId=" + this.d + ", position=" + this.e + ", timestamp=" + this.f + ")";
    }
}
