package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fu6 extends pd {
    public final hz2 l;

    public fu6(hz2 hz2Var) {
        hz2Var.getClass();
        this.l = hz2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fu6) && Intrinsics.d(this.l, ((fu6) obj).l);
    }

    public final int hashCode() {
        return Float.hashCode(this.l.a);
    }

    @Override // defpackage.pd
    public final int s(int i, int i2, ksk kskVar) {
        xof xofVar = xof.a;
        return this.l.a(0, i);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.l + ")";
    }
}
