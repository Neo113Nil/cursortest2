package com.google.android.datatransport;

import java.util.ListIterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTestingUI extends WinterFlowSoftware implements ListIterator {
    public final /* synthetic */ WinterFlowConcurrencyQueue WinterFlowRouterRouter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowTestingUI(WinterFlowConcurrencyQueue winterFlowConcurrencyQueue, int i) {
        super(0, winterFlowConcurrencyQueue);
        this.WinterFlowRouterRouter = winterFlowConcurrencyQueue;
        int WinterFlowRouterStructure = winterFlowConcurrencyQueue.WinterFlowRouterStructure();
        if (i < 0 || i > WinterFlowRouterStructure) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, WinterFlowRouterStructure, "index: ", ", size: "));
            throw null;
        }
        this.WinterFlowTransactionManagerStrategy = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.WinterFlowTransactionManagerStrategy > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
            return null;
        }
        int i = this.WinterFlowTransactionManagerStrategy - 1;
        this.WinterFlowTransactionManagerStrategy = i;
        return this.WinterFlowRouterRouter.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.WinterFlowTransactionManagerStrategy - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
