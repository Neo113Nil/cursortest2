package com.google.android.datatransport;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueueManager {
    public final int WinterFlowArrayNetwork;
    public final Set WinterFlowCacheManagerAgent;
    public final Set WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;
    public final WinterFlowInterfaceScript WinterFlowTransactionManagerStrategy;
    public final Set WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowQueueManager(String str, Set set, Set set2, int i, int i2, WinterFlowInterfaceScript winterFlowInterfaceScript, Set set3) {
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = Collections.unmodifiableSet(set);
        this.WinterFlowCacheManagerAgent = Collections.unmodifiableSet(set2);
        this.WinterFlowArrayNetwork = i;
        this.WinterFlowVariableVersionControl = i2;
        this.WinterFlowTransactionManagerStrategy = winterFlowInterfaceScript;
        this.WinterFlowUnitTestResponse = Collections.unmodifiableSet(set3);
    }

    public static WinterFlowQueueManager WinterFlowHookDataSource(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(WinterFlowValidatorProcess.WinterFlowRouterStructure(cls));
        for (Class cls2 : clsArr) {
            WinterFlowInvokerComponent.WinterFlowServiceUtility(cls2, "Null interface");
            hashSet.add(WinterFlowValidatorProcess.WinterFlowRouterStructure(cls2));
        }
        return new WinterFlowQueueManager(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new WinterFlowWorkerTool(1, obj), hashSet3);
    }

    public static WinterFlowProxySubsystem WinterFlowRouterStructure(WinterFlowValidatorProcess winterFlowValidatorProcess) {
        return new WinterFlowProxySubsystem(winterFlowValidatorProcess, new WinterFlowValidatorProcess[0]);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.WinterFlowHookDataSource.toArray()) + ">{" + this.WinterFlowArrayNetwork + ", type=" + this.WinterFlowVariableVersionControl + ", deps=" + Arrays.toString(this.WinterFlowCacheManagerAgent.toArray()) + "}";
    }
}
