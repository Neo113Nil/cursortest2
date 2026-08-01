package com.google.android.datatransport;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConsumerDecorator implements WinterFlowCompilerNetwork, Set, WinterFlowLoaderProcess {
    public final WinterFlowLibraryProcess WinterFlowTransactionManagerStrategy;
    public final WinterFlowLibraryProcess WinterFlowVariableVersionControl;

    public WinterFlowConsumerDecorator(WinterFlowLibraryProcess winterFlowLibraryProcess) {
        this.WinterFlowVariableVersionControl = winterFlowLibraryProcess;
        this.WinterFlowTransactionManagerStrategy = winterFlowLibraryProcess;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        WinterFlowLibraryProcess winterFlowLibraryProcess = this.WinterFlowTransactionManagerStrategy;
        int i = winterFlowLibraryProcess.WinterFlowUnitTestResponse;
        for (Object obj : collection) {
            int WinterFlowArrayNetwork = winterFlowLibraryProcess.WinterFlowArrayNetwork(obj);
            winterFlowLibraryProcess.WinterFlowHookDataSource[WinterFlowArrayNetwork] = obj;
            long[] jArr = winterFlowLibraryProcess.WinterFlowCacheManagerAgent;
            int i2 = winterFlowLibraryProcess.WinterFlowArrayNetwork;
            jArr[WinterFlowArrayNetwork] = (i2 & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((WinterFlowArrayNetwork & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            winterFlowLibraryProcess.WinterFlowArrayNetwork = WinterFlowArrayNetwork;
            if (winterFlowLibraryProcess.WinterFlowVariableVersionControl == Integer.MAX_VALUE) {
                winterFlowLibraryProcess.WinterFlowVariableVersionControl = WinterFlowArrayNetwork;
            }
        }
        return i != winterFlowLibraryProcess.WinterFlowUnitTestResponse;
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
        if (obj == null || WinterFlowConsumerDecorator.class != obj.getClass()) {
            return false;
        }
        return this.WinterFlowVariableVersionControl.equals(((WinterFlowConsumerDecorator) obj).WinterFlowVariableVersionControl);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.WinterFlowVariableVersionControl.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new WinterFlowNetworkHelper(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        r15 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        int i2;
        collection.getClass();
        WinterFlowLibraryProcess winterFlowLibraryProcess = this.WinterFlowTransactionManagerStrategy;
        int i3 = winterFlowLibraryProcess.WinterFlowUnitTestResponse;
        Iterator it = collection.iterator();
        while (true) {
            int i4 = 1;
            int i5 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int hashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 & 127;
            int i8 = winterFlowLibraryProcess.WinterFlowTransactionManagerStrategy;
            int i9 = (i6 >>> 7) & i8;
            while (true) {
                long[] jArr = winterFlowLibraryProcess.WinterFlowRouterStructure;
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                long j = ((jArr[i10 + i4] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
                long j2 = (i7 * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j3 == 0) {
                        break;
                    }
                    i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i9) & i8;
                    int i12 = i4;
                    if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowLibraryProcess.WinterFlowHookDataSource[i2], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i4 = i12;
                }
                i5 += 8;
                i9 = (i9 + i5) & i8;
                i4 = i;
            }
            if (i2 >= 0) {
                winterFlowLibraryProcess.WinterFlowRouterRouter(i2);
            }
        }
        return i3 != winterFlowLibraryProcess.WinterFlowUnitTestResponse;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.WinterFlowTransactionManagerStrategy.WinterFlowSyntax(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse;
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
