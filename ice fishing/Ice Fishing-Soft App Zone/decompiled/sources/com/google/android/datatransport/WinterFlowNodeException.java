package com.google.android.datatransport;

import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public interface WinterFlowNodeException extends WinterFlowConcurrencyParser {
    WinterFlowTransactionPlatform WinterFlowCompilerDataSource(int i, int i2, Map map, WinterFlowObjectSession winterFlowObjectSession, WinterFlowObjectSession winterFlowObjectSession2);

    boolean WinterFlowServiceUtility();

    default WinterFlowTransactionPlatform WinterFlowThreadListener(int i, int i2, Map map, WinterFlowObjectSession winterFlowObjectSession) {
        return WinterFlowCompilerDataSource(i, i2, map, null, winterFlowObjectSession);
    }

    WinterFlowCacheManagerConfiguration getLayoutDirection();
}
