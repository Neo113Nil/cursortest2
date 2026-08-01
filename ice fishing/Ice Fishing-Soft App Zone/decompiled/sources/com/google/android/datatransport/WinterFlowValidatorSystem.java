package com.google.android.datatransport;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustPurchaseVerificationResult;
import com.adjust.sdk.AdjustThirdPartySharingResult;
import com.adjust.sdk.AttributionHandler;
import com.adjust.sdk.AttributionResponseData;
import com.adjust.sdk.EventResponseData;
import com.adjust.sdk.IActivityHandler;
import com.adjust.sdk.LicenseData;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.OnDeeplinkResolvedListener;
import com.adjust.sdk.OnThirdPartySharingSettingsReadListener;
import com.adjust.sdk.PackageHandler;
import com.adjust.sdk.PurchaseVerificationHandler;
import com.adjust.sdk.PurchaseVerificationResponseData;
import com.adjust.sdk.ResponseData;
import com.adjust.sdk.SdkClickResponseData;
import com.adjust.sdk.SessionResponseData;
import com.adjust.sdk.ThirdPartySharingResponseData;
import com.adjust.sdk.TrackingState;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowValidatorSystem implements Runnable {
    public Object WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public WinterFlowValidatorSystem(WinterFlowObjectManager winterFlowObjectManager) {
        this.WinterFlowVariableVersionControl = 0;
        this.WinterFlowUnitTestResponse = winterFlowObjectManager;
        this.WinterFlowTransactionManagerStrategy = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.WinterFlowTransactionManagerStrategy).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.WinterFlowTransactionManagerStrategy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        com.google.android.datatransport.WinterFlowValidatorVersion.WinterFlowResponseEngine.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.WinterFlowTransactionManagerStrategy), (java.lang.Throwable) r3);
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
    public void WinterFlowRouterStructure() {
        boolean z = false;
        boolean z2 = false;
        while (true) {
            try {
                synchronized (((WinterFlowValidatorVersion) this.WinterFlowUnitTestResponse).WinterFlowTransactionManagerStrategy) {
                    if (!z) {
                        WinterFlowValidatorVersion winterFlowValidatorVersion = (WinterFlowValidatorVersion) this.WinterFlowUnitTestResponse;
                        if (winterFlowValidatorVersion.WinterFlowUnitTestResponse != 4) {
                            winterFlowValidatorVersion.WinterFlowRouterRouter++;
                            winterFlowValidatorVersion.WinterFlowUnitTestResponse = 4;
                            z = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((WinterFlowValidatorVersion) this.WinterFlowUnitTestResponse).WinterFlowTransactionManagerStrategy.poll();
                    this.WinterFlowTransactionManagerStrategy = runnable;
                    if (runnable == null) {
                        ((WinterFlowValidatorVersion) this.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse = 1;
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
        long nanoTime;
        AdjustThirdPartySharingResult adjustThirdPartySharingResult;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        int i = 0;
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ArrayList) this.WinterFlowTransactionManagerStrategy).clear();
                try {
                    ((ArrayList) this.WinterFlowTransactionManagerStrategy).addAll(Collections.singletonList(((WinterFlowObjectManager) this.WinterFlowUnitTestResponse).WinterFlowServerProtocol));
                    synchronized (((WinterFlowObjectManager) this.WinterFlowUnitTestResponse).WinterFlowResponseEngine) {
                        nanoTime = (long) (System.nanoTime() - (((WinterFlowObjectManager) this.WinterFlowUnitTestResponse).WinterFlowSyntax * 1.5d));
                    }
                    ArrayList arrayList = (ArrayList) this.WinterFlowTransactionManagerStrategy;
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((WinterFlowObjectManager) this.WinterFlowUnitTestResponse).WinterFlowHookDataSource((WinterFlowRefactoringVersion) obj, nanoTime);
                    }
                } catch (Exception unused) {
                }
                ((ArrayList) this.WinterFlowTransactionManagerStrategy).clear();
                return;
            case 1:
                ((ActivityHandler) this.WinterFlowUnitTestResponse).launchSdkClickResponseTasksI((SdkClickResponseData) this.WinterFlowTransactionManagerStrategy);
                return;
            case 2:
                ((ActivityHandler) this.WinterFlowUnitTestResponse).launchSessionResponseTasksI((SessionResponseData) this.WinterFlowTransactionManagerStrategy);
                return;
            case 3:
                ((ActivityHandler) this.WinterFlowUnitTestResponse).launchAttributionResponseTasksI((AttributionResponseData) this.WinterFlowTransactionManagerStrategy);
                return;
            case 4:
                ((ActivityHandler) this.WinterFlowUnitTestResponse).launchPurchaseVerificationResponseTasksI((PurchaseVerificationResponseData) this.WinterFlowTransactionManagerStrategy);
                return;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                ((ActivityHandler) this.WinterFlowUnitTestResponse).launchThirdPartySharingResponseTasksI((ThirdPartySharingResponseData) this.WinterFlowTransactionManagerStrategy);
                return;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                ((ActivityHandler) this.WinterFlowUnitTestResponse).processRemoteTriggersI((ResponseData) this.WinterFlowTransactionManagerStrategy);
                return;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                OnThirdPartySharingSettingsReadListener onThirdPartySharingSettingsReadListener = (OnThirdPartySharingSettingsReadListener) this.WinterFlowTransactionManagerStrategy;
                adjustThirdPartySharingResult = ((ActivityHandler) this.WinterFlowUnitTestResponse).thirdPartySharingResult;
                onThirdPartySharingSettingsReadListener.onThirdPartySharingSettingsRead(adjustThirdPartySharingResult);
                return;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                ((OnDeeplinkResolvedListener) this.WinterFlowTransactionManagerStrategy).onDeeplinkResolved(((SdkClickResponseData) this.WinterFlowUnitTestResponse).resolvedDeeplink);
                return;
            case 9:
                ((PurchaseVerificationResponseData) this.WinterFlowTransactionManagerStrategy).activityPackage.getPurchaseVerificationCallback().onVerificationFinished((AdjustPurchaseVerificationResult) this.WinterFlowUnitTestResponse);
                return;
            case 10:
                ((OnDeeplinkResolvedListener) this.WinterFlowTransactionManagerStrategy).onDeeplinkResolved((String) this.WinterFlowUnitTestResponse);
                return;
            case 11:
                ((ActivityHandler) this.WinterFlowUnitTestResponse).sendLicenseVerificationDataI((LicenseData) this.WinterFlowTransactionManagerStrategy);
                return;
            case 12:
                ((ActivityHandler) this.WinterFlowUnitTestResponse).launchEventResponseTasksI((EventResponseData) this.WinterFlowTransactionManagerStrategy);
                return;
            case 13:
                ((OnThirdPartySharingSettingsReadListener) ((WinterFlowDatabaseHandler) this.WinterFlowUnitTestResponse).WinterFlowSyntax).onThirdPartySharingSettingsRead((AdjustThirdPartySharingResult) this.WinterFlowTransactionManagerStrategy);
                return;
            case 14:
                ((OnAdidReadListener) ((WinterFlowDatabaseHandler) this.WinterFlowUnitTestResponse).WinterFlowSyntax).onAdidRead((String) this.WinterFlowTransactionManagerStrategy);
                return;
            case 15:
                ((OnAttributionReadListener) ((WinterFlowDatabaseHandler) this.WinterFlowUnitTestResponse).WinterFlowSyntax).onAttributionRead((AdjustAttribution) this.WinterFlowTransactionManagerStrategy);
                return;
            case 16:
                ((AsyncTaskExecutor) ((WinterFlowCacheManagerCloud) this.WinterFlowUnitTestResponse).WinterFlowRouterRouter).onPostExecute(this.WinterFlowTransactionManagerStrategy);
                return;
            case 17:
                AttributionHandler attributionHandler = (AttributionHandler) this.WinterFlowUnitTestResponse;
                weakReference = attributionHandler.activityHandlerWeakRef;
                IActivityHandler iActivityHandler = (IActivityHandler) weakReference.get();
                if (iActivityHandler == null) {
                    return;
                }
                attributionHandler.checkSessionResponseI(iActivityHandler, (SessionResponseData) this.WinterFlowTransactionManagerStrategy);
                return;
            case 18:
                AttributionHandler attributionHandler2 = (AttributionHandler) this.WinterFlowUnitTestResponse;
                weakReference2 = attributionHandler2.activityHandlerWeakRef;
                IActivityHandler iActivityHandler2 = (IActivityHandler) weakReference2.get();
                if (iActivityHandler2 == null) {
                    return;
                }
                attributionHandler2.checkSdkClickResponseI(iActivityHandler2, (SdkClickResponseData) this.WinterFlowTransactionManagerStrategy);
                return;
            case 19:
                AttributionHandler attributionHandler3 = (AttributionHandler) this.WinterFlowUnitTestResponse;
                weakReference3 = attributionHandler3.activityHandlerWeakRef;
                IActivityHandler iActivityHandler3 = (IActivityHandler) weakReference3.get();
                if (iActivityHandler3 == null) {
                    return;
                }
                attributionHandler3.checkAttributionResponseI(iActivityHandler3, (AttributionResponseData) this.WinterFlowTransactionManagerStrategy);
                return;
            case 20:
                AttributionHandler attributionHandler4 = (AttributionHandler) this.WinterFlowUnitTestResponse;
                weakReference4 = attributionHandler4.activityHandlerWeakRef;
                IActivityHandler iActivityHandler4 = (IActivityHandler) weakReference4.get();
                if (iActivityHandler4 == null) {
                    return;
                }
                ResponseData responseData = (ResponseData) this.WinterFlowTransactionManagerStrategy;
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
            case 21:
                return;
            case 22:
                ((WinterFlowEventCloud) this.WinterFlowTransactionManagerStrategy).WinterFlowStrategyTool((WinterFlowFrameworkNetwork) this.WinterFlowUnitTestResponse);
                return;
            case 23:
                WinterFlowBandwidthDecorator winterFlowBandwidthDecorator = (WinterFlowBandwidthDecorator) this.WinterFlowUnitTestResponse;
                WinterFlowUnitTestRouter winterFlowUnitTestRouter = winterFlowBandwidthDecorator.WinterFlowRouterRouter;
                while (true) {
                    try {
                        ((Runnable) this.WinterFlowTransactionManagerStrategy).run();
                    } catch (Throwable th) {
                        WinterFlowSoftwareException.WinterFlowSoftwareProtocol(WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl, th);
                    }
                    Runnable WinterFlowSoftwareProtocol = winterFlowBandwidthDecorator.WinterFlowSoftwareProtocol();
                    if (WinterFlowSoftwareProtocol == null) {
                        return;
                    }
                    this.WinterFlowTransactionManagerStrategy = WinterFlowSoftwareProtocol;
                    i++;
                    if (i >= 16 && winterFlowUnitTestRouter.WinterFlowCacheManagerListener(winterFlowBandwidthDecorator)) {
                        winterFlowUnitTestRouter.WinterFlowConfigurationSubsystem(winterFlowBandwidthDecorator, this);
                        return;
                    }
                }
                break;
            case 24:
                ((PackageHandler) this.WinterFlowUnitTestResponse).addI((ActivityPackage) this.WinterFlowTransactionManagerStrategy);
                return;
            case 25:
                ((PackageHandler) this.WinterFlowUnitTestResponse).sendNextI(((ResponseData) this.WinterFlowTransactionManagerStrategy).continueIn);
                return;
            case 26:
                ((PurchaseVerificationHandler) this.WinterFlowUnitTestResponse).sendPurchaseVerificationPackageI((ActivityPackage) this.WinterFlowTransactionManagerStrategy);
                return;
            case 27:
                ((WinterFlowXMLLoader) this.WinterFlowTransactionManagerStrategy).accept(this.WinterFlowUnitTestResponse);
                return;
            case 28:
                ((WinterFlowEventCloud) this.WinterFlowUnitTestResponse).WinterFlowStrategyTool((WinterFlowEventEmitterHandler) this.WinterFlowTransactionManagerStrategy);
                return;
            default:
                try {
                    WinterFlowRouterStructure();
                    return;
                } catch (Error e) {
                    synchronized (((WinterFlowValidatorVersion) this.WinterFlowUnitTestResponse).WinterFlowTransactionManagerStrategy) {
                        ((WinterFlowValidatorVersion) this.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse = 1;
                        throw e;
                    }
                }
        }
    }

    public String toString() {
        switch (this.WinterFlowVariableVersionControl) {
            case 29:
                Runnable runnable = (Runnable) this.WinterFlowTransactionManagerStrategy;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((WinterFlowValidatorVersion) this.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ WinterFlowValidatorSystem(int i, Object obj, Object obj2, boolean z) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
    }

    public WinterFlowValidatorSystem(WinterFlowValidatorVersion winterFlowValidatorVersion) {
        this.WinterFlowVariableVersionControl = 29;
        this.WinterFlowUnitTestResponse = winterFlowValidatorVersion;
    }

    public /* synthetic */ WinterFlowValidatorSystem(int i, Object obj, Object obj2) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowUnitTestResponse = obj;
        this.WinterFlowTransactionManagerStrategy = obj2;
    }
}
