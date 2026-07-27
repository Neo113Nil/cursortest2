package android.content.Context;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGestureDetectorEliteEpic8317 {
    public long[] FrostHunterAlphaAnimationNeoCosmos5761;
    public int[] FrostHunterBundlePulseFusionHero2475;
    public Object[] FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public int FrostHunterLevelListDrawableFusionDragonHero2232;
    public int FrostHunterLifecycleBlazeGammaElite2889;
    public int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterGestureDetectorEliteEpic8317(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterVectorDrawableForceMax1351.FrostHunterFlowMaxDragonHero5809;
        this.FrostHunterBundlePulseFusionHero2475 = FrostHunterChipCyberThunder9742.FrostHunterAlphaAnimationNeoCosmos5761;
        if (i >= 0) {
            FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterSnackbarHyperionUltra7694.FrostHunterServiceEliteCelestialThunder1757(i));
        } else {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        this.FrostHunterLifecycleBlazeGammaElite2889 = 0;
        long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (jArr != FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761) {
            FrostHunterContextSolarMegaPhantom7469.FrostHunterSharedElementPixelTitan2806(jArr);
            long[] jArr2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int i = this.FrostHunterServiceEliteCelestialThunder1757;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNavigationViewMasterVortexBeta1295(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, 0, this.FrostHunterServiceEliteCelestialThunder1757);
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterServiceEliteCelestialThunder1757) - this.FrostHunterLifecycleBlazeGammaElite2889;
    }

    public final int FrostHunterBundlePulseFusionHero2475(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.FrostHunterServiceEliteCelestialThunder1757;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j5 = i5;
            int i11 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j7) >> 3)) & i6;
                int i12 = i2;
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterConstraintSetCloneMasterUltraRogue2633[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterConstraintSetCloneMasterUltraRogue2633(i4);
                long j8 = 255;
                if (this.FrostHunterLevelListDrawableFusionDragonHero2232 != 0 || ((this.FrostHunterAlphaAnimationNeoCosmos5761[FrostHunterConstraintSetCloneMasterUltraRogue2633 >> 3] >> ((FrostHunterConstraintSetCloneMasterUltraRogue2633 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.FrostHunterServiceEliteCelestialThunder1757;
                    if (i14 > 8) {
                        int i15 = 8;
                        if (Long.compare((this.FrostHunterLifecycleBlazeGammaElite2889 * 32) ^ Long.MIN_VALUE, (i14 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                            int i16 = this.FrostHunterServiceEliteCelestialThunder1757;
                            Object[] objArr2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                            int[] iArr = this.FrostHunterBundlePulseFusionHero2475;
                            j3 = 128;
                            int i17 = (i16 + 7) >> 3;
                            int i18 = 0;
                            while (i18 < i17) {
                                long j9 = j8;
                                long j10 = jArr4[i18] & (-9187201950435737472L);
                                jArr4[i18] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i18++;
                                i15 = i15;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i19 = i15;
                            int FrostHunterTransformNovaBetaNovaX5251 = FrostHunterContextSolarMegaPhantom7469.FrostHunterTransformNovaBetaNovaX5251(jArr4);
                            int i20 = FrostHunterTransformNovaBetaNovaX5251 - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[FrostHunterTransformNovaBetaNovaX5251] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j12 = (jArr4[i22] >> i23) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterConstraintSetCloneMasterUltraRogue2633(i24);
                                    int i25 = i24 & i16;
                                    long j13 = j11;
                                    if (((FrostHunterConstraintSetCloneMasterUltraRogue26332 - i25) & i16) / 8 == ((i21 - i25) & i16) / i19) {
                                        jArr4[i22] = ((r8 & 127) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        j11 = j13;
                                        i19 = i19;
                                    } else {
                                        int i26 = i19;
                                        int i27 = FrostHunterConstraintSetCloneMasterUltraRogue26332 >> 3;
                                        long j14 = jArr4[i27];
                                        int i28 = (FrostHunterConstraintSetCloneMasterUltraRogue26332 & 7) << 3;
                                        if (((j14 >> i28) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j14) | ((r8 & 127) << i28);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[FrostHunterConstraintSetCloneMasterUltraRogue26332] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[FrostHunterConstraintSetCloneMasterUltraRogue26332] = iArr[i21];
                                            iArr[i21] = 0;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((r8 & 127) << i28) | ((~(j << i28)) & j14);
                                            Object obj3 = objArr[FrostHunterConstraintSetCloneMasterUltraRogue26332];
                                            objArr[FrostHunterConstraintSetCloneMasterUltraRogue26332] = objArr[i21];
                                            objArr[i21] = obj3;
                                            int i29 = iArr[FrostHunterConstraintSetCloneMasterUltraRogue26332];
                                            iArr[FrostHunterConstraintSetCloneMasterUltraRogue26332] = iArr[i21];
                                            iArr[i21] = i29;
                                            i21--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i16 = i;
                                        j11 = j13;
                                        i19 = i26;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterServiceEliteCelestialThunder1757) - this.FrostHunterLifecycleBlazeGammaElite2889;
                            FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterConstraintSetCloneMasterUltraRogue2633(i4);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int FrostHunterConstraintSetCloneMasterUltraRogue26333 = FrostHunterSnackbarHyperionUltra7694.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterServiceEliteCelestialThunder1757);
                    long[] jArr5 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                    Object[] objArr3 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    int[] iArr2 = this.FrostHunterBundlePulseFusionHero2475;
                    int i30 = this.FrostHunterServiceEliteCelestialThunder1757;
                    FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterConstraintSetCloneMasterUltraRogue26333);
                    long[] jArr6 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                    Object[] objArr4 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    int[] iArr3 = this.FrostHunterBundlePulseFusionHero2475;
                    int i31 = this.FrostHunterServiceEliteCelestialThunder1757;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i32];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i33 = hashCode3 ^ (hashCode3 << 16);
                            int FrostHunterConstraintSetCloneMasterUltraRogue26334 = FrostHunterConstraintSetCloneMasterUltraRogue2633(i33 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j15 = i33 & 127;
                            int i34 = FrostHunterConstraintSetCloneMasterUltraRogue26334 >> 3;
                            int i35 = (FrostHunterConstraintSetCloneMasterUltraRogue26334 & 7) << 3;
                            long j16 = (jArr[i34] & (~(255 << i35))) | (j15 << i35);
                            jArr[i34] = j16;
                            jArr[(((FrostHunterConstraintSetCloneMasterUltraRogue26334 - 7) & i31) + (i31 & 7)) >> 3] = j16;
                            objArr4[FrostHunterConstraintSetCloneMasterUltraRogue26334] = obj4;
                            iArr3[FrostHunterConstraintSetCloneMasterUltraRogue26334] = iArr2[i32];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i32++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterConstraintSetCloneMasterUltraRogue2633(i4);
                }
                this.FrostHunterLifecycleBlazeGammaElite2889++;
                int i36 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
                long[] jArr7 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                int i37 = FrostHunterConstraintSetCloneMasterUltraRogue2633 >> 3;
                long j17 = jArr7[i37];
                int i38 = (FrostHunterConstraintSetCloneMasterUltraRogue2633 & 7) << 3;
                this.FrostHunterLevelListDrawableFusionDragonHero2232 = i36 - (((j17 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.FrostHunterServiceEliteCelestialThunder1757;
                long j18 = (j17 & (~(j << i38))) | (j2 << i38);
                jArr7[i37] = j18;
                jArr7[(((FrostHunterConstraintSetCloneMasterUltraRogue2633 - 7) & i39) + (i39 & 7)) >> 3] = j18;
                return ~FrostHunterConstraintSetCloneMasterUltraRogue2633;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    public final void FrostHunterCameraXPixelTurboCosmos9814(int i, Object obj) {
        int FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475(obj);
        if (FrostHunterBundlePulseFusionHero2475 < 0) {
            FrostHunterBundlePulseFusionHero2475 = ~FrostHunterBundlePulseFusionHero2475;
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633[FrostHunterBundlePulseFusionHero2475] = obj;
        this.FrostHunterBundlePulseFusionHero2475[FrostHunterBundlePulseFusionHero2475] = i;
    }

    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633(int i) {
        int i2 = this.FrostHunterServiceEliteCelestialThunder1757;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void FrostHunterLevelListDrawableFusionDragonHero2232(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, FrostHunterSnackbarHyperionUltra7694.FrostHunterBundlePulseFusionHero2475(i)) : 0;
        this.FrostHunterServiceEliteCelestialThunder1757 = max;
        if (max == 0) {
            jArr = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            FrostHunterContextSolarMegaPhantom7469.FrostHunterSharedElementPixelTitan2806(jArr);
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761 = jArr;
        int i2 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterServiceEliteCelestialThunder1757) - this.FrostHunterLifecycleBlazeGammaElite2889;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new Object[max];
        this.FrostHunterBundlePulseFusionHero2475 = new int[max];
    }

    public final int FrostHunterLifecycleBlazeGammaElite2889(Object obj) {
        int FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757(obj);
        if (FrostHunterServiceEliteCelestialThunder1757 >= 0) {
            return this.FrostHunterBundlePulseFusionHero2475[FrostHunterServiceEliteCelestialThunder1757];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    public final void FrostHunterRemoteConfigSpeedSpeed8566(int i) {
        this.FrostHunterLifecycleBlazeGammaElite2889--;
        long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = this.FrostHunterServiceEliteCelestialThunder1757;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633[i] = null;
    }

    public final int FrostHunterServiceEliteCelestialThunder1757(Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.FrostHunterServiceEliteCelestialThunder1757;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterConstraintSetCloneMasterUltraRogue2633[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FrostHunterGestureDetectorEliteEpic8317)) {
            return false;
        }
        FrostHunterGestureDetectorEliteEpic8317 frostHunterGestureDetectorEliteEpic8317 = (FrostHunterGestureDetectorEliteEpic8317) obj;
        if (frostHunterGestureDetectorEliteEpic8317.FrostHunterLifecycleBlazeGammaElite2889 != this.FrostHunterLifecycleBlazeGammaElite2889) {
            return false;
        }
        Object[] objArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int[] iArr = this.FrostHunterBundlePulseFusionHero2475;
        long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            int FrostHunterServiceEliteCelestialThunder1757 = frostHunterGestureDetectorEliteEpic8317.FrostHunterServiceEliteCelestialThunder1757(obj2);
                            if (FrostHunterServiceEliteCelestialThunder1757 < 0 || i5 != frostHunterGestureDetectorEliteEpic8317.FrostHunterBundlePulseFusionHero2475[FrostHunterServiceEliteCelestialThunder1757]) {
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int[] iArr = this.FrostHunterBundlePulseFusionHero2475;
        long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        i2 += Integer.hashCode(iArr[i5]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final String toString() {
        if (this.FrostHunterLifecycleBlazeGammaElite2889 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int[] iArr = this.FrostHunterBundlePulseFusionHero2475;
        long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
                            i2++;
                            if (i2 < this.FrostHunterLifecycleBlazeGammaElite2889) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ FrostHunterGestureDetectorEliteEpic8317() {
        this(6);
    }
}
