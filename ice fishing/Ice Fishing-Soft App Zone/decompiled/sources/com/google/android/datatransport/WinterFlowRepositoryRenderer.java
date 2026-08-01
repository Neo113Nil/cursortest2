package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRepositoryRenderer {
    public final long WinterFlowArrayNetwork;
    public final long WinterFlowCacheManagerAgent;
    public final long WinterFlowHookDataSource;
    public final long WinterFlowRouterStructure;
    public final float[] WinterFlowTransactionManagerStrategy;
    public final WinterFlowInterfaceProcess WinterFlowUnitTestResponse;
    public final long WinterFlowVariableVersionControl;

    public WinterFlowRepositoryRenderer(long j, long j2, long j3, long j4, long j5, float[] fArr, WinterFlowInterfaceProcess winterFlowInterfaceProcess) {
        this.WinterFlowRouterStructure = j;
        this.WinterFlowHookDataSource = j2;
        this.WinterFlowCacheManagerAgent = j3;
        this.WinterFlowArrayNetwork = j4;
        this.WinterFlowVariableVersionControl = j5;
        this.WinterFlowTransactionManagerStrategy = fArr;
        this.WinterFlowUnitTestResponse = winterFlowInterfaceProcess;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        if (obj != null && WinterFlowRepositoryRenderer.class == obj.getClass()) {
            WinterFlowRepositoryRenderer winterFlowRepositoryRenderer = (WinterFlowRepositoryRenderer) obj;
            if (this.WinterFlowRouterStructure == winterFlowRepositoryRenderer.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowRepositoryRenderer.WinterFlowHookDataSource && this.WinterFlowVariableVersionControl == winterFlowRepositoryRenderer.WinterFlowVariableVersionControl && WinterFlowValidatorTesting.WinterFlowRouterStructure(this.WinterFlowCacheManagerAgent, winterFlowRepositoryRenderer.WinterFlowCacheManagerAgent) && WinterFlowValidatorTesting.WinterFlowRouterStructure(this.WinterFlowArrayNetwork, winterFlowRepositoryRenderer.WinterFlowArrayNetwork)) {
                float[] fArr = winterFlowRepositoryRenderer.WinterFlowTransactionManagerStrategy;
                float[] fArr2 = this.WinterFlowTransactionManagerStrategy;
                if (fArr2 == null) {
                    if (fArr == null) {
                        equals = true;
                        return equals && this.WinterFlowUnitTestResponse == winterFlowRepositoryRenderer.WinterFlowUnitTestResponse;
                    }
                    equals = false;
                    if (equals) {
                    }
                } else {
                    if (fArr != null) {
                        equals = fArr2.equals(fArr);
                        if (equals) {
                        }
                    }
                    equals = false;
                    if (equals) {
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int WinterFlowVariableVersionControl = WinterFlowResolverBackend.WinterFlowVariableVersionControl(WinterFlowResolverBackend.WinterFlowVariableVersionControl(WinterFlowResolverBackend.WinterFlowVariableVersionControl(WinterFlowResolverBackend.WinterFlowVariableVersionControl(Long.hashCode(this.WinterFlowRouterStructure) * 31, 31, this.WinterFlowHookDataSource), 31, this.WinterFlowVariableVersionControl), 31, this.WinterFlowCacheManagerAgent), 31, this.WinterFlowArrayNetwork);
        float[] fArr = this.WinterFlowTransactionManagerStrategy;
        return this.WinterFlowUnitTestResponse.hashCode() + ((WinterFlowVariableVersionControl + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
