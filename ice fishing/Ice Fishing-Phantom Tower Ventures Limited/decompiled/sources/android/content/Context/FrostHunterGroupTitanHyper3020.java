package android.content.Context;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGroupTitanHyper3020 implements List, FrostHunterContextBlazePrimeMax4967 {
    public final FrostHunterOrientationSensorPhoenixOmegaStorm9585 FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterOrientationSensorPhoenixOmegaStorm9585(16);
    public final FrostHunterLayoutInflaterEpicForceAurora7762 FrostHunterFlowMaxDragonHero5809 = new FrostHunterLayoutInflaterEpicForceAurora7762(16);
    public int FrostHunterAlertDialogAuroraDelta3200 = -1;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long FrostHunterAlphaAnimationNeoCosmos5761() {
        long FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterExecutorSolarPhoenix3849.FrostHunterConstraintSetCloneMasterUltraRogue2633(Float.POSITIVE_INFINITY, false, false);
        int i = this.FrostHunterAlertDialogAuroraDelta3200 + 1;
        int i2 = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterConstraintSetCloneMasterUltraRogue2633 - 1;
        if (i > i2) {
            return FrostHunterConstraintSetCloneMasterUltraRogue2633;
        }
        while (true) {
            FrostHunterLayoutInflaterEpicForceAurora7762 frostHunterLayoutInflaterEpicForceAurora7762 = this.FrostHunterFlowMaxDragonHero5809;
            if (i < 0) {
                frostHunterLayoutInflaterEpicForceAurora7762.getClass();
                break;
            }
            if (i >= frostHunterLayoutInflaterEpicForceAurora7762.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                break;
            }
            long j = frostHunterLayoutInflaterEpicForceAurora7762.FrostHunterAlphaAnimationNeoCosmos5761[i];
            if (FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFragmentBetaMegaVortex6025(j, FrostHunterConstraintSetCloneMasterUltraRogue2633) < 0) {
                FrostHunterConstraintSetCloneMasterUltraRogue2633 = j;
            }
            if ((FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterLooperThreadBetaHyperionMax1000(FrostHunterConstraintSetCloneMasterUltraRogue2633) >= 0.0f || !FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterMeteringPointBetaCyber9571(FrostHunterConstraintSetCloneMasterUltraRogue2633)) && i != i2) {
                i++;
            }
        }
        FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889("Index must be between 0 and size");
        return 0L;
    }

    public final void FrostHunterBundlePulseFusionHero2475(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterKeyframeGammaGamma1197(i, i2);
        FrostHunterLayoutInflaterEpicForceAurora7762 frostHunterLayoutInflaterEpicForceAurora7762 = this.FrostHunterFlowMaxDragonHero5809;
        if (i >= 0) {
            int i3 = frostHunterLayoutInflaterEpicForceAurora7762.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("The end index must be < start index");
                    return;
                } else {
                    if (i2 != i) {
                        if (i2 < i3) {
                            long[] jArr = frostHunterLayoutInflaterEpicForceAurora7762.FrostHunterAlphaAnimationNeoCosmos5761;
                            FrostHunterContextSolarMegaPhantom7469.FrostHunterImageAnalysisGammaOlympian2400(jArr, jArr, i, i2, i3);
                        }
                        frostHunterLayoutInflaterEpicForceAurora7762.FrostHunterConstraintSetCloneMasterUltraRogue2633 -= i2 - i;
                        return;
                    }
                    return;
                }
            }
        } else {
            frostHunterLayoutInflaterEpicForceAurora7762.getClass();
        }
        FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889("Index must be between 0 and size");
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
        this.FrostHunterAlertDialogAuroraDelta3200 = -1;
        this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475();
        this.FrostHunterFlowMaxDragonHero5809.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 0;
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
        Object FrostHunterLifecycleBlazeGammaElite2889 = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLifecycleBlazeGammaElite2889(i);
        FrostHunterLifecycleBlazeGammaElite2889.getClass();
        return (FrostHunterGradientDrawablePulseDragonInferno9637) FrostHunterLifecycleBlazeGammaElite2889;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof FrostHunterGradientDrawablePulseDragonInferno9637)) {
            return -1;
        }
        FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637 = (FrostHunterGradientDrawablePulseDragonInferno9637) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLifecycleBlazeGammaElite2889(i), frostHunterGradientDrawablePulseDragonInferno9637)) {
                if (i != size) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new FrostHunterMapInfernoPhantom9484(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof FrostHunterGradientDrawablePulseDragonInferno9637)) {
            return -1;
        }
        FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637 = (FrostHunterGradientDrawablePulseDragonInferno9637) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLifecycleBlazeGammaElite2889(size), frostHunterGradientDrawablePulseDragonInferno9637)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new FrostHunterMapInfernoPhantom9484(this, 0, 7);
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
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new FrostHunterLooperThreadStormStrike9360(this, i, i2);
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

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new FrostHunterMapInfernoPhantom9484(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
