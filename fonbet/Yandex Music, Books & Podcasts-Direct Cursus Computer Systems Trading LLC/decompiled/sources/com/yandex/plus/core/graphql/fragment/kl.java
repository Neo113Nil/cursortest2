package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;
import defpackage.k5r;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kl {
    public final com.yandex.plus.core.graphql.type.b a;
    public final boolean b;
    public final com.yandex.plus.core.graphql.type.m0 c;
    public final com.yandex.plus.core.graphql.type.n0 d;
    public final ArrayList e;
    public final com.yandex.plus.core.graphql.type.o0 f;
    public final jl g;

    public kl(com.yandex.plus.core.graphql.type.b bVar, boolean z, com.yandex.plus.core.graphql.type.m0 m0Var, com.yandex.plus.core.graphql.type.n0 n0Var, ArrayList arrayList, com.yandex.plus.core.graphql.type.o0 o0Var, jl jlVar) {
        this.a = bVar;
        this.b = z;
        this.c = m0Var;
        this.d = n0Var;
        this.e = arrayList;
        this.f = o0Var;
        this.g = jlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl)) {
            return false;
        }
        kl klVar = (kl) obj;
        return this.a == klVar.a && this.b == klVar.b && this.c == klVar.c && this.d == klVar.d && this.e.equals(klVar.e) && this.f == klVar.f && Intrinsics.d(this.g, klVar.g);
    }

    public final int hashCode() {
        int e = k5r.e(this.a.hashCode() * 31, 31, this.b);
        com.yandex.plus.core.graphql.type.m0 m0Var = this.c;
        int hashCode = (e + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        com.yandex.plus.core.graphql.type.n0 n0Var = this.d;
        int b = dfi.b(this.e, (hashCode + (n0Var == null ? 0 : n0Var.hashCode())) * 31, 31);
        com.yandex.plus.core.graphql.type.o0 o0Var = this.f;
        int hashCode2 = (b + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        jl jlVar = this.g;
        return hashCode2 + (jlVar != null ? jlVar.hashCode() : 0);
    }

    public final String toString() {
        return "Action(actionType=" + this.a + ", silent=" + this.b + ", subscriptionButtonType=" + this.c + ", subscriptionPaymentMethod=" + this.d + ", subscriptionProductFeatures=" + this.e + ", subscriptionWidgetType=" + this.f + ", acquisitionPlatformSubscriptionProperties=" + this.g + ')';
    }
}
