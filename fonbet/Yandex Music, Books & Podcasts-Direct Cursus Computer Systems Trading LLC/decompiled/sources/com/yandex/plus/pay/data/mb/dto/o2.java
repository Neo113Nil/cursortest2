package com.yandex.plus.pay.data.mb.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.c5b;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class o2 {

    @NotNull
    public static final k2 Companion = new k2();
    public static final arf[] f = {btf.a(bwf.b, new c1(8)), null, null, null, null};
    public final List a;
    public final String b;
    public final String c;
    public final String d;
    public final n2 e;

    public /* synthetic */ o2(int i, List list, String str, String str2, String str3, n2 n2Var) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, j2.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = n2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return Intrinsics.d(this.a, o2Var.a) && Intrinsics.d(this.b, o2Var.b) && Intrinsics.d(this.c, o2Var.c) && Intrinsics.d(this.d, o2Var.d) && Intrinsics.d(this.e, o2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "PaymentScreenRequestDto(supportedFeatures=" + this.a + ", requestedScreenName=" + this.b + ", language=" + this.c + ", theme=" + this.d + ", params=" + this.e + ')';
    }

    public o2(c5b c5bVar, String str, String str2, n2 n2Var) {
        c5bVar.getClass();
        str.getClass();
        this.a = c5bVar;
        this.b = "SUCCESS";
        this.c = str;
        this.d = str2;
        this.e = n2Var;
    }
}
