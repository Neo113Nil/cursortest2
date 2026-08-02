package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class njq extends ojq {
    public final eul a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;

    public njq(eul eulVar, String str, String str2, String str3, Integer num) {
        this.a = eulVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njq)) {
            return false;
        }
        njq njqVar = (njq) obj;
        return this.a.equals(njqVar.a) && this.b.equals(njqVar.b) && Intrinsics.d(this.c, njqVar.c) && Intrinsics.d(this.d, njqVar.d) && Intrinsics.d(this.e, njqVar.e);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.e;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(playlistDomainItem=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        su4.v(sb, this.c, ", coverUrl=", this.d, ", trackCount=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
