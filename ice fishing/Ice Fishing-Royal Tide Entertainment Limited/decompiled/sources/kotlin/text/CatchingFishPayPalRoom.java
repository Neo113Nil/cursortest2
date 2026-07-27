package kotlin.text;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class CatchingFishPayPalRoom extends CatchingFishRoomMVI implements CatchingFishSpannableRedux, CatchingFishWebsocketGradle {
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishCloudMessaging = AtomicReferenceFieldUpdater.newUpdater(CatchingFishPayPalRoom.class, Object.class, "_reusableCancellableContinuation$volatile");
    public final Object CatchingFishFragmentHandler;
    public Object CatchingFishLayout;
    public final CatchingFishStateFlowGson CatchingFishViewModelFAB;
    public final CatchingFishToastGradle CatchingFishViewModelScope;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    public CatchingFishPayPalRoom(CatchingFishToastGradle catchingFishToastGradle, CatchingFishStateFlowGson catchingFishStateFlowGson) {
        super(-1);
        this.CatchingFishViewModelScope = catchingFishToastGradle;
        this.CatchingFishViewModelFAB = catchingFishStateFlowGson;
        this.CatchingFishLayout = CatchingFishGsonCardView.CatchingFishFragmentHandler;
        this.CatchingFishFragmentHandler = CatchingFishAdMobFAB.CatchingFishPayPalLiveData(catchingFishStateFlowGson.getContext());
    }

    @Override // kotlin.text.CatchingFishRoomMVI
    public final Object CatchingFishFragmentHandler() {
        Object obj = this.CatchingFishLayout;
        this.CatchingFishLayout = CatchingFishGsonCardView.CatchingFishFragmentHandler;
        return obj;
    }

    @Override // kotlin.text.CatchingFishWebsocketGradle
    public final void CatchingFishViewModelFAB(Object obj) {
        Throwable CatchingFishParcelableFAB = CatchingFishMVILayoutBundle.CatchingFishParcelableFAB(obj);
        Object catchingFishStripeAPIMVI = CatchingFishParcelableFAB == null ? obj : new CatchingFishStripeAPIMVI(CatchingFishParcelableFAB, false);
        CatchingFishStateFlowGson catchingFishStateFlowGson = this.CatchingFishViewModelFAB;
        CatchingFishManifestMockk context = catchingFishStateFlowGson.getContext();
        CatchingFishToastGradle catchingFishToastGradle = this.CatchingFishViewModelScope;
        if (catchingFishToastGradle.CatchingFishMVPRobolectric(context)) {
            this.CatchingFishLayout = catchingFishStripeAPIMVI;
            this.CatchingFishWorkManager = 0;
            catchingFishToastGradle.CatchingFishCardViewView(catchingFishStateFlowGson.getContext(), this);
            return;
        }
        CatchingFishReduxMockkView CatchingFishParcelableFAB2 = CatchingFishMVVMOkHttp.CatchingFishParcelableFAB();
        if (CatchingFishParcelableFAB2.CatchingFishWorkManager >= 4294967296L) {
            this.CatchingFishLayout = catchingFishStripeAPIMVI;
            this.CatchingFishWorkManager = 0;
            CatchingFishParcelableFAB2.CatchingFishMutableLiveData(this);
            return;
        }
        CatchingFishParcelableFAB2.CatchingFishPayPalService(true);
        try {
            CatchingFishManifestMockk context2 = catchingFishStateFlowGson.getContext();
            Object CatchingFishRecyclerView = CatchingFishAdMobFAB.CatchingFishRecyclerView(context2, this.CatchingFishFragmentHandler);
            try {
                catchingFishStateFlowGson.CatchingFishViewModelFAB(obj);
                while (CatchingFishParcelableFAB2.CatchingFishEspressoMockk()) {
                }
            } finally {
                CatchingFishAdMobFAB.CatchingFishEspressoMockk(context2, CatchingFishRecyclerView);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // kotlin.text.CatchingFishSpannableRedux
    public final CatchingFishSpannableRedux CatchingFishViewModelScope() {
        return this.CatchingFishViewModelFAB;
    }

    @Override // kotlin.text.CatchingFishWebsocketGradle
    public final CatchingFishManifestMockk getContext() {
        return this.CatchingFishViewModelFAB.getContext();
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.CatchingFishViewModelScope + ", " + CatchingFishBiometricBundle.CatchingFishGradleManifest(this.CatchingFishViewModelFAB) + ']';
    }

    @Override // kotlin.text.CatchingFishRoomMVI
    public final CatchingFishWebsocketGradle CatchingFishCoroutine() {
        return this;
    }
}
