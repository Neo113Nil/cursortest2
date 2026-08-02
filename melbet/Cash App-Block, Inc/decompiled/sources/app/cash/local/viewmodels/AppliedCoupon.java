package app.cash.local.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AppliedCoupon {
    public final String code;

    public AppliedCoupon(String str) {
        str.getClass();
        this.code = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppliedCoupon) && Intrinsics.areEqual(this.code, ((AppliedCoupon) obj).code);
    }

    public final int hashCode() {
        return this.code.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AppliedCoupon(code=", this.code, ")");
    }
}
