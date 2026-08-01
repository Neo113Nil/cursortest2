package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowClassController implements ListIterator, WinterFlowLoaderProcess {
    public final Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl = 1;

    public WinterFlowClassController(WinterFlowWebsocketEngine winterFlowWebsocketEngine, int i) {
        this.WinterFlowUnitTestResponse = winterFlowWebsocketEngine;
        List list = (List) winterFlowWebsocketEngine.WinterFlowTransactionManagerStrategy;
        if (i >= 0 && i <= winterFlowWebsocketEngine.WinterFlowRouterStructure()) {
            this.WinterFlowTransactionManagerStrategy = list.listIterator(winterFlowWebsocketEngine.WinterFlowRouterStructure() - i);
            return;
        }
        StringBuilder WinterFlowThreadListener = WinterFlowResolverBackend.WinterFlowThreadListener("Position index ", i, " must be in range [");
        WinterFlowThreadListener.append(new WinterFlowCacheManagerListener(0, winterFlowWebsocketEngine.WinterFlowRouterStructure(), 1));
        WinterFlowThreadListener.append("].");
        throw new IndexOutOfBoundsException(WinterFlowThreadListener.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((WinterFlowTransactionInterface) obj).WinterFlowVariableVersionControl < ((WinterFlowTransactionManagerMechanism) this.WinterFlowUnitTestResponse).WinterFlowRouterRouter - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) obj).hasNext();
            default:
                return ((WinterFlowTransactionInterface) obj).WinterFlowVariableVersionControl >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) obj).previous();
            default:
                WinterFlowTransactionInterface winterFlowTransactionInterface = (WinterFlowTransactionInterface) obj;
                int i2 = winterFlowTransactionInterface.WinterFlowVariableVersionControl + 1;
                WinterFlowTransactionManagerMechanism winterFlowTransactionManagerMechanism = (WinterFlowTransactionManagerMechanism) this.WinterFlowUnitTestResponse;
                WinterFlowServerManager.WinterFlowSyntaxSubsystem(i2, winterFlowTransactionManagerMechanism.WinterFlowRouterRouter);
                winterFlowTransactionInterface.WinterFlowVariableVersionControl = i2;
                return winterFlowTransactionManagerMechanism.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowWebsocketEngine winterFlowWebsocketEngine = (WinterFlowWebsocketEngine) this.WinterFlowUnitTestResponse;
                return (winterFlowWebsocketEngine.size() - 1) - ((ListIterator) obj).previousIndex();
            default:
                return ((WinterFlowTransactionInterface) obj).WinterFlowVariableVersionControl + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) obj).next();
            default:
                WinterFlowTransactionInterface winterFlowTransactionInterface = (WinterFlowTransactionInterface) obj;
                int i2 = winterFlowTransactionInterface.WinterFlowVariableVersionControl;
                WinterFlowTransactionManagerMechanism winterFlowTransactionManagerMechanism = (WinterFlowTransactionManagerMechanism) this.WinterFlowUnitTestResponse;
                WinterFlowServerManager.WinterFlowSyntaxSubsystem(i2, winterFlowTransactionManagerMechanism.WinterFlowRouterRouter);
                winterFlowTransactionInterface.WinterFlowVariableVersionControl = i2 - 1;
                return winterFlowTransactionManagerMechanism.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowWebsocketEngine winterFlowWebsocketEngine = (WinterFlowWebsocketEngine) this.WinterFlowUnitTestResponse;
                return (winterFlowWebsocketEngine.size() - 1) - ((ListIterator) obj).nextIndex();
            default:
                return ((WinterFlowTransactionInterface) obj).WinterFlowVariableVersionControl;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public WinterFlowClassController(WinterFlowTransactionInterface winterFlowTransactionInterface, WinterFlowTransactionManagerMechanism winterFlowTransactionManagerMechanism) {
        this.WinterFlowTransactionManagerStrategy = winterFlowTransactionInterface;
        this.WinterFlowUnitTestResponse = winterFlowTransactionManagerMechanism;
    }
}
