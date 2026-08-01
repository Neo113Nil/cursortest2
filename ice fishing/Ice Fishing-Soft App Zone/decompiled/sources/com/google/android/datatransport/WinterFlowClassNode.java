package com.google.android.datatransport;

import android.database.SQLException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowClassNode implements WinterFlowRequestProvider, WinterFlowVariableRefactoring {
    public final WinterFlowOrchestrationValidator WinterFlowArrayNetwork;
    public final boolean WinterFlowCacheManagerAgent;
    public final WinterFlowJavaJSON WinterFlowHookDataSource;
    public final WinterFlowThreadPoolProcess WinterFlowRouterStructure;
    public volatile boolean WinterFlowVariableVersionControl;

    public WinterFlowClassNode(WinterFlowThreadPoolProcess winterFlowThreadPoolProcess, WinterFlowJavaJSON winterFlowJavaJSON, boolean z) {
        winterFlowThreadPoolProcess.getClass();
        this.WinterFlowRouterStructure = winterFlowThreadPoolProcess;
        this.WinterFlowHookDataSource = winterFlowJavaJSON;
        this.WinterFlowCacheManagerAgent = z;
        this.WinterFlowArrayNetwork = new WinterFlowOrchestrationValidator();
    }

    @Override // com.google.android.datatransport.WinterFlowRequestProvider
    public final Boolean WinterFlowArrayNetwork(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        if (this.WinterFlowVariableVersionControl) {
            WinterFlowConfigurationException.WinterFlowSyntax("Connection is recycled", 21);
            throw null;
        }
        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = ((WinterFlowOrchestrationCompiler) winterFlowTransactionManagerLayer).WinterFlowTransactionManagerStrategy;
        winterFlowEncryptionMicroservice.getClass();
        WinterFlowClassConcurrency winterFlowClassConcurrency = (WinterFlowClassConcurrency) winterFlowEncryptionMicroservice.WinterFlowConsumerUserManager(this.WinterFlowRouterStructure);
        if (winterFlowClassConcurrency != null && winterFlowClassConcurrency.WinterFlowTransactionManagerStrategy == this) {
            return Boolean.valueOf(!this.WinterFlowArrayNetwork.isEmpty() || this.WinterFlowHookDataSource.WinterFlowVariableVersionControl.WinterFlowServerProtocol());
        }
        WinterFlowConfigurationException.WinterFlowSyntax("Attempted to use connection on a different coroutine", 21);
        throw null;
    }

    @Override // com.google.android.datatransport.WinterFlowRequestProvider
    public final Object WinterFlowCacheManagerAgent(WinterFlowAdapter winterFlowAdapter, WinterFlowEventEvent winterFlowEventEvent, WinterFlowNodeInheritance winterFlowNodeInheritance) {
        if (this.WinterFlowVariableVersionControl) {
            WinterFlowConfigurationException.WinterFlowSyntax("Connection is recycled", 21);
            throw null;
        }
        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = winterFlowNodeInheritance.WinterFlowTransactionManagerStrategy;
        winterFlowEncryptionMicroservice.getClass();
        WinterFlowClassConcurrency winterFlowClassConcurrency = (WinterFlowClassConcurrency) winterFlowEncryptionMicroservice.WinterFlowConsumerUserManager(this.WinterFlowRouterStructure);
        if (winterFlowClassConcurrency != null && winterFlowClassConcurrency.WinterFlowTransactionManagerStrategy == this) {
            return WinterFlowUnitTestResponse(winterFlowAdapter, winterFlowEventEvent, winterFlowNodeInheritance);
        }
        WinterFlowConfigurationException.WinterFlowSyntax("Attempted to use connection on a different coroutine", 21);
        throw null;
    }

    @Override // com.google.android.datatransport.WinterFlowVariableRefactoring
    public final WinterFlowDeserializationHandler WinterFlowHookDataSource() {
        return this.WinterFlowHookDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.google.android.datatransport.WinterFlowJavaDeployment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowRouterStructure(String str, WinterFlowObjectSession winterFlowObjectSession, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowRequestManager winterFlowRequestManager;
        int i;
        WinterFlowJavaJSON winterFlowJavaJSON;
        try {
            try {
                if (winterFlowOrchestrationCompiler instanceof WinterFlowRequestManager) {
                    winterFlowRequestManager = (WinterFlowRequestManager) winterFlowOrchestrationCompiler;
                    int i2 = winterFlowRequestManager.WinterFlowThreadListener;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        winterFlowRequestManager.WinterFlowThreadListener = i2 - Integer.MIN_VALUE;
                        Object obj = winterFlowRequestManager.WinterFlowTransactionAgent;
                        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                        i = winterFlowRequestManager.WinterFlowThreadListener;
                        if (i != 0) {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            if (this.WinterFlowVariableVersionControl) {
                                WinterFlowConfigurationException.WinterFlowSyntax("Connection is recycled", 21);
                                throw null;
                            }
                            WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = winterFlowRequestManager.WinterFlowTransactionManagerStrategy;
                            winterFlowEncryptionMicroservice.getClass();
                            WinterFlowClassConcurrency winterFlowClassConcurrency = (WinterFlowClassConcurrency) winterFlowEncryptionMicroservice.WinterFlowConsumerUserManager(this.WinterFlowRouterStructure);
                            if (winterFlowClassConcurrency == null || winterFlowClassConcurrency.WinterFlowTransactionManagerStrategy != this) {
                                WinterFlowConfigurationException.WinterFlowSyntax("Attempted to use connection on a different coroutine", 21);
                                throw null;
                            }
                            winterFlowJavaJSON = this.WinterFlowHookDataSource;
                            winterFlowRequestManager.WinterFlowRouterRouter = str;
                            winterFlowRequestManager.WinterFlowSyntax = winterFlowObjectSession;
                            winterFlowRequestManager.WinterFlowResponseEngine = winterFlowJavaJSON;
                            winterFlowRequestManager.WinterFlowThreadListener = 1;
                            if (winterFlowJavaJSON.WinterFlowTransactionManagerStrategy.WinterFlowArrayNetwork(winterFlowRequestManager) == winterFlowListenerJava) {
                                return winterFlowListenerJava;
                            }
                        } else {
                            if (i != 1) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            WinterFlowJavaJSON winterFlowJavaJSON2 = winterFlowRequestManager.WinterFlowResponseEngine;
                            winterFlowObjectSession = winterFlowRequestManager.WinterFlowSyntax;
                            String str2 = winterFlowRequestManager.WinterFlowRouterRouter;
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            winterFlowJavaJSON = winterFlowJavaJSON2;
                            str = str2;
                        }
                        WinterFlowJavaAlgorithm winterFlowJavaAlgorithm = new WinterFlowJavaAlgorithm(this, this.WinterFlowHookDataSource.WinterFlowArrayHelper(str));
                        Object WinterFlowUnitTestResponse = winterFlowObjectSession.WinterFlowUnitTestResponse(winterFlowJavaAlgorithm);
                        WinterFlowCacheRuntime.WinterFlowThreadListener(winterFlowJavaAlgorithm, null);
                        return WinterFlowUnitTestResponse;
                    }
                }
                Object WinterFlowUnitTestResponse2 = winterFlowObjectSession.WinterFlowUnitTestResponse(winterFlowJavaAlgorithm);
                WinterFlowCacheRuntime.WinterFlowThreadListener(winterFlowJavaAlgorithm, null);
                return WinterFlowUnitTestResponse2;
            } finally {
            }
            WinterFlowJavaAlgorithm winterFlowJavaAlgorithm2 = new WinterFlowJavaAlgorithm(this, this.WinterFlowHookDataSource.WinterFlowArrayHelper(str));
        } finally {
            winterFlowJavaJSON.WinterFlowHookDataSource(null);
        }
        winterFlowRequestManager = new WinterFlowRequestManager(this, winterFlowOrchestrationCompiler);
        Object obj2 = winterFlowRequestManager.WinterFlowTransactionAgent;
        WinterFlowListenerJava winterFlowListenerJava2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        i = winterFlowRequestManager.WinterFlowThreadListener;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x004d, B:13:0x0053, B:15:0x005d, B:17:0x0066, B:18:0x00a3, B:22:0x006e, B:23:0x0083, B:25:0x0089, B:26:0x008f, B:27:0x00a9, B:28:0x00b0), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x004d, B:13:0x0053, B:15:0x005d, B:17:0x0066, B:18:0x00a3, B:22:0x006e, B:23:0x0083, B:25:0x0089, B:26:0x008f, B:27:0x00a9, B:28:0x00b0), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowTransactionManagerStrategy(boolean z, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowRendererSoftware winterFlowRendererSoftware;
        int i;
        WinterFlowJavaJSON winterFlowJavaJSON;
        WinterFlowOrchestrationValidator winterFlowOrchestrationValidator = this.WinterFlowArrayNetwork;
        try {
            if (winterFlowOrchestrationCompiler instanceof WinterFlowRendererSoftware) {
                winterFlowRendererSoftware = (WinterFlowRendererSoftware) winterFlowOrchestrationCompiler;
                int i2 = winterFlowRendererSoftware.WinterFlowServerProtocol;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    winterFlowRendererSoftware.WinterFlowServerProtocol = i2 - Integer.MIN_VALUE;
                    Object obj = winterFlowRendererSoftware.WinterFlowResponseEngine;
                    i = winterFlowRendererSoftware.WinterFlowServerProtocol;
                    WinterFlowJavaJSON winterFlowJavaJSON2 = this.WinterFlowHookDataSource;
                    if (i != 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        winterFlowRendererSoftware.WinterFlowSyntax = winterFlowJavaJSON2;
                        winterFlowRendererSoftware.WinterFlowRouterRouter = z;
                        winterFlowRendererSoftware.WinterFlowServerProtocol = 1;
                        Object WinterFlowArrayNetwork = winterFlowJavaJSON2.WinterFlowTransactionManagerStrategy.WinterFlowArrayNetwork(winterFlowRendererSoftware);
                        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                        if (WinterFlowArrayNetwork == winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                        winterFlowJavaJSON = winterFlowJavaJSON2;
                    } else {
                        if (i != 1) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = winterFlowRendererSoftware.WinterFlowRouterRouter;
                        winterFlowJavaJSON = winterFlowRendererSoftware.WinterFlowSyntax;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    }
                    if (!winterFlowOrchestrationValidator.isEmpty()) {
                        throw new IllegalStateException("Not in a transaction");
                    }
                    WinterFlowViewFramework winterFlowViewFramework = (WinterFlowViewFramework) WinterFlowEventEmitterNode.WinterFlowBandwidth(winterFlowOrchestrationValidator);
                    if (z) {
                        winterFlowViewFramework.getClass();
                        if (winterFlowOrchestrationValidator.isEmpty()) {
                            WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowJavaJSON2, "END TRANSACTION");
                        } else {
                            WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowJavaJSON2, "RELEASE SAVEPOINT '" + winterFlowViewFramework.WinterFlowRouterStructure + '\'');
                        }
                    } else if (winterFlowOrchestrationValidator.isEmpty()) {
                        WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowJavaJSON2, "ROLLBACK TRANSACTION");
                    } else {
                        WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowJavaJSON2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + winterFlowViewFramework.WinterFlowRouterStructure + '\'');
                    }
                    WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                    winterFlowJavaJSON.WinterFlowHookDataSource(null);
                    return winterFlowAlgorithmSession;
                }
            }
            if (!winterFlowOrchestrationValidator.isEmpty()) {
            }
        } catch (Throwable th) {
            winterFlowJavaJSON.WinterFlowHookDataSource(null);
            throw th;
        }
        winterFlowRendererSoftware = new WinterFlowRendererSoftware(this, winterFlowOrchestrationCompiler);
        Object obj2 = winterFlowRendererSoftware.WinterFlowResponseEngine;
        i = winterFlowRendererSoftware.WinterFlowServerProtocol;
        WinterFlowJavaJSON winterFlowJavaJSON22 = this.WinterFlowHookDataSource;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x006b, code lost:
    
        if (WinterFlowVariableVersionControl(r11, r0) == r8) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowUnitTestResponse(WinterFlowAdapter winterFlowAdapter, WinterFlowEventEvent winterFlowEventEvent, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowServerTool winterFlowServerTool;
        Object obj;
        int i;
        Object obj2;
        SQLException e;
        Throwable th;
        int i2;
        try {
            if (winterFlowOrchestrationCompiler instanceof WinterFlowServerTool) {
                winterFlowServerTool = (WinterFlowServerTool) winterFlowOrchestrationCompiler;
                int i3 = winterFlowServerTool.WinterFlowThreadListener;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    winterFlowServerTool.WinterFlowThreadListener = i3 - Integer.MIN_VALUE;
                    obj = winterFlowServerTool.WinterFlowTransactionAgent;
                    i = winterFlowServerTool.WinterFlowThreadListener;
                    obj2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                    if (i != 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        if (winterFlowAdapter == null) {
                            winterFlowAdapter = WinterFlowAdapter.WinterFlowVariableVersionControl;
                        }
                        winterFlowServerTool.WinterFlowRouterRouter = winterFlowEventEvent;
                        winterFlowServerTool.WinterFlowThreadListener = 1;
                    } else if (i == 1) {
                        winterFlowEventEvent = (WinterFlowEventEvent) winterFlowServerTool.WinterFlowRouterRouter;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    } else {
                        if (i == 2) {
                            i2 = winterFlowServerTool.WinterFlowResponseEngine;
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            boolean z = i2 != 0;
                            winterFlowServerTool.WinterFlowRouterRouter = obj;
                            winterFlowServerTool.WinterFlowThreadListener = 3;
                            return WinterFlowTransactionManagerStrategy(z, winterFlowServerTool) != obj2 ? obj2 : obj;
                        }
                        if (i == 3 || i == 4) {
                            Object obj3 = winterFlowServerTool.WinterFlowRouterRouter;
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            return obj3;
                        }
                        if (i != 5) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = winterFlowServerTool.WinterFlowSyntax;
                        th = (Throwable) winterFlowServerTool.WinterFlowRouterRouter;
                        try {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            throw th;
                        } catch (SQLException e2) {
                            e = e2;
                            if (th != null) {
                            }
                        }
                    }
                    WinterFlowDatabaseSchemaModule winterFlowDatabaseSchemaModule = new WinterFlowDatabaseSchemaModule(1, this);
                    winterFlowServerTool.WinterFlowRouterRouter = null;
                    winterFlowServerTool.WinterFlowResponseEngine = 1;
                    winterFlowServerTool.WinterFlowThreadListener = 2;
                    obj = winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowDatabaseSchemaModule, winterFlowServerTool);
                    if (obj != obj2) {
                        i2 = 1;
                        if (i2 != 0) {
                        }
                        winterFlowServerTool.WinterFlowRouterRouter = obj;
                        winterFlowServerTool.WinterFlowThreadListener = 3;
                        if (WinterFlowTransactionManagerStrategy(z, winterFlowServerTool) != obj2) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
            WinterFlowDatabaseSchemaModule winterFlowDatabaseSchemaModule2 = new WinterFlowDatabaseSchemaModule(1, this);
            winterFlowServerTool.WinterFlowRouterRouter = null;
            winterFlowServerTool.WinterFlowResponseEngine = 1;
            winterFlowServerTool.WinterFlowThreadListener = 2;
            obj = winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowDatabaseSchemaModule2, winterFlowServerTool);
            if (obj != obj2) {
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (Throwable th3) {
                try {
                    winterFlowServerTool.WinterFlowRouterRouter = th;
                    winterFlowServerTool.WinterFlowSyntax = th3;
                    winterFlowServerTool.WinterFlowThreadListener = 5;
                    if (WinterFlowTransactionManagerStrategy(false, winterFlowServerTool) != obj2) {
                        throw th3;
                    }
                } catch (SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th != null) {
                        throw e;
                    }
                    WinterFlowCloudStack.WinterFlowTransactionManagerStrategy(th, e);
                    throw th;
                }
            }
        }
        winterFlowServerTool = new WinterFlowServerTool(this, winterFlowOrchestrationCompiler);
        obj = winterFlowServerTool.WinterFlowTransactionAgent;
        i = winterFlowServerTool.WinterFlowThreadListener;
        obj2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:11:0x004d, B:13:0x0055, B:18:0x0060, B:19:0x008e, B:23:0x0068, B:24:0x006d, B:25:0x006e, B:26:0x0074, B:27:0x007a), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:11:0x004d, B:13:0x0055, B:18:0x0060, B:19:0x008e, B:23:0x0068, B:24:0x006d, B:25:0x006e, B:26:0x0074, B:27:0x007a), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowVariableVersionControl(WinterFlowAdapter winterFlowAdapter, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowBandwidthSyntax winterFlowBandwidthSyntax;
        int i;
        WinterFlowJavaJSON winterFlowJavaJSON;
        WinterFlowOrchestrationValidator winterFlowOrchestrationValidator = this.WinterFlowArrayNetwork;
        try {
            if (winterFlowOrchestrationCompiler instanceof WinterFlowBandwidthSyntax) {
                winterFlowBandwidthSyntax = (WinterFlowBandwidthSyntax) winterFlowOrchestrationCompiler;
                int i2 = winterFlowBandwidthSyntax.WinterFlowServerProtocol;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    winterFlowBandwidthSyntax.WinterFlowServerProtocol = i2 - Integer.MIN_VALUE;
                    Object obj = winterFlowBandwidthSyntax.WinterFlowResponseEngine;
                    i = winterFlowBandwidthSyntax.WinterFlowServerProtocol;
                    WinterFlowJavaJSON winterFlowJavaJSON2 = this.WinterFlowHookDataSource;
                    if (i != 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        winterFlowBandwidthSyntax.WinterFlowRouterRouter = winterFlowAdapter;
                        winterFlowBandwidthSyntax.WinterFlowSyntax = winterFlowJavaJSON2;
                        winterFlowBandwidthSyntax.WinterFlowServerProtocol = 1;
                        Object WinterFlowArrayNetwork = winterFlowJavaJSON2.WinterFlowTransactionManagerStrategy.WinterFlowArrayNetwork(winterFlowBandwidthSyntax);
                        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                        if (WinterFlowArrayNetwork == winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                        winterFlowJavaJSON = winterFlowJavaJSON2;
                    } else {
                        if (i != 1) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        WinterFlowJavaJSON winterFlowJavaJSON3 = winterFlowBandwidthSyntax.WinterFlowSyntax;
                        WinterFlowAdapter winterFlowAdapter2 = winterFlowBandwidthSyntax.WinterFlowRouterRouter;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        winterFlowJavaJSON = winterFlowJavaJSON3;
                        winterFlowAdapter = winterFlowAdapter2;
                    }
                    int i3 = winterFlowOrchestrationValidator.WinterFlowUnitTestResponse;
                    if (winterFlowOrchestrationValidator.isEmpty()) {
                        WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowJavaJSON2, "SAVEPOINT '" + i3 + '\'');
                    } else {
                        int ordinal = winterFlowAdapter.ordinal();
                        if (ordinal == 0) {
                            WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowJavaJSON2, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowJavaJSON2, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                throw new WinterFlowServerSystem();
                            }
                            WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowJavaJSON2, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                    }
                    winterFlowOrchestrationValidator.addLast(new WinterFlowViewFramework(i3));
                    WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                    winterFlowJavaJSON.WinterFlowHookDataSource(null);
                    return winterFlowAlgorithmSession;
                }
            }
            int i32 = winterFlowOrchestrationValidator.WinterFlowUnitTestResponse;
            if (winterFlowOrchestrationValidator.isEmpty()) {
            }
            winterFlowOrchestrationValidator.addLast(new WinterFlowViewFramework(i32));
            WinterFlowAlgorithmSession winterFlowAlgorithmSession2 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            winterFlowJavaJSON.WinterFlowHookDataSource(null);
            return winterFlowAlgorithmSession2;
        } catch (Throwable th) {
            winterFlowJavaJSON.WinterFlowHookDataSource(null);
            throw th;
        }
        winterFlowBandwidthSyntax = new WinterFlowBandwidthSyntax(this, winterFlowOrchestrationCompiler);
        Object obj2 = winterFlowBandwidthSyntax.WinterFlowResponseEngine;
        i = winterFlowBandwidthSyntax.WinterFlowServerProtocol;
        WinterFlowJavaJSON winterFlowJavaJSON22 = this.WinterFlowHookDataSource;
        if (i != 0) {
        }
    }
}
