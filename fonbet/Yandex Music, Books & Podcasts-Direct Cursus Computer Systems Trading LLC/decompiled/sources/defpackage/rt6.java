package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class rt6 implements ut6 {
    public final nt6 a;

    public rt6(nt6 nt6Var) {
        nt6Var.getClass();
        this.a = nt6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rt6) && Intrinsics.d(this.a, ((rt6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(headerUiState=" + this.a + ")";
    }
}
