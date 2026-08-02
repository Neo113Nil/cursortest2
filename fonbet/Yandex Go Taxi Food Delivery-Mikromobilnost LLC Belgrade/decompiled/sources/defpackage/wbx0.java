package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wbx0 {
    public final String a;
    public final vbx0 b;
    public final boolean c;
    public final boolean d;

    public wbx0(String str, vbx0 vbx0Var, boolean z, boolean z2) {
        this.a = str;
        this.b = vbx0Var;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbx0)) {
            return false;
        }
        wbx0 wbx0Var = (wbx0) obj;
        return jl40.l(this.a, wbx0Var.a) && jl40.l(this.b, wbx0Var.b) && this.c == wbx0Var.c && this.d == wbx0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TariffCardBodyState(tariffName=");
        sb.append(this.a);
        sb.append(", descriptionState=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return smw0.k(", isLoading=", Extension.C_BRAKE, sb, this.c, this.d);
    }
}
