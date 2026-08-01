package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFunctionSystem extends WinterFlowFrameworkController implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowDeploymentException WinterFlowRouterRouter;
    public int WinterFlowTransactionManagerStrategy;
    public /* synthetic */ Object WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowFunctionSystem(WinterFlowDeploymentException winterFlowDeploymentException, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(winterFlowTransactionManagerLayer);
        this.WinterFlowRouterRouter = winterFlowDeploymentException;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowFunctionSystem winterFlowFunctionSystem = new WinterFlowFunctionSystem(this.WinterFlowRouterRouter, winterFlowTransactionManagerLayer);
        winterFlowFunctionSystem.WinterFlowUnitTestResponse = obj;
        return winterFlowFunctionSystem;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (r14 != r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0037, code lost:
    
        if (r14 == r6) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004c -> B:6:0x004f). Please report as a decompilation issue!!! */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowRouterRefactoring winterFlowRouterRefactoring;
        Object obj2;
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowJSONSerializer winterFlowJSONSerializer = WinterFlowJSONSerializer.WinterFlowTransactionManagerStrategy;
        WinterFlowDeploymentException winterFlowDeploymentException = this.WinterFlowRouterRouter;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            winterFlowRouterRefactoring = (WinterFlowRouterRefactoring) this.WinterFlowUnitTestResponse;
            this.WinterFlowUnitTestResponse = winterFlowRouterRefactoring;
            this.WinterFlowTransactionManagerStrategy = 1;
            obj = WinterFlowMicroserviceWidget.WinterFlowRouterStructure(winterFlowRouterRefactoring, winterFlowJSONSerializer, this);
        } else if (i == 1) {
            winterFlowRouterRefactoring = (WinterFlowRouterRefactoring) this.WinterFlowUnitTestResponse;
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        } else {
            if (i != 2) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            winterFlowRouterRefactoring = (WinterFlowRouterRefactoring) this.WinterFlowUnitTestResponse;
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            List list = ((WinterFlowCacheManagerUtility) obj).WinterFlowRouterStructure;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Object obj3 = list.get(i3);
                if (((WinterFlowObjectSystem) obj3).WinterFlowArrayNetwork) {
                    arrayList.add(obj3);
                }
            }
            int size2 = arrayList.size();
            while (true) {
                if (i2 >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i2);
                if (WinterFlowServerManager.WinterFlowConcurrencyThread(((WinterFlowObjectSystem) obj2).WinterFlowRouterStructure, winterFlowDeploymentException.WinterFlowRouterRouter)) {
                    break;
                }
                i2++;
            }
            WinterFlowObjectSystem winterFlowObjectSystem = (WinterFlowObjectSystem) obj2;
            if (winterFlowObjectSystem == null) {
                winterFlowObjectSystem = (WinterFlowObjectSystem) WinterFlowSerializerUtility.WinterFlowPipelineSoftware(arrayList);
            }
            if (winterFlowObjectSystem != null) {
                winterFlowDeploymentException.WinterFlowRouterRouter = winterFlowObjectSystem.WinterFlowRouterStructure;
                winterFlowDeploymentException.WinterFlowHookDataSource = winterFlowObjectSystem.WinterFlowCacheManagerAgent;
            }
            if (arrayList.isEmpty()) {
                winterFlowDeploymentException.WinterFlowRouterRouter = -1L;
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            }
            this.WinterFlowUnitTestResponse = winterFlowRouterRefactoring;
            this.WinterFlowTransactionManagerStrategy = 2;
            obj = winterFlowRouterRefactoring.WinterFlowRouterStructure(winterFlowJSONSerializer, this);
        }
        WinterFlowObjectSystem winterFlowObjectSystem2 = (WinterFlowObjectSystem) obj;
        winterFlowDeploymentException.WinterFlowRouterRouter = winterFlowObjectSystem2.WinterFlowRouterStructure;
        winterFlowDeploymentException.WinterFlowHookDataSource = winterFlowObjectSystem2.WinterFlowCacheManagerAgent;
        this.WinterFlowUnitTestResponse = winterFlowRouterRefactoring;
        this.WinterFlowTransactionManagerStrategy = 2;
        obj = winterFlowRouterRefactoring.WinterFlowRouterStructure(winterFlowJSONSerializer, this);
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowFunctionSystem) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowRouterRefactoring) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
