package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class aj1 implements fj1 {
    public final ka1 a;

    public aj1(ka1 ka1Var) {
        ka1Var.getClass();
        this.a = ka1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aj1) && Intrinsics.d(this.a, ((aj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loaded(header=" + this.a + ")";
    }
}
