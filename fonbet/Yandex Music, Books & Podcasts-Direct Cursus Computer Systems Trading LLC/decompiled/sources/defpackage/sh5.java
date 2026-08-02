package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class sh5 {
    public final Long a;
    public final Long b;

    public sh5(Long l, Long l2) {
        this.a = l;
        this.b = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh5)) {
            return false;
        }
        sh5 sh5Var = (sh5) obj;
        return Intrinsics.d(this.a, sh5Var.a) && Intrinsics.d(this.b, sh5Var.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "Timers(delayBeforeShow=" + this.a + ", delayBeforeDismiss=" + this.b + ")";
    }
}
