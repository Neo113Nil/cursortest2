package com.google.android.datatransport;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRepository extends WinterFlowDatabaseDeserialization {
    public final /* synthetic */ AtomicReferenceArray WinterFlowUnitTestResponse;

    public WinterFlowRepository(long j, WinterFlowRepository winterFlowRepository, int i) {
        super(j, winterFlowRepository, i);
        this.WinterFlowUnitTestResponse = new AtomicReferenceArray(WinterFlowEventRouter.WinterFlowTransactionManagerStrategy);
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseDeserialization
    public final int WinterFlowTransactionManagerStrategy() {
        return WinterFlowEventRouter.WinterFlowTransactionManagerStrategy;
    }

    @Override // com.google.android.datatransport.WinterFlowDatabaseDeserialization
    public final void WinterFlowUnitTestResponse(int i, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        this.WinterFlowUnitTestResponse.set(i, WinterFlowEventRouter.WinterFlowVariableVersionControl);
        WinterFlowRouterRouter();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.WinterFlowArrayNetwork + ", hashCode=" + hashCode() + ']';
    }
}
