package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishRoomMockkRealm extends CatchingFishStripeAPILayout {
    public final Object CatchingFishCoroutine;
    public final /* synthetic */ int CatchingFishSnackbar = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishRoomMockkRealm(CatchingFishJUnitGlide catchingFishJUnitGlide) {
        super(catchingFishJUnitGlide);
        CatchingFishGradleMVVM catchingFishGradleMVVM = CatchingFishGradleMVVM.CatchingFishJetpackCompose;
        this.CatchingFishCoroutine = catchingFishGradleMVVM;
    }

    @Override // kotlin.text.CatchingFishStripeAPILayout
    public final CatchingFishServiceGraphQL CatchingFishParcelableFAB(Object obj) {
        switch (this.CatchingFishSnackbar) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new CatchingFishServiceGraphQL(this, obj, obj == null, null, true);
            default:
                return new CatchingFishServiceGraphQL(this, obj, obj == null, (CatchingFishWidgetViewPager) this.CatchingFishCoroutine, true);
        }
    }

    @Override // kotlin.text.CatchingFishStripeAPILayout
    public CatchingFishPayPalView CatchingFishSnackbar() {
        switch (this.CatchingFishSnackbar) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (CatchingFishKtorDaggerHilt) this.CatchingFishCoroutine;
            default:
                return super.CatchingFishSnackbar();
        }
    }

    public CatchingFishRoomMockkRealm() {
        super(new CatchingFishMotionLayout(2));
        this.CatchingFishCoroutine = new CatchingFishKtorDaggerHilt();
    }
}
