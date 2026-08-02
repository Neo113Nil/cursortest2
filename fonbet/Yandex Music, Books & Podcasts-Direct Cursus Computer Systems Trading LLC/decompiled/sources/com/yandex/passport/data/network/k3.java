package com.yandex.passport.data.network;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.tlm;
import defpackage.u7g;
import defpackage.vhp;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class k3 {

    @NotNull
    public static final j3 Companion = new j3();
    public static final arf[] l = {null, null, null, null, null, null, btf.a(bwf.b, new com.yandex.passport.api.exception.l(24)), null, null};
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final UUID k;

    public /* synthetic */ k3(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, UUID uuid) {
        if (254 != (i & 254)) {
            u7g.V(i, 254, i3.a.getDescriptor());
            throw null;
        }
        this.a = new com.yandex.passport.data.models.g(1);
        this.b = 0L;
        this.c = (i & 1) == 0 ? ConstantDeviceInfo.APP_PLATFORM : str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        if ((i & 256) != 0) {
            this.k = uuid;
            return;
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.k = randomUUID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return Intrinsics.d(this.a, k3Var.a) && this.b == k3Var.b && Intrinsics.d(this.c, k3Var.c) && Intrinsics.d(this.d, k3Var.d) && Intrinsics.d(this.e, k3Var.e) && Intrinsics.d(this.f, k3Var.f) && Intrinsics.d(this.g, k3Var.g) && Intrinsics.d(this.h, k3Var.h) && Intrinsics.d(this.i, k3Var.i) && Intrinsics.d(this.j, k3Var.j) && Intrinsics.d(this.k, k3Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(k5r.c(tlm.c(this.b, Integer.hashCode(this.a.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", os=");
        sb.append(this.c);
        sb.append(", osVersion=");
        sb.append(this.d);
        sb.append(", appId=");
        sb.append(this.e);
        sb.append(", appVersion=");
        sb.append(this.f);
        sb.append(", passportVersion=");
        sb.append(this.g);
        sb.append(", uid=");
        sb.append(this.h);
        sb.append(", returnUrl=");
        com.appsflyer.internal.k.y(sb, this.i, ", clientTokenString=");
        sb.append(this.j);
        sb.append(", extUuid=");
        sb.append(this.k);
        sb.append(')');
        return sb.toString();
    }

    public k3(com.yandex.passport.data.models.g gVar, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        str.getClass();
        str2.getClass();
        str4.getClass();
        str5.getClass();
        str7.getClass();
        this.a = gVar;
        this.b = j;
        this.c = ConstantDeviceInfo.APP_PLATFORM;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = randomUUID;
    }
}
