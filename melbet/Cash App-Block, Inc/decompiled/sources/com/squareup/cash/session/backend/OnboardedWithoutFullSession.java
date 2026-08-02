package com.squareup.cash.session.backend;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.protos.franklin.common.SessionStatus;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/session/backend/OnboardedWithoutFullSession;", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OnboardedWithoutFullSession extends ReportedError {
    public final Throwable cause = new Exception();
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Sessions.INSTANCE);
    public final String message;

    public OnboardedWithoutFullSession(SessionStatus sessionStatus) {
        this.message = "Reached end of onboarding with session status: " + sessionStatus;
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
