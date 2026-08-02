package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class tt6 implements ut6 {
    public final nt6 a;
    public final ArrayList b;

    public tt6(nt6 nt6Var, ArrayList arrayList) {
        nt6Var.getClass();
        this.a = nt6Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt6)) {
            return false;
        }
        tt6 tt6Var = (tt6) obj;
        return Intrinsics.d(this.a, tt6Var.a) && this.b.equals(tt6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(headerUiState=" + this.a + ", data=" + this.b + ")";
    }
}
