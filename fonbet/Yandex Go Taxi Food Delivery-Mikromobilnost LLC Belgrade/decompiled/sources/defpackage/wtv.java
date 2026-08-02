package defpackage;

import com.yandex.go.information.analytics.InformationAnalyticsEvent$ItemType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wtv implements ytv {
    public final String a;
    public final String b;
    public final InformationAnalyticsEvent$ItemType c;

    public wtv(ouq0 ouq0Var, muq0 muq0Var) {
        String str = ouq0Var.a;
        String str2 = muq0Var.a;
        InformationAnalyticsEvent$ItemType informationAnalyticsEvent$ItemType = InformationAnalyticsEvent$ItemType.LINK;
        this.a = str;
        this.b = str2;
        this.c = informationAnalyticsEvent$ItemType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtv)) {
            return false;
        }
        wtv wtvVar = (wtv) obj;
        return jl40.l(this.a, wtvVar.a) && jl40.l(this.b, wtvVar.b) && this.c == wtvVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("InformationModalTappedEvent(service=", this.a, ", name=", this.b, ", type=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
