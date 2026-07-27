package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishLifecycleMVP extends CatchingFishPicassoCameraX {
    public final CatchingFishCoroutineToast CatchingFishUnitTesting;

    public CatchingFishLifecycleMVP(int i, CatchingFishCoroutineToast catchingFishCoroutineToast) {
        super(i);
        this.CatchingFishUnitTesting = catchingFishCoroutineToast;
        if (catchingFishCoroutineToast == CatchingFishCoroutineToast.CatchingFishReduxKtor) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + CatchingFishContextFlux.CatchingFishParcelableFAB(CatchingFishPicassoCameraX.class).CatchingFishSnackbar() + " instead").toString());
        }
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
    }

    @Override // kotlin.text.CatchingFishPicassoCameraX, kotlin.text.CatchingFishReduxCameraX
    public final Object CatchingFish(Object obj) {
        return CatchingFishMutableLiveData(obj, false);
    }

    @Override // kotlin.text.CatchingFishPicassoCameraX
    public final boolean CatchingFishDaggerHiltFAB() {
        return this.CatchingFishUnitTesting == CatchingFishCoroutineToast.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishPicassoCameraX, kotlin.text.CatchingFishReduxCameraX
    public final Object CatchingFishFragmentHandler(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        if (CatchingFishMutableLiveData(obj, true) instanceof CatchingFishStateFlowOkHttp) {
            throw CatchingFishRoomDatabase();
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishMutableLiveData(Object obj, boolean z) {
        CatchingFishCoroutineToast catchingFishCoroutineToast = this.CatchingFishUnitTesting;
        CatchingFishCoroutineToast catchingFishCoroutineToast2 = CatchingFishCoroutineToast.CatchingFishWorkManager;
        CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
        if (catchingFishCoroutineToast == catchingFishCoroutineToast2) {
            Object CatchingFish = super.CatchingFish(obj);
            return (!(CatchingFish instanceof CatchingFishLiveDataGson) || (CatchingFish instanceof CatchingFishStateFlowOkHttp)) ? CatchingFish : catchingFishRealmContext;
        }
        Object obj2 = CatchingFishWebSocketLayout.CatchingFishReduxKtor;
        CatchingFishToastMVVM catchingFishToastMVVM = (CatchingFishToastMVVM) CatchingFishPicassoCameraX.CatchingFishLayout.get(this);
        while (true) {
            long andIncrement = CatchingFishPicassoCameraX.CatchingFishDaggerWebsocket.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(andIncrement, false);
            int i = CatchingFishWebSocketLayout.CatchingFishSnackbar;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (catchingFishToastMVVM.CatchingFishCoroutine != j3) {
                CatchingFishToastMVVM CatchingFishParcelableFAB = CatchingFishPicassoCameraX.CatchingFishParcelableFAB(this, j3, catchingFishToastMVVM);
                if (CatchingFishParcelableFAB != null) {
                    catchingFishToastMVVM = CatchingFishParcelableFAB;
                } else if (CatchingFishCoroutineFlow) {
                    return new CatchingFishStateFlowOkHttp(CatchingFishRoomDatabase());
                }
            }
            int CatchingFishReduxKtor = CatchingFishPicassoCameraX.CatchingFishReduxKtor(this, catchingFishToastMVVM, i2, obj, j, obj2, CatchingFishCoroutineFlow);
            if (CatchingFishReduxKtor == 0) {
                catchingFishToastMVVM.CatchingFishParcelableFAB();
                return catchingFishRealmContext;
            }
            if (CatchingFishReduxKtor == 1) {
                break;
            }
            if (CatchingFishReduxKtor != 2) {
                if (CatchingFishReduxKtor == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (CatchingFishReduxKtor == 4) {
                    if (j < CatchingFishPicassoCameraX.CatchingFishWorkManager.get(this)) {
                        catchingFishToastMVVM.CatchingFishParcelableFAB();
                    }
                    return new CatchingFishStateFlowOkHttp(CatchingFishRoomDatabase());
                }
                if (CatchingFishReduxKtor == 5) {
                    catchingFishToastMVVM.CatchingFishParcelableFAB();
                }
            } else {
                if (CatchingFishCoroutineFlow) {
                    catchingFishToastMVVM.CatchingFishViewModelFAB();
                    return new CatchingFishStateFlowOkHttp(CatchingFishRoomDatabase());
                }
                CatchingFishMVPJUnitMockk catchingFishMVPJUnitMockk = obj2 instanceof CatchingFishMVPJUnitMockk ? (CatchingFishMVPJUnitMockk) obj2 : null;
                if (catchingFishMVPJUnitMockk != null) {
                    catchingFishMVPJUnitMockk.CatchingFishParcelableFAB(catchingFishToastMVVM, i2 + i);
                }
                CatchingFishLayout((catchingFishToastMVVM.CatchingFishCoroutine * j2) + i2);
            }
        }
    }
}
