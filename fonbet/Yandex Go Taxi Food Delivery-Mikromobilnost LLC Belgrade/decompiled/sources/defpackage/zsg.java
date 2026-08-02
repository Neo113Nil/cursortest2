package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class zsg {
    public final o2y0 a;
    public final boolean b;
    public final boolean c;

    public zsg(o2y0 o2y0Var, boolean z, boolean z2) {
        this.a = o2y0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsg)) {
            return false;
        }
        zsg zsgVar = (zsg) obj;
        return jl40.l(this.a, zsgVar.a) && this.b == zsgVar.b && this.c == zsgVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeactivatedOrder(orderHolder=");
        sb.append(this.a);
        sb.append(", shouldRedirect=");
        sb.append(this.b);
        sb.append(", deactivatedByError=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
