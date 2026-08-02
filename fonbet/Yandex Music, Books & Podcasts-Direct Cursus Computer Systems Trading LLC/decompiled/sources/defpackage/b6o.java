package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class b6o {

    @NotNull
    public static final z5o Companion = new z5o();
    public static final arf[] c = {null, btf.a(bwf.b, new e5o(4))};
    public final w5o a;
    public final a6o b;

    public /* synthetic */ b6o(int i, w5o w5oVar, a6o a6oVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = w5oVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = a6oVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6o)) {
            return false;
        }
        b6o b6oVar = (b6o) obj;
        return Intrinsics.d(this.a, b6oVar.a) && this.b == b6oVar.b;
    }

    public final int hashCode() {
        w5o w5oVar = this.a;
        int hashCode = (w5oVar == null ? 0 : w5oVar.hashCode()) * 31;
        a6o a6oVar = this.b;
        return hashCode + (a6oVar != null ? a6oVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlusState(balance=" + this.a + ", plusSubscriptionStatus=" + this.b + ')';
    }
}
