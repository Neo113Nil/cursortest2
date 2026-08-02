package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kh {
    public final com.yandex.plus.core.graphql.type.e a;
    public final dh b;
    public final eh c;
    public final ih d;
    public final jh e;
    public final fh f;
    public final gh g;
    public final hh h;

    public kh(com.yandex.plus.core.graphql.type.e eVar, dh dhVar, eh ehVar, ih ihVar, jh jhVar, fh fhVar, gh ghVar, hh hhVar) {
        this.a = eVar;
        this.b = dhVar;
        this.c = ehVar;
        this.d = ihVar;
        this.e = jhVar;
        this.f = fhVar;
        this.g = ghVar;
        this.h = hhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh)) {
            return false;
        }
        kh khVar = (kh) obj;
        return this.a == khVar.a && Intrinsics.d(this.b, khVar.b) && Intrinsics.d(this.c, khVar.c) && Intrinsics.d(this.d, khVar.d) && Intrinsics.d(this.e, khVar.e) && Intrinsics.d(this.f, khVar.f) && Intrinsics.d(this.g, khVar.g) && Intrinsics.d(this.h, khVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dh dhVar = this.b;
        int hashCode2 = (hashCode + (dhVar == null ? 0 : dhVar.hashCode())) * 31;
        eh ehVar = this.c;
        int hashCode3 = (hashCode2 + (ehVar == null ? 0 : Boolean.hashCode(ehVar.a))) * 31;
        ih ihVar = this.d;
        int hashCode4 = (hashCode3 + (ihVar == null ? 0 : Integer.hashCode(ihVar.a))) * 31;
        jh jhVar = this.e;
        int hashCode5 = (hashCode4 + (jhVar == null ? 0 : jhVar.hashCode())) * 31;
        fh fhVar = this.f;
        int hashCode6 = (hashCode5 + (fhVar == null ? 0 : fhVar.hashCode())) * 31;
        gh ghVar = this.g;
        int hashCode7 = (hashCode6 + (ghVar == null ? 0 : ghVar.hashCode())) * 31;
        hh hhVar = this.h;
        return hashCode7 + (hhVar != null ? hhVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlaquePredicate(type=" + this.a + ", argCheckingPredicate=" + this.b + ", booleanLiteralPredicate=" + this.c + ", notPredicate=" + this.d + ", unifyingPredicate=" + this.e + ", comparisonPredicate=" + this.f + ", containsPredicate=" + this.g + ", inSetPredicate=" + this.h + ')';
    }
}
