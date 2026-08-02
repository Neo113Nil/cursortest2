package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ea {
    public final String a;
    public final aa b;
    public final ba c;
    public final ca d;
    public final da e;

    public ea(String str, aa aaVar, ba baVar, ca caVar, da daVar) {
        str.getClass();
        this.a = str;
        this.b = aaVar;
        this.c = baVar;
        this.d = caVar;
        this.e = daVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea)) {
            return false;
        }
        ea eaVar = (ea) obj;
        return Intrinsics.d(this.a, eaVar.a) && Intrinsics.d(this.b, eaVar.b) && Intrinsics.d(this.c, eaVar.c) && Intrinsics.d(this.d, eaVar.d) && Intrinsics.d(this.e, eaVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        aa aaVar = this.b;
        int hashCode2 = (hashCode + (aaVar == null ? 0 : aaVar.hashCode())) * 31;
        ba baVar = this.c;
        int hashCode3 = (hashCode2 + (baVar == null ? 0 : baVar.hashCode())) * 31;
        ca caVar = this.d;
        int hashCode4 = (hashCode3 + (caVar == null ? 0 : caVar.hashCode())) * 31;
        da daVar = this.e;
        return hashCode4 + (daVar != null ? daVar.hashCode() : 0);
    }

    public final String toString() {
        return "OfferPlan(__typename=" + this.a + ", onIntroPlan=" + this.b + ", onIntroUntilPlan=" + this.c + ", onTrialPlan=" + this.d + ", onTrialUntilPlan=" + this.e + ')';
    }
}
