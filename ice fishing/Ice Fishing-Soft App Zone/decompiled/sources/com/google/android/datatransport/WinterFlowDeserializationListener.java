package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowDeserializationListener implements WinterFlowObjectUI {
    public final /* synthetic */ WinterFlowThreadPoolGateway WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowWorkerTransaction WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowObjectHandler WinterFlowUnitTestResponse;
    public final /* synthetic */ WinterFlowObjectLayer WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowDeserializationListener(WinterFlowObjectLayer winterFlowObjectLayer, WinterFlowWorkerTransaction winterFlowWorkerTransaction, WinterFlowObjectHandler winterFlowObjectHandler, WinterFlowThreadPoolGateway winterFlowThreadPoolGateway) {
        this.WinterFlowVariableVersionControl = winterFlowObjectLayer;
        this.WinterFlowTransactionManagerStrategy = winterFlowWorkerTransaction;
        this.WinterFlowUnitTestResponse = winterFlowObjectHandler;
        this.WinterFlowRouterRouter = winterFlowThreadPoolGateway;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer;
        Object obj;
        long j = this.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure;
        float WinterFlowRouterRouter = this.WinterFlowUnitTestResponse.WinterFlowRouterRouter();
        WinterFlowArrayStructure winterFlowArrayStructure = (WinterFlowArrayStructure) this.WinterFlowRouterRouter.getValue();
        WinterFlowObjectLayer winterFlowObjectLayer = this.WinterFlowVariableVersionControl;
        winterFlowObjectLayer.getClass();
        winterFlowArrayStructure.getClass();
        WinterFlowHandlerPlatform winterFlowHandlerPlatform = winterFlowObjectLayer.WinterFlowBatchUI;
        Iterator it = ((Iterable) winterFlowHandlerPlatform.getValue()).iterator();
        while (true) {
            winterFlowTransactionManagerLayer = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((WinterFlowWorkerTransaction) obj).WinterFlowRouterStructure == j) {
                break;
            }
        }
        WinterFlowWorkerTransaction winterFlowWorkerTransaction = (WinterFlowWorkerTransaction) obj;
        if (winterFlowWorkerTransaction != null) {
            long j2 = winterFlowWorkerTransaction.WinterFlowVariableVersionControl;
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            if (Float.intBitsToFloat((int) (j2 & 4294967295L)) < WinterFlowRouterRouter - 350.0f || intBitsToFloat < winterFlowArrayStructure.WinterFlowRouterStructure || intBitsToFloat > winterFlowArrayStructure.WinterFlowHookDataSource) {
                Iterable<WinterFlowWorkerTransaction> iterable = (Iterable) winterFlowHandlerPlatform.getValue();
                ArrayList arrayList = new ArrayList(WinterFlowModuleThread.WinterFlowModuleAgent(iterable, 10));
                for (WinterFlowWorkerTransaction winterFlowWorkerTransaction2 : iterable) {
                    if (winterFlowWorkerTransaction2.WinterFlowRouterStructure == j) {
                        winterFlowWorkerTransaction2 = WinterFlowWorkerTransaction.WinterFlowRouterStructure(winterFlowWorkerTransaction2, winterFlowWorkerTransaction2.WinterFlowArrayNetwork);
                    }
                    arrayList.add(winterFlowWorkerTransaction2);
                }
                winterFlowHandlerPlatform.WinterFlowTransactionAgent(null, arrayList);
            } else {
                WinterFlowCacheRuntime.WinterFlowStrategyTool(WinterFlowHandlerWebsocket.WinterFlowConsumerUserManager(winterFlowObjectLayer), null, new WinterFlowModuleStack(winterFlowObjectLayer, winterFlowWorkerTransaction, winterFlowTransactionManagerLayer, 13), 3);
            }
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }
}
