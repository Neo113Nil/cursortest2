package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSchedulerStack extends WinterFlowTestingCloud {
    public final WinterFlowVersionParser WinterFlowThreadListener;

    public WinterFlowSchedulerStack(WinterFlowVersionParser winterFlowVersionParser) {
        this.WinterFlowThreadListener = winterFlowVersionParser;
    }

    @Override // com.google.android.datatransport.WinterFlowTestingCloud
    public final WinterFlowVersionParser WinterFlowRouterAdapter() {
        return this.WinterFlowThreadListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WinterFlowSchedulerStack) {
            return this.WinterFlowThreadListener.equals(((WinterFlowSchedulerStack) obj).WinterFlowThreadListener);
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowThreadListener.hashCode();
    }
}
