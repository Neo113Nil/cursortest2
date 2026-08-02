package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i0 implements t9 {
    public final String a;
    public final d9 b;

    public i0(String str, d9 d9Var) {
        d9Var.getClass();
        this.a = str;
        this.b = d9Var;
    }

    @Override // bo.app.t9
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.areEqual(this.a, i0Var.a) && Intrinsics.areEqual(this.b, i0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "BasicResponseError(errorMessage=" + this.a + ", originalRequest=" + this.b + ")";
    }
}
