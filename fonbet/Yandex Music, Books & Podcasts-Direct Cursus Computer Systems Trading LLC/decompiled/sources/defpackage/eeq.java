package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class eeq extends md {

    @NotNull
    public static final deq Companion = new deq();
    public static final arf[] d = {btf.a(bwf.b, new h2q(17)), null, null};
    public final q2a a;
    public final String b;
    public final bjn c;

    public eeq(int i, q2a q2aVar, String str, bjn bjnVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, ceq.a.getDescriptor());
            throw null;
        }
        this.a = q2aVar;
        this.b = str;
        if ((i & 4) != 0) {
            this.c = bjnVar;
        } else {
            bjn.Companion.getClass();
            this.c = bjn.b;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!eeq.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        eeq eeqVar = (eeq) obj;
        return Intrinsics.d(this.a, eeqVar.a) && Intrinsics.d(this.b, eeqVar.b) && Intrinsics.d(this.c, eeqVar.c);
    }

    public final int hashCode() {
        q2a q2aVar = this.a;
        return this.c.a.hashCode() + k5r.c((q2aVar != null ? q2aVar.hashCode() : 0) * 31, 31, this.b);
    }

    public final String toString() {
        return "ShowOverlayAction(document=" + this.a + ", tag=" + this.b + ", customProps=" + this.c + ")";
    }
}
