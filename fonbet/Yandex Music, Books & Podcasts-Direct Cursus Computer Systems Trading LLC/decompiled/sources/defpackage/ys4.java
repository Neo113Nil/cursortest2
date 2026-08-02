package defpackage;

import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class ys4 {
    public final int a;
    public final ps4 b;
    public final qs4 c;

    public ys4(int i, ps4 ps4Var) {
        this.a = i;
        this.b = ps4Var;
        this.c = (qs4) CollectionsKt.S(ps4Var.a, i);
    }

    public static ys4 a(ys4 ys4Var, int i, ps4 ps4Var, int i2) {
        if ((i2 & 1) != 0) {
            i = ys4Var.a;
        }
        if ((i2 & 2) != 0) {
            ps4Var = ys4Var.b;
        }
        ys4Var.getClass();
        return new ys4(i, ps4Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys4)) {
            return false;
        }
        ys4 ys4Var = (ys4) obj;
        return this.a == ys4Var.a && this.b.equals(ys4Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CollageUiState(currentPage=" + this.a + ", uiData=" + this.b + ")";
    }
}
