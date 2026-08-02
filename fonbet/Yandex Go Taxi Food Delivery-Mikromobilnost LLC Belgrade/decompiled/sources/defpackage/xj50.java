package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xj50 {
    public final String a;
    public final bpl0 b;
    public final int c;
    public final e47 d;
    public final e47 e;

    public xj50(String str, bpl0 bpl0Var, int i, e47 e47Var, e47 e47Var2) {
        this.a = str;
        this.b = bpl0Var;
        this.c = i;
        this.d = e47Var;
        this.e = e47Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj50)) {
            return false;
        }
        xj50 xj50Var = (xj50) obj;
        return jl40.l(this.a, xj50Var.a) && jl40.l(this.b, xj50Var.b) && this.c == xj50Var.c && jl40.l(this.d, xj50Var.d) && jl40.l(this.e, xj50Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + oyr.b(this.c, unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31)) * 31);
    }

    public final String toString() {
        return "NearbyUserplaceState(title=" + this.a + ", items=" + this.b + ", chosenItem=" + this.c + ", newUserplaceButton=" + this.d + ", updateUserplaceButton=" + this.e + Extension.C_BRAKE;
    }
}
