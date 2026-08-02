package com.yandex.passport.data.network;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.c5b;
import defpackage.eta;
import defpackage.k5r;
import defpackage.q5b;
import defpackage.su4;
import defpackage.vhp;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class y5 {

    @NotNull
    public static final x5 Companion = new x5();
    public static final arf[] k;
    public final List a;
    public final List b;
    public final String c;
    public final List d;
    public final e6 e;
    public final q5 f;
    public final List g;
    public final Set h;
    public final List i;
    public final List j;

    static {
        bwf bwfVar = bwf.b;
        k = new arf[]{btf.a(bwfVar, new k5(3)), btf.a(bwfVar, new k5(4)), null, btf.a(bwfVar, new k5(5)), null, null, btf.a(bwfVar, new k5(6)), btf.a(bwfVar, new k5(7)), btf.a(bwfVar, new k5(8)), btf.a(bwfVar, new k5(9))};
    }

    public y5(int i, List list, List list2, String str, List list3, e6 e6Var, q5 q5Var, List list4, Set set, List list5, List list6) {
        this.a = (i & 1) == 0 ? c5b.a : list;
        if ((i & 2) == 0) {
            this.b = c5b.a;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = c5b.a;
        } else {
            this.d = list3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = e6Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = q5Var;
        }
        if ((i & 64) == 0) {
            this.g = c5b.a;
        } else {
            this.g = list4;
        }
        if ((i & 128) == 0) {
            this.h = q5b.a;
        } else {
            this.h = set;
        }
        if ((i & 256) == 0) {
            this.i = c5b.a;
        } else {
            this.i = list5;
        }
        if ((i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
            this.j = c5b.a;
        } else {
            this.j = list6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5)) {
            return false;
        }
        y5 y5Var = (y5) obj;
        return Intrinsics.d(this.a, y5Var.a) && Intrinsics.d(this.b, y5Var.b) && Intrinsics.d(this.c, y5Var.c) && Intrinsics.d(this.d, y5Var.d) && Intrinsics.d(this.e, y5Var.e) && Intrinsics.d(this.f, y5Var.f) && Intrinsics.d(this.g, y5Var.g) && Intrinsics.d(this.h, y5Var.h) && Intrinsics.d(this.i, y5Var.i) && Intrinsics.d(this.j, y5Var.j);
    }

    public final int hashCode() {
        int d = k5r.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int d2 = k5r.d((d + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        e6 e6Var = this.e;
        int hashCode = (d2 + (e6Var == null ? 0 : e6Var.hashCode())) * 31;
        q5 q5Var = this.f;
        return this.j.hashCode() + k5r.d(su4.f(this.h, k5r.d((hashCode + (q5Var != null ? q5Var.hashCode() : 0)) * 31, 31, this.g), 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(backends=");
        sb.append(this.a);
        sb.append(", accountManagerConfig=");
        sb.append(this.b);
        sb.append(", whiteListRegex=");
        sb.append(this.c);
        sb.append(", defaultLocations=");
        sb.append(this.d);
        sb.append(", urlTemplatesConfig=");
        sb.append(this.e);
        sb.append(", ebsConfig=");
        sb.append(this.f);
        sb.append(", blockVpnConfig=");
        sb.append(this.g);
        sb.append(", vpnManualMode=");
        sb.append(this.h);
        sb.append(", autoLoginAppParameters=");
        sb.append(this.i);
        sb.append(", autoLoginClientIdParameters=");
        return eta.h(sb, this.j, ')');
    }
}
