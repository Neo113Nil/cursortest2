package com.google.android.datatransport;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProcessorDeserialization implements WinterFlowCompilerNetwork, Set, WinterFlowLoaderProcess {
    public final WinterFlowCacheManagerTransactionManager WinterFlowTransactionManagerStrategy;
    public final WinterFlowCacheManagerTransactionManager WinterFlowVariableVersionControl;

    public WinterFlowProcessorDeserialization(WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager) {
        this.WinterFlowVariableVersionControl = winterFlowCacheManagerTransactionManager;
        this.WinterFlowTransactionManagerStrategy = winterFlowCacheManagerTransactionManager;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = this.WinterFlowTransactionManagerStrategy;
        int i = winterFlowCacheManagerTransactionManager.WinterFlowArrayNetwork;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            winterFlowCacheManagerTransactionManager.WinterFlowTransactionAgent(it.next());
        }
        return i != winterFlowCacheManagerTransactionManager.WinterFlowArrayNetwork;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WinterFlowProcessorDeserialization.class != obj.getClass()) {
            return false;
        }
        return this.WinterFlowVariableVersionControl.equals(((WinterFlowProcessorDeserialization) obj).WinterFlowVariableVersionControl);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.WinterFlowVariableVersionControl.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new WinterFlowNetworkHelper(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.WinterFlowTransactionManagerStrategy.WinterFlowServerProtocol(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = this.WinterFlowTransactionManagerStrategy;
        int i = winterFlowCacheManagerTransactionManager.WinterFlowArrayNetwork;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            winterFlowCacheManagerTransactionManager.WinterFlowSyntax(it.next());
        }
        return i != winterFlowCacheManagerTransactionManager.WinterFlowArrayNetwork;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = this.WinterFlowTransactionManagerStrategy;
        Object[] objArr = winterFlowCacheManagerTransactionManager.WinterFlowHookDataSource;
        int i = winterFlowCacheManagerTransactionManager.WinterFlowArrayNetwork;
        long[] jArr = winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!WinterFlowSerializerUtility.WinterFlowVersionControlModule(collection, objArr[i5])) {
                                winterFlowCacheManagerTransactionManager.WinterFlowThreadListener(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != winterFlowCacheManagerTransactionManager.WinterFlowArrayNetwork;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.WinterFlowVariableVersionControl.WinterFlowArrayNetwork;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return WinterFlowTestingCloud.WinterFlowSoftwareEngine(this, objArr);
    }

    public final String toString() {
        return this.WinterFlowVariableVersionControl.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return WinterFlowTestingCloud.WinterFlowUserManagerUserManager(this);
    }
}
