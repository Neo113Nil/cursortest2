package kotlin.text;

import android.graphics.Path;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishHandlerEspresso extends CatchingFishAdMobLiveData {
    public CatchingFishMoshiRealm CatchingFish;
    public boolean CatchingFishAnimationMockk;
    public float CatchingFishCloudMessaging;
    public float CatchingFishCoroutine = 1.0f;
    public float CatchingFishDaggerWebsocket;
    public float CatchingFishEspressoTesting;
    public float CatchingFishFragmentHandler;
    public final Object CatchingFishJetpackCompose;
    public int CatchingFishLayout;
    public final CatchingFishMoshiRealm CatchingFishNavigation;
    public float CatchingFishOkHttp;
    public List CatchingFishReduxKtor;
    public CatchingFishEspressoBundle CatchingFishRoomDatabase;
    public CatchingFishRobolectricHilt CatchingFishSnackbar;
    public boolean CatchingFishStateLiveData;
    public boolean CatchingFishUnitTesting;
    public int CatchingFishViewModelFAB;
    public CatchingFishRobolectricHilt CatchingFishViewModelScope;
    public float CatchingFishWorkManager;

    public CatchingFishHandlerEspresso() {
        int i = CatchingFishFragmentToast.CatchingFishParcelableFAB;
        this.CatchingFishReduxKtor = CatchingFishViewPagerDagger.CatchingFishReduxKtor;
        this.CatchingFishDaggerWebsocket = 1.0f;
        this.CatchingFishViewModelFAB = 0;
        this.CatchingFishLayout = 0;
        this.CatchingFishFragmentHandler = 4.0f;
        this.CatchingFishEspressoTesting = 1.0f;
        this.CatchingFishUnitTesting = true;
        this.CatchingFishAnimationMockk = true;
        CatchingFishMoshiRealm catchingFishMoshiRealm = new CatchingFishMoshiRealm();
        this.CatchingFishNavigation = catchingFishMoshiRealm;
        this.CatchingFish = catchingFishMoshiRealm;
        this.CatchingFishJetpackCompose = CatchingFishXMLLayoutGlide.CatchingFishCardViewRealm(CatchingFishLayoutAnimation.CatchingFishAnimationMockk);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.text.CatchingFishMoshiGoogleMaps] */
    public final void CatchingFishDaggerWebsocket() {
        float f = this.CatchingFishCloudMessaging;
        CatchingFishMoshiRealm catchingFishMoshiRealm = this.CatchingFishNavigation;
        if (f == 0.0f && this.CatchingFishEspressoTesting == 1.0f) {
            this.CatchingFish = catchingFishMoshiRealm;
            return;
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFish, catchingFishMoshiRealm)) {
            this.CatchingFish = new CatchingFishMoshiRealm();
        } else {
            Path.FillType fillType = this.CatchingFish.CatchingFishParcelableFAB.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.CatchingFish.CatchingFishParcelableFAB.rewind();
            Path path = this.CatchingFish.CatchingFishParcelableFAB;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r0 = this.CatchingFishJetpackCompose;
        ((CatchingFishCardViewMVP) r0.getValue()).CatchingFishParcelableFAB.setPath(catchingFishMoshiRealm != null ? catchingFishMoshiRealm.CatchingFishParcelableFAB : null, false);
        float length = ((CatchingFishCardViewMVP) r0.getValue()).CatchingFishParcelableFAB.getLength();
        float f2 = this.CatchingFishCloudMessaging;
        float f3 = this.CatchingFishOkHttp;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.CatchingFishEspressoTesting + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((CatchingFishCardViewMVP) r0.getValue()).CatchingFishParcelableFAB(f4, f5, this.CatchingFish);
        } else {
            ((CatchingFishCardViewMVP) r0.getValue()).CatchingFishParcelableFAB(f4, length, this.CatchingFish);
            ((CatchingFishCardViewMVP) r0.getValue()).CatchingFishParcelableFAB(0.0f, f5, this.CatchingFish);
        }
    }

    @Override // kotlin.text.CatchingFishAdMobLiveData
    public final void CatchingFishParcelableFAB(CatchingFishPicassoManifest catchingFishPicassoManifest) {
        CatchingFishPicassoManifest catchingFishPicassoManifest2;
        if (this.CatchingFishUnitTesting) {
            CatchingFishToastHiltBundle.CatchingFishCustomView(this.CatchingFishReduxKtor, this.CatchingFishNavigation);
            CatchingFishDaggerWebsocket();
        } else if (this.CatchingFishStateLiveData) {
            CatchingFishDaggerWebsocket();
        }
        this.CatchingFishUnitTesting = false;
        this.CatchingFishStateLiveData = false;
        CatchingFishRobolectricHilt catchingFishRobolectricHilt = this.CatchingFishSnackbar;
        if (catchingFishRobolectricHilt != null) {
            catchingFishPicassoManifest2 = catchingFishPicassoManifest;
            CatchingFishPicassoManifest.CatchingFishWorkManager(catchingFishPicassoManifest2, this.CatchingFish, catchingFishRobolectricHilt, this.CatchingFishCoroutine, null, 56);
        } else {
            catchingFishPicassoManifest2 = catchingFishPicassoManifest;
        }
        CatchingFishRobolectricHilt catchingFishRobolectricHilt2 = this.CatchingFishViewModelScope;
        if (catchingFishRobolectricHilt2 != null) {
            CatchingFishEspressoBundle catchingFishEspressoBundle = this.CatchingFishRoomDatabase;
            if (this.CatchingFishAnimationMockk || catchingFishEspressoBundle == null) {
                catchingFishEspressoBundle = new CatchingFishEspressoBundle(this.CatchingFishWorkManager, this.CatchingFishFragmentHandler, this.CatchingFishViewModelFAB, this.CatchingFishLayout);
                this.CatchingFishRoomDatabase = catchingFishEspressoBundle;
                this.CatchingFishAnimationMockk = false;
            }
            CatchingFishPicassoManifest.CatchingFishWorkManager(catchingFishPicassoManifest2, this.CatchingFish, catchingFishRobolectricHilt2, this.CatchingFishDaggerWebsocket, catchingFishEspressoBundle, 48);
        }
    }

    public final String toString() {
        return this.CatchingFishNavigation.toString();
    }
}
