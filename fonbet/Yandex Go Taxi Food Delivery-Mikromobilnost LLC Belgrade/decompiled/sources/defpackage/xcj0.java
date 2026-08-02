package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xcj0 {
    public final List a;
    public final String b;
    public final String c;

    public xcj0(List list, String str, String str2) {
        this.a = list;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcj0)) {
            return false;
        }
        xcj0 xcj0Var = (xcj0) obj;
        return jl40.l(this.a, xcj0Var.a) && this.b.equals(xcj0Var.b) && this.c.equals(xcj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(xvz.s("RequirementAddressViewState(items=", this.a, ", buttonTitle=", this.b, ", buttonSubtitle="), this.c, Extension.C_BRAKE);
    }
}
