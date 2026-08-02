package defpackage;

import com.yandex.go.deeplinks.generated.masstransit_payment_ble.MasstransitPaymentBleExitBehavior;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class r310 {
    public final MasstransitPaymentBleExitBehavior a;
    public final String b;
    public final String c;

    public r310(MasstransitPaymentBleExitBehavior masstransitPaymentBleExitBehavior, String str, String str2) {
        this.a = masstransitPaymentBleExitBehavior;
        this.b = str;
        this.c = str2;
    }

    public final MasstransitPaymentBleExitBehavior a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r310)) {
            return false;
        }
        r310 r310Var = (r310) obj;
        return this.a == r310Var.a && jl40.l(this.b, r310Var.b) && jl40.l(this.c, r310Var.c);
    }

    public final int hashCode() {
        MasstransitPaymentBleExitBehavior masstransitPaymentBleExitBehavior = this.a;
        int hashCode = (masstransitPaymentBleExitBehavior == null ? 0 : masstransitPaymentBleExitBehavior.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasstransitPaymentBleDeeplink(exitBehavior=");
        sb.append(this.a);
        sb.append(", utmSource=");
        sb.append(this.b);
        sb.append(", utmMedium=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public r310() {
        this(null, null, null);
    }
}
