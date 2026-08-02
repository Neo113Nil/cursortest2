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
public final class i {

    @NotNull
    public static final h Companion = new h();
    public static final arf[] e = {btf.a(bwf.b, new com.yandex.plus.pay.data.acquisition.dto.f(17)), null, null, null};
    public final List a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ i(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, g.a.getDescriptor());
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
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.a, iVar.a) && Intrinsics.d(this.b, iVar.b) && Intrinsics.d(this.c, iVar.c) && Intrinsics.d(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClosingOfferRequestDto(offers=");
        sb.append(this.a);
        sb.append(", target=");
        sb.append(this.b);
        sb.append(", eventSessionId=");
        sb.append(this.c);
        sb.append(", language=");
        return dfi.i(sb, this.d, ')');
    }

    public i(String str, String str2, String str3, List list) {
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
