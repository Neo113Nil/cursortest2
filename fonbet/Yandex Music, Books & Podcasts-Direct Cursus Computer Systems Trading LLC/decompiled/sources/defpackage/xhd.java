package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xhd implements l7q {
    public final z3q a;

    public xhd(z3q z3qVar) {
        this.a = z3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xhd) && Intrinsics.d(this.a, ((xhd) obj).a);
    }

    public final int hashCode() {
        z3q z3qVar = this.a;
        if (z3qVar == null) {
            return 0;
        }
        return z3qVar.hashCode();
    }

    public final String toString() {
        return "GlagolQueueStartInfo(entity=" + this.a + ")";
    }
}
