package com.squareup.cash.history.backend.real;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/history/backend/real/LoyaltyAccountMissingFieldError;", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class LoyaltyAccountMissingFieldError extends ReportedError {
    public final String fieldName = "phone_number";
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Loyalty.INSTANCE);
    public final String message = "loyalty account missing required field phone_number";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoyaltyAccountMissingFieldError) && Intrinsics.areEqual(this.fieldName, ((LoyaltyAccountMissingFieldError) obj).fieldName);
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        return this.fieldName.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LoyaltyAccountMissingFieldError(fieldName=", this.fieldName, ")");
    }
}
