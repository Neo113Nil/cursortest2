package kotlin.text;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class CatchingFishViewRetrofit extends CatchingFishMVIFirebaseHilt implements Executor {
    public static final CatchingFishToastGradle CatchingFishViewModelScope;
    public static final CatchingFishViewRetrofit CatchingFishWorkManager = new CatchingFishViewRetrofit();

    static {
        CatchingFishRoomEspresso catchingFishRoomEspresso = CatchingFishRoomEspresso.CatchingFishWorkManager;
        int i = CatchingFishWidgetWidget.CatchingFishParcelableFAB;
        if (64 >= i) {
            i = 64;
        }
        CatchingFishViewModelScope = catchingFishRoomEspresso.CatchingFishCustomView(CatchingFishHiltMVPToast.CatchingFishHandler("kotlinx.coroutines.io.parallelism", i, 12));
    }

    @Override // kotlin.text.CatchingFishToastGradle
    public final void CatchingFishCardViewView(CatchingFishManifestMockk catchingFishManifestMockk, Runnable runnable) {
        CatchingFishViewModelScope.CatchingFishCardViewView(catchingFishManifestMockk, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        CatchingFishCardViewView(CatchingFishPayPalDataStore.CatchingFishReduxKtor, runnable);
    }

    @Override // kotlin.text.CatchingFishToastGradle
    public final String toString() {
        return "Dispatchers.IO";
    }
}
