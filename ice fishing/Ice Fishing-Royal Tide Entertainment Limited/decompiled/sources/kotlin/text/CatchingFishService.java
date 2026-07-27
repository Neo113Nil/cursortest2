package kotlin.text;

import android.app.Application;
import android.graphics.Typeface;
import android.view.View;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustPurchaseVerificationResult;
import com.adjust.sdk.AttributionHandler;
import com.adjust.sdk.AttributionResponseData;
import com.adjust.sdk.EventResponseData;
import com.adjust.sdk.IActivityHandler;
import com.adjust.sdk.LicenseData;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.OnDeeplinkResolvedListener;
import com.adjust.sdk.PackageHandler;
import com.adjust.sdk.PurchaseVerificationHandler;
import com.adjust.sdk.PurchaseVerificationResponseData;
import com.adjust.sdk.ResponseData;
import com.adjust.sdk.SdkClickResponseData;
import com.adjust.sdk.SessionResponseData;
import com.adjust.sdk.TrackingState;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishService implements Runnable {
    public Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishService(int i, Object obj, Object obj2) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishWorkManager = obj;
        this.CatchingFishDaggerWebsocket = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.CatchingFishDaggerWebsocket).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.CatchingFishDaggerWebsocket = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        kotlin.text.CatchingFishLifecycleGradle.CatchingFishLayout.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.CatchingFishDaggerWebsocket), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void CatchingFishParcelableFAB() {
        boolean z = false;
        boolean z2 = false;
        while (true) {
            try {
                synchronized (((CatchingFishLifecycleGradle) this.CatchingFishWorkManager).CatchingFishDaggerWebsocket) {
                    if (!z) {
                        CatchingFishLifecycleGradle catchingFishLifecycleGradle = (CatchingFishLifecycleGradle) this.CatchingFishWorkManager;
                        if (catchingFishLifecycleGradle.CatchingFishWorkManager != 4) {
                            catchingFishLifecycleGradle.CatchingFishViewModelScope++;
                            catchingFishLifecycleGradle.CatchingFishWorkManager = 4;
                            z = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((CatchingFishLifecycleGradle) this.CatchingFishWorkManager).CatchingFishDaggerWebsocket.poll();
                    this.CatchingFishDaggerWebsocket = runnable;
                    if (runnable == null) {
                        ((CatchingFishLifecycleGradle) this.CatchingFishWorkManager).CatchingFishWorkManager = 1;
                    }
                }
                if (!z2) {
                    return;
                }
            } finally {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        CatchingFishFABGradleLayout catchingFishFABGradleLayout;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishRecyclerView catchingFishRecyclerView = (CatchingFishRecyclerView) this.CatchingFishDaggerWebsocket;
                CatchingFishToast catchingFishToast = (CatchingFishToast) this.CatchingFishWorkManager;
                CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = catchingFishToast.CatchingFishWorkManager;
                if (catchingFishSharedFlowAdMob != null && (catchingFishFABGradleLayout = catchingFishSharedFlowAdMob.CatchingFishDaggerWebsocket) != null) {
                    catchingFishFABGradleLayout.CatchingFishWorkManager(catchingFishSharedFlowAdMob);
                }
                View view = (View) catchingFishToast.CatchingFishCloudMessaging;
                if (view != null && view.getWindowToken() != null) {
                    if (!catchingFishRecyclerView.CatchingFishSnackbar()) {
                        if (catchingFishRecyclerView.CatchingFishDaggerWebsocket != null) {
                            catchingFishRecyclerView.CatchingFishReduxKtor(0, 0, false, false);
                        }
                    }
                    catchingFishToast.CatchingFishDaggerHiltFAB = catchingFishRecyclerView;
                }
                catchingFishToast.CatchingFishParcelableFlux = null;
                return;
            case 1:
                ((ActivityHandler) this.CatchingFishWorkManager).launchSessionResponseTasksI((SessionResponseData) this.CatchingFishDaggerWebsocket);
                return;
            case 2:
                ((ActivityHandler) this.CatchingFishWorkManager).launchAttributionResponseTasksI((AttributionResponseData) this.CatchingFishDaggerWebsocket);
                return;
            case 3:
                ((ActivityHandler) this.CatchingFishWorkManager).launchPurchaseVerificationResponseTasksI((PurchaseVerificationResponseData) this.CatchingFishDaggerWebsocket);
                return;
            case 4:
                ((OnDeeplinkResolvedListener) this.CatchingFishDaggerWebsocket).onDeeplinkResolved(((SdkClickResponseData) this.CatchingFishWorkManager).resolvedDeeplink);
                return;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                ((PurchaseVerificationResponseData) this.CatchingFishDaggerWebsocket).activityPackage.getPurchaseVerificationCallback().onVerificationFinished((AdjustPurchaseVerificationResult) this.CatchingFishWorkManager);
                return;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                ((OnDeeplinkResolvedListener) this.CatchingFishDaggerWebsocket).onDeeplinkResolved((String) this.CatchingFishWorkManager);
                return;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                ((ActivityHandler) this.CatchingFishWorkManager).sendLicenseVerificationDataI((LicenseData) this.CatchingFishDaggerWebsocket);
                return;
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                ((ActivityHandler) this.CatchingFishWorkManager).launchEventResponseTasksI((EventResponseData) this.CatchingFishDaggerWebsocket);
                return;
            case 9:
                ((ActivityHandler) this.CatchingFishWorkManager).launchSdkClickResponseTasksI((SdkClickResponseData) this.CatchingFishDaggerWebsocket);
                return;
            case 10:
                ((CatchingFishMVVMContext) this.CatchingFishDaggerWebsocket).CatchingFishReduxKtor = this.CatchingFishWorkManager;
                return;
            case 11:
                ((Application) this.CatchingFishDaggerWebsocket).unregisterActivityLifecycleCallbacks((CatchingFishMVVMContext) this.CatchingFishWorkManager);
                return;
            case 12:
                Object obj = this.CatchingFishWorkManager;
                Object obj2 = this.CatchingFishDaggerWebsocket;
                try {
                    Method method = CatchingFishKtorFragment.CatchingFishReduxKtor;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        CatchingFishKtorFragment.CatchingFishDaggerWebsocket.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 13:
                ((OnAdidReadListener) ((CatchingFishKtorBundle) this.CatchingFishWorkManager).CatchingFishViewModelFAB).onAdidRead((String) this.CatchingFishDaggerWebsocket);
                return;
            case 14:
                ((OnAttributionReadListener) ((CatchingFishKtorBundle) this.CatchingFishWorkManager).CatchingFishViewModelFAB).onAttributionRead((AdjustAttribution) this.CatchingFishDaggerWebsocket);
                return;
            case 15:
                ((AsyncTaskExecutor) ((CatchingFishViewRedux) this.CatchingFishWorkManager).CatchingFishViewModelScope).onPostExecute(this.CatchingFishDaggerWebsocket);
                return;
            case 16:
                AttributionHandler attributionHandler = (AttributionHandler) this.CatchingFishWorkManager;
                weakReference = attributionHandler.activityHandlerWeakRef;
                IActivityHandler iActivityHandler = (IActivityHandler) weakReference.get();
                if (iActivityHandler == null) {
                    return;
                }
                attributionHandler.checkSessionResponseI(iActivityHandler, (SessionResponseData) this.CatchingFishDaggerWebsocket);
                return;
            case 17:
                AttributionHandler attributionHandler2 = (AttributionHandler) this.CatchingFishWorkManager;
                weakReference2 = attributionHandler2.activityHandlerWeakRef;
                IActivityHandler iActivityHandler2 = (IActivityHandler) weakReference2.get();
                if (iActivityHandler2 == null) {
                    return;
                }
                attributionHandler2.checkSdkClickResponseI(iActivityHandler2, (SdkClickResponseData) this.CatchingFishDaggerWebsocket);
                return;
            case 18:
                AttributionHandler attributionHandler3 = (AttributionHandler) this.CatchingFishWorkManager;
                weakReference3 = attributionHandler3.activityHandlerWeakRef;
                IActivityHandler iActivityHandler3 = (IActivityHandler) weakReference3.get();
                if (iActivityHandler3 == null) {
                    return;
                }
                attributionHandler3.checkAttributionResponseI(iActivityHandler3, (AttributionResponseData) this.CatchingFishDaggerWebsocket);
                return;
            case 19:
                AttributionHandler attributionHandler4 = (AttributionHandler) this.CatchingFishWorkManager;
                weakReference4 = attributionHandler4.activityHandlerWeakRef;
                IActivityHandler iActivityHandler4 = (IActivityHandler) weakReference4.get();
                if (iActivityHandler4 == null) {
                    return;
                }
                ResponseData responseData = (ResponseData) this.CatchingFishDaggerWebsocket;
                if (responseData.trackingState == TrackingState.OPTED_OUT) {
                    iActivityHandler4.gotOptOutResponse();
                    return;
                } else {
                    if (responseData instanceof AttributionResponseData) {
                        attributionHandler4.checkAttributionResponseI(iActivityHandler4, (AttributionResponseData) responseData);
                        return;
                    }
                    return;
                }
            case 20:
                CatchingFishEspressoPayPal catchingFishEspressoPayPal = (CatchingFishEspressoPayPal) this.CatchingFishDaggerWebsocket;
                Typeface typeface = (Typeface) this.CatchingFishWorkManager;
                CatchingFishOkHttpFAB catchingFishOkHttpFAB = (CatchingFishOkHttpFAB) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket;
                if (catchingFishOkHttpFAB != null) {
                    catchingFishOkHttpFAB.CatchingFishEspressoMockk(typeface);
                    return;
                }
                return;
            case 21:
                ArrayList arrayList = (ArrayList) this.CatchingFishDaggerWebsocket;
                CatchingFishMVPDatabinding catchingFishMVPDatabinding = (CatchingFishMVPDatabinding) this.CatchingFishWorkManager;
                if (arrayList.contains(catchingFishMVPDatabinding)) {
                    arrayList.remove(catchingFishMVPDatabinding);
                    CatchingFishMVPLiveData.CatchingFishParcelableFAB(catchingFishMVPDatabinding.CatchingFishCoroutine.CatchingFishPayPalService, catchingFishMVPDatabinding.CatchingFishParcelableFAB);
                    return;
                }
                return;
            case 22:
                ((CatchingFishKtorMockk) this.CatchingFishDaggerWebsocket).CatchingFishFragmentFactory((CatchingFishIntentCoroutine) this.CatchingFishWorkManager);
                return;
            case 23:
                CatchingFishXMLLayoutHilt catchingFishXMLLayoutHilt = (CatchingFishXMLLayoutHilt) this.CatchingFishWorkManager;
                CatchingFishToastGradle catchingFishToastGradle = catchingFishXMLLayoutHilt.CatchingFishViewModelScope;
                int i = 0;
                while (true) {
                    try {
                        ((Runnable) this.CatchingFishDaggerWebsocket).run();
                    } catch (Throwable th) {
                        CatchingFishBiometricBundle.CatchingFishDaggerHiltFAB(th, CatchingFishPayPalDataStore.CatchingFishReduxKtor);
                    }
                    Runnable CatchingFishFragmentFactory = catchingFishXMLLayoutHilt.CatchingFishFragmentFactory();
                    if (CatchingFishFragmentFactory == null) {
                        return;
                    }
                    this.CatchingFishDaggerWebsocket = CatchingFishFragmentFactory;
                    i++;
                    if (i >= 16 && catchingFishToastGradle.CatchingFishMVPRobolectric(catchingFishXMLLayoutHilt)) {
                        catchingFishToastGradle.CatchingFishCardViewView(catchingFishXMLLayoutHilt, this);
                        return;
                    }
                }
                break;
            case 24:
                ((PackageHandler) this.CatchingFishWorkManager).addI((ActivityPackage) this.CatchingFishDaggerWebsocket);
                return;
            case 25:
                ((PackageHandler) this.CatchingFishWorkManager).sendNextI(((ResponseData) this.CatchingFishDaggerWebsocket).continueIn);
                return;
            case 26:
                ((PurchaseVerificationHandler) this.CatchingFishWorkManager).sendPurchaseVerificationPackageI((ActivityPackage) this.CatchingFishDaggerWebsocket);
                return;
            case 27:
                ((CatchingFishGraphQLEspresso) this.CatchingFishDaggerWebsocket).accept(this.CatchingFishWorkManager);
                return;
            case 28:
                ((CatchingFishKtorMockk) this.CatchingFishWorkManager).CatchingFishFragmentFactory((CatchingFishGradleMVP) this.CatchingFishDaggerWebsocket);
                return;
            default:
                try {
                    CatchingFishParcelableFAB();
                    return;
                } catch (Error e2) {
                    synchronized (((CatchingFishLifecycleGradle) this.CatchingFishWorkManager).CatchingFishDaggerWebsocket) {
                        ((CatchingFishLifecycleGradle) this.CatchingFishWorkManager).CatchingFishWorkManager = 1;
                        throw e2;
                    }
                }
        }
    }

    public String toString() {
        switch (this.CatchingFishReduxKtor) {
            case 29:
                Runnable runnable = (Runnable) this.CatchingFishDaggerWebsocket;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((CatchingFishLifecycleGradle) this.CatchingFishWorkManager).CatchingFishWorkManager;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ CatchingFishService(int i, Object obj, Object obj2, boolean z) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishWorkManager = obj2;
    }

    public CatchingFishService(CatchingFishMoshiGraphQL catchingFishMoshiGraphQL, ArrayList arrayList, CatchingFishMVPDatabinding catchingFishMVPDatabinding) {
        this.CatchingFishReduxKtor = 21;
        this.CatchingFishDaggerWebsocket = arrayList;
        this.CatchingFishWorkManager = catchingFishMVPDatabinding;
    }

    public CatchingFishService(CatchingFishLifecycleGradle catchingFishLifecycleGradle) {
        this.CatchingFishReduxKtor = 29;
        this.CatchingFishWorkManager = catchingFishLifecycleGradle;
    }
}
