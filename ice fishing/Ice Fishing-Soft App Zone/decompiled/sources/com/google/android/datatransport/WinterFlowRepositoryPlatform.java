package com.google.android.datatransport;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRepositoryPlatform implements ListIterator, WinterFlowLoaderProcess {
    public int WinterFlowTransactionManagerStrategy;
    public final List WinterFlowVariableVersionControl;

    public WinterFlowRepositoryPlatform(int i, List list) {
        this.WinterFlowVariableVersionControl = list;
        this.WinterFlowTransactionManagerStrategy = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.WinterFlowVariableVersionControl.add(this.WinterFlowTransactionManagerStrategy, obj);
        this.WinterFlowTransactionManagerStrategy++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.WinterFlowTransactionManagerStrategy < this.WinterFlowVariableVersionControl.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.WinterFlowTransactionManagerStrategy > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.WinterFlowTransactionManagerStrategy;
        this.WinterFlowTransactionManagerStrategy = i + 1;
        return this.WinterFlowVariableVersionControl.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.WinterFlowTransactionManagerStrategy - 1;
        this.WinterFlowTransactionManagerStrategy = i;
        return this.WinterFlowVariableVersionControl.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.WinterFlowTransactionManagerStrategy - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.WinterFlowTransactionManagerStrategy - 1;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowVariableVersionControl.remove(i);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.WinterFlowVariableVersionControl.set(this.WinterFlowTransactionManagerStrategy, obj);
    }
}
