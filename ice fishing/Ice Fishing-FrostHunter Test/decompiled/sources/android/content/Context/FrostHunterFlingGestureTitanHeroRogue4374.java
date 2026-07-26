package android.content.Context;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFlingGestureTitanHeroRogue4374 implements Iterable, FrostHunterContextBlazePrimeMax4967 {
    public static final FrostHunterFlingGestureTitanHeroRogue4374 FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterFlingGestureTitanHeroRogue4374(0, 0, 0, null);
    public final long FrostHunterAlertDialogAuroraDelta3200;
    public final long FrostHunterCameraXPixelTurboCosmos9814;
    public final long FrostHunterFlowMaxDragonHero5809;
    public final long[] FrostHunterKeyframeGammaGamma1197;

    public FrostHunterFlingGestureTitanHeroRogue4374(long j, long j2, long j3, long[] jArr) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = j;
        this.FrostHunterFlowMaxDragonHero5809 = j2;
        this.FrostHunterAlertDialogAuroraDelta3200 = j3;
        this.FrostHunterKeyframeGammaGamma1197 = jArr;
    }

    public final FrostHunterFlingGestureTitanHeroRogue4374 FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterFlingGestureTitanHeroRogue4374 frostHunterFlingGestureTitanHeroRogue4374) {
        long[] jArr;
        FrostHunterFlingGestureTitanHeroRogue4374 frostHunterFlingGestureTitanHeroRogue43742 = this;
        FrostHunterFlingGestureTitanHeroRogue4374 frostHunterFlingGestureTitanHeroRogue43743 = FrostHunterFragmentBetaMegaVortex6025;
        if (frostHunterFlingGestureTitanHeroRogue4374 == frostHunterFlingGestureTitanHeroRogue43743) {
            return frostHunterFlingGestureTitanHeroRogue43742;
        }
        if (frostHunterFlingGestureTitanHeroRogue43742 == frostHunterFlingGestureTitanHeroRogue43743) {
            return frostHunterFlingGestureTitanHeroRogue43743;
        }
        long j = frostHunterFlingGestureTitanHeroRogue4374.FrostHunterAlertDialogAuroraDelta3200;
        long j2 = frostHunterFlingGestureTitanHeroRogue4374.FrostHunterAlertDialogAuroraDelta3200;
        long[] jArr2 = frostHunterFlingGestureTitanHeroRogue4374.FrostHunterKeyframeGammaGamma1197;
        long j3 = frostHunterFlingGestureTitanHeroRogue4374.FrostHunterFlowMaxDragonHero5809;
        long j4 = frostHunterFlingGestureTitanHeroRogue4374.FrostHunterCameraXPixelTurboCosmos9814;
        long j5 = frostHunterFlingGestureTitanHeroRogue43742.FrostHunterAlertDialogAuroraDelta3200;
        if (j == j5 && jArr2 == (jArr = frostHunterFlingGestureTitanHeroRogue43742.FrostHunterKeyframeGammaGamma1197)) {
            return new FrostHunterFlingGestureTitanHeroRogue4374(frostHunterFlingGestureTitanHeroRogue43742.FrostHunterCameraXPixelTurboCosmos9814 & (~j4), frostHunterFlingGestureTitanHeroRogue43742.FrostHunterFlowMaxDragonHero5809 & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                frostHunterFlingGestureTitanHeroRogue43742 = frostHunterFlingGestureTitanHeroRogue43742.FrostHunterBundlePulseFusionHero2475(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    frostHunterFlingGestureTitanHeroRogue43742 = frostHunterFlingGestureTitanHeroRogue43742.FrostHunterBundlePulseFusionHero2475(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    frostHunterFlingGestureTitanHeroRogue43742 = frostHunterFlingGestureTitanHeroRogue43742.FrostHunterBundlePulseFusionHero2475(i2 + j2 + 64);
                }
            }
        }
        return frostHunterFlingGestureTitanHeroRogue43742;
    }

    public final FrostHunterFlingGestureTitanHeroRogue4374 FrostHunterBundlePulseFusionHero2475(long j) {
        long[] jArr;
        int FrostHunterAlphaAnimationNeoCosmos5761;
        long[] jArr2;
        long j2 = j - this.FrostHunterAlertDialogAuroraDelta3200;
        if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMotionSceneAuroraMega2271(j2, 0L) >= 0 && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMotionSceneAuroraMega2271(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.FrostHunterFlowMaxDragonHero5809;
            if ((j4 & j3) != 0) {
                return new FrostHunterFlingGestureTitanHeroRogue4374(this.FrostHunterCameraXPixelTurboCosmos9814, j4 & (~j3), this.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterKeyframeGammaGamma1197);
            }
        } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMotionSceneAuroraMega2271(j2, 64L) >= 0 && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMotionSceneAuroraMega2271(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.FrostHunterCameraXPixelTurboCosmos9814;
            if ((j6 & j5) != 0) {
                return new FrostHunterFlingGestureTitanHeroRogue4374(j6 & (~j5), this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterKeyframeGammaGamma1197);
            }
        } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMotionSceneAuroraMega2271(j2, 0L) < 0 && (jArr = this.FrostHunterKeyframeGammaGamma1197) != null && (FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterCardViewLegendUltra9902.FrostHunterAlphaAnimationNeoCosmos5761(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (FrostHunterAlphaAnimationNeoCosmos5761 > 0) {
                    FrostHunterContextSolarMegaPhantom7469.FrostHunterImageAnalysisGammaOlympian2400(jArr, jArr3, 0, 0, FrostHunterAlphaAnimationNeoCosmos5761);
                }
                if (FrostHunterAlphaAnimationNeoCosmos5761 < i) {
                    FrostHunterContextSolarMegaPhantom7469.FrostHunterImageAnalysisGammaOlympian2400(jArr, jArr3, FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterAlphaAnimationNeoCosmos5761 + 1, length);
                }
                jArr2 = jArr3;
            }
            return new FrostHunterFlingGestureTitanHeroRogue4374(this.FrostHunterCameraXPixelTurboCosmos9814, this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterAlertDialogAuroraDelta3200, jArr2);
        }
        return this;
    }

    public final FrostHunterFlingGestureTitanHeroRogue4374 FrostHunterLevelListDrawableFusionDragonHero2232(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        long j5 = this.FrostHunterAlertDialogAuroraDelta3200;
        long j6 = j - j5;
        long j7 = 0;
        int FrostHunterMotionSceneAuroraMega2271 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMotionSceneAuroraMega2271(j6, 0L);
        long j8 = this.FrostHunterFlowMaxDragonHero5809;
        if (FrostHunterMotionSceneAuroraMega2271 < 0 || FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMotionSceneAuroraMega2271(j6, 64L) >= 0) {
            int FrostHunterMotionSceneAuroraMega22712 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMotionSceneAuroraMega2271(j6, 64L);
            long j9 = this.FrostHunterCameraXPixelTurboCosmos9814;
            int i2 = 64;
            if (FrostHunterMotionSceneAuroraMega22712 < 0 || FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMotionSceneAuroraMega2271(j6, 128L) >= 0) {
                int FrostHunterMotionSceneAuroraMega22713 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMotionSceneAuroraMega2271(j6, 128L);
                long[] jArr3 = this.FrostHunterKeyframeGammaGamma1197;
                if (FrostHunterMotionSceneAuroraMega22713 < 0) {
                    if (jArr3 == null) {
                        return new FrostHunterFlingGestureTitanHeroRogue4374(this.FrostHunterCameraXPixelTurboCosmos9814, this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterAlertDialogAuroraDelta3200, new long[]{j});
                    }
                    int FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterCardViewLegendUltra9902.FrostHunterAlphaAnimationNeoCosmos5761(jArr3, j);
                    if (FrostHunterAlphaAnimationNeoCosmos5761 < 0) {
                        int i3 = -(FrostHunterAlphaAnimationNeoCosmos5761 + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        FrostHunterContextSolarMegaPhantom7469.FrostHunterImageAnalysisGammaOlympian2400(jArr3, jArr4, 0, 0, i3);
                        FrostHunterContextSolarMegaPhantom7469.FrostHunterImageAnalysisGammaOlympian2400(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new FrostHunterFlingGestureTitanHeroRogue4374(this.FrostHunterCameraXPixelTurboCosmos9814, this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterAlertDialogAuroraDelta3200, jArr4);
                    }
                } else if (!FrostHunterServiceEliteCelestialThunder1757(j)) {
                    long j10 = ((j + 1) / 64) * 64;
                    if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMotionSceneAuroraMega2271(j10, 0L) < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long j11 = j9;
                    FrostHunterAnimatorQuantumFusionMaster8565 frostHunterAnimatorQuantumFusionMaster8565 = null;
                    while (true) {
                        if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMotionSceneAuroraMega2271(j5, j10) >= 0) {
                            j2 = j5;
                            j3 = j8;
                            break;
                        }
                        if (j8 != j7) {
                            if (frostHunterAnimatorQuantumFusionMaster8565 == null) {
                                frostHunterAnimatorQuantumFusionMaster8565 = new FrostHunterAnimatorQuantumFusionMaster8565(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j8 & (1 << i4)) != j7) {
                                    j4 = j7;
                                    ((FrostHunterLayoutInflaterEpicForceAurora7762) frostHunterAnimatorQuantumFusionMaster8565.FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761(i4 + j5);
                                } else {
                                    j4 = j7;
                                }
                                i4++;
                                j7 = j4;
                            }
                        } else {
                            i = i2;
                        }
                        long j12 = j7;
                        if (j11 == j12) {
                            j2 = j10;
                            j3 = j12;
                            break;
                        }
                        j5 += 64;
                        j7 = j12;
                        j8 = j11;
                        i2 = i;
                        j11 = j7;
                    }
                    if (frostHunterAnimatorQuantumFusionMaster8565 != null) {
                        FrostHunterLayoutInflaterEpicForceAurora7762 frostHunterLayoutInflaterEpicForceAurora7762 = (FrostHunterLayoutInflaterEpicForceAurora7762) frostHunterAnimatorQuantumFusionMaster8565.FrostHunterFlowMaxDragonHero5809;
                        int i5 = frostHunterLayoutInflaterEpicForceAurora7762.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = frostHunterLayoutInflaterEpicForceAurora7762.FrostHunterAlphaAnimationNeoCosmos5761;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                            return new FrostHunterFlingGestureTitanHeroRogue4374(j11, j3, j2, jArr).FrostHunterLevelListDrawableFusionDragonHero2232(j);
                        }
                    }
                    jArr = jArr3;
                    return new FrostHunterFlingGestureTitanHeroRogue4374(j11, j3, j2, jArr).FrostHunterLevelListDrawableFusionDragonHero2232(j);
                }
            } else {
                long j13 = 1 << (((int) j6) - 64);
                if ((j9 & j13) == 0) {
                    return new FrostHunterFlingGestureTitanHeroRogue4374(j9 | j13, this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterKeyframeGammaGamma1197);
                }
            }
        } else {
            long j14 = 1 << ((int) j6);
            if ((j8 & j14) == 0) {
                return new FrostHunterFlingGestureTitanHeroRogue4374(this.FrostHunterCameraXPixelTurboCosmos9814, j8 | j14, this.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterKeyframeGammaGamma1197);
            }
        }
        return this;
    }

    public final FrostHunterFlingGestureTitanHeroRogue4374 FrostHunterLifecycleBlazeGammaElite2889(FrostHunterFlingGestureTitanHeroRogue4374 frostHunterFlingGestureTitanHeroRogue4374) {
        FrostHunterFlingGestureTitanHeroRogue4374 frostHunterFlingGestureTitanHeroRogue43742;
        long[] jArr;
        FrostHunterFlingGestureTitanHeroRogue4374 frostHunterFlingGestureTitanHeroRogue43743 = this;
        FrostHunterFlingGestureTitanHeroRogue4374 frostHunterFlingGestureTitanHeroRogue43744 = FrostHunterFragmentBetaMegaVortex6025;
        if (frostHunterFlingGestureTitanHeroRogue4374 == frostHunterFlingGestureTitanHeroRogue43744) {
            return frostHunterFlingGestureTitanHeroRogue43743;
        }
        if (frostHunterFlingGestureTitanHeroRogue43743 == frostHunterFlingGestureTitanHeroRogue43744) {
            return frostHunterFlingGestureTitanHeroRogue4374;
        }
        long j = frostHunterFlingGestureTitanHeroRogue4374.FrostHunterAlertDialogAuroraDelta3200;
        long j2 = frostHunterFlingGestureTitanHeroRogue4374.FrostHunterAlertDialogAuroraDelta3200;
        long[] jArr2 = frostHunterFlingGestureTitanHeroRogue4374.FrostHunterKeyframeGammaGamma1197;
        long j3 = frostHunterFlingGestureTitanHeroRogue4374.FrostHunterFlowMaxDragonHero5809;
        long j4 = frostHunterFlingGestureTitanHeroRogue4374.FrostHunterCameraXPixelTurboCosmos9814;
        long j5 = frostHunterFlingGestureTitanHeroRogue43743.FrostHunterAlertDialogAuroraDelta3200;
        long j6 = frostHunterFlingGestureTitanHeroRogue43743.FrostHunterFlowMaxDragonHero5809;
        long j7 = frostHunterFlingGestureTitanHeroRogue43743.FrostHunterCameraXPixelTurboCosmos9814;
        if (j == j5 && jArr2 == (jArr = frostHunterFlingGestureTitanHeroRogue43743.FrostHunterKeyframeGammaGamma1197)) {
            return new FrostHunterFlingGestureTitanHeroRogue4374(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = frostHunterFlingGestureTitanHeroRogue43743.FrostHunterKeyframeGammaGamma1197;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    frostHunterFlingGestureTitanHeroRogue43743 = frostHunterFlingGestureTitanHeroRogue43743.FrostHunterLevelListDrawableFusionDragonHero2232(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        frostHunterFlingGestureTitanHeroRogue43743 = frostHunterFlingGestureTitanHeroRogue43743.FrostHunterLevelListDrawableFusionDragonHero2232(i2 + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        frostHunterFlingGestureTitanHeroRogue43743 = frostHunterFlingGestureTitanHeroRogue43743.FrostHunterLevelListDrawableFusionDragonHero2232(i + j2 + 64);
                    }
                    i++;
                }
            }
            return frostHunterFlingGestureTitanHeroRogue43743;
        }
        if (jArr3 != null) {
            frostHunterFlingGestureTitanHeroRogue43742 = frostHunterFlingGestureTitanHeroRogue4374;
            for (long j9 : jArr3) {
                frostHunterFlingGestureTitanHeroRogue43742 = frostHunterFlingGestureTitanHeroRogue43742.FrostHunterLevelListDrawableFusionDragonHero2232(j9);
            }
        } else {
            frostHunterFlingGestureTitanHeroRogue43742 = frostHunterFlingGestureTitanHeroRogue4374;
        }
        long j10 = frostHunterFlingGestureTitanHeroRogue43743.FrostHunterAlertDialogAuroraDelta3200;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    frostHunterFlingGestureTitanHeroRogue43742 = frostHunterFlingGestureTitanHeroRogue43742.FrostHunterLevelListDrawableFusionDragonHero2232(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    frostHunterFlingGestureTitanHeroRogue43742 = frostHunterFlingGestureTitanHeroRogue43742.FrostHunterLevelListDrawableFusionDragonHero2232(i + j10 + 64);
                }
                i++;
            }
        }
        return frostHunterFlingGestureTitanHeroRogue43742;
    }

    public final boolean FrostHunterServiceEliteCelestialThunder1757(long j) {
        long[] jArr;
        long j2 = j - this.FrostHunterAlertDialogAuroraDelta3200;
        return (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMotionSceneAuroraMega2271(j2, 0L) < 0 || FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMotionSceneAuroraMega2271(j2, 64L) >= 0) ? (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMotionSceneAuroraMega2271(j2, 64L) < 0 || FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMotionSceneAuroraMega2271(j2, 128L) >= 0) ? FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMotionSceneAuroraMega2271(j2, 0L) <= 0 && (jArr = this.FrostHunterKeyframeGammaGamma1197) != null && FrostHunterCardViewLegendUltra9902.FrostHunterAlphaAnimationNeoCosmos5761(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.FrostHunterCameraXPixelTurboCosmos9814) != 0 : ((1 << ((int) j2)) & this.FrostHunterFlowMaxDragonHero5809) != 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return FrostHunterLooperThreadStormCyberElite6638.FrostHunterAlertDialogAuroraDelta3200(new FrostHunterRoomEntitySparkVisionBlaze9438(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(FrostHunterGroupRogueDeltaMega4192.FrostHunterNestedScrollViewPixelPhantom8605(this));
        Iterator it = iterator();
        while (true) {
            FrostHunterMotionScenePixelMega1338 frostHunterMotionScenePixelMega1338 = (FrostHunterMotionScenePixelMega1338) it;
            if (!frostHunterMotionScenePixelMega1338.hasNext()) {
                break;
            }
            arrayList.add(String.valueOf(((Number) frostHunterMotionScenePixelMega1338.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
