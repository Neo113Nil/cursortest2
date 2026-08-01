package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.ColdActivity;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUserManagerDatabase implements WinterFlowObjectUI {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowUserManagerDatabase(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ColdActivity) obj).WinterFlowTransactionManagerStrategy();
            case 1:
                return ((ColdActivity) obj).WinterFlowVariableVersionControl();
            default:
                ArrayList arrayList = ((WinterFlowBackendInvoker) obj).WinterFlowRouterStructure;
                WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = new WinterFlowDatabaseSchemaStructure(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    WinterFlowNodeConcurrency winterFlowNodeConcurrency = (WinterFlowNodeConcurrency) arrayList.get(i2);
                    Object obj2 = winterFlowNodeConcurrency.WinterFlowHookDataSource;
                    int i3 = winterFlowNodeConcurrency.WinterFlowRouterStructure;
                    Object winterFlowVersionSyntax = obj2 != null ? new WinterFlowVersionSyntax(Integer.valueOf(i3), winterFlowNodeConcurrency.WinterFlowHookDataSource) : Integer.valueOf(i3);
                    int WinterFlowTransactionManagerStrategy = winterFlowDatabaseSchemaStructure.WinterFlowTransactionManagerStrategy(winterFlowVersionSyntax);
                    boolean z = WinterFlowTransactionManagerStrategy < 0;
                    Object obj3 = z ? null : winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent[WinterFlowTransactionManagerStrategy];
                    if (obj3 != null) {
                        if (obj3 instanceof WinterFlowMicroserviceFunction) {
                            WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = (WinterFlowMicroserviceFunction) obj3;
                            winterFlowMicroserviceFunction.WinterFlowRouterStructure(winterFlowNodeConcurrency);
                            winterFlowNodeConcurrency = winterFlowMicroserviceFunction;
                        } else {
                            Object[] objArr = WinterFlowEventMicroservice.WinterFlowRouterStructure;
                            WinterFlowMicroserviceFunction winterFlowMicroserviceFunction2 = new WinterFlowMicroserviceFunction(2);
                            winterFlowMicroserviceFunction2.WinterFlowRouterStructure(obj3);
                            winterFlowMicroserviceFunction2.WinterFlowRouterStructure(winterFlowNodeConcurrency);
                            winterFlowNodeConcurrency = winterFlowMicroserviceFunction2;
                        }
                    }
                    if (z) {
                        int i4 = ~WinterFlowTransactionManagerStrategy;
                        winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource[i4] = winterFlowVersionSyntax;
                        winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent[i4] = winterFlowNodeConcurrency;
                    } else {
                        winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent[WinterFlowTransactionManagerStrategy] = winterFlowNodeConcurrency;
                    }
                }
                return new WinterFlowRouterStrategy(winterFlowDatabaseSchemaStructure);
        }
    }
}
