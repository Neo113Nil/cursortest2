package android.content.Context;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAccelerometerFusionHyperionPhantom3600 implements Collection {
    public final /* synthetic */ FrostHunterViewPager2SpectraForceVortex4544 FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterAccelerometerFusionHyperionPhantom3600(FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterViewPager2SpectraForceVortex4544;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.FrostHunterCameraXPixelTurboCosmos9814.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new FrostHunterSharedElementEliteMaster1810(this.FrostHunterCameraXPixelTurboCosmos9814, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterViewPager2SpectraForceVortex4544.FrostHunterAlphaAnimationNeoCosmos5761(obj);
        if (FrostHunterAlphaAnimationNeoCosmos5761 < 0) {
            return false;
        }
        frostHunterViewPager2SpectraForceVortex4544.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterAlphaAnimationNeoCosmos5761);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i = frostHunterViewPager2SpectraForceVortex4544.FrostHunterAlertDialogAuroraDelta3200;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(frostHunterViewPager2SpectraForceVortex4544.FrostHunterCameraXPixelTurboCosmos9814(i2))) {
                frostHunterViewPager2SpectraForceVortex4544.FrostHunterLevelListDrawableFusionDragonHero2232(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i = frostHunterViewPager2SpectraForceVortex4544.FrostHunterAlertDialogAuroraDelta3200;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(frostHunterViewPager2SpectraForceVortex4544.FrostHunterCameraXPixelTurboCosmos9814(i2))) {
                frostHunterViewPager2SpectraForceVortex4544.FrostHunterLevelListDrawableFusionDragonHero2232(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i = frostHunterViewPager2SpectraForceVortex4544.FrostHunterAlertDialogAuroraDelta3200;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = frostHunterViewPager2SpectraForceVortex4544.FrostHunterCameraXPixelTurboCosmos9814(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i = frostHunterViewPager2SpectraForceVortex4544.FrostHunterAlertDialogAuroraDelta3200;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = frostHunterViewPager2SpectraForceVortex4544.FrostHunterCameraXPixelTurboCosmos9814(i2);
        }
        return objArr;
    }
}
