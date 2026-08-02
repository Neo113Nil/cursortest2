package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vg4 {
    public final String a;
    public final nhe b;
    public final boolean c;
    public final boolean d;

    public vg4(String str, nhe nheVar, boolean z, boolean z2) {
        this.a = str;
        this.b = nheVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg4)) {
            return false;
        }
        vg4 vg4Var = (vg4) obj;
        return jl40.l(this.a, vg4Var.a) && this.b.equals(vg4Var.b) && this.c == vg4Var.c && this.d == vg4Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Player(url=");
        sb.append(this.a);
        sb.append(", scaleType=");
        sb.append(this.b);
        sb.append(", loop=");
        return smw0.k(", muted=", Extension.C_BRAKE, sb, this.c, this.d);
    }
}
