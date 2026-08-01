package com.google.android.datatransport;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProxyService implements List, WinterFlowLoaderProcess {
    public final WinterFlowMicroserviceFunction WinterFlowVariableVersionControl = new WinterFlowMicroserviceFunction(16);
    public final WinterFlowLoaderEntity WinterFlowTransactionManagerStrategy = new WinterFlowLoaderEntity(16);
    public int WinterFlowUnitTestResponse = -1;

    public final void WinterFlowCacheManagerAgent(int i, int i2) {
        WinterFlowLoaderEntity winterFlowLoaderEntity;
        int i3;
        if (i >= i2) {
            return;
        }
        this.WinterFlowVariableVersionControl.WinterFlowServerProtocol(i, i2);
        if (i < 0 || i > (i3 = (winterFlowLoaderEntity = this.WinterFlowTransactionManagerStrategy).WinterFlowHookDataSource) || i2 < 0 || i2 > i3) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent("Index must be between 0 and size");
            return;
        }
        if (i2 < i) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("The end index must be < start index");
        } else if (i2 != i) {
            if (i2 < i3) {
                long[] jArr = winterFlowLoaderEntity.WinterFlowRouterStructure;
                WinterFlowProtocolPipeline.WinterFlowFrontendBackend(jArr, jArr, i, i2, i3);
            }
            winterFlowLoaderEntity.WinterFlowHookDataSource -= i2 - i;
        }
    }

    public final long WinterFlowRouterStructure() {
        long WinterFlowUnitTestResponse = WinterFlowManagerRequest.WinterFlowUnitTestResponse(Float.POSITIVE_INFINITY, false, false);
        int i = this.WinterFlowUnitTestResponse + 1;
        int i2 = this.WinterFlowVariableVersionControl.WinterFlowHookDataSource - 1;
        if (i > i2) {
            return WinterFlowUnitTestResponse;
        }
        while (i >= 0) {
            WinterFlowLoaderEntity winterFlowLoaderEntity = this.WinterFlowTransactionManagerStrategy;
            if (i >= winterFlowLoaderEntity.WinterFlowHookDataSource) {
                break;
            }
            long j = winterFlowLoaderEntity.WinterFlowRouterStructure[i];
            if (WinterFlowQuerySyntax.WinterFlowTransactionManagerStrategy(j, WinterFlowUnitTestResponse) < 0) {
                WinterFlowUnitTestResponse = j;
            }
            if ((WinterFlowQuerySyntax.WinterFlowServiceUtility(WinterFlowUnitTestResponse) < 0.0f && WinterFlowQuerySyntax.WinterFlowVariableBandwidth(WinterFlowUnitTestResponse)) || i == i2) {
                return WinterFlowUnitTestResponse;
            }
            i++;
        }
        WinterFlowCompilerMechanism.WinterFlowTransactionAgent("Index must be between 0 and size");
        return 0L;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.WinterFlowUnitTestResponse = -1;
        this.WinterFlowVariableVersionControl.WinterFlowArrayNetwork();
        this.WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof WinterFlowUserManagerController) && indexOf((WinterFlowUserManagerController) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((WinterFlowUserManagerController) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object WinterFlowTransactionManagerStrategy = this.WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy(i);
        WinterFlowTransactionManagerStrategy.getClass();
        return (WinterFlowUserManagerController) WinterFlowTransactionManagerStrategy;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof WinterFlowUserManagerController)) {
            return -1;
        }
        WinterFlowUserManagerController winterFlowUserManagerController = (WinterFlowUserManagerController) obj;
        WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = this.WinterFlowVariableVersionControl;
        int i = winterFlowMicroserviceFunction.WinterFlowHookDataSource - 1;
        if (i < 0) {
            return -1;
        }
        int i2 = 0;
        while (!WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowMicroserviceFunction.WinterFlowTransactionManagerStrategy(i2), winterFlowUserManagerController)) {
            if (i2 == i) {
                return -1;
            }
            i2++;
        }
        return i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.WinterFlowVariableVersionControl.WinterFlowRouterRouter();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new WinterFlowClassAlgorithm(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof WinterFlowUserManagerController) {
            WinterFlowUserManagerController winterFlowUserManagerController = (WinterFlowUserManagerController) obj;
            WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = this.WinterFlowVariableVersionControl;
            for (int i = winterFlowMicroserviceFunction.WinterFlowHookDataSource - 1; -1 < i; i--) {
                if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowMicroserviceFunction.WinterFlowTransactionManagerStrategy(i), winterFlowUserManagerController)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new WinterFlowClassAlgorithm(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.WinterFlowVariableVersionControl.WinterFlowHookDataSource;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new WinterFlowHandlerAdapter(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return WinterFlowTestingCloud.WinterFlowUserManagerUserManager(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return WinterFlowTestingCloud.WinterFlowSoftwareEngine(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new WinterFlowClassAlgorithm(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
