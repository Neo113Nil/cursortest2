package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n3j {
    public final String a;
    public final Integer b;
    public final List c;

    public n3j(String str, Integer num, ArrayList arrayList) {
        this.a = str;
        this.b = num;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3j)) {
            return false;
        }
        n3j n3jVar = (n3j) obj;
        return this.a.equals(n3jVar.a) && Intrinsics.d(this.b, n3jVar.b) && Intrinsics.d(this.c, n3jVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewEpisodesEntity(title=");
        sb.append(this.a);
        sb.append(", trackCount=");
        sb.append(this.b);
        sb.append(", covers=");
        return vz1.u(sb, this.c, ")");
    }
}
