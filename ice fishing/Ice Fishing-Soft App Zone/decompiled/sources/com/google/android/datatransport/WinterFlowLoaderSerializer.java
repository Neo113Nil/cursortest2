package com.google.android.datatransport;

import java.util.HashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLoaderSerializer {
    public final HashMap WinterFlowHookDataSource;
    public final WinterFlowFunctionProcessor WinterFlowRouterStructure;

    public WinterFlowLoaderSerializer(WinterFlowFunctionProcessor winterFlowFunctionProcessor, HashMap hashMap) {
        this.WinterFlowRouterStructure = winterFlowFunctionProcessor;
        this.WinterFlowHookDataSource = hashMap;
    }

    public final long WinterFlowRouterStructure(WinterFlowMicroserviceSubsystem winterFlowMicroserviceSubsystem, long j, int i) {
        long WinterFlowTransactionManagerStrategy = j - this.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy();
        WinterFlowRepositoryServer winterFlowRepositoryServer = (WinterFlowRepositoryServer) this.WinterFlowHookDataSource.get(winterFlowMicroserviceSubsystem);
        long j2 = winterFlowRepositoryServer.WinterFlowRouterStructure;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), WinterFlowTransactionManagerStrategy), winterFlowRepositoryServer.WinterFlowHookDataSource);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WinterFlowLoaderSerializer)) {
            return false;
        }
        WinterFlowLoaderSerializer winterFlowLoaderSerializer = (WinterFlowLoaderSerializer) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowLoaderSerializer.WinterFlowRouterStructure) && this.WinterFlowHookDataSource.equals(winterFlowLoaderSerializer.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        return this.WinterFlowHookDataSource.hashCode() ^ ((this.WinterFlowRouterStructure.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.WinterFlowRouterStructure + ", values=" + this.WinterFlowHookDataSource + "}";
    }
}
