package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class du6 extends jf0 {
    public final gz2 q;

    public du6(gz2 gz2Var) {
        this.q = gz2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof du6) && Intrinsics.d(this.q, ((du6) obj).q);
    }

    public final int hashCode() {
        return Float.hashCode(this.q.a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.q + ')';
    }

    @Override // defpackage.jf0
    public final int v(int i, xof xofVar, ksk kskVar, int i2) {
        return this.q.a(0, i, xofVar);
    }
}
