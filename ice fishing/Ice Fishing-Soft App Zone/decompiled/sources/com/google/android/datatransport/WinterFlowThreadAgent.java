package com.google.android.datatransport;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadAgent {
    public final WinterFlowServiceInterface WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public WinterFlowThreadAgent(int i) {
        this.WinterFlowRouterStructure = i;
        switch (i) {
            case 1:
                this.WinterFlowHookDataSource = new WinterFlowManagerAlgorithm();
                new ConcurrentHashMap();
                new ThreadLocal();
                new WinterFlowFrameworkEntity();
                break;
            default:
                this.WinterFlowHookDataSource = new WinterFlowAlgorithmDebug(13);
                new ConcurrentHashMap();
                break;
        }
    }
}
