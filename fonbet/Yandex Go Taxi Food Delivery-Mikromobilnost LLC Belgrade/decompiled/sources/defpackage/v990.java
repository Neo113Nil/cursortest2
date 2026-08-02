package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class v990 {
    public final CharSequence a;
    public final CharSequence b;

    public v990(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v990)) {
            return false;
        }
        v990 v990Var = (v990) obj;
        return jl40.l(this.a, v990Var.a) && jl40.l(this.b, v990Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "DeliveryPaidInsuranceToggleItem(title=", ", trailText=", Extension.C_BRAKE);
    }
}
