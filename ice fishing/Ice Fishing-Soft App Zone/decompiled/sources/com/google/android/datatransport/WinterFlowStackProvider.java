package com.google.android.datatransport;

import android.content.Context;
import android.graphics.Typeface;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowStackProvider implements WinterFlowParserTransaction, WinterFlowBatchSession, WinterFlowDecoratorRuntime, WinterFlowSoftwareStrategy {
    public static WinterFlowStackProvider WinterFlowSyntax;
    public Object WinterFlowRouterRouter;
    public Object WinterFlowTransactionManagerStrategy;
    public Object WinterFlowUnitTestResponse;
    public Object WinterFlowVariableVersionControl;

    public WinterFlowStackProvider(Typeface typeface, WinterFlowInheritanceQuery winterFlowInheritanceQuery) {
        int i;
        int i2;
        int i3;
        int i4;
        this.WinterFlowRouterRouter = typeface;
        this.WinterFlowVariableVersionControl = winterFlowInheritanceQuery;
        this.WinterFlowUnitTestResponse = new WinterFlowControllerUnitTest(1024);
        int WinterFlowRouterStructure = winterFlowInheritanceQuery.WinterFlowRouterStructure(6);
        if (WinterFlowRouterStructure != 0) {
            int i5 = WinterFlowRouterStructure + winterFlowInheritanceQuery.WinterFlowVariableVersionControl;
            i = ((ByteBuffer) winterFlowInheritanceQuery.WinterFlowRouterRouter).getInt(((ByteBuffer) winterFlowInheritanceQuery.WinterFlowRouterRouter).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.WinterFlowTransactionManagerStrategy = new char[i * 2];
        int WinterFlowRouterStructure2 = winterFlowInheritanceQuery.WinterFlowRouterStructure(6);
        if (WinterFlowRouterStructure2 != 0) {
            int i6 = WinterFlowRouterStructure2 + winterFlowInheritanceQuery.WinterFlowVariableVersionControl;
            i2 = ((ByteBuffer) winterFlowInheritanceQuery.WinterFlowRouterRouter).getInt(((ByteBuffer) winterFlowInheritanceQuery.WinterFlowRouterRouter).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            WinterFlowBackend winterFlowBackend = new WinterFlowBackend(this, i7);
            WinterFlowSoftwareVersion WinterFlowHookDataSource = winterFlowBackend.WinterFlowHookDataSource();
            int WinterFlowRouterStructure3 = WinterFlowHookDataSource.WinterFlowRouterStructure(4);
            Character.toChars(WinterFlowRouterStructure3 != 0 ? ((ByteBuffer) WinterFlowHookDataSource.WinterFlowRouterRouter).getInt(WinterFlowRouterStructure3 + WinterFlowHookDataSource.WinterFlowVariableVersionControl) : 0, (char[]) this.WinterFlowTransactionManagerStrategy, i7 * 2);
            WinterFlowSoftwareVersion WinterFlowHookDataSource2 = winterFlowBackend.WinterFlowHookDataSource();
            int WinterFlowRouterStructure4 = WinterFlowHookDataSource2.WinterFlowRouterStructure(16);
            if (WinterFlowRouterStructure4 != 0) {
                int i8 = WinterFlowRouterStructure4 + WinterFlowHookDataSource2.WinterFlowVariableVersionControl;
                i3 = ((ByteBuffer) WinterFlowHookDataSource2.WinterFlowRouterRouter).getInt(((ByteBuffer) WinterFlowHookDataSource2.WinterFlowRouterRouter).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("invalid metadata codepoint length");
                throw null;
            }
            WinterFlowControllerUnitTest winterFlowControllerUnitTest = (WinterFlowControllerUnitTest) this.WinterFlowUnitTestResponse;
            WinterFlowSoftwareVersion WinterFlowHookDataSource3 = winterFlowBackend.WinterFlowHookDataSource();
            int WinterFlowRouterStructure5 = WinterFlowHookDataSource3.WinterFlowRouterStructure(16);
            if (WinterFlowRouterStructure5 != 0) {
                int i9 = WinterFlowRouterStructure5 + WinterFlowHookDataSource3.WinterFlowVariableVersionControl;
                i4 = ((ByteBuffer) WinterFlowHookDataSource3.WinterFlowRouterRouter).getInt(((ByteBuffer) WinterFlowHookDataSource3.WinterFlowRouterRouter).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            winterFlowControllerUnitTest.WinterFlowRouterStructure(winterFlowBackend, 0, i4 - 1);
        }
    }

    public static void WinterFlowArrayNetwork(WinterFlowStackProvider winterFlowStackProvider, WinterFlowStackIDE winterFlowStackIDE) {
        winterFlowStackProvider.getClass();
        winterFlowStackIDE.getClass();
        if (((LinkedHashSet) winterFlowStackProvider.WinterFlowUnitTestResponse).add(winterFlowStackIDE)) {
            WinterFlowProtocolInterface winterFlowProtocolInterface = (WinterFlowProtocolInterface) winterFlowStackProvider.WinterFlowTransactionManagerStrategy;
            if (winterFlowStackIDE.WinterFlowCacheManagerAgent != null) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterAdapter("Handler '", winterFlowStackIDE, "' is already registered with a dispatcher");
                return;
            }
            winterFlowProtocolInterface.WinterFlowVariableVersionControl.addFirst(winterFlowStackIDE);
            winterFlowStackIDE.WinterFlowCacheManagerAgent = winterFlowStackProvider;
            winterFlowProtocolInterface.WinterFlowHookDataSource();
        }
    }

    public static synchronized WinterFlowStackProvider WinterFlowServerProtocol() {
        WinterFlowStackProvider winterFlowStackProvider;
        synchronized (WinterFlowStackProvider.class) {
            winterFlowStackProvider = WinterFlowSyntax;
            if (winterFlowStackProvider == null) {
                winterFlowStackProvider = new WinterFlowStackProvider();
                winterFlowStackProvider.WinterFlowVariableVersionControl = null;
                winterFlowStackProvider.WinterFlowTransactionManagerStrategy = null;
                winterFlowStackProvider.WinterFlowUnitTestResponse = null;
                winterFlowStackProvider.WinterFlowRouterRouter = new ArrayDeque();
                WinterFlowSyntax = winterFlowStackProvider;
            }
        }
        return winterFlowStackProvider;
    }

    @Override // com.google.android.datatransport.WinterFlowFrontendAgent
    public WinterFlowConfigurationResponse WinterFlowBandwidthObject(long j, WinterFlowConfigurationResponse winterFlowConfigurationResponse, WinterFlowConfigurationResponse winterFlowConfigurationResponse2, WinterFlowConfigurationResponse winterFlowConfigurationResponse3) {
        WinterFlowConfigurationResponse winterFlowConfigurationResponse4 = (WinterFlowConfigurationResponse) this.WinterFlowUnitTestResponse;
        if (winterFlowConfigurationResponse4 == null) {
            winterFlowConfigurationResponse4 = winterFlowConfigurationResponse3.WinterFlowCacheManagerAgent();
            this.WinterFlowUnitTestResponse = winterFlowConfigurationResponse4;
        }
        int WinterFlowHookDataSource = winterFlowConfigurationResponse4.WinterFlowHookDataSource();
        int i = 0;
        while (true) {
            WinterFlowConfigurationResponse winterFlowConfigurationResponse5 = (WinterFlowConfigurationResponse) this.WinterFlowUnitTestResponse;
            if (i >= WinterFlowHookDataSource) {
                if (winterFlowConfigurationResponse5 != null) {
                    return winterFlowConfigurationResponse5;
                }
                WinterFlowManagerRequest.WinterFlowCloudMicroservice("velocityVector");
                throw null;
            }
            if (winterFlowConfigurationResponse5 == null) {
                WinterFlowManagerRequest.WinterFlowCloudMicroservice("velocityVector");
                throw null;
            }
            long j2 = j;
            winterFlowConfigurationResponse5.WinterFlowVariableVersionControl(((WinterFlowAPIScheduler) this.WinterFlowVariableVersionControl).get(i).WinterFlowCacheManagerAgent(j2, winterFlowConfigurationResponse.WinterFlowRouterStructure(i), winterFlowConfigurationResponse2.WinterFlowRouterStructure(i), winterFlowConfigurationResponse3.WinterFlowRouterStructure(i)), i);
            i++;
            j = j2;
        }
    }

    public WinterFlowStackProvider WinterFlowBatchUI() {
        CharSequence charSequence = (CharSequence) this.WinterFlowTransactionManagerStrategy;
        Matcher matcher = (Matcher) this.WinterFlowVariableVersionControl;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return WinterFlowNodeVersion.WinterFlowTransactionAgent(matcher2, end, charSequence);
    }

    @Override // com.google.android.datatransport.WinterFlowBatchSession
    public float WinterFlowCacheManagerAgent() {
        return ((Number) ((WinterFlowCloudCache) this.WinterFlowUnitTestResponse).getValue()).floatValue();
    }

    public WinterFlowTransactionVariable WinterFlowConcurrencyThread(WinterFlowEventEmitterCacheManager winterFlowEventEmitterCacheManager, String str) {
        WinterFlowTransactionVariable winterFlowTransactionVariable;
        WinterFlowTransactionVariable WinterFlowRouterStructure;
        synchronized (((WinterFlowThreadPoolProcess) this.WinterFlowRouterRouter)) {
            try {
                winterFlowTransactionVariable = (WinterFlowTransactionVariable) ((WinterFlowScriptManager) this.WinterFlowVariableVersionControl).WinterFlowRouterStructure.get(str);
                if (winterFlowEventEmitterCacheManager.WinterFlowArrayNetwork(winterFlowTransactionVariable)) {
                    WinterFlowUserManagerUserManager winterFlowUserManagerUserManager = (WinterFlowUserManagerUserManager) this.WinterFlowTransactionManagerStrategy;
                    if (winterFlowUserManagerUserManager instanceof WinterFlowJavaInterface) {
                        WinterFlowJavaInterface winterFlowJavaInterface = (WinterFlowJavaInterface) winterFlowUserManagerUserManager;
                        winterFlowTransactionVariable.getClass();
                        WinterFlowDatabaseUtility winterFlowDatabaseUtility = winterFlowJavaInterface.WinterFlowArrayNetwork;
                        if (winterFlowDatabaseUtility != null) {
                            WinterFlowAlgorithmArray winterFlowAlgorithmArray = winterFlowJavaInterface.WinterFlowVariableVersionControl;
                            winterFlowAlgorithmArray.getClass();
                            WinterFlowUnitTestLibrary.WinterFlowResponseEngine(winterFlowTransactionVariable, winterFlowAlgorithmArray, winterFlowDatabaseUtility);
                        }
                    }
                    winterFlowTransactionVariable.getClass();
                } else {
                    WinterFlowServiceProviderThreadPool winterFlowServiceProviderThreadPool = new WinterFlowServiceProviderThreadPool((WinterFlowEventEmitterHelper) this.WinterFlowUnitTestResponse);
                    winterFlowServiceProviderThreadPool.WinterFlowRouterStructure.put(WinterFlowQuerySyntax.WinterFlowTransactionAgent, str);
                    WinterFlowUserManagerUserManager winterFlowUserManagerUserManager2 = (WinterFlowUserManagerUserManager) this.WinterFlowTransactionManagerStrategy;
                    winterFlowUserManagerUserManager2.getClass();
                    try {
                        try {
                            WinterFlowRouterStructure = winterFlowUserManagerUserManager2.WinterFlowHookDataSource(winterFlowEventEmitterCacheManager, winterFlowServiceProviderThreadPool);
                        } catch (AbstractMethodError unused) {
                            WinterFlowRouterStructure = winterFlowUserManagerUserManager2.WinterFlowRouterStructure(WinterFlowEncryptionSubsystem.WinterFlowConfigurationSubsystem(winterFlowEventEmitterCacheManager));
                        }
                    } catch (AbstractMethodError unused2) {
                        WinterFlowRouterStructure = winterFlowUserManagerUserManager2.WinterFlowCacheManagerAgent(WinterFlowEncryptionSubsystem.WinterFlowConfigurationSubsystem(winterFlowEventEmitterCacheManager), winterFlowServiceProviderThreadPool);
                    }
                    winterFlowTransactionVariable = WinterFlowRouterStructure;
                    WinterFlowScriptManager winterFlowScriptManager = (WinterFlowScriptManager) this.WinterFlowVariableVersionControl;
                    winterFlowScriptManager.getClass();
                    winterFlowTransactionVariable.getClass();
                    WinterFlowTransactionVariable winterFlowTransactionVariable2 = (WinterFlowTransactionVariable) winterFlowScriptManager.WinterFlowRouterStructure.put(str, winterFlowTransactionVariable);
                    if (winterFlowTransactionVariable2 != null) {
                        winterFlowTransactionVariable2.WinterFlowHookDataSource();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return winterFlowTransactionVariable;
    }

    @Override // com.google.android.datatransport.WinterFlowBatchSession
    public boolean WinterFlowHookDataSource() {
        ArrayList arrayList = (ArrayList) this.WinterFlowRouterRouter;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((WinterFlowSchedulerComponent) arrayList.get(i)).WinterFlowRouterStructure.WinterFlowHookDataSource()) {
                return true;
            }
        }
        return false;
    }

    public WinterFlowConfigurationResponse WinterFlowOrchestrationSubsystem(long j, WinterFlowConfigurationResponse winterFlowConfigurationResponse, WinterFlowConfigurationResponse winterFlowConfigurationResponse2) {
        WinterFlowConfigurationResponse winterFlowConfigurationResponse3 = (WinterFlowConfigurationResponse) this.WinterFlowUnitTestResponse;
        if (winterFlowConfigurationResponse3 == null) {
            winterFlowConfigurationResponse3 = winterFlowConfigurationResponse.WinterFlowCacheManagerAgent();
            this.WinterFlowUnitTestResponse = winterFlowConfigurationResponse3;
        }
        int WinterFlowHookDataSource = winterFlowConfigurationResponse3.WinterFlowHookDataSource();
        int i = 0;
        while (true) {
            WinterFlowConfigurationResponse winterFlowConfigurationResponse4 = (WinterFlowConfigurationResponse) this.WinterFlowUnitTestResponse;
            if (i >= WinterFlowHookDataSource) {
                if (winterFlowConfigurationResponse4 != null) {
                    return winterFlowConfigurationResponse4;
                }
                WinterFlowManagerRequest.WinterFlowCloudMicroservice("velocityVector");
                throw null;
            }
            if (winterFlowConfigurationResponse4 == null) {
                WinterFlowManagerRequest.WinterFlowCloudMicroservice("velocityVector");
                throw null;
            }
            WinterFlowJSONDecorator winterFlowJSONDecorator = (WinterFlowJSONDecorator) this.WinterFlowVariableVersionControl;
            winterFlowConfigurationResponse.getClass();
            long j2 = j / 1000000;
            WinterFlowValidatorBatch WinterFlowRouterStructure = ((WinterFlowParserUI) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy).WinterFlowRouterStructure(winterFlowConfigurationResponse2.WinterFlowRouterStructure(i));
            long j3 = WinterFlowRouterStructure.WinterFlowCacheManagerAgent;
            winterFlowConfigurationResponse4.WinterFlowVariableVersionControl((((Math.signum(WinterFlowRouterStructure.WinterFlowRouterStructure) * WinterFlowXMLManager.WinterFlowRouterStructure(j3 > 0 ? j2 / j3 : 1.0f).WinterFlowHookDataSource) * WinterFlowRouterStructure.WinterFlowHookDataSource) / j3) * 1000.0f, i);
            i++;
        }
    }

    public void WinterFlowResponseEngine(WinterFlowCacheManagerUtility winterFlowCacheManagerUtility, boolean z) {
        WinterFlowTransactionManagerArray winterFlowTransactionManagerArray = (WinterFlowTransactionManagerArray) this.WinterFlowRouterRouter;
        List list = winterFlowCacheManagerUtility.WinterFlowRouterStructure;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((WinterFlowObjectSystem) list.get(i)).WinterFlowHookDataSource()) {
                WinterFlowSerializerStructure(winterFlowCacheManagerUtility);
                return;
            }
        }
        WinterFlowUIMicroservice winterFlowUIMicroservice = (WinterFlowUIMicroservice) this.WinterFlowVariableVersionControl;
        if (winterFlowUIMicroservice == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("layoutCoordinates not set");
            return;
        }
        WinterFlowManagerRequest.WinterFlowQueueService(winterFlowCacheManagerUtility, winterFlowUIMicroservice.WinterFlowPackageIDE(0L), new WinterFlowAPIDataSource(5, this, winterFlowTransactionManagerArray), false);
        if (((WinterFlowWebsocketProtocol) this.WinterFlowTransactionManagerStrategy) == WinterFlowWebsocketProtocol.WinterFlowTransactionManagerStrategy) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((WinterFlowObjectSystem) list.get(i2)).WinterFlowRouterStructure();
                }
            }
            WinterFlowCacheModule winterFlowCacheModule = winterFlowCacheManagerUtility.WinterFlowHookDataSource;
            if (winterFlowCacheModule != null) {
                winterFlowCacheModule.WinterFlowRouterStructure = !winterFlowTransactionManagerArray.WinterFlowCacheManagerAgent;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0061, code lost:
    
        if (r9.WinterFlowArrayNetwork(r0) == r6) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: all -> 0x008e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x008e, blocks: (B:25:0x0064, B:29:0x0074), top: B:24:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r8v8, types: [com.google.android.datatransport.WinterFlowCacheCacheManager] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object WinterFlowRouterAdapter(WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowRuntimeManager winterFlowRuntimeManager;
        int i;
        WinterFlowIDEPlatform winterFlowIDEPlatform;
        Throwable th;
        WinterFlowCacheCacheManager winterFlowCacheCacheManager;
        WinterFlowStackProvider winterFlowStackProvider;
        try {
            if (winterFlowOrchestrationCompiler instanceof WinterFlowRuntimeManager) {
                winterFlowRuntimeManager = (WinterFlowRuntimeManager) winterFlowOrchestrationCompiler;
                int i2 = winterFlowRuntimeManager.WinterFlowServerProtocol;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    winterFlowRuntimeManager.WinterFlowServerProtocol = i2 - Integer.MIN_VALUE;
                    Object obj = winterFlowRuntimeManager.WinterFlowResponseEngine;
                    i = winterFlowRuntimeManager.WinterFlowServerProtocol;
                    WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                    WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                    if (i != 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        if (!(((WinterFlowXMLPlatform) this.WinterFlowTransactionManagerStrategy).WinterFlowTestingNode() instanceof WinterFlowEncryptionIDE)) {
                            return winterFlowAlgorithmSession;
                        }
                        winterFlowIDEPlatform = (WinterFlowIDEPlatform) this.WinterFlowVariableVersionControl;
                        winterFlowRuntimeManager.WinterFlowRouterRouter = this;
                        winterFlowRuntimeManager.WinterFlowSyntax = winterFlowIDEPlatform;
                        winterFlowRuntimeManager.WinterFlowServerProtocol = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            winterFlowCacheCacheManager = winterFlowRuntimeManager.WinterFlowSyntax;
                            winterFlowStackProvider = winterFlowRuntimeManager.WinterFlowRouterRouter;
                            try {
                                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                                ((WinterFlowXMLPlatform) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).WinterFlowCacheTool(winterFlowAlgorithmSession);
                                winterFlowCacheCacheManager.WinterFlowHookDataSource(null);
                                return winterFlowAlgorithmSession;
                            } catch (Throwable th2) {
                                th = th2;
                                winterFlowCacheCacheManager.WinterFlowHookDataSource(null);
                                throw th;
                            }
                        }
                        ?? r8 = winterFlowRuntimeManager.WinterFlowSyntax;
                        WinterFlowStackProvider winterFlowStackProvider2 = winterFlowRuntimeManager.WinterFlowRouterRouter;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        winterFlowIDEPlatform = r8;
                        this = winterFlowStackProvider2;
                    }
                    if (((WinterFlowXMLPlatform) this.WinterFlowTransactionManagerStrategy).WinterFlowTestingNode() instanceof WinterFlowEncryptionIDE) {
                        winterFlowIDEPlatform.WinterFlowHookDataSource(null);
                        return winterFlowAlgorithmSession;
                    }
                    winterFlowRuntimeManager.WinterFlowRouterRouter = this;
                    winterFlowRuntimeManager.WinterFlowSyntax = winterFlowIDEPlatform;
                    winterFlowRuntimeManager.WinterFlowServerProtocol = 2;
                    if (this.WinterFlowTransactionAgent(winterFlowRuntimeManager) != winterFlowListenerJava) {
                        winterFlowStackProvider = this;
                        winterFlowCacheCacheManager = winterFlowIDEPlatform;
                        ((WinterFlowXMLPlatform) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).WinterFlowCacheTool(winterFlowAlgorithmSession);
                        winterFlowCacheCacheManager.WinterFlowHookDataSource(null);
                        return winterFlowAlgorithmSession;
                    }
                    return winterFlowListenerJava;
                }
            }
            if (((WinterFlowXMLPlatform) this.WinterFlowTransactionManagerStrategy).WinterFlowTestingNode() instanceof WinterFlowEncryptionIDE) {
            }
        } catch (Throwable th3) {
            WinterFlowIDEPlatform winterFlowIDEPlatform2 = winterFlowIDEPlatform;
            th = th3;
            winterFlowCacheCacheManager = winterFlowIDEPlatform2;
            winterFlowCacheCacheManager.WinterFlowHookDataSource(null);
            throw th;
        }
        winterFlowRuntimeManager = new WinterFlowRuntimeManager(this, winterFlowOrchestrationCompiler);
        Object obj2 = winterFlowRuntimeManager.WinterFlowResponseEngine;
        i = winterFlowRuntimeManager.WinterFlowServerProtocol;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession2 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowListenerJava winterFlowListenerJava2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i != 0) {
        }
    }

    public void WinterFlowRouterRouter(WinterFlowControllerDebug winterFlowControllerDebug, WinterFlowSessionUserManager winterFlowSessionUserManager) {
        WinterFlowProtocolInterface winterFlowProtocolInterface = (WinterFlowProtocolInterface) this.WinterFlowTransactionManagerStrategy;
        if (winterFlowProtocolInterface.WinterFlowUnitTestResponse != 0) {
            return;
        }
        WinterFlowStackIDE WinterFlowCacheManagerAgent = winterFlowProtocolInterface.WinterFlowCacheManagerAgent(-1);
        winterFlowProtocolInterface.WinterFlowTransactionManagerStrategy = WinterFlowCacheManagerAgent;
        winterFlowProtocolInterface.WinterFlowUnitTestResponse = -1;
        winterFlowProtocolInterface.WinterFlowRouterRouter = winterFlowControllerDebug;
        if (winterFlowSessionUserManager != null) {
            if (WinterFlowCacheManagerAgent != null) {
                WinterFlowCacheManagerAgent.WinterFlowArrayNetwork(winterFlowSessionUserManager);
            }
            winterFlowProtocolInterface.WinterFlowRouterStructure.WinterFlowTransactionAgent(null, new WinterFlowSyntaxPlatform(winterFlowSessionUserManager));
        }
    }

    public void WinterFlowSerializerStructure(WinterFlowCacheManagerUtility winterFlowCacheManagerUtility) {
        if (((WinterFlowWebsocketProtocol) this.WinterFlowTransactionManagerStrategy) == WinterFlowWebsocketProtocol.WinterFlowTransactionManagerStrategy) {
            WinterFlowUIMicroservice winterFlowUIMicroservice = (WinterFlowUIMicroservice) this.WinterFlowVariableVersionControl;
            if (winterFlowUIMicroservice == null) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("layoutCoordinates not set");
                return;
            } else {
                WinterFlowManagerRequest.WinterFlowQueueService(winterFlowCacheManagerUtility, winterFlowUIMicroservice.WinterFlowPackageIDE(0L), new WinterFlowProviderFramework(18, (WinterFlowTransactionManagerArray) this.WinterFlowRouterRouter), true);
            }
        }
        this.WinterFlowTransactionManagerStrategy = WinterFlowWebsocketProtocol.WinterFlowUnitTestResponse;
    }

    public WinterFlowCacheManagerListener WinterFlowServiceUtility() {
        Matcher matcher = (Matcher) this.WinterFlowVariableVersionControl;
        return WinterFlowDecoratorUI.WinterFlowArrayHelper(matcher.start(), matcher.end());
    }

    public boolean WinterFlowSingletonPlatform(Context context) {
        if (((Boolean) this.WinterFlowUnitTestResponse) == null) {
            this.WinterFlowUnitTestResponse = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        ((Boolean) this.WinterFlowTransactionManagerStrategy).booleanValue();
        return ((Boolean) this.WinterFlowUnitTestResponse).booleanValue();
    }

    @Override // com.google.android.datatransport.WinterFlowFrontendAgent
    public WinterFlowConfigurationResponse WinterFlowSyntax(long j, WinterFlowConfigurationResponse winterFlowConfigurationResponse, WinterFlowConfigurationResponse winterFlowConfigurationResponse2, WinterFlowConfigurationResponse winterFlowConfigurationResponse3) {
        WinterFlowConfigurationResponse winterFlowConfigurationResponse4 = (WinterFlowConfigurationResponse) this.WinterFlowTransactionManagerStrategy;
        if (winterFlowConfigurationResponse4 == null) {
            winterFlowConfigurationResponse4 = winterFlowConfigurationResponse.WinterFlowCacheManagerAgent();
            this.WinterFlowTransactionManagerStrategy = winterFlowConfigurationResponse4;
        }
        int WinterFlowHookDataSource = winterFlowConfigurationResponse4.WinterFlowHookDataSource();
        int i = 0;
        while (true) {
            WinterFlowConfigurationResponse winterFlowConfigurationResponse5 = (WinterFlowConfigurationResponse) this.WinterFlowTransactionManagerStrategy;
            if (i >= WinterFlowHookDataSource) {
                if (winterFlowConfigurationResponse5 != null) {
                    return winterFlowConfigurationResponse5;
                }
                WinterFlowManagerRequest.WinterFlowCloudMicroservice("valueVector");
                throw null;
            }
            if (winterFlowConfigurationResponse5 == null) {
                WinterFlowManagerRequest.WinterFlowCloudMicroservice("valueVector");
                throw null;
            }
            long j2 = j;
            winterFlowConfigurationResponse5.WinterFlowVariableVersionControl(((WinterFlowAPIScheduler) this.WinterFlowVariableVersionControl).get(i).WinterFlowHookDataSource(j2, winterFlowConfigurationResponse.WinterFlowRouterStructure(i), winterFlowConfigurationResponse2.WinterFlowRouterStructure(i), winterFlowConfigurationResponse3.WinterFlowRouterStructure(i)), i);
            i++;
            j = j2;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowFrontendAgent
    public WinterFlowConfigurationResponse WinterFlowThreadListener(WinterFlowConfigurationResponse winterFlowConfigurationResponse, WinterFlowConfigurationResponse winterFlowConfigurationResponse2, WinterFlowConfigurationResponse winterFlowConfigurationResponse3) {
        WinterFlowConfigurationResponse winterFlowConfigurationResponse4 = (WinterFlowConfigurationResponse) this.WinterFlowRouterRouter;
        if (winterFlowConfigurationResponse4 == null) {
            winterFlowConfigurationResponse4 = winterFlowConfigurationResponse3.WinterFlowCacheManagerAgent();
            this.WinterFlowRouterRouter = winterFlowConfigurationResponse4;
        }
        int WinterFlowHookDataSource = winterFlowConfigurationResponse4.WinterFlowHookDataSource();
        int i = 0;
        while (true) {
            WinterFlowConfigurationResponse winterFlowConfigurationResponse5 = (WinterFlowConfigurationResponse) this.WinterFlowRouterRouter;
            if (i >= WinterFlowHookDataSource) {
                if (winterFlowConfigurationResponse5 != null) {
                    return winterFlowConfigurationResponse5;
                }
                WinterFlowManagerRequest.WinterFlowCloudMicroservice("endVelocityVector");
                throw null;
            }
            if (winterFlowConfigurationResponse5 == null) {
                WinterFlowManagerRequest.WinterFlowCloudMicroservice("endVelocityVector");
                throw null;
            }
            winterFlowConfigurationResponse5.WinterFlowVariableVersionControl(((WinterFlowAPIScheduler) this.WinterFlowVariableVersionControl).get(i).WinterFlowVariableVersionControl(winterFlowConfigurationResponse.WinterFlowRouterStructure(i), winterFlowConfigurationResponse2.WinterFlowRouterStructure(i), winterFlowConfigurationResponse3.WinterFlowRouterStructure(i)), i);
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object WinterFlowTransactionAgent(WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowBatchFrontend winterFlowBatchFrontend;
        int i;
        WinterFlowDebugMechanism winterFlowDebugMechanism;
        WinterFlowStrategyResolver winterFlowStrategyResolver = (WinterFlowStrategyResolver) this.WinterFlowRouterRouter;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowBatchFrontend) {
            winterFlowBatchFrontend = (WinterFlowBatchFrontend) winterFlowOrchestrationCompiler;
            int i2 = winterFlowBatchFrontend.WinterFlowTransactionAgent;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowBatchFrontend.WinterFlowTransactionAgent = i2 - Integer.MIN_VALUE;
                Object obj = winterFlowBatchFrontend.WinterFlowSyntax;
                i = winterFlowBatchFrontend.WinterFlowTransactionAgent;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    List list = (List) this.WinterFlowUnitTestResponse;
                    WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                    if (list == null || list.isEmpty()) {
                        winterFlowBatchFrontend.WinterFlowRouterRouter = this;
                        winterFlowBatchFrontend.WinterFlowTransactionAgent = 1;
                        obj = winterFlowStrategyResolver.WinterFlowSyntax(false, winterFlowBatchFrontend);
                    } else {
                        WinterFlowDebugStrategy WinterFlowHookDataSource = winterFlowStrategyResolver.WinterFlowHookDataSource();
                        WinterFlowBatchException winterFlowBatchException = new WinterFlowBatchException(winterFlowStrategyResolver, this, null);
                        winterFlowBatchFrontend.WinterFlowRouterRouter = this;
                        winterFlowBatchFrontend.WinterFlowTransactionAgent = 2;
                        obj = WinterFlowHookDataSource.WinterFlowHookDataSource(winterFlowBatchException, winterFlowBatchFrontend);
                    }
                    return winterFlowListenerJava;
                }
                if (i == 1) {
                    this = winterFlowBatchFrontend.WinterFlowRouterRouter;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowDebugMechanism = (WinterFlowDebugMechanism) obj;
                } else {
                    if (i != 2) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = winterFlowBatchFrontend.WinterFlowRouterRouter;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowDebugMechanism = (WinterFlowDebugMechanism) obj;
                }
                ((WinterFlowStrategyResolver) this.WinterFlowRouterRouter).WinterFlowServerProtocol.WinterFlowCacheManagerAgent(winterFlowDebugMechanism);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            }
        }
        winterFlowBatchFrontend = new WinterFlowBatchFrontend(this, winterFlowOrchestrationCompiler);
        Object obj2 = winterFlowBatchFrontend.WinterFlowSyntax;
        i = winterFlowBatchFrontend.WinterFlowTransactionAgent;
        if (i != 0) {
        }
        ((WinterFlowStrategyResolver) this.WinterFlowRouterRouter).WinterFlowServerProtocol.WinterFlowCacheManagerAgent(winterFlowDebugMechanism);
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    public void WinterFlowTransactionManagerStrategy(WinterFlowControllerDebug winterFlowControllerDebug) {
        if (((LinkedHashSet) this.WinterFlowRouterRouter).add(winterFlowControllerDebug)) {
            ((WinterFlowProtocolInterface) this.WinterFlowTransactionManagerStrategy).WinterFlowRouterStructure(this, winterFlowControllerDebug, -1);
        }
    }

    public void WinterFlowUnitTestResponse(WinterFlowScriptEngine winterFlowScriptEngine, int i) {
        if (i != 1 && i != 0) {
            WinterFlowCompilerMechanism.WinterFlowCacheManagerAgent(WinterFlowResolverBackend.WinterFlowSyntax("Unsupported priority value: ", i));
        } else if (((LinkedHashSet) this.WinterFlowRouterRouter).add(winterFlowScriptEngine)) {
            ((WinterFlowProtocolInterface) this.WinterFlowTransactionManagerStrategy).WinterFlowRouterStructure(this, winterFlowScriptEngine, i);
        }
    }

    public boolean WinterFlowVariableBandwidth(Context context) {
        Boolean bool = (Boolean) this.WinterFlowTransactionManagerStrategy;
        if (bool == null) {
            bool = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            this.WinterFlowTransactionManagerStrategy = bool;
        }
        bool.booleanValue();
        return ((Boolean) this.WinterFlowTransactionManagerStrategy).booleanValue();
    }

    @Override // com.google.android.datatransport.WinterFlowFrontendAgent
    public long WinterFlowVariableVersionControl(WinterFlowConfigurationResponse winterFlowConfigurationResponse, WinterFlowConfigurationResponse winterFlowConfigurationResponse2, WinterFlowConfigurationResponse winterFlowConfigurationResponse3) {
        int WinterFlowHookDataSource = winterFlowConfigurationResponse.WinterFlowHookDataSource();
        long j = 0;
        for (int i = 0; i < WinterFlowHookDataSource; i++) {
            j = Math.max(j, ((WinterFlowAPIScheduler) this.WinterFlowVariableVersionControl).get(i).WinterFlowArrayNetwork(winterFlowConfigurationResponse.WinterFlowRouterStructure(i), winterFlowConfigurationResponse2.WinterFlowRouterStructure(i), winterFlowConfigurationResponse3.WinterFlowRouterStructure(i)));
        }
        return j;
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareStrategy
    public Object get() {
        return new WinterFlowStackProvider((Executor) ((WinterFlowSoftwareStrategy) this.WinterFlowVariableVersionControl).get(), (WinterFlowFrameworkManager) ((WinterFlowSoftwareStrategy) this.WinterFlowTransactionManagerStrategy).get(), (WinterFlowObjectPackage) ((WinterFlowObjectPackage) this.WinterFlowUnitTestResponse).get(), (WinterFlowFrameworkManager) ((WinterFlowSoftwareStrategy) this.WinterFlowRouterRouter).get());
    }

    public /* synthetic */ WinterFlowStackProvider(Object obj, Object obj2, Object obj3, Object obj4) {
        this.WinterFlowVariableVersionControl = obj;
        this.WinterFlowTransactionManagerStrategy = obj2;
        this.WinterFlowUnitTestResponse = obj3;
        this.WinterFlowRouterRouter = obj4;
    }

    public WinterFlowStackProvider(WinterFlowScriptManager winterFlowScriptManager, WinterFlowUserManagerUserManager winterFlowUserManagerUserManager, WinterFlowEventEmitterHelper winterFlowEventEmitterHelper) {
        winterFlowScriptManager.getClass();
        winterFlowUserManagerUserManager.getClass();
        winterFlowEventEmitterHelper.getClass();
        this.WinterFlowVariableVersionControl = winterFlowScriptManager;
        this.WinterFlowTransactionManagerStrategy = winterFlowUserManagerUserManager;
        this.WinterFlowUnitTestResponse = winterFlowEventEmitterHelper;
        this.WinterFlowRouterRouter = new WinterFlowThreadPoolProcess(25);
    }

    public /* synthetic */ WinterFlowStackProvider(Object obj) {
        this.WinterFlowVariableVersionControl = obj;
    }

    public WinterFlowStackProvider(Matcher matcher, CharSequence charSequence) {
        this.WinterFlowVariableVersionControl = matcher;
        this.WinterFlowTransactionManagerStrategy = charSequence;
        this.WinterFlowUnitTestResponse = new WinterFlowLoaderRequest(0, this);
    }

    public WinterFlowStackProvider(WinterFlowSingletonProcess winterFlowSingletonProcess) {
        this(new WinterFlowJSONDecorator(27, winterFlowSingletonProcess));
    }
}
