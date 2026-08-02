package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ynr extends znr {
    public final qor a;

    public ynr(qor qorVar) {
        qorVar.getClass();
        this.a = qorVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ynr) && Intrinsics.d(this.a, ((ynr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(blockState=" + this.a + ")";
    }
}
