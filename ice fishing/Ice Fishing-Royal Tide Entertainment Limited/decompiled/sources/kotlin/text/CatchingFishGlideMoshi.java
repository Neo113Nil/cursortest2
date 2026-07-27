package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGlideMoshi extends CatchingFishRoomToast {
    public final CatchingFishMVIBundle CatchingFishViewModelFAB;

    /* JADX WARN: Multi-variable type inference failed */
    public CatchingFishGlideMoshi(CatchingFishJobSchedulerMVP catchingFishJobSchedulerMVP, CatchingFishLayoutViewPager catchingFishLayoutViewPager, CatchingFishManifestMockk catchingFishManifestMockk, int i, CatchingFishCoroutineToast catchingFishCoroutineToast) {
        super(catchingFishLayoutViewPager, catchingFishManifestMockk, i, catchingFishCoroutineToast);
        this.CatchingFishViewModelFAB = (CatchingFishMVIBundle) catchingFishJobSchedulerMVP;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.text.CatchingFishJobSchedulerMVP, kotlin.text.CatchingFishMVIBundle] */
    @Override // kotlin.text.CatchingFishRoomToast
    public final CatchingFishRoomToast CatchingFishParcelableFAB(CatchingFishManifestMockk catchingFishManifestMockk, int i, CatchingFishCoroutineToast catchingFishCoroutineToast) {
        return new CatchingFishGlideMoshi(this.CatchingFishViewModelFAB, this.CatchingFishViewModelScope, catchingFishManifestMockk, i, catchingFishCoroutineToast);
    }

    @Override // kotlin.text.CatchingFishRoomToast
    public final Object CatchingFishReduxKtor(CatchingFishIntentManifest catchingFishIntentManifest, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishRoomOkHttpJUnit catchingFishRoomOkHttpJUnit = new CatchingFishRoomOkHttpJUnit(this, catchingFishIntentManifest, null);
        CatchingFishLifecycleGlide catchingFishLifecycleGlide = new CatchingFishLifecycleGlide(catchingFishWebsocketGradle, catchingFishWebsocketGradle.getContext());
        Object CatchingFishMutableLiveData = CatchingFishLayoutRoom.CatchingFishMutableLiveData(catchingFishLifecycleGlide, catchingFishLifecycleGlide, catchingFishRoomOkHttpJUnit);
        return CatchingFishMutableLiveData == CatchingFishXMLLayoutMockk.CatchingFishReduxKtor ? CatchingFishMutableLiveData : CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
