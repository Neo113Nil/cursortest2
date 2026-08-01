package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBatchSubsystem {
    public final byte[] WinterFlowHookDataSource;
    public final WinterFlowFrontendCache WinterFlowRouterStructure;

    public WinterFlowBatchSubsystem(WinterFlowFrontendCache winterFlowFrontendCache, byte[] bArr) {
        if (winterFlowFrontendCache == null) {
            WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("encoding is null");
            throw null;
        }
        if (bArr == null) {
            WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("bytes is null");
            throw null;
        }
        this.WinterFlowRouterStructure = winterFlowFrontendCache;
        this.WinterFlowHookDataSource = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowBatchSubsystem)) {
            return false;
        }
        WinterFlowBatchSubsystem winterFlowBatchSubsystem = (WinterFlowBatchSubsystem) obj;
        if (this.WinterFlowRouterStructure.equals(winterFlowBatchSubsystem.WinterFlowRouterStructure)) {
            return Arrays.equals(this.WinterFlowHookDataSource, winterFlowBatchSubsystem.WinterFlowHookDataSource);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.WinterFlowHookDataSource) ^ ((this.WinterFlowRouterStructure.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.WinterFlowRouterStructure + ", bytes=[...]}";
    }
}
