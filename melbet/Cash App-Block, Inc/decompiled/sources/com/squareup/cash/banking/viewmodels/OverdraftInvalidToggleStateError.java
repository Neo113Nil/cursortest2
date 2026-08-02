package com.squareup.cash.banking.viewmodels;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.overdraft.OverdraftStatus;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/banking/viewmodels/OverdraftInvalidToggleStateError;", "Lcom/squareup/cash/observability/types/ReportedError;", "viewmodels"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OverdraftInvalidToggleStateError extends ReportedError {
    public final OverdraftStatus status;

    public OverdraftInvalidToggleStateError(OverdraftStatus overdraftStatus) {
        this.status = overdraftStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverdraftInvalidToggleStateError) && Intrinsics.areEqual(this.status, ((OverdraftInvalidToggleStateError) obj).status);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return SetsKt__SetsJVMKt.setOf(ErrorFeature.BankingBenefits.INSTANCE);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Attempted to toggle overdraft but no valid action was available for overdraft status: " + this.status;
    }

    public final int hashCode() {
        OverdraftStatus overdraftStatus = this.status;
        return (overdraftStatus == null ? 0 : overdraftStatus.hashCode()) * 31;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "OverdraftInvalidToggleStateError(status=" + this.status + ", cause=null)";
    }
}
