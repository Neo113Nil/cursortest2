package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ws5 {
    public final h06 a;
    public final ct5 b;

    public ws5(h06 h06Var, ct5 ct5Var) {
        h06Var.getClass();
        this.a = h06Var;
        this.b = ct5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws5)) {
            return false;
        }
        ws5 ws5Var = (ws5) obj;
        return Intrinsics.d(this.a, ws5Var.a) && this.b.equals(ws5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConcertBundle(concert=" + this.a + ", concertCardUiData=" + this.b + ")";
    }
}
