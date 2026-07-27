package kotlin.text;

import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public final class CatchingFishKtorFlux {
    public final ProgressBar CatchingFishCoroutine;
    public final CatchingFishCustomViewKtor CatchingFishDaggerWebsocket;
    public final CatchingFishWidgetHilt CatchingFishParcelableFAB;
    public final CatchingFishCameraXAdMob CatchingFishReduxKtor;
    public final FrameLayout CatchingFishSnackbar;
    public CatchingFishAppCompatGradle CatchingFishWorkManager;

    public CatchingFishKtorFlux(CatchingFishWidgetHilt catchingFishWidgetHilt, FrameLayout frameLayout, ProgressBar progressBar, CatchingFishCameraXAdMob catchingFishCameraXAdMob, CatchingFishCustomViewKtor catchingFishCustomViewKtor) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishWidgetHilt, "session");
        CatchingFishFirebaseDagger.CatchingFishNavigation(frameLayout, "hostView");
        CatchingFishFirebaseDagger.CatchingFishNavigation(progressBar, "progressBar");
        this.CatchingFishParcelableFAB = catchingFishWidgetHilt;
        this.CatchingFishSnackbar = frameLayout;
        this.CatchingFishCoroutine = progressBar;
        this.CatchingFishReduxKtor = catchingFishCameraXAdMob;
        this.CatchingFishDaggerWebsocket = catchingFishCustomViewKtor;
    }

    public final void CatchingFishParcelableFAB() {
        CatchingFishWidgetHilt catchingFishWidgetHilt = this.CatchingFishParcelableFAB;
        if (catchingFishWidgetHilt.CatchingFishParcelableFAB <= 0) {
            this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB();
            return;
        }
        this.CatchingFishCoroutine.setMax(100);
        catchingFishWidgetHilt.CatchingFishDaggerWebsocket = true;
        CatchingFishAppCompatGradle catchingFishAppCompatGradle = this.CatchingFishWorkManager;
        if (catchingFishAppCompatGradle != null) {
            catchingFishAppCompatGradle.cancel();
        }
        CatchingFishAppCompatGradle catchingFishAppCompatGradle2 = new CatchingFishAppCompatGradle(catchingFishWidgetHilt.CatchingFishParcelableFAB, new CatchingFishPayPalToast(1, this, CatchingFishKtorFlux.class, "handleTick", "handleTick(J)V", 0, 0, 5), new CatchingFishCustomViewKtor(0, this, CatchingFishKtorFlux.class, "handleFinish", "handleFinish()V", 0, 0, 4));
        this.CatchingFishWorkManager = catchingFishAppCompatGradle2;
        catchingFishAppCompatGradle2.start();
    }
}
