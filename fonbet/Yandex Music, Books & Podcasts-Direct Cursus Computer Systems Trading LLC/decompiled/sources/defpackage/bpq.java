package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bpq implements cpq {
    public final List a;
    public final boolean b;

    public bpq(List list, boolean z) {
        list.getClass();
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpq)) {
            return false;
        }
        bpq bpqVar = (bpq) obj;
        return Intrinsics.d(this.a, bpqVar.a) && this.b == bpqVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(data=" + this.a + ", tabsInFirstPosition=" + this.b + ")";
    }
}
