package com.squareup.cash.session.backend;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/session/backend/FullSessionWithoutAccountTokenError;", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FullSessionWithoutAccountTokenError extends ReportedError {
    public final Throwable cause;
    public final Set features;
    public final String message;

    public FullSessionWithoutAccountTokenError(Throwable th) {
        th.getClass();
        this.cause = th;
        this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Sessions.INSTANCE);
        this.message = "Missing session_account_token for full session";
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
