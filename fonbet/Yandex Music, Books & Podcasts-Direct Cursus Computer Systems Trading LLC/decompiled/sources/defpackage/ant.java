package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class ant extends md {

    @NotNull
    public static final zmt Companion = new zmt();
    public static final arf[] b = {btf.a(bwf.b, new hft(5))};
    public final kb6 a;

    public ant(int i, kb6 kb6Var) {
        if (1 == (i & 1)) {
            this.a = kb6Var;
        } else {
            u7g.V(i, 1, ymt.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ant) && Intrinsics.d(this.a, ((ant) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateContentAction(content=" + this.a + ')';
    }
}
