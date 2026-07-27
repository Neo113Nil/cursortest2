package kotlin.text;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishMVVMWorkManager implements Runnable {
    public final /* synthetic */ CatchingFishBundleMVIHilt CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishGsonRetrofit CatchingFishReduxKtor;
    public final /* synthetic */ Runnable CatchingFishViewModelScope;
    public final /* synthetic */ int CatchingFishWorkManager;

    public /* synthetic */ CatchingFishMVVMWorkManager(CatchingFishGsonRetrofit catchingFishGsonRetrofit, CatchingFishBundleMVIHilt catchingFishBundleMVIHilt, int i, Runnable runnable) {
        this.CatchingFishReduxKtor = catchingFishGsonRetrofit;
        this.CatchingFishDaggerWebsocket = catchingFishBundleMVIHilt;
        this.CatchingFishWorkManager = i;
        this.CatchingFishViewModelScope = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final CatchingFishBundleMVIHilt catchingFishBundleMVIHilt = this.CatchingFishDaggerWebsocket;
        final int i = this.CatchingFishWorkManager;
        Runnable runnable = this.CatchingFishViewModelScope;
        final CatchingFishGsonRetrofit catchingFishGsonRetrofit = this.CatchingFishReduxKtor;
        CatchingFishGsonCameraX catchingFishGsonCameraX = catchingFishGsonRetrofit.CatchingFishWorkManager;
        try {
            try {
                CatchingFishOkHttpFirebase catchingFishOkHttpFirebase = catchingFishGsonRetrofit.CatchingFishCoroutine;
                Objects.requireNonNull(catchingFishOkHttpFirebase);
                ((CatchingFishMVIView) catchingFishGsonCameraX).CatchingFishEspressoTesting(new CatchingFishLayoutCoroutine(8, catchingFishOkHttpFirebase));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) catchingFishGsonRetrofit.CatchingFishParcelableFAB.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((CatchingFishMVIView) catchingFishGsonCameraX).CatchingFishEspressoTesting(new CatchingFishHandlerJUnit() { // from class: kotlin.text.CatchingFishFABUnitTesting
                        @Override // kotlin.text.CatchingFishHandlerJUnit
                        public final Object CatchingFishParcelableFAB() {
                            CatchingFishGsonRetrofit.this.CatchingFishReduxKtor.CatchingFishParcelableFAB(catchingFishBundleMVIHilt, i + 1, false);
                            return null;
                        }
                    });
                } else {
                    catchingFishGsonRetrofit.CatchingFishParcelableFAB(catchingFishBundleMVIHilt, i);
                }
                runnable.run();
            } catch (CatchingFishKtorHandler unused) {
                catchingFishGsonRetrofit.CatchingFishReduxKtor.CatchingFishParcelableFAB(catchingFishBundleMVIHilt, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
