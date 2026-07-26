package android.content.Context;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMenuCosmosNeo4048 implements Collection, FrostHunterContextBlazePrimeMax4967 {
    public final FrostHunterToastHyperTitanThunder2275 FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterMenuCosmosNeo4048(FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275) {
        frostHunterToastHyperTitanThunder2275.getClass();
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterToastHyperTitanThunder2275;
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
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceEliteCelestialThunder1757(obj);
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
            if (!this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceEliteCelestialThunder1757(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterFlowMaxDragonHero5809();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return FrostHunterLooperThreadStormCyberElite6638.FrostHunterAlertDialogAuroraDelta3200(new FrostHunterLifecycleCameraControllerEpicOlympianGamma3500(this, null, 3));
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
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLifecycleBlazeGammaElite2889;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return FrostHunterExecutorSolarPhoenix3849.FrostHunterPagingSourceEclipseDelta8255(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return FrostHunterExecutorSolarPhoenix3849.FrostHunterPermissionInfoAlphaDelta6279(this);
    }
}
