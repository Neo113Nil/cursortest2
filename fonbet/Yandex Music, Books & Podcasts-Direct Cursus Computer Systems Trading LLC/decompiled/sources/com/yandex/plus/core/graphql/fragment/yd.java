package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yd {
    public final com.yandex.plus.core.graphql.type.s a;
    public final wd b;
    public final xd c;

    public yd(com.yandex.plus.core.graphql.type.s sVar, wd wdVar, xd xdVar) {
        this.a = sVar;
        this.b = wdVar;
        this.c = xdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd)) {
            return false;
        }
        yd ydVar = (yd) obj;
        return this.a == ydVar.a && Intrinsics.d(this.b, ydVar.b) && Intrinsics.d(this.c, ydVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        wd wdVar = this.b;
        int hashCode2 = (hashCode + (wdVar == null ? 0 : wdVar.hashCode())) * 31;
        xd xdVar = this.c;
        return hashCode2 + (xdVar != null ? xdVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlaqueColorSettings(type=" + this.a + ", linear=" + this.b + ", radial=" + this.c + ')';
    }
}
