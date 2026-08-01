package com.google.android.datatransport;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IActivityHandler;
import com.adjust.sdk.PackageFactory;
import com.adjust.sdk.ReferrerDetails;
import com.adjust.sdk.SdkClickHandler;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheManagerCloud implements Runnable {
    public Object WinterFlowRouterRouter;
    public Object WinterFlowTransactionManagerStrategy;
    public Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public WinterFlowCacheManagerCloud(SdkClickHandler sdkClickHandler, String str, String str2) {
        this.WinterFlowVariableVersionControl = 4;
        this.WinterFlowRouterRouter = sdkClickHandler;
        this.WinterFlowUnitTestResponse = str;
        this.WinterFlowTransactionManagerStrategy = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        int i;
        WinterFlowExceptionParser WinterFlowServerProtocol;
        Object obj = null;
        boolean z = false;
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) this.WinterFlowRouterRouter).sendInstallReferrerI((ReferrerDetails) this.WinterFlowTransactionManagerStrategy, (String) this.WinterFlowUnitTestResponse);
                return;
            case 1:
                ((Handler) this.WinterFlowUnitTestResponse).post(new WinterFlowValidatorSystem(16, this, ((AsyncTaskExecutor) this.WinterFlowRouterRouter).doInBackground((Object[]) this.WinterFlowTransactionManagerStrategy)));
                return;
            case 2:
                try {
                    obj = ((WinterFlowWorkerLayer) this.WinterFlowTransactionManagerStrategy).call();
                } catch (Exception unused) {
                }
                ((Handler) this.WinterFlowRouterRouter).post(new WinterFlowValidatorSystem(27, (WinterFlowXMLLoader) this.WinterFlowUnitTestResponse, obj, z));
                return;
            case 3:
                WinterFlowEventCloud winterFlowEventCloud = (WinterFlowEventCloud) this.WinterFlowTransactionManagerStrategy;
                try {
                    WinterFlowQuerySyntax.WinterFlowCacheManagerListener(winterFlowEventCloud.WinterFlowSyntax.WinterFlowThreadListener(WinterFlowCacheUtility.WinterFlowMapperProtocol), new WinterFlowMiddlewareVariable((WinterFlowCloudFramework) this.WinterFlowUnitTestResponse, winterFlowEventCloud, (WinterFlowModuleStack) this.WinterFlowRouterRouter, null, 4));
                    return;
                } catch (Throwable th) {
                    winterFlowEventCloud.WinterFlowResponseEngine(th);
                    return;
                }
            case 4:
                SdkClickHandler sdkClickHandler = (SdkClickHandler) this.WinterFlowRouterRouter;
                weakReference = sdkClickHandler.activityHandlerWeakRef;
                IActivityHandler iActivityHandler = (IActivityHandler) weakReference.get();
                if (iActivityHandler == null) {
                    return;
                }
                sdkClickHandler.sendSdkClick(PackageFactory.buildPreinstallSdkClickPackage((String) this.WinterFlowUnitTestResponse, (String) this.WinterFlowTransactionManagerStrategy, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager()));
                return;
            default:
                WinterFlowThreadTransactionManager winterFlowThreadTransactionManager = (WinterFlowThreadTransactionManager) this.WinterFlowUnitTestResponse;
                Intent intent = winterFlowThreadTransactionManager.WinterFlowVariableVersionControl;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    WinterFlowServerProtocol = WinterFlowHookProcessor.WinterFlowResponseEngine(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = winterFlowThreadTransactionManager.WinterFlowVariableVersionControl;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = winterFlowThreadTransactionManager.WinterFlowVariableVersionControl;
                    Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (valueOf != null) {
                        bundle.putInt("google.product_id", valueOf.intValue());
                    }
                    Context context = (Context) this.WinterFlowTransactionManagerStrategy;
                    bundle.putBoolean("supports_message_handled", true);
                    WinterFlowProtocolPlatform WinterFlowTransactionAgent = WinterFlowProtocolPlatform.WinterFlowTransactionAgent(context);
                    synchronized (WinterFlowTransactionAgent) {
                        i = WinterFlowTransactionAgent.WinterFlowRouterStructure;
                        WinterFlowTransactionAgent.WinterFlowRouterStructure = i + 1;
                    }
                    WinterFlowServerProtocol = WinterFlowTransactionAgent.WinterFlowServerProtocol(new WinterFlowWidgetUtility(i, 2, bundle, 0));
                }
                WinterFlowServerProtocol.WinterFlowRouterStructure(WinterFlowRuntimeService.WinterFlowUnitTestResponse, new WinterFlowCompilerAlgorithm((CountDownLatch) this.WinterFlowRouterRouter));
                return;
        }
    }

    public /* synthetic */ WinterFlowCacheManagerCloud(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
        this.WinterFlowRouterRouter = obj3;
    }

    public /* synthetic */ WinterFlowCacheManagerCloud(Object obj, Object obj2, Object obj3, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowRouterRouter = obj;
        this.WinterFlowTransactionManagerStrategy = obj2;
        this.WinterFlowUnitTestResponse = obj3;
    }
}
