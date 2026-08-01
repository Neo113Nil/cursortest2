package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseVersion extends WinterFlowTestingCloud {
    public final WinterFlowDecoratorVersion WinterFlowServiceUtility;
    public final WinterFlowQueueComponent WinterFlowThreadListener;

    public WinterFlowDatabaseVersion(WinterFlowQueueComponent winterFlowQueueComponent, WinterFlowDecoratorVersion winterFlowDecoratorVersion) {
        winterFlowQueueComponent.getClass();
        this.WinterFlowThreadListener = winterFlowQueueComponent;
        this.WinterFlowServiceUtility = winterFlowDecoratorVersion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowDatabaseVersion)) {
            return false;
        }
        WinterFlowDatabaseVersion winterFlowDatabaseVersion = (WinterFlowDatabaseVersion) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowThreadListener, winterFlowDatabaseVersion.WinterFlowThreadListener) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowServiceUtility, winterFlowDatabaseVersion.WinterFlowServiceUtility);
    }

    public final int hashCode() {
        int hashCode = this.WinterFlowThreadListener.hashCode() * 31;
        WinterFlowDecoratorVersion winterFlowDecoratorVersion = this.WinterFlowServiceUtility;
        return hashCode + (winterFlowDecoratorVersion == null ? 0 : winterFlowDecoratorVersion.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.WinterFlowThreadListener + ", owner=" + this.WinterFlowServiceUtility + ')';
    }
}
