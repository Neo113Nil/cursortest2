package com.squareup.cash.directdeposit.viewmodels;

import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/directdeposit/viewmodels/DirectDepositMissingAccountDetailsError;", "Lcom/squareup/cash/observability/types/ReportedError;", "viewmodels"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DirectDepositMissingAccountDetailsError extends ReportedError {
    public static final DirectDepositMissingAccountDetailsError INSTANCE = new DirectDepositMissingAccountDetailsError();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof DirectDepositMissingAccountDetailsError);
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return EmptySet.INSTANCE;
    }

    public final int hashCode() {
        return 1762675566;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "DirectDepositMissingAccountDetailsError";
    }
}
