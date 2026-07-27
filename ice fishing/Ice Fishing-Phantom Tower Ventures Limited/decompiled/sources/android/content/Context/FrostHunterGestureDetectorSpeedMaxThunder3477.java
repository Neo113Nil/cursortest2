package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGestureDetectorSpeedMaxThunder3477 {
    public long[] FrostHunterAlphaAnimationNeoCosmos5761;
    public int[] FrostHunterBundlePulseFusionHero2475;
    public int[] FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public int FrostHunterLevelListDrawableFusionDragonHero2232;
    public int FrostHunterLifecycleBlazeGammaElite2889;
    public int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterGestureDetectorSpeedMaxThunder3477(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761;
        int[] iArr = FrostHunterChipCyberThunder9742.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = iArr;
        this.FrostHunterBundlePulseFusionHero2475 = iArr;
        if (i >= 0) {
            FrostHunterLifecycleBlazeGammaElite2889(FrostHunterSnackbarHyperionUltra7694.FrostHunterServiceEliteCelestialThunder1757(i));
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
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterServiceEliteCelestialThunder1757) - this.FrostHunterLifecycleBlazeGammaElite2889;
    }

    public final int FrostHunterBundlePulseFusionHero2475(int i) {
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.FrostHunterServiceEliteCelestialThunder1757;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        r2 = FrostHunterConstraintSetCloneMasterUltraRogue2633(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        if (r37.FrostHunterLevelListDrawableFusionDragonHero2232 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        if (((r37.FrostHunterAlphaAnimationNeoCosmos5761[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        r2 = r37.FrostHunterServiceEliteCelestialThunder1757;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        if (r2 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c4, code lost:
    
        if (java.lang.Long.compare((r37.FrostHunterLifecycleBlazeGammaElite2889 * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        r2 = r37.FrostHunterAlphaAnimationNeoCosmos5761;
        r3 = r37.FrostHunterServiceEliteCelestialThunder1757;
        r5 = r37.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        r6 = r37.FrostHunterBundlePulseFusionHero2475;
        r13 = (r3 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        if (r7 >= r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d7, code lost:
    
        r8 = r2[r7] & (-9187201950435737472L);
        r2[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r7 = r7 + 1;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f3, code lost:
    
        r29 = r9;
        r27 = r11;
        r12 = 7;
        r7 = android.content.Context.FrostHunterContextSolarMegaPhantom7469.FrostHunterTransformNovaBetaNovaX5251(r2);
        r8 = r7 - 1;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0112, code lost:
    
        if (r7 == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0114, code lost:
    
        r8 = r7 >> 3;
        r11 = (r7 & 7) << 3;
        r9 = (r2[r8] >> r11) & r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0121, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0128, code lost:
    
        if (r9 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012b, code lost:
    
        r9 = java.lang.Integer.hashCode(r5[r7]) * r21;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r13 = FrostHunterConstraintSetCloneMasterUltraRogue2633(r10);
        r10 = r10 & r3;
        r31 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014a, code lost:
    
        if ((((r13 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0171, code lost:
    
        r18 = r14;
        r32 = r15;
        r10 = r13 >> 3;
        r14 = r2[r10];
        r12 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0183, code lost:
    
        if (((r14 >> r12) & r27) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0185, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = ((~(r27 << r12)) & r14) | ((r9 & 127) << r12);
        r2[r8] = (r2[r8] & (~(r27 << r11))) | (128 << r11);
        r33[r13] = r33[r7];
        r33[r7] = r32;
        r34[r13] = r34[r7];
        r34[r7] = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d0, code lost:
    
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r18;
        r12 = r31;
        r15 = r32;
        r5 = r33;
        r6 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01af, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = ((r9 & 127) << r12) | ((~(r27 << r12)) & r14);
        r5 = r33[r13];
        r33[r13] = r33[r7];
        r33[r7] = r5;
        r5 = r34[r13];
        r34[r13] = r34[r7];
        r34[r7] = r5;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014c, code lost:
    
        r32 = r15;
        r2[r8] = ((r9 & 127) << r11) | (r2[r8] & (~(r27 << r11)));
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r14;
        r12 = r31;
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0123, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01e9, code lost:
    
        r18 = r14;
        r32 = r15;
        r37.FrostHunterLevelListDrawableFusionDragonHero2232 = android.content.Context.FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761(r37.FrostHunterServiceEliteCelestialThunder1757) - r37.FrostHunterLifecycleBlazeGammaElite2889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0279, code lost:
    
        r2 = FrostHunterConstraintSetCloneMasterUltraRogue2633(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x027d, code lost:
    
        r37.FrostHunterLifecycleBlazeGammaElite2889++;
        r1 = r37.FrostHunterLevelListDrawableFusionDragonHero2232;
        r3 = r37.FrostHunterAlphaAnimationNeoCosmos5761;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0295, code lost:
    
        if (((r5 >> r7) & r27) != r19) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0297, code lost:
    
        r32 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0299, code lost:
    
        r37.FrostHunterLevelListDrawableFusionDragonHero2232 = r1 - r32;
        r1 = r37.FrostHunterServiceEliteCelestialThunder1757;
        r5 = (r5 & (~(r27 << r7))) | (r29 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r13 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01fc, code lost:
    
        r29 = r9;
        r27 = 255;
        r18 = 1;
        r32 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x020a, code lost:
    
        r2 = android.content.Context.FrostHunterSnackbarHyperionUltra7694.FrostHunterConstraintSetCloneMasterUltraRogue2633(r37.FrostHunterServiceEliteCelestialThunder1757);
        r3 = r37.FrostHunterAlphaAnimationNeoCosmos5761;
        r5 = r37.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        r6 = r37.FrostHunterBundlePulseFusionHero2475;
        r7 = r37.FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterLifecycleBlazeGammaElite2889(r2);
        r2 = r37.FrostHunterAlphaAnimationNeoCosmos5761;
        r8 = r37.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        r9 = r37.FrostHunterBundlePulseFusionHero2475;
        r10 = r37.FrostHunterServiceEliteCelestialThunder1757;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0225, code lost:
    
        if (r11 >= r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0234, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r19) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0236, code lost:
    
        r12 = r5[r11];
        r13 = java.lang.Integer.hashCode(r12) * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = FrostHunterConstraintSetCloneMasterUltraRogue2633(r13 >>> 7);
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r16 = (r14 & 7) << 3;
        r1 = (r15[r13] & (~(255 << r16))) | (r1 << r16);
        r15[r13] = r1;
        r15[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0273, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0272, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0207, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x009a, code lost:
    
        r29 = r9;
        r27 = 255;
        r18 = 1;
        r32 = 0;
        r19 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterLevelListDrawableFusionDragonHero2232(int i, int i2) {
        int i3;
        int i4;
        int i5 = i;
        int i6 = -862048943;
        int hashCode = Integer.hashCode(i5) * (-862048943);
        int i7 = hashCode ^ (hashCode << 16);
        int i8 = i7 >>> 7;
        int i9 = i7 & 127;
        int i10 = this.FrostHunterServiceEliteCelestialThunder1757;
        int i11 = i8 & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            int i15 = 1;
            int i16 = i12;
            int i17 = 0;
            long j = (((-i14) >> 63) & (jArr[i13 + 1] << (64 - i14))) | (jArr[i13] >>> i14);
            long j2 = i9;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i4 = ((Long.numberOfTrailingZeros(j4) >> 3) + i11) & i10;
                int i18 = i6;
                if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633[i4] == i5) {
                    break loop0;
                }
                j4 &= j4 - 1;
                i6 = i18;
            }
            i12 = i16 + 8;
            i11 = (i11 + i12) & i10;
            i5 = i;
            i6 = i3;
        }
        if (i4 < 0) {
            i4 = ~i4;
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633[i4] = i;
        this.FrostHunterBundlePulseFusionHero2475[i4] = i2;
    }

    public final void FrostHunterLifecycleBlazeGammaElite2889(int i) {
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
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new int[max];
        this.FrostHunterBundlePulseFusionHero2475 = new int[max];
    }

    public final int FrostHunterServiceEliteCelestialThunder1757(int i) {
        int FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475(i);
        if (FrostHunterBundlePulseFusionHero2475 >= 0) {
            return this.FrostHunterBundlePulseFusionHero2475[FrostHunterBundlePulseFusionHero2475];
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FrostHunterGestureDetectorSpeedMaxThunder3477)) {
            return false;
        }
        FrostHunterGestureDetectorSpeedMaxThunder3477 frostHunterGestureDetectorSpeedMaxThunder3477 = (FrostHunterGestureDetectorSpeedMaxThunder3477) obj;
        if (frostHunterGestureDetectorSpeedMaxThunder3477.FrostHunterLifecycleBlazeGammaElite2889 != this.FrostHunterLifecycleBlazeGammaElite2889) {
            return false;
        }
        int[] iArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int[] iArr2 = this.FrostHunterBundlePulseFusionHero2475;
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
                            int i5 = iArr[i4];
                            int i6 = iArr2[i4];
                            int FrostHunterBundlePulseFusionHero2475 = frostHunterGestureDetectorSpeedMaxThunder3477.FrostHunterBundlePulseFusionHero2475(i5);
                            if (FrostHunterBundlePulseFusionHero2475 < 0 || i6 != frostHunterGestureDetectorSpeedMaxThunder3477.FrostHunterBundlePulseFusionHero2475[FrostHunterBundlePulseFusionHero2475]) {
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
        int[] iArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int[] iArr2 = this.FrostHunterBundlePulseFusionHero2475;
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
                        int i6 = iArr[i5];
                        i2 += Integer.hashCode(iArr2[i5]) ^ Integer.hashCode(i6);
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
        int[] iArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int[] iArr2 = this.FrostHunterBundlePulseFusionHero2475;
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
                            int i6 = iArr[i5];
                            int i7 = iArr2[i5];
                            sb.append(i6);
                            sb.append("=");
                            sb.append(i7);
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

    public /* synthetic */ FrostHunterGestureDetectorSpeedMaxThunder3477() {
        this(6);
    }
}
