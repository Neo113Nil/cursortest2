package com.yandex.plus.pay.data.mb.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.c5b;
import defpackage.eta;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class l1 {

    @NotNull
    public static final n Companion = new n();
    public static final arf[] j;
    public final String a;
    public final b1 b;
    public final m c;
    public final List d;
    public final i1 e;
    public final List f;
    public final b0 g;
    public final boolean h;
    public final List i;

    static {
        bwf bwfVar = bwf.b;
        j = new arf[]{null, btf.a(bwfVar, new com.yandex.plus.pay.data.acquisition.dto.f(18)), null, btf.a(bwfVar, new com.yandex.plus.pay.data.acquisition.dto.f(19)), null, btf.a(bwfVar, new com.yandex.plus.pay.data.acquisition.dto.f(20)), null, null, btf.a(bwfVar, new com.yandex.plus.pay.data.acquisition.dto.f(21))};
    }

    public l1(int i, String str, b1 b1Var, m mVar, List list, i1 i1Var, List list2, b0 b0Var, boolean z, List list3) {
        if (71 != (i & 71)) {
            u7g.V(i, 71, j.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = b1Var;
        this.c = mVar;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = i1Var;
        }
        if ((i & 32) == 0) {
            this.f = c5b.a;
        } else {
            this.f = list2;
        }
        this.g = b0Var;
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z;
        }
        if ((i & 256) == 0) {
            this.i = c5b.a;
        } else {
            this.i = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return Intrinsics.d(this.a, l1Var.a) && this.b == l1Var.b && Intrinsics.d(this.c, l1Var.c) && Intrinsics.d(this.d, l1Var.d) && Intrinsics.d(this.e, l1Var.e) && Intrinsics.d(this.f, l1Var.f) && Intrinsics.d(this.g, l1Var.g) && this.h == l1Var.h && Intrinsics.d(this.i, l1Var.i);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        List list = this.d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        i1 i1Var = this.e;
        return this.i.hashCode() + k5r.e((this.g.hashCode() + k5r.d((hashCode2 + (i1Var != null ? i1Var.hashCode() : 0)) * 31, 31, this.f)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompositeOfferDto(positionId=");
        sb.append(this.a);
        sb.append(", structureType=");
        sb.append(this.b);
        sb.append(", asset=");
        sb.append(this.c);
        sb.append(", forActiveOffers=");
        sb.append(this.d);
        sb.append(", tariffOffer=");
        sb.append(this.e);
        sb.append(", optionOffers=");
        sb.append(this.f);
        sb.append(", legalInfo=");
        sb.append(this.g);
        sb.append(", silentInvoiceAvailable=");
        sb.append(this.h);
        sb.append(", invoices=");
        return eta.h(sb, this.i, ')');
    }
}
