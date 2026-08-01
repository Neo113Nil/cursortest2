package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowServiceProviderTool {
    public final boolean WinterFlowHookDataSource;
    public final boolean WinterFlowRouterStructure;

    public WinterFlowServiceProviderTool(int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        this.WinterFlowRouterStructure = z;
        this.WinterFlowHookDataSource = z2;
    }
}
