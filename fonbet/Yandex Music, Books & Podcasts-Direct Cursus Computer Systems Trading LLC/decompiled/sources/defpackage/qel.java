package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class qel {
    public final boolean a;
    public final rj6 b;

    public qel(boolean z, rj6 rj6Var) {
        rj6Var.getClass();
        this.a = z;
        this.b = rj6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qel)) {
            return false;
        }
        qel qelVar = (qel) obj;
        return this.a == qelVar.a && Intrinsics.d(this.b, qelVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LoadingResult(shouldRefreshCache=" + this.a + ", response=" + this.b + ")";
    }
}
