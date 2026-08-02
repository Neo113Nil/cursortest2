package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class aor implements eor {
    public final qor a;

    public aor(qor qorVar) {
        qorVar.getClass();
        this.a = qorVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aor) && Intrinsics.d(this.a, ((aor) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(blockState=" + this.a + ")";
    }
}
