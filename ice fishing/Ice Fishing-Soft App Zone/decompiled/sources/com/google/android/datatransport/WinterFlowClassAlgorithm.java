package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowClassAlgorithm implements ListIterator, WinterFlowLoaderProcess {
    public int WinterFlowRouterRouter;
    public final Object WinterFlowSyntax;
    public int WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public WinterFlowClassAlgorithm(WinterFlowPackageResolver winterFlowPackageResolver, int i) {
        this.WinterFlowVariableVersionControl = 3;
        this.WinterFlowSyntax = winterFlowPackageResolver;
        this.WinterFlowTransactionManagerStrategy = i - 1;
        this.WinterFlowUnitTestResponse = -1;
        this.WinterFlowRouterRouter = WinterFlowServerManager.WinterFlowSerializerStructure(winterFlowPackageResolver);
    }

    public void WinterFlowCacheManagerAgent() {
        if (WinterFlowServerManager.WinterFlowSerializerStructure((WinterFlowPackageResolver) this.WinterFlowSyntax) != this.WinterFlowRouterRouter) {
            throw new ConcurrentModificationException();
        }
    }

    public void WinterFlowHookDataSource() {
        int i;
        i = ((AbstractList) ((WinterFlowUserManagerResolver) this.WinterFlowSyntax)).modCount;
        if (i != this.WinterFlowRouterRouter) {
            throw new ConcurrentModificationException();
        }
    }

    public void WinterFlowRouterStructure() {
        int i;
        i = ((AbstractList) ((WinterFlowQueueAlgorithm) this.WinterFlowSyntax).WinterFlowSyntax).modCount;
        if (i != this.WinterFlowRouterRouter) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        int i3 = this.WinterFlowVariableVersionControl;
        Object obj2 = this.WinterFlowSyntax;
        switch (i3) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                WinterFlowRouterStructure();
                WinterFlowQueueAlgorithm winterFlowQueueAlgorithm = (WinterFlowQueueAlgorithm) obj2;
                int i4 = this.WinterFlowTransactionManagerStrategy;
                this.WinterFlowTransactionManagerStrategy = i4 + 1;
                winterFlowQueueAlgorithm.add(i4, obj);
                this.WinterFlowUnitTestResponse = -1;
                i = ((AbstractList) winterFlowQueueAlgorithm).modCount;
                this.WinterFlowRouterRouter = i;
                return;
            case 2:
                WinterFlowHookDataSource();
                WinterFlowUserManagerResolver winterFlowUserManagerResolver = (WinterFlowUserManagerResolver) obj2;
                int i5 = this.WinterFlowTransactionManagerStrategy;
                this.WinterFlowTransactionManagerStrategy = i5 + 1;
                winterFlowUserManagerResolver.add(i5, obj);
                this.WinterFlowUnitTestResponse = -1;
                i2 = ((AbstractList) winterFlowUserManagerResolver).modCount;
                this.WinterFlowRouterRouter = i2;
                return;
            default:
                WinterFlowCacheManagerAgent();
                WinterFlowPackageResolver winterFlowPackageResolver = (WinterFlowPackageResolver) obj2;
                winterFlowPackageResolver.add(this.WinterFlowTransactionManagerStrategy + 1, obj);
                this.WinterFlowUnitTestResponse = -1;
                this.WinterFlowTransactionManagerStrategy++;
                this.WinterFlowRouterRouter = WinterFlowServerManager.WinterFlowSerializerStructure(winterFlowPackageResolver);
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowSyntax;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.WinterFlowTransactionManagerStrategy < this.WinterFlowRouterRouter) {
                    break;
                }
                break;
            case 1:
                if (this.WinterFlowTransactionManagerStrategy < ((WinterFlowQueueAlgorithm) obj).WinterFlowUnitTestResponse) {
                    break;
                }
                break;
            case 2:
                if (this.WinterFlowTransactionManagerStrategy < ((WinterFlowUserManagerResolver) obj).WinterFlowTransactionManagerStrategy) {
                    break;
                }
                break;
            default:
                if (this.WinterFlowTransactionManagerStrategy < ((WinterFlowPackageResolver) obj).size() - 1) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.WinterFlowTransactionManagerStrategy > this.WinterFlowUnitTestResponse) {
                }
                break;
            case 1:
                if (this.WinterFlowTransactionManagerStrategy > 0) {
                }
                break;
            case 2:
                if (this.WinterFlowTransactionManagerStrategy > 0) {
                }
                break;
            default:
                if (this.WinterFlowTransactionManagerStrategy >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowSyntax;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = ((WinterFlowProxyService) obj).WinterFlowVariableVersionControl;
                int i2 = this.WinterFlowTransactionManagerStrategy;
                this.WinterFlowTransactionManagerStrategy = i2 + 1;
                Object WinterFlowTransactionManagerStrategy = winterFlowMicroserviceFunction.WinterFlowTransactionManagerStrategy(i2);
                WinterFlowTransactionManagerStrategy.getClass();
                return (WinterFlowUserManagerController) WinterFlowTransactionManagerStrategy;
            case 1:
                WinterFlowRouterStructure();
                int i3 = this.WinterFlowTransactionManagerStrategy;
                WinterFlowQueueAlgorithm winterFlowQueueAlgorithm = (WinterFlowQueueAlgorithm) obj;
                if (i3 >= winterFlowQueueAlgorithm.WinterFlowUnitTestResponse) {
                    WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                    return null;
                }
                this.WinterFlowTransactionManagerStrategy = i3 + 1;
                this.WinterFlowUnitTestResponse = i3;
                return winterFlowQueueAlgorithm.WinterFlowVariableVersionControl[winterFlowQueueAlgorithm.WinterFlowTransactionManagerStrategy + i3];
            case 2:
                WinterFlowHookDataSource();
                int i4 = this.WinterFlowTransactionManagerStrategy;
                WinterFlowUserManagerResolver winterFlowUserManagerResolver = (WinterFlowUserManagerResolver) obj;
                if (i4 >= winterFlowUserManagerResolver.WinterFlowTransactionManagerStrategy) {
                    WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                    return null;
                }
                this.WinterFlowTransactionManagerStrategy = i4 + 1;
                this.WinterFlowUnitTestResponse = i4;
                return winterFlowUserManagerResolver.WinterFlowVariableVersionControl[i4];
            default:
                WinterFlowCacheManagerAgent();
                int i5 = this.WinterFlowTransactionManagerStrategy + 1;
                this.WinterFlowUnitTestResponse = i5;
                WinterFlowPackageResolver winterFlowPackageResolver = (WinterFlowPackageResolver) obj;
                WinterFlowServerManager.WinterFlowSyntaxSubsystem(i5, winterFlowPackageResolver.size());
                Object obj2 = winterFlowPackageResolver.get(i5);
                this.WinterFlowTransactionManagerStrategy = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.WinterFlowTransactionManagerStrategy - this.WinterFlowUnitTestResponse;
            case 1:
                return this.WinterFlowTransactionManagerStrategy;
            case 2:
                return this.WinterFlowTransactionManagerStrategy;
            default:
                return this.WinterFlowTransactionManagerStrategy + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowSyntax;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = ((WinterFlowProxyService) obj).WinterFlowVariableVersionControl;
                int i2 = this.WinterFlowTransactionManagerStrategy - 1;
                this.WinterFlowTransactionManagerStrategy = i2;
                Object WinterFlowTransactionManagerStrategy = winterFlowMicroserviceFunction.WinterFlowTransactionManagerStrategy(i2);
                WinterFlowTransactionManagerStrategy.getClass();
                return (WinterFlowUserManagerController) WinterFlowTransactionManagerStrategy;
            case 1:
                WinterFlowRouterStructure();
                int i3 = this.WinterFlowTransactionManagerStrategy;
                if (i3 <= 0) {
                    WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                    return null;
                }
                int i4 = i3 - 1;
                this.WinterFlowTransactionManagerStrategy = i4;
                this.WinterFlowUnitTestResponse = i4;
                WinterFlowQueueAlgorithm winterFlowQueueAlgorithm = (WinterFlowQueueAlgorithm) obj;
                return winterFlowQueueAlgorithm.WinterFlowVariableVersionControl[winterFlowQueueAlgorithm.WinterFlowTransactionManagerStrategy + i4];
            case 2:
                WinterFlowHookDataSource();
                int i5 = this.WinterFlowTransactionManagerStrategy;
                if (i5 <= 0) {
                    WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                    return null;
                }
                int i6 = i5 - 1;
                this.WinterFlowTransactionManagerStrategy = i6;
                this.WinterFlowUnitTestResponse = i6;
                return ((WinterFlowUserManagerResolver) obj).WinterFlowVariableVersionControl[i6];
            default:
                WinterFlowCacheManagerAgent();
                WinterFlowPackageResolver winterFlowPackageResolver = (WinterFlowPackageResolver) obj;
                WinterFlowServerManager.WinterFlowSyntaxSubsystem(this.WinterFlowTransactionManagerStrategy, winterFlowPackageResolver.size());
                int i7 = this.WinterFlowTransactionManagerStrategy;
                this.WinterFlowUnitTestResponse = i7;
                this.WinterFlowTransactionManagerStrategy--;
                return winterFlowPackageResolver.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (this.WinterFlowTransactionManagerStrategy - this.WinterFlowUnitTestResponse) - 1;
            case 1:
                i = this.WinterFlowTransactionManagerStrategy;
                break;
            case 2:
                i = this.WinterFlowTransactionManagerStrategy;
                break;
            default:
                return this.WinterFlowTransactionManagerStrategy;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        int i3 = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowSyntax;
        switch (i3) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                WinterFlowQueueAlgorithm winterFlowQueueAlgorithm = (WinterFlowQueueAlgorithm) obj;
                WinterFlowRouterStructure();
                int i4 = this.WinterFlowUnitTestResponse;
                if (i4 == -1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                winterFlowQueueAlgorithm.WinterFlowCacheManagerAgent(i4);
                this.WinterFlowTransactionManagerStrategy = this.WinterFlowUnitTestResponse;
                this.WinterFlowUnitTestResponse = -1;
                i = ((AbstractList) winterFlowQueueAlgorithm).modCount;
                this.WinterFlowRouterRouter = i;
                return;
            case 2:
                WinterFlowUserManagerResolver winterFlowUserManagerResolver = (WinterFlowUserManagerResolver) obj;
                WinterFlowHookDataSource();
                int i5 = this.WinterFlowUnitTestResponse;
                if (i5 == -1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                winterFlowUserManagerResolver.WinterFlowCacheManagerAgent(i5);
                this.WinterFlowTransactionManagerStrategy = this.WinterFlowUnitTestResponse;
                this.WinterFlowUnitTestResponse = -1;
                i2 = ((AbstractList) winterFlowUserManagerResolver).modCount;
                this.WinterFlowRouterRouter = i2;
                return;
            default:
                WinterFlowCacheManagerAgent();
                WinterFlowPackageResolver winterFlowPackageResolver = (WinterFlowPackageResolver) obj;
                winterFlowPackageResolver.remove(this.WinterFlowUnitTestResponse);
                this.WinterFlowTransactionManagerStrategy--;
                this.WinterFlowUnitTestResponse = -1;
                this.WinterFlowRouterRouter = WinterFlowServerManager.WinterFlowSerializerStructure(winterFlowPackageResolver);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.WinterFlowVariableVersionControl;
        Object obj2 = this.WinterFlowSyntax;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                WinterFlowRouterStructure();
                int i2 = this.WinterFlowUnitTestResponse;
                if (i2 != -1) {
                    ((WinterFlowQueueAlgorithm) obj2).set(i2, obj);
                    return;
                } else {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                WinterFlowHookDataSource();
                int i3 = this.WinterFlowUnitTestResponse;
                if (i3 != -1) {
                    ((WinterFlowUserManagerResolver) obj2).set(i3, obj);
                    return;
                } else {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                WinterFlowPackageResolver winterFlowPackageResolver = (WinterFlowPackageResolver) obj2;
                WinterFlowCacheManagerAgent();
                int i4 = this.WinterFlowUnitTestResponse;
                if (i4 < 0) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    winterFlowPackageResolver.set(i4, obj);
                    this.WinterFlowRouterRouter = WinterFlowServerManager.WinterFlowSerializerStructure(winterFlowPackageResolver);
                    return;
                }
        }
    }

    public WinterFlowClassAlgorithm(WinterFlowUserManagerResolver winterFlowUserManagerResolver, int i) {
        int i2;
        this.WinterFlowVariableVersionControl = 2;
        this.WinterFlowSyntax = winterFlowUserManagerResolver;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = -1;
        i2 = ((AbstractList) winterFlowUserManagerResolver).modCount;
        this.WinterFlowRouterRouter = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WinterFlowClassAlgorithm(WinterFlowProxyService winterFlowProxyService, int i, int i2) {
        this(winterFlowProxyService, (i2 & 1) != 0 ? 0 : i, 0, winterFlowProxyService.WinterFlowVariableVersionControl.WinterFlowHookDataSource);
        this.WinterFlowVariableVersionControl = 0;
    }

    public WinterFlowClassAlgorithm(WinterFlowProxyService winterFlowProxyService, int i, int i2, int i3) {
        this.WinterFlowVariableVersionControl = 0;
        this.WinterFlowSyntax = winterFlowProxyService;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = i2;
        this.WinterFlowRouterRouter = i3;
    }

    public WinterFlowClassAlgorithm(WinterFlowQueueAlgorithm winterFlowQueueAlgorithm, int i) {
        int i2;
        this.WinterFlowVariableVersionControl = 1;
        this.WinterFlowSyntax = winterFlowQueueAlgorithm;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = -1;
        i2 = ((AbstractList) winterFlowQueueAlgorithm).modCount;
        this.WinterFlowRouterRouter = i2;
    }
}
