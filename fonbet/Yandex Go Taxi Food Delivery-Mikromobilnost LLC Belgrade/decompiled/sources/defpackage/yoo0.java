package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersQrScootersQrSection;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yoo0 {
    public final ScootersQrScootersQrSection a;
    public final Double b;
    public final Double c;
    public final List d;
    public final String e;
    public final Integer f;
    public final String g;

    public yoo0(ScootersQrScootersQrSection scootersQrScootersQrSection, Double d, Double d2, List list, String str, Integer num, String str2) {
        this.a = scootersQrScootersQrSection;
        this.b = d;
        this.c = d2;
        this.d = list;
        this.e = str;
        this.f = num;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yoo0)) {
            return false;
        }
        yoo0 yoo0Var = (yoo0) obj;
        return this.a == yoo0Var.a && jl40.l(this.b, yoo0Var.b) && jl40.l(this.c, yoo0Var.c) && this.d.equals(yoo0Var.d) && jl40.l(this.e, yoo0Var.e) && jl40.l(this.f, yoo0Var.f) && jl40.l(this.g, yoo0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Double d = this.b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        int c = unr0.c((hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int hashCode3 = (c + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.g;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScootersQrDeeplink(scootersQrSection=");
        sb.append(this.a);
        sb.append(", endLat=");
        sb.append(this.b);
        sb.append(", endLon=");
        sb.append(this.c);
        sb.append(", scootersSource=");
        sb.append(this.d);
        sb.append(", source=");
        vfc.w(this.f, this.e, ", successCompletionRadiusM=", ", multimodalOfferId=", sb);
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
