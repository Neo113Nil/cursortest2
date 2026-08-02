package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersSubscriptionSection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class wwo0 {
    public final ScootersSubscriptionSection a;
    public final String b;
    public final String c;
    public final String d;

    public wwo0(ScootersSubscriptionSection scootersSubscriptionSection, String str, String str2, String str3) {
        this.a = scootersSubscriptionSection;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwo0)) {
            return false;
        }
        wwo0 wwo0Var = (wwo0) obj;
        return this.a == wwo0Var.a && jl40.l(this.b, wwo0Var.b) && jl40.l(this.c, wwo0Var.c) && jl40.l(this.d, wwo0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScootersSubscriptionDeeplink(section=");
        sb.append(this.a);
        sb.append(", selectedOfferId=");
        sb.append(this.b);
        sb.append(", openReason=");
        return g8e.r(sb, this.c, ", offerTariffName=", this.d, Extension.C_BRAKE);
    }
}
