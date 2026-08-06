package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;

/* loaded from: classes.dex */
public class ExponentialBackoffDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private final TimePassedChecker f7478a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeProvider f7479b;

    /* renamed from: c, reason: collision with root package name */
    private final HostRetryInfoProvider f7480c;

    /* renamed from: d, reason: collision with root package name */
    private long f7481d;

    /* renamed from: e, reason: collision with root package name */
    private int f7482e;

    /* renamed from: f, reason: collision with root package name */
    private final String f7483f;

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, String str) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker(), str);
    }

    public void reset() {
        this.f7482e = 1;
        this.f7481d = 0L;
        this.f7480c.saveNextSendAttemptNumber(1);
        this.f7480c.saveLastAttemptTimeSeconds(this.f7481d);
    }

    public void updateLastAttemptInfo() {
        long currentTimeSeconds = this.f7479b.currentTimeSeconds();
        this.f7481d = currentTimeSeconds;
        this.f7482e++;
        this.f7480c.saveLastAttemptTimeSeconds(currentTimeSeconds);
        this.f7480c.saveNextSendAttemptNumber(this.f7482e);
    }

    public boolean wasLastAttemptLongAgoEnough(RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j2 = this.f7481d;
            if (j2 != 0) {
                TimePassedChecker timePassedChecker = this.f7478a;
                int i2 = ((1 << (this.f7482e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int i3 = retryPolicyConfig.maxIntervalSeconds;
                if (i2 > i3) {
                    i2 = i3;
                }
                return timePassedChecker.didTimePassSeconds(j2, i2, this.f7483f);
            }
        }
        return true;
    }

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker, String str) {
        this.f7480c = hostRetryInfoProvider;
        this.f7479b = systemTimeProvider;
        this.f7478a = timePassedChecker;
        this.f7481d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f7482e = hostRetryInfoProvider.getNextSendAttemptNumber();
        this.f7483f = "[ExponentialBackoffDataHolder-" + str + "]";
    }
}
