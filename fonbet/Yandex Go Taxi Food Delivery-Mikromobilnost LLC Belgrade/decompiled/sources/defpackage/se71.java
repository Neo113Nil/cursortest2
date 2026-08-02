package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.bo2;
import yads.w4;

/* loaded from: classes7.dex */
public final class se71 {
    public final bo2 a;
    public List b;
    public final String c;
    public final String d;
    public final String e;
    public final fj71 f;
    public final w4 g;
    public final List h;
    public final List i;
    public final xn61 j;
    public final er71 k;

    public se71(bo2 bo2Var, List list, String str, String str2, String str3, fj71 fj71Var, w4 w4Var, List list2, List list3, xn61 xn61Var, er71 er71Var) {
        this.a = bo2Var;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = fj71Var;
        this.g = w4Var;
        this.h = list2;
        this.i = list3;
        this.j = xn61Var;
        this.k = er71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se71)) {
            return false;
        }
        se71 se71Var = (se71) obj;
        return this.a == se71Var.a && this.b.equals(se71Var.b) && jl40.l(this.c, se71Var.c) && jl40.l(this.d, se71Var.d) && jl40.l(this.e, se71Var.e) && jl40.l(this.f, se71Var.f) && jl40.l(this.g, se71Var.g) && this.h.equals(se71Var.h) && this.i.equals(se71Var.i) && this.j.equals(se71Var.j) && this.k.equals(se71Var.k);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        fj71 fj71Var = this.f;
        int hashCode4 = (hashCode3 + (fj71Var == null ? 0 : fj71Var.hashCode())) * 31;
        w4 w4Var = this.g;
        return this.k.hashCode() + ((this.j.hashCode() + unr0.c(unr0.c((hashCode4 + (w4Var != null ? w4Var.b.hashCode() : 0)) * 31, 31, this.h), 31, this.i)) * 31);
    }

    public final String toString() {
        List list = this.b;
        StringBuilder sb = new StringBuilder("Native(responseNativeType=");
        sb.append(this.a);
        sb.append(", assets=");
        sb.append(list);
        sb.append(", adId=");
        g8e.D(sb, this.c, ", info=", this.d, ", additionalText=");
        sb.append(this.e);
        sb.append(", link=");
        sb.append(this.f);
        sb.append(", impressionData=");
        sb.append(this.g);
        sb.append(", renderTrackingUrls=");
        sb.append(this.h);
        sb.append(", showNotices=");
        sb.append(this.i);
        sb.append(", creative=");
        sb.append(this.j);
        sb.append(", nativeAnalytics=");
        sb.append(this.k);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
