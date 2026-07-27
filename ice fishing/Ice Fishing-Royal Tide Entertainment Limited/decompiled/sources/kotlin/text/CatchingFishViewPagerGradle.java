package kotlin.text;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class CatchingFishViewPagerGradle extends CatchingFishCloudMessaging implements CatchingFishFluxMVVM, CatchingFishMVIRobolectric {
    public final CatchingFishPicassoCameraX CatchingFishViewModelScope;

    public CatchingFishViewPagerGradle(CatchingFishManifestMockk catchingFishManifestMockk, CatchingFishPicassoCameraX catchingFishPicassoCameraX) {
        super(catchingFishManifestMockk, true);
        this.CatchingFishViewModelScope = catchingFishPicassoCameraX;
    }

    @Override // kotlin.text.CatchingFishReduxCameraX
    public final Object CatchingFish(Object obj) {
        return this.CatchingFishViewModelScope.CatchingFish(obj);
    }

    @Override // kotlin.text.CatchingFishIntentMVP
    public final Object CatchingFishCloudMessaging(CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return this.CatchingFishViewModelScope.CatchingFishCloudMessaging(catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishPicassoView, kotlin.text.CatchingFishRoomViewGson
    public final void CatchingFishCoroutine(CancellationException cancellationException) {
        Object obj = CatchingFishPicassoView.CatchingFishReduxKtor.get(this);
        if (obj instanceof CatchingFishStripeAPIMVI) {
            return;
        }
        if ((obj instanceof CatchingFishGraphQLWidget) && ((CatchingFishGraphQLWidget) obj).CatchingFishDaggerWebsocket()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CatchingFishServiceGlide(CatchingFishCardViewView(), null, this);
        }
        CatchingFishGsonAppCompat(cancellationException);
    }

    @Override // kotlin.text.CatchingFishReduxCameraX
    public final Object CatchingFishFragmentHandler(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return this.CatchingFishViewModelScope.CatchingFishFragmentHandler(obj, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishPicassoView
    public final void CatchingFishGsonAppCompat(CancellationException cancellationException) {
        this.CatchingFishViewModelScope.CatchingFishWorkManager(cancellationException, true);
        CatchingFishParcelableFlux(cancellationException);
    }

    @Override // kotlin.text.CatchingFishCloudMessaging
    public final void CatchingFishNavigationGson(Throwable th, boolean z) {
        if (this.CatchingFishViewModelScope.CatchingFishWorkManager(th, false) || z) {
            return;
        }
        CatchingFishBiometricBundle.CatchingFishDaggerHiltFAB(th, this.CatchingFishWorkManager);
    }

    @Override // kotlin.text.CatchingFishCloudMessaging
    public final void CatchingFishRedux(Object obj) {
        this.CatchingFishViewModelScope.CatchingFishWorkManager(null, false);
    }

    @Override // kotlin.text.CatchingFishIntentMVP
    public final Object CatchingFishUnitTesting() {
        return this.CatchingFishViewModelScope.CatchingFishUnitTesting();
    }
}
