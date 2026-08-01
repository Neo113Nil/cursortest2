package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTestingHandler extends WinterFlowFrameworkController implements WinterFlowEventEvent {
    public /* synthetic */ Object WinterFlowBandwidthObject;
    public final /* synthetic */ WinterFlowNetworkHelper WinterFlowConcurrencyThread;
    public final /* synthetic */ WinterFlowProcessorDeserialization WinterFlowOrchestrationSubsystem;
    public int WinterFlowResponseEngine;
    public long[] WinterFlowRouterRouter;
    public int WinterFlowServerProtocol;
    public int WinterFlowServiceUtility;
    public int WinterFlowSyntax;
    public long WinterFlowThreadListener;
    public int WinterFlowTransactionAgent;
    public WinterFlowNetworkHelper WinterFlowTransactionManagerStrategy;
    public WinterFlowProcessorDeserialization WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowTestingHandler(WinterFlowProcessorDeserialization winterFlowProcessorDeserialization, WinterFlowNetworkHelper winterFlowNetworkHelper, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(winterFlowTransactionManagerLayer);
        this.WinterFlowOrchestrationSubsystem = winterFlowProcessorDeserialization;
        this.WinterFlowConcurrencyThread = winterFlowNetworkHelper;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowTestingHandler winterFlowTestingHandler = new WinterFlowTestingHandler(this.WinterFlowOrchestrationSubsystem, this.WinterFlowConcurrencyThread, winterFlowTransactionManagerLayer);
        winterFlowTestingHandler.WinterFlowBandwidthObject = obj;
        return winterFlowTestingHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006d -> B:5:0x0094). Please report as a decompilation issue!!! */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowAPIProcess winterFlowAPIProcess;
        WinterFlowProcessorDeserialization winterFlowProcessorDeserialization;
        long[] jArr;
        int length;
        WinterFlowNetworkHelper winterFlowNetworkHelper;
        int i;
        long j;
        int i2 = this.WinterFlowServiceUtility;
        if (i2 == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            winterFlowAPIProcess = (WinterFlowAPIProcess) this.WinterFlowBandwidthObject;
            winterFlowProcessorDeserialization = this.WinterFlowOrchestrationSubsystem;
            jArr = winterFlowProcessorDeserialization.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure;
            length = jArr.length - 2;
            if (length >= 0) {
                winterFlowNetworkHelper = this.WinterFlowConcurrencyThread;
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
        if (i2 != 1) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.WinterFlowServerProtocol;
        int i4 = this.WinterFlowTransactionAgent;
        long j2 = this.WinterFlowThreadListener;
        int i5 = this.WinterFlowResponseEngine;
        int i6 = this.WinterFlowSyntax;
        long[] jArr2 = this.WinterFlowRouterRouter;
        WinterFlowProcessorDeserialization winterFlowProcessorDeserialization2 = this.WinterFlowUnitTestResponse;
        WinterFlowNetworkHelper winterFlowNetworkHelper2 = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAPIProcess winterFlowAPIProcess2 = (WinterFlowAPIProcess) this.WinterFlowBandwidthObject;
        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i6;
                jArr = jArr2;
                winterFlowProcessorDeserialization = winterFlowProcessorDeserialization2;
                winterFlowAPIProcess = winterFlowAPIProcess2;
                i = i5;
                winterFlowNetworkHelper = winterFlowNetworkHelper2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        winterFlowAPIProcess2 = winterFlowAPIProcess;
                        i3 = 0;
                        winterFlowProcessorDeserialization2 = winterFlowProcessorDeserialization;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        winterFlowNetworkHelper2 = winterFlowNetworkHelper;
                        i5 = i;
                        i6 = length;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i7 = (i5 << 3) + i3;
                                winterFlowNetworkHelper2.WinterFlowTransactionManagerStrategy = i7;
                                Object obj2 = winterFlowProcessorDeserialization2.WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource[i7];
                                this.WinterFlowBandwidthObject = winterFlowAPIProcess2;
                                this.WinterFlowTransactionManagerStrategy = winterFlowNetworkHelper2;
                                this.WinterFlowUnitTestResponse = winterFlowProcessorDeserialization2;
                                this.WinterFlowRouterRouter = jArr2;
                                this.WinterFlowSyntax = i6;
                                this.WinterFlowResponseEngine = i5;
                                this.WinterFlowThreadListener = j2;
                                this.WinterFlowTransactionAgent = i4;
                                this.WinterFlowServerProtocol = i3;
                                this.WinterFlowServiceUtility = 1;
                                winterFlowAPIProcess2.WinterFlowHookDataSource(obj2, this);
                                return WinterFlowListenerJava.WinterFlowVariableVersionControl;
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowTestingHandler) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAPIProcess) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
