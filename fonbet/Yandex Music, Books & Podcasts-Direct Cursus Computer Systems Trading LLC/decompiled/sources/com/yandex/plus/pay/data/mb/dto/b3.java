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
public final class b3 {

    @NotNull
    public static final a3 Companion = new a3();
    public static final arf[] e = {btf.a(bwf.b, new c1(11)), null, null, null};
    public final List a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ b3(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, z2.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return Intrinsics.d(this.a, b3Var.a) && Intrinsics.d(this.b, b3Var.b) && Intrinsics.d(this.c, b3Var.c) && Intrinsics.d(this.d, b3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PresaleRequestDto(offers=");
        sb.append(this.a);
        sb.append(", target=");
        sb.append(this.b);
        sb.append(", eventSessionId=");
        sb.append(this.c);
        sb.append(", language=");
        return dfi.i(sb, this.d, ')');
    }

    public b3(String str, String str2, String str3, List list) {
        list.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
