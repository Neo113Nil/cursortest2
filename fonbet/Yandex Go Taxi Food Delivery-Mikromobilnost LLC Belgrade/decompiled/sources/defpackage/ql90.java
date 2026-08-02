package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ql90 extends w791 {
    public final pvi0 a;
    public final int b;
    public final String c;

    public ql90(int i, pvi0 pvi0Var, String str) {
        this.a = pvi0Var;
        this.b = i;
        this.c = str;
    }

    @Override // defpackage.w791
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql90)) {
            return false;
        }
        ql90 ql90Var = (ql90) obj;
        return this.a.equals(ql90Var.a) && this.b == ql90Var.b && jl40.l(this.c, ql90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Yourself(remoteImage=");
        sb.append(this.a);
        sb.append(", fallbackImageRes=");
        sb.append(this.b);
        sb.append(", text=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
