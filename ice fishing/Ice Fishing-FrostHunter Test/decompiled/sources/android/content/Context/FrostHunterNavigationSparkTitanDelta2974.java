package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterNavigationSparkTitanDelta2974 implements Cloneable {
    public /* synthetic */ Object[] FrostHunterAlertDialogAuroraDelta3200;
    public /* synthetic */ boolean FrostHunterCameraXPixelTurboCosmos9814;
    public /* synthetic */ long[] FrostHunterFlowMaxDragonHero5809;
    public /* synthetic */ int FrostHunterKeyframeGammaGamma1197;

    public FrostHunterNavigationSparkTitanDelta2974(int i) {
        if (i == 0) {
            this.FrostHunterFlowMaxDragonHero5809 = FrostHunterVectorDrawableForceMax1351.FrostHunterCameraXPixelTurboCosmos9814;
            this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterVectorDrawableForceMax1351.FrostHunterFlowMaxDragonHero5809;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.FrostHunterFlowMaxDragonHero5809 = new long[i5];
        this.FrostHunterAlertDialogAuroraDelta3200 = new Object[i5];
    }

    public final long FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.FrostHunterKeyframeGammaGamma1197)) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Expected index to be within 0..size()-1, but was ", i));
            return 0L;
        }
        if (this.FrostHunterCameraXPixelTurboCosmos9814) {
            long[] jArr = this.FrostHunterFlowMaxDragonHero5809;
            Object[] objArr = this.FrostHunterAlertDialogAuroraDelta3200;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != FrostHunterCardViewHyperionAurora3829.FrostHunterAlertDialogAuroraDelta3200) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.FrostHunterCameraXPixelTurboCosmos9814 = false;
            this.FrostHunterKeyframeGammaGamma1197 = i3;
        }
        return this.FrostHunterFlowMaxDragonHero5809[i];
    }

    public final void FrostHunterBundlePulseFusionHero2475(long j) {
        int FrostHunterFlowMaxDragonHero5809 = FrostHunterVectorDrawableForceMax1351.FrostHunterFlowMaxDragonHero5809(this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterKeyframeGammaGamma1197, j);
        if (FrostHunterFlowMaxDragonHero5809 >= 0) {
            Object[] objArr = this.FrostHunterAlertDialogAuroraDelta3200;
            Object obj = objArr[FrostHunterFlowMaxDragonHero5809];
            Object obj2 = FrostHunterCardViewHyperionAurora3829.FrostHunterAlertDialogAuroraDelta3200;
            if (obj != obj2) {
                objArr[FrostHunterFlowMaxDragonHero5809] = obj2;
                this.FrostHunterCameraXPixelTurboCosmos9814 = true;
            }
        }
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(long j, Object obj) {
        Object obj2 = FrostHunterCardViewHyperionAurora3829.FrostHunterAlertDialogAuroraDelta3200;
        int FrostHunterFlowMaxDragonHero5809 = FrostHunterVectorDrawableForceMax1351.FrostHunterFlowMaxDragonHero5809(this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterKeyframeGammaGamma1197, j);
        if (FrostHunterFlowMaxDragonHero5809 >= 0) {
            this.FrostHunterAlertDialogAuroraDelta3200[FrostHunterFlowMaxDragonHero5809] = obj;
            return;
        }
        int i = ~FrostHunterFlowMaxDragonHero5809;
        int i2 = this.FrostHunterKeyframeGammaGamma1197;
        if (i < i2) {
            Object[] objArr = this.FrostHunterAlertDialogAuroraDelta3200;
            if (objArr[i] == obj2) {
                this.FrostHunterFlowMaxDragonHero5809[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.FrostHunterCameraXPixelTurboCosmos9814) {
            long[] jArr = this.FrostHunterFlowMaxDragonHero5809;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.FrostHunterAlertDialogAuroraDelta3200;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.FrostHunterCameraXPixelTurboCosmos9814 = false;
                this.FrostHunterKeyframeGammaGamma1197 = i3;
                i = ~FrostHunterVectorDrawableForceMax1351.FrostHunterFlowMaxDragonHero5809(this.FrostHunterFlowMaxDragonHero5809, i3, j);
            }
        }
        int i5 = this.FrostHunterKeyframeGammaGamma1197;
        if (i5 >= this.FrostHunterFlowMaxDragonHero5809.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.FrostHunterFlowMaxDragonHero5809 = Arrays.copyOf(this.FrostHunterFlowMaxDragonHero5809, i9);
            this.FrostHunterAlertDialogAuroraDelta3200 = Arrays.copyOf(this.FrostHunterAlertDialogAuroraDelta3200, i9);
        }
        int i10 = this.FrostHunterKeyframeGammaGamma1197;
        if (i10 - i != 0) {
            long[] jArr2 = this.FrostHunterFlowMaxDragonHero5809;
            int i11 = i + 1;
            FrostHunterContextSolarMegaPhantom7469.FrostHunterImageAnalysisGammaOlympian2400(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.FrostHunterAlertDialogAuroraDelta3200;
            FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i11, i, this.FrostHunterKeyframeGammaGamma1197, objArr3, objArr3);
        }
        this.FrostHunterFlowMaxDragonHero5809[i] = j;
        this.FrostHunterAlertDialogAuroraDelta3200[i] = obj;
        this.FrostHunterKeyframeGammaGamma1197++;
    }

    public final Object FrostHunterLifecycleBlazeGammaElite2889(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.FrostHunterKeyframeGammaGamma1197)) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        if (this.FrostHunterCameraXPixelTurboCosmos9814) {
            long[] jArr = this.FrostHunterFlowMaxDragonHero5809;
            Object[] objArr = this.FrostHunterAlertDialogAuroraDelta3200;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != FrostHunterCardViewHyperionAurora3829.FrostHunterAlertDialogAuroraDelta3200) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.FrostHunterCameraXPixelTurboCosmos9814 = false;
            this.FrostHunterKeyframeGammaGamma1197 = i3;
        }
        return this.FrostHunterAlertDialogAuroraDelta3200[i];
    }

    public final int FrostHunterServiceEliteCelestialThunder1757() {
        if (this.FrostHunterCameraXPixelTurboCosmos9814) {
            int i = this.FrostHunterKeyframeGammaGamma1197;
            long[] jArr = this.FrostHunterFlowMaxDragonHero5809;
            Object[] objArr = this.FrostHunterAlertDialogAuroraDelta3200;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != FrostHunterCardViewHyperionAurora3829.FrostHunterAlertDialogAuroraDelta3200) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.FrostHunterCameraXPixelTurboCosmos9814 = false;
            this.FrostHunterKeyframeGammaGamma1197 = i2;
        }
        return this.FrostHunterKeyframeGammaGamma1197;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        FrostHunterNavigationSparkTitanDelta2974 frostHunterNavigationSparkTitanDelta2974 = (FrostHunterNavigationSparkTitanDelta2974) clone;
        frostHunterNavigationSparkTitanDelta2974.FrostHunterFlowMaxDragonHero5809 = (long[]) this.FrostHunterFlowMaxDragonHero5809.clone();
        frostHunterNavigationSparkTitanDelta2974.FrostHunterAlertDialogAuroraDelta3200 = (Object[]) this.FrostHunterAlertDialogAuroraDelta3200.clone();
        return frostHunterNavigationSparkTitanDelta2974;
    }

    public final String toString() {
        if (FrostHunterServiceEliteCelestialThunder1757() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.FrostHunterKeyframeGammaGamma1197 * 28);
        sb.append('{');
        int i = this.FrostHunterKeyframeGammaGamma1197;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(FrostHunterAlphaAnimationNeoCosmos5761(i2));
            sb.append('=');
            Object FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterLifecycleBlazeGammaElite2889(i2);
            if (FrostHunterLifecycleBlazeGammaElite2889 != sb) {
                sb.append(FrostHunterLifecycleBlazeGammaElite2889);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
