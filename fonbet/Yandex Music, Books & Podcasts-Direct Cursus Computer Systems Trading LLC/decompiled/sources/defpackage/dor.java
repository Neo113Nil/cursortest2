package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dor implements eor {
    public final qor a;

    public dor(qor qorVar) {
        qorVar.getClass();
        this.a = qorVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dor) && Intrinsics.d(this.a, ((dor) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OtherInformationState(blockState=" + this.a + ")";
    }
}
