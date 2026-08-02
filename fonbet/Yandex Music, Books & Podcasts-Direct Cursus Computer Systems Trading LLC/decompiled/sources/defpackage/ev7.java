package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class ev7 extends md {

    @NotNull
    public static final dv7 Companion = new dv7();
    public static final arf[] c = {btf.a(bwf.b, new bv7(0)), null};
    public final md a;
    public final int b;

    public ev7(int i, md mdVar, int i2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, cv7.a.getDescriptor());
            throw null;
        }
        this.a = mdVar;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev7)) {
            return false;
        }
        ev7 ev7Var = (ev7) obj;
        return Intrinsics.d(this.a, ev7Var.a) && this.b == ev7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DelayedAction(action=");
        sb.append(this.a);
        sb.append(", millis=");
        return vz1.r(sb, this.b, ')');
    }
}
