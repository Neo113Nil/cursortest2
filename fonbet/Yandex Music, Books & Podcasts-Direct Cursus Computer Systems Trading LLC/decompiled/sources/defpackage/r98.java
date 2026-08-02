package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class r98 extends md {

    @NotNull
    public static final q98 Companion = new q98();
    public static final arf[] d = {null, btf.a(bwf.b, new bv7(12)), null};
    public final Boolean a;
    public final md b;
    public final bjn c;

    public r98(int i, Boolean bool, md mdVar, bjn bjnVar) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, p98.a.getDescriptor());
            throw null;
        }
        this.a = bool;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = mdVar;
        }
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
        if (!(obj instanceof r98) || !r98.class.equals(obj.getClass())) {
            return false;
        }
        r98 r98Var = (r98) obj;
        return Intrinsics.d(this.a, r98Var.a) && Intrinsics.d(this.b, r98Var.b) && Intrinsics.d(this.c, r98Var.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        md mdVar = this.b;
        return this.c.a.hashCode() + ((hashCode + (mdVar != null ? mdVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DismissAction(animated=" + this.a + ", completionAction=" + this.b + ", customProps=" + this.c + ")";
    }
}
