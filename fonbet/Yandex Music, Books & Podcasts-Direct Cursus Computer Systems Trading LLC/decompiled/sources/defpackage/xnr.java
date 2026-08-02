package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xnr extends znr {
    public final qor a;

    public xnr(qor qorVar) {
        qorVar.getClass();
        this.a = qorVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xnr) && Intrinsics.d(this.a, ((xnr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(blockState=" + this.a + ")";
    }
}
