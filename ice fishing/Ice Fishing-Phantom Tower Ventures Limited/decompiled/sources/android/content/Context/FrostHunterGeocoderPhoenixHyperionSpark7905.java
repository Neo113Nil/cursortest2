package android.content.Context;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGeocoderPhoenixHyperionSpark7905 extends AbstractList implements RandomAccess, Serializable {
    public final int FrostHunterAlertDialogAuroraDelta3200;
    public final int[] FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterGeocoderPhoenixHyperionSpark7905(int[] iArr, int i, int i2) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = iArr;
        this.FrostHunterFlowMaxDragonHero5809 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.FrostHunterFlowMaxDragonHero5809;
        while (true) {
            if (i >= this.FrostHunterAlertDialogAuroraDelta3200) {
                i = -1;
                break;
            }
            if (this.FrostHunterCameraXPixelTurboCosmos9814[i] == intValue) {
                break;
            }
            i++;
        }
        return i != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FrostHunterGeocoderPhoenixHyperionSpark7905)) {
            return super.equals(obj);
        }
        FrostHunterGeocoderPhoenixHyperionSpark7905 frostHunterGeocoderPhoenixHyperionSpark7905 = (FrostHunterGeocoderPhoenixHyperionSpark7905) obj;
        int size = size();
        if (frostHunterGeocoderPhoenixHyperionSpark7905.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.FrostHunterCameraXPixelTurboCosmos9814[this.FrostHunterFlowMaxDragonHero5809 + i] != frostHunterGeocoderPhoenixHyperionSpark7905.FrostHunterCameraXPixelTurboCosmos9814[frostHunterGeocoderPhoenixHyperionSpark7905.FrostHunterFlowMaxDragonHero5809 + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterDialogFragmentTurboPhoenixDragon7627(i, size());
        return Integer.valueOf(this.FrostHunterCameraXPixelTurboCosmos9814[this.FrostHunterFlowMaxDragonHero5809 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.FrostHunterFlowMaxDragonHero5809; i2 < this.FrostHunterAlertDialogAuroraDelta3200; i2++) {
            i = (i * 31) + this.FrostHunterCameraXPixelTurboCosmos9814[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.FrostHunterFlowMaxDragonHero5809;
            int i2 = i;
            while (true) {
                if (i2 >= this.FrostHunterAlertDialogAuroraDelta3200) {
                    i2 = -1;
                    break;
                }
                if (this.FrostHunterCameraXPixelTurboCosmos9814[i2] == intValue) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
            while (true) {
                i2--;
                i = this.FrostHunterFlowMaxDragonHero5809;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (this.FrostHunterCameraXPixelTurboCosmos9814[i2] == intValue) {
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        FrostHunterCanvasInfernoVortex4700.FrostHunterDialogFragmentTurboPhoenixDragon7627(i, size());
        int i2 = this.FrostHunterFlowMaxDragonHero5809 + i;
        int[] iArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.FrostHunterAlertDialogAuroraDelta3200 - this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterDatabaseEliteShadowUltra2452(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.FrostHunterFlowMaxDragonHero5809;
        return new FrostHunterGeocoderPhoenixHyperionSpark7905(this.FrostHunterCameraXPixelTurboCosmos9814, i + i3, i3 + i2);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i = this.FrostHunterFlowMaxDragonHero5809;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.FrostHunterAlertDialogAuroraDelta3200) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }
}
