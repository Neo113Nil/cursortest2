package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public final class AllHostsExponentialBackoffPolicy implements ExponentialBackoffPolicy {

    /* renamed from: a, reason: collision with root package name */
    private final ExponentialBackoffDataHolder f7467a;

    public AllHostsExponentialBackoffPolicy(ExponentialBackoffDataHolder exponentialBackoffDataHolder) {
        this.f7467a = exponentialBackoffDataHolder;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy
    public boolean canBeExecuted(RetryPolicyConfig retryPolicyConfig) {
        return this.f7467a.wasLastAttemptLongAgoEnough(retryPolicyConfig);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy
    public void onAllHostsAttemptsFinished(boolean z2) {
        if (z2) {
            this.f7467a.reset();
        } else {
            this.f7467a.updateLastAttemptInfo();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy
    public void onHostAttemptFinished(boolean z2) {
    }
}
