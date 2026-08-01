package com.google.android.datatransport;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProxyValidator {
    public final int WinterFlowCacheManagerAgent;
    public final long WinterFlowHookDataSource;
    public final ColorFilter WinterFlowRouterStructure;

    public WinterFlowProxyValidator(int i, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            WinterFlowHookManager.WinterFlowVariableVersionControl();
            porterDuffColorFilter = WinterFlowHookManager.WinterFlowCacheManagerAgent(WinterFlowInvokerComponent.WinterFlowConfiguration(j), WinterFlowServerManager.WinterFlowPackageIDE(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(WinterFlowInvokerComponent.WinterFlowConfiguration(j), WinterFlowServerManager.WinterFlowSoftwareProtocol(i));
        }
        this.WinterFlowRouterStructure = porterDuffColorFilter;
        this.WinterFlowHookDataSource = j;
        this.WinterFlowCacheManagerAgent = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowProxyValidator)) {
            return false;
        }
        WinterFlowProxyValidator winterFlowProxyValidator = (WinterFlowProxyValidator) obj;
        long j = winterFlowProxyValidator.WinterFlowHookDataSource;
        int i = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
        return WinterFlowUnitTestSoftware.WinterFlowRouterStructure(this.WinterFlowHookDataSource, j) && this.WinterFlowCacheManagerAgent == winterFlowProxyValidator.WinterFlowCacheManagerAgent;
    }

    public final int hashCode() {
        int i = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
        return Integer.hashCode(this.WinterFlowCacheManagerAgent) + (Long.hashCode(this.WinterFlowHookDataSource) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        WinterFlowResolverBackend.WinterFlowSingletonPlatform(this.WinterFlowHookDataSource, sb, ", blendMode=");
        sb.append((Object) WinterFlowInvokerComponent.WinterFlowValidatorHandler(this.WinterFlowCacheManagerAgent));
        sb.append(')');
        return sb.toString();
    }
}
