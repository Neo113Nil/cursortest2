package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterContentResolverEpicBetaOlympian4466 extends FrostHunterDiffUtilPhoenixNovaXBeta5728 {
    public int FrostHunterLevelListDrawableFusionDragonHero2232;

    public FrostHunterContentResolverEpicBetaOlympian4466(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterChipCyberThunder9742.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterBundlePulseFusionHero2475 = FrostHunterVectorDrawableForceMax1351.FrostHunterFlowMaxDragonHero5809;
        if (i >= 0) {
            FrostHunterLifecycleBlazeGammaElite2889(FrostHunterSnackbarHyperionUltra7694.FrostHunterServiceEliteCelestialThunder1757(i));
        } else {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void FrostHunterBundlePulseFusionHero2475() {
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
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterServiceEliteCelestialThunder1757) - this.FrostHunterLifecycleBlazeGammaElite2889;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object FrostHunterLevelListDrawableFusionDragonHero2232(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.FrostHunterServiceEliteCelestialThunder1757;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        if (i2 < 0) {
            return null;
        }
        this.FrostHunterLifecycleBlazeGammaElite2889--;
        long[] jArr2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i10 = this.FrostHunterServiceEliteCelestialThunder1757;
        int i11 = i2 >> 3;
        int i12 = (i2 & 7) << 3;
        long j4 = (jArr2[i11] & (~(255 << i12))) | (254 << i12);
        jArr2[i11] = j4;
        jArr2[(((i2 - 7) & i10) + (i10 & 7)) >> 3] = j4;
        Object[] objArr = this.FrostHunterBundlePulseFusionHero2475;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
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
        this.FrostHunterBundlePulseFusionHero2475 = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        r2 = FrostHunterServiceEliteCelestialThunder1757(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (r37.FrostHunterLevelListDrawableFusionDragonHero2232 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        if (((r37.FrostHunterAlphaAnimationNeoCosmos5761[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
    
        r2 = r37.FrostHunterServiceEliteCelestialThunder1757;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
    
        if (r2 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c4, code lost:
    
        if (java.lang.Long.compare((r37.FrostHunterLifecycleBlazeGammaElite2889 * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c6, code lost:
    
        r2 = r37.FrostHunterAlphaAnimationNeoCosmos5761;
        r3 = r37.FrostHunterServiceEliteCelestialThunder1757;
        r5 = r37.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        r6 = r37.FrostHunterBundlePulseFusionHero2475;
        r13 = (r3 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d5, code lost:
    
        if (r7 >= r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
    
        r8 = r2[r7] & (-9187201950435737472L);
        r2[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r7 = r7 + 1;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f3, code lost:
    
        r29 = r9;
        r27 = r11;
        r12 = 7;
        r7 = android.content.Context.FrostHunterContextSolarMegaPhantom7469.FrostHunterTransformNovaBetaNovaX5251(r2);
        r8 = r7 - 1;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0112, code lost:
    
        if (r7 == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0114, code lost:
    
        r8 = r7 >> 3;
        r11 = (r7 & 7) << 3;
        r9 = (r2[r8] >> r11) & r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0121, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0128, code lost:
    
        if (r9 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012b, code lost:
    
        r9 = java.lang.Integer.hashCode(r5[r7]) * r21;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r13 = FrostHunterServiceEliteCelestialThunder1757(r10);
        r10 = r10 & r3;
        r31 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014a, code lost:
    
        if ((((r13 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0171, code lost:
    
        r18 = r14;
        r32 = r15;
        r10 = r13 >> 3;
        r14 = r2[r10];
        r12 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0183, code lost:
    
        if (((r14 >> r12) & r27) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0185, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = ((~(r27 << r12)) & r14) | ((r9 & 127) << r12);
        r2[r8] = (r2[r8] & (~(r27 << r11))) | (128 << r11);
        r33[r13] = r33[r7];
        r33[r7] = r32;
        r34[r13] = r34[r7];
        r34[r7] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d1, code lost:
    
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r18;
        r12 = r31;
        r15 = r32;
        r5 = r33;
        r6 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b0, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014c, code lost:
    
        r32 = r15;
        r2[r8] = ((r9 & 127) << r11) | (r2[r8] & (~(r27 << r11)));
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r14;
        r12 = r31;
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0123, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ea, code lost:
    
        r18 = r14;
        r32 = r15;
        r37.FrostHunterLevelListDrawableFusionDragonHero2232 = android.content.Context.FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761(r37.FrostHunterServiceEliteCelestialThunder1757) - r37.FrostHunterLifecycleBlazeGammaElite2889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027a, code lost:
    
        r13 = FrostHunterServiceEliteCelestialThunder1757(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0281, code lost:
    
        r37.FrostHunterLifecycleBlazeGammaElite2889++;
        r1 = r37.FrostHunterLevelListDrawableFusionDragonHero2232;
        r2 = r37.FrostHunterAlphaAnimationNeoCosmos5761;
        r3 = r13 >> 3;
        r4 = r2[r3];
        r6 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0299, code lost:
    
        if (((r4 >> r6) & r27) != r19) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x029b, code lost:
    
        r7 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02a0, code lost:
    
        r37.FrostHunterLevelListDrawableFusionDragonHero2232 = r1 - r7;
        r1 = r37.FrostHunterServiceEliteCelestialThunder1757;
        r4 = (r4 & (~(r27 << r6))) | (r29 << r6);
        r2[r3] = r4;
        r2[(((r13 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x029e, code lost:
    
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01fd, code lost:
    
        r29 = r9;
        r27 = 255;
        r18 = 1;
        r32 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x020b, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0226, code lost:
    
        if (r11 >= r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0235, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r19) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0237, code lost:
    
        r12 = r5[r11];
        r13 = java.lang.Integer.hashCode(r12) * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = FrostHunterServiceEliteCelestialThunder1757(r13 >>> 7);
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
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0274, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0273, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0208, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x009a, code lost:
    
        r29 = r9;
        r27 = 255;
        r18 = 1;
        r32 = 0;
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0280, code lost:
    
        r13 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterRemoteConfigSpeedSpeed8566(int i, Object obj) {
        int i2;
        int i3;
        int i4 = i;
        int i5 = -862048943;
        int hashCode = Integer.hashCode(i4) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.FrostHunterServiceEliteCelestialThunder1757;
        int i10 = i7 & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = 1;
            int i15 = i11;
            int i16 = 0;
            long j = (((-i13) >> 63) & (jArr[i12 + 1] << (64 - i13))) | (jArr[i12] >>> i13);
            long j2 = i8;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i3 = ((Long.numberOfTrailingZeros(j4) >> 3) + i10) & i9;
                int i17 = i5;
                if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633[i3] == i4) {
                    break loop0;
                }
                j4 &= j4 - 1;
                i5 = i17;
            }
            i11 = i15 + 8;
            i10 = (i10 + i11) & i9;
            i4 = i;
            i5 = i2;
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633[i3] = i;
        this.FrostHunterBundlePulseFusionHero2475[i3] = obj;
    }

    public final int FrostHunterServiceEliteCelestialThunder1757(int i) {
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

    public /* synthetic */ FrostHunterContentResolverEpicBetaOlympian4466() {
        this(6);
    }
}
