package com.google.android.datatransport;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowListenerSystem {
    public final WinterFlowConfigurationModule WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;

    public WinterFlowListenerSystem(Set set, WinterFlowConfigurationModule winterFlowConfigurationModule) {
        this.WinterFlowRouterStructure = WinterFlowHookDataSource(set);
        this.WinterFlowHookDataSource = winterFlowConfigurationModule;
    }

    public static String WinterFlowHookDataSource(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            WinterFlowConfigurationDeserialization winterFlowConfigurationDeserialization = (WinterFlowConfigurationDeserialization) it.next();
            sb.append(winterFlowConfigurationDeserialization.WinterFlowRouterStructure);
            sb.append('/');
            sb.append(winterFlowConfigurationDeserialization.WinterFlowHookDataSource);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String WinterFlowRouterStructure() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        WinterFlowConfigurationModule winterFlowConfigurationModule = this.WinterFlowHookDataSource;
        synchronized (((HashSet) winterFlowConfigurationModule.WinterFlowTransactionManagerStrategy)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) winterFlowConfigurationModule.WinterFlowTransactionManagerStrategy);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.WinterFlowRouterStructure;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(' ');
        synchronized (((HashSet) winterFlowConfigurationModule.WinterFlowTransactionManagerStrategy)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) winterFlowConfigurationModule.WinterFlowTransactionManagerStrategy);
        }
        sb.append(WinterFlowHookDataSource(unmodifiableSet2));
        return sb.toString();
    }
}
