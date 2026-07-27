package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGraphQLKtor extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ CatchingFishMockkManifest CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishToastLayout CatchingFishViewModelFAB;
    public final /* synthetic */ CatchingFishAppCompatMVI CatchingFishViewModelScope;
    public final /* synthetic */ CatchingFishMVPWidget CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishGraphQLKtor(CatchingFishMockkManifest catchingFishMockkManifest, CatchingFishMVPWidget catchingFishMVPWidget, CatchingFishAppCompatMVI catchingFishAppCompatMVI, CatchingFishToastLayout catchingFishToastLayout) {
        super(1);
        this.CatchingFishDaggerWebsocket = catchingFishMockkManifest;
        this.CatchingFishWorkManager = catchingFishMVPWidget;
        this.CatchingFishViewModelScope = catchingFishAppCompatMVI;
        this.CatchingFishViewModelFAB = catchingFishToastLayout;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        boolean z;
        boolean z2;
        long j;
        Float valueOf;
        boolean z3;
        long longValue = ((Number) obj).longValue();
        CatchingFishLayoutMoshi catchingFishLayoutMoshi = (CatchingFishLayoutMoshi) this.CatchingFishDaggerWebsocket.getValue();
        long longValue2 = catchingFishLayoutMoshi != null ? ((Number) catchingFishLayoutMoshi.getValue()).longValue() : longValue;
        CatchingFishMVPWidget catchingFishMVPWidget = this.CatchingFishWorkManager;
        long j2 = catchingFishMVPWidget.CatchingFishCoroutine;
        CatchingFishFABToast catchingFishFABToast = catchingFishMVPWidget.CatchingFishParcelableFAB;
        CatchingFishToastLayout catchingFishToastLayout = this.CatchingFishViewModelFAB;
        boolean z4 = false;
        int i = 0;
        CatchingFishAppCompatMVI catchingFishAppCompatMVI = this.CatchingFishViewModelScope;
        boolean z5 = true;
        if (j2 == Long.MIN_VALUE || catchingFishAppCompatMVI.CatchingFishReduxKtor != CatchingFishLayoutRoom.CatchingFishUnitTesting(catchingFishToastLayout.CatchingFishParcelableFAB())) {
            catchingFishMVPWidget.CatchingFishCoroutine = longValue;
            int i2 = catchingFishFABToast.CatchingFishWorkManager;
            if (i2 > 0) {
                Object[] objArr = catchingFishFABToast.CatchingFishReduxKtor;
                int i3 = 0;
                do {
                    ((CatchingFishHiltFlux) objArr[i3]).CatchingFishLayout = true;
                    i3++;
                } while (i3 < i2);
            }
            catchingFishAppCompatMVI.CatchingFishReduxKtor = CatchingFishLayoutRoom.CatchingFishUnitTesting(catchingFishToastLayout.CatchingFishParcelableFAB());
        }
        float f = catchingFishAppCompatMVI.CatchingFishReduxKtor;
        if (f == 0.0f) {
            int i4 = catchingFishFABToast.CatchingFishWorkManager;
            if (i4 > 0) {
                Object[] objArr2 = catchingFishFABToast.CatchingFishReduxKtor;
                do {
                    CatchingFishHiltFlux catchingFishHiltFlux = (CatchingFishHiltFlux) objArr2[i];
                    catchingFishHiltFlux.CatchingFishWorkManager.setValue(catchingFishHiltFlux.CatchingFishViewModelScope.CatchingFishCoroutine);
                    catchingFishHiltFlux.CatchingFishLayout = true;
                    i++;
                } while (i < i4);
            }
        } else {
            long j3 = (long) ((longValue2 - catchingFishMVPWidget.CatchingFishCoroutine) / f);
            int i5 = catchingFishFABToast.CatchingFishWorkManager;
            if (i5 > 0) {
                Object[] objArr3 = catchingFishFABToast.CatchingFishReduxKtor;
                int i6 = 0;
                z = true;
                while (true) {
                    CatchingFishHiltFlux catchingFishHiltFlux2 = (CatchingFishHiltFlux) objArr3[i6];
                    if (catchingFishHiltFlux2.CatchingFishViewModelFAB) {
                        z2 = z5;
                    } else {
                        catchingFishHiltFlux2.CatchingFishCloudMessaging.CatchingFishSnackbar.setValue(Boolean.FALSE);
                        if (catchingFishHiltFlux2.CatchingFishLayout) {
                            catchingFishHiltFlux2.CatchingFishLayout = z4;
                            catchingFishHiltFlux2.CatchingFishFragmentHandler = j3;
                        }
                        long j4 = j3 - catchingFishHiltFlux2.CatchingFishFragmentHandler;
                        CatchingFishAdMobNavigation catchingFishAdMobNavigation = catchingFishHiltFlux2.CatchingFishViewModelScope;
                        catchingFishAdMobNavigation.getClass();
                        if (catchingFishAdMobNavigation.CatchingFishViewModelFAB < 0) {
                            catchingFishAdMobNavigation.CatchingFishViewModelFAB = catchingFishAdMobNavigation.CatchingFishParcelableFAB.CatchingFishReduxKtor(catchingFishAdMobNavigation.CatchingFishDaggerWebsocket, catchingFishAdMobNavigation.CatchingFishWorkManager, catchingFishAdMobNavigation.CatchingFishViewModelScope);
                        }
                        if (j4 >= catchingFishAdMobNavigation.CatchingFishViewModelFAB) {
                            valueOf = catchingFishAdMobNavigation.CatchingFishCoroutine;
                            j = j4;
                            z2 = z5;
                        } else {
                            CatchingFishEspressoView CatchingFishParcelableFAB = catchingFishAdMobNavigation.CatchingFishParcelableFAB.CatchingFishParcelableFAB(j4, catchingFishAdMobNavigation.CatchingFishDaggerWebsocket, catchingFishAdMobNavigation.CatchingFishWorkManager, catchingFishAdMobNavigation.CatchingFishViewModelScope);
                            j = j4;
                            int CatchingFishSnackbar = CatchingFishParcelableFAB.CatchingFishSnackbar();
                            int i7 = 0;
                            while (i7 < CatchingFishSnackbar) {
                                if (Float.isNaN(CatchingFishParcelableFAB.CatchingFishParcelableFAB(i7))) {
                                    z3 = z5;
                                    CatchingFishAsyncTaskKtor.CatchingFishSnackbar("AnimationVector cannot contain a NaN. " + CatchingFishParcelableFAB + ". Animation: " + catchingFishAdMobNavigation + ", playTimeNanos: " + j);
                                } else {
                                    z3 = z5;
                                }
                                i7++;
                                z5 = z3;
                            }
                            z2 = z5;
                            catchingFishAdMobNavigation.CatchingFishSnackbar.getClass();
                            valueOf = Float.valueOf(CatchingFishParcelableFAB.CatchingFishParcelableFAB);
                        }
                        catchingFishHiltFlux2.CatchingFishWorkManager.setValue(valueOf);
                        CatchingFishAdMobNavigation catchingFishAdMobNavigation2 = catchingFishHiltFlux2.CatchingFishViewModelScope;
                        catchingFishAdMobNavigation2.getClass();
                        if (catchingFishAdMobNavigation2.CatchingFishViewModelFAB < 0) {
                            catchingFishAdMobNavigation2.CatchingFishViewModelFAB = catchingFishAdMobNavigation2.CatchingFishParcelableFAB.CatchingFishReduxKtor(catchingFishAdMobNavigation2.CatchingFishDaggerWebsocket, catchingFishAdMobNavigation2.CatchingFishWorkManager, catchingFishAdMobNavigation2.CatchingFishViewModelScope);
                        }
                        catchingFishHiltFlux2.CatchingFishViewModelFAB = j >= catchingFishAdMobNavigation2.CatchingFishViewModelFAB ? z2 : false;
                    }
                    if (!catchingFishHiltFlux2.CatchingFishViewModelFAB) {
                        z = false;
                    }
                    i6++;
                    if (i6 >= i5) {
                        break;
                    }
                    z5 = z2;
                    z4 = false;
                }
            } else {
                z = true;
            }
            catchingFishMVPWidget.CatchingFishReduxKtor.setValue(Boolean.valueOf(!z));
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
