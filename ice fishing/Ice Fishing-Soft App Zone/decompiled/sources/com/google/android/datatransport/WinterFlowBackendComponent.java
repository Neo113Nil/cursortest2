package com.google.android.datatransport;

import android.net.TrafficStats;
import android.text.TextUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBackendComponent implements WinterFlowDatabaseSchemaBandwidth {
    public static final Object WinterFlowServerProtocol = new Object();
    public final WinterFlowRendererEncryption WinterFlowArrayNetwork;
    public final WinterFlowAlgorithmArray WinterFlowCacheManagerAgent;
    public final WinterFlowRuntimeRouter WinterFlowHookDataSource;
    public final HashSet WinterFlowResponseEngine;
    public final WinterFlowValidatorVersion WinterFlowRouterRouter;
    public final com.google.firebase.WinterFlowSyntaxEvent WinterFlowRouterStructure;
    public String WinterFlowSyntax;
    public final ArrayList WinterFlowTransactionAgent;
    public final Object WinterFlowTransactionManagerStrategy;
    public final ExecutorService WinterFlowUnitTestResponse;
    public final WinterFlowRendererTransaction WinterFlowVariableVersionControl;

    static {
        new AtomicInteger(1);
    }

    public WinterFlowBackendComponent(com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent, WinterFlowHookInheritance winterFlowHookInheritance, ExecutorService executorService, WinterFlowValidatorVersion winterFlowValidatorVersion) {
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        WinterFlowRuntimeRouter winterFlowRuntimeRouter = new WinterFlowRuntimeRouter(winterFlowSyntaxEvent.WinterFlowRouterStructure, winterFlowHookInheritance);
        WinterFlowAlgorithmArray winterFlowAlgorithmArray = new WinterFlowAlgorithmArray(winterFlowSyntaxEvent);
        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowThreadPoolProcess.WinterFlowTransactionManagerStrategy;
        if (winterFlowThreadPoolProcess == null) {
            winterFlowThreadPoolProcess = new WinterFlowThreadPoolProcess(27);
            WinterFlowThreadPoolProcess.WinterFlowTransactionManagerStrategy = winterFlowThreadPoolProcess;
        }
        WinterFlowRendererEncryption winterFlowRendererEncryption = WinterFlowRendererEncryption.WinterFlowHookDataSource;
        if (winterFlowRendererEncryption == null) {
            winterFlowRendererEncryption = new WinterFlowRendererEncryption(winterFlowThreadPoolProcess);
            WinterFlowRendererEncryption.WinterFlowHookDataSource = winterFlowRendererEncryption;
        }
        WinterFlowRendererTransaction winterFlowRendererTransaction = new WinterFlowRendererTransaction(new WinterFlowObjectClass(2, winterFlowSyntaxEvent));
        this.WinterFlowTransactionManagerStrategy = new Object();
        this.WinterFlowResponseEngine = new HashSet();
        this.WinterFlowTransactionAgent = new ArrayList();
        this.WinterFlowRouterStructure = winterFlowSyntaxEvent;
        this.WinterFlowHookDataSource = winterFlowRuntimeRouter;
        this.WinterFlowCacheManagerAgent = winterFlowAlgorithmArray;
        this.WinterFlowArrayNetwork = winterFlowRendererEncryption;
        this.WinterFlowVariableVersionControl = winterFlowRendererTransaction;
        this.WinterFlowUnitTestResponse = executorService;
        this.WinterFlowRouterRouter = winterFlowValidatorVersion;
    }

    public final WinterFlowExceptionParser WinterFlowArrayNetwork() {
        WinterFlowVariableVersionControl();
        WinterFlowArrayEngine winterFlowArrayEngine = new WinterFlowArrayEngine();
        WinterFlowTransactionManagerJava winterFlowTransactionManagerJava = new WinterFlowTransactionManagerJava(this.WinterFlowArrayNetwork, winterFlowArrayEngine);
        synchronized (this.WinterFlowTransactionManagerStrategy) {
            this.WinterFlowTransactionAgent.add(winterFlowTransactionManagerJava);
        }
        WinterFlowExceptionParser winterFlowExceptionParser = winterFlowArrayEngine.WinterFlowRouterStructure;
        this.WinterFlowUnitTestResponse.execute(new WinterFlowViewPlatform(this, 2));
        return winterFlowExceptionParser;
    }

    public final WinterFlowExceptionParser WinterFlowCacheManagerAgent() {
        String str;
        WinterFlowVariableVersionControl();
        synchronized (this) {
            str = this.WinterFlowSyntax;
        }
        if (str != null) {
            return WinterFlowHookProcessor.WinterFlowResponseEngine(str);
        }
        WinterFlowArrayEngine winterFlowArrayEngine = new WinterFlowArrayEngine();
        WinterFlowScheduler winterFlowScheduler = new WinterFlowScheduler(winterFlowArrayEngine);
        synchronized (this.WinterFlowTransactionManagerStrategy) {
            this.WinterFlowTransactionAgent.add(winterFlowScheduler);
        }
        WinterFlowExceptionParser winterFlowExceptionParser = winterFlowArrayEngine.WinterFlowRouterStructure;
        this.WinterFlowUnitTestResponse.execute(new WinterFlowViewPlatform(this, 0));
        return winterFlowExceptionParser;
    }

    public final WinterFlowManagerEvent WinterFlowHookDataSource(WinterFlowManagerEvent winterFlowManagerEvent) {
        String str;
        int responseCode;
        WinterFlowVersionControlMechanism winterFlowVersionControlMechanism;
        WinterFlowVersionControlMechanism winterFlowVersionControlMechanism2;
        WinterFlowRuntimeRouter winterFlowRuntimeRouter = this.WinterFlowHookDataSource;
        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = this.WinterFlowRouterStructure;
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        String str2 = winterFlowSyntaxEvent.WinterFlowCacheManagerAgent.WinterFlowRouterStructure;
        String str3 = winterFlowManagerEvent.WinterFlowRouterStructure;
        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent2 = this.WinterFlowRouterStructure;
        winterFlowSyntaxEvent2.WinterFlowRouterStructure();
        String str4 = winterFlowSyntaxEvent2.WinterFlowCacheManagerAgent.WinterFlowUnitTestResponse;
        String str5 = winterFlowManagerEvent.WinterFlowArrayNetwork;
        WinterFlowPipelineSerializer winterFlowPipelineSerializer = winterFlowRuntimeRouter.WinterFlowCacheManagerAgent;
        if (!winterFlowPipelineSerializer.WinterFlowRouterStructure()) {
            throw new WinterFlowRequestEntity("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL WinterFlowRouterStructure = WinterFlowRuntimeRouter.WinterFlowRouterStructure("projects/" + str4 + "/installations/" + str3 + "/authTokens:generate");
        int i = 0;
        while (i <= 1) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection WinterFlowCacheManagerAgent = winterFlowRuntimeRouter.WinterFlowCacheManagerAgent(WinterFlowRouterStructure, str2);
            try {
                try {
                    WinterFlowCacheManagerAgent.setRequestMethod("POST");
                    WinterFlowCacheManagerAgent.addRequestProperty("Authorization", "FIS_v2 " + str5);
                    WinterFlowCacheManagerAgent.setDoOutput(true);
                    WinterFlowRuntimeRouter.WinterFlowRouterRouter(WinterFlowCacheManagerAgent);
                    responseCode = WinterFlowCacheManagerAgent.getResponseCode();
                    winterFlowPipelineSerializer.WinterFlowHookDataSource(responseCode);
                } finally {
                    WinterFlowCacheManagerAgent.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
                str = str5;
            }
            if (responseCode >= 200 && responseCode < 300) {
                winterFlowVersionControlMechanism2 = WinterFlowRuntimeRouter.WinterFlowTransactionManagerStrategy(WinterFlowCacheManagerAgent);
            } else {
                WinterFlowRuntimeRouter.WinterFlowHookDataSource(WinterFlowCacheManagerAgent, null);
                str = str5;
                if (responseCode == 401 || responseCode == 404) {
                    if (((byte) (0 | 1)) != 1) {
                        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                    }
                    winterFlowVersionControlMechanism = new WinterFlowVersionControlMechanism(null, 0L, 3);
                } else {
                    if (responseCode == 429) {
                        throw new WinterFlowRequestEntity("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        if (((byte) (0 | 1)) != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        winterFlowVersionControlMechanism = new WinterFlowVersionControlMechanism(null, 0L, 2);
                    }
                    i++;
                    str5 = str;
                }
                WinterFlowCacheManagerAgent.disconnect();
                TrafficStats.clearThreadStatsTag();
                winterFlowVersionControlMechanism2 = winterFlowVersionControlMechanism;
            }
            int WinterFlowRouterAdapter = WinterFlowResolverBackend.WinterFlowRouterAdapter(winterFlowVersionControlMechanism2.WinterFlowCacheManagerAgent);
            if (WinterFlowRouterAdapter == 0) {
                String str6 = winterFlowVersionControlMechanism2.WinterFlowRouterStructure;
                long j = winterFlowVersionControlMechanism2.WinterFlowHookDataSource;
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                WinterFlowValidatorDatabaseSchema WinterFlowRouterStructure2 = winterFlowManagerEvent.WinterFlowRouterStructure();
                WinterFlowRouterStructure2.WinterFlowCacheManagerAgent = str6;
                WinterFlowRouterStructure2.WinterFlowVariableVersionControl = j;
                byte b = (byte) (WinterFlowRouterStructure2.WinterFlowRouterRouter | 1);
                WinterFlowRouterStructure2.WinterFlowTransactionManagerStrategy = currentTimeMillis;
                WinterFlowRouterStructure2.WinterFlowRouterRouter = (byte) (b | 2);
                return WinterFlowRouterStructure2.WinterFlowRouterStructure();
            }
            if (WinterFlowRouterAdapter == 1) {
                WinterFlowValidatorDatabaseSchema WinterFlowRouterStructure3 = winterFlowManagerEvent.WinterFlowRouterStructure();
                WinterFlowRouterStructure3.WinterFlowUnitTestResponse = "BAD CONFIG";
                WinterFlowRouterStructure3.WinterFlowHookDataSource = 5;
                return WinterFlowRouterStructure3.WinterFlowRouterStructure();
            }
            if (WinterFlowRouterAdapter != 2) {
                throw new WinterFlowRequestEntity("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.WinterFlowSyntax = null;
            }
            WinterFlowValidatorDatabaseSchema WinterFlowRouterStructure4 = winterFlowManagerEvent.WinterFlowRouterStructure();
            WinterFlowRouterStructure4.WinterFlowHookDataSource = 2;
            return WinterFlowRouterStructure4.WinterFlowRouterStructure();
        }
        throw new WinterFlowRequestEntity("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void WinterFlowRouterRouter(Exception exc) {
        synchronized (this.WinterFlowTransactionManagerStrategy) {
            try {
                Iterator it = this.WinterFlowTransactionAgent.iterator();
                while (it.hasNext()) {
                    if (((WinterFlowRefactoringWidget) it.next()).WinterFlowHookDataSource(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:6:0x000e, B:12:0x0022), top: B:5:0x000e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[Catch: all -> 0x0041, TRY_ENTER, TryCatch #0 {all -> 0x0041, blocks: (B:4:0x0003, B:15:0x003d, B:16:0x0043, B:23:0x0054, B:24:0x0057, B:6:0x000e, B:12:0x0022), top: B:3:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowRouterStructure() {
        WinterFlowManagerEvent WinterFlowEventEmitterController;
        int i;
        boolean z;
        synchronized (WinterFlowServerProtocol) {
            try {
                com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = this.WinterFlowRouterStructure;
                winterFlowSyntaxEvent.WinterFlowRouterStructure();
                WinterFlowAlgorithmArray WinterFlowRouterRouter = WinterFlowAlgorithmArray.WinterFlowRouterRouter(winterFlowSyntaxEvent.WinterFlowRouterStructure);
                try {
                    WinterFlowEventEmitterController = this.WinterFlowCacheManagerAgent.WinterFlowEventEmitterController();
                    int i2 = WinterFlowEventEmitterController.WinterFlowHookDataSource;
                    i = 1;
                    if (i2 != 2 && i2 != 1) {
                        z = false;
                        if (z) {
                            String WinterFlowTransactionManagerStrategy = WinterFlowTransactionManagerStrategy(WinterFlowEventEmitterController);
                            WinterFlowAlgorithmArray winterFlowAlgorithmArray = this.WinterFlowCacheManagerAgent;
                            WinterFlowValidatorDatabaseSchema WinterFlowRouterStructure = WinterFlowEventEmitterController.WinterFlowRouterStructure();
                            WinterFlowRouterStructure.WinterFlowRouterStructure = WinterFlowTransactionManagerStrategy;
                            WinterFlowRouterStructure.WinterFlowHookDataSource = 3;
                            WinterFlowEventEmitterController = WinterFlowRouterStructure.WinterFlowRouterStructure();
                            winterFlowAlgorithmArray.WinterFlowSerializerStructure(WinterFlowEventEmitterController);
                        }
                        if (WinterFlowRouterRouter != null) {
                            WinterFlowRouterRouter.WinterFlowCompilerVariable();
                        }
                    }
                    z = true;
                    if (z) {
                    }
                    if (WinterFlowRouterRouter != null) {
                    }
                } catch (Throwable th) {
                    if (WinterFlowRouterRouter != null) {
                        WinterFlowRouterRouter.WinterFlowCompilerVariable();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        WinterFlowSyntax(WinterFlowEventEmitterController);
        this.WinterFlowRouterRouter.execute(new WinterFlowViewPlatform(this, i));
    }

    public final void WinterFlowSyntax(WinterFlowManagerEvent winterFlowManagerEvent) {
        synchronized (this.WinterFlowTransactionManagerStrategy) {
            try {
                Iterator it = this.WinterFlowTransactionAgent.iterator();
                while (it.hasNext()) {
                    if (((WinterFlowRefactoringWidget) it.next()).WinterFlowRouterStructure(winterFlowManagerEvent)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.WinterFlowHookDataSource) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String WinterFlowTransactionManagerStrategy(WinterFlowManagerEvent winterFlowManagerEvent) {
        String string;
        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = this.WinterFlowRouterStructure;
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        if (!winterFlowSyntaxEvent.WinterFlowHookDataSource.equals("CHIME_ANDROID_SDK")) {
            com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent2 = this.WinterFlowRouterStructure;
            winterFlowSyntaxEvent2.WinterFlowRouterStructure();
        }
        if (winterFlowManagerEvent.WinterFlowHookDataSource == 1) {
            WinterFlowVersionControlManager winterFlowVersionControlManager = (WinterFlowVersionControlManager) this.WinterFlowVariableVersionControl.get();
            synchronized (winterFlowVersionControlManager.WinterFlowRouterStructure) {
                try {
                    synchronized (winterFlowVersionControlManager.WinterFlowRouterStructure) {
                        string = winterFlowVersionControlManager.WinterFlowRouterStructure.getString("|S|id", null);
                    }
                    if (string == null) {
                        string = winterFlowVersionControlManager.WinterFlowRouterStructure();
                    }
                } finally {
                }
            }
            return TextUtils.isEmpty(string) ? WinterFlowExceptionEncryption.WinterFlowRouterStructure() : string;
        }
        return WinterFlowExceptionEncryption.WinterFlowRouterStructure();
    }

    public final WinterFlowManagerEvent WinterFlowUnitTestResponse(WinterFlowManagerEvent winterFlowManagerEvent) {
        int responseCode;
        WinterFlowHookIDE WinterFlowVariableVersionControl;
        String str = winterFlowManagerEvent.WinterFlowRouterStructure;
        String str2 = null;
        if (str != null && str.length() == 11) {
            WinterFlowVersionControlManager winterFlowVersionControlManager = (WinterFlowVersionControlManager) this.WinterFlowVariableVersionControl.get();
            synchronized (winterFlowVersionControlManager.WinterFlowRouterStructure) {
                try {
                    String[] strArr = WinterFlowVersionControlManager.WinterFlowCacheManagerAgent;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str3 = strArr[i];
                            String string = winterFlowVersionControlManager.WinterFlowRouterStructure.getString("|T|" + winterFlowVersionControlManager.WinterFlowHookDataSource + "|" + str3, null);
                            if (string == null || string.isEmpty()) {
                                i++;
                            } else if (string.startsWith("{")) {
                                try {
                                    str2 = new JSONObject(string).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                str2 = string;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        WinterFlowRuntimeRouter winterFlowRuntimeRouter = this.WinterFlowHookDataSource;
        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = this.WinterFlowRouterStructure;
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        String str4 = winterFlowSyntaxEvent.WinterFlowCacheManagerAgent.WinterFlowRouterStructure;
        String str5 = winterFlowManagerEvent.WinterFlowRouterStructure;
        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent2 = this.WinterFlowRouterStructure;
        winterFlowSyntaxEvent2.WinterFlowRouterStructure();
        String str6 = winterFlowSyntaxEvent2.WinterFlowCacheManagerAgent.WinterFlowUnitTestResponse;
        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent3 = this.WinterFlowRouterStructure;
        winterFlowSyntaxEvent3.WinterFlowRouterStructure();
        String str7 = winterFlowSyntaxEvent3.WinterFlowCacheManagerAgent.WinterFlowHookDataSource;
        WinterFlowPipelineSerializer winterFlowPipelineSerializer = winterFlowRuntimeRouter.WinterFlowCacheManagerAgent;
        if (!winterFlowPipelineSerializer.WinterFlowRouterStructure()) {
            throw new WinterFlowRequestEntity("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL WinterFlowRouterStructure = WinterFlowRuntimeRouter.WinterFlowRouterStructure("projects/" + str6 + "/installations");
        for (int i2 = 0; i2 <= 1; i2++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection WinterFlowCacheManagerAgent = winterFlowRuntimeRouter.WinterFlowCacheManagerAgent(WinterFlowRouterStructure, str4);
            try {
                try {
                    WinterFlowCacheManagerAgent.setRequestMethod("POST");
                    WinterFlowCacheManagerAgent.setDoOutput(true);
                    if (str2 != null) {
                        WinterFlowCacheManagerAgent.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    WinterFlowRuntimeRouter.WinterFlowUnitTestResponse(WinterFlowCacheManagerAgent, str5, str7);
                    responseCode = WinterFlowCacheManagerAgent.getResponseCode();
                    winterFlowPipelineSerializer.WinterFlowHookDataSource(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    WinterFlowVariableVersionControl = WinterFlowRuntimeRouter.WinterFlowVariableVersionControl(WinterFlowCacheManagerAgent);
                    WinterFlowCacheManagerAgent.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    WinterFlowRuntimeRouter.WinterFlowHookDataSource(WinterFlowCacheManagerAgent, str7);
                    if (responseCode == 429) {
                        throw new WinterFlowRequestEntity("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        WinterFlowHookIDE winterFlowHookIDE = new WinterFlowHookIDE(null, null, null, null, 2);
                        WinterFlowCacheManagerAgent.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        WinterFlowVariableVersionControl = winterFlowHookIDE;
                    }
                    WinterFlowCacheManagerAgent.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                int WinterFlowRouterAdapter = WinterFlowResolverBackend.WinterFlowRouterAdapter(WinterFlowVariableVersionControl.WinterFlowVariableVersionControl);
                if (WinterFlowRouterAdapter != 0) {
                    if (WinterFlowRouterAdapter != 1) {
                        throw new WinterFlowRequestEntity("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    WinterFlowValidatorDatabaseSchema WinterFlowRouterStructure2 = winterFlowManagerEvent.WinterFlowRouterStructure();
                    WinterFlowRouterStructure2.WinterFlowUnitTestResponse = "BAD CONFIG";
                    WinterFlowRouterStructure2.WinterFlowHookDataSource = 5;
                    return WinterFlowRouterStructure2.WinterFlowRouterStructure();
                }
                String str8 = WinterFlowVariableVersionControl.WinterFlowHookDataSource;
                String str9 = WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent;
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                WinterFlowVersionControlMechanism winterFlowVersionControlMechanism = WinterFlowVariableVersionControl.WinterFlowArrayNetwork;
                String str10 = winterFlowVersionControlMechanism.WinterFlowRouterStructure;
                long j = winterFlowVersionControlMechanism.WinterFlowHookDataSource;
                WinterFlowValidatorDatabaseSchema WinterFlowRouterStructure3 = winterFlowManagerEvent.WinterFlowRouterStructure();
                WinterFlowRouterStructure3.WinterFlowRouterStructure = str8;
                WinterFlowRouterStructure3.WinterFlowHookDataSource = 4;
                WinterFlowRouterStructure3.WinterFlowCacheManagerAgent = str10;
                WinterFlowRouterStructure3.WinterFlowArrayNetwork = str9;
                WinterFlowRouterStructure3.WinterFlowVariableVersionControl = j;
                byte b = (byte) (WinterFlowRouterStructure3.WinterFlowRouterRouter | 1);
                WinterFlowRouterStructure3.WinterFlowTransactionManagerStrategy = currentTimeMillis;
                WinterFlowRouterStructure3.WinterFlowRouterRouter = (byte) (b | 2);
                return WinterFlowRouterStructure3.WinterFlowRouterStructure();
            } finally {
                WinterFlowCacheManagerAgent.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new WinterFlowRequestEntity("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void WinterFlowVariableVersionControl() {
        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = this.WinterFlowRouterStructure;
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        WinterFlowUnitTestLibrary.WinterFlowOrchestrationSubsystem(winterFlowSyntaxEvent.WinterFlowCacheManagerAgent.WinterFlowHookDataSource, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        WinterFlowUnitTestLibrary.WinterFlowOrchestrationSubsystem(winterFlowSyntaxEvent.WinterFlowCacheManagerAgent.WinterFlowUnitTestResponse, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        WinterFlowUnitTestLibrary.WinterFlowOrchestrationSubsystem(winterFlowSyntaxEvent.WinterFlowCacheManagerAgent.WinterFlowRouterStructure, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        String str = winterFlowSyntaxEvent.WinterFlowCacheManagerAgent.WinterFlowHookDataSource;
        Pattern pattern = WinterFlowRendererEncryption.WinterFlowRouterStructure;
        WinterFlowUnitTestLibrary.WinterFlowThreadListener("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        WinterFlowUnitTestLibrary.WinterFlowThreadListener("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", WinterFlowRendererEncryption.WinterFlowRouterStructure.matcher(winterFlowSyntaxEvent.WinterFlowCacheManagerAgent.WinterFlowRouterStructure).matches());
    }
}
