package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishBiometricGlide extends CatchingFishCameraXContext {
    public int CatchingFishLayout;
    public float CatchingFishViewModelFAB;
    public final CatchingFishViewWidgetFAB CatchingFishViewModelScope;
    public final CatchingFishRealmGraphQL CatchingFishWorkManager;
    public final CatchingFishAsyncTaskIntent CatchingFishReduxKtor = CatchingFishLayoutRoom.CatchingFishGsonAppCompat(new CatchingFishMVPCameraX(0));
    public final CatchingFishAsyncTaskIntent CatchingFishDaggerWebsocket = CatchingFishLayoutRoom.CatchingFishGsonAppCompat(Boolean.FALSE);

    public CatchingFishBiometricGlide(CatchingFishGlideRoom catchingFishGlideRoom) {
        CatchingFishRealmGraphQL catchingFishRealmGraphQL = new CatchingFishRealmGraphQL(catchingFishGlideRoom);
        catchingFishRealmGraphQL.CatchingFishWorkManager = new CatchingFishViewPagerRedux(14, this);
        this.CatchingFishWorkManager = catchingFishRealmGraphQL;
        this.CatchingFishViewModelScope = new CatchingFishViewWidgetFAB(0);
        this.CatchingFishViewModelFAB = 1.0f;
        this.CatchingFishLayout = -1;
    }

    @Override // kotlin.text.CatchingFishCameraXContext
    public final long CatchingFishCoroutine() {
        return ((CatchingFishMVPCameraX) this.CatchingFishReduxKtor.getValue()).CatchingFishParcelableFAB;
    }

    @Override // kotlin.text.CatchingFishCameraXContext
    public final void CatchingFishParcelableFAB(float f) {
        this.CatchingFishViewModelFAB = f;
    }

    @Override // kotlin.text.CatchingFishCameraXContext
    public final void CatchingFishReduxKtor(CatchingFishDaggerHiltJUnit catchingFishDaggerHiltJUnit) {
        CatchingFishEspressoMoshi catchingFishEspressoMoshi = catchingFishDaggerHiltJUnit.CatchingFishReduxKtor;
        CatchingFishRealmGraphQL catchingFishRealmGraphQL = this.CatchingFishWorkManager;
        CatchingFishFluxIntent catchingFishFluxIntent = (CatchingFishFluxIntent) catchingFishRealmGraphQL.CatchingFishViewModelScope.getValue();
        if (((Boolean) this.CatchingFishDaggerWebsocket.getValue()).booleanValue() && catchingFishDaggerHiltJUnit.getLayoutDirection() == CatchingFishGradleMVPKtor.CatchingFishDaggerWebsocket) {
            long CatchingFishCardViewView = catchingFishEspressoMoshi.CatchingFishCardViewView();
            CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = catchingFishEspressoMoshi.CatchingFishDaggerWebsocket;
            long CatchingFishDagger = catchingFishAsyncTaskDagger.CatchingFishDagger();
            catchingFishAsyncTaskDagger.CatchingFishCardViewView().CatchingFishCloudMessaging();
            try {
                ((CatchingFishServiceHilt) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket).CatchingFishGsonAppCompat(-1.0f, 1.0f, CatchingFishCardViewView);
                catchingFishRealmGraphQL.CatchingFishDaggerWebsocket(catchingFishDaggerHiltJUnit, this.CatchingFishViewModelFAB, catchingFishFluxIntent);
            } finally {
                catchingFishAsyncTaskDagger.CatchingFishCardViewView().CatchingFishLayout();
                catchingFishAsyncTaskDagger.CatchingFishCustomViewJUnit(CatchingFishDagger);
            }
        } else {
            catchingFishRealmGraphQL.CatchingFishDaggerWebsocket(catchingFishDaggerHiltJUnit, this.CatchingFishViewModelFAB, catchingFishFluxIntent);
        }
        this.CatchingFishLayout = this.CatchingFishViewModelScope.CatchingFishViewModelScope();
    }
}
