package com.google.android.datatransport;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLibraryUtility {
    public final Set WinterFlowCacheManagerAgent;
    public final Set WinterFlowHookDataSource;
    public final Map WinterFlowRouterStructure;

    public WinterFlowLibraryUtility(Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.WinterFlowRouterStructure = map;
        this.WinterFlowHookDataSource = abstractSet;
        this.WinterFlowCacheManagerAgent = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowLibraryUtility)) {
            return false;
        }
        WinterFlowLibraryUtility winterFlowLibraryUtility = (WinterFlowLibraryUtility) obj;
        if (!this.WinterFlowRouterStructure.equals(winterFlowLibraryUtility.WinterFlowRouterStructure) || !this.WinterFlowHookDataSource.equals(winterFlowLibraryUtility.WinterFlowHookDataSource)) {
            return false;
        }
        Set set2 = this.WinterFlowCacheManagerAgent;
        if (set2 == null || (set = winterFlowLibraryUtility.WinterFlowCacheManagerAgent) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.WinterFlowHookDataSource.hashCode() + ((this.WinterFlowRouterStructure.hashCode() - 2060691675) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = 'caught_fish',\n            |    columns = {");
        sb.append(WinterFlowConfigurationException.WinterFlowArrayNetwork(WinterFlowSerializerUtility.WinterFlowUIThreadPool(this.WinterFlowRouterStructure.values(), new WinterFlowClassSystem(10))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(WinterFlowConfigurationException.WinterFlowArrayNetwork(this.WinterFlowHookDataSource));
        sb.append("\n            |    indices = {");
        Set set = this.WinterFlowCacheManagerAgent;
        sb.append(WinterFlowConfigurationException.WinterFlowArrayNetwork(set != null ? WinterFlowSerializerUtility.WinterFlowUIThreadPool(set, new WinterFlowClassSystem(11)) : WinterFlowDataSourceEngine.WinterFlowVariableVersionControl));
        sb.append("\n            |}\n        ");
        return WinterFlowEventUtility.WinterFlowSerializerStructure(sb.toString());
    }
}
