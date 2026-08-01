package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowOrchestrationStructure extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowBandwidthObject;
    public final /* synthetic */ WinterFlowGatewaySession WinterFlowConcurrencyThread;
    public final /* synthetic */ WinterFlowServerSubsystem[] WinterFlowOrchestrationSubsystem;
    public WinterFlowGatewaySession WinterFlowResponseEngine;
    public int WinterFlowServerProtocol;
    public int WinterFlowServiceUtility;
    public final /* synthetic */ WinterFlowRequestProvider WinterFlowSingletonPlatform;
    public WinterFlowServerSubsystem[] WinterFlowSyntax;
    public int WinterFlowThreadListener;
    public WinterFlowRequestProvider WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowOrchestrationStructure(WinterFlowServerSubsystem[] winterFlowServerSubsystemArr, WinterFlowGatewaySession winterFlowGatewaySession, WinterFlowRequestProvider winterFlowRequestProvider, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowOrchestrationSubsystem = winterFlowServerSubsystemArr;
        this.WinterFlowConcurrencyThread = winterFlowGatewaySession;
        this.WinterFlowSingletonPlatform = winterFlowRequestProvider;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        return new WinterFlowOrchestrationStructure(this.WinterFlowOrchestrationSubsystem, this.WinterFlowConcurrencyThread, this.WinterFlowSingletonPlatform, winterFlowTransactionManagerLayer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r7.WinterFlowCacheManagerAgent(r6, r12, r11) == r10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0072 -> B:10:0x0073). Please report as a decompilation issue!!! */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        int length;
        int i;
        WinterFlowRequestProvider winterFlowRequestProvider;
        WinterFlowServerSubsystem[] winterFlowServerSubsystemArr;
        int i2;
        WinterFlowGatewaySession winterFlowGatewaySession;
        int i3 = this.WinterFlowBandwidthObject;
        if (i3 == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            WinterFlowServerSubsystem[] winterFlowServerSubsystemArr2 = this.WinterFlowOrchestrationSubsystem;
            length = winterFlowServerSubsystemArr2.length;
            i = 0;
            WinterFlowGatewaySession winterFlowGatewaySession2 = this.WinterFlowConcurrencyThread;
            winterFlowRequestProvider = this.WinterFlowSingletonPlatform;
            winterFlowServerSubsystemArr = winterFlowServerSubsystemArr2;
            i2 = 0;
            winterFlowGatewaySession = winterFlowGatewaySession2;
            if (i >= length) {
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            length = this.WinterFlowServiceUtility;
            i = this.WinterFlowThreadListener;
            int i4 = this.WinterFlowServerProtocol;
            winterFlowRequestProvider = this.WinterFlowTransactionAgent;
            winterFlowGatewaySession = this.WinterFlowResponseEngine;
            winterFlowServerSubsystemArr = this.WinterFlowSyntax;
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            i2 = i4;
            i++;
            if (i >= length) {
                int i5 = i2 + 1;
                int ordinal = winterFlowServerSubsystemArr[i].ordinal();
                if (ordinal != 0) {
                    WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                            return null;
                        }
                        this.WinterFlowSyntax = winterFlowServerSubsystemArr;
                        this.WinterFlowResponseEngine = winterFlowGatewaySession;
                        this.WinterFlowTransactionAgent = winterFlowRequestProvider;
                        this.WinterFlowServerProtocol = i5;
                        this.WinterFlowThreadListener = i;
                        this.WinterFlowServiceUtility = length;
                        this.WinterFlowBandwidthObject = 2;
                        if (winterFlowGatewaySession.WinterFlowArrayNetwork(winterFlowRequestProvider, i2, this) != winterFlowListenerJava) {
                            i4 = i5;
                            i2 = i4;
                        }
                        return winterFlowListenerJava;
                    }
                    this.WinterFlowSyntax = winterFlowServerSubsystemArr;
                    this.WinterFlowResponseEngine = winterFlowGatewaySession;
                    this.WinterFlowTransactionAgent = winterFlowRequestProvider;
                    this.WinterFlowServerProtocol = i5;
                    this.WinterFlowThreadListener = i;
                    this.WinterFlowServiceUtility = length;
                    this.WinterFlowBandwidthObject = 1;
                    i++;
                    if (i >= length) {
                        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                    }
                } else {
                    i2 = i5;
                    i++;
                    if (i >= length) {
                    }
                }
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowOrchestrationStructure) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowDatabaseSchemaModule) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
