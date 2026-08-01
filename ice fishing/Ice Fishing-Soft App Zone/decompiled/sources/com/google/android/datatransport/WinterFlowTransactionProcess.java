package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionProcess {
    public final WinterFlowInheritanceHelper WinterFlowHookDataSource;
    public final WinterFlowControllerCacheManager WinterFlowRouterStructure;

    public WinterFlowTransactionProcess(WinterFlowControllerCacheManager winterFlowControllerCacheManager, WinterFlowInheritanceHelper winterFlowInheritanceHelper) {
        this.WinterFlowRouterStructure = winterFlowControllerCacheManager;
        this.WinterFlowHookDataSource = winterFlowInheritanceHelper;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WinterFlowTransactionProcess) {
            WinterFlowTransactionProcess winterFlowTransactionProcess = (WinterFlowTransactionProcess) obj;
            if (this.WinterFlowRouterStructure != winterFlowTransactionProcess.WinterFlowRouterStructure) {
                return false;
            }
            Object obj2 = WinterFlowMicroserviceSubsystem.WinterFlowVariableVersionControl;
            if (obj2.equals(obj2) && this.WinterFlowHookDataSource.equals(winterFlowTransactionProcess.WinterFlowHookDataSource)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowHookDataSource.hashCode() ^ (((((1000003 * 1000003) ^ this.WinterFlowRouterStructure.hashCode()) * 1000003) ^ WinterFlowMicroserviceSubsystem.WinterFlowVariableVersionControl.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.WinterFlowRouterStructure + ", priority=" + WinterFlowMicroserviceSubsystem.WinterFlowVariableVersionControl + ", productData=" + this.WinterFlowHookDataSource + "}";
    }
}
