package androidx.versionedparcelable;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class WhiteFieldCallbackInterfaceIy4zUzpM77Norzu3Mv54778487831837 implements Set, LunarNodeContextRuntimeSCpyKGDYBhqjPXAetg19809747678198 {
    public final AxiomCoreBuilderPipelineBkmf1o9Y3FMuhc9teK20763434581634 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public WhiteFieldCallbackInterfaceIy4zUzpM77Norzu3Mv54778487831837(AxiomCoreBuilderPipelineBkmf1o9Y3FMuhc9teK20763434581634 axiomCoreBuilderPipelineBkmf1o9Y3FMuhc9teK20763434581634) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = axiomCoreBuilderPipelineBkmf1o9Y3FMuhc9teK20763434581634;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return ArcticByteProcessorCompressionLMUCZsNpuPxKIs0RXh87323342817578.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(new ArcticByteForeachTranspilerRKiV60XIc3Dwm86zWg47591525511633(this, null, 2));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.HeliosRuntimeClassProviderFABQ5d2rErfEnvDVi231062942123295(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(this, objArr);
    }
}
