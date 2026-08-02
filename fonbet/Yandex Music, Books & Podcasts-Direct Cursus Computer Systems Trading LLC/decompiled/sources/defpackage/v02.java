package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v02 {
    public final long a;
    public final String b;
    public final boolean c;
    public final List d;
    public final String e;

    public v02(long j, String str, boolean z, List list, String str2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v02)) {
            return false;
        }
        v02 v02Var = (v02) obj;
        return this.a == v02Var.a && Intrinsics.d(this.b, v02Var.b) && this.c == v02Var.c && Intrinsics.d(this.d, v02Var.d) && Intrinsics.d(this.e, v02Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.d(k5r.e(k5r.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorizedUserData(puid=");
        sb.append(this.a);
        sb.append(", login=");
        sb.append(this.b);
        sb.append(", subscribed=");
        sb.append(this.c);
        sb.append(", hasOptions=");
        sb.append(this.d);
        return vz1.s(sb, ", authToken=", this.e, ")");
    }
}
