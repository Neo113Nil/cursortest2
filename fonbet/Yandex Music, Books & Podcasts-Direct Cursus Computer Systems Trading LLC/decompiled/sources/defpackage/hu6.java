package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hu6 extends jf0 {
    public final hz2 q;

    public hu6(hz2 hz2Var) {
        this.q = hz2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hu6) && Intrinsics.d(this.q, ((hu6) obj).q);
    }

    public final int hashCode() {
        return Float.hashCode(this.q.a);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.q + ')';
    }

    @Override // defpackage.jf0
    public final int v(int i, xof xofVar, ksk kskVar, int i2) {
        return this.q.a(0, i);
    }
}
