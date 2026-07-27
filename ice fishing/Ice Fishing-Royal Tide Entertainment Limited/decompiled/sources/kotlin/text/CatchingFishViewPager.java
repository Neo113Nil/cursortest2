package kotlin.text;

import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishViewPager extends CatchingFishReduxLayout {
    public final /* synthetic */ CatchingFishReduxRetrofit CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishViewPager(CatchingFishReduxRetrofit catchingFishReduxRetrofit) {
        super(1);
        this.CatchingFishWorkManager = catchingFishReduxRetrofit;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final CatchingFishViewModelIntent CatchingFishViewModelScope(CatchingFishGoogleMapsJUnit catchingFishGoogleMapsJUnit, CatchingFishViewModelIntent catchingFishViewModelIntent) {
        CatchingFishGlideHandler catchingFishGlideHandler = (CatchingFishGlideHandler) this.CatchingFishWorkManager.CatchingFishCardViewView.CatchingFishJobScheduler.CatchingFishViewModelScope;
        if (catchingFishGlideHandler.CatchingFishMotionLayout.CatchingFishRoomDatabase) {
            long CatchingFishStripeAPI = CatchingFishLayoutRoomFAB.CatchingFishStripeAPI(catchingFishGlideHandler.CatchingFishEspressoMockk(0L));
            int i = (int) (CatchingFishStripeAPI >> 32);
            if (i < 0) {
                i = 0;
            }
            int i2 = (int) (CatchingFishStripeAPI & 4294967295L);
            if (i2 < 0) {
                i2 = 0;
            }
            long CatchingFishSensorManager = CatchingFishLayoutRoomFAB.CatchingFishParcelableFlux(catchingFishGlideHandler).CatchingFishSensorManager();
            int i3 = (int) (CatchingFishSensorManager >> 32);
            int i4 = (int) (CatchingFishSensorManager & 4294967295L);
            long j = catchingFishGlideHandler.CatchingFishWorkManager;
            long CatchingFishStripeAPI2 = CatchingFishLayoutRoomFAB.CatchingFishStripeAPI(catchingFishGlideHandler.CatchingFishEspressoMockk((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
            int i5 = i3 - ((int) (CatchingFishStripeAPI2 >> 32));
            if (i5 < 0) {
                i5 = 0;
            }
            int i6 = i4 - ((int) (4294967295L & CatchingFishStripeAPI2));
            int i7 = i6 >= 0 ? i6 : 0;
            if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                return new CatchingFishViewModelIntent(25, CatchingFishHiltBundle.CatchingFishCloudMessaging((CatchingFishReduxPayPal) catchingFishViewModelIntent.CatchingFishDaggerWebsocket, i, i2, i5, i7), CatchingFishHiltBundle.CatchingFishCloudMessaging((CatchingFishReduxPayPal) catchingFishViewModelIntent.CatchingFishWorkManager, i, i2, i5, i7));
            }
        }
        return catchingFishViewModelIntent;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final CatchingFishKtorPicassoMVVM CatchingFishWorkManager(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, List list) {
        return this.CatchingFishWorkManager.CatchingFishEspressoTesting(catchingFishKtorPicassoMVVM);
    }
}
