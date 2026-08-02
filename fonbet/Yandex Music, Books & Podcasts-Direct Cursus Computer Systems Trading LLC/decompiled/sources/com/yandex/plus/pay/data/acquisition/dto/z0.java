package com.yandex.plus.pay.data.acquisition.dto;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.e5b;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class z0 {

    @NotNull
    public static final y0 Companion = new y0();
    public static final arf[] m = {null, null, null, null, null, null, null, null, null, null, null, btf.a(bwf.b, new f(13))};
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

    public z0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Map map) {
        Map map2;
        if (511 != (i & 511)) {
            u7g.V(i, 511, x0.a.getDescriptor());
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
        if ((i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
            this.j = null;
        } else {
            this.j = str10;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str11;
        }
        if ((i & 2048) == 0) {
            map2 = e5b.a;
            map2.getClass();
        } else {
            map2 = map;
        }
        this.l = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Intrinsics.d(this.a, z0Var.a) && Intrinsics.d(this.b, z0Var.b) && Intrinsics.d(this.c, z0Var.c) && Intrinsics.d(this.d, z0Var.d) && Intrinsics.d(this.e, z0Var.e) && Intrinsics.d(this.f, z0Var.f) && Intrinsics.d(this.g, z0Var.g) && Intrinsics.d(this.h, z0Var.h) && Intrinsics.d(this.i, z0Var.i) && Intrinsics.d(this.j, z0Var.j) && Intrinsics.d(this.k, z0Var.k) && Intrinsics.d(this.l, z0Var.l);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
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
        return k5r.p(sb, this.l, ')');
    }
}
