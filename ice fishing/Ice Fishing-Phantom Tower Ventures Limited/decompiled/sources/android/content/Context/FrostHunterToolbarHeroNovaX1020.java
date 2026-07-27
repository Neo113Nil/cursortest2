package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterToolbarHeroNovaX1020 {
    public long[] FrostHunterAlphaAnimationNeoCosmos5761;
    public int FrostHunterBundlePulseFusionHero2475;
    public Object[] FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public int FrostHunterLifecycleBlazeGammaElite2889;
    public int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterToolbarHeroNovaX1020(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterVectorDrawableForceMax1351.FrostHunterFlowMaxDragonHero5809;
        if (i >= 0) {
            FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterSnackbarHyperionUltra7694.FrostHunterServiceEliteCelestialThunder1757(i));
        } else {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void FrostHunterAlertDialogAuroraDelta3200(Object obj) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633[FrostHunterServiceEliteCelestialThunder1757(obj)] = obj;
    }

    public final boolean FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        int i = this.FrostHunterServiceEliteCelestialThunder1757;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633[FrostHunterServiceEliteCelestialThunder1757(obj)] = obj;
        return this.FrostHunterServiceEliteCelestialThunder1757 != i;
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
        int i4 = this.FrostHunterBundlePulseFusionHero2475;
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

    public final boolean FrostHunterCameraXPixelTurboCosmos9814() {
        return this.FrostHunterServiceEliteCelestialThunder1757 != 0;
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        this.FrostHunterServiceEliteCelestialThunder1757 = 0;
        long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (jArr != FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761) {
            FrostHunterContextSolarMegaPhantom7469.FrostHunterSharedElementPixelTitan2806(jArr);
            long[] jArr2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int i = this.FrostHunterBundlePulseFusionHero2475;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNavigationViewMasterVortexBeta1295(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, 0, this.FrostHunterBundlePulseFusionHero2475);
        this.FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterBundlePulseFusionHero2475) - this.FrostHunterServiceEliteCelestialThunder1757;
    }

    public final void FrostHunterFlowMaxDragonHero5809(FrostHunterToolbarHeroNovaX1020 frostHunterToolbarHeroNovaX1020) {
        frostHunterToolbarHeroNovaX1020.getClass();
        Object[] objArr = frostHunterToolbarHeroNovaX1020.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        long[] jArr = frostHunterToolbarHeroNovaX1020.FrostHunterAlphaAnimationNeoCosmos5761;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        FrostHunterAlertDialogAuroraDelta3200(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void FrostHunterFragmentBetaMegaVortex6025(int i) {
        this.FrostHunterServiceEliteCelestialThunder1757--;
        long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = this.FrostHunterBundlePulseFusionHero2475;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633[i] = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean FrostHunterKeyframeGammaGamma1197(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.FrostHunterBundlePulseFusionHero2475;
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
        boolean z = i >= 0;
        if (z) {
            FrostHunterFragmentBetaMegaVortex6025(i);
        }
        return z;
    }

    public final void FrostHunterLevelListDrawableFusionDragonHero2232(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, FrostHunterSnackbarHyperionUltra7694.FrostHunterBundlePulseFusionHero2475(i)) : 0;
        this.FrostHunterBundlePulseFusionHero2475 = max;
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
        this.FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterBundlePulseFusionHero2475) - this.FrostHunterServiceEliteCelestialThunder1757;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = max == 0 ? FrostHunterVectorDrawableForceMax1351.FrostHunterFlowMaxDragonHero5809 : new Object[max];
    }

    public final int FrostHunterLifecycleBlazeGammaElite2889(int i) {
        int i2 = this.FrostHunterBundlePulseFusionHero2475;
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

    public final boolean FrostHunterRemoteConfigSpeedSpeed8566() {
        return this.FrostHunterServiceEliteCelestialThunder1757 == 0;
    }

    public final int FrostHunterServiceEliteCelestialThunder1757(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2;
        int i3 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.FrostHunterBundlePulseFusionHero2475;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr3[i10] >>> i11);
            long j5 = i6;
            int i12 = i6;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                int i13 = i3;
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterConstraintSetCloneMasterUltraRogue2633[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i3 = i13;
            }
            int i14 = i3;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterLifecycleBlazeGammaElite2889(i5);
                long j8 = 255;
                if (this.FrostHunterLifecycleBlazeGammaElite2889 != 0 || ((this.FrostHunterAlphaAnimationNeoCosmos5761[FrostHunterLifecycleBlazeGammaElite2889 >> 3] >> ((FrostHunterLifecycleBlazeGammaElite2889 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i15 = this.FrostHunterBundlePulseFusionHero2475;
                    if (i15 > 8) {
                        int i16 = 8;
                        if (Long.compare((this.FrostHunterServiceEliteCelestialThunder1757 * 32) ^ Long.MIN_VALUE, (i15 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                            int i17 = this.FrostHunterBundlePulseFusionHero2475;
                            Object[] objArr2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                            int i18 = (i17 + 7) >> 3;
                            int i19 = 0;
                            j3 = 128;
                            while (i19 < i18) {
                                long j9 = j8;
                                long j10 = jArr4[i19] & (-9187201950435737472L);
                                jArr4[i19] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i19++;
                                i16 = i16;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i20 = i16;
                            int FrostHunterTransformNovaBetaNovaX5251 = FrostHunterContextSolarMegaPhantom7469.FrostHunterTransformNovaBetaNovaX5251(jArr4);
                            int i21 = FrostHunterTransformNovaBetaNovaX5251 - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i21] = (jArr4[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[FrostHunterTransformNovaBetaNovaX5251] = jArr4[0];
                            int i22 = 0;
                            while (i22 != i17) {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j12 = (jArr4[i23] >> i24) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i22];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i14;
                                    int i25 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int FrostHunterLifecycleBlazeGammaElite28892 = FrostHunterLifecycleBlazeGammaElite2889(i25);
                                    int i26 = i25 & i17;
                                    if (((FrostHunterLifecycleBlazeGammaElite28892 - i26) & i17) / i20 == ((i22 - i26) & i17) / i20) {
                                        long j13 = j11;
                                        jArr4[i23] = ((r7 & 127) << i24) | ((~(j << i24)) & jArr4[i23]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i22++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i27 = FrostHunterLifecycleBlazeGammaElite28892 >> 3;
                                        long j15 = jArr4[i27];
                                        int i28 = (FrostHunterLifecycleBlazeGammaElite28892 & 7) << 3;
                                        if (((j15 >> i28) & j) == 128) {
                                            i2 = i20;
                                            i = i17;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j15) | ((r7 & 127) << i28);
                                            jArr4[i23] = (jArr4[i23] & (~(j << i24))) | (128 << i24);
                                            objArr[FrostHunterLifecycleBlazeGammaElite28892] = objArr[i22];
                                            objArr[i22] = null;
                                        } else {
                                            i = i17;
                                            objArr = objArr2;
                                            i2 = i20;
                                            jArr4[i27] = ((r7 & 127) << i28) | ((~(j << i28)) & j15);
                                            Object obj3 = objArr[FrostHunterLifecycleBlazeGammaElite28892];
                                            objArr[FrostHunterLifecycleBlazeGammaElite28892] = objArr[i22];
                                            objArr[i22] = obj3;
                                            i22--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j14) | Long.MIN_VALUE;
                                        i22++;
                                        j11 = j14;
                                        i20 = i2;
                                        i17 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i22++;
                                }
                            }
                            this.FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterBundlePulseFusionHero2475) - this.FrostHunterServiceEliteCelestialThunder1757;
                            FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterLifecycleBlazeGammaElite2889(i5);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterSnackbarHyperionUltra7694.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterBundlePulseFusionHero2475);
                    long[] jArr5 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                    Object[] objArr3 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    int i29 = this.FrostHunterBundlePulseFusionHero2475;
                    FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterConstraintSetCloneMasterUltraRogue2633);
                    long[] jArr6 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                    Object[] objArr4 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    int i30 = this.FrostHunterBundlePulseFusionHero2475;
                    int i31 = 0;
                    while (i31 < i29) {
                        if (((jArr5[i31 >> 3] >> ((i31 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i31];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i14;
                            int i32 = hashCode3 ^ (hashCode3 << 16);
                            int FrostHunterLifecycleBlazeGammaElite28893 = FrostHunterLifecycleBlazeGammaElite2889(i32 >>> 7);
                            long j16 = i32 & 127;
                            int i33 = FrostHunterLifecycleBlazeGammaElite28893 >> 3;
                            int i34 = (FrostHunterLifecycleBlazeGammaElite28893 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i33] & (~(255 << i34))) | (j16 << i34);
                            jArr[i33] = j17;
                            jArr[(((FrostHunterLifecycleBlazeGammaElite28893 - 7) & i30) + (i30 & 7)) >> 3] = j17;
                            objArr4[FrostHunterLifecycleBlazeGammaElite28893] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i31++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterLifecycleBlazeGammaElite2889(i5);
                }
                this.FrostHunterServiceEliteCelestialThunder1757++;
                int i35 = this.FrostHunterLifecycleBlazeGammaElite2889;
                long[] jArr7 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                int i36 = FrostHunterLifecycleBlazeGammaElite2889 >> 3;
                long j18 = jArr7[i36];
                int i37 = (FrostHunterLifecycleBlazeGammaElite2889 & 7) << 3;
                this.FrostHunterLifecycleBlazeGammaElite2889 = i35 - (((j18 >> i37) & j) == j3 ? 1 : 0);
                int i38 = this.FrostHunterBundlePulseFusionHero2475;
                long j19 = (j18 & (~(j << i37))) | (j2 << i37);
                jArr7[i36] = j19;
                jArr7[(((FrostHunterLifecycleBlazeGammaElite2889 - 7) & i38) + (i38 & 7)) >> 3] = j19;
                return FrostHunterLifecycleBlazeGammaElite2889;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i6 = i12;
            i3 = i14;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FrostHunterToolbarHeroNovaX1020)) {
            return false;
        }
        FrostHunterToolbarHeroNovaX1020 frostHunterToolbarHeroNovaX1020 = (FrostHunterToolbarHeroNovaX1020) obj;
        if (frostHunterToolbarHeroNovaX1020.FrostHunterServiceEliteCelestialThunder1757 != this.FrostHunterServiceEliteCelestialThunder1757) {
            return false;
        }
        Object[] objArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !frostHunterToolbarHeroNovaX1020.FrostHunterBundlePulseFusionHero2475(objArr[(i << 3) + i3])) {
                            return false;
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
        return true;
    }

    public final int hashCode() {
        int i = (this.FrostHunterBundlePulseFusionHero2475 * 31) + this.FrostHunterServiceEliteCelestialThunder1757;
        Object[] objArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i2 << 3) + i4];
                            if (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, this)) {
                                i += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return i;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
                            i2++;
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
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ FrostHunterToolbarHeroNovaX1020() {
        this(6);
    }
}
