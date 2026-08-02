package com.yandex.plus.core.graphql;

import defpackage.dfi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t {
    public final ArrayList a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final List f;
    public final v g;

    public t(ArrayList arrayList, String str, String str2, String str3, ArrayList arrayList2, List list, v vVar) {
        this.a = arrayList;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = arrayList2;
        this.f = list;
        this.g = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a.equals(tVar.a) && Intrinsics.d(this.b, tVar.b) && Intrinsics.d(this.c, tVar.c) && Intrinsics.d(this.d, tVar.d) && this.e.equals(tVar.e) && Intrinsics.d(this.f, tVar.f) && Intrinsics.d(this.g, tVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int b = dfi.b(this.e, (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        List list = this.f;
        int hashCode4 = (b + (list == null ? 0 : list.hashCode())) * 31;
        v vVar = this.g;
        return hashCode4 + (vVar != null ? vVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentMethods(groups=" + this.a + ", mainPaymentMethodId=" + this.b + ", pos=" + this.c + ", trustServiceToken=" + this.d + ", paymentButtons=" + this.e + ", promoBadges=" + this.f + ", promoLegalInfo=" + this.g + ')';
    }
}
