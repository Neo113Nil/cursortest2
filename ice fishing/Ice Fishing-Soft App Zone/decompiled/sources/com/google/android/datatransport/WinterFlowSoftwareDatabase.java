package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSoftwareDatabase implements WinterFlowInvokerPackage {
    public final WinterFlowThreadListener WinterFlowArrayNetwork;
    public final WinterFlowThreadListener WinterFlowCacheManagerAgent;
    public final String WinterFlowHookDataSource;

    public WinterFlowSoftwareDatabase(String str) {
        this.WinterFlowHookDataSource = str;
        this.WinterFlowCacheManagerAgent = new WinterFlowThreadListener(str);
        this.WinterFlowArrayNetwork = new WinterFlowThreadListener(str.concat(" maximum"));
    }

    public final String toString() {
        return this.WinterFlowHookDataSource;
    }
}
