package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vb5 implements i1b {
    public final mn0 a;
    public final int b;

    public vb5(String str, int i) {
        this(new mn0(str), i);
    }

    @Override // defpackage.i1b
    public final void a(bh3 bh3Var) {
        int i = bh3Var.d;
        mn0 mn0Var = this.a;
        if (i != -1) {
            bh3Var.h(i, bh3Var.e, mn0Var.b);
        } else {
            bh3Var.h(bh3Var.b, bh3Var.c, mn0Var.b);
        }
        int i2 = bh3Var.b;
        int i3 = bh3Var.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int d = yhn.d(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - mn0Var.b.length(), 0, ((ah3) bh3Var.f).r());
        bh3Var.l(d, d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb5)) {
            return false;
        }
        vb5 vb5Var = (vb5) obj;
        return Intrinsics.d(this.a.b, vb5Var.a.b) && this.b == vb5Var.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.b);
        sb.append("', newCursorPosition=");
        return vz1.r(sb, this.b, ')');
    }

    public vb5(mn0 mn0Var, int i) {
        this.a = mn0Var;
        this.b = i;
    }
}
