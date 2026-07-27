package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishCardViewGlide extends CatchingFishMoshiCameraX {
    public CatchingFishCardViewGlide(CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(catchingFishWebsocketGradle);
        if (catchingFishWebsocketGradle != null && catchingFishWebsocketGradle.getContext() != CatchingFishPayPalDataStore.CatchingFishReduxKtor) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // kotlin.text.CatchingFishWebsocketGradle
    public final CatchingFishManifestMockk getContext() {
        return CatchingFishPayPalDataStore.CatchingFishReduxKtor;
    }
}
