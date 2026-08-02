package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class vm0 extends ym0 {
    public final String a;
    public final List b;

    public vm0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm0)) {
            return false;
        }
        vm0 vm0Var = (vm0) obj;
        return this.a.equals(vm0Var.a) && jl40.l(this.b, vm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("SHOW_3DS(url=", this.a, ", trustedURLInfo=", Extension.C_BRAKE, this.b);
    }
}
