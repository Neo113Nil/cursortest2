package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class enq {
    public final String a;

    public enq(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof enq) && Intrinsics.d(this.a, ((enq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("SkeletonBlockAction(deeplink=", this.a, ")");
    }
}
