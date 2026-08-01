package com.google.android.datatransport;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowInvokerEntity extends WinterFlowUIQuery {
    public int WinterFlowUnitTestResponse;

    public WinterFlowInvokerEntity(int i) {
        super(0L, false);
        this.WinterFlowUnitTestResponse = i;
    }

    public abstract WinterFlowTransactionManagerLayer WinterFlowArrayNetwork();

    public final void WinterFlowRouterRouter(Throwable th) {
        WinterFlowSoftwareException.WinterFlowSoftwareProtocol(WinterFlowArrayNetwork().getContext(), new WinterFlowServiceRuntime("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object WinterFlowTransactionAgent();

    public Throwable WinterFlowVariableVersionControl(Object obj) {
        WinterFlowSessionManagerSessionManager winterFlowSessionManagerSessionManager = obj instanceof WinterFlowSessionManagerSessionManager ? (WinterFlowSessionManagerSessionManager) obj : null;
        if (winterFlowSessionManagerSessionManager != null) {
            return winterFlowSessionManagerSessionManager.WinterFlowRouterStructure;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (com.google.android.datatransport.WinterFlowConsumerBandwidth) r5.WinterFlowConsumerUserManager(com.google.android.datatransport.WinterFlowSessionManagerProcess.WinterFlowVariableBandwidth);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            WinterFlowTransactionManagerLayer WinterFlowArrayNetwork = WinterFlowArrayNetwork();
            WinterFlowArrayNetwork.getClass();
            WinterFlowScriptHelper winterFlowScriptHelper = (WinterFlowScriptHelper) WinterFlowArrayNetwork;
            WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler = winterFlowScriptHelper.WinterFlowSyntax;
            Object obj = winterFlowScriptHelper.WinterFlowTransactionAgent;
            WinterFlowEncryptionMicroservice context = winterFlowOrchestrationCompiler.getContext();
            Object WinterFlowFrameworkTransaction = WinterFlowInvokerComponent.WinterFlowFrameworkTransaction(context, obj);
            WinterFlowConsumerBandwidth winterFlowConsumerBandwidth = null;
            WinterFlowResolverCloud WinterFlowFrameworkTransaction2 = WinterFlowFrameworkTransaction != WinterFlowInvokerComponent.WinterFlowOrchestrationSubsystem ? WinterFlowUnitTestLibrary.WinterFlowFrameworkTransaction(winterFlowOrchestrationCompiler, context, WinterFlowFrameworkTransaction) : null;
            try {
                WinterFlowEncryptionMicroservice context2 = winterFlowOrchestrationCompiler.getContext();
                Object WinterFlowTransactionAgent = WinterFlowTransactionAgent();
                Throwable WinterFlowVariableVersionControl = WinterFlowVariableVersionControl(WinterFlowTransactionAgent);
                if (WinterFlowVariableVersionControl == null) {
                    int i = this.WinterFlowUnitTestResponse;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                }
                if (winterFlowConsumerBandwidth != null && !winterFlowConsumerBandwidth.WinterFlowHookDataSource()) {
                    CancellationException WinterFlowBandwidthObject = winterFlowConsumerBandwidth.WinterFlowBandwidthObject();
                    WinterFlowHookDataSource(WinterFlowBandwidthObject);
                    winterFlowOrchestrationCompiler.WinterFlowSyntax(WinterFlowPackageProcess.WinterFlowHookDataSource(WinterFlowBandwidthObject));
                } else if (WinterFlowVariableVersionControl != null) {
                    winterFlowOrchestrationCompiler.WinterFlowSyntax(new WinterFlowDecoratorTool(WinterFlowVariableVersionControl));
                } else {
                    winterFlowOrchestrationCompiler.WinterFlowSyntax(WinterFlowUnitTestResponse(WinterFlowTransactionAgent));
                }
                if (WinterFlowFrameworkTransaction2 != null && !WinterFlowFrameworkTransaction2.WinterFlowPipelineSoftware()) {
                    return;
                }
                WinterFlowInvokerComponent.WinterFlowCacheTool(context, WinterFlowFrameworkTransaction);
            } catch (Throwable th) {
                if (WinterFlowFrameworkTransaction2 == null || WinterFlowFrameworkTransaction2.WinterFlowPipelineSoftware()) {
                    WinterFlowInvokerComponent.WinterFlowCacheTool(context, WinterFlowFrameworkTransaction);
                }
                throw th;
            }
        } catch (Throwable th2) {
            WinterFlowRouterRouter(th2);
        }
    }

    public void WinterFlowHookDataSource(CancellationException cancellationException) {
    }

    public Object WinterFlowUnitTestResponse(Object obj) {
        return obj;
    }
}
