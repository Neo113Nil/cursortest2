package android.content.Context;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterEditTextPhoenixMaster1089 implements Collection, Set, FrostHunterModelInputOutputCyberSpectra6508, FrostHunterConfigurationSpectraPhoenixCosmos6141 {
    public int FrostHunterAlertDialogAuroraDelta3200;
    public int[] FrostHunterCameraXPixelTurboCosmos9814;
    public Object[] FrostHunterFlowMaxDragonHero5809;

    public FrostHunterEditTextPhoenixMaster1089(int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterVectorDrawableForceMax1351.FrostHunterRemoteConfigSpeedSpeed8566;
        this.FrostHunterFlowMaxDragonHero5809 = FrostHunterVectorDrawableForceMax1351.FrostHunterFlowMaxDragonHero5809;
        if (i > 0) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = new int[i];
            this.FrostHunterFlowMaxDragonHero5809 = new Object[i];
        }
    }

    public final Object FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                FrostHunterContextSolarMegaPhantom7469.FrostHunterColorStateListMegaBetaFusion7423(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i, i4, i2, objArr2, objArr2);
            }
            this.FrostHunterFlowMaxDragonHero5809[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.FrostHunterCameraXPixelTurboCosmos9814 = iArr2;
            this.FrostHunterFlowMaxDragonHero5809 = new Object[i5];
            if (i > 0) {
                FrostHunterContextSolarMegaPhantom7469.FrostHunterInAppPurchaseLegendEpicDragon4579(0, i, 6, iArr, iArr2);
                FrostHunterContextSolarMegaPhantom7469.FrostHunterViewPager2StrikePulse8790(0, i, 6, objArr, this.FrostHunterFlowMaxDragonHero5809);
            }
            if (i < i3) {
                int i6 = i + 1;
                FrostHunterContextSolarMegaPhantom7469.FrostHunterColorStateListMegaBetaFusion7423(i, i6, i2, iArr, this.FrostHunterCameraXPixelTurboCosmos9814);
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i, i6, i2, objArr, this.FrostHunterFlowMaxDragonHero5809);
            }
        }
        if (i2 == this.FrostHunterAlertDialogAuroraDelta3200) {
            this.FrostHunterAlertDialogAuroraDelta3200 = i3;
            return obj;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterLevelListDrawableFusionDragonHero2232();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int FrostHunterTranslateAnimationCyberSolarUltra7101;
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (obj == null) {
            FrostHunterTranslateAnimationCyberSolarUltra7101 = FrostHunterCardViewHyperionAurora3829.FrostHunterTranslateAnimationCyberSolarUltra7101(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            FrostHunterTranslateAnimationCyberSolarUltra7101 = FrostHunterCardViewHyperionAurora3829.FrostHunterTranslateAnimationCyberSolarUltra7101(this, obj, hashCode);
        }
        if (FrostHunterTranslateAnimationCyberSolarUltra7101 >= 0) {
            return false;
        }
        int i3 = ~FrostHunterTranslateAnimationCyberSolarUltra7101;
        int[] iArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
            int[] iArr2 = new int[i4];
            this.FrostHunterCameraXPixelTurboCosmos9814 = iArr2;
            this.FrostHunterFlowMaxDragonHero5809 = new Object[i4];
            if (i2 != this.FrostHunterAlertDialogAuroraDelta3200) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterLevelListDrawableFusionDragonHero2232();
                return false;
            }
            if (iArr2.length != 0) {
                FrostHunterContextSolarMegaPhantom7469.FrostHunterInAppPurchaseLegendEpicDragon4579(0, iArr.length, 6, iArr, iArr2);
                FrostHunterContextSolarMegaPhantom7469.FrostHunterViewPager2StrikePulse8790(0, objArr.length, 6, objArr, this.FrostHunterFlowMaxDragonHero5809);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.FrostHunterCameraXPixelTurboCosmos9814;
            int i5 = i3 + 1;
            FrostHunterContextSolarMegaPhantom7469.FrostHunterColorStateListMegaBetaFusion7423(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.FrostHunterFlowMaxDragonHero5809;
            FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i2 == i6) {
            int[] iArr4 = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.FrostHunterFlowMaxDragonHero5809[i3] = obj;
                this.FrostHunterAlertDialogAuroraDelta3200 = i6 + 1;
                return true;
            }
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterLevelListDrawableFusionDragonHero2232();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.FrostHunterAlertDialogAuroraDelta3200;
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        int[] iArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
            int[] iArr2 = new int[size];
            this.FrostHunterCameraXPixelTurboCosmos9814 = iArr2;
            this.FrostHunterFlowMaxDragonHero5809 = new Object[size];
            if (i > 0) {
                FrostHunterContextSolarMegaPhantom7469.FrostHunterInAppPurchaseLegendEpicDragon4579(0, i, 6, iArr, iArr2);
                FrostHunterContextSolarMegaPhantom7469.FrostHunterViewPager2StrikePulse8790(0, this.FrostHunterAlertDialogAuroraDelta3200, 6, objArr, this.FrostHunterFlowMaxDragonHero5809);
            }
        }
        if (this.FrostHunterAlertDialogAuroraDelta3200 != i) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterLevelListDrawableFusionDragonHero2232();
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.FrostHunterAlertDialogAuroraDelta3200 != 0) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterVectorDrawableForceMax1351.FrostHunterRemoteConfigSpeedSpeed8566;
            this.FrostHunterFlowMaxDragonHero5809 = FrostHunterVectorDrawableForceMax1351.FrostHunterFlowMaxDragonHero5809;
            this.FrostHunterAlertDialogAuroraDelta3200 = 0;
        }
        if (this.FrostHunterAlertDialogAuroraDelta3200 == 0) {
            return;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterLevelListDrawableFusionDragonHero2232();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? FrostHunterCardViewHyperionAurora3829.FrostHunterTranslateAnimationCyberSolarUltra7101(this, null, 0) : FrostHunterCardViewHyperionAurora3829.FrostHunterTranslateAnimationCyberSolarUltra7101(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.FrostHunterAlertDialogAuroraDelta3200 != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.FrostHunterAlertDialogAuroraDelta3200;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.FrostHunterFlowMaxDragonHero5809[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.FrostHunterAlertDialogAuroraDelta3200 <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new FrostHunterSharedElementEliteMaster1810(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int FrostHunterTranslateAnimationCyberSolarUltra7101 = obj == null ? FrostHunterCardViewHyperionAurora3829.FrostHunterTranslateAnimationCyberSolarUltra7101(this, null, 0) : FrostHunterCardViewHyperionAurora3829.FrostHunterTranslateAnimationCyberSolarUltra7101(this, obj, obj.hashCode());
        if (FrostHunterTranslateAnimationCyberSolarUltra7101 < 0) {
            return false;
        }
        FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterTranslateAnimationCyberSolarUltra7101);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.FrostHunterAlertDialogAuroraDelta3200 - 1; -1 < i; i--) {
            if (!FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterViewPager2StrikePulse8790(collection, this.FrostHunterFlowMaxDragonHero5809[i])) {
                FrostHunterAlphaAnimationNeoCosmos5761(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(0, 0, this.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterFlowMaxDragonHero5809, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.FrostHunterAlertDialogAuroraDelta3200 * 14);
        sb.append('{');
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.FrostHunterFlowMaxDragonHero5809[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return FrostHunterContextSolarMegaPhantom7469.FrostHunterAlphaAnimationNovaGamma6326(this.FrostHunterFlowMaxDragonHero5809, 0, this.FrostHunterAlertDialogAuroraDelta3200);
    }
}
