package kotlin.text;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class CatchingFishPayPalViewRealm implements CatchingFishMoshiGoogleMaps, Serializable {
    public Object CatchingFishDaggerWebsocket;
    public CatchingFishViewWebsocket CatchingFishReduxKtor;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.text.CatchingFishJUnitGlide, kotlin.text.CatchingFishViewWebsocket] */
    @Override // kotlin.text.CatchingFishMoshiGoogleMaps
    public final Object getValue() {
        if (this.CatchingFishDaggerWebsocket == CatchingFishWidgetContext.CatchingFishEspressoTesting) {
            ?? r0 = this.CatchingFishReduxKtor;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(r0);
            this.CatchingFishDaggerWebsocket = r0.CatchingFishParcelableFAB();
            this.CatchingFishReduxKtor = null;
        }
        return this.CatchingFishDaggerWebsocket;
    }

    public final String toString() {
        return this.CatchingFishDaggerWebsocket != CatchingFishWidgetContext.CatchingFishEspressoTesting ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
