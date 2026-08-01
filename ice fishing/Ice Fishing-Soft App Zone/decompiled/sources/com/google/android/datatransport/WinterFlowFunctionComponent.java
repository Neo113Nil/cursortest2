package com.google.android.datatransport;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFunctionComponent {
    public final LinkedHashMap WinterFlowRouterStructure;

    public WinterFlowFunctionComponent(int i) {
        switch (i) {
            case 1:
                this.WinterFlowRouterStructure = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.WinterFlowRouterStructure = new LinkedHashMap();
                break;
        }
    }

    public WinterFlowResponseResponse WinterFlowHookDataSource() {
        Collection values = this.WinterFlowRouterStructure.values();
        values.getClass();
        WinterFlowStrategyManager[] winterFlowStrategyManagerArr = (WinterFlowStrategyManager[]) values.toArray(new WinterFlowStrategyManager[0]);
        return new WinterFlowResponseResponse((WinterFlowStrategyManager[]) Arrays.copyOf(winterFlowStrategyManagerArr, winterFlowStrategyManagerArr.length));
    }

    public void WinterFlowRouterStructure(WinterFlowEventEmitterCacheManager winterFlowEventEmitterCacheManager, WinterFlowObjectSession winterFlowObjectSession) {
        winterFlowObjectSession.getClass();
        LinkedHashMap linkedHashMap = this.WinterFlowRouterStructure;
        if (linkedHashMap.containsKey(winterFlowEventEmitterCacheManager)) {
            WinterFlowCompilerMechanism.WinterFlowCacheManagerAgent(WinterFlowResolverBackend.WinterFlowResponseEngine("A `initializer` with the same `clazz` has already been added: ", winterFlowEventEmitterCacheManager.WinterFlowHookDataSource(), "."));
        } else {
            linkedHashMap.put(winterFlowEventEmitterCacheManager, new WinterFlowStrategyManager(winterFlowEventEmitterCacheManager, winterFlowObjectSession));
        }
    }
}
