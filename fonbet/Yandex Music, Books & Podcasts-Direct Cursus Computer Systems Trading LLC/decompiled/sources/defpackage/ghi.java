package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ghi {
    public final Long a;
    public final String b;
    public final u9b c;
    public final khi d;

    public ghi(Long l, String str, u9b u9bVar, khi khiVar) {
        this.a = l;
        this.b = str;
        this.c = u9bVar;
        this.d = khiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghi)) {
            return false;
        }
        ghi ghiVar = (ghi) obj;
        return Intrinsics.d(this.a, ghiVar.a) && this.b.equals(ghiVar.b) && Intrinsics.d(this.c, ghiVar.c) && this.d.equals(ghiVar.d);
    }

    public final int hashCode() {
        Long l = this.a;
        int c = k5r.c((l == null ? 0 : l.hashCode()) * 31, 31, this.b);
        u9b u9bVar = this.c;
        return this.d.hashCode() + ((c + (u9bVar != null ? u9bVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MultivibeGroupMember(uid=" + this.a + ", name=" + this.b + ", avatar=" + this.c + ", status=" + this.d + ")";
    }
}
