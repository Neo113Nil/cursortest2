package androidx.versionedparcelable;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class DragonRouteStorageLambdaHkyjD6E6nhE2uWRlS477398959758048 implements Collection, LunarNodeContextRuntimeSCpyKGDYBhqjPXAetg19809747678198 {
    public abstract int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();

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

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() == 0;
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
    public final /* bridge */ int size() {
        return ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.IronMatrixDecoderBufferRgE6GuhvwNZRVzXhww42880111075685(this, objArr);
    }

    public final String toString() {
        return PhotonFrameCacheIteratorNT4p7hb6YuwN0bTVCX57485104735039.CosmicForgeCacheForeachQhbUGFcmZ66JxovpTJ16605778904286(this, ", ", "[", "]", new MysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942(0, this), 24);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.HeliosRuntimeClassProviderFABQ5d2rErfEnvDVi231062942123295(this);
    }
}
