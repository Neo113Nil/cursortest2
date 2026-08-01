package com.google.android.datatransport;

import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAlgorithmEngine implements Iterator, WinterFlowLoaderProcess {
    public final /* synthetic */ WinterFlowProcessorFramework WinterFlowTransactionManagerStrategy;
    public final Iterator WinterFlowVariableVersionControl;

    public WinterFlowAlgorithmEngine(WinterFlowProcessorFramework winterFlowProcessorFramework) {
        this.WinterFlowTransactionManagerStrategy = winterFlowProcessorFramework;
        this.WinterFlowVariableVersionControl = winterFlowProcessorFramework.WinterFlowHookDataSource.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.WinterFlowVariableVersionControl.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.WinterFlowTransactionManagerStrategy.WinterFlowCacheManagerAgent.WinterFlowUnitTestResponse(this.WinterFlowVariableVersionControl.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
