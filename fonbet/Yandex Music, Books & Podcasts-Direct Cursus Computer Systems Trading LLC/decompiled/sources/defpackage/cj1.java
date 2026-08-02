package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class cj1 implements fj1 {
    public final ka1 a;

    public cj1(ka1 ka1Var) {
        this.a = ka1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cj1) && Intrinsics.d(this.a, ((cj1) obj).a);
    }

    public final int hashCode() {
        ka1 ka1Var = this.a;
        if (ka1Var == null) {
            return 0;
        }
        return ka1Var.hashCode();
    }

    public final String toString() {
        return "ModalDisclaimer(header=" + this.a + ")";
    }
}
