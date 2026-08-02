package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qr4 implements pre {
    public final String a;
    public final String b;
    public final List c;
    public final Integer d;
    public final Integer e;

    public qr4(String str, List list, String str2, Integer num, Integer num2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = num;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr4)) {
            return false;
        }
        qr4 qr4Var = (qr4) obj;
        return jl40.l(this.a, qr4Var.a) && jl40.l(this.b, qr4Var.b) && jl40.l(this.c, qr4Var.c) && jl40.l(this.d, qr4Var.d) && jl40.l(this.e, qr4Var.e);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "banner-carousel";
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("BannerCarouselRemoteCoreWidget(id=", this.a, ", metricaLabel=", this.b, ", displayIds=");
        v.append(this.c);
        v.append(", topPadding=");
        v.append(this.d);
        v.append(", bottomPadding=");
        return oo31.j(v, this.e, Extension.C_BRAKE);
    }
}
