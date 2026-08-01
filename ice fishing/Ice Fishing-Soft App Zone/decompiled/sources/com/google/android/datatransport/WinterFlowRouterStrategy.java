package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRouterStrategy {
    public final WinterFlowDatabaseSchemaStructure WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowRouterStrategy(WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure) {
        this.WinterFlowRouterStructure = winterFlowDatabaseSchemaStructure;
    }

    public static final WinterFlowMicroserviceFunction WinterFlowHookDataSource(WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure) {
        if (winterFlowDatabaseSchemaStructure.WinterFlowSyntax()) {
            WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = WinterFlowEventMicroservice.WinterFlowHookDataSource;
            winterFlowMicroserviceFunction.getClass();
            return winterFlowMicroserviceFunction;
        }
        WinterFlowMicroserviceFunction winterFlowMicroserviceFunction2 = new WinterFlowMicroserviceFunction();
        Object[] objArr = winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent;
        long[] jArr = winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof WinterFlowMicroserviceFunction) {
                                winterFlowMicroserviceFunction2.WinterFlowHookDataSource((WinterFlowMicroserviceFunction) obj);
                            } else {
                                obj.getClass();
                                winterFlowMicroserviceFunction2.WinterFlowRouterStructure(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return winterFlowMicroserviceFunction2;
    }

    public static final Object WinterFlowRouterStructure(WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure) {
        Object WinterFlowUnitTestResponse = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(null);
        if (WinterFlowUnitTestResponse == null) {
            return null;
        }
        if (!(WinterFlowUnitTestResponse instanceof WinterFlowMicroserviceFunction)) {
            winterFlowDatabaseSchemaStructure.WinterFlowTransactionAgent(null);
            return WinterFlowUnitTestResponse;
        }
        WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = (WinterFlowMicroserviceFunction) WinterFlowUnitTestResponse;
        if (winterFlowMicroserviceFunction.WinterFlowRouterRouter()) {
            WinterFlowCompilerMechanism.WinterFlowSyntax("List is empty.");
            return null;
        }
        int i = winterFlowMicroserviceFunction.WinterFlowHookDataSource - 1;
        Object WinterFlowTransactionManagerStrategy = winterFlowMicroserviceFunction.WinterFlowTransactionManagerStrategy(i);
        winterFlowMicroserviceFunction.WinterFlowTransactionAgent(i);
        WinterFlowTransactionManagerStrategy.getClass();
        if (winterFlowMicroserviceFunction.WinterFlowRouterRouter()) {
            winterFlowDatabaseSchemaStructure.WinterFlowTransactionAgent(null);
        }
        if (winterFlowMicroserviceFunction.WinterFlowHookDataSource == 1) {
            winterFlowDatabaseSchemaStructure.WinterFlowThreadListener(null, winterFlowMicroserviceFunction.WinterFlowVariableVersionControl());
        }
        return WinterFlowTransactionManagerStrategy;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowRouterStrategy) {
            return this.WinterFlowRouterStructure.equals(((WinterFlowRouterStrategy) obj).WinterFlowRouterStructure);
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.WinterFlowRouterStructure + ')';
    }
}
