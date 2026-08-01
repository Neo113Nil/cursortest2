package com.google.android.datatransport;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueueAlgorithm extends WinterFlowDeserializationDeployment implements RandomAccess, Serializable {
    public final WinterFlowQueueAlgorithm WinterFlowRouterRouter;
    public final WinterFlowUserManagerResolver WinterFlowSyntax;
    public final int WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;
    public Object[] WinterFlowVariableVersionControl;

    public WinterFlowQueueAlgorithm(Object[] objArr, int i, int i2, WinterFlowQueueAlgorithm winterFlowQueueAlgorithm, WinterFlowUserManagerResolver winterFlowUserManagerResolver) {
        int i3;
        objArr.getClass();
        this.WinterFlowVariableVersionControl = objArr;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = i2;
        this.WinterFlowRouterRouter = winterFlowQueueAlgorithm;
        this.WinterFlowSyntax = winterFlowUserManagerResolver;
        i3 = ((AbstractList) winterFlowUserManagerResolver).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationDeployment
    public final Object WinterFlowCacheManagerAgent(int i) {
        WinterFlowRouterRouter();
        WinterFlowUnitTestResponse();
        int i2 = this.WinterFlowUnitTestResponse;
        if (i >= 0 && i < i2) {
            return WinterFlowSyntax(this.WinterFlowTransactionManagerStrategy + i);
        }
        WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void WinterFlowResponseEngine(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        WinterFlowQueueAlgorithm winterFlowQueueAlgorithm = this.WinterFlowRouterRouter;
        if (winterFlowQueueAlgorithm != null) {
            winterFlowQueueAlgorithm.WinterFlowResponseEngine(i, i2);
        } else {
            WinterFlowUserManagerResolver winterFlowUserManagerResolver = WinterFlowUserManagerResolver.WinterFlowRouterRouter;
            this.WinterFlowSyntax.WinterFlowResponseEngine(i, i2);
        }
        this.WinterFlowUnitTestResponse -= i2;
    }

    public final void WinterFlowRouterRouter() {
        if (this.WinterFlowSyntax.WinterFlowUnitTestResponse) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationDeployment
    public final int WinterFlowRouterStructure() {
        WinterFlowUnitTestResponse();
        return this.WinterFlowUnitTestResponse;
    }

    public final Object WinterFlowSyntax(int i) {
        Object WinterFlowSyntax;
        ((AbstractList) this).modCount++;
        WinterFlowQueueAlgorithm winterFlowQueueAlgorithm = this.WinterFlowRouterRouter;
        if (winterFlowQueueAlgorithm != null) {
            WinterFlowSyntax = winterFlowQueueAlgorithm.WinterFlowSyntax(i);
        } else {
            WinterFlowUserManagerResolver winterFlowUserManagerResolver = WinterFlowUserManagerResolver.WinterFlowRouterRouter;
            WinterFlowSyntax = this.WinterFlowSyntax.WinterFlowSyntax(i);
        }
        this.WinterFlowUnitTestResponse--;
        return WinterFlowSyntax;
    }

    public final int WinterFlowTransactionAgent(int i, int i2, Collection collection, boolean z) {
        int WinterFlowTransactionAgent;
        WinterFlowQueueAlgorithm winterFlowQueueAlgorithm = this.WinterFlowRouterRouter;
        if (winterFlowQueueAlgorithm != null) {
            WinterFlowTransactionAgent = winterFlowQueueAlgorithm.WinterFlowTransactionAgent(i, i2, collection, z);
        } else {
            WinterFlowUserManagerResolver winterFlowUserManagerResolver = WinterFlowUserManagerResolver.WinterFlowRouterRouter;
            WinterFlowTransactionAgent = this.WinterFlowSyntax.WinterFlowTransactionAgent(i, i2, collection, z);
        }
        if (WinterFlowTransactionAgent > 0) {
            ((AbstractList) this).modCount++;
        }
        this.WinterFlowUnitTestResponse -= WinterFlowTransactionAgent;
        return WinterFlowTransactionAgent;
    }

    public final void WinterFlowTransactionManagerStrategy(int i, Object obj) {
        ((AbstractList) this).modCount++;
        WinterFlowUserManagerResolver winterFlowUserManagerResolver = this.WinterFlowSyntax;
        WinterFlowQueueAlgorithm winterFlowQueueAlgorithm = this.WinterFlowRouterRouter;
        if (winterFlowQueueAlgorithm != null) {
            winterFlowQueueAlgorithm.WinterFlowTransactionManagerStrategy(i, obj);
        } else {
            WinterFlowUserManagerResolver winterFlowUserManagerResolver2 = WinterFlowUserManagerResolver.WinterFlowRouterRouter;
            winterFlowUserManagerResolver.WinterFlowTransactionManagerStrategy(i, obj);
        }
        this.WinterFlowVariableVersionControl = winterFlowUserManagerResolver.WinterFlowVariableVersionControl;
        this.WinterFlowUnitTestResponse++;
    }

    public final void WinterFlowUnitTestResponse() {
        int i;
        i = ((AbstractList) this.WinterFlowSyntax).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void WinterFlowVariableVersionControl(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        WinterFlowUserManagerResolver winterFlowUserManagerResolver = this.WinterFlowSyntax;
        WinterFlowQueueAlgorithm winterFlowQueueAlgorithm = this.WinterFlowRouterRouter;
        if (winterFlowQueueAlgorithm != null) {
            winterFlowQueueAlgorithm.WinterFlowVariableVersionControl(i, collection, i2);
        } else {
            WinterFlowUserManagerResolver winterFlowUserManagerResolver2 = WinterFlowUserManagerResolver.WinterFlowRouterRouter;
            winterFlowUserManagerResolver.WinterFlowVariableVersionControl(i, collection, i2);
        }
        this.WinterFlowVariableVersionControl = winterFlowUserManagerResolver.WinterFlowVariableVersionControl;
        this.WinterFlowUnitTestResponse += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        WinterFlowRouterRouter();
        WinterFlowUnitTestResponse();
        int i2 = this.WinterFlowUnitTestResponse;
        if (i < 0 || i > i2) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
        } else {
            WinterFlowTransactionManagerStrategy(this.WinterFlowTransactionManagerStrategy + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        WinterFlowRouterRouter();
        WinterFlowUnitTestResponse();
        int i2 = this.WinterFlowUnitTestResponse;
        if (i < 0 || i > i2) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        WinterFlowVariableVersionControl(this.WinterFlowTransactionManagerStrategy + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        WinterFlowRouterRouter();
        WinterFlowUnitTestResponse();
        WinterFlowResponseEngine(this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        WinterFlowUnitTestResponse();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.WinterFlowVariableVersionControl;
            int i = this.WinterFlowUnitTestResponse;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (WinterFlowManagerRequest.WinterFlowThreadListener(objArr[this.WinterFlowTransactionManagerStrategy + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        WinterFlowUnitTestResponse();
        int i2 = this.WinterFlowUnitTestResponse;
        if (i >= 0 && i < i2) {
            return this.WinterFlowVariableVersionControl[this.WinterFlowTransactionManagerStrategy + i];
        }
        WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        WinterFlowUnitTestResponse();
        Object[] objArr = this.WinterFlowVariableVersionControl;
        int i = this.WinterFlowUnitTestResponse;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.WinterFlowTransactionManagerStrategy + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        WinterFlowUnitTestResponse();
        for (int i = 0; i < this.WinterFlowUnitTestResponse; i++) {
            if (WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl[this.WinterFlowTransactionManagerStrategy + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        WinterFlowUnitTestResponse();
        return this.WinterFlowUnitTestResponse == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        WinterFlowUnitTestResponse();
        for (int i = this.WinterFlowUnitTestResponse - 1; i >= 0; i--) {
            if (WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl[this.WinterFlowTransactionManagerStrategy + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        WinterFlowUnitTestResponse();
        int i2 = this.WinterFlowUnitTestResponse;
        if (i >= 0 && i <= i2) {
            return new WinterFlowClassAlgorithm(this, i);
        }
        WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        WinterFlowRouterRouter();
        WinterFlowUnitTestResponse();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            WinterFlowCacheManagerAgent(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        WinterFlowRouterRouter();
        WinterFlowUnitTestResponse();
        return WinterFlowTransactionAgent(this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        WinterFlowRouterRouter();
        WinterFlowUnitTestResponse();
        return WinterFlowTransactionAgent(this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        WinterFlowRouterRouter();
        WinterFlowUnitTestResponse();
        int i2 = this.WinterFlowUnitTestResponse;
        if (i < 0 || i >= i2) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.WinterFlowVariableVersionControl;
        int i3 = this.WinterFlowTransactionManagerStrategy;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        WinterFlowInvokerComponent.WinterFlowBandwidthObject(i, i2, this.WinterFlowUnitTestResponse);
        return new WinterFlowQueueAlgorithm(this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy + i, i2 - i, this, this.WinterFlowSyntax);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        WinterFlowUnitTestResponse();
        int length = objArr.length;
        int i = this.WinterFlowUnitTestResponse;
        Object[] objArr2 = this.WinterFlowVariableVersionControl;
        int i2 = this.WinterFlowTransactionManagerStrategy;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.WinterFlowUnitTestResponse;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        WinterFlowUnitTestResponse();
        return WinterFlowHandlerWebsocket.WinterFlowTestingNode(this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        WinterFlowRouterRouter();
        WinterFlowUnitTestResponse();
        WinterFlowTransactionManagerStrategy(this.WinterFlowTransactionManagerStrategy + this.WinterFlowUnitTestResponse, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        WinterFlowUnitTestResponse();
        Object[] objArr = this.WinterFlowVariableVersionControl;
        int i = this.WinterFlowUnitTestResponse;
        int i2 = this.WinterFlowTransactionManagerStrategy;
        return WinterFlowProtocolPipeline.WinterFlowCacheTool(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        WinterFlowRouterRouter();
        WinterFlowUnitTestResponse();
        int size = collection.size();
        WinterFlowVariableVersionControl(this.WinterFlowTransactionManagerStrategy + this.WinterFlowUnitTestResponse, collection, size);
        return size > 0;
    }
}
