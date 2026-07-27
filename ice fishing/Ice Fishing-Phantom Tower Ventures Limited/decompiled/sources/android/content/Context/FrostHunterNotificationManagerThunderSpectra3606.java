package android.content.Context;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterNotificationManagerThunderSpectra3606 implements FrostHunterConfigurationSpectraPhoenixCosmos6141, Set, FrostHunterContextBlazePrimeMax4967 {
    public final FrostHunterToolbarHeroNovaX1020 FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterToolbarHeroNovaX1020 FrostHunterFlowMaxDragonHero5809;

    public FrostHunterNotificationManagerThunderSpectra3606(FrostHunterToolbarHeroNovaX1020 frostHunterToolbarHeroNovaX1020) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterToolbarHeroNovaX1020;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterToolbarHeroNovaX1020;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.FrostHunterFlowMaxDragonHero5809.FrostHunterAlphaAnimationNeoCosmos5761(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        FrostHunterToolbarHeroNovaX1020 frostHunterToolbarHeroNovaX1020 = this.FrostHunterFlowMaxDragonHero5809;
        int i = frostHunterToolbarHeroNovaX1020.FrostHunterServiceEliteCelestialThunder1757;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            frostHunterToolbarHeroNovaX1020.FrostHunterAlertDialogAuroraDelta3200(it.next());
        }
        return i != frostHunterToolbarHeroNovaX1020.FrostHunterServiceEliteCelestialThunder1757;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.FrostHunterFlowMaxDragonHero5809.FrostHunterConstraintSetCloneMasterUltraRogue2633();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FrostHunterNotificationManagerThunderSpectra3606.class != obj.getClass()) {
            return false;
        }
        return this.FrostHunterCameraXPixelTurboCosmos9814.equals(((FrostHunterNotificationManagerThunderSpectra3606) obj).FrostHunterCameraXPixelTurboCosmos9814);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new FrostHunterMergeAlphaMegaNebula6647(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.FrostHunterFlowMaxDragonHero5809.FrostHunterKeyframeGammaGamma1197(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        r15 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        int i2;
        collection.getClass();
        FrostHunterToolbarHeroNovaX1020 frostHunterToolbarHeroNovaX1020 = this.FrostHunterFlowMaxDragonHero5809;
        int i3 = frostHunterToolbarHeroNovaX1020.FrostHunterServiceEliteCelestialThunder1757;
        Iterator it = collection.iterator();
        while (true) {
            int i4 = 1;
            int i5 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int hashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 & 127;
            int i8 = frostHunterToolbarHeroNovaX1020.FrostHunterBundlePulseFusionHero2475;
            int i9 = (i6 >>> 7) & i8;
            while (true) {
                long[] jArr = frostHunterToolbarHeroNovaX1020.FrostHunterAlphaAnimationNeoCosmos5761;
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                long j = ((jArr[i10 + i4] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
                long j2 = (i7 * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j3 == 0) {
                        break;
                    }
                    i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i9) & i8;
                    int i12 = i4;
                    if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterToolbarHeroNovaX1020.FrostHunterConstraintSetCloneMasterUltraRogue2633[i2], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i4 = i12;
                }
                i5 += 8;
                i9 = (i9 + i5) & i8;
                i4 = i;
            }
            if (i2 >= 0) {
                frostHunterToolbarHeroNovaX1020.FrostHunterFragmentBetaMegaVortex6025(i2);
            }
        }
        return i3 != frostHunterToolbarHeroNovaX1020.FrostHunterServiceEliteCelestialThunder1757;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        FrostHunterToolbarHeroNovaX1020 frostHunterToolbarHeroNovaX1020 = this.FrostHunterFlowMaxDragonHero5809;
        Object[] objArr = frostHunterToolbarHeroNovaX1020.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i = frostHunterToolbarHeroNovaX1020.FrostHunterServiceEliteCelestialThunder1757;
        long[] jArr = frostHunterToolbarHeroNovaX1020.FrostHunterAlphaAnimationNeoCosmos5761;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterViewPager2StrikePulse8790(collection, objArr[i5])) {
                                frostHunterToolbarHeroNovaX1020.FrostHunterFragmentBetaMegaVortex6025(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != frostHunterToolbarHeroNovaX1020.FrostHunterServiceEliteCelestialThunder1757;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceEliteCelestialThunder1757;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return FrostHunterExecutorSolarPhoenix3849.FrostHunterPagingSourceEclipseDelta8255(this, objArr);
    }

    public final String toString() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return FrostHunterExecutorSolarPhoenix3849.FrostHunterPermissionInfoAlphaDelta6279(this);
    }
}
