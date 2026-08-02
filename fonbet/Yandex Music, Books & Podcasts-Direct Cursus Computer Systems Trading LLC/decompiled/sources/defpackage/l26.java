package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l26 {
    public final t16 a;
    public final o16 b;
    public final y06 c;

    public l26(t16 t16Var, o16 o16Var, y06 y06Var) {
        o16Var.getClass();
        this.a = t16Var;
        this.b = o16Var;
        this.c = y06Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l26)) {
            return false;
        }
        l26 l26Var = (l26) obj;
        return this.a.equals(l26Var.a) && Intrinsics.d(this.b, l26Var.b) && this.c.equals(l26Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ConcertTabUiState(locationState=" + this.a + ", headerState=" + this.b + ", footerState=" + this.c + ")";
    }
}
