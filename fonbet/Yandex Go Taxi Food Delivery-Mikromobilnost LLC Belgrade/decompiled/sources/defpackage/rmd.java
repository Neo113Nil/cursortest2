package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class rmd {
    public final ArrayList a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final List f;
    public final tmd g;

    public rmd(ArrayList arrayList, String str, String str2, String str3, ArrayList arrayList2, List list, tmd tmdVar) {
        this.a = arrayList;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = arrayList2;
        this.f = list;
        this.g = tmdVar;
    }

    public final List a() {
        return this.a;
    }

    public final List b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmd)) {
            return false;
        }
        rmd rmdVar = (rmd) obj;
        return this.a.equals(rmdVar.a) && jl40.l(this.b, rmdVar.b) && jl40.l(this.c, rmdVar.c) && jl40.l(this.d, rmdVar.d) && this.e.equals(rmdVar.e) && jl40.l(this.f, rmdVar.f) && jl40.l(this.g, rmdVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int b = ly3.b((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e);
        List list = this.f;
        int hashCode4 = (b + (list == null ? 0 : list.hashCode())) * 31;
        tmd tmdVar = this.g;
        return hashCode4 + (tmdVar != null ? tmdVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentMethods(groups=" + this.a + ", mainPaymentMethodId=" + this.b + ", pos=" + this.c + ", trustServiceToken=" + this.d + ", paymentButtons=" + this.e + ", promoBadges=" + this.f + ", promoLegalInfo=" + this.g + ')';
    }
}
