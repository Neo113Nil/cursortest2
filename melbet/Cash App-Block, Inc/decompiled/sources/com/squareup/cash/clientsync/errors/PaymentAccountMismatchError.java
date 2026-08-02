package com.squareup.cash.clientsync.errors;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorImpact;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.protos.franklin.api.Role;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/clientsync/errors/PaymentAccountMismatchError;", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PaymentAccountMismatchError extends ReportedError {
    public final String currentAccountToken;
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.ClientSync.INSTANCE);
    public final ErrorImpact impact = ErrorImpact.FEATURE_FAILURE;
    public final String message;
    public final String mismatchedAccountToken;
    public final Role role;

    public PaymentAccountMismatchError(Role role, String str, String str2) {
        this.role = role;
        this.currentAccountToken = str;
        this.mismatchedAccountToken = str2;
        this.message = "Attempted to insert payment belonging to account " + str2 + " with role " + role + ". Current account is: " + str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentAccountMismatchError)) {
            return false;
        }
        PaymentAccountMismatchError paymentAccountMismatchError = (PaymentAccountMismatchError) obj;
        return this.role == paymentAccountMismatchError.role && Intrinsics.areEqual(this.currentAccountToken, paymentAccountMismatchError.currentAccountToken) && Intrinsics.areEqual(this.mismatchedAccountToken, paymentAccountMismatchError.mismatchedAccountToken);
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final ErrorImpact getImpact() {
        return this.impact;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        Role role = this.role;
        int hashCode = (role == null ? 0 : role.hashCode()) * 31;
        String str = this.currentAccountToken;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mismatchedAccountToken;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentAccountMismatchError(role=");
        sb.append(this.role);
        sb.append(", currentAccountToken=");
        sb.append(this.currentAccountToken);
        sb.append(", mismatchedAccountToken=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.mismatchedAccountToken, ")");
    }
}
