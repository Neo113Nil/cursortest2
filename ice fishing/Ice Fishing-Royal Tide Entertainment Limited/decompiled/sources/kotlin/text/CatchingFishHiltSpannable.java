package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishHiltSpannable extends CatchingFishWidgetLifecycle implements CatchingFishServiceMoshi, CatchingFishServiceHandler {
    public CatchingFishHiltSpannable(String str, String str2) {
        super(1, CatchingFishMVISharedFlow.class, CatchingFishRetrofitGson.CatchingFishReduxKtor, str, str2);
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        CatchingFishLayout();
        throw null;
    }

    public final void CatchingFishLayout() {
        if (this.CatchingFishFragmentHandler) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        CatchingFishMVVMDataStore CatchingFishViewModelFAB = CatchingFishViewModelFAB();
        if (CatchingFishViewModelFAB == this) {
            throw new CatchingFishManifestHilt("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((CatchingFishHiltSpannable) ((CatchingFishServiceMoshi) CatchingFishViewModelFAB)).CatchingFishLayout();
    }

    @Override // kotlin.text.CatchingFishXMLLayoutBundle
    public final CatchingFishMVVMDataStore CatchingFishWorkManager() {
        CatchingFishContextFlux.CatchingFishParcelableFAB.getClass();
        return this;
    }
}
