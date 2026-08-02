package com.yandex.passport.data.network;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class p3 {

    @NotNull
    public static final o3 Companion = new o3();
    public static final arf[] h = {null, btf.a(bwf.b, new com.yandex.passport.api.exception.l(25)), null, null, null, null, null};
    public final String a;
    public final List b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    public /* synthetic */ p3(int i, String str, List list, String str2, int i2, int i3, String str3, String str4) {
        if (127 != (i & 127)) {
            u7g.V(i, 127, n3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj;
        return Intrinsics.d(this.a, p3Var.a) && Intrinsics.d(this.b, p3Var.b) && Intrinsics.d(this.c, p3Var.c) && this.d == p3Var.d && this.e == p3Var.e && Intrinsics.d(this.f, p3Var.f) && Intrinsics.d(this.g, p3Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + k5r.c(f1d.a(this.e, f1d.a(this.d, k5r.c(k5r.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(action=");
        sb.append(this.a);
        sb.append(", tags=");
        sb.append(this.b);
        sb.append(", reason=");
        sb.append(this.c);
        sb.append(", riskScore=");
        sb.append(this.d);
        sb.append(", ruleScore=");
        sb.append(this.e);
        sb.append(", status=");
        sb.append(this.f);
        sb.append(", txId=");
        return dfi.i(sb, this.g, ')');
    }
}
