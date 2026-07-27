package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishBiometricToast implements CatchingFishStripeAPIBundle {
    public final long CatchingFishDaggerWebsocket;
    public final CatchingFishRoomPayPalKtor CatchingFishReduxKtor;
    public final CatchingFishKtorMockk CatchingFishViewModelScope;
    public final Object CatchingFishWorkManager;

    public CatchingFishBiometricToast(CatchingFishRoomPayPalKtor catchingFishRoomPayPalKtor, long j, Object obj, CatchingFishKtorMockk catchingFishKtorMockk) {
        this.CatchingFishReduxKtor = catchingFishRoomPayPalKtor;
        this.CatchingFishDaggerWebsocket = j;
        this.CatchingFishWorkManager = obj;
        this.CatchingFishViewModelScope = catchingFishKtorMockk;
    }

    @Override // kotlin.text.CatchingFishStripeAPIBundle
    public final void CatchingFishParcelableFAB() {
        CatchingFishRoomPayPalKtor catchingFishRoomPayPalKtor = this.CatchingFishReduxKtor;
        synchronized (catchingFishRoomPayPalKtor) {
            if (this.CatchingFishDaggerWebsocket < catchingFishRoomPayPalKtor.CatchingFishAnimationMockk()) {
                return;
            }
            Object[] objArr = catchingFishRoomPayPalKtor.CatchingFishCloudMessaging;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(objArr);
            long j = this.CatchingFishDaggerWebsocket;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            CatchingFishRobolectricHilt.CatchingFishViewModelScope(objArr, j, CatchingFishRobolectricHilt.CatchingFishNavigation);
            catchingFishRoomPayPalKtor.CatchingFishFragmentHandler();
        }
    }
}
