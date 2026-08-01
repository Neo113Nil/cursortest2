package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowControllerTransaction implements WinterFlowConsumerBandwidth {
    public static final /* synthetic */ long WinterFlowTransactionManagerStrategy;
    public static final /* synthetic */ long WinterFlowVariableVersionControl;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        WinterFlowTransactionManagerStrategy = unsafe.objectFieldOffset(WinterFlowControllerTransaction.class.getDeclaredField("_state$volatile"));
        WinterFlowVariableVersionControl = unsafe.objectFieldOffset(WinterFlowControllerTransaction.class.getDeclaredField("_parentHandle$volatile"));
    }

    public WinterFlowControllerTransaction(boolean z) {
        this._state$volatile = z ? WinterFlowHandlerWebsocket.WinterFlowOrchestrationSubsystem : WinterFlowHandlerWebsocket.WinterFlowBandwidthObject;
    }

    public static String WinterFlowAPIFrontend(Object obj) {
        if (!(obj instanceof WinterFlowViewBandwidth)) {
            return obj instanceof WinterFlowEncryptionIDE ? ((WinterFlowEncryptionIDE) obj).WinterFlowHookDataSource() ? "Active" : "New" : obj instanceof WinterFlowSessionManagerSessionManager ? "Cancelled" : "Completed";
        }
        WinterFlowViewBandwidth winterFlowViewBandwidth = (WinterFlowViewBandwidth) obj;
        return winterFlowViewBandwidth.WinterFlowVariableVersionControl() ? "Cancelling" : winterFlowViewBandwidth.WinterFlowTransactionManagerStrategy() ? "Completing" : "Active";
    }

    public static WinterFlowConsumerWebsocket WinterFlowValidatorHandler(WinterFlowVariableDeserialization winterFlowVariableDeserialization) {
        while (winterFlowVariableDeserialization.WinterFlowTransactionAgent()) {
            winterFlowVariableDeserialization = winterFlowVariableDeserialization.WinterFlowResponseEngine();
        }
        while (true) {
            winterFlowVariableDeserialization = winterFlowVariableDeserialization.WinterFlowSyntax();
            if (!winterFlowVariableDeserialization.WinterFlowTransactionAgent()) {
                if (winterFlowVariableDeserialization instanceof WinterFlowConsumerWebsocket) {
                    return (WinterFlowConsumerWebsocket) winterFlowVariableDeserialization;
                }
                if (winterFlowVariableDeserialization instanceof WinterFlowFrontendAPI) {
                    return null;
                }
            }
        }
    }

    public String WinterFlowArrayHelper() {
        return "Job was cancelled";
    }

    @Override // com.google.android.datatransport.WinterFlowConsumerBandwidth
    public void WinterFlowArrayNetwork(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new WinterFlowQueryComponent(WinterFlowArrayHelper(), null, this);
        }
        WinterFlowBackendCacheManager(cancellationException);
    }

    public void WinterFlowBackendCacheManager(CancellationException cancellationException) {
        WinterFlowResolverController(cancellationException);
    }

    public final Object WinterFlowBandwidth(Object obj, Object obj2) {
        Unsafe unsafe;
        long j;
        if (!(obj instanceof WinterFlowEncryptionIDE)) {
            return WinterFlowHandlerWebsocket.WinterFlowResponseEngine;
        }
        if ((!(obj instanceof WinterFlowWidgetNetwork) && !(obj instanceof WinterFlowMicroserviceRefactoring)) || (obj instanceof WinterFlowConsumerWebsocket) || (obj2 instanceof WinterFlowSessionManagerSessionManager)) {
            WinterFlowControllerTransaction winterFlowControllerTransaction = this;
            WinterFlowEncryptionIDE winterFlowEncryptionIDE = (WinterFlowEncryptionIDE) obj;
            WinterFlowFrontendAPI WinterFlowSyntaxSubsystem = winterFlowControllerTransaction.WinterFlowSyntaxSubsystem(winterFlowEncryptionIDE);
            if (WinterFlowSyntaxSubsystem == null) {
                return WinterFlowHandlerWebsocket.WinterFlowServerProtocol;
            }
            WinterFlowViewBandwidth winterFlowViewBandwidth = winterFlowEncryptionIDE instanceof WinterFlowViewBandwidth ? (WinterFlowViewBandwidth) winterFlowEncryptionIDE : null;
            if (winterFlowViewBandwidth == null) {
                winterFlowViewBandwidth = new WinterFlowViewBandwidth(WinterFlowSyntaxSubsystem, null);
            }
            WinterFlowViewBandwidth winterFlowViewBandwidth2 = winterFlowViewBandwidth;
            synchronized (winterFlowViewBandwidth2) {
                if (winterFlowViewBandwidth2.WinterFlowTransactionManagerStrategy()) {
                    return WinterFlowHandlerWebsocket.WinterFlowResponseEngine;
                }
                WinterFlowQueueThreadPool.WinterFlowRouterStructure.putIntVolatile(winterFlowViewBandwidth2, WinterFlowViewBandwidth.WinterFlowUnitTestResponse, 1);
                if (winterFlowViewBandwidth2 != winterFlowEncryptionIDE) {
                    do {
                        unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        j = WinterFlowTransactionManagerStrategy;
                        WinterFlowControllerTransaction winterFlowControllerTransaction2 = winterFlowControllerTransaction;
                        winterFlowControllerTransaction = winterFlowControllerTransaction2;
                        if (unsafe.compareAndSwapObject(winterFlowControllerTransaction2, j, winterFlowEncryptionIDE, winterFlowViewBandwidth2)) {
                        }
                    } while (unsafe.getObjectVolatile(winterFlowControllerTransaction, j) == winterFlowEncryptionIDE);
                    return WinterFlowHandlerWebsocket.WinterFlowServerProtocol;
                }
                boolean WinterFlowVariableVersionControl2 = winterFlowViewBandwidth2.WinterFlowVariableVersionControl();
                WinterFlowSessionManagerSessionManager winterFlowSessionManagerSessionManager = obj2 instanceof WinterFlowSessionManagerSessionManager ? (WinterFlowSessionManagerSessionManager) obj2 : null;
                if (winterFlowSessionManagerSessionManager != null) {
                    winterFlowViewBandwidth2.WinterFlowRouterStructure(winterFlowSessionManagerSessionManager.WinterFlowRouterStructure);
                }
                Throwable WinterFlowCacheManagerAgent = WinterFlowVariableVersionControl2 ? null : winterFlowViewBandwidth2.WinterFlowCacheManagerAgent();
                if (WinterFlowCacheManagerAgent != null) {
                    winterFlowControllerTransaction.WinterFlowCompilerDataSource(WinterFlowSyntaxSubsystem, WinterFlowCacheManagerAgent);
                }
                WinterFlowConsumerWebsocket WinterFlowValidatorHandler = WinterFlowValidatorHandler(WinterFlowSyntaxSubsystem);
                if (WinterFlowValidatorHandler != null && winterFlowControllerTransaction.WinterFlowCacheManagerException(winterFlowViewBandwidth2, WinterFlowValidatorHandler, obj2)) {
                    return WinterFlowHandlerWebsocket.WinterFlowTransactionAgent;
                }
                WinterFlowSyntaxSubsystem.WinterFlowVariableVersionControl(new WinterFlowCompilerProcess(2), 2);
                WinterFlowConsumerWebsocket WinterFlowValidatorHandler2 = WinterFlowValidatorHandler(WinterFlowSyntaxSubsystem);
                return (WinterFlowValidatorHandler2 == null || !winterFlowControllerTransaction.WinterFlowCacheManagerException(winterFlowViewBandwidth2, WinterFlowValidatorHandler2, obj2)) ? winterFlowControllerTransaction.WinterFlowPackageIDE(winterFlowViewBandwidth2, obj2) : WinterFlowHandlerWebsocket.WinterFlowTransactionAgent;
            }
        }
        WinterFlowEncryptionIDE winterFlowEncryptionIDE2 = (WinterFlowEncryptionIDE) obj;
        Object winterFlowPackageSubsystem = obj2 instanceof WinterFlowEncryptionIDE ? new WinterFlowPackageSubsystem((WinterFlowEncryptionIDE) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j2 = WinterFlowTransactionManagerStrategy;
            WinterFlowControllerTransaction winterFlowControllerTransaction3 = this;
            if (unsafe2.compareAndSwapObject(winterFlowControllerTransaction3, j2, winterFlowEncryptionIDE2, winterFlowPackageSubsystem)) {
                winterFlowControllerTransaction3.WinterFlowFrameworkTransaction(obj2);
                winterFlowControllerTransaction3.WinterFlowStrategyTool(winterFlowEncryptionIDE2, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(winterFlowControllerTransaction3, j2) != winterFlowEncryptionIDE2) {
                return WinterFlowHandlerWebsocket.WinterFlowServerProtocol;
            }
            this = winterFlowControllerTransaction3;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowConsumerBandwidth
    public final CancellationException WinterFlowBandwidthObject() {
        CancellationException cancellationException;
        Object WinterFlowTestingNode = WinterFlowTestingNode();
        if (WinterFlowTestingNode instanceof WinterFlowViewBandwidth) {
            Throwable WinterFlowCacheManagerAgent = ((WinterFlowViewBandwidth) WinterFlowTestingNode).WinterFlowCacheManagerAgent();
            if (WinterFlowCacheManagerAgent == null) {
                WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(this, "Job is still new or active: ");
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = WinterFlowCacheManagerAgent instanceof CancellationException ? (CancellationException) WinterFlowCacheManagerAgent : null;
            return cancellationException == null ? new WinterFlowQueryComponent(concat, WinterFlowCacheManagerAgent, this) : cancellationException;
        }
        if (WinterFlowTestingNode instanceof WinterFlowEncryptionIDE) {
            WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(this, "Job is still new or active: ");
            return null;
        }
        if (!(WinterFlowTestingNode instanceof WinterFlowSessionManagerSessionManager)) {
            return new WinterFlowQueryComponent(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((WinterFlowSessionManagerSessionManager) WinterFlowTestingNode).WinterFlowRouterStructure;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new WinterFlowQueryComponent(WinterFlowArrayHelper(), th, this) : cancellationException;
    }

    @Override // com.google.android.datatransport.WinterFlowConsumerBandwidth
    public final WinterFlowServerNode WinterFlowBatchUI(WinterFlowControllerTransaction winterFlowControllerTransaction) {
        WinterFlowControllerTransaction winterFlowControllerTransaction2;
        WinterFlowConsumerWebsocket winterFlowConsumerWebsocket = new WinterFlowConsumerWebsocket(winterFlowControllerTransaction);
        winterFlowConsumerWebsocket.WinterFlowRouterRouter = this;
        loop0: while (true) {
            Object WinterFlowTestingNode = this.WinterFlowTestingNode();
            if (WinterFlowTestingNode instanceof WinterFlowWidgetNetwork) {
                WinterFlowWidgetNetwork winterFlowWidgetNetwork = (WinterFlowWidgetNetwork) WinterFlowTestingNode;
                if (winterFlowWidgetNetwork.WinterFlowVariableVersionControl) {
                    while (true) {
                        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        long j = WinterFlowTransactionManagerStrategy;
                        winterFlowControllerTransaction2 = this;
                        if (unsafe.compareAndSwapObject(winterFlowControllerTransaction2, j, WinterFlowTestingNode, winterFlowConsumerWebsocket)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(winterFlowControllerTransaction2, j) != WinterFlowTestingNode) {
                            break;
                        }
                        this = winterFlowControllerTransaction2;
                    }
                } else {
                    winterFlowControllerTransaction2 = this;
                    winterFlowControllerTransaction2.WinterFlowModuleAgent(winterFlowWidgetNetwork);
                }
                this = winterFlowControllerTransaction2;
            } else {
                winterFlowControllerTransaction2 = this;
                boolean z = WinterFlowTestingNode instanceof WinterFlowEncryptionIDE;
                WinterFlowClassConsumer winterFlowClassConsumer = WinterFlowClassConsumer.WinterFlowVariableVersionControl;
                if (!z) {
                    Object WinterFlowTestingNode2 = winterFlowControllerTransaction2.WinterFlowTestingNode();
                    WinterFlowSessionManagerSessionManager winterFlowSessionManagerSessionManager = WinterFlowTestingNode2 instanceof WinterFlowSessionManagerSessionManager ? (WinterFlowSessionManagerSessionManager) WinterFlowTestingNode2 : null;
                    winterFlowConsumerWebsocket.WinterFlowServiceUtility(winterFlowSessionManagerSessionManager != null ? winterFlowSessionManagerSessionManager.WinterFlowRouterStructure : null);
                    return winterFlowClassConsumer;
                }
                WinterFlowFrontendAPI WinterFlowArrayNetwork = ((WinterFlowEncryptionIDE) WinterFlowTestingNode).WinterFlowArrayNetwork();
                if (WinterFlowArrayNetwork == null) {
                    winterFlowControllerTransaction2.WinterFlowSessionManagerInterface((WinterFlowMicroserviceRefactoring) WinterFlowTestingNode);
                    this = winterFlowControllerTransaction2;
                } else if (!WinterFlowArrayNetwork.WinterFlowVariableVersionControl(winterFlowConsumerWebsocket, 7)) {
                    boolean WinterFlowVariableVersionControl2 = WinterFlowArrayNetwork.WinterFlowVariableVersionControl(winterFlowConsumerWebsocket, 3);
                    Object WinterFlowTestingNode3 = winterFlowControllerTransaction2.WinterFlowTestingNode();
                    if (WinterFlowTestingNode3 instanceof WinterFlowViewBandwidth) {
                        r0 = ((WinterFlowViewBandwidth) WinterFlowTestingNode3).WinterFlowCacheManagerAgent();
                    } else {
                        WinterFlowSessionManagerSessionManager winterFlowSessionManagerSessionManager2 = WinterFlowTestingNode3 instanceof WinterFlowSessionManagerSessionManager ? (WinterFlowSessionManagerSessionManager) WinterFlowTestingNode3 : null;
                        if (winterFlowSessionManagerSessionManager2 != null) {
                            r0 = winterFlowSessionManagerSessionManager2.WinterFlowRouterStructure;
                        }
                    }
                    winterFlowConsumerWebsocket.WinterFlowServiceUtility(r0);
                    if (WinterFlowVariableVersionControl2) {
                        break loop0;
                    }
                    return winterFlowClassConsumer;
                }
            }
        }
        return winterFlowConsumerWebsocket;
    }

    public final boolean WinterFlowCacheManagerException(WinterFlowViewBandwidth winterFlowViewBandwidth, WinterFlowConsumerWebsocket winterFlowConsumerWebsocket, Object obj) {
        while (WinterFlowInvokerComponent.WinterFlowPackageIDE(winterFlowConsumerWebsocket.WinterFlowSyntax, false, new WinterFlowValidatorEntity(this, winterFlowViewBandwidth, winterFlowConsumerWebsocket, obj)) == WinterFlowClassConsumer.WinterFlowVariableVersionControl) {
            winterFlowConsumerWebsocket = WinterFlowValidatorHandler(winterFlowConsumerWebsocket);
            if (winterFlowConsumerWebsocket == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable WinterFlowCacheManagerListener(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        WinterFlowControllerTransaction winterFlowControllerTransaction = (WinterFlowControllerTransaction) obj;
        Object WinterFlowTestingNode = winterFlowControllerTransaction.WinterFlowTestingNode();
        if (WinterFlowTestingNode instanceof WinterFlowViewBandwidth) {
            cancellationException = ((WinterFlowViewBandwidth) WinterFlowTestingNode).WinterFlowCacheManagerAgent();
        } else if (WinterFlowTestingNode instanceof WinterFlowSessionManagerSessionManager) {
            cancellationException = ((WinterFlowSessionManagerSessionManager) WinterFlowTestingNode).WinterFlowRouterStructure;
        } else {
            if (WinterFlowTestingNode instanceof WinterFlowEncryptionIDE) {
                WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(WinterFlowTestingNode, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new WinterFlowQueryComponent("Parent job is ".concat(WinterFlowAPIFrontend(WinterFlowTestingNode)), cancellationException, winterFlowControllerTransaction) : cancellationException2;
    }

    public final boolean WinterFlowCacheTool(Object obj) {
        Object WinterFlowBandwidth;
        do {
            WinterFlowBandwidth = WinterFlowBandwidth(WinterFlowTestingNode(), obj);
            if (WinterFlowBandwidth == WinterFlowHandlerWebsocket.WinterFlowResponseEngine) {
                return false;
            }
            if (WinterFlowBandwidth == WinterFlowHandlerWebsocket.WinterFlowTransactionAgent) {
                return true;
            }
        } while (WinterFlowBandwidth == WinterFlowHandlerWebsocket.WinterFlowServerProtocol);
        WinterFlowServerProtocol(WinterFlowBandwidth);
        return true;
    }

    public final void WinterFlowCloudMicroservice(WinterFlowConsumerBandwidth winterFlowConsumerBandwidth) {
        long j = WinterFlowVariableVersionControl;
        WinterFlowClassConsumer winterFlowClassConsumer = WinterFlowClassConsumer.WinterFlowVariableVersionControl;
        if (winterFlowConsumerBandwidth == null) {
            WinterFlowQueueThreadPool.WinterFlowRouterStructure.putObjectVolatile(this, j, winterFlowClassConsumer);
            return;
        }
        winterFlowConsumerBandwidth.start();
        WinterFlowServerNode WinterFlowBatchUI = winterFlowConsumerBandwidth.WinterFlowBatchUI(this);
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        unsafe.putObjectVolatile(this, j, WinterFlowBatchUI);
        if (WinterFlowTestingNode() instanceof WinterFlowEncryptionIDE) {
            return;
        }
        WinterFlowBatchUI.WinterFlowRouterStructure();
        unsafe.putObjectVolatile(this, j, winterFlowClassConsumer);
    }

    public final void WinterFlowCompilerDataSource(WinterFlowFrontendAPI winterFlowFrontendAPI, Throwable th) {
        winterFlowFrontendAPI.WinterFlowVariableVersionControl(new WinterFlowCompilerProcess(4), 4);
        Object WinterFlowRouterRouter = winterFlowFrontendAPI.WinterFlowRouterRouter();
        WinterFlowRouterRouter.getClass();
        WinterFlowServerSystem winterFlowServerSystem = null;
        for (WinterFlowVariableDeserialization winterFlowVariableDeserialization = (WinterFlowVariableDeserialization) WinterFlowRouterRouter; !winterFlowVariableDeserialization.equals(winterFlowFrontendAPI); winterFlowVariableDeserialization = winterFlowVariableDeserialization.WinterFlowSyntax()) {
            if ((winterFlowVariableDeserialization instanceof WinterFlowMicroserviceRefactoring) && ((WinterFlowMicroserviceRefactoring) winterFlowVariableDeserialization).WinterFlowThreadListener()) {
                try {
                    ((WinterFlowMicroserviceRefactoring) winterFlowVariableDeserialization).WinterFlowServiceUtility(th);
                } catch (Throwable th2) {
                    if (winterFlowServerSystem != null) {
                        WinterFlowCloudStack.WinterFlowTransactionManagerStrategy(winterFlowServerSystem, th2);
                    } else {
                        winterFlowServerSystem = new WinterFlowServerSystem("Exception in completion handler " + winterFlowVariableDeserialization + " for " + this, th2);
                    }
                }
            }
        }
        if (winterFlowServerSystem != null) {
            WinterFlowFrontendBackend(winterFlowServerSystem);
        }
        WinterFlowEventEmitterController(th);
    }

    public boolean WinterFlowCompilerHandler(Throwable th) {
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowConsumerBandwidth
    public final Object WinterFlowCompilerVariable(WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        Object WinterFlowTestingNode;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession;
        do {
            WinterFlowTestingNode = WinterFlowTestingNode();
            boolean z = WinterFlowTestingNode instanceof WinterFlowEncryptionIDE;
            winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            if (!z) {
                WinterFlowInvokerComponent.WinterFlowRouterAdapter(winterFlowOrchestrationCompiler.getContext());
                return winterFlowAlgorithmSession;
            }
        } while (WinterFlowVariableInterface(WinterFlowTestingNode) < 0);
        WinterFlowEventCloud winterFlowEventCloud = new WinterFlowEventCloud(1, WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowOrchestrationCompiler));
        winterFlowEventCloud.WinterFlowSerializerStructure();
        winterFlowEventCloud.WinterFlowConsumerUserManager(new WinterFlowProxyStructure(2, WinterFlowInvokerComponent.WinterFlowPackageIDE(this, true, new WinterFlowRuntimeSubsystem(winterFlowEventCloud))));
        Object WinterFlowBatchUI = winterFlowEventCloud.WinterFlowBatchUI();
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (WinterFlowBatchUI != winterFlowListenerJava) {
            WinterFlowBatchUI = winterFlowAlgorithmSession;
        }
        return WinterFlowBatchUI == winterFlowListenerJava ? WinterFlowBatchUI : winterFlowAlgorithmSession;
    }

    public String WinterFlowConfiguration() {
        return getClass().getSimpleName();
    }

    public boolean WinterFlowConfigurationSubsystem(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return WinterFlowResolverController(th) && WinterFlowUserManagerUserManager();
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final WinterFlowStrategyPackage WinterFlowConsumerUserManager(WinterFlowRendererProvider winterFlowRendererProvider) {
        return WinterFlowTestingCloud.WinterFlowBatchUI(this, winterFlowRendererProvider);
    }

    public final boolean WinterFlowEventEmitterController(Throwable th) {
        if (WinterFlowQueueService()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        WinterFlowServerNode winterFlowServerNode = (WinterFlowServerNode) WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(this, WinterFlowVariableVersionControl);
        return (winterFlowServerNode == null || winterFlowServerNode == WinterFlowClassConsumer.WinterFlowVariableVersionControl) ? z : winterFlowServerNode.WinterFlowCacheManagerAgent(th) || z;
    }

    @Override // com.google.android.datatransport.WinterFlowConsumerBandwidth
    public boolean WinterFlowHookDataSource() {
        Object WinterFlowTestingNode = WinterFlowTestingNode();
        return (WinterFlowTestingNode instanceof WinterFlowEncryptionIDE) && ((WinterFlowEncryptionIDE) WinterFlowTestingNode).WinterFlowHookDataSource();
    }

    public void WinterFlowMapperProtocol(Object obj) {
        WinterFlowServerProtocol(obj);
    }

    public final void WinterFlowModuleAgent(WinterFlowWidgetNetwork winterFlowWidgetNetwork) {
        WinterFlowFrontendAPI winterFlowFrontendAPI = new WinterFlowFrontendAPI();
        WinterFlowEncryptionIDE winterFlowRepositoryUnitTest = winterFlowWidgetNetwork.WinterFlowVariableVersionControl ? winterFlowFrontendAPI : new WinterFlowRepositoryUnitTest(winterFlowFrontendAPI);
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowTransactionManagerStrategy;
            WinterFlowControllerTransaction winterFlowControllerTransaction = this;
            WinterFlowWidgetNetwork winterFlowWidgetNetwork2 = winterFlowWidgetNetwork;
            if (unsafe.compareAndSwapObject(winterFlowControllerTransaction, j, winterFlowWidgetNetwork2, winterFlowRepositoryUnitTest) || unsafe.getObjectVolatile(winterFlowControllerTransaction, j) != winterFlowWidgetNetwork2) {
                return;
            }
            this = winterFlowControllerTransaction;
            winterFlowWidgetNetwork = winterFlowWidgetNetwork2;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final WinterFlowEncryptionMicroservice WinterFlowOrchestrationSubsystem(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        return WinterFlowTestingCloud.WinterFlowArrayHelper(this, winterFlowEncryptionMicroservice);
    }

    public final Object WinterFlowPackageIDE(WinterFlowViewBandwidth winterFlowViewBandwidth, Object obj) {
        WinterFlowViewBandwidth winterFlowViewBandwidth2;
        Throwable th;
        Throwable WinterFlowSoftwareProtocol;
        WinterFlowControllerTransaction winterFlowControllerTransaction;
        WinterFlowViewBandwidth winterFlowViewBandwidth3;
        WinterFlowSessionManagerSessionManager winterFlowSessionManagerSessionManager = obj instanceof WinterFlowSessionManagerSessionManager ? (WinterFlowSessionManagerSessionManager) obj : null;
        Throwable th2 = winterFlowSessionManagerSessionManager != null ? winterFlowSessionManagerSessionManager.WinterFlowRouterStructure : null;
        synchronized (winterFlowViewBandwidth) {
            try {
                winterFlowViewBandwidth.WinterFlowVariableVersionControl();
                ArrayList WinterFlowUnitTestResponse = winterFlowViewBandwidth.WinterFlowUnitTestResponse(th2);
                WinterFlowSoftwareProtocol = WinterFlowSoftwareProtocol(winterFlowViewBandwidth, WinterFlowUnitTestResponse);
                if (WinterFlowSoftwareProtocol != null) {
                    try {
                        if (WinterFlowUnitTestResponse.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(WinterFlowUnitTestResponse.size()));
                            int size = WinterFlowUnitTestResponse.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = WinterFlowUnitTestResponse.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != WinterFlowSoftwareProtocol && th3 != WinterFlowSoftwareProtocol && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    WinterFlowCloudStack.WinterFlowTransactionManagerStrategy(WinterFlowSoftwareProtocol, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        winterFlowViewBandwidth2 = winterFlowViewBandwidth;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                winterFlowViewBandwidth2 = winterFlowViewBandwidth;
                th = th5;
            }
        }
        if (WinterFlowSoftwareProtocol != null && WinterFlowSoftwareProtocol != th2) {
            obj = new WinterFlowSessionManagerSessionManager(WinterFlowSoftwareProtocol, false);
        }
        if (WinterFlowSoftwareProtocol != null && (WinterFlowEventEmitterController(WinterFlowSoftwareProtocol) || WinterFlowCompilerHandler(WinterFlowSoftwareProtocol))) {
            obj.getClass();
            WinterFlowQueueThreadPool.WinterFlowRouterStructure.compareAndSwapInt((WinterFlowSessionManagerSessionManager) obj, WinterFlowSessionManagerSessionManager.WinterFlowHookDataSource, 0, 1);
        }
        WinterFlowFrameworkTransaction(obj);
        Object winterFlowPackageSubsystem = obj instanceof WinterFlowEncryptionIDE ? new WinterFlowPackageSubsystem((WinterFlowEncryptionIDE) obj) : obj;
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowTransactionManagerStrategy;
            winterFlowControllerTransaction = this;
            winterFlowViewBandwidth3 = winterFlowViewBandwidth;
            if (!unsafe.compareAndSwapObject(winterFlowControllerTransaction, j, winterFlowViewBandwidth3, winterFlowPackageSubsystem) && unsafe.getObjectVolatile(winterFlowControllerTransaction, j) == winterFlowViewBandwidth3) {
                this = winterFlowControllerTransaction;
                winterFlowViewBandwidth = winterFlowViewBandwidth3;
            }
        }
        winterFlowControllerTransaction.WinterFlowStrategyTool(winterFlowViewBandwidth3, obj);
        return obj;
    }

    public final Object WinterFlowProxyStructure(Object obj) {
        Object WinterFlowBandwidth;
        do {
            WinterFlowBandwidth = WinterFlowBandwidth(WinterFlowTestingNode(), obj);
            if (WinterFlowBandwidth == WinterFlowHandlerWebsocket.WinterFlowResponseEngine) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                WinterFlowSessionManagerSessionManager winterFlowSessionManagerSessionManager = obj instanceof WinterFlowSessionManagerSessionManager ? (WinterFlowSessionManagerSessionManager) obj : null;
                throw new IllegalStateException(str, winterFlowSessionManagerSessionManager != null ? winterFlowSessionManagerSessionManager.WinterFlowRouterStructure : null);
            }
        } while (WinterFlowBandwidth == WinterFlowHandlerWebsocket.WinterFlowServerProtocol);
        return WinterFlowBandwidth;
    }

    public boolean WinterFlowQueueService() {
        return this instanceof WinterFlowUILayer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == com.google.android.datatransport.WinterFlowHandlerWebsocket.WinterFlowTransactionAgent) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean WinterFlowResolverController(Object obj) {
        WinterFlowControllerTransaction winterFlowControllerTransaction;
        WinterFlowJSONDecorator winterFlowJSONDecorator;
        Object obj2;
        Object obj3 = WinterFlowHandlerWebsocket.WinterFlowResponseEngine;
        if (WinterFlowSoftwareEngine()) {
            do {
                Object WinterFlowTestingNode = WinterFlowTestingNode();
                if (!(WinterFlowTestingNode instanceof WinterFlowEncryptionIDE) || ((WinterFlowTestingNode instanceof WinterFlowViewBandwidth) && ((WinterFlowViewBandwidth) WinterFlowTestingNode).WinterFlowTransactionManagerStrategy())) {
                    obj3 = WinterFlowHandlerWebsocket.WinterFlowResponseEngine;
                    break;
                }
                obj3 = WinterFlowBandwidth(WinterFlowTestingNode, new WinterFlowSessionManagerSessionManager(WinterFlowCacheManagerListener(obj), false));
            } while (obj3 == WinterFlowHandlerWebsocket.WinterFlowServerProtocol);
        }
        if (obj3 == WinterFlowHandlerWebsocket.WinterFlowResponseEngine) {
            Throwable th = null;
            loop1: while (true) {
                Object WinterFlowTestingNode2 = this.WinterFlowTestingNode();
                if (!(WinterFlowTestingNode2 instanceof WinterFlowViewBandwidth)) {
                    if (!(WinterFlowTestingNode2 instanceof WinterFlowEncryptionIDE)) {
                        winterFlowControllerTransaction = this;
                        obj2 = WinterFlowHandlerWebsocket.WinterFlowThreadListener;
                        break;
                    }
                    if (th == null) {
                        th = this.WinterFlowCacheManagerListener(obj);
                    }
                    WinterFlowEncryptionIDE winterFlowEncryptionIDE = (WinterFlowEncryptionIDE) WinterFlowTestingNode2;
                    if (winterFlowEncryptionIDE.WinterFlowHookDataSource()) {
                        WinterFlowFrontendAPI WinterFlowSyntaxSubsystem = this.WinterFlowSyntaxSubsystem(winterFlowEncryptionIDE);
                        if (WinterFlowSyntaxSubsystem == null) {
                            winterFlowControllerTransaction = this;
                        } else {
                            WinterFlowViewBandwidth winterFlowViewBandwidth = new WinterFlowViewBandwidth(WinterFlowSyntaxSubsystem, th);
                            while (true) {
                                Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                                long j = WinterFlowTransactionManagerStrategy;
                                winterFlowControllerTransaction = this;
                                if (unsafe.compareAndSwapObject(winterFlowControllerTransaction, j, winterFlowEncryptionIDE, winterFlowViewBandwidth)) {
                                    winterFlowControllerTransaction.WinterFlowCompilerDataSource(WinterFlowSyntaxSubsystem, th);
                                    obj2 = WinterFlowHandlerWebsocket.WinterFlowResponseEngine;
                                    break loop1;
                                }
                                if (unsafe.getObjectVolatile(winterFlowControllerTransaction, j) != winterFlowEncryptionIDE) {
                                    break;
                                }
                                this = winterFlowControllerTransaction;
                            }
                        }
                        this = winterFlowControllerTransaction;
                    } else {
                        winterFlowControllerTransaction = this;
                        obj2 = winterFlowControllerTransaction.WinterFlowBandwidth(WinterFlowTestingNode2, new WinterFlowSessionManagerSessionManager(th, false));
                        if (obj2 == WinterFlowHandlerWebsocket.WinterFlowResponseEngine) {
                            WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(WinterFlowTestingNode2, "Cannot happen in ");
                            return false;
                        }
                        if (obj2 != WinterFlowHandlerWebsocket.WinterFlowServerProtocol) {
                            break;
                        }
                        this = winterFlowControllerTransaction;
                    }
                } else {
                    synchronized (WinterFlowTestingNode2) {
                        if (WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile((WinterFlowViewBandwidth) WinterFlowTestingNode2, WinterFlowViewBandwidth.WinterFlowTransactionManagerStrategy) == WinterFlowHandlerWebsocket.WinterFlowServiceUtility) {
                            winterFlowJSONDecorator = WinterFlowHandlerWebsocket.WinterFlowThreadListener;
                        } else {
                            boolean WinterFlowVariableVersionControl2 = ((WinterFlowViewBandwidth) WinterFlowTestingNode2).WinterFlowVariableVersionControl();
                            if (th == null) {
                                th = this.WinterFlowCacheManagerListener(obj);
                            }
                            ((WinterFlowViewBandwidth) WinterFlowTestingNode2).WinterFlowRouterStructure(th);
                            Throwable WinterFlowCacheManagerAgent = WinterFlowVariableVersionControl2 ? null : ((WinterFlowViewBandwidth) WinterFlowTestingNode2).WinterFlowCacheManagerAgent();
                            if (WinterFlowCacheManagerAgent != null) {
                                this.WinterFlowCompilerDataSource(((WinterFlowViewBandwidth) WinterFlowTestingNode2).WinterFlowVariableVersionControl, WinterFlowCacheManagerAgent);
                            }
                            winterFlowJSONDecorator = WinterFlowHandlerWebsocket.WinterFlowResponseEngine;
                        }
                    }
                    winterFlowControllerTransaction = this;
                    obj3 = winterFlowJSONDecorator;
                }
            }
            obj3 = obj2;
        } else {
            winterFlowControllerTransaction = this;
        }
        if (obj3 != WinterFlowHandlerWebsocket.WinterFlowResponseEngine && obj3 != WinterFlowHandlerWebsocket.WinterFlowTransactionAgent) {
            if (obj3 == WinterFlowHandlerWebsocket.WinterFlowThreadListener) {
                return false;
            }
            winterFlowControllerTransaction.WinterFlowServerProtocol(obj3);
            return true;
        }
        return true;
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final Object WinterFlowServiceUtility(WinterFlowEventEvent winterFlowEventEvent, Object obj) {
        return winterFlowEventEvent.WinterFlowVariableVersionControl(obj, this);
    }

    public final void WinterFlowSessionManagerInterface(WinterFlowMicroserviceRefactoring winterFlowMicroserviceRefactoring) {
        WinterFlowMicroserviceRefactoring winterFlowMicroserviceRefactoring2;
        WinterFlowControllerTransaction winterFlowControllerTransaction;
        WinterFlowFrontendAPI winterFlowFrontendAPI = new WinterFlowFrontendAPI();
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        unsafe.putObjectVolatile(winterFlowFrontendAPI, WinterFlowVariableDeserialization.WinterFlowTransactionManagerStrategy, winterFlowMicroserviceRefactoring);
        long j = WinterFlowVariableDeserialization.WinterFlowVariableVersionControl;
        unsafe.putObjectVolatile(winterFlowFrontendAPI, j, winterFlowMicroserviceRefactoring);
        loop0: while (true) {
            if (winterFlowMicroserviceRefactoring.WinterFlowRouterRouter() != winterFlowMicroserviceRefactoring) {
                winterFlowMicroserviceRefactoring2 = winterFlowMicroserviceRefactoring;
                break;
            }
            while (true) {
                Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                winterFlowMicroserviceRefactoring2 = winterFlowMicroserviceRefactoring;
                if (unsafe2.compareAndSwapObject(winterFlowMicroserviceRefactoring2, WinterFlowVariableDeserialization.WinterFlowVariableVersionControl, winterFlowMicroserviceRefactoring, winterFlowFrontendAPI)) {
                    winterFlowFrontendAPI.WinterFlowUnitTestResponse(winterFlowMicroserviceRefactoring2);
                    break loop0;
                }
                winterFlowControllerTransaction = this;
                winterFlowMicroserviceRefactoring = winterFlowMicroserviceRefactoring2;
                if (unsafe2.getObjectVolatile(winterFlowMicroserviceRefactoring2, j) != winterFlowMicroserviceRefactoring2) {
                    break;
                } else {
                    this = winterFlowControllerTransaction;
                }
            }
            this = winterFlowControllerTransaction;
        }
        WinterFlowVariableDeserialization WinterFlowSyntax = winterFlowMicroserviceRefactoring2.WinterFlowSyntax();
        while (true) {
            Unsafe unsafe3 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j2 = WinterFlowTransactionManagerStrategy;
            WinterFlowControllerTransaction winterFlowControllerTransaction2 = this;
            if (unsafe3.compareAndSwapObject(winterFlowControllerTransaction2, j2, winterFlowMicroserviceRefactoring2, WinterFlowSyntax) || unsafe3.getObjectVolatile(winterFlowControllerTransaction2, j2) != winterFlowMicroserviceRefactoring2) {
                return;
            } else {
                this = winterFlowControllerTransaction2;
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowConsumerBandwidth
    public final WinterFlowVersionControlView WinterFlowSingletonPlatform(boolean z, boolean z2, WinterFlowFrameworkCache winterFlowFrameworkCache) {
        return WinterFlowUIMiddleware(z2, z ? new WinterFlowViewPackage(winterFlowFrameworkCache) : new WinterFlowThreadPoolUtility(winterFlowFrameworkCache));
    }

    public boolean WinterFlowSoftwareEngine() {
        return this instanceof WinterFlowXMLPlatform;
    }

    public final Throwable WinterFlowSoftwareProtocol(WinterFlowViewBandwidth winterFlowViewBandwidth, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (winterFlowViewBandwidth.WinterFlowVariableVersionControl()) {
                return new WinterFlowQueryComponent(WinterFlowArrayHelper(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof WinterFlowBatchTransaction) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof WinterFlowBatchTransaction)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public final void WinterFlowStrategyTool(WinterFlowEncryptionIDE winterFlowEncryptionIDE, Object obj) {
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        long j = WinterFlowVariableVersionControl;
        WinterFlowServerNode winterFlowServerNode = (WinterFlowServerNode) unsafe.getObjectVolatile(this, j);
        if (winterFlowServerNode != null) {
            winterFlowServerNode.WinterFlowRouterStructure();
            unsafe.putObjectVolatile(this, j, WinterFlowClassConsumer.WinterFlowVariableVersionControl);
        }
        WinterFlowServerSystem winterFlowServerSystem = null;
        WinterFlowSessionManagerSessionManager winterFlowSessionManagerSessionManager = obj instanceof WinterFlowSessionManagerSessionManager ? (WinterFlowSessionManagerSessionManager) obj : null;
        Throwable th = winterFlowSessionManagerSessionManager != null ? winterFlowSessionManagerSessionManager.WinterFlowRouterStructure : null;
        if (winterFlowEncryptionIDE instanceof WinterFlowMicroserviceRefactoring) {
            try {
                ((WinterFlowMicroserviceRefactoring) winterFlowEncryptionIDE).WinterFlowServiceUtility(th);
                return;
            } catch (Throwable th2) {
                WinterFlowFrontendBackend(new WinterFlowServerSystem("Exception in completion handler " + winterFlowEncryptionIDE + " for " + this, th2));
                return;
            }
        }
        WinterFlowFrontendAPI WinterFlowArrayNetwork = winterFlowEncryptionIDE.WinterFlowArrayNetwork();
        if (WinterFlowArrayNetwork != null) {
            WinterFlowArrayNetwork.WinterFlowVariableVersionControl(new WinterFlowCompilerProcess(1), 1);
            Object WinterFlowRouterRouter = WinterFlowArrayNetwork.WinterFlowRouterRouter();
            WinterFlowRouterRouter.getClass();
            for (WinterFlowVariableDeserialization winterFlowVariableDeserialization = (WinterFlowVariableDeserialization) WinterFlowRouterRouter; !winterFlowVariableDeserialization.equals(WinterFlowArrayNetwork); winterFlowVariableDeserialization = winterFlowVariableDeserialization.WinterFlowSyntax()) {
                if (winterFlowVariableDeserialization instanceof WinterFlowMicroserviceRefactoring) {
                    try {
                        ((WinterFlowMicroserviceRefactoring) winterFlowVariableDeserialization).WinterFlowServiceUtility(th);
                    } catch (Throwable th3) {
                        if (winterFlowServerSystem != null) {
                            WinterFlowCloudStack.WinterFlowTransactionManagerStrategy(winterFlowServerSystem, th3);
                        } else {
                            winterFlowServerSystem = new WinterFlowServerSystem("Exception in completion handler " + winterFlowVariableDeserialization + " for " + this, th3);
                        }
                    }
                }
            }
            if (winterFlowServerSystem != null) {
                WinterFlowFrontendBackend(winterFlowServerSystem);
            }
        }
    }

    public final WinterFlowFrontendAPI WinterFlowSyntaxSubsystem(WinterFlowEncryptionIDE winterFlowEncryptionIDE) {
        WinterFlowFrontendAPI WinterFlowArrayNetwork = winterFlowEncryptionIDE.WinterFlowArrayNetwork();
        if (WinterFlowArrayNetwork != null) {
            return WinterFlowArrayNetwork;
        }
        if (winterFlowEncryptionIDE instanceof WinterFlowWidgetNetwork) {
            return new WinterFlowFrontendAPI();
        }
        if (winterFlowEncryptionIDE instanceof WinterFlowMicroserviceRefactoring) {
            WinterFlowSessionManagerInterface((WinterFlowMicroserviceRefactoring) winterFlowEncryptionIDE);
            return null;
        }
        WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(winterFlowEncryptionIDE, "State should have list: ");
        return null;
    }

    public final Object WinterFlowTestingNode() {
        return WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(this, WinterFlowTransactionManagerStrategy);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionMicroservice
    public final WinterFlowEncryptionMicroservice WinterFlowThreadListener(WinterFlowRendererProvider winterFlowRendererProvider) {
        return WinterFlowTestingCloud.WinterFlowEventEmitterController(this, winterFlowRendererProvider);
    }

    @Override // com.google.android.datatransport.WinterFlowConsumerBandwidth
    public final WinterFlowVersionControlView WinterFlowTransactionAgent(WinterFlowObjectSession winterFlowObjectSession) {
        return WinterFlowUIMiddleware(true, new WinterFlowThreadPoolUtility(winterFlowObjectSession));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WinterFlowVersionControlView WinterFlowUIMiddleware(boolean z, WinterFlowMicroserviceRefactoring winterFlowMicroserviceRefactoring) {
        WinterFlowControllerTransaction winterFlowControllerTransaction;
        WinterFlowMicroserviceRefactoring winterFlowMicroserviceRefactoring2;
        WinterFlowClassConsumer winterFlowClassConsumer;
        boolean WinterFlowVariableVersionControl2;
        winterFlowMicroserviceRefactoring.WinterFlowRouterRouter = this;
        loop0: while (true) {
            Object WinterFlowTestingNode = this.WinterFlowTestingNode();
            if (WinterFlowTestingNode instanceof WinterFlowWidgetNetwork) {
                WinterFlowWidgetNetwork winterFlowWidgetNetwork = (WinterFlowWidgetNetwork) WinterFlowTestingNode;
                if (winterFlowWidgetNetwork.WinterFlowVariableVersionControl) {
                    while (true) {
                        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        long j = WinterFlowTransactionManagerStrategy;
                        winterFlowControllerTransaction = this;
                        winterFlowMicroserviceRefactoring2 = winterFlowMicroserviceRefactoring;
                        if (unsafe.compareAndSwapObject(winterFlowControllerTransaction, j, WinterFlowTestingNode, winterFlowMicroserviceRefactoring2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(winterFlowControllerTransaction, j) != WinterFlowTestingNode) {
                            break;
                        }
                        this = winterFlowControllerTransaction;
                        winterFlowMicroserviceRefactoring = winterFlowMicroserviceRefactoring2;
                    }
                } else {
                    winterFlowControllerTransaction = this;
                    winterFlowMicroserviceRefactoring2 = winterFlowMicroserviceRefactoring;
                    winterFlowControllerTransaction.WinterFlowModuleAgent(winterFlowWidgetNetwork);
                }
                this = winterFlowControllerTransaction;
                winterFlowMicroserviceRefactoring = winterFlowMicroserviceRefactoring2;
            } else {
                winterFlowControllerTransaction = this;
                winterFlowMicroserviceRefactoring2 = winterFlowMicroserviceRefactoring;
                boolean z2 = WinterFlowTestingNode instanceof WinterFlowEncryptionIDE;
                winterFlowClassConsumer = WinterFlowClassConsumer.WinterFlowVariableVersionControl;
                if (z2) {
                    WinterFlowEncryptionIDE winterFlowEncryptionIDE = (WinterFlowEncryptionIDE) WinterFlowTestingNode;
                    WinterFlowFrontendAPI WinterFlowArrayNetwork = winterFlowEncryptionIDE.WinterFlowArrayNetwork();
                    if (WinterFlowArrayNetwork == null) {
                        winterFlowControllerTransaction.WinterFlowSessionManagerInterface((WinterFlowMicroserviceRefactoring) WinterFlowTestingNode);
                    } else {
                        if (winterFlowMicroserviceRefactoring2.WinterFlowThreadListener()) {
                            WinterFlowViewBandwidth winterFlowViewBandwidth = winterFlowEncryptionIDE instanceof WinterFlowViewBandwidth ? (WinterFlowViewBandwidth) winterFlowEncryptionIDE : null;
                            Throwable WinterFlowCacheManagerAgent = winterFlowViewBandwidth != null ? winterFlowViewBandwidth.WinterFlowCacheManagerAgent() : null;
                            if (WinterFlowCacheManagerAgent == null) {
                                WinterFlowVariableVersionControl2 = WinterFlowArrayNetwork.WinterFlowVariableVersionControl(winterFlowMicroserviceRefactoring2, 5);
                            } else if (z) {
                                winterFlowMicroserviceRefactoring2.WinterFlowServiceUtility(WinterFlowCacheManagerAgent);
                                return winterFlowClassConsumer;
                            }
                        } else {
                            WinterFlowVariableVersionControl2 = WinterFlowArrayNetwork.WinterFlowVariableVersionControl(winterFlowMicroserviceRefactoring2, 1);
                        }
                        if (WinterFlowVariableVersionControl2) {
                            break;
                        }
                    }
                    this = winterFlowControllerTransaction;
                    winterFlowMicroserviceRefactoring = winterFlowMicroserviceRefactoring2;
                } else if (z) {
                    Object WinterFlowTestingNode2 = winterFlowControllerTransaction.WinterFlowTestingNode();
                    WinterFlowSessionManagerSessionManager winterFlowSessionManagerSessionManager = WinterFlowTestingNode2 instanceof WinterFlowSessionManagerSessionManager ? (WinterFlowSessionManagerSessionManager) WinterFlowTestingNode2 : null;
                    winterFlowMicroserviceRefactoring2.WinterFlowServiceUtility(winterFlowSessionManagerSessionManager != null ? winterFlowSessionManagerSessionManager.WinterFlowRouterStructure : null);
                }
            }
        }
        return winterFlowClassConsumer;
    }

    public boolean WinterFlowUserManagerUserManager() {
        return true;
    }

    public final int WinterFlowVariableInterface(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof WinterFlowWidgetNetwork;
        long j = WinterFlowTransactionManagerStrategy;
        if (z) {
            if (((WinterFlowWidgetNetwork) obj).WinterFlowVariableVersionControl) {
                return 0;
            }
            WinterFlowWidgetNetwork winterFlowWidgetNetwork = WinterFlowHandlerWebsocket.WinterFlowOrchestrationSubsystem;
            do {
                unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                if (unsafe2.compareAndSwapObject(this, WinterFlowTransactionManagerStrategy, obj, winterFlowWidgetNetwork)) {
                    WinterFlowOrchestrationConfiguration();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof WinterFlowRepositoryUnitTest)) {
            return 0;
        }
        WinterFlowFrontendAPI winterFlowFrontendAPI = ((WinterFlowRepositoryUnitTest) obj).WinterFlowVariableVersionControl;
        do {
            unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            if (unsafe.compareAndSwapObject(this, WinterFlowTransactionManagerStrategy, obj, winterFlowFrontendAPI)) {
                WinterFlowOrchestrationConfiguration();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    @Override // com.google.android.datatransport.WinterFlowStrategyPackage
    public final WinterFlowRendererProvider getKey() {
        return WinterFlowSessionManagerProcess.WinterFlowVariableBandwidth;
    }

    @Override // com.google.android.datatransport.WinterFlowConsumerBandwidth
    public final boolean start() {
        int WinterFlowVariableInterface;
        do {
            WinterFlowVariableInterface = WinterFlowVariableInterface(WinterFlowTestingNode());
            if (WinterFlowVariableInterface == 0) {
                return false;
            }
        } while (WinterFlowVariableInterface != 1);
        return true;
    }

    public final String toString() {
        return (WinterFlowConfiguration() + '{' + WinterFlowAPIFrontend(WinterFlowTestingNode()) + '}') + '@' + WinterFlowQuerySyntax.WinterFlowBandwidthObject(this);
    }

    public void WinterFlowOrchestrationConfiguration() {
    }

    public void WinterFlowFrameworkTransaction(Object obj) {
    }

    public void WinterFlowFrontendBackend(WinterFlowServerSystem winterFlowServerSystem) {
        throw winterFlowServerSystem;
    }

    public void WinterFlowServerProtocol(Object obj) {
    }
}
