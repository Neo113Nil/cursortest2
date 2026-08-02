package com.squareup.cash.mri.android;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.util.ForcedLazyKt$forcedLazy$1;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RealComputationalIntegrityChecker {
    public final CoroutineContext computationContext;
    public final ForcedLazyKt$forcedLazy$1 deviceId;
    public final ErrorReporter errorReporter;
    public final SessionManager sessionManager;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/mri/android/RealComputationalIntegrityChecker$ComputationalIntegrityError", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final /* data */ class ComputationalIntegrityError extends ReportedError {
        public final Exception cause;
        public final String message = "Failed to compute integrity check";

        public ComputationalIntegrityError(Exception exc) {
            this.cause = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComputationalIntegrityError)) {
                return false;
            }
            ComputationalIntegrityError computationalIntegrityError = (ComputationalIntegrityError) obj;
            return Intrinsics.areEqual(this.message, computationalIntegrityError.message) && Intrinsics.areEqual(this.cause, computationalIntegrityError.cause);
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.cause;
        }

        @Override // com.squareup.cash.observability.types.FeatureError
        public final Set getFeatures() {
            return SetsKt__SetsJVMKt.setOf(ErrorFeature.Security.INSTANCE);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.cause.hashCode() + (this.message.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "ComputationalIntegrityError(message=" + this.message + ", cause=" + this.cause + ")";
        }
    }

    public RealComputationalIntegrityChecker(SessionManager sessionManager, ForcedLazyKt$forcedLazy$1 forcedLazyKt$forcedLazy$1, CoroutineContext coroutineContext, ErrorReporter errorReporter) {
        this.sessionManager = sessionManager;
        this.deviceId = forcedLazyKt$forcedLazy$1;
        this.computationContext = coroutineContext;
        this.errorReporter = errorReporter;
    }
}
