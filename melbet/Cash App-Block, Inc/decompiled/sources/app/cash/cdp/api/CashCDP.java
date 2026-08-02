package app.cash.cdp.api;

import app.cash.cdp.backend.jvm.RealEventConsumer;
import coil3.memory.MemoryCacheService;

/* loaded from: classes.dex */
public final class CashCDP {
    public final RealEventConsumer consumer;
    public final MemoryCacheService flusher;

    public CashCDP(MemoryCacheService memoryCacheService, RealEventConsumer realEventConsumer) {
        this.flusher = memoryCacheService;
        this.consumer = realEventConsumer;
    }
}
