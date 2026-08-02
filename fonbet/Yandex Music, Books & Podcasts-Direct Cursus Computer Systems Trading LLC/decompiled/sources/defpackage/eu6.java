package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class eu6 extends zsd {
    public final hz2 l;

    public eu6(hz2 hz2Var) {
        hz2Var.getClass();
        this.l = hz2Var;
    }

    @Override // defpackage.zsd
    public final int B(int i, int i2, ksk kskVar) {
        xof xofVar = xof.a;
        return this.l.a(0, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eu6) && Intrinsics.d(this.l, ((eu6) obj).l);
    }

    public final int hashCode() {
        return Float.hashCode(this.l.a);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.l + ")";
    }
}
