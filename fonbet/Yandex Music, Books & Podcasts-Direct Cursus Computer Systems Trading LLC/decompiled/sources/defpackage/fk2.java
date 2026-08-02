package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class fk2 extends md {

    @NotNull
    public static final ek2 Companion = new ek2();
    public final Boolean a;
    public final bjn b;

    public fk2(int i, Boolean bool, bjn bjnVar) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, dk2.a.getDescriptor());
            throw null;
        }
        this.a = bool;
        if ((i & 2) != 0) {
            this.b = bjnVar;
        } else {
            bjn.Companion.getClass();
            this.b = bjn.b;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk2) || !fk2.class.equals(obj.getClass())) {
            return false;
        }
        fk2 fk2Var = (fk2) obj;
        return Intrinsics.d(this.a, fk2Var.a) && Intrinsics.d(this.b, fk2Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        return this.b.a.hashCode() + ((bool != null ? bool.hashCode() : 0) * 31);
    }

    public final String toString() {
        return "BackwardAction(animated=" + this.a + ", customProps=" + this.b + ")";
    }
}
