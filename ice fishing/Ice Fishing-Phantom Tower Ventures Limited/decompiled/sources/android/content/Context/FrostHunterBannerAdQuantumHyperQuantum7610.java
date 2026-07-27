package android.content.Context;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBannerAdQuantumHyperQuantum7610 implements Set {
    public final /* synthetic */ FrostHunterViewPager2SpectraForceVortex4544 FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterBannerAdQuantumHyperQuantum7610(FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterViewPager2SpectraForceVortex4544;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.FrostHunterCameraXPixelTurboCosmos9814.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterFlowMaxDragonHero5809(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (frostHunterViewPager2SpectraForceVortex4544.FrostHunterAlertDialogAuroraDelta3200 == set.size()) {
                return frostHunterViewPager2SpectraForceVortex4544.FrostHunterFlowMaxDragonHero5809(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i = 0;
        for (int i2 = frostHunterViewPager2SpectraForceVortex4544.FrostHunterAlertDialogAuroraDelta3200 - 1; i2 >= 0; i2--) {
            Object FrostHunterLifecycleBlazeGammaElite2889 = frostHunterViewPager2SpectraForceVortex4544.FrostHunterLifecycleBlazeGammaElite2889(i2);
            i += FrostHunterLifecycleBlazeGammaElite2889 == null ? 0 : FrostHunterLifecycleBlazeGammaElite2889.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new FrostHunterSharedElementEliteMaster1810(this.FrostHunterCameraXPixelTurboCosmos9814, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int FrostHunterBundlePulseFusionHero2475 = frostHunterViewPager2SpectraForceVortex4544.FrostHunterBundlePulseFusionHero2475(obj);
        if (FrostHunterBundlePulseFusionHero2475 < 0) {
            return false;
        }
        frostHunterViewPager2SpectraForceVortex4544.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterBundlePulseFusionHero2475);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlertDialogAuroraDelta3200(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i = frostHunterViewPager2SpectraForceVortex4544.FrostHunterAlertDialogAuroraDelta3200;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(frostHunterViewPager2SpectraForceVortex4544.FrostHunterLifecycleBlazeGammaElite2889(i2))) {
                frostHunterViewPager2SpectraForceVortex4544.FrostHunterLevelListDrawableFusionDragonHero2232(i2);
            }
        }
        return i != frostHunterViewPager2SpectraForceVortex4544.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i = frostHunterViewPager2SpectraForceVortex4544.FrostHunterAlertDialogAuroraDelta3200;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = frostHunterViewPager2SpectraForceVortex4544.FrostHunterLifecycleBlazeGammaElite2889(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i = frostHunterViewPager2SpectraForceVortex4544.FrostHunterAlertDialogAuroraDelta3200;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = frostHunterViewPager2SpectraForceVortex4544.FrostHunterLifecycleBlazeGammaElite2889(i2);
        }
        return objArr;
    }
}
