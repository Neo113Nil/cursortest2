package kotlin.text;

import android.os.CountDownTimer;

/* loaded from: classes.dex */
public final class CatchingFishAppCompatGradle extends CountDownTimer {
    public final CatchingFishPayPalToast CatchingFishParcelableFAB;
    public final CatchingFishCustomViewKtor CatchingFishSnackbar;

    public CatchingFishAppCompatGradle(long j, CatchingFishPayPalToast catchingFishPayPalToast, CatchingFishCustomViewKtor catchingFishCustomViewKtor) {
        super(j, 1000L);
        this.CatchingFishParcelableFAB = catchingFishPayPalToast;
        this.CatchingFishSnackbar = catchingFishCustomViewKtor;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.CatchingFishSnackbar.CatchingFishParcelableFAB();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.CatchingFishParcelableFAB.CatchingFishFragmentHandler(Long.valueOf(j));
    }
}
