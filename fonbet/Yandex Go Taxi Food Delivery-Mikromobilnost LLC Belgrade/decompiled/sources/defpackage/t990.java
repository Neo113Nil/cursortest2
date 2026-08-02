package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.screen_paid_insurance.PaidInsuranceScreen$Companion$ButtonStyle;

/* loaded from: classes5.dex */
public final class t990 {
    public final CharSequence a;
    public final CharSequence b;
    public final PaidInsuranceScreen$Companion$ButtonStyle c;

    public t990(CharSequence charSequence, CharSequence charSequence2, PaidInsuranceScreen$Companion$ButtonStyle paidInsuranceScreen$Companion$ButtonStyle) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = paidInsuranceScreen$Companion$ButtonStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t990)) {
            return false;
        }
        t990 t990Var = (t990) obj;
        return jl40.l(this.a, t990Var.a) && jl40.l(this.b, t990Var.b) && this.c == t990Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return this.c.hashCode() + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "DeliveryPaidInsuranceScreenButton(title=", ", subtitle=", ", style=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
