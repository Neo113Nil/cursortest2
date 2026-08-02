package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zb80 {
    public final gfe0 a;

    public zb80(gfe0 gfe0Var) {
        this.a = gfe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zb80) && jl40.l(this.a, ((zb80) obj).a);
    }

    public final int hashCode() {
        gfe0 gfe0Var = this.a;
        if (gfe0Var == null) {
            return 0;
        }
        return gfe0Var.hashCode();
    }

    public final String toString() {
        return "OrderingControl(detailsForm=" + this.a + Extension.C_BRAKE;
    }
}
