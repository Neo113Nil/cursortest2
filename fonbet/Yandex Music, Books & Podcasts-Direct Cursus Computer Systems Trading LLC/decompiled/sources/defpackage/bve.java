package defpackage;

import com.yandex.plus.pay.api.model.PlusPaySmartOffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bve {
    public final PlusPaySmartOffer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final jkj p;

    public bve(PlusPaySmartOffer plusPaySmartOffer, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, jkj jkjVar) {
        this.a = plusPaySmartOffer;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
        this.m = str12;
        this.n = str13;
        this.o = str14;
        this.p = jkjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bve)) {
            return false;
        }
        bve bveVar = (bve) obj;
        return this.a.equals(bveVar.a) && Intrinsics.d(this.b, bveVar.b) && Intrinsics.d(this.c, bveVar.c) && Intrinsics.d(this.d, bveVar.d) && Intrinsics.d(this.e, bveVar.e) && Intrinsics.d(this.f, bveVar.f) && Intrinsics.d(this.g, bveVar.g) && Intrinsics.d(this.h, bveVar.h) && Intrinsics.d(this.i, bveVar.i) && Intrinsics.d(this.j, bveVar.j) && Intrinsics.d(this.k, bveVar.k) && Intrinsics.d(this.l, bveVar.l) && Intrinsics.d(this.m, bveVar.m) && Intrinsics.d(this.n, bveVar.n) && Intrinsics.d(this.o, bveVar.o) && this.p.equals(bveVar.p);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.j;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.k;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.l;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.m;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.n;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.o;
        return this.p.hashCode() + ((hashCode14 + (str14 != null ? str14.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalOffer(plusOffer=");
        sb.append(this.a);
        sb.append(", titleText=");
        sb.append(this.b);
        sb.append(", titleTextA11y=");
        su4.v(sb, this.c, ", sliderText=", this.d, ", sliderAccentText=");
        su4.v(sb, this.e, ", sliderCombinedTextA11y=", this.f, ", buttonText=");
        su4.v(sb, this.g, ", buttonTextA11y=", this.h, ", buttonAdditionalText=");
        su4.v(sb, this.i, ", buttonAdditionalTextA11y=", this.j, ", buttonCombinedTextA11y=");
        su4.v(sb, this.k, ", disclaimerText=", this.l, ", disclaimerTextA11y=");
        su4.v(sb, this.m, ", oneClickDisclaimerText=", this.n, ", oneClickDisclaimerTextA11y=");
        sb.append(this.o);
        sb.append(", meta=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }
}
