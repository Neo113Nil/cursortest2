package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishToastIntent extends CatchingFishLifecycleGlide {
    public final ThreadLocal CatchingFishViewModelFAB;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatchingFishToastIntent(CatchingFishManifestMockk catchingFishManifestMockk, CatchingFishStateFlowGson catchingFishStateFlowGson) {
        super(catchingFishStateFlowGson, catchingFishManifestMockk.CatchingFishCoroutineFlow(r0) == null ? catchingFishManifestMockk.CatchingFishAnimationMockk(r0) : catchingFishManifestMockk);
        CatchingFishNavigationMockk catchingFishNavigationMockk = CatchingFishNavigationMockk.CatchingFishReduxKtor;
        this.CatchingFishViewModelFAB = new ThreadLocal();
        if (catchingFishStateFlowGson.getContext().CatchingFishCoroutineFlow(CatchingFishWidgetContext.CatchingFishDaggerWebsocket) instanceof CatchingFishToastGradle) {
            return;
        }
        Object CatchingFishRecyclerView = CatchingFishAdMobFAB.CatchingFishRecyclerView(catchingFishManifestMockk, null);
        CatchingFishAdMobFAB.CatchingFishEspressoMockk(catchingFishManifestMockk, CatchingFishRecyclerView);
        CatchingFishMockkOkHttp(catchingFishManifestMockk, CatchingFishRecyclerView);
    }

    public final boolean CatchingFishDaggerMVVM() {
        boolean z = this.threadLocalIsSet && this.CatchingFishViewModelFAB.get() == null;
        this.CatchingFishViewModelFAB.remove();
        return !z;
    }

    public final void CatchingFishMockkOkHttp(CatchingFishManifestMockk catchingFishManifestMockk, Object obj) {
        this.threadLocalIsSet = true;
        this.CatchingFishViewModelFAB.set(new CatchingFishGsonWorkManager(catchingFishManifestMockk, obj));
    }

    @Override // kotlin.text.CatchingFishLifecycleGlide, kotlin.text.CatchingFishPicassoView
    public final void CatchingFishSpannableWidget(Object obj) {
        if (this.threadLocalIsSet) {
            CatchingFishGsonWorkManager catchingFishGsonWorkManager = (CatchingFishGsonWorkManager) this.CatchingFishViewModelFAB.get();
            if (catchingFishGsonWorkManager != null) {
                CatchingFishAdMobFAB.CatchingFishEspressoMockk((CatchingFishManifestMockk) catchingFishGsonWorkManager.CatchingFishReduxKtor, catchingFishGsonWorkManager.CatchingFishDaggerWebsocket);
            }
            this.CatchingFishViewModelFAB.remove();
        }
        Object CatchingFishFragmentFactory = CatchingFishXMLLayoutGlide.CatchingFishFragmentFactory(obj);
        CatchingFishWebsocketGradle catchingFishWebsocketGradle = this.CatchingFishViewModelScope;
        CatchingFishManifestMockk context = catchingFishWebsocketGradle.getContext();
        Object CatchingFishRecyclerView = CatchingFishAdMobFAB.CatchingFishRecyclerView(context, null);
        CatchingFishToastIntent CatchingFishAnimation = CatchingFishRecyclerView != CatchingFishAdMobFAB.CatchingFishStateLiveData ? CatchingFishRobolectricHilt.CatchingFishAnimation(catchingFishWebsocketGradle, context, CatchingFishRecyclerView) : null;
        try {
            this.CatchingFishViewModelScope.CatchingFishViewModelFAB(CatchingFishFragmentFactory);
            if (CatchingFishAnimation == null || CatchingFishAnimation.CatchingFishDaggerMVVM()) {
                CatchingFishAdMobFAB.CatchingFishEspressoMockk(context, CatchingFishRecyclerView);
            }
        } catch (Throwable th) {
            if (CatchingFishAnimation == null || CatchingFishAnimation.CatchingFishDaggerMVVM()) {
                CatchingFishAdMobFAB.CatchingFishEspressoMockk(context, CatchingFishRecyclerView);
            }
            throw th;
        }
    }
}
