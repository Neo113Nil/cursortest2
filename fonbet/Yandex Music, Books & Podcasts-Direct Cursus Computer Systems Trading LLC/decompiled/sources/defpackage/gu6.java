package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gu6 extends xv {
    public final hz2 k;

    public gu6(hz2 hz2Var) {
        hz2Var.getClass();
        this.k = hz2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gu6) && Intrinsics.d(this.k, ((gu6) obj).k);
    }

    public final int hashCode() {
        return Float.hashCode(this.k.a);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.k + ")";
    }

    @Override // defpackage.xv
    public final int y(int i, int i2, ksk kskVar) {
        xof xofVar = xof.a;
        return this.k.a(0, i);
    }
}
