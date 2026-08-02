package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ai {
    public final String a;
    public final zh b;
    public final yh c;
    public final xh d;

    public ai(String str, zh zhVar, yh yhVar, xh xhVar) {
        str.getClass();
        this.a = str;
        this.b = zhVar;
        this.c = yhVar;
        this.d = xhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        return Intrinsics.d(this.a, aiVar.a) && Intrinsics.d(this.b, aiVar.b) && Intrinsics.d(this.c, aiVar.c) && Intrinsics.d(this.d, aiVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zh zhVar = this.b;
        int hashCode2 = (hashCode + (zhVar == null ? 0 : zhVar.hashCode())) * 31;
        yh yhVar = this.c;
        int hashCode3 = (hashCode2 + (yhVar == null ? 0 : yhVar.hashCode())) * 31;
        xh xhVar = this.d;
        return hashCode3 + (xhVar != null ? xhVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlaqueProperty(__typename=" + this.a + ", onTaxiATTextProperty=" + this.b + ", onTaxiATLinkProperty=" + this.c + ", onTaxiATImageProperty=" + this.d + ')';
    }
}
