package android.content.Context;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterServiceFusionAurora8336 implements Collection, FrostHunterContextBlazePrimeMax4967 {
    public final Object[] FrostHunterCameraXPixelTurboCosmos9814;
    public final boolean FrostHunterFlowMaxDragonHero5809;

    public FrostHunterServiceFusionAurora8336(Object[] objArr, boolean z) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = objArr;
        this.FrostHunterFlowMaxDragonHero5809 = z;
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
        return FrostHunterContextSolarMegaPhantom7469.FrostHunterSoundPoolNovaTitanTitan5784(this.FrostHunterCameraXPixelTurboCosmos9814, obj);
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
            if (!FrostHunterContextSolarMegaPhantom7469.FrostHunterSoundPoolNovaTitanTitan5784(this.FrostHunterCameraXPixelTurboCosmos9814, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new FrostHunterRoomDaoHyperFusionCelestial1775(this.FrostHunterCameraXPixelTurboCosmos9814);
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
        return this.FrostHunterCameraXPixelTurboCosmos9814.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (this.FrostHunterFlowMaxDragonHero5809 && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        copyOf.getClass();
        return copyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return FrostHunterExecutorSolarPhoenix3849.FrostHunterPagingSourceEclipseDelta8255(this, objArr);
    }
}
