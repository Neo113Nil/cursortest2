package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class b1 {

    @NotNull
    public static final i0 Companion = new i0();
    public static final arf[] h = {null, null, null, null, null, btf.a(bwf.b, new f(10)), null};
    public final String a;
    public final String b;
    public final String c;
    public final Long d;
    public final String e;
    public final List f;
    public final h0 g;

    public /* synthetic */ b1(int i, String str, String str2, String str3, Long l, String str4, List list, h0 h0Var) {
        if (16 != (i & 16)) {
            u7g.V(i, 16, e0.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
        this.e = str4;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = h0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Intrinsics.d(this.a, b1Var.a) && Intrinsics.d(this.b, b1Var.b) && Intrinsics.d(this.c, b1Var.c) && Intrinsics.d(this.d, b1Var.d) && Intrinsics.d(this.e, b1Var.e) && Intrinsics.d(this.f, b1Var.f) && Intrinsics.d(this.g, b1Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.d;
        int c = k5r.c((hashCode3 + (l == null ? 0 : l.hashCode())) * 31, 31, this.e);
        List list = this.f;
        int hashCode4 = (c + (list == null ? 0 : list.hashCode())) * 31;
        h0 h0Var = this.g;
        return hashCode4 + (h0Var != null ? h0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlusPayAcquisitionSmartOffersBatchDto(sessionId=" + this.a + ", page=" + this.b + ", mlRequestId=" + this.c + ", configId=" + this.d + ", language=" + this.e + ", smartOffers=" + this.f + ", bdui=" + this.g + ')';
    }
}
