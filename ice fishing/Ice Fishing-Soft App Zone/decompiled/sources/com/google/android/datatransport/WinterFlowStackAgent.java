package com.google.android.datatransport;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowStackAgent extends WinterFlowQueueTool {
    @Override // com.google.android.datatransport.WinterFlowQueueTool
    public final Random WinterFlowArrayNetwork() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationFramework
    public final int WinterFlowCacheManagerAgent(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }
}
