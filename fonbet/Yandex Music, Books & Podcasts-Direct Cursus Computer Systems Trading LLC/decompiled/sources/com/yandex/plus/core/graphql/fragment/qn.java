package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class qn {
    public final pn a;

    public qn(pn pnVar) {
        this.a = pnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qn) && Intrinsics.d(this.a, ((qn) obj).a);
    }

    public final int hashCode() {
        pn pnVar = this.a;
        if (pnVar == null) {
            return 0;
        }
        return pnVar.hashCode();
    }

    public final String toString() {
        return "StorePurchaseInfo(googleOfferReplaceParams=" + this.a + ')';
    }
}
