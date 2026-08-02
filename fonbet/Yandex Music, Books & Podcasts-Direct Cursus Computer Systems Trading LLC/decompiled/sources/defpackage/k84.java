package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k84 extends m84 {
    public final x74 c;
    public final n84 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k84(x74 x74Var, n84 n84Var) {
        super(x74Var, n84Var);
        x74Var.getClass();
        this.c = x74Var;
        this.d = n84Var;
    }

    @Override // defpackage.m84
    public final x74 a() {
        return this.c;
    }

    @Override // defpackage.m84
    public final n84 b() {
        return this.d;
    }

    @Override // defpackage.m84
    public final n84 c(x74 x74Var) {
        x74Var.getClass();
        return Intrinsics.d(this.c, x74Var) ? this.d : n84.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k84)) {
            return false;
        }
        k84 k84Var = (k84) obj;
        return Intrinsics.d(this.c, k84Var.c) && this.d == k84Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "Item(item=" + this.c + ", status=" + this.d + ")";
    }
}
