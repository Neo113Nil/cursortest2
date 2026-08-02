package com.yandex.plus.home.datasource.openapi.models;

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
public final class g7 {

    @NotNull
    public static final f7 Companion = new f7();
    public static final arf[] g;
    public final String a;
    public final String b;
    public final String c;
    public final c5 d;
    public final Map e;
    public final Map f;

    static {
        bwf bwfVar = bwf.b;
        g = new arf[]{null, null, null, null, btf.a(bwfVar, new u6(4)), btf.a(bwfVar, new u6(5))};
    }

    public /* synthetic */ g7(int i, String str, String str2, String str3, c5 c5Var, Map map, Map map2) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, e7.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = c5Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = map;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = map2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7)) {
            return false;
        }
        g7 g7Var = (g7) obj;
        return Intrinsics.d(this.a, g7Var.a) && Intrinsics.d(this.b, g7Var.b) && Intrinsics.d(this.c, g7Var.c) && Intrinsics.d(this.d, g7Var.d) && Intrinsics.d(this.e, g7Var.e) && Intrinsics.d(this.f, g7Var.f);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        c5 c5Var = this.d;
        int hashCode = (c + (c5Var == null ? 0 : c5Var.hashCode())) * 31;
        Map map = this.e;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f;
        return hashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkSimplePlaqueModel(id=");
        sb.append(this.a);
        sb.append(", feedbackToken=");
        sb.append(this.b);
        sb.append(", rootWidgetId=");
        sb.append(this.c);
        sb.append(", notification=");
        sb.append(this.d);
        sb.append(", serviceMeta=");
        sb.append(this.e);
        sb.append(", metricContext=");
        return k5r.p(sb, this.f, ')');
    }
}
