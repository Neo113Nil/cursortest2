package com.google.android.datatransport;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUserManagerResolver extends WinterFlowDeserializationDeployment implements RandomAccess, Serializable {
    public static final WinterFlowUserManagerResolver WinterFlowRouterRouter;
    public int WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowUnitTestResponse;
    public Object[] WinterFlowVariableVersionControl;

    static {
        WinterFlowUserManagerResolver winterFlowUserManagerResolver = new WinterFlowUserManagerResolver(0);
        winterFlowUserManagerResolver.WinterFlowUnitTestResponse = true;
        WinterFlowRouterRouter = winterFlowUserManagerResolver;
    }

    public WinterFlowUserManagerResolver(int i) {
        if (i >= 0) {
            this.WinterFlowVariableVersionControl = new Object[i];
        } else {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationDeployment
    public final Object WinterFlowCacheManagerAgent(int i) {
        WinterFlowUnitTestResponse();
        int i2 = this.WinterFlowTransactionManagerStrategy;
        if (i >= 0 && i < i2) {
            return WinterFlowSyntax(i);
        }
        WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void WinterFlowResponseEngine(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.WinterFlowVariableVersionControl;
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr, i, i + i2, this.WinterFlowTransactionManagerStrategy);
        Object[] objArr2 = this.WinterFlowVariableVersionControl;
        int i3 = this.WinterFlowTransactionManagerStrategy;
        WinterFlowHandlerWebsocket.WinterFlowSoftwareEngine(objArr2, i3 - i2, i3);
        this.WinterFlowTransactionManagerStrategy -= i2;
    }

    public final void WinterFlowRouterRouter(int i, int i2) {
        int i3 = this.WinterFlowTransactionManagerStrategy + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.WinterFlowVariableVersionControl;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            objArr = Arrays.copyOf(objArr, i4);
            this.WinterFlowVariableVersionControl = objArr;
        }
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr, i + i2, i, this.WinterFlowTransactionManagerStrategy);
        this.WinterFlowTransactionManagerStrategy += i2;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationDeployment
    public final int WinterFlowRouterStructure() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    public final Object WinterFlowSyntax(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.WinterFlowVariableVersionControl;
        Object obj = objArr[i];
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr, i, i + 1, this.WinterFlowTransactionManagerStrategy);
        Object[] objArr2 = this.WinterFlowVariableVersionControl;
        int i2 = this.WinterFlowTransactionManagerStrategy - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.WinterFlowTransactionManagerStrategy--;
        return obj;
    }

    public final int WinterFlowTransactionAgent(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.WinterFlowVariableVersionControl;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.WinterFlowVariableVersionControl;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr, i + i4, i2 + i, this.WinterFlowTransactionManagerStrategy);
        Object[] objArr3 = this.WinterFlowVariableVersionControl;
        int i7 = this.WinterFlowTransactionManagerStrategy;
        WinterFlowHandlerWebsocket.WinterFlowSoftwareEngine(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.WinterFlowTransactionManagerStrategy -= i6;
        return i6;
    }

    public final void WinterFlowTransactionManagerStrategy(int i, Object obj) {
        ((AbstractList) this).modCount++;
        WinterFlowRouterRouter(i, 1);
        this.WinterFlowVariableVersionControl[i] = obj;
    }

    public final void WinterFlowUnitTestResponse() {
        if (this.WinterFlowUnitTestResponse) {
            throw new UnsupportedOperationException();
        }
    }

    public final void WinterFlowVariableVersionControl(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        WinterFlowRouterRouter(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.WinterFlowVariableVersionControl[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        WinterFlowUnitTestResponse();
        int i2 = this.WinterFlowTransactionManagerStrategy;
        if (i < 0 || i > i2) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        WinterFlowRouterRouter(i, 1);
        this.WinterFlowVariableVersionControl[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        WinterFlowUnitTestResponse();
        int i2 = this.WinterFlowTransactionManagerStrategy;
        if (i < 0 || i > i2) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        WinterFlowVariableVersionControl(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        WinterFlowUnitTestResponse();
        WinterFlowResponseEngine(0, this.WinterFlowTransactionManagerStrategy);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.WinterFlowVariableVersionControl;
            int i = this.WinterFlowTransactionManagerStrategy;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (WinterFlowManagerRequest.WinterFlowThreadListener(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.WinterFlowTransactionManagerStrategy;
        if (i >= 0 && i < i2) {
            return this.WinterFlowVariableVersionControl[i];
        }
        WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.WinterFlowVariableVersionControl;
        int i = this.WinterFlowTransactionManagerStrategy;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.WinterFlowTransactionManagerStrategy; i++) {
            if (WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.WinterFlowTransactionManagerStrategy == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.WinterFlowTransactionManagerStrategy - 1; i >= 0; i--) {
            if (WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.WinterFlowTransactionManagerStrategy;
        if (i >= 0 && i <= i2) {
            return new WinterFlowClassAlgorithm(this, i);
        }
        WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        WinterFlowUnitTestResponse();
        return WinterFlowTransactionAgent(0, this.WinterFlowTransactionManagerStrategy, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        WinterFlowUnitTestResponse();
        return WinterFlowTransactionAgent(0, this.WinterFlowTransactionManagerStrategy, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        WinterFlowUnitTestResponse();
        int i2 = this.WinterFlowTransactionManagerStrategy;
        if (i < 0 || i >= i2) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.WinterFlowVariableVersionControl;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        WinterFlowInvokerComponent.WinterFlowBandwidthObject(i, i2, this.WinterFlowTransactionManagerStrategy);
        return new WinterFlowQueueAlgorithm(this.WinterFlowVariableVersionControl, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.WinterFlowTransactionManagerStrategy;
        Object[] objArr2 = this.WinterFlowVariableVersionControl;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr2, objArr, 0, 0, i);
        int i2 = this.WinterFlowTransactionManagerStrategy;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return WinterFlowHandlerWebsocket.WinterFlowTestingNode(this.WinterFlowVariableVersionControl, 0, this.WinterFlowTransactionManagerStrategy, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        WinterFlowUnitTestResponse();
        int i = this.WinterFlowTransactionManagerStrategy;
        ((AbstractList) this).modCount++;
        WinterFlowRouterRouter(i, 1);
        this.WinterFlowVariableVersionControl[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return WinterFlowProtocolPipeline.WinterFlowCacheTool(this.WinterFlowVariableVersionControl, 0, this.WinterFlowTransactionManagerStrategy);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        WinterFlowUnitTestResponse();
        int size = collection.size();
        WinterFlowVariableVersionControl(this.WinterFlowTransactionManagerStrategy, collection, size);
        return size > 0;
    }
}
