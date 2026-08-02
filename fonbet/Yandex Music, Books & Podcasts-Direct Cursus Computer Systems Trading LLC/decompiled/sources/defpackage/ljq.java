package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ljq {
    public final eul a;
    public final u9b b;
    public final Integer c;

    public ljq(eul eulVar, u9b u9bVar, Integer num) {
        this.a = eulVar;
        this.b = u9bVar;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljq)) {
            return false;
        }
        ljq ljqVar = (ljq) obj;
        return this.a.equals(ljqVar.a) && Intrinsics.d(this.b, ljqVar.b) && Intrinsics.d(this.c, ljqVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u9b u9bVar = this.b;
        int hashCode2 = (hashCode + (u9bVar == null ? 0 : u9bVar.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "SimplePlaylistEntity(playlist=" + this.a + ", cover=" + this.b + ", trackCount=" + this.c + ")";
    }
}
