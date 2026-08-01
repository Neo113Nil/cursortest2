package com.google.android.datatransport;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRepositoryDatabase implements Collection, Set, WinterFlowLoaderProcess, WinterFlowCompilerNetwork {
    public Object[] WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;
    public int[] WinterFlowVariableVersionControl;

    public WinterFlowRepositoryDatabase(int i) {
        this.WinterFlowVariableVersionControl = WinterFlowHandlerWebsocket.WinterFlowVariableVersionControl;
        this.WinterFlowTransactionManagerStrategy = WinterFlowHandlerWebsocket.WinterFlowUnitTestResponse;
        if (i > 0) {
            this.WinterFlowVariableVersionControl = new int[i];
            this.WinterFlowTransactionManagerStrategy = new Object[i];
        }
    }

    public final Object WinterFlowRouterStructure(int i) {
        int i2 = this.WinterFlowUnitTestResponse;
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.WinterFlowVariableVersionControl;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                WinterFlowProtocolPipeline.WinterFlowCompilerHandler(iArr, iArr, i, i4, i2);
                Object[] objArr2 = this.WinterFlowTransactionManagerStrategy;
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr2, objArr2, i, i4, i2);
            }
            this.WinterFlowTransactionManagerStrategy[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.WinterFlowVariableVersionControl = iArr2;
            this.WinterFlowTransactionManagerStrategy = new Object[i5];
            if (i > 0) {
                WinterFlowProtocolPipeline.WinterFlowUIMiddleware(iArr, iArr2, 0, i, 6);
                WinterFlowProtocolPipeline.WinterFlowQueueService(objArr, this.WinterFlowTransactionManagerStrategy, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                WinterFlowProtocolPipeline.WinterFlowCompilerHandler(iArr, this.WinterFlowVariableVersionControl, i, i6, i2);
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, this.WinterFlowTransactionManagerStrategy, i, i6, i2);
            }
        }
        if (i2 != this.WinterFlowUnitTestResponse) {
            throw new ConcurrentModificationException();
        }
        this.WinterFlowUnitTestResponse = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int WinterFlowBackendCacheManager;
        int i2 = this.WinterFlowUnitTestResponse;
        if (obj == null) {
            WinterFlowBackendCacheManager = WinterFlowHandlerWebsocket.WinterFlowBackendCacheManager(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            WinterFlowBackendCacheManager = WinterFlowHandlerWebsocket.WinterFlowBackendCacheManager(this, obj, hashCode);
        }
        if (WinterFlowBackendCacheManager >= 0) {
            return false;
        }
        int i3 = ~WinterFlowBackendCacheManager;
        int[] iArr = this.WinterFlowVariableVersionControl;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.WinterFlowTransactionManagerStrategy;
            int[] iArr2 = new int[i4];
            this.WinterFlowVariableVersionControl = iArr2;
            this.WinterFlowTransactionManagerStrategy = new Object[i4];
            if (i2 != this.WinterFlowUnitTestResponse) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                WinterFlowProtocolPipeline.WinterFlowUIMiddleware(iArr, iArr2, 0, iArr.length, 6);
                WinterFlowProtocolPipeline.WinterFlowQueueService(objArr, this.WinterFlowTransactionManagerStrategy, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.WinterFlowVariableVersionControl;
            int i5 = i3 + 1;
            WinterFlowProtocolPipeline.WinterFlowCompilerHandler(iArr3, iArr3, i5, i3, i2);
            Object[] objArr2 = this.WinterFlowTransactionManagerStrategy;
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.WinterFlowUnitTestResponse;
        if (i2 == i6) {
            int[] iArr4 = this.WinterFlowVariableVersionControl;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.WinterFlowTransactionManagerStrategy[i3] = obj;
                this.WinterFlowUnitTestResponse = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.WinterFlowUnitTestResponse;
        int i = this.WinterFlowUnitTestResponse;
        int[] iArr = this.WinterFlowVariableVersionControl;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.WinterFlowTransactionManagerStrategy;
            int[] iArr2 = new int[size];
            this.WinterFlowVariableVersionControl = iArr2;
            this.WinterFlowTransactionManagerStrategy = new Object[size];
            if (i > 0) {
                WinterFlowProtocolPipeline.WinterFlowUIMiddleware(iArr, iArr2, 0, i, 6);
                WinterFlowProtocolPipeline.WinterFlowQueueService(objArr, this.WinterFlowTransactionManagerStrategy, 0, this.WinterFlowUnitTestResponse, 6);
            }
        }
        if (this.WinterFlowUnitTestResponse != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.WinterFlowUnitTestResponse;
        if (i != 0) {
            this.WinterFlowVariableVersionControl = WinterFlowHandlerWebsocket.WinterFlowVariableVersionControl;
            this.WinterFlowTransactionManagerStrategy = WinterFlowHandlerWebsocket.WinterFlowUnitTestResponse;
            i = 0;
            this.WinterFlowUnitTestResponse = 0;
        }
        if (i != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? WinterFlowHandlerWebsocket.WinterFlowBackendCacheManager(this, null, 0) : WinterFlowHandlerWebsocket.WinterFlowBackendCacheManager(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.WinterFlowUnitTestResponse != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.WinterFlowUnitTestResponse;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.WinterFlowTransactionManagerStrategy[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.WinterFlowVariableVersionControl;
        int i = this.WinterFlowUnitTestResponse;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.WinterFlowUnitTestResponse <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new WinterFlowRendererComponent(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int WinterFlowBackendCacheManager = obj == null ? WinterFlowHandlerWebsocket.WinterFlowBackendCacheManager(this, null, 0) : WinterFlowHandlerWebsocket.WinterFlowBackendCacheManager(this, obj, obj.hashCode());
        if (WinterFlowBackendCacheManager < 0) {
            return false;
        }
        WinterFlowRouterStructure(WinterFlowBackendCacheManager);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.WinterFlowUnitTestResponse - 1; -1 < i; i--) {
            if (!WinterFlowSerializerUtility.WinterFlowVersionControlModule(collection, this.WinterFlowTransactionManagerStrategy[i])) {
                WinterFlowRouterStructure(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.WinterFlowUnitTestResponse;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.WinterFlowUnitTestResponse;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(this.WinterFlowTransactionManagerStrategy, objArr, 0, 0, this.WinterFlowUnitTestResponse);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.WinterFlowUnitTestResponse * 14);
        sb.append('{');
        int i = this.WinterFlowUnitTestResponse;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.WinterFlowTransactionManagerStrategy[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return WinterFlowProtocolPipeline.WinterFlowCacheTool(this.WinterFlowTransactionManagerStrategy, 0, this.WinterFlowUnitTestResponse);
    }
}
