package kotlin.text;

import android.app.job.JobParameters;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Process;
import android.os.StrictMode;
import android.util.LongSparseArray;
import androidx.activity.ComponentActivity;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishEspressoFlux implements Runnable {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishEspressoFlux(int i, Object obj, Object obj2) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishWorkManager = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CatchingFishAsyncTaskWidget catchingFishAsyncTaskWidget;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) this.CatchingFishDaggerWebsocket).lambda$trackThirdPartySharing$37((AdjustThirdPartySharing) this.CatchingFishWorkManager);
                return;
            case 1:
                ((ActivityHandler) this.CatchingFishDaggerWebsocket).lambda$new$2((AdjustConfig) this.CatchingFishWorkManager);
                return;
            case 2:
                CatchingFishFirebaseDagger.CatchingFishCardViewRealm((CatchingFishFAB) this.CatchingFishDaggerWebsocket, (LongSparseArray) this.CatchingFishWorkManager);
                return;
            case 3:
                CatchingFishCardViewMVI catchingFishCardViewMVI = (CatchingFishCardViewMVI) this.CatchingFishDaggerWebsocket;
                Runnable runnable = (Runnable) this.CatchingFishWorkManager;
                catchingFishCardViewMVI.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    catchingFishCardViewMVI.CatchingFishParcelableFAB();
                }
            case 4:
                ComponentActivity componentActivity = (ComponentActivity) this.CatchingFishDaggerWebsocket;
                CatchingFishFluxCameraX catchingFishFluxCameraX = (CatchingFishFluxCameraX) this.CatchingFishWorkManager;
                int i = ComponentActivity.CatchingFishParcelableFlux;
                componentActivity.CatchingFishReduxKtor.CatchingFishParcelableFAB(new CatchingFishCameraXIntent(catchingFishFluxCameraX, componentActivity));
                return;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                CatchingFishFABWebSocket catchingFishFABWebSocket = (CatchingFishFABWebSocket) this.CatchingFishDaggerWebsocket;
                CatchingFishLiveDataHandler catchingFishLiveDataHandler = (CatchingFishLiveDataHandler) this.CatchingFishWorkManager;
                if (catchingFishFABWebSocket.CatchingFishSnackbar != CatchingFishFABWebSocket.CatchingFishReduxKtor) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (catchingFishFABWebSocket) {
                    catchingFishAsyncTaskWidget = catchingFishFABWebSocket.CatchingFishParcelableFAB;
                    catchingFishFABWebSocket.CatchingFishParcelableFAB = null;
                    catchingFishFABWebSocket.CatchingFishSnackbar = catchingFishLiveDataHandler;
                }
                catchingFishAsyncTaskWidget.getClass();
                return;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                CatchingFishSnackbarMVI catchingFishSnackbarMVI = (CatchingFishSnackbarMVI) this.CatchingFishDaggerWebsocket;
                CatchingFishLiveDataHandler catchingFishLiveDataHandler2 = (CatchingFishLiveDataHandler) this.CatchingFishWorkManager;
                synchronized (catchingFishSnackbarMVI) {
                    try {
                        if (catchingFishSnackbarMVI.CatchingFishSnackbar == null) {
                            catchingFishSnackbarMVI.CatchingFishParcelableFAB.add(catchingFishLiveDataHandler2);
                        } else {
                            catchingFishSnackbarMVI.CatchingFishSnackbar.add(catchingFishLiveDataHandler2.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                CatchingFishRoomToastView catchingFishRoomToastView = (CatchingFishRoomToastView) this.CatchingFishDaggerWebsocket;
                Runnable runnable2 = (Runnable) this.CatchingFishWorkManager;
                Process.setThreadPriority(catchingFishRoomToastView.CatchingFishCoroutine);
                StrictMode.ThreadPolicy threadPolicy = catchingFishRoomToastView.CatchingFishReduxKtor;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                Callable callable = (Callable) this.CatchingFishDaggerWebsocket;
                CatchingFishViewPagerMockk catchingFishViewPagerMockk = (CatchingFishViewPagerMockk) this.CatchingFishWorkManager;
                try {
                    Object call = callable.call();
                    CatchingFishOkHttpCoroutine catchingFishOkHttpCoroutine = (CatchingFishOkHttpCoroutine) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket;
                    if (call == null) {
                        call = CatchingFishAsyncTask.CatchingFishFragmentHandler;
                    }
                    if (CatchingFishAsyncTask.CatchingFishLayout.CatchingFishEspressoTesting(catchingFishOkHttpCoroutine, null, call)) {
                        CatchingFishAsyncTask.CatchingFishCoroutine(catchingFishOkHttpCoroutine);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    catchingFishViewPagerMockk.CatchingFishSpannableWidget(e);
                    return;
                }
            case 9:
                ((CatchingFishWebSocketIntent) this.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB((Intent) this.CatchingFishWorkManager);
                return;
            case 10:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.CatchingFishDaggerWebsocket;
                CatchingFishAndroidXPayPal catchingFishAndroidXPayPal = (CatchingFishAndroidXPayPal) this.CatchingFishWorkManager;
                CatchingFishMVPMVPViewModel catchingFishMVPMVPViewModel = FirebaseMessaging.CatchingFishCloudMessaging;
                try {
                    catchingFishAndroidXPayPal.CatchingFishParcelableFAB(firebaseMessaging.CatchingFishParcelableFAB());
                    return;
                } catch (Exception e2) {
                    catchingFishAndroidXPayPal.CatchingFishParcelableFAB.CatchingFishCloudMessaging(e2);
                    return;
                }
            case 11:
                CatchingFishKtorCoroutine catchingFishKtorCoroutine = (CatchingFishKtorCoroutine) this.CatchingFishDaggerWebsocket;
                CatchingFishAndroidXPayPal catchingFishAndroidXPayPal2 = (CatchingFishAndroidXPayPal) this.CatchingFishWorkManager;
                try {
                    catchingFishAndroidXPayPal2.CatchingFishParcelableFAB(catchingFishKtorCoroutine.CatchingFishSnackbar());
                    return;
                } catch (Exception e3) {
                    catchingFishAndroidXPayPal2.CatchingFishParcelableFAB.CatchingFishCloudMessaging(e3);
                    return;
                }
            case 12:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.CatchingFishDaggerWebsocket;
                JobParameters jobParameters = (JobParameters) this.CatchingFishWorkManager;
                int i2 = JobInfoSchedulerService.CatchingFishReduxKtor;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            default:
                ((CatchingFishOkHttpFAB) this.CatchingFishDaggerWebsocket).CatchingFishEspressoMockk((Typeface) this.CatchingFishWorkManager);
                return;
        }
    }
}
