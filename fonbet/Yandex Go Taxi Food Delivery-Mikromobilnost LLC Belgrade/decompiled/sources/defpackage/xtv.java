package defpackage;

import com.yandex.go.information.analytics.InformationAnalyticsEvent$ItemType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class xtv implements ytv {
    public final int a;
    public final String b;
    public final String c;
    public final InformationAnalyticsEvent$ItemType d;

    public xtv(int i, String str, String str2, InformationAnalyticsEvent$ItemType informationAnalyticsEvent$ItemType) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = informationAnalyticsEvent$ItemType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtv)) {
            return false;
        }
        xtv xtvVar = (xtv) obj;
        return this.a == xtvVar.a && jl40.l(this.b, xtvVar.b) && jl40.l(this.c, xtvVar.c) && this.d == xtvVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "InformationTappedEvent(index=", ", iconTag=", this.b, ", name=");
        v.append(this.c);
        v.append(", type=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
