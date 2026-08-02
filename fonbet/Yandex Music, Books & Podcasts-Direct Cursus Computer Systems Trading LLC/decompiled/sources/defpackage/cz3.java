package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class cz3 implements dz3 {
    public final so1 a;
    public final int b;
    public final jyr c;
    public final u51 d;

    public cz3(so1 so1Var, int i) {
        so1Var.getClass();
        this.a = so1Var;
        this.b = i;
        this.c = btf.b(new r93(10, this));
        this.d = so1Var.a;
    }

    @Override // defpackage.dz3
    public final q91 c() {
        return (q91) this.c.getValue();
    }

    @Override // defpackage.dz3
    public final u51 d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz3)) {
            return false;
        }
        cz3 cz3Var = (cz3) obj;
        return Intrinsics.d(this.a, cz3Var.a) && this.b == cz3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.dz3
    public final int t() {
        return this.b;
    }

    public final String toString() {
        return "FromTop(artistTop=" + this.a + ", likesCount=" + this.b + ")";
    }
}
