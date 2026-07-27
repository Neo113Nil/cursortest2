package androidx.versionedparcelable;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
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
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class NovaLayerCryptographyLambdaOZVsVYscwB3Qx5YA0j56421214613745 implements Runnable {
    public final Object LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public Object YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public /* synthetic */ NovaLayerCryptographyLambdaOZVsVYscwB3Qx5YA0j56421214613745(int i, Object obj, Object obj2) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = obj;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        androidx.versionedparcelable.DragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170), (java.lang.Throwable) r3);
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
    public void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        boolean z = false;
        boolean z2 = false;
        while (true) {
            try {
                synchronized (((DragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
                    if (!z) {
                        DragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841 dragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841 = (DragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                        if (dragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 != 4) {
                            dragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333++;
                            dragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = 4;
                            z = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((DragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.poll();
                    this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = runnable;
                    if (runnable == null) {
                        ((DragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = 1;
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
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        List list;
        boolean z;
        List list2;
        List list3;
        Runnable runnable;
        List list4;
        HeliosRuntimeClosureIteratorJWr00QBPRS866EpEHR37082290750388 heliosRuntimeClosureIteratorJWr00QBPRS866EpEHR37082290750388;
        HeliosRuntimeClosureIteratorJWr00QBPRS866EpEHR37082290750388 heliosRuntimeClosureIteratorJWr00QBPRS866EpEHR370822907503882 = null;
        int i = 0;
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).launchSessionResponseTasksI((SessionResponseData) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                return;
            case 1:
                ((ActivityHandler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).launchAttributionResponseTasksI((AttributionResponseData) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                return;
            case 2:
                ((ActivityHandler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).launchPurchaseVerificationResponseTasksI((PurchaseVerificationResponseData) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                return;
            case 3:
                ((OnDeeplinkResolvedListener) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).onDeeplinkResolved(((SdkClickResponseData) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).resolvedDeeplink);
                return;
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
                ((PurchaseVerificationResponseData) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).activityPackage.getPurchaseVerificationCallback().onVerificationFinished((AdjustPurchaseVerificationResult) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
                return;
            case 5:
                ((OnDeeplinkResolvedListener) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).onDeeplinkResolved((String) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
                return;
            case 6:
                ((ActivityHandler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).sendLicenseVerificationDataI((LicenseData) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                return;
            case 7:
                ((ActivityHandler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).launchEventResponseTasksI((EventResponseData) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                return;
            case 8:
                ((ActivityHandler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).launchSdkClickResponseTasksI((SdkClickResponseData) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                return;
            case 9:
                ((OnAdidReadListener) ((WhiteFieldDebuggerManagerJe3z4uoDlOIARvMN2Q19126374969768) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818).onAdidRead((String) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                return;
            case 10:
                ((OnAttributionReadListener) ((WhiteFieldDebuggerManagerJe3z4uoDlOIARvMN2Q19126374969768) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818).onAttributionRead((AdjustAttribution) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                return;
            case 11:
                ((AsyncTaskExecutor) ((BlueKernelPrefixBinaryTreeIVQWRCfiOQZwtAjv3s49170332979871) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333).onPostExecute(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                return;
            case 12:
                AttributionHandler attributionHandler = (AttributionHandler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                weakReference = attributionHandler.activityHandlerWeakRef;
                IActivityHandler iActivityHandler = (IActivityHandler) weakReference.get();
                if (iActivityHandler == null) {
                    return;
                }
                attributionHandler.checkSessionResponseI(iActivityHandler, (SessionResponseData) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                return;
            case 13:
                AttributionHandler attributionHandler2 = (AttributionHandler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                weakReference2 = attributionHandler2.activityHandlerWeakRef;
                IActivityHandler iActivityHandler2 = (IActivityHandler) weakReference2.get();
                if (iActivityHandler2 == null) {
                    return;
                }
                attributionHandler2.checkSdkClickResponseI(iActivityHandler2, (SdkClickResponseData) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                return;
            case 14:
                AttributionHandler attributionHandler3 = (AttributionHandler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                weakReference3 = attributionHandler3.activityHandlerWeakRef;
                IActivityHandler iActivityHandler3 = (IActivityHandler) weakReference3.get();
                if (iActivityHandler3 == null) {
                    return;
                }
                attributionHandler3.checkAttributionResponseI(iActivityHandler3, (AttributionResponseData) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                return;
            case 15:
                AttributionHandler attributionHandler4 = (AttributionHandler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                weakReference4 = attributionHandler4.activityHandlerWeakRef;
                IActivityHandler iActivityHandler4 = (IActivityHandler) weakReference4.get();
                if (iActivityHandler4 == null) {
                    return;
                }
                ResponseData responseData = (ResponseData) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
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
            case 16:
                ((ArcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900((DeltaSignalHeuristicLambdaWOlkAIyxKHNvfKxznZ71024478229184) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
                return;
            case 17:
                ZenithPathForeachFloatingPointKzTii8Wr5vhfTua3HN29295337713537 zenithPathForeachFloatingPointKzTii8Wr5vhfTua3HN29295337713537 = (ZenithPathForeachFloatingPointKzTii8Wr5vhfTua3HN29295337713537) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                NovaLayerParserBinaryCnV8ZDCcTz5xzAcd5514357026382260 novaLayerParserBinaryCnV8ZDCcTz5xzAcd5514357026382260 = zenithPathForeachFloatingPointKzTii8Wr5vhfTua3HN29295337713537.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                while (true) {
                    try {
                        ((Runnable) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).run();
                    } catch (Throwable th) {
                        MysticCacheRequestMonitorQYA1Ym9CAA7fiSEGwn24597175563594.UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(VertexLinkLibraryMiddlewareQSBoBmI1xXS5ThOOka95622716130566.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, th);
                    }
                    Runnable ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = zenithPathForeachFloatingPointKzTii8Wr5vhfTua3HN29295337713537.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050();
                    if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 == null) {
                        return;
                    }
                    this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
                    i++;
                    if (i >= 16 && novaLayerParserBinaryCnV8ZDCcTz5xzAcd5514357026382260.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(zenithPathForeachFloatingPointKzTii8Wr5vhfTua3HN29295337713537)) {
                        novaLayerParserBinaryCnV8ZDCcTz5xzAcd5514357026382260.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(zenithPathForeachFloatingPointKzTii8Wr5vhfTua3HN29295337713537, this);
                        return;
                    }
                }
                break;
            case 18:
                ((PackageHandler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).addI((ActivityPackage) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                return;
            case 19:
                ((PackageHandler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).sendNextI(((ResponseData) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).continueIn);
                return;
            case 20:
                ((PurchaseVerificationHandler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).sendPurchaseVerificationPackageI((ActivityPackage) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                return;
            case 21:
                ((ArcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900((ZenithPathModuleArrayKVJliIkrLm3EOk7hxQ81821033566458) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                return;
            case 22:
                try {
                    ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                    return;
                } catch (Error e) {
                    synchronized (((DragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
                        ((DragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = 1;
                        throw e;
                    }
                }
            case 23:
                ((SingleThreadCachedScheduler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).tryExecuteRunnable((Runnable) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                while (true) {
                    list = ((SingleThreadCachedScheduler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).queue;
                    synchronized (list) {
                        try {
                            z = ((SingleThreadCachedScheduler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).isTeardown;
                            if (z) {
                                return;
                            }
                            list2 = ((SingleThreadCachedScheduler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).queue;
                            boolean isEmpty = list2.isEmpty();
                            SingleThreadCachedScheduler singleThreadCachedScheduler = (SingleThreadCachedScheduler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                            if (isEmpty) {
                                singleThreadCachedScheduler.isThreadProcessing = false;
                                return;
                            }
                            list3 = singleThreadCachedScheduler.queue;
                            runnable = (Runnable) list3.get(0);
                            list4 = ((SingleThreadCachedScheduler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).queue;
                            list4.remove(0);
                        } finally {
                        }
                    }
                    ((SingleThreadCachedScheduler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).tryExecuteRunnable(runnable);
                }
            case 24:
                ConnectionResult connectionResult = (ConnectionResult) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                MysticCacheNormalizationObserverU2mwzv60nMr8qaq6mx22479677094738 mysticCacheNormalizationObserverU2mwzv60nMr8qaq6mx22479677094738 = (MysticCacheNormalizationObserverU2mwzv60nMr8qaq6mx22479677094738) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                GoldenVectorInterpreterTemplatingJs542Xp9RsOO4cHUkW71750313443458 goldenVectorInterpreterTemplatingJs542Xp9RsOO4cHUkW71750313443458 = mysticCacheNormalizationObserverU2mwzv60nMr8qaq6mx22479677094738.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 = (IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228) mysticCacheNormalizationObserverU2mwzv60nMr8qaq6mx22479677094738.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.get(mysticCacheNormalizationObserverU2mwzv60nMr8qaq6mx22479677094738.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
                if (ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 == null) {
                    return;
                }
                if (connectionResult.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 != 0) {
                    ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111(connectionResult, null);
                    return;
                }
                mysticCacheNormalizationObserverU2mwzv60nMr8qaq6mx22479677094738.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = true;
                if (goldenVectorInterpreterTemplatingJs542Xp9RsOO4cHUkW71750313443458.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050()) {
                    if (!mysticCacheNormalizationObserverU2mwzv60nMr8qaq6mx22479677094738.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 || (heliosRuntimeClosureIteratorJWr00QBPRS866EpEHR37082290750388 = mysticCacheNormalizationObserverU2mwzv60nMr8qaq6mx22479677094738.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) == null) {
                        return;
                    }
                    goldenVectorInterpreterTemplatingJs542Xp9RsOO4cHUkW71750313443458.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(heliosRuntimeClosureIteratorJWr00QBPRS866EpEHR37082290750388, mysticCacheNormalizationObserverU2mwzv60nMr8qaq6mx22479677094738.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
                    return;
                }
                try {
                    goldenVectorInterpreterTemplatingJs542Xp9RsOO4cHUkW71750313443458.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(null, goldenVectorInterpreterTemplatingJs542Xp9RsOO4cHUkW71750313443458.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495());
                    return;
                } catch (SecurityException unused) {
                    goldenVectorInterpreterTemplatingJs542Xp9RsOO4cHUkW71750313443458.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867("Failed to get service from broker.");
                    ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111(new ConnectionResult(10), null);
                    return;
                }
            case 25:
                EmeraldStackSessionCryptographyQSOvzFZmpuPnrL0o3y70705185642770 emeraldStackSessionCryptographyQSOvzFZmpuPnrL0o3y70705185642770 = (EmeraldStackSessionCryptographyQSOvzFZmpuPnrL0o3y70705185642770) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                DeltaSignalAPIBitwiseH2Ea22TFd4VLmQGEzF22261097021929 deltaSignalAPIBitwiseH2Ea22TFd4VLmQGEzF22261097021929 = (DeltaSignalAPIBitwiseH2Ea22TFd4VLmQGEzF22261097021929) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                ConnectionResult connectionResult2 = deltaSignalAPIBitwiseH2Ea22TFd4VLmQGEzF22261097021929.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                if (connectionResult2.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 == 0) {
                    VertexLinkDependencyAnnotationINn4JbFYDVgsxYg1Ts81918994517411 vertexLinkDependencyAnnotationINn4JbFYDVgsxYg1Ts81918994517411 = deltaSignalAPIBitwiseH2Ea22TFd4VLmQGEzF22261097021929.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                    YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(vertexLinkDependencyAnnotationINn4JbFYDVgsxYg1Ts81918994517411);
                    ConnectionResult connectionResult3 = vertexLinkDependencyAnnotationINn4JbFYDVgsxYg1Ts81918994517411.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                    if (connectionResult3.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 != 0) {
                        String valueOf = String.valueOf(connectionResult3);
                        new Exception();
                        "Sign-in succeeded with resolve account failure: ".concat(valueOf);
                        emeraldStackSessionCryptographyQSOvzFZmpuPnrL0o3y70705185642770.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(connectionResult3);
                        emeraldStackSessionCryptographyQSOvzFZmpuPnrL0o3y70705185642770.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170();
                        return;
                    }
                    MysticCacheNormalizationObserverU2mwzv60nMr8qaq6mx22479677094738 mysticCacheNormalizationObserverU2mwzv60nMr8qaq6mx224796770947382 = emeraldStackSessionCryptographyQSOvzFZmpuPnrL0o3y70705185642770.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                    IBinder iBinder = vertexLinkDependencyAnnotationINn4JbFYDVgsxYg1Ts81918994517411.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                    if (iBinder != null) {
                        int i2 = HeliosRuntimePolymorphismDebuggerHDNBJr8bwIMRVogTi598225905652974.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        heliosRuntimeClosureIteratorJWr00QBPRS866EpEHR370822907503882 = queryLocalInterface instanceof HeliosRuntimeClosureIteratorJWr00QBPRS866EpEHR37082290750388 ? (HeliosRuntimeClosureIteratorJWr00QBPRS866EpEHR37082290750388) queryLocalInterface : new UltraBufferEventLoopRequestOr1zUpKfzh7Icf4MLg33176458723524(iBinder);
                    }
                    Set set = emeraldStackSessionCryptographyQSOvzFZmpuPnrL0o3y70705185642770.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                    mysticCacheNormalizationObserverU2mwzv60nMr8qaq6mx224796770947382.getClass();
                    if (heliosRuntimeClosureIteratorJWr00QBPRS866EpEHR370822907503882 == null || set == null) {
                        new Exception();
                        mysticCacheNormalizationObserverU2mwzv60nMr8qaq6mx224796770947382.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(new ConnectionResult(4));
                    } else {
                        mysticCacheNormalizationObserverU2mwzv60nMr8qaq6mx224796770947382.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = heliosRuntimeClosureIteratorJWr00QBPRS866EpEHR370822907503882;
                        mysticCacheNormalizationObserverU2mwzv60nMr8qaq6mx224796770947382.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = set;
                        if (mysticCacheNormalizationObserverU2mwzv60nMr8qaq6mx224796770947382.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818) {
                            mysticCacheNormalizationObserverU2mwzv60nMr8qaq6mx224796770947382.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(heliosRuntimeClosureIteratorJWr00QBPRS866EpEHR370822907503882, set);
                        }
                    }
                } else {
                    emeraldStackSessionCryptographyQSOvzFZmpuPnrL0o3y70705185642770.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(connectionResult2);
                }
                emeraldStackSessionCryptographyQSOvzFZmpuPnrL0o3y70705185642770.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170();
                return;
            case 26:
                boolean z2 = ((ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                CosmicForgePacketGatewayMXpRC8dGXZE1OSG3BF13451468158119 cosmicForgePacketGatewayMXpRC8dGXZE1OSG3BF13451468158119 = (CosmicForgePacketGatewayMXpRC8dGXZE1OSG3BF13451468158119) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                if (z2) {
                    cosmicForgePacketGatewayMXpRC8dGXZE1OSG3BF13451468158119.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111();
                    return;
                }
                try {
                    ((CosmicForgePacketGatewayMXpRC8dGXZE1OSG3BF13451468158119) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(cosmicForgePacketGatewayMXpRC8dGXZE1OSG3BF13451468158119.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339((ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170));
                    return;
                } catch (UltraBufferComponentProtocolGGe9ZaanggCLufaKle21582832214101 e2) {
                    boolean z3 = e2.getCause() instanceof Exception;
                    ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 = ((CosmicForgePacketGatewayMXpRC8dGXZE1OSG3BF13451468158119) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                    if (z3) {
                        obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480((Exception) e2.getCause());
                        return;
                    } else {
                        obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(e2);
                        return;
                    }
                } catch (Exception e3) {
                    ((CosmicForgePacketGatewayMXpRC8dGXZE1OSG3BF13451468158119) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(e3);
                    return;
                }
            case 27:
                CosmicForgePacketGatewayMXpRC8dGXZE1OSG3BF13451468158119 cosmicForgePacketGatewayMXpRC8dGXZE1OSG3BF134514681581192 = (CosmicForgePacketGatewayMXpRC8dGXZE1OSG3BF13451468158119) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511822 = cosmicForgePacketGatewayMXpRC8dGXZE1OSG3BF134514681581192.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                try {
                    ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511823 = (ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182) cosmicForgePacketGatewayMXpRC8dGXZE1OSG3BF134514681581192.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339((ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                    if (obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511823 == null) {
                        cosmicForgePacketGatewayMXpRC8dGXZE1OSG3BF134514681581192.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    GoldenVectorBuilderCoroutineO5iVbVrPRDC4h3cqlr67692362104981 goldenVectorBuilderCoroutineO5iVbVrPRDC4h3cqlr67692362104981 = obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511823.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                    BlueKernelSemaphoreResolverCFqSes8q5vvwmq0fe167308262945643 blueKernelSemaphoreResolverCFqSes8q5vvwmq0fe167308262945643 = ZenithPathPolymorphismRepositoryPQqMIrgX5PQTeQrJ9N67881868670923.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                    obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511823.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(blueKernelSemaphoreResolverCFqSes8q5vvwmq0fe167308262945643, cosmicForgePacketGatewayMXpRC8dGXZE1OSG3BF134514681581192);
                    goldenVectorBuilderCoroutineO5iVbVrPRDC4h3cqlr67692362104981.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(new ArcticByteLibraryContextQ3i5L7P05IAEvfUT6M11325520501197((Executor) blueKernelSemaphoreResolverCFqSes8q5vvwmq0fe167308262945643, (KryptonFlowFunctionOverloadingLe0BXP3Lyi1GEsQkS772319229999258) cosmicForgePacketGatewayMXpRC8dGXZE1OSG3BF134514681581192));
                    obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511823.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170();
                    goldenVectorBuilderCoroutineO5iVbVrPRDC4h3cqlr67692362104981.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(new ArcticByteLibraryContextQ3i5L7P05IAEvfUT6M11325520501197((Executor) blueKernelSemaphoreResolverCFqSes8q5vvwmq0fe167308262945643, (XenoGridSessionRequestNMrO09FnfkJw3TdFl273791997821205) cosmicForgePacketGatewayMXpRC8dGXZE1OSG3BF134514681581192));
                    obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511823.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170();
                    return;
                } catch (UltraBufferComponentProtocolGGe9ZaanggCLufaKle21582832214101 e4) {
                    if (e4.getCause() instanceof Exception) {
                        obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511822.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480((Exception) e4.getCause());
                        return;
                    } else {
                        obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511822.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(e4);
                        return;
                    }
                } catch (Exception e5) {
                    obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU868698819511822.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(e5);
                    return;
                }
            case 28:
                synchronized (((ArcticByteLibraryContextQ3i5L7P05IAEvfUT6M11325520501197) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
                    ((IronMatrixObserverRequestUrNY5csfhuxXolxzSU20487495870505) ((ArcticByteLibraryContextQ3i5L7P05IAEvfUT6M11325520501197) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333).AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365((ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                }
                return;
            default:
                ZenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694 zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694 = (ZenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                IBinder iBinder2 = (IBinder) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                synchronized (zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694) {
                    if (iBinder2 == null) {
                        zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800("Null service connection");
                    } else {
                        try {
                            zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = new RapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050(iBinder2);
                            zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 2;
                            ((ScheduledExecutorService) zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495).execute(new FrostBridgeReflectionAlgorithmHaiPg0yNoL1QwRrN3812874187394560(zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694, i));
                        } catch (RemoteException e6) {
                            zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(e6.getMessage());
                        }
                    }
                }
                return;
        }
    }

    public String toString() {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case 22:
                Runnable runnable = (Runnable) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((DragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ NovaLayerCryptographyLambdaOZVsVYscwB3Qx5YA0j56421214613745(int i, Object obj, Object obj2, boolean z) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = obj;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = obj2;
    }

    public NovaLayerCryptographyLambdaOZVsVYscwB3Qx5YA0j56421214613745(DragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841 dragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 22;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = dragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841;
    }
}
