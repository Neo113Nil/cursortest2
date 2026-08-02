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
public final class d7 implements g {

    @NotNull
    public static final c7 Companion = new c7();
    public static final arf[] e = {null, null, null, btf.a(bwf.b, new u6(3))};
    public final String a;
    public final String b;
    public final String c;
    public final Map d;

    public /* synthetic */ d7(int i, String str, String str2, String str3, Map map) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, b7.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7)) {
            return false;
        }
        d7 d7Var = (d7) obj;
        return Intrinsics.d(this.a, d7Var.a) && Intrinsics.d(this.b, d7Var.b) && Intrinsics.d(this.c, d7Var.c) && Intrinsics.d(this.d, d7Var.d);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Map map = this.d;
        return c + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkServiceSpecificActionModel(actionContext=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", specificType=");
        sb.append(this.c);
        sb.append(", params=");
        return k5r.p(sb, this.d, ')');
    }
}
