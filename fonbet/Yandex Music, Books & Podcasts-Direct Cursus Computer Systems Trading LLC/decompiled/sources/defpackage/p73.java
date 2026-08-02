package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p73 {
    public final List a;
    public final List b;

    public p73(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p73)) {
            return false;
        }
        p73 p73Var = (p73) obj;
        return Intrinsics.d(this.a, p73Var.a) && Intrinsics.d(this.b, p73Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BlocksInfo(local=" + this.a + ", remote=" + this.b + ")";
    }
}
