package com.google.android.datatransport;

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowProxyCompiler {
    public static final HashMap WinterFlowHookDataSource;
    public static final SparseArray WinterFlowRouterStructure = new SparseArray();

    static {
        HashMap hashMap = new HashMap();
        WinterFlowHookDataSource = hashMap;
        hashMap.put(WinterFlowMicroserviceSubsystem.WinterFlowVariableVersionControl, 0);
        hashMap.put(WinterFlowMicroserviceSubsystem.WinterFlowTransactionManagerStrategy, 1);
        hashMap.put(WinterFlowMicroserviceSubsystem.WinterFlowUnitTestResponse, 2);
        for (WinterFlowMicroserviceSubsystem winterFlowMicroserviceSubsystem : hashMap.keySet()) {
            WinterFlowRouterStructure.append(((Integer) WinterFlowHookDataSource.get(winterFlowMicroserviceSubsystem)).intValue(), winterFlowMicroserviceSubsystem);
        }
    }

    public static WinterFlowMicroserviceSubsystem WinterFlowHookDataSource(int i) {
        WinterFlowMicroserviceSubsystem winterFlowMicroserviceSubsystem = (WinterFlowMicroserviceSubsystem) WinterFlowRouterStructure.get(i);
        if (winterFlowMicroserviceSubsystem != null) {
            return winterFlowMicroserviceSubsystem;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject(WinterFlowResolverBackend.WinterFlowSyntax("Unknown Priority for value ", i));
        return null;
    }

    public static int WinterFlowRouterStructure(WinterFlowMicroserviceSubsystem winterFlowMicroserviceSubsystem) {
        Integer num = (Integer) WinterFlowHookDataSource.get(winterFlowMicroserviceSubsystem);
        if (num != null) {
            return num.intValue();
        }
        WinterFlowCompilerMechanism.WinterFlowRouterRouter(winterFlowMicroserviceSubsystem, "PriorityMapping is missing known Priority value ");
        return 0;
    }
}
