package kotlin.text;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CatchingFishOkHttpCoroutine extends CatchingFishAsyncTask implements ScheduledFuture {
    public final ScheduledFuture CatchingFishCloudMessaging;

    public CatchingFishOkHttpCoroutine(CatchingFishGsonToast catchingFishGsonToast) {
        this.CatchingFishCloudMessaging = catchingFishGsonToast.CatchingFishSnackbar(new CatchingFishViewPagerMockk(2, this));
    }

    @Override // kotlin.text.CatchingFishAsyncTask
    public final void CatchingFishSnackbar() {
        ScheduledFuture scheduledFuture = this.CatchingFishCloudMessaging;
        Object obj = this.CatchingFishReduxKtor;
        scheduledFuture.cancel((obj instanceof CatchingFishHandler) && ((CatchingFishHandler) obj).CatchingFishParcelableFAB);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.CatchingFishCloudMessaging.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.CatchingFishCloudMessaging.getDelay(timeUnit);
    }
}
