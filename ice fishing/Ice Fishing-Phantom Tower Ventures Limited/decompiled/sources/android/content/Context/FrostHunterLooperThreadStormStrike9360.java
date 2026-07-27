package android.content.Context;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLooperThreadStormStrike9360 implements List, FrostHunterContextBlazePrimeMax4967 {
    public final /* synthetic */ FrostHunterGroupTitanHyper3020 FrostHunterAlertDialogAuroraDelta3200;
    public final int FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterLooperThreadStormStrike9360(FrostHunterGroupTitanHyper3020 frostHunterGroupTitanHyper3020, int i, int i2) {
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterGroupTitanHyper3020;
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = i2;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof FrostHunterGradientDrawablePulseDragonInferno9637) && indexOf((FrostHunterGradientDrawablePulseDragonInferno9637) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((FrostHunterGradientDrawablePulseDragonInferno9637) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object FrostHunterLifecycleBlazeGammaElite2889 = this.FrostHunterAlertDialogAuroraDelta3200.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLifecycleBlazeGammaElite2889(i + this.FrostHunterCameraXPixelTurboCosmos9814);
        FrostHunterLifecycleBlazeGammaElite2889.getClass();
        return (FrostHunterGradientDrawablePulseDragonInferno9637) FrostHunterLifecycleBlazeGammaElite2889;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof FrostHunterGradientDrawablePulseDragonInferno9637)) {
            return -1;
        }
        FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637 = (FrostHunterGradientDrawablePulseDragonInferno9637) obj;
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i2 = this.FrostHunterFlowMaxDragonHero5809;
        if (i > i2) {
            return -1;
        }
        int i3 = i;
        while (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterAlertDialogAuroraDelta3200.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLifecycleBlazeGammaElite2889(i3), frostHunterGradientDrawablePulseDragonInferno9637)) {
            if (i3 == i2) {
                return -1;
            }
            i3++;
        }
        return i3 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        return new FrostHunterMapInfernoPhantom9484(this.FrostHunterAlertDialogAuroraDelta3200, i, i, this.FrostHunterFlowMaxDragonHero5809);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof FrostHunterGradientDrawablePulseDragonInferno9637)) {
            return -1;
        }
        FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637 = (FrostHunterGradientDrawablePulseDragonInferno9637) obj;
        int i = this.FrostHunterFlowMaxDragonHero5809;
        int i2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i2 > i) {
            return -1;
        }
        while (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterAlertDialogAuroraDelta3200.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLifecycleBlazeGammaElite2889(i), frostHunterGradientDrawablePulseDragonInferno9637)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i3 = this.FrostHunterFlowMaxDragonHero5809;
        return new FrostHunterMapInfernoPhantom9484(this.FrostHunterAlertDialogAuroraDelta3200, i + i2, i2, i3);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.FrostHunterFlowMaxDragonHero5809 - this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.FrostHunterCameraXPixelTurboCosmos9814;
        return new FrostHunterLooperThreadStormStrike9360(this.FrostHunterAlertDialogAuroraDelta3200, i + i3, i3 + i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return FrostHunterExecutorSolarPhoenix3849.FrostHunterPermissionInfoAlphaDelta6279(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return FrostHunterExecutorSolarPhoenix3849.FrostHunterPagingSourceEclipseDelta8255(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        return new FrostHunterMapInfernoPhantom9484(this.FrostHunterAlertDialogAuroraDelta3200, i, i, this.FrostHunterFlowMaxDragonHero5809);
    }
}
