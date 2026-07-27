package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOnDeviceTranslatorDragonLegendFusion2692 implements Cloneable {
    public /* synthetic */ int FrostHunterAlertDialogAuroraDelta3200;
    public /* synthetic */ int[] FrostHunterCameraXPixelTurboCosmos9814;
    public /* synthetic */ Object[] FrostHunterFlowMaxDragonHero5809;

    public FrostHunterOnDeviceTranslatorDragonLegendFusion2692(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.FrostHunterCameraXPixelTurboCosmos9814 = new int[i5];
        this.FrostHunterFlowMaxDragonHero5809 = new Object[i5];
    }

    /* renamed from: FrostHunterAlphaAnimationNeoCosmos5761, reason: merged with bridge method [inline-methods] */
    public final FrostHunterOnDeviceTranslatorDragonLegendFusion2692 clone() {
        Object clone = super.clone();
        clone.getClass();
        FrostHunterOnDeviceTranslatorDragonLegendFusion2692 frostHunterOnDeviceTranslatorDragonLegendFusion2692 = (FrostHunterOnDeviceTranslatorDragonLegendFusion2692) clone;
        frostHunterOnDeviceTranslatorDragonLegendFusion2692.FrostHunterCameraXPixelTurboCosmos9814 = (int[]) this.FrostHunterCameraXPixelTurboCosmos9814.clone();
        frostHunterOnDeviceTranslatorDragonLegendFusion2692.FrostHunterFlowMaxDragonHero5809 = (Object[]) this.FrostHunterFlowMaxDragonHero5809.clone();
        return frostHunterOnDeviceTranslatorDragonLegendFusion2692;
    }

    public final void FrostHunterBundlePulseFusionHero2475(int i, Object obj) {
        int FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterVectorDrawableForceMax1351.FrostHunterCameraXPixelTurboCosmos9814(this.FrostHunterCameraXPixelTurboCosmos9814, this.FrostHunterAlertDialogAuroraDelta3200, i);
        if (FrostHunterCameraXPixelTurboCosmos9814 >= 0) {
            this.FrostHunterFlowMaxDragonHero5809[FrostHunterCameraXPixelTurboCosmos9814] = obj;
            return;
        }
        int i2 = ~FrostHunterCameraXPixelTurboCosmos9814;
        int i3 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i2 < i3) {
            Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
            if (objArr[i2] == FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterFragmentBetaMegaVortex6025) {
                this.FrostHunterCameraXPixelTurboCosmos9814[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.FrostHunterCameraXPixelTurboCosmos9814.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.FrostHunterCameraXPixelTurboCosmos9814 = Arrays.copyOf(this.FrostHunterCameraXPixelTurboCosmos9814, i7);
            this.FrostHunterFlowMaxDragonHero5809 = Arrays.copyOf(this.FrostHunterFlowMaxDragonHero5809, i7);
        }
        int i8 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i8 - i2 != 0) {
            int[] iArr = this.FrostHunterCameraXPixelTurboCosmos9814;
            int i9 = i2 + 1;
            FrostHunterContextSolarMegaPhantom7469.FrostHunterColorStateListMegaBetaFusion7423(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.FrostHunterFlowMaxDragonHero5809;
            FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i9, i2, this.FrostHunterAlertDialogAuroraDelta3200, objArr2, objArr2);
        }
        this.FrostHunterCameraXPixelTurboCosmos9814[i2] = i;
        this.FrostHunterFlowMaxDragonHero5809[i2] = obj;
        this.FrostHunterAlertDialogAuroraDelta3200++;
    }

    public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633(int i) {
        Object obj;
        int FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterVectorDrawableForceMax1351.FrostHunterCameraXPixelTurboCosmos9814(this.FrostHunterCameraXPixelTurboCosmos9814, this.FrostHunterAlertDialogAuroraDelta3200, i);
        if (FrostHunterCameraXPixelTurboCosmos9814 < 0 || (obj = this.FrostHunterFlowMaxDragonHero5809[FrostHunterCameraXPixelTurboCosmos9814]) == FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterFragmentBetaMegaVortex6025) {
            return null;
        }
        return obj;
    }

    public final Object FrostHunterServiceEliteCelestialThunder1757(int i) {
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.FrostHunterCameraXPixelTurboCosmos9814[i3]);
            sb.append('=');
            Object FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757(i3);
            if (FrostHunterServiceEliteCelestialThunder1757 != this) {
                sb.append(FrostHunterServiceEliteCelestialThunder1757);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
