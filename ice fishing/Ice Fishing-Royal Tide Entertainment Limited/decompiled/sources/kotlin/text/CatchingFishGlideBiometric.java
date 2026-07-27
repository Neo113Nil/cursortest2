package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGlideBiometric {
    public final CatchingFishViewMVPAndroidX CatchingFishParcelableFAB;
    public final CatchingFishMVI CatchingFishSnackbar = CatchingFishMVI.CatchingFishMutableLiveData;
    public final CatchingFishMVI CatchingFishCoroutine = CatchingFishMVI.CatchingFishJobScheduler;
    public final CatchingFishMVI CatchingFishReduxKtor = CatchingFishMVI.CatchingFishPayPalService;
    public final CatchingFishMVI CatchingFishDaggerWebsocket = CatchingFishMVI.CatchingFishCardViewView;
    public final CatchingFishMVI CatchingFishWorkManager = CatchingFishMVI.CatchingFishMVPRobolectric;
    public final CatchingFishMVI CatchingFishViewModelScope = CatchingFishMVI.CatchingFishCustomView;
    public final CatchingFishMVI CatchingFishViewModelFAB = CatchingFishMVI.CatchingFishFragmentFactory;

    public CatchingFishGlideBiometric(CatchingFishRoomDaggerHilt catchingFishRoomDaggerHilt) {
        this.CatchingFishParcelableFAB = new CatchingFishViewMVPAndroidX(catchingFishRoomDaggerHilt);
    }

    public final void CatchingFishParcelableFAB(CatchingFishHiltDatabinding catchingFishHiltDatabinding, CatchingFishServiceHandler catchingFishServiceHandler, CatchingFishJUnitGlide catchingFishJUnitGlide) {
        Object obj;
        CatchingFishHandlerRedux catchingFishHandlerRedux;
        CatchingFishViewMVPAndroidX catchingFishViewMVPAndroidX = this.CatchingFishParcelableFAB;
        synchronized (catchingFishViewMVPAndroidX.CatchingFishViewModelScope) {
            CatchingFishFABToast catchingFishFABToast = catchingFishViewMVPAndroidX.CatchingFishWorkManager;
            Object[] objArr = catchingFishFABToast.CatchingFishReduxKtor;
            int i = catchingFishFABToast.CatchingFishWorkManager;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (((CatchingFishHandlerRedux) obj).CatchingFishParcelableFAB == catchingFishServiceHandler) {
                    break;
                } else {
                    i2++;
                }
            }
            catchingFishHandlerRedux = (CatchingFishHandlerRedux) obj;
            if (catchingFishHandlerRedux == null) {
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishServiceHandler, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                CatchingFishLayoutRoomFAB.CatchingFishFragmentHandler(1, catchingFishServiceHandler);
                catchingFishHandlerRedux = new CatchingFishHandlerRedux(catchingFishServiceHandler);
                catchingFishFABToast.CatchingFishSnackbar(catchingFishHandlerRedux);
            }
        }
        CatchingFishHandlerRedux catchingFishHandlerRedux2 = catchingFishViewMVPAndroidX.CatchingFishLayout;
        long j = catchingFishViewMVPAndroidX.CatchingFishFragmentHandler;
        if (j != -1 && j != CatchingFishOkHttpFAB.CatchingFishRoomDatabase()) {
            CatchingFishMVPAndroidXKtor.CatchingFishParcelableFAB("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + CatchingFishOkHttpFAB.CatchingFishRoomDatabase() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            catchingFishViewMVPAndroidX.CatchingFishLayout = catchingFishHandlerRedux;
            catchingFishViewMVPAndroidX.CatchingFishFragmentHandler = CatchingFishOkHttpFAB.CatchingFishRoomDatabase();
            catchingFishHandlerRedux.CatchingFishParcelableFAB(catchingFishHiltDatabinding, catchingFishViewMVPAndroidX.CatchingFishDaggerWebsocket, catchingFishJUnitGlide);
        } finally {
            catchingFishViewMVPAndroidX.CatchingFishLayout = catchingFishHandlerRedux2;
            catchingFishViewMVPAndroidX.CatchingFishFragmentHandler = j;
        }
    }
}
