package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bb implements t9 {
    public final d9 a;
    public final n9 b;

    public bb(d9 d9Var, n9 n9Var) {
        d9Var.getClass();
        n9Var.getClass();
        this.a = d9Var;
        this.b = n9Var;
    }

    @Override // bo.app.t9
    public final String a() {
        return "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return Intrinsics.areEqual(this.a, bbVar.a) && Intrinsics.areEqual(this.b, bbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (((this.a.hashCode() * 31) - 525898564) * 31);
    }

    public final String toString() {
        return "NetworkCommunicationFailureResponseError(originalRequest=" + this.a + ", errorMessage=An error occurred during request processing, resulting in no valid response being received. Check the error log for more details., connectionResult=" + this.b + ")";
    }
}
