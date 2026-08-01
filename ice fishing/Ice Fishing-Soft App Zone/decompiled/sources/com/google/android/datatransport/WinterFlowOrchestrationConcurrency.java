package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowOrchestrationConcurrency {
    public final int WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final WinterFlowValidatorProcess WinterFlowRouterStructure;

    public WinterFlowOrchestrationConcurrency(WinterFlowValidatorProcess winterFlowValidatorProcess, int i, int i2) {
        this.WinterFlowRouterStructure = winterFlowValidatorProcess;
        this.WinterFlowHookDataSource = i;
        this.WinterFlowCacheManagerAgent = i2;
    }

    public static WinterFlowOrchestrationConcurrency WinterFlowRouterStructure(Class cls) {
        return new WinterFlowOrchestrationConcurrency(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowOrchestrationConcurrency)) {
            return false;
        }
        WinterFlowOrchestrationConcurrency winterFlowOrchestrationConcurrency = (WinterFlowOrchestrationConcurrency) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowOrchestrationConcurrency.WinterFlowRouterStructure) && this.WinterFlowHookDataSource == winterFlowOrchestrationConcurrency.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent == winterFlowOrchestrationConcurrency.WinterFlowCacheManagerAgent;
    }

    public final int hashCode() {
        return this.WinterFlowCacheManagerAgent ^ ((((this.WinterFlowRouterStructure.hashCode() ^ 1000003) * 1000003) ^ this.WinterFlowHookDataSource) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", type=");
        int i = this.WinterFlowHookDataSource;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.WinterFlowCacheManagerAgent;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(WinterFlowResolverBackend.WinterFlowSyntax("Unsupported injection: ", i2));
            }
            str = "deferred";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public WinterFlowOrchestrationConcurrency(int i, int i2, Class cls) {
        this(WinterFlowValidatorProcess.WinterFlowRouterStructure(cls), i, i2);
    }
}
