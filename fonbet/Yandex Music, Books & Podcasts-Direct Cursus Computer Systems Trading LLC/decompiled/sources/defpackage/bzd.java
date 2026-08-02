package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bzd {
    public final String a;
    public final List b;
    public final List c;

    public bzd(String str, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzd)) {
            return false;
        }
        bzd bzdVar = (bzd) obj;
        return this.a.equals(bzdVar.a) && Intrinsics.d(this.b, bzdVar.b) && Intrinsics.d(this.c, bzdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vz1.u(ouj.v("HistoryEntity(title=", this.a, ", trackCovers=", ", subtitleElements=", this.b), this.c, ")");
    }
}
