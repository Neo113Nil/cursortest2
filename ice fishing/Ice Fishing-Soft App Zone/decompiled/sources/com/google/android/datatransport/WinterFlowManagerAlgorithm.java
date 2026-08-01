package com.google.android.datatransport;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowManagerAlgorithm implements WinterFlowServiceInterface {
    public volatile boolean WinterFlowVariableVersionControl = false;
    public final ConcurrentHashMap WinterFlowTransactionManagerStrategy = new ConcurrentHashMap();
    public final LinkedBlockingQueue WinterFlowUnitTestResponse = new LinkedBlockingQueue();

    @Override // com.google.android.datatransport.WinterFlowServiceInterface
    public final synchronized WinterFlowValidatorPipeline WinterFlowCacheManagerAgent(String str) {
        WinterFlowFrameworkObject winterFlowFrameworkObject;
        winterFlowFrameworkObject = (WinterFlowFrameworkObject) this.WinterFlowTransactionManagerStrategy.get(str);
        if (winterFlowFrameworkObject == null) {
            winterFlowFrameworkObject = new WinterFlowFrameworkObject(str, this.WinterFlowUnitTestResponse, this.WinterFlowVariableVersionControl);
            this.WinterFlowTransactionManagerStrategy.put(str, winterFlowFrameworkObject);
        }
        return winterFlowFrameworkObject;
    }
}
