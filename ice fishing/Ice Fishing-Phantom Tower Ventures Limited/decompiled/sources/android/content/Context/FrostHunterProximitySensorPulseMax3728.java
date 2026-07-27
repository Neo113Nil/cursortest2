package android.content.Context;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterProximitySensorPulseMax3728 extends AbstractList implements RandomAccess, FrostHunterOnDeviceTranslatorTitanShadow7898 {
    public static final FrostHunterProximitySensorPulseMax3728 FrostHunterKeyframeGammaGamma1197 = new FrostHunterProximitySensorPulseMax3728(new Object[0], 0, false);
    public int FrostHunterAlertDialogAuroraDelta3200;
    public boolean FrostHunterCameraXPixelTurboCosmos9814;
    public Object[] FrostHunterFlowMaxDragonHero5809;

    public FrostHunterProximitySensorPulseMax3728(Object[] objArr, int i, boolean z) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = z;
        this.FrostHunterFlowMaxDragonHero5809 = objArr;
        this.FrostHunterAlertDialogAuroraDelta3200 = i;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        if (i < 0 || i >= this.FrostHunterAlertDialogAuroraDelta3200) {
            StringBuilder FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterServiceConnectionTurboPhoenixOmega6719("Index:", i, ", Size:");
            FrostHunterServiceConnectionTurboPhoenixOmega6719.append(this.FrostHunterAlertDialogAuroraDelta3200);
            throw new IndexOutOfBoundsException(FrostHunterServiceConnectionTurboPhoenixOmega6719.toString());
        }
    }

    public final void FrostHunterBundlePulseFusionHero2475() {
        if (!this.FrostHunterCameraXPixelTurboCosmos9814) {
            throw new UnsupportedOperationException();
        }
    }

    public final FrostHunterProximitySensorPulseMax3728 FrostHunterServiceEliteCelestialThunder1757(int i) {
        if (i >= this.FrostHunterAlertDialogAuroraDelta3200) {
            return new FrostHunterProximitySensorPulseMax3728(Arrays.copyOf(this.FrostHunterFlowMaxDragonHero5809, i), this.FrostHunterAlertDialogAuroraDelta3200, true);
        }
        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterFragmentBetaMegaVortex6025();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        FrostHunterBundlePulseFusionHero2475();
        if (i < 0 || i > (i2 = this.FrostHunterAlertDialogAuroraDelta3200)) {
            StringBuilder FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterServiceConnectionTurboPhoenixOmega6719("Index:", i, ", Size:");
            FrostHunterServiceConnectionTurboPhoenixOmega6719.append(this.FrostHunterAlertDialogAuroraDelta3200);
            throw new IndexOutOfBoundsException(FrostHunterServiceConnectionTurboPhoenixOmega6719.toString());
        }
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.FrostHunterFlowMaxDragonHero5809, i, objArr2, i + 1, this.FrostHunterAlertDialogAuroraDelta3200 - i);
            this.FrostHunterFlowMaxDragonHero5809 = objArr2;
        }
        this.FrostHunterFlowMaxDragonHero5809[i] = obj;
        this.FrostHunterAlertDialogAuroraDelta3200++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        FrostHunterBundlePulseFusionHero2475();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        FrostHunterBundlePulseFusionHero2475();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        FrostHunterAlphaAnimationNeoCosmos5761(i);
        return this.FrostHunterFlowMaxDragonHero5809[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        FrostHunterBundlePulseFusionHero2475();
        FrostHunterAlphaAnimationNeoCosmos5761(i);
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        Object obj = objArr[i];
        if (i < this.FrostHunterAlertDialogAuroraDelta3200 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.FrostHunterAlertDialogAuroraDelta3200--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        FrostHunterBundlePulseFusionHero2475();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        FrostHunterBundlePulseFusionHero2475();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        FrostHunterBundlePulseFusionHero2475();
        FrostHunterAlphaAnimationNeoCosmos5761(i);
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        FrostHunterBundlePulseFusionHero2475();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        FrostHunterBundlePulseFusionHero2475();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        FrostHunterBundlePulseFusionHero2475();
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        if (i == objArr.length) {
            this.FrostHunterFlowMaxDragonHero5809 = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.FrostHunterFlowMaxDragonHero5809;
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
        this.FrostHunterAlertDialogAuroraDelta3200 = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
