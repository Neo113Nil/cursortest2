package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;
import defpackage.k5r;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a4 {
    public final x3 a;
    public final boolean b;
    public final com.yandex.plus.core.graphql.type.m0 c;
    public final ArrayList d;
    public final String e;
    public final com.yandex.plus.core.graphql.type.n0 f;
    public final com.yandex.plus.core.graphql.type.o0 g;
    public final u3 h;

    public a4(x3 x3Var, boolean z, com.yandex.plus.core.graphql.type.m0 m0Var, ArrayList arrayList, String str, com.yandex.plus.core.graphql.type.n0 n0Var, com.yandex.plus.core.graphql.type.o0 o0Var, u3 u3Var) {
        this.a = x3Var;
        this.b = z;
        this.c = m0Var;
        this.d = arrayList;
        this.e = str;
        this.f = n0Var;
        this.g = o0Var;
        this.h = u3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return Intrinsics.d(this.a, a4Var.a) && this.b == a4Var.b && this.c == a4Var.c && this.d.equals(a4Var.d) && Intrinsics.d(this.e, a4Var.e) && this.f == a4Var.f && this.g == a4Var.g && Intrinsics.d(this.h, a4Var.h);
    }

    public final int hashCode() {
        x3 x3Var = this.a;
        int e = k5r.e((x3Var == null ? 0 : x3Var.hashCode()) * 31, 31, this.b);
        com.yandex.plus.core.graphql.type.m0 m0Var = this.c;
        int b = dfi.b(this.d, (e + (m0Var == null ? 0 : m0Var.hashCode())) * 31, 31);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        com.yandex.plus.core.graphql.type.n0 n0Var = this.f;
        int hashCode2 = (hashCode + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        com.yandex.plus.core.graphql.type.o0 o0Var = this.g;
        int hashCode3 = (hashCode2 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        u3 u3Var = this.h;
        return hashCode3 + (u3Var != null ? u3Var.hashCode() : 0);
    }

    public final String toString() {
        return "OnAction(backgroundColors=" + this.a + ", silent=" + this.b + ", subscriptionButtonType=" + this.c + ", subscriptionProductFeatures=" + this.d + ", subscriptionProductTarget=" + this.e + ", subscriptionPaymentMethod=" + this.f + ", subscriptionWidgetType=" + this.g + ", acquisitionPlatformSubscriptionProperties=" + this.h + ')';
    }
}
