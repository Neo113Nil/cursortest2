package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gd {
    public final fd a;
    public final ed b;
    public final ad c;

    public gd(fd fdVar, ed edVar, ad adVar) {
        this.a = fdVar;
        this.b = edVar;
        this.c = adVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd)) {
            return false;
        }
        gd gdVar = (gd) obj;
        return Intrinsics.d(this.a, gdVar.a) && Intrinsics.d(this.b, gdVar.b) && this.c.equals(gdVar.c);
    }

    public final int hashCode() {
        fd fdVar = this.a;
        int hashCode = (fdVar == null ? 0 : fdVar.a.hashCode()) * 31;
        ed edVar = this.b;
        return this.c.a.hashCode() + ((hashCode + (edVar != null ? edVar.a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PlaqueBalanceWidget(title=" + this.a + ", subtitle=" + this.b + ", balance=" + this.c + ')';
    }
}
