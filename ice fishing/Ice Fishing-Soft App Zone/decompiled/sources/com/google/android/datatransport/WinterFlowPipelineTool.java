package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowPipelineTool extends WinterFlowFrameworkController implements WinterFlowEventEvent {
    public /* synthetic */ Object WinterFlowResponseEngine;
    public int WinterFlowRouterRouter;
    public int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowManagerThreadPool WinterFlowTransactionAgent;
    public int WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowPipelineTool(WinterFlowManagerThreadPool winterFlowManagerThreadPool, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(winterFlowTransactionManagerLayer);
        this.WinterFlowTransactionAgent = winterFlowManagerThreadPool;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowPipelineTool winterFlowPipelineTool = new WinterFlowPipelineTool(this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer);
        winterFlowPipelineTool.WinterFlowResponseEngine = obj;
        return winterFlowPipelineTool;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowAPIProcess winterFlowAPIProcess;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        WinterFlowManagerThreadPool winterFlowManagerThreadPool = this.WinterFlowTransactionAgent;
        WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = winterFlowManagerThreadPool.WinterFlowVariableVersionControl;
        WinterFlowTransactionStructure winterFlowTransactionStructure = winterFlowManagerThreadPool.WinterFlowUnitTestResponse;
        int i6 = this.WinterFlowSyntax;
        if (i6 == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            winterFlowAPIProcess = (WinterFlowAPIProcess) this.WinterFlowResponseEngine;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.WinterFlowRouterRouter;
            i2 = this.WinterFlowUnitTestResponse;
            i3 = this.WinterFlowTransactionManagerStrategy;
            winterFlowAPIProcess = (WinterFlowAPIProcess) this.WinterFlowResponseEngine;
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        }
        if (i3 >= Math.min(winterFlowManagerThreadPool.WinterFlowRouterRouter + 10, winterFlowTransactionStructure.WinterFlowHookDataSource)) {
            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
        int i7 = i3 + 1;
        int WinterFlowHookDataSource = winterFlowTransactionStructure.WinterFlowHookDataSource(i3);
        switch (WinterFlowHookDataSource) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                str = "up";
                break;
            case 1:
                Object WinterFlowTransactionManagerStrategy = winterFlowMicroserviceFunction.WinterFlowTransactionManagerStrategy(i2);
                i2++;
                str = "down " + WinterFlowTransactionManagerStrategy;
                break;
            case 2:
                str = "remove " + winterFlowTransactionStructure.WinterFlowHookDataSource(i7) + ' ' + winterFlowTransactionStructure.WinterFlowHookDataSource(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                str = "move " + winterFlowTransactionStructure.WinterFlowHookDataSource(i7) + ' ' + winterFlowTransactionStructure.WinterFlowHookDataSource(i3 + 2) + ' ' + winterFlowTransactionStructure.WinterFlowHookDataSource(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                str = "clear";
                break;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                i4 = i3 + 2;
                int WinterFlowHookDataSource2 = winterFlowTransactionStructure.WinterFlowHookDataSource(i7);
                i5 = i2 + 1;
                str2 = "insertBottomUp " + WinterFlowHookDataSource2 + ' ' + winterFlowMicroserviceFunction.WinterFlowTransactionManagerStrategy(i2);
                int i8 = i4;
                str = str2;
                i7 = i8;
                i2 = i5;
                break;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                i4 = i3 + 2;
                int WinterFlowHookDataSource3 = winterFlowTransactionStructure.WinterFlowHookDataSource(i7);
                i5 = i2 + 1;
                str2 = "insertTopDown " + WinterFlowHookDataSource3 + ' ' + winterFlowMicroserviceFunction.WinterFlowTransactionManagerStrategy(i2);
                int i82 = i4;
                str = str2;
                i7 = i82;
                i2 = i5;
                break;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                Object WinterFlowTransactionManagerStrategy2 = winterFlowMicroserviceFunction.WinterFlowTransactionManagerStrategy(i2);
                WinterFlowTransactionManagerStrategy2.getClass();
                WinterFlowUnitTestLibrary.WinterFlowTransactionAgent(2, WinterFlowTransactionManagerStrategy2);
                i2 += 2;
                str = "apply " + ((WinterFlowEventEvent) WinterFlowTransactionManagerStrategy2);
                break;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                str = "reuse " + winterFlowManagerThreadPool.WinterFlowTransactionManagerStrategy.WinterFlowTransactionManagerStrategy(i);
                i++;
                break;
            case 9:
                str = "recompose pending";
                break;
            default:
                str = WinterFlowResolverBackend.WinterFlowSyntax("unknown op: ", WinterFlowHookDataSource);
                break;
        }
        this.WinterFlowResponseEngine = winterFlowAPIProcess;
        this.WinterFlowTransactionManagerStrategy = i7;
        this.WinterFlowUnitTestResponse = i2;
        this.WinterFlowRouterRouter = i;
        this.WinterFlowSyntax = 1;
        winterFlowAPIProcess.WinterFlowHookDataSource(i3 + ": " + str, this);
        return WinterFlowListenerJava.WinterFlowVariableVersionControl;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowPipelineTool) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAPIProcess) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
