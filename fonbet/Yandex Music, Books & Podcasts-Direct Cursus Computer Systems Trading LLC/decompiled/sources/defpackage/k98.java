package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k98 implements l98 {
    public final List a;
    public final List b;

    public k98(List list, List list2) {
        list.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k98)) {
            return false;
        }
        k98 k98Var = (k98) obj;
        return Intrinsics.d(this.a, k98Var.a) && Intrinsics.d(this.b, k98Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Success(artists=" + this.a + ", tracks=" + this.b + ")";
    }
}
