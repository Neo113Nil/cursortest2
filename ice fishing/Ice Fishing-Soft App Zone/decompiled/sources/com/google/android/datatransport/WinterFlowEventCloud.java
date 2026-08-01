package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowEventCloud extends WinterFlowInvokerEntity implements WinterFlowAPIVersion, WinterFlowEventConfiguration, WinterFlowTransactionIDE {
    public static final /* synthetic */ long WinterFlowResponseEngine;
    public static final /* synthetic */ long WinterFlowServerProtocol;
    public static final /* synthetic */ long WinterFlowTransactionAgent;
    public final WinterFlowTransactionManagerLayer WinterFlowRouterRouter;
    public final WinterFlowEncryptionMicroservice WinterFlowSyntax;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        WinterFlowResponseEngine = unsafe.objectFieldOffset(WinterFlowEventCloud.class.getDeclaredField("_decisionAndIndex$volatile"));
        WinterFlowServerProtocol = unsafe.objectFieldOffset(WinterFlowEventCloud.class.getDeclaredField("_state$volatile"));
        WinterFlowTransactionAgent = unsafe.objectFieldOffset(WinterFlowEventCloud.class.getDeclaredField("_parentHandle$volatile"));
    }

    public WinterFlowEventCloud(int i, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(i);
        this.WinterFlowRouterRouter = winterFlowTransactionManagerLayer;
        this.WinterFlowSyntax = winterFlowTransactionManagerLayer.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = WinterFlowBandwidthSubsystem.WinterFlowRouterStructure;
    }

    public static Object WinterFlowCacheManagerListener(WinterFlowWorkerNetwork winterFlowWorkerNetwork, Object obj, int i, WinterFlowControllerScript winterFlowControllerScript) {
        if (obj instanceof WinterFlowSessionManagerSessionManager) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (winterFlowControllerScript != null || (winterFlowWorkerNetwork instanceof WinterFlowProxyStructure)) {
            return new WinterFlowSoftwareXML(obj, winterFlowWorkerNetwork instanceof WinterFlowProxyStructure ? (WinterFlowProxyStructure) winterFlowWorkerNetwork : null, winterFlowControllerScript, (Throwable) null, 16);
        }
        return obj;
    }

    public static void WinterFlowEventEmitterController(WinterFlowWorkerNetwork winterFlowWorkerNetwork, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + winterFlowWorkerNetwork + ", already has " + obj).toString());
    }

    public String WinterFlowArrayHelper() {
        return "CancellableContinuation";
    }

    @Override // com.google.android.datatransport.WinterFlowInvokerEntity
    public final WinterFlowTransactionManagerLayer WinterFlowArrayNetwork() {
        return this.WinterFlowRouterRouter;
    }

    public final boolean WinterFlowBackendCacheManager() {
        if (this.WinterFlowUnitTestResponse == 2) {
            return WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile((WinterFlowScriptHelper) this.WinterFlowRouterRouter, WinterFlowScriptHelper.WinterFlowServerProtocol) != null;
        }
        return false;
    }

    public final void WinterFlowBandwidthObject() {
        Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
        long j = WinterFlowTransactionAgent;
        WinterFlowVersionControlView winterFlowVersionControlView = (WinterFlowVersionControlView) unsafe.getObjectVolatile(this, j);
        if (winterFlowVersionControlView == null) {
            return;
        }
        winterFlowVersionControlView.WinterFlowRouterStructure();
        unsafe.putObjectVolatile(this, j, WinterFlowClassConsumer.WinterFlowVariableVersionControl);
    }

    public final Object WinterFlowBatchUI() {
        WinterFlowConsumerBandwidth winterFlowConsumerBandwidth;
        boolean WinterFlowBackendCacheManager = WinterFlowBackendCacheManager();
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowResponseEngine;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i != 2) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Already suspended");
                    return null;
                }
                if (WinterFlowBackendCacheManager) {
                    this.WinterFlowCompilerVariable();
                }
                Object WinterFlowRouterAdapter = this.WinterFlowRouterAdapter();
                if (WinterFlowRouterAdapter instanceof WinterFlowSessionManagerSessionManager) {
                    throw ((WinterFlowSessionManagerSessionManager) WinterFlowRouterAdapter).WinterFlowRouterStructure;
                }
                int i2 = this.WinterFlowUnitTestResponse;
                if ((i2 != 1 && i2 != 2) || (winterFlowConsumerBandwidth = (WinterFlowConsumerBandwidth) this.WinterFlowSyntax.WinterFlowConsumerUserManager(WinterFlowSessionManagerProcess.WinterFlowVariableBandwidth)) == null || winterFlowConsumerBandwidth.WinterFlowHookDataSource()) {
                    return this.WinterFlowUnitTestResponse(WinterFlowRouterAdapter);
                }
                CancellationException WinterFlowBandwidthObject = winterFlowConsumerBandwidth.WinterFlowBandwidthObject();
                this.WinterFlowHookDataSource(WinterFlowBandwidthObject);
                throw WinterFlowBandwidthObject;
            }
            WinterFlowEventCloud winterFlowEventCloud = this;
            if (unsafe.compareAndSwapInt(winterFlowEventCloud, j, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((WinterFlowVersionControlView) unsafe.getObjectVolatile(winterFlowEventCloud, WinterFlowTransactionAgent)) == null) {
                    winterFlowEventCloud.WinterFlowMapperProtocol();
                }
                if (WinterFlowBackendCacheManager) {
                    winterFlowEventCloud.WinterFlowCompilerVariable();
                }
                return WinterFlowListenerJava.WinterFlowVariableVersionControl;
            }
            this = winterFlowEventCloud;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowAPIVersion
    public final WinterFlowJSONDecorator WinterFlowCacheManagerAgent(Object obj, WinterFlowControllerScript winterFlowControllerScript) {
        WinterFlowEventCloud winterFlowEventCloud;
        WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowServerManager.WinterFlowSyntax;
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowServerProtocol;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof WinterFlowWorkerNetwork)) {
                return null;
            }
            Object WinterFlowCacheManagerListener = WinterFlowCacheManagerListener((WinterFlowWorkerNetwork) objectVolatile, obj, this.WinterFlowUnitTestResponse, winterFlowControllerScript);
            while (true) {
                Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                winterFlowEventCloud = this;
                if (unsafe2.compareAndSwapObject(winterFlowEventCloud, WinterFlowServerProtocol, objectVolatile, WinterFlowCacheManagerListener)) {
                    if (!winterFlowEventCloud.WinterFlowBackendCacheManager()) {
                        winterFlowEventCloud.WinterFlowBandwidthObject();
                    }
                    return winterFlowJSONDecorator;
                }
                if (unsafe2.getObjectVolatile(winterFlowEventCloud, j) != objectVolatile) {
                    break;
                }
                this = winterFlowEventCloud;
            }
            this = winterFlowEventCloud;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r9.WinterFlowBandwidthObject();
        r9.WinterFlowResponseEngine(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowCompilerVariable() {
        WinterFlowEventCloud winterFlowEventCloud;
        Unsafe unsafe;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = this.WinterFlowRouterRouter;
        Throwable th = null;
        WinterFlowScriptHelper winterFlowScriptHelper = winterFlowTransactionManagerLayer instanceof WinterFlowScriptHelper ? (WinterFlowScriptHelper) winterFlowTransactionManagerLayer : null;
        if (winterFlowScriptHelper == null) {
            return;
        }
        long j = WinterFlowScriptHelper.WinterFlowServerProtocol;
        loop0: while (true) {
            Object objectVolatile = WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(winterFlowScriptHelper, j);
            WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowCloudStack.WinterFlowHookDataSource;
            if (objectVolatile != winterFlowJSONDecorator) {
                winterFlowEventCloud = this;
                if (!(objectVolatile instanceof Throwable)) {
                    WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(objectVolatile, "Inconsistent state ");
                    return;
                }
                do {
                    unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    if (unsafe.compareAndSwapObject(winterFlowScriptHelper, WinterFlowScriptHelper.WinterFlowServerProtocol, objectVolatile, (Object) null)) {
                        th = (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(winterFlowScriptHelper, j) == objectVolatile);
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Failed requirement.");
                return;
            }
            while (true) {
                Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                WinterFlowEventCloud winterFlowEventCloud2 = this;
                winterFlowEventCloud = winterFlowEventCloud2;
                if (unsafe2.compareAndSwapObject(winterFlowScriptHelper, WinterFlowScriptHelper.WinterFlowServerProtocol, winterFlowJSONDecorator, winterFlowEventCloud2)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(winterFlowScriptHelper, j) != winterFlowJSONDecorator) {
                    break;
                } else {
                    this = winterFlowEventCloud;
                }
            }
            this = winterFlowEventCloud;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowAPIVersion
    public final void WinterFlowConcurrencyThread(Object obj, WinterFlowControllerScript winterFlowControllerScript) {
        WinterFlowConfigurationSubsystem(obj, this.WinterFlowUnitTestResponse, winterFlowControllerScript);
    }

    public final void WinterFlowConfigurationSubsystem(Object obj, int i, WinterFlowControllerScript winterFlowControllerScript) {
        WinterFlowEventCloud winterFlowEventCloud;
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowServerProtocol;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof WinterFlowWorkerNetwork)) {
                WinterFlowEventCloud winterFlowEventCloud2 = this;
                if (objectVolatile instanceof WinterFlowDatabaseNode) {
                    WinterFlowDatabaseNode winterFlowDatabaseNode = (WinterFlowDatabaseNode) objectVolatile;
                    if (unsafe.compareAndSwapInt(winterFlowDatabaseNode, WinterFlowDatabaseNode.WinterFlowCacheManagerAgent, 0, 1)) {
                        if (winterFlowControllerScript != null) {
                            winterFlowEventCloud2.WinterFlowThreadListener(winterFlowControllerScript, winterFlowDatabaseNode.WinterFlowRouterStructure, obj);
                            return;
                        }
                        return;
                    }
                }
                WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object WinterFlowCacheManagerListener = WinterFlowCacheManagerListener((WinterFlowWorkerNetwork) objectVolatile, obj, i, winterFlowControllerScript);
            while (true) {
                Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                winterFlowEventCloud = this;
                if (unsafe2.compareAndSwapObject(winterFlowEventCloud, WinterFlowServerProtocol, objectVolatile, WinterFlowCacheManagerListener)) {
                    if (!winterFlowEventCloud.WinterFlowBackendCacheManager()) {
                        winterFlowEventCloud.WinterFlowBandwidthObject();
                    }
                    winterFlowEventCloud.WinterFlowOrchestrationSubsystem(i);
                    return;
                } else if (unsafe2.getObjectVolatile(winterFlowEventCloud, j) != objectVolatile) {
                    break;
                } else {
                    this = winterFlowEventCloud;
                }
            }
            this = winterFlowEventCloud;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c6, code lost:
    
        WinterFlowEventEmitterController(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c9, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowConsumerUserManager(WinterFlowWorkerNetwork winterFlowWorkerNetwork) {
        WinterFlowWorkerNetwork winterFlowWorkerNetwork2;
        WinterFlowEventCloud winterFlowEventCloud;
        WinterFlowEventCloud winterFlowEventCloud2;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowServerProtocol;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof WinterFlowBandwidthSubsystem) {
                while (true) {
                    Unsafe unsafe3 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    WinterFlowEventCloud winterFlowEventCloud3 = this;
                    WinterFlowWorkerNetwork winterFlowWorkerNetwork3 = winterFlowWorkerNetwork;
                    winterFlowEventCloud = winterFlowEventCloud3;
                    winterFlowWorkerNetwork2 = winterFlowWorkerNetwork3;
                    if (unsafe3.compareAndSwapObject(winterFlowEventCloud3, WinterFlowServerProtocol, objectVolatile, winterFlowWorkerNetwork3)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(winterFlowEventCloud, j) != objectVolatile) {
                        break;
                    }
                    this = winterFlowEventCloud;
                    winterFlowWorkerNetwork = winterFlowWorkerNetwork2;
                }
            } else {
                winterFlowWorkerNetwork2 = winterFlowWorkerNetwork;
                winterFlowEventCloud = this;
                if ((objectVolatile instanceof WinterFlowProxyStructure) || (objectVolatile instanceof WinterFlowDatabaseDeserialization)) {
                    break;
                }
                if (objectVolatile instanceof WinterFlowSessionManagerSessionManager) {
                    WinterFlowSessionManagerSessionManager winterFlowSessionManagerSessionManager = (WinterFlowSessionManagerSessionManager) objectVolatile;
                    if (!unsafe2.compareAndSwapInt(winterFlowSessionManagerSessionManager, WinterFlowSessionManagerSessionManager.WinterFlowHookDataSource, 0, 1)) {
                        WinterFlowEventEmitterController(winterFlowWorkerNetwork2, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof WinterFlowDatabaseNode) {
                        Throwable th = winterFlowSessionManagerSessionManager.WinterFlowRouterStructure;
                        if (winterFlowWorkerNetwork2 instanceof WinterFlowProxyStructure) {
                            winterFlowEventCloud.WinterFlowServerProtocol((WinterFlowProxyStructure) winterFlowWorkerNetwork2, th);
                            return;
                        } else {
                            winterFlowEventCloud.WinterFlowServiceUtility((WinterFlowDatabaseDeserialization) winterFlowWorkerNetwork2, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof WinterFlowSoftwareXML) {
                    WinterFlowSoftwareXML winterFlowSoftwareXML = (WinterFlowSoftwareXML) objectVolatile;
                    if (winterFlowSoftwareXML.WinterFlowHookDataSource != null) {
                        WinterFlowEventEmitterController(winterFlowWorkerNetwork2, objectVolatile);
                        throw null;
                    }
                    if (winterFlowWorkerNetwork2 instanceof WinterFlowDatabaseDeserialization) {
                        return;
                    }
                    WinterFlowProxyStructure winterFlowProxyStructure = (WinterFlowProxyStructure) winterFlowWorkerNetwork2;
                    Throwable th2 = winterFlowSoftwareXML.WinterFlowVariableVersionControl;
                    if (th2 != null) {
                        winterFlowEventCloud.WinterFlowServerProtocol(winterFlowProxyStructure, th2);
                        return;
                    }
                    WinterFlowSoftwareXML WinterFlowRouterStructure = WinterFlowSoftwareXML.WinterFlowRouterStructure(winterFlowSoftwareXML, winterFlowProxyStructure, null, 29);
                    do {
                        unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        if (unsafe.compareAndSwapObject(winterFlowEventCloud, WinterFlowServerProtocol, objectVolatile, WinterFlowRouterStructure)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(winterFlowEventCloud, j) == objectVolatile);
                } else {
                    if (winterFlowWorkerNetwork2 instanceof WinterFlowDatabaseDeserialization) {
                        return;
                    }
                    WinterFlowSoftwareXML winterFlowSoftwareXML2 = new WinterFlowSoftwareXML(objectVolatile, (WinterFlowProxyStructure) winterFlowWorkerNetwork2, (WinterFlowControllerScript) null, (Throwable) null, 28);
                    while (true) {
                        WinterFlowSoftwareXML winterFlowSoftwareXML3 = winterFlowSoftwareXML2;
                        Unsafe unsafe4 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                        winterFlowEventCloud2 = winterFlowEventCloud;
                        boolean compareAndSwapObject = unsafe4.compareAndSwapObject(winterFlowEventCloud2, WinterFlowServerProtocol, objectVolatile, winterFlowSoftwareXML3);
                        winterFlowSoftwareXML2 = winterFlowSoftwareXML3;
                        if (compareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(winterFlowEventCloud2, j) != objectVolatile) {
                            break;
                        } else {
                            winterFlowEventCloud = winterFlowEventCloud2;
                        }
                    }
                    this = winterFlowEventCloud2;
                    winterFlowWorkerNetwork = winterFlowWorkerNetwork2;
                }
            }
            winterFlowEventCloud2 = winterFlowEventCloud;
            this = winterFlowEventCloud2;
            winterFlowWorkerNetwork = winterFlowWorkerNetwork2;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowInvokerEntity
    public final void WinterFlowHookDataSource(CancellationException cancellationException) {
        CancellationException cancellationException2;
        WinterFlowEventCloud winterFlowEventCloud;
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowServerProtocol;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof WinterFlowWorkerNetwork) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Not completed");
                return;
            }
            if (objectVolatile instanceof WinterFlowSessionManagerSessionManager) {
                return;
            }
            if (objectVolatile instanceof WinterFlowSoftwareXML) {
                WinterFlowSoftwareXML winterFlowSoftwareXML = (WinterFlowSoftwareXML) objectVolatile;
                if (winterFlowSoftwareXML.WinterFlowVariableVersionControl != null) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Must be called at most once");
                    return;
                }
                WinterFlowSoftwareXML WinterFlowRouterStructure = WinterFlowSoftwareXML.WinterFlowRouterStructure(winterFlowSoftwareXML, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    WinterFlowEventCloud winterFlowEventCloud2 = this;
                    if (unsafe2.compareAndSwapObject(winterFlowEventCloud2, WinterFlowServerProtocol, objectVolatile, WinterFlowRouterStructure)) {
                        WinterFlowProxyStructure winterFlowProxyStructure = winterFlowSoftwareXML.WinterFlowHookDataSource;
                        if (winterFlowProxyStructure != null) {
                            winterFlowEventCloud2.WinterFlowServerProtocol(winterFlowProxyStructure, cancellationException);
                        }
                        WinterFlowControllerScript winterFlowControllerScript = winterFlowSoftwareXML.WinterFlowCacheManagerAgent;
                        if (winterFlowControllerScript != null) {
                            winterFlowEventCloud2.WinterFlowThreadListener(winterFlowControllerScript, cancellationException, winterFlowSoftwareXML.WinterFlowRouterStructure);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(winterFlowEventCloud2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        winterFlowEventCloud = winterFlowEventCloud2;
                        break;
                    }
                    this = winterFlowEventCloud2;
                }
            } else {
                WinterFlowEventCloud winterFlowEventCloud3 = this;
                CancellationException cancellationException3 = cancellationException;
                WinterFlowSoftwareXML winterFlowSoftwareXML2 = new WinterFlowSoftwareXML(objectVolatile, (WinterFlowProxyStructure) null, (WinterFlowControllerScript) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    WinterFlowSoftwareXML winterFlowSoftwareXML3 = winterFlowSoftwareXML2;
                    Unsafe unsafe3 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    winterFlowEventCloud = winterFlowEventCloud3;
                    boolean compareAndSwapObject = unsafe3.compareAndSwapObject(winterFlowEventCloud, WinterFlowServerProtocol, objectVolatile, winterFlowSoftwareXML3);
                    winterFlowSoftwareXML2 = winterFlowSoftwareXML3;
                    if (compareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(winterFlowEventCloud, j) != objectVolatile) {
                        break;
                    } else {
                        winterFlowEventCloud3 = winterFlowEventCloud;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = winterFlowEventCloud;
        }
    }

    public final WinterFlowVersionControlView WinterFlowMapperProtocol() {
        WinterFlowConsumerBandwidth winterFlowConsumerBandwidth = (WinterFlowConsumerBandwidth) this.WinterFlowSyntax.WinterFlowConsumerUserManager(WinterFlowSessionManagerProcess.WinterFlowVariableBandwidth);
        if (winterFlowConsumerBandwidth == null) {
            return null;
        }
        WinterFlowVersionControlView WinterFlowPackageIDE = WinterFlowInvokerComponent.WinterFlowPackageIDE(winterFlowConsumerBandwidth, true, new WinterFlowMapperTesting(this));
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowTransactionAgent;
            WinterFlowEventCloud winterFlowEventCloud = this;
            if (!unsafe.compareAndSwapObject(winterFlowEventCloud, j, (Object) null, WinterFlowPackageIDE) && unsafe.getObjectVolatile(winterFlowEventCloud, j) == null) {
                this = winterFlowEventCloud;
            }
        }
        return WinterFlowPackageIDE;
    }

    public final void WinterFlowOrchestrationSubsystem(int i) {
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowResponseEngine;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Already resumed");
                    return;
                }
                boolean z = i == 4;
                WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = this.WinterFlowRouterRouter;
                if (!z && (winterFlowTransactionManagerLayer instanceof WinterFlowScriptHelper)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.WinterFlowUnitTestResponse;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        WinterFlowScriptHelper winterFlowScriptHelper = (WinterFlowScriptHelper) winterFlowTransactionManagerLayer;
                        WinterFlowUnitTestRouter winterFlowUnitTestRouter = winterFlowScriptHelper.WinterFlowRouterRouter;
                        WinterFlowEncryptionMicroservice context = winterFlowScriptHelper.WinterFlowSyntax.getContext();
                        if (winterFlowUnitTestRouter.WinterFlowCacheManagerListener(context)) {
                            winterFlowUnitTestRouter.WinterFlowConfigurationSubsystem(context, this);
                            return;
                        }
                        WinterFlowResponseObject WinterFlowRouterStructure = WinterFlowNetworkSubsystem.WinterFlowRouterStructure();
                        if (WinterFlowRouterStructure.WinterFlowUnitTestResponse >= 4294967296L) {
                            WinterFlowRouterStructure.WinterFlowUserManagerUserManager(this);
                            return;
                        }
                        WinterFlowRouterStructure.WinterFlowSoftwareEngine(true);
                        try {
                            WinterFlowEncryptionSubsystem.WinterFlowUIMiddleware(this, winterFlowTransactionManagerLayer, true);
                            do {
                            } while (WinterFlowRouterStructure.WinterFlowTestingNode());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                WinterFlowEncryptionSubsystem.WinterFlowUIMiddleware(this, winterFlowTransactionManagerLayer, z);
                return;
            }
            WinterFlowEventCloud winterFlowEventCloud = this;
            if (unsafe.compareAndSwapInt(winterFlowEventCloud, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = winterFlowEventCloud;
            }
        }
    }

    public final void WinterFlowResolverController(WinterFlowObjectSession winterFlowObjectSession) {
        WinterFlowConsumerUserManager(new WinterFlowProxyStructure(1, winterFlowObjectSession));
    }

    @Override // com.google.android.datatransport.WinterFlowAPIVersion
    public final boolean WinterFlowResponseEngine(Throwable th) {
        WinterFlowEventCloud winterFlowEventCloud;
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowServerProtocol;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof WinterFlowWorkerNetwork)) {
                return false;
            }
            WinterFlowDatabaseNode winterFlowDatabaseNode = new WinterFlowDatabaseNode(this, th, (objectVolatile instanceof WinterFlowProxyStructure) || (objectVolatile instanceof WinterFlowDatabaseDeserialization));
            while (true) {
                Unsafe unsafe2 = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                winterFlowEventCloud = this;
                if (unsafe2.compareAndSwapObject(winterFlowEventCloud, WinterFlowServerProtocol, objectVolatile, winterFlowDatabaseNode)) {
                    WinterFlowWorkerNetwork winterFlowWorkerNetwork = (WinterFlowWorkerNetwork) objectVolatile;
                    if (winterFlowWorkerNetwork instanceof WinterFlowProxyStructure) {
                        winterFlowEventCloud.WinterFlowServerProtocol((WinterFlowProxyStructure) objectVolatile, th);
                    } else if (winterFlowWorkerNetwork instanceof WinterFlowDatabaseDeserialization) {
                        winterFlowEventCloud.WinterFlowServiceUtility((WinterFlowDatabaseDeserialization) objectVolatile, th);
                    }
                    if (!winterFlowEventCloud.WinterFlowBackendCacheManager()) {
                        winterFlowEventCloud.WinterFlowBandwidthObject();
                    }
                    winterFlowEventCloud.WinterFlowOrchestrationSubsystem(winterFlowEventCloud.WinterFlowUnitTestResponse);
                    return true;
                }
                if (unsafe2.getObjectVolatile(winterFlowEventCloud, j) != objectVolatile) {
                    break;
                }
                this = winterFlowEventCloud;
            }
            this = winterFlowEventCloud;
        }
    }

    public final Object WinterFlowRouterAdapter() {
        return WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(this, WinterFlowServerProtocol);
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionIDE
    public final void WinterFlowRouterStructure(WinterFlowDatabaseDeserialization winterFlowDatabaseDeserialization, int i) {
        while (true) {
            Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            long j = WinterFlowResponseEngine;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) != 536870911) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("invokeOnCancellation should be called at most once");
                return;
            }
            WinterFlowEventCloud winterFlowEventCloud = this;
            if (unsafe.compareAndSwapInt(winterFlowEventCloud, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                winterFlowEventCloud.WinterFlowConsumerUserManager(winterFlowDatabaseDeserialization);
                return;
            }
            this = winterFlowEventCloud;
        }
    }

    public final void WinterFlowSerializerStructure() {
        WinterFlowVersionControlView WinterFlowMapperProtocol = WinterFlowMapperProtocol();
        if (WinterFlowMapperProtocol == null || (WinterFlowRouterAdapter() instanceof WinterFlowWorkerNetwork)) {
            return;
        }
        WinterFlowMapperProtocol.WinterFlowRouterStructure();
        WinterFlowQueueThreadPool.WinterFlowRouterStructure.putObjectVolatile(this, WinterFlowTransactionAgent, WinterFlowClassConsumer.WinterFlowVariableVersionControl);
    }

    public final void WinterFlowServerProtocol(WinterFlowProxyStructure winterFlowProxyStructure, Throwable th) {
        try {
            switch (winterFlowProxyStructure.WinterFlowRouterStructure) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    ((ScheduledFuture) winterFlowProxyStructure.WinterFlowHookDataSource).cancel(false);
                    break;
                case 1:
                    ((WinterFlowObjectSession) winterFlowProxyStructure.WinterFlowHookDataSource).WinterFlowUnitTestResponse(th);
                    break;
                default:
                    ((WinterFlowVersionControlView) winterFlowProxyStructure.WinterFlowHookDataSource).WinterFlowRouterStructure();
                    break;
            }
        } catch (Throwable th2) {
            WinterFlowSoftwareException.WinterFlowSoftwareProtocol(this.WinterFlowSyntax, new WinterFlowServerSystem("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void WinterFlowServiceUtility(WinterFlowDatabaseDeserialization winterFlowDatabaseDeserialization, Throwable th) {
        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = this.WinterFlowSyntax;
        int intVolatile = WinterFlowQueueThreadPool.WinterFlowRouterStructure.getIntVolatile(this, WinterFlowResponseEngine) & 536870911;
        if (intVolatile == 536870911) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            winterFlowDatabaseDeserialization.WinterFlowUnitTestResponse(intVolatile, winterFlowEncryptionMicroservice);
        } catch (Throwable th2) {
            WinterFlowSoftwareException.WinterFlowSoftwareProtocol(winterFlowEncryptionMicroservice, new WinterFlowServerSystem("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public Throwable WinterFlowSingletonPlatform(WinterFlowControllerTransaction winterFlowControllerTransaction) {
        return winterFlowControllerTransaction.WinterFlowBandwidthObject();
    }

    public final void WinterFlowStrategyTool(WinterFlowUnitTestRouter winterFlowUnitTestRouter) {
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = this.WinterFlowRouterRouter;
        WinterFlowScriptHelper winterFlowScriptHelper = winterFlowTransactionManagerLayer instanceof WinterFlowScriptHelper ? (WinterFlowScriptHelper) winterFlowTransactionManagerLayer : null;
        WinterFlowConfigurationSubsystem(WinterFlowAlgorithmSession.WinterFlowRouterStructure, (winterFlowScriptHelper != null ? winterFlowScriptHelper.WinterFlowRouterRouter : null) == winterFlowUnitTestRouter ? 4 : this.WinterFlowUnitTestResponse, null);
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerLayer
    public final void WinterFlowSyntax(Object obj) {
        Throwable WinterFlowRouterStructure = WinterFlowRendererStructure.WinterFlowRouterStructure(obj);
        if (WinterFlowRouterStructure != null) {
            obj = new WinterFlowSessionManagerSessionManager(WinterFlowRouterStructure, false);
        }
        WinterFlowConfigurationSubsystem(obj, this.WinterFlowUnitTestResponse, null);
    }

    public final void WinterFlowThreadListener(WinterFlowControllerScript winterFlowControllerScript, Throwable th, Object obj) {
        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = this.WinterFlowSyntax;
        try {
            winterFlowControllerScript.WinterFlowArrayNetwork(th, obj, winterFlowEncryptionMicroservice);
        } catch (Throwable th2) {
            WinterFlowSoftwareException.WinterFlowSoftwareProtocol(winterFlowEncryptionMicroservice, new WinterFlowServerSystem("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // com.google.android.datatransport.WinterFlowInvokerEntity
    public final Object WinterFlowTransactionAgent() {
        return WinterFlowRouterAdapter();
    }

    @Override // com.google.android.datatransport.WinterFlowEventConfiguration
    public final WinterFlowEventConfiguration WinterFlowTransactionManagerStrategy() {
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = this.WinterFlowRouterRouter;
        if (winterFlowTransactionManagerLayer instanceof WinterFlowEventConfiguration) {
            return (WinterFlowEventConfiguration) winterFlowTransactionManagerLayer;
        }
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowInvokerEntity
    public final Object WinterFlowUnitTestResponse(Object obj) {
        return obj instanceof WinterFlowSoftwareXML ? ((WinterFlowSoftwareXML) obj).WinterFlowRouterStructure : obj;
    }

    @Override // com.google.android.datatransport.WinterFlowAPIVersion
    public final void WinterFlowVariableBandwidth(Object obj) {
        WinterFlowOrchestrationSubsystem(this.WinterFlowUnitTestResponse);
    }

    @Override // com.google.android.datatransport.WinterFlowInvokerEntity
    public final Throwable WinterFlowVariableVersionControl(Object obj) {
        Throwable WinterFlowVariableVersionControl = super.WinterFlowVariableVersionControl(obj);
        if (WinterFlowVariableVersionControl != null) {
            return WinterFlowVariableVersionControl;
        }
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerLayer
    public final WinterFlowEncryptionMicroservice getContext() {
        return this.WinterFlowSyntax;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(WinterFlowArrayHelper());
        sb.append('(');
        sb.append(WinterFlowQuerySyntax.WinterFlowUserManagerUserManager(this.WinterFlowRouterRouter));
        sb.append("){");
        Object WinterFlowRouterAdapter = WinterFlowRouterAdapter();
        sb.append(WinterFlowRouterAdapter instanceof WinterFlowWorkerNetwork ? "Active" : WinterFlowRouterAdapter instanceof WinterFlowDatabaseNode ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(WinterFlowQuerySyntax.WinterFlowBandwidthObject(this));
        return sb.toString();
    }
}
