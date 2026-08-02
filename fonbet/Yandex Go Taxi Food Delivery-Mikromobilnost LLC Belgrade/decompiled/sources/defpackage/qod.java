package defpackage;

import com.yandex.plus.pay.data.mb.dto.CompositeOfferDto$Vendor;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class qod {
    public static final mod Companion = new mod();
    public static final i3y[] l;
    public final String a;
    public final String b;
    public final ipd c;
    public final String d;
    public final String e;
    public final CompositeOfferDto$Vendor f;
    public final Map g;
    public final String h;
    public final String i;
    public final pod j;
    public final List k;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new i3y[]{null, null, null, null, null, a.b(lazyThreadSafetyMode, new juc(24)), a.b(lazyThreadSafetyMode, new juc(25)), null, null, null, a.b(lazyThreadSafetyMode, new juc(26))};
    }

    public /* synthetic */ qod(int i, String str, String str2, ipd ipdVar, String str3, String str4, CompositeOfferDto$Vendor compositeOfferDto$Vendor, Map map, String str5, String str6, pod podVar, List list) {
        if (1814 != (i & 1814)) {
            qje.Z(i, 1814, lod.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        this.c = ipdVar;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        this.e = str4;
        if ((i & 32) == 0) {
            this.f = CompositeOfferDto$Vendor.UNKNOWN;
        } else {
            this.f = compositeOfferDto$Vendor;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = map;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        this.i = str6;
        this.j = podVar;
        this.k = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qod)) {
            return false;
        }
        qod qodVar = (qod) obj;
        return jl40.l(this.a, qodVar.a) && jl40.l(this.b, qodVar.b) && jl40.l(this.c, qodVar.c) && jl40.l(this.d, qodVar.d) && jl40.l(this.e, qodVar.e) && this.f == qodVar.f && jl40.l(this.g, qodVar.g) && jl40.l(this.h, qodVar.h) && jl40.l(this.i, qodVar.i) && jl40.l(this.j, qodVar.j) && jl40.l(this.k, qodVar.k);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.c.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31;
        String str2 = this.d;
        int hashCode2 = (this.f.hashCode() + unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e)) * 31;
        Map map = this.g;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.h;
        return this.k.hashCode() + unr0.b(unr0.b((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.i), 31, this.j.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Option(additionText=");
        sb.append(this.a);
        sb.append(", commonPeriod=");
        sb.append(this.b);
        sb.append(", commonPrice=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", name=");
        sb.append(this.e);
        sb.append(", offerVendorType=");
        sb.append(this.f);
        sb.append(", payload=");
        sb.append(this.g);
        sb.append(", text=");
        sb.append(this.h);
        sb.append(", title=");
        sb.append(this.i);
        sb.append(", optionName=");
        sb.append(this.j);
        sb.append(", plans=");
        return unr0.t(sb, this.k, ')');
    }
}
