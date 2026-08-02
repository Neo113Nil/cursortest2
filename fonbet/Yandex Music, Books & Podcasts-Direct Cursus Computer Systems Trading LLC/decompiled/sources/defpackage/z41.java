package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z41 implements a51 {
    public final List a;
    public final int b;

    public z41(List list, int i) {
        list.getClass();
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z41)) {
            return false;
        }
        z41 z41Var = (z41) obj;
        return Intrinsics.d(this.a, z41Var.a) && this.b == z41Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(covers=" + this.a + ", addingArtists=" + this.b + ")";
    }
}
