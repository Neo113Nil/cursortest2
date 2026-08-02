package androidx.camera.core;

import androidx.camera.core.impl.CameraProviderInitRetryPolicy;
import androidx.room.TransactorKt;
import com.datadog.trace.core.util.SimpleRateLimiter;

/* loaded from: classes3.dex */
public interface RetryPolicy {
    public static final CameraProviderInitRetryPolicy DEFAULT = new CameraProviderInitRetryPolicy(6000, 1);

    public final class RetryConfig {
        public static final RetryConfig COMPLETE_WITHOUT_FAILURE;
        public final boolean mCompleteWithoutFailure;
        public final long mDelayInMillis;
        public final boolean mShouldRetry;
        public static final RetryConfig NOT_RETRY = new RetryConfig(0, false, false);
        public static final RetryConfig DEFAULT_DELAY_RETRY = new RetryConfig(500, true, false);

        static {
            new RetryConfig(100L, true, false);
            COMPLETE_WITHOUT_FAILURE = new RetryConfig(0L, false, true);
        }

        public RetryConfig(long j, boolean z, boolean z2) {
            this.mShouldRetry = z;
            this.mDelayInMillis = j;
            if (z2) {
                TransactorKt.checkArgument("shouldRetry must be false when completeWithoutFailure is set to true", !z);
            }
            this.mCompleteWithoutFailure = z2;
        }
    }

    static {
        new CameraProviderInitRetryPolicy(6000L, 0);
    }

    long getTimeoutInMillis();

    RetryConfig onRetryDecisionRequested(SimpleRateLimiter simpleRateLimiter);
}
