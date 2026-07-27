package kotlin.text;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class CatchingFishIntentCoroutine extends CatchingFishToastGradle implements CatchingFishRealmAndroidX {
    public final CatchingFishIntentCoroutine CatchingFishLayout;
    public final boolean CatchingFishViewModelFAB;
    public final String CatchingFishViewModelScope;
    public final Handler CatchingFishWorkManager;

    public CatchingFishIntentCoroutine(Handler handler, String str, boolean z) {
        this.CatchingFishWorkManager = handler;
        this.CatchingFishViewModelScope = str;
        this.CatchingFishViewModelFAB = z;
        this.CatchingFishLayout = z ? this : new CatchingFishIntentCoroutine(handler, str, true);
    }

    @Override // kotlin.text.CatchingFishToastGradle
    public final void CatchingFishCardViewView(CatchingFishManifestMockk catchingFishManifestMockk, Runnable runnable) {
        if (this.CatchingFishWorkManager.post(runnable)) {
            return;
        }
        CatchingFishFragmentFactory(catchingFishManifestMockk, runnable);
    }

    public final void CatchingFishFragmentFactory(CatchingFishManifestMockk catchingFishManifestMockk, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        CatchingFishRoomViewGson catchingFishRoomViewGson = (CatchingFishRoomViewGson) catchingFishManifestMockk.CatchingFishCoroutineFlow(CatchingFishMVPExoPlayer.CatchingFishLayout);
        if (catchingFishRoomViewGson != null) {
            catchingFishRoomViewGson.CatchingFishCoroutine(cancellationException);
        }
        CatchingFishGlideGson catchingFishGlideGson = CatchingFishGoogleMapsHilt.CatchingFishParcelableFAB;
        CatchingFishViewRetrofit.CatchingFishWorkManager.CatchingFishCardViewView(catchingFishManifestMockk, runnable);
    }

    @Override // kotlin.text.CatchingFishToastGradle
    public final boolean CatchingFishMVPRobolectric(CatchingFishManifestMockk catchingFishManifestMockk) {
        return (this.CatchingFishViewModelFAB && CatchingFishFirebaseDagger.CatchingFishOkHttp(Looper.myLooper(), this.CatchingFishWorkManager.getLooper())) ? false : true;
    }

    @Override // kotlin.text.CatchingFishRealmAndroidX
    public final void CatchingFishParcelableFlux(long j, CatchingFishKtorMockk catchingFishKtorMockk) {
        CatchingFishService catchingFishService = new CatchingFishService(22, catchingFishKtorMockk, this, false);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.CatchingFishWorkManager.postDelayed(catchingFishService, j)) {
            catchingFishKtorMockk.CatchingFishDaggerHiltFAB(new CatchingFishKtorBundleKtor(0, this, catchingFishService));
        } else {
            CatchingFishFragmentFactory(catchingFishKtorMockk.CatchingFishViewModelFAB, catchingFishService);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishIntentCoroutine)) {
            return false;
        }
        CatchingFishIntentCoroutine catchingFishIntentCoroutine = (CatchingFishIntentCoroutine) obj;
        return catchingFishIntentCoroutine.CatchingFishWorkManager == this.CatchingFishWorkManager && catchingFishIntentCoroutine.CatchingFishViewModelFAB == this.CatchingFishViewModelFAB;
    }

    public final int hashCode() {
        return System.identityHashCode(this.CatchingFishWorkManager) ^ (this.CatchingFishViewModelFAB ? 1231 : 1237);
    }

    @Override // kotlin.text.CatchingFishToastGradle
    public final String toString() {
        CatchingFishIntentCoroutine catchingFishIntentCoroutine;
        String str;
        CatchingFishGlideGson catchingFishGlideGson = CatchingFishGoogleMapsHilt.CatchingFishParcelableFAB;
        CatchingFishIntentCoroutine catchingFishIntentCoroutine2 = CatchingFishPayPalLayout.CatchingFishParcelableFAB;
        if (this == catchingFishIntentCoroutine2) {
            str = "Dispatchers.Main";
        } else {
            try {
                catchingFishIntentCoroutine = catchingFishIntentCoroutine2.CatchingFishLayout;
            } catch (UnsupportedOperationException unused) {
                catchingFishIntentCoroutine = null;
            }
            str = this == catchingFishIntentCoroutine ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.CatchingFishViewModelScope;
        if (str2 == null) {
            str2 = this.CatchingFishWorkManager.toString();
        }
        return this.CatchingFishViewModelFAB ? CatchingFishMVPLiveData.CatchingFishEspressoTesting(str2, ".immediate") : str2;
    }

    public CatchingFishIntentCoroutine(Handler handler) {
        this(handler, null, false);
    }
}
