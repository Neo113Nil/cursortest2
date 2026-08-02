package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class sin {
    public static final sin c;
    public final List a;
    public final List b;

    static {
        c5b c5bVar = c5b.a;
        c = new sin(c5bVar, c5bVar);
    }

    public sin(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sin)) {
            return false;
        }
        sin sinVar = (sin) obj;
        return Intrinsics.d(this.a, sinVar.a) && Intrinsics.d(this.b, sinVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RawJsonRepositoryResult(resultData=");
        sb.append(this.a);
        sb.append(", errors=");
        return eta.h(sb, this.b, ')');
    }
}
