package androidx.camera.core.impl;

import androidx.camera.core.RetryPolicy;
import androidx.room.TransactorKt;
import com.datadog.trace.core.util.SimpleRateLimiter;

/* loaded from: classes3.dex */
public final class TimeoutRetryPolicy implements RetryPolicy {
    public final RetryPolicy mDelegatePolicy;
    public final long mTimeoutInMillis;

    public TimeoutRetryPolicy(long j, RetryPolicy retryPolicy) {
        TransactorKt.checkArgument("Timeout must be non-negative.", j >= 0);
        this.mTimeoutInMillis = j;
        this.mDelegatePolicy = retryPolicy;
    }

    @Override // androidx.camera.core.RetryPolicy
    public final long getTimeoutInMillis() {
        return this.mTimeoutInMillis;
    }

    @Override // androidx.camera.core.RetryPolicy
    public final RetryPolicy.RetryConfig onRetryDecisionRequested(SimpleRateLimiter simpleRateLimiter) {
        RetryPolicy.RetryConfig onRetryDecisionRequested = this.mDelegatePolicy.onRetryDecisionRequested(simpleRateLimiter);
        long j = this.mTimeoutInMillis;
        return (j <= 0 || simpleRateLimiter.startNanos < j - onRetryDecisionRequested.mDelayInMillis) ? onRetryDecisionRequested : RetryPolicy.RetryConfig.NOT_RETRY;
    }
}
