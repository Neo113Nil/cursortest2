package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class st6 implements ut6 {
    public final nt6 a;

    public st6(nt6 nt6Var) {
        nt6Var.getClass();
        this.a = nt6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof st6) && Intrinsics.d(this.a, ((st6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Placeholder(headerUiState=" + this.a + ")";
    }
}
