package android.content.Context;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterStateListAnimatorSolarNebulaElite7421 implements List, FrostHunterModelInputOutputCyberSpectra6508 {
    public int FrostHunterAlertDialogAuroraDelta3200;
    public final List FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterStateListAnimatorSolarNebulaElite7421(int i, int i2, List list) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = list;
        this.FrostHunterFlowMaxDragonHero5809 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814.add(i + this.FrostHunterFlowMaxDragonHero5809, obj);
        this.FrostHunterAlertDialogAuroraDelta3200++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.FrostHunterCameraXPixelTurboCosmos9814.addAll(i + this.FrostHunterFlowMaxDragonHero5809, collection);
        int size = collection.size();
        this.FrostHunterAlertDialogAuroraDelta3200 += size;
        return size > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.FrostHunterAlertDialogAuroraDelta3200 - 1;
        int i2 = this.FrostHunterFlowMaxDragonHero5809;
        if (i2 <= i) {
            while (true) {
                this.FrostHunterCameraXPixelTurboCosmos9814.remove(i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.FrostHunterAlertDialogAuroraDelta3200 = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        for (int i2 = this.FrostHunterFlowMaxDragonHero5809; i2 < i; i2++) {
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterCameraXPixelTurboCosmos9814.get(i2), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        FrostHunterAnimatorSetSparkMaxPixel7304.FrostHunterAlphaAnimationNeoCosmos5761(i, this);
        return this.FrostHunterCameraXPixelTurboCosmos9814.get(i + this.FrostHunterFlowMaxDragonHero5809);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        int i2 = this.FrostHunterFlowMaxDragonHero5809;
        for (int i3 = i2; i3 < i; i3++) {
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterCameraXPixelTurboCosmos9814.get(i3), obj)) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.FrostHunterAlertDialogAuroraDelta3200 == this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new FrostHunterExoPlayerBlazeAuroraPixel5681(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.FrostHunterAlertDialogAuroraDelta3200 - 1;
        int i2 = this.FrostHunterFlowMaxDragonHero5809;
        if (i2 > i) {
            return -1;
        }
        while (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterCameraXPixelTurboCosmos9814.get(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new FrostHunterExoPlayerBlazeAuroraPixel5681(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        for (int i2 = this.FrostHunterFlowMaxDragonHero5809; i2 < i; i2++) {
            List list = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(list.get(i2), obj)) {
                list.remove(i2);
                this.FrostHunterAlertDialogAuroraDelta3200--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        int i2 = i - 1;
        int i3 = this.FrostHunterFlowMaxDragonHero5809;
        if (i3 <= i2) {
            while (true) {
                List list = this.FrostHunterCameraXPixelTurboCosmos9814;
                if (!collection.contains(list.get(i2))) {
                    list.remove(i2);
                    this.FrostHunterAlertDialogAuroraDelta3200--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return i != this.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        FrostHunterAnimatorSetSparkMaxPixel7304.FrostHunterAlphaAnimationNeoCosmos5761(i, this);
        return this.FrostHunterCameraXPixelTurboCosmos9814.set(i + this.FrostHunterFlowMaxDragonHero5809, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.FrostHunterAlertDialogAuroraDelta3200 - this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        FrostHunterAnimatorSetSparkMaxPixel7304.FrostHunterConstraintSetCloneMasterUltraRogue2633(i, i2, this);
        return new FrostHunterStateListAnimatorSolarNebulaElite7421(i, i2, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return FrostHunterExecutorSolarPhoenix3849.FrostHunterPermissionInfoAlphaDelta6279(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return FrostHunterExecutorSolarPhoenix3849.FrostHunterPagingSourceEclipseDelta8255(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new FrostHunterExoPlayerBlazeAuroraPixel5681(i, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        this.FrostHunterAlertDialogAuroraDelta3200 = i + 1;
        this.FrostHunterCameraXPixelTurboCosmos9814.add(i, obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.FrostHunterCameraXPixelTurboCosmos9814.addAll(this.FrostHunterAlertDialogAuroraDelta3200, collection);
        int size = collection.size();
        this.FrostHunterAlertDialogAuroraDelta3200 += size;
        return size > 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        FrostHunterAnimatorSetSparkMaxPixel7304.FrostHunterAlphaAnimationNeoCosmos5761(i, this);
        this.FrostHunterAlertDialogAuroraDelta3200--;
        return this.FrostHunterCameraXPixelTurboCosmos9814.remove(i + this.FrostHunterFlowMaxDragonHero5809);
    }
}
