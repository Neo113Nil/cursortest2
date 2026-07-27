package kotlin.text;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class CatchingFishRoomMVI extends CatchingFishServiceMoshiMVP {
    public int CatchingFishWorkManager;

    public CatchingFishRoomMVI(int i) {
        super(0L, false);
        this.CatchingFishWorkManager = i;
    }

    public abstract CatchingFishWebsocketGradle CatchingFishCoroutine();

    public abstract Object CatchingFishFragmentHandler();

    public final void CatchingFishLayout(Throwable th) {
        CatchingFishBiometricBundle.CatchingFishDaggerHiltFAB(new CatchingFishManifestHilt("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), CatchingFishCoroutine().getContext());
    }

    public Throwable CatchingFishReduxKtor(Object obj) {
        CatchingFishStripeAPIMVI catchingFishStripeAPIMVI = obj instanceof CatchingFishStripeAPIMVI ? (CatchingFishStripeAPIMVI) obj : null;
        if (catchingFishStripeAPIMVI != null) {
            return catchingFishStripeAPIMVI.CatchingFishParcelableFAB;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r4 = (kotlin.text.CatchingFishRoomViewGson) r5.CatchingFishCoroutineFlow(kotlin.text.CatchingFishMVPExoPlayer.CatchingFishLayout);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            CatchingFishWebsocketGradle CatchingFishCoroutine = CatchingFishCoroutine();
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(CatchingFishCoroutine, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            CatchingFishPayPalRoom catchingFishPayPalRoom = (CatchingFishPayPalRoom) CatchingFishCoroutine;
            CatchingFishStateFlowGson catchingFishStateFlowGson = catchingFishPayPalRoom.CatchingFishViewModelFAB;
            Object obj = catchingFishPayPalRoom.CatchingFishFragmentHandler;
            CatchingFishManifestMockk context = catchingFishStateFlowGson.getContext();
            Object CatchingFishRecyclerView = CatchingFishAdMobFAB.CatchingFishRecyclerView(context, obj);
            CatchingFishRoomViewGson catchingFishRoomViewGson = null;
            CatchingFishToastIntent CatchingFishAnimation = CatchingFishRecyclerView != CatchingFishAdMobFAB.CatchingFishStateLiveData ? CatchingFishRobolectricHilt.CatchingFishAnimation(catchingFishStateFlowGson, context, CatchingFishRecyclerView) : null;
            try {
                CatchingFishManifestMockk context2 = catchingFishStateFlowGson.getContext();
                Object CatchingFishFragmentHandler = CatchingFishFragmentHandler();
                Throwable CatchingFishReduxKtor = CatchingFishReduxKtor(CatchingFishFragmentHandler);
                if (CatchingFishReduxKtor == null) {
                    int i = this.CatchingFishWorkManager;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                }
                if (catchingFishRoomViewGson != null && !catchingFishRoomViewGson.CatchingFishSnackbar()) {
                    CancellationException CatchingFishNavigation = catchingFishRoomViewGson.CatchingFishNavigation();
                    CatchingFishSnackbar(CatchingFishNavigation);
                    catchingFishStateFlowGson.CatchingFishViewModelFAB(CatchingFishDaggerBiometric.CatchingFishViewModelFAB(CatchingFishNavigation));
                } else if (CatchingFishReduxKtor != null) {
                    catchingFishStateFlowGson.CatchingFishViewModelFAB(CatchingFishDaggerBiometric.CatchingFishViewModelFAB(CatchingFishReduxKtor));
                } else {
                    catchingFishStateFlowGson.CatchingFishViewModelFAB(CatchingFishDaggerWebsocket(CatchingFishFragmentHandler));
                }
                if (CatchingFishAnimation != null && !CatchingFishAnimation.CatchingFishDaggerMVVM()) {
                    return;
                }
                CatchingFishAdMobFAB.CatchingFishEspressoMockk(context, CatchingFishRecyclerView);
            } catch (Throwable th) {
                if (CatchingFishAnimation == null || CatchingFishAnimation.CatchingFishDaggerMVVM()) {
                    CatchingFishAdMobFAB.CatchingFishEspressoMockk(context, CatchingFishRecyclerView);
                }
                throw th;
            }
        } catch (Throwable th2) {
            CatchingFishLayout(th2);
        }
    }

    public Object CatchingFishDaggerWebsocket(Object obj) {
        return obj;
    }

    public void CatchingFishSnackbar(CancellationException cancellationException) {
    }
}
