package com.squareup.cash.data.activity;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InitiatePaymentResult {
    public final String externalId;
    public final ResponseContext responseContext;
    public final boolean success;

    public InitiatePaymentResult(String str, boolean z, ResponseContext responseContext) {
        str.getClass();
        this.externalId = str;
        this.success = z;
        this.responseContext = responseContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitiatePaymentResult)) {
            return false;
        }
        InitiatePaymentResult initiatePaymentResult = (InitiatePaymentResult) obj;
        return Intrinsics.areEqual(this.externalId, initiatePaymentResult.externalId) && this.success == initiatePaymentResult.success && this.responseContext.equals(initiatePaymentResult.responseContext);
    }

    public final int hashCode() {
        return this.responseContext.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.externalId.hashCode() * 31, 31, this.success);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("InitiatePaymentResult(externalId=", this.externalId, ", success=", ", responseContext=", this.success);
        m1540m.append(this.responseContext);
        m1540m.append(")");
        return m1540m.toString();
    }
}
