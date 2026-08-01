package com.google.android.datatransport;

import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowTransactionVariable {
    public final WinterFlowSchedulerProtocol WinterFlowRouterStructure = new WinterFlowSchedulerProtocol();

    public final AutoCloseable WinterFlowCacheManagerAgent(String str) {
        AutoCloseable autoCloseable;
        WinterFlowSchedulerProtocol winterFlowSchedulerProtocol = this.WinterFlowRouterStructure;
        synchronized (winterFlowSchedulerProtocol.WinterFlowRouterStructure) {
            autoCloseable = (AutoCloseable) winterFlowSchedulerProtocol.WinterFlowHookDataSource.get(str);
        }
        return autoCloseable;
    }

    public final void WinterFlowHookDataSource() {
        WinterFlowSchedulerProtocol winterFlowSchedulerProtocol = this.WinterFlowRouterStructure;
        if (!winterFlowSchedulerProtocol.WinterFlowArrayNetwork) {
            winterFlowSchedulerProtocol.WinterFlowArrayNetwork = true;
            synchronized (winterFlowSchedulerProtocol.WinterFlowRouterStructure) {
                try {
                    Iterator it = winterFlowSchedulerProtocol.WinterFlowHookDataSource.values().iterator();
                    while (it.hasNext()) {
                        WinterFlowSchedulerProtocol.WinterFlowRouterStructure((AutoCloseable) it.next());
                    }
                    Iterator it2 = winterFlowSchedulerProtocol.WinterFlowCacheManagerAgent.iterator();
                    while (it2.hasNext()) {
                        WinterFlowSchedulerProtocol.WinterFlowRouterStructure((AutoCloseable) it2.next());
                    }
                    winterFlowSchedulerProtocol.WinterFlowCacheManagerAgent.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        WinterFlowArrayNetwork();
    }

    public final void WinterFlowRouterStructure(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        WinterFlowSchedulerProtocol winterFlowSchedulerProtocol = this.WinterFlowRouterStructure;
        if (winterFlowSchedulerProtocol.WinterFlowArrayNetwork) {
            WinterFlowSchedulerProtocol.WinterFlowRouterStructure(autoCloseable);
            return;
        }
        synchronized (winterFlowSchedulerProtocol.WinterFlowRouterStructure) {
            autoCloseable2 = (AutoCloseable) winterFlowSchedulerProtocol.WinterFlowHookDataSource.put(str, autoCloseable);
        }
        WinterFlowSchedulerProtocol.WinterFlowRouterStructure(autoCloseable2);
    }

    public void WinterFlowArrayNetwork() {
    }
}
