package com.yandex.plus.core.graphql.fragment;

import defpackage.f1d;
import defpackage.k5r;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ro {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;
    public final Map f;
    public final String g;
    public final qo h;
    public final oo i;
    public final po j;

    public ro(String str, String str2, String str3, String str4, Map map, Map map2, String str5, qo qoVar, oo ooVar, po poVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
        this.f = map2;
        this.g = str5;
        this.h = qoVar;
        this.i = ooVar;
        this.j = poVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro)) {
            return false;
        }
        ro roVar = (ro) obj;
        return this.a.equals(roVar.a) && Intrinsics.d(this.b, roVar.b) && Intrinsics.d(this.c, roVar.c) && Intrinsics.d(this.d, roVar.d) && Intrinsics.d(this.e, roVar.e) && this.f.equals(roVar.f) && this.g.equals(roVar.g) && this.h.equals(roVar.h) && Intrinsics.d(this.i, roVar.i) && Intrinsics.d(this.j, roVar.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map map = this.e;
        int c = k5r.c(k5r.c(f1d.b(this.f, (hashCode4 + (map == null ? 0 : map.hashCode())) * 31, 31), 31, this.g), 31, this.h.a);
        oo ooVar = this.i;
        int hashCode5 = (c + (ooVar == null ? 0 : ooVar.hashCode())) * 31;
        po poVar = this.j;
        return hashCode5 + (poVar != null ? poVar.hashCode() : 0);
    }

    public final String toString() {
        return "TariffOfferDetails(title=" + this.a + ", text=" + this.b + ", description=" + this.c + ", additionText=" + this.d + ", payload=" + this.e + ", image=" + this.f + ", offerName=" + this.g + ", tariff=" + this.h + ", backgroundTv=" + this.i + ", storePurchaseInfo=" + this.j + ')';
    }
}
