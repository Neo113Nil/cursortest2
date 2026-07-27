package android.content.Context;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterObjectAnimatorNeoStrike7090 implements RandomAccess {
    public int FrostHunterAlertDialogAuroraDelta3200 = 0;
    public Object[] FrostHunterCameraXPixelTurboCosmos9814;
    public FrostHunterImageViewMegaEclipseNebula6569 FrostHunterFlowMaxDragonHero5809;

    public FrostHunterObjectAnimatorNeoStrike7090(Object[] objArr) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = objArr;
    }

    public final Object FrostHunterAlertDialogAuroraDelta3200(int i) {
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = objArr[i];
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.FrostHunterAlertDialogAuroraDelta3200 - 1;
        this.FrostHunterAlertDialogAuroraDelta3200 = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(int i, Object obj) {
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200 + 1;
        if (this.FrostHunterCameraXPixelTurboCosmos9814.length < i2) {
            FrostHunterFragmentBetaMegaVortex6025(i2);
        }
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i3 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.FrostHunterAlertDialogAuroraDelta3200++;
    }

    public final void FrostHunterBundlePulseFusionHero2475(int i, FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike7090) {
        int i2 = frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200;
        if (i2 == 0) {
            return;
        }
        int i3 = this.FrostHunterAlertDialogAuroraDelta3200 + i2;
        if (this.FrostHunterCameraXPixelTurboCosmos9814.length < i3) {
            FrostHunterFragmentBetaMegaVortex6025(i3);
        }
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i4 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(frostHunterObjectAnimatorNeoStrike7090.FrostHunterCameraXPixelTurboCosmos9814, 0, objArr, i, i2);
        this.FrostHunterAlertDialogAuroraDelta3200 += i2;
    }

    public final boolean FrostHunterCameraXPixelTurboCosmos9814(Object obj) {
        int i = this.FrostHunterAlertDialogAuroraDelta3200 - 1;
        if (i >= 0) {
            for (int i2 = 0; !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterCameraXPixelTurboCosmos9814[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(Object obj) {
        int i = this.FrostHunterAlertDialogAuroraDelta3200 + 1;
        if (this.FrostHunterCameraXPixelTurboCosmos9814.length < i) {
            FrostHunterFragmentBetaMegaVortex6025(i);
        }
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
        objArr[i2] = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = i2 + 1;
    }

    public final boolean FrostHunterFlowMaxDragonHero5809(Object obj) {
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            }
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, objArr[i2])) {
                break;
            }
            i2++;
        }
        if (i2 < 0) {
            return false;
        }
        FrostHunterAlertDialogAuroraDelta3200(i2);
        return true;
    }

    public final void FrostHunterFragmentBetaMegaVortex6025(int i) {
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.FrostHunterCameraXPixelTurboCosmos9814 = objArr2;
    }

    public final void FrostHunterKeyframeGammaGamma1197(int i, int i2) {
        if (i2 > i) {
            int i3 = this.FrostHunterAlertDialogAuroraDelta3200;
            if (i2 < i3) {
                Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.FrostHunterAlertDialogAuroraDelta3200;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.FrostHunterCameraXPixelTurboCosmos9814[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.FrostHunterAlertDialogAuroraDelta3200 = i5;
        }
    }

    public final List FrostHunterLevelListDrawableFusionDragonHero2232() {
        FrostHunterImageViewMegaEclipseNebula6569 frostHunterImageViewMegaEclipseNebula6569 = this.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterImageViewMegaEclipseNebula6569 != null) {
            return frostHunterImageViewMegaEclipseNebula6569;
        }
        FrostHunterImageViewMegaEclipseNebula6569 frostHunterImageViewMegaEclipseNebula65692 = new FrostHunterImageViewMegaEclipseNebula6569(this);
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterImageViewMegaEclipseNebula65692;
        return frostHunterImageViewMegaEclipseNebula65692;
    }

    public final boolean FrostHunterLifecycleBlazeGammaElite2889(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.FrostHunterAlertDialogAuroraDelta3200 + size;
        if (this.FrostHunterCameraXPixelTurboCosmos9814.length < i3) {
            FrostHunterFragmentBetaMegaVortex6025(i3);
        }
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i4 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                FrostHunterCardViewHyperionAurora3829.FrostHunterNestedScrollViewThunderNovaX6772();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.FrostHunterAlertDialogAuroraDelta3200 += size;
        return true;
    }

    public final void FrostHunterRemoteConfigSpeedSpeed8566() {
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.FrostHunterAlertDialogAuroraDelta3200 = 0;
    }

    public final void FrostHunterServiceEliteCelestialThunder1757(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200 + size;
        if (this.FrostHunterCameraXPixelTurboCosmos9814.length < i2) {
            FrostHunterFragmentBetaMegaVortex6025(i2);
        }
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i3 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.FrostHunterAlertDialogAuroraDelta3200 += size;
    }
}
