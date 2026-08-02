package com.yandex.plus.pay.data.acquisition.dto;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class e1 {

    @NotNull
    public static final d1 Companion = new d1();
    public static final arf[] k;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final p f;
    public final String g;
    public final d0 h;
    public final x i;
    public final Map j;

    static {
        bwf bwfVar = bwf.b;
        k = new arf[]{null, null, null, null, null, null, null, null, btf.a(bwfVar, new f(14)), btf.a(bwfVar, new f(15))};
    }

    public /* synthetic */ e1(int i, String str, String str2, String str3, String str4, String str5, p pVar, String str6, d0 d0Var, x xVar, Map map) {
        if (227 != (i & 227)) {
            u7g.V(i, 227, c1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        this.f = pVar;
        this.g = str6;
        this.h = d0Var;
        if ((i & 256) == 0) {
            this.i = x.b;
        } else {
            this.i = xVar;
        }
        if ((i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
            this.j = null;
        } else {
            this.j = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Intrinsics.d(this.a, e1Var.a) && Intrinsics.d(this.b, e1Var.b) && Intrinsics.d(this.c, e1Var.c) && Intrinsics.d(this.d, e1Var.d) && Intrinsics.d(this.e, e1Var.e) && Intrinsics.d(this.f, e1Var.f) && Intrinsics.d(this.g, e1Var.g) && Intrinsics.d(this.h, e1Var.h) && this.i == e1Var.i && Intrinsics.d(this.j, e1Var.j);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (this.i.hashCode() + ((this.h.hashCode() + k5r.c(k5r.c((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f.a), 31, this.g)) * 31)) * 31;
        Map map = this.j;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayAcquisitionTariffDto(name=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", additionalText=");
        sb.append(this.e);
        sb.append(", simpleTariffName=");
        sb.append(this.f);
        sb.append(", period=");
        sb.append(this.g);
        sb.append(", price=");
        sb.append(this.h);
        sb.append(", offerVendorType=");
        sb.append(this.i);
        sb.append(", payload=");
        return k5r.p(sb, this.j, ')');
    }
}
