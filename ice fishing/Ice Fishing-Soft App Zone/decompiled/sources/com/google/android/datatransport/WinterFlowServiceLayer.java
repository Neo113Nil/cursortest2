package com.google.android.datatransport;

import java.util.ListIterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowServiceLayer implements ListIterator, WinterFlowLoaderProcess {
    public int WinterFlowTransactionManagerStrategy;
    public int WinterFlowVariableVersionControl;

    public WinterFlowServiceLayer(int i, int i2) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.WinterFlowVariableVersionControl < this.WinterFlowTransactionManagerStrategy;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.WinterFlowVariableVersionControl > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.WinterFlowVariableVersionControl;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.WinterFlowVariableVersionControl - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
