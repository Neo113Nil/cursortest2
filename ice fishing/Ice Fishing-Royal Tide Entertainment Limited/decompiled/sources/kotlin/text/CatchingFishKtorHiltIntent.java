package kotlin.text;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class CatchingFishKtorHiltIntent implements CatchingFishMoshiGoogleMaps, Serializable {
    public volatile Object CatchingFishDaggerWebsocket;
    public CatchingFishJUnitGlide CatchingFishReduxKtor;
    public final Object CatchingFishWorkManager;

    public CatchingFishKtorHiltIntent(CatchingFishJUnitGlide catchingFishJUnitGlide) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishJUnitGlide, "initializer");
        this.CatchingFishReduxKtor = catchingFishJUnitGlide;
        this.CatchingFishDaggerWebsocket = CatchingFishWidgetContext.CatchingFishEspressoTesting;
        this.CatchingFishWorkManager = this;
    }

    @Override // kotlin.text.CatchingFishMoshiGoogleMaps
    public final Object getValue() {
        Object obj;
        Object obj2 = this.CatchingFishDaggerWebsocket;
        CatchingFishWidgetContext catchingFishWidgetContext = CatchingFishWidgetContext.CatchingFishEspressoTesting;
        if (obj2 != catchingFishWidgetContext) {
            return obj2;
        }
        synchronized (this.CatchingFishWorkManager) {
            obj = this.CatchingFishDaggerWebsocket;
            if (obj == catchingFishWidgetContext) {
                CatchingFishJUnitGlide catchingFishJUnitGlide = this.CatchingFishReduxKtor;
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishJUnitGlide);
                obj = catchingFishJUnitGlide.CatchingFishParcelableFAB();
                this.CatchingFishDaggerWebsocket = obj;
                this.CatchingFishReduxKtor = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.CatchingFishDaggerWebsocket != CatchingFishWidgetContext.CatchingFishEspressoTesting ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
