package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bc4 {
    public final iz2 a;
    public final Function1 b;
    public final wdc c;

    public bc4(iz2 iz2Var, wdc wdcVar, Function1 function1) {
        this.a = iz2Var;
        this.b = function1;
        this.c = wdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc4)) {
            return false;
        }
        bc4 bc4Var = (bc4) obj;
        return this.a.equals(bc4Var.a) && this.b.equals(bc4Var.b) && Intrinsics.d(this.c, bc4Var.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}
