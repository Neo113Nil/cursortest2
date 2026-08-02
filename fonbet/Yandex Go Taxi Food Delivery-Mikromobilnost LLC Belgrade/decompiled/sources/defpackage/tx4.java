package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class tx4 {
    public final djs a;
    public final djs b;
    public final djs c;
    public final djs d;
    public final djs e;
    public final djs f;
    public final pxs0 g;
    public final pxs0 h;
    public final pxs0 i;

    public tx4(djs djsVar, djs djsVar2, djs djsVar3, djs djsVar4, djs djsVar5, djs djsVar6, pxs0 pxs0Var, pxs0 pxs0Var2, pxs0 pxs0Var3) {
        this.a = djsVar;
        this.b = djsVar2;
        this.c = djsVar3;
        this.d = djsVar4;
        this.e = djsVar5;
        this.f = djsVar6;
        this.g = pxs0Var;
        this.h = pxs0Var2;
        this.i = pxs0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx4)) {
            return false;
        }
        tx4 tx4Var = (tx4) obj;
        return this.a.equals(tx4Var.a) && this.b.equals(tx4Var.b) && this.c.equals(tx4Var.c) && this.d.equals(tx4Var.d) && this.e.equals(tx4Var.e) && this.f.equals(tx4Var.f) && this.g.equals(tx4Var.g) && this.h.equals(tx4Var.h) && this.i.equals(tx4Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BaseAppTypography(header=" + this.a + ", title1=" + this.b + ", title2=" + this.c + ", title3=" + this.d + ", title4=" + this.e + ", body1=" + this.f + ", body2=" + this.g + ", caption1=" + this.h + ", caption2=" + this.i + Extension.C_BRAKE;
    }
}
