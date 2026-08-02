package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class u990 {
    public final t990 a;
    public final t990 b;

    public u990(t990 t990Var, t990 t990Var2) {
        this.a = t990Var;
        this.b = t990Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u990)) {
            return false;
        }
        u990 u990Var = (u990) obj;
        return jl40.l(this.a, u990Var.a) && this.b.equals(u990Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeliveryPaidInsuranceScreenButtonOptions(selected=" + this.a + ", unselected=" + this.b + Extension.C_BRAKE;
    }
}
