package com.google.android.datatransport;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInheritanceAgent implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new WinterFlowGateway(runnable, "fonts-androidx");
    }
}
