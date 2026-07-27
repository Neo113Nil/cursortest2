package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class CatchingFishAdMobSnackbar {
    public final /* synthetic */ CarouselLayoutManager CatchingFishCoroutine;
    public final int CatchingFishParcelableFAB;
    public final /* synthetic */ int CatchingFishSnackbar;

    public CatchingFishAdMobSnackbar(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    public final int CatchingFishParcelableFAB() {
        switch (this.CatchingFishSnackbar) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.CatchingFishCoroutine;
                if (carouselLayoutManager.CatchingFishKtor()) {
                    return carouselLayoutManager.CatchingFishUnitTesting;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatchingFishAdMobSnackbar(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.CatchingFishSnackbar = i;
        switch (i) {
            case 1:
                this.CatchingFishCoroutine = carouselLayoutManager;
                this(0);
                break;
            default:
                this.CatchingFishCoroutine = carouselLayoutManager;
                break;
        }
    }
}
