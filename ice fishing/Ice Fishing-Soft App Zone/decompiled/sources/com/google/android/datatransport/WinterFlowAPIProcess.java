package com.google.android.datatransport;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAPIProcess implements Iterator, WinterFlowTransactionManagerLayer, WinterFlowLoaderProcess {
    public Object WinterFlowTransactionManagerStrategy;
    public WinterFlowTransactionManagerLayer WinterFlowUnitTestResponse;
    public int WinterFlowVariableVersionControl;

    public final void WinterFlowHookDataSource(Object obj, WinterFlowFrameworkController winterFlowFrameworkController) {
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowVariableVersionControl = 3;
        this.WinterFlowUnitTestResponse = winterFlowFrameworkController;
    }

    public final RuntimeException WinterFlowRouterStructure() {
        int i = this.WinterFlowVariableVersionControl;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.WinterFlowVariableVersionControl);
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerLayer
    public final void WinterFlowSyntax(Object obj) {
        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        this.WinterFlowVariableVersionControl = 4;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerLayer
    public final WinterFlowEncryptionMicroservice getContext() {
        return WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.WinterFlowVariableVersionControl;
            if (i != 0) {
                break;
            }
            this.WinterFlowVariableVersionControl = 5;
            WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = this.WinterFlowUnitTestResponse;
            winterFlowTransactionManagerLayer.getClass();
            this.WinterFlowUnitTestResponse = null;
            winterFlowTransactionManagerLayer.WinterFlowSyntax(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw WinterFlowRouterStructure();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.WinterFlowVariableVersionControl;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
            return null;
        }
        if (i == 2) {
            this.WinterFlowVariableVersionControl = 1;
            throw null;
        }
        if (i != 3) {
            throw WinterFlowRouterStructure();
        }
        this.WinterFlowVariableVersionControl = 0;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        this.WinterFlowTransactionManagerStrategy = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
