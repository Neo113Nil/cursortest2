package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowStrategyThread extends WinterFlowFrameworkController implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowOrchestrationIDE WinterFlowResponseEngine;
    public int WinterFlowRouterRouter;
    public /* synthetic */ Object WinterFlowSyntax;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy = 0;
    public Object WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowStrategyThread(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, WinterFlowEventEvent winterFlowEventEvent, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = winterFlowEncryptionMicroservice;
        this.WinterFlowResponseEngine = winterFlowEventEvent;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowOrchestrationIDE winterFlowOrchestrationIDE = this.WinterFlowResponseEngine;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowStrategyThread winterFlowStrategyThread = new WinterFlowStrategyThread((WinterFlowEncryptionMicroservice) this.WinterFlowSyntax, (WinterFlowEventEvent) winterFlowOrchestrationIDE, winterFlowTransactionManagerLayer);
                winterFlowStrategyThread.WinterFlowUnitTestResponse = obj;
                return winterFlowStrategyThread;
            default:
                WinterFlowStrategyThread winterFlowStrategyThread2 = new WinterFlowStrategyThread((WinterFlowObjectUI) winterFlowOrchestrationIDE, winterFlowTransactionManagerLayer);
                winterFlowStrategyThread2.WinterFlowSyntax = obj;
                return winterFlowStrategyThread2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        if (r13 != r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
    
        if (r13 == r4) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.datatransport.WinterFlowRouterRefactoring, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0040 -> B:7:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009a -> B:23:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00af -> B:23:0x006a). Please report as a decompilation issue!!! */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowRouterRefactoring winterFlowRouterRefactoring;
        WinterFlowRouterRefactoring winterFlowRouterRefactoring2;
        WinterFlowAPIProcess winterFlowAPIProcess;
        Object WinterFlowRouterStructure;
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowOrchestrationIDE winterFlowOrchestrationIDE = this.WinterFlowResponseEngine;
        WinterFlowRouterRefactoring winterFlowRouterRefactoring3 = "call to 'resume' before 'invoke' with coroutine";
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = (WinterFlowEncryptionMicroservice) this.WinterFlowSyntax;
                int i2 = this.WinterFlowRouterRouter;
                WinterFlowJSONSerializer winterFlowJSONSerializer = WinterFlowJSONSerializer.WinterFlowUnitTestResponse;
                try {
                } catch (CancellationException e) {
                    e = e;
                    if (!WinterFlowInvokerComponent.WinterFlowSoftwareProtocol(winterFlowEncryptionMicroservice)) {
                        this.WinterFlowUnitTestResponse = winterFlowRouterRefactoring3;
                        this.WinterFlowRouterRouter = 3;
                        Object WinterFlowTransactionManagerStrategy = WinterFlowEncryptionSubsystem.WinterFlowTransactionManagerStrategy(winterFlowRouterRefactoring3, winterFlowJSONSerializer, this);
                        winterFlowRouterRefactoring2 = winterFlowRouterRefactoring3;
                        break;
                    } else {
                        throw e;
                    }
                }
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowRouterRefactoring = (WinterFlowRouterRefactoring) this.WinterFlowUnitTestResponse;
                    if (WinterFlowInvokerComponent.WinterFlowSoftwareProtocol(winterFlowEncryptionMicroservice)) {
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            WinterFlowRouterRefactoring winterFlowRouterRefactoring4 = (WinterFlowRouterRefactoring) this.WinterFlowUnitTestResponse;
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            winterFlowRouterRefactoring2 = winterFlowRouterRefactoring4;
                        } else {
                            if (i2 != 3) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            WinterFlowRouterRefactoring winterFlowRouterRefactoring5 = (WinterFlowRouterRefactoring) this.WinterFlowUnitTestResponse;
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            winterFlowRouterRefactoring2 = winterFlowRouterRefactoring5;
                        }
                        winterFlowRouterRefactoring = winterFlowRouterRefactoring2;
                        if (WinterFlowInvokerComponent.WinterFlowSoftwareProtocol(winterFlowEncryptionMicroservice)) {
                            return winterFlowAlgorithmSession;
                        }
                        try {
                        } catch (CancellationException e2) {
                            winterFlowRouterRefactoring3 = winterFlowRouterRefactoring;
                            e = e2;
                            if (!WinterFlowInvokerComponent.WinterFlowSoftwareProtocol(winterFlowEncryptionMicroservice)) {
                            }
                        }
                        this.WinterFlowUnitTestResponse = winterFlowRouterRefactoring;
                        this.WinterFlowRouterRouter = 1;
                        if (((WinterFlowEventEvent) winterFlowOrchestrationIDE).WinterFlowVariableVersionControl(winterFlowRouterRefactoring, this) != winterFlowListenerJava) {
                            winterFlowRouterRefactoring3 = winterFlowRouterRefactoring;
                            this.WinterFlowUnitTestResponse = winterFlowRouterRefactoring3;
                            this.WinterFlowRouterRouter = 2;
                            Object WinterFlowTransactionManagerStrategy2 = WinterFlowEncryptionSubsystem.WinterFlowTransactionManagerStrategy(winterFlowRouterRefactoring3, winterFlowJSONSerializer, this);
                            winterFlowRouterRefactoring2 = winterFlowRouterRefactoring3;
                            break;
                        }
                        return winterFlowListenerJava;
                    }
                    WinterFlowRouterRefactoring winterFlowRouterRefactoring6 = (WinterFlowRouterRefactoring) this.WinterFlowUnitTestResponse;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowRouterRefactoring3 = winterFlowRouterRefactoring6;
                    this.WinterFlowUnitTestResponse = winterFlowRouterRefactoring3;
                    this.WinterFlowRouterRouter = 2;
                    Object WinterFlowTransactionManagerStrategy22 = WinterFlowEncryptionSubsystem.WinterFlowTransactionManagerStrategy(winterFlowRouterRefactoring3, winterFlowJSONSerializer, this);
                    winterFlowRouterRefactoring2 = winterFlowRouterRefactoring3;
                }
            default:
                int i3 = this.WinterFlowRouterRouter;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowAPIProcess = (WinterFlowAPIProcess) this.WinterFlowSyntax;
                    WinterFlowRouterStructure = ((WinterFlowObjectUI) winterFlowOrchestrationIDE).WinterFlowRouterStructure();
                    if (WinterFlowRouterStructure != null) {
                    }
                } else {
                    if (i3 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = this.WinterFlowUnitTestResponse;
                    winterFlowAPIProcess = (WinterFlowAPIProcess) this.WinterFlowSyntax;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    if (obj2 == null) {
                        return winterFlowAlgorithmSession;
                    }
                    WinterFlowRouterStructure = ((WinterFlowObjectUI) winterFlowOrchestrationIDE).WinterFlowRouterStructure();
                    if (WinterFlowRouterStructure != null) {
                        this.WinterFlowSyntax = winterFlowAPIProcess;
                        this.WinterFlowUnitTestResponse = WinterFlowRouterStructure;
                        this.WinterFlowRouterRouter = 1;
                        winterFlowAPIProcess.WinterFlowHookDataSource(WinterFlowRouterStructure, this);
                        return winterFlowListenerJava;
                    }
                    obj2 = null;
                    if (obj2 == null) {
                    }
                    WinterFlowRouterStructure = ((WinterFlowObjectUI) winterFlowOrchestrationIDE).WinterFlowRouterStructure();
                    if (WinterFlowRouterStructure != null) {
                    }
                }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowStrategyThread) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowRouterRefactoring) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            default:
                return ((WinterFlowStrategyThread) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAPIProcess) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowStrategyThread(WinterFlowObjectUI winterFlowObjectUI, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(winterFlowTransactionManagerLayer);
        this.WinterFlowResponseEngine = winterFlowObjectUI;
    }
}
