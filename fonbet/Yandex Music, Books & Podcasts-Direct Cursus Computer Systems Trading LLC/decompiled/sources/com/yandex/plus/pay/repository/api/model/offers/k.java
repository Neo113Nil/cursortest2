package com.yandex.plus.pay.repository.api.model.offers;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {
    public final i1 a;
    public final i1 b;
    public final com.yandex.plus.core.data.common.y c;
    public final com.yandex.plus.core.data.common.v d;
    public final String e;

    public k(i1 i1Var, i1 i1Var2, com.yandex.plus.core.data.common.y yVar, com.yandex.plus.core.data.common.v vVar, String str) {
        this.a = i1Var;
        this.b = i1Var2;
        this.c = yVar;
        this.d = vVar;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a.equals(kVar.a) && Intrinsics.d(this.b, kVar.b) && Intrinsics.d(this.c, kVar.c) && this.d.equals(kVar.d) && Intrinsics.d(this.e, kVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i1 i1Var = this.b;
        int hashCode2 = (hashCode + (i1Var == null ? 0 : i1Var.hashCode())) * 31;
        com.yandex.plus.core.data.common.y yVar = this.c;
        int f = com.appsflyer.internal.k.f(this.d, (hashCode2 + (yVar == null ? 0 : yVar.hashCode())) * 31, 31);
        String str = this.e;
        return f + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentPromo(benefitTitle=");
        sb.append(this.a);
        sb.append(", additionalTitle=");
        sb.append(this.b);
        sb.append(", imageUrl=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", paymentMethodId=");
        return dfi.i(sb, this.e, ')');
    }
}
