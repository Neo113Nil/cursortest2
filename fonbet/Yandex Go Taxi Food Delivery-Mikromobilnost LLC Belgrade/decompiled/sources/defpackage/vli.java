package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vli {
    public final yi70 a;

    public vli(yi70 yi70Var) {
        this.a = yi70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vli) && jl40.l(this.a, ((vli) obj).a);
    }

    public final int hashCode() {
        yi70 yi70Var = this.a;
        if (yi70Var == null) {
            return 0;
        }
        return yi70Var.hashCode();
    }

    public final String toString() {
        return "DeliveryRecipientDetailsStep(orderButtonOverride=" + this.a + Extension.C_BRAKE;
    }

    public vli() {
        this(null);
    }
}
