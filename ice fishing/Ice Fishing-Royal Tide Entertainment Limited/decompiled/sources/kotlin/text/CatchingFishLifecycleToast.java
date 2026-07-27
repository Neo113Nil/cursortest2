package kotlin.text;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class CatchingFishLifecycleToast extends CatchingFishBiometricBundle {
    public final /* synthetic */ CatchingFishBiometricBundle CatchingFishDaggerHiltFAB;
    public final /* synthetic */ ThreadPoolExecutor CatchingFishSpannableWidget;

    public CatchingFishLifecycleToast(CatchingFishBiometricBundle catchingFishBiometricBundle, ThreadPoolExecutor threadPoolExecutor) {
        this.CatchingFishDaggerHiltFAB = catchingFishBiometricBundle;
        this.CatchingFishSpannableWidget = threadPoolExecutor;
    }

    @Override // kotlin.text.CatchingFishBiometricBundle
    public final void CatchingFishCardViewRealm(CatchingFishFluxFluxBundle catchingFishFluxFluxBundle) {
        ThreadPoolExecutor threadPoolExecutor = this.CatchingFishSpannableWidget;
        try {
            this.CatchingFishDaggerHiltFAB.CatchingFishCardViewRealm(catchingFishFluxFluxBundle);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // kotlin.text.CatchingFishBiometricBundle
    public final void CatchingFishGsonAppCompat(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.CatchingFishSpannableWidget;
        try {
            this.CatchingFishDaggerHiltFAB.CatchingFishGsonAppCompat(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
