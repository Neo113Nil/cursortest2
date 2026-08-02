package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xq10 {
    public final rb6 a;
    public final wp10 b;
    public final boolean c;

    public xq10(rb6 rb6Var, wp10 wp10Var, boolean z) {
        this.a = rb6Var;
        this.b = wp10Var;
        this.c = z;
    }

    public final rb6 a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final wp10 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq10)) {
            return false;
        }
        xq10 xq10Var = (xq10) obj;
        return this.a.equals(xq10Var.a) && this.b.equals(xq10Var.b) && this.c == xq10Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantOffersViewState(bottomBar=");
        sb.append(this.a);
        sb.append(", screenViewState=");
        sb.append(this.b);
        sb.append(", needSetScrollPositionY=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
