package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class db1 {
    public final int a;
    public final Integer b;

    public db1(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db1)) {
            return false;
        }
        db1 db1Var = (db1) obj;
        return this.a == db1Var.a && Intrinsics.d(this.b, db1Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ArtistInfoListenersBlockState(listeners=" + this.a + ", listenersDelta=" + this.b + ")";
    }
}
