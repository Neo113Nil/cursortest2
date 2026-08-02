package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ic {
    public final cc a;
    public final ac b;
    public final fc c;
    public final bc d;
    public final String e;

    public ic(cc ccVar, ac acVar, fc fcVar, bc bcVar, String str) {
        this.a = ccVar;
        this.b = acVar;
        this.c = fcVar;
        this.d = bcVar;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic)) {
            return false;
        }
        ic icVar = (ic) obj;
        return this.a.equals(icVar.a) && Intrinsics.d(this.b, icVar.b) && Intrinsics.d(this.c, icVar.c) && this.d.equals(icVar.d) && Intrinsics.d(this.e, icVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ac acVar = this.b;
        int hashCode2 = (hashCode + (acVar == null ? 0 : acVar.hashCode())) * 31;
        fc fcVar = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (fcVar == null ? 0 : fcVar.hashCode())) * 31)) * 31;
        String str = this.e;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentPromoBadge(benefitTitle=");
        sb.append(this.a);
        sb.append(", additionalTitle=");
        sb.append(this.b);
        sb.append(", iconImage=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", paymentMethodId=");
        return dfi.i(sb, this.e, ')');
    }
}
