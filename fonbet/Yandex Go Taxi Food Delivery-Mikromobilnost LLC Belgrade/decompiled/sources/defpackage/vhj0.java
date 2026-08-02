package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vhj0 implements kij0, e6v {
    public final z5s0 a;
    public final boolean b;
    public final boolean c;

    public vhj0(z5s0 z5s0Var, boolean z, boolean z2) {
        this.a = z5s0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhj0)) {
            return false;
        }
        vhj0 vhj0Var = (vhj0) obj;
        return jl40.l(this.a, vhj0Var.a) && this.b == vhj0Var.b && this.c == vhj0Var.c;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Comment(state=");
        sb.append(this.a);
        sb.append(", isFirst=");
        sb.append(this.b);
        sb.append(", isLast=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
