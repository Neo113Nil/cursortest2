package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class nj {
    public final String a;
    public final mj b;
    public final lj c;
    public final kj d;
    public final jj e;

    public nj(String str, mj mjVar, lj ljVar, kj kjVar, jj jjVar) {
        str.getClass();
        this.a = str;
        this.b = mjVar;
        this.c = ljVar;
        this.d = kjVar;
        this.e = jjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj)) {
            return false;
        }
        nj njVar = (nj) obj;
        return Intrinsics.d(this.a, njVar.a) && Intrinsics.d(this.b, njVar.b) && Intrinsics.d(this.c, njVar.c) && Intrinsics.d(this.d, njVar.d) && Intrinsics.d(this.e, njVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mj mjVar = this.b;
        int hashCode2 = (hashCode + (mjVar == null ? 0 : mjVar.hashCode())) * 31;
        lj ljVar = this.c;
        int hashCode3 = (hashCode2 + (ljVar == null ? 0 : ljVar.hashCode())) * 31;
        kj kjVar = this.d;
        int hashCode4 = (hashCode3 + (kjVar == null ? 0 : kjVar.hashCode())) * 31;
        jj jjVar = this.e;
        return hashCode4 + (jjVar != null ? jjVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlaqueUnit(__typename=" + this.a + ", onTaxiATTextProperty=" + this.b + ", onTaxiATLinkProperty=" + this.c + ", onTaxiATImageProperty=" + this.d + ", onTaxiATContainer=" + this.e + ')';
    }
}
