package androidx.camera.core.impl;

import androidx.camera.core.RetryPolicy;
import com.datadog.trace.core.util.SimpleRateLimiter;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class CameraProviderInitRetryPolicy implements RetryPolicy {
    public final /* synthetic */ int $r8$classId;
    public final RetryPolicy mDelegatePolicy;

    public CameraProviderInitRetryPolicy(final long j, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.mDelegatePolicy = new CameraProviderInitRetryPolicy(j, 0);
                break;
            default:
                this.mDelegatePolicy = new TimeoutRetryPolicy(j, new RetryPolicy() { // from class: androidx.camera.core.impl.CameraProviderInitRetryPolicy.1
                    @Override // androidx.camera.core.RetryPolicy
                    public final long getTimeoutInMillis() {
                        return j;
                    }

                    @Override // androidx.camera.core.RetryPolicy
                    public final RetryPolicy.RetryConfig onRetryDecisionRequested(SimpleRateLimiter simpleRateLimiter) {
                        return simpleRateLimiter.capacity == 1 ? RetryPolicy.RetryConfig.NOT_RETRY : RetryPolicy.RetryConfig.DEFAULT_DELAY_RETRY;
                    }
                });
                break;
        }
    }

    @Override // androidx.camera.core.RetryPolicy
    public final long getTimeoutInMillis() {
        switch (this.$r8$classId) {
            case 0:
                return ((TimeoutRetryPolicy) this.mDelegatePolicy).mTimeoutInMillis;
            default:
                return ((TimeoutRetryPolicy) ((CameraProviderInitRetryPolicy) this.mDelegatePolicy).mDelegatePolicy).mTimeoutInMillis;
        }
    }

    @Override // androidx.camera.core.RetryPolicy
    public final RetryPolicy.RetryConfig onRetryDecisionRequested(SimpleRateLimiter simpleRateLimiter) {
        int i = this.$r8$classId;
        RetryPolicy retryPolicy = this.mDelegatePolicy;
        switch (i) {
            case 0:
                return ((TimeoutRetryPolicy) retryPolicy).onRetryDecisionRequested(simpleRateLimiter);
            default:
                if (((TimeoutRetryPolicy) ((CameraProviderInitRetryPolicy) retryPolicy).mDelegatePolicy).onRetryDecisionRequested(simpleRateLimiter).mShouldRetry) {
                    return RetryPolicy.RetryConfig.DEFAULT_DELAY_RETRY;
                }
                Throwable th = (Throwable) simpleRateLimiter.secondsAndCount;
                if (th instanceof CameraValidator$CameraIdListIncorrectException) {
                    StringUtilsKt.e("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    if (((CameraValidator$CameraIdListIncorrectException) th).availableCameraCount > 0) {
                        return RetryPolicy.RetryConfig.COMPLETE_WITHOUT_FAILURE;
                    }
                }
                return RetryPolicy.RetryConfig.NOT_RETRY;
        }
    }
}
