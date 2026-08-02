package com.yandex.plus.bdui.plus.checkout.content.serializer;

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
/* loaded from: classes4.dex */
public final class t0 {

    @NotNull
    public static final s0 Companion = new s0();
    public static final arf[] o;
    public final x1 a;
    public final List b;
    public final String c;
    public final String d;
    public final com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 e;
    public final w0 f;
    public final String g;
    public final String h;
    public final c i;
    public final List j;
    public final String k;
    public final r1 l;
    public final Boolean m;
    public final m0 n;

    static {
        bwf bwfVar = bwf.b;
        o = new arf[]{null, btf.a(bwfVar, new q0(0)), null, null, null, null, null, null, null, btf.a(bwfVar, new q0(1)), null, null, null, null};
    }

    public /* synthetic */ t0(int i, x1 x1Var, List list, String str, String str2, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var, w0 w0Var, String str3, String str4, c cVar, List list2, String str5, r1 r1Var, Boolean bool, m0 m0Var) {
        if (16383 != (i & 16383)) {
            u7g.V(i, 16383, r0.a.getDescriptor());
            throw null;
        }
        this.a = x1Var;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = m1Var;
        this.f = w0Var;
        this.g = str3;
        this.h = str4;
        this.i = cVar;
        this.j = list2;
        this.k = str5;
        this.l = r1Var;
        this.m = bool;
        this.n = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.d(this.a, t0Var.a) && Intrinsics.d(this.b, t0Var.b) && Intrinsics.d(this.c, t0Var.c) && Intrinsics.d(this.d, t0Var.d) && Intrinsics.d(this.e, t0Var.e) && Intrinsics.d(this.f, t0Var.f) && Intrinsics.d(this.g, t0Var.g) && Intrinsics.d(this.h, t0Var.h) && Intrinsics.d(this.i, t0Var.i) && Intrinsics.d(this.j, t0Var.j) && Intrinsics.d(this.k, t0Var.k) && Intrinsics.d(this.l, t0Var.l) && Intrinsics.d(this.m, t0Var.m) && Intrinsics.d(this.n, t0Var.n);
    }

    public final int hashCode() {
        x1 x1Var = this.a;
        int hashCode = (x1Var == null ? 0 : x1Var.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (this.e.hashCode() + k5r.c(k5r.c((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.c), 31, this.d)) * 31;
        w0 w0Var = this.f;
        int c = k5r.c(k5r.c((hashCode2 + (w0Var == null ? 0 : w0Var.hashCode())) * 31, 31, this.g), 31, this.h);
        c cVar = this.i;
        int hashCode3 = (c + (cVar == null ? 0 : cVar.hashCode())) * 31;
        List list2 = this.j;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.k;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        r1 r1Var = this.l;
        int hashCode6 = (hashCode5 + (r1Var == null ? 0 : r1Var.a.hashCode())) * 31;
        Boolean bool = this.m;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        m0 m0Var = this.n;
        return hashCode7 + (m0Var != null ? m0Var.hashCode() : 0);
    }

    public final String toString() {
        return "DataDto(tariff=" + this.a + ", options=" + this.b + ", title=" + this.c + ", paymentText=" + this.d + ", legal=" + this.e + ", mailAgreement=" + this.f + ", nextTitle=" + this.g + ", nextButton=" + this.h + ", user=" + this.i + ", paymentButtonGroups=" + this.j + ", selectedPaymentMethodId=" + this.k + ", paymentPromoLegalInfo=" + this.l + ", showPaymentViaYb=" + this.m + ", additionalOffers=" + this.n + ')';
    }
}
