package androidx.versionedparcelable;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class MysticCacheGatewayEncoderWAVQcXhODoTkb6nT2z39370371047975 implements Collection, LunarNodeContextRuntimeSCpyKGDYBhqjPXAetg19809747678198 {
    public final boolean LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final Object[] RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public MysticCacheGatewayEncoderWAVQcXhODoTkb6nT2z39370371047975(Object[] objArr, boolean z) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = objArr;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = z;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return UltraBufferReflectionIteratorDCj5uMRQKfZqzNQpoG49620106397267.DeltaSignalPrefixDelegateOKrpGQ6v30XWLJQ9fy84286487006325(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (UltraBufferReflectionIteratorDCj5uMRQKfZqzNQpoG49620106397267.DeltaSignalPrefixDelegateOKrpGQ6v30XWLJQ9fy84286487006325(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, it.next()) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ArcticByteBinaryCompressionKwZmbP1ar0amViYotf74728707286763(1, this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        copyOf.getClass();
        return copyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(this, objArr);
    }
}
