package android.content.Context;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterContentResolverMasterVortexGamma3803 extends FrostHunterContentResolverMasterTitan6007 implements RandomAccess, Serializable {
    public static final FrostHunterContentResolverMasterVortexGamma3803 FrostHunterKeyframeGammaGamma1197;
    public boolean FrostHunterAlertDialogAuroraDelta3200;
    public Object[] FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809;

    static {
        FrostHunterContentResolverMasterVortexGamma3803 frostHunterContentResolverMasterVortexGamma3803 = new FrostHunterContentResolverMasterVortexGamma3803(0);
        frostHunterContentResolverMasterVortexGamma3803.FrostHunterAlertDialogAuroraDelta3200 = true;
        FrostHunterKeyframeGammaGamma1197 = frostHunterContentResolverMasterVortexGamma3803;
    }

    public FrostHunterContentResolverMasterVortexGamma3803(int i) {
        if (i >= 0) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = new Object[i];
        } else {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("capacity must be non-negative.");
            throw null;
        }
    }

    public final void FrostHunterAlertDialogAuroraDelta3200(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i, i + i2, this.FrostHunterFlowMaxDragonHero5809, objArr, objArr);
        Object[] objArr2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i3 = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterConstraintSetCloneOmegaHyperion9304(objArr2, i3 - i2, i3);
        this.FrostHunterFlowMaxDragonHero5809 -= i2;
    }

    @Override // android.content.Context.FrostHunterContentResolverMasterTitan6007
    public final int FrostHunterAlphaAnimationNeoCosmos5761() {
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // android.content.Context.FrostHunterContentResolverMasterTitan6007
    public final Object FrostHunterBundlePulseFusionHero2475(int i) {
        FrostHunterRemoteConfigSpeedSpeed8566();
        int i2 = this.FrostHunterFlowMaxDragonHero5809;
        if (i >= 0 && i < i2) {
            return FrostHunterFlowMaxDragonHero5809(i);
        }
        FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void FrostHunterCameraXPixelTurboCosmos9814(int i, int i2) {
        int i3 = this.FrostHunterFlowMaxDragonHero5809 + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.FrostHunterCameraXPixelTurboCosmos9814 = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i + i2, i, this.FrostHunterFlowMaxDragonHero5809, objArr2, objArr2);
        this.FrostHunterFlowMaxDragonHero5809 += i2;
    }

    public final Object FrostHunterFlowMaxDragonHero5809(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = objArr[i];
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i, i + 1, this.FrostHunterFlowMaxDragonHero5809, objArr, objArr);
        Object[] objArr2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i2 = this.FrostHunterFlowMaxDragonHero5809 - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.FrostHunterFlowMaxDragonHero5809--;
        return obj;
    }

    public final int FrostHunterKeyframeGammaGamma1197(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.FrostHunterCameraXPixelTurboCosmos9814;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i + i4, i2 + i, this.FrostHunterFlowMaxDragonHero5809, objArr, objArr);
        Object[] objArr3 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i7 = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterConstraintSetCloneOmegaHyperion9304(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.FrostHunterFlowMaxDragonHero5809 -= i6;
        return i6;
    }

    public final void FrostHunterLevelListDrawableFusionDragonHero2232(int i, Object obj) {
        ((AbstractList) this).modCount++;
        FrostHunterCameraXPixelTurboCosmos9814(i, 1);
        this.FrostHunterCameraXPixelTurboCosmos9814[i] = obj;
    }

    public final void FrostHunterLifecycleBlazeGammaElite2889(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        FrostHunterCameraXPixelTurboCosmos9814(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.FrostHunterCameraXPixelTurboCosmos9814[i + i3] = it.next();
        }
    }

    public final void FrostHunterRemoteConfigSpeedSpeed8566() {
        if (this.FrostHunterAlertDialogAuroraDelta3200) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        FrostHunterRemoteConfigSpeedSpeed8566();
        int i2 = this.FrostHunterFlowMaxDragonHero5809;
        if (i < 0 || i > i2) {
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, "index: ", ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        FrostHunterCameraXPixelTurboCosmos9814(i, 1);
        this.FrostHunterCameraXPixelTurboCosmos9814[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        FrostHunterRemoteConfigSpeedSpeed8566();
        int i2 = this.FrostHunterFlowMaxDragonHero5809;
        if (i < 0 || i > i2) {
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        FrostHunterLifecycleBlazeGammaElite2889(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        FrostHunterRemoteConfigSpeedSpeed8566();
        FrostHunterAlertDialogAuroraDelta3200(0, this.FrostHunterFlowMaxDragonHero5809);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
            int i = this.FrostHunterFlowMaxDragonHero5809;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.FrostHunterFlowMaxDragonHero5809;
        if (i >= 0 && i < i2) {
            return this.FrostHunterCameraXPixelTurboCosmos9814[i];
        }
        FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i = this.FrostHunterFlowMaxDragonHero5809;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.FrostHunterFlowMaxDragonHero5809; i++) {
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterCameraXPixelTurboCosmos9814[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.FrostHunterFlowMaxDragonHero5809 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.FrostHunterFlowMaxDragonHero5809 - 1; i >= 0; i--) {
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterCameraXPixelTurboCosmos9814[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.FrostHunterFlowMaxDragonHero5809;
        if (i >= 0 && i <= i2) {
            return new FrostHunterMapInfernoPhantom9484(this, i);
        }
        FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        FrostHunterRemoteConfigSpeedSpeed8566();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            FrostHunterBundlePulseFusionHero2475(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        FrostHunterRemoteConfigSpeedSpeed8566();
        return FrostHunterKeyframeGammaGamma1197(0, this.FrostHunterFlowMaxDragonHero5809, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        FrostHunterRemoteConfigSpeedSpeed8566();
        return FrostHunterKeyframeGammaGamma1197(0, this.FrostHunterFlowMaxDragonHero5809, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        FrostHunterRemoteConfigSpeedSpeed8566();
        int i2 = this.FrostHunterFlowMaxDragonHero5809;
        if (i < 0 || i >= i2) {
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterCardViewSpectraCyber7714(i, i2, this.FrostHunterFlowMaxDragonHero5809);
        return new FrostHunterActivityEliteBeta5992(this.FrostHunterCameraXPixelTurboCosmos9814, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.FrostHunterFlowMaxDragonHero5809;
        Object[] objArr2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(0, 0, i, objArr2, objArr);
        int i2 = this.FrostHunterFlowMaxDragonHero5809;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return FrostHunterTransitionGammaTitanSpeed7178.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterCameraXPixelTurboCosmos9814, 0, this.FrostHunterFlowMaxDragonHero5809, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        FrostHunterRemoteConfigSpeedSpeed8566();
        int i = this.FrostHunterFlowMaxDragonHero5809;
        ((AbstractList) this).modCount++;
        FrostHunterCameraXPixelTurboCosmos9814(i, 1);
        this.FrostHunterCameraXPixelTurboCosmos9814[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return FrostHunterContextSolarMegaPhantom7469.FrostHunterAlphaAnimationNovaGamma6326(this.FrostHunterCameraXPixelTurboCosmos9814, 0, this.FrostHunterFlowMaxDragonHero5809);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        FrostHunterRemoteConfigSpeedSpeed8566();
        int size = collection.size();
        FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterFlowMaxDragonHero5809, collection, size);
        return size > 0;
    }
}
