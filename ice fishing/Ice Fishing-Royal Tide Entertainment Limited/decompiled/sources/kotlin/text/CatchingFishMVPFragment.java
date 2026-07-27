package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVPFragment implements CatchingFishFirebaseHilt {
    public final /* synthetic */ CatchingFishMVPDaggerHilt CatchingFishParcelableFAB;
    public final CatchingFishFirebaseToast CatchingFishSnackbar;

    public CatchingFishMVPFragment(CatchingFishMVPDaggerHilt catchingFishMVPDaggerHilt, CatchingFishFirebaseToast catchingFishFirebaseToast) {
        this.CatchingFishParcelableFAB = catchingFishMVPDaggerHilt;
        this.CatchingFishSnackbar = catchingFishFirebaseToast;
    }

    @Override // kotlin.text.CatchingFishFirebaseHilt
    public final CatchingFishDaggerHiltMockk CatchingFishParcelableFAB(String str, CatchingFishAdMobService catchingFishAdMobService) {
        return this.CatchingFishParcelableFAB.CatchingFishParcelableFAB(str, catchingFishAdMobService);
    }

    @Override // kotlin.text.CatchingFishFirebaseHilt
    public final Object CatchingFishSnackbar(String str) {
        return this.CatchingFishParcelableFAB.CatchingFishSnackbar(str);
    }
}
