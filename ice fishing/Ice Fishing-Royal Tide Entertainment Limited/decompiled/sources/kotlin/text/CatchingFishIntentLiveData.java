package kotlin.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CatchingFishIntentLiveData implements CatchingFishViewModelRealm {
    public final CatchingFishWidgetContext CatchingFishCoroutine;
    public Handler CatchingFishDaggerWebsocket;
    public final Context CatchingFishParcelableFAB;
    public final Object CatchingFishReduxKtor = new Object();
    public final CatchingFishViewAsyncTask CatchingFishSnackbar;
    public CatchingFishBiometricBundle CatchingFishViewModelFAB;
    public ThreadPoolExecutor CatchingFishViewModelScope;
    public ThreadPoolExecutor CatchingFishWorkManager;

    public CatchingFishIntentLiveData(Context context, CatchingFishViewAsyncTask catchingFishViewAsyncTask) {
        CatchingFishHiltMVPToast.CatchingFishWorkManager(context, "Context cannot be null");
        this.CatchingFishParcelableFAB = context.getApplicationContext();
        this.CatchingFishSnackbar = catchingFishViewAsyncTask;
        this.CatchingFishCoroutine = CatchingFishRoomRealmMVI.CatchingFishReduxKtor;
    }

    public final CatchingFishRetrofitHiltFAB CatchingFishCoroutine() {
        try {
            CatchingFishWidgetContext catchingFishWidgetContext = this.CatchingFishCoroutine;
            Context context = this.CatchingFishParcelableFAB;
            CatchingFishViewAsyncTask catchingFishViewAsyncTask = this.CatchingFishSnackbar;
            catchingFishWidgetContext.getClass();
            Object[] objArr = {catchingFishViewAsyncTask};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            CatchingFishRoomManifest CatchingFishParcelableFAB = CatchingFishGsonStateFlow.CatchingFishParcelableFAB(context, Collections.unmodifiableList(arrayList));
            int i = CatchingFishParcelableFAB.CatchingFishReduxKtor;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            CatchingFishRetrofitHiltFAB[] catchingFishRetrofitHiltFABArr = (CatchingFishRetrofitHiltFAB[]) ((List) CatchingFishParcelableFAB.CatchingFishDaggerWebsocket).get(0);
            if (catchingFishRetrofitHiltFABArr == null || catchingFishRetrofitHiltFABArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return catchingFishRetrofitHiltFABArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    @Override // kotlin.text.CatchingFishViewModelRealm
    public final void CatchingFishParcelableFAB(CatchingFishBiometricBundle catchingFishBiometricBundle) {
        synchronized (this.CatchingFishReduxKtor) {
            this.CatchingFishViewModelFAB = catchingFishBiometricBundle;
        }
        synchronized (this.CatchingFishReduxKtor) {
            try {
                if (this.CatchingFishViewModelFAB == null) {
                    return;
                }
                if (this.CatchingFishWorkManager == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new CatchingFishJUnitStripeAPI("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.CatchingFishViewModelScope = threadPoolExecutor;
                    this.CatchingFishWorkManager = threadPoolExecutor;
                }
                this.CatchingFishWorkManager.execute(new CatchingFishMVPLayout(11, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void CatchingFishSnackbar() {
        synchronized (this.CatchingFishReduxKtor) {
            try {
                this.CatchingFishViewModelFAB = null;
                Handler handler = this.CatchingFishDaggerWebsocket;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.CatchingFishDaggerWebsocket = null;
                ThreadPoolExecutor threadPoolExecutor = this.CatchingFishViewModelScope;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.CatchingFishWorkManager = null;
                this.CatchingFishViewModelScope = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
