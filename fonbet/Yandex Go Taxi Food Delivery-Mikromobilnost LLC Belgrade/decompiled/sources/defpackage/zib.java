package defpackage;

import com.yandex.go.masstransit.sdk.checkout.api.analytics.CheckoutScreenOpenReason;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zib {
    public final CheckoutScreenOpenReason a;
    public final String b;
    public final String c;
    public final Map d;

    public zib(CheckoutScreenOpenReason checkoutScreenOpenReason, String str, String str2, LinkedHashMap linkedHashMap, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        linkedHashMap = (i & 8) != 0 ? null : linkedHashMap;
        this.a = checkoutScreenOpenReason;
        this.b = str;
        this.c = str2;
        this.d = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zib)) {
            return false;
        }
        zib zibVar = (zib) obj;
        return this.a == zibVar.a && jl40.l(this.b, zibVar.b) && jl40.l(this.c, zibVar.c) && jl40.l(this.d, zibVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.d;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "CheckoutAnalyticsContext(source=" + this.a + ", utmSource=" + this.b + ", utmMedium=" + this.c + ", ticketingSystemContext=" + this.d + Extension.C_BRAKE;
    }
}
