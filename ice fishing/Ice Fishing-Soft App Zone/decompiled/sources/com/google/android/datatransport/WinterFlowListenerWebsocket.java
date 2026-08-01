package com.google.android.datatransport;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowListenerWebsocket implements WinterFlowSoftwareRouter {
    public final /* synthetic */ String WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowThreadJava WinterFlowUnitTestResponse;
    public final /* synthetic */ FirebaseMessaging WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowListenerWebsocket(FirebaseMessaging firebaseMessaging, String str, WinterFlowThreadJava winterFlowThreadJava) {
        this.WinterFlowVariableVersionControl = firebaseMessaging;
        this.WinterFlowTransactionManagerStrategy = str;
        this.WinterFlowUnitTestResponse = winterFlowThreadJava;
    }

    public WinterFlowExceptionParser WinterFlowHookDataSource() {
        WinterFlowExceptionParser WinterFlowSyntax;
        WinterFlowExceptionParser WinterFlowCacheManagerAgent;
        int i;
        FirebaseMessaging firebaseMessaging = this.WinterFlowVariableVersionControl;
        String str = this.WinterFlowTransactionManagerStrategy;
        WinterFlowThreadJava winterFlowThreadJava = this.WinterFlowUnitTestResponse;
        WinterFlowRequestEngine winterFlowRequestEngine = firebaseMessaging.WinterFlowArrayNetwork;
        boolean WinterFlowTransactionAgent = winterFlowRequestEngine.WinterFlowTransactionAgent();
        if (!WinterFlowTransactionAgent || ((WinterFlowAdapterUnitTest) winterFlowRequestEngine.WinterFlowSyntax).WinterFlowArrayNetwork() < 261200000) {
            WinterFlowSchedulerParser winterFlowSchedulerParser = (WinterFlowSchedulerParser) winterFlowRequestEngine.WinterFlowRouterRouter;
            String WinterFlowCacheManagerAgent2 = WinterFlowAdapterUnitTest.WinterFlowCacheManagerAgent((com.google.firebase.WinterFlowSyntaxEvent) winterFlowSchedulerParser.WinterFlowRouterStructure);
            Bundle bundle = new Bundle();
            try {
                winterFlowSchedulerParser.WinterFlowRouterRouter(WinterFlowCacheManagerAgent2, bundle, WinterFlowTransactionAgent);
                WinterFlowProviderUserManager winterFlowProviderUserManager = (WinterFlowProviderUserManager) winterFlowSchedulerParser.WinterFlowCacheManagerAgent;
                WinterFlowRuntimeService winterFlowRuntimeService = WinterFlowRuntimeService.WinterFlowTransactionManagerStrategy;
                WinterFlowFrontendTesting winterFlowFrontendTesting = winterFlowProviderUserManager.WinterFlowCacheManagerAgent;
                if (winterFlowFrontendTesting.WinterFlowConcurrencyThread() < 12000000) {
                    WinterFlowSyntax = winterFlowFrontendTesting.WinterFlowOrchestrationSubsystem() != 0 ? winterFlowProviderUserManager.WinterFlowHookDataSource(bundle).WinterFlowArrayNetwork(winterFlowRuntimeService, new WinterFlowCacheManagerVersionControl(13, winterFlowProviderUserManager, bundle)) : WinterFlowHookProcessor.WinterFlowSyntax(new IOException("MISSING_INSTANCEID_SERVICE"));
                } else {
                    WinterFlowProtocolPlatform WinterFlowTransactionAgent2 = WinterFlowProtocolPlatform.WinterFlowTransactionAgent(winterFlowProviderUserManager.WinterFlowHookDataSource);
                    synchronized (WinterFlowTransactionAgent2) {
                        i = WinterFlowTransactionAgent2.WinterFlowRouterStructure;
                        WinterFlowTransactionAgent2.WinterFlowRouterStructure = i + 1;
                    }
                    WinterFlowSyntax = WinterFlowTransactionAgent2.WinterFlowServerProtocol(new WinterFlowWidgetUtility(i, 1, bundle, 1)).WinterFlowCacheManagerAgent(winterFlowRuntimeService, WinterFlowPackageHook.WinterFlowUnitTestResponse);
                }
            } catch (InterruptedException | ExecutionException e) {
                WinterFlowSyntax = WinterFlowHookProcessor.WinterFlowSyntax(e);
            }
            WinterFlowCacheManagerAgent = WinterFlowSyntax.WinterFlowCacheManagerAgent(new WinterFlowOrchestrationSession(1), new WinterFlowCompilerMechanism(winterFlowSchedulerParser));
        } else {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new WinterFlowCompilerScheduler("Firebase-Messaging-Network-Io"));
            WinterFlowCacheManagerAgent = ((WinterFlowBackendComponent) ((WinterFlowDatabaseSchemaBandwidth) winterFlowRequestEngine.WinterFlowUnitTestResponse)).WinterFlowCacheManagerAgent().WinterFlowArrayNetwork(newSingleThreadExecutor, new WinterFlowStackInterface(2, winterFlowRequestEngine, newSingleThreadExecutor));
        }
        ThreadPoolExecutor threadPoolExecutor = firebaseMessaging.WinterFlowRouterRouter;
        WinterFlowListenerWebsocket winterFlowListenerWebsocket = new WinterFlowListenerWebsocket(firebaseMessaging, str, winterFlowThreadJava);
        WinterFlowExceptionParser winterFlowExceptionParser = new WinterFlowExceptionParser();
        WinterFlowCacheManagerAgent.WinterFlowHookDataSource.WinterFlowHookDataSource(new WinterFlowProtocolMechanism(threadPoolExecutor, winterFlowListenerWebsocket, winterFlowExceptionParser));
        WinterFlowCacheManagerAgent.WinterFlowThreadListener();
        return winterFlowExceptionParser;
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareRouter
    public WinterFlowExceptionParser WinterFlowRouterStructure(Object obj) {
        String str;
        FirebaseMessaging firebaseMessaging = this.WinterFlowVariableVersionControl;
        String str2 = this.WinterFlowTransactionManagerStrategy;
        WinterFlowThreadJava winterFlowThreadJava = this.WinterFlowUnitTestResponse;
        String str3 = (String) obj;
        WinterFlowNodeSerializer WinterFlowCacheManagerAgent = FirebaseMessaging.WinterFlowCacheManagerAgent(firebaseMessaging.WinterFlowHookDataSource);
        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = firebaseMessaging.WinterFlowRouterStructure;
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        String WinterFlowCacheManagerAgent2 = "[DEFAULT]".equals(winterFlowSyntaxEvent.WinterFlowHookDataSource) ? "" : winterFlowSyntaxEvent.WinterFlowCacheManagerAgent();
        String WinterFlowHookDataSource = firebaseMessaging.WinterFlowSyntax.WinterFlowHookDataSource();
        synchronized (WinterFlowCacheManagerAgent) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str3);
                jSONObject.put("appVersion", WinterFlowHookDataSource);
                jSONObject.put("timestamp", currentTimeMillis);
                str = jSONObject.toString();
            } catch (JSONException e) {
                e.toString();
                str = null;
            }
            if (str != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) WinterFlowCacheManagerAgent.WinterFlowVariableVersionControl).edit();
                edit.putString(WinterFlowCacheManagerAgent2 + "|T|" + str2 + "|*", str);
                edit.commit();
            }
        }
        if (firebaseMessaging.WinterFlowArrayNetwork.WinterFlowTransactionAgent() || winterFlowThreadJava == null || !str3.equals((String) winterFlowThreadJava.WinterFlowHookDataSource)) {
            com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent2 = firebaseMessaging.WinterFlowRouterStructure;
            winterFlowSyntaxEvent2.WinterFlowRouterStructure();
            if ("[DEFAULT]".equals(winterFlowSyntaxEvent2.WinterFlowHookDataSource)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    winterFlowSyntaxEvent2.WinterFlowRouterStructure();
                }
                boolean WinterFlowTransactionAgent = firebaseMessaging.WinterFlowArrayNetwork.WinterFlowTransactionAgent();
                Intent intent = new Intent();
                intent.putExtra("token", str3);
                if (WinterFlowTransactionAgent) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new WinterFlowAlgorithmArray(firebaseMessaging.WinterFlowHookDataSource, 0).WinterFlowBackendCacheManager(intent);
            }
        }
        return WinterFlowHookProcessor.WinterFlowResponseEngine(str3);
    }
}
