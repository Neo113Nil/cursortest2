package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wk {
    public final vk a;
    public final Integer b;
    public final com.yandex.plus.core.graphql.type.t c;
    public final com.yandex.plus.core.graphql.type.z0 d;
    public final Integer e;
    public final com.yandex.plus.core.graphql.type.f1 f;

    public wk(vk vkVar, Integer num, com.yandex.plus.core.graphql.type.t tVar, com.yandex.plus.core.graphql.type.z0 z0Var, Integer num2, com.yandex.plus.core.graphql.type.f1 f1Var) {
        this.a = vkVar;
        this.b = num;
        this.c = tVar;
        this.d = z0Var;
        this.e = num2;
        this.f = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk)) {
            return false;
        }
        wk wkVar = (wk) obj;
        return this.a.equals(wkVar.a) && Intrinsics.d(this.b, wkVar.b) && this.c == wkVar.c && this.d == wkVar.d && Intrinsics.d(this.e, wkVar.e) && this.f == wkVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        com.yandex.plus.core.graphql.type.t tVar = this.c;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        com.yandex.plus.core.graphql.type.z0 z0Var = this.d;
        int hashCode4 = (hashCode3 + (z0Var == null ? 0 : z0Var.hashCode())) * 31;
        Integer num2 = this.e;
        return this.f.hashCode() + ((hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PlaqueWidgetRules(displayRules=" + this.a + ", opacity=" + this.b + ", horizontalRule=" + this.c + ", verticalRule=" + this.d + ", widthFix=" + this.e + ", widthType=" + this.f + ')';
    }
}
