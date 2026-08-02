package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.b;

@gsq0
/* loaded from: classes2.dex */
public final class v9d0 {
    public static final u9d0 Companion = new u9d0();
    public static final i3y[] m = {null, null, null, null, null, null, null, null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new q2d0(23))};
    public final String a;
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
    public final Map l;

    public /* synthetic */ v9d0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Map map) {
        if (511 != (i & 511)) {
            qje.Z(i, 511, t9d0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str10;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str11;
        }
        this.l = (i & 2048) == 0 ? b.f() : map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9d0)) {
            return false;
        }
        v9d0 v9d0Var = (v9d0) obj;
        return jl40.l(this.a, v9d0Var.a) && jl40.l(this.b, v9d0Var.b) && jl40.l(this.c, v9d0Var.c) && jl40.l(this.d, v9d0Var.d) && jl40.l(this.e, v9d0Var.e) && jl40.l(this.f, v9d0Var.f) && jl40.l(this.g, v9d0Var.g) && jl40.l(this.h, v9d0Var.h) && jl40.l(this.i, v9d0Var.i) && jl40.l(this.j, v9d0Var.j) && jl40.l(this.k, v9d0Var.k) && jl40.l(this.l, v9d0Var.l);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        return this.l.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Texts(subscriptionName=");
        sb.append(this.a);
        sb.append(", buttonText=");
        sb.append(this.b);
        sb.append(", buttonTextWithDetails=");
        sb.append(this.c);
        sb.append(", combinedIntroductoryText=");
        sb.append(this.d);
        sb.append(", combinedPriceText=");
        sb.append(this.e);
        sb.append(", combinedFullOfferText=");
        sb.append(this.f);
        sb.append(", priceInMonth=");
        sb.append(this.g);
        sb.append(", commonPrice=");
        sb.append(this.h);
        sb.append(", currencySymbol=");
        sb.append(this.i);
        sb.append(", discountPercent=");
        sb.append(this.j);
        sb.append(", fullPriceText=");
        sb.append(this.k);
        sb.append(", customTexts=");
        return smw0.n(sb, this.l, ')');
    }
}
