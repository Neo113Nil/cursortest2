package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowScriptSoftware extends WinterFlowFrameworkController implements WinterFlowEventEvent {
    public /* synthetic */ Object WinterFlowResponseEngine;
    public int WinterFlowRouterRouter;
    public int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowSingletonNode WinterFlowTransactionAgent;
    public long[] WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowScriptSoftware(WinterFlowSingletonNode winterFlowSingletonNode, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(winterFlowTransactionManagerLayer);
        this.WinterFlowTransactionAgent = winterFlowSingletonNode;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowScriptSoftware winterFlowScriptSoftware = new WinterFlowScriptSoftware(this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer);
        winterFlowScriptSoftware.WinterFlowResponseEngine = obj;
        return winterFlowScriptSoftware;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00bc -> B:7:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:20:0x0093). Please report as a decompilation issue!!! */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowAPIProcess winterFlowAPIProcess;
        long[] jArr;
        int length;
        int i;
        WinterFlowAPIProcess winterFlowAPIProcess2;
        int i2;
        WinterFlowAPIProcess winterFlowAPIProcess3;
        int i3;
        WinterFlowSingletonNode winterFlowSingletonNode = this.WinterFlowTransactionAgent;
        long j = winterFlowSingletonNode.WinterFlowVariableVersionControl;
        long j2 = winterFlowSingletonNode.WinterFlowUnitTestResponse;
        long j3 = winterFlowSingletonNode.WinterFlowTransactionManagerStrategy;
        int i4 = this.WinterFlowSyntax;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i4 == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            winterFlowAPIProcess = (WinterFlowAPIProcess) this.WinterFlowResponseEngine;
            jArr = winterFlowSingletonNode.WinterFlowRouterRouter;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j3 != 0) {
                winterFlowAPIProcess2 = winterFlowAPIProcess;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j != 0) {
            }
            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
        if (i4 == 1) {
            length = this.WinterFlowRouterRouter;
            int i5 = this.WinterFlowUnitTestResponse;
            jArr = this.WinterFlowTransactionManagerStrategy;
            winterFlowAPIProcess = (WinterFlowAPIProcess) this.WinterFlowResponseEngine;
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = this.WinterFlowUnitTestResponse;
                winterFlowAPIProcess3 = (WinterFlowAPIProcess) this.WinterFlowResponseEngine;
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                i3 = i6 + 1;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        Long l = new Long(j2 + i3 + 64);
                        this.WinterFlowResponseEngine = winterFlowAPIProcess3;
                        this.WinterFlowTransactionManagerStrategy = null;
                        this.WinterFlowUnitTestResponse = i3;
                        this.WinterFlowSyntax = 3;
                        winterFlowAPIProcess3.WinterFlowHookDataSource(l, this);
                        return winterFlowListenerJava;
                    }
                    i6 = i3;
                    i3 = i6 + 1;
                    if (i3 < 64) {
                    }
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            }
            i2 = this.WinterFlowUnitTestResponse;
            winterFlowAPIProcess2 = (WinterFlowAPIProcess) this.WinterFlowResponseEngine;
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            i2++;
            if (i2 >= 64) {
                winterFlowAPIProcess = winterFlowAPIProcess2;
                if (j != 0) {
                    winterFlowAPIProcess3 = winterFlowAPIProcess;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            }
            if ((j3 & (1 << i2)) != 0) {
                Long l2 = new Long(j2 + i2);
                this.WinterFlowResponseEngine = winterFlowAPIProcess2;
                this.WinterFlowTransactionManagerStrategy = null;
                this.WinterFlowUnitTestResponse = i2;
                this.WinterFlowSyntax = 2;
                winterFlowAPIProcess2.WinterFlowHookDataSource(l2, this);
                return winterFlowListenerJava;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Long l3 = new Long(jArr[i]);
            this.WinterFlowResponseEngine = winterFlowAPIProcess;
            this.WinterFlowTransactionManagerStrategy = jArr;
            this.WinterFlowUnitTestResponse = i;
            this.WinterFlowRouterRouter = length;
            this.WinterFlowSyntax = 1;
            winterFlowAPIProcess.WinterFlowHookDataSource(l3, this);
            return winterFlowListenerJava;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowScriptSoftware) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAPIProcess) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
