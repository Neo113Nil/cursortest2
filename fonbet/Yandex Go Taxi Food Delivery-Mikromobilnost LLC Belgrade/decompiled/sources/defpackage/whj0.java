package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class whj0 implements kij0 {
    public final n470 a;
    public final boolean b;
    public final boolean c;

    public whj0(n470 n470Var, boolean z, boolean z2) {
        this.a = n470Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whj0)) {
            return false;
        }
        whj0 whj0Var = (whj0) obj;
        return jl40.l(this.a, whj0Var.a) && this.b == whj0Var.b && this.c == whj0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CostCenter(model=");
        sb.append(this.a);
        sb.append(", isFirst=");
        sb.append(this.b);
        sb.append(", isLast=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
