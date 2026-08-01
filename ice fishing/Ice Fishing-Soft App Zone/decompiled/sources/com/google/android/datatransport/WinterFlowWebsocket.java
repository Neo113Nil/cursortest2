package com.google.android.datatransport;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWebsocket implements ListIterator, Iterator {
    public int WinterFlowTransactionManagerStrategy;
    public final WinterFlowRuntimeBandwidth WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowWebsocket(WinterFlowRuntimeBandwidth winterFlowRuntimeBandwidth, int i) {
        int size = winterFlowRuntimeBandwidth.size();
        if (i < 0 || i > size) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowProtocolNetwork.WinterFlowThreadListener("index", i, size));
            throw null;
        }
        this.WinterFlowVariableVersionControl = size;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowRuntimeBandwidth;
    }

    public final Object WinterFlowRouterStructure(int i) {
        return this.WinterFlowUnitTestResponse.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.WinterFlowTransactionManagerStrategy < this.WinterFlowVariableVersionControl;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.WinterFlowTransactionManagerStrategy > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
            return null;
        }
        int i = this.WinterFlowTransactionManagerStrategy;
        this.WinterFlowTransactionManagerStrategy = i + 1;
        return WinterFlowRouterStructure(i);
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
        return WinterFlowRouterStructure(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.WinterFlowTransactionManagerStrategy - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
