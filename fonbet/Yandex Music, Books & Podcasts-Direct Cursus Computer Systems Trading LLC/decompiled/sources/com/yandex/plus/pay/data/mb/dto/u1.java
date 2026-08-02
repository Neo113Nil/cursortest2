package com.yandex.plus.pay.data.mb.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class u1 {

    @NotNull
    public static final t1 Companion = new t1();
    public static final arf[] f = {btf.a(bwf.b, new c1(6)), null, null, null, null};
    public final List a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ u1(int i, List list, String str, String str2, String str3, String str4) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, s1.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return Intrinsics.d(this.a, u1Var.a) && Intrinsics.d(this.b, u1Var.b) && Intrinsics.d(this.c, u1Var.c) && Intrinsics.d(this.d, u1Var.d) && Intrinsics.d(this.e, u1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CounterOffersRequestDto(offers=");
        sb.append(this.a);
        sb.append(", target=");
        sb.append(this.b);
        sb.append(", eventSessionId=");
        sb.append(this.c);
        sb.append(", language=");
        sb.append(this.d);
        sb.append(", counterOffersReason=");
        return dfi.i(sb, this.e, ')');
    }

    public u1(String str, String str2, String str3, String str4, List list) {
        list.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }
}
