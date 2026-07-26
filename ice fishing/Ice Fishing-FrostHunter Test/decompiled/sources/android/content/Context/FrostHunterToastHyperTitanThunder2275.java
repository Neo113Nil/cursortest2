package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterToastHyperTitanThunder2275 {
    public long[] FrostHunterAlphaAnimationNeoCosmos5761;
    public Object[] FrostHunterBundlePulseFusionHero2475;
    public Object[] FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public int FrostHunterLevelListDrawableFusionDragonHero2232;
    public int FrostHunterLifecycleBlazeGammaElite2889;
    public int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterToastHyperTitanThunder2275(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761;
        Object[] objArr = FrostHunterVectorDrawableForceMax1351.FrostHunterFlowMaxDragonHero5809;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = objArr;
        this.FrostHunterBundlePulseFusionHero2475 = objArr;
        if (i >= 0) {
            FrostHunterCameraXPixelTurboCosmos9814(FrostHunterSnackbarHyperionUltra7694.FrostHunterServiceEliteCelestialThunder1757(i));
        } else {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean FrostHunterAlertDialogAuroraDelta3200() {
        return this.FrostHunterLifecycleBlazeGammaElite2889 != 0;
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
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNavigationViewMasterVortexBeta1295(this.FrostHunterBundlePulseFusionHero2475, 0, this.FrostHunterServiceEliteCelestialThunder1757);
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNavigationViewMasterVortexBeta1295(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, 0, this.FrostHunterServiceEliteCelestialThunder1757);
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterServiceEliteCelestialThunder1757) - this.FrostHunterLifecycleBlazeGammaElite2889;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean FrostHunterBundlePulseFusionHero2475(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.FrostHunterServiceEliteCelestialThunder1757;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterConstraintSetCloneMasterUltraRogue2633[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
    }

    public final void FrostHunterCameraXPixelTurboCosmos9814(int i) {
        long[] jArr;
        Object[] objArr = FrostHunterVectorDrawableForceMax1351.FrostHunterFlowMaxDragonHero5809;
        int max = i > 0 ? Math.max(7, FrostHunterSnackbarHyperionUltra7694.FrostHunterBundlePulseFusionHero2475(i)) : 0;
        this.FrostHunterServiceEliteCelestialThunder1757 = max;
        if (max == 0) {
            jArr = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            FrostHunterContextSolarMegaPhantom7469.FrostHunterSharedElementPixelTitan2806(jArr);
            int i2 = max >> 3;
            long j = 255 << ((max & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761 = jArr;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterServiceEliteCelestialThunder1757) - this.FrostHunterLifecycleBlazeGammaElite2889;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = max == 0 ? objArr : new Object[max];
        if (max != 0) {
            objArr = new Object[max];
        }
        this.FrostHunterBundlePulseFusionHero2475 = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark9882) {
        int i;
        int hashCode = (frostHunterLiveDataScopeMaxSpark9882 != null ? frostHunterLiveDataScopeMaxSpark9882.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.FrostHunterServiceEliteCelestialThunder1757;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterConstraintSetCloneMasterUltraRogue2633[i], frostHunterLiveDataScopeMaxSpark9882)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
    }

    public final boolean FrostHunterFlowMaxDragonHero5809() {
        return this.FrostHunterLifecycleBlazeGammaElite2889 == 0;
    }

    public final Object FrostHunterFragmentBetaMegaVortex6025(int i) {
        this.FrostHunterLifecycleBlazeGammaElite2889--;
        long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = this.FrostHunterServiceEliteCelestialThunder1757;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633[i] = null;
        Object[] objArr = this.FrostHunterBundlePulseFusionHero2475;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object FrostHunterKeyframeGammaGamma1197(Object obj) {
        int i;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.FrostHunterServiceEliteCelestialThunder1757;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i5;
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterConstraintSetCloneMasterUltraRogue2633[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            return FrostHunterFragmentBetaMegaVortex6025(i);
        }
        return null;
    }

    public final int FrostHunterLevelListDrawableFusionDragonHero2232(Object obj) {
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
                int FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterLifecycleBlazeGammaElite2889(i4);
                long j8 = 255;
                if (this.FrostHunterLevelListDrawableFusionDragonHero2232 != 0 || ((this.FrostHunterAlphaAnimationNeoCosmos5761[FrostHunterLifecycleBlazeGammaElite2889 >> 3] >> ((FrostHunterLifecycleBlazeGammaElite2889 & 7) << 3)) & 255) == 254) {
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
                            Object[] objArr3 = this.FrostHunterBundlePulseFusionHero2475;
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
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[FrostHunterTransformNovaBetaNovaX5251] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j11 = (jArr4[i22] >> i23) & j;
                                if (j11 != 128 && j11 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int FrostHunterLifecycleBlazeGammaElite28892 = FrostHunterLifecycleBlazeGammaElite2889(i24);
                                    int i25 = i24 & i16;
                                    if (((FrostHunterLifecycleBlazeGammaElite28892 - i25) & i16) / i19 == ((i21 - i25) & i16) / i19) {
                                        jArr4[i22] = ((r8 & 127) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i21++;
                                        i19 = i19;
                                    } else {
                                        int i26 = i19;
                                        int i27 = FrostHunterLifecycleBlazeGammaElite28892 >> 3;
                                        long j12 = jArr4[i27];
                                        int i28 = (FrostHunterLifecycleBlazeGammaElite28892 & 7) << 3;
                                        if (((j12 >> i28) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j12) | ((r8 & 127) << i28);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[FrostHunterLifecycleBlazeGammaElite28892] = objArr[i21];
                                            objArr[i21] = null;
                                            objArr3[FrostHunterLifecycleBlazeGammaElite28892] = objArr3[i21];
                                            objArr3[i21] = null;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((r8 & 127) << i28) | ((~(j << i28)) & j12);
                                            Object obj3 = objArr[FrostHunterLifecycleBlazeGammaElite28892];
                                            objArr[FrostHunterLifecycleBlazeGammaElite28892] = objArr[i21];
                                            objArr[i21] = obj3;
                                            Object obj4 = objArr3[FrostHunterLifecycleBlazeGammaElite28892];
                                            objArr3[FrostHunterLifecycleBlazeGammaElite28892] = objArr3[i21];
                                            objArr3[i21] = obj4;
                                            i21--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i21++;
                                        i19 = i26;
                                        i16 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterServiceEliteCelestialThunder1757) - this.FrostHunterLifecycleBlazeGammaElite2889;
                            FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterLifecycleBlazeGammaElite2889(i4);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterSnackbarHyperionUltra7694.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterServiceEliteCelestialThunder1757);
                    long[] jArr5 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                    Object[] objArr4 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    Object[] objArr5 = this.FrostHunterBundlePulseFusionHero2475;
                    int i29 = this.FrostHunterServiceEliteCelestialThunder1757;
                    FrostHunterCameraXPixelTurboCosmos9814(FrostHunterConstraintSetCloneMasterUltraRogue2633);
                    long[] jArr6 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                    Object[] objArr6 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    Object[] objArr7 = this.FrostHunterBundlePulseFusionHero2475;
                    int i30 = this.FrostHunterServiceEliteCelestialThunder1757;
                    int i31 = 0;
                    while (i31 < i29) {
                        if (((jArr5[i31 >> 3] >> ((i31 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i31];
                            int hashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i13;
                            int i32 = hashCode3 ^ (hashCode3 << 16);
                            int FrostHunterLifecycleBlazeGammaElite28893 = FrostHunterLifecycleBlazeGammaElite2889(i32 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j13 = i32 & 127;
                            int i33 = FrostHunterLifecycleBlazeGammaElite28893 >> 3;
                            int i34 = (FrostHunterLifecycleBlazeGammaElite28893 & 7) << 3;
                            long j14 = (jArr[i33] & (~(255 << i34))) | (j13 << i34);
                            jArr[i33] = j14;
                            jArr[(((FrostHunterLifecycleBlazeGammaElite28893 - 7) & i30) + (i30 & 7)) >> 3] = j14;
                            objArr6[FrostHunterLifecycleBlazeGammaElite28893] = obj5;
                            objArr7[FrostHunterLifecycleBlazeGammaElite28893] = objArr5[i31];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i31++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterLifecycleBlazeGammaElite2889(i4);
                }
                this.FrostHunterLifecycleBlazeGammaElite2889++;
                int i35 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
                long[] jArr7 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                int i36 = FrostHunterLifecycleBlazeGammaElite2889 >> 3;
                long j15 = jArr7[i36];
                int i37 = (FrostHunterLifecycleBlazeGammaElite2889 & 7) << 3;
                this.FrostHunterLevelListDrawableFusionDragonHero2232 = i35 - (((j15 >> i37) & j) == j3 ? 1 : 0);
                int i38 = this.FrostHunterServiceEliteCelestialThunder1757;
                long j16 = (j15 & (~(j << i37))) | (j2 << i37);
                jArr7[i36] = j16;
                jArr7[(((FrostHunterLifecycleBlazeGammaElite2889 - 7) & i38) + (i38 & 7)) >> 3] = j16;
                return ~FrostHunterLifecycleBlazeGammaElite2889;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    public final int FrostHunterLifecycleBlazeGammaElite2889(int i) {
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object FrostHunterRemoteConfigSpeedSpeed8566(Object obj) {
        int i;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.FrostHunterServiceEliteCelestialThunder1757;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i5;
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterConstraintSetCloneMasterUltraRogue2633[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            return this.FrostHunterBundlePulseFusionHero2475[i];
        }
        return null;
    }

    public final void FrostHunterServiceConnectionTurboPhoenixOmega6719(Object obj, Object obj2) {
        int FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232(obj);
        if (FrostHunterLevelListDrawableFusionDragonHero2232 < 0) {
            FrostHunterLevelListDrawableFusionDragonHero2232 = ~FrostHunterLevelListDrawableFusionDragonHero2232;
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633[FrostHunterLevelListDrawableFusionDragonHero2232] = obj;
        this.FrostHunterBundlePulseFusionHero2475[FrostHunterLevelListDrawableFusionDragonHero2232] = obj2;
    }

    public final boolean FrostHunterServiceEliteCelestialThunder1757(Object obj) {
        Object[] objArr = this.FrostHunterBundlePulseFusionHero2475;
        long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, objArr[(i << 3) + i3])) {
                            return true;
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
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FrostHunterToastHyperTitanThunder2275)) {
            return false;
        }
        FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275 = (FrostHunterToastHyperTitanThunder2275) obj;
        if (frostHunterToastHyperTitanThunder2275.FrostHunterLifecycleBlazeGammaElite2889 != this.FrostHunterLifecycleBlazeGammaElite2889) {
            return false;
        }
        Object[] objArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        Object[] objArr2 = this.FrostHunterBundlePulseFusionHero2475;
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
                            Object obj3 = objArr2[i4];
                            if (obj3 == null) {
                                if (frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(obj2) != null || !frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(obj2))) {
                                return false;
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
        Object[] objArr2 = this.FrostHunterBundlePulseFusionHero2475;
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
                        Object obj2 = objArr2[i5];
                        i2 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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
        if (FrostHunterFlowMaxDragonHero5809()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        Object[] objArr2 = this.FrostHunterBundlePulseFusionHero2475;
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
                            Object obj2 = objArr2[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
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

    public /* synthetic */ FrostHunterToastHyperTitanThunder2275() {
        this(6);
    }
}
