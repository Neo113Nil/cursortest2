package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class tpn extends md {

    @NotNull
    public static final spn Companion = new spn();
    public static final arf[] c;
    public final t5a a;
    public final q2a b;

    static {
        bwf bwfVar = bwf.b;
        c = new arf[]{btf.a(bwfVar, new p1n(12)), btf.a(bwfVar, new p1n(13))};
    }

    public tpn(int i, t5a t5aVar, q2a q2aVar) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, rpn.a.getDescriptor());
            throw null;
        }
        this.a = t5aVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = q2aVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tpn.class != obj.getClass()) {
            return false;
        }
        tpn tpnVar = (tpn) obj;
        return Intrinsics.d(this.a, tpnVar.a) && Intrinsics.d(this.b, tpnVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q2a q2aVar = this.b;
        return hashCode + (q2aVar != null ? q2aVar.hashCode() : 0);
    }

    public final String toString() {
        return "RedirectAction(query=" + this.a + ", document=" + this.b + ")";
    }
}
